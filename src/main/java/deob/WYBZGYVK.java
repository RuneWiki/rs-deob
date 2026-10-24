package deob;

@ObfuscatedName("WYBZGYVK")
public final class WYBZGYVK {

	@ObfuscatedName("WYBZGYVK.x")
	public int field1393;

	@ObfuscatedName("WYBZGYVK.y")
	public int field1394;

	@ObfuscatedName("WYBZGYVK.p")
	public int[][][] field1386;

	@ObfuscatedName("WYBZGYVK.u")
	public byte[][][] field1390;

	@ObfuscatedName("WYBZGYVK.z")
	public byte[][][] field1395;

	@ObfuscatedName("WYBZGYVK.A")
	public byte[][][] field1396;

	@ObfuscatedName("WYBZGYVK.c")
	public byte[][][] field1374;

	@ObfuscatedName("WYBZGYVK.v")
	public byte[][][] field1391;

	@ObfuscatedName("WYBZGYVK.t")
	public int[][][] field1389;

	@ObfuscatedName("WYBZGYVK.s")
	public byte[][][] field1388;

	@ObfuscatedName("WYBZGYVK.o")
	public int[][] field1385;

	@ObfuscatedName("WYBZGYVK.d")
	public int[] field1375;

	@ObfuscatedName("WYBZGYVK.e")
	public int[] field1376;

	@ObfuscatedName("WYBZGYVK.f")
	public int[] field1377;

	@ObfuscatedName("WYBZGYVK.g")
	public int[] field1378;

	@ObfuscatedName("WYBZGYVK.h")
	public int[] field1379;

	@ObfuscatedName("WYBZGYVK.a")
	public static final int[] field1373 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("WYBZGYVK.k")
	public static boolean field1381 = true;

	@ObfuscatedName("WYBZGYVK.l")
	public static final int[] field1382 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("WYBZGYVK.n")
	public static final int[] field1384 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("WYBZGYVK.w")
	public static final int[] field1392 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("WYBZGYVK.m")
	public static int field1383 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("WYBZGYVK.r")
	public static int field1387 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("WYBZGYVK.i")
	public static int field1380;

