package deob;

@ObfuscatedName("CDASFTJJ")
public final class CDASFTJJ {

	@ObfuscatedName("CDASFTJJ.r")
	public int field104;

	@ObfuscatedName("CDASFTJJ.s")
	public int field105;

	@ObfuscatedName("CDASFTJJ.o")
	public int[][][] field101;

	@ObfuscatedName("CDASFTJJ.i")
	public byte[][][] field97;

	@ObfuscatedName("CDASFTJJ.F")
	public byte[][][] field115;

	@ObfuscatedName("CDASFTJJ.g")
	public byte[][][] field95;

	@ObfuscatedName("CDASFTJJ.d")
	public byte[][][] field92;

	@ObfuscatedName("CDASFTJJ.j")
	public byte[][][] field98;

	@ObfuscatedName("CDASFTJJ.e")
	public int[][][] field93;

	@ObfuscatedName("CDASFTJJ.k")
	public byte[][][] field99;

	@ObfuscatedName("CDASFTJJ.f")
	public int[][] field94;

	@ObfuscatedName("CDASFTJJ.u")
	public int[] field106;

	@ObfuscatedName("CDASFTJJ.v")
	public int[] field107;

	@ObfuscatedName("CDASFTJJ.w")
	public int[] field108;

	@ObfuscatedName("CDASFTJJ.x")
	public int[] field109;

	@ObfuscatedName("CDASFTJJ.y")
	public int[] field110;

	@ObfuscatedName("CDASFTJJ.a")
	public static final int[] field91 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("CDASFTJJ.p")
	public static final int[] field102 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("CDASFTJJ.q")
	public static int field103 = 99;

	@ObfuscatedName("CDASFTJJ.z")
	public static final int[] field111 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("CDASFTJJ.A")
	public static final int[] field112 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("CDASFTJJ.E")
	public static boolean field114 = true;

	@ObfuscatedName("CDASFTJJ.h")
	public static int field96 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("CDASFTJJ.m")
	public static int field100 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("CDASFTJJ.D")
	public static int field113;

