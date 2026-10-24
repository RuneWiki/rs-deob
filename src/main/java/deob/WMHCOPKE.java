package deob;

@ObfuscatedName("WMHCOPKE")
public final class WMHCOPKE {

	@ObfuscatedName("WMHCOPKE.x")
	public int field1446;

	@ObfuscatedName("WMHCOPKE.y")
	public int field1447;

	@ObfuscatedName("WMHCOPKE.l")
	public int[][][] field1440;

	@ObfuscatedName("WMHCOPKE.s")
	public byte[][][] field1444;

	@ObfuscatedName("WMHCOPKE.g")
	public byte[][][] field1436;

	@ObfuscatedName("WMHCOPKE.D")
	public byte[][][] field1452;

	@ObfuscatedName("WMHCOPKE.o")
	public byte[][][] field1442;

	@ObfuscatedName("WMHCOPKE.j")
	public byte[][][] field1438;

	@ObfuscatedName("WMHCOPKE.m")
	public int[][][] field1441;

	@ObfuscatedName("WMHCOPKE.i")
	public byte[][][] field1437;

	@ObfuscatedName("WMHCOPKE.C")
	public int[][] field1451;

	@ObfuscatedName("WMHCOPKE.a")
	public int[] field1430;

	@ObfuscatedName("WMHCOPKE.b")
	public int[] field1431;

	@ObfuscatedName("WMHCOPKE.c")
	public int[] field1432;

	@ObfuscatedName("WMHCOPKE.d")
	public int[] field1433;

	@ObfuscatedName("WMHCOPKE.e")
	public int[] field1434;

	@ObfuscatedName("WMHCOPKE.f")
	public static final int[] field1435 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("WMHCOPKE.q")
	public static final int[] field1443 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("WMHCOPKE.v")
	public static int field1445 = 99;

	@ObfuscatedName("WMHCOPKE.A")
	public static boolean field1449 = true;

	@ObfuscatedName("WMHCOPKE.B")
	public static final int[] field1450 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("WMHCOPKE.H")
	public static final int[] field1454 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("WMHCOPKE.k")
	public static int field1439 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("WMHCOPKE.E")
	public static int field1453 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("WMHCOPKE.z")
	public static int field1448;