	@ObfuscatedName("WYBZGYVK.a(III)I")
	public final int method556(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("WYBZGYVK.a(II)I")
	public static final int method557(int arg0, int arg1) {
		int var2 = method566(arg0 + 45365, arg1 + 91923, 4) + (method566(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method566(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("WYBZGYVK.a([LEMCOJCFH;LQLFNWQSF;I)V")
	public final void method558(EMCOJCFH[] arg0, QLFNWQSF arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field1390[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field1390[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg0[var6].method208(var5, var4);
						}
					}
				}
			}
		}

		field1383 += (int) (Math.random() * 5.0D) - 2;
		if (field1383 < -8) {
			field1383 = -8;
		}

		if (field1383 > 8) {
			field1383 = 8;
		}

		field1387 += (int) (Math.random() * 5.0D) - 2;
		if (field1387 < -16) {
			field1387 = -16;
		}

		if (field1387 > 16) {
			field1387 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field1388[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field1394 - 1; var16++) {
				for (int var17 = 1; var17 < field1393 - 1; var17++) {
					int var18 = field1386[var7][var17 + 1][var16] - field1386[var7][var17 - 1][var16];
					int var19 = field1386[var7][var17][var16 + 1] - field1386[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field1385[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field1394; var26++) {
				field1375[var26] = 0;
				field1376[var26] = 0;
				field1377[var26] = 0;
				field1378[var26] = 0;
				field1379[var26] = 0;
			}

			for (int var27 = -5; var27 < field1393 + 5; var27++) {
				for (int var28 = 0; var28 < field1394; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field1393) {
						int var30 = field1395[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							NPCMYHWE var31 = NPCMYHWE.field917[var30 - 1];
							field1375[var28] += var31.field926;
							field1376[var28] += var31.field924;
							field1377[var28] += var31.field925;
							field1378[var28] += var31.field927;
							field1379[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field1393) {
						int var33 = field1395[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							NPCMYHWE var34 = NPCMYHWE.field917[var33 - 1];
							field1375[var28] -= var34.field926;
							field1376[var28] -= var34.field924;
							field1377[var28] -= var34.field925;
							field1378[var28] -= var34.field927;
							field1379[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field1393 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field1394 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field1394) {
							var35 += field1375[var41];
							var36 += field1376[var41];
							var37 += field1377[var41];
							var38 += field1378[var41];
							var39 += field1379[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field1394) {
							var35 -= field1375[var42];
							var36 -= field1376[var42];
							var37 -= field1377[var42];
							var38 -= field1378[var42];
							var39 -= field1379[var42];
						}

						if (var40 >= 1 && var40 < field1394 - 1 && (!field1381 || (field1390[var7][var27][var40] & 0x10) == 0 && method569(var7, var27, var40) == field1380)) {
							int var43 = field1395[var7][var27][var40] & 0xFF;
							int var44 = field1396[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field1386[var7][var27][var40];
								int var46 = field1386[var7][var27 + 1][var40];
								int var47 = field1386[var7][var27 + 1][var40 + 1];
								int var48 = field1386[var7][var27][var40 + 1];
								int var49 = field1385[var27][var40];
								int var50 = field1385[var27 + 1][var40];
								int var51 = field1385[var27 + 1][var40 + 1];
								int var52 = field1385[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method556(var55, var56, var57);
									var55 = field1383 + var55 & 0xFF;
									var57 += field1387;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method556(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field1374[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !NPCMYHWE.field917[var44 - 1].field922) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field1389[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = CUVGZBEX.field619[method570(var54, 96)];
								}

								if (var44 == 0) {
									arg1.method416(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method570(var53, var49), method570(var53, var50), method570(var53, var51), method570(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field1374[var7][var27][var40] + 1;
									byte var61 = field1391[var7][var27][var40];
									NPCMYHWE var62 = NPCMYHWE.field917[var44 - 1];
									int var63 = var62.field920;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = CUVGZBEX.method178(var63);
										var65 = -1;
									} else if (var62.field919 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method556(var62.field923, var62.field924, var62.field925);
										var64 = CUVGZBEX.field619[method563(var62.field928, 96)];
									}

									arg1.method416(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method570(var53, var49), method570(var53, var50), method570(var53, var51), method570(var53, var52), method563(var65, var49), method563(var65, var50), method563(var65, var51), method563(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field1394 - 1; var66++) {
				for (int var67 = 1; var67 < field1393 - 1; var67++) {
					arg1.method415(var7, var67, var66, method569(var7, var67, var66));
				}
			}
		}

		arg1.method442(-50, -10, -50, 64, 768);

		for (int var68 = 0; var68 < field1393; var68++) {
			for (int var69 = 0; var69 < field1394; var69++) {
				if ((field1390[1][var68][var69] & 0x2) == 2) {
					arg1.method413(var69, var68);
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
				for (int var75 = 0; var75 <= field1394; var75++) {
					for (int var76 = 0; var76 <= field1393; var76++) {
						if ((field1389[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field1389[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field1394 && (field1389[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label321: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field1389[var79 - 1][var76][var81] & var70) == 0) {
										break label321;
									}
								}

								var79--;
							}

							label310: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field1389[var80 + 1][var76][var82] & var70) == 0) {
										break label310;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field1386[var80][var76][var77] - var84;
								int var86 = field1386[var79][var76][var77];
								QLFNWQSF.method414(var76 * 128, var76 * 128, var73, var78 * 128 + 128, var77 * 128, var85, var86, 1);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field1389[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field1389[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field1389[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field1393 && (field1389[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label374: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field1389[var91 - 1][var93][var75] & var71) == 0) {
										break label374;
									}
								}

								var91--;
							}

							label363: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field1389[var92 + 1][var94][var75] & var71) == 0) {
										break label363;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field1386[var92][var89][var75] - var96;
								int var98 = field1386[var91][var89][var75];
								QLFNWQSF.method414(var90 * 128 + 128, var89 * 128, var73, var75 * 128, var75 * 128, var97, var98, 2);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field1389[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field1389[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field1389[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field1394 && (field1389[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label427: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field1389[var74][var101 - 1][var105] & var72) == 0) {
										break label427;
									}
								}

								var101--;
							}

							label416: while (var102 < field1393) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field1389[var74][var102 + 1][var106] & var72) == 0) {
										break label416;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field1386[var74][var101][var103];
								QLFNWQSF.method414(var102 * 128 + 128, var101 * 128, var73, var104 * 128 + 128, var103 * 128, var107, var107, 4);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field1389[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("WYBZGYVK.a(IIII[BIII[LEMCOJCFH;LQLFNWQSF;I)V")
	public final void method559(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, EMCOJCFH[] arg8, QLFNWQSF arg9) {
		GLMIQHJI var11 = new GLMIQHJI(arg4);
		int var12 = -1;
		while (true) {
			int var13 = var11.method258();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method258();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method244();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg6 == var18 && var17 >= arg5 && var17 < arg5 + 8 && var16 >= arg7 && var16 < arg7 + 8) {
					RFUKTMBK var22 = RFUKTMBK.method472(var12);
					int var23 = arg2 + GYWJXMKQ.method283(arg1, var22.field1053, var16 & 0x7, var22.field1082, var17 & 0x7);
					int var24 = arg0 + GYWJXMKQ.method284(var17 & 0x7, var22.field1053, var22.field1082, var16 & 0x7, arg1);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = var18;
						if ((field1390[1][var23][var24] & 0x2) == 2) {
							var25 = var18 - 1;
						}

						EMCOJCFH var26 = null;
						if (var25 >= 0) {
							var26 = arg8[var25];
						}

						method568(var23, var18, var12, var24, var20, var26, arg9, arg1 + var21 & 0x3);
					}
				}
			}
		}
	}

	@ObfuscatedName("WYBZGYVK.b(II)I")
	public static final int method560(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("WYBZGYVK.a(II[LEMCOJCFH;LQLFNWQSF;[BI)V")
	public final void method561(int arg0, EMCOJCFH[] arg1, QLFNWQSF arg2, byte[] arg3, int arg4) {
		GLMIQHJI var6 = new GLMIQHJI(arg3);
		int var7 = -1;
		while (true) {
			int var8 = var6.method258();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method258();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method244();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg0 + var12;
				int var18 = arg4 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field1390[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					EMCOJCFH var20 = null;
					if (var19 >= 0) {
						var20 = arg1[var19];
					}

					method568(var17, var13, var7, var18, var15, var20, arg2, var16);
				}
			}
		}
	}

	public WYBZGYVK(int[][][] arg0, int arg1, int arg2, byte[][][] arg3) {
		field1393 = arg2;
		field1394 = arg1;
		field1386 = arg0;
		field1390 = arg3;
		field1395 = new byte[4][field1393][field1394];
		field1396 = new byte[4][field1393][field1394];
		field1374 = new byte[4][field1393][field1394];
		field1391 = new byte[4][field1393][field1394];
		field1389 = new int[4][field1393 + 1][field1394 + 1];
		field1388 = new byte[4][field1393 + 1][field1394 + 1];
		field1385 = new int[field1393 + 1][field1394 + 1];
		field1375 = new int[field1394];
		field1376 = new int[field1394];
		field1377 = new int[field1394];
		field1378 = new int[field1394];
		field1379 = new int[field1394];
	}

	@ObfuscatedName("WYBZGYVK.c(II)I")
	public static final int method562(int arg0, int arg1) {
		int var2 = method560(arg0 - 1, arg1 - 1) + method560(arg0 + 1, arg1 - 1) + method560(arg0 - 1, arg1 + 1) + method560(arg0 + 1, arg1 + 1);
		int var3 = method560(arg0 - 1, arg1) + method560(arg0 + 1, arg1) + method560(arg0, arg1 - 1) + method560(arg0, arg1 + 1);
		int var4 = method560(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("WYBZGYVK.d(II)I")
	public final int method563(int arg0, int arg1) {
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

	@ObfuscatedName("WYBZGYVK.a(LLNOSHUMO;ILGLMIQHJI;)V")
	public static final void method564(LNOSHUMO arg0, GLMIQHJI arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg1.method258();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			RFUKTMBK var4 = RFUKTMBK.method472(var2);
			var4.method464(arg0);

			while (true) {
				int var5 = arg1.method258();
				if (var5 == 0) {
					break;
				}

				arg1.method244();
			}
		}
	}

	@ObfuscatedName("WYBZGYVK.a(IIZII)V")
	public final void method565(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg1; var5 <= arg1 + arg2; var5++) {
			for (int var6 = arg3; var6 <= arg0 + arg3; var6++) {
				if (var6 >= 0 && var6 < field1393 && var5 >= 0 && var5 < field1394) {
					field1388[0][var6][var5] = 127;

					if (arg3 == var6 && var6 > 0) {
						field1386[0][var6][var5] = field1386[0][var6 - 1][var5];
					}

					if (arg0 + arg3 == var6 && var6 < field1393 - 1) {
						field1386[0][var6][var5] = field1386[0][var6 + 1][var5];
					}

					if (arg1 == var5 && var5 > 0) {
						field1386[0][var6][var5] = field1386[0][var6][var5 - 1];
					}

					if (arg1 + arg2 == var5 && var5 < field1394 - 1) {
						field1386[0][var6][var5] = field1386[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("WYBZGYVK.b(III)I")
	public static final int method566(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method562(var3, var5);
		int var8 = method562(var3 + 1, var5);
		int var9 = method562(var3, var5 + 1);
		int var10 = method562(var3 + 1, var5 + 1);
		int var11 = method572(var7, var8, var4, arg2);
		int var12 = method572(var9, var10, var4, arg2);
		return method572(var11, var12, var6, arg2);
	}

	@ObfuscatedName("WYBZGYVK.a(II[[[IIILQLFNWQSF;IIILEMCOJCFH;I)V")
	public static final void method567(int arg0, int arg1, int[][][] arg2, int arg3, QLFNWQSF arg4, int arg5, int arg6, int arg7, EMCOJCFH arg8, int arg9) {
		int var10 = arg2[arg5][arg6][arg9];
		int var11 = arg2[arg5][arg6 + 1][arg9];
		int var12 = arg2[arg5][arg6 + 1][arg9 + 1];
		int var13 = arg2[arg5][arg6][arg9 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		RFUKTMBK var15 = RFUKTMBK.method472(arg3);
		int var16 = (arg3 << 14) + (arg9 << 7) + arg6 + 0x40000000;
		if (!var15.field1038) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg0 << 6) + arg7);
		if (arg7 == 22) {
			PJUTMHMD var18;
			if (var15.field1037 == -1 && var15.field1055 == null) {
				var18 = var15.method462(22, arg0, var10, var11, var12, var13, -1);
			} else {
				var18 = new XWNQXFLX(22, var11, var10, var12, true, var15.field1037, arg0, var13, arg3);
			}

			arg4.method417(arg6, var14, var17, var16, arg9, var18, arg1);

			if (var15.field1058 && var15.field1038) {
				arg8.method208(arg9, arg6);
			}
		} else if (arg7 == 10 || arg7 == 11) {
			PJUTMHMD var19;
			if (var15.field1037 == -1 && var15.field1055 == null) {
				var19 = var15.method462(10, arg0, var10, var11, var12, var13, -1);
			} else {
				var19 = new XWNQXFLX(10, var11, var10, var12, true, var15.field1037, arg0, var13, arg3);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg7 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg0 == 1 || arg0 == 3) {
					var21 = var15.field1053;
					var22 = var15.field1082;
				} else {
					var21 = var15.field1082;
					var22 = var15.field1053;
				}

				arg4.method421(var21, arg1, var20, var14, var17, var22, var16, arg6, arg9, var19);
			}

			if (var15.field1058) {
				arg8.method207(var15.field1053, var15.field1082, arg9, var15.field1064, arg0, arg6);
			}
		} else if (arg7 >= 12) {
			PJUTMHMD var23;
			if (var15.field1037 == -1 && var15.field1055 == null) {
				var23 = var15.method462(arg7, arg0, var10, var11, var12, var13, -1);
			} else {
				var23 = new XWNQXFLX(arg7, var11, var10, var12, true, var15.field1037, arg0, var13, arg3);
			}

			arg4.method421(1, arg1, 0, var14, var17, 1, var16, arg6, arg9, var23);

			if (var15.field1058) {
				arg8.method207(var15.field1053, var15.field1082, arg9, var15.field1064, arg0, arg6);
			}
		} else if (arg7 == 0) {
			PJUTMHMD var24;
			if (var15.field1037 == -1 && var15.field1055 == null) {
				var24 = var15.method462(0, arg0, var10, var11, var12, var13, -1);
			} else {
				var24 = new XWNQXFLX(0, var11, var10, var12, true, var15.field1037, arg0, var13, arg3);
			}

			arg4.method419(var17, 0, var16, arg1, null, var24, arg9, arg6, var14, field1382[arg0]);

			if (var15.field1058) {
				arg8.method206(arg7, arg9, arg6, var15.field1064, arg0);
			}
		} else if (arg7 == 1) {
			PJUTMHMD var25;
			if (var15.field1037 == -1 && var15.field1055 == null) {
				var25 = var15.method462(1, arg0, var10, var11, var12, var13, -1);
			} else {
				var25 = new XWNQXFLX(1, var11, var10, var12, true, var15.field1037, arg0, var13, arg3);
			}

			arg4.method419(var17, 0, var16, arg1, null, var25, arg9, arg6, var14, field1373[arg0]);

			if (var15.field1058) {
				arg8.method206(arg7, arg9, arg6, var15.field1064, arg0);
			}
		} else if (arg7 == 2) {
			int var26 = arg0 + 1 & 0x3;
			PJUTMHMD var27;
			PJUTMHMD var28;
			if (var15.field1037 == -1 && var15.field1055 == null) {
				var27 = var15.method462(2, arg0 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method462(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new XWNQXFLX(2, var11, var10, var12, true, var15.field1037, arg0 + 4, var13, arg3);
				var28 = new XWNQXFLX(2, var11, var10, var12, true, var15.field1037, var26, var13, arg3);
			}

			arg4.method419(var17, field1382[var26], var16, arg1, var28, var27, arg9, arg6, var14, field1382[arg0]);

			if (var15.field1058) {
				arg8.method206(arg7, arg9, arg6, var15.field1064, arg0);
			}
		} else if (arg7 == 3) {
			PJUTMHMD var29;
			if (var15.field1037 == -1 && var15.field1055 == null) {
				var29 = var15.method462(3, arg0, var10, var11, var12, var13, -1);
			} else {
				var29 = new XWNQXFLX(3, var11, var10, var12, true, var15.field1037, arg0, var13, arg3);
			}

			arg4.method419(var17, 0, var16, arg1, null, var29, arg9, arg6, var14, field1373[arg0]);

			if (var15.field1058) {
				arg8.method206(arg7, arg9, arg6, var15.field1064, arg0);
			}
		} else if (arg7 == 9) {
			PJUTMHMD var30;
			if (var15.field1037 == -1 && var15.field1055 == null) {
				var30 = var15.method462(arg7, arg0, var10, var11, var12, var13, -1);
			} else {
				var30 = new XWNQXFLX(arg7, var11, var10, var12, true, var15.field1037, arg0, var13, arg3);
			}

			arg4.method421(1, arg1, 0, var14, var17, 1, var16, arg6, arg9, var30);

			if (var15.field1058) {
				arg8.method207(var15.field1053, var15.field1082, arg9, var15.field1064, arg0, arg6);
			}
		} else {
			if (var15.field1080) {
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

			if (arg7 == 4) {
				PJUTMHMD var35;
				if (var15.field1037 == -1 && var15.field1055 == null) {
					var35 = var15.method462(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new XWNQXFLX(4, var11, var10, var12, true, var15.field1037, 0, var13, arg3);
				}

				arg4.method420(var14, arg6, field1382[arg0], var17, var35, var16, arg1, arg0 * 512, arg9, 0, 0);
			} else if (arg7 == 5) {
				int var36 = 16;
				int var37 = arg4.method437(arg1, arg6, arg9);
				if (var37 > 0) {
					var36 = RFUKTMBK.method472(var37 >> 14 & 0x7FFF).field1054;
				}

				PJUTMHMD var38;
				if (var15.field1037 == -1 && var15.field1055 == null) {
					var38 = var15.method462(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new XWNQXFLX(4, var11, var10, var12, true, var15.field1037, 0, var13, arg3);
				}

				arg4.method420(var14, arg6, field1382[arg0], var17, var38, var16, arg1, arg0 * 512, arg9, field1384[arg0] * var36, field1392[arg0] * var36);
			} else if (arg7 == 6) {
				PJUTMHMD var39;
				if (var15.field1037 == -1 && var15.field1055 == null) {
					var39 = var15.method462(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new XWNQXFLX(4, var11, var10, var12, true, var15.field1037, 0, var13, arg3);
				}

				arg4.method420(var14, arg6, 256, var17, var39, var16, arg1, arg0, arg9, 0, 0);
			} else if (arg7 == 7) {
				PJUTMHMD var40;
				if (var15.field1037 == -1 && var15.field1055 == null) {
					var40 = var15.method462(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new XWNQXFLX(4, var11, var10, var12, true, var15.field1037, 0, var13, arg3);
				}

				arg4.method420(var14, arg6, 512, var17, var40, var16, arg1, arg0, arg9, 0, 0);
			} else if (arg7 == 8) {
				PJUTMHMD var41;
				if (var15.field1037 == -1 && var15.field1055 == null) {
					var41 = var15.method462(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new XWNQXFLX(4, var11, var10, var12, true, var15.field1037, 0, var13, arg3);
				}

				arg4.method420(var14, arg6, 768, var17, var41, var16, arg1, arg0, arg9, 0, 0);
			}
		}
	}

	@ObfuscatedName("WYBZGYVK.a(IIIIIILEMCOJCFH;LQLFNWQSF;I)V")
	public final void method568(int arg0, int arg1, int arg2, int arg3, int arg4, EMCOJCFH arg5, QLFNWQSF arg6, int arg7) {
		if (field1381) {
			if ((field1390[arg1][arg0][arg3] & 0x10) != 0) {
				return;
			}

			if (method569(arg1, arg0, arg3) != field1380) {
				return;
			}
		}

		int var9 = field1386[arg1][arg0][arg3];
		int var10 = field1386[arg1][arg0 + 1][arg3];
		int var11 = field1386[arg1][arg0 + 1][arg3 + 1];
		int var12 = field1386[arg1][arg0][arg3 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		RFUKTMBK var14 = RFUKTMBK.method472(arg2);
		int var15 = (arg2 << 14) + (arg3 << 7) + arg0 + 0x40000000;
		if (!var14.field1038) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg7 << 6) + arg4);
		if (arg4 == 22) {
			if (!field1381 || var14.field1038 || var14.field1077) {
				PJUTMHMD var17;
				if (var14.field1037 == -1 && var14.field1055 == null) {
					var17 = var14.method462(22, arg7, var9, var10, var11, var12, -1);
				} else {
					var17 = new XWNQXFLX(22, var10, var9, var11, true, var14.field1037, arg7, var12, arg2);
				}

				arg6.method417(arg0, var13, var16, var15, arg3, var17, arg1);

				if (var14.field1058 && var14.field1038 && arg5 != null) {
					arg5.method208(arg3, arg0);
				}
			}
		} else if (arg4 == 10 || arg4 == 11) {
			PJUTMHMD var18;
			if (var14.field1037 == -1 && var14.field1055 == null) {
				var18 = var14.method462(10, arg7, var9, var10, var11, var12, -1);
			} else {
				var18 = new XWNQXFLX(10, var10, var9, var11, true, var14.field1037, arg7, var12, arg2);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg4 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg7 == 1 || arg7 == 3) {
					var20 = var14.field1053;
					var21 = var14.field1082;
				} else {
					var20 = var14.field1082;
					var21 = var14.field1053;
				}

				if (arg6.method421(var20, arg1, var19, var13, var16, var21, var15, arg0, arg3, var18) && var14.field1075) {
					VHYCWIPJ var22;
					if (var18 instanceof VHYCWIPJ) {
						var22 = (VHYCWIPJ) var18;
					} else {
						var22 = var14.method462(10, arg7, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field1202 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field1388[arg1][arg0 + var23][arg3 + var24]) {
									field1388[arg1][arg0 + var23][arg3 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field1058 && arg5 != null) {
				arg5.method207(var14.field1053, var14.field1082, arg3, var14.field1064, arg7, arg0);
			}
		} else if (arg4 >= 12) {
			PJUTMHMD var26;
			if (var14.field1037 == -1 && var14.field1055 == null) {
				var26 = var14.method462(arg4, arg7, var9, var10, var11, var12, -1);
			} else {
				var26 = new XWNQXFLX(arg4, var10, var9, var11, true, var14.field1037, arg7, var12, arg2);
			}

			arg6.method421(1, arg1, 0, var13, var16, 1, var15, arg0, arg3, var26);

			if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg1 > 0) {
				field1389[arg1][arg0][arg3] |= 0x924;
			}

			if (var14.field1058 && arg5 != null) {
				arg5.method207(var14.field1053, var14.field1082, arg3, var14.field1064, arg7, arg0);
			}
		} else if (arg4 == 0) {
			PJUTMHMD var27;
			if (var14.field1037 == -1 && var14.field1055 == null) {
				var27 = var14.method462(0, arg7, var9, var10, var11, var12, -1);
			} else {
				var27 = new XWNQXFLX(0, var10, var9, var11, true, var14.field1037, arg7, var12, arg2);
			}

			arg6.method419(var16, 0, var15, arg1, null, var27, arg3, arg0, var13, field1382[arg7]);

			if (arg7 == 0) {
				if (var14.field1075) {
					field1388[arg1][arg0][arg3] = 50;
					field1388[arg1][arg0][arg3 + 1] = 50;
				}

				if (var14.field1074) {
					field1389[arg1][arg0][arg3] |= 0x249;
				}
			} else if (arg7 == 1) {
				if (var14.field1075) {
					field1388[arg1][arg0][arg3 + 1] = 50;
					field1388[arg1][arg0 + 1][arg3 + 1] = 50;
				}

				if (var14.field1074) {
					field1389[arg1][arg0][arg3 + 1] |= 0x492;
				}
			} else if (arg7 == 2) {
				if (var14.field1075) {
					field1388[arg1][arg0 + 1][arg3] = 50;
					field1388[arg1][arg0 + 1][arg3 + 1] = 50;
				}

				if (var14.field1074) {
					field1389[arg1][arg0 + 1][arg3] |= 0x249;
				}
			} else if (arg7 == 3) {
				if (var14.field1075) {
					field1388[arg1][arg0][arg3] = 50;
					field1388[arg1][arg0 + 1][arg3] = 50;
				}

				if (var14.field1074) {
					field1389[arg1][arg0][arg3] |= 0x492;
				}
			}

			if (var14.field1058 && arg5 != null) {
				arg5.method206(arg4, arg3, arg0, var14.field1064, arg7);
			}

			if (var14.field1054 != 16) {
				arg6.method427(arg1, var14.field1054, arg0, arg3);
			}
		} else if (arg4 == 1) {
			PJUTMHMD var28;
			if (var14.field1037 == -1 && var14.field1055 == null) {
				var28 = var14.method462(1, arg7, var9, var10, var11, var12, -1);
			} else {
				var28 = new XWNQXFLX(1, var10, var9, var11, true, var14.field1037, arg7, var12, arg2);
			}

			arg6.method419(var16, 0, var15, arg1, null, var28, arg3, arg0, var13, field1373[arg7]);

			if (var14.field1075) {
				if (arg7 == 0) {
					field1388[arg1][arg0][arg3 + 1] = 50;
				} else if (arg7 == 1) {
					field1388[arg1][arg0 + 1][arg3 + 1] = 50;
				} else if (arg7 == 2) {
					field1388[arg1][arg0 + 1][arg3] = 50;
				} else if (arg7 == 3) {
					field1388[arg1][arg0][arg3] = 50;
				}
			}

			if (var14.field1058 && arg5 != null) {
				arg5.method206(arg4, arg3, arg0, var14.field1064, arg7);
			}
		} else if (arg4 == 2) {
			int var29 = arg7 + 1 & 0x3;
			PJUTMHMD var30;
			PJUTMHMD var31;
			if (var14.field1037 == -1 && var14.field1055 == null) {
				var30 = var14.method462(2, arg7 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method462(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new XWNQXFLX(2, var10, var9, var11, true, var14.field1037, arg7 + 4, var12, arg2);
				var31 = new XWNQXFLX(2, var10, var9, var11, true, var14.field1037, var29, var12, arg2);
			}

			arg6.method419(var16, field1382[var29], var15, arg1, var31, var30, arg3, arg0, var13, field1382[arg7]);

			if (var14.field1074) {
				if (arg7 == 0) {
					field1389[arg1][arg0][arg3] |= 0x249;
					field1389[arg1][arg0][arg3 + 1] |= 0x492;
				} else if (arg7 == 1) {
					field1389[arg1][arg0][arg3 + 1] |= 0x492;
					field1389[arg1][arg0 + 1][arg3] |= 0x249;
				} else if (arg7 == 2) {
					field1389[arg1][arg0 + 1][arg3] |= 0x249;
					field1389[arg1][arg0][arg3] |= 0x492;
				} else if (arg7 == 3) {
					field1389[arg1][arg0][arg3] |= 0x492;
					field1389[arg1][arg0][arg3] |= 0x249;
				}
			}

			if (var14.field1058 && arg5 != null) {
				arg5.method206(arg4, arg3, arg0, var14.field1064, arg7);
			}

			if (var14.field1054 != 16) {
				arg6.method427(arg1, var14.field1054, arg0, arg3);
			}
		} else if (arg4 == 3) {
			PJUTMHMD var32;
			if (var14.field1037 == -1 && var14.field1055 == null) {
				var32 = var14.method462(3, arg7, var9, var10, var11, var12, -1);
			} else {
				var32 = new XWNQXFLX(3, var10, var9, var11, true, var14.field1037, arg7, var12, arg2);
			}

			arg6.method419(var16, 0, var15, arg1, null, var32, arg3, arg0, var13, field1373[arg7]);

			if (var14.field1075) {
				if (arg7 == 0) {
					field1388[arg1][arg0][arg3 + 1] = 50;
				} else if (arg7 == 1) {
					field1388[arg1][arg0 + 1][arg3 + 1] = 50;
				} else if (arg7 == 2) {
					field1388[arg1][arg0 + 1][arg3] = 50;
				} else if (arg7 == 3) {
					field1388[arg1][arg0][arg3] = 50;
				}
			}

			if (var14.field1058 && arg5 != null) {
				arg5.method206(arg4, arg3, arg0, var14.field1064, arg7);
			}
		} else if (arg4 == 9) {
			PJUTMHMD var33;
			if (var14.field1037 == -1 && var14.field1055 == null) {
				var33 = var14.method462(arg4, arg7, var9, var10, var11, var12, -1);
			} else {
				var33 = new XWNQXFLX(arg4, var10, var9, var11, true, var14.field1037, arg7, var12, arg2);
			}

			arg6.method421(1, arg1, 0, var13, var16, 1, var15, arg0, arg3, var33);

			if (var14.field1058 && arg5 != null) {
				arg5.method207(var14.field1053, var14.field1082, arg3, var14.field1064, arg7, arg0);
			}
		} else {
			if (var14.field1080) {
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

			if (arg4 == 4) {
				PJUTMHMD var38;
				if (var14.field1037 == -1 && var14.field1055 == null) {
					var38 = var14.method462(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new XWNQXFLX(4, var10, var9, var11, true, var14.field1037, 0, var12, arg2);
				}

				arg6.method420(var13, arg0, field1382[arg7], var16, var38, var15, arg1, arg7 * 512, arg3, 0, 0);
			} else if (arg4 == 5) {
				int var39 = 16;
				int var40 = arg6.method437(arg1, arg0, arg3);
				if (var40 > 0) {
					var39 = RFUKTMBK.method472(var40 >> 14 & 0x7FFF).field1054;
				}

				PJUTMHMD var41;
				if (var14.field1037 == -1 && var14.field1055 == null) {
					var41 = var14.method462(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new XWNQXFLX(4, var10, var9, var11, true, var14.field1037, 0, var12, arg2);
				}

				arg6.method420(var13, arg0, field1382[arg7], var16, var41, var15, arg1, arg7 * 512, arg3, field1384[arg7] * var39, field1392[arg7] * var39);
			} else if (arg4 == 6) {
				PJUTMHMD var42;
				if (var14.field1037 == -1 && var14.field1055 == null) {
					var42 = var14.method462(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new XWNQXFLX(4, var10, var9, var11, true, var14.field1037, 0, var12, arg2);
				}

				arg6.method420(var13, arg0, 256, var16, var42, var15, arg1, arg7, arg3, 0, 0);
			} else if (arg4 == 7) {
				PJUTMHMD var43;
				if (var14.field1037 == -1 && var14.field1055 == null) {
					var43 = var14.method462(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new XWNQXFLX(4, var10, var9, var11, true, var14.field1037, 0, var12, arg2);
				}

				arg6.method420(var13, arg0, 512, var16, var43, var15, arg1, arg7, arg3, 0, 0);
			} else if (arg4 == 8) {
				PJUTMHMD var44;
				if (var14.field1037 == -1 && var14.field1055 == null) {
					var44 = var14.method462(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new XWNQXFLX(4, var10, var9, var11, true, var14.field1037, 0, var12, arg2);
				}

				arg6.method420(var13, arg0, 768, var16, var44, var15, arg1, arg7, arg3, 0, 0);
			}
		}
	}

	@ObfuscatedName("WYBZGYVK.a(IIII)I")
	public int method569(int arg0, int arg1, int arg2) {
		if ((field1390[arg0][arg1][arg2] & 0x8) != 0) {
			return 0;
		}

		if (arg0 > 0 && (field1390[1][arg1][arg2] & 0x2) != 0) {
			return arg0 - 1;
		}

		return arg0;
	}

	@ObfuscatedName("WYBZGYVK.e(II)I")
	public static final int method570(int arg0, int arg1) {
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

	@ObfuscatedName("WYBZGYVK.a(IIIIIIILGLMIQHJI;)V")
	public final void method571(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, GLMIQHJI arg6) {
		if (arg2 >= 0 && arg2 < 104 && arg5 >= 0 && arg5 < 104) {
			field1390[arg4][arg2][arg5] = 0;
			while (true) {
				int var8 = arg6.method244();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg6.method244();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg4 == 0) {
						field1386[0][arg2][arg5] = -var9 * 8;
						return;
					}

					field1386[arg4][arg2][arg5] = field1386[arg4 - 1][arg2][arg5] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field1396[arg4][arg2][arg5] = arg6.method245();
					field1374[arg4][arg2][arg5] = (byte) ((var8 - 2) / 4);
					field1391[arg4][arg2][arg5] = (byte) (var8 + arg0 - 2 & 0x3);
				} else if (var8 <= 81) {
					field1390[arg4][arg2][arg5] = (byte) (var8 - 49);
				} else {
					field1395[arg4][arg2][arg5] = (byte) (var8 - 81);
				}
			}

			if (arg4 == 0) {
				field1386[0][arg2][arg5] = -method557(arg2 + arg3 + 932731, arg5 + 556238 + arg1) * 8;
			} else {
				field1386[arg4][arg2][arg5] = field1386[arg4 - 1][arg2][arg5] - 240;
			}
		} else {
			while (true) {
				int var10 = arg6.method244();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg6.method244();
					return;
				}

				if (var10 <= 49) {
					arg6.method244();
				}
			}
		}
	}

	@ObfuscatedName("WYBZGYVK.b(IIII)I")
	public static final int method572(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - CUVGZBEX.field608[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("WYBZGYVK.a([LEMCOJCFH;III[BII)V")
	public final void method573(EMCOJCFH[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg3 + var8 > 0 && arg3 + var8 < 103 && arg2 + var9 > 0 && arg2 + var9 < 103) {
						arg0[var7].field668[arg3 + var8][arg2 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		GLMIQHJI var10 = new GLMIQHJI(arg4);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method571(0, arg1, arg3 + var12, arg5, var11, arg2 + var13, var10);
				}
			}
		}
	}

	@ObfuscatedName("WYBZGYVK.a([BIBI)Z")
	public static final boolean method574(byte[] arg0, int arg1, int arg2) {
		boolean var3 = true;
		GLMIQHJI var4 = new GLMIQHJI(arg0);
		int var5 = -1;
		while (true) {
			int var6 = var4.method258();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method258();
					if (var9 == 0) {
						break;
					}

					var4.method244();
				} else {
					int var10 = var4.method258();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method244() >> 2;
					int var14 = arg1 + var12;
					int var15 = arg2 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						RFUKTMBK var16 = RFUKTMBK.method472(var5);
						if (var13 != 22 || !field1381 || var16.field1038 || var16.field1077) {
							var3 &= var16.method465();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("WYBZGYVK.a(IIIBIII[LEMCOJCFH;I[B)V")
	public final void method575(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, EMCOJCFH[] arg6, int arg7, byte[] arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg5 + var10 > 0 && arg5 + var10 < 103 && arg0 + var11 > 0 && arg0 + var11 < 103) {
					arg6[arg1].field668[arg5 + var10][arg0 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		GLMIQHJI var12 = new GLMIQHJI(arg8);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg2 == var13 && var14 >= arg7 && var14 < arg7 + 8 && var15 >= arg3 && var15 < arg3 + 8) {
						method571(arg4, 0, arg5 + GYWJXMKQ.method281(arg4, var15 & 0x7, var14 & 0x7), 0, arg1, arg0 + GYWJXMKQ.method282(arg4, var14 & 0x7, var15 & 0x7), var12);
					} else {
						method571(0, 0, -1, 0, 0, -1, var12);
					}
				}
			}
		}
	}

	@ObfuscatedName("WYBZGYVK.a(IBI)Z")
	public static final boolean method576(int arg0, int arg1) {
		RFUKTMBK var2 = RFUKTMBK.method472(arg0);

		if (arg1 == 11) {
			arg1 = 10;
		}

		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}

		return var2.method470(arg1);
	}
}
