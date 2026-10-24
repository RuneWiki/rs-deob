package deob;

@ObfuscatedName("WZFUDUYZ")
public final class WZFUDUYZ {

	@ObfuscatedName("WZFUDUYZ.E")
	public int field1410;

	@ObfuscatedName("WZFUDUYZ.F")
	public int field1411;

	@ObfuscatedName("WZFUDUYZ.C")
	public int[][][] field1408;

	@ObfuscatedName("WZFUDUYZ.A")
	public byte[][][] field1407;

	@ObfuscatedName("WZFUDUYZ.u")
	public byte[][][] field1403;

	@ObfuscatedName("WZFUDUYZ.H")
	public byte[][][] field1412;

	@ObfuscatedName("WZFUDUYZ.z")
	public byte[][][] field1406;

	@ObfuscatedName("WZFUDUYZ.k")
	public byte[][][] field1394;

	@ObfuscatedName("WZFUDUYZ.d")
	public int[][][] field1390;

	@ObfuscatedName("WZFUDUYZ.i")
	public byte[][][] field1392;

	@ObfuscatedName("WZFUDUYZ.b")
	public int[][] field1389;

	@ObfuscatedName("WZFUDUYZ.p")
	public int[] field1398;

	@ObfuscatedName("WZFUDUYZ.q")
	public int[] field1399;

	@ObfuscatedName("WZFUDUYZ.r")
	public int[] field1400;

	@ObfuscatedName("WZFUDUYZ.s")
	public int[] field1401;

	@ObfuscatedName("WZFUDUYZ.t")
	public int[] field1402;

	@ObfuscatedName("WZFUDUYZ.a")
	public static final int[] field1388 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("WZFUDUYZ.h")
	public static final int[] field1391 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("WZFUDUYZ.j")
	public static final int[] field1393 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("WZFUDUYZ.n")
	public static final int[] field1397 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("WZFUDUYZ.y")
	public static boolean field1405 = true;

	@ObfuscatedName("WZFUDUYZ.D")
	public static int field1409 = 99;

	@ObfuscatedName("WZFUDUYZ.l")
	public static int field1395 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("WZFUDUYZ.w")
	public static int field1404 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("WZFUDUYZ.m")
	public static int field1396;

	@ObfuscatedName("WZFUDUYZ.a(IIIB)I")
	public int method560(int arg0, int arg1, int arg2) {
		if ((field1407[arg2][arg1][arg0] & 0x8) != 0) {
			return 0;
		}

		if (arg2 > 0 && (field1407[1][arg1][arg0] & 0x2) != 0) {
			return arg2 - 1;
		}

		return arg2;
	}

	@ObfuscatedName("WZFUDUYZ.a(III)I")
	public final int method561(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("WZFUDUYZ.a(II)I")
	public static final int method562(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("WZFUDUYZ.a(LBSNPYLEV;ZLVYNRIVYZ;)V")
	public static final void method563(BSNPYLEV arg0, VYNRIVYZ arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method61();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			RUROEYEG var4 = RUROEYEG.method494(var2);
			var4.method502(arg1);

			while (true) {
				int var5 = arg0.method61();
				if (var5 == 0) {
					break;
				}

				arg0.method47();
			}
		}
	}

	@ObfuscatedName("WZFUDUYZ.a(LPAJXYXWG;Z[LEOLCIJGV;)V")
	public final void method564(PAJXYXWG arg0, EOLCIJGV[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field1407[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field1407[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method288(var5, var4);
						}
					}
				}
			}
		}

		field1395 += (int) (Math.random() * 5.0D) - 2;
		if (field1395 < -8) {
			field1395 = -8;
		}

		if (field1395 > 8) {
			field1395 = 8;
		}

		field1404 += (int) (Math.random() * 5.0D) - 2;
		if (field1404 < -16) {
			field1404 = -16;
		}

