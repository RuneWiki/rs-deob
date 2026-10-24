package deob;

@ObfuscatedName("VZMNLGCR")
public final class VZMNLGCR {

	@ObfuscatedName("VZMNLGCR.u")
	public int field1372;

	@ObfuscatedName("VZMNLGCR.v")
	public int field1373;

	@ObfuscatedName("VZMNLGCR.w")
	public int[][][] field1374;

	@ObfuscatedName("VZMNLGCR.k")
	public byte[][][] field1365;

	@ObfuscatedName("VZMNLGCR.g")
	public byte[][][] field1363;

	@ObfuscatedName("VZMNLGCR.l")
	public byte[][][] field1366;

	@ObfuscatedName("VZMNLGCR.r")
	public byte[][][] field1369;

	@ObfuscatedName("VZMNLGCR.o")
	public byte[][][] field1368;

	@ObfuscatedName("VZMNLGCR.e")
	public int[][][] field1362;

	@ObfuscatedName("VZMNLGCR.b")
	public byte[][][] field1359;

	@ObfuscatedName("VZMNLGCR.n")
	public int[][] field1367;

	@ObfuscatedName("VZMNLGCR.y")
	public int[] field1376;

	@ObfuscatedName("VZMNLGCR.z")
	public int[] field1377;

	@ObfuscatedName("VZMNLGCR.A")
	public int[] field1378;

	@ObfuscatedName("VZMNLGCR.B")
	public int[] field1379;

	@ObfuscatedName("VZMNLGCR.C")
	public int[] field1380;

	@ObfuscatedName("VZMNLGCR.a")
	public static final int[] field1358 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("VZMNLGCR.h")
	public static final int[] field1364 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("VZMNLGCR.s")
	public static final int[] field1370 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("VZMNLGCR.t")
	public static int field1371 = 99;

	@ObfuscatedName("VZMNLGCR.x")
	public static final int[] field1375 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("VZMNLGCR.F")
	public static boolean field1381 = true;

	@ObfuscatedName("VZMNLGCR.c")
	public static int field1360 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("VZMNLGCR.G")
	public static int field1382 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("VZMNLGCR.d")
	public static int field1361;

