package deob;

@ObfuscatedName("PTERWXXU")
public final class PTERWXXU {

	@ObfuscatedName("PTERWXXU.e")
	public int field1095;

	@ObfuscatedName("PTERWXXU.f")
	public int field1096;

	@ObfuscatedName("PTERWXXU.B")
	public int[][][] field1114;

	@ObfuscatedName("PTERWXXU.t")
	public byte[][][] field1107;

	@ObfuscatedName("PTERWXXU.m")
	public byte[][][] field1102;

	@ObfuscatedName("PTERWXXU.b")
	public byte[][][] field1092;

	@ObfuscatedName("PTERWXXU.E")
	public byte[][][] field1116;

	@ObfuscatedName("PTERWXXU.h")
	public byte[][][] field1098;

	@ObfuscatedName("PTERWXXU.l")
	public int[][][] field1101;

	@ObfuscatedName("PTERWXXU.c")
	public byte[][][] field1093;

	@ObfuscatedName("PTERWXXU.i")
	public int[][] field1099;

	@ObfuscatedName("PTERWXXU.w")
	public int[] field1109;

	@ObfuscatedName("PTERWXXU.x")
	public int[] field1110;

	@ObfuscatedName("PTERWXXU.y")
	public int[] field1111;

	@ObfuscatedName("PTERWXXU.z")
	public int[] field1112;

	@ObfuscatedName("PTERWXXU.A")
	public int[] field1113;

	@ObfuscatedName("PTERWXXU.d")
	public static int field1094 = 99;

	@ObfuscatedName("PTERWXXU.j")
	public static boolean field1100 = true;

	@ObfuscatedName("PTERWXXU.n")
	public static final int[] field1103 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("PTERWXXU.o")
	public static final int[] field1104 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("PTERWXXU.p")
	public static final int[] field1105 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("PTERWXXU.C")
	public static final int[] field1115 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("PTERWXXU.g")
	public static int field1097 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("PTERWXXU.u")
	public static int field1108 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("PTERWXXU.q")
	public static int field1106;

