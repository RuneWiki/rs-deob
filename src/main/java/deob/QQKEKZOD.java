package deob;

@ObfuscatedName("QQKEKZOD")
public final class QQKEKZOD {

	@ObfuscatedName("QQKEKZOD.b")
	public int field1296;

	@ObfuscatedName("QQKEKZOD.c")
	public int field1297;

	@ObfuscatedName("QQKEKZOD.B")
	public int[][][] field1317;

	@ObfuscatedName("QQKEKZOD.o")
	public byte[][][] field1308;

	@ObfuscatedName("QQKEKZOD.t")
	public byte[][][] field1311;

	@ObfuscatedName("QQKEKZOD.z")
	public byte[][][] field1315;

	@ObfuscatedName("QQKEKZOD.p")
	public byte[][][] field1309;

	@ObfuscatedName("QQKEKZOD.x")
	public byte[][][] field1314;

	@ObfuscatedName("QQKEKZOD.v")
	public int[][][] field1313;

	@ObfuscatedName("QQKEKZOD.E")
	public byte[][][] field1318;

	@ObfuscatedName("QQKEKZOD.f")
	public int[][] field1299;

	@ObfuscatedName("QQKEKZOD.h")
	public int[] field1301;

	@ObfuscatedName("QQKEKZOD.i")
	public int[] field1302;

	@ObfuscatedName("QQKEKZOD.j")
	public int[] field1303;

	@ObfuscatedName("QQKEKZOD.k")
	public int[] field1304;

	@ObfuscatedName("QQKEKZOD.l")
	public int[] field1305;

	@ObfuscatedName("QQKEKZOD.a")
	public static int field1295 = 99;

	@ObfuscatedName("QQKEKZOD.g")
	public static final int[] field1300 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("QQKEKZOD.m")
	public static boolean field1306 = true;

	@ObfuscatedName("QQKEKZOD.q")
	public static final int[] field1310 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("QQKEKZOD.u")
	public static final int[] field1312 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("QQKEKZOD.G")
	public static final int[] field1319 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("QQKEKZOD.d")
	public static int field1298 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("QQKEKZOD.A")
	public static int field1316 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("QQKEKZOD.n")
	public static int field1307;

