package deob;

@ObfuscatedName("AIYLKTEB")
public final class AIYLKTEB {

	@ObfuscatedName("AIYLKTEB.A")
	public int field33;

	@ObfuscatedName("AIYLKTEB.B")
	public int field34;

	@ObfuscatedName("AIYLKTEB.a")
	public int[][][] field12;

	@ObfuscatedName("AIYLKTEB.o")
	public byte[][][] field24;

	@ObfuscatedName("AIYLKTEB.D")
	public byte[][][] field36;

	@ObfuscatedName("AIYLKTEB.q")
	public byte[][][] field26;

	@ObfuscatedName("AIYLKTEB.b")
	public byte[][][] field13;

	@ObfuscatedName("AIYLKTEB.t")
	public byte[][][] field28;

	@ObfuscatedName("AIYLKTEB.p")
	public int[][][] field25;

	@ObfuscatedName("AIYLKTEB.l")
	public byte[][][] field22;

	@ObfuscatedName("AIYLKTEB.h")
	public int[][] field19;

	@ObfuscatedName("AIYLKTEB.c")
	public int[] field14;

	@ObfuscatedName("AIYLKTEB.d")
	public int[] field15;

	@ObfuscatedName("AIYLKTEB.e")
	public int[] field16;

	@ObfuscatedName("AIYLKTEB.f")
	public int[] field17;

	@ObfuscatedName("AIYLKTEB.g")
	public int[] field18;

	@ObfuscatedName("AIYLKTEB.j")
	public static final int[] field20 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("AIYLKTEB.k")
	public static final int[] field21 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("AIYLKTEB.n")
	public static final int[] field23 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("AIYLKTEB.w")
	public static final int[] field30 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("AIYLKTEB.z")
	public static int field32 = 99;

	@ObfuscatedName("AIYLKTEB.C")
	public static boolean field35 = true;

	@ObfuscatedName("AIYLKTEB.s")
	public static int field27 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("AIYLKTEB.v")
	public static int field29 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("AIYLKTEB.y")
	public static int field31;

	@ObfuscatedName("AIYLKTEB.a(III)I")
	public static final int method4(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method20(var3, var5);
		int var8 = method20(var3 + 1, var5);
		int var9 = method20(var3, var5 + 1);
		int var10 = method20(var3 + 1, var5 + 1);
		int var11 = method10(var7, var8, var4, arg2);
		int var12 = method10(var9, var10, var4, arg2);
		return method10(var11, var12, var6, arg2);
	}

