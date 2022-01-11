package com.yunusemrearslan.movieapp.screens.details

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DetailsScreen(navController: NavController, movieData: String?){

    Scaffold(topBar = {
        TopAppBar(backgroundColor = Color.LightGray, elevation = 5.dp) {
            Row(horizontalArrangement = Arrangement.Start, modifier = Modifier.padding(start = 20.dp)) {
                Icon(imageVector = Icons.Default.ArrowBack,
                    contentDescription ="Arrow Back",
                    modifier = Modifier.clickable {
                    navController.popBackStack()
                } )
                Spacer(modifier = Modifier.width(100.dp))
                Text(text = "Movies")

            }

        }

    }) {
        Surface(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()) {
            Column(modifier = Modifier.padding(12.dp), verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {

                Text(style = MaterialTheme.typography.h5,text = movieData.toString())

            }

        }

    }
}