	@ObfuscatedName("WMHCOPKE.a(II)I")
	public static final int method560(int arg0, int arg1) {
		int var2 = method569(arg0 + 45365, arg1 + 91923, 4) + (method569(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method569(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("WMHCOPKE.a([BZII)Z")
	public static final boolean method561(byte[] arg0, int arg1, int arg2) {
		boolean var3 = true;
		SVWJKJVI var4 = new SVWJKJVI(arg0);
		int var5 = -1;
		while (true) {
			int var6 = var4.method475();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method475();
					if (var9 == 0) {
						break;
					}

					var4.method461();
				} else {
					int var10 = var4.method475();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method461() >> 2;
					int var14 = arg1 + var12;
					int var15 = arg2 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						PXRGLLGB var16 = PXRGLLGB.method417(var5);
						if (var13 != 22 || !field1449 || var16.field1143 || var16.field1123) {
							var3 &= var16.method422();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("WMHCOPKE.a(IIII)I")
	public int method562(int arg0, int arg1, int arg2) {
		if ((field1444[arg2][arg1][arg0] & 0x8) != 0) {
			return 0;
		}

		if (arg2 > 0 && (field1444[1][arg1][arg0] & 0x2) != 0) {
			return arg2 - 1;
		}

		return arg2;
	}

	@ObfuscatedName("WMHCOPKE.a(I[LOXMJPDWD;I[BIII)V")
	public final void method563(int arg0, OXMJPDWD[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg3 + var8 > 0 && arg3 + var8 < 103 && arg4 + var9 > 0 && arg4 + var9 < 103) {
						arg1[var7].field1055[arg3 + var8][arg4 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		SVWJKJVI var10 = new SVWJKJVI(arg2);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method564(var10, arg5, 0, arg0, arg4 + var13, var11, arg3 + var12);
				}
			}
		}
	}

	@ObfuscatedName("WMHCOPKE.a(LSVWJKJVI;IIIIIII)V")
	public final void method564(SVWJKJVI arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg6 >= 0 && arg6 < 104 && arg4 >= 0 && arg4 < 104) {
			field1444[arg5][arg6][arg4] = 0;
			while (true) {
				int var8 = arg0.method461();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg0.method461();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg5 == 0) {
						field1440[0][arg6][arg4] = -var9 * 8;
						return;
					}

					field1440[arg5][arg6][arg4] = field1440[arg5 - 1][arg6][arg4] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field1452[arg5][arg6][arg4] = arg0.method462();
					field1442[arg5][arg6][arg4] = (byte) ((var8 - 2) / 4);
					field1438[arg5][arg6][arg4] = (byte) (var8 + arg2 - 2 & 0x3);
				} else if (var8 <= 81) {
					field1444[arg5][arg6][arg4] = (byte) (var8 - 49);
				} else {
					field1436[arg5][arg6][arg4] = (byte) (var8 - 81);
				}
			}

			if (arg5 == 0) {
				field1440[0][arg6][arg4] = -method560(arg6 + arg1 + 932731, arg4 + 556238 + arg3) * 8;
			} else {
				field1440[arg5][arg6][arg4] = field1440[arg5 - 1][arg6][arg4] - 240;
			}
		} else {
			while (true) {
				int var10 = arg0.method461();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg0.method461();
					return;
				}

				if (var10 <= 49) {
					arg0.method461();
				}
			}
		}
	}

	@ObfuscatedName("WMHCOPKE.b(II)I")
	public final int method565(int arg0, int arg1) {
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

	@ObfuscatedName("WMHCOPKE.c(II)I")
	public static final int method566(int arg0, int arg1) {
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

	@ObfuscatedName("WMHCOPKE.d(II)I")
	public static final int method567(int arg0, int arg1) {
		int var2 = method573(arg0 - 1, arg1 - 1) + method573(arg0 + 1, arg1 - 1) + method573(arg0 - 1, arg1 + 1) + method573(arg0 + 1, arg1 + 1);
		int var3 = method573(arg0 - 1, arg1) + method573(arg0 + 1, arg1) + method573(arg0, arg1 - 1) + method573(arg0, arg1 + 1);
		int var4 = method573(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("WMHCOPKE.a(ZIII)V")
	public final void method568(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 8; var4++) {
			for (int var5 = 0; var5 < 8; var5++) {
				field1440[arg2][arg1 + var4][arg0 + var5] = 0;
			}
		}

		if (arg1 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				field1440[arg2][arg1][arg0 + var6] = field1440[arg2][arg1 - 1][arg0 + var6];
			}
		}

		if (arg0 > 0) {
			for (int var7 = 1; var7 < 8; var7++) {
				field1440[arg2][arg1 + var7][arg0] = field1440[arg2][arg1 + var7][arg0 - 1];
			}
		}

		if (arg1 > 0 && field1440[arg2][arg1 - 1][arg0] != 0) {
			field1440[arg2][arg1][arg0] = field1440[arg2][arg1 - 1][arg0];
		} else if (arg0 > 0 && field1440[arg2][arg1][arg0 - 1] != 0) {
			field1440[arg2][arg1][arg0] = field1440[arg2][arg1][arg0 - 1];
		} else if (arg1 > 0 && arg0 > 0 && field1440[arg2][arg1 - 1][arg0 - 1] != 0) {
			field1440[arg2][arg1][arg0] = field1440[arg2][arg1 - 1][arg0 - 1];
		}
	}

	@ObfuscatedName("WMHCOPKE.a(III)I")
	public static final int method569(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method567(var3, var5);
		int var8 = method567(var3 + 1, var5);
		int var9 = method567(var3, var5 + 1);
		int var10 = method567(var3 + 1, var5 + 1);
		int var11 = method571(var7, var8, var4, arg2);
		int var12 = method571(var9, var10, var4, arg2);
		return method571(var11, var12, var6, arg2);
	}

	@ObfuscatedName("WMHCOPKE.b(III)Z")
	public static final boolean method570(int arg0, int arg1) {
		PXRGLLGB var2 = PXRGLLGB.method417(arg0);

		if (arg1 == 11) {
			arg1 = 10;
		}

		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}

		return var2.method421(arg1);
	}

	@ObfuscatedName("WMHCOPKE.b(IIII)I")
	public static final int method571(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - QRNWMOSL.field1179[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("WMHCOPKE.a(LSVWJKJVI;LIHBKBLZU;I)V")
	public static final void method572(SVWJKJVI arg0, IHBKBLZU arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method475();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			PXRGLLGB var4 = PXRGLLGB.method417(var2);
			var4.method415(arg1);

			while (true) {
				int var5 = arg0.method475();
				if (var5 == 0) {
					break;
				}

				arg0.method461();
			}
		}
	}

	@ObfuscatedName("WMHCOPKE.e(II)I")
	public static final int method573(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("WMHCOPKE.a(LGXHGUSOD;[LOXMJPDWD;I)V")
	public final void method574(GXHGUSOD arg0, OXMJPDWD[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field1444[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field1444[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method383(var5, var4);
						}
					}
				}
			}
		}

		field1453 += (int) (Math.random() * 5.0D) - 2;
		if (field1453 < -8) {
			field1453 = -8;
		}

		if (field1453 > 8) {
			field1453 = 8;
		}

		field1439 += (int) (Math.random() * 5.0D) - 2;
		if (field1439 < -16) {
			field1439 = -16;
		}

		if (field1439 > 16) {
			field1439 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field1437[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field1447 - 1; var16++) {
				for (int var17 = 1; var17 < field1446 - 1; var17++) {
					int var18 = field1440[var7][var17 + 1][var16] - field1440[var7][var17 - 1][var16];
					int var19 = field1440[var7][var17][var16 + 1] - field1440[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field1451[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field1447; var26++) {
				field1430[var26] = 0;
				field1431[var26] = 0;
				field1432[var26] = 0;
				field1433[var26] = 0;
				field1434[var26] = 0;
			}

			for (int var27 = -5; var27 < field1446 + 5; var27++) {
				for (int var28 = 0; var28 < field1447; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field1446) {
						int var30 = field1436[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							EPJTEXKD var31 = EPJTEXKD.field535[var30 - 1];
							field1430[var28] += var31.field544;
							field1431[var28] += var31.field542;
							field1432[var28] += var31.field543;
							field1433[var28] += var31.field545;
							field1434[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field1446) {
						int var33 = field1436[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							EPJTEXKD var34 = EPJTEXKD.field535[var33 - 1];
							field1430[var28] -= var34.field544;
							field1431[var28] -= var34.field542;
							field1432[var28] -= var34.field543;
							field1433[var28] -= var34.field545;
							field1434[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field1446 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field1447 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field1447) {
							var35 += field1430[var41];
							var36 += field1431[var41];
							var37 += field1432[var41];
							var38 += field1433[var41];
							var39 += field1434[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field1447) {
							var35 -= field1430[var42];
							var36 -= field1431[var42];
							var37 -= field1432[var42];
							var38 -= field1433[var42];
							var39 -= field1434[var42];
						}

						if (var40 >= 1 && var40 < field1447 - 1 && (!field1449 || (field1444[0][var27][var40] & 0x2) != 0 || (field1444[var7][var27][var40] & 0x10) == 0 && method562(var40, var27, var7) == field1448)) {
							if (var7 < field1445) {
								field1445 = var7;
							}

							int var43 = field1436[var7][var27][var40] & 0xFF;
							int var44 = field1452[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field1440[var7][var27][var40];
								int var46 = field1440[var7][var27 + 1][var40];
								int var47 = field1440[var7][var27 + 1][var40 + 1];
								int var48 = field1440[var7][var27][var40 + 1];
								int var49 = field1451[var27][var40];
								int var50 = field1451[var27 + 1][var40];
								int var51 = field1451[var27 + 1][var40 + 1];
								int var52 = field1451[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method576(var55, var56, var57);
									var55 = field1453 + var55 & 0xFF;
									var57 += field1439;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method576(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field1442[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !EPJTEXKD.field535[var44 - 1].field540) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field1441[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = QRNWMOSL.field1190[method566(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method194(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method566(var53, var49), method566(var53, var50), method566(var53, var51), method566(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field1442[var7][var27][var40] + 1;
									byte var61 = field1438[var7][var27][var40];
									EPJTEXKD var62 = EPJTEXKD.field535[var44 - 1];
									int var63 = var62.field538;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = QRNWMOSL.method430(var63);
										var65 = -1;
									} else if (var62.field537 == 0xFF00FF) {
										var65 = -2;
										var63 = -1;
										var64 = QRNWMOSL.field1190[method565(var62.field546, 96)];
									} else {
										var65 = method576(var62.field541, var62.field542, var62.field543);
										var64 = QRNWMOSL.field1190[method565(var62.field546, 96)];
									}

									arg0.method194(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method566(var53, var49), method566(var53, var50), method566(var53, var51), method566(var53, var52), method565(var65, var49), method565(var65, var50), method565(var65, var51), method565(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field1447 - 1; var66++) {
				for (int var67 = 1; var67 < field1446 - 1; var67++) {
					arg0.method193(var7, var67, var66, method562(var66, var67, var7));
				}
			}
		}

		arg0.method220(-50, -10, -50);

		for (int var68 = 0; var68 < field1446; var68++) {
			for (int var69 = 0; var69 < field1447; var69++) {
				if ((field1444[1][var68][var69] & 0x2) == 2) {
					arg0.method191(var68, var69);
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
				for (int var75 = 0; var75 <= field1447; var75++) {
					for (int var76 = 0; var76 <= field1446; var76++) {
						if ((field1441[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field1441[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field1447 && (field1441[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field1441[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field1441[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field1440[var80][var76][var77] - var84;
								int var86 = field1440[var79][var76][var77];
								GXHGUSOD.method192(var85, var78 * 128 + 128, var76 * 128, 1, var76 * 128, var77 * 128, var86, var73);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field1441[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field1441[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field1441[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field1446 && (field1441[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field1441[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field1441[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field1440[var92][var89][var75] - var96;
								int var98 = field1440[var91][var89][var75];
								GXHGUSOD.method192(var97, var75 * 128, var90 * 128 + 128, 2, var89 * 128, var75 * 128, var98, var73);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field1441[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field1441[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field1441[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field1447 && (field1441[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field1441[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field1446) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field1441[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field1440[var74][var101][var103];
								GXHGUSOD.method192(var107, var104 * 128 + 128, var102 * 128 + 128, 4, var101 * 128, var103 * 128, var107, var73);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field1441[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("WMHCOPKE.a(I[[[IIZILOXMJPDWD;LGXHGUSOD;IIII)V")
	public static final void method575(int arg0, int[][][] arg1, int arg2, int arg3, OXMJPDWD arg4, GXHGUSOD arg5, int arg6, int arg7, int arg8, int arg9) {
		int var10 = arg1[arg7][arg0][arg9];
		int var11 = arg1[arg7][arg0 + 1][arg9];
		int var12 = arg1[arg7][arg0 + 1][arg9 + 1];
		int var13 = arg1[arg7][arg0][arg9 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		PXRGLLGB var15 = PXRGLLGB.method417(arg2);
		int var16 = (arg2 << 14) + (arg9 << 7) + arg0 + 0x40000000;
		if (!var15.field1143) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg8 << 6) + arg3);
		if (arg3 == 22) {
			JNFESWRD var18;
			if (var15.field1165 == -1 && var15.field1138 == null) {
				var18 = var15.method414(22, arg8, var10, var11, var12, var13, -1);
			} else {
				var18 = new INFJTSRJ(var12, var11, arg2, var15.field1165, 22, arg8, true, var10, var13);
			}

			arg5.method195(var18, arg0, arg9, var16, var14, arg6, var17);

			if (var15.field1124 && var15.field1143) {
				arg4.method383(arg9, arg0);
			}
		} else if (arg3 == 10 || arg3 == 11) {
			JNFESWRD var19;
			if (var15.field1165 == -1 && var15.field1138 == null) {
				var19 = var15.method414(10, arg8, var10, var11, var12, var13, -1);
			} else {
				var19 = new INFJTSRJ(var12, var11, arg2, var15.field1165, 10, arg8, true, var10, var13);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg3 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg8 == 1 || arg8 == 3) {
					var21 = var15.field1149;
					var22 = var15.field1142;
				} else {
					var21 = var15.field1142;
					var22 = var15.field1149;
				}

				arg5.method199(arg6, var16, var19, var21, var14, var17, arg9, var22, arg0, var20);
			}

			if (var15.field1124) {
				arg4.method382(arg9, var15.field1149, var15.field1142, arg8, var15.field1132, arg0);
			}
		} else if (arg3 >= 12) {
			JNFESWRD var23;
			if (var15.field1165 == -1 && var15.field1138 == null) {
				var23 = var15.method414(arg3, arg8, var10, var11, var12, var13, -1);
			} else {
				var23 = new INFJTSRJ(var12, var11, arg2, var15.field1165, arg3, arg8, true, var10, var13);
			}

			arg5.method199(arg6, var16, var23, 1, var14, var17, arg9, 1, arg0, 0);

			if (var15.field1124) {
				arg4.method382(arg9, var15.field1149, var15.field1142, arg8, var15.field1132, arg0);
			}
		} else if (arg3 == 0) {
			JNFESWRD var24;
			if (var15.field1165 == -1 && var15.field1138 == null) {
				var24 = var15.method414(0, arg8, var10, var11, var12, var13, -1);
			} else {
				var24 = new INFJTSRJ(var12, var11, arg2, var15.field1165, 0, arg8, true, var10, var13);
			}

			arg5.method197(arg0, 0, null, var16, var24, field1443[arg8], var17, arg9, var14, arg6);

			if (var15.field1124) {
				arg4.method381(arg3, arg9, var15.field1132, arg8, arg0);
			}
		} else if (arg3 == 1) {
			JNFESWRD var25;
			if (var15.field1165 == -1 && var15.field1138 == null) {
				var25 = var15.method414(1, arg8, var10, var11, var12, var13, -1);
			} else {
				var25 = new INFJTSRJ(var12, var11, arg2, var15.field1165, 1, arg8, true, var10, var13);
			}

			arg5.method197(arg0, 0, null, var16, var25, field1435[arg8], var17, arg9, var14, arg6);

			if (var15.field1124) {
				arg4.method381(arg3, arg9, var15.field1132, arg8, arg0);
			}
		} else if (arg3 == 2) {
			int var26 = arg8 + 1 & 0x3;
			JNFESWRD var27;
			JNFESWRD var28;
			if (var15.field1165 == -1 && var15.field1138 == null) {
				var27 = var15.method414(2, arg8 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method414(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new INFJTSRJ(var12, var11, arg2, var15.field1165, 2, arg8 + 4, true, var10, var13);
				var28 = new INFJTSRJ(var12, var11, arg2, var15.field1165, 2, var26, true, var10, var13);
			}

			arg5.method197(arg0, field1443[var26], var28, var16, var27, field1443[arg8], var17, arg9, var14, arg6);

			if (var15.field1124) {
				arg4.method381(arg3, arg9, var15.field1132, arg8, arg0);
			}
		} else if (arg3 == 3) {
			JNFESWRD var29;
			if (var15.field1165 == -1 && var15.field1138 == null) {
				var29 = var15.method414(3, arg8, var10, var11, var12, var13, -1);
			} else {
				var29 = new INFJTSRJ(var12, var11, arg2, var15.field1165, 3, arg8, true, var10, var13);
			}

			arg5.method197(arg0, 0, null, var16, var29, field1435[arg8], var17, arg9, var14, arg6);

			if (var15.field1124) {
				arg4.method381(arg3, arg9, var15.field1132, arg8, arg0);
			}
		} else if (arg3 == 9) {
			JNFESWRD var30;
			if (var15.field1165 == -1 && var15.field1138 == null) {
				var30 = var15.method414(arg3, arg8, var10, var11, var12, var13, -1);
			} else {
				var30 = new INFJTSRJ(var12, var11, arg2, var15.field1165, arg3, arg8, true, var10, var13);
			}

			arg5.method199(arg6, var16, var30, 1, var14, var17, arg9, 1, arg0, 0);

			if (var15.field1124) {
				arg4.method382(arg9, var15.field1149, var15.field1142, arg8, var15.field1132, arg0);
			}
		} else {
			if (var15.field1151) {
				if (arg8 == 1) {
					int var31 = var13;
					var13 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var31;
				} else if (arg8 == 2) {
					int var32 = var13;
					var13 = var11;
					var11 = var32;
					int var33 = var12;
					var12 = var10;
					var10 = var33;
				} else if (arg8 == 3) {
					int var34 = var13;
					var13 = var10;
					var10 = var11;
					var11 = var12;
					var12 = var34;
				}
			}

			if (arg3 == 4) {
				JNFESWRD var35;
				if (var15.field1165 == -1 && var15.field1138 == null) {
					var35 = var15.method414(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new INFJTSRJ(var12, var11, arg2, var15.field1165, 4, 0, true, var10, var13);
				}

				arg5.method198(arg6, 0, var35, var16, field1443[arg8], 0, var17, arg0, arg8 * 512, var14, arg9);
			} else if (arg3 == 5) {
				int var36 = 16;
				int var37 = arg5.method215(arg6, arg0, arg9);
				if (var37 > 0) {
					var36 = PXRGLLGB.method417(var37 >> 14 & 0x7FFF).field1164;
				}

				JNFESWRD var38;
				if (var15.field1165 == -1 && var15.field1138 == null) {
					var38 = var15.method414(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new INFJTSRJ(var12, var11, arg2, var15.field1165, 4, 0, true, var10, var13);
				}

				arg5.method198(arg6, field1454[arg8] * var36, var38, var16, field1443[arg8], field1450[arg8] * var36, var17, arg0, arg8 * 512, var14, arg9);
			} else if (arg3 == 6) {
				JNFESWRD var39;
				if (var15.field1165 == -1 && var15.field1138 == null) {
					var39 = var15.method414(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new INFJTSRJ(var12, var11, arg2, var15.field1165, 4, 0, true, var10, var13);
				}

				arg5.method198(arg6, 0, var39, var16, 256, 0, var17, arg0, arg8, var14, arg9);
			} else if (arg3 == 7) {
				JNFESWRD var40;
				if (var15.field1165 == -1 && var15.field1138 == null) {
					var40 = var15.method414(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new INFJTSRJ(var12, var11, arg2, var15.field1165, 4, 0, true, var10, var13);
				}

				arg5.method198(arg6, 0, var40, var16, 512, 0, var17, arg0, arg8, var14, arg9);
			} else if (arg3 == 8) {
				JNFESWRD var41;
				if (var15.field1165 == -1 && var15.field1138 == null) {
					var41 = var15.method414(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new INFJTSRJ(var12, var11, arg2, var15.field1165, 4, 0, true, var10, var13);
				}

				arg5.method198(arg6, 0, var41, var16, 768, 0, var17, arg0, arg8, var14, arg9);
			}
		}
	}

	@ObfuscatedName("WMHCOPKE.c(III)I")
	public final int method576(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("WMHCOPKE.a(IIILOXMJPDWD;IILGXHGUSOD;II)V")
	public final void method577(int arg0, int arg1, int arg2, OXMJPDWD arg3, int arg4, int arg5, GXHGUSOD arg6, int arg7) {
		if (field1449 && (field1444[0][arg7][arg0] & 0x2) == 0) {
			if ((field1444[arg2][arg7][arg0] & 0x10) != 0) {
				return;
			}

			if (method562(arg0, arg7, arg2) != field1448) {
				return;
			}
		}

		if (arg2 < field1445) {
			field1445 = arg2;
		}

		int var9 = field1440[arg2][arg7][arg0];
		int var10 = field1440[arg2][arg7 + 1][arg0];
		int var11 = field1440[arg2][arg7 + 1][arg0 + 1];
		int var12 = field1440[arg2][arg7][arg0 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		PXRGLLGB var14 = PXRGLLGB.method417(arg4);
		int var15 = (arg4 << 14) + (arg0 << 7) + arg7 + 0x40000000;
		if (!var14.field1143) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg5 << 6) + arg1);
		if (arg1 == 22) {
			if (!field1449 || var14.field1143 || var14.field1123) {
				JNFESWRD var17;
				if (var14.field1165 == -1 && var14.field1138 == null) {
					var17 = var14.method414(22, arg5, var9, var10, var11, var12, -1);
				} else {
					var17 = new INFJTSRJ(var11, var10, arg4, var14.field1165, 22, arg5, true, var9, var12);
				}

				arg6.method195(var17, arg7, arg0, var15, var13, arg2, var16);

				if (var14.field1124 && var14.field1143 && arg3 != null) {
					arg3.method383(arg0, arg7);
				}
			}
		} else if (arg1 == 10 || arg1 == 11) {
			JNFESWRD var18;
			if (var14.field1165 == -1 && var14.field1138 == null) {
				var18 = var14.method414(10, arg5, var9, var10, var11, var12, -1);
			} else {
				var18 = new INFJTSRJ(var11, var10, arg4, var14.field1165, 10, arg5, true, var9, var12);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg1 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg5 == 1 || arg5 == 3) {
					var20 = var14.field1149;
					var21 = var14.field1142;
				} else {
					var20 = var14.field1142;
					var21 = var14.field1149;
				}

				if (arg6.method199(arg2, var15, var18, var20, var13, var16, arg0, var21, arg7, var19) && var14.field1148) {
					IYSWJGDE var22;
					if (var18 instanceof IYSWJGDE) {
						var22 = (IYSWJGDE) var18;
					} else {
						var22 = var14.method414(10, arg5, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field743 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field1437[arg2][arg7 + var23][arg0 + var24]) {
									field1437[arg2][arg7 + var23][arg0 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field1124 && arg3 != null) {
				arg3.method382(arg0, var14.field1149, var14.field1142, arg5, var14.field1132, arg7);
			}
		} else if (arg1 >= 12) {
			JNFESWRD var26;
			if (var14.field1165 == -1 && var14.field1138 == null) {
				var26 = var14.method414(arg1, arg5, var9, var10, var11, var12, -1);
			} else {
				var26 = new INFJTSRJ(var11, var10, arg4, var14.field1165, arg1, arg5, true, var9, var12);
			}

			arg6.method199(arg2, var15, var26, 1, var13, var16, arg0, 1, arg7, 0);

			if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg2 > 0) {
				field1441[arg2][arg7][arg0] |= 0x924;
			}

			if (var14.field1124 && arg3 != null) {
				arg3.method382(arg0, var14.field1149, var14.field1142, arg5, var14.field1132, arg7);
			}
		} else if (arg1 == 0) {
			JNFESWRD var27;
			if (var14.field1165 == -1 && var14.field1138 == null) {
				var27 = var14.method414(0, arg5, var9, var10, var11, var12, -1);
			} else {
				var27 = new INFJTSRJ(var11, var10, arg4, var14.field1165, 0, arg5, true, var9, var12);
			}

			arg6.method197(arg7, 0, null, var15, var27, field1443[arg5], var16, arg0, var13, arg2);

			if (arg5 == 0) {
				if (var14.field1148) {
					field1437[arg2][arg7][arg0] = 50;
					field1437[arg2][arg7][arg0 + 1] = 50;
				}

				if (var14.field1130) {
					field1441[arg2][arg7][arg0] |= 0x249;
				}
			} else if (arg5 == 1) {
				if (var14.field1148) {
					field1437[arg2][arg7][arg0 + 1] = 50;
					field1437[arg2][arg7 + 1][arg0 + 1] = 50;
				}

				if (var14.field1130) {
					field1441[arg2][arg7][arg0 + 1] |= 0x492;
				}
			} else if (arg5 == 2) {
				if (var14.field1148) {
					field1437[arg2][arg7 + 1][arg0] = 50;
					field1437[arg2][arg7 + 1][arg0 + 1] = 50;
				}

				if (var14.field1130) {
					field1441[arg2][arg7 + 1][arg0] |= 0x249;
				}
			} else if (arg5 == 3) {
				if (var14.field1148) {
					field1437[arg2][arg7][arg0] = 50;
					field1437[arg2][arg7 + 1][arg0] = 50;
				}

				if (var14.field1130) {
					field1441[arg2][arg7][arg0] |= 0x492;
				}
			}

			if (var14.field1124 && arg3 != null) {
				arg3.method381(arg1, arg0, var14.field1132, arg5, arg7);
			}

			if (var14.field1164 != 16) {
				arg6.method205(arg7, arg2, arg0, var14.field1164);
			}
		} else if (arg1 == 1) {
			JNFESWRD var28;
			if (var14.field1165 == -1 && var14.field1138 == null) {
				var28 = var14.method414(1, arg5, var9, var10, var11, var12, -1);
			} else {
				var28 = new INFJTSRJ(var11, var10, arg4, var14.field1165, 1, arg5, true, var9, var12);
			}

			arg6.method197(arg7, 0, null, var15, var28, field1435[arg5], var16, arg0, var13, arg2);

			if (var14.field1148) {
				if (arg5 == 0) {
					field1437[arg2][arg7][arg0 + 1] = 50;
				} else if (arg5 == 1) {
					field1437[arg2][arg7 + 1][arg0 + 1] = 50;
				} else if (arg5 == 2) {
					field1437[arg2][arg7 + 1][arg0] = 50;
				} else if (arg5 == 3) {
					field1437[arg2][arg7][arg0] = 50;
				}
			}

			if (var14.field1124 && arg3 != null) {
				arg3.method381(arg1, arg0, var14.field1132, arg5, arg7);
			}
		} else if (arg1 == 2) {
			int var29 = arg5 + 1 & 0x3;
			JNFESWRD var30;
			JNFESWRD var31;
			if (var14.field1165 == -1 && var14.field1138 == null) {
				var30 = var14.method414(2, arg5 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method414(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new INFJTSRJ(var11, var10, arg4, var14.field1165, 2, arg5 + 4, true, var9, var12);
				var31 = new INFJTSRJ(var11, var10, arg4, var14.field1165, 2, var29, true, var9, var12);
			}

			arg6.method197(arg7, field1443[var29], var31, var15, var30, field1443[arg5], var16, arg0, var13, arg2);

			if (var14.field1130) {
				if (arg5 == 0) {
					field1441[arg2][arg7][arg0] |= 0x249;
					field1441[arg2][arg7][arg0 + 1] |= 0x492;
				} else if (arg5 == 1) {
					field1441[arg2][arg7][arg0 + 1] |= 0x492;
					field1441[arg2][arg7 + 1][arg0] |= 0x249;
				} else if (arg5 == 2) {
					field1441[arg2][arg7 + 1][arg0] |= 0x249;
					field1441[arg2][arg7][arg0] |= 0x492;
				} else if (arg5 == 3) {
					field1441[arg2][arg7][arg0] |= 0x492;
					field1441[arg2][arg7][arg0] |= 0x249;
				}
			}

			if (var14.field1124 && arg3 != null) {
				arg3.method381(arg1, arg0, var14.field1132, arg5, arg7);
			}

			if (var14.field1164 != 16) {
				arg6.method205(arg7, arg2, arg0, var14.field1164);
			}
		} else if (arg1 == 3) {
			JNFESWRD var32;
			if (var14.field1165 == -1 && var14.field1138 == null) {
				var32 = var14.method414(3, arg5, var9, var10, var11, var12, -1);
			} else {
				var32 = new INFJTSRJ(var11, var10, arg4, var14.field1165, 3, arg5, true, var9, var12);
			}

			arg6.method197(arg7, 0, null, var15, var32, field1435[arg5], var16, arg0, var13, arg2);

			if (var14.field1148) {
				if (arg5 == 0) {
					field1437[arg2][arg7][arg0 + 1] = 50;
				} else if (arg5 == 1) {
					field1437[arg2][arg7 + 1][arg0 + 1] = 50;
				} else if (arg5 == 2) {
					field1437[arg2][arg7 + 1][arg0] = 50;
				} else if (arg5 == 3) {
					field1437[arg2][arg7][arg0] = 50;
				}
			}

			if (var14.field1124 && arg3 != null) {
				arg3.method381(arg1, arg0, var14.field1132, arg5, arg7);
			}
		} else if (arg1 == 9) {
			JNFESWRD var33;
			if (var14.field1165 == -1 && var14.field1138 == null) {
				var33 = var14.method414(arg1, arg5, var9, var10, var11, var12, -1);
			} else {
				var33 = new INFJTSRJ(var11, var10, arg4, var14.field1165, arg1, arg5, true, var9, var12);
			}

			arg6.method199(arg2, var15, var33, 1, var13, var16, arg0, 1, arg7, 0);

			if (var14.field1124 && arg3 != null) {
				arg3.method382(arg0, var14.field1149, var14.field1142, arg5, var14.field1132, arg7);
			}
		} else {
			if (var14.field1151) {
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
				JNFESWRD var38;
				if (var14.field1165 == -1 && var14.field1138 == null) {
					var38 = var14.method414(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new INFJTSRJ(var11, var10, arg4, var14.field1165, 4, 0, true, var9, var12);
				}

				arg6.method198(arg2, 0, var38, var15, field1443[arg5], 0, var16, arg7, arg5 * 512, var13, arg0);
			} else if (arg1 == 5) {
				int var39 = 16;
				int var40 = arg6.method215(arg2, arg7, arg0);
				if (var40 > 0) {
					var39 = PXRGLLGB.method417(var40 >> 14 & 0x7FFF).field1164;
				}

				JNFESWRD var41;
				if (var14.field1165 == -1 && var14.field1138 == null) {
					var41 = var14.method414(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new INFJTSRJ(var11, var10, arg4, var14.field1165, 4, 0, true, var9, var12);
				}

				arg6.method198(arg2, field1454[arg5] * var39, var41, var15, field1443[arg5], field1450[arg5] * var39, var16, arg7, arg5 * 512, var13, arg0);
			} else if (arg1 == 6) {
				JNFESWRD var42;
				if (var14.field1165 == -1 && var14.field1138 == null) {
					var42 = var14.method414(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new INFJTSRJ(var11, var10, arg4, var14.field1165, 4, 0, true, var9, var12);
				}

				arg6.method198(arg2, 0, var42, var15, 256, 0, var16, arg7, arg5, var13, arg0);
			} else if (arg1 == 7) {
				JNFESWRD var43;
				if (var14.field1165 == -1 && var14.field1138 == null) {
					var43 = var14.method414(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new INFJTSRJ(var11, var10, arg4, var14.field1165, 4, 0, true, var9, var12);
				}

				arg6.method198(arg2, 0, var43, var15, 512, 0, var16, arg7, arg5, var13, arg0);
			} else if (arg1 == 8) {
				JNFESWRD var44;
				if (var14.field1165 == -1 && var14.field1138 == null) {
					var44 = var14.method414(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new INFJTSRJ(var11, var10, arg4, var14.field1165, 4, 0, true, var9, var12);
				}

				arg6.method198(arg2, 0, var44, var15, 768, 0, var16, arg7, arg5, var13, arg0);
			}
		}
	}

	public WMHCOPKE(int[][][] arg0, byte[][][] arg1, int arg2, int arg3) {
		field1445 = 99;
		field1446 = arg2;
		field1447 = arg3;
		field1440 = arg0;
		field1444 = arg1;
		field1436 = new byte[4][field1446][field1447];
		field1452 = new byte[4][field1446][field1447];
		field1442 = new byte[4][field1446][field1447];
		field1438 = new byte[4][field1446][field1447];
		field1441 = new int[4][field1446 + 1][field1447 + 1];
		field1437 = new byte[4][field1446 + 1][field1447 + 1];
		field1451 = new int[field1446 + 1][field1447 + 1];
		field1430 = new int[field1447];
		field1431 = new int[field1447];
		field1432 = new int[field1447];
		field1433 = new int[field1447];
		field1434 = new int[field1447];
	}

	@ObfuscatedName("WMHCOPKE.a([BIILGXHGUSOD;I[LOXMJPDWD;)V")
	public final void method578(byte[] arg0, int arg1, GXHGUSOD arg2, int arg3, OXMJPDWD[] arg4) {
		SVWJKJVI var6 = new SVWJKJVI(arg0);
		int var7 = -1;
		while (true) {
			int var8 = var6.method475();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method475();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method461();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg1 + var12;
				int var18 = arg3 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field1444[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					OXMJPDWD var20 = null;
					if (var19 >= 0) {
						var20 = arg4[var19];
					}

					method577(var18, var15, var13, var20, var7, var16, arg2, var17);
				}
			}
		}
	}

	@ObfuscatedName("WMHCOPKE.a(IIIII)V")
	public final void method579(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg1; var5 <= arg1 + arg3; var5++) {
			for (int var6 = arg0; var6 <= arg0 + arg2; var6++) {
				if (var6 >= 0 && var6 < field1446 && var5 >= 0 && var5 < field1447) {
					field1437[0][var6][var5] = 127;

					if (arg0 == var6 && var6 > 0) {
						field1440[0][var6][var5] = field1440[0][var6 - 1][var5];
					}

					if (arg0 + arg2 == var6 && var6 < field1446 - 1) {
						field1440[0][var6][var5] = field1440[0][var6 + 1][var5];
					}

					if (arg1 == var5 && var5 > 0) {
						field1440[0][var6][var5] = field1440[0][var6][var5 - 1];
					}

					if (arg1 + arg3 == var5 && var5 < field1447 - 1) {
						field1440[0][var6][var5] = field1440[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("WMHCOPKE.a(III[BBIIII[LOXMJPDWD;)V")
	public final void method580(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, OXMJPDWD[] arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg4 + var10 > 0 && arg4 + var10 < 103 && arg5 + var11 > 0 && arg5 + var11 < 103) {
					arg8[arg6].field1055[arg4 + var10][arg5 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		SVWJKJVI var12 = new SVWJKJVI(arg3);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg7 == var13 && var14 >= arg2 && var14 < arg2 + 8 && var15 >= arg1 && var15 < arg1 + 8) {
						method564(var12, 0, arg0, 0, arg5 + XGXKDVNG.method587(var15 & 0x7, arg0, var14 & 0x7), arg6, arg4 + XGXKDVNG.method586(var15 & 0x7, var14 & 0x7, arg0));
					} else {
						method564(var12, 0, 0, 0, -1, 0, -1);
					}
				}
			}
		}
	}

	@ObfuscatedName("WMHCOPKE.a(IIII[LOXMJPDWD;II[BILGXHGUSOD;I)V")
	public final void method581(int arg0, int arg1, int arg2, int arg3, OXMJPDWD[] arg4, int arg5, byte[] arg6, int arg7, GXHGUSOD arg8, int arg9) {
		SVWJKJVI var11 = new SVWJKJVI(arg6);
		int var12 = -1;
		while (true) {
			int var13 = var11.method475();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method475();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method461();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg5 == var18 && var17 >= arg3 && var17 < arg3 + 8 && var16 >= arg2 && var16 < arg2 + 8) {
					PXRGLLGB var22 = PXRGLLGB.method417(var12);
					int var23 = arg7 + XGXKDVNG.method588(var22.field1142, var16 & 0x7, arg1, var17 & 0x7, var22.field1149, var21);
					int var24 = arg0 + XGXKDVNG.method589(var17 & 0x7, var16 & 0x7, var21, arg1, var22.field1149, var22.field1142);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg9;
						if ((field1444[1][var23][var24] & 0x2) == 2) {
							var25 = arg9 - 1;
						}

						OXMJPDWD var26 = null;
						if (var25 >= 0) {
							var26 = arg4[var25];
						}

						method577(var24, var20, arg9, var26, var12, arg1 + var21 & 0x3, arg8, var23);
					}
				}
			}
		}
	}
}