	@ObfuscatedName("AIYLKTEB.a(II)I")
	public static final int method5(int arg0, int arg1) {
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

	@ObfuscatedName("AIYLKTEB.a(IIIBI)V")
	public final void method6(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg0; var5 <= arg0 + arg3; var5++) {
			for (int var6 = arg1; var6 <= arg1 + arg2; var6++) {
				if (var6 >= 0 && var6 < field33 && var5 >= 0 && var5 < field34) {
					field22[0][var6][var5] = 127;

					if (arg1 == var6 && var6 > 0) {
						field12[0][var6][var5] = field12[0][var6 - 1][var5];
					}

					if (arg1 + arg2 == var6 && var6 < field33 - 1) {
						field12[0][var6][var5] = field12[0][var6 + 1][var5];
					}

					if (arg0 == var5 && var5 > 0) {
						field12[0][var6][var5] = field12[0][var6][var5 - 1];
					}

					if (arg0 + arg3 == var5 && var5 < field34 - 1) {
						field12[0][var6][var5] = field12[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("AIYLKTEB.a(Z[BII[LKFLNJHKB;II)V")
	public final void method7(byte[] arg0, int arg1, int arg2, KFLNJHKB[] arg3, int arg4, int arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg1 + var8 > 0 && arg1 + var8 < 103 && arg2 + var9 > 0 && arg2 + var9 < 103) {
						arg3[var7].field786[arg1 + var8][arg2 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		JHKSAGUC var10 = new JHKSAGUC(arg0);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method17(var10, arg1 + var12, arg2 + var13, 0, arg4, var11, arg5);
				}
			}
		}
	}

	@ObfuscatedName("AIYLKTEB.b(III)Z")
	public static final boolean method8(int arg0, int arg1) {
		SYTHBZWG var2 = SYTHBZWG.method491(arg1);

		if (arg0 == 11) {
			arg0 = 10;
		}

		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}

		return var2.method485(arg0);
	}

	@ObfuscatedName("AIYLKTEB.b(II)I")
	public final int method9(int arg0, int arg1) {
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

	@ObfuscatedName("AIYLKTEB.a(IIII)I")
	public static final int method10(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - AZWEEYMC.field51[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("AIYLKTEB.a(LJHKSAGUC;LVCPXACGS;B)V")
	public static final void method11(JHKSAGUC arg0, VCPXACGS arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method320();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			SYTHBZWG var4 = SYTHBZWG.method491(var2);
			var4.method492(arg1);

			while (true) {
				int var5 = arg0.method320();
				if (var5 == 0) {
					break;
				}

				arg0.method306();
			}
		}
	}

	@ObfuscatedName("AIYLKTEB.a(ILUMYAUCNU;[LKFLNJHKB;)V")
	public final void method12(UMYAUCNU arg0, KFLNJHKB[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field24[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field24[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method347(var4, var5);
						}
					}
				}
			}
		}

		field29 += (int) (Math.random() * 5.0D) - 2;
		if (field29 < -8) {
			field29 = -8;
		}

		if (field29 > 8) {
			field29 = 8;
		}

		field27 += (int) (Math.random() * 5.0D) - 2;
		if (field27 < -16) {
			field27 = -16;
		}

		if (field27 > 16) {
			field27 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field22[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field34 - 1; var16++) {
				for (int var17 = 1; var17 < field33 - 1; var17++) {
					int var18 = field12[var7][var17 + 1][var16] - field12[var7][var17 - 1][var16];
					int var19 = field12[var7][var17][var16 + 1] - field12[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field19[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field34; var26++) {
				field14[var26] = 0;
				field15[var26] = 0;
				field16[var26] = 0;
				field17[var26] = 0;
				field18[var26] = 0;
			}

			for (int var27 = -5; var27 < field33 + 5; var27++) {
				for (int var28 = 0; var28 < field34; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field33) {
						int var30 = field36[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							NEDSEYSI var31 = NEDSEYSI.field896[var30 - 1];
							field14[var28] += var31.field905;
							field15[var28] += var31.field903;
							field16[var28] += var31.field904;
							field17[var28] += var31.field906;
							field18[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field33) {
						int var33 = field36[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							NEDSEYSI var34 = NEDSEYSI.field896[var33 - 1];
							field14[var28] -= var34.field905;
							field15[var28] -= var34.field903;
							field16[var28] -= var34.field904;
							field17[var28] -= var34.field906;
							field18[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field33 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field34 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field34) {
							var35 += field14[var41];
							var36 += field15[var41];
							var37 += field16[var41];
							var38 += field17[var41];
							var39 += field18[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field34) {
							var35 -= field14[var42];
							var36 -= field15[var42];
							var37 -= field16[var42];
							var38 -= field17[var42];
							var39 -= field18[var42];
						}

						if (var40 >= 1 && var40 < field34 - 1 && (!field35 || (field24[0][var27][var40] & 0x2) != 0 || (field24[var7][var27][var40] & 0x10) == 0 && method22(var7, var27, var40) == field31)) {
							if (var7 < field32) {
								field32 = var7;
							}

							int var43 = field36[var7][var27][var40] & 0xFF;
							int var44 = field26[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field12[var7][var27][var40];
								int var46 = field12[var7][var27 + 1][var40];
								int var47 = field12[var7][var27 + 1][var40 + 1];
								int var48 = field12[var7][var27][var40 + 1];
								int var49 = field19[var27][var40];
								int var50 = field19[var27 + 1][var40];
								int var51 = field19[var27 + 1][var40 + 1];
								int var52 = field19[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method18(var55, var56, var57);
									var55 = field29 + var55 & 0xFF;
									var57 += field27;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method18(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field13[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !NEDSEYSI.field896[var44 - 1].field901) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field25[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = AZWEEYMC.field62[method5(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method509(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method5(var53, var49), method5(var53, var50), method5(var53, var51), method5(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field13[var7][var27][var40] + 1;
									byte var61 = field28[var7][var27][var40];
									NEDSEYSI var62 = NEDSEYSI.field896[var44 - 1];
									int var63 = var62.field899;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = AZWEEYMC.method31(var63);
										var65 = -1;
									} else if (var62.field898 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method18(var62.field902, var62.field903, var62.field904);
										var64 = AZWEEYMC.field62[method9(var62.field907, 96)];
									}

									arg0.method509(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method5(var53, var49), method5(var53, var50), method5(var53, var51), method5(var53, var52), method9(var65, var49), method9(var65, var50), method9(var65, var51), method9(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field34 - 1; var66++) {
				for (int var67 = 1; var67 < field33 - 1; var67++) {
					arg0.method508(var7, var67, var66, method22(var7, var67, var66));
				}
			}
		}

		arg0.method535(768, -10, -50, -50, 64);

		for (int var68 = 0; var68 < field33; var68++) {
			for (int var69 = 0; var69 < field34; var69++) {
				if ((field24[1][var68][var69] & 0x2) == 2) {
					arg0.method506(var69, var68);
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
				for (int var75 = 0; var75 <= field34; var75++) {
					for (int var76 = 0; var76 <= field33; var76++) {
						if ((field25[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field25[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field34 && (field25[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field25[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field25[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field12[var80][var76][var77] - var84;
								int var86 = field12[var79][var76][var77];
								UMYAUCNU.method507(var86, var76 * 128, var78 * 128 + 128, var85, 1, var73, var76 * 128, var77 * 128);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field25[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field25[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field25[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field33 && (field25[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field25[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field25[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field12[var92][var89][var75] - var96;
								int var98 = field12[var91][var89][var75];
								UMYAUCNU.method507(var98, var89 * 128, var75 * 128, var97, 2, var73, var90 * 128 + 128, var75 * 128);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field25[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field25[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field25[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field34 && (field25[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field25[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field33) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field25[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field12[var74][var101][var103];
								UMYAUCNU.method507(var107, var101 * 128, var104 * 128 + 128, var107, 4, var73, var102 * 128 + 128, var103 * 128);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field25[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("AIYLKTEB.a(ZI[LKFLNJHKB;III[BIII)V")
	public final void method13(int arg0, KFLNJHKB[] arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg7 + var10 > 0 && arg7 + var10 < 103 && arg2 + var11 > 0 && arg2 + var11 < 103) {
					arg1[arg6].field786[arg7 + var10][arg2 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		JHKSAGUC var12 = new JHKSAGUC(arg5);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg0 == var13 && var14 >= arg3 && var14 < arg3 + 8 && var15 >= arg8 && var15 < arg8 + 8) {
						method17(var12, arg7 + EGPGCXBS.method219(var14 & 0x7, arg4, var15 & 0x7), arg2 + EGPGCXBS.method220(var14 & 0x7, var15 & 0x7, arg4), arg4, 0, arg6, 0);
					} else {
						method17(var12, -1, -1, 0, 0, 0, 0);
					}
				}
			}
		}
	}

	public AIYLKTEB(int arg0, int[][][] arg1, byte[][][] arg2, int arg3) {
		field32 = 99;
		field33 = arg0;
		field34 = arg3;
		field12 = arg1;
		field24 = arg2;
		field36 = new byte[4][field33][field34];
		field26 = new byte[4][field33][field34];
		field13 = new byte[4][field33][field34];
		field28 = new byte[4][field33][field34];
		field25 = new int[4][field33 + 1][field34 + 1];
		field22 = new byte[4][field33 + 1][field34 + 1];
		field19 = new int[field33 + 1][field34 + 1];
		field14 = new int[field34];
		field15 = new int[field34];
		field16 = new int[field34];
		field17 = new int[field34];
		field18 = new int[field34];
	}

	@ObfuscatedName("AIYLKTEB.a(LKFLNJHKB;ILUMYAUCNU;IIIIBI)V")
	public final void method14(KFLNJHKB arg0, int arg1, UMYAUCNU arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field35 && (field24[0][arg7][arg5] & 0x2) == 0) {
			if ((field24[arg4][arg7][arg5] & 0x10) != 0) {
				return;
			}

			if (method22(arg4, arg7, arg5) != field31) {
				return;
			}
		}

		if (arg4 < field32) {
			field32 = arg4;
		}

		int var9 = field12[arg4][arg7][arg5];
		int var10 = field12[arg4][arg7 + 1][arg5];
		int var11 = field12[arg4][arg7 + 1][arg5 + 1];
		int var12 = field12[arg4][arg7][arg5 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		SYTHBZWG var14 = SYTHBZWG.method491(arg6);
		int var15 = (arg6 << 14) + (arg5 << 7) + arg7 + 0x40000000;
		if (!var14.field1198) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg1 << 6) + arg3);
		if (arg3 == 22) {
			if (!field35 || var14.field1198 || var14.field1178) {
				FKSXNQOK var17;
				if (var14.field1205 == -1 && var14.field1182 == null) {
					var17 = var14.method486(22, arg1, var9, var10, var11, var12, -1);
				} else {
					var17 = new HALGFRSE(22, arg1, var10, arg6, var14.field1205, var12, var11, true, var9);
				}

				arg2.method510(var16, var17, arg7, var15, var13, arg5, arg4);

				if (var14.field1216 && var14.field1198 && arg0 != null) {
					arg0.method347(arg7, arg5);
				}
			}
		} else if (arg3 == 10 || arg3 == 11) {
			FKSXNQOK var18;
			if (var14.field1205 == -1 && var14.field1182 == null) {
				var18 = var14.method486(10, arg1, var9, var10, var11, var12, -1);
			} else {
				var18 = new HALGFRSE(10, arg1, var10, arg6, var14.field1205, var12, var11, true, var9);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg3 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg1 == 1 || arg1 == 3) {
					var20 = var14.field1181;
					var21 = var14.field1203;
				} else {
					var20 = var14.field1203;
					var21 = var14.field1181;
				}

				if (arg2.method514(arg7, var21, var19, var13, var18, var20, arg5, var16, var15, arg4) && var14.field1176) {
					RTQSBWRH var22;
					if (var18 instanceof RTQSBWRH) {
						var22 = (RTQSBWRH) var18;
					} else {
						var22 = var14.method486(10, arg1, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field1119 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field22[arg4][arg7 + var23][arg5 + var24]) {
									field22[arg4][arg7 + var23][arg5 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field1216 && arg0 != null) {
				arg0.method346(var14.field1173, arg5, var14.field1181, var14.field1203, arg1, arg7);
			}
		} else if (arg3 >= 12) {
			FKSXNQOK var26;
			if (var14.field1205 == -1 && var14.field1182 == null) {
				var26 = var14.method486(arg3, arg1, var9, var10, var11, var12, -1);
			} else {
				var26 = new HALGFRSE(arg3, arg1, var10, arg6, var14.field1205, var12, var11, true, var9);
			}

			arg2.method514(arg7, 1, 0, var13, var26, 1, arg5, var16, var15, arg4);

			if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg4 > 0) {
				field25[arg4][arg7][arg5] |= 0x924;
			}

			if (var14.field1216 && arg0 != null) {
				arg0.method346(var14.field1173, arg5, var14.field1181, var14.field1203, arg1, arg7);
			}
		} else if (arg3 == 0) {
			FKSXNQOK var27;
			if (var14.field1205 == -1 && var14.field1182 == null) {
				var27 = var14.method486(0, arg1, var9, var10, var11, var12, -1);
			} else {
				var27 = new HALGFRSE(0, arg1, var10, arg6, var14.field1205, var12, var11, true, var9);
			}

			arg2.method512(var27, arg4, var16, var15, arg5, 0, var13, arg7, null, field23[arg1]);

			if (arg1 == 0) {
				if (var14.field1176) {
					field22[arg4][arg7][arg5] = 50;
					field22[arg4][arg7][arg5 + 1] = 50;
				}

				if (var14.field1180) {
					field25[arg4][arg7][arg5] |= 0x249;
				}
			} else if (arg1 == 1) {
				if (var14.field1176) {
					field22[arg4][arg7][arg5 + 1] = 50;
					field22[arg4][arg7 + 1][arg5 + 1] = 50;
				}

				if (var14.field1180) {
					field25[arg4][arg7][arg5 + 1] |= 0x492;
				}
			} else if (arg1 == 2) {
				if (var14.field1176) {
					field22[arg4][arg7 + 1][arg5] = 50;
					field22[arg4][arg7 + 1][arg5 + 1] = 50;
				}

				if (var14.field1180) {
					field25[arg4][arg7 + 1][arg5] |= 0x249;
				}
			} else if (arg1 == 3) {
				if (var14.field1176) {
					field22[arg4][arg7][arg5] = 50;
					field22[arg4][arg7 + 1][arg5] = 50;
				}

				if (var14.field1180) {
					field25[arg4][arg7][arg5] |= 0x492;
				}
			}

			if (var14.field1216 && arg0 != null) {
				arg0.method345(arg3, arg1, var14.field1173, arg5, arg7);
			}

			if (var14.field1201 != 16) {
				arg2.method520(var14.field1201, arg7, arg4, arg5);
			}
		} else if (arg3 == 1) {
			FKSXNQOK var28;
			if (var14.field1205 == -1 && var14.field1182 == null) {
				var28 = var14.method486(1, arg1, var9, var10, var11, var12, -1);
			} else {
				var28 = new HALGFRSE(1, arg1, var10, arg6, var14.field1205, var12, var11, true, var9);
			}

			arg2.method512(var28, arg4, var16, var15, arg5, 0, var13, arg7, null, field21[arg1]);

			if (var14.field1176) {
				if (arg1 == 0) {
					field22[arg4][arg7][arg5 + 1] = 50;
				} else if (arg1 == 1) {
					field22[arg4][arg7 + 1][arg5 + 1] = 50;
				} else if (arg1 == 2) {
					field22[arg4][arg7 + 1][arg5] = 50;
				} else if (arg1 == 3) {
					field22[arg4][arg7][arg5] = 50;
				}
			}

			if (var14.field1216 && arg0 != null) {
				arg0.method345(arg3, arg1, var14.field1173, arg5, arg7);
			}
		} else if (arg3 == 2) {
			int var29 = arg1 + 1 & 0x3;
			FKSXNQOK var30;
			FKSXNQOK var31;
			if (var14.field1205 == -1 && var14.field1182 == null) {
				var30 = var14.method486(2, arg1 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method486(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new HALGFRSE(2, arg1 + 4, var10, arg6, var14.field1205, var12, var11, true, var9);
				var31 = new HALGFRSE(2, var29, var10, arg6, var14.field1205, var12, var11, true, var9);
			}

			arg2.method512(var30, arg4, var16, var15, arg5, field23[var29], var13, arg7, var31, field23[arg1]);

			if (var14.field1180) {
				if (arg1 == 0) {
					field25[arg4][arg7][arg5] |= 0x249;
					field25[arg4][arg7][arg5 + 1] |= 0x492;
				} else if (arg1 == 1) {
					field25[arg4][arg7][arg5 + 1] |= 0x492;
					field25[arg4][arg7 + 1][arg5] |= 0x249;
				} else if (arg1 == 2) {
					field25[arg4][arg7 + 1][arg5] |= 0x249;
					field25[arg4][arg7][arg5] |= 0x492;
				} else if (arg1 == 3) {
					field25[arg4][arg7][arg5] |= 0x492;
					field25[arg4][arg7][arg5] |= 0x249;
				}
			}

			if (var14.field1216 && arg0 != null) {
				arg0.method345(arg3, arg1, var14.field1173, arg5, arg7);
			}

			if (var14.field1201 != 16) {
				arg2.method520(var14.field1201, arg7, arg4, arg5);
			}
		} else if (arg3 == 3) {
			FKSXNQOK var32;
			if (var14.field1205 == -1 && var14.field1182 == null) {
				var32 = var14.method486(3, arg1, var9, var10, var11, var12, -1);
			} else {
				var32 = new HALGFRSE(3, arg1, var10, arg6, var14.field1205, var12, var11, true, var9);
			}

			arg2.method512(var32, arg4, var16, var15, arg5, 0, var13, arg7, null, field21[arg1]);

			if (var14.field1176) {
				if (arg1 == 0) {
					field22[arg4][arg7][arg5 + 1] = 50;
				} else if (arg1 == 1) {
					field22[arg4][arg7 + 1][arg5 + 1] = 50;
				} else if (arg1 == 2) {
					field22[arg4][arg7 + 1][arg5] = 50;
				} else if (arg1 == 3) {
					field22[arg4][arg7][arg5] = 50;
				}
			}

			if (var14.field1216 && arg0 != null) {
				arg0.method345(arg3, arg1, var14.field1173, arg5, arg7);
			}
		} else if (arg3 == 9) {
			FKSXNQOK var33;
			if (var14.field1205 == -1 && var14.field1182 == null) {
				var33 = var14.method486(arg3, arg1, var9, var10, var11, var12, -1);
			} else {
				var33 = new HALGFRSE(arg3, arg1, var10, arg6, var14.field1205, var12, var11, true, var9);
			}

			arg2.method514(arg7, 1, 0, var13, var33, 1, arg5, var16, var15, arg4);

			if (var14.field1216 && arg0 != null) {
				arg0.method346(var14.field1173, arg5, var14.field1181, var14.field1203, arg1, arg7);
			}
		} else {
			if (var14.field1188) {
				if (arg1 == 1) {
					int var34 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var9;
					var9 = var34;
				} else if (arg1 == 2) {
					int var35 = var12;
					var12 = var10;
					var10 = var35;
					int var36 = var11;
					var11 = var9;
					var9 = var36;
				} else if (arg1 == 3) {
					int var37 = var12;
					var12 = var9;
					var9 = var10;
					var10 = var11;
					var11 = var37;
				}
			}

			if (arg3 == 4) {
				FKSXNQOK var38;
				if (var14.field1205 == -1 && var14.field1182 == null) {
					var38 = var14.method486(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new HALGFRSE(4, 0, var10, arg6, var14.field1205, var12, var11, true, var9);
				}

				arg2.method513(arg5, arg1 * 512, var15, var38, 0, field23[arg1], arg4, var13, 0, var16, arg7);
			} else if (arg3 == 5) {
				int var39 = 16;
				int var40 = arg2.method530(arg4, arg7, arg5);
				if (var40 > 0) {
					var39 = SYTHBZWG.method491(var40 >> 14 & 0x7FFF).field1201;
				}

				FKSXNQOK var41;
				if (var14.field1205 == -1 && var14.field1182 == null) {
					var41 = var14.method486(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new HALGFRSE(4, 0, var10, arg6, var14.field1205, var12, var11, true, var9);
				}

				arg2.method513(arg5, arg1 * 512, var15, var41, field30[arg1] * var39, field23[arg1], arg4, var13, field20[arg1] * var39, var16, arg7);
			} else if (arg3 == 6) {
				FKSXNQOK var42;
				if (var14.field1205 == -1 && var14.field1182 == null) {
					var42 = var14.method486(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new HALGFRSE(4, 0, var10, arg6, var14.field1205, var12, var11, true, var9);
				}

				arg2.method513(arg5, arg1, var15, var42, 0, 256, arg4, var13, 0, var16, arg7);
			} else if (arg3 == 7) {
				FKSXNQOK var43;
				if (var14.field1205 == -1 && var14.field1182 == null) {
					var43 = var14.method486(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new HALGFRSE(4, 0, var10, arg6, var14.field1205, var12, var11, true, var9);
				}

				arg2.method513(arg5, arg1, var15, var43, 0, 512, arg4, var13, 0, var16, arg7);
			} else if (arg3 == 8) {
				FKSXNQOK var44;
				if (var14.field1205 == -1 && var14.field1182 == null) {
					var44 = var14.method486(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new HALGFRSE(4, 0, var10, arg6, var14.field1205, var12, var11, true, var9);
				}

				arg2.method513(arg5, arg1, var15, var44, 0, 768, arg4, var13, 0, var16, arg7);
			}
		}
	}

	@ObfuscatedName("AIYLKTEB.a(II[B[LKFLNJHKB;IIIIILUMYAUCNU;I)V")
	public final void method15(int arg0, byte[] arg1, KFLNJHKB[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, UMYAUCNU arg8, int arg9) {
		JHKSAGUC var11 = new JHKSAGUC(arg1);
		int var12 = -1;
		while (true) {
			int var13 = var11.method320();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method320();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method306();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg3 == var18 && var17 >= arg5 && var17 < arg5 + 8 && var16 >= arg9 && var16 < arg9 + 8) {
					SYTHBZWG var22 = SYTHBZWG.method491(var12);
					int var23 = arg4 + EGPGCXBS.method221(arg7, var22.field1203, var17 & 0x7, var22.field1181, var16 & 0x7);
					int var24 = arg0 + EGPGCXBS.method222(var22.field1181, var17 & 0x7, arg7, var22.field1203, var16 & 0x7);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = var18;
						if ((field24[1][var23][var24] & 0x2) == 2) {
							var25 = var18 - 1;
						}

						KFLNJHKB var26 = null;
						if (var25 >= 0) {
							var26 = arg2[var25];
						}

						method14(var26, arg7 + var21 & 0x3, arg8, var20, arg6, var24, var12, var23);
					}
				}
			}
		}
	}

	@ObfuscatedName("AIYLKTEB.a(ILUMYAUCNU;II[LKFLNJHKB;[B)V")
	public final void method16(int arg0, UMYAUCNU arg1, int arg2, KFLNJHKB[] arg3, byte[] arg4) {
		JHKSAGUC var6 = new JHKSAGUC(arg4);
		int var7 = -1;
		while (true) {
			int var8 = var6.method320();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method320();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method306();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg2 + var12;
				int var18 = arg0 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field24[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					KFLNJHKB var20 = null;
					if (var19 >= 0) {
						var20 = arg3[var19];
					}

					method14(var20, var16, arg1, var15, var13, var18, var7, var17);
				}
			}
		}
	}

	@ObfuscatedName("AIYLKTEB.a(LJHKSAGUC;IIIIIII)V")
	public final void method17(JHKSAGUC arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1 >= 0 && arg1 < 104 && arg2 >= 0 && arg2 < 104) {
			field24[arg5][arg1][arg2] = 0;
			while (true) {
				int var8 = arg0.method306();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg0.method306();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg5 == 0) {
						field12[0][arg1][arg2] = -var9 * 8;
						return;
					}

					field12[arg5][arg1][arg2] = field12[arg5 - 1][arg1][arg2] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field26[arg5][arg1][arg2] = arg0.method307();
					field13[arg5][arg1][arg2] = (byte) ((var8 - 2) / 4);
					field28[arg5][arg1][arg2] = (byte) (var8 + arg3 - 2 & 0x3);
				} else if (var8 <= 81) {
					field24[arg5][arg1][arg2] = (byte) (var8 - 49);
				} else {
					field36[arg5][arg1][arg2] = (byte) (var8 - 81);
				}
			}

			if (arg5 == 0) {
				field12[0][arg1][arg2] = -method21(arg1 + arg6 + 932731, arg2 + 556238 + arg4) * 8;
			} else {
				field12[arg5][arg1][arg2] = field12[arg5 - 1][arg1][arg2] - 240;
			}
		} else {
			while (true) {
				int var10 = arg0.method306();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg0.method306();
					return;
				}

				if (var10 <= 49) {
					arg0.method306();
				}
			}
		}
	}

	@ObfuscatedName("AIYLKTEB.c(III)I")
	public final int method18(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("AIYLKTEB.a(III[[[ILKFLNJHKB;IIIILUMYAUCNU;I)V")
	public static final void method19(int arg0, int arg1, int[][][] arg2, KFLNJHKB arg3, int arg4, int arg5, int arg6, int arg7, UMYAUCNU arg8, int arg9) {
		int var10 = arg2[arg9][arg0][arg7];
		int var11 = arg2[arg9][arg0 + 1][arg7];
		int var12 = arg2[arg9][arg0 + 1][arg7 + 1];
		int var13 = arg2[arg9][arg0][arg7 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		SYTHBZWG var15 = SYTHBZWG.method491(arg4);
		int var16 = (arg4 << 14) + (arg7 << 7) + arg0 + 0x40000000;
		if (!var15.field1198) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg5 << 6) + arg6);
		if (arg6 == 22) {
			FKSXNQOK var18;
			if (var15.field1205 == -1 && var15.field1182 == null) {
				var18 = var15.method486(22, arg5, var10, var11, var12, var13, -1);
			} else {
				var18 = new HALGFRSE(22, arg5, var11, arg4, var15.field1205, var13, var12, true, var10);
			}

			arg8.method510(var17, var18, arg0, var16, var14, arg7, arg1);

			if (var15.field1216 && var15.field1198) {
				arg3.method347(arg0, arg7);
			}
		} else if (arg6 == 10 || arg6 == 11) {
			FKSXNQOK var19;
			if (var15.field1205 == -1 && var15.field1182 == null) {
				var19 = var15.method486(10, arg5, var10, var11, var12, var13, -1);
			} else {
				var19 = new HALGFRSE(10, arg5, var11, arg4, var15.field1205, var13, var12, true, var10);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg6 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg5 == 1 || arg5 == 3) {
					var21 = var15.field1181;
					var22 = var15.field1203;
				} else {
					var21 = var15.field1203;
					var22 = var15.field1181;
				}

				arg8.method514(arg0, var22, var20, var14, var19, var21, arg7, var17, var16, arg1);
			}

			if (var15.field1216) {
				arg3.method346(var15.field1173, arg7, var15.field1181, var15.field1203, arg5, arg0);
			}
		} else if (arg6 >= 12) {
			FKSXNQOK var23;
			if (var15.field1205 == -1 && var15.field1182 == null) {
				var23 = var15.method486(arg6, arg5, var10, var11, var12, var13, -1);
			} else {
				var23 = new HALGFRSE(arg6, arg5, var11, arg4, var15.field1205, var13, var12, true, var10);
			}

			arg8.method514(arg0, 1, 0, var14, var23, 1, arg7, var17, var16, arg1);

			if (var15.field1216) {
				arg3.method346(var15.field1173, arg7, var15.field1181, var15.field1203, arg5, arg0);
			}
		} else if (arg6 == 0) {
			FKSXNQOK var24;
			if (var15.field1205 == -1 && var15.field1182 == null) {
				var24 = var15.method486(0, arg5, var10, var11, var12, var13, -1);
			} else {
				var24 = new HALGFRSE(0, arg5, var11, arg4, var15.field1205, var13, var12, true, var10);
			}

			arg8.method512(var24, arg1, var17, var16, arg7, 0, var14, arg0, null, field23[arg5]);

			if (var15.field1216) {
				arg3.method345(arg6, arg5, var15.field1173, arg7, arg0);
			}
		} else if (arg6 == 1) {
			FKSXNQOK var25;
			if (var15.field1205 == -1 && var15.field1182 == null) {
				var25 = var15.method486(1, arg5, var10, var11, var12, var13, -1);
			} else {
				var25 = new HALGFRSE(1, arg5, var11, arg4, var15.field1205, var13, var12, true, var10);
			}

			arg8.method512(var25, arg1, var17, var16, arg7, 0, var14, arg0, null, field21[arg5]);

			if (var15.field1216) {
				arg3.method345(arg6, arg5, var15.field1173, arg7, arg0);
			}
		} else if (arg6 == 2) {
			int var26 = arg5 + 1 & 0x3;
			FKSXNQOK var27;
			FKSXNQOK var28;
			if (var15.field1205 == -1 && var15.field1182 == null) {
				var27 = var15.method486(2, arg5 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method486(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new HALGFRSE(2, arg5 + 4, var11, arg4, var15.field1205, var13, var12, true, var10);
				var28 = new HALGFRSE(2, var26, var11, arg4, var15.field1205, var13, var12, true, var10);
			}

			arg8.method512(var27, arg1, var17, var16, arg7, field23[var26], var14, arg0, var28, field23[arg5]);

			if (var15.field1216) {
				arg3.method345(arg6, arg5, var15.field1173, arg7, arg0);
			}
		} else if (arg6 == 3) {
			FKSXNQOK var29;
			if (var15.field1205 == -1 && var15.field1182 == null) {
				var29 = var15.method486(3, arg5, var10, var11, var12, var13, -1);
			} else {
				var29 = new HALGFRSE(3, arg5, var11, arg4, var15.field1205, var13, var12, true, var10);
			}

			arg8.method512(var29, arg1, var17, var16, arg7, 0, var14, arg0, null, field21[arg5]);

			if (var15.field1216) {
				arg3.method345(arg6, arg5, var15.field1173, arg7, arg0);
			}
		} else if (arg6 == 9) {
			FKSXNQOK var30;
			if (var15.field1205 == -1 && var15.field1182 == null) {
				var30 = var15.method486(arg6, arg5, var10, var11, var12, var13, -1);
			} else {
				var30 = new HALGFRSE(arg6, arg5, var11, arg4, var15.field1205, var13, var12, true, var10);
			}

			arg8.method514(arg0, 1, 0, var14, var30, 1, arg7, var17, var16, arg1);

			if (var15.field1216) {
				arg3.method346(var15.field1173, arg7, var15.field1181, var15.field1203, arg5, arg0);
			}
		} else {
			if (var15.field1188) {
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

			if (arg6 == 4) {
				FKSXNQOK var35;
				if (var15.field1205 == -1 && var15.field1182 == null) {
					var35 = var15.method486(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new HALGFRSE(4, 0, var11, arg4, var15.field1205, var13, var12, true, var10);
				}

				arg8.method513(arg7, arg5 * 512, var16, var35, 0, field23[arg5], arg1, var14, 0, var17, arg0);
			} else if (arg6 == 5) {
				int var36 = 16;
				int var37 = arg8.method530(arg1, arg0, arg7);
				if (var37 > 0) {
					var36 = SYTHBZWG.method491(var37 >> 14 & 0x7FFF).field1201;
				}

				FKSXNQOK var38;
				if (var15.field1205 == -1 && var15.field1182 == null) {
					var38 = var15.method486(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new HALGFRSE(4, 0, var11, arg4, var15.field1205, var13, var12, true, var10);
				}

				arg8.method513(arg7, arg5 * 512, var16, var38, field30[arg5] * var36, field23[arg5], arg1, var14, field20[arg5] * var36, var17, arg0);
			} else if (arg6 == 6) {
				FKSXNQOK var39;
				if (var15.field1205 == -1 && var15.field1182 == null) {
					var39 = var15.method486(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new HALGFRSE(4, 0, var11, arg4, var15.field1205, var13, var12, true, var10);
				}

				arg8.method513(arg7, arg5, var16, var39, 0, 256, arg1, var14, 0, var17, arg0);
			} else if (arg6 == 7) {
				FKSXNQOK var40;
				if (var15.field1205 == -1 && var15.field1182 == null) {
					var40 = var15.method486(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new HALGFRSE(4, 0, var11, arg4, var15.field1205, var13, var12, true, var10);
				}

				arg8.method513(arg7, arg5, var16, var40, 0, 512, arg1, var14, 0, var17, arg0);
			} else if (arg6 == 8) {
				FKSXNQOK var41;
				if (var15.field1205 == -1 && var15.field1182 == null) {
					var41 = var15.method486(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new HALGFRSE(4, 0, var11, arg4, var15.field1205, var13, var12, true, var10);
				}

				arg8.method513(arg7, arg5, var16, var41, 0, 768, arg1, var14, 0, var17, arg0);
			}
		}
	}

	@ObfuscatedName("AIYLKTEB.c(II)I")
	public static final int method20(int arg0, int arg1) {
		int var2 = method23(arg0 - 1, arg1 - 1) + method23(arg0 + 1, arg1 - 1) + method23(arg0 - 1, arg1 + 1) + method23(arg0 + 1, arg1 + 1);
		int var3 = method23(arg0 - 1, arg1) + method23(arg0 + 1, arg1) + method23(arg0, arg1 - 1) + method23(arg0, arg1 + 1);
		int var4 = method23(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("AIYLKTEB.d(II)I")
	public static final int method21(int arg0, int arg1) {
		int var2 = method4(arg0 + 45365, arg1 + 91923, 4) + (method4(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method4(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("AIYLKTEB.a(ZIII)I")
	public int method22(int arg0, int arg1, int arg2) {
		if ((field24[arg0][arg1][arg2] & 0x8) != 0) {
			return 0;
		}

		if (arg0 > 0 && (field24[1][arg1][arg2] & 0x2) != 0) {
			return arg0 - 1;
		}

		return arg0;
	}

	@ObfuscatedName("AIYLKTEB.e(II)I")
	public static final int method23(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("AIYLKTEB.a(IZ[BI)Z")
	public static final boolean method24(int arg0, byte[] arg1, int arg2) {
		boolean var3 = true;
		JHKSAGUC var4 = new JHKSAGUC(arg1);
		int var5 = -1;
		while (true) {
			int var6 = var4.method320();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method320();
					if (var9 == 0) {
						break;
					}

					var4.method306();
				} else {
					int var10 = var4.method320();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method306() >> 2;
					int var14 = arg2 + var12;
					int var15 = arg0 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						SYTHBZWG var16 = SYTHBZWG.method491(var5);
						if (var13 != 22 || !field35 || var16.field1198 || var16.field1178) {
							var3 &= var16.method488();
							var8 = true;
						}
					}
				}
			}
		}
	}
}