	@ObfuscatedName("CDASFTJJ.a(LPKHWFJLM;LJHGVYYQH;I)V")
	public static final void method27(PKHWFJLM arg0, JHGVYYQH arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method344();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			LWJTLDAE var4 = LWJTLDAE.method290(var2);
			var4.method293(arg1);

			while (true) {
				int var5 = arg0.method344();
				if (var5 == 0) {
					break;
				}

				arg0.method330();
			}
		}
	}

	@ObfuscatedName("CDASFTJJ.a(II[LTJMGSZMW;[BIIIBII)V")
	public final void method28(int arg0, int arg1, TJMGSZMW[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg6 + var10 > 0 && arg6 + var10 < 103 && arg7 + var11 > 0 && arg7 + var11 < 103) {
					arg2[arg4].field1295[arg6 + var10][arg7 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		PKHWFJLM var12 = new PKHWFJLM(arg3);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg0 == var13 && var14 >= arg5 && var14 < arg5 + 8 && var15 >= arg1 && var15 < arg1 + 8) {
						method37(0, arg7 + RBJNNTUF.method455(arg8, var15 & 0x7, var14 & 0x7), var12, arg6 + RBJNNTUF.method454(var15 & 0x7, var14 & 0x7, arg8), arg8, arg4, 0);
					} else {
						method37(0, -1, var12, -1, 0, 0, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("CDASFTJJ.a(III)I")
	public final int method29(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("CDASFTJJ.a(LWJVLISUF;[LTJMGSZMW;I)V")
	public final void method30(WJVLISUF arg0, TJMGSZMW[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field97[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field97[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method483(var4, var5);
						}
					}
				}
			}
		}

		field96 += (int) (Math.random() * 5.0D) - 2;
		if (field96 < -8) {
			field96 = -8;
		}

		if (field96 > 8) {
			field96 = 8;
		}

		field100 += (int) (Math.random() * 5.0D) - 2;
		if (field100 < -16) {
			field100 = -16;
		}

		if (field100 > 16) {
			field100 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field99[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field105 - 1; var16++) {
				for (int var17 = 1; var17 < field104 - 1; var17++) {
					int var18 = field101[var7][var17 + 1][var16] - field101[var7][var17 - 1][var16];
					int var19 = field101[var7][var17][var16 + 1] - field101[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field94[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field105; var26++) {
				field106[var26] = 0;
				field107[var26] = 0;
				field108[var26] = 0;
				field109[var26] = 0;
				field110[var26] = 0;
			}

			for (int var27 = -5; var27 < field104 + 5; var27++) {
				for (int var28 = 0; var28 < field105; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field104) {
						int var30 = field115[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							QXFWPOFL var31 = QXFWPOFL.field1128[var30 - 1];
							field106[var28] += var31.field1137;
							field107[var28] += var31.field1135;
							field108[var28] += var31.field1136;
							field109[var28] += var31.field1138;
							field110[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field104) {
						int var33 = field115[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							QXFWPOFL var34 = QXFWPOFL.field1128[var33 - 1];
							field106[var28] -= var34.field1137;
							field107[var28] -= var34.field1135;
							field108[var28] -= var34.field1136;
							field109[var28] -= var34.field1138;
							field110[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field104 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field105 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field105) {
							var35 += field106[var41];
							var36 += field107[var41];
							var37 += field108[var41];
							var38 += field109[var41];
							var39 += field110[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field105) {
							var35 -= field106[var42];
							var36 -= field107[var42];
							var37 -= field108[var42];
							var38 -= field109[var42];
							var39 -= field110[var42];
						}

						if (var40 >= 1 && var40 < field105 - 1 && (!field114 || (field97[0][var27][var40] & 0x2) != 0 || (field97[var7][var27][var40] & 0x10) == 0 && method38(var40, var27, var7) == field113)) {
							if (var7 < field103) {
								field103 = var7;
							}

							int var43 = field115[var7][var27][var40] & 0xFF;
							int var44 = field95[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field101[var7][var27][var40];
								int var46 = field101[var7][var27 + 1][var40];
								int var47 = field101[var7][var27 + 1][var40 + 1];
								int var48 = field101[var7][var27][var40 + 1];
								int var49 = field94[var27][var40];
								int var50 = field94[var27 + 1][var40];
								int var51 = field94[var27 + 1][var40 + 1];
								int var52 = field94[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method29(var55, var56, var57);
									var55 = field96 + var55 & 0xFF;
									var57 += field100;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method29(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field92[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !QXFWPOFL.field1128[var44 - 1].field1133) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field93[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = YVYOADIW.field1497[method45(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method528(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method45(var53, var49), method45(var53, var50), method45(var53, var51), method45(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field92[var7][var27][var40] + 1;
									byte var61 = field98[var7][var27][var40];
									QXFWPOFL var62 = QXFWPOFL.field1128[var44 - 1];
									int var63 = var62.field1131;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = YVYOADIW.method590(var63);
										var65 = -1;
									} else if (var62.field1130 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method29(var62.field1134, var62.field1135, var62.field1136);
										var64 = YVYOADIW.field1497[method44(var62.field1139, 96)];
									}

									arg0.method528(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method45(var53, var49), method45(var53, var50), method45(var53, var51), method45(var53, var52), method44(var65, var49), method44(var65, var50), method44(var65, var51), method44(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field105 - 1; var66++) {
				for (int var67 = 1; var67 < field104 - 1; var67++) {
					arg0.method527(var7, var67, var66, method38(var66, var67, var7));
				}
			}
		}

		arg0.method554(768, -50, 64, -50, -10);

		for (int var68 = 0; var68 < field104; var68++) {
			for (int var69 = 0; var69 < field105; var69++) {
				if ((field97[1][var68][var69] & 0x2) == 2) {
					arg0.method525(var69, var68);
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
				for (int var75 = 0; var75 <= field105; var75++) {
					for (int var76 = 0; var76 <= field104; var76++) {
						if ((field93[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field93[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field105 && (field93[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field93[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field93[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field101[var80][var76][var77] - var84;
								int var86 = field101[var79][var76][var77];
								WJVLISUF.method526(var78 * 128 + 128, var76 * 128, var86, 1, var73, var85, var76 * 128, var77 * 128);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field93[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field93[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field93[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field104 && (field93[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field93[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field93[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field101[var92][var89][var75] - var96;
								int var98 = field101[var91][var89][var75];
								WJVLISUF.method526(var75 * 128, var89 * 128, var98, 2, var73, var97, var90 * 128 + 128, var75 * 128);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field93[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field93[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field93[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field105 && (field93[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field93[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field104) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field93[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field101[var74][var101][var103];
								WJVLISUF.method526(var104 * 128 + 128, var101 * 128, var107, 4, var73, var107, var102 * 128 + 128, var103 * 128);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field93[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("CDASFTJJ.a(II)I")
	public static final int method31(int arg0, int arg1) {
		int var2 = method43(arg0 + 45365, arg1 + 91923, 4) + (method43(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method43(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("CDASFTJJ.a(ILWJVLISUF;IIILTJMGSZMW;[[[IIZII)V")
	public static final void method32(int arg0, WJVLISUF arg1, int arg2, int arg3, int arg4, TJMGSZMW arg5, int[][][] arg6, int arg7, int arg8, int arg9) {
		int var10 = arg6[arg3][arg4][arg7];
		int var11 = arg6[arg3][arg4 + 1][arg7];
		int var12 = arg6[arg3][arg4 + 1][arg7 + 1];
		int var13 = arg6[arg3][arg4][arg7 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		LWJTLDAE var15 = LWJTLDAE.method290(arg2);
		int var16 = (arg2 << 14) + (arg7 << 7) + arg4 + 0x40000000;
		if (!var15.field882) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg8 << 6) + arg0);
		if (arg0 == 22) {
			UPHLHIWQ var18;
			if (var15.field889 == -1 && var15.field901 == null) {
				var18 = var15.method295(22, arg8, var10, var11, var12, var13, -1);
			} else {
				var18 = new SLPOTSAU(arg2, arg8, true, var12, var10, var11, 22, var13, var15.field889);
			}

			arg1.method529(arg9, var18, arg4, var14, arg7, var16, var17);

			if (var15.field914 && var15.field882) {
				arg5.method483(arg4, arg7);
			}
		} else if (arg0 == 10 || arg0 == 11) {
			UPHLHIWQ var19;
			if (var15.field889 == -1 && var15.field901 == null) {
				var19 = var15.method295(10, arg8, var10, var11, var12, var13, -1);
			} else {
				var19 = new SLPOTSAU(arg2, arg8, true, var12, var10, var11, 10, var13, var15.field889);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg0 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg8 == 1 || arg8 == 3) {
					var21 = var15.field894;
					var22 = var15.field902;
				} else {
					var21 = var15.field902;
					var22 = var15.field894;
				}

				arg1.method533(arg7, arg9, var14, var22, var19, arg4, var16, var21, var20, var17);
			}

			if (var15.field914) {
				arg5.method482(arg4, arg7, var15.field894, var15.field925, arg8, var15.field902);
			}
		} else if (arg0 >= 12) {
			UPHLHIWQ var23;
			if (var15.field889 == -1 && var15.field901 == null) {
				var23 = var15.method295(arg0, arg8, var10, var11, var12, var13, -1);
			} else {
				var23 = new SLPOTSAU(arg2, arg8, true, var12, var10, var11, arg0, var13, var15.field889);
			}

			arg1.method533(arg7, arg9, var14, 1, var23, arg4, var16, 1, 0, var17);

			if (var15.field914) {
				arg5.method482(arg4, arg7, var15.field894, var15.field925, arg8, var15.field902);
			}
		} else if (arg0 == 0) {
			UPHLHIWQ var24;
			if (var15.field889 == -1 && var15.field901 == null) {
				var24 = var15.method295(0, arg8, var10, var11, var12, var13, -1);
			} else {
				var24 = new SLPOTSAU(arg2, arg8, true, var12, var10, var11, 0, var13, var15.field889);
			}

			arg1.method531(field102[arg8], var14, 0, var16, var24, arg9, arg7, null, arg4, var17);

			if (var15.field914) {
				arg5.method481(arg8, var15.field925, arg0, arg7, arg4);
			}
		} else if (arg0 == 1) {
			UPHLHIWQ var25;
			if (var15.field889 == -1 && var15.field901 == null) {
				var25 = var15.method295(1, arg8, var10, var11, var12, var13, -1);
			} else {
				var25 = new SLPOTSAU(arg2, arg8, true, var12, var10, var11, 1, var13, var15.field889);
			}

			arg1.method531(field111[arg8], var14, 0, var16, var25, arg9, arg7, null, arg4, var17);

			if (var15.field914) {
				arg5.method481(arg8, var15.field925, arg0, arg7, arg4);
			}
		} else if (arg0 == 2) {
			int var26 = arg8 + 1 & 0x3;
			UPHLHIWQ var27;
			UPHLHIWQ var28;
			if (var15.field889 == -1 && var15.field901 == null) {
				var27 = var15.method295(2, arg8 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method295(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new SLPOTSAU(arg2, arg8 + 4, true, var12, var10, var11, 2, var13, var15.field889);
				var28 = new SLPOTSAU(arg2, var26, true, var12, var10, var11, 2, var13, var15.field889);
			}

			arg1.method531(field102[arg8], var14, field102[var26], var16, var27, arg9, arg7, var28, arg4, var17);

			if (var15.field914) {
				arg5.method481(arg8, var15.field925, arg0, arg7, arg4);
			}
		} else if (arg0 == 3) {
			UPHLHIWQ var29;
			if (var15.field889 == -1 && var15.field901 == null) {
				var29 = var15.method295(3, arg8, var10, var11, var12, var13, -1);
			} else {
				var29 = new SLPOTSAU(arg2, arg8, true, var12, var10, var11, 3, var13, var15.field889);
			}

			arg1.method531(field111[arg8], var14, 0, var16, var29, arg9, arg7, null, arg4, var17);

			if (var15.field914) {
				arg5.method481(arg8, var15.field925, arg0, arg7, arg4);
			}
		} else if (arg0 == 9) {
			UPHLHIWQ var30;
			if (var15.field889 == -1 && var15.field901 == null) {
				var30 = var15.method295(arg0, arg8, var10, var11, var12, var13, -1);
			} else {
				var30 = new SLPOTSAU(arg2, arg8, true, var12, var10, var11, arg0, var13, var15.field889);
			}

			arg1.method533(arg7, arg9, var14, 1, var30, arg4, var16, 1, 0, var17);

			if (var15.field914) {
				arg5.method482(arg4, arg7, var15.field894, var15.field925, arg8, var15.field902);
			}
		} else {
			if (var15.field898) {
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

			if (arg0 == 4) {
				UPHLHIWQ var35;
				if (var15.field889 == -1 && var15.field901 == null) {
					var35 = var15.method295(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new SLPOTSAU(arg2, 0, true, var12, var10, var11, 4, var13, var15.field889);
				}

				arg1.method532(var14, arg4, var35, var17, field102[arg8], var16, arg7, arg9, arg8 * 512, 0, 0);
			} else if (arg0 == 5) {
				int var36 = 16;
				int var37 = arg1.method549(arg9, arg4, arg7);
				if (var37 > 0) {
					var36 = LWJTLDAE.method290(var37 >> 14 & 0x7FFF).field887;
				}

				UPHLHIWQ var38;
				if (var15.field889 == -1 && var15.field901 == null) {
					var38 = var15.method295(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new SLPOTSAU(arg2, 0, true, var12, var10, var11, 4, var13, var15.field889);
				}

				arg1.method532(var14, arg4, var38, var17, field102[arg8], var16, arg7, arg9, arg8 * 512, field112[arg8] * var36, field91[arg8] * var36);
			} else if (arg0 == 6) {
				UPHLHIWQ var39;
				if (var15.field889 == -1 && var15.field901 == null) {
					var39 = var15.method295(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new SLPOTSAU(arg2, 0, true, var12, var10, var11, 4, var13, var15.field889);
				}

				arg1.method532(var14, arg4, var39, var17, 256, var16, arg7, arg9, arg8, 0, 0);
			} else if (arg0 == 7) {
				UPHLHIWQ var40;
				if (var15.field889 == -1 && var15.field901 == null) {
					var40 = var15.method295(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new SLPOTSAU(arg2, 0, true, var12, var10, var11, 4, var13, var15.field889);
				}

				arg1.method532(var14, arg4, var40, var17, 512, var16, arg7, arg9, arg8, 0, 0);
			} else if (arg0 == 8) {
				UPHLHIWQ var41;
				if (var15.field889 == -1 && var15.field901 == null) {
					var41 = var15.method295(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new SLPOTSAU(arg2, 0, true, var12, var10, var11, 4, var13, var15.field889);
				}

				arg1.method532(var14, arg4, var41, var17, 768, var16, arg7, arg9, arg8, 0, 0);
			}
		}
	}

	@ObfuscatedName("CDASFTJJ.a(I[BII)Z")
	public static final boolean method33(byte[] arg0, int arg1, int arg2) {
		boolean var3 = true;
		PKHWFJLM var4 = new PKHWFJLM(arg0);
		int var5 = -1;
		while (true) {
			int var6 = var4.method344();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method344();
					if (var9 == 0) {
						break;
					}

					var4.method330();
				} else {
					int var10 = var4.method344();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method330() >> 2;
					int var14 = arg1 + var12;
					int var15 = arg2 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						LWJTLDAE var16 = LWJTLDAE.method290(var5);
						if (var13 != 22 || !field114 || var16.field882 || var16.field924) {
							var3 &= var16.method296();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("CDASFTJJ.a(BIIII)V")
	public final void method34(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg1; var5 <= arg1 + arg3; var5++) {
			for (int var6 = arg0; var6 <= arg0 + arg2; var6++) {
				if (var6 >= 0 && var6 < field104 && var5 >= 0 && var5 < field105) {
					field99[0][var6][var5] = 127;

					if (arg0 == var6 && var6 > 0) {
						field101[0][var6][var5] = field101[0][var6 - 1][var5];
					}

					if (arg0 + arg2 == var6 && var6 < field104 - 1) {
						field101[0][var6][var5] = field101[0][var6 + 1][var5];
					}

					if (arg1 == var5 && var5 > 0) {
						field101[0][var6][var5] = field101[0][var6][var5 - 1];
					}

					if (arg1 + arg3 == var5 && var5 < field105 - 1) {
						field101[0][var6][var5] = field101[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("CDASFTJJ.a(IILTJMGSZMW;ILWJVLISUF;IIII)V")
	public final void method35(int arg0, int arg1, TJMGSZMW arg2, int arg3, WJVLISUF arg4, int arg5, int arg6, int arg7) {
		if (field114 && (field97[0][arg7][arg3] & 0x2) == 0) {
			if ((field97[arg1][arg7][arg3] & 0x10) != 0) {
				return;
			}

			if (method38(arg3, arg7, arg1) != field113) {
				return;
			}
		}

		if (arg1 < field103) {
			field103 = arg1;
		}

		int var9 = field101[arg1][arg7][arg3];
		int var10 = field101[arg1][arg7 + 1][arg3];
		int var11 = field101[arg1][arg7 + 1][arg3 + 1];
		int var12 = field101[arg1][arg7][arg3 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		LWJTLDAE var14 = LWJTLDAE.method290(arg5);
		int var15 = (arg5 << 14) + (arg3 << 7) + arg7 + 0x40000000;
		if (!var14.field882) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg0 << 6) + arg6);
		if (arg6 == 22) {
			if (!field114 || var14.field882 || var14.field924) {
				UPHLHIWQ var17;
				if (var14.field889 == -1 && var14.field901 == null) {
					var17 = var14.method295(22, arg0, var9, var10, var11, var12, -1);
				} else {
					var17 = new SLPOTSAU(arg5, arg0, true, var11, var9, var10, 22, var12, var14.field889);
				}

				arg4.method529(arg1, var17, arg7, var13, arg3, var15, var16);

				if (var14.field914 && var14.field882 && arg2 != null) {
					arg2.method483(arg7, arg3);
				}
			}
		} else if (arg6 == 10 || arg6 == 11) {
			UPHLHIWQ var18;
			if (var14.field889 == -1 && var14.field901 == null) {
				var18 = var14.method295(10, arg0, var9, var10, var11, var12, -1);
			} else {
				var18 = new SLPOTSAU(arg5, arg0, true, var11, var9, var10, 10, var12, var14.field889);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg6 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg0 == 1 || arg0 == 3) {
					var20 = var14.field894;
					var21 = var14.field902;
				} else {
					var20 = var14.field902;
					var21 = var14.field894;
				}

				if (arg4.method533(arg3, arg1, var13, var21, var18, arg7, var15, var20, var19, var16) && var14.field893) {
					PSGMMDJS var22;
					if (var18 instanceof PSGMMDJS) {
						var22 = (PSGMMDJS) var18;
					} else {
						var22 = var14.method295(10, arg0, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field1020 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field99[arg1][arg7 + var23][arg3 + var24]) {
									field99[arg1][arg7 + var23][arg3 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field914 && arg2 != null) {
				arg2.method482(arg7, arg3, var14.field894, var14.field925, arg0, var14.field902);
			}
		} else if (arg6 >= 12) {
			UPHLHIWQ var26;
			if (var14.field889 == -1 && var14.field901 == null) {
				var26 = var14.method295(arg6, arg0, var9, var10, var11, var12, -1);
			} else {
				var26 = new SLPOTSAU(arg5, arg0, true, var11, var9, var10, arg6, var12, var14.field889);
			}

			arg4.method533(arg3, arg1, var13, 1, var26, arg7, var15, 1, 0, var16);

			if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg1 > 0) {
				field93[arg1][arg7][arg3] |= 0x924;
			}

			if (var14.field914 && arg2 != null) {
				arg2.method482(arg7, arg3, var14.field894, var14.field925, arg0, var14.field902);
			}
		} else if (arg6 == 0) {
			UPHLHIWQ var27;
			if (var14.field889 == -1 && var14.field901 == null) {
				var27 = var14.method295(0, arg0, var9, var10, var11, var12, -1);
			} else {
				var27 = new SLPOTSAU(arg5, arg0, true, var11, var9, var10, 0, var12, var14.field889);
			}

			arg4.method531(field102[arg0], var13, 0, var15, var27, arg1, arg3, null, arg7, var16);

			if (arg0 == 0) {
				if (var14.field893) {
					field99[arg1][arg7][arg3] = 50;
					field99[arg1][arg7][arg3 + 1] = 50;
				}

				if (var14.field891) {
					field93[arg1][arg7][arg3] |= 0x249;
				}
			} else if (arg0 == 1) {
				if (var14.field893) {
					field99[arg1][arg7][arg3 + 1] = 50;
					field99[arg1][arg7 + 1][arg3 + 1] = 50;
				}

				if (var14.field891) {
					field93[arg1][arg7][arg3 + 1] |= 0x492;
				}
			} else if (arg0 == 2) {
				if (var14.field893) {
					field99[arg1][arg7 + 1][arg3] = 50;
					field99[arg1][arg7 + 1][arg3 + 1] = 50;
				}

				if (var14.field891) {
					field93[arg1][arg7 + 1][arg3] |= 0x249;
				}
			} else if (arg0 == 3) {
				if (var14.field893) {
					field99[arg1][arg7][arg3] = 50;
					field99[arg1][arg7 + 1][arg3] = 50;
				}

				if (var14.field891) {
					field93[arg1][arg7][arg3] |= 0x492;
				}
			}

			if (var14.field914 && arg2 != null) {
				arg2.method481(arg0, var14.field925, arg6, arg3, arg7);
			}

			if (var14.field887 != 16) {
				arg4.method539(arg7, arg1, arg3, var14.field887);
			}
		} else if (arg6 == 1) {
			UPHLHIWQ var28;
			if (var14.field889 == -1 && var14.field901 == null) {
				var28 = var14.method295(1, arg0, var9, var10, var11, var12, -1);
			} else {
				var28 = new SLPOTSAU(arg5, arg0, true, var11, var9, var10, 1, var12, var14.field889);
			}

			arg4.method531(field111[arg0], var13, 0, var15, var28, arg1, arg3, null, arg7, var16);

			if (var14.field893) {
				if (arg0 == 0) {
					field99[arg1][arg7][arg3 + 1] = 50;
				} else if (arg0 == 1) {
					field99[arg1][arg7 + 1][arg3 + 1] = 50;
				} else if (arg0 == 2) {
					field99[arg1][arg7 + 1][arg3] = 50;
				} else if (arg0 == 3) {
					field99[arg1][arg7][arg3] = 50;
				}
			}

			if (var14.field914 && arg2 != null) {
				arg2.method481(arg0, var14.field925, arg6, arg3, arg7);
			}
		} else if (arg6 == 2) {
			int var29 = arg0 + 1 & 0x3;
			UPHLHIWQ var30;
			UPHLHIWQ var31;
			if (var14.field889 == -1 && var14.field901 == null) {
				var30 = var14.method295(2, arg0 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method295(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new SLPOTSAU(arg5, arg0 + 4, true, var11, var9, var10, 2, var12, var14.field889);
				var31 = new SLPOTSAU(arg5, var29, true, var11, var9, var10, 2, var12, var14.field889);
			}

			arg4.method531(field102[arg0], var13, field102[var29], var15, var30, arg1, arg3, var31, arg7, var16);

			if (var14.field891) {
				if (arg0 == 0) {
					field93[arg1][arg7][arg3] |= 0x249;
					field93[arg1][arg7][arg3 + 1] |= 0x492;
				} else if (arg0 == 1) {
					field93[arg1][arg7][arg3 + 1] |= 0x492;
					field93[arg1][arg7 + 1][arg3] |= 0x249;
				} else if (arg0 == 2) {
					field93[arg1][arg7 + 1][arg3] |= 0x249;
					field93[arg1][arg7][arg3] |= 0x492;
				} else if (arg0 == 3) {
					field93[arg1][arg7][arg3] |= 0x492;
					field93[arg1][arg7][arg3] |= 0x249;
				}
			}

			if (var14.field914 && arg2 != null) {
				arg2.method481(arg0, var14.field925, arg6, arg3, arg7);
			}

			if (var14.field887 != 16) {
				arg4.method539(arg7, arg1, arg3, var14.field887);
			}
		} else if (arg6 == 3) {
			UPHLHIWQ var32;
			if (var14.field889 == -1 && var14.field901 == null) {
				var32 = var14.method295(3, arg0, var9, var10, var11, var12, -1);
			} else {
				var32 = new SLPOTSAU(arg5, arg0, true, var11, var9, var10, 3, var12, var14.field889);
			}

			arg4.method531(field111[arg0], var13, 0, var15, var32, arg1, arg3, null, arg7, var16);

			if (var14.field893) {
				if (arg0 == 0) {
					field99[arg1][arg7][arg3 + 1] = 50;
				} else if (arg0 == 1) {
					field99[arg1][arg7 + 1][arg3 + 1] = 50;
				} else if (arg0 == 2) {
					field99[arg1][arg7 + 1][arg3] = 50;
				} else if (arg0 == 3) {
					field99[arg1][arg7][arg3] = 50;
				}
			}

			if (var14.field914 && arg2 != null) {
				arg2.method481(arg0, var14.field925, arg6, arg3, arg7);
			}
		} else if (arg6 == 9) {
			UPHLHIWQ var33;
			if (var14.field889 == -1 && var14.field901 == null) {
				var33 = var14.method295(arg6, arg0, var9, var10, var11, var12, -1);
			} else {
				var33 = new SLPOTSAU(arg5, arg0, true, var11, var9, var10, arg6, var12, var14.field889);
			}

			arg4.method533(arg3, arg1, var13, 1, var33, arg7, var15, 1, 0, var16);

			if (var14.field914 && arg2 != null) {
				arg2.method482(arg7, arg3, var14.field894, var14.field925, arg0, var14.field902);
			}
		} else {
			if (var14.field898) {
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

			if (arg6 == 4) {
				UPHLHIWQ var38;
				if (var14.field889 == -1 && var14.field901 == null) {
					var38 = var14.method295(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new SLPOTSAU(arg5, 0, true, var11, var9, var10, 4, var12, var14.field889);
				}

				arg4.method532(var13, arg7, var38, var16, field102[arg0], var15, arg3, arg1, arg0 * 512, 0, 0);
			} else if (arg6 == 5) {
				int var39 = 16;
				int var40 = arg4.method549(arg1, arg7, arg3);
				if (var40 > 0) {
					var39 = LWJTLDAE.method290(var40 >> 14 & 0x7FFF).field887;
				}

				UPHLHIWQ var41;
				if (var14.field889 == -1 && var14.field901 == null) {
					var41 = var14.method295(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new SLPOTSAU(arg5, 0, true, var11, var9, var10, 4, var12, var14.field889);
				}

				arg4.method532(var13, arg7, var41, var16, field102[arg0], var15, arg3, arg1, arg0 * 512, field112[arg0] * var39, field91[arg0] * var39);
			} else if (arg6 == 6) {
				UPHLHIWQ var42;
				if (var14.field889 == -1 && var14.field901 == null) {
					var42 = var14.method295(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new SLPOTSAU(arg5, 0, true, var11, var9, var10, 4, var12, var14.field889);
				}

				arg4.method532(var13, arg7, var42, var16, 256, var15, arg3, arg1, arg0, 0, 0);
			} else if (arg6 == 7) {
				UPHLHIWQ var43;
				if (var14.field889 == -1 && var14.field901 == null) {
					var43 = var14.method295(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new SLPOTSAU(arg5, 0, true, var11, var9, var10, 4, var12, var14.field889);
				}

				arg4.method532(var13, arg7, var43, var16, 512, var15, arg3, arg1, arg0, 0, 0);
			} else if (arg6 == 8) {
				UPHLHIWQ var44;
				if (var14.field889 == -1 && var14.field901 == null) {
					var44 = var14.method295(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new SLPOTSAU(arg5, 0, true, var11, var9, var10, 4, var12, var14.field889);
				}

				arg4.method532(var13, arg7, var44, var16, 768, var15, arg3, arg1, arg0, 0, 0);
			}
		}
	}

	@ObfuscatedName("CDASFTJJ.a(IIII)I")
	public static final int method36(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - YVYOADIW.field1486[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("CDASFTJJ.a(IILPKHWFJLM;IIIII)V")
	public final void method37(int arg0, int arg1, PKHWFJLM arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg3 >= 0 && arg3 < 104 && arg1 >= 0 && arg1 < 104) {
			field97[arg5][arg3][arg1] = 0;
			while (true) {
				int var8 = arg2.method330();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg2.method330();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg5 == 0) {
						field101[0][arg3][arg1] = -var9 * 8;
						return;
					}

					field101[arg5][arg3][arg1] = field101[arg5 - 1][arg3][arg1] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field95[arg5][arg3][arg1] = arg2.method331();
					field92[arg5][arg3][arg1] = (byte) ((var8 - 2) / 4);
					field98[arg5][arg3][arg1] = (byte) (var8 + arg4 - 2 & 0x3);
				} else if (var8 <= 81) {
					field97[arg5][arg3][arg1] = (byte) (var8 - 49);
				} else {
					field115[arg5][arg3][arg1] = (byte) (var8 - 81);
				}
			}

			if (arg5 == 0) {
				field101[0][arg3][arg1] = -method31(arg3 + arg0 + 932731, arg1 + 556238 + arg6) * 8;
			} else {
				field101[arg5][arg3][arg1] = field101[arg5 - 1][arg3][arg1] - 240;
			}
		} else {
			while (true) {
				int var10 = arg2.method330();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg2.method330();
					return;
				}

				if (var10 <= 49) {
					arg2.method330();
				}
			}
		}
	}

	@ObfuscatedName("CDASFTJJ.a(IBII)I")
	public int method38(int arg0, int arg1, int arg2) {
		if ((field97[arg2][arg1][arg0] & 0x8) != 0) {
			return 0;
		}

		if (arg2 > 0 && (field97[1][arg1][arg0] & 0x2) != 0) {
			return arg2 - 1;
		}

		return arg2;
	}

	@ObfuscatedName("CDASFTJJ.a(IIII[BI[LTJMGSZMW;)V")
	public final void method39(int arg0, int arg1, int arg2, byte[] arg3, int arg4, TJMGSZMW[] arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg4 + var8 > 0 && arg4 + var8 < 103 && arg1 + var9 > 0 && arg1 + var9 < 103) {
						arg5[var7].field1295[arg4 + var8][arg1 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		PKHWFJLM var10 = new PKHWFJLM(arg3);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method37(arg2, arg1 + var13, var10, arg4 + var12, 0, var11, arg0);
				}
			}
		}
	}

	@ObfuscatedName("CDASFTJJ.b(II)I")
	public static final int method40(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	public CDASFTJJ(int[][][] arg0, byte[][][] arg1, int arg2, int arg3) {
		field103 = 99;
		field104 = arg2;
		field105 = arg3;
		field101 = arg0;
		field97 = arg1;
		field115 = new byte[4][field104][field105];
		field95 = new byte[4][field104][field105];
		field92 = new byte[4][field104][field105];
		field98 = new byte[4][field104][field105];
		field93 = new int[4][field104 + 1][field105 + 1];
		field99 = new byte[4][field104 + 1][field105 + 1];
		field94 = new int[field104 + 1][field105 + 1];
		field106 = new int[field105];
		field107 = new int[field105];
		field108 = new int[field105];
		field109 = new int[field105];
		field110 = new int[field105];
	}

	@ObfuscatedName("CDASFTJJ.b(III)Z")
	public static final boolean method41(int arg0, int arg1) {
		LWJTLDAE var2 = LWJTLDAE.method290(arg0);

		if (arg1 == 11) {
			arg1 = 10;
		}

		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}

		return var2.method298(arg1);
	}

	@ObfuscatedName("CDASFTJJ.c(II)I")
	public static final int method42(int arg0, int arg1) {
		int var2 = method40(arg0 - 1, arg1 - 1) + method40(arg0 + 1, arg1 - 1) + method40(arg0 - 1, arg1 + 1) + method40(arg0 + 1, arg1 + 1);
		int var3 = method40(arg0 - 1, arg1) + method40(arg0 + 1, arg1) + method40(arg0, arg1 - 1) + method40(arg0, arg1 + 1);
		int var4 = method40(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("CDASFTJJ.c(III)I")
	public static final int method43(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method42(var3, var5);
		int var8 = method42(var3 + 1, var5);
		int var9 = method42(var3, var5 + 1);
		int var10 = method42(var3 + 1, var5 + 1);
		int var11 = method36(var7, var8, var4, arg2);
		int var12 = method36(var9, var10, var4, arg2);
		return method36(var11, var12, var6, arg2);
	}

	@ObfuscatedName("CDASFTJJ.d(II)I")
	public final int method44(int arg0, int arg1) {
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

	@ObfuscatedName("CDASFTJJ.e(II)I")
	public static final int method45(int arg0, int arg1) {
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

	@ObfuscatedName("CDASFTJJ.a(II[BIIILWJVLISUF;III[LTJMGSZMW;)V")
	public final void method46(int arg0, byte[] arg1, int arg2, int arg3, int arg4, WJVLISUF arg5, int arg6, int arg7, int arg8, TJMGSZMW[] arg9) {
		PKHWFJLM var11 = new PKHWFJLM(arg1);
		int var12 = -1;
		while (true) {
			int var13 = var11.method344();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method344();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method330();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg0 == var18 && var17 >= arg4 && var17 < arg4 + 8 && var16 >= arg2 && var16 < arg2 + 8) {
					LWJTLDAE var22 = LWJTLDAE.method290(var12);
					int var23 = arg3 + RBJNNTUF.method456(var17 & 0x7, var22.field902, arg6, var16 & 0x7, var21, var22.field894);
					int var24 = arg8 + RBJNNTUF.method457(arg6, var22.field902, var22.field894, var17 & 0x7, var21, var16 & 0x7);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg7;
						if ((field97[1][var23][var24] & 0x2) == 2) {
							var25 = arg7 - 1;
						}

						TJMGSZMW var26 = null;
						if (var25 >= 0) {
							var26 = arg9[var25];
						}

						method35(arg6 + var21 & 0x3, arg7, var26, var24, arg5, var12, var20, var23);
					}
				}
			}
		}
	}

	@ObfuscatedName("CDASFTJJ.a(ILWJVLISUF;[LTJMGSZMW;II[B)V")
	public final void method47(int arg0, WJVLISUF arg1, TJMGSZMW[] arg2, int arg3, byte[] arg4) {
		PKHWFJLM var6 = new PKHWFJLM(arg4);
		int var7 = -1;
		while (true) {
			int var8 = var6.method344();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method344();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method330();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg0 + var12;
				int var18 = arg3 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field97[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					TJMGSZMW var20 = null;
					if (var19 >= 0) {
						var20 = arg2[var19];
					}

					method35(var16, var13, var20, var18, arg1, var7, var15, var17);
				}
			}
		}
	}
}