	@ObfuscatedName("PTERWXXU.a(II[BILBGNYQYNO;[LDFJABDHX;)V")
	public final void method474(int arg0, byte[] arg1, int arg2, BGNYQYNO arg3, DFJABDHX[] arg4) {
		KHOMSBHW var6 = new KHOMSBHW(arg1);
		int var7 = -1;
		while (true) {
			int var8 = var6.method363();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method363();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method349();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg0 + var12;
				int var18 = arg2 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field1107[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					DFJABDHX var20 = null;
					if (var19 >= 0) {
						var20 = arg4[var19];
					}

					method490(var13, var20, arg3, var18, var16, var17, var15, var7);
				}
			}
		}
	}

	@ObfuscatedName("PTERWXXU.a(III[B)Z")
	public static final boolean method475(int arg0, int arg1, byte[] arg2) {
		boolean var3 = true;
		KHOMSBHW var4 = new KHOMSBHW(arg2);
		int var5 = -1;
		while (true) {
			int var6 = var4.method363();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method363();
					if (var9 == 0) {
						break;
					}

					var4.method349();
				} else {
					int var10 = var4.method363();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method349() >> 2;
					int var14 = arg0 + var12;
					int var15 = arg1 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						RUJAIVBH var16 = RUJAIVBH.method512(var5);
						if (var13 != 22 || !field1100 || var16.field1164 || var16.field1177) {
							var3 &= var16.method508();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("PTERWXXU.a(LBGNYQYNO;II[BIIII[LDFJABDHX;II)V")
	public final void method476(BGNYQYNO arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, DFJABDHX[] arg7, int arg8, int arg9) {
		KHOMSBHW var11 = new KHOMSBHW(arg2);
		int var12 = -1;
		while (true) {
			int var13 = var11.method363();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method363();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method349();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg9 == var18 && var17 >= arg8 && var17 < arg8 + 8 && var16 >= arg1 && var16 < arg1 + 8) {
					RUJAIVBH var22 = RUJAIVBH.method512(var12);
					int var23 = arg6 + WXMXSJQQ.method590(var22.field1174, var22.field1180, arg3, var17 & 0x7, var16 & 0x7);
					int var24 = arg5 + WXMXSJQQ.method591(var22.field1174, var17 & 0x7, var22.field1180, var16 & 0x7, arg3);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = var18;
						if ((field1107[1][var23][var24] & 0x2) == 2) {
							var25 = var18 - 1;
						}

						DFJABDHX var26 = null;
						if (var25 >= 0) {
							var26 = arg7[var25];
						}

						method490(var18, var26, arg0, var24, arg3 + var21 & 0x3, var23, var20, var12);
					}
				}
			}
		}
	}

	@ObfuscatedName("PTERWXXU.a(LBGNYQYNO;[LDFJABDHX;I)V")
	public final void method477(BGNYQYNO arg0, DFJABDHX[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field1107[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field1107[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method211(var4, var5);
						}
					}
				}
			}
		}

		field1108 += (int) (Math.random() * 5.0D) - 2;
		if (field1108 < -8) {
			field1108 = -8;
		}

		if (field1108 > 8) {
			field1108 = 8;
		}

		field1097 += (int) (Math.random() * 5.0D) - 2;
		if (field1097 < -16) {
			field1097 = -16;
		}

		if (field1097 > 16) {
			field1097 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field1093[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field1096 - 1; var16++) {
				for (int var17 = 1; var17 < field1095 - 1; var17++) {
					int var18 = field1114[var7][var17 + 1][var16] - field1114[var7][var17 - 1][var16];
					int var19 = field1114[var7][var17][var16 + 1] - field1114[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field1099[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field1096; var26++) {
				field1109[var26] = 0;
				field1110[var26] = 0;
				field1111[var26] = 0;
				field1112[var26] = 0;
				field1113[var26] = 0;
			}

			for (int var27 = -5; var27 < field1095 + 5; var27++) {
				for (int var28 = 0; var28 < field1096; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field1095) {
						int var30 = field1102[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							EPIGJXFD var31 = EPIGJXFD.field621[var30 - 1];
							field1109[var28] += var31.field630;
							field1110[var28] += var31.field628;
							field1111[var28] += var31.field629;
							field1112[var28] += var31.field631;
							field1113[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field1095) {
						int var33 = field1102[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							EPIGJXFD var34 = EPIGJXFD.field621[var33 - 1];
							field1109[var28] -= var34.field630;
							field1110[var28] -= var34.field628;
							field1111[var28] -= var34.field629;
							field1112[var28] -= var34.field631;
							field1113[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field1095 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field1096 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field1096) {
							var35 += field1109[var41];
							var36 += field1110[var41];
							var37 += field1111[var41];
							var38 += field1112[var41];
							var39 += field1113[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field1096) {
							var35 -= field1109[var42];
							var36 -= field1110[var42];
							var37 -= field1111[var42];
							var38 -= field1112[var42];
							var39 -= field1113[var42];
						}

						if (var40 >= 1 && var40 < field1096 - 1 && (!field1100 || (field1107[0][var27][var40] & 0x2) != 0 || (field1107[var7][var27][var40] & 0x10) == 0 && method481(var7, var27, var40) == field1106)) {
							if (var7 < field1094) {
								field1094 = var7;
							}

							int var43 = field1102[var7][var27][var40] & 0xFF;
							int var44 = field1092[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field1114[var7][var27][var40];
								int var46 = field1114[var7][var27 + 1][var40];
								int var47 = field1114[var7][var27 + 1][var40 + 1];
								int var48 = field1114[var7][var27][var40 + 1];
								int var49 = field1099[var27][var40];
								int var50 = field1099[var27 + 1][var40];
								int var51 = field1099[var27 + 1][var40 + 1];
								int var52 = field1099[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method482(var55, var56, var57);
									var55 = field1108 + var55 & 0xFF;
									var57 += field1097;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method482(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field1116[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !EPIGJXFD.field621[var44 - 1].field626) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field1101[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = EDRGRMCC.field601[method493(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method20(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method493(var53, var49), method493(var53, var50), method493(var53, var51), method493(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field1116[var7][var27][var40] + 1;
									byte var61 = field1098[var7][var27][var40];
									EPIGJXFD var62 = EPIGJXFD.field621[var44 - 1];
									int var63 = var62.field624;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = EDRGRMCC.method229(var63);
										var65 = -1;
									} else if (var62.field623 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method482(var62.field627, var62.field628, var62.field629);
										var64 = EDRGRMCC.field601[method480(var62.field632, 96)];
									}

									arg0.method20(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method493(var53, var49), method493(var53, var50), method493(var53, var51), method493(var53, var52), method480(var65, var49), method480(var65, var50), method480(var65, var51), method480(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field1096 - 1; var66++) {
				for (int var67 = 1; var67 < field1095 - 1; var67++) {
					arg0.method19(var7, var67, var66, method481(var7, var67, var66));
				}
			}
		}

		arg0.method46(-50, -50, 64, -10, 768);

		for (int var68 = 0; var68 < field1095; var68++) {
			for (int var69 = 0; var69 < field1096; var69++) {
				if ((field1107[1][var68][var69] & 0x2) == 2) {
					arg0.method17(var69, var68);
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
				for (int var75 = 0; var75 <= field1096; var75++) {
					for (int var76 = 0; var76 <= field1095; var76++) {
						if ((field1101[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field1101[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field1096 && (field1101[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field1101[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field1101[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field1114[var80][var76][var77] - var84;
								int var86 = field1114[var79][var76][var77];
								BGNYQYNO.method18(var78 * 128 + 128, var86, var77 * 128, var76 * 128, 1, var85, var76 * 128, var73);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field1101[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field1101[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field1101[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field1095 && (field1101[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field1101[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field1101[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field1114[var92][var89][var75] - var96;
								int var98 = field1114[var91][var89][var75];
								BGNYQYNO.method18(var75 * 128, var98, var75 * 128, var89 * 128, 2, var97, var90 * 128 + 128, var73);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field1101[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field1101[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field1101[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field1096 && (field1101[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field1101[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field1095) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field1101[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field1114[var74][var101][var103];
								BGNYQYNO.method18(var104 * 128 + 128, var107, var103 * 128, var101 * 128, 4, var107, var102 * 128 + 128, var73);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field1101[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("PTERWXXU.a(II)I")
	public static final int method478(int arg0, int arg1) {
		int var2 = method483(arg0 + 45365, arg1 + 91923, 4) + (method483(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method483(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	public PTERWXXU(byte[][][] arg0, int arg1, int arg2, int[][][] arg3) {
		field1094 = 99;
		field1095 = arg2;
		field1096 = arg1;
		field1114 = arg3;
		field1107 = arg0;
		field1102 = new byte[4][field1095][field1096];
		field1092 = new byte[4][field1095][field1096];
		field1116 = new byte[4][field1095][field1096];
		field1098 = new byte[4][field1095][field1096];
		field1101 = new int[4][field1095 + 1][field1096 + 1];
		field1093 = new byte[4][field1095 + 1][field1096 + 1];
		field1099 = new int[field1095 + 1][field1096 + 1];
		field1109 = new int[field1096];
		field1110 = new int[field1096];
		field1111 = new int[field1096];
		field1112 = new int[field1096];
		field1113 = new int[field1096];
	}

	@ObfuscatedName("PTERWXXU.b(II)I")
	public static final int method479(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("PTERWXXU.c(II)I")
	public final int method480(int arg0, int arg1) {
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

	@ObfuscatedName("PTERWXXU.a(ZIII)I")
	public int method481(int arg0, int arg1, int arg2) {
		if ((field1107[arg0][arg1][arg2] & 0x8) != 0) {
			return 0;
		}

		if (arg0 > 0 && (field1107[1][arg1][arg2] & 0x2) != 0) {
			return arg0 - 1;
		}

		return arg0;
	}

	@ObfuscatedName("PTERWXXU.a(III)I")
	public final int method482(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("PTERWXXU.b(III)I")
	public static final int method483(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method492(var3, var5);
		int var8 = method492(var3 + 1, var5);
		int var9 = method492(var3, var5 + 1);
		int var10 = method492(var3 + 1, var5 + 1);
		int var11 = method484(var7, var8, var4, arg2);
		int var12 = method484(var9, var10, var4, arg2);
		return method484(var11, var12, var6, arg2);
	}

	@ObfuscatedName("PTERWXXU.a(IIII)I")
	public static final int method484(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - EDRGRMCC.field590[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("PTERWXXU.a(IILKHOMSBHW;IIIII)V")
	public final void method485(int arg0, int arg1, KHOMSBHW arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg6 >= 0 && arg6 < 104 && arg5 >= 0 && arg5 < 104) {
			field1107[arg0][arg6][arg5] = 0;
			while (true) {
				int var8 = arg2.method349();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg2.method349();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg0 == 0) {
						field1114[0][arg6][arg5] = -var9 * 8;
						return;
					}

					field1114[arg0][arg6][arg5] = field1114[arg0 - 1][arg6][arg5] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field1092[arg0][arg6][arg5] = arg2.method350();
					field1116[arg0][arg6][arg5] = (byte) ((var8 - 2) / 4);
					field1098[arg0][arg6][arg5] = (byte) (var8 + arg3 - 2 & 0x3);
				} else if (var8 <= 81) {
					field1107[arg0][arg6][arg5] = (byte) (var8 - 49);
				} else {
					field1102[arg0][arg6][arg5] = (byte) (var8 - 81);
				}
			}

			if (arg0 == 0) {
				field1114[0][arg6][arg5] = -method478(arg6 + arg1 + 932731, arg5 + 556238 + arg4) * 8;
			} else {
				field1114[arg0][arg6][arg5] = field1114[arg0 - 1][arg6][arg5] - 240;
			}
		} else {
			while (true) {
				int var10 = arg2.method349();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg2.method349();
					return;
				}

				if (var10 <= 49) {
					arg2.method349();
				}
			}
		}
	}

	@ObfuscatedName("PTERWXXU.a([[[IZLDFJABDHX;IIILBGNYQYNO;IIII)V")
	public static final void method486(int[][][] arg0, DFJABDHX arg1, int arg2, int arg3, int arg4, BGNYQYNO arg5, int arg6, int arg7, int arg8, int arg9) {
		int var10 = arg0[arg4][arg9][arg2];
		int var11 = arg0[arg4][arg9 + 1][arg2];
		int var12 = arg0[arg4][arg9 + 1][arg2 + 1];
		int var13 = arg0[arg4][arg9][arg2 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		RUJAIVBH var15 = RUJAIVBH.method512(arg3);
		int var16 = (arg3 << 14) + (arg2 << 7) + arg9 + 0x40000000;
		if (!var15.field1164) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg8 << 6) + arg6);
		if (arg6 == 22) {
			DPCHFTTD var18;
			if (var15.field1163 == -1 && var15.field1168 == null) {
				var18 = var15.method505(22, arg8, var10, var11, var12, var13, -1);
			} else {
				var18 = new TGBMMCBD(arg3, 22, var10, var13, var12, var11, true, arg8, var15.field1163);
			}

			arg5.method21(arg7, var16, var17, var18, arg2, var14, arg9);

			if (var15.field1179 && var15.field1164) {
				arg1.method211(arg9, arg2);
			}
		} else if (arg6 == 10 || arg6 == 11) {
			DPCHFTTD var19;
			if (var15.field1163 == -1 && var15.field1168 == null) {
				var19 = var15.method505(10, arg8, var10, var11, var12, var13, -1);
			} else {
				var19 = new TGBMMCBD(arg3, 10, var10, var13, var12, var11, true, arg8, var15.field1163);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg6 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg8 == 1 || arg8 == 3) {
					var21 = var15.field1180;
					var22 = var15.field1174;
				} else {
					var21 = var15.field1174;
					var22 = var15.field1180;
				}

				arg5.method25(var20, arg9, arg7, var14, var21, var22, var19, arg2, var16, var17);
			}

			if (var15.field1179) {
				arg1.method210(arg2, var15.field1165, arg9, arg8, var15.field1174, var15.field1180);
			}
		} else if (arg6 >= 12) {
			DPCHFTTD var23;
			if (var15.field1163 == -1 && var15.field1168 == null) {
				var23 = var15.method505(arg6, arg8, var10, var11, var12, var13, -1);
			} else {
				var23 = new TGBMMCBD(arg3, arg6, var10, var13, var12, var11, true, arg8, var15.field1163);
			}

			arg5.method25(0, arg9, arg7, var14, 1, 1, var23, arg2, var16, var17);

			if (var15.field1179) {
				arg1.method210(arg2, var15.field1165, arg9, arg8, var15.field1174, var15.field1180);
			}
		} else if (arg6 == 0) {
			DPCHFTTD var24;
			if (var15.field1163 == -1 && var15.field1168 == null) {
				var24 = var15.method505(0, arg8, var10, var11, var12, var13, -1);
			} else {
				var24 = new TGBMMCBD(arg3, 0, var10, var13, var12, var11, true, arg8, var15.field1163);
			}

			arg5.method23(0, arg2, var16, field1105[arg8], var17, arg9, arg7, null, var24, var14);

			if (var15.field1179) {
				arg1.method209(arg6, var15.field1165, arg8, arg2, arg9);
			}
		} else if (arg6 == 1) {
			DPCHFTTD var25;
			if (var15.field1163 == -1 && var15.field1168 == null) {
				var25 = var15.method505(1, arg8, var10, var11, var12, var13, -1);
			} else {
				var25 = new TGBMMCBD(arg3, 1, var10, var13, var12, var11, true, arg8, var15.field1163);
			}

			arg5.method23(0, arg2, var16, field1104[arg8], var17, arg9, arg7, null, var25, var14);

			if (var15.field1179) {
				arg1.method209(arg6, var15.field1165, arg8, arg2, arg9);
			}
		} else if (arg6 == 2) {
			int var26 = arg8 + 1 & 0x3;
			DPCHFTTD var27;
			DPCHFTTD var28;
			if (var15.field1163 == -1 && var15.field1168 == null) {
				var27 = var15.method505(2, arg8 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method505(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new TGBMMCBD(arg3, 2, var10, var13, var12, var11, true, arg8 + 4, var15.field1163);
				var28 = new TGBMMCBD(arg3, 2, var10, var13, var12, var11, true, var26, var15.field1163);
			}

			arg5.method23(field1105[var26], arg2, var16, field1105[arg8], var17, arg9, arg7, var28, var27, var14);

			if (var15.field1179) {
				arg1.method209(arg6, var15.field1165, arg8, arg2, arg9);
			}
		} else if (arg6 == 3) {
			DPCHFTTD var29;
			if (var15.field1163 == -1 && var15.field1168 == null) {
				var29 = var15.method505(3, arg8, var10, var11, var12, var13, -1);
			} else {
				var29 = new TGBMMCBD(arg3, 3, var10, var13, var12, var11, true, arg8, var15.field1163);
			}

			arg5.method23(0, arg2, var16, field1104[arg8], var17, arg9, arg7, null, var29, var14);

			if (var15.field1179) {
				arg1.method209(arg6, var15.field1165, arg8, arg2, arg9);
			}
		} else if (arg6 == 9) {
			DPCHFTTD var30;
			if (var15.field1163 == -1 && var15.field1168 == null) {
				var30 = var15.method505(arg6, arg8, var10, var11, var12, var13, -1);
			} else {
				var30 = new TGBMMCBD(arg3, arg6, var10, var13, var12, var11, true, arg8, var15.field1163);
			}

			arg5.method25(0, arg9, arg7, var14, 1, 1, var30, arg2, var16, var17);

			if (var15.field1179) {
				arg1.method210(arg2, var15.field1165, arg9, arg8, var15.field1174, var15.field1180);
			}
		} else {
			if (var15.field1181) {
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

			if (arg6 == 4) {
				DPCHFTTD var35;
				if (var15.field1163 == -1 && var15.field1168 == null) {
					var35 = var15.method505(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new TGBMMCBD(arg3, 4, var10, var13, var12, var11, true, 0, var15.field1163);
				}

				arg5.method24(0, var16, var14, arg8 * 512, 0, var17, arg7, var35, arg2, field1105[arg8], arg9);
			} else if (arg6 == 5) {
				int var36 = 16;
				int var37 = arg5.method41(arg7, arg9, arg2);
				if (var37 > 0) {
					var36 = RUJAIVBH.method512(var37 >> 14 & 0x7FFF).field1136;
				}

				DPCHFTTD var38;
				if (var15.field1163 == -1 && var15.field1168 == null) {
					var38 = var15.method505(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new TGBMMCBD(arg3, 4, var10, var13, var12, var11, true, 0, var15.field1163);
				}

				arg5.method24(field1115[arg8] * var36, var16, var14, arg8 * 512, field1103[arg8] * var36, var17, arg7, var38, arg2, field1105[arg8], arg9);
			} else if (arg6 == 6) {
				DPCHFTTD var39;
				if (var15.field1163 == -1 && var15.field1168 == null) {
					var39 = var15.method505(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new TGBMMCBD(arg3, 4, var10, var13, var12, var11, true, 0, var15.field1163);
				}

				arg5.method24(0, var16, var14, arg8, 0, var17, arg7, var39, arg2, 256, arg9);
			} else if (arg6 == 7) {
				DPCHFTTD var40;
				if (var15.field1163 == -1 && var15.field1168 == null) {
					var40 = var15.method505(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new TGBMMCBD(arg3, 4, var10, var13, var12, var11, true, 0, var15.field1163);
				}

				arg5.method24(0, var16, var14, arg8, 0, var17, arg7, var40, arg2, 512, arg9);
			} else if (arg6 == 8) {
				DPCHFTTD var41;
				if (var15.field1163 == -1 && var15.field1168 == null) {
					var41 = var15.method505(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new TGBMMCBD(arg3, 4, var10, var13, var12, var11, true, 0, var15.field1163);
				}

				arg5.method24(0, var16, var14, arg8, 0, var17, arg7, var41, arg2, 768, arg9);
			}
		}
	}

	@ObfuscatedName("PTERWXXU.a(IZII[LDFJABDHX;I[B)V")
	public final void method487(int arg0, int arg1, int arg2, DFJABDHX[] arg3, int arg4, byte[] arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg1 + var8 > 0 && arg1 + var8 < 103 && arg4 + var9 > 0 && arg4 + var9 < 103) {
						arg3[var7].field568[arg1 + var8][arg4 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		KHOMSBHW var10 = new KHOMSBHW(arg5);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method485(var11, arg2, var10, 0, arg0, arg4 + var13, arg1 + var12);
				}
			}
		}
	}

	@ObfuscatedName("PTERWXXU.a(BII)Z")
	public static final boolean method488(int arg0, int arg1) {
		RUJAIVBH var2 = RUJAIVBH.method512(arg1);

		if (arg0 == 11) {
			arg0 = 10;
		}

		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}

		return var2.method515(arg0);
	}

	@ObfuscatedName("PTERWXXU.a(IIIII)V")
	public final void method489(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg2; var5 <= arg0 + arg2; var5++) {
			for (int var6 = arg1; var6 <= arg1 + arg3; var6++) {
				if (var6 >= 0 && var6 < field1095 && var5 >= 0 && var5 < field1096) {
					field1093[0][var6][var5] = 127;

					if (arg1 == var6 && var6 > 0) {
						field1114[0][var6][var5] = field1114[0][var6 - 1][var5];
					}

					if (arg1 + arg3 == var6 && var6 < field1095 - 1) {
						field1114[0][var6][var5] = field1114[0][var6 + 1][var5];
					}

					if (arg2 == var5 && var5 > 0) {
						field1114[0][var6][var5] = field1114[0][var6][var5 - 1];
					}

					if (arg0 + arg2 == var5 && var5 < field1096 - 1) {
						field1114[0][var6][var5] = field1114[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("PTERWXXU.a(ILDFJABDHX;LBGNYQYNO;IIIIII)V")
	public final void method490(int arg0, DFJABDHX arg1, BGNYQYNO arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field1100 && (field1107[0][arg5][arg3] & 0x2) == 0) {
			if ((field1107[arg0][arg5][arg3] & 0x10) != 0) {
				return;
			}

			if (method481(arg0, arg5, arg3) != field1106) {
				return;
			}
		}

		if (arg0 < field1094) {
			field1094 = arg0;
		}

		int var9 = field1114[arg0][arg5][arg3];
		int var10 = field1114[arg0][arg5 + 1][arg3];
		int var11 = field1114[arg0][arg5 + 1][arg3 + 1];
		int var12 = field1114[arg0][arg5][arg3 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		RUJAIVBH var14 = RUJAIVBH.method512(arg7);
		int var15 = (arg7 << 14) + (arg3 << 7) + arg5 + 0x40000000;
		if (!var14.field1164) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg4 << 6) + arg6);
		if (arg6 == 22) {
			if (!field1100 || var14.field1164 || var14.field1177) {
				DPCHFTTD var17;
				if (var14.field1163 == -1 && var14.field1168 == null) {
					var17 = var14.method505(22, arg4, var9, var10, var11, var12, -1);
				} else {
					var17 = new TGBMMCBD(arg7, 22, var9, var12, var11, var10, true, arg4, var14.field1163);
				}

				arg2.method21(arg0, var15, var16, var17, arg3, var13, arg5);

				if (var14.field1179 && var14.field1164 && arg1 != null) {
					arg1.method211(arg5, arg3);
				}
			}
		} else if (arg6 == 10 || arg6 == 11) {
			DPCHFTTD var18;
			if (var14.field1163 == -1 && var14.field1168 == null) {
				var18 = var14.method505(10, arg4, var9, var10, var11, var12, -1);
			} else {
				var18 = new TGBMMCBD(arg7, 10, var9, var12, var11, var10, true, arg4, var14.field1163);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg6 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg4 == 1 || arg4 == 3) {
					var20 = var14.field1180;
					var21 = var14.field1174;
				} else {
					var20 = var14.field1174;
					var21 = var14.field1180;
				}

				if (arg2.method25(var19, arg5, arg0, var13, var20, var21, var18, arg3, var15, var16) && var14.field1182) {
					GEUHTGZJ var22;
					if (var18 instanceof GEUHTGZJ) {
						var22 = (GEUHTGZJ) var18;
					} else {
						var22 = var14.method505(10, arg4, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field738 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field1093[arg0][arg5 + var23][arg3 + var24]) {
									field1093[arg0][arg5 + var23][arg3 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field1179 && arg1 != null) {
				arg1.method210(arg3, var14.field1165, arg5, arg4, var14.field1174, var14.field1180);
			}
		} else if (arg6 >= 12) {
			DPCHFTTD var26;
			if (var14.field1163 == -1 && var14.field1168 == null) {
				var26 = var14.method505(arg6, arg4, var9, var10, var11, var12, -1);
			} else {
				var26 = new TGBMMCBD(arg7, arg6, var9, var12, var11, var10, true, arg4, var14.field1163);
			}

			arg2.method25(0, arg5, arg0, var13, 1, 1, var26, arg3, var15, var16);

			if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg0 > 0) {
				field1101[arg0][arg5][arg3] |= 0x924;
			}

			if (var14.field1179 && arg1 != null) {
				arg1.method210(arg3, var14.field1165, arg5, arg4, var14.field1174, var14.field1180);
			}
		} else if (arg6 == 0) {
			DPCHFTTD var27;
			if (var14.field1163 == -1 && var14.field1168 == null) {
				var27 = var14.method505(0, arg4, var9, var10, var11, var12, -1);
			} else {
				var27 = new TGBMMCBD(arg7, 0, var9, var12, var11, var10, true, arg4, var14.field1163);
			}

			arg2.method23(0, arg3, var15, field1105[arg4], var16, arg5, arg0, null, var27, var13);

			if (arg4 == 0) {
				if (var14.field1182) {
					field1093[arg0][arg5][arg3] = 50;
					field1093[arg0][arg5][arg3 + 1] = 50;
				}

				if (var14.field1171) {
					field1101[arg0][arg5][arg3] |= 0x249;
				}
			} else if (arg4 == 1) {
				if (var14.field1182) {
					field1093[arg0][arg5][arg3 + 1] = 50;
					field1093[arg0][arg5 + 1][arg3 + 1] = 50;
				}

				if (var14.field1171) {
					field1101[arg0][arg5][arg3 + 1] |= 0x492;
				}
			} else if (arg4 == 2) {
				if (var14.field1182) {
					field1093[arg0][arg5 + 1][arg3] = 50;
					field1093[arg0][arg5 + 1][arg3 + 1] = 50;
				}

				if (var14.field1171) {
					field1101[arg0][arg5 + 1][arg3] |= 0x249;
				}
			} else if (arg4 == 3) {
				if (var14.field1182) {
					field1093[arg0][arg5][arg3] = 50;
					field1093[arg0][arg5 + 1][arg3] = 50;
				}

				if (var14.field1171) {
					field1101[arg0][arg5][arg3] |= 0x492;
				}
			}

			if (var14.field1179 && arg1 != null) {
				arg1.method209(arg6, var14.field1165, arg4, arg3, arg5);
			}

			if (var14.field1136 != 16) {
				arg2.method31(arg0, var14.field1136, arg3, arg5);
			}
		} else if (arg6 == 1) {
			DPCHFTTD var28;
			if (var14.field1163 == -1 && var14.field1168 == null) {
				var28 = var14.method505(1, arg4, var9, var10, var11, var12, -1);
			} else {
				var28 = new TGBMMCBD(arg7, 1, var9, var12, var11, var10, true, arg4, var14.field1163);
			}

			arg2.method23(0, arg3, var15, field1104[arg4], var16, arg5, arg0, null, var28, var13);

			if (var14.field1182) {
				if (arg4 == 0) {
					field1093[arg0][arg5][arg3 + 1] = 50;
				} else if (arg4 == 1) {
					field1093[arg0][arg5 + 1][arg3 + 1] = 50;
				} else if (arg4 == 2) {
					field1093[arg0][arg5 + 1][arg3] = 50;
				} else if (arg4 == 3) {
					field1093[arg0][arg5][arg3] = 50;
				}
			}

			if (var14.field1179 && arg1 != null) {
				arg1.method209(arg6, var14.field1165, arg4, arg3, arg5);
			}
		} else if (arg6 == 2) {
			int var29 = arg4 + 1 & 0x3;
			DPCHFTTD var30;
			DPCHFTTD var31;
			if (var14.field1163 == -1 && var14.field1168 == null) {
				var30 = var14.method505(2, arg4 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method505(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new TGBMMCBD(arg7, 2, var9, var12, var11, var10, true, arg4 + 4, var14.field1163);
				var31 = new TGBMMCBD(arg7, 2, var9, var12, var11, var10, true, var29, var14.field1163);
			}

			arg2.method23(field1105[var29], arg3, var15, field1105[arg4], var16, arg5, arg0, var31, var30, var13);

			if (var14.field1171) {
				if (arg4 == 0) {
					field1101[arg0][arg5][arg3] |= 0x249;
					field1101[arg0][arg5][arg3 + 1] |= 0x492;
				} else if (arg4 == 1) {
					field1101[arg0][arg5][arg3 + 1] |= 0x492;
					field1101[arg0][arg5 + 1][arg3] |= 0x249;
				} else if (arg4 == 2) {
					field1101[arg0][arg5 + 1][arg3] |= 0x249;
					field1101[arg0][arg5][arg3] |= 0x492;
				} else if (arg4 == 3) {
					field1101[arg0][arg5][arg3] |= 0x492;
					field1101[arg0][arg5][arg3] |= 0x249;
				}
			}

			if (var14.field1179 && arg1 != null) {
				arg1.method209(arg6, var14.field1165, arg4, arg3, arg5);
			}

			if (var14.field1136 != 16) {
				arg2.method31(arg0, var14.field1136, arg3, arg5);
			}
		} else if (arg6 == 3) {
			DPCHFTTD var32;
			if (var14.field1163 == -1 && var14.field1168 == null) {
				var32 = var14.method505(3, arg4, var9, var10, var11, var12, -1);
			} else {
				var32 = new TGBMMCBD(arg7, 3, var9, var12, var11, var10, true, arg4, var14.field1163);
			}

			arg2.method23(0, arg3, var15, field1104[arg4], var16, arg5, arg0, null, var32, var13);

			if (var14.field1182) {
				if (arg4 == 0) {
					field1093[arg0][arg5][arg3 + 1] = 50;
				} else if (arg4 == 1) {
					field1093[arg0][arg5 + 1][arg3 + 1] = 50;
				} else if (arg4 == 2) {
					field1093[arg0][arg5 + 1][arg3] = 50;
				} else if (arg4 == 3) {
					field1093[arg0][arg5][arg3] = 50;
				}
			}

			if (var14.field1179 && arg1 != null) {
				arg1.method209(arg6, var14.field1165, arg4, arg3, arg5);
			}
		} else if (arg6 == 9) {
			DPCHFTTD var33;
			if (var14.field1163 == -1 && var14.field1168 == null) {
				var33 = var14.method505(arg6, arg4, var9, var10, var11, var12, -1);
			} else {
				var33 = new TGBMMCBD(arg7, arg6, var9, var12, var11, var10, true, arg4, var14.field1163);
			}

			arg2.method25(0, arg5, arg0, var13, 1, 1, var33, arg3, var15, var16);

			if (var14.field1179 && arg1 != null) {
				arg1.method210(arg3, var14.field1165, arg5, arg4, var14.field1174, var14.field1180);
			}
		} else {
			if (var14.field1181) {
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

			if (arg6 == 4) {
				DPCHFTTD var38;
				if (var14.field1163 == -1 && var14.field1168 == null) {
					var38 = var14.method505(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new TGBMMCBD(arg7, 4, var9, var12, var11, var10, true, 0, var14.field1163);
				}

				arg2.method24(0, var15, var13, arg4 * 512, 0, var16, arg0, var38, arg3, field1105[arg4], arg5);
			} else if (arg6 == 5) {
				int var39 = 16;
				int var40 = arg2.method41(arg0, arg5, arg3);
				if (var40 > 0) {
					var39 = RUJAIVBH.method512(var40 >> 14 & 0x7FFF).field1136;
				}

				DPCHFTTD var41;
				if (var14.field1163 == -1 && var14.field1168 == null) {
					var41 = var14.method505(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new TGBMMCBD(arg7, 4, var9, var12, var11, var10, true, 0, var14.field1163);
				}

				arg2.method24(field1115[arg4] * var39, var15, var13, arg4 * 512, field1103[arg4] * var39, var16, arg0, var41, arg3, field1105[arg4], arg5);
			} else if (arg6 == 6) {
				DPCHFTTD var42;
				if (var14.field1163 == -1 && var14.field1168 == null) {
					var42 = var14.method505(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new TGBMMCBD(arg7, 4, var9, var12, var11, var10, true, 0, var14.field1163);
				}

				arg2.method24(0, var15, var13, arg4, 0, var16, arg0, var42, arg3, 256, arg5);
			} else if (arg6 == 7) {
				DPCHFTTD var43;
				if (var14.field1163 == -1 && var14.field1168 == null) {
					var43 = var14.method505(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new TGBMMCBD(arg7, 4, var9, var12, var11, var10, true, 0, var14.field1163);
				}

				arg2.method24(0, var15, var13, arg4, 0, var16, arg0, var43, arg3, 512, arg5);
			} else if (arg6 == 8) {
				DPCHFTTD var44;
				if (var14.field1163 == -1 && var14.field1168 == null) {
					var44 = var14.method505(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new TGBMMCBD(arg7, 4, var9, var12, var11, var10, true, 0, var14.field1163);
				}

				arg2.method24(0, var15, var13, arg4, 0, var16, arg0, var44, arg3, 768, arg5);
			}
		}
	}

	@ObfuscatedName("PTERWXXU.a(IIIIIIII[LDFJABDHX;[B)V")
	public final void method491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, DFJABDHX[] arg7, byte[] arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg4 + var10 > 0 && arg4 + var10 < 103 && arg1 + var11 > 0 && arg1 + var11 < 103) {
					arg7[arg0].field568[arg4 + var10][arg1 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		KHOMSBHW var12 = new KHOMSBHW(arg8);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg5 == var13 && var14 >= arg6 && var14 < arg6 + 8 && var15 >= arg3 && var15 < arg3 + 8) {
						method485(arg0, 0, var12, arg2, 0, arg1 + WXMXSJQQ.method589(var15 & 0x7, var14 & 0x7, arg2), arg4 + WXMXSJQQ.method588(arg2, var15 & 0x7, var14 & 0x7));
					} else {
						method485(0, 0, var12, 0, 0, -1, -1);
					}
				}
			}
		}
	}

	@ObfuscatedName("PTERWXXU.d(II)I")
	public static final int method492(int arg0, int arg1) {
		int var2 = method479(arg0 - 1, arg1 - 1) + method479(arg0 + 1, arg1 - 1) + method479(arg0 - 1, arg1 + 1) + method479(arg0 + 1, arg1 + 1);
		int var3 = method479(arg0 - 1, arg1) + method479(arg0 + 1, arg1) + method479(arg0, arg1 - 1) + method479(arg0, arg1 + 1);
		int var4 = method479(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("PTERWXXU.e(II)I")
	public static final int method493(int arg0, int arg1) {
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

	@ObfuscatedName("PTERWXXU.a(LKHOMSBHW;BLSSXXGGTR;)V")
	public static final void method494(KHOMSBHW arg0, SSXXGGTR arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method363();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			RUJAIVBH var4 = RUJAIVBH.method512(var2);
			var4.method513(arg1);

			while (true) {
				int var5 = arg0.method363();
				if (var5 == 0) {
					break;
				}

				arg0.method349();
			}
		}
	}
}
