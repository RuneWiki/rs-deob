package deob;

@ObfuscatedName("XAALPTAR")
public final class XAALPTAR {

	@ObfuscatedName("XAALPTAR.i")
	public int field1304;

	@ObfuscatedName("XAALPTAR.j")
	public int field1305;

	@ObfuscatedName("XAALPTAR.a")
	public int[][][] field1296;

	@ObfuscatedName("XAALPTAR.l")
	public byte[][][] field1307;

	@ObfuscatedName("XAALPTAR.e")
	public byte[][][] field1300;

	@ObfuscatedName("XAALPTAR.v")
	public byte[][][] field1311;

	@ObfuscatedName("XAALPTAR.E")
	public byte[][][] field1319;

	@ObfuscatedName("XAALPTAR.b")
	public byte[][][] field1297;

	@ObfuscatedName("XAALPTAR.f")
	public int[][][] field1301;

	@ObfuscatedName("XAALPTAR.C")
	public byte[][][] field1317;

	@ObfuscatedName("XAALPTAR.D")
	public int[][] field1318;

	@ObfuscatedName("XAALPTAR.x")
	public int[] field1312;

	@ObfuscatedName("XAALPTAR.y")
	public int[] field1313;

	@ObfuscatedName("XAALPTAR.z")
	public int[] field1314;

	@ObfuscatedName("XAALPTAR.A")
	public int[] field1315;

	@ObfuscatedName("XAALPTAR.B")
	public int[] field1316;

	@ObfuscatedName("XAALPTAR.c")
	public static final int[] field1298 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("XAALPTAR.d")
	public static final int[] field1299 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("XAALPTAR.h")
	public static int field1303 = 99;

	@ObfuscatedName("XAALPTAR.n")
	public static final int[] field1308 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("XAALPTAR.r")
	public static boolean field1309 = true;

	@ObfuscatedName("XAALPTAR.s")
	public static final int[] field1310 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("XAALPTAR.k")
	public static int field1306 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("XAALPTAR.F")
	public static int field1320 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("XAALPTAR.g")
	public static int field1302;

	@ObfuscatedName("XAALPTAR.a(III)Z")
	public static final boolean method492(int arg0, int arg1) {
		URZZBDTU var2 = URZZBDTU.method450(arg0);

		if (arg1 == 11) {
			arg1 = 10;
		}

		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}

