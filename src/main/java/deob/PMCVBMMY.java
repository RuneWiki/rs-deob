package deob;

@ObfuscatedName("PMCVBMMY")
public final class PMCVBMMY {

	@ObfuscatedName("PMCVBMMY.q")
	public int field1112;

	@ObfuscatedName("PMCVBMMY.r")
	public int field1113;

	@ObfuscatedName("PMCVBMMY.j")
	public int[][][] field1107;

	@ObfuscatedName("PMCVBMMY.k")
	public byte[][][] field1108;

	@ObfuscatedName("PMCVBMMY.A")
	public byte[][][] field1119;

	@ObfuscatedName("PMCVBMMY.E")
	public byte[][][] field1122;

	@ObfuscatedName("PMCVBMMY.F")
	public byte[][][] field1123;

	@ObfuscatedName("PMCVBMMY.n")
	public byte[][][] field1109;

	@ObfuscatedName("PMCVBMMY.K")
	public int[][][] field1125;

	@ObfuscatedName("PMCVBMMY.z")
	public byte[][][] field1118;

	@ObfuscatedName("PMCVBMMY.u")
	public int[][] field1114;

	@ObfuscatedName("PMCVBMMY.e")
	public int[] field1102;

	@ObfuscatedName("PMCVBMMY.f")
	public int[] field1103;

	@ObfuscatedName("PMCVBMMY.g")
	public int[] field1104;

	@ObfuscatedName("PMCVBMMY.h")
	public int[] field1105;

	@ObfuscatedName("PMCVBMMY.i")
	public int[] field1106;

	@ObfuscatedName("PMCVBMMY.b")
	public static final int[] field1101 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("PMCVBMMY.o")
	public static boolean field1110 = true;

	@ObfuscatedName("PMCVBMMY.p")
	public static int field1111 = 99;

	@ObfuscatedName("PMCVBMMY.w")
	public static final int[] field1115 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("PMCVBMMY.y")
	public static final int[] field1117 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("PMCVBMMY.I")
	public static final int[] field1124 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("PMCVBMMY.x")
	public static int field1116 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("PMCVBMMY.C")
	public static int field1121 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("PMCVBMMY.B")
	public static int field1120;