	@ObfuscatedName("VZMNLGCR.a(II)I")
	public static final int method432(int arg0, int arg1) {
		int var2 = method435(arg0 + 45365, arg1 + 91923, 4) + (method435(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method435(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("VZMNLGCR.a(III[B)Z")
	public static final boolean method433(int arg0, int arg1, byte[] arg2) {
		boolean var3 = true;
		XGRGMPUQ var4 = new XGRGMPUQ(arg2);
		int var5 = -1;
		while (true) {
			int var6 = var4.method479();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method479();
					if (var9 == 0) {
						break;
					}

					var4.method465();
				} else {
					int var10 = var4.method479();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method465() >> 2;
					int var14 = arg0 + var12;
					int var15 = arg1 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						BMWIVHMF var16 = BMWIVHMF.method30(var5);
						if (var13 != 22 || !field1381 || var16.field91 || var16.field81) {
							var3 &= var16.method25();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("VZMNLGCR.a(IBII)I")
	public int method434(int arg0, int arg1, int arg2) {
		if ((field1365[arg0][arg1][arg2] & 0x8) != 0) {
			return 0;
		}

		if (arg0 > 0 && (field1365[1][arg1][arg2] & 0x2) != 0) {
			return arg0 - 1;
		}

		return arg0;
	}

	@ObfuscatedName("VZMNLGCR.a(III)I")
	public static final int method435(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method437(var3, var5);
		int var8 = method437(var3 + 1, var5);
		int var9 = method437(var3, var5 + 1);
		int var10 = method437(var3 + 1, var5 + 1);
		int var11 = method439(var7, var8, var4, arg2);
		int var12 = method439(var9, var10, var4, arg2);
		return method439(var11, var12, var6, arg2);
	}

	@ObfuscatedName("VZMNLGCR.a(LXGRGMPUQ;ZLLAQKYZGL;)V")
	public static final void method436(XGRGMPUQ arg0, LAQKYZGL arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method479();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			BMWIVHMF var4 = BMWIVHMF.method30(var2);
			var4.method32(arg1);

			while (true) {
				int var5 = arg0.method479();
				if (var5 == 0) {
					break;
				}

				arg0.method465();
			}
		}
	}

	@ObfuscatedName("VZMNLGCR.b(II)I")
	public static final int method437(int arg0, int arg1) {
		int var2 = method440(arg0 - 1, arg1 - 1) + method440(arg0 + 1, arg1 - 1) + method440(arg0 - 1, arg1 + 1) + method440(arg0 + 1, arg1 + 1);
		int var3 = method440(arg0 - 1, arg1) + method440(arg0 + 1, arg1) + method440(arg0, arg1 - 1) + method440(arg0, arg1 + 1);
		int var4 = method440(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("VZMNLGCR.c(II)I")
	public final int method438(int arg0, int arg1) {
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

	@ObfuscatedName("VZMNLGCR.a(IIII)I")
	public static final int method439(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - VWUXWWMW.field1199[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("VZMNLGCR.d(II)I")
	public static final int method440(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("VZMNLGCR.a([BI[LGQSCEHQI;ILYDQEOBYY;IIIIII)V")
	public final void method441(byte[] arg0, int arg1, GQSCEHQI[] arg2, int arg3, YDQEOBYY arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		XGRGMPUQ var11 = new XGRGMPUQ(arg0);
		int var12 = -1;
		while (true) {
			int var13 = var11.method479();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method479();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method465();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg6 == var18 && var17 >= arg7 && var17 < arg7 + 8 && var16 >= arg5 && var16 < arg5 + 8) {
					BMWIVHMF var22 = BMWIVHMF.method30(var12);
					int var23 = arg3 + EPLYBIIS.method205(var17 & 0x7, var22.field102, var21, var16 & 0x7, arg9, var22.field85);
					int var24 = arg1 + EPLYBIIS.method206(var22.field102, var17 & 0x7, var16 & 0x7, arg9, var22.field85, var21);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg8;
						if ((field1365[1][var23][var24] & 0x2) == 2) {
							var25 = arg8 - 1;
						}

						GQSCEHQI var26 = null;
						if (var25 >= 0) {
							var26 = arg2[var25];
						}

						method444(var26, var12, var24, arg9 + var21 & 0x3, arg4, var23, arg8, var20);
					}
				}
			}
		}
	}

	@ObfuscatedName("VZMNLGCR.a([LGQSCEHQI;IIBI[BI)V")
	public final void method442(GQSCEHQI[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg1 + var8 > 0 && arg1 + var8 < 103 && arg2 + var9 > 0 && arg2 + var9 < 103) {
						arg0[var7].field736[arg1 + var8][arg2 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		XGRGMPUQ var10 = new XGRGMPUQ(arg4);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method452(arg5, arg3, 0, var10, arg1 + var12, arg2 + var13, var11);
				}
			}
		}
	}

	@ObfuscatedName("VZMNLGCR.a([LGQSCEHQI;LYDQEOBYY;B)V")
	public final void method443(GQSCEHQI[] arg0, YDQEOBYY arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field1365[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field1365[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg0[var6].method216(var4, var5);
						}
					}
				}
			}
		}

		field1382 += (int) (Math.random() * 5.0D) - 2;
		if (field1382 < -8) {
			field1382 = -8;
		}

		if (field1382 > 8) {
			field1382 = 8;
		}

		field1360 += (int) (Math.random() * 5.0D) - 2;
		if (field1360 < -16) {
			field1360 = -16;
		}

		if (field1360 > 16) {
			field1360 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field1359[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field1373 - 1; var16++) {
				for (int var17 = 1; var17 < field1372 - 1; var17++) {
					int var18 = field1374[var7][var17 + 1][var16] - field1374[var7][var17 - 1][var16];
					int var19 = field1374[var7][var17][var16 + 1] - field1374[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field1367[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field1373; var26++) {
				field1376[var26] = 0;
				field1377[var26] = 0;
				field1378[var26] = 0;
				field1379[var26] = 0;
				field1380[var26] = 0;
			}

			for (int var27 = -5; var27 < field1372 + 5; var27++) {
				for (int var28 = 0; var28 < field1373; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field1372) {
						int var30 = field1363[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							NVLIPBUR var31 = NVLIPBUR.field1115[var30 - 1];
							field1376[var28] += var31.field1124;
							field1377[var28] += var31.field1122;
							field1378[var28] += var31.field1123;
							field1379[var28] += var31.field1125;
							field1380[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field1372) {
						int var33 = field1363[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							NVLIPBUR var34 = NVLIPBUR.field1115[var33 - 1];
							field1376[var28] -= var34.field1124;
							field1377[var28] -= var34.field1122;
							field1378[var28] -= var34.field1123;
							field1379[var28] -= var34.field1125;
							field1380[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field1372 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field1373 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field1373) {
							var35 += field1376[var41];
							var36 += field1377[var41];
							var37 += field1378[var41];
							var38 += field1379[var41];
							var39 += field1380[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field1373) {
							var35 -= field1376[var42];
							var36 -= field1377[var42];
							var37 -= field1378[var42];
							var38 -= field1379[var42];
							var39 -= field1380[var42];
						}

						if (var40 >= 1 && var40 < field1373 - 1 && (!field1381 || (field1365[0][var27][var40] & 0x2) != 0 || (field1365[var7][var27][var40] & 0x10) == 0 && method434(var7, var27, var40) == field1361)) {
							if (var7 < field1371) {
								field1371 = var7;
							}

							int var43 = field1363[var7][var27][var40] & 0xFF;
							int var44 = field1366[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field1374[var7][var27][var40];
								int var46 = field1374[var7][var27 + 1][var40];
								int var47 = field1374[var7][var27 + 1][var40 + 1];
								int var48 = field1374[var7][var27][var40 + 1];
								int var49 = field1367[var27][var40];
								int var50 = field1367[var27 + 1][var40];
								int var51 = field1367[var27 + 1][var40 + 1];
								int var52 = field1367[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method451(var55, var56, var57);
									var55 = field1382 + var55 & 0xFF;
									var57 += field1360;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method451(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field1369[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !NVLIPBUR.field1115[var44 - 1].field1120) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field1362[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = VWUXWWMW.field1210[method449(var54, 96)];
								}

								if (var44 == 0) {
									arg1.method507(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method449(var53, var49), method449(var53, var50), method449(var53, var51), method449(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field1369[var7][var27][var40] + 1;
									byte var61 = field1368[var7][var27][var40];
									NVLIPBUR var62 = NVLIPBUR.field1115[var44 - 1];
									int var63 = var62.field1118;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = VWUXWWMW.method382(var63);
										var65 = -1;
									} else if (var62.field1117 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method451(var62.field1121, var62.field1122, var62.field1123);
										var64 = VWUXWWMW.field1210[method438(var62.field1126, 96)];
									}

									arg1.method507(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method449(var53, var49), method449(var53, var50), method449(var53, var51), method449(var53, var52), method438(var65, var49), method438(var65, var50), method438(var65, var51), method438(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field1373 - 1; var66++) {
				for (int var67 = 1; var67 < field1372 - 1; var67++) {
					arg1.method506(var7, var67, var66, method434(var7, var67, var66));
				}
			}
		}

		arg1.method533(64, -10, -50, -50, 768);

		for (int var68 = 0; var68 < field1372; var68++) {
			for (int var69 = 0; var69 < field1373; var69++) {
				if ((field1365[1][var68][var69] & 0x2) == 2) {
					arg1.method504(var68, var69);
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
				for (int var75 = 0; var75 <= field1373; var75++) {
					for (int var76 = 0; var76 <= field1372; var76++) {
						if ((field1362[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field1362[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field1373 && (field1362[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field1362[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field1362[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field1374[var80][var76][var77] - var84;
								int var86 = field1374[var79][var76][var77];
								YDQEOBYY.method505(var86, var78 * 128 + 128, var77 * 128, var76 * 128, 1, var76 * 128, var73, var85);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field1362[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field1362[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field1362[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field1372 && (field1362[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field1362[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field1362[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field1374[var92][var89][var75] - var96;
								int var98 = field1374[var91][var89][var75];
								YDQEOBYY.method505(var98, var75 * 128, var75 * 128, var90 * 128 + 128, 2, var89 * 128, var73, var97);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field1362[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field1362[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field1362[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field1373 && (field1362[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field1362[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field1372) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field1362[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field1374[var74][var101][var103];
								YDQEOBYY.method505(var107, var104 * 128 + 128, var103 * 128, var102 * 128 + 128, 4, var101 * 128, var73, var107);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field1362[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("VZMNLGCR.a(LGQSCEHQI;IIIILYDQEOBYY;III)V")
	public final void method444(GQSCEHQI arg0, int arg1, int arg2, int arg3, YDQEOBYY arg4, int arg5, int arg6, int arg7) {
		if (field1381 && (field1365[0][arg5][arg2] & 0x2) == 0) {
			if ((field1365[arg6][arg5][arg2] & 0x10) != 0) {
				return;
			}

			if (method434(arg6, arg5, arg2) != field1361) {
				return;
			}
		}

		if (arg6 < field1371) {
			field1371 = arg6;
		}

		int var9 = field1374[arg6][arg5][arg2];
		int var10 = field1374[arg6][arg5 + 1][arg2];
		int var11 = field1374[arg6][arg5 + 1][arg2 + 1];
		int var12 = field1374[arg6][arg5][arg2 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		BMWIVHMF var14 = BMWIVHMF.method30(arg1);
		int var15 = (arg1 << 14) + (arg2 << 7) + arg5 + 0x40000000;
		if (!var14.field91) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg3 << 6) + arg7);
		if (arg7 == 22) {
			if (!field1381 || var14.field91 || var14.field81) {
				JEESRQGR var17;
				if (var14.field77 == -1 && var14.field78 == null) {
					var17 = var14.method27(22, arg3, var9, var10, var11, var12, -1);
				} else {
					var17 = new AZNRLUAT(var11, var9, arg1, var10, true, 22, arg3, var14.field77, var12);
				}

				arg4.method508(arg5, var17, var16, var13, arg6, arg2, var15);

				if (var14.field95 && var14.field91 && arg0 != null) {
					arg0.method216(arg5, arg2);
				}
			}
		} else if (arg7 == 10 || arg7 == 11) {
			JEESRQGR var18;
			if (var14.field77 == -1 && var14.field78 == null) {
				var18 = var14.method27(10, arg3, var9, var10, var11, var12, -1);
			} else {
				var18 = new AZNRLUAT(var11, var9, arg1, var10, true, 10, arg3, var14.field77, var12);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg7 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg3 == 1 || arg3 == 3) {
					var20 = var14.field102;
					var21 = var14.field85;
				} else {
					var20 = var14.field85;
					var21 = var14.field102;
				}

				if (arg4.method512(arg6, arg2, var16, var19, var18, var20, var13, var15, var21, arg5) && var14.field108) {
					VYUQHOMO var22;
					if (var18 instanceof VYUQHOMO) {
						var22 = (VYUQHOMO) var18;
					} else {
						var22 = var14.method27(10, arg3, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field1315 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field1359[arg6][arg5 + var23][arg2 + var24]) {
									field1359[arg6][arg5 + var23][arg2 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field95 && arg0 != null) {
				arg0.method215(var14.field85, arg5, arg2, var14.field102, arg3, var14.field101);
			}
		} else if (arg7 >= 12) {
			JEESRQGR var26;
			if (var14.field77 == -1 && var14.field78 == null) {
				var26 = var14.method27(arg7, arg3, var9, var10, var11, var12, -1);
			} else {
				var26 = new AZNRLUAT(var11, var9, arg1, var10, true, arg7, arg3, var14.field77, var12);
			}

			arg4.method512(arg6, arg2, var16, 0, var26, 1, var13, var15, 1, arg5);

			if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg6 > 0) {
				field1362[arg6][arg5][arg2] |= 0x924;
			}

			if (var14.field95 && arg0 != null) {
				arg0.method215(var14.field85, arg5, arg2, var14.field102, arg3, var14.field101);
			}
		} else if (arg7 == 0) {
			JEESRQGR var27;
			if (var14.field77 == -1 && var14.field78 == null) {
				var27 = var14.method27(0, arg3, var9, var10, var11, var12, -1);
			} else {
				var27 = new AZNRLUAT(var11, var9, arg1, var10, true, 0, arg3, var14.field77, var12);
			}

			arg4.method510(null, var16, arg2, var13, 0, var27, field1375[arg3], arg6, var15, arg5);

			if (arg3 == 0) {
				if (var14.field108) {
					field1359[arg6][arg5][arg2] = 50;
					field1359[arg6][arg5][arg2 + 1] = 50;
				}

				if (var14.field74) {
					field1362[arg6][arg5][arg2] |= 0x249;
				}
			} else if (arg3 == 1) {
				if (var14.field108) {
					field1359[arg6][arg5][arg2 + 1] = 50;
					field1359[arg6][arg5 + 1][arg2 + 1] = 50;
				}

				if (var14.field74) {
					field1362[arg6][arg5][arg2 + 1] |= 0x492;
				}
			} else if (arg3 == 2) {
				if (var14.field108) {
					field1359[arg6][arg5 + 1][arg2] = 50;
					field1359[arg6][arg5 + 1][arg2 + 1] = 50;
				}

				if (var14.field74) {
					field1362[arg6][arg5 + 1][arg2] |= 0x249;
				}
			} else if (arg3 == 3) {
				if (var14.field108) {
					field1359[arg6][arg5][arg2] = 50;
					field1359[arg6][arg5 + 1][arg2] = 50;
				}

				if (var14.field74) {
					field1362[arg6][arg5][arg2] |= 0x492;
				}
			}

			if (var14.field95 && arg0 != null) {
				arg0.method214(arg2, arg3, arg5, var14.field101, arg7);
			}

			if (var14.field112 != 16) {
				arg4.method518(arg6, var14.field112, arg2, arg5);
			}
		} else if (arg7 == 1) {
			JEESRQGR var28;
			if (var14.field77 == -1 && var14.field78 == null) {
				var28 = var14.method27(1, arg3, var9, var10, var11, var12, -1);
			} else {
				var28 = new AZNRLUAT(var11, var9, arg1, var10, true, 1, arg3, var14.field77, var12);
			}

			arg4.method510(null, var16, arg2, var13, 0, var28, field1364[arg3], arg6, var15, arg5);

			if (var14.field108) {
				if (arg3 == 0) {
					field1359[arg6][arg5][arg2 + 1] = 50;
				} else if (arg3 == 1) {
					field1359[arg6][arg5 + 1][arg2 + 1] = 50;
				} else if (arg3 == 2) {
					field1359[arg6][arg5 + 1][arg2] = 50;
				} else if (arg3 == 3) {
					field1359[arg6][arg5][arg2] = 50;
				}
			}

			if (var14.field95 && arg0 != null) {
				arg0.method214(arg2, arg3, arg5, var14.field101, arg7);
			}
		} else if (arg7 == 2) {
			int var29 = arg3 + 1 & 0x3;
			JEESRQGR var30;
			JEESRQGR var31;
			if (var14.field77 == -1 && var14.field78 == null) {
				var30 = var14.method27(2, arg3 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method27(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new AZNRLUAT(var11, var9, arg1, var10, true, 2, arg3 + 4, var14.field77, var12);
				var31 = new AZNRLUAT(var11, var9, arg1, var10, true, 2, var29, var14.field77, var12);
			}

			arg4.method510(var31, var16, arg2, var13, field1375[var29], var30, field1375[arg3], arg6, var15, arg5);

			if (var14.field74) {
				if (arg3 == 0) {
					field1362[arg6][arg5][arg2] |= 0x249;
					field1362[arg6][arg5][arg2 + 1] |= 0x492;
				} else if (arg3 == 1) {
					field1362[arg6][arg5][arg2 + 1] |= 0x492;
					field1362[arg6][arg5 + 1][arg2] |= 0x249;
				} else if (arg3 == 2) {
					field1362[arg6][arg5 + 1][arg2] |= 0x249;
					field1362[arg6][arg5][arg2] |= 0x492;
				} else if (arg3 == 3) {
					field1362[arg6][arg5][arg2] |= 0x492;
					field1362[arg6][arg5][arg2] |= 0x249;
				}
			}

			if (var14.field95 && arg0 != null) {
				arg0.method214(arg2, arg3, arg5, var14.field101, arg7);
			}

			if (var14.field112 != 16) {
				arg4.method518(arg6, var14.field112, arg2, arg5);
			}
		} else if (arg7 == 3) {
			JEESRQGR var32;
			if (var14.field77 == -1 && var14.field78 == null) {
				var32 = var14.method27(3, arg3, var9, var10, var11, var12, -1);
			} else {
				var32 = new AZNRLUAT(var11, var9, arg1, var10, true, 3, arg3, var14.field77, var12);
			}

			arg4.method510(null, var16, arg2, var13, 0, var32, field1364[arg3], arg6, var15, arg5);

			if (var14.field108) {
				if (arg3 == 0) {
					field1359[arg6][arg5][arg2 + 1] = 50;
				} else if (arg3 == 1) {
					field1359[arg6][arg5 + 1][arg2 + 1] = 50;
				} else if (arg3 == 2) {
					field1359[arg6][arg5 + 1][arg2] = 50;
				} else if (arg3 == 3) {
					field1359[arg6][arg5][arg2] = 50;
				}
			}

			if (var14.field95 && arg0 != null) {
				arg0.method214(arg2, arg3, arg5, var14.field101, arg7);
			}
		} else if (arg7 == 9) {
			JEESRQGR var33;
			if (var14.field77 == -1 && var14.field78 == null) {
				var33 = var14.method27(arg7, arg3, var9, var10, var11, var12, -1);
			} else {
				var33 = new AZNRLUAT(var11, var9, arg1, var10, true, arg7, arg3, var14.field77, var12);
			}

			arg4.method512(arg6, arg2, var16, 0, var33, 1, var13, var15, 1, arg5);

			if (var14.field95 && arg0 != null) {
				arg0.method215(var14.field85, arg5, arg2, var14.field102, arg3, var14.field101);
			}
		} else {
			if (var14.field111) {
				if (arg3 == 1) {
					int var34 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var9;
					var9 = var34;
				} else if (arg3 == 2) {
					int var35 = var12;
					var12 = var10;
					var10 = var35;
					int var36 = var11;
					var11 = var9;
					var9 = var36;
				} else if (arg3 == 3) {
					int var37 = var12;
					var12 = var9;
					var9 = var10;
					var10 = var11;
					var11 = var37;
				}
			}

			if (arg7 == 4) {
				JEESRQGR var38;
				if (var14.field77 == -1 && var14.field78 == null) {
					var38 = var14.method27(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new AZNRLUAT(var11, var9, arg1, var10, true, 4, 0, var14.field77, var12);
				}

				arg4.method511(var16, arg3 * 512, var13, arg2, arg6, arg5, field1375[arg3], 0, 0, var15, var38);
			} else if (arg7 == 5) {
				int var39 = 16;
				int var40 = arg4.method528(arg6, arg5, arg2);
				if (var40 > 0) {
					var39 = BMWIVHMF.method30(var40 >> 14 & 0x7FFF).field112;
				}

				JEESRQGR var41;
				if (var14.field77 == -1 && var14.field78 == null) {
					var41 = var14.method27(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new AZNRLUAT(var11, var9, arg1, var10, true, 4, 0, var14.field77, var12);
				}

				arg4.method511(var16, arg3 * 512, var13, arg2, arg6, arg5, field1375[arg3], field1358[arg3] * var39, field1370[arg3] * var39, var15, var41);
			} else if (arg7 == 6) {
				JEESRQGR var42;
				if (var14.field77 == -1 && var14.field78 == null) {
					var42 = var14.method27(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new AZNRLUAT(var11, var9, arg1, var10, true, 4, 0, var14.field77, var12);
				}

				arg4.method511(var16, arg3, var13, arg2, arg6, arg5, 256, 0, 0, var15, var42);
			} else if (arg7 == 7) {
				JEESRQGR var43;
				if (var14.field77 == -1 && var14.field78 == null) {
					var43 = var14.method27(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new AZNRLUAT(var11, var9, arg1, var10, true, 4, 0, var14.field77, var12);
				}

				arg4.method511(var16, arg3, var13, arg2, arg6, arg5, 512, 0, 0, var15, var43);
			} else if (arg7 == 8) {
				JEESRQGR var44;
				if (var14.field77 == -1 && var14.field78 == null) {
					var44 = var14.method27(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new AZNRLUAT(var11, var9, arg1, var10, true, 4, 0, var14.field77, var12);
				}

				arg4.method511(var16, arg3, var13, arg2, arg6, arg5, 768, 0, 0, var15, var44);
			}
		}
	}

	@ObfuscatedName("VZMNLGCR.b(III)Z")
	public static final boolean method445(int arg0, int arg1) {
		BMWIVHMF var2 = BMWIVHMF.method30(arg1);

		if (arg0 == 11) {
			arg0 = 10;
		}

		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}

		return var2.method24(arg0);
	}

	@ObfuscatedName("VZMNLGCR.a(III[BIIIZI[LGQSCEHQI;)V")
	public final void method446(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, GQSCEHQI[] arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg2 + var10 > 0 && arg2 + var10 < 103 && arg0 + var11 > 0 && arg0 + var11 < 103) {
					arg8[arg7].field736[arg2 + var10][arg0 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		XGRGMPUQ var12 = new XGRGMPUQ(arg3);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg4 == var13 && var14 >= arg5 && var14 < arg5 + 8 && var15 >= arg1 && var15 < arg1 + 8) {
						method452(0, 0, arg6, var12, arg2 + EPLYBIIS.method203(var14 & 0x7, var15 & 0x7, arg6), arg0 + EPLYBIIS.method204(arg6, var15 & 0x7, var14 & 0x7), arg7);
					} else {
						method452(0, 0, 0, var12, -1, -1, 0);
					}
				}
			}
		}
	}

	public VZMNLGCR(int arg0, int[][][] arg1, byte[][][] arg2, int arg3) {
		field1371 = 99;
		field1372 = arg0;
		field1373 = arg3;
		field1374 = arg1;
		field1365 = arg2;
		field1363 = new byte[4][field1372][field1373];
		field1366 = new byte[4][field1372][field1373];
		field1369 = new byte[4][field1372][field1373];
		field1368 = new byte[4][field1372][field1373];
		field1362 = new int[4][field1372 + 1][field1373 + 1];
		field1359 = new byte[4][field1372 + 1][field1373 + 1];
		field1367 = new int[field1372 + 1][field1373 + 1];
		field1376 = new int[field1373];
		field1377 = new int[field1373];
		field1378 = new int[field1373];
		field1379 = new int[field1373];
		field1380 = new int[field1373];
	}

	@ObfuscatedName("VZMNLGCR.a(IIIIIZLYDQEOBYY;LGQSCEHQI;I[[[II)V")
	public static final void method447(int arg0, int arg1, int arg2, int arg3, int arg4, YDQEOBYY arg5, GQSCEHQI arg6, int arg7, int[][][] arg8, int arg9) {
		int var10 = arg8[arg4][arg1][arg9];
		int var11 = arg8[arg4][arg1 + 1][arg9];
		int var12 = arg8[arg4][arg1 + 1][arg9 + 1];
		int var13 = arg8[arg4][arg1][arg9 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		BMWIVHMF var15 = BMWIVHMF.method30(arg3);
		int var16 = (arg3 << 14) + (arg9 << 7) + arg1 + 0x40000000;
		if (!var15.field91) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg7 << 6) + arg2);
		if (arg2 == 22) {
			JEESRQGR var18;
			if (var15.field77 == -1 && var15.field78 == null) {
				var18 = var15.method27(22, arg7, var10, var11, var12, var13, -1);
			} else {
				var18 = new AZNRLUAT(var12, var10, arg3, var11, true, 22, arg7, var15.field77, var13);
			}

			arg5.method508(arg1, var18, var17, var14, arg0, arg9, var16);

			if (var15.field95 && var15.field91) {
				arg6.method216(arg1, arg9);
			}
		} else if (arg2 == 10 || arg2 == 11) {
			JEESRQGR var19;
			if (var15.field77 == -1 && var15.field78 == null) {
				var19 = var15.method27(10, arg7, var10, var11, var12, var13, -1);
			} else {
				var19 = new AZNRLUAT(var12, var10, arg3, var11, true, 10, arg7, var15.field77, var13);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg2 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg7 == 1 || arg7 == 3) {
					var21 = var15.field102;
					var22 = var15.field85;
				} else {
					var21 = var15.field85;
					var22 = var15.field102;
				}

				arg5.method512(arg0, arg9, var17, var20, var19, var21, var14, var16, var22, arg1);
			}

			if (var15.field95) {
				arg6.method215(var15.field85, arg1, arg9, var15.field102, arg7, var15.field101);
			}
		} else if (arg2 >= 12) {
			JEESRQGR var23;
			if (var15.field77 == -1 && var15.field78 == null) {
				var23 = var15.method27(arg2, arg7, var10, var11, var12, var13, -1);
			} else {
				var23 = new AZNRLUAT(var12, var10, arg3, var11, true, arg2, arg7, var15.field77, var13);
			}

			arg5.method512(arg0, arg9, var17, 0, var23, 1, var14, var16, 1, arg1);

			if (var15.field95) {
				arg6.method215(var15.field85, arg1, arg9, var15.field102, arg7, var15.field101);
			}
		} else if (arg2 == 0) {
			JEESRQGR var24;
			if (var15.field77 == -1 && var15.field78 == null) {
				var24 = var15.method27(0, arg7, var10, var11, var12, var13, -1);
			} else {
				var24 = new AZNRLUAT(var12, var10, arg3, var11, true, 0, arg7, var15.field77, var13);
			}

			arg5.method510(null, var17, arg9, var14, 0, var24, field1375[arg7], arg0, var16, arg1);

			if (var15.field95) {
				arg6.method214(arg9, arg7, arg1, var15.field101, arg2);
			}
		} else if (arg2 == 1) {
			JEESRQGR var25;
			if (var15.field77 == -1 && var15.field78 == null) {
				var25 = var15.method27(1, arg7, var10, var11, var12, var13, -1);
			} else {
				var25 = new AZNRLUAT(var12, var10, arg3, var11, true, 1, arg7, var15.field77, var13);
			}

			arg5.method510(null, var17, arg9, var14, 0, var25, field1364[arg7], arg0, var16, arg1);

			if (var15.field95) {
				arg6.method214(arg9, arg7, arg1, var15.field101, arg2);
			}
		} else if (arg2 == 2) {
			int var26 = arg7 + 1 & 0x3;
			JEESRQGR var27;
			JEESRQGR var28;
			if (var15.field77 == -1 && var15.field78 == null) {
				var27 = var15.method27(2, arg7 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method27(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new AZNRLUAT(var12, var10, arg3, var11, true, 2, arg7 + 4, var15.field77, var13);
				var28 = new AZNRLUAT(var12, var10, arg3, var11, true, 2, var26, var15.field77, var13);
			}

			arg5.method510(var28, var17, arg9, var14, field1375[var26], var27, field1375[arg7], arg0, var16, arg1);

			if (var15.field95) {
				arg6.method214(arg9, arg7, arg1, var15.field101, arg2);
			}
		} else if (arg2 == 3) {
			JEESRQGR var29;
			if (var15.field77 == -1 && var15.field78 == null) {
				var29 = var15.method27(3, arg7, var10, var11, var12, var13, -1);
			} else {
				var29 = new AZNRLUAT(var12, var10, arg3, var11, true, 3, arg7, var15.field77, var13);
			}

			arg5.method510(null, var17, arg9, var14, 0, var29, field1364[arg7], arg0, var16, arg1);

			if (var15.field95) {
				arg6.method214(arg9, arg7, arg1, var15.field101, arg2);
			}
		} else if (arg2 == 9) {
			JEESRQGR var30;
			if (var15.field77 == -1 && var15.field78 == null) {
				var30 = var15.method27(arg2, arg7, var10, var11, var12, var13, -1);
			} else {
				var30 = new AZNRLUAT(var12, var10, arg3, var11, true, arg2, arg7, var15.field77, var13);
			}

			arg5.method512(arg0, arg9, var17, 0, var30, 1, var14, var16, 1, arg1);

			if (var15.field95) {
				arg6.method215(var15.field85, arg1, arg9, var15.field102, arg7, var15.field101);
			}
		} else {
			if (var15.field111) {
				if (arg7 == 1) {
					int var31 = var13;
					var13 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var31;
				} else if (arg7 == 2) {
					int var32 = var13;
					var13 = var11;
					var11 = var32;
					int var33 = var12;
					var12 = var10;
					var10 = var33;
				} else if (arg7 == 3) {
					int var34 = var13;
					var13 = var10;
					var10 = var11;
					var11 = var12;
					var12 = var34;
				}
			}

			if (arg2 == 4) {
				JEESRQGR var35;
				if (var15.field77 == -1 && var15.field78 == null) {
					var35 = var15.method27(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new AZNRLUAT(var12, var10, arg3, var11, true, 4, 0, var15.field77, var13);
				}

				arg5.method511(var17, arg7 * 512, var14, arg9, arg0, arg1, field1375[arg7], 0, 0, var16, var35);
			} else if (arg2 == 5) {
				int var36 = 16;
				int var37 = arg5.method528(arg0, arg1, arg9);
				if (var37 > 0) {
					var36 = BMWIVHMF.method30(var37 >> 14 & 0x7FFF).field112;
				}

				JEESRQGR var38;
				if (var15.field77 == -1 && var15.field78 == null) {
					var38 = var15.method27(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new AZNRLUAT(var12, var10, arg3, var11, true, 4, 0, var15.field77, var13);
				}

				arg5.method511(var17, arg7 * 512, var14, arg9, arg0, arg1, field1375[arg7], field1358[arg7] * var36, field1370[arg7] * var36, var16, var38);
			} else if (arg2 == 6) {
				JEESRQGR var39;
				if (var15.field77 == -1 && var15.field78 == null) {
					var39 = var15.method27(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new AZNRLUAT(var12, var10, arg3, var11, true, 4, 0, var15.field77, var13);
				}

				arg5.method511(var17, arg7, var14, arg9, arg0, arg1, 256, 0, 0, var16, var39);
			} else if (arg2 == 7) {
				JEESRQGR var40;
				if (var15.field77 == -1 && var15.field78 == null) {
					var40 = var15.method27(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new AZNRLUAT(var12, var10, arg3, var11, true, 4, 0, var15.field77, var13);
				}

				arg5.method511(var17, arg7, var14, arg9, arg0, arg1, 512, 0, 0, var16, var40);
			} else if (arg2 == 8) {
				JEESRQGR var41;
				if (var15.field77 == -1 && var15.field78 == null) {
					var41 = var15.method27(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new AZNRLUAT(var12, var10, arg3, var11, true, 4, 0, var15.field77, var13);
				}

				arg5.method511(var17, arg7, var14, arg9, arg0, arg1, 768, 0, 0, var16, var41);
			}
		}
	}

	@ObfuscatedName("VZMNLGCR.a(I[LGQSCEHQI;I[BBLYDQEOBYY;)V")
	public final void method448(int arg0, GQSCEHQI[] arg1, int arg2, byte[] arg3, YDQEOBYY arg4) {
		XGRGMPUQ var6 = new XGRGMPUQ(arg3);
		int var7 = -1;
		while (true) {
			int var8 = var6.method479();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method479();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method465();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg2 + var12;
				int var18 = arg0 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field1365[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					GQSCEHQI var20 = null;
					if (var19 >= 0) {
						var20 = arg1[var19];
					}

					method444(var20, var7, var18, var16, arg4, var17, var13, var15);
				}
			}
		}
	}

	@ObfuscatedName("VZMNLGCR.e(II)I")
	public static final int method449(int arg0, int arg1) {
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

	@ObfuscatedName("VZMNLGCR.a(IIIII)V")
	public final void method450(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg3; var5 <= arg1 + arg3; var5++) {
			for (int var6 = arg0; var6 <= arg0 + arg2; var6++) {
				if (var6 >= 0 && var6 < field1372 && var5 >= 0 && var5 < field1373) {
					field1359[0][var6][var5] = 127;

					if (arg0 == var6 && var6 > 0) {
						field1374[0][var6][var5] = field1374[0][var6 - 1][var5];
					}

					if (arg0 + arg2 == var6 && var6 < field1372 - 1) {
						field1374[0][var6][var5] = field1374[0][var6 + 1][var5];
					}

					if (arg3 == var5 && var5 > 0) {
						field1374[0][var6][var5] = field1374[0][var6][var5 - 1];
					}

					if (arg1 + arg3 == var5 && var5 < field1373 - 1) {
						field1374[0][var6][var5] = field1374[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("VZMNLGCR.c(III)I")
	public final int method451(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("VZMNLGCR.a(IIIILXGRGMPUQ;III)V")
	public final void method452(int arg0, int arg1, int arg2, XGRGMPUQ arg3, int arg4, int arg5, int arg6) {
		if (arg4 >= 0 && arg4 < 104 && arg5 >= 0 && arg5 < 104) {
			field1365[arg6][arg4][arg5] = 0;
			while (true) {
				int var8 = arg3.method465();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg3.method465();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg6 == 0) {
						field1374[0][arg4][arg5] = -var9 * 8;
						return;
					}

					field1374[arg6][arg4][arg5] = field1374[arg6 - 1][arg4][arg5] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field1366[arg6][arg4][arg5] = arg3.method466();
					field1369[arg6][arg4][arg5] = (byte) ((var8 - 2) / 4);
					field1368[arg6][arg4][arg5] = (byte) (var8 + arg2 - 2 & 0x3);
				} else if (var8 <= 81) {
					field1365[arg6][arg4][arg5] = (byte) (var8 - 49);
				} else {
					field1363[arg6][arg4][arg5] = (byte) (var8 - 81);
				}
			}

			if (arg6 == 0) {
				field1374[0][arg4][arg5] = -method432(arg4 + arg0 + 932731, arg5 + 556238 + arg1) * 8;
			} else {
				field1374[arg6][arg4][arg5] = field1374[arg6 - 1][arg4][arg5] - 240;
			}
		} else {
			while (true) {
				int var10 = arg3.method465();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg3.method465();
					return;
				}

				if (var10 <= 49) {
					arg3.method465();
				}
			}
		}
	}
}
