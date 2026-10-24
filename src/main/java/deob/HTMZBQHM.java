package deob;

@ObfuscatedName("HTMZBQHM")
public final class HTMZBQHM {

	@ObfuscatedName("HTMZBQHM.t")
	public int field799;

	@ObfuscatedName("HTMZBQHM.u")
	public int field800;

	@ObfuscatedName("HTMZBQHM.k")
	public int[][][] field793;

	@ObfuscatedName("HTMZBQHM.g")
	public byte[][][] field790;

	@ObfuscatedName("HTMZBQHM.n")
	public byte[][][] field795;

	@ObfuscatedName("HTMZBQHM.f")
	public byte[][][] field789;

	@ObfuscatedName("HTMZBQHM.i")
	public byte[][][] field792;

	@ObfuscatedName("HTMZBQHM.G")
	public byte[][][] field808;

	@ObfuscatedName("HTMZBQHM.y")
	public int[][][] field803;

	@ObfuscatedName("HTMZBQHM.F")
	public byte[][][] field807;

	@ObfuscatedName("HTMZBQHM.B")
	public int[][] field805;

	@ObfuscatedName("HTMZBQHM.a")
	public int[] field784;

	@ObfuscatedName("HTMZBQHM.b")
	public int[] field785;

	@ObfuscatedName("HTMZBQHM.c")
	public int[] field786;

	@ObfuscatedName("HTMZBQHM.d")
	public int[] field787;

	@ObfuscatedName("HTMZBQHM.e")
	public int[] field788;

	@ObfuscatedName("HTMZBQHM.h")
	public static boolean field791 = true;

	@ObfuscatedName("HTMZBQHM.l")
	public static final int[] field794 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("HTMZBQHM.p")
	public static final int[] field796 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("HTMZBQHM.s")
	public static int field798 = 99;

	@ObfuscatedName("HTMZBQHM.v")
	public static final int[] field801 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("HTMZBQHM.A")
	public static final int[] field804 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("HTMZBQHM.r")
	public static int field797 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("HTMZBQHM.w")
	public static int field802 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("HTMZBQHM.C")
	public static int field806;