	@ObfuscatedName("PMCVBMMY.a(LLXDDKEZF;B[LXBMRDXRN;)V")
	public final void method417(LXDDKEZF arg0, XBMRDXRN[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field1108[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field1108[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method540(var4, var5);
						}
					}
				}
			}
		}

		field1116 += (int) (Math.random() * 5.0D) - 2;
		if (field1116 < -8) {
			field1116 = -8;
		}

		if (field1116 > 8) {
			field1116 = 8;
		}

		field1121 += (int) (Math.random() * 5.0D) - 2;
		if (field1121 < -16) {
			field1121 = -16;
		}

		if (field1121 > 16) {
			field1121 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field1118[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field1113 - 1; var16++) {
				for (int var17 = 1; var17 < field1112 - 1; var17++) {
					int var18 = field1107[var7][var17 + 1][var16] - field1107[var7][var17 - 1][var16];
					int var19 = field1107[var7][var17][var16 + 1] - field1107[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field1114[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field1113; var26++) {
				field1102[var26] = 0;
				field1103[var26] = 0;
				field1104[var26] = 0;
				field1105[var26] = 0;
				field1106[var26] = 0;
			}

			for (int var27 = -5; var27 < field1112 + 5; var27++) {
				for (int var28 = 0; var28 < field1113; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field1112) {
						int var30 = field1119[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							PQRCEBTR var31 = PQRCEBTR.field1129[var30 - 1];
							field1102[var28] += var31.field1138;
							field1103[var28] += var31.field1136;
							field1104[var28] += var31.field1137;
							field1105[var28] += var31.field1139;
							field1106[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field1112) {
						int var33 = field1119[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							PQRCEBTR var34 = PQRCEBTR.field1129[var33 - 1];
							field1102[var28] -= var34.field1138;
							field1103[var28] -= var34.field1136;
							field1104[var28] -= var34.field1137;
							field1105[var28] -= var34.field1139;
							field1106[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field1112 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field1113 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field1113) {
							var35 += field1102[var41];
							var36 += field1103[var41];
							var37 += field1104[var41];
							var38 += field1105[var41];
							var39 += field1106[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field1113) {
							var35 -= field1102[var42];
							var36 -= field1103[var42];
							var37 -= field1104[var42];
							var38 -= field1105[var42];
							var39 -= field1106[var42];
						}

						if (var40 >= 1 && var40 < field1113 - 1 && (!field1110 || (field1108[0][var27][var40] & 0x2) != 0 || (field1108[var7][var27][var40] & 0x10) == 0 && method433(var27, var7, var40) == field1120)) {
							if (var7 < field1111) {
								field1111 = var7;
							}

							int var43 = field1119[var7][var27][var40] & 0xFF;
							int var44 = field1122[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field1107[var7][var27][var40];
								int var46 = field1107[var7][var27 + 1][var40];
								int var47 = field1107[var7][var27 + 1][var40 + 1];
								int var48 = field1107[var7][var27][var40 + 1];
								int var49 = field1114[var27][var40];
								int var50 = field1114[var27 + 1][var40];
								int var51 = field1114[var27 + 1][var40 + 1];
								int var52 = field1114[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method424(var55, var56, var57);
									var55 = field1116 + var55 & 0xFF;
									var57 += field1121;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method424(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field1123[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !PQRCEBTR.field1129[var44 - 1].field1134) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field1125[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = QAMTFDSD.field1162[method422(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method314(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method422(var53, var49), method422(var53, var50), method422(var53, var51), method422(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field1123[var7][var27][var40] + 1;
									byte var61 = field1109[var7][var27][var40];
									PQRCEBTR var62 = PQRCEBTR.field1129[var44 - 1];
									int var63 = var62.field1132;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = QAMTFDSD.method453(var63);
										var65 = -1;
									} else if (var62.field1131 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method424(var62.field1135, var62.field1136, var62.field1137);
										var64 = QAMTFDSD.field1162[method428(var62.field1140, 96)];
									}

									arg0.method314(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method422(var53, var49), method422(var53, var50), method422(var53, var51), method422(var53, var52), method428(var65, var49), method428(var65, var50), method428(var65, var51), method428(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field1113 - 1; var66++) {
				for (int var67 = 1; var67 < field1112 - 1; var67++) {
					arg0.method313(var7, var67, var66, method433(var67, var7, var66));
				}
			}
		}

		arg0.method340(768, -50, 64, -50, -10);

		for (int var68 = 0; var68 < field1112; var68++) {
			for (int var69 = 0; var69 < field1113; var69++) {
				if ((field1108[1][var68][var69] & 0x2) == 2) {
					arg0.method311(var68, var69);
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
				for (int var75 = 0; var75 <= field1113; var75++) {
					for (int var76 = 0; var76 <= field1112; var76++) {
						if ((field1125[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field1125[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field1113 && (field1125[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field1125[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field1125[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field1107[var80][var76][var77] - var84;
								int var86 = field1107[var79][var76][var77];
								LXDDKEZF.method312(var76 * 128, var73, var86, var85, var78 * 128 + 128, 1, var76 * 128, var77 * 128);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field1125[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field1125[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field1125[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field1112 && (field1125[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field1125[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field1125[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field1107[var92][var89][var75] - var96;
								int var98 = field1107[var91][var89][var75];
								LXDDKEZF.method312(var89 * 128, var73, var98, var97, var75 * 128, 2, var90 * 128 + 128, var75 * 128);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field1125[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field1125[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field1125[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field1113 && (field1125[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field1125[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field1112) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field1125[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field1107[var74][var101][var103];
								LXDDKEZF.method312(var101 * 128, var73, var107, var107, var104 * 128 + 128, 4, var102 * 128 + 128, var103 * 128);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field1125[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("PMCVBMMY.a(IIII[LXBMRDXRN;III[BI)V")
	public final void method418(int arg0, int arg1, int arg2, XBMRDXRN[] arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg1 + var10 > 0 && arg1 + var10 < 103 && arg0 + var11 > 0 && arg0 + var11 < 103) {
					arg3[arg5].field1394[arg1 + var10][arg0 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		GHHPHSRU var12 = new GHHPHSRU(arg7);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg6 == var13 && var14 >= arg2 && var14 < arg2 + 8 && var15 >= arg4 && var15 < arg4 + 8) {
						method434(var12, arg5, 0, 0, arg0 + XPCGXWBX.method554(var15 & 0x7, var14 & 0x7, arg8), arg1 + XPCGXWBX.method553(var14 & 0x7, arg8, var15 & 0x7), arg8);
					} else {
						method434(var12, 0, 0, 0, -1, -1, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("PMCVBMMY.a(II[LXBMRDXRN;[BLLXDDKEZF;I)V")
	public final void method419(int arg0, XBMRDXRN[] arg1, byte[] arg2, LXDDKEZF arg3, int arg4) {
		GHHPHSRU var6 = new GHHPHSRU(arg2);
		int var7 = -1;
		while (true) {
			int var8 = var6.method216();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method216();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method202();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg4 + var12;
				int var18 = arg0 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field1108[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					XBMRDXRN var20 = null;
					if (var19 >= 0) {
						var20 = arg1[var19];
					}

					method430(var20, var17, var7, var15, var13, var16, arg3, var18);
				}
			}
		}
	}

	@ObfuscatedName("PMCVBMMY.a([LXBMRDXRN;IIIIIILLXDDKEZF;II[B)V")
	public final void method420(XBMRDXRN[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, LXDDKEZF arg6, int arg7, int arg8, byte[] arg9) {
		GHHPHSRU var11 = new GHHPHSRU(arg9);
		int var12 = -1;
		while (true) {
			int var13 = var11.method216();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method216();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method202();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg8 == var18 && var17 >= arg2 && var17 < arg2 + 8 && var16 >= arg3 && var16 < arg3 + 8) {
					MKWUPJYP var22 = MKWUPJYP.method365(var12);
					int var23 = arg4 + XPCGXWBX.method555(var21, var17 & 0x7, var16 & 0x7, arg1, var22.field975, var22.field980);
					int var24 = arg7 + XPCGXWBX.method556(var17 & 0x7, var16 & 0x7, var22.field980, arg1, var21, var22.field975);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg5;
						if ((field1108[1][var23][var24] & 0x2) == 2) {
							var25 = arg5 - 1;
						}

						XBMRDXRN var26 = null;
						if (var25 >= 0) {
							var26 = arg0[var25];
						}

						method430(var26, var23, var12, var20, arg5, arg1 + var21 & 0x3, arg6, var24);
					}
				}
			}
		}
	}

	@ObfuscatedName("PMCVBMMY.a(IZI[LXBMRDXRN;II[B)V")
	public final void method421(int arg0, int arg1, XBMRDXRN[] arg2, int arg3, int arg4, byte[] arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg3 + var8 > 0 && arg3 + var8 < 103 && arg4 + var9 > 0 && arg4 + var9 < 103) {
						arg2[var7].field1394[arg3 + var8][arg4 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		GHHPHSRU var10 = new GHHPHSRU(arg5);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method434(var10, var11, arg0, arg1, arg4 + var13, arg3 + var12, 0);
				}
			}
		}
	}

	@ObfuscatedName("PMCVBMMY.a(II)I")
	public static final int method422(int arg0, int arg1) {
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

	@ObfuscatedName("PMCVBMMY.a(IIIII)V")
	public final void method423(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg3; var5 <= arg2 + arg3; var5++) {
			for (int var6 = arg0; var6 <= arg0 + arg1; var6++) {
				if (var6 >= 0 && var6 < field1112 && var5 >= 0 && var5 < field1113) {
					field1118[0][var6][var5] = 127;

					if (arg0 == var6 && var6 > 0) {
						field1107[0][var6][var5] = field1107[0][var6 - 1][var5];
					}

					if (arg0 + arg1 == var6 && var6 < field1112 - 1) {
						field1107[0][var6][var5] = field1107[0][var6 + 1][var5];
					}

					if (arg3 == var5 && var5 > 0) {
						field1107[0][var6][var5] = field1107[0][var6][var5 - 1];
					}

					if (arg2 + arg3 == var5 && var5 < field1113 - 1) {
						field1107[0][var6][var5] = field1107[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("PMCVBMMY.a(III)I")
	public final int method424(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("PMCVBMMY.a(ILLXDDKEZF;[[[IIILXBMRDXRN;IIIII)V")
	public static final void method425(int arg0, LXDDKEZF arg1, int[][][] arg2, int arg3, XBMRDXRN arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		int var10 = arg2[arg9][arg7][arg5];
		int var11 = arg2[arg9][arg7 + 1][arg5];
		int var12 = arg2[arg9][arg7 + 1][arg5 + 1];
		int var13 = arg2[arg9][arg7][arg5 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		MKWUPJYP var15 = MKWUPJYP.method365(arg3);
		int var16 = (arg3 << 14) + (arg5 << 7) + arg7 + 0x40000000;
		if (!var15.field948) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg0 << 6) + arg6);
		if (arg6 == 22) {
			ZHYAQRMA var18;
			if (var15.field965 == -1 && var15.field968 == null) {
				var18 = var15.method361(22, arg0, var10, var11, var12, var13, -1);
			} else {
				var18 = new WYAAPLJP(var12, arg3, true, var11, arg0, var10, 22, var15.field965, var13);
			}

			arg1.method315(var18, arg5, var14, arg7, var17, var16, arg8);

			if (var15.field940 && var15.field948) {
				arg4.method540(arg7, arg5);
			}
		} else if (arg6 == 10 || arg6 == 11) {
			ZHYAQRMA var19;
			if (var15.field965 == -1 && var15.field968 == null) {
				var19 = var15.method361(10, arg0, var10, var11, var12, var13, -1);
			} else {
				var19 = new WYAAPLJP(var12, arg3, true, var11, arg0, var10, 10, var15.field965, var13);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg6 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg0 == 1 || arg0 == 3) {
					var21 = var15.field975;
					var22 = var15.field980;
				} else {
					var21 = var15.field980;
					var22 = var15.field975;
				}

				arg1.method319(arg8, var16, var19, var22, var21, var14, var17, arg5, arg7, var20);
			}

			if (var15.field940) {
				arg4.method539(arg0, arg7, arg5, var15.field980, var15.field957, var15.field975);
			}
		} else if (arg6 >= 12) {
			ZHYAQRMA var23;
			if (var15.field965 == -1 && var15.field968 == null) {
				var23 = var15.method361(arg6, arg0, var10, var11, var12, var13, -1);
			} else {
				var23 = new WYAAPLJP(var12, arg3, true, var11, arg0, var10, arg6, var15.field965, var13);
			}

			arg1.method319(arg8, var16, var23, 1, 1, var14, var17, arg5, arg7, 0);

			if (var15.field940) {
				arg4.method539(arg0, arg7, arg5, var15.field980, var15.field957, var15.field975);
			}
		} else if (arg6 == 0) {
			ZHYAQRMA var24;
			if (var15.field965 == -1 && var15.field968 == null) {
				var24 = var15.method361(0, arg0, var10, var11, var12, var13, -1);
			} else {
				var24 = new WYAAPLJP(var12, arg3, true, var11, arg0, var10, 0, var15.field965, var13);
			}

			arg1.method317(field1117[arg0], null, arg5, var16, var24, var17, arg7, arg8, 0, var14);

			if (var15.field940) {
				arg4.method538(arg7, var15.field957, arg6, arg5, arg0);
			}
		} else if (arg6 == 1) {
			ZHYAQRMA var25;
			if (var15.field965 == -1 && var15.field968 == null) {
				var25 = var15.method361(1, arg0, var10, var11, var12, var13, -1);
			} else {
				var25 = new WYAAPLJP(var12, arg3, true, var11, arg0, var10, 1, var15.field965, var13);
			}

			arg1.method317(field1124[arg0], null, arg5, var16, var25, var17, arg7, arg8, 0, var14);

			if (var15.field940) {
				arg4.method538(arg7, var15.field957, arg6, arg5, arg0);
			}
		} else if (arg6 == 2) {
			int var26 = arg0 + 1 & 0x3;
			ZHYAQRMA var27;
			ZHYAQRMA var28;
			if (var15.field965 == -1 && var15.field968 == null) {
				var27 = var15.method361(2, arg0 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method361(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new WYAAPLJP(var12, arg3, true, var11, arg0 + 4, var10, 2, var15.field965, var13);
				var28 = new WYAAPLJP(var12, arg3, true, var11, var26, var10, 2, var15.field965, var13);
			}

			arg1.method317(field1117[arg0], var28, arg5, var16, var27, var17, arg7, arg8, field1117[var26], var14);

			if (var15.field940) {
				arg4.method538(arg7, var15.field957, arg6, arg5, arg0);
			}
		} else if (arg6 == 3) {
			ZHYAQRMA var29;
			if (var15.field965 == -1 && var15.field968 == null) {
				var29 = var15.method361(3, arg0, var10, var11, var12, var13, -1);
			} else {
				var29 = new WYAAPLJP(var12, arg3, true, var11, arg0, var10, 3, var15.field965, var13);
			}

			arg1.method317(field1124[arg0], null, arg5, var16, var29, var17, arg7, arg8, 0, var14);

			if (var15.field940) {
				arg4.method538(arg7, var15.field957, arg6, arg5, arg0);
			}
		} else if (arg6 == 9) {
			ZHYAQRMA var30;
			if (var15.field965 == -1 && var15.field968 == null) {
				var30 = var15.method361(arg6, arg0, var10, var11, var12, var13, -1);
			} else {
				var30 = new WYAAPLJP(var12, arg3, true, var11, arg0, var10, arg6, var15.field965, var13);
			}

			arg1.method319(arg8, var16, var30, 1, 1, var14, var17, arg5, arg7, 0);

			if (var15.field940) {
				arg4.method539(arg0, arg7, arg5, var15.field980, var15.field957, var15.field975);
			}
		} else {
			if (var15.field950) {
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

			if (arg6 == 4) {
				ZHYAQRMA var35;
				if (var15.field965 == -1 && var15.field968 == null) {
					var35 = var15.method361(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new WYAAPLJP(var12, arg3, true, var11, 0, var10, 4, var15.field965, var13);
				}

				arg1.method318(0, var35, arg8, field1117[arg0], var17, arg0 * 512, arg5, 0, var14, arg7, var16);
			} else if (arg6 == 5) {
				int var36 = 16;
				int var37 = arg1.method335(arg8, arg7, arg5);
				if (var37 > 0) {
					var36 = MKWUPJYP.method365(var37 >> 14 & 0x7FFF).field979;
				}

				ZHYAQRMA var38;
				if (var15.field965 == -1 && var15.field968 == null) {
					var38 = var15.method361(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new WYAAPLJP(var12, arg3, true, var11, 0, var10, 4, var15.field965, var13);
				}

				arg1.method318(field1115[arg0] * var36, var38, arg8, field1117[arg0], var17, arg0 * 512, arg5, field1101[arg0] * var36, var14, arg7, var16);
			} else if (arg6 == 6) {
				ZHYAQRMA var39;
				if (var15.field965 == -1 && var15.field968 == null) {
					var39 = var15.method361(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new WYAAPLJP(var12, arg3, true, var11, 0, var10, 4, var15.field965, var13);
				}

				arg1.method318(0, var39, arg8, 256, var17, arg0, arg5, 0, var14, arg7, var16);
			} else if (arg6 == 7) {
				ZHYAQRMA var40;
				if (var15.field965 == -1 && var15.field968 == null) {
					var40 = var15.method361(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new WYAAPLJP(var12, arg3, true, var11, 0, var10, 4, var15.field965, var13);
				}

				arg1.method318(0, var40, arg8, 512, var17, arg0, arg5, 0, var14, arg7, var16);
			} else if (arg6 == 8) {
				ZHYAQRMA var41;
				if (var15.field965 == -1 && var15.field968 == null) {
					var41 = var15.method361(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new WYAAPLJP(var12, arg3, true, var11, 0, var10, 4, var15.field965, var13);
				}

				arg1.method318(0, var41, arg8, 768, var17, arg0, arg5, 0, var14, arg7, var16);
			}
		}
	}

	@ObfuscatedName("PMCVBMMY.b(III)Z")
	public static final boolean method426(int arg0, int arg1) {
		MKWUPJYP var2 = MKWUPJYP.method365(arg1);

		if (arg0 == 11) {
			arg0 = 10;
		}

		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}

		return var2.method367(arg0);
	}

	@ObfuscatedName("PMCVBMMY.a(IIII)I")
	public static final int method427(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - QAMTFDSD.field1151[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("PMCVBMMY.b(II)I")
	public final int method428(int arg0, int arg1) {
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

	@ObfuscatedName("PMCVBMMY.c(II)I")
	public static final int method429(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("PMCVBMMY.a(LXBMRDXRN;IIIIILLXDDKEZF;ZI)V")
	public final void method430(XBMRDXRN arg0, int arg1, int arg2, int arg3, int arg4, int arg5, LXDDKEZF arg6, int arg7) {
		if (field1110 && (field1108[0][arg1][arg7] & 0x2) == 0) {
			if ((field1108[arg4][arg1][arg7] & 0x10) != 0) {
				return;
			}

			if (method433(arg1, arg4, arg7) != field1120) {
				return;
			}
		}

		if (arg4 < field1111) {
			field1111 = arg4;
		}

		int var9 = field1107[arg4][arg1][arg7];
		int var10 = field1107[arg4][arg1 + 1][arg7];
		int var11 = field1107[arg4][arg1 + 1][arg7 + 1];
		int var12 = field1107[arg4][arg1][arg7 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		MKWUPJYP var14 = MKWUPJYP.method365(arg2);
		int var15 = (arg2 << 14) + (arg7 << 7) + arg1 + 0x40000000;
		if (!var14.field948) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg5 << 6) + arg3);
		if (arg3 == 22) {
			if (!field1110 || var14.field948 || var14.field939) {
				ZHYAQRMA var17;
				if (var14.field965 == -1 && var14.field968 == null) {
					var17 = var14.method361(22, arg5, var9, var10, var11, var12, -1);
				} else {
					var17 = new WYAAPLJP(var11, arg2, true, var10, arg5, var9, 22, var14.field965, var12);
				}

				arg6.method315(var17, arg7, var13, arg1, var16, var15, arg4);

				if (var14.field940 && var14.field948 && arg0 != null) {
					arg0.method540(arg1, arg7);
				}
			}
		} else if (arg3 == 10 || arg3 == 11) {
			ZHYAQRMA var18;
			if (var14.field965 == -1 && var14.field968 == null) {
				var18 = var14.method361(10, arg5, var9, var10, var11, var12, -1);
			} else {
				var18 = new WYAAPLJP(var11, arg2, true, var10, arg5, var9, 10, var14.field965, var12);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg3 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg5 == 1 || arg5 == 3) {
					var20 = var14.field975;
					var21 = var14.field980;
				} else {
					var20 = var14.field980;
					var21 = var14.field975;
				}

				if (arg6.method319(arg4, var15, var18, var21, var20, var13, var16, arg7, arg1, var19) && var14.field958) {
					OQIGXOFQ var22;
					if (var18 instanceof OQIGXOFQ) {
						var22 = (OQIGXOFQ) var18;
					} else {
						var22 = var14.method361(10, arg5, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field1058 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field1118[arg4][arg1 + var23][arg7 + var24]) {
									field1118[arg4][arg1 + var23][arg7 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field940 && arg0 != null) {
				arg0.method539(arg5, arg1, arg7, var14.field980, var14.field957, var14.field975);
			}
		} else if (arg3 >= 12) {
			ZHYAQRMA var26;
			if (var14.field965 == -1 && var14.field968 == null) {
				var26 = var14.method361(arg3, arg5, var9, var10, var11, var12, -1);
			} else {
				var26 = new WYAAPLJP(var11, arg2, true, var10, arg5, var9, arg3, var14.field965, var12);
			}

			arg6.method319(arg4, var15, var26, 1, 1, var13, var16, arg7, arg1, 0);

			if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg4 > 0) {
				field1125[arg4][arg1][arg7] |= 0x924;
			}

			if (var14.field940 && arg0 != null) {
				arg0.method539(arg5, arg1, arg7, var14.field980, var14.field957, var14.field975);
			}
		} else if (arg3 == 0) {
			ZHYAQRMA var27;
			if (var14.field965 == -1 && var14.field968 == null) {
				var27 = var14.method361(0, arg5, var9, var10, var11, var12, -1);
			} else {
				var27 = new WYAAPLJP(var11, arg2, true, var10, arg5, var9, 0, var14.field965, var12);
			}

			arg6.method317(field1117[arg5], null, arg7, var15, var27, var16, arg1, arg4, 0, var13);

			if (arg5 == 0) {
				if (var14.field958) {
					field1118[arg4][arg1][arg7] = 50;
					field1118[arg4][arg1][arg7 + 1] = 50;
				}

				if (var14.field969) {
					field1125[arg4][arg1][arg7] |= 0x249;
				}
			} else if (arg5 == 1) {
				if (var14.field958) {
					field1118[arg4][arg1][arg7 + 1] = 50;
					field1118[arg4][arg1 + 1][arg7 + 1] = 50;
				}

				if (var14.field969) {
					field1125[arg4][arg1][arg7 + 1] |= 0x492;
				}
			} else if (arg5 == 2) {
				if (var14.field958) {
					field1118[arg4][arg1 + 1][arg7] = 50;
					field1118[arg4][arg1 + 1][arg7 + 1] = 50;
				}

				if (var14.field969) {
					field1125[arg4][arg1 + 1][arg7] |= 0x249;
				}
			} else if (arg5 == 3) {
				if (var14.field958) {
					field1118[arg4][arg1][arg7] = 50;
					field1118[arg4][arg1 + 1][arg7] = 50;
				}

				if (var14.field969) {
					field1125[arg4][arg1][arg7] |= 0x492;
				}
			}

			if (var14.field940 && arg0 != null) {
				arg0.method538(arg1, var14.field957, arg3, arg7, arg5);
			}

			if (var14.field979 != 16) {
				arg6.method325(var14.field979, arg1, arg7, arg4);
			}
		} else if (arg3 == 1) {
			ZHYAQRMA var28;
			if (var14.field965 == -1 && var14.field968 == null) {
				var28 = var14.method361(1, arg5, var9, var10, var11, var12, -1);
			} else {
				var28 = new WYAAPLJP(var11, arg2, true, var10, arg5, var9, 1, var14.field965, var12);
			}

			arg6.method317(field1124[arg5], null, arg7, var15, var28, var16, arg1, arg4, 0, var13);

			if (var14.field958) {
				if (arg5 == 0) {
					field1118[arg4][arg1][arg7 + 1] = 50;
				} else if (arg5 == 1) {
					field1118[arg4][arg1 + 1][arg7 + 1] = 50;
				} else if (arg5 == 2) {
					field1118[arg4][arg1 + 1][arg7] = 50;
				} else if (arg5 == 3) {
					field1118[arg4][arg1][arg7] = 50;
				}
			}

			if (var14.field940 && arg0 != null) {
				arg0.method538(arg1, var14.field957, arg3, arg7, arg5);
			}
		} else if (arg3 == 2) {
			int var29 = arg5 + 1 & 0x3;
			ZHYAQRMA var30;
			ZHYAQRMA var31;
			if (var14.field965 == -1 && var14.field968 == null) {
				var30 = var14.method361(2, arg5 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method361(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new WYAAPLJP(var11, arg2, true, var10, arg5 + 4, var9, 2, var14.field965, var12);
				var31 = new WYAAPLJP(var11, arg2, true, var10, var29, var9, 2, var14.field965, var12);
			}

			arg6.method317(field1117[arg5], var31, arg7, var15, var30, var16, arg1, arg4, field1117[var29], var13);

			if (var14.field969) {
				if (arg5 == 0) {
					field1125[arg4][arg1][arg7] |= 0x249;
					field1125[arg4][arg1][arg7 + 1] |= 0x492;
				} else if (arg5 == 1) {
					field1125[arg4][arg1][arg7 + 1] |= 0x492;
					field1125[arg4][arg1 + 1][arg7] |= 0x249;
				} else if (arg5 == 2) {
					field1125[arg4][arg1 + 1][arg7] |= 0x249;
					field1125[arg4][arg1][arg7] |= 0x492;
				} else if (arg5 == 3) {
					field1125[arg4][arg1][arg7] |= 0x492;
					field1125[arg4][arg1][arg7] |= 0x249;
				}
			}

			if (var14.field940 && arg0 != null) {
				arg0.method538(arg1, var14.field957, arg3, arg7, arg5);
			}

			if (var14.field979 != 16) {
				arg6.method325(var14.field979, arg1, arg7, arg4);
			}
		} else if (arg3 == 3) {
			ZHYAQRMA var32;
			if (var14.field965 == -1 && var14.field968 == null) {
				var32 = var14.method361(3, arg5, var9, var10, var11, var12, -1);
			} else {
				var32 = new WYAAPLJP(var11, arg2, true, var10, arg5, var9, 3, var14.field965, var12);
			}

			arg6.method317(field1124[arg5], null, arg7, var15, var32, var16, arg1, arg4, 0, var13);

			if (var14.field958) {
				if (arg5 == 0) {
					field1118[arg4][arg1][arg7 + 1] = 50;
				} else if (arg5 == 1) {
					field1118[arg4][arg1 + 1][arg7 + 1] = 50;
				} else if (arg5 == 2) {
					field1118[arg4][arg1 + 1][arg7] = 50;
				} else if (arg5 == 3) {
					field1118[arg4][arg1][arg7] = 50;
				}
			}

			if (var14.field940 && arg0 != null) {
				arg0.method538(arg1, var14.field957, arg3, arg7, arg5);
			}
		} else if (arg3 == 9) {
			ZHYAQRMA var33;
			if (var14.field965 == -1 && var14.field968 == null) {
				var33 = var14.method361(arg3, arg5, var9, var10, var11, var12, -1);
			} else {
				var33 = new WYAAPLJP(var11, arg2, true, var10, arg5, var9, arg3, var14.field965, var12);
			}

			arg6.method319(arg4, var15, var33, 1, 1, var13, var16, arg7, arg1, 0);

			if (var14.field940 && arg0 != null) {
				arg0.method539(arg5, arg1, arg7, var14.field980, var14.field957, var14.field975);
			}
		} else {
			if (var14.field950) {
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

			if (arg3 == 4) {
				ZHYAQRMA var38;
				if (var14.field965 == -1 && var14.field968 == null) {
					var38 = var14.method361(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new WYAAPLJP(var11, arg2, true, var10, 0, var9, 4, var14.field965, var12);
				}

				arg6.method318(0, var38, arg4, field1117[arg5], var16, arg5 * 512, arg7, 0, var13, arg1, var15);
			} else if (arg3 == 5) {
				int var39 = 16;
				int var40 = arg6.method335(arg4, arg1, arg7);
				if (var40 > 0) {
					var39 = MKWUPJYP.method365(var40 >> 14 & 0x7FFF).field979;
				}

				ZHYAQRMA var41;
				if (var14.field965 == -1 && var14.field968 == null) {
					var41 = var14.method361(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new WYAAPLJP(var11, arg2, true, var10, 0, var9, 4, var14.field965, var12);
				}

				arg6.method318(field1115[arg5] * var39, var41, arg4, field1117[arg5], var16, arg5 * 512, arg7, field1101[arg5] * var39, var13, arg1, var15);
			} else if (arg3 == 6) {
				ZHYAQRMA var42;
				if (var14.field965 == -1 && var14.field968 == null) {
					var42 = var14.method361(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new WYAAPLJP(var11, arg2, true, var10, 0, var9, 4, var14.field965, var12);
				}

				arg6.method318(0, var42, arg4, 256, var16, arg5, arg7, 0, var13, arg1, var15);
			} else if (arg3 == 7) {
				ZHYAQRMA var43;
				if (var14.field965 == -1 && var14.field968 == null) {
					var43 = var14.method361(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new WYAAPLJP(var11, arg2, true, var10, 0, var9, 4, var14.field965, var12);
				}

				arg6.method318(0, var43, arg4, 512, var16, arg5, arg7, 0, var13, arg1, var15);
			} else if (arg3 == 8) {
				ZHYAQRMA var44;
				if (var14.field965 == -1 && var14.field968 == null) {
					var44 = var14.method361(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new WYAAPLJP(var11, arg2, true, var10, 0, var9, 4, var14.field965, var12);
				}

				arg6.method318(0, var44, arg4, 768, var16, arg5, arg7, 0, var13, arg1, var15);
			}
		}
	}

	public PMCVBMMY(byte[][][] arg0, int[][][] arg1, int arg2, int arg3) {
		field1111 = 99;
		field1112 = arg2;
		field1113 = arg3;
		field1107 = arg1;
		field1108 = arg0;
		field1119 = new byte[4][field1112][field1113];
		field1122 = new byte[4][field1112][field1113];
		field1123 = new byte[4][field1112][field1113];
		field1109 = new byte[4][field1112][field1113];
		field1125 = new int[4][field1112 + 1][field1113 + 1];
		field1118 = new byte[4][field1112 + 1][field1113 + 1];
		field1114 = new int[field1112 + 1][field1113 + 1];
		field1102 = new int[field1113];
		field1103 = new int[field1113];
		field1104 = new int[field1113];
		field1105 = new int[field1113];
		field1106 = new int[field1113];
	}

	@ObfuscatedName("PMCVBMMY.c(III)I")
	public static final int method431(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method437(var3, var5);
		int var8 = method437(var3 + 1, var5);
		int var9 = method437(var3, var5 + 1);
		int var10 = method437(var3 + 1, var5 + 1);
		int var11 = method427(var7, var8, var4, arg2);
		int var12 = method427(var9, var10, var4, arg2);
		return method427(var11, var12, var6, arg2);
	}

	@ObfuscatedName("PMCVBMMY.d(II)I")
	public static final int method432(int arg0, int arg1) {
		int var2 = method431(arg0 + 45365, arg1 + 91923, 4) + (method431(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method431(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("PMCVBMMY.a(IIZI)I")
	public int method433(int arg0, int arg1, int arg2) {
		if ((field1108[arg1][arg0][arg2] & 0x8) != 0) {
			return 0;
		}

		if (arg1 > 0 && (field1108[1][arg0][arg2] & 0x2) != 0) {
			return arg1 - 1;
		}

		return arg1;
	}

	@ObfuscatedName("PMCVBMMY.a(LGHHPHSRU;IIIIIII)V")
	public final void method434(GHHPHSRU arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg5 >= 0 && arg5 < 104 && arg4 >= 0 && arg4 < 104) {
			field1108[arg1][arg5][arg4] = 0;
			while (true) {
				int var8 = arg0.method202();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg0.method202();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg1 == 0) {
						field1107[0][arg5][arg4] = -var9 * 8;
						return;
					}

					field1107[arg1][arg5][arg4] = field1107[arg1 - 1][arg5][arg4] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field1122[arg1][arg5][arg4] = arg0.method203();
					field1123[arg1][arg5][arg4] = (byte) ((var8 - 2) / 4);
					field1109[arg1][arg5][arg4] = (byte) (var8 + arg6 - 2 & 0x3);
				} else if (var8 <= 81) {
					field1108[arg1][arg5][arg4] = (byte) (var8 - 49);
				} else {
					field1119[arg1][arg5][arg4] = (byte) (var8 - 81);
				}
			}

			if (arg1 == 0) {
				field1107[0][arg5][arg4] = -method432(arg5 + arg3 + 932731, arg4 + 556238 + arg2) * 8;
			} else {
				field1107[arg1][arg5][arg4] = field1107[arg1 - 1][arg5][arg4] - 240;
			}
		} else {
			while (true) {
				int var10 = arg0.method202();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg0.method202();
					return;
				}

				if (var10 <= 49) {
					arg0.method202();
				}
			}
		}
	}

	@ObfuscatedName("PMCVBMMY.a(I[BZI)Z")
	public static final boolean method435(int arg0, byte[] arg1, int arg2) {
		boolean var3 = true;
		GHHPHSRU var4 = new GHHPHSRU(arg1);
		int var5 = -1;
		while (true) {
			int var6 = var4.method216();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method216();
					if (var9 == 0) {
						break;
					}

					var4.method202();
				} else {
					int var10 = var4.method216();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method202() >> 2;
					int var14 = arg2 + var12;
					int var15 = arg0 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						MKWUPJYP var16 = MKWUPJYP.method365(var5);
						if (var13 != 22 || !field1110 || var16.field948 || var16.field939) {
							var3 &= var16.method362();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("PMCVBMMY.a(ZLXZFDFADG;LGHHPHSRU;)V")
	public static final void method436(XZFDFADG arg0, GHHPHSRU arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg1.method216();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			MKWUPJYP var4 = MKWUPJYP.method365(var2);
			var4.method360(arg0);

			while (true) {
				int var5 = arg1.method216();
				if (var5 == 0) {
					break;
				}

				arg1.method202();
			}
		}
	}

	@ObfuscatedName("PMCVBMMY.e(II)I")
	public static final int method437(int arg0, int arg1) {
		int var2 = method429(arg0 - 1, arg1 - 1) + method429(arg0 + 1, arg1 - 1) + method429(arg0 - 1, arg1 + 1) + method429(arg0 + 1, arg1 + 1);
		int var3 = method429(arg0 - 1, arg1) + method429(arg0 + 1, arg1) + method429(arg0, arg1 - 1) + method429(arg0, arg1 + 1);
		int var4 = method429(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}
}