		if (field1404 > 16) {
			field1404 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field1392[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field1411 - 1; var16++) {
				for (int var17 = 1; var17 < field1410 - 1; var17++) {
					int var18 = field1408[var7][var17 + 1][var16] - field1408[var7][var17 - 1][var16];
					int var19 = field1408[var7][var17][var16 + 1] - field1408[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field1389[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field1411; var26++) {
				field1398[var26] = 0;
				field1399[var26] = 0;
				field1400[var26] = 0;
				field1401[var26] = 0;
				field1402[var26] = 0;
			}

			for (int var27 = -5; var27 < field1410 + 5; var27++) {
				for (int var28 = 0; var28 < field1411; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field1410) {
						int var30 = field1403[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							VDWALSCV var31 = VDWALSCV.field1323[var30 - 1];
							field1398[var28] += var31.field1332;
							field1399[var28] += var31.field1330;
							field1400[var28] += var31.field1331;
							field1401[var28] += var31.field1333;
							field1402[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field1410) {
						int var33 = field1403[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							VDWALSCV var34 = VDWALSCV.field1323[var33 - 1];
							field1398[var28] -= var34.field1332;
							field1399[var28] -= var34.field1330;
							field1400[var28] -= var34.field1331;
							field1401[var28] -= var34.field1333;
							field1402[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field1410 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field1411 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field1411) {
							var35 += field1398[var41];
							var36 += field1399[var41];
							var37 += field1400[var41];
							var38 += field1401[var41];
							var39 += field1402[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field1411) {
							var35 -= field1398[var42];
							var36 -= field1399[var42];
							var37 -= field1400[var42];
							var38 -= field1401[var42];
							var39 -= field1402[var42];
						}

						if (var40 >= 1 && var40 < field1411 - 1 && (!field1405 || (field1407[0][var27][var40] & 0x2) != 0 || (field1407[var7][var27][var40] & 0x10) == 0 && method560(var40, var27, var7) == field1396)) {
							if (var7 < field1409) {
								field1409 = var7;
							}

							int var43 = field1403[var7][var27][var40] & 0xFF;
							int var44 = field1412[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field1408[var7][var27][var40];
								int var46 = field1408[var7][var27 + 1][var40];
								int var47 = field1408[var7][var27 + 1][var40 + 1];
								int var48 = field1408[var7][var27][var40 + 1];
								int var49 = field1389[var27][var40];
								int var50 = field1389[var27 + 1][var40];
								int var51 = field1389[var27 + 1][var40 + 1];
								int var52 = field1389[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method561(var55, var56, var57);
									var55 = field1395 + var55 & 0xFF;
									var57 += field1404;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method561(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field1406[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !VDWALSCV.field1323[var44 - 1].field1328) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field1390[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = IWBEAICJ.field751[method575(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method380(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method575(var53, var49), method575(var53, var50), method575(var53, var51), method575(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field1406[var7][var27][var40] + 1;
									byte var61 = field1394[var7][var27][var40];
									VDWALSCV var62 = VDWALSCV.field1323[var44 - 1];
									int var63 = var62.field1326;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = IWBEAICJ.method330(var63);
										var65 = -1;
									} else if (var62.field1325 == 0xFF00FF) {
										var65 = -2;
										var63 = -1;
										var64 = IWBEAICJ.field751[method579(var62.field1334, 96)];
									} else {
										var65 = method561(var62.field1329, var62.field1330, var62.field1331);
										var64 = IWBEAICJ.field751[method579(var62.field1334, 96)];
									}

									arg0.method380(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method575(var53, var49), method575(var53, var50), method575(var53, var51), method575(var53, var52), method579(var65, var49), method579(var65, var50), method579(var65, var51), method579(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field1411 - 1; var66++) {
				for (int var67 = 1; var67 < field1410 - 1; var67++) {
					arg0.method379(var7, var67, var66, method560(var66, var67, var7));
				}
			}
		}

		arg0.method406(-50, -50, -10);

		for (int var68 = 0; var68 < field1410; var68++) {
			for (int var69 = 0; var69 < field1411; var69++) {
				if ((field1407[1][var68][var69] & 0x2) == 2) {
					arg0.method377(var68, var69);
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
				for (int var75 = 0; var75 <= field1411; var75++) {
					for (int var76 = 0; var76 <= field1410; var76++) {
						if ((field1390[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field1390[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field1411 && (field1390[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field1390[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field1390[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field1408[var80][var76][var77] - var84;
								int var86 = field1408[var79][var76][var77];
								PAJXYXWG.method378(var73, var86, 1, var85, var78 * 128 + 128, var76 * 128, var77 * 128, var76 * 128);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field1390[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field1390[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field1390[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field1410 && (field1390[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field1390[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field1390[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field1408[var92][var89][var75] - var96;
								int var98 = field1408[var91][var89][var75];
								PAJXYXWG.method378(var73, var98, 2, var97, var75 * 128, var89 * 128, var75 * 128, var90 * 128 + 128);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field1390[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field1390[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field1390[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field1411 && (field1390[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field1390[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field1410) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field1390[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field1408[var74][var101][var103];
								PAJXYXWG.method378(var73, var107, 4, var107, var104 * 128 + 128, var101 * 128, var103 * 128, var102 * 128 + 128);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field1390[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("WZFUDUYZ.a(IIILEOLCIJGV;IILPAJXYXWG;II)V")
	public final void method565(int arg0, int arg1, int arg2, EOLCIJGV arg3, int arg4, PAJXYXWG arg5, int arg6, int arg7) {
		if (field1405 && (field1407[0][arg6][arg1] & 0x2) == 0) {
			if ((field1407[arg0][arg6][arg1] & 0x10) != 0) {
				return;
			}

			if (method560(arg1, arg6, arg0) != field1396) {
				return;
			}
		}

		if (arg0 < field1409) {
			field1409 = arg0;
		}

		int var9 = field1408[arg0][arg6][arg1];
		int var10 = field1408[arg0][arg6 + 1][arg1];
		int var11 = field1408[arg0][arg6 + 1][arg1 + 1];
		int var12 = field1408[arg0][arg6][arg1 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		RUROEYEG var14 = RUROEYEG.method494(arg4);
		int var15 = (arg4 << 14) + (arg1 << 7) + arg6 + 0x40000000;
		if (!var14.field1222) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg7 << 6) + arg2);
		if (arg2 == 22) {
			if (!field1405 || var14.field1222 || var14.field1244) {
				QLYZESGB var17;
				if (var14.field1238 == -1 && var14.field1233 == null) {
					var17 = var14.method492(22, arg7, var9, var10, var11, var12, -1);
				} else {
					var17 = new SBGQSXPV(var11, arg7, arg4, 22, var14.field1238, true, var12, var10, var9);
				}

				arg5.method381(arg0, var15, arg1, var16, var17, arg6, var13);

				if (var14.field1228 && var14.field1222 && arg3 != null) {
					arg3.method288(arg1, arg6);
				}
			}
		} else if (arg2 == 10 || arg2 == 11) {
			QLYZESGB var18;
			if (var14.field1238 == -1 && var14.field1233 == null) {
				var18 = var14.method492(10, arg7, var9, var10, var11, var12, -1);
			} else {
				var18 = new SBGQSXPV(var11, arg7, arg4, 10, var14.field1238, true, var12, var10, var9);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg2 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg7 == 1 || arg7 == 3) {
					var20 = var14.field1240;
					var21 = var14.field1227;
				} else {
					var20 = var14.field1227;
					var21 = var14.field1240;
				}

				if (arg5.method385(arg0, arg1, var13, var18, var19, var15, var16, arg6, var21, var20) && var14.field1223) {
					RMLAXPMV var22;
					if (var18 instanceof RMLAXPMV) {
						var22 = (RMLAXPMV) var18;
					} else {
						var22 = var14.method492(10, arg7, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field1162 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field1392[arg0][arg6 + var23][arg1 + var24]) {
									field1392[arg0][arg6 + var23][arg1 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field1228 && arg3 != null) {
				arg3.method287(arg1, var14.field1249, var14.field1227, var14.field1240, arg7, arg6);
			}
		} else if (arg2 >= 12) {
			QLYZESGB var26;
			if (var14.field1238 == -1 && var14.field1233 == null) {
				var26 = var14.method492(arg2, arg7, var9, var10, var11, var12, -1);
			} else {
				var26 = new SBGQSXPV(var11, arg7, arg4, arg2, var14.field1238, true, var12, var10, var9);
			}

			arg5.method385(arg0, arg1, var13, var26, 0, var15, var16, arg6, 1, 1);

			if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg0 > 0) {
				field1390[arg0][arg6][arg1] |= 0x924;
			}

			if (var14.field1228 && arg3 != null) {
				arg3.method287(arg1, var14.field1249, var14.field1227, var14.field1240, arg7, arg6);
			}
		} else if (arg2 == 0) {
			QLYZESGB var27;
			if (var14.field1238 == -1 && var14.field1233 == null) {
				var27 = var14.method492(0, arg7, var9, var10, var11, var12, -1);
			} else {
				var27 = new SBGQSXPV(var11, arg7, arg4, 0, var14.field1238, true, var12, var10, var9);
			}

			arg5.method383(arg0, field1391[arg7], var15, arg1, var27, 0, var16, arg6, var13, null);

			if (arg7 == 0) {
				if (var14.field1223) {
					field1392[arg0][arg6][arg1] = 50;
					field1392[arg0][arg6][arg1 + 1] = 50;
				}

				if (var14.field1216) {
					field1390[arg0][arg6][arg1] |= 0x249;
				}
			} else if (arg7 == 1) {
				if (var14.field1223) {
					field1392[arg0][arg6][arg1 + 1] = 50;
					field1392[arg0][arg6 + 1][arg1 + 1] = 50;
				}

				if (var14.field1216) {
					field1390[arg0][arg6][arg1 + 1] |= 0x492;
				}
			} else if (arg7 == 2) {
				if (var14.field1223) {
					field1392[arg0][arg6 + 1][arg1] = 50;
					field1392[arg0][arg6 + 1][arg1 + 1] = 50;
				}

				if (var14.field1216) {
					field1390[arg0][arg6 + 1][arg1] |= 0x249;
				}
			} else if (arg7 == 3) {
				if (var14.field1223) {
					field1392[arg0][arg6][arg1] = 50;
					field1392[arg0][arg6 + 1][arg1] = 50;
				}

				if (var14.field1216) {
					field1390[arg0][arg6][arg1] |= 0x492;
				}
			}

			if (var14.field1228 && arg3 != null) {
				arg3.method286(arg7, arg1, arg2, arg6, var14.field1249);
			}

			if (var14.field1239 != 16) {
				arg5.method391(arg0, arg6, var14.field1239, arg1);
			}
		} else if (arg2 == 1) {
			QLYZESGB var28;
			if (var14.field1238 == -1 && var14.field1233 == null) {
				var28 = var14.method492(1, arg7, var9, var10, var11, var12, -1);
			} else {
				var28 = new SBGQSXPV(var11, arg7, arg4, 1, var14.field1238, true, var12, var10, var9);
			}

			arg5.method383(arg0, field1388[arg7], var15, arg1, var28, 0, var16, arg6, var13, null);

			if (var14.field1223) {
				if (arg7 == 0) {
					field1392[arg0][arg6][arg1 + 1] = 50;
				} else if (arg7 == 1) {
					field1392[arg0][arg6 + 1][arg1 + 1] = 50;
				} else if (arg7 == 2) {
					field1392[arg0][arg6 + 1][arg1] = 50;
				} else if (arg7 == 3) {
					field1392[arg0][arg6][arg1] = 50;
				}
			}

			if (var14.field1228 && arg3 != null) {
				arg3.method286(arg7, arg1, arg2, arg6, var14.field1249);
			}
		} else if (arg2 == 2) {
			int var29 = arg7 + 1 & 0x3;
			QLYZESGB var30;
			QLYZESGB var31;
			if (var14.field1238 == -1 && var14.field1233 == null) {
				var30 = var14.method492(2, arg7 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method492(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new SBGQSXPV(var11, arg7 + 4, arg4, 2, var14.field1238, true, var12, var10, var9);
				var31 = new SBGQSXPV(var11, var29, arg4, 2, var14.field1238, true, var12, var10, var9);
			}

			arg5.method383(arg0, field1391[arg7], var15, arg1, var30, field1391[var29], var16, arg6, var13, var31);

			if (var14.field1216) {
				if (arg7 == 0) {
					field1390[arg0][arg6][arg1] |= 0x249;
					field1390[arg0][arg6][arg1 + 1] |= 0x492;
				} else if (arg7 == 1) {
					field1390[arg0][arg6][arg1 + 1] |= 0x492;
					field1390[arg0][arg6 + 1][arg1] |= 0x249;
				} else if (arg7 == 2) {
					field1390[arg0][arg6 + 1][arg1] |= 0x249;
					field1390[arg0][arg6][arg1] |= 0x492;
				} else if (arg7 == 3) {
					field1390[arg0][arg6][arg1] |= 0x492;
					field1390[arg0][arg6][arg1] |= 0x249;
				}
			}

			if (var14.field1228 && arg3 != null) {
				arg3.method286(arg7, arg1, arg2, arg6, var14.field1249);
			}

			if (var14.field1239 != 16) {
				arg5.method391(arg0, arg6, var14.field1239, arg1);
			}
		} else if (arg2 == 3) {
			QLYZESGB var32;
			if (var14.field1238 == -1 && var14.field1233 == null) {
				var32 = var14.method492(3, arg7, var9, var10, var11, var12, -1);
			} else {
				var32 = new SBGQSXPV(var11, arg7, arg4, 3, var14.field1238, true, var12, var10, var9);
			}

			arg5.method383(arg0, field1388[arg7], var15, arg1, var32, 0, var16, arg6, var13, null);

			if (var14.field1223) {
				if (arg7 == 0) {
					field1392[arg0][arg6][arg1 + 1] = 50;
				} else if (arg7 == 1) {
					field1392[arg0][arg6 + 1][arg1 + 1] = 50;
				} else if (arg7 == 2) {
					field1392[arg0][arg6 + 1][arg1] = 50;
				} else if (arg7 == 3) {
					field1392[arg0][arg6][arg1] = 50;
				}
			}

			if (var14.field1228 && arg3 != null) {
				arg3.method286(arg7, arg1, arg2, arg6, var14.field1249);
			}
		} else if (arg2 == 9) {
			QLYZESGB var33;
			if (var14.field1238 == -1 && var14.field1233 == null) {
				var33 = var14.method492(arg2, arg7, var9, var10, var11, var12, -1);
			} else {
				var33 = new SBGQSXPV(var11, arg7, arg4, arg2, var14.field1238, true, var12, var10, var9);
			}

			arg5.method385(arg0, arg1, var13, var33, 0, var15, var16, arg6, 1, 1);

			if (var14.field1228 && arg3 != null) {
				arg3.method287(arg1, var14.field1249, var14.field1227, var14.field1240, arg7, arg6);
			}
		} else {
			if (var14.field1205) {
				if (arg7 == 1) {
					int var34 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var9;
					var9 = var34;
				} else if (arg7 == 2) {
					int var35 = var12;
					var12 = var10;
					var10 = var35;
					int var36 = var11;
					var11 = var9;
					var9 = var36;
				} else if (arg7 == 3) {
					int var37 = var12;
					var12 = var9;
					var9 = var10;
					var10 = var11;
					var11 = var37;
				}
			}

			if (arg2 == 4) {
				QLYZESGB var38;
				if (var14.field1238 == -1 && var14.field1233 == null) {
					var38 = var14.method492(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new SBGQSXPV(var11, 0, arg4, 4, var14.field1238, true, var12, var10, var9);
				}

				arg5.method384(0, var13, var15, arg0, var38, arg7 * 512, 0, arg6, arg1, field1391[arg7], var16);
			} else if (arg2 == 5) {
				int var39 = 16;
				int var40 = arg5.method401(arg0, arg6, arg1);
				if (var40 > 0) {
					var39 = RUROEYEG.method494(var40 >> 14 & 0x7FFF).field1239;
				}

				QLYZESGB var41;
				if (var14.field1238 == -1 && var14.field1233 == null) {
					var41 = var14.method492(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new SBGQSXPV(var11, 0, arg4, 4, var14.field1238, true, var12, var10, var9);
				}

				arg5.method384(field1397[arg7] * var39, var13, var15, arg0, var41, arg7 * 512, field1393[arg7] * var39, arg6, arg1, field1391[arg7], var16);
			} else if (arg2 == 6) {
				QLYZESGB var42;
				if (var14.field1238 == -1 && var14.field1233 == null) {
					var42 = var14.method492(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new SBGQSXPV(var11, 0, arg4, 4, var14.field1238, true, var12, var10, var9);
				}

				arg5.method384(0, var13, var15, arg0, var42, arg7, 0, arg6, arg1, 256, var16);
			} else if (arg2 == 7) {
				QLYZESGB var43;
				if (var14.field1238 == -1 && var14.field1233 == null) {
					var43 = var14.method492(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new SBGQSXPV(var11, 0, arg4, 4, var14.field1238, true, var12, var10, var9);
				}

				arg5.method384(0, var13, var15, arg0, var43, arg7, 0, arg6, arg1, 512, var16);
			} else if (arg2 == 8) {
				QLYZESGB var44;
				if (var14.field1238 == -1 && var14.field1233 == null) {
					var44 = var14.method492(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new SBGQSXPV(var11, 0, arg4, 4, var14.field1238, true, var12, var10, var9);
				}

				arg5.method384(0, var13, var15, arg0, var44, arg7, 0, arg6, arg1, 768, var16);
			}
		}
	}

	@ObfuscatedName("WZFUDUYZ.a([LEOLCIJGV;IIII[BIIII)V")
	public final void method566(EOLCIJGV[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg3 + var10 > 0 && arg3 + var10 < 103 && arg4 + var11 > 0 && arg4 + var11 < 103) {
					arg0[arg6].field565[arg3 + var10][arg4 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		BSNPYLEV var12 = new BSNPYLEV(arg5);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg2 == var13 && var14 >= arg7 && var14 < arg7 + 8 && var15 >= arg1 && var15 < arg1 + 8) {
						method571(0, 0, arg3 + TXHUSZZJ.method519(arg8, var14 & 0x7, var15 & 0x7), arg4 + TXHUSZZJ.method520(var15 & 0x7, arg8, var14 & 0x7), arg6, var12, arg8);
					} else {
						method571(0, 0, -1, -1, 0, var12, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("WZFUDUYZ.a(Z[B[LEOLCIJGV;LPAJXYXWG;II)V")
	public final void method567(byte[] arg0, EOLCIJGV[] arg1, PAJXYXWG arg2, int arg3, int arg4) {
		BSNPYLEV var6 = new BSNPYLEV(arg0);
		int var7 = -1;
		while (true) {
			int var8 = var6.method61();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method61();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method47();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg3 + var12;
				int var18 = arg4 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field1407[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					EOLCIJGV var20 = null;
					if (var19 >= 0) {
						var20 = arg1[var19];
					}

					method565(var13, var18, var15, var20, var7, arg2, var17, var16);
				}
			}
		}
	}

	@ObfuscatedName("WZFUDUYZ.a(IBI[LEOLCIJGV;III[BIILPAJXYXWG;)V")
	public final void method568(int arg0, int arg1, EOLCIJGV[] arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, PAJXYXWG arg9) {
		BSNPYLEV var11 = new BSNPYLEV(arg6);
		int var12 = -1;
		while (true) {
			int var13 = var11.method61();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method61();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method47();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg3 == var18 && var17 >= arg5 && var17 < arg5 + 8 && var16 >= arg1 && var16 < arg1 + 8) {
					RUROEYEG var22 = RUROEYEG.method494(var12);
					int var23 = arg4 + TXHUSZZJ.method521(var21, var16 & 0x7, var22.field1240, var22.field1227, arg7, var17 & 0x7);
					int var24 = arg8 + TXHUSZZJ.method522(var22.field1227, arg7, var22.field1240, var17 & 0x7, var21, var16 & 0x7);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg0;
						if ((field1407[1][var23][var24] & 0x2) == 2) {
							var25 = arg0 - 1;
						}

						EOLCIJGV var26 = null;
						if (var25 >= 0) {
							var26 = arg2[var25];
						}

						method565(arg0, var24, var20, var26, var12, arg9, var23, arg7 + var21 & 0x3);
					}
				}
			}
		}
	}

	@ObfuscatedName("WZFUDUYZ.b(III)I")
	public static final int method569(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method578(var3, var5);
		int var8 = method578(var3 + 1, var5);
		int var9 = method578(var3, var5 + 1);
		int var10 = method578(var3 + 1, var5 + 1);
		int var11 = method580(var7, var8, var4, arg2);
		int var12 = method580(var9, var10, var4, arg2);
		return method580(var11, var12, var6, arg2);
	}

	@ObfuscatedName("WZFUDUYZ.a([[[IIILPAJXYXWG;ILEOLCIJGV;IIIII)V")
	public static final void method570(int[][][] arg0, int arg1, PAJXYXWG arg2, int arg3, EOLCIJGV arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		int var10 = arg0[arg5][arg6][arg7];
		int var11 = arg0[arg5][arg6 + 1][arg7];
		int var12 = arg0[arg5][arg6 + 1][arg7 + 1];
		int var13 = arg0[arg5][arg6][arg7 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		RUROEYEG var15 = RUROEYEG.method494(arg9);
		int var16 = (arg9 << 14) + (arg7 << 7) + arg6 + 0x40000000;
		if (!var15.field1222) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg1 << 6) + arg8);
		if (arg8 == 22) {
			QLYZESGB var18;
			if (var15.field1238 == -1 && var15.field1233 == null) {
				var18 = var15.method492(22, arg1, var10, var11, var12, var13, -1);
			} else {
				var18 = new SBGQSXPV(var12, arg1, arg9, 22, var15.field1238, true, var13, var11, var10);
			}

			arg2.method381(arg3, var16, arg7, var17, var18, arg6, var14);

			if (var15.field1228 && var15.field1222) {
				arg4.method288(arg7, arg6);
			}
		} else if (arg8 == 10 || arg8 == 11) {
			QLYZESGB var19;
			if (var15.field1238 == -1 && var15.field1233 == null) {
				var19 = var15.method492(10, arg1, var10, var11, var12, var13, -1);
			} else {
				var19 = new SBGQSXPV(var12, arg1, arg9, 10, var15.field1238, true, var13, var11, var10);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg8 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg1 == 1 || arg1 == 3) {
					var21 = var15.field1240;
					var22 = var15.field1227;
				} else {
					var21 = var15.field1227;
					var22 = var15.field1240;
				}

				arg2.method385(arg3, arg7, var14, var19, var20, var16, var17, arg6, var22, var21);
			}

			if (var15.field1228) {
				arg4.method287(arg7, var15.field1249, var15.field1227, var15.field1240, arg1, arg6);
			}
		} else if (arg8 >= 12) {
			QLYZESGB var23;
			if (var15.field1238 == -1 && var15.field1233 == null) {
				var23 = var15.method492(arg8, arg1, var10, var11, var12, var13, -1);
			} else {
				var23 = new SBGQSXPV(var12, arg1, arg9, arg8, var15.field1238, true, var13, var11, var10);
			}

			arg2.method385(arg3, arg7, var14, var23, 0, var16, var17, arg6, 1, 1);

			if (var15.field1228) {
				arg4.method287(arg7, var15.field1249, var15.field1227, var15.field1240, arg1, arg6);
			}
		} else if (arg8 == 0) {
			QLYZESGB var24;
			if (var15.field1238 == -1 && var15.field1233 == null) {
				var24 = var15.method492(0, arg1, var10, var11, var12, var13, -1);
			} else {
				var24 = new SBGQSXPV(var12, arg1, arg9, 0, var15.field1238, true, var13, var11, var10);
			}

			arg2.method383(arg3, field1391[arg1], var16, arg7, var24, 0, var17, arg6, var14, null);

			if (var15.field1228) {
				arg4.method286(arg1, arg7, arg8, arg6, var15.field1249);
			}
		} else if (arg8 == 1) {
			QLYZESGB var25;
			if (var15.field1238 == -1 && var15.field1233 == null) {
				var25 = var15.method492(1, arg1, var10, var11, var12, var13, -1);
			} else {
				var25 = new SBGQSXPV(var12, arg1, arg9, 1, var15.field1238, true, var13, var11, var10);
			}

			arg2.method383(arg3, field1388[arg1], var16, arg7, var25, 0, var17, arg6, var14, null);

			if (var15.field1228) {
				arg4.method286(arg1, arg7, arg8, arg6, var15.field1249);
			}
		} else if (arg8 == 2) {
			int var26 = arg1 + 1 & 0x3;
			QLYZESGB var27;
			QLYZESGB var28;
			if (var15.field1238 == -1 && var15.field1233 == null) {
				var27 = var15.method492(2, arg1 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method492(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new SBGQSXPV(var12, arg1 + 4, arg9, 2, var15.field1238, true, var13, var11, var10);
				var28 = new SBGQSXPV(var12, var26, arg9, 2, var15.field1238, true, var13, var11, var10);
			}

			arg2.method383(arg3, field1391[arg1], var16, arg7, var27, field1391[var26], var17, arg6, var14, var28);

			if (var15.field1228) {
				arg4.method286(arg1, arg7, arg8, arg6, var15.field1249);
			}
		} else if (arg8 == 3) {
			QLYZESGB var29;
			if (var15.field1238 == -1 && var15.field1233 == null) {
				var29 = var15.method492(3, arg1, var10, var11, var12, var13, -1);
			} else {
				var29 = new SBGQSXPV(var12, arg1, arg9, 3, var15.field1238, true, var13, var11, var10);
			}

			arg2.method383(arg3, field1388[arg1], var16, arg7, var29, 0, var17, arg6, var14, null);

			if (var15.field1228) {
				arg4.method286(arg1, arg7, arg8, arg6, var15.field1249);
			}
		} else if (arg8 == 9) {
			QLYZESGB var30;
			if (var15.field1238 == -1 && var15.field1233 == null) {
				var30 = var15.method492(arg8, arg1, var10, var11, var12, var13, -1);
			} else {
				var30 = new SBGQSXPV(var12, arg1, arg9, arg8, var15.field1238, true, var13, var11, var10);
			}

			arg2.method385(arg3, arg7, var14, var30, 0, var16, var17, arg6, 1, 1);

			if (var15.field1228) {
				arg4.method287(arg7, var15.field1249, var15.field1227, var15.field1240, arg1, arg6);
			}
		} else {
			if (var15.field1205) {
				if (arg1 == 1) {
					int var31 = var13;
					var13 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var31;
				} else if (arg1 == 2) {
					int var32 = var13;
					var13 = var11;
					var11 = var32;
					int var33 = var12;
					var12 = var10;
					var10 = var33;
				} else if (arg1 == 3) {
					int var34 = var13;
					var13 = var10;
					var10 = var11;
					var11 = var12;
					var12 = var34;
				}
			}

			if (arg8 == 4) {
				QLYZESGB var35;
				if (var15.field1238 == -1 && var15.field1233 == null) {
					var35 = var15.method492(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new SBGQSXPV(var12, 0, arg9, 4, var15.field1238, true, var13, var11, var10);
				}

				arg2.method384(0, var14, var16, arg3, var35, arg1 * 512, 0, arg6, arg7, field1391[arg1], var17);
			} else if (arg8 == 5) {
				int var36 = 16;
				int var37 = arg2.method401(arg3, arg6, arg7);
				if (var37 > 0) {
					var36 = RUROEYEG.method494(var37 >> 14 & 0x7FFF).field1239;
				}

				QLYZESGB var38;
				if (var15.field1238 == -1 && var15.field1233 == null) {
					var38 = var15.method492(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new SBGQSXPV(var12, 0, arg9, 4, var15.field1238, true, var13, var11, var10);
				}

				arg2.method384(field1397[arg1] * var36, var14, var16, arg3, var38, arg1 * 512, field1393[arg1] * var36, arg6, arg7, field1391[arg1], var17);
			} else if (arg8 == 6) {
				QLYZESGB var39;
				if (var15.field1238 == -1 && var15.field1233 == null) {
					var39 = var15.method492(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new SBGQSXPV(var12, 0, arg9, 4, var15.field1238, true, var13, var11, var10);
				}

				arg2.method384(0, var14, var16, arg3, var39, arg1, 0, arg6, arg7, 256, var17);
			} else if (arg8 == 7) {
				QLYZESGB var40;
				if (var15.field1238 == -1 && var15.field1233 == null) {
					var40 = var15.method492(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new SBGQSXPV(var12, 0, arg9, 4, var15.field1238, true, var13, var11, var10);
				}

				arg2.method384(0, var14, var16, arg3, var40, arg1, 0, arg6, arg7, 512, var17);
			} else if (arg8 == 8) {
				QLYZESGB var41;
				if (var15.field1238 == -1 && var15.field1233 == null) {
					var41 = var15.method492(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new SBGQSXPV(var12, 0, arg9, 4, var15.field1238, true, var13, var11, var10);
				}

				arg2.method384(0, var14, var16, arg3, var41, arg1, 0, arg6, arg7, 768, var17);
			}
		}
	}

	@ObfuscatedName("WZFUDUYZ.a(IIIIIILBSNPYLEV;I)V")
	public final void method571(int arg0, int arg1, int arg2, int arg3, int arg4, BSNPYLEV arg5, int arg6) {
		if (arg2 >= 0 && arg2 < 104 && arg3 >= 0 && arg3 < 104) {
			field1407[arg4][arg2][arg3] = 0;
			while (true) {
				int var8 = arg5.method47();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg5.method47();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg4 == 0) {
						field1408[0][arg2][arg3] = -var9 * 8;
						return;
					}

					field1408[arg4][arg2][arg3] = field1408[arg4 - 1][arg2][arg3] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field1412[arg4][arg2][arg3] = arg5.method48();
					field1406[arg4][arg2][arg3] = (byte) ((var8 - 2) / 4);
					field1394[arg4][arg2][arg3] = (byte) (var8 + arg6 - 2 & 0x3);
				} else if (var8 <= 81) {
					field1407[arg4][arg2][arg3] = (byte) (var8 - 49);
				} else {
					field1403[arg4][arg2][arg3] = (byte) (var8 - 81);
				}
			}

			if (arg4 == 0) {
				field1408[0][arg2][arg3] = -method574(arg2 + arg1 + 932731, arg3 + 556238 + arg0) * 8;
			} else {
				field1408[arg4][arg2][arg3] = field1408[arg4 - 1][arg2][arg3] - 240;
			}
		} else {
			while (true) {
				int var10 = arg5.method47();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg5.method47();
					return;
				}

				if (var10 <= 49) {
					arg5.method47();
				}
			}
		}
	}

	@ObfuscatedName("WZFUDUYZ.a(II[BI)Z")
	public static final boolean method572(int arg0, byte[] arg1, int arg2) {
		boolean var3 = true;
		BSNPYLEV var4 = new BSNPYLEV(arg1);
		int var5 = -1;
		while (true) {
			int var6 = var4.method61();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method61();
					if (var9 == 0) {
						break;
					}

					var4.method47();
				} else {
					int var10 = var4.method61();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method47() >> 2;
					int var14 = arg2 + var12;
					int var15 = arg0 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						RUROEYEG var16 = RUROEYEG.method494(var5);
						if (var13 != 22 || !field1405 || var16.field1222 || var16.field1244) {
							var3 &= var16.method499();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("WZFUDUYZ.a(II[LEOLCIJGV;I[BII)V")
	public final void method573(int arg0, EOLCIJGV[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg4 + var8 > 0 && arg4 + var8 < 103 && arg5 + var9 > 0 && arg5 + var9 < 103) {
						arg1[var7].field565[arg4 + var8][arg5 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		BSNPYLEV var10 = new BSNPYLEV(arg3);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method571(arg2, arg0, arg4 + var12, arg5 + var13, var11, var10, 0);
				}
			}
		}
	}

	@ObfuscatedName("WZFUDUYZ.b(II)I")
	public static final int method574(int arg0, int arg1) {
		int var2 = method569(arg0 + 45365, arg1 + 91923, 4) + (method569(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method569(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("WZFUDUYZ.c(II)I")
	public static final int method575(int arg0, int arg1) {
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

	@ObfuscatedName("WZFUDUYZ.a(IIBI)V")
	public final void method576(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 8; var4++) {
			for (int var5 = 0; var5 < 8; var5++) {
				field1408[arg2][arg0 + var4][arg1 + var5] = 0;
			}
		}

		if (arg0 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				field1408[arg2][arg0][arg1 + var6] = field1408[arg2][arg0 - 1][arg1 + var6];
			}
		}

		if (arg1 > 0) {
			for (int var7 = 1; var7 < 8; var7++) {
				field1408[arg2][arg0 + var7][arg1] = field1408[arg2][arg0 + var7][arg1 - 1];
			}
		}

		if (arg0 > 0 && field1408[arg2][arg0 - 1][arg1] != 0) {
			field1408[arg2][arg0][arg1] = field1408[arg2][arg0 - 1][arg1];
		} else if (arg1 > 0 && field1408[arg2][arg0][arg1 - 1] != 0) {
			field1408[arg2][arg0][arg1] = field1408[arg2][arg0][arg1 - 1];
		} else if (arg0 > 0 && arg1 > 0 && field1408[arg2][arg0 - 1][arg1 - 1] != 0) {
			field1408[arg2][arg0][arg1] = field1408[arg2][arg0 - 1][arg1 - 1];
		}
	}

	@ObfuscatedName("WZFUDUYZ.a(IIIII)V")
	public final void method577(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg2; var5 <= arg0 + arg2; var5++) {
			for (int var6 = arg1; var6 <= arg1 + arg3; var6++) {
				if (var6 >= 0 && var6 < field1410 && var5 >= 0 && var5 < field1411) {
					field1392[0][var6][var5] = 127;

					if (arg1 == var6 && var6 > 0) {
						field1408[0][var6][var5] = field1408[0][var6 - 1][var5];
					}

					if (arg1 + arg3 == var6 && var6 < field1410 - 1) {
						field1408[0][var6][var5] = field1408[0][var6 + 1][var5];
					}

					if (arg2 == var5 && var5 > 0) {
						field1408[0][var6][var5] = field1408[0][var6][var5 - 1];
					}

					if (arg0 + arg2 == var5 && var5 < field1411 - 1) {
						field1408[0][var6][var5] = field1408[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("WZFUDUYZ.d(II)I")
	public static final int method578(int arg0, int arg1) {
		int var2 = method562(arg0 - 1, arg1 - 1) + method562(arg0 + 1, arg1 - 1) + method562(arg0 - 1, arg1 + 1) + method562(arg0 + 1, arg1 + 1);
		int var3 = method562(arg0 - 1, arg1) + method562(arg0 + 1, arg1) + method562(arg0, arg1 - 1) + method562(arg0, arg1 + 1);
		int var4 = method562(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("WZFUDUYZ.e(II)I")
	public final int method579(int arg0, int arg1) {
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

	public WZFUDUYZ(int arg0, byte[][][] arg1, int arg2, int[][][] arg3) {
		field1409 = 99;
		field1410 = arg2;
		field1411 = arg0;
		field1408 = arg3;
		field1407 = arg1;
		field1403 = new byte[4][field1410][field1411];
		field1412 = new byte[4][field1410][field1411];
		field1406 = new byte[4][field1410][field1411];
		field1394 = new byte[4][field1410][field1411];
		field1390 = new int[4][field1410 + 1][field1411 + 1];
		field1392 = new byte[4][field1410 + 1][field1411 + 1];
		field1389 = new int[field1410 + 1][field1411 + 1];
		field1398 = new int[field1411];
		field1399 = new int[field1411];
		field1400 = new int[field1411];
		field1401 = new int[field1411];
		field1402 = new int[field1411];
	}

	@ObfuscatedName("WZFUDUYZ.a(IIII)I")
	public static final int method580(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - IWBEAICJ.field740[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("WZFUDUYZ.c(III)Z")
	public static final boolean method581(int arg0, int arg1) {
		RUROEYEG var2 = RUROEYEG.method494(arg0);

		if (arg1 == 11) {
			arg1 = 10;
		}

		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}

		return var2.method501(arg1);
	}
}
