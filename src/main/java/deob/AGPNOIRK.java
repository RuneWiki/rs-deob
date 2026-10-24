package deob;

@ObfuscatedName("AGPNOIRK")
public final class AGPNOIRK {

	@ObfuscatedName("AGPNOIRK.b")
	public int field2;

	@ObfuscatedName("AGPNOIRK.c")
	public int field3;

	@ObfuscatedName("AGPNOIRK.C")
	public int[][][] field24;

	@ObfuscatedName("AGPNOIRK.g")
	public byte[][][] field6;

	@ObfuscatedName("AGPNOIRK.i")
	public byte[][][] field8;

	@ObfuscatedName("AGPNOIRK.u")
	public byte[][][] field17;

	@ObfuscatedName("AGPNOIRK.D")
	public byte[][][] field25;

	@ObfuscatedName("AGPNOIRK.r")
	public byte[][][] field14;

	@ObfuscatedName("AGPNOIRK.h")
	public int[][][] field7;

	@ObfuscatedName("AGPNOIRK.t")
	public byte[][][] field16;

	@ObfuscatedName("AGPNOIRK.s")
	public int[][] field15;

	@ObfuscatedName("AGPNOIRK.w")
	public int[] field18;

	@ObfuscatedName("AGPNOIRK.x")
	public int[] field19;

	@ObfuscatedName("AGPNOIRK.y")
	public int[] field20;

	@ObfuscatedName("AGPNOIRK.z")
	public int[] field21;

	@ObfuscatedName("AGPNOIRK.A")
	public int[] field22;

	@ObfuscatedName("AGPNOIRK.a")
	public static int field1 = 99;

	@ObfuscatedName("AGPNOIRK.e")
	public static final int[] field4 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("AGPNOIRK.k")
	public static final int[] field9 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("AGPNOIRK.o")
	public static final int[] field11 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("AGPNOIRK.p")
	public static boolean field12 = true;

	@ObfuscatedName("AGPNOIRK.q")
	public static final int[] field13 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("AGPNOIRK.n")
	public static int field10 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("AGPNOIRK.B")
	public static int field23 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("AGPNOIRK.f")
	public static int field5;

