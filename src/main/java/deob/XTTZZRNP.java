package deob;

@ObfuscatedName("XTTZZRNP")
public final class XTTZZRNP {

	@ObfuscatedName("XTTZZRNP.t")
	public int field1440;

	@ObfuscatedName("XTTZZRNP.u")
	public int field1441;

	@ObfuscatedName("XTTZZRNP.j")
	public int[][][] field1431;

	@ObfuscatedName("XTTZZRNP.c")
	public byte[][][] field1424;

	@ObfuscatedName("XTTZZRNP.b")
	public byte[][][] field1423;

	@ObfuscatedName("XTTZZRNP.B")
	public byte[][][] field1446;

	@ObfuscatedName("XTTZZRNP.a")
	public byte[][][] field1422;

	@ObfuscatedName("XTTZZRNP.A")
	public byte[][][] field1445;

	@ObfuscatedName("XTTZZRNP.k")
	public int[][][] field1432;

	@ObfuscatedName("XTTZZRNP.x")
	public byte[][][] field1443;

	@ObfuscatedName("XTTZZRNP.f")
	public int[][] field1427;

	@ObfuscatedName("XTTZZRNP.n")
	public int[] field1434;

	@ObfuscatedName("XTTZZRNP.o")
	public int[] field1435;

	@ObfuscatedName("XTTZZRNP.p")
	public int[] field1436;

	@ObfuscatedName("XTTZZRNP.q")
	public int[] field1437;

	@ObfuscatedName("XTTZZRNP.r")
	public int[] field1438;

	@ObfuscatedName("XTTZZRNP.e")
	public static boolean field1426 = true;

	@ObfuscatedName("XTTZZRNP.g")
	public static final int[] field1428 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("XTTZZRNP.h")
	public static final int[] field1429 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("XTTZZRNP.m")
	public static final int[] field1433 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("XTTZZRNP.s")
	public static int field1439 = 99;

	@ObfuscatedName("XTTZZRNP.w")
	public static final int[] field1442 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("XTTZZRNP.d")
	public static int field1425 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("XTTZZRNP.y")
	public static int field1444 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("XTTZZRNP.i")
	public static int field1430;

	@ObfuscatedName("XTTZZRNP.a(IIIB)I")
	public int method562(int arg0, int arg1, int arg2) {
		if ((field1424[arg2][arg0][arg1] & 0x8) != 0) {
			return 0;
		}

		if (arg2 > 0 && (field1424[1][arg0][arg1] & 0x2) != 0) {
			return arg2 - 1;
		}

		return arg2;
	}