		return var2.method449(arg1);
	}

	@ObfuscatedName("XAALPTAR.a(II)I")
	public final int method493(int arg0, int arg1) {
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

	@ObfuscatedName("XAALPTAR.a(BLYJCKMNKP;[LKQTHKTBC;)V")
	public final void method494(YJCKMNKP arg0, KQTHKTBC[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field1307[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field1307[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method286(var5, var4);
						}
					}
				}
			}
		}

		field1306 += (int) (Math.random() * 5.0D) - 2;
		if (field1306 < -8) {
			field1306 = -8;
		}

		if (field1306 > 8) {
			field1306 = 8;
		}

		field1320 += (int) (Math.random() * 5.0D) - 2;
		if (field1320 < -16) {
			field1320 = -16;
		}

		if (field1320 > 16) {
			field1320 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field1317[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field1305 - 1; var16++) {
				for (int var17 = 1; var17 < field1304 - 1; var17++) {
					int var18 = field1296[var7][var17 + 1][var16] - field1296[var7][var17 - 1][var16];
					int var19 = field1296[var7][var17][var16 + 1] - field1296[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field1318[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field1305; var26++) {
				field1312[var26] = 0;
				field1313[var26] = 0;
				field1314[var26] = 0;
				field1315[var26] = 0;
				field1316[var26] = 0;
			}

			for (int var27 = -5; var27 < field1304 + 5; var27++) {
				for (int var28 = 0; var28 < field1305; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field1304) {
						int var30 = field1300[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							ZVWMVAWM var31 = ZVWMVAWM.field1502[var30 - 1];
							field1312[var28] += var31.field1511;
							field1313[var28] += var31.field1509;
							field1314[var28] += var31.field1510;
							field1315[var28] += var31.field1512;
							field1316[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field1304) {
						int var33 = field1300[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							ZVWMVAWM var34 = ZVWMVAWM.field1502[var33 - 1];
							field1312[var28] -= var34.field1511;
							field1313[var28] -= var34.field1509;
							field1314[var28] -= var34.field1510;
							field1315[var28] -= var34.field1512;
							field1316[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field1304 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field1305 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field1305) {
							var35 += field1312[var41];
							var36 += field1313[var41];
							var37 += field1314[var41];
							var38 += field1315[var41];
							var39 += field1316[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field1305) {
							var35 -= field1312[var42];
							var36 -= field1313[var42];
							var37 -= field1314[var42];
							var38 -= field1315[var42];
							var39 -= field1316[var42];
						}

						if (var40 >= 1 && var40 < field1305 - 1 && (!field1309 || (field1307[0][var27][var40] & 0x2) != 0 || (field1307[var7][var27][var40] & 0x10) == 0 && method512(var40, var27, var7) == field1302)) {
							if (var7 < field1303) {
								field1303 = var7;
							}

							int var43 = field1300[var7][var27][var40] & 0xFF;
							int var44 = field1311[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field1296[var7][var27][var40];
								int var46 = field1296[var7][var27 + 1][var40];
								int var47 = field1296[var7][var27 + 1][var40 + 1];
								int var48 = field1296[var7][var27][var40 + 1];
								int var49 = field1318[var27][var40];
								int var50 = field1318[var27 + 1][var40];
								int var51 = field1318[var27 + 1][var40 + 1];
								int var52 = field1318[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method507(var55, var56, var57);
									var55 = field1306 + var55 & 0xFF;
									var57 += field1320;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method507(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field1319[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !ZVWMVAWM.field1502[var44 - 1].field1507) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field1301[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = XGNGXTLX.field1342[method506(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method547(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method506(var53, var49), method506(var53, var50), method506(var53, var51), method506(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field1319[var7][var27][var40] + 1;
									byte var61 = field1297[var7][var27][var40];
									ZVWMVAWM var62 = ZVWMVAWM.field1502[var44 - 1];
									int var63 = var62.field1505;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = XGNGXTLX.method520(var63);
										var65 = -1;
									} else if (var62.field1504 == 0xFF00FF) {
										var65 = -2;
										var63 = -1;
										var64 = XGNGXTLX.field1342[method493(var62.field1513, 96)];
									} else {
										var65 = method507(var62.field1508, var62.field1509, var62.field1510);
										var64 = XGNGXTLX.field1342[method493(var62.field1513, 96)];
									}

									arg0.method547(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method506(var53, var49), method506(var53, var50), method506(var53, var51), method506(var53, var52), method493(var65, var49), method493(var65, var50), method493(var65, var51), method493(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field1305 - 1; var66++) {
				for (int var67 = 1; var67 < field1304 - 1; var67++) {
					arg0.method546(var7, var67, var66, method512(var66, var67, var7));
				}
			}
		}

		arg0.method573(-50, -50, -10);

		for (int var68 = 0; var68 < field1304; var68++) {
			for (int var69 = 0; var69 < field1305; var69++) {
				if ((field1307[1][var68][var69] & 0x2) == 2) {
					arg0.method544(var68, var69);
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
				for (int var75 = 0; var75 <= field1305; var75++) {
					for (int var76 = 0; var76 <= field1304; var76++) {
						if ((field1301[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field1301[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field1305 && (field1301[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field1301[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field1301[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field1296[var80][var76][var77] - var84;
								int var86 = field1296[var79][var76][var77];
								YJCKMNKP.method545(var85, var73, var78 * 128 + 128, var76 * 128, var77 * 128, var86, var76 * 128, 1);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field1301[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field1301[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field1301[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field1304 && (field1301[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field1301[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field1301[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field1296[var92][var89][var75] - var96;
								int var98 = field1296[var91][var89][var75];
								YJCKMNKP.method545(var97, var73, var75 * 128, var90 * 128 + 128, var75 * 128, var98, var89 * 128, 2);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field1301[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field1301[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field1301[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field1305 && (field1301[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field1301[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field1304) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field1301[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field1296[var74][var101][var103];
								YJCKMNKP.method545(var107, var73, var104 * 128 + 128, var102 * 128 + 128, var103 * 128, var107, var101 * 128, 4);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field1301[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("XAALPTAR.b(III)I")
	public static final int method495(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method498(var3, var5);
		int var8 = method498(var3 + 1, var5);
		int var9 = method498(var3, var5 + 1);
		int var10 = method498(var3 + 1, var5 + 1);
		int var11 = method503(var7, var8, var4, arg2);
		int var12 = method503(var9, var10, var4, arg2);
		return method503(var11, var12, var6, arg2);
	}

	@ObfuscatedName("XAALPTAR.a(IIIBI)V")
	public final void method496(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg1; var5 <= arg1 + arg3; var5++) {
			for (int var6 = arg0; var6 <= arg0 + arg2; var6++) {
				if (var6 >= 0 && var6 < field1304 && var5 >= 0 && var5 < field1305) {
					field1317[0][var6][var5] = 127;

					if (arg0 == var6 && var6 > 0) {
						field1296[0][var6][var5] = field1296[0][var6 - 1][var5];
					}

					if (arg0 + arg2 == var6 && var6 < field1304 - 1) {
						field1296[0][var6][var5] = field1296[0][var6 + 1][var5];
					}

					if (arg1 == var5 && var5 > 0) {
						field1296[0][var6][var5] = field1296[0][var6][var5 - 1];
					}

					if (arg1 + arg3 == var5 && var5 < field1305 - 1) {
						field1296[0][var6][var5] = field1296[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("XAALPTAR.a([BIIZI[LKQTHKTBC;IILYJCKMNKP;II)V")
	public final void method497(byte[] arg0, int arg1, int arg2, int arg3, KQTHKTBC[] arg4, int arg5, int arg6, YJCKMNKP arg7, int arg8, int arg9) {
		RSWRPCHR var11 = new RSWRPCHR(arg0);
		int var12 = -1;
		while (true) {
			int var13 = var11.method402();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method402();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method388();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg8 == var18 && var17 >= arg6 && var17 < arg6 + 8 && var16 >= arg2 && var16 < arg2 + 8) {
					URZZBDTU var22 = URZZBDTU.method450(var12);
					int var23 = arg1 + YFQBSABU.method539(var21, var22.field1203, var16 & 0x7, arg5, var17 & 0x7, var22.field1174);
					int var24 = arg9 + YFQBSABU.method540(arg5, var17 & 0x7, var16 & 0x7, var22.field1174, var21, var22.field1203);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg3;
						if ((field1307[1][var23][var24] & 0x2) == 2) {
							var25 = arg3 - 1;
						}

						KQTHKTBC var26 = null;
						if (var25 >= 0) {
							var26 = arg4[var25];
						}

						method509(arg5 + var21 & 0x3, var23, var24, arg3, var12, var20, var26, arg7);
					}
				}
			}
		}
	}

	@ObfuscatedName("XAALPTAR.b(II)I")
	public static final int method498(int arg0, int arg1) {
		int var2 = method511(arg0 - 1, arg1 - 1) + method511(arg0 + 1, arg1 - 1) + method511(arg0 - 1, arg1 + 1) + method511(arg0 + 1, arg1 + 1);
		int var3 = method511(arg0 - 1, arg1) + method511(arg0 + 1, arg1) + method511(arg0, arg1 - 1) + method511(arg0, arg1 + 1);
		int var4 = method511(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("XAALPTAR.a(I[BIZ)Z")
	public static final boolean method499(int arg0, byte[] arg1, int arg2) {
		boolean var3 = true;
		RSWRPCHR var4 = new RSWRPCHR(arg1);
		int var5 = -1;
		while (true) {
			int var6 = var4.method402();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method402();
					if (var9 == 0) {
						break;
					}

					var4.method388();
				} else {
					int var10 = var4.method402();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method388() >> 2;
					int var14 = arg0 + var12;
					int var15 = arg2 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						URZZBDTU var16 = URZZBDTU.method450(var5);
						if (var13 != 22 || !field1309 || var16.field1162 || var16.field1187) {
							var3 &= var16.method453();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("XAALPTAR.c(II)I")
	public static final int method500(int arg0, int arg1) {
		int var2 = method495(arg0 + 45365, arg1 + 91923, 4) + (method495(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method495(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("XAALPTAR.a(IIII)V")
	public final void method501(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 8; var4++) {
			for (int var5 = 0; var5 < 8; var5++) {
				field1296[arg2][arg0 + var4][arg1 + var5] = 0;
			}
		}

		if (arg0 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				field1296[arg2][arg0][arg1 + var6] = field1296[arg2][arg0 - 1][arg1 + var6];
			}
		}

		if (arg1 > 0) {
			for (int var7 = 1; var7 < 8; var7++) {
				field1296[arg2][arg0 + var7][arg1] = field1296[arg2][arg0 + var7][arg1 - 1];
			}
		}

		if (arg0 > 0 && field1296[arg2][arg0 - 1][arg1] != 0) {
			field1296[arg2][arg0][arg1] = field1296[arg2][arg0 - 1][arg1];
		} else if (arg1 > 0 && field1296[arg2][arg0][arg1 - 1] != 0) {
			field1296[arg2][arg0][arg1] = field1296[arg2][arg0][arg1 - 1];
		} else if (arg0 > 0 && arg1 > 0 && field1296[arg2][arg0 - 1][arg1 - 1] != 0) {
			field1296[arg2][arg0][arg1] = field1296[arg2][arg0 - 1][arg1 - 1];
		}
	}

	@ObfuscatedName("XAALPTAR.a(II[LKQTHKTBC;IIIZI[BI)V")
	public final void method502(int arg0, int arg1, KQTHKTBC[] arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg3 + var10 > 0 && arg3 + var10 < 103 && arg4 + var11 > 0 && arg4 + var11 < 103) {
					arg2[arg6].field797[arg3 + var10][arg4 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		RSWRPCHR var12 = new RSWRPCHR(arg7);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg0 == var13 && var14 >= arg8 && var14 < arg8 + 8 && var15 >= arg1 && var15 < arg1 + 8) {
						method508(0, arg3 + YFQBSABU.method537(arg5, var14 & 0x7, var15 & 0x7), 0, arg4 + YFQBSABU.method538(arg5, var15 & 0x7, var14 & 0x7), arg6, var12, arg5);
					} else {
						method508(0, -1, 0, -1, 0, var12, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("XAALPTAR.b(IIII)I")
	public static final int method503(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - XGNGXTLX.field1331[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("XAALPTAR.a(LRSWRPCHR;ZLQJAHKUCY;)V")
	public static final void method504(RSWRPCHR arg0, QJAHKUCY arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method402();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			URZZBDTU var4 = URZZBDTU.method450(var2);
			var4.method454(arg1);

			while (true) {
				int var5 = arg0.method402();
				if (var5 == 0) {
					break;
				}

				arg0.method388();
			}
		}
	}

	@ObfuscatedName("XAALPTAR.a(IIZ[LKQTHKTBC;LYJCKMNKP;[B)V")
	public final void method505(int arg0, int arg1, KQTHKTBC[] arg2, YJCKMNKP arg3, byte[] arg4) {
		RSWRPCHR var6 = new RSWRPCHR(arg4);
		int var7 = -1;
		while (true) {
			int var8 = var6.method402();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method402();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method388();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg0 + var12;
				int var18 = arg1 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field1307[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					KQTHKTBC var20 = null;
					if (var19 >= 0) {
						var20 = arg2[var19];
					}

					method509(var16, var17, var18, var13, var7, var15, var20, arg3);
				}
			}
		}
	}

	@ObfuscatedName("XAALPTAR.d(II)I")
	public static final int method506(int arg0, int arg1) {
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

	@ObfuscatedName("XAALPTAR.c(III)I")
	public final int method507(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("XAALPTAR.a(IIIIIILRSWRPCHR;I)V")
	public final void method508(int arg0, int arg1, int arg2, int arg3, int arg4, RSWRPCHR arg5, int arg6) {
		if (arg1 >= 0 && arg1 < 104 && arg3 >= 0 && arg3 < 104) {
			field1307[arg4][arg1][arg3] = 0;
			while (true) {
				int var8 = arg5.method388();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg5.method388();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg4 == 0) {
						field1296[0][arg1][arg3] = -var9 * 8;
						return;
					}

					field1296[arg4][arg1][arg3] = field1296[arg4 - 1][arg1][arg3] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field1311[arg4][arg1][arg3] = arg5.method389();
					field1319[arg4][arg1][arg3] = (byte) ((var8 - 2) / 4);
					field1297[arg4][arg1][arg3] = (byte) (var8 + arg6 - 2 & 0x3);
				} else if (var8 <= 81) {
					field1307[arg4][arg1][arg3] = (byte) (var8 - 49);
				} else {
					field1300[arg4][arg1][arg3] = (byte) (var8 - 81);
				}
			}

			if (arg4 == 0) {
				field1296[0][arg1][arg3] = -method500(arg1 + arg2 + 932731, arg3 + 556238 + arg0) * 8;
			} else {
				field1296[arg4][arg1][arg3] = field1296[arg4 - 1][arg1][arg3] - 240;
			}
		} else {
			while (true) {
				int var10 = arg5.method388();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg5.method388();
					return;
				}

				if (var10 <= 49) {
					arg5.method388();
				}
			}
		}
	}

	@ObfuscatedName("XAALPTAR.a(IIIIIIILKQTHKTBC;LYJCKMNKP;)V")
	public final void method509(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, KQTHKTBC arg6, YJCKMNKP arg7) {
		if (field1309 && (field1307[0][arg1][arg2] & 0x2) == 0) {
			if ((field1307[arg3][arg1][arg2] & 0x10) != 0) {
				return;
			}

			if (method512(arg2, arg1, arg3) != field1302) {
				return;
			}
		}

		if (arg3 < field1303) {
			field1303 = arg3;
		}

		int var9 = field1296[arg3][arg1][arg2];
		int var10 = field1296[arg3][arg1 + 1][arg2];
		int var11 = field1296[arg3][arg1 + 1][arg2 + 1];
		int var12 = field1296[arg3][arg1][arg2 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		URZZBDTU var14 = URZZBDTU.method450(arg4);
		int var15 = (arg4 << 14) + (arg2 << 7) + arg1 + 0x40000000;
		if (!var14.field1162) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg0 << 6) + arg5);
		if (arg5 == 22) {
			if (!field1309 || var14.field1162 || var14.field1187) {
				ESJLSSWI var17;
				if (var14.field1194 == -1 && var14.field1168 == null) {
					var17 = var14.method457(22, arg0, var9, var10, var11, var12, -1);
				} else {
					var17 = new QMMKOHGT(var11, arg4, arg0, 22, var12, var10, var14.field1194, var9, true);
				}

				arg7.method548(var15, arg1, var13, arg2, arg3, var16, var17);

				if (var14.field1163 && var14.field1162 && arg6 != null) {
					arg6.method286(arg2, arg1);
				}
			}
		} else if (arg5 == 10 || arg5 == 11) {
			ESJLSSWI var18;
			if (var14.field1194 == -1 && var14.field1168 == null) {
				var18 = var14.method457(10, arg0, var9, var10, var11, var12, -1);
			} else {
				var18 = new QMMKOHGT(var11, arg4, arg0, 10, var12, var10, var14.field1194, var9, true);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg5 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg0 == 1 || arg0 == 3) {
					var20 = var14.field1174;
					var21 = var14.field1203;
				} else {
					var20 = var14.field1203;
					var21 = var14.field1174;
				}

				if (arg7.method552(var19, arg2, var18, arg3, var20, arg1, var16, var21, var13, var15) && var14.field1177) {
					WRJMHIDY var22;
					if (var18 instanceof WRJMHIDY) {
						var22 = (WRJMHIDY) var18;
					} else {
						var22 = var14.method457(10, arg0, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field1253 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field1317[arg3][arg1 + var23][arg2 + var24]) {
									field1317[arg3][arg1 + var23][arg2 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field1163 && arg6 != null) {
				arg6.method285(arg2, var14.field1174, arg0, var14.field1202, arg1, var14.field1203);
			}
		} else if (arg5 >= 12) {
			ESJLSSWI var26;
			if (var14.field1194 == -1 && var14.field1168 == null) {
				var26 = var14.method457(arg5, arg0, var9, var10, var11, var12, -1);
			} else {
				var26 = new QMMKOHGT(var11, arg4, arg0, arg5, var12, var10, var14.field1194, var9, true);
			}

			arg7.method552(0, arg2, var26, arg3, 1, arg1, var16, 1, var13, var15);

			if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg3 > 0) {
				field1301[arg3][arg1][arg2] |= 0x924;
			}

			if (var14.field1163 && arg6 != null) {
				arg6.method285(arg2, var14.field1174, arg0, var14.field1202, arg1, var14.field1203);
			}
		} else if (arg5 == 0) {
			ESJLSSWI var27;
			if (var14.field1194 == -1 && var14.field1168 == null) {
				var27 = var14.method457(0, arg0, var9, var10, var11, var12, -1);
			} else {
				var27 = new QMMKOHGT(var11, arg4, arg0, 0, var12, var10, var14.field1194, var9, true);
			}

			arg7.method550(null, arg1, arg2, field1299[arg0], arg3, var16, var15, var27, 0, var13);

			if (arg0 == 0) {
				if (var14.field1177) {
					field1317[arg3][arg1][arg2] = 50;
					field1317[arg3][arg1][arg2 + 1] = 50;
				}

				if (var14.field1188) {
					field1301[arg3][arg1][arg2] |= 0x249;
				}
			} else if (arg0 == 1) {
				if (var14.field1177) {
					field1317[arg3][arg1][arg2 + 1] = 50;
					field1317[arg3][arg1 + 1][arg2 + 1] = 50;
				}

				if (var14.field1188) {
					field1301[arg3][arg1][arg2 + 1] |= 0x492;
				}
			} else if (arg0 == 2) {
				if (var14.field1177) {
					field1317[arg3][arg1 + 1][arg2] = 50;
					field1317[arg3][arg1 + 1][arg2 + 1] = 50;
				}

				if (var14.field1188) {
					field1301[arg3][arg1 + 1][arg2] |= 0x249;
				}
			} else if (arg0 == 3) {
				if (var14.field1177) {
					field1317[arg3][arg1][arg2] = 50;
					field1317[arg3][arg1 + 1][arg2] = 50;
				}

				if (var14.field1188) {
					field1301[arg3][arg1][arg2] |= 0x492;
				}
			}

			if (var14.field1163 && arg6 != null) {
				arg6.method284(arg5, arg1, var14.field1202, arg2, arg0);
			}

			if (var14.field1178 != 16) {
				arg7.method558(arg3, var14.field1178, arg2, arg1);
			}
		} else if (arg5 == 1) {
			ESJLSSWI var28;
			if (var14.field1194 == -1 && var14.field1168 == null) {
				var28 = var14.method457(1, arg0, var9, var10, var11, var12, -1);
			} else {
				var28 = new QMMKOHGT(var11, arg4, arg0, 1, var12, var10, var14.field1194, var9, true);
			}

			arg7.method550(null, arg1, arg2, field1308[arg0], arg3, var16, var15, var28, 0, var13);

			if (var14.field1177) {
				if (arg0 == 0) {
					field1317[arg3][arg1][arg2 + 1] = 50;
				} else if (arg0 == 1) {
					field1317[arg3][arg1 + 1][arg2 + 1] = 50;
				} else if (arg0 == 2) {
					field1317[arg3][arg1 + 1][arg2] = 50;
				} else if (arg0 == 3) {
					field1317[arg3][arg1][arg2] = 50;
				}
			}

			if (var14.field1163 && arg6 != null) {
				arg6.method284(arg5, arg1, var14.field1202, arg2, arg0);
			}
		} else if (arg5 == 2) {
			int var29 = arg0 + 1 & 0x3;
			ESJLSSWI var30;
			ESJLSSWI var31;
			if (var14.field1194 == -1 && var14.field1168 == null) {
				var30 = var14.method457(2, arg0 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method457(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new QMMKOHGT(var11, arg4, arg0 + 4, 2, var12, var10, var14.field1194, var9, true);
				var31 = new QMMKOHGT(var11, arg4, var29, 2, var12, var10, var14.field1194, var9, true);
			}

			arg7.method550(var31, arg1, arg2, field1299[arg0], arg3, var16, var15, var30, field1299[var29], var13);

			if (var14.field1188) {
				if (arg0 == 0) {
					field1301[arg3][arg1][arg2] |= 0x249;
					field1301[arg3][arg1][arg2 + 1] |= 0x492;
				} else if (arg0 == 1) {
					field1301[arg3][arg1][arg2 + 1] |= 0x492;
					field1301[arg3][arg1 + 1][arg2] |= 0x249;
				} else if (arg0 == 2) {
					field1301[arg3][arg1 + 1][arg2] |= 0x249;
					field1301[arg3][arg1][arg2] |= 0x492;
				} else if (arg0 == 3) {
					field1301[arg3][arg1][arg2] |= 0x492;
					field1301[arg3][arg1][arg2] |= 0x249;
				}
			}

			if (var14.field1163 && arg6 != null) {
				arg6.method284(arg5, arg1, var14.field1202, arg2, arg0);
			}

			if (var14.field1178 != 16) {
				arg7.method558(arg3, var14.field1178, arg2, arg1);
			}
		} else if (arg5 == 3) {
			ESJLSSWI var32;
			if (var14.field1194 == -1 && var14.field1168 == null) {
				var32 = var14.method457(3, arg0, var9, var10, var11, var12, -1);
			} else {
				var32 = new QMMKOHGT(var11, arg4, arg0, 3, var12, var10, var14.field1194, var9, true);
			}

			arg7.method550(null, arg1, arg2, field1308[arg0], arg3, var16, var15, var32, 0, var13);

			if (var14.field1177) {
				if (arg0 == 0) {
					field1317[arg3][arg1][arg2 + 1] = 50;
				} else if (arg0 == 1) {
					field1317[arg3][arg1 + 1][arg2 + 1] = 50;
				} else if (arg0 == 2) {
					field1317[arg3][arg1 + 1][arg2] = 50;
				} else if (arg0 == 3) {
					field1317[arg3][arg1][arg2] = 50;
				}
			}

			if (var14.field1163 && arg6 != null) {
				arg6.method284(arg5, arg1, var14.field1202, arg2, arg0);
			}
		} else if (arg5 == 9) {
			ESJLSSWI var33;
			if (var14.field1194 == -1 && var14.field1168 == null) {
				var33 = var14.method457(arg5, arg0, var9, var10, var11, var12, -1);
			} else {
				var33 = new QMMKOHGT(var11, arg4, arg0, arg5, var12, var10, var14.field1194, var9, true);
			}

			arg7.method552(0, arg2, var33, arg3, 1, arg1, var16, 1, var13, var15);

			if (var14.field1163 && arg6 != null) {
				arg6.method285(arg2, var14.field1174, arg0, var14.field1202, arg1, var14.field1203);
			}
		} else {
			if (var14.field1165) {
				if (arg0 == 1) {
					int var34 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var9;
					var9 = var34;
				} else if (arg0 == 2) {
					int var35 = var12;
					var12 = var10;
					var10 = var35;
					int var36 = var11;
					var11 = var9;
					var9 = var36;
				} else if (arg0 == 3) {
					int var37 = var12;
					var12 = var9;
					var9 = var10;
					var10 = var11;
					var11 = var37;
				}
			}

			if (arg5 == 4) {
				ESJLSSWI var38;
				if (var14.field1194 == -1 && var14.field1168 == null) {
					var38 = var14.method457(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new QMMKOHGT(var11, arg4, 0, 4, var12, var10, var14.field1194, var9, true);
				}

				arg7.method551(var13, arg3, arg1, var15, 0, arg0 * 512, var16, arg2, var38, 0, field1299[arg0]);
			} else if (arg5 == 5) {
				int var39 = 16;
				int var40 = arg7.method568(arg3, arg1, arg2);
				if (var40 > 0) {
					var39 = URZZBDTU.method450(var40 >> 14 & 0x7FFF).field1178;
				}

				ESJLSSWI var41;
				if (var14.field1194 == -1 && var14.field1168 == null) {
					var41 = var14.method457(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new QMMKOHGT(var11, arg4, 0, 4, var12, var10, var14.field1194, var9, true);
				}

				arg7.method551(var13, arg3, arg1, var15, field1298[arg0] * var39, arg0 * 512, var16, arg2, var41, field1310[arg0] * var39, field1299[arg0]);
			} else if (arg5 == 6) {
				ESJLSSWI var42;
				if (var14.field1194 == -1 && var14.field1168 == null) {
					var42 = var14.method457(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new QMMKOHGT(var11, arg4, 0, 4, var12, var10, var14.field1194, var9, true);
				}

				arg7.method551(var13, arg3, arg1, var15, 0, arg0, var16, arg2, var42, 0, 256);
			} else if (arg5 == 7) {
				ESJLSSWI var43;
				if (var14.field1194 == -1 && var14.field1168 == null) {
					var43 = var14.method457(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new QMMKOHGT(var11, arg4, 0, 4, var12, var10, var14.field1194, var9, true);
				}

				arg7.method551(var13, arg3, arg1, var15, 0, arg0, var16, arg2, var43, 0, 512);
			} else if (arg5 == 8) {
				ESJLSSWI var44;
				if (var14.field1194 == -1 && var14.field1168 == null) {
					var44 = var14.method457(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new QMMKOHGT(var11, arg4, 0, 4, var12, var10, var14.field1194, var9, true);
				}

				arg7.method551(var13, arg3, arg1, var15, 0, arg0, var16, arg2, var44, 0, 768);
			}
		}
	}

	@ObfuscatedName("XAALPTAR.a(III[[[IIBIIILYJCKMNKP;LKQTHKTBC;)V")
	public static final void method510(int arg0, int arg1, int arg2, int[][][] arg3, int arg4, int arg5, int arg6, int arg7, YJCKMNKP arg8, KQTHKTBC arg9) {
		int var10 = arg3[arg2][arg0][arg7];
		int var11 = arg3[arg2][arg0 + 1][arg7];
		int var12 = arg3[arg2][arg0 + 1][arg7 + 1];
		int var13 = arg3[arg2][arg0][arg7 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		URZZBDTU var15 = URZZBDTU.method450(arg6);
		int var16 = (arg6 << 14) + (arg7 << 7) + arg0 + 0x40000000;
		if (!var15.field1162) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg5 << 6) + arg4);
		if (arg4 == 22) {
			ESJLSSWI var18;
			if (var15.field1194 == -1 && var15.field1168 == null) {
				var18 = var15.method457(22, arg5, var10, var11, var12, var13, -1);
			} else {
				var18 = new QMMKOHGT(var12, arg6, arg5, 22, var13, var11, var15.field1194, var10, true);
			}

			arg8.method548(var16, arg0, var14, arg7, arg1, var17, var18);

			if (var15.field1163 && var15.field1162) {
				arg9.method286(arg7, arg0);
			}
		} else if (arg4 == 10 || arg4 == 11) {
			ESJLSSWI var19;
			if (var15.field1194 == -1 && var15.field1168 == null) {
				var19 = var15.method457(10, arg5, var10, var11, var12, var13, -1);
			} else {
				var19 = new QMMKOHGT(var12, arg6, arg5, 10, var13, var11, var15.field1194, var10, true);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg4 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg5 == 1 || arg5 == 3) {
					var21 = var15.field1174;
					var22 = var15.field1203;
				} else {
					var21 = var15.field1203;
					var22 = var15.field1174;
				}

				arg8.method552(var20, arg7, var19, arg1, var21, arg0, var17, var22, var14, var16);
			}

			if (var15.field1163) {
				arg9.method285(arg7, var15.field1174, arg5, var15.field1202, arg0, var15.field1203);
			}
		} else if (arg4 >= 12) {
			ESJLSSWI var23;
			if (var15.field1194 == -1 && var15.field1168 == null) {
				var23 = var15.method457(arg4, arg5, var10, var11, var12, var13, -1);
			} else {
				var23 = new QMMKOHGT(var12, arg6, arg5, arg4, var13, var11, var15.field1194, var10, true);
			}

			arg8.method552(0, arg7, var23, arg1, 1, arg0, var17, 1, var14, var16);

			if (var15.field1163) {
				arg9.method285(arg7, var15.field1174, arg5, var15.field1202, arg0, var15.field1203);
			}
		} else if (arg4 == 0) {
			ESJLSSWI var24;
			if (var15.field1194 == -1 && var15.field1168 == null) {
				var24 = var15.method457(0, arg5, var10, var11, var12, var13, -1);
			} else {
				var24 = new QMMKOHGT(var12, arg6, arg5, 0, var13, var11, var15.field1194, var10, true);
			}

			arg8.method550(null, arg0, arg7, field1299[arg5], arg1, var17, var16, var24, 0, var14);

			if (var15.field1163) {
				arg9.method284(arg4, arg0, var15.field1202, arg7, arg5);
			}
		} else if (arg4 == 1) {
			ESJLSSWI var25;
			if (var15.field1194 == -1 && var15.field1168 == null) {
				var25 = var15.method457(1, arg5, var10, var11, var12, var13, -1);
			} else {
				var25 = new QMMKOHGT(var12, arg6, arg5, 1, var13, var11, var15.field1194, var10, true);
			}

			arg8.method550(null, arg0, arg7, field1308[arg5], arg1, var17, var16, var25, 0, var14);

			if (var15.field1163) {
				arg9.method284(arg4, arg0, var15.field1202, arg7, arg5);
			}
		} else if (arg4 == 2) {
			int var26 = arg5 + 1 & 0x3;
			ESJLSSWI var27;
			ESJLSSWI var28;
			if (var15.field1194 == -1 && var15.field1168 == null) {
				var27 = var15.method457(2, arg5 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method457(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new QMMKOHGT(var12, arg6, arg5 + 4, 2, var13, var11, var15.field1194, var10, true);
				var28 = new QMMKOHGT(var12, arg6, var26, 2, var13, var11, var15.field1194, var10, true);
			}

			arg8.method550(var28, arg0, arg7, field1299[arg5], arg1, var17, var16, var27, field1299[var26], var14);

			if (var15.field1163) {
				arg9.method284(arg4, arg0, var15.field1202, arg7, arg5);
			}
		} else if (arg4 == 3) {
			ESJLSSWI var29;
			if (var15.field1194 == -1 && var15.field1168 == null) {
				var29 = var15.method457(3, arg5, var10, var11, var12, var13, -1);
			} else {
				var29 = new QMMKOHGT(var12, arg6, arg5, 3, var13, var11, var15.field1194, var10, true);
			}

			arg8.method550(null, arg0, arg7, field1308[arg5], arg1, var17, var16, var29, 0, var14);

			if (var15.field1163) {
				arg9.method284(arg4, arg0, var15.field1202, arg7, arg5);
			}
		} else if (arg4 == 9) {
			ESJLSSWI var30;
			if (var15.field1194 == -1 && var15.field1168 == null) {
				var30 = var15.method457(arg4, arg5, var10, var11, var12, var13, -1);
			} else {
				var30 = new QMMKOHGT(var12, arg6, arg5, arg4, var13, var11, var15.field1194, var10, true);
			}

			arg8.method552(0, arg7, var30, arg1, 1, arg0, var17, 1, var14, var16);

			if (var15.field1163) {
				arg9.method285(arg7, var15.field1174, arg5, var15.field1202, arg0, var15.field1203);
			}
		} else {
			if (var15.field1165) {
				if (arg5 == 1) {
					int var31 = var13;
					var13 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var31;
				} else if (arg5 == 2) {
					int var32 = var13;
					var13 = var11;
					var11 = var32;
					int var33 = var12;
					var12 = var10;
					var10 = var33;
				} else if (arg5 == 3) {
					int var34 = var13;
					var13 = var10;
					var10 = var11;
					var11 = var12;
					var12 = var34;
				}
			}

			if (arg4 == 4) {
				ESJLSSWI var35;
				if (var15.field1194 == -1 && var15.field1168 == null) {
					var35 = var15.method457(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new QMMKOHGT(var12, arg6, 0, 4, var13, var11, var15.field1194, var10, true);
				}

				arg8.method551(var14, arg1, arg0, var16, 0, arg5 * 512, var17, arg7, var35, 0, field1299[arg5]);
			} else if (arg4 == 5) {
				int var36 = 16;
				int var37 = arg8.method568(arg1, arg0, arg7);
				if (var37 > 0) {
					var36 = URZZBDTU.method450(var37 >> 14 & 0x7FFF).field1178;
				}

				ESJLSSWI var38;
				if (var15.field1194 == -1 && var15.field1168 == null) {
					var38 = var15.method457(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new QMMKOHGT(var12, arg6, 0, 4, var13, var11, var15.field1194, var10, true);
				}

				arg8.method551(var14, arg1, arg0, var16, field1298[arg5] * var36, arg5 * 512, var17, arg7, var38, field1310[arg5] * var36, field1299[arg5]);
			} else if (arg4 == 6) {
				ESJLSSWI var39;
				if (var15.field1194 == -1 && var15.field1168 == null) {
					var39 = var15.method457(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new QMMKOHGT(var12, arg6, 0, 4, var13, var11, var15.field1194, var10, true);
				}

				arg8.method551(var14, arg1, arg0, var16, 0, arg5, var17, arg7, var39, 0, 256);
			} else if (arg4 == 7) {
				ESJLSSWI var40;
				if (var15.field1194 == -1 && var15.field1168 == null) {
					var40 = var15.method457(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new QMMKOHGT(var12, arg6, 0, 4, var13, var11, var15.field1194, var10, true);
				}

				arg8.method551(var14, arg1, arg0, var16, 0, arg5, var17, arg7, var40, 0, 512);
			} else if (arg4 == 8) {
				ESJLSSWI var41;
				if (var15.field1194 == -1 && var15.field1168 == null) {
					var41 = var15.method457(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new QMMKOHGT(var12, arg6, 0, 4, var13, var11, var15.field1194, var10, true);
				}

				arg8.method551(var14, arg1, arg0, var16, 0, arg5, var17, arg7, var41, 0, 768);
			}
		}
	}

	@ObfuscatedName("XAALPTAR.e(II)I")
	public static final int method511(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	public XAALPTAR(byte[][][] arg0, int arg1, int arg2, int[][][] arg3) {
		field1303 = 99;
		field1304 = arg2;
		field1305 = arg1;
		field1296 = arg3;
		field1307 = arg0;
		field1300 = new byte[4][field1304][field1305];
		field1311 = new byte[4][field1304][field1305];
		field1319 = new byte[4][field1304][field1305];
		field1297 = new byte[4][field1304][field1305];
		field1301 = new int[4][field1304 + 1][field1305 + 1];
		field1317 = new byte[4][field1304 + 1][field1305 + 1];
		field1318 = new int[field1304 + 1][field1305 + 1];
		field1312 = new int[field1305];
		field1313 = new int[field1305];
		field1314 = new int[field1305];
		field1315 = new int[field1305];
		field1316 = new int[field1305];
	}

	@ObfuscatedName("XAALPTAR.c(IIII)I")
	public int method512(int arg0, int arg1, int arg2) {
		if ((field1307[arg2][arg1][arg0] & 0x8) != 0) {
			return 0;
		}

		if (arg2 > 0 && (field1307[1][arg1][arg0] & 0x2) != 0) {
			return arg2 - 1;
		}

		return arg2;
	}

	@ObfuscatedName("XAALPTAR.a(I[BZ[LKQTHKTBC;III)V")
	public final void method513(int arg0, byte[] arg1, KQTHKTBC[] arg2, int arg3, int arg4, int arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg3 + var8 > 0 && arg3 + var8 < 103 && arg0 + var9 > 0 && arg0 + var9 < 103) {
						arg2[var7].field797[arg3 + var8][arg0 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		RSWRPCHR var10 = new RSWRPCHR(arg1);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method508(arg4, arg3 + var12, arg5, arg0 + var13, var11, var10, 0);
				}
			}
		}
	}
}