	@ObfuscatedName("AGPNOIRK.a(II)I")
	public static final int method2(int arg0, int arg1) {
		int var2 = method12(arg0 + 45365, arg1 + 91923, 4) + (method12(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method12(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("AGPNOIRK.b(II)I")
	public final int method3(int arg0, int arg1) {
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

	@ObfuscatedName("AGPNOIRK.a(IIZI)V")
	public final void method4(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 8; var4++) {
			for (int var5 = 0; var5 < 8; var5++) {
				field24[arg1][arg0 + var4][arg2 + var5] = 0;
			}
		}

		if (arg0 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				field24[arg1][arg0][arg2 + var6] = field24[arg1][arg0 - 1][arg2 + var6];
			}
		}

		if (arg2 > 0) {
			for (int var7 = 1; var7 < 8; var7++) {
				field24[arg1][arg0 + var7][arg2] = field24[arg1][arg0 + var7][arg2 - 1];
			}
		}

		if (arg0 > 0 && field24[arg1][arg0 - 1][arg2] != 0) {
			field24[arg1][arg0][arg2] = field24[arg1][arg0 - 1][arg2];
		} else if (arg2 > 0 && field24[arg1][arg0][arg2 - 1] != 0) {
			field24[arg1][arg0][arg2] = field24[arg1][arg0][arg2 - 1];
		} else if (arg0 > 0 && arg2 > 0 && field24[arg1][arg0 - 1][arg2 - 1] != 0) {
			field24[arg1][arg0][arg2] = field24[arg1][arg0 - 1][arg2 - 1];
		}
	}

	@ObfuscatedName("AGPNOIRK.a(III)I")
	public final int method5(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("AGPNOIRK.a(IIII)I")
	public static final int method6(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - SNMMFOLO.field1217[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("AGPNOIRK.c(II)I")
	public static final int method7(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	public AGPNOIRK(byte[][][] arg0, int arg1, int[][][] arg2, int arg3) {
		field1 = 99;
		field2 = arg3;
		field3 = arg1;
		field24 = arg2;
		field6 = arg0;
		field8 = new byte[4][field2][field3];
		field17 = new byte[4][field2][field3];
		field25 = new byte[4][field2][field3];
		field14 = new byte[4][field2][field3];
		field7 = new int[4][field2 + 1][field3 + 1];
		field16 = new byte[4][field2 + 1][field3 + 1];
		field15 = new int[field2 + 1][field3 + 1];
		field18 = new int[field3];
		field19 = new int[field3];
		field20 = new int[field3];
		field21 = new int[field3];
		field22 = new int[field3];
	}

	@ObfuscatedName("AGPNOIRK.a(IIIII)V")
	public final void method8(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg3; var5 <= arg0 + arg3; var5++) {
			for (int var6 = arg2; var6 <= arg1 + arg2; var6++) {
				if (var6 >= 0 && var6 < field2 && var5 >= 0 && var5 < field3) {
					field16[0][var6][var5] = 127;

					if (arg2 == var6 && var6 > 0) {
						field24[0][var6][var5] = field24[0][var6 - 1][var5];
					}

					if (arg1 + arg2 == var6 && var6 < field2 - 1) {
						field24[0][var6][var5] = field24[0][var6 + 1][var5];
					}

					if (arg3 == var5 && var5 > 0) {
						field24[0][var6][var5] = field24[0][var6][var5 - 1];
					}

					if (arg0 + arg3 == var5 && var5 < field3 - 1) {
						field24[0][var6][var5] = field24[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("AGPNOIRK.a(LMPMWDRAA;[LUDXVXGJJ;I)V")
	public final void method9(MPMWDRAA arg0, UDXVXGJJ[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field6[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field6[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method518(var5, var4);
						}
					}
				}
			}
		}

		field10 += (int) (Math.random() * 5.0D) - 2;
		if (field10 < -8) {
			field10 = -8;
		}

		if (field10 > 8) {
			field10 = 8;
		}

		field23 += (int) (Math.random() * 5.0D) - 2;
		if (field23 < -16) {
			field23 = -16;
		}

		if (field23 > 16) {
			field23 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field16[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field3 - 1; var16++) {
				for (int var17 = 1; var17 < field2 - 1; var17++) {
					int var18 = field24[var7][var17 + 1][var16] - field24[var7][var17 - 1][var16];
					int var19 = field24[var7][var17][var16 + 1] - field24[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field15[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field3; var26++) {
				field18[var26] = 0;
				field19[var26] = 0;
				field20[var26] = 0;
				field21[var26] = 0;
				field22[var26] = 0;
			}

			for (int var27 = -5; var27 < field2 + 5; var27++) {
				for (int var28 = 0; var28 < field3; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field2) {
						int var30 = field8[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							JZNGGVQB var31 = JZNGGVQB.field748[var30 - 1];
							field18[var28] += var31.field757;
							field19[var28] += var31.field755;
							field20[var28] += var31.field756;
							field21[var28] += var31.field758;
							field22[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field2) {
						int var33 = field8[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							JZNGGVQB var34 = JZNGGVQB.field748[var33 - 1];
							field18[var28] -= var34.field757;
							field19[var28] -= var34.field755;
							field20[var28] -= var34.field756;
							field21[var28] -= var34.field758;
							field22[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field2 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field3 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field3) {
							var35 += field18[var41];
							var36 += field19[var41];
							var37 += field20[var41];
							var38 += field21[var41];
							var39 += field22[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field3) {
							var35 -= field18[var42];
							var36 -= field19[var42];
							var37 -= field20[var42];
							var38 -= field21[var42];
							var39 -= field22[var42];
						}

						if (var40 >= 1 && var40 < field3 - 1 && (!field12 || (field6[0][var27][var40] & 0x2) != 0 || (field6[var7][var27][var40] & 0x10) == 0 && method17(var27, var7, var40) == field5)) {
							if (var7 < field1) {
								field1 = var7;
							}

							int var43 = field8[var7][var27][var40] & 0xFF;
							int var44 = field17[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field24[var7][var27][var40];
								int var46 = field24[var7][var27 + 1][var40];
								int var47 = field24[var7][var27 + 1][var40 + 1];
								int var48 = field24[var7][var27][var40 + 1];
								int var49 = field15[var27][var40];
								int var50 = field15[var27 + 1][var40];
								int var51 = field15[var27 + 1][var40 + 1];
								int var52 = field15[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method5(var55, var56, var57);
									var55 = field10 + var55 & 0xFF;
									var57 += field23;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method5(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field25[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !JZNGGVQB.field748[var44 - 1].field753) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field7[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = SNMMFOLO.field1228[method22(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method289(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method22(var53, var49), method22(var53, var50), method22(var53, var51), method22(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field25[var7][var27][var40] + 1;
									byte var61 = field14[var7][var27][var40];
									JZNGGVQB var62 = JZNGGVQB.field748[var44 - 1];
									int var63 = var62.field751;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = SNMMFOLO.method430(var63);
										var65 = -1;
									} else if (var62.field750 == 0xFF00FF) {
										var65 = -2;
										var63 = -1;
										var64 = SNMMFOLO.field1228[method3(var62.field759, 96)];
									} else {
										var65 = method5(var62.field754, var62.field755, var62.field756);
										var64 = SNMMFOLO.field1228[method3(var62.field759, 96)];
									}

									arg0.method289(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method22(var53, var49), method22(var53, var50), method22(var53, var51), method22(var53, var52), method3(var65, var49), method3(var65, var50), method3(var65, var51), method3(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field3 - 1; var66++) {
				for (int var67 = 1; var67 < field2 - 1; var67++) {
					arg0.method288(var7, var67, var66, method17(var67, var7, var66));
				}
			}
		}

		arg0.method315(-50, -10, -50);

		for (int var68 = 0; var68 < field2; var68++) {
			for (int var69 = 0; var69 < field3; var69++) {
				if ((field6[1][var68][var69] & 0x2) == 2) {
					arg0.method286(var69, var68);
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
				for (int var75 = 0; var75 <= field3; var75++) {
					for (int var76 = 0; var76 <= field2; var76++) {
						if ((field7[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field7[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field3 && (field7[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field7[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field7[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field24[var80][var76][var77] - var84;
								int var86 = field24[var79][var76][var77];
								MPMWDRAA.method287(var77 * 128, var78 * 128 + 128, var76 * 128, 1, var86, var73, var76 * 128, var85);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field7[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field7[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field7[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field2 && (field7[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field7[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field7[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field24[var92][var89][var75] - var96;
								int var98 = field24[var91][var89][var75];
								MPMWDRAA.method287(var75 * 128, var75 * 128, var89 * 128, 2, var98, var73, var90 * 128 + 128, var97);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field7[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field7[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field7[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field3 && (field7[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field7[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field2) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field7[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field24[var74][var101][var103];
								MPMWDRAA.method287(var103 * 128, var104 * 128 + 128, var101 * 128, 4, var107, var73, var102 * 128 + 128, var107);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field7[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("AGPNOIRK.a(IIIIILTQYMAXSO;II)V")
	public final void method10(int arg0, int arg1, int arg2, int arg3, TQYMAXSO arg4, int arg5, int arg6) {
		if (arg6 >= 0 && arg6 < 104 && arg0 >= 0 && arg0 < 104) {
			field6[arg2][arg6][arg0] = 0;
			while (true) {
				int var8 = arg4.method468();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg4.method468();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg2 == 0) {
						field24[0][arg6][arg0] = -var9 * 8;
						return;
					}

					field24[arg2][arg6][arg0] = field24[arg2 - 1][arg6][arg0] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field17[arg2][arg6][arg0] = arg4.method469();
					field25[arg2][arg6][arg0] = (byte) ((var8 - 2) / 4);
					field14[arg2][arg6][arg0] = (byte) (var8 + arg3 - 2 & 0x3);
				} else if (var8 <= 81) {
					field6[arg2][arg6][arg0] = (byte) (var8 - 49);
				} else {
					field8[arg2][arg6][arg0] = (byte) (var8 - 81);
				}
			}

			if (arg2 == 0) {
				field24[0][arg6][arg0] = -method2(arg6 + arg5 + 932731, arg0 + 556238 + arg1) * 8;
			} else {
				field24[arg2][arg6][arg0] = field24[arg2 - 1][arg6][arg0] - 240;
			}
		} else {
			while (true) {
				int var10 = arg4.method468();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg4.method468();
					return;
				}

				if (var10 <= 49) {
					arg4.method468();
				}
			}
		}
	}

	@ObfuscatedName("AGPNOIRK.d(II)I")
	public static final int method11(int arg0, int arg1) {
		int var2 = method7(arg0 - 1, arg1 - 1) + method7(arg0 + 1, arg1 - 1) + method7(arg0 - 1, arg1 + 1) + method7(arg0 + 1, arg1 + 1);
		int var3 = method7(arg0 - 1, arg1) + method7(arg0 + 1, arg1) + method7(arg0, arg1 - 1) + method7(arg0, arg1 + 1);
		int var4 = method7(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("AGPNOIRK.b(III)I")
	public static final int method12(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method11(var3, var5);
		int var8 = method11(var3 + 1, var5);
		int var9 = method11(var3, var5 + 1);
		int var10 = method11(var3 + 1, var5 + 1);
		int var11 = method6(var7, var8, var4, arg2);
		int var12 = method6(var9, var10, var4, arg2);
		return method6(var11, var12, var6, arg2);
	}

	@ObfuscatedName("AGPNOIRK.a(III[BIIILMPMWDRAA;I[LUDXVXGJJ;I)V")
	public final void method13(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, MPMWDRAA arg6, int arg7, UDXVXGJJ[] arg8, int arg9) {
		TQYMAXSO var11 = new TQYMAXSO(arg3);
		int var12 = -1;
		while (true) {
			int var13 = var11.method482();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method482();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method468();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg5 == var18 && var17 >= arg9 && var17 < arg9 + 8 && var16 >= arg4 && var16 < arg4 + 8) {
					WEWSMZTU var22 = WEWSMZTU.method555(var12);
					int var23 = arg2 + OWEOYNVX.method365(var17 & 0x7, var22.field1384, var16 & 0x7, var21, arg0, var22.field1349);
					int var24 = arg7 + OWEOYNVX.method366(var22.field1384, arg0, var17 & 0x7, var22.field1349, var21, var16 & 0x7);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg1;
						if ((field6[1][var23][var24] & 0x2) == 2) {
							var25 = arg1 - 1;
						}

						UDXVXGJJ var26 = null;
						if (var25 >= 0) {
							var26 = arg8[var25];
						}

						method20(var26, var23, arg1, var12, var24, arg6, var20, arg0 + var21 & 0x3);
					}
				}
			}
		}
	}

	@ObfuscatedName("AGPNOIRK.a(LHJOZCGZH;LTQYMAXSO;I)V")
	public static final void method14(HJOZCGZH arg0, TQYMAXSO arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg1.method482();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			WEWSMZTU var4 = WEWSMZTU.method555(var2);
			var4.method552(arg0);

			while (true) {
				int var5 = arg1.method482();
				if (var5 == 0) {
					break;
				}

				arg1.method468();
			}
		}
	}

	@ObfuscatedName("AGPNOIRK.a(IZI[B)Z")
	public static final boolean method15(int arg0, int arg1, byte[] arg2) {
		boolean var3 = true;
		TQYMAXSO var4 = new TQYMAXSO(arg2);
		int var5 = -1;
		while (true) {
			int var6 = var4.method482();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method482();
					if (var9 == 0) {
						break;
					}

					var4.method468();
				} else {
					int var10 = var4.method482();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method468() >> 2;
					int var14 = arg0 + var12;
					int var15 = arg1 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						WEWSMZTU var16 = WEWSMZTU.method555(var5);
						if (var13 != 22 || !field12 || var16.field1378 || var16.field1358) {
							var3 &= var16.method554();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("AGPNOIRK.a(IIILUDXVXGJJ;IIILMPMWDRAA;II[[[I)V")
	public static final void method16(int arg0, int arg1, int arg2, UDXVXGJJ arg3, int arg4, int arg5, int arg6, MPMWDRAA arg7, int arg8, int[][][] arg9) {
		int var10 = arg9[arg5][arg0][arg6];
		int var11 = arg9[arg5][arg0 + 1][arg6];
		int var12 = arg9[arg5][arg0 + 1][arg6 + 1];
		int var13 = arg9[arg5][arg0][arg6 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		WEWSMZTU var15 = WEWSMZTU.method555(arg2);
		int var16 = (arg2 << 14) + (arg6 << 7) + arg0 + 0x40000000;
		if (!var15.field1378) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg4 << 6) + arg8);
		if (arg8 == 22) {
			HTDIJKWW var18;
			if (var15.field1362 == -1 && var15.field1354 == null) {
				var18 = var15.method556(22, arg4, var10, var11, var12, var13, -1);
			} else {
				var18 = new NTLPGIRW(var13, arg2, var11, true, arg4, 22, var12, var15.field1362, var10);
			}

			arg7.method290(var18, arg6, arg1, var16, var14, var17, arg0);

			if (var15.field1343 && var15.field1378) {
				arg3.method518(arg6, arg0);
			}
		} else if (arg8 == 10 || arg8 == 11) {
			HTDIJKWW var19;
			if (var15.field1362 == -1 && var15.field1354 == null) {
				var19 = var15.method556(10, arg4, var10, var11, var12, var13, -1);
			} else {
				var19 = new NTLPGIRW(var13, arg2, var11, true, arg4, 10, var12, var15.field1362, var10);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg8 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg4 == 1 || arg4 == 3) {
					var21 = var15.field1384;
					var22 = var15.field1349;
				} else {
					var21 = var15.field1349;
					var22 = var15.field1384;
				}

				arg7.method294(arg6, var16, var21, var20, arg0, arg1, var17, var19, var22, var14);
			}

			if (var15.field1343) {
				arg3.method517(arg6, var15.field1384, arg4, var15.field1349, var15.field1383, arg0);
			}
		} else if (arg8 >= 12) {
			HTDIJKWW var23;
			if (var15.field1362 == -1 && var15.field1354 == null) {
				var23 = var15.method556(arg8, arg4, var10, var11, var12, var13, -1);
			} else {
				var23 = new NTLPGIRW(var13, arg2, var11, true, arg4, arg8, var12, var15.field1362, var10);
			}

			arg7.method294(arg6, var16, 1, 0, arg0, arg1, var17, var23, 1, var14);

			if (var15.field1343) {
				arg3.method517(arg6, var15.field1384, arg4, var15.field1349, var15.field1383, arg0);
			}
		} else if (arg8 == 0) {
			HTDIJKWW var24;
			if (var15.field1362 == -1 && var15.field1354 == null) {
				var24 = var15.method556(0, arg4, var10, var11, var12, var13, -1);
			} else {
				var24 = new NTLPGIRW(var13, arg2, var11, true, arg4, 0, var12, var15.field1362, var10);
			}

			arg7.method292(arg1, arg6, null, var17, field13[arg4], arg0, 0, var14, var16, var24);

			if (var15.field1343) {
				arg3.method516(var15.field1383, arg8, arg4, arg0, arg6);
			}
		} else if (arg8 == 1) {
			HTDIJKWW var25;
			if (var15.field1362 == -1 && var15.field1354 == null) {
				var25 = var15.method556(1, arg4, var10, var11, var12, var13, -1);
			} else {
				var25 = new NTLPGIRW(var13, arg2, var11, true, arg4, 1, var12, var15.field1362, var10);
			}

			arg7.method292(arg1, arg6, null, var17, field9[arg4], arg0, 0, var14, var16, var25);

			if (var15.field1343) {
				arg3.method516(var15.field1383, arg8, arg4, arg0, arg6);
			}
		} else if (arg8 == 2) {
			int var26 = arg4 + 1 & 0x3;
			HTDIJKWW var27;
			HTDIJKWW var28;
			if (var15.field1362 == -1 && var15.field1354 == null) {
				var27 = var15.method556(2, arg4 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method556(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new NTLPGIRW(var13, arg2, var11, true, arg4 + 4, 2, var12, var15.field1362, var10);
				var28 = new NTLPGIRW(var13, arg2, var11, true, var26, 2, var12, var15.field1362, var10);
			}

			arg7.method292(arg1, arg6, var28, var17, field13[arg4], arg0, field13[var26], var14, var16, var27);

			if (var15.field1343) {
				arg3.method516(var15.field1383, arg8, arg4, arg0, arg6);
			}
		} else if (arg8 == 3) {
			HTDIJKWW var29;
			if (var15.field1362 == -1 && var15.field1354 == null) {
				var29 = var15.method556(3, arg4, var10, var11, var12, var13, -1);
			} else {
				var29 = new NTLPGIRW(var13, arg2, var11, true, arg4, 3, var12, var15.field1362, var10);
			}

			arg7.method292(arg1, arg6, null, var17, field9[arg4], arg0, 0, var14, var16, var29);

			if (var15.field1343) {
				arg3.method516(var15.field1383, arg8, arg4, arg0, arg6);
			}
		} else if (arg8 == 9) {
			HTDIJKWW var30;
			if (var15.field1362 == -1 && var15.field1354 == null) {
				var30 = var15.method556(arg8, arg4, var10, var11, var12, var13, -1);
			} else {
				var30 = new NTLPGIRW(var13, arg2, var11, true, arg4, arg8, var12, var15.field1362, var10);
			}

			arg7.method294(arg6, var16, 1, 0, arg0, arg1, var17, var30, 1, var14);

			if (var15.field1343) {
				arg3.method517(arg6, var15.field1384, arg4, var15.field1349, var15.field1383, arg0);
			}
		} else {
			if (var15.field1342) {
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

			if (arg8 == 4) {
				HTDIJKWW var35;
				if (var15.field1362 == -1 && var15.field1354 == null) {
					var35 = var15.method556(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new NTLPGIRW(var13, arg2, var11, true, 0, 4, var12, var15.field1362, var10);
				}

				arg7.method293(var14, var35, arg0, arg1, var17, field13[arg4], 0, var16, 0, arg4 * 512, arg6);
			} else if (arg8 == 5) {
				int var36 = 16;
				int var37 = arg7.method310(arg1, arg0, arg6);
				if (var37 > 0) {
					var36 = WEWSMZTU.method555(var37 >> 14 & 0x7FFF).field1350;
				}

				HTDIJKWW var38;
				if (var15.field1362 == -1 && var15.field1354 == null) {
					var38 = var15.method556(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new NTLPGIRW(var13, arg2, var11, true, 0, 4, var12, var15.field1362, var10);
				}

				arg7.method293(var14, var38, arg0, arg1, var17, field13[arg4], field4[arg4] * var36, var16, field11[arg4] * var36, arg4 * 512, arg6);
			} else if (arg8 == 6) {
				HTDIJKWW var39;
				if (var15.field1362 == -1 && var15.field1354 == null) {
					var39 = var15.method556(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new NTLPGIRW(var13, arg2, var11, true, 0, 4, var12, var15.field1362, var10);
				}

				arg7.method293(var14, var39, arg0, arg1, var17, 256, 0, var16, 0, arg4, arg6);
			} else if (arg8 == 7) {
				HTDIJKWW var40;
				if (var15.field1362 == -1 && var15.field1354 == null) {
					var40 = var15.method556(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new NTLPGIRW(var13, arg2, var11, true, 0, 4, var12, var15.field1362, var10);
				}

				arg7.method293(var14, var40, arg0, arg1, var17, 512, 0, var16, 0, arg4, arg6);
			} else if (arg8 == 8) {
				HTDIJKWW var41;
				if (var15.field1362 == -1 && var15.field1354 == null) {
					var41 = var15.method556(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new NTLPGIRW(var13, arg2, var11, true, 0, 4, var12, var15.field1362, var10);
				}

				arg7.method293(var14, var41, arg0, arg1, var17, 768, 0, var16, 0, arg4, arg6);
			}
		}
	}

	@ObfuscatedName("AGPNOIRK.a(IIIB)I")
	public int method17(int arg0, int arg1, int arg2) {
		if ((field6[arg1][arg0][arg2] & 0x8) != 0) {
			return 0;
		}

		if (arg1 > 0 && (field6[1][arg0][arg2] & 0x2) != 0) {
			return arg1 - 1;
		}

		return arg1;
	}

	@ObfuscatedName("AGPNOIRK.c(III)Z")
	public static final boolean method18(int arg0, int arg1) {
		WEWSMZTU var2 = WEWSMZTU.method555(arg0);

		if (arg1 == 11) {
			arg1 = 10;
		}

		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}

		return var2.method550(arg1);
	}

	@ObfuscatedName("AGPNOIRK.a([BIZIIIII[LUDXVXGJJ;I)V")
	public final void method19(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, UDXVXGJJ[] arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg4 + var10 > 0 && arg4 + var10 < 103 && arg1 + var11 > 0 && arg1 + var11 < 103) {
					arg7[arg3].field1280[arg4 + var10][arg1 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		TQYMAXSO var12 = new TQYMAXSO(arg0);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg5 == var13 && var14 >= arg6 && var14 < arg6 + 8 && var15 >= arg2 && var15 < arg2 + 8) {
						method10(arg1 + OWEOYNVX.method364(var14 & 0x7, arg8, var15 & 0x7), 0, arg3, arg8, var12, 0, arg4 + OWEOYNVX.method363(var14 & 0x7, arg8, var15 & 0x7));
					} else {
						method10(-1, 0, 0, 0, var12, 0, -1);
					}
				}
			}
		}
	}

	@ObfuscatedName("AGPNOIRK.a(ILUDXVXGJJ;IIIILMPMWDRAA;II)V")
	public final void method20(UDXVXGJJ arg0, int arg1, int arg2, int arg3, int arg4, MPMWDRAA arg5, int arg6, int arg7) {
		if (field12 && (field6[0][arg1][arg4] & 0x2) == 0) {
			if ((field6[arg2][arg1][arg4] & 0x10) != 0) {
				return;
			}

			if (method17(arg1, arg2, arg4) != field5) {
				return;
			}
		}

		if (arg2 < field1) {
			field1 = arg2;
		}

		int var9 = field24[arg2][arg1][arg4];
		int var10 = field24[arg2][arg1 + 1][arg4];
		int var11 = field24[arg2][arg1 + 1][arg4 + 1];
		int var12 = field24[arg2][arg1][arg4 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		WEWSMZTU var14 = WEWSMZTU.method555(arg3);
		int var15 = (arg3 << 14) + (arg4 << 7) + arg1 + 0x40000000;
		if (!var14.field1378) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg7 << 6) + arg6);
		if (arg6 == 22) {
			if (!field12 || var14.field1378 || var14.field1358) {
				HTDIJKWW var17;
				if (var14.field1362 == -1 && var14.field1354 == null) {
					var17 = var14.method556(22, arg7, var9, var10, var11, var12, -1);
				} else {
					var17 = new NTLPGIRW(var12, arg3, var10, true, arg7, 22, var11, var14.field1362, var9);
				}

				arg5.method290(var17, arg4, arg2, var15, var13, var16, arg1);

				if (var14.field1343 && var14.field1378 && arg0 != null) {
					arg0.method518(arg4, arg1);
				}
			}
		} else if (arg6 == 10 || arg6 == 11) {
			HTDIJKWW var18;
			if (var14.field1362 == -1 && var14.field1354 == null) {
				var18 = var14.method556(10, arg7, var9, var10, var11, var12, -1);
			} else {
				var18 = new NTLPGIRW(var12, arg3, var10, true, arg7, 10, var11, var14.field1362, var9);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg6 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg7 == 1 || arg7 == 3) {
					var20 = var14.field1384;
					var21 = var14.field1349;
				} else {
					var20 = var14.field1349;
					var21 = var14.field1384;
				}

				if (arg5.method294(arg4, var15, var20, var19, arg1, arg2, var16, var18, var21, var13) && var14.field1375) {
					KDWDYCIL var22;
					if (var18 instanceof KDWDYCIL) {
						var22 = (KDWDYCIL) var18;
					} else {
						var22 = var14.method556(10, arg7, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field789 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field16[arg2][arg1 + var23][arg4 + var24]) {
									field16[arg2][arg1 + var23][arg4 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field1343 && arg0 != null) {
				arg0.method517(arg4, var14.field1384, arg7, var14.field1349, var14.field1383, arg1);
			}
		} else if (arg6 >= 12) {
			HTDIJKWW var26;
			if (var14.field1362 == -1 && var14.field1354 == null) {
				var26 = var14.method556(arg6, arg7, var9, var10, var11, var12, -1);
			} else {
				var26 = new NTLPGIRW(var12, arg3, var10, true, arg7, arg6, var11, var14.field1362, var9);
			}

			arg5.method294(arg4, var15, 1, 0, arg1, arg2, var16, var26, 1, var13);

			if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg2 > 0) {
				field7[arg2][arg1][arg4] |= 0x924;
			}

			if (var14.field1343 && arg0 != null) {
				arg0.method517(arg4, var14.field1384, arg7, var14.field1349, var14.field1383, arg1);
			}
		} else if (arg6 == 0) {
			HTDIJKWW var27;
			if (var14.field1362 == -1 && var14.field1354 == null) {
				var27 = var14.method556(0, arg7, var9, var10, var11, var12, -1);
			} else {
				var27 = new NTLPGIRW(var12, arg3, var10, true, arg7, 0, var11, var14.field1362, var9);
			}

			arg5.method292(arg2, arg4, null, var16, field13[arg7], arg1, 0, var13, var15, var27);

			if (arg7 == 0) {
				if (var14.field1375) {
					field16[arg2][arg1][arg4] = 50;
					field16[arg2][arg1][arg4 + 1] = 50;
				}

				if (var14.field1360) {
					field7[arg2][arg1][arg4] |= 0x249;
				}
			} else if (arg7 == 1) {
				if (var14.field1375) {
					field16[arg2][arg1][arg4 + 1] = 50;
					field16[arg2][arg1 + 1][arg4 + 1] = 50;
				}

				if (var14.field1360) {
					field7[arg2][arg1][arg4 + 1] |= 0x492;
				}
			} else if (arg7 == 2) {
				if (var14.field1375) {
					field16[arg2][arg1 + 1][arg4] = 50;
					field16[arg2][arg1 + 1][arg4 + 1] = 50;
				}

				if (var14.field1360) {
					field7[arg2][arg1 + 1][arg4] |= 0x249;
				}
			} else if (arg7 == 3) {
				if (var14.field1375) {
					field16[arg2][arg1][arg4] = 50;
					field16[arg2][arg1 + 1][arg4] = 50;
				}

				if (var14.field1360) {
					field7[arg2][arg1][arg4] |= 0x492;
				}
			}

			if (var14.field1343 && arg0 != null) {
				arg0.method516(var14.field1383, arg6, arg7, arg1, arg4);
			}

			if (var14.field1350 != 16) {
				arg5.method300(arg1, var14.field1350, arg4, arg2);
			}
		} else if (arg6 == 1) {
			HTDIJKWW var28;
			if (var14.field1362 == -1 && var14.field1354 == null) {
				var28 = var14.method556(1, arg7, var9, var10, var11, var12, -1);
			} else {
				var28 = new NTLPGIRW(var12, arg3, var10, true, arg7, 1, var11, var14.field1362, var9);
			}

			arg5.method292(arg2, arg4, null, var16, field9[arg7], arg1, 0, var13, var15, var28);

			if (var14.field1375) {
				if (arg7 == 0) {
					field16[arg2][arg1][arg4 + 1] = 50;
				} else if (arg7 == 1) {
					field16[arg2][arg1 + 1][arg4 + 1] = 50;
				} else if (arg7 == 2) {
					field16[arg2][arg1 + 1][arg4] = 50;
				} else if (arg7 == 3) {
					field16[arg2][arg1][arg4] = 50;
				}
			}

			if (var14.field1343 && arg0 != null) {
				arg0.method516(var14.field1383, arg6, arg7, arg1, arg4);
			}
		} else if (arg6 == 2) {
			int var29 = arg7 + 1 & 0x3;
			HTDIJKWW var30;
			HTDIJKWW var31;
			if (var14.field1362 == -1 && var14.field1354 == null) {
				var30 = var14.method556(2, arg7 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method556(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new NTLPGIRW(var12, arg3, var10, true, arg7 + 4, 2, var11, var14.field1362, var9);
				var31 = new NTLPGIRW(var12, arg3, var10, true, var29, 2, var11, var14.field1362, var9);
			}

			arg5.method292(arg2, arg4, var31, var16, field13[arg7], arg1, field13[var29], var13, var15, var30);

			if (var14.field1360) {
				if (arg7 == 0) {
					field7[arg2][arg1][arg4] |= 0x249;
					field7[arg2][arg1][arg4 + 1] |= 0x492;
				} else if (arg7 == 1) {
					field7[arg2][arg1][arg4 + 1] |= 0x492;
					field7[arg2][arg1 + 1][arg4] |= 0x249;
				} else if (arg7 == 2) {
					field7[arg2][arg1 + 1][arg4] |= 0x249;
					field7[arg2][arg1][arg4] |= 0x492;
				} else if (arg7 == 3) {
					field7[arg2][arg1][arg4] |= 0x492;
					field7[arg2][arg1][arg4] |= 0x249;
				}
			}

			if (var14.field1343 && arg0 != null) {
				arg0.method516(var14.field1383, arg6, arg7, arg1, arg4);
			}

			if (var14.field1350 != 16) {
				arg5.method300(arg1, var14.field1350, arg4, arg2);
			}
		} else if (arg6 == 3) {
			HTDIJKWW var32;
			if (var14.field1362 == -1 && var14.field1354 == null) {
				var32 = var14.method556(3, arg7, var9, var10, var11, var12, -1);
			} else {
				var32 = new NTLPGIRW(var12, arg3, var10, true, arg7, 3, var11, var14.field1362, var9);
			}

			arg5.method292(arg2, arg4, null, var16, field9[arg7], arg1, 0, var13, var15, var32);

			if (var14.field1375) {
				if (arg7 == 0) {
					field16[arg2][arg1][arg4 + 1] = 50;
				} else if (arg7 == 1) {
					field16[arg2][arg1 + 1][arg4 + 1] = 50;
				} else if (arg7 == 2) {
					field16[arg2][arg1 + 1][arg4] = 50;
				} else if (arg7 == 3) {
					field16[arg2][arg1][arg4] = 50;
				}
			}

			if (var14.field1343 && arg0 != null) {
				arg0.method516(var14.field1383, arg6, arg7, arg1, arg4);
			}
		} else if (arg6 == 9) {
			HTDIJKWW var33;
			if (var14.field1362 == -1 && var14.field1354 == null) {
				var33 = var14.method556(arg6, arg7, var9, var10, var11, var12, -1);
			} else {
				var33 = new NTLPGIRW(var12, arg3, var10, true, arg7, arg6, var11, var14.field1362, var9);
			}

			arg5.method294(arg4, var15, 1, 0, arg1, arg2, var16, var33, 1, var13);

			if (var14.field1343 && arg0 != null) {
				arg0.method517(arg4, var14.field1384, arg7, var14.field1349, var14.field1383, arg1);
			}
		} else {
			if (var14.field1342) {
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

			if (arg6 == 4) {
				HTDIJKWW var38;
				if (var14.field1362 == -1 && var14.field1354 == null) {
					var38 = var14.method556(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new NTLPGIRW(var12, arg3, var10, true, 0, 4, var11, var14.field1362, var9);
				}

				arg5.method293(var13, var38, arg1, arg2, var16, field13[arg7], 0, var15, 0, arg7 * 512, arg4);
			} else if (arg6 == 5) {
				int var39 = 16;
				int var40 = arg5.method310(arg2, arg1, arg4);
				if (var40 > 0) {
					var39 = WEWSMZTU.method555(var40 >> 14 & 0x7FFF).field1350;
				}

				HTDIJKWW var41;
				if (var14.field1362 == -1 && var14.field1354 == null) {
					var41 = var14.method556(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new NTLPGIRW(var12, arg3, var10, true, 0, 4, var11, var14.field1362, var9);
				}

				arg5.method293(var13, var41, arg1, arg2, var16, field13[arg7], field4[arg7] * var39, var15, field11[arg7] * var39, arg7 * 512, arg4);
			} else if (arg6 == 6) {
				HTDIJKWW var42;
				if (var14.field1362 == -1 && var14.field1354 == null) {
					var42 = var14.method556(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new NTLPGIRW(var12, arg3, var10, true, 0, 4, var11, var14.field1362, var9);
				}

				arg5.method293(var13, var42, arg1, arg2, var16, 256, 0, var15, 0, arg7, arg4);
			} else if (arg6 == 7) {
				HTDIJKWW var43;
				if (var14.field1362 == -1 && var14.field1354 == null) {
					var43 = var14.method556(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new NTLPGIRW(var12, arg3, var10, true, 0, 4, var11, var14.field1362, var9);
				}

				arg5.method293(var13, var43, arg1, arg2, var16, 512, 0, var15, 0, arg7, arg4);
			} else if (arg6 == 8) {
				HTDIJKWW var44;
				if (var14.field1362 == -1 && var14.field1354 == null) {
					var44 = var14.method556(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new NTLPGIRW(var12, arg3, var10, true, 0, 4, var11, var14.field1362, var9);
				}

				arg5.method293(var13, var44, arg1, arg2, var16, 768, 0, var15, 0, arg7, arg4);
			}
		}
	}

	@ObfuscatedName("AGPNOIRK.a(IILMPMWDRAA;[LUDXVXGJJ;I[B)V")
	public final void method21(int arg0, MPMWDRAA arg1, UDXVXGJJ[] arg2, int arg3, byte[] arg4) {
		TQYMAXSO var6 = new TQYMAXSO(arg4);
		int var7 = -1;
		while (true) {
			int var8 = var6.method482();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method482();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method468();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg0 + var12;
				int var18 = arg3 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field6[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					UDXVXGJJ var20 = null;
					if (var19 >= 0) {
						var20 = arg2[var19];
					}

					method20(var20, var17, var13, var7, var18, arg1, var15, var16);
				}
			}
		}
	}

	@ObfuscatedName("AGPNOIRK.e(II)I")
	public static final int method22(int arg0, int arg1) {
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

	@ObfuscatedName("AGPNOIRK.a(I[LUDXVXGJJ;I[BIII)V")
	public final void method23(int arg0, UDXVXGJJ[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg0 + var8 > 0 && arg0 + var8 < 103 && arg5 + var9 > 0 && arg5 + var9 < 103) {
						arg1[var7].field1280[arg0 + var8][arg5 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		TQYMAXSO var10 = new TQYMAXSO(arg3);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method10(arg5 + var13, arg4, var11, 0, var10, arg2, arg0 + var12);
				}
			}
		}
	}
}
