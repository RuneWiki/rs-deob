package deob;

@ObfuscatedName("YCYSFKFW")
public final class YCYSFKFW {

	@ObfuscatedName("YCYSFKFW.z")
	public int field1382;

	@ObfuscatedName("YCYSFKFW.A")
	public int field1383;

	@ObfuscatedName("YCYSFKFW.o")
	public int[][][] field1376;

	@ObfuscatedName("YCYSFKFW.j")
	public byte[][][] field1371;

	@ObfuscatedName("YCYSFKFW.n")
	public byte[][][] field1375;

	@ObfuscatedName("YCYSFKFW.f")
	public byte[][][] field1368;

	@ObfuscatedName("YCYSFKFW.i")
	public byte[][][] field1370;

	@ObfuscatedName("YCYSFKFW.q")
	public byte[][][] field1378;

	@ObfuscatedName("YCYSFKFW.C")
	public int[][][] field1385;

	@ObfuscatedName("YCYSFKFW.p")
	public byte[][][] field1377;

	@ObfuscatedName("YCYSFKFW.B")
	public int[][] field1384;

	@ObfuscatedName("YCYSFKFW.a")
	public int[] field1363;

	@ObfuscatedName("YCYSFKFW.b")
	public int[] field1364;

	@ObfuscatedName("YCYSFKFW.c")
	public int[] field1365;

	@ObfuscatedName("YCYSFKFW.d")
	public int[] field1366;

	@ObfuscatedName("YCYSFKFW.e")
	public int[] field1367;

	@ObfuscatedName("YCYSFKFW.k")
	public static final int[] field1372 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("YCYSFKFW.l")
	public static final int[] field1373 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("YCYSFKFW.m")
	public static final int[] field1374 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("YCYSFKFW.t")
	public static boolean field1380 = true;

	@ObfuscatedName("YCYSFKFW.y")
	public static int field1381 = 99;

	@ObfuscatedName("YCYSFKFW.E")
	public static final int[] field1387 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("YCYSFKFW.g")
	public static int field1369 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("YCYSFKFW.s")
	public static int field1379 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("YCYSFKFW.D")
	public static int field1386;