	@ObfuscatedName("QQKEKZOD.a(ZLEWALAKUU;LLZWRHABP;)V")
	public static final void method539(EWALAKUU arg0, LZWRHABP arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg1.method477();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			OEPVRTCC var4 = OEPVRTCC.method522(var2);
			var4.method519(arg0);

			while (true) {
				int var5 = arg1.method477();
				if (var5 == 0) {
					break;
				}

				arg1.method463();
			}
		}
	}

	@ObfuscatedName("QQKEKZOD.a(IIBIIILBJATBFRK;I[B[LKZCDTFDB;I)V")
	public final void method540(int arg0, int arg1, int arg2, int arg3, int arg4, BJATBFRK arg5, int arg6, byte[] arg7, KZCDTFDB[] arg8, int arg9) {
		LZWRHABP var11 = new LZWRHABP(arg7);
		int var12 = -1;
		while (true) {
			int var13 = var11.method477();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method477();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method463();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg0 == var18 && var17 >= arg3 && var17 < arg3 + 8 && var16 >= arg6 && var16 < arg6 + 8) {
					OEPVRTCC var22 = OEPVRTCC.method522(var12);
					int var23 = arg1 + XUKWZROH.method593(var21, var22.field1230, arg4, var16 & 0x7, var22.field1246, var17 & 0x7);
					int var24 = arg2 + XUKWZROH.method594(var22.field1246, var21, arg4, var16 & 0x7, var17 & 0x7, var22.field1230);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg9;
						if ((field1308[1][var23][var24] & 0x2) == 2) {
							var25 = arg9 - 1;
						}

						KZCDTFDB var26 = null;
						if (var25 >= 0) {
							var26 = arg8[var25];
						}

						method549(var12, arg5, var20, var23, arg4 + var21 & 0x3, var24, var26, arg9);
					}
				}
			}
		}
	}

	@ObfuscatedName("QQKEKZOD.a(LBJATBFRK;[LKZCDTFDB;I)V")
	public final void method541(BJATBFRK arg0, KZCDTFDB[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field1308[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field1308[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method410(var4, var5);
						}
					}
				}
			}
		}

		field1298 += (int) (Math.random() * 5.0D) - 2;
		if (field1298 < -8) {
			field1298 = -8;
		}

		if (field1298 > 8) {
			field1298 = 8;
		}

		field1316 += (int) (Math.random() * 5.0D) - 2;
		if (field1316 < -16) {
			field1316 = -16;
		}

		if (field1316 > 16) {
			field1316 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field1318[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field1297 - 1; var16++) {
				for (int var17 = 1; var17 < field1296 - 1; var17++) {
					int var18 = field1317[var7][var17 + 1][var16] - field1317[var7][var17 - 1][var16];
					int var19 = field1317[var7][var17][var16 + 1] - field1317[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field1299[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field1297; var26++) {
				field1301[var26] = 0;
				field1302[var26] = 0;
				field1303[var26] = 0;
				field1304[var26] = 0;
				field1305[var26] = 0;
			}

			for (int var27 = -5; var27 < field1296 + 5; var27++) {
				for (int var28 = 0; var28 < field1297; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field1296) {
						int var30 = field1311[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							EHKXAJCO var31 = EHKXAJCO.field703[var30 - 1];
							field1301[var28] += var31.field712;
							field1302[var28] += var31.field710;
							field1303[var28] += var31.field711;
							field1304[var28] += var31.field713;
							field1305[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field1296) {
						int var33 = field1311[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							EHKXAJCO var34 = EHKXAJCO.field703[var33 - 1];
							field1301[var28] -= var34.field712;
							field1302[var28] -= var34.field710;
							field1303[var28] -= var34.field711;
							field1304[var28] -= var34.field713;
							field1305[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field1296 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field1297 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field1297) {
							var35 += field1301[var41];
							var36 += field1302[var41];
							var37 += field1303[var41];
							var38 += field1304[var41];
							var39 += field1305[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field1297) {
							var35 -= field1301[var42];
							var36 -= field1302[var42];
							var37 -= field1303[var42];
							var38 -= field1304[var42];
							var39 -= field1305[var42];
						}

						if (var40 >= 1 && var40 < field1297 - 1 && (!field1306 || (field1308[0][var27][var40] & 0x2) != 0 || (field1308[var7][var27][var40] & 0x10) == 0 && method546(var7, var40, var27) == field1307)) {
							if (var7 < field1295) {
								field1295 = var7;
							}

							int var43 = field1311[var7][var27][var40] & 0xFF;
							int var44 = field1315[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field1317[var7][var27][var40];
								int var46 = field1317[var7][var27 + 1][var40];
								int var47 = field1317[var7][var27 + 1][var40 + 1];
								int var48 = field1317[var7][var27][var40 + 1];
								int var49 = field1299[var27][var40];
								int var50 = field1299[var27 + 1][var40];
								int var51 = field1299[var27 + 1][var40 + 1];
								int var52 = field1299[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method543(var55, var56, var57);
									var55 = field1298 + var55 & 0xFF;
									var57 += field1316;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method543(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field1309[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !EHKXAJCO.field703[var44 - 1].field708) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field1313[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = GAGDRMEJ.field825[method550(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method32(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method550(var53, var49), method550(var53, var50), method550(var53, var51), method550(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field1309[var7][var27][var40] + 1;
									byte var61 = field1314[var7][var27][var40];
									EHKXAJCO var62 = EHKXAJCO.field703[var44 - 1];
									int var63 = var62.field706;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = GAGDRMEJ.method331(var63);
										var65 = -1;
									} else if (var62.field705 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method543(var62.field709, var62.field710, var62.field711);
										var64 = GAGDRMEJ.field825[method558(var62.field714, 96)];
									}

									arg0.method32(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method550(var53, var49), method550(var53, var50), method550(var53, var51), method550(var53, var52), method558(var65, var49), method558(var65, var50), method558(var65, var51), method558(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field1297 - 1; var66++) {
				for (int var67 = 1; var67 < field1296 - 1; var67++) {
					arg0.method31(var7, var67, var66, method546(var7, var66, var67));
				}
			}
		}

		arg0.method58(-10, -50, -50, 768, 64);

		for (int var68 = 0; var68 < field1296; var68++) {
			for (int var69 = 0; var69 < field1297; var69++) {
				if ((field1308[1][var68][var69] & 0x2) == 2) {
					arg0.method29(var68, var69);
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
				for (int var75 = 0; var75 <= field1297; var75++) {
					for (int var76 = 0; var76 <= field1296; var76++) {
						if ((field1313[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field1313[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field1297 && (field1313[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field1313[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field1313[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field1317[var80][var76][var77] - var84;
								int var86 = field1317[var79][var76][var77];
								BJATBFRK.method30(var76 * 128, var76 * 128, var78 * 128 + 128, var73, var85, var86, var77 * 128, 1);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field1313[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field1313[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field1313[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field1296 && (field1313[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field1313[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field1313[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field1317[var92][var89][var75] - var96;
								int var98 = field1317[var91][var89][var75];
								BJATBFRK.method30(var90 * 128 + 128, var89 * 128, var75 * 128, var73, var97, var98, var75 * 128, 2);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field1313[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field1313[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field1313[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field1297 && (field1313[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field1313[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field1296) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field1313[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field1317[var74][var101][var103];
								BJATBFRK.method30(var102 * 128 + 128, var101 * 128, var104 * 128 + 128, var73, var107, var107, var103 * 128, 4);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field1313[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("QQKEKZOD.a(I[LKZCDTFDB;I[BZIIIII)V")
	public final void method542(int arg0, KZCDTFDB[] arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg2 + var10 > 0 && arg2 + var10 < 103 && arg0 + var11 > 0 && arg0 + var11 < 103) {
					arg1[arg8].field1057[arg2 + var10][arg0 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		LZWRHABP var12 = new LZWRHABP(arg3);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg4 == var13 && var14 >= arg6 && var14 < arg6 + 8 && var15 >= arg7 && var15 < arg7 + 8) {
						method544(arg8, arg2 + XUKWZROH.method591(var14 & 0x7, var15 & 0x7, arg5), 0, 0, arg0 + XUKWZROH.method592(var15 & 0x7, arg5, var14 & 0x7), var12, arg5);
					} else {
						method544(0, -1, 0, 0, -1, var12, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("QQKEKZOD.a(III)I")
	public final int method543(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("QQKEKZOD.a(IIIIILLZWRHABP;BI)V")
	public final void method544(int arg0, int arg1, int arg2, int arg3, int arg4, LZWRHABP arg5, int arg6) {
		if (arg1 >= 0 && arg1 < 104 && arg4 >= 0 && arg4 < 104) {
			field1308[arg0][arg1][arg4] = 0;
			while (true) {
				int var8 = arg5.method463();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg5.method463();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg0 == 0) {
						field1317[0][arg1][arg4] = -var9 * 8;
						return;
					}

					field1317[arg0][arg1][arg4] = field1317[arg0 - 1][arg1][arg4] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field1315[arg0][arg1][arg4] = arg5.method464();
					field1309[arg0][arg1][arg4] = (byte) ((var8 - 2) / 4);
					field1314[arg0][arg1][arg4] = (byte) (var8 + arg6 - 2 & 0x3);
				} else if (var8 <= 81) {
					field1308[arg0][arg1][arg4] = (byte) (var8 - 49);
				} else {
					field1311[arg0][arg1][arg4] = (byte) (var8 - 81);
				}
			}

			if (arg0 == 0) {
				field1317[0][arg1][arg4] = -method557(arg1 + arg2 + 932731, arg4 + 556238 + arg3) * 8;
			} else {
				field1317[arg0][arg1][arg4] = field1317[arg0 - 1][arg1][arg4] - 240;
			}
		} else {
			while (true) {
				int var10 = arg5.method463();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg5.method463();
					return;
				}

				if (var10 <= 49) {
					arg5.method463();
				}
			}
		}
	}

	@ObfuscatedName("QQKEKZOD.b(III)I")
	public static final int method545(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method559(var3, var5);
		int var8 = method559(var3 + 1, var5);
		int var9 = method559(var3, var5 + 1);
		int var10 = method559(var3 + 1, var5 + 1);
		int var11 = method556(var7, var8, var4, arg2);
		int var12 = method556(var9, var10, var4, arg2);
		return method556(var11, var12, var6, arg2);
	}

	@ObfuscatedName("QQKEKZOD.a(ZIII)I")
	public int method546(int arg0, int arg1, int arg2) {
		if ((field1308[arg0][arg2][arg1] & 0x8) != 0) {
			return 0;
		}

		if (arg0 > 0 && (field1308[1][arg2][arg1] & 0x2) != 0) {
			return arg0 - 1;
		}

		return arg0;
	}

	@ObfuscatedName("QQKEKZOD.a(II)I")
	public static final int method547(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("QQKEKZOD.a(LBJATBFRK;IZI[B[LKZCDTFDB;)V")
	public final void method548(BJATBFRK arg0, int arg1, int arg2, byte[] arg3, KZCDTFDB[] arg4) {
		LZWRHABP var6 = new LZWRHABP(arg3);
		int var7 = -1;
		while (true) {
			int var8 = var6.method477();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method477();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method463();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg1 + var12;
				int var18 = arg2 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field1308[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					KZCDTFDB var20 = null;
					if (var19 >= 0) {
						var20 = arg4[var19];
					}

					method549(var7, arg0, var15, var17, var16, var18, var20, var13);
				}
			}
		}
	}

	@ObfuscatedName("QQKEKZOD.a(IZLBJATBFRK;IIIILKZCDTFDB;I)V")
	public final void method549(int arg0, BJATBFRK arg1, int arg2, int arg3, int arg4, int arg5, KZCDTFDB arg6, int arg7) {
		if (field1306 && (field1308[0][arg3][arg5] & 0x2) == 0) {
			if ((field1308[arg7][arg3][arg5] & 0x10) != 0) {
				return;
			}

			if (method546(arg7, arg5, arg3) != field1307) {
				return;
			}
		}

		if (arg7 < field1295) {
			field1295 = arg7;
		}

		int var9 = field1317[arg7][arg3][arg5];
		int var10 = field1317[arg7][arg3 + 1][arg5];
		int var11 = field1317[arg7][arg3 + 1][arg5 + 1];
		int var12 = field1317[arg7][arg3][arg5 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		OEPVRTCC var14 = OEPVRTCC.method522(arg0);
		int var15 = (arg0 << 14) + (arg5 << 7) + arg3 + 0x40000000;
		if (!var14.field1208) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg4 << 6) + arg2);
		if (arg2 == 22) {
			if (!field1306 || var14.field1208 || var14.field1221) {
				ANJAEDVY var17;
				if (var14.field1248 == -1 && var14.field1250 == null) {
					var17 = var14.method513(22, arg4, var9, var10, var11, var12, -1);
				} else {
					var17 = new FIZEXPNW(var14.field1248, var9, true, arg0, 22, var12, var10, var11, arg4);
				}

				arg1.method33(var13, var17, var15, arg5, arg3, arg7, var16);

				if (var14.field1205 && var14.field1208 && arg6 != null) {
					arg6.method410(arg3, arg5);
				}
			}
		} else if (arg2 == 10 || arg2 == 11) {
			ANJAEDVY var18;
			if (var14.field1248 == -1 && var14.field1250 == null) {
				var18 = var14.method513(10, arg4, var9, var10, var11, var12, -1);
			} else {
				var18 = new FIZEXPNW(var14.field1248, var9, true, arg0, 10, var12, var10, var11, arg4);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg2 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg4 == 1 || arg4 == 3) {
					var20 = var14.field1230;
					var21 = var14.field1246;
				} else {
					var20 = var14.field1246;
					var21 = var14.field1230;
				}

				if (arg1.method37(var19, var13, var15, var20, arg7, var21, var16, var18, arg3, arg5) && var14.field1214) {
					LSSDQDBV var22;
					if (var18 instanceof LSSDQDBV) {
						var22 = (LSSDQDBV) var18;
					} else {
						var22 = var14.method513(10, arg4, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field1088 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field1318[arg7][arg3 + var23][arg5 + var24]) {
									field1318[arg7][arg3 + var23][arg5 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field1205 && arg6 != null) {
				arg6.method409(var14.field1246, var14.field1230, arg5, arg4, arg3, var14.field1228);
			}
		} else if (arg2 >= 12) {
			ANJAEDVY var26;
			if (var14.field1248 == -1 && var14.field1250 == null) {
				var26 = var14.method513(arg2, arg4, var9, var10, var11, var12, -1);
			} else {
				var26 = new FIZEXPNW(var14.field1248, var9, true, arg0, arg2, var12, var10, var11, arg4);
			}

			arg1.method37(0, var13, var15, 1, arg7, 1, var16, var26, arg3, arg5);

			if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg7 > 0) {
				field1313[arg7][arg3][arg5] |= 0x924;
			}

			if (var14.field1205 && arg6 != null) {
				arg6.method409(var14.field1246, var14.field1230, arg5, arg4, arg3, var14.field1228);
			}
		} else if (arg2 == 0) {
			ANJAEDVY var27;
			if (var14.field1248 == -1 && var14.field1250 == null) {
				var27 = var14.method513(0, arg4, var9, var10, var11, var12, -1);
			} else {
				var27 = new FIZEXPNW(var14.field1248, var9, true, arg0, 0, var12, var10, var11, arg4);
			}

			arg1.method35(arg7, var16, 0, arg5, arg3, var15, var13, field1300[arg4], var27, null);

			if (arg4 == 0) {
				if (var14.field1214) {
					field1318[arg7][arg3][arg5] = 50;
					field1318[arg7][arg3][arg5 + 1] = 50;
				}

				if (var14.field1220) {
					field1313[arg7][arg3][arg5] |= 0x249;
				}
			} else if (arg4 == 1) {
				if (var14.field1214) {
					field1318[arg7][arg3][arg5 + 1] = 50;
					field1318[arg7][arg3 + 1][arg5 + 1] = 50;
				}

				if (var14.field1220) {
					field1313[arg7][arg3][arg5 + 1] |= 0x492;
				}
			} else if (arg4 == 2) {
				if (var14.field1214) {
					field1318[arg7][arg3 + 1][arg5] = 50;
					field1318[arg7][arg3 + 1][arg5 + 1] = 50;
				}

				if (var14.field1220) {
					field1313[arg7][arg3 + 1][arg5] |= 0x249;
				}
			} else if (arg4 == 3) {
				if (var14.field1214) {
					field1318[arg7][arg3][arg5] = 50;
					field1318[arg7][arg3 + 1][arg5] = 50;
				}

				if (var14.field1220) {
					field1313[arg7][arg3][arg5] |= 0x492;
				}
			}

			if (var14.field1205 && arg6 != null) {
				arg6.method408(var14.field1228, arg3, arg5, arg4, arg2);
			}

			if (var14.field1213 != 16) {
				arg1.method43(arg5, arg7, var14.field1213, arg3);
			}
		} else if (arg2 == 1) {
			ANJAEDVY var28;
			if (var14.field1248 == -1 && var14.field1250 == null) {
				var28 = var14.method513(1, arg4, var9, var10, var11, var12, -1);
			} else {
				var28 = new FIZEXPNW(var14.field1248, var9, true, arg0, 1, var12, var10, var11, arg4);
			}

			arg1.method35(arg7, var16, 0, arg5, arg3, var15, var13, field1310[arg4], var28, null);

			if (var14.field1214) {
				if (arg4 == 0) {
					field1318[arg7][arg3][arg5 + 1] = 50;
				} else if (arg4 == 1) {
					field1318[arg7][arg3 + 1][arg5 + 1] = 50;
				} else if (arg4 == 2) {
					field1318[arg7][arg3 + 1][arg5] = 50;
				} else if (arg4 == 3) {
					field1318[arg7][arg3][arg5] = 50;
				}
			}

			if (var14.field1205 && arg6 != null) {
				arg6.method408(var14.field1228, arg3, arg5, arg4, arg2);
			}
		} else if (arg2 == 2) {
			int var29 = arg4 + 1 & 0x3;
			ANJAEDVY var30;
			ANJAEDVY var31;
			if (var14.field1248 == -1 && var14.field1250 == null) {
				var30 = var14.method513(2, arg4 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method513(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new FIZEXPNW(var14.field1248, var9, true, arg0, 2, var12, var10, var11, arg4 + 4);
				var31 = new FIZEXPNW(var14.field1248, var9, true, arg0, 2, var12, var10, var11, var29);
			}

			arg1.method35(arg7, var16, field1300[var29], arg5, arg3, var15, var13, field1300[arg4], var30, var31);

			if (var14.field1220) {
				if (arg4 == 0) {
					field1313[arg7][arg3][arg5] |= 0x249;
					field1313[arg7][arg3][arg5 + 1] |= 0x492;
				} else if (arg4 == 1) {
					field1313[arg7][arg3][arg5 + 1] |= 0x492;
					field1313[arg7][arg3 + 1][arg5] |= 0x249;
				} else if (arg4 == 2) {
					field1313[arg7][arg3 + 1][arg5] |= 0x249;
					field1313[arg7][arg3][arg5] |= 0x492;
				} else if (arg4 == 3) {
					field1313[arg7][arg3][arg5] |= 0x492;
					field1313[arg7][arg3][arg5] |= 0x249;
				}
			}

			if (var14.field1205 && arg6 != null) {
				arg6.method408(var14.field1228, arg3, arg5, arg4, arg2);
			}

			if (var14.field1213 != 16) {
				arg1.method43(arg5, arg7, var14.field1213, arg3);
			}
		} else if (arg2 == 3) {
			ANJAEDVY var32;
			if (var14.field1248 == -1 && var14.field1250 == null) {
				var32 = var14.method513(3, arg4, var9, var10, var11, var12, -1);
			} else {
				var32 = new FIZEXPNW(var14.field1248, var9, true, arg0, 3, var12, var10, var11, arg4);
			}

			arg1.method35(arg7, var16, 0, arg5, arg3, var15, var13, field1310[arg4], var32, null);

			if (var14.field1214) {
				if (arg4 == 0) {
					field1318[arg7][arg3][arg5 + 1] = 50;
				} else if (arg4 == 1) {
					field1318[arg7][arg3 + 1][arg5 + 1] = 50;
				} else if (arg4 == 2) {
					field1318[arg7][arg3 + 1][arg5] = 50;
				} else if (arg4 == 3) {
					field1318[arg7][arg3][arg5] = 50;
				}
			}

			if (var14.field1205 && arg6 != null) {
				arg6.method408(var14.field1228, arg3, arg5, arg4, arg2);
			}
		} else if (arg2 == 9) {
			ANJAEDVY var33;
			if (var14.field1248 == -1 && var14.field1250 == null) {
				var33 = var14.method513(arg2, arg4, var9, var10, var11, var12, -1);
			} else {
				var33 = new FIZEXPNW(var14.field1248, var9, true, arg0, arg2, var12, var10, var11, arg4);
			}

			arg1.method37(0, var13, var15, 1, arg7, 1, var16, var33, arg3, arg5);

			if (var14.field1205 && arg6 != null) {
				arg6.method409(var14.field1246, var14.field1230, arg5, arg4, arg3, var14.field1228);
			}
		} else {
			if (var14.field1216) {
				if (arg4 == 1) {
					int var34 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var9;
					var9 = var34;
				} else if (arg4 == 2) {
					int var35 = var12;
					var12 = var10;
					var10 = var35;
					int var36 = var11;
					var11 = var9;
					var9 = var36;
				} else if (arg4 == 3) {
					int var37 = var12;
					var12 = var9;
					var9 = var10;
					var10 = var11;
					var11 = var37;
				}
			}

			if (arg2 == 4) {
				ANJAEDVY var38;
				if (var14.field1248 == -1 && var14.field1250 == null) {
					var38 = var14.method513(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new FIZEXPNW(var14.field1248, var9, true, arg0, 4, var12, var10, var11, 0);
				}

				arg1.method36(arg4 * 512, arg5, 0, var38, arg3, arg7, 0, var15, field1300[arg4], var13, var16);
			} else if (arg2 == 5) {
				int var39 = 16;
				int var40 = arg1.method53(arg7, arg3, arg5);
				if (var40 > 0) {
					var39 = OEPVRTCC.method522(var40 >> 14 & 0x7FFF).field1213;
				}

				ANJAEDVY var41;
				if (var14.field1248 == -1 && var14.field1250 == null) {
					var41 = var14.method513(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new FIZEXPNW(var14.field1248, var9, true, arg0, 4, var12, var10, var11, 0);
				}

				arg1.method36(arg4 * 512, arg5, field1312[arg4] * var39, var41, arg3, arg7, field1319[arg4] * var39, var15, field1300[arg4], var13, var16);
			} else if (arg2 == 6) {
				ANJAEDVY var42;
				if (var14.field1248 == -1 && var14.field1250 == null) {
					var42 = var14.method513(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new FIZEXPNW(var14.field1248, var9, true, arg0, 4, var12, var10, var11, 0);
				}

				arg1.method36(arg4, arg5, 0, var42, arg3, arg7, 0, var15, 256, var13, var16);
			} else if (arg2 == 7) {
				ANJAEDVY var43;
				if (var14.field1248 == -1 && var14.field1250 == null) {
					var43 = var14.method513(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new FIZEXPNW(var14.field1248, var9, true, arg0, 4, var12, var10, var11, 0);
				}

				arg1.method36(arg4, arg5, 0, var43, arg3, arg7, 0, var15, 512, var13, var16);
			} else if (arg2 == 8) {
				ANJAEDVY var44;
				if (var14.field1248 == -1 && var14.field1250 == null) {
					var44 = var14.method513(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new FIZEXPNW(var14.field1248, var9, true, arg0, 4, var12, var10, var11, 0);
				}

				arg1.method36(arg4, arg5, 0, var44, arg3, arg7, 0, var15, 768, var13, var16);
			}
		}
	}

	@ObfuscatedName("QQKEKZOD.b(II)I")
	public static final int method550(int arg0, int arg1) {
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

	@ObfuscatedName("QQKEKZOD.a(II[LKZCDTFDB;III[B)V")
	public final void method551(int arg0, int arg1, KZCDTFDB[] arg2, int arg3, int arg4, byte[] arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg4 + var8 > 0 && arg4 + var8 < 103 && arg0 + var9 > 0 && arg0 + var9 < 103) {
						arg2[var7].field1057[arg4 + var8][arg0 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		LZWRHABP var10 = new LZWRHABP(arg5);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method544(var11, arg4 + var12, arg1, arg3, arg0 + var13, var10, 0);
				}
			}
		}
	}

	@ObfuscatedName("QQKEKZOD.a(IZIII[[[ILBJATBFRK;LKZCDTFDB;III)V")
	public static final void method552(int arg0, int arg1, int arg2, int arg3, int[][][] arg4, BJATBFRK arg5, KZCDTFDB arg6, int arg7, int arg8, int arg9) {
		int var10 = arg4[arg8][arg0][arg9];
		int var11 = arg4[arg8][arg0 + 1][arg9];
		int var12 = arg4[arg8][arg0 + 1][arg9 + 1];
		int var13 = arg4[arg8][arg0][arg9 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		OEPVRTCC var15 = OEPVRTCC.method522(arg3);
		int var16 = (arg3 << 14) + (arg9 << 7) + arg0 + 0x40000000;
		if (!var15.field1208) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg7 << 6) + arg1);
		if (arg1 == 22) {
			ANJAEDVY var18;
			if (var15.field1248 == -1 && var15.field1250 == null) {
				var18 = var15.method513(22, arg7, var10, var11, var12, var13, -1);
			} else {
				var18 = new FIZEXPNW(var15.field1248, var10, true, arg3, 22, var13, var11, var12, arg7);
			}

			arg5.method33(var14, var18, var16, arg9, arg0, arg2, var17);

			if (var15.field1205 && var15.field1208) {
				arg6.method410(arg0, arg9);
			}
		} else if (arg1 == 10 || arg1 == 11) {
			ANJAEDVY var19;
			if (var15.field1248 == -1 && var15.field1250 == null) {
				var19 = var15.method513(10, arg7, var10, var11, var12, var13, -1);
			} else {
				var19 = new FIZEXPNW(var15.field1248, var10, true, arg3, 10, var13, var11, var12, arg7);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg1 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg7 == 1 || arg7 == 3) {
					var21 = var15.field1230;
					var22 = var15.field1246;
				} else {
					var21 = var15.field1246;
					var22 = var15.field1230;
				}

				arg5.method37(var20, var14, var16, var21, arg2, var22, var17, var19, arg0, arg9);
			}

			if (var15.field1205) {
				arg6.method409(var15.field1246, var15.field1230, arg9, arg7, arg0, var15.field1228);
			}
		} else if (arg1 >= 12) {
			ANJAEDVY var23;
			if (var15.field1248 == -1 && var15.field1250 == null) {
				var23 = var15.method513(arg1, arg7, var10, var11, var12, var13, -1);
			} else {
				var23 = new FIZEXPNW(var15.field1248, var10, true, arg3, arg1, var13, var11, var12, arg7);
			}

			arg5.method37(0, var14, var16, 1, arg2, 1, var17, var23, arg0, arg9);

			if (var15.field1205) {
				arg6.method409(var15.field1246, var15.field1230, arg9, arg7, arg0, var15.field1228);
			}
		} else if (arg1 == 0) {
			ANJAEDVY var24;
			if (var15.field1248 == -1 && var15.field1250 == null) {
				var24 = var15.method513(0, arg7, var10, var11, var12, var13, -1);
			} else {
				var24 = new FIZEXPNW(var15.field1248, var10, true, arg3, 0, var13, var11, var12, arg7);
			}

			arg5.method35(arg2, var17, 0, arg9, arg0, var16, var14, field1300[arg7], var24, null);

			if (var15.field1205) {
				arg6.method408(var15.field1228, arg0, arg9, arg7, arg1);
			}
		} else if (arg1 == 1) {
			ANJAEDVY var25;
			if (var15.field1248 == -1 && var15.field1250 == null) {
				var25 = var15.method513(1, arg7, var10, var11, var12, var13, -1);
			} else {
				var25 = new FIZEXPNW(var15.field1248, var10, true, arg3, 1, var13, var11, var12, arg7);
			}

			arg5.method35(arg2, var17, 0, arg9, arg0, var16, var14, field1310[arg7], var25, null);

			if (var15.field1205) {
				arg6.method408(var15.field1228, arg0, arg9, arg7, arg1);
			}
		} else if (arg1 == 2) {
			int var26 = arg7 + 1 & 0x3;
			ANJAEDVY var27;
			ANJAEDVY var28;
			if (var15.field1248 == -1 && var15.field1250 == null) {
				var27 = var15.method513(2, arg7 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method513(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new FIZEXPNW(var15.field1248, var10, true, arg3, 2, var13, var11, var12, arg7 + 4);
				var28 = new FIZEXPNW(var15.field1248, var10, true, arg3, 2, var13, var11, var12, var26);
			}

			arg5.method35(arg2, var17, field1300[var26], arg9, arg0, var16, var14, field1300[arg7], var27, var28);

			if (var15.field1205) {
				arg6.method408(var15.field1228, arg0, arg9, arg7, arg1);
			}
		} else if (arg1 == 3) {
			ANJAEDVY var29;
			if (var15.field1248 == -1 && var15.field1250 == null) {
				var29 = var15.method513(3, arg7, var10, var11, var12, var13, -1);
			} else {
				var29 = new FIZEXPNW(var15.field1248, var10, true, arg3, 3, var13, var11, var12, arg7);
			}

			arg5.method35(arg2, var17, 0, arg9, arg0, var16, var14, field1310[arg7], var29, null);

			if (var15.field1205) {
				arg6.method408(var15.field1228, arg0, arg9, arg7, arg1);
			}
		} else if (arg1 == 9) {
			ANJAEDVY var30;
			if (var15.field1248 == -1 && var15.field1250 == null) {
				var30 = var15.method513(arg1, arg7, var10, var11, var12, var13, -1);
			} else {
				var30 = new FIZEXPNW(var15.field1248, var10, true, arg3, arg1, var13, var11, var12, arg7);
			}

			arg5.method37(0, var14, var16, 1, arg2, 1, var17, var30, arg0, arg9);

			if (var15.field1205) {
				arg6.method409(var15.field1246, var15.field1230, arg9, arg7, arg0, var15.field1228);
			}
		} else {
			if (var15.field1216) {
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

			if (arg1 == 4) {
				ANJAEDVY var35;
				if (var15.field1248 == -1 && var15.field1250 == null) {
					var35 = var15.method513(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new FIZEXPNW(var15.field1248, var10, true, arg3, 4, var13, var11, var12, 0);
				}

				arg5.method36(arg7 * 512, arg9, 0, var35, arg0, arg2, 0, var16, field1300[arg7], var14, var17);
			} else if (arg1 == 5) {
				int var36 = 16;
				int var37 = arg5.method53(arg2, arg0, arg9);
				if (var37 > 0) {
					var36 = OEPVRTCC.method522(var37 >> 14 & 0x7FFF).field1213;
				}

				ANJAEDVY var38;
				if (var15.field1248 == -1 && var15.field1250 == null) {
					var38 = var15.method513(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new FIZEXPNW(var15.field1248, var10, true, arg3, 4, var13, var11, var12, 0);
				}

				arg5.method36(arg7 * 512, arg9, field1312[arg7] * var36, var38, arg0, arg2, field1319[arg7] * var36, var16, field1300[arg7], var14, var17);
			} else if (arg1 == 6) {
				ANJAEDVY var39;
				if (var15.field1248 == -1 && var15.field1250 == null) {
					var39 = var15.method513(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new FIZEXPNW(var15.field1248, var10, true, arg3, 4, var13, var11, var12, 0);
				}

				arg5.method36(arg7, arg9, 0, var39, arg0, arg2, 0, var16, 256, var14, var17);
			} else if (arg1 == 7) {
				ANJAEDVY var40;
				if (var15.field1248 == -1 && var15.field1250 == null) {
					var40 = var15.method513(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new FIZEXPNW(var15.field1248, var10, true, arg3, 4, var13, var11, var12, 0);
				}

				arg5.method36(arg7, arg9, 0, var40, arg0, arg2, 0, var16, 512, var14, var17);
			} else if (arg1 == 8) {
				ANJAEDVY var41;
				if (var15.field1248 == -1 && var15.field1250 == null) {
					var41 = var15.method513(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new FIZEXPNW(var15.field1248, var10, true, arg3, 4, var13, var11, var12, 0);
				}

				arg5.method36(arg7, arg9, 0, var41, arg0, arg2, 0, var16, 768, var14, var17);
			}
		}
	}

	@ObfuscatedName("QQKEKZOD.a(III[B)Z")
	public static final boolean method553(int arg0, int arg1, byte[] arg2) {
		boolean var3 = true;
		LZWRHABP var4 = new LZWRHABP(arg2);
		int var5 = -1;
		while (true) {
			int var6 = var4.method477();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method477();
					if (var9 == 0) {
						break;
					}

					var4.method463();
				} else {
					int var10 = var4.method477();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method463() >> 2;
					int var14 = arg0 + var12;
					int var15 = arg1 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						OEPVRTCC var16 = OEPVRTCC.method522(var5);
						if (var13 != 22 || !field1306 || var16.field1208 || var16.field1221) {
							var3 &= var16.method514();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("QQKEKZOD.a(IZI)Z")
	public static final boolean method554(int arg0, int arg1) {
		OEPVRTCC var2 = OEPVRTCC.method522(arg0);

		if (arg1 == 11) {
			arg1 = 10;
		}

		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}

		return var2.method518(arg1);
	}

	public QQKEKZOD(int arg0, int arg1, int[][][] arg2, byte[][][] arg3) {
		field1295 = 99;
		field1296 = arg1;
		field1297 = arg0;
		field1317 = arg2;
		field1308 = arg3;
		field1311 = new byte[4][field1296][field1297];
		field1315 = new byte[4][field1296][field1297];
		field1309 = new byte[4][field1296][field1297];
		field1314 = new byte[4][field1296][field1297];
		field1313 = new int[4][field1296 + 1][field1297 + 1];
		field1318 = new byte[4][field1296 + 1][field1297 + 1];
		field1299 = new int[field1296 + 1][field1297 + 1];
		field1301 = new int[field1297];
		field1302 = new int[field1297];
		field1303 = new int[field1297];
		field1304 = new int[field1297];
		field1305 = new int[field1297];
	}

	@ObfuscatedName("QQKEKZOD.a(IIIBI)V")
	public final void method555(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg1; var5 <= arg1 + arg3; var5++) {
			for (int var6 = arg0; var6 <= arg0 + arg2; var6++) {
				if (var6 >= 0 && var6 < field1296 && var5 >= 0 && var5 < field1297) {
					field1318[0][var6][var5] = 127;

					if (arg0 == var6 && var6 > 0) {
						field1317[0][var6][var5] = field1317[0][var6 - 1][var5];
					}

					if (arg0 + arg2 == var6 && var6 < field1296 - 1) {
						field1317[0][var6][var5] = field1317[0][var6 + 1][var5];
					}

					if (arg1 == var5 && var5 > 0) {
						field1317[0][var6][var5] = field1317[0][var6][var5 - 1];
					}

					if (arg1 + arg3 == var5 && var5 < field1297 - 1) {
						field1317[0][var6][var5] = field1317[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("QQKEKZOD.a(IIII)I")
	public static final int method556(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - GAGDRMEJ.field814[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("QQKEKZOD.c(II)I")
	public static final int method557(int arg0, int arg1) {
		int var2 = method545(arg0 + 45365, arg1 + 91923, 4) + (method545(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method545(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("QQKEKZOD.d(II)I")
	public final int method558(int arg0, int arg1) {
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

	@ObfuscatedName("QQKEKZOD.e(II)I")
	public static final int method559(int arg0, int arg1) {
		int var2 = method547(arg0 - 1, arg1 - 1) + method547(arg0 + 1, arg1 - 1) + method547(arg0 - 1, arg1 + 1) + method547(arg0 + 1, arg1 + 1);
		int var3 = method547(arg0 - 1, arg1) + method547(arg0 + 1, arg1) + method547(arg0, arg1 - 1) + method547(arg0, arg1 + 1);
		int var4 = method547(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}
}