	@ObfuscatedName("XTTZZRNP.a(IIIII)V")
	public final void method563(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg0; var5 <= arg0 + arg1; var5++) {
			for (int var6 = arg2; var6 <= arg2 + arg3; var6++) {
				if (var6 >= 0 && var6 < field1440 && var5 >= 0 && var5 < field1441) {
					field1443[0][var6][var5] = 127;

					if (arg2 == var6 && var6 > 0) {
						field1431[0][var6][var5] = field1431[0][var6 - 1][var5];
					}

					if (arg2 + arg3 == var6 && var6 < field1440 - 1) {
						field1431[0][var6][var5] = field1431[0][var6 + 1][var5];
					}

					if (arg0 == var5 && var5 > 0) {
						field1431[0][var6][var5] = field1431[0][var6][var5 - 1];
					}

					if (arg0 + arg1 == var5 && var5 < field1441 - 1) {
						field1431[0][var6][var5] = field1431[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("XTTZZRNP.a(I[BZLHFSXIPFN;[LEKHWFCYP;I)V")
	public final void method564(int arg0, byte[] arg1, HFSXIPFN arg2, EKHWFCYP[] arg3, int arg4) {
		MNKDCXXG var6 = new MNKDCXXG(arg1);
		int var7 = -1;
		while (true) {
			int var8 = var6.method400();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method400();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method386();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg4 + var12;
				int var18 = arg0 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field1424[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					EKHWFCYP var20 = null;
					if (var19 >= 0) {
						var20 = arg3[var19];
					}

					method569(var7, var15, var18, var20, var17, var16, arg2, var13);
				}
			}
		}
	}

	@ObfuscatedName("XTTZZRNP.a(II[B[LEKHWFCYP;III)V")
	public final void method565(int arg0, int arg1, byte[] arg2, EKHWFCYP[] arg3, int arg4, int arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg0 + var8 > 0 && arg0 + var8 < 103 && arg5 + var9 > 0 && arg5 + var9 < 103) {
						arg3[var7].field572[arg0 + var8][arg5 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		MNKDCXXG var10 = new MNKDCXXG(arg2);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method566(var11, arg1, arg5 + var13, 0, arg4, var10, arg0 + var12);
				}
			}
		}
	}

	@ObfuscatedName("XTTZZRNP.a(IIZIIILMNKDCXXG;I)V")
	public final void method566(int arg0, int arg1, int arg2, int arg3, int arg4, MNKDCXXG arg5, int arg6) {
		if (arg6 >= 0 && arg6 < 104 && arg2 >= 0 && arg2 < 104) {
			field1424[arg0][arg6][arg2] = 0;
			while (true) {
				int var8 = arg5.method386();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg5.method386();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg0 == 0) {
						field1431[0][arg6][arg2] = -var9 * 8;
						return;
					}

					field1431[arg0][arg6][arg2] = field1431[arg0 - 1][arg6][arg2] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field1446[arg0][arg6][arg2] = arg5.method387();
					field1422[arg0][arg6][arg2] = (byte) ((var8 - 2) / 4);
					field1445[arg0][arg6][arg2] = (byte) (var8 + arg3 - 2 & 0x3);
				} else if (var8 <= 81) {
					field1424[arg0][arg6][arg2] = (byte) (var8 - 49);
				} else {
					field1423[arg0][arg6][arg2] = (byte) (var8 - 81);
				}
			}

			if (arg0 == 0) {
				field1431[0][arg6][arg2] = -method583(arg6 + arg1 + 932731, arg2 + 556238 + arg4) * 8;
			} else {
				field1431[arg0][arg6][arg2] = field1431[arg0 - 1][arg6][arg2] - 240;
			}
		} else {
			while (true) {
				int var10 = arg5.method386();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg5.method386();
					return;
				}

				if (var10 <= 49) {
					arg5.method386();
				}
			}
		}
	}

	@ObfuscatedName("XTTZZRNP.a(LHFSXIPFN;I[LEKHWFCYP;)V")
	public final void method567(HFSXIPFN arg0, EKHWFCYP[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field1424[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field1424[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method194(var5, var4);
						}
					}
				}
			}
		}

		field1425 += (int) (Math.random() * 5.0D) - 2;
		if (field1425 < -8) {
			field1425 = -8;
		}

		if (field1425 > 8) {
			field1425 = 8;
		}

		field1444 += (int) (Math.random() * 5.0D) - 2;
		if (field1444 < -16) {
			field1444 = -16;
		}

		if (field1444 > 16) {
			field1444 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field1443[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field1441 - 1; var16++) {
				for (int var17 = 1; var17 < field1440 - 1; var17++) {
					int var18 = field1431[var7][var17 + 1][var16] - field1431[var7][var17 - 1][var16];
					int var19 = field1431[var7][var17][var16 + 1] - field1431[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field1427[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field1441; var26++) {
				field1434[var26] = 0;
				field1435[var26] = 0;
				field1436[var26] = 0;
				field1437[var26] = 0;
				field1438[var26] = 0;
			}

			for (int var27 = -5; var27 < field1440 + 5; var27++) {
				for (int var28 = 0; var28 < field1441; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field1440) {
						int var30 = field1423[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							EIBTXPJE var31 = EIBTXPJE.field556[var30 - 1];
							field1434[var28] += var31.field565;
							field1435[var28] += var31.field563;
							field1436[var28] += var31.field564;
							field1437[var28] += var31.field566;
							field1438[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field1440) {
						int var33 = field1423[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							EIBTXPJE var34 = EIBTXPJE.field556[var33 - 1];
							field1434[var28] -= var34.field565;
							field1435[var28] -= var34.field563;
							field1436[var28] -= var34.field564;
							field1437[var28] -= var34.field566;
							field1438[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field1440 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field1441 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field1441) {
							var35 += field1434[var41];
							var36 += field1435[var41];
							var37 += field1436[var41];
							var38 += field1437[var41];
							var39 += field1438[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field1441) {
							var35 -= field1434[var42];
							var36 -= field1435[var42];
							var37 -= field1436[var42];
							var38 -= field1437[var42];
							var39 -= field1438[var42];
						}

						if (var40 >= 1 && var40 < field1441 - 1 && (!field1426 || (field1424[0][var27][var40] & 0x2) != 0 || (field1424[var7][var27][var40] & 0x10) == 0 && method562(var27, var40, var7) == field1430)) {
							if (var7 < field1439) {
								field1439 = var7;
							}

							int var43 = field1423[var7][var27][var40] & 0xFF;
							int var44 = field1446[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field1431[var7][var27][var40];
								int var46 = field1431[var7][var27 + 1][var40];
								int var47 = field1431[var7][var27 + 1][var40 + 1];
								int var48 = field1431[var7][var27][var40 + 1];
								int var49 = field1427[var27][var40];
								int var50 = field1427[var27 + 1][var40];
								int var51 = field1427[var27 + 1][var40 + 1];
								int var52 = field1427[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method580(var55, var56, var57);
									var55 = field1425 + var55 & 0xFF;
									var57 += field1444;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method580(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field1422[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !EIBTXPJE.field556[var44 - 1].field561) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field1432[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = UNBQQGBL.field1280[method571(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method221(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method571(var53, var49), method571(var53, var50), method571(var53, var51), method571(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field1422[var7][var27][var40] + 1;
									byte var61 = field1445[var7][var27][var40];
									EIBTXPJE var62 = EIBTXPJE.field556[var44 - 1];
									int var63 = var62.field559;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = UNBQQGBL.method503(var63);
										var65 = -1;
									} else if (var62.field558 == 0xFF00FF) {
										var65 = -2;
										var63 = -1;
										var64 = UNBQQGBL.field1280[method573(var62.field567, 96)];
									} else {
										var65 = method580(var62.field562, var62.field563, var62.field564);
										var64 = UNBQQGBL.field1280[method573(var62.field567, 96)];
									}

									arg0.method221(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method571(var53, var49), method571(var53, var50), method571(var53, var51), method571(var53, var52), method573(var65, var49), method573(var65, var50), method573(var65, var51), method573(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field1441 - 1; var66++) {
				for (int var67 = 1; var67 < field1440 - 1; var67++) {
					arg0.method220(var7, var67, var66, method562(var67, var66, var7));
				}
			}
		}

		arg0.method247(-10, -50, -50);

		for (int var68 = 0; var68 < field1440; var68++) {
			for (int var69 = 0; var69 < field1441; var69++) {
				if ((field1424[1][var68][var69] & 0x2) == 2) {
					arg0.method218(var69, var68);
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
				for (int var75 = 0; var75 <= field1441; var75++) {
					for (int var76 = 0; var76 <= field1440; var76++) {
						if ((field1432[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field1432[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field1441 && (field1432[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field1432[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field1432[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field1431[var80][var76][var77] - var84;
								int var86 = field1431[var79][var76][var77];
								HFSXIPFN.method219(1, var77 * 128, var86, var85, var78 * 128 + 128, var73, var76 * 128, var76 * 128);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field1432[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field1432[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field1432[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field1440 && (field1432[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field1432[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field1432[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field1431[var92][var89][var75] - var96;
								int var98 = field1431[var91][var89][var75];
								HFSXIPFN.method219(2, var75 * 128, var98, var97, var75 * 128, var73, var90 * 128 + 128, var89 * 128);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field1432[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field1432[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field1432[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field1441 && (field1432[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field1432[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field1440) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field1432[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field1431[var74][var101][var103];
								HFSXIPFN.method219(4, var103 * 128, var107, var107, var104 * 128 + 128, var73, var102 * 128 + 128, var101 * 128);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field1432[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("XTTZZRNP.a(IIIIIIILEKHWFCYP;LHFSXIPFN;[[[II)V")
	public static final void method568(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, EKHWFCYP arg6, HFSXIPFN arg7, int[][][] arg8, int arg9) {
		int var10 = arg8[arg1][arg0][arg9];
		int var11 = arg8[arg1][arg0 + 1][arg9];
		int var12 = arg8[arg1][arg0 + 1][arg9 + 1];
		int var13 = arg8[arg1][arg0][arg9 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		MIQWCPVG var15 = MIQWCPVG.method363(arg3);
		int var16 = (arg3 << 14) + (arg9 << 7) + arg0 + 0x40000000;
		if (!var15.field1015) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg4 << 6) + arg5);
		if (arg5 == 22) {
			GLSQHJVO var18;
			if (var15.field1047 == -1 && var15.field1008 == null) {
				var18 = var15.method365(22, arg4, var10, var11, var12, var13, -1);
			} else {
				var18 = new YSSTKYXW(22, var11, var15.field1047, arg4, var10, var12, arg3, var13, true);
			}

			arg7.method222(arg0, var14, var16, arg2, var17, var18, arg9);

			if (var15.field1042 && var15.field1015) {
				arg6.method194(arg9, arg0);
			}
		} else if (arg5 == 10 || arg5 == 11) {
			GLSQHJVO var19;
			if (var15.field1047 == -1 && var15.field1008 == null) {
				var19 = var15.method365(10, arg4, var10, var11, var12, var13, -1);
			} else {
				var19 = new YSSTKYXW(10, var11, var15.field1047, arg4, var10, var12, arg3, var13, true);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg5 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg4 == 1 || arg4 == 3) {
					var21 = var15.field1019;
					var22 = var15.field1017;
				} else {
					var21 = var15.field1017;
					var22 = var15.field1019;
				}

				arg7.method226(arg9, var21, var16, arg2, var17, var22, var19, var20, arg0, var14);
			}

			if (var15.field1042) {
				arg6.method193(arg0, var15.field1017, var15.field1019, arg9, var15.field1007, arg4);
			}
		} else if (arg5 >= 12) {
			GLSQHJVO var23;
			if (var15.field1047 == -1 && var15.field1008 == null) {
				var23 = var15.method365(arg5, arg4, var10, var11, var12, var13, -1);
			} else {
				var23 = new YSSTKYXW(arg5, var11, var15.field1047, arg4, var10, var12, arg3, var13, true);
			}

			arg7.method226(arg9, 1, var16, arg2, var17, 1, var23, 0, arg0, var14);

			if (var15.field1042) {
				arg6.method193(arg0, var15.field1017, var15.field1019, arg9, var15.field1007, arg4);
			}
		} else if (arg5 == 0) {
			GLSQHJVO var24;
			if (var15.field1047 == -1 && var15.field1008 == null) {
				var24 = var15.method365(0, arg4, var10, var11, var12, var13, -1);
			} else {
				var24 = new YSSTKYXW(0, var11, var15.field1047, arg4, var10, var12, arg3, var13, true);
			}

			arg7.method224(var17, var16, var14, field1428[arg4], 0, arg2, arg9, var24, arg0, null);

			if (var15.field1042) {
				arg6.method192(arg0, arg5, var15.field1007, arg9, arg4);
			}
		} else if (arg5 == 1) {
			GLSQHJVO var25;
			if (var15.field1047 == -1 && var15.field1008 == null) {
				var25 = var15.method365(1, arg4, var10, var11, var12, var13, -1);
			} else {
				var25 = new YSSTKYXW(1, var11, var15.field1047, arg4, var10, var12, arg3, var13, true);
			}

			arg7.method224(var17, var16, var14, field1433[arg4], 0, arg2, arg9, var25, arg0, null);

			if (var15.field1042) {
				arg6.method192(arg0, arg5, var15.field1007, arg9, arg4);
			}
		} else if (arg5 == 2) {
			int var26 = arg4 + 1 & 0x3;
			GLSQHJVO var27;
			GLSQHJVO var28;
			if (var15.field1047 == -1 && var15.field1008 == null) {
				var27 = var15.method365(2, arg4 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method365(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new YSSTKYXW(2, var11, var15.field1047, arg4 + 4, var10, var12, arg3, var13, true);
				var28 = new YSSTKYXW(2, var11, var15.field1047, var26, var10, var12, arg3, var13, true);
			}

			arg7.method224(var17, var16, var14, field1428[arg4], field1428[var26], arg2, arg9, var27, arg0, var28);

			if (var15.field1042) {
				arg6.method192(arg0, arg5, var15.field1007, arg9, arg4);
			}
		} else if (arg5 == 3) {
			GLSQHJVO var29;
			if (var15.field1047 == -1 && var15.field1008 == null) {
				var29 = var15.method365(3, arg4, var10, var11, var12, var13, -1);
			} else {
				var29 = new YSSTKYXW(3, var11, var15.field1047, arg4, var10, var12, arg3, var13, true);
			}

			arg7.method224(var17, var16, var14, field1433[arg4], 0, arg2, arg9, var29, arg0, null);

			if (var15.field1042) {
				arg6.method192(arg0, arg5, var15.field1007, arg9, arg4);
			}
		} else if (arg5 == 9) {
			GLSQHJVO var30;
			if (var15.field1047 == -1 && var15.field1008 == null) {
				var30 = var15.method365(arg5, arg4, var10, var11, var12, var13, -1);
			} else {
				var30 = new YSSTKYXW(arg5, var11, var15.field1047, arg4, var10, var12, arg3, var13, true);
			}

			arg7.method226(arg9, 1, var16, arg2, var17, 1, var30, 0, arg0, var14);

			if (var15.field1042) {
				arg6.method193(arg0, var15.field1017, var15.field1019, arg9, var15.field1007, arg4);
			}
		} else {
			if (var15.field1026) {
				if (arg4 == 1) {
					int var31 = var13;
					var13 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var31;
				} else if (arg4 == 2) {
					int var32 = var13;
					var13 = var11;
					var11 = var32;
					int var33 = var12;
					var12 = var10;
					var10 = var33;
				} else if (arg4 == 3) {
					int var34 = var13;
					var13 = var10;
					var10 = var11;
					var11 = var12;
					var12 = var34;
				}
			}

			if (arg5 == 4) {
				GLSQHJVO var35;
				if (var15.field1047 == -1 && var15.field1008 == null) {
					var35 = var15.method365(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new YSSTKYXW(4, var11, var15.field1047, 0, var10, var12, arg3, var13, true);
				}

				arg7.method225(arg4 * 512, var14, var16, var17, field1428[arg4], arg9, arg0, arg2, 0, 0, var35);
			} else if (arg5 == 5) {
				int var36 = 16;
				int var37 = arg7.method242(arg2, arg0, arg9);
				if (var37 > 0) {
					var36 = MIQWCPVG.method363(var37 >> 14 & 0x7FFF).field1029;
				}

				GLSQHJVO var38;
				if (var15.field1047 == -1 && var15.field1008 == null) {
					var38 = var15.method365(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new YSSTKYXW(4, var11, var15.field1047, 0, var10, var12, arg3, var13, true);
				}

				arg7.method225(arg4 * 512, var14, var16, var17, field1428[arg4], arg9, arg0, arg2, field1429[arg4] * var36, field1442[arg4] * var36, var38);
			} else if (arg5 == 6) {
				GLSQHJVO var39;
				if (var15.field1047 == -1 && var15.field1008 == null) {
					var39 = var15.method365(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new YSSTKYXW(4, var11, var15.field1047, 0, var10, var12, arg3, var13, true);
				}

				arg7.method225(arg4, var14, var16, var17, 256, arg9, arg0, arg2, 0, 0, var39);
			} else if (arg5 == 7) {
				GLSQHJVO var40;
				if (var15.field1047 == -1 && var15.field1008 == null) {
					var40 = var15.method365(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new YSSTKYXW(4, var11, var15.field1047, 0, var10, var12, arg3, var13, true);
				}

				arg7.method225(arg4, var14, var16, var17, 512, arg9, arg0, arg2, 0, 0, var40);
			} else if (arg5 == 8) {
				GLSQHJVO var41;
				if (var15.field1047 == -1 && var15.field1008 == null) {
					var41 = var15.method365(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new YSSTKYXW(4, var11, var15.field1047, 0, var10, var12, arg3, var13, true);
				}

				arg7.method225(arg4, var14, var16, var17, 768, arg9, arg0, arg2, 0, 0, var41);
			}
		}
	}

	@ObfuscatedName("XTTZZRNP.a(IIIILEKHWFCYP;IILHFSXIPFN;I)V")
	public final void method569(int arg0, int arg1, int arg2, EKHWFCYP arg3, int arg4, int arg5, HFSXIPFN arg6, int arg7) {
		if (field1426 && (field1424[0][arg4][arg2] & 0x2) == 0) {
			if ((field1424[arg7][arg4][arg2] & 0x10) != 0) {
				return;
			}

			if (method562(arg4, arg2, arg7) != field1430) {
				return;
			}
		}

		if (arg7 < field1439) {
			field1439 = arg7;
		}

		int var9 = field1431[arg7][arg4][arg2];
		int var10 = field1431[arg7][arg4 + 1][arg2];
		int var11 = field1431[arg7][arg4 + 1][arg2 + 1];
		int var12 = field1431[arg7][arg4][arg2 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		MIQWCPVG var14 = MIQWCPVG.method363(arg0);
		int var15 = (arg0 << 14) + (arg2 << 7) + arg4 + 0x40000000;
		if (!var14.field1015) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg5 << 6) + arg1);
		if (arg1 == 22) {
			if (!field1426 || var14.field1015 || var14.field1031) {
				GLSQHJVO var17;
				if (var14.field1047 == -1 && var14.field1008 == null) {
					var17 = var14.method365(22, arg5, var9, var10, var11, var12, -1);
				} else {
					var17 = new YSSTKYXW(22, var10, var14.field1047, arg5, var9, var11, arg0, var12, true);
				}

				arg6.method222(arg4, var13, var15, arg7, var16, var17, arg2);

				if (var14.field1042 && var14.field1015 && arg3 != null) {
					arg3.method194(arg2, arg4);
				}
			}
		} else if (arg1 == 10 || arg1 == 11) {
			GLSQHJVO var18;
			if (var14.field1047 == -1 && var14.field1008 == null) {
				var18 = var14.method365(10, arg5, var9, var10, var11, var12, -1);
			} else {
				var18 = new YSSTKYXW(10, var10, var14.field1047, arg5, var9, var11, arg0, var12, true);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg1 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg5 == 1 || arg5 == 3) {
					var20 = var14.field1019;
					var21 = var14.field1017;
				} else {
					var20 = var14.field1017;
					var21 = var14.field1019;
				}

				if (arg6.method226(arg2, var20, var15, arg7, var16, var21, var18, var19, arg4, var13) && var14.field1014) {
					IRLTEWJP var22;
					if (var18 instanceof IRLTEWJP) {
						var22 = (IRLTEWJP) var18;
					} else {
						var22 = var14.method365(10, arg5, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field902 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field1443[arg7][arg4 + var23][arg2 + var24]) {
									field1443[arg7][arg4 + var23][arg2 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field1042 && arg3 != null) {
				arg3.method193(arg4, var14.field1017, var14.field1019, arg2, var14.field1007, arg5);
			}
		} else if (arg1 >= 12) {
			GLSQHJVO var26;
			if (var14.field1047 == -1 && var14.field1008 == null) {
				var26 = var14.method365(arg1, arg5, var9, var10, var11, var12, -1);
			} else {
				var26 = new YSSTKYXW(arg1, var10, var14.field1047, arg5, var9, var11, arg0, var12, true);
			}

			arg6.method226(arg2, 1, var15, arg7, var16, 1, var26, 0, arg4, var13);

			if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg7 > 0) {
				field1432[arg7][arg4][arg2] |= 0x924;
			}

			if (var14.field1042 && arg3 != null) {
				arg3.method193(arg4, var14.field1017, var14.field1019, arg2, var14.field1007, arg5);
			}
		} else if (arg1 == 0) {
			GLSQHJVO var27;
			if (var14.field1047 == -1 && var14.field1008 == null) {
				var27 = var14.method365(0, arg5, var9, var10, var11, var12, -1);
			} else {
				var27 = new YSSTKYXW(0, var10, var14.field1047, arg5, var9, var11, arg0, var12, true);
			}

			arg6.method224(var16, var15, var13, field1428[arg5], 0, arg7, arg2, var27, arg4, null);

			if (arg5 == 0) {
				if (var14.field1014) {
					field1443[arg7][arg4][arg2] = 50;
					field1443[arg7][arg4][arg2 + 1] = 50;
				}

				if (var14.field1010) {
					field1432[arg7][arg4][arg2] |= 0x249;
				}
			} else if (arg5 == 1) {
				if (var14.field1014) {
					field1443[arg7][arg4][arg2 + 1] = 50;
					field1443[arg7][arg4 + 1][arg2 + 1] = 50;
				}

				if (var14.field1010) {
					field1432[arg7][arg4][arg2 + 1] |= 0x492;
				}
			} else if (arg5 == 2) {
				if (var14.field1014) {
					field1443[arg7][arg4 + 1][arg2] = 50;
					field1443[arg7][arg4 + 1][arg2 + 1] = 50;
				}

				if (var14.field1010) {
					field1432[arg7][arg4 + 1][arg2] |= 0x249;
				}
			} else if (arg5 == 3) {
				if (var14.field1014) {
					field1443[arg7][arg4][arg2] = 50;
					field1443[arg7][arg4 + 1][arg2] = 50;
				}

				if (var14.field1010) {
					field1432[arg7][arg4][arg2] |= 0x492;
				}
			}

			if (var14.field1042 && arg3 != null) {
				arg3.method192(arg4, arg1, var14.field1007, arg2, arg5);
			}

			if (var14.field1029 != 16) {
				arg6.method232(arg7, var14.field1029, arg4, arg2);
			}
		} else if (arg1 == 1) {
			GLSQHJVO var28;
			if (var14.field1047 == -1 && var14.field1008 == null) {
				var28 = var14.method365(1, arg5, var9, var10, var11, var12, -1);
			} else {
				var28 = new YSSTKYXW(1, var10, var14.field1047, arg5, var9, var11, arg0, var12, true);
			}

			arg6.method224(var16, var15, var13, field1433[arg5], 0, arg7, arg2, var28, arg4, null);

			if (var14.field1014) {
				if (arg5 == 0) {
					field1443[arg7][arg4][arg2 + 1] = 50;
				} else if (arg5 == 1) {
					field1443[arg7][arg4 + 1][arg2 + 1] = 50;
				} else if (arg5 == 2) {
					field1443[arg7][arg4 + 1][arg2] = 50;
				} else if (arg5 == 3) {
					field1443[arg7][arg4][arg2] = 50;
				}
			}

			if (var14.field1042 && arg3 != null) {
				arg3.method192(arg4, arg1, var14.field1007, arg2, arg5);
			}
		} else if (arg1 == 2) {
			int var29 = arg5 + 1 & 0x3;
			GLSQHJVO var30;
			GLSQHJVO var31;
			if (var14.field1047 == -1 && var14.field1008 == null) {
				var30 = var14.method365(2, arg5 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method365(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new YSSTKYXW(2, var10, var14.field1047, arg5 + 4, var9, var11, arg0, var12, true);
				var31 = new YSSTKYXW(2, var10, var14.field1047, var29, var9, var11, arg0, var12, true);
			}

			arg6.method224(var16, var15, var13, field1428[arg5], field1428[var29], arg7, arg2, var30, arg4, var31);

			if (var14.field1010) {
				if (arg5 == 0) {
					field1432[arg7][arg4][arg2] |= 0x249;
					field1432[arg7][arg4][arg2 + 1] |= 0x492;
				} else if (arg5 == 1) {
					field1432[arg7][arg4][arg2 + 1] |= 0x492;
					field1432[arg7][arg4 + 1][arg2] |= 0x249;
				} else if (arg5 == 2) {
					field1432[arg7][arg4 + 1][arg2] |= 0x249;
					field1432[arg7][arg4][arg2] |= 0x492;
				} else if (arg5 == 3) {
					field1432[arg7][arg4][arg2] |= 0x492;
					field1432[arg7][arg4][arg2] |= 0x249;
				}
			}

			if (var14.field1042 && arg3 != null) {
				arg3.method192(arg4, arg1, var14.field1007, arg2, arg5);
			}

			if (var14.field1029 != 16) {
				arg6.method232(arg7, var14.field1029, arg4, arg2);
			}
		} else if (arg1 == 3) {
			GLSQHJVO var32;
			if (var14.field1047 == -1 && var14.field1008 == null) {
				var32 = var14.method365(3, arg5, var9, var10, var11, var12, -1);
			} else {
				var32 = new YSSTKYXW(3, var10, var14.field1047, arg5, var9, var11, arg0, var12, true);
			}

			arg6.method224(var16, var15, var13, field1433[arg5], 0, arg7, arg2, var32, arg4, null);

			if (var14.field1014) {
				if (arg5 == 0) {
					field1443[arg7][arg4][arg2 + 1] = 50;
				} else if (arg5 == 1) {
					field1443[arg7][arg4 + 1][arg2 + 1] = 50;
				} else if (arg5 == 2) {
					field1443[arg7][arg4 + 1][arg2] = 50;
				} else if (arg5 == 3) {
					field1443[arg7][arg4][arg2] = 50;
				}
			}

			if (var14.field1042 && arg3 != null) {
				arg3.method192(arg4, arg1, var14.field1007, arg2, arg5);
			}
		} else if (arg1 == 9) {
			GLSQHJVO var33;
			if (var14.field1047 == -1 && var14.field1008 == null) {
				var33 = var14.method365(arg1, arg5, var9, var10, var11, var12, -1);
			} else {
				var33 = new YSSTKYXW(arg1, var10, var14.field1047, arg5, var9, var11, arg0, var12, true);
			}

			arg6.method226(arg2, 1, var15, arg7, var16, 1, var33, 0, arg4, var13);

			if (var14.field1042 && arg3 != null) {
				arg3.method193(arg4, var14.field1017, var14.field1019, arg2, var14.field1007, arg5);
			}
		} else {
			if (var14.field1026) {
				if (arg5 == 1) {
					int var34 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var9;
					var9 = var34;
				} else if (arg5 == 2) {
					int var35 = var12;
					var12 = var10;
					var10 = var35;
					int var36 = var11;
					var11 = var9;
					var9 = var36;
				} else if (arg5 == 3) {
					int var37 = var12;
					var12 = var9;
					var9 = var10;
					var10 = var11;
					var11 = var37;
				}
			}

			if (arg1 == 4) {
				GLSQHJVO var38;
				if (var14.field1047 == -1 && var14.field1008 == null) {
					var38 = var14.method365(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new YSSTKYXW(4, var10, var14.field1047, 0, var9, var11, arg0, var12, true);
				}

				arg6.method225(arg5 * 512, var13, var15, var16, field1428[arg5], arg2, arg4, arg7, 0, 0, var38);
			} else if (arg1 == 5) {
				int var39 = 16;
				int var40 = arg6.method242(arg7, arg4, arg2);
				if (var40 > 0) {
					var39 = MIQWCPVG.method363(var40 >> 14 & 0x7FFF).field1029;
				}

				GLSQHJVO var41;
				if (var14.field1047 == -1 && var14.field1008 == null) {
					var41 = var14.method365(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new YSSTKYXW(4, var10, var14.field1047, 0, var9, var11, arg0, var12, true);
				}

				arg6.method225(arg5 * 512, var13, var15, var16, field1428[arg5], arg2, arg4, arg7, field1429[arg5] * var39, field1442[arg5] * var39, var41);
			} else if (arg1 == 6) {
				GLSQHJVO var42;
				if (var14.field1047 == -1 && var14.field1008 == null) {
					var42 = var14.method365(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new YSSTKYXW(4, var10, var14.field1047, 0, var9, var11, arg0, var12, true);
				}

				arg6.method225(arg5, var13, var15, var16, 256, arg2, arg4, arg7, 0, 0, var42);
			} else if (arg1 == 7) {
				GLSQHJVO var43;
				if (var14.field1047 == -1 && var14.field1008 == null) {
					var43 = var14.method365(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new YSSTKYXW(4, var10, var14.field1047, 0, var9, var11, arg0, var12, true);
				}

				arg6.method225(arg5, var13, var15, var16, 512, arg2, arg4, arg7, 0, 0, var43);
			} else if (arg1 == 8) {
				GLSQHJVO var44;
				if (var14.field1047 == -1 && var14.field1008 == null) {
					var44 = var14.method365(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new YSSTKYXW(4, var10, var14.field1047, 0, var9, var11, arg0, var12, true);
				}

				arg6.method225(arg5, var13, var15, var16, 768, arg2, arg4, arg7, 0, 0, var44);
			}
		}
	}

	@ObfuscatedName("XTTZZRNP.a(I[BII)Z")
	public static final boolean method570(int arg0, byte[] arg1, int arg2) {
		boolean var3 = true;
		MNKDCXXG var4 = new MNKDCXXG(arg1);
		int var5 = -1;
		while (true) {
			int var6 = var4.method400();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method400();
					if (var9 == 0) {
						break;
					}

					var4.method386();
				} else {
					int var10 = var4.method400();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method386() >> 2;
					int var14 = arg2 + var12;
					int var15 = arg0 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						MIQWCPVG var16 = MIQWCPVG.method363(var5);
						if (var13 != 22 || !field1426 || var16.field1015 || var16.field1031) {
							var3 &= var16.method367();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("XTTZZRNP.a(II)I")
	public static final int method571(int arg0, int arg1) {
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

	@ObfuscatedName("XTTZZRNP.a(II[LEKHWFCYP;[BIIIIII)V")
	public final void method572(int arg0, int arg1, EKHWFCYP[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg7 + var10 > 0 && arg7 + var10 < 103 && arg1 + var11 > 0 && arg1 + var11 < 103) {
					arg2[arg0].field572[arg7 + var10][arg1 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		MNKDCXXG var12 = new MNKDCXXG(arg3);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg4 == var13 && var14 >= arg6 && var14 < arg6 + 8 && var15 >= arg5 && var15 < arg5 + 8) {
						method566(arg0, 0, arg1 + KFSVUSRG.method313(var15 & 0x7, arg8, var14 & 0x7), arg8, 0, var12, arg7 + KFSVUSRG.method312(var15 & 0x7, var14 & 0x7, arg8));
					} else {
						method566(0, 0, -1, 0, 0, var12, -1);
					}
				}
			}
		}
	}

	@ObfuscatedName("XTTZZRNP.b(II)I")
	public final int method573(int arg0, int arg1) {
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

	@ObfuscatedName("XTTZZRNP.a(III)Z")
	public static final boolean method574(int arg0, int arg1) {
		MIQWCPVG var2 = MIQWCPVG.method363(arg0);

		if (arg1 == 11) {
			arg1 = 10;
		}

		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}

		return var2.method372(arg1);
	}

	@ObfuscatedName("XTTZZRNP.b(III)I")
	public static final int method575(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method576(var3, var5);
		int var8 = method576(var3 + 1, var5);
		int var9 = method576(var3, var5 + 1);
		int var10 = method576(var3 + 1, var5 + 1);
		int var11 = method578(var7, var8, var4, arg2);
		int var12 = method578(var9, var10, var4, arg2);
		return method578(var11, var12, var6, arg2);
	}

	@ObfuscatedName("XTTZZRNP.c(II)I")
	public static final int method576(int arg0, int arg1) {
		int var2 = method581(arg0 - 1, arg1 - 1) + method581(arg0 + 1, arg1 - 1) + method581(arg0 - 1, arg1 + 1) + method581(arg0 + 1, arg1 + 1);
		int var3 = method581(arg0 - 1, arg1) + method581(arg0 + 1, arg1) + method581(arg0, arg1 - 1) + method581(arg0, arg1 + 1);
		int var4 = method581(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("XTTZZRNP.a(I[LEKHWFCYP;IIIII[BZLHFSXIPFN;I)V")
	public final void method577(int arg0, EKHWFCYP[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, HFSXIPFN arg8, int arg9) {
		MNKDCXXG var11 = new MNKDCXXG(arg7);
		int var12 = -1;
		while (true) {
			int var13 = var11.method400();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method400();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method386();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg5 == var18 && var17 >= arg3 && var17 < arg3 + 8 && var16 >= arg6 && var16 < arg6 + 8) {
					MIQWCPVG var22 = MIQWCPVG.method363(var12);
					int var23 = arg2 + KFSVUSRG.method314(var21, var17 & 0x7, var22.field1017, var16 & 0x7, arg9, var22.field1019);
					int var24 = arg0 + KFSVUSRG.method315(var16 & 0x7, var21, arg9, var22.field1019, var17 & 0x7, var22.field1017);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg4;
						if ((field1424[1][var23][var24] & 0x2) == 2) {
							var25 = arg4 - 1;
						}

						EKHWFCYP var26 = null;
						if (var25 >= 0) {
							var26 = arg1[var25];
						}

						method569(var12, var20, var24, var26, var23, arg9 + var21 & 0x3, arg8, arg4);
					}
				}
			}
		}
	}

	@ObfuscatedName("XTTZZRNP.a(IIII)I")
	public static final int method578(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - UNBQQGBL.field1269[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("XTTZZRNP.a(LMNKDCXXG;ILUWINSVPX;)V")
	public static final void method579(MNKDCXXG arg0, UWINSVPX arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method400();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			MIQWCPVG var4 = MIQWCPVG.method363(var2);
			var4.method366(arg1);

			while (true) {
				int var5 = arg0.method400();
				if (var5 == 0) {
					break;
				}

				arg0.method386();
			}
		}
	}

	public XTTZZRNP(int[][][] arg0, int arg1, byte[][][] arg2, int arg3) {
		field1439 = 99;
		field1440 = arg3;
		field1441 = arg1;
		field1431 = arg0;
		field1424 = arg2;
		field1423 = new byte[4][field1440][field1441];
		field1446 = new byte[4][field1440][field1441];
		field1422 = new byte[4][field1440][field1441];
		field1445 = new byte[4][field1440][field1441];
		field1432 = new int[4][field1440 + 1][field1441 + 1];
		field1443 = new byte[4][field1440 + 1][field1441 + 1];
		field1427 = new int[field1440 + 1][field1441 + 1];
		field1434 = new int[field1441];
		field1435 = new int[field1441];
		field1436 = new int[field1441];
		field1437 = new int[field1441];
		field1438 = new int[field1441];
	}

	@ObfuscatedName("XTTZZRNP.c(III)I")
	public final int method580(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("XTTZZRNP.d(II)I")
	public static final int method581(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("XTTZZRNP.b(IIII)V")
	public final void method582(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 8; var4++) {
			for (int var5 = 0; var5 < 8; var5++) {
				field1431[arg1][arg0 + var4][arg2 + var5] = 0;
			}
		}

		if (arg0 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				field1431[arg1][arg0][arg2 + var6] = field1431[arg1][arg0 - 1][arg2 + var6];
			}
		}

		if (arg2 > 0) {
			for (int var7 = 1; var7 < 8; var7++) {
				field1431[arg1][arg0 + var7][arg2] = field1431[arg1][arg0 + var7][arg2 - 1];
			}
		}

		if (arg0 > 0 && field1431[arg1][arg0 - 1][arg2] != 0) {
			field1431[arg1][arg0][arg2] = field1431[arg1][arg0 - 1][arg2];
		} else if (arg2 > 0 && field1431[arg1][arg0][arg2 - 1] != 0) {
			field1431[arg1][arg0][arg2] = field1431[arg1][arg0][arg2 - 1];
		} else if (arg0 > 0 && arg2 > 0 && field1431[arg1][arg0 - 1][arg2 - 1] != 0) {
			field1431[arg1][arg0][arg2] = field1431[arg1][arg0 - 1][arg2 - 1];
		}
	}

	@ObfuscatedName("XTTZZRNP.e(II)I")
	public static final int method583(int arg0, int arg1) {
		int var2 = method575(arg0 + 45365, arg1 + 91923, 4) + (method575(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method575(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}
}