	@ObfuscatedName("YCYSFKFW.a(LNCUAQOFM;Z[LNXLHMSCV;)V")
	public final void method497(NCUAQOFM arg0, NXLHMSCV[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field1371[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field1371[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method357(var4, var5);
						}
					}
				}
			}
		}

		field1379 += (int) (Math.random() * 5.0D) - 2;
		if (field1379 < -8) {
			field1379 = -8;
		}

		if (field1379 > 8) {
			field1379 = 8;
		}

		field1369 += (int) (Math.random() * 5.0D) - 2;
		if (field1369 < -16) {
			field1369 = -16;
		}

		if (field1369 > 16) {
			field1369 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field1377[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field1383 - 1; var16++) {
				for (int var17 = 1; var17 < field1382 - 1; var17++) {
					int var18 = field1376[var7][var17 + 1][var16] - field1376[var7][var17 - 1][var16];
					int var19 = field1376[var7][var17][var16 + 1] - field1376[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field1384[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field1383; var26++) {
				field1363[var26] = 0;
				field1364[var26] = 0;
				field1365[var26] = 0;
				field1366[var26] = 0;
				field1367[var26] = 0;
			}

			for (int var27 = -5; var27 < field1382 + 5; var27++) {
				for (int var28 = 0; var28 < field1383; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field1382) {
						int var30 = field1375[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							IMXTJGZE var31 = IMXTJGZE.field773[var30 - 1];
							field1363[var28] += var31.field782;
							field1364[var28] += var31.field780;
							field1365[var28] += var31.field781;
							field1366[var28] += var31.field783;
							field1367[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field1382) {
						int var33 = field1375[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							IMXTJGZE var34 = IMXTJGZE.field773[var33 - 1];
							field1363[var28] -= var34.field782;
							field1364[var28] -= var34.field780;
							field1365[var28] -= var34.field781;
							field1366[var28] -= var34.field783;
							field1367[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field1382 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field1383 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field1383) {
							var35 += field1363[var41];
							var36 += field1364[var41];
							var37 += field1365[var41];
							var38 += field1366[var41];
							var39 += field1367[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field1383) {
							var35 -= field1363[var42];
							var36 -= field1364[var42];
							var37 -= field1365[var42];
							var38 -= field1366[var42];
							var39 -= field1367[var42];
						}

						if (var40 >= 1 && var40 < field1383 - 1 && (!field1380 || (field1371[0][var27][var40] & 0x2) != 0 || (field1371[var7][var27][var40] & 0x10) == 0 && method514(var27, var7, var40) == field1386)) {
							if (var7 < field1381) {
								field1381 = var7;
							}

							int var43 = field1375[var7][var27][var40] & 0xFF;
							int var44 = field1368[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field1376[var7][var27][var40];
								int var46 = field1376[var7][var27 + 1][var40];
								int var47 = field1376[var7][var27 + 1][var40 + 1];
								int var48 = field1376[var7][var27][var40 + 1];
								int var49 = field1384[var27][var40];
								int var50 = field1384[var27 + 1][var40];
								int var51 = field1384[var27 + 1][var40 + 1];
								int var52 = field1384[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method505(var55, var56, var57);
									var55 = field1379 + var55 & 0xFF;
									var57 += field1369;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method505(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field1370[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !IMXTJGZE.field773[var44 - 1].field778) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field1385[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = CPGFUBUO.field568[method502(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method297(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method502(var53, var49), method502(var53, var50), method502(var53, var51), method502(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field1370[var7][var27][var40] + 1;
									byte var61 = field1378[var7][var27][var40];
									IMXTJGZE var62 = IMXTJGZE.field773[var44 - 1];
									int var63 = var62.field776;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = CPGFUBUO.method189(var63);
										var65 = -1;
									} else if (var62.field775 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method505(var62.field779, var62.field780, var62.field781);
										var64 = CPGFUBUO.field568[method501(var62.field784, 96)];
									}

									arg0.method297(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method502(var53, var49), method502(var53, var50), method502(var53, var51), method502(var53, var52), method501(var65, var49), method501(var65, var50), method501(var65, var51), method501(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field1383 - 1; var66++) {
				for (int var67 = 1; var67 < field1382 - 1; var67++) {
					arg0.method296(var7, var67, var66, method514(var67, var7, var66));
				}
			}
		}

		arg0.method323(-50, -50, 64, -10, 768);

		for (int var68 = 0; var68 < field1382; var68++) {
			for (int var69 = 0; var69 < field1383; var69++) {
				if ((field1371[1][var68][var69] & 0x2) == 2) {
					arg0.method294(var69, var68);
				}
			}
		}

		int var70 = 1;
		int var71 = 2;
		int var72 = 4;
		for (int var73 = 0; var73 < 4; var73++) {
			if (var73 > 0) {
				var70 <<= 3;
				var71 <<= 3;
				var72 <<= 3;
			}

			for (int var74 = 0; var74 <= var73; var74++) {
				for (int var75 = 0; var75 <= field1383; var75++) {
					for (int var76 = 0; var76 <= field1382; var76++) {
						if ((field1385[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field1385[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field1383 && (field1385[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field1385[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field1385[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field1376[var80][var76][var77] - var84;
								int var86 = field1376[var79][var76][var77];
								NCUAQOFM.method295(var85, var76 * 128, var77 * 128, var76 * 128, var78 * 128 + 128, 1, var73, var86);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field1385[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field1385[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field1385[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field1382 && (field1385[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field1385[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field1385[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field1376[var92][var89][var75] - var96;
								int var98 = field1376[var91][var89][var75];
								NCUAQOFM.method295(var97, var89 * 128, var75 * 128, var90 * 128 + 128, var75 * 128, 2, var73, var98);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field1385[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field1385[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field1385[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field1383 && (field1385[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field1385[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field1382) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field1385[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field1376[var74][var101][var103];
								NCUAQOFM.method295(var107, var101 * 128, var103 * 128, var102 * 128 + 128, var104 * 128 + 128, 4, var73, var107);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field1385[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("YCYSFKFW.a(ILNXLHMSCV;IIIZIILNCUAQOFM;)V")
	public final void method498(int arg0, NXLHMSCV arg1, int arg2, int arg3, int arg4, int arg5, int arg6, NCUAQOFM arg7) {
		if (field1380 && (field1371[0][arg4][arg3] & 0x2) == 0) {
			if ((field1371[arg5][arg4][arg3] & 0x10) != 0) {
				return;
			}

			if (method514(arg4, arg5, arg3) != field1386) {
				return;
			}
		}

		if (arg5 < field1381) {
			field1381 = arg5;
		}

		int var9 = field1376[arg5][arg4][arg3];
		int var10 = field1376[arg5][arg4 + 1][arg3];
		int var11 = field1376[arg5][arg4 + 1][arg3 + 1];
		int var12 = field1376[arg5][arg4][arg3 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		NNGZIOFO var14 = NNGZIOFO.method350(arg6);
		int var15 = (arg6 << 14) + (arg3 << 7) + arg4 + 0x40000000;
		if (!var14.field994) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg2 << 6) + arg0);
		if (arg0 == 22) {
			if (!field1380 || var14.field994 || var14.field980) {
				VIVVOUFY var17;
				if (var14.field981 == -1 && var14.field1000 == null) {
					var17 = var14.method344(22, arg2, var9, var10, var11, var12, -1);
				} else {
					var17 = new JVQZOBJO(var14.field981, true, arg6, 22, var10, var12, var11, var9, arg2);
				}

				arg7.method298(var15, arg4, arg3, var13, arg5, var17, var16);

				if (var14.field975 && var14.field994 && arg1 != null) {
					arg1.method357(arg4, arg3);
				}
			}
		} else if (arg0 == 10 || arg0 == 11) {
			VIVVOUFY var18;
			if (var14.field981 == -1 && var14.field1000 == null) {
				var18 = var14.method344(10, arg2, var9, var10, var11, var12, -1);
			} else {
				var18 = new JVQZOBJO(var14.field981, true, arg6, 10, var10, var12, var11, var9, arg2);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg0 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg2 == 1 || arg2 == 3) {
					var20 = var14.field983;
					var21 = var14.field966;
				} else {
					var20 = var14.field966;
					var21 = var14.field983;
				}

				if (arg7.method302(arg4, var13, arg5, var16, var15, arg3, var21, var20, var19, var18) && var14.field988) {
					CCYECDYX var22;
					if (var18 instanceof CCYECDYX) {
						var22 = (CCYECDYX) var18;
					} else {
						var22 = var14.method344(10, arg2, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field51 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field1377[arg5][arg4 + var23][arg3 + var24]) {
									field1377[arg5][arg4 + var23][arg3 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field975 && arg1 != null) {
				arg1.method356(var14.field983, arg2, var14.field966, arg3, arg4, var14.field1009);
			}
		} else if (arg0 >= 12) {
			VIVVOUFY var26;
			if (var14.field981 == -1 && var14.field1000 == null) {
				var26 = var14.method344(arg0, arg2, var9, var10, var11, var12, -1);
			} else {
				var26 = new JVQZOBJO(var14.field981, true, arg6, arg0, var10, var12, var11, var9, arg2);
			}

			arg7.method302(arg4, var13, arg5, var16, var15, arg3, 1, 1, 0, var26);

			if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg5 > 0) {
				field1385[arg5][arg4][arg3] |= 0x924;
			}

			if (var14.field975 && arg1 != null) {
				arg1.method356(var14.field983, arg2, var14.field966, arg3, arg4, var14.field1009);
			}
		} else if (arg0 == 0) {
			VIVVOUFY var27;
			if (var14.field981 == -1 && var14.field1000 == null) {
				var27 = var14.method344(0, arg2, var9, var10, var11, var12, -1);
			} else {
				var27 = new JVQZOBJO(var14.field981, true, arg6, 0, var10, var12, var11, var9, arg2);
			}

			arg7.method300(var15, var16, null, arg3, arg4, var13, 0, var27, arg5, field1372[arg2]);

			if (arg2 == 0) {
				if (var14.field988) {
					field1377[arg5][arg4][arg3] = 50;
					field1377[arg5][arg4][arg3 + 1] = 50;
				}

				if (var14.field1010) {
					field1385[arg5][arg4][arg3] |= 0x249;
				}
			} else if (arg2 == 1) {
				if (var14.field988) {
					field1377[arg5][arg4][arg3 + 1] = 50;
					field1377[arg5][arg4 + 1][arg3 + 1] = 50;
				}

				if (var14.field1010) {
					field1385[arg5][arg4][arg3 + 1] |= 0x492;
				}
			} else if (arg2 == 2) {
				if (var14.field988) {
					field1377[arg5][arg4 + 1][arg3] = 50;
					field1377[arg5][arg4 + 1][arg3 + 1] = 50;
				}

				if (var14.field1010) {
					field1385[arg5][arg4 + 1][arg3] |= 0x249;
				}
			} else if (arg2 == 3) {
				if (var14.field988) {
					field1377[arg5][arg4][arg3] = 50;
					field1377[arg5][arg4 + 1][arg3] = 50;
				}

				if (var14.field1010) {
					field1385[arg5][arg4][arg3] |= 0x492;
				}
			}

			if (var14.field975 && arg1 != null) {
				arg1.method355(arg0, arg4, arg3, arg2, var14.field1009);
			}

			if (var14.field1012 != 16) {
				arg7.method308(var14.field1012, arg4, arg3, arg5);
			}
		} else if (arg0 == 1) {
			VIVVOUFY var28;
			if (var14.field981 == -1 && var14.field1000 == null) {
				var28 = var14.method344(1, arg2, var9, var10, var11, var12, -1);
			} else {
				var28 = new JVQZOBJO(var14.field981, true, arg6, 1, var10, var12, var11, var9, arg2);
			}

			arg7.method300(var15, var16, null, arg3, arg4, var13, 0, var28, arg5, field1374[arg2]);

			if (var14.field988) {
				if (arg2 == 0) {
					field1377[arg5][arg4][arg3 + 1] = 50;
				} else if (arg2 == 1) {
					field1377[arg5][arg4 + 1][arg3 + 1] = 50;
				} else if (arg2 == 2) {
					field1377[arg5][arg4 + 1][arg3] = 50;
				} else if (arg2 == 3) {
					field1377[arg5][arg4][arg3] = 50;
				}
			}

			if (var14.field975 && arg1 != null) {
				arg1.method355(arg0, arg4, arg3, arg2, var14.field1009);
			}
		} else if (arg0 == 2) {
			int var29 = arg2 + 1 & 0x3;
			VIVVOUFY var30;
			VIVVOUFY var31;
			if (var14.field981 == -1 && var14.field1000 == null) {
				var30 = var14.method344(2, arg2 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method344(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new JVQZOBJO(var14.field981, true, arg6, 2, var10, var12, var11, var9, arg2 + 4);
				var31 = new JVQZOBJO(var14.field981, true, arg6, 2, var10, var12, var11, var9, var29);
			}

			arg7.method300(var15, var16, var31, arg3, arg4, var13, field1372[var29], var30, arg5, field1372[arg2]);

			if (var14.field1010) {
				if (arg2 == 0) {
					field1385[arg5][arg4][arg3] |= 0x249;
					field1385[arg5][arg4][arg3 + 1] |= 0x492;
				} else if (arg2 == 1) {
					field1385[arg5][arg4][arg3 + 1] |= 0x492;
					field1385[arg5][arg4 + 1][arg3] |= 0x249;
				} else if (arg2 == 2) {
					field1385[arg5][arg4 + 1][arg3] |= 0x249;
					field1385[arg5][arg4][arg3] |= 0x492;
				} else if (arg2 == 3) {
					field1385[arg5][arg4][arg3] |= 0x492;
					field1385[arg5][arg4][arg3] |= 0x249;
				}
			}

			if (var14.field975 && arg1 != null) {
				arg1.method355(arg0, arg4, arg3, arg2, var14.field1009);
			}

			if (var14.field1012 != 16) {
				arg7.method308(var14.field1012, arg4, arg3, arg5);
			}
		} else if (arg0 == 3) {
			VIVVOUFY var32;
			if (var14.field981 == -1 && var14.field1000 == null) {
				var32 = var14.method344(3, arg2, var9, var10, var11, var12, -1);
			} else {
				var32 = new JVQZOBJO(var14.field981, true, arg6, 3, var10, var12, var11, var9, arg2);
			}

			arg7.method300(var15, var16, null, arg3, arg4, var13, 0, var32, arg5, field1374[arg2]);

			if (var14.field988) {
				if (arg2 == 0) {
					field1377[arg5][arg4][arg3 + 1] = 50;
				} else if (arg2 == 1) {
					field1377[arg5][arg4 + 1][arg3 + 1] = 50;
				} else if (arg2 == 2) {
					field1377[arg5][arg4 + 1][arg3] = 50;
				} else if (arg2 == 3) {
					field1377[arg5][arg4][arg3] = 50;
				}
			}

			if (var14.field975 && arg1 != null) {
				arg1.method355(arg0, arg4, arg3, arg2, var14.field1009);
			}
		} else if (arg0 == 9) {
			VIVVOUFY var33;
			if (var14.field981 == -1 && var14.field1000 == null) {
				var33 = var14.method344(arg0, arg2, var9, var10, var11, var12, -1);
			} else {
				var33 = new JVQZOBJO(var14.field981, true, arg6, arg0, var10, var12, var11, var9, arg2);
			}

			arg7.method302(arg4, var13, arg5, var16, var15, arg3, 1, 1, 0, var33);

			if (var14.field975 && arg1 != null) {
				arg1.method356(var14.field983, arg2, var14.field966, arg3, arg4, var14.field1009);
			}
		} else {
			if (var14.field996) {
				if (arg2 == 1) {
					int var34 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var9;
					var9 = var34;
				} else if (arg2 == 2) {
					int var35 = var12;
					var12 = var10;
					var10 = var35;
					int var36 = var11;
					var11 = var9;
					var9 = var36;
				} else if (arg2 == 3) {
					int var37 = var12;
					var12 = var9;
					var9 = var10;
					var10 = var11;
					var11 = var37;
				}
			}

			if (arg0 == 4) {
				VIVVOUFY var38;
				if (var14.field981 == -1 && var14.field1000 == null) {
					var38 = var14.method344(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new JVQZOBJO(var14.field981, true, arg6, 4, var10, var12, var11, var9, 0);
				}

				arg7.method301(0, field1372[arg2], arg5, var13, var16, arg4, var38, arg3, arg2 * 512, var15, 0);
			} else if (arg0 == 5) {
				int var39 = 16;
				int var40 = arg7.method318(arg5, arg4, arg3);
				if (var40 > 0) {
					var39 = NNGZIOFO.method350(var40 >> 14 & 0x7FFF).field1012;
				}

				VIVVOUFY var41;
				if (var14.field981 == -1 && var14.field1000 == null) {
					var41 = var14.method344(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new JVQZOBJO(var14.field981, true, arg6, 4, var10, var12, var11, var9, 0);
				}

				arg7.method301(field1373[arg2] * var39, field1372[arg2], arg5, var13, var16, arg4, var41, arg3, arg2 * 512, var15, field1387[arg2] * var39);
			} else if (arg0 == 6) {
				VIVVOUFY var42;
				if (var14.field981 == -1 && var14.field1000 == null) {
					var42 = var14.method344(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new JVQZOBJO(var14.field981, true, arg6, 4, var10, var12, var11, var9, 0);
				}

				arg7.method301(0, 256, arg5, var13, var16, arg4, var42, arg3, arg2, var15, 0);
			} else if (arg0 == 7) {
				VIVVOUFY var43;
				if (var14.field981 == -1 && var14.field1000 == null) {
					var43 = var14.method344(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new JVQZOBJO(var14.field981, true, arg6, 4, var10, var12, var11, var9, 0);
				}

				arg7.method301(0, 512, arg5, var13, var16, arg4, var43, arg3, arg2, var15, 0);
			} else if (arg0 == 8) {
				VIVVOUFY var44;
				if (var14.field981 == -1 && var14.field1000 == null) {
					var44 = var14.method344(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new JVQZOBJO(var14.field981, true, arg6, 4, var10, var12, var11, var9, 0);
				}

				arg7.method301(0, 768, arg5, var13, var16, arg4, var44, arg3, arg2, var15, 0);
			}
		}
	}

	@ObfuscatedName("YCYSFKFW.a(IILZOMNSJJM;IIIII)V")
	public final void method499(int arg0, int arg1, ZOMNSJJM arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1 >= 0 && arg1 < 104 && arg0 >= 0 && arg0 < 104) {
			field1371[arg3][arg1][arg0] = 0;
			while (true) {
				int var8 = arg2.method547();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg2.method547();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg3 == 0) {
						field1376[0][arg1][arg0] = -var9 * 8;
						return;
					}

					field1376[arg3][arg1][arg0] = field1376[arg3 - 1][arg1][arg0] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field1368[arg3][arg1][arg0] = arg2.method548();
					field1370[arg3][arg1][arg0] = (byte) ((var8 - 2) / 4);
					field1378[arg3][arg1][arg0] = (byte) (var8 + arg6 - 2 & 0x3);
				} else if (var8 <= 81) {
					field1371[arg3][arg1][arg0] = (byte) (var8 - 49);
				} else {
					field1375[arg3][arg1][arg0] = (byte) (var8 - 81);
				}
			}

			if (arg3 == 0) {
				field1376[0][arg1][arg0] = -method516(arg1 + arg4 + 932731, arg0 + 556238 + arg5) * 8;
			} else {
				field1376[arg3][arg1][arg0] = field1376[arg3 - 1][arg1][arg0] - 240;
			}
		} else {
			while (true) {
				int var10 = arg2.method547();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg2.method547();
					return;
				}

				if (var10 <= 49) {
					arg2.method547();
				}
			}
		}
	}

	@ObfuscatedName("YCYSFKFW.a(IZI)Z")
	public static final boolean method500(int arg0, int arg1) {
		NNGZIOFO var2 = NNGZIOFO.method350(arg1);

		if (arg0 == 11) {
			arg0 = 10;
		}

		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}

		return var2.method349(arg0);
	}

	@ObfuscatedName("YCYSFKFW.a(II)I")
	public final int method501(int arg0, int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}

			return 127 - arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}

			return (arg0 & 0xFF80) + arg1;
		}
	}

	@ObfuscatedName("YCYSFKFW.b(II)I")
	public static final int method502(int arg0, int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}

		arg1 = (arg0 & 0x7F) * arg1 / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}

		return (arg0 & 0xFF80) + arg1;
	}

	@ObfuscatedName("YCYSFKFW.a(IIII)I")
	public static final int method503(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - CPGFUBUO.field557[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("YCYSFKFW.a(ILNCUAQOFM;[[[IIIZIILNXLHMSCV;II)V")
	public static final void method504(int arg0, NCUAQOFM arg1, int[][][] arg2, int arg3, int arg4, int arg5, int arg6, NXLHMSCV arg7, int arg8, int arg9) {
		int var10 = arg2[arg4][arg8][arg9];
		int var11 = arg2[arg4][arg8 + 1][arg9];
		int var12 = arg2[arg4][arg8 + 1][arg9 + 1];
		int var13 = arg2[arg4][arg8][arg9 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		NNGZIOFO var15 = NNGZIOFO.method350(arg5);
		int var16 = (arg5 << 14) + (arg9 << 7) + arg8 + 0x40000000;
		if (!var15.field994) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg0 << 6) + arg3);
		if (arg3 == 22) {
			VIVVOUFY var18;
			if (var15.field981 == -1 && var15.field1000 == null) {
				var18 = var15.method344(22, arg0, var10, var11, var12, var13, -1);
			} else {
				var18 = new JVQZOBJO(var15.field981, true, arg5, 22, var11, var13, var12, var10, arg0);
			}

			arg1.method298(var16, arg8, arg9, var14, arg6, var18, var17);

			if (var15.field975 && var15.field994) {
				arg7.method357(arg8, arg9);
			}
		} else if (arg3 == 10 || arg3 == 11) {
			VIVVOUFY var19;
			if (var15.field981 == -1 && var15.field1000 == null) {
				var19 = var15.method344(10, arg0, var10, var11, var12, var13, -1);
			} else {
				var19 = new JVQZOBJO(var15.field981, true, arg5, 10, var11, var13, var12, var10, arg0);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg3 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg0 == 1 || arg0 == 3) {
					var21 = var15.field983;
					var22 = var15.field966;
				} else {
					var21 = var15.field966;
					var22 = var15.field983;
				}

				arg1.method302(arg8, var14, arg6, var17, var16, arg9, var22, var21, var20, var19);
			}

			if (var15.field975) {
				arg7.method356(var15.field983, arg0, var15.field966, arg9, arg8, var15.field1009);
			}
		} else if (arg3 >= 12) {
			VIVVOUFY var23;
			if (var15.field981 == -1 && var15.field1000 == null) {
				var23 = var15.method344(arg3, arg0, var10, var11, var12, var13, -1);
			} else {
				var23 = new JVQZOBJO(var15.field981, true, arg5, arg3, var11, var13, var12, var10, arg0);
			}

			arg1.method302(arg8, var14, arg6, var17, var16, arg9, 1, 1, 0, var23);

			if (var15.field975) {
				arg7.method356(var15.field983, arg0, var15.field966, arg9, arg8, var15.field1009);
			}
		} else if (arg3 == 0) {
			VIVVOUFY var24;
			if (var15.field981 == -1 && var15.field1000 == null) {
				var24 = var15.method344(0, arg0, var10, var11, var12, var13, -1);
			} else {
				var24 = new JVQZOBJO(var15.field981, true, arg5, 0, var11, var13, var12, var10, arg0);
			}

			arg1.method300(var16, var17, null, arg9, arg8, var14, 0, var24, arg6, field1372[arg0]);

			if (var15.field975) {
				arg7.method355(arg3, arg8, arg9, arg0, var15.field1009);
			}
		} else if (arg3 == 1) {
			VIVVOUFY var25;
			if (var15.field981 == -1 && var15.field1000 == null) {
				var25 = var15.method344(1, arg0, var10, var11, var12, var13, -1);
			} else {
				var25 = new JVQZOBJO(var15.field981, true, arg5, 1, var11, var13, var12, var10, arg0);
			}

			arg1.method300(var16, var17, null, arg9, arg8, var14, 0, var25, arg6, field1374[arg0]);

			if (var15.field975) {
				arg7.method355(arg3, arg8, arg9, arg0, var15.field1009);
			}
		} else if (arg3 == 2) {
			int var26 = arg0 + 1 & 0x3;
			VIVVOUFY var27;
			VIVVOUFY var28;
			if (var15.field981 == -1 && var15.field1000 == null) {
				var27 = var15.method344(2, arg0 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method344(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new JVQZOBJO(var15.field981, true, arg5, 2, var11, var13, var12, var10, arg0 + 4);
				var28 = new JVQZOBJO(var15.field981, true, arg5, 2, var11, var13, var12, var10, var26);
			}

			arg1.method300(var16, var17, var28, arg9, arg8, var14, field1372[var26], var27, arg6, field1372[arg0]);

			if (var15.field975) {
				arg7.method355(arg3, arg8, arg9, arg0, var15.field1009);
			}
		} else if (arg3 == 3) {
			VIVVOUFY var29;
			if (var15.field981 == -1 && var15.field1000 == null) {
				var29 = var15.method344(3, arg0, var10, var11, var12, var13, -1);
			} else {
				var29 = new JVQZOBJO(var15.field981, true, arg5, 3, var11, var13, var12, var10, arg0);
			}

			arg1.method300(var16, var17, null, arg9, arg8, var14, 0, var29, arg6, field1374[arg0]);

			if (var15.field975) {
				arg7.method355(arg3, arg8, arg9, arg0, var15.field1009);
			}
		} else if (arg3 == 9) {
			VIVVOUFY var30;
			if (var15.field981 == -1 && var15.field1000 == null) {
				var30 = var15.method344(arg3, arg0, var10, var11, var12, var13, -1);
			} else {
				var30 = new JVQZOBJO(var15.field981, true, arg5, arg3, var11, var13, var12, var10, arg0);
			}

			arg1.method302(arg8, var14, arg6, var17, var16, arg9, 1, 1, 0, var30);

			if (var15.field975) {
				arg7.method356(var15.field983, arg0, var15.field966, arg9, arg8, var15.field1009);
			}
		} else {
			if (var15.field996) {
				if (arg0 == 1) {
					int var31 = var13;
					var13 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var31;
				} else if (arg0 == 2) {
					int var32 = var13;
					var13 = var11;
					var11 = var32;
					int var33 = var12;
					var12 = var10;
					var10 = var33;
				} else if (arg0 == 3) {
					int var34 = var13;
					var13 = var10;
					var10 = var11;
					var11 = var12;
					var12 = var34;
				}
			}

			if (arg3 == 4) {
				VIVVOUFY var35;
				if (var15.field981 == -1 && var15.field1000 == null) {
					var35 = var15.method344(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new JVQZOBJO(var15.field981, true, arg5, 4, var11, var13, var12, var10, 0);
				}

				arg1.method301(0, field1372[arg0], arg6, var14, var17, arg8, var35, arg9, arg0 * 512, var16, 0);
			} else if (arg3 == 5) {
				int var36 = 16;
				int var37 = arg1.method318(arg6, arg8, arg9);
				if (var37 > 0) {
					var36 = NNGZIOFO.method350(var37 >> 14 & 0x7FFF).field1012;
				}

				VIVVOUFY var38;
				if (var15.field981 == -1 && var15.field1000 == null) {
					var38 = var15.method344(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new JVQZOBJO(var15.field981, true, arg5, 4, var11, var13, var12, var10, 0);
				}

				arg1.method301(field1373[arg0] * var36, field1372[arg0], arg6, var14, var17, arg8, var38, arg9, arg0 * 512, var16, field1387[arg0] * var36);
			} else if (arg3 == 6) {
				VIVVOUFY var39;
				if (var15.field981 == -1 && var15.field1000 == null) {
					var39 = var15.method344(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new JVQZOBJO(var15.field981, true, arg5, 4, var11, var13, var12, var10, 0);
				}

				arg1.method301(0, 256, arg6, var14, var17, arg8, var39, arg9, arg0, var16, 0);
			} else if (arg3 == 7) {
				VIVVOUFY var40;
				if (var15.field981 == -1 && var15.field1000 == null) {
					var40 = var15.method344(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new JVQZOBJO(var15.field981, true, arg5, 4, var11, var13, var12, var10, 0);
				}

				arg1.method301(0, 512, arg6, var14, var17, arg8, var40, arg9, arg0, var16, 0);
			} else if (arg3 == 8) {
				VIVVOUFY var41;
				if (var15.field981 == -1 && var15.field1000 == null) {
					var41 = var15.method344(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new JVQZOBJO(var15.field981, true, arg5, 4, var11, var13, var12, var10, 0);
				}

				arg1.method301(0, 768, arg6, var14, var17, arg8, var41, arg9, arg0, var16, 0);
			}
		}
	}

	@ObfuscatedName("YCYSFKFW.a(III)I")
	public final int method505(int arg0, int arg1, int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}

		if (arg2 > 192) {
			arg1 /= 2;
		}

		if (arg2 > 217) {
			arg1 /= 2;
		}

		if (arg2 > 243) {
			arg1 /= 2;
		}

		return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
	}

	@ObfuscatedName("YCYSFKFW.a(IILNCUAQOFM;I[B[LNXLHMSCV;)V")
	public final void method506(int arg0, int arg1, NCUAQOFM arg2, byte[] arg3, NXLHMSCV[] arg4) {
		ZOMNSJJM var6 = new ZOMNSJJM(arg3);
		int var7 = -1;
		while (true) {
			int var8 = var6.method561();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method561();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method547();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg1 + var12;
				int var18 = arg0 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field1371[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					NXLHMSCV var20 = null;
					if (var19 >= 0) {
						var20 = arg4[var19];
					}

					method498(var15, var20, var16, var18, var17, var13, var7, arg2);
				}
			}
		}
	}

	@ObfuscatedName("YCYSFKFW.a(IIIIZ)V")
	public final void method507(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
			for (int var6 = arg1; var6 <= arg1 + arg3; var6++) {
				if (var6 >= 0 && var6 < field1382 && var5 >= 0 && var5 < field1383) {
					field1377[0][var6][var5] = 127;

					if (arg1 == var6 && var6 > 0) {
						field1376[0][var6][var5] = field1376[0][var6 - 1][var5];
					}

					if (arg1 + arg3 == var6 && var6 < field1382 - 1) {
						field1376[0][var6][var5] = field1376[0][var6 + 1][var5];
					}

					if (arg0 == var5 && var5 > 0) {
						field1376[0][var6][var5] = field1376[0][var6][var5 - 1];
					}

					if (arg0 + arg2 == var5 && var5 < field1383 - 1) {
						field1376[0][var6][var5] = field1376[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("YCYSFKFW.a(I[BII)Z")
	public static final boolean method508(int arg0, byte[] arg1, int arg2) {
		boolean var3 = true;
		ZOMNSJJM var4 = new ZOMNSJJM(arg1);
		int var5 = -1;
		while (true) {
			int var6 = var4.method561();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method561();
					if (var9 == 0) {
						break;
					}

					var4.method547();
				} else {
					int var10 = var4.method561();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method547() >> 2;
					int var14 = arg2 + var12;
					int var15 = arg0 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						NNGZIOFO var16 = NNGZIOFO.method350(var5);
						if (var13 != 22 || !field1380 || var16.field994 || var16.field980) {
							var3 &= var16.method343();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("YCYSFKFW.c(II)I")
	public static final int method509(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("YCYSFKFW.a(I[LNXLHMSCV;IIII[B)V")
	public final void method510(int arg0, NXLHMSCV[] arg1, int arg2, int arg3, int arg4, byte[] arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg0 + var8 > 0 && arg0 + var8 < 103 && arg4 + var9 > 0 && arg4 + var9 < 103) {
						arg1[var7].field1021[arg0 + var8][arg4 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		ZOMNSJJM var10 = new ZOMNSJJM(arg5);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method499(arg4 + var13, arg0 + var12, var10, var11, arg3, arg2, 0);
				}
			}
		}
	}

	@ObfuscatedName("YCYSFKFW.b(III)I")
	public static final int method511(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method517(var3, var5);
		int var8 = method517(var3 + 1, var5);
		int var9 = method517(var3, var5 + 1);
		int var10 = method517(var3 + 1, var5 + 1);
		int var11 = method503(var7, var8, var4, arg2);
		int var12 = method503(var9, var10, var4, arg2);
		return method503(var11, var12, var6, arg2);
	}

	@ObfuscatedName("YCYSFKFW.a([LNXLHMSCV;IILNCUAQOFM;IIZIII[B)V")
	public final void method512(NXLHMSCV[] arg0, int arg1, int arg2, NCUAQOFM arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9) {
		ZOMNSJJM var11 = new ZOMNSJJM(arg9);
		int var12 = -1;
		while (true) {
			int var13 = var11.method561();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method561();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method547();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg8 == var18 && var17 >= arg1 && var17 < arg1 + 8 && var16 >= arg6 && var16 < arg6 + 8) {
					NNGZIOFO var22 = NNGZIOFO.method350(var12);
					int var23 = arg7 + ROUYYYUE.method386(var22.field983, var17 & 0x7, var16 & 0x7, arg5, var22.field966);
					int var24 = arg2 + ROUYYYUE.method387(var22.field966, var16 & 0x7, var22.field983, var17 & 0x7, arg5);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg4;
						if ((field1371[1][var23][var24] & 0x2) == 2) {
							var25 = arg4 - 1;
						}

						NXLHMSCV var26 = null;
						if (var25 >= 0) {
							var26 = arg0[var25];
						}

						method498(var20, var26, arg5 + var21 & 0x3, var24, var23, arg4, var12, arg3);
					}
				}
			}
		}
	}

	@ObfuscatedName("YCYSFKFW.a(ILSMQPXRFY;LZOMNSJJM;)V")
	public static final void method513(SMQPXRFY arg0, ZOMNSJJM arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg1.method561();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			NNGZIOFO var4 = NNGZIOFO.method350(var2);
			var4.method352(arg0);

			while (true) {
				int var5 = arg1.method561();
				if (var5 == 0) {
					break;
				}

				arg1.method547();
			}
		}
	}

	@ObfuscatedName("YCYSFKFW.b(IIII)I")
	public int method514(int arg0, int arg1, int arg2) {
		if ((field1371[arg1][arg0][arg2] & 0x8) != 0) {
			return 0;
		}

		if (arg1 > 0 && (field1371[1][arg0][arg2] & 0x2) != 0) {
			return arg1 - 1;
		}

		return arg1;
	}

	@ObfuscatedName("YCYSFKFW.a(IIIIIII[B[LNXLHMSCV;I)V")
	public final void method515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, NXLHMSCV[] arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg2 + var10 > 0 && arg2 + var10 < 103 && arg1 + var11 > 0 && arg1 + var11 < 103) {
					arg8[arg5].field1021[arg2 + var10][arg1 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		ZOMNSJJM var12 = new ZOMNSJJM(arg7);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg6 == var13 && var14 >= arg3 && var14 < arg3 + 8 && var15 >= arg0 && var15 < arg0 + 8) {
						method499(arg1 + ROUYYYUE.method385(arg4, var15 & 0x7, var14 & 0x7), arg2 + ROUYYYUE.method384(arg4, var14 & 0x7, var15 & 0x7), var12, arg5, 0, 0, arg4);
					} else {
						method499(-1, -1, var12, 0, 0, 0, 0);
					}
				}
			}
		}
	}

	public YCYSFKFW(int arg0, int[][][] arg1, byte[][][] arg2, int arg3) {
		field1381 = 99;
		field1382 = arg0;
		field1383 = arg3;
		field1376 = arg1;
		field1371 = arg2;
		field1375 = new byte[4][field1382][field1383];
		field1368 = new byte[4][field1382][field1383];
		field1370 = new byte[4][field1382][field1383];
		field1378 = new byte[4][field1382][field1383];
		field1385 = new int[4][field1382 + 1][field1383 + 1];
		field1377 = new byte[4][field1382 + 1][field1383 + 1];
		field1384 = new int[field1382 + 1][field1383 + 1];
		field1363 = new int[field1383];
		field1364 = new int[field1383];
		field1365 = new int[field1383];
		field1366 = new int[field1383];
		field1367 = new int[field1383];
	}

	@ObfuscatedName("YCYSFKFW.d(II)I")
	public static final int method516(int arg0, int arg1) {
		int var2 = method511(arg0 + 45365, arg1 + 91923, 4) + (method511(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method511(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("YCYSFKFW.e(II)I")
	public static final int method517(int arg0, int arg1) {
		int var2 = method509(arg0 - 1, arg1 - 1) + method509(arg0 + 1, arg1 - 1) + method509(arg0 - 1, arg1 + 1) + method509(arg0 + 1, arg1 + 1);
		int var3 = method509(arg0 - 1, arg1) + method509(arg0 + 1, arg1) + method509(arg0, arg1 - 1) + method509(arg0, arg1 + 1);
		int var4 = method509(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}
}
