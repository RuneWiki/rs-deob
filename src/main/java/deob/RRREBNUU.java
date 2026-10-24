package deob;

@ObfuscatedName("RRREBNUU")
public final class RRREBNUU {

	@ObfuscatedName("RRREBNUU.a")
	public static boolean field1168 = true;

	@ObfuscatedName("RRREBNUU.e")
	public int field1171;

	@ObfuscatedName("RRREBNUU.f")
	public int field1172;

	@ObfuscatedName("RRREBNUU.k")
	public int[][][] field1177;

	@ObfuscatedName("RRREBNUU.s")
	public byte[][][] field1184;

	@ObfuscatedName("RRREBNUU.B")
	public byte[][][] field1189;

	@ObfuscatedName("RRREBNUU.j")
	public byte[][][] field1176;

	@ObfuscatedName("RRREBNUU.D")
	public byte[][][] field1191;

	@ObfuscatedName("RRREBNUU.C")
	public byte[][][] field1190;

	@ObfuscatedName("RRREBNUU.w")
	public int[][][] field1185;

	@ObfuscatedName("RRREBNUU.y")
	public byte[][][] field1186;

	@ObfuscatedName("RRREBNUU.b")
	public int[][] field1169;

	@ObfuscatedName("RRREBNUU.l")
	public int[] field1178;

	@ObfuscatedName("RRREBNUU.m")
	public int[] field1179;

	@ObfuscatedName("RRREBNUU.n")
	public int[] field1180;

	@ObfuscatedName("RRREBNUU.o")
	public int[] field1181;

	@ObfuscatedName("RRREBNUU.p")
	public int[] field1182;

	@ObfuscatedName("RRREBNUU.c")
	public static final int[] field1170 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("RRREBNUU.h")
	public static final int[] field1174 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("RRREBNUU.i")
	public static final int[] field1175 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("RRREBNUU.A")
	public static final int[] field1188 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("RRREBNUU.q")
	public static int field1183 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("RRREBNUU.z")
	public static int field1187 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("RRREBNUU.g")
	public static int field1173;

	@ObfuscatedName("RRREBNUU.a(III)Z")
	public static final boolean method432(int arg0, int arg1) {
		UVSOAWGE var2 = UVSOAWGE.method501(arg1);

		if (arg0 == 11) {
			arg0 = 10;
		}

		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}