	@ObfuscatedName("HTMZBQHM.a(ILDLDGGHZP;[BI[LEXLGBZBR;I)V")
	public final void method347(int arg0, DLDGGHZP arg1, byte[] arg2, EXLGBZBR[] arg3, int arg4) {
		LDILQFVA var6 = new LDILQFVA(arg2);
		int var7 = -1;
		while (true) {
			int var8 = var6.method416();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method416();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method402();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg0 + var12;
				int var18 = arg4 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field790[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					EXLGBZBR var20 = null;
					if (var19 >= 0) {
						var20 = arg3[var19];
					}

					method359(var16, var13, var15, var17, arg1, var7, var18, var20);
				}
			}
		}
	}

	@ObfuscatedName("HTMZBQHM.a(ZLDLDGGHZP;[LEXLGBZBR;)V")
	public final void method348(DLDGGHZP arg0, EXLGBZBR[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field790[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field790[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method243(var4, var5);
						}
					}
				}
			}
		}

		field797 += (int) (Math.random() * 5.0D) - 2;
		if (field797 < -8) {
			field797 = -8;
		}

		if (field797 > 8) {
			field797 = 8;
		}

		field802 += (int) (Math.random() * 5.0D) - 2;
		if (field802 < -16) {
			field802 = -16;
		}

		if (field802 > 16) {
			field802 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field807[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field800 - 1; var16++) {
				for (int var17 = 1; var17 < field799 - 1; var17++) {
					int var18 = field793[var7][var17 + 1][var16] - field793[var7][var17 - 1][var16];
					int var19 = field793[var7][var17][var16 + 1] - field793[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field805[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field800; var26++) {
				field784[var26] = 0;
				field785[var26] = 0;
				field786[var26] = 0;
				field787[var26] = 0;
				field788[var26] = 0;
			}

			for (int var27 = -5; var27 < field799 + 5; var27++) {
				for (int var28 = 0; var28 < field800; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field799) {
						int var30 = field795[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							WDDURNZH var31 = WDDURNZH.field1333[var30 - 1];
							field784[var28] += var31.field1342;
							field785[var28] += var31.field1340;
							field786[var28] += var31.field1341;
							field787[var28] += var31.field1343;
							field788[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field799) {
						int var33 = field795[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							WDDURNZH var34 = WDDURNZH.field1333[var33 - 1];
							field784[var28] -= var34.field1342;
							field785[var28] -= var34.field1340;
							field786[var28] -= var34.field1341;
							field787[var28] -= var34.field1343;
							field788[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field799 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field800 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field800) {
							var35 += field784[var41];
							var36 += field785[var41];
							var37 += field786[var41];
							var38 += field787[var41];
							var39 += field788[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field800) {
							var35 -= field784[var42];
							var36 -= field785[var42];
							var37 -= field786[var42];
							var38 -= field787[var42];
							var39 -= field788[var42];
						}

						if (var40 >= 1 && var40 < field800 - 1 && (!field791 || (field790[0][var27][var40] & 0x2) != 0 || (field790[var7][var27][var40] & 0x10) == 0 && method352(var27, var40, var7) == field806)) {
							if (var7 < field798) {
								field798 = var7;
							}

							int var43 = field795[var7][var27][var40] & 0xFF;
							int var44 = field789[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field793[var7][var27][var40];
								int var46 = field793[var7][var27 + 1][var40];
								int var47 = field793[var7][var27 + 1][var40 + 1];
								int var48 = field793[var7][var27][var40 + 1];
								int var49 = field805[var27][var40];
								int var50 = field805[var27 + 1][var40];
								int var51 = field805[var27 + 1][var40 + 1];
								int var52 = field805[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method366(var55, var56, var57);
									var55 = field797 + var55 & 0xFF;
									var57 += field802;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method366(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field792[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !WDDURNZH.field1333[var44 - 1].field1338) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field803[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = GSZOCBMU.field706[method349(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method163(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method349(var53, var49), method349(var53, var50), method349(var53, var51), method349(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field792[var7][var27][var40] + 1;
									byte var61 = field808[var7][var27][var40];
									WDDURNZH var62 = WDDURNZH.field1333[var44 - 1];
									int var63 = var62.field1336;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = GSZOCBMU.method304(var63);
										var65 = -1;
									} else if (var62.field1335 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method366(var62.field1339, var62.field1340, var62.field1341);
										var64 = GSZOCBMU.field706[method357(var62.field1344, 96)];
									}

									arg0.method163(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method349(var53, var49), method349(var53, var50), method349(var53, var51), method349(var53, var52), method357(var65, var49), method357(var65, var50), method357(var65, var51), method357(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field800 - 1; var66++) {
				for (int var67 = 1; var67 < field799 - 1; var67++) {
					arg0.method162(var7, var67, var66, method352(var67, var66, var7));
				}
			}
		}

		arg0.method189(-50, -50, 768, 64, -10);

		for (int var68 = 0; var68 < field799; var68++) {
			for (int var69 = 0; var69 < field800; var69++) {
				if ((field790[1][var68][var69] & 0x2) == 2) {
					arg0.method160(var68, var69);
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
				for (int var75 = 0; var75 <= field800; var75++) {
					for (int var76 = 0; var76 <= field799; var76++) {
						if ((field803[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field803[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field800 && (field803[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field803[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field803[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field793[var80][var76][var77] - var84;
								int var86 = field793[var79][var76][var77];
								DLDGGHZP.method161(var76 * 128, var73, var85, var77 * 128, var76 * 128, var78 * 128 + 128, 1, var86);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field803[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field803[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field803[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field799 && (field803[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field803[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field803[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field793[var92][var89][var75] - var96;
								int var98 = field793[var91][var89][var75];
								DLDGGHZP.method161(var90 * 128 + 128, var73, var97, var75 * 128, var89 * 128, var75 * 128, 2, var98);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field803[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field803[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field803[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field800 && (field803[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field803[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field799) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field803[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field793[var74][var101][var103];
								DLDGGHZP.method161(var102 * 128 + 128, var73, var107, var103 * 128, var101 * 128, var104 * 128 + 128, 4, var107);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field803[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("HTMZBQHM.a(II)I")
	public static final int method349(int arg0, int arg1) {
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

	@ObfuscatedName("HTMZBQHM.a([[[IIIIIILDLDGGHZP;IIILEXLGBZBR;)V")
	public static final void method350(int[][][] arg0, int arg1, int arg2, int arg3, int arg4, DLDGGHZP arg5, int arg6, int arg7, int arg8, EXLGBZBR arg9) {
		int var10 = arg0[arg3][arg8][arg2];
		int var11 = arg0[arg3][arg8 + 1][arg2];
		int var12 = arg0[arg3][arg8 + 1][arg2 + 1];
		int var13 = arg0[arg3][arg8][arg2 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		USIJLMTP var15 = USIJLMTP.method555(arg7);
		int var16 = (arg7 << 14) + (arg2 << 7) + arg8 + 0x40000000;
		if (!var15.field1242) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg6 << 6) + arg4);
		if (arg4 == 22) {
			FGVBONDH var18;
			if (var15.field1251 == -1 && var15.field1265 == null) {
				var18 = var15.method548(22, arg6, var10, var11, var12, var13, -1);
			} else {
				var18 = new FSCCBLKX(arg6, var11, true, var15.field1251, arg7, 22, var10, var12, var13);
			}

			arg5.method164(var17, var14, arg8, arg1, var16, arg2, var18);

			if (var15.field1244 && var15.field1242) {
				arg9.method243(arg8, arg2);
			}
		} else if (arg4 == 10 || arg4 == 11) {
			FGVBONDH var19;
			if (var15.field1251 == -1 && var15.field1265 == null) {
				var19 = var15.method548(10, arg6, var10, var11, var12, var13, -1);
			} else {
				var19 = new FSCCBLKX(arg6, var11, true, var15.field1251, arg7, 10, var10, var12, var13);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg4 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg6 == 1 || arg6 == 3) {
					var21 = var15.field1237;
					var22 = var15.field1269;
				} else {
					var21 = var15.field1269;
					var22 = var15.field1237;
				}

				arg5.method168(var21, var20, arg8, var19, var16, arg1, arg2, var17, var22, var14);
			}

			if (var15.field1244) {
				arg9.method242(var15.field1237, arg2, arg6, arg8, var15.field1269, var15.field1253);
			}
		} else if (arg4 >= 12) {
			FGVBONDH var23;
			if (var15.field1251 == -1 && var15.field1265 == null) {
				var23 = var15.method548(arg4, arg6, var10, var11, var12, var13, -1);
			} else {
				var23 = new FSCCBLKX(arg6, var11, true, var15.field1251, arg7, arg4, var10, var12, var13);
			}

			arg5.method168(1, 0, arg8, var23, var16, arg1, arg2, var17, 1, var14);

			if (var15.field1244) {
				arg9.method242(var15.field1237, arg2, arg6, arg8, var15.field1269, var15.field1253);
			}
		} else if (arg4 == 0) {
			FGVBONDH var24;
			if (var15.field1251 == -1 && var15.field1265 == null) {
				var24 = var15.method548(0, arg6, var10, var11, var12, var13, -1);
			} else {
				var24 = new FSCCBLKX(arg6, var11, true, var15.field1251, arg7, 0, var10, var12, var13);
			}

			arg5.method166(arg1, var17, arg8, field794[arg6], arg2, null, var14, var24, 0, var16);

			if (var15.field1244) {
				arg9.method241(var15.field1253, arg2, arg6, arg8, arg4);
			}
		} else if (arg4 == 1) {
			FGVBONDH var25;
			if (var15.field1251 == -1 && var15.field1265 == null) {
				var25 = var15.method548(1, arg6, var10, var11, var12, var13, -1);
			} else {
				var25 = new FSCCBLKX(arg6, var11, true, var15.field1251, arg7, 1, var10, var12, var13);
			}

			arg5.method166(arg1, var17, arg8, field801[arg6], arg2, null, var14, var25, 0, var16);

			if (var15.field1244) {
				arg9.method241(var15.field1253, arg2, arg6, arg8, arg4);
			}
		} else if (arg4 == 2) {
			int var26 = arg6 + 1 & 0x3;
			FGVBONDH var27;
			FGVBONDH var28;
			if (var15.field1251 == -1 && var15.field1265 == null) {
				var27 = var15.method548(2, arg6 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method548(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new FSCCBLKX(arg6 + 4, var11, true, var15.field1251, arg7, 2, var10, var12, var13);
				var28 = new FSCCBLKX(var26, var11, true, var15.field1251, arg7, 2, var10, var12, var13);
			}

			arg5.method166(arg1, var17, arg8, field794[arg6], arg2, var28, var14, var27, field794[var26], var16);

			if (var15.field1244) {
				arg9.method241(var15.field1253, arg2, arg6, arg8, arg4);
			}
		} else if (arg4 == 3) {
			FGVBONDH var29;
			if (var15.field1251 == -1 && var15.field1265 == null) {
				var29 = var15.method548(3, arg6, var10, var11, var12, var13, -1);
			} else {
				var29 = new FSCCBLKX(arg6, var11, true, var15.field1251, arg7, 3, var10, var12, var13);
			}

			arg5.method166(arg1, var17, arg8, field801[arg6], arg2, null, var14, var29, 0, var16);

			if (var15.field1244) {
				arg9.method241(var15.field1253, arg2, arg6, arg8, arg4);
			}
		} else if (arg4 == 9) {
			FGVBONDH var30;
			if (var15.field1251 == -1 && var15.field1265 == null) {
				var30 = var15.method548(arg4, arg6, var10, var11, var12, var13, -1);
			} else {
				var30 = new FSCCBLKX(arg6, var11, true, var15.field1251, arg7, arg4, var10, var12, var13);
			}

			arg5.method168(1, 0, arg8, var30, var16, arg1, arg2, var17, 1, var14);

			if (var15.field1244) {
				arg9.method242(var15.field1237, arg2, arg6, arg8, var15.field1269, var15.field1253);
			}
		} else {
			if (var15.field1240) {
				if (arg6 == 1) {
					int var31 = var13;
					var13 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var31;
				} else if (arg6 == 2) {
					int var32 = var13;
					var13 = var11;
					var11 = var32;
					int var33 = var12;
					var12 = var10;
					var10 = var33;
				} else if (arg6 == 3) {
					int var34 = var13;
					var13 = var10;
					var10 = var11;
					var11 = var12;
					var12 = var34;
				}
			}

			if (arg4 == 4) {
				FGVBONDH var35;
				if (var15.field1251 == -1 && var15.field1265 == null) {
					var35 = var15.method548(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new FSCCBLKX(0, var11, true, var15.field1251, arg7, 4, var10, var12, var13);
				}

				arg5.method167(field794[arg6], var16, var35, 0, var17, arg2, var14, arg8, 0, arg1, arg6 * 512);
			} else if (arg4 == 5) {
				int var36 = 16;
				int var37 = arg5.method184(arg1, arg8, arg2);
				if (var37 > 0) {
					var36 = USIJLMTP.method555(var37 >> 14 & 0x7FFF).field1261;
				}

				FGVBONDH var38;
				if (var15.field1251 == -1 && var15.field1265 == null) {
					var38 = var15.method548(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new FSCCBLKX(0, var11, true, var15.field1251, arg7, 4, var10, var12, var13);
				}

				arg5.method167(field794[arg6], var16, var38, field796[arg6] * var36, var17, arg2, var14, arg8, field804[arg6] * var36, arg1, arg6 * 512);
			} else if (arg4 == 6) {
				FGVBONDH var39;
				if (var15.field1251 == -1 && var15.field1265 == null) {
					var39 = var15.method548(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new FSCCBLKX(0, var11, true, var15.field1251, arg7, 4, var10, var12, var13);
				}

				arg5.method167(256, var16, var39, 0, var17, arg2, var14, arg8, 0, arg1, arg6);
			} else if (arg4 == 7) {
				FGVBONDH var40;
				if (var15.field1251 == -1 && var15.field1265 == null) {
					var40 = var15.method548(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new FSCCBLKX(0, var11, true, var15.field1251, arg7, 4, var10, var12, var13);
				}

				arg5.method167(512, var16, var40, 0, var17, arg2, var14, arg8, 0, arg1, arg6);
			} else if (arg4 == 8) {
				FGVBONDH var41;
				if (var15.field1251 == -1 && var15.field1265 == null) {
					var41 = var15.method548(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new FSCCBLKX(0, var11, true, var15.field1251, arg7, 4, var10, var12, var13);
				}

				arg5.method167(768, var16, var41, 0, var17, arg2, var14, arg8, 0, arg1, arg6);
			}
		}
	}

	@ObfuscatedName("HTMZBQHM.a(IIII)I")
	public static final int method351(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - GSZOCBMU.field695[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("HTMZBQHM.b(IIII)I")
	public int method352(int arg0, int arg1, int arg2) {
		if ((field790[arg2][arg0][arg1] & 0x8) != 0) {
			return 0;
		}

		if (arg2 > 0 && (field790[1][arg0][arg1] & 0x2) != 0) {
			return arg2 - 1;
		}

		return arg2;
	}

	@ObfuscatedName("HTMZBQHM.b(II)I")
	public static final int method353(int arg0, int arg1) {
		int var2 = method363(arg0 + 45365, arg1 + 91923, 4) + (method363(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method363(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("HTMZBQHM.a([BIBI)Z")
	public static final boolean method354(byte[] arg0, int arg1, int arg2) {
		boolean var3 = true;
		LDILQFVA var4 = new LDILQFVA(arg0);
		int var5 = -1;
		while (true) {
			int var6 = var4.method416();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method416();
					if (var9 == 0) {
						break;
					}

					var4.method402();
				} else {
					int var10 = var4.method416();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method402() >> 2;
					int var14 = arg1 + var12;
					int var15 = arg2 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						USIJLMTP var16 = USIJLMTP.method555(var5);
						if (var13 != 22 || !field791 || var16.field1242 || var16.field1275) {
							var3 &= var16.method550();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("HTMZBQHM.c(II)I")
	public static final int method355(int arg0, int arg1) {
		int var2 = method365(arg0 - 1, arg1 - 1) + method365(arg0 + 1, arg1 - 1) + method365(arg0 - 1, arg1 + 1) + method365(arg0 + 1, arg1 + 1);
		int var3 = method365(arg0 - 1, arg1) + method365(arg0 + 1, arg1) + method365(arg0, arg1 - 1) + method365(arg0, arg1 + 1);
		int var4 = method365(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("HTMZBQHM.a(ILLDILQFVA;LGLPUEKVZ;)V")
	public static final void method356(LDILQFVA arg0, GLPUEKVZ arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method416();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			USIJLMTP var4 = USIJLMTP.method555(var2);
			var4.method552(arg1);

			while (true) {
				int var5 = arg0.method416();
				if (var5 == 0) {
					break;
				}

				arg0.method402();
			}
		}
	}

	@ObfuscatedName("HTMZBQHM.d(II)I")
	public final int method357(int arg0, int arg1) {
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

	@ObfuscatedName("HTMZBQHM.a(I[LEXLGBZBR;IILDLDGGHZP;IZI[BII)V")
	public final void method358(int arg0, EXLGBZBR[] arg1, int arg2, int arg3, DLDGGHZP arg4, int arg5, int arg6, byte[] arg7, int arg8, int arg9) {
		LDILQFVA var11 = new LDILQFVA(arg7);
		int var12 = -1;
		while (true) {
			int var13 = var11.method416();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method416();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method402();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg9 == var18 && var17 >= arg0 && var17 < arg0 + 8 && var16 >= arg5 && var16 < arg5 + 8) {
					USIJLMTP var22 = USIJLMTP.method555(var12);
					int var23 = arg6 + CEOKPAKZ.method8(var22.field1269, var22.field1237, var17 & 0x7, arg2, var16 & 0x7);
					int var24 = arg8 + CEOKPAKZ.method9(var22.field1237, var16 & 0x7, var22.field1269, arg2, var17 & 0x7);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg3;
						if ((field790[1][var23][var24] & 0x2) == 2) {
							var25 = arg3 - 1;
						}

						EXLGBZBR var26 = null;
						if (var25 >= 0) {
							var26 = arg1[var25];
						}

						method359(arg2 + var21 & 0x3, arg3, var20, var23, arg4, var12, var24, var26);
					}
				}
			}
		}
	}

	@ObfuscatedName("HTMZBQHM.a(IIIIILDLDGGHZP;IILEXLGBZBR;)V")
	public final void method359(int arg0, int arg1, int arg2, int arg3, DLDGGHZP arg4, int arg5, int arg6, EXLGBZBR arg7) {
		if (field791 && (field790[0][arg3][arg6] & 0x2) == 0) {
			if ((field790[arg1][arg3][arg6] & 0x10) != 0) {
				return;
			}

			if (method352(arg3, arg6, arg1) != field806) {
				return;
			}
		}

		if (arg1 < field798) {
			field798 = arg1;
		}

		int var9 = field793[arg1][arg3][arg6];
		int var10 = field793[arg1][arg3 + 1][arg6];
		int var11 = field793[arg1][arg3 + 1][arg6 + 1];
		int var12 = field793[arg1][arg3][arg6 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		USIJLMTP var14 = USIJLMTP.method555(arg5);
		int var15 = (arg5 << 14) + (arg6 << 7) + arg3 + 0x40000000;
		if (!var14.field1242) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg0 << 6) + arg2);
		if (arg2 == 22) {
			if (!field791 || var14.field1242 || var14.field1275) {
				FGVBONDH var17;
				if (var14.field1251 == -1 && var14.field1265 == null) {
					var17 = var14.method548(22, arg0, var9, var10, var11, var12, -1);
				} else {
					var17 = new FSCCBLKX(arg0, var10, true, var14.field1251, arg5, 22, var9, var11, var12);
				}

				arg4.method164(var16, var13, arg3, arg1, var15, arg6, var17);

				if (var14.field1244 && var14.field1242 && arg7 != null) {
					arg7.method243(arg3, arg6);
				}
			}
		} else if (arg2 == 10 || arg2 == 11) {
			FGVBONDH var18;
			if (var14.field1251 == -1 && var14.field1265 == null) {
				var18 = var14.method548(10, arg0, var9, var10, var11, var12, -1);
			} else {
				var18 = new FSCCBLKX(arg0, var10, true, var14.field1251, arg5, 10, var9, var11, var12);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg2 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg0 == 1 || arg0 == 3) {
					var20 = var14.field1237;
					var21 = var14.field1269;
				} else {
					var20 = var14.field1269;
					var21 = var14.field1237;
				}

				if (arg4.method168(var20, var19, arg3, var18, var15, arg1, arg6, var16, var21, var13) && var14.field1247) {
					HEQROJXW var22;
					if (var18 instanceof HEQROJXW) {
						var22 = (HEQROJXW) var18;
					} else {
						var22 = var14.method548(10, arg0, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field741 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field807[arg1][arg3 + var23][arg6 + var24]) {
									field807[arg1][arg3 + var23][arg6 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field1244 && arg7 != null) {
				arg7.method242(var14.field1237, arg6, arg0, arg3, var14.field1269, var14.field1253);
			}
		} else if (arg2 >= 12) {
			FGVBONDH var26;
			if (var14.field1251 == -1 && var14.field1265 == null) {
				var26 = var14.method548(arg2, arg0, var9, var10, var11, var12, -1);
			} else {
				var26 = new FSCCBLKX(arg0, var10, true, var14.field1251, arg5, arg2, var9, var11, var12);
			}

			arg4.method168(1, 0, arg3, var26, var15, arg1, arg6, var16, 1, var13);

			if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg1 > 0) {
				field803[arg1][arg3][arg6] |= 0x924;
			}

			if (var14.field1244 && arg7 != null) {
				arg7.method242(var14.field1237, arg6, arg0, arg3, var14.field1269, var14.field1253);
			}
		} else if (arg2 == 0) {
			FGVBONDH var27;
			if (var14.field1251 == -1 && var14.field1265 == null) {
				var27 = var14.method548(0, arg0, var9, var10, var11, var12, -1);
			} else {
				var27 = new FSCCBLKX(arg0, var10, true, var14.field1251, arg5, 0, var9, var11, var12);
			}

			arg4.method166(arg1, var16, arg3, field794[arg0], arg6, null, var13, var27, 0, var15);

			if (arg0 == 0) {
				if (var14.field1247) {
					field807[arg1][arg3][arg6] = 50;
					field807[arg1][arg3][arg6 + 1] = 50;
				}

				if (var14.field1258) {
					field803[arg1][arg3][arg6] |= 0x249;
				}
			} else if (arg0 == 1) {
				if (var14.field1247) {
					field807[arg1][arg3][arg6 + 1] = 50;
					field807[arg1][arg3 + 1][arg6 + 1] = 50;
				}

				if (var14.field1258) {
					field803[arg1][arg3][arg6 + 1] |= 0x492;
				}
			} else if (arg0 == 2) {
				if (var14.field1247) {
					field807[arg1][arg3 + 1][arg6] = 50;
					field807[arg1][arg3 + 1][arg6 + 1] = 50;
				}

				if (var14.field1258) {
					field803[arg1][arg3 + 1][arg6] |= 0x249;
				}
			} else if (arg0 == 3) {
				if (var14.field1247) {
					field807[arg1][arg3][arg6] = 50;
					field807[arg1][arg3 + 1][arg6] = 50;
				}

				if (var14.field1258) {
					field803[arg1][arg3][arg6] |= 0x492;
				}
			}

			if (var14.field1244 && arg7 != null) {
				arg7.method241(var14.field1253, arg6, arg0, arg3, arg2);
			}

			if (var14.field1261 != 16) {
				arg4.method174(arg3, arg1, arg6, var14.field1261);
			}
		} else if (arg2 == 1) {
			FGVBONDH var28;
			if (var14.field1251 == -1 && var14.field1265 == null) {
				var28 = var14.method548(1, arg0, var9, var10, var11, var12, -1);
			} else {
				var28 = new FSCCBLKX(arg0, var10, true, var14.field1251, arg5, 1, var9, var11, var12);
			}

			arg4.method166(arg1, var16, arg3, field801[arg0], arg6, null, var13, var28, 0, var15);

			if (var14.field1247) {
				if (arg0 == 0) {
					field807[arg1][arg3][arg6 + 1] = 50;
				} else if (arg0 == 1) {
					field807[arg1][arg3 + 1][arg6 + 1] = 50;
				} else if (arg0 == 2) {
					field807[arg1][arg3 + 1][arg6] = 50;
				} else if (arg0 == 3) {
					field807[arg1][arg3][arg6] = 50;
				}
			}

			if (var14.field1244 && arg7 != null) {
				arg7.method241(var14.field1253, arg6, arg0, arg3, arg2);
			}
		} else if (arg2 == 2) {
			int var29 = arg0 + 1 & 0x3;
			FGVBONDH var30;
			FGVBONDH var31;
			if (var14.field1251 == -1 && var14.field1265 == null) {
				var30 = var14.method548(2, arg0 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method548(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new FSCCBLKX(arg0 + 4, var10, true, var14.field1251, arg5, 2, var9, var11, var12);
				var31 = new FSCCBLKX(var29, var10, true, var14.field1251, arg5, 2, var9, var11, var12);
			}

			arg4.method166(arg1, var16, arg3, field794[arg0], arg6, var31, var13, var30, field794[var29], var15);

			if (var14.field1258) {
				if (arg0 == 0) {
					field803[arg1][arg3][arg6] |= 0x249;
					field803[arg1][arg3][arg6 + 1] |= 0x492;
				} else if (arg0 == 1) {
					field803[arg1][arg3][arg6 + 1] |= 0x492;
					field803[arg1][arg3 + 1][arg6] |= 0x249;
				} else if (arg0 == 2) {
					field803[arg1][arg3 + 1][arg6] |= 0x249;
					field803[arg1][arg3][arg6] |= 0x492;
				} else if (arg0 == 3) {
					field803[arg1][arg3][arg6] |= 0x492;
					field803[arg1][arg3][arg6] |= 0x249;
				}
			}

			if (var14.field1244 && arg7 != null) {
				arg7.method241(var14.field1253, arg6, arg0, arg3, arg2);
			}

			if (var14.field1261 != 16) {
				arg4.method174(arg3, arg1, arg6, var14.field1261);
			}
		} else if (arg2 == 3) {
			FGVBONDH var32;
			if (var14.field1251 == -1 && var14.field1265 == null) {
				var32 = var14.method548(3, arg0, var9, var10, var11, var12, -1);
			} else {
				var32 = new FSCCBLKX(arg0, var10, true, var14.field1251, arg5, 3, var9, var11, var12);
			}

			arg4.method166(arg1, var16, arg3, field801[arg0], arg6, null, var13, var32, 0, var15);

			if (var14.field1247) {
				if (arg0 == 0) {
					field807[arg1][arg3][arg6 + 1] = 50;
				} else if (arg0 == 1) {
					field807[arg1][arg3 + 1][arg6 + 1] = 50;
				} else if (arg0 == 2) {
					field807[arg1][arg3 + 1][arg6] = 50;
				} else if (arg0 == 3) {
					field807[arg1][arg3][arg6] = 50;
				}
			}

			if (var14.field1244 && arg7 != null) {
				arg7.method241(var14.field1253, arg6, arg0, arg3, arg2);
			}
		} else if (arg2 == 9) {
			FGVBONDH var33;
			if (var14.field1251 == -1 && var14.field1265 == null) {
				var33 = var14.method548(arg2, arg0, var9, var10, var11, var12, -1);
			} else {
				var33 = new FSCCBLKX(arg0, var10, true, var14.field1251, arg5, arg2, var9, var11, var12);
			}

			arg4.method168(1, 0, arg3, var33, var15, arg1, arg6, var16, 1, var13);

			if (var14.field1244 && arg7 != null) {
				arg7.method242(var14.field1237, arg6, arg0, arg3, var14.field1269, var14.field1253);
			}
		} else {
			if (var14.field1240) {
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

			if (arg2 == 4) {
				FGVBONDH var38;
				if (var14.field1251 == -1 && var14.field1265 == null) {
					var38 = var14.method548(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new FSCCBLKX(0, var10, true, var14.field1251, arg5, 4, var9, var11, var12);
				}

				arg4.method167(field794[arg0], var15, var38, 0, var16, arg6, var13, arg3, 0, arg1, arg0 * 512);
			} else if (arg2 == 5) {
				int var39 = 16;
				int var40 = arg4.method184(arg1, arg3, arg6);
				if (var40 > 0) {
					var39 = USIJLMTP.method555(var40 >> 14 & 0x7FFF).field1261;
				}

				FGVBONDH var41;
				if (var14.field1251 == -1 && var14.field1265 == null) {
					var41 = var14.method548(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new FSCCBLKX(0, var10, true, var14.field1251, arg5, 4, var9, var11, var12);
				}

				arg4.method167(field794[arg0], var15, var41, field796[arg0] * var39, var16, arg6, var13, arg3, field804[arg0] * var39, arg1, arg0 * 512);
			} else if (arg2 == 6) {
				FGVBONDH var42;
				if (var14.field1251 == -1 && var14.field1265 == null) {
					var42 = var14.method548(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new FSCCBLKX(0, var10, true, var14.field1251, arg5, 4, var9, var11, var12);
				}

				arg4.method167(256, var15, var42, 0, var16, arg6, var13, arg3, 0, arg1, arg0);
			} else if (arg2 == 7) {
				FGVBONDH var43;
				if (var14.field1251 == -1 && var14.field1265 == null) {
					var43 = var14.method548(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new FSCCBLKX(0, var10, true, var14.field1251, arg5, 4, var9, var11, var12);
				}

				arg4.method167(512, var15, var43, 0, var16, arg6, var13, arg3, 0, arg1, arg0);
			} else if (arg2 == 8) {
				FGVBONDH var44;
				if (var14.field1251 == -1 && var14.field1265 == null) {
					var44 = var14.method548(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new FSCCBLKX(0, var10, true, var14.field1251, arg5, 4, var9, var11, var12);
				}

				arg4.method167(768, var15, var44, 0, var16, arg6, var13, arg3, 0, arg1, arg0);
			}
		}
	}

	@ObfuscatedName("HTMZBQHM.a(III)Z")
	public static final boolean method360(int arg0, int arg1) {
		USIJLMTP var2 = USIJLMTP.method555(arg1);

		if (arg0 == 11) {
			arg0 = 10;
		}

		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}

		return var2.method554(arg0);
	}

	@ObfuscatedName("HTMZBQHM.a(IIIIILLDILQFVA;II)V")
	public final void method361(int arg0, int arg1, int arg2, int arg3, LDILQFVA arg4, int arg5, int arg6) {
		if (arg0 >= 0 && arg0 < 104 && arg6 >= 0 && arg6 < 104) {
			field790[arg1][arg0][arg6] = 0;
			while (true) {
				int var8 = arg4.method402();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg4.method402();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg1 == 0) {
						field793[0][arg0][arg6] = -var9 * 8;
						return;
					}

					field793[arg1][arg0][arg6] = field793[arg1 - 1][arg0][arg6] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field789[arg1][arg0][arg6] = arg4.method403();
					field792[arg1][arg0][arg6] = (byte) ((var8 - 2) / 4);
					field808[arg1][arg0][arg6] = (byte) (var8 + arg2 - 2 & 0x3);
				} else if (var8 <= 81) {
					field790[arg1][arg0][arg6] = (byte) (var8 - 49);
				} else {
					field795[arg1][arg0][arg6] = (byte) (var8 - 81);
				}
			}

			if (arg1 == 0) {
				field793[0][arg0][arg6] = -method353(arg0 + arg5 + 932731, arg6 + 556238 + arg3) * 8;
			} else {
				field793[arg1][arg0][arg6] = field793[arg1 - 1][arg0][arg6] - 240;
			}
		} else {
			while (true) {
				int var10 = arg4.method402();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg4.method402();
					return;
				}

				if (var10 <= 49) {
					arg4.method402();
				}
			}
		}
	}

	public HTMZBQHM(byte[][][] arg0, int arg1, int[][][] arg2, int arg3) {
		field798 = 99;
		field799 = arg1;
		field800 = arg3;
		field793 = arg2;
		field790 = arg0;
		field795 = new byte[4][field799][field800];
		field789 = new byte[4][field799][field800];
		field792 = new byte[4][field799][field800];
		field808 = new byte[4][field799][field800];
		field803 = new int[4][field799 + 1][field800 + 1];
		field807 = new byte[4][field799 + 1][field800 + 1];
		field805 = new int[field799 + 1][field800 + 1];
		field784 = new int[field800];
		field785 = new int[field800];
		field786 = new int[field800];
		field787 = new int[field800];
		field788 = new int[field800];
	}

	@ObfuscatedName("HTMZBQHM.a(IIIII)V")
	public final void method362(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg2; var5 <= arg0 + arg2; var5++) {
			for (int var6 = arg3; var6 <= arg1 + arg3; var6++) {
				if (var6 >= 0 && var6 < field799 && var5 >= 0 && var5 < field800) {
					field807[0][var6][var5] = 127;

					if (arg3 == var6 && var6 > 0) {
						field793[0][var6][var5] = field793[0][var6 - 1][var5];
					}

					if (arg1 + arg3 == var6 && var6 < field799 - 1) {
						field793[0][var6][var5] = field793[0][var6 + 1][var5];
					}

					if (arg2 == var5 && var5 > 0) {
						field793[0][var6][var5] = field793[0][var6][var5 - 1];
					}

					if (arg0 + arg2 == var5 && var5 < field800 - 1) {
						field793[0][var6][var5] = field793[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("HTMZBQHM.b(III)I")
	public static final int method363(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method355(var3, var5);
		int var8 = method355(var3 + 1, var5);
		int var9 = method355(var3, var5 + 1);
		int var10 = method355(var3 + 1, var5 + 1);
		int var11 = method351(var7, var8, var4, arg2);
		int var12 = method351(var9, var10, var4, arg2);
		return method351(var11, var12, var6, arg2);
	}

	@ObfuscatedName("HTMZBQHM.a([LEXLGBZBR;[BIIIIZ)V")
	public final void method364(EXLGBZBR[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg2 + var8 > 0 && arg2 + var8 < 103 && arg5 + var9 > 0 && arg5 + var9 < 103) {
						arg0[var7].field615[arg2 + var8][arg5 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		LDILQFVA var10 = new LDILQFVA(arg1);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method361(arg2 + var12, var11, 0, arg3, var10, arg4, arg5 + var13);
				}
			}
		}
	}

	@ObfuscatedName("HTMZBQHM.e(II)I")
	public static final int method365(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("HTMZBQHM.c(III)I")
	public final int method366(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("HTMZBQHM.a([LEXLGBZBR;[BIIIIIIIB)V")
	public final void method367(EXLGBZBR[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg3 + var10 > 0 && arg3 + var10 < 103 && arg2 + var11 > 0 && arg2 + var11 < 103) {
					arg0[arg4].field615[arg3 + var10][arg2 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		LDILQFVA var12 = new LDILQFVA(arg1);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg5 == var13 && var14 >= arg8 && var14 < arg8 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
						method361(arg3 + CEOKPAKZ.method6(arg7, var15 & 0x7, var14 & 0x7), arg4, arg7, 0, var12, 0, arg2 + CEOKPAKZ.method7(var14 & 0x7, arg7, var15 & 0x7));
					} else {
						method361(-1, 0, 0, 0, var12, 0, -1);
					}
				}
			}
		}
	}
}