		return var2.method497(arg0);
	}

	@ObfuscatedName("RRREBNUU.a(III[BILXRAHVOIV;Z[LUTWNPFGW;III)V")
	public final void method433(int arg0, int arg1, int arg2, byte[] arg3, int arg4, XRAHVOIV arg5, UTWNPFGW[] arg6, int arg7, int arg8, int arg9) {
		INLHDAGO var11 = new INLHDAGO(arg3);
		int var12 = -1;
		while (true) {
			int var13 = var11.method322();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method322();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method308();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg2 == var18 && var17 >= arg4 && var17 < arg4 + 8 && var16 >= arg1 && var16 < arg1 + 8) {
					UVSOAWGE var22 = UVSOAWGE.method501(var12);
					int var23 = arg0 + class1.method3(var17 & 0x7, arg8, var22.field1300, var16 & 0x7, var22.field1332);
					int var24 = arg7 + class1.method4(var22.field1300, var22.field1332, var16 & 0x7, arg8, var17 & 0x7);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = var18;
						if ((field1184[1][var23][var24] & 0x2) == 2) {
							var25 = var18 - 1;
						}

						UTWNPFGW var26 = null;
						if (var25 >= 0) {
							var26 = arg6[var25];
						}

						method444(var18, var20, var23, var26, var12, arg8 + var21 & 0x3, arg5, var24);
					}
				}
			}
		}
	}

	@ObfuscatedName("RRREBNUU.b(III)I")
	public final int method434(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("RRREBNUU.a(I[BIIIIIII)V")
	public final void method435(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		INLHDAGO var9 = new INLHDAGO(arg1);
		for (int var10 = 0; var10 < 4; var10++) {
			for (int var11 = 0; var11 < 64; var11++) {
				for (int var12 = 0; var12 < 64; var12++) {
					if (arg6 == var10 && var11 >= arg0 && var11 < arg0 + 8 && var12 >= arg7 && var12 < arg7 + 8) {
						method446(arg3, arg5, arg4 + class1.method2(var11 & 0x7, var12 & 0x7, arg3), var9, 0, arg2 + class1.method1(var11 & 0x7, arg3, var12 & 0x7), 0);
					} else {
						method446(0, 0, -1, var9, 0, -1, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("RRREBNUU.a(I[LUTWNPFGW;LXRAHVOIV;)V")
	public final void method436(UTWNPFGW[] arg0, XRAHVOIV arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field1184[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field1184[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg0[var6].method487(var4, var5);
						}
					}
				}
			}
		}

		field1183 += (int) (Math.random() * 5.0D) - 2;
		if (field1183 < -8) {
			field1183 = -8;
		}

		if (field1183 > 8) {
			field1183 = 8;
		}

		field1187 += (int) (Math.random() * 5.0D) - 2;
		if (field1187 < -16) {
			field1187 = -16;
		}

		if (field1187 > 16) {
			field1187 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field1186[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field1172 - 1; var16++) {
				for (int var17 = 1; var17 < field1171 - 1; var17++) {
					int var18 = field1177[var7][var17 + 1][var16] - field1177[var7][var17 - 1][var16];
					int var19 = field1177[var7][var17][var16 + 1] - field1177[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field1169[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field1172; var26++) {
				field1178[var26] = 0;
				field1179[var26] = 0;
				field1180[var26] = 0;
				field1181[var26] = 0;
				field1182[var26] = 0;
			}

			for (int var27 = -5; var27 < field1171 + 5; var27++) {
				for (int var28 = 0; var28 < field1172; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field1171) {
						int var30 = field1189[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							SCDBMUNA var31 = SCDBMUNA.field1215[var30 - 1];
							field1178[var28] += var31.field1224;
							field1179[var28] += var31.field1222;
							field1180[var28] += var31.field1223;
							field1181[var28] += var31.field1225;
							field1182[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field1171) {
						int var33 = field1189[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							SCDBMUNA var34 = SCDBMUNA.field1215[var33 - 1];
							field1178[var28] -= var34.field1224;
							field1179[var28] -= var34.field1222;
							field1180[var28] -= var34.field1223;
							field1181[var28] -= var34.field1225;
							field1182[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field1171 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field1172 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field1172) {
							var35 += field1178[var41];
							var36 += field1179[var41];
							var37 += field1180[var41];
							var38 += field1181[var41];
							var39 += field1182[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field1172) {
							var35 -= field1178[var42];
							var36 -= field1179[var42];
							var37 -= field1180[var42];
							var38 -= field1181[var42];
							var39 -= field1182[var42];
						}

						if (var40 >= 1 && var40 < field1172 - 1 && (!field1168 || (field1184[var7][var27][var40] & 0x10) == 0 && method449(var7, var40, var27) == field1173)) {
							int var43 = field1189[var7][var27][var40] & 0xFF;
							int var44 = field1176[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field1177[var7][var27][var40];
								int var46 = field1177[var7][var27 + 1][var40];
								int var47 = field1177[var7][var27 + 1][var40 + 1];
								int var48 = field1177[var7][var27][var40 + 1];
								int var49 = field1169[var27][var40];
								int var50 = field1169[var27 + 1][var40];
								int var51 = field1169[var27 + 1][var40 + 1];
								int var52 = field1169[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method434(var55, var56, var57);
									var55 = field1183 + var55 & 0xFF;
									var57 += field1187;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method434(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field1191[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !SCDBMUNA.field1215[var44 - 1].field1220) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field1185[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = DKTEWQXO.field640[method439(var54, 96)];
								}

								if (var44 == 0) {
									arg1.method532(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method439(var53, var49), method439(var53, var50), method439(var53, var51), method439(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field1191[var7][var27][var40] + 1;
									byte var61 = field1190[var7][var27][var40];
									SCDBMUNA var62 = SCDBMUNA.field1215[var44 - 1];
									int var63 = var62.field1218;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = DKTEWQXO.method223(var63);
										var65 = -1;
									} else if (var62.field1217 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method434(var62.field1221, var62.field1222, var62.field1223);
										var64 = DKTEWQXO.field640[method440(var62.field1226, 96)];
									}

									arg1.method532(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method439(var53, var49), method439(var53, var50), method439(var53, var51), method439(var53, var52), method440(var65, var49), method440(var65, var50), method440(var65, var51), method440(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field1172 - 1; var66++) {
				for (int var67 = 1; var67 < field1171 - 1; var67++) {
					arg1.method531(var7, var67, var66, method449(var7, var66, var67));
				}
			}
		}

		arg1.method558(-10, -50, -50, 768, 64);

		for (int var68 = 0; var68 < field1171; var68++) {
			for (int var69 = 0; var69 < field1172; var69++) {
				if ((field1184[1][var68][var69] & 0x2) == 2) {
					arg1.method529(var69, var68);
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
				for (int var75 = 0; var75 <= field1172; var75++) {
					for (int var76 = 0; var76 <= field1171; var76++) {
						if ((field1185[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field1185[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field1172 && (field1185[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label321: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field1185[var79 - 1][var76][var81] & var70) == 0) {
										break label321;
									}
								}

								var79--;
							}

							label310: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field1185[var80 + 1][var76][var82] & var70) == 0) {
										break label310;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field1177[var80][var76][var77] - var84;
								int var86 = field1177[var79][var76][var77];
								XRAHVOIV.method530(var76 * 128, var77 * 128, var76 * 128, var86, var78 * 128 + 128, var73, var85, 1);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field1185[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field1185[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field1185[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field1171 && (field1185[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label374: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field1185[var91 - 1][var93][var75] & var71) == 0) {
										break label374;
									}
								}

								var91--;
							}

							label363: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field1185[var92 + 1][var94][var75] & var71) == 0) {
										break label363;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field1177[var92][var89][var75] - var96;
								int var98 = field1177[var91][var89][var75];
								XRAHVOIV.method530(var89 * 128, var75 * 128, var90 * 128 + 128, var98, var75 * 128, var73, var97, 2);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field1185[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field1185[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field1185[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field1172 && (field1185[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label427: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field1185[var74][var101 - 1][var105] & var72) == 0) {
										break label427;
									}
								}

								var101--;
							}

							label416: while (var102 < field1171) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field1185[var74][var102 + 1][var106] & var72) == 0) {
										break label416;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field1177[var74][var101][var103];
								XRAHVOIV.method530(var101 * 128, var103 * 128, var102 * 128 + 128, var107, var104 * 128 + 128, var73, var107, 4);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field1185[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("RRREBNUU.a(LCXHZUTUD;BLINLHDAGO;)V")
	public static final void method437(CXHZUTUD arg0, INLHDAGO arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg1.method322();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			UVSOAWGE var4 = UVSOAWGE.method501(var2);
			var4.method502(arg0);

			while (true) {
				int var5 = arg1.method322();
				if (var5 == 0) {
					break;
				}

				arg1.method308();
			}
		}
	}

	@ObfuscatedName("RRREBNUU.a(III[BII)V")
	public final void method438(int arg0, int arg1, int arg2, byte[] arg3, int arg4) {
		INLHDAGO var6 = new INLHDAGO(arg3);
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					method446(0, var7, arg4 + var9, var6, arg1, arg2 + var8, arg0);
				}
			}
		}
	}

	@ObfuscatedName("RRREBNUU.a(II)I")
	public static final int method439(int arg0, int arg1) {
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

	@ObfuscatedName("RRREBNUU.b(II)I")
	public final int method440(int arg0, int arg1) {
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

	@ObfuscatedName("RRREBNUU.c(II)I")
	public static final int method441(int arg0, int arg1) {
		int var2 = method451(arg0 + 45365, arg1 + 91923, 4) + (method451(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method451(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("RRREBNUU.a(I[BII)Z")
	public static final boolean method442(int arg0, byte[] arg1, int arg2) {
		boolean var3 = true;
		INLHDAGO var4 = new INLHDAGO(arg1);
		int var5 = -1;
		while (true) {
			int var6 = var4.method322();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method322();
					if (var9 == 0) {
						break;
					}

					var4.method308();
				} else {
					int var10 = var4.method322();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method308() >> 2;
					int var14 = arg0 + var12;
					int var15 = arg2 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						UVSOAWGE var16 = UVSOAWGE.method501(var5);
						if (var13 != 22 || !field1168 || var16.field1318 || var16.field1306) {
							var3 &= var16.method498();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("RRREBNUU.d(II)I")
	public static final int method443(int arg0, int arg1) {
		int var2 = method445(arg0 - 1, arg1 - 1) + method445(arg0 + 1, arg1 - 1) + method445(arg0 - 1, arg1 + 1) + method445(arg0 + 1, arg1 + 1);
		int var3 = method445(arg0 - 1, arg1) + method445(arg0 + 1, arg1) + method445(arg0, arg1 - 1) + method445(arg0, arg1 + 1);
		int var4 = method445(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("RRREBNUU.a(IIILUTWNPFGW;IILXRAHVOIV;BI)V")
	public final void method444(int arg0, int arg1, int arg2, UTWNPFGW arg3, int arg4, int arg5, XRAHVOIV arg6, int arg7) {
		if (field1168) {
			if ((field1184[arg0][arg2][arg7] & 0x10) != 0) {
				return;
			}

			if (method449(arg0, arg7, arg2) != field1173) {
				return;
			}
		}

		int var9 = field1177[arg0][arg2][arg7];
		int var10 = field1177[arg0][arg2 + 1][arg7];
		int var11 = field1177[arg0][arg2 + 1][arg7 + 1];
		int var12 = field1177[arg0][arg2][arg7 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		UVSOAWGE var14 = UVSOAWGE.method501(arg4);
		int var15 = (arg4 << 14) + (arg7 << 7) + arg2 + 0x40000000;
		if (!var14.field1318) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg5 << 6) + arg1);
		if (arg1 == 22) {
			if (!field1168 || var14.field1318 || var14.field1306) {
				ESLZGWKZ var17;
				if (var14.field1329 == -1 && var14.field1343 == null) {
					var17 = var14.method506(22, arg5, var9, var10, var11, var12, -1);
				} else {
					var17 = new GXBMUAVX(true, var10, arg4, var12, var14.field1329, var11, arg5, 22, var9);
				}

				arg6.method533(var13, var16, arg2, arg7, arg0, var17, var15);

				if (var14.field1311 && var14.field1318 && arg3 != null) {
					arg3.method487(arg2, arg7);
				}
			}
		} else if (arg1 == 10 || arg1 == 11) {
			ESLZGWKZ var18;
			if (var14.field1329 == -1 && var14.field1343 == null) {
				var18 = var14.method506(10, arg5, var9, var10, var11, var12, -1);
			} else {
				var18 = new GXBMUAVX(true, var10, arg4, var12, var14.field1329, var11, arg5, 10, var9);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg1 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg5 == 1 || arg5 == 3) {
					var20 = var14.field1332;
					var21 = var14.field1300;
				} else {
					var20 = var14.field1300;
					var21 = var14.field1332;
				}

				if (arg6.method537(arg2, var21, var13, var15, var20, var16, arg7, var19, var18, arg0) && var14.field1338) {
					DHUPIIUL var22;
					if (var18 instanceof DHUPIIUL) {
						var22 = (DHUPIIUL) var18;
					} else {
						var22 = var14.method506(10, arg5, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field568 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field1186[arg0][arg2 + var23][arg7 + var24]) {
									field1186[arg0][arg2 + var23][arg7 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field1311 && arg3 != null) {
				arg3.method486(arg5, arg2, var14.field1300, var14.field1332, var14.field1316, arg7);
			}
		} else if (arg1 >= 12) {
			ESLZGWKZ var26;
			if (var14.field1329 == -1 && var14.field1343 == null) {
				var26 = var14.method506(arg1, arg5, var9, var10, var11, var12, -1);
			} else {
				var26 = new GXBMUAVX(true, var10, arg4, var12, var14.field1329, var11, arg5, arg1, var9);
			}

			arg6.method537(arg2, 1, var13, var15, 1, var16, arg7, 0, var26, arg0);

			if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg0 > 0) {
				field1185[arg0][arg2][arg7] |= 0x924;
			}

			if (var14.field1311 && arg3 != null) {
				arg3.method486(arg5, arg2, var14.field1300, var14.field1332, var14.field1316, arg7);
			}
		} else if (arg1 == 0) {
			ESLZGWKZ var27;
			if (var14.field1329 == -1 && var14.field1343 == null) {
				var27 = var14.method506(0, arg5, var9, var10, var11, var12, -1);
			} else {
				var27 = new GXBMUAVX(true, var10, arg4, var12, var14.field1329, var11, arg5, 0, var9);
			}

			arg6.method535(var16, var15, var13, null, 0, var27, field1175[arg5], arg7, arg0, arg2);

			if (arg5 == 0) {
				if (var14.field1338) {
					field1186[arg0][arg2][arg7] = 50;
					field1186[arg0][arg2][arg7 + 1] = 50;
				}

				if (var14.field1307) {
					field1185[arg0][arg2][arg7] |= 0x249;
				}
			} else if (arg5 == 1) {
				if (var14.field1338) {
					field1186[arg0][arg2][arg7 + 1] = 50;
					field1186[arg0][arg2 + 1][arg7 + 1] = 50;
				}

				if (var14.field1307) {
					field1185[arg0][arg2][arg7 + 1] |= 0x492;
				}
			} else if (arg5 == 2) {
				if (var14.field1338) {
					field1186[arg0][arg2 + 1][arg7] = 50;
					field1186[arg0][arg2 + 1][arg7 + 1] = 50;
				}

				if (var14.field1307) {
					field1185[arg0][arg2 + 1][arg7] |= 0x249;
				}
			} else if (arg5 == 3) {
				if (var14.field1338) {
					field1186[arg0][arg2][arg7] = 50;
					field1186[arg0][arg2 + 1][arg7] = 50;
				}

				if (var14.field1307) {
					field1185[arg0][arg2][arg7] |= 0x492;
				}
			}

			if (var14.field1311 && arg3 != null) {
				arg3.method485(var14.field1316, arg5, arg2, arg7, arg1);
			}

			if (var14.field1330 != 16) {
				arg6.method543(arg0, arg7, var14.field1330, arg2);
			}
		} else if (arg1 == 1) {
			ESLZGWKZ var28;
			if (var14.field1329 == -1 && var14.field1343 == null) {
				var28 = var14.method506(1, arg5, var9, var10, var11, var12, -1);
			} else {
				var28 = new GXBMUAVX(true, var10, arg4, var12, var14.field1329, var11, arg5, 1, var9);
			}

			arg6.method535(var16, var15, var13, null, 0, var28, field1188[arg5], arg7, arg0, arg2);

			if (var14.field1338) {
				if (arg5 == 0) {
					field1186[arg0][arg2][arg7 + 1] = 50;
				} else if (arg5 == 1) {
					field1186[arg0][arg2 + 1][arg7 + 1] = 50;
				} else if (arg5 == 2) {
					field1186[arg0][arg2 + 1][arg7] = 50;
				} else if (arg5 == 3) {
					field1186[arg0][arg2][arg7] = 50;
				}
			}

			if (var14.field1311 && arg3 != null) {
				arg3.method485(var14.field1316, arg5, arg2, arg7, arg1);
			}
		} else if (arg1 == 2) {
			int var29 = arg5 + 1 & 0x3;
			ESLZGWKZ var30;
			ESLZGWKZ var31;
			if (var14.field1329 == -1 && var14.field1343 == null) {
				var30 = var14.method506(2, arg5 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method506(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new GXBMUAVX(true, var10, arg4, var12, var14.field1329, var11, arg5 + 4, 2, var9);
				var31 = new GXBMUAVX(true, var10, arg4, var12, var14.field1329, var11, var29, 2, var9);
			}

			arg6.method535(var16, var15, var13, var31, field1175[var29], var30, field1175[arg5], arg7, arg0, arg2);

			if (var14.field1307) {
				if (arg5 == 0) {
					field1185[arg0][arg2][arg7] |= 0x249;
					field1185[arg0][arg2][arg7 + 1] |= 0x492;
				} else if (arg5 == 1) {
					field1185[arg0][arg2][arg7 + 1] |= 0x492;
					field1185[arg0][arg2 + 1][arg7] |= 0x249;
				} else if (arg5 == 2) {
					field1185[arg0][arg2 + 1][arg7] |= 0x249;
					field1185[arg0][arg2][arg7] |= 0x492;
				} else if (arg5 == 3) {
					field1185[arg0][arg2][arg7] |= 0x492;
					field1185[arg0][arg2][arg7] |= 0x249;
				}
			}

			if (var14.field1311 && arg3 != null) {
				arg3.method485(var14.field1316, arg5, arg2, arg7, arg1);
			}

			if (var14.field1330 != 16) {
				arg6.method543(arg0, arg7, var14.field1330, arg2);
			}
		} else if (arg1 == 3) {
			ESLZGWKZ var32;
			if (var14.field1329 == -1 && var14.field1343 == null) {
				var32 = var14.method506(3, arg5, var9, var10, var11, var12, -1);
			} else {
				var32 = new GXBMUAVX(true, var10, arg4, var12, var14.field1329, var11, arg5, 3, var9);
			}

			arg6.method535(var16, var15, var13, null, 0, var32, field1188[arg5], arg7, arg0, arg2);

			if (var14.field1338) {
				if (arg5 == 0) {
					field1186[arg0][arg2][arg7 + 1] = 50;
				} else if (arg5 == 1) {
					field1186[arg0][arg2 + 1][arg7 + 1] = 50;
				} else if (arg5 == 2) {
					field1186[arg0][arg2 + 1][arg7] = 50;
				} else if (arg5 == 3) {
					field1186[arg0][arg2][arg7] = 50;
				}
			}

			if (var14.field1311 && arg3 != null) {
				arg3.method485(var14.field1316, arg5, arg2, arg7, arg1);
			}
		} else if (arg1 == 9) {
			ESLZGWKZ var33;
			if (var14.field1329 == -1 && var14.field1343 == null) {
				var33 = var14.method506(arg1, arg5, var9, var10, var11, var12, -1);
			} else {
				var33 = new GXBMUAVX(true, var10, arg4, var12, var14.field1329, var11, arg5, arg1, var9);
			}

			arg6.method537(arg2, 1, var13, var15, 1, var16, arg7, 0, var33, arg0);

			if (var14.field1311 && arg3 != null) {
				arg3.method486(arg5, arg2, var14.field1300, var14.field1332, var14.field1316, arg7);
			}
		} else {
			if (var14.field1322) {
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
				ESLZGWKZ var38;
				if (var14.field1329 == -1 && var14.field1343 == null) {
					var38 = var14.method506(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new GXBMUAVX(true, var10, arg4, var12, var14.field1329, var11, 0, 4, var9);
				}

				arg6.method536(var13, var38, arg7, arg0, var15, 0, var16, field1175[arg5], arg2, arg5 * 512, 0);
			} else if (arg1 == 5) {
				int var39 = 16;
				int var40 = arg6.method553(arg0, arg2, arg7);
				if (var40 > 0) {
					var39 = UVSOAWGE.method501(var40 >> 14 & 0x7FFF).field1330;
				}

				ESLZGWKZ var41;
				if (var14.field1329 == -1 && var14.field1343 == null) {
					var41 = var14.method506(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new GXBMUAVX(true, var10, arg4, var12, var14.field1329, var11, 0, 4, var9);
				}

				arg6.method536(var13, var41, arg7, arg0, var15, field1170[arg5] * var39, var16, field1175[arg5], arg2, arg5 * 512, field1174[arg5] * var39);
			} else if (arg1 == 6) {
				ESLZGWKZ var42;
				if (var14.field1329 == -1 && var14.field1343 == null) {
					var42 = var14.method506(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new GXBMUAVX(true, var10, arg4, var12, var14.field1329, var11, 0, 4, var9);
				}

				arg6.method536(var13, var42, arg7, arg0, var15, 0, var16, 256, arg2, arg5, 0);
			} else if (arg1 == 7) {
				ESLZGWKZ var43;
				if (var14.field1329 == -1 && var14.field1343 == null) {
					var43 = var14.method506(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new GXBMUAVX(true, var10, arg4, var12, var14.field1329, var11, 0, 4, var9);
				}

				arg6.method536(var13, var43, arg7, arg0, var15, 0, var16, 512, arg2, arg5, 0);
			} else if (arg1 == 8) {
				ESLZGWKZ var44;
				if (var14.field1329 == -1 && var14.field1343 == null) {
					var44 = var14.method506(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new GXBMUAVX(true, var10, arg4, var12, var14.field1329, var11, 0, 4, var9);
				}

				arg6.method536(var13, var44, arg7, arg0, var15, 0, var16, 768, arg2, arg5, 0);
			}
		}
	}

	@ObfuscatedName("RRREBNUU.e(II)I")
	public static final int method445(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("RRREBNUU.a(IIILINLHDAGO;BIII)V")
	public final void method446(int arg0, int arg1, int arg2, INLHDAGO arg3, int arg4, int arg5, int arg6) {
		if (arg5 >= 0 && arg5 < 104 && arg2 >= 0 && arg2 < 104) {
			field1184[arg1][arg5][arg2] = 0;
			while (true) {
				int var8 = arg3.method308();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg3.method308();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg1 == 0) {
						field1177[0][arg5][arg2] = -var9 * 8;
						return;
					}

					field1177[arg1][arg5][arg2] = field1177[arg1 - 1][arg5][arg2] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field1176[arg1][arg5][arg2] = arg3.method309();
					field1191[arg1][arg5][arg2] = (byte) ((var8 - 2) / 4);
					field1190[arg1][arg5][arg2] = (byte) (var8 + arg0 - 2 & 0x3);
				} else if (var8 <= 81) {
					field1184[arg1][arg5][arg2] = (byte) (var8 - 49);
				} else {
					field1189[arg1][arg5][arg2] = (byte) (var8 - 81);
				}
			}

			if (arg1 == 0) {
				field1177[0][arg5][arg2] = -method441(arg5 + arg6 + 932731, arg2 + 556238 + arg4) * 8;
			} else {
				field1177[arg1][arg5][arg2] = field1177[arg1 - 1][arg5][arg2] - 240;
			}
		} else {
			while (true) {
				int var10 = arg3.method308();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg3.method308();
					return;
				}

				if (var10 <= 49) {
					arg3.method308();
				}
			}
		}
	}

	@ObfuscatedName("RRREBNUU.a(LUTWNPFGW;IIIILXRAHVOIV;IIII[[[I)V")
	public static final void method447(UTWNPFGW arg0, int arg1, int arg2, int arg3, int arg4, XRAHVOIV arg5, int arg6, int arg7, int arg8, int[][][] arg9) {
		int var10 = arg9[arg3][arg7][arg6];
		int var11 = arg9[arg3][arg7 + 1][arg6];
		int var12 = arg9[arg3][arg7 + 1][arg6 + 1];
		int var13 = arg9[arg3][arg7][arg6 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		UVSOAWGE var15 = UVSOAWGE.method501(arg8);
		int var16 = (arg8 << 14) + (arg6 << 7) + arg7 + 0x40000000;
		if (!var15.field1318) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg4 << 6) + arg2);
		if (arg2 == 22) {
			ESLZGWKZ var18;
			if (var15.field1329 == -1 && var15.field1343 == null) {
				var18 = var15.method506(22, arg4, var10, var11, var12, var13, -1);
			} else {
				var18 = new GXBMUAVX(true, var11, arg8, var13, var15.field1329, var12, arg4, 22, var10);
			}

			arg5.method533(var14, var17, arg7, arg6, arg1, var18, var16);

			if (var15.field1311 && var15.field1318) {
				arg0.method487(arg7, arg6);
			}
		} else if (arg2 == 10 || arg2 == 11) {
			ESLZGWKZ var19;
			if (var15.field1329 == -1 && var15.field1343 == null) {
				var19 = var15.method506(10, arg4, var10, var11, var12, var13, -1);
			} else {
				var19 = new GXBMUAVX(true, var11, arg8, var13, var15.field1329, var12, arg4, 10, var10);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg2 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg4 == 1 || arg4 == 3) {
					var21 = var15.field1332;
					var22 = var15.field1300;
				} else {
					var21 = var15.field1300;
					var22 = var15.field1332;
				}

				arg5.method537(arg7, var22, var14, var16, var21, var17, arg6, var20, var19, arg1);
			}

			if (var15.field1311) {
				arg0.method486(arg4, arg7, var15.field1300, var15.field1332, var15.field1316, arg6);
			}
		} else if (arg2 >= 12) {
			ESLZGWKZ var23;
			if (var15.field1329 == -1 && var15.field1343 == null) {
				var23 = var15.method506(arg2, arg4, var10, var11, var12, var13, -1);
			} else {
				var23 = new GXBMUAVX(true, var11, arg8, var13, var15.field1329, var12, arg4, arg2, var10);
			}

			arg5.method537(arg7, 1, var14, var16, 1, var17, arg6, 0, var23, arg1);

			if (var15.field1311) {
				arg0.method486(arg4, arg7, var15.field1300, var15.field1332, var15.field1316, arg6);
			}
		} else if (arg2 == 0) {
			ESLZGWKZ var24;
			if (var15.field1329 == -1 && var15.field1343 == null) {
				var24 = var15.method506(0, arg4, var10, var11, var12, var13, -1);
			} else {
				var24 = new GXBMUAVX(true, var11, arg8, var13, var15.field1329, var12, arg4, 0, var10);
			}

			arg5.method535(var17, var16, var14, null, 0, var24, field1175[arg4], arg6, arg1, arg7);

			if (var15.field1311) {
				arg0.method485(var15.field1316, arg4, arg7, arg6, arg2);
			}
		} else if (arg2 == 1) {
			ESLZGWKZ var25;
			if (var15.field1329 == -1 && var15.field1343 == null) {
				var25 = var15.method506(1, arg4, var10, var11, var12, var13, -1);
			} else {
				var25 = new GXBMUAVX(true, var11, arg8, var13, var15.field1329, var12, arg4, 1, var10);
			}

			arg5.method535(var17, var16, var14, null, 0, var25, field1188[arg4], arg6, arg1, arg7);

			if (var15.field1311) {
				arg0.method485(var15.field1316, arg4, arg7, arg6, arg2);
			}
		} else if (arg2 == 2) {
			int var26 = arg4 + 1 & 0x3;
			ESLZGWKZ var27;
			ESLZGWKZ var28;
			if (var15.field1329 == -1 && var15.field1343 == null) {
				var27 = var15.method506(2, arg4 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method506(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new GXBMUAVX(true, var11, arg8, var13, var15.field1329, var12, arg4 + 4, 2, var10);
				var28 = new GXBMUAVX(true, var11, arg8, var13, var15.field1329, var12, var26, 2, var10);
			}

			arg5.method535(var17, var16, var14, var28, field1175[var26], var27, field1175[arg4], arg6, arg1, arg7);

			if (var15.field1311) {
				arg0.method485(var15.field1316, arg4, arg7, arg6, arg2);
			}
		} else if (arg2 == 3) {
			ESLZGWKZ var29;
			if (var15.field1329 == -1 && var15.field1343 == null) {
				var29 = var15.method506(3, arg4, var10, var11, var12, var13, -1);
			} else {
				var29 = new GXBMUAVX(true, var11, arg8, var13, var15.field1329, var12, arg4, 3, var10);
			}

			arg5.method535(var17, var16, var14, null, 0, var29, field1188[arg4], arg6, arg1, arg7);

			if (var15.field1311) {
				arg0.method485(var15.field1316, arg4, arg7, arg6, arg2);
			}
		} else if (arg2 == 9) {
			ESLZGWKZ var30;
			if (var15.field1329 == -1 && var15.field1343 == null) {
				var30 = var15.method506(arg2, arg4, var10, var11, var12, var13, -1);
			} else {
				var30 = new GXBMUAVX(true, var11, arg8, var13, var15.field1329, var12, arg4, arg2, var10);
			}

			arg5.method537(arg7, 1, var14, var16, 1, var17, arg6, 0, var30, arg1);

			if (var15.field1311) {
				arg0.method486(arg4, arg7, var15.field1300, var15.field1332, var15.field1316, arg6);
			}
		} else {
			if (var15.field1322) {
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

			if (arg2 == 4) {
				ESLZGWKZ var35;
				if (var15.field1329 == -1 && var15.field1343 == null) {
					var35 = var15.method506(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new GXBMUAVX(true, var11, arg8, var13, var15.field1329, var12, 0, 4, var10);
				}

				arg5.method536(var14, var35, arg6, arg1, var16, 0, var17, field1175[arg4], arg7, arg4 * 512, 0);
			} else if (arg2 == 5) {
				int var36 = 16;
				int var37 = arg5.method553(arg1, arg7, arg6);
				if (var37 > 0) {
					var36 = UVSOAWGE.method501(var37 >> 14 & 0x7FFF).field1330;
				}

				ESLZGWKZ var38;
				if (var15.field1329 == -1 && var15.field1343 == null) {
					var38 = var15.method506(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new GXBMUAVX(true, var11, arg8, var13, var15.field1329, var12, 0, 4, var10);
				}

				arg5.method536(var14, var38, arg6, arg1, var16, field1170[arg4] * var36, var17, field1175[arg4], arg7, arg4 * 512, field1174[arg4] * var36);
			} else if (arg2 == 6) {
				ESLZGWKZ var39;
				if (var15.field1329 == -1 && var15.field1343 == null) {
					var39 = var15.method506(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new GXBMUAVX(true, var11, arg8, var13, var15.field1329, var12, 0, 4, var10);
				}

				arg5.method536(var14, var39, arg6, arg1, var16, 0, var17, 256, arg7, arg4, 0);
			} else if (arg2 == 7) {
				ESLZGWKZ var40;
				if (var15.field1329 == -1 && var15.field1343 == null) {
					var40 = var15.method506(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new GXBMUAVX(true, var11, arg8, var13, var15.field1329, var12, 0, 4, var10);
				}

				arg5.method536(var14, var40, arg6, arg1, var16, 0, var17, 512, arg7, arg4, 0);
			} else if (arg2 == 8) {
				ESLZGWKZ var41;
				if (var15.field1329 == -1 && var15.field1343 == null) {
					var41 = var15.method506(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new GXBMUAVX(true, var11, arg8, var13, var15.field1329, var12, 0, 4, var10);
				}

				arg5.method536(var14, var41, arg6, arg1, var16, 0, var17, 768, arg7, arg4, 0);
			}
		}
	}

	@ObfuscatedName("RRREBNUU.a(IIII)I")
	public static final int method448(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - DKTEWQXO.field629[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("RRREBNUU.b(IIII)I")
	public int method449(int arg0, int arg1, int arg2) {
		if ((field1184[arg0][arg2][arg1] & 0x8) != 0) {
			return 0;
		}

		if (arg0 > 0 && (field1184[1][arg2][arg1] & 0x2) != 0) {
			return arg0 - 1;
		}

		return arg0;
	}

	public RRREBNUU(int[][][] arg0, byte[][][] arg1, int arg2, int arg3) {
		field1171 = arg3;
		field1172 = arg2;
		field1177 = arg0;
		field1184 = arg1;
		field1189 = new byte[4][field1171][field1172];
		field1176 = new byte[4][field1171][field1172];
		field1191 = new byte[4][field1171][field1172];
		field1190 = new byte[4][field1171][field1172];
		field1185 = new int[4][field1171 + 1][field1172 + 1];
		field1186 = new byte[4][field1171 + 1][field1172 + 1];
		field1169 = new int[field1171 + 1][field1172 + 1];
		field1178 = new int[field1172];
		field1179 = new int[field1172];
		field1180 = new int[field1172];
		field1181 = new int[field1172];
		field1182 = new int[field1172];
	}

	@ObfuscatedName("RRREBNUU.a(Z[LUTWNPFGW;ILXRAHVOIV;I[B)V")
	public final void method450(UTWNPFGW[] arg0, int arg1, XRAHVOIV arg2, int arg3, byte[] arg4) {
		INLHDAGO var6 = new INLHDAGO(arg4);
		int var7 = -1;
		while (true) {
			int var8 = var6.method322();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method322();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method308();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg1 + var12;
				int var18 = arg3 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field1184[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					UTWNPFGW var20 = null;
					if (var19 >= 0) {
						var20 = arg0[var19];
					}

					method444(var13, var15, var17, var20, var7, var16, arg2, var18);
				}
			}
		}
	}

	@ObfuscatedName("RRREBNUU.c(III)I")
	public static final int method451(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method443(var3, var5);
		int var8 = method443(var3 + 1, var5);
		int var9 = method443(var3, var5 + 1);
		int var10 = method443(var3 + 1, var5 + 1);
		int var11 = method448(var7, var8, var4, arg2);
		int var12 = method448(var9, var10, var4, arg2);
		return method448(var11, var12, var6, arg2);
	}

	@ObfuscatedName("RRREBNUU.a(IIZII)V")
	public final void method452(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg0; var5 <= arg0 + arg3; var5++) {
			for (int var6 = arg2; var6 <= arg1 + arg2; var6++) {
				if (var6 >= 0 && var6 < field1171 && var5 >= 0 && var5 < field1172) {
					field1186[0][var6][var5] = 127;

					if (arg2 == var6 && var6 > 0) {
						field1177[0][var6][var5] = field1177[0][var6 - 1][var5];
					}

					if (arg1 + arg2 == var6 && var6 < field1171 - 1) {
						field1177[0][var6][var5] = field1177[0][var6 + 1][var5];
					}

					if (arg0 == var5 && var5 > 0) {
						field1177[0][var6][var5] = field1177[0][var6][var5 - 1];
					}

					if (arg0 + arg3 == var5 && var5 < field1172 - 1) {
						field1177[0][var6][var5] = field1177[0][var6][var5 + 1];
					}
				}
			}
		}
	}
}
