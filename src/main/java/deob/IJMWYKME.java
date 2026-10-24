package deob;

@ObfuscatedName("IJMWYKME")
public final class IJMWYKME {

	@ObfuscatedName("IJMWYKME.g")
	public int field679;

	@ObfuscatedName("IJMWYKME.h")
	public int field680;

	@ObfuscatedName("IJMWYKME.t")
	public int[][][] field688;

	@ObfuscatedName("IJMWYKME.c")
	public byte[][][] field676;

	@ObfuscatedName("IJMWYKME.b")
	public byte[][][] field675;

	@ObfuscatedName("IJMWYKME.G")
	public byte[][][] field697;

	@ObfuscatedName("IJMWYKME.k")
	public byte[][][] field682;

	@ObfuscatedName("IJMWYKME.a")
	public byte[][][] field674;

	@ObfuscatedName("IJMWYKME.C")
	public int[][][] field695;

	@ObfuscatedName("IJMWYKME.s")
	public byte[][][] field687;

	@ObfuscatedName("IJMWYKME.e")
	public int[][] field677;

	@ObfuscatedName("IJMWYKME.x")
	public int[] field690;

	@ObfuscatedName("IJMWYKME.y")
	public int[] field691;

	@ObfuscatedName("IJMWYKME.z")
	public int[] field692;

	@ObfuscatedName("IJMWYKME.A")
	public int[] field693;

	@ObfuscatedName("IJMWYKME.B")
	public int[] field694;

	@ObfuscatedName("IJMWYKME.f")
	public static int field678 = 99;

	@ObfuscatedName("IJMWYKME.j")
	public static final int[] field681 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("IJMWYKME.n")
	public static final int[] field683 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("IJMWYKME.q")
	public static boolean field686 = true;

	@ObfuscatedName("IJMWYKME.v")
	public static final int[] field689 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("IJMWYKME.D")
	public static final int[] field696 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("IJMWYKME.o")
	public static int field684 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("IJMWYKME.p")
	public static int field685 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("IJMWYKME.I")
	public static int field698;

	@ObfuscatedName("IJMWYKME.a(BIIII)V")
	public final void method256(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg2; var5 <= arg1 + arg2; var5++) {
			for (int var6 = arg0; var6 <= arg0 + arg3; var6++) {
				if (var6 >= 0 && var6 < field679 && var5 >= 0 && var5 < field680) {
					field687[0][var6][var5] = 127;

					if (arg0 == var6 && var6 > 0) {
						field688[0][var6][var5] = field688[0][var6 - 1][var5];
					}

					if (arg0 + arg3 == var6 && var6 < field679 - 1) {
						field688[0][var6][var5] = field688[0][var6 + 1][var5];
					}

					if (arg2 == var5 && var5 > 0) {
						field688[0][var6][var5] = field688[0][var6][var5 - 1];
					}

					if (arg1 + arg2 == var5 && var5 < field680 - 1) {
						field688[0][var6][var5] = field688[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("IJMWYKME.a(II)I")
	public static final int method257(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("IJMWYKME.a(II[B[LCGGBZSOS;IIIIII)V")
	public final void method258(int arg0, int arg1, byte[] arg2, CGGBZSOS[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg4 + var10 > 0 && arg4 + var10 < 103 && arg1 + var11 > 0 && arg1 + var11 < 103) {
					arg3[arg8].field86[arg4 + var10][arg1 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		UAWAYCTK var12 = new UAWAYCTK(arg2);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg5 == var13 && var14 >= arg7 && var14 < arg7 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
						method268(arg4 + GNGTCMOJ.method210(var15 & 0x7, arg0, var14 & 0x7), arg0, 0, 0, arg1 + GNGTCMOJ.method211(var15 & 0x7, var14 & 0x7, arg0), var12, arg8);
					} else {
						method268(-1, 0, 0, 0, -1, var12, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("IJMWYKME.a(IIZ)Z")
	public static final boolean method259(int arg0, int arg1) {
		BQKZHFKO var2 = BQKZHFKO.method24(arg1);

		if (arg0 == 11) {
			arg0 = 10;
		}

		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}

		return var2.method19(arg0);
	}

	@ObfuscatedName("IJMWYKME.a(I[LCGGBZSOS;LOBOSMEDX;)V")
	public final void method260(CGGBZSOS[] arg0, OBOSMEDX arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field676[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field676[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg0[var6].method28(var4, var5);
						}
					}
				}
			}
		}

		field685 += (int) (Math.random() * 5.0D) - 2;
		if (field685 < -8) {
			field685 = -8;
		}

		if (field685 > 8) {
			field685 = 8;
		}

		field684 += (int) (Math.random() * 5.0D) - 2;
		if (field684 < -16) {
			field684 = -16;
		}

		if (field684 > 16) {
			field684 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field687[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field680 - 1; var16++) {
				for (int var17 = 1; var17 < field679 - 1; var17++) {
					int var18 = field688[var7][var17 + 1][var16] - field688[var7][var17 - 1][var16];
					int var19 = field688[var7][var17][var16 + 1] - field688[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field677[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field680; var26++) {
				field690[var26] = 0;
				field691[var26] = 0;
				field692[var26] = 0;
				field693[var26] = 0;
				field694[var26] = 0;
			}

			for (int var27 = -5; var27 < field679 + 5; var27++) {
				for (int var28 = 0; var28 < field680; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field679) {
						int var30 = field675[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							ECJPTPHH var31 = ECJPTPHH.field567[var30 - 1];
							field690[var28] += var31.field576;
							field691[var28] += var31.field574;
							field692[var28] += var31.field575;
							field693[var28] += var31.field577;
							field694[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field679) {
						int var33 = field675[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							ECJPTPHH var34 = ECJPTPHH.field567[var33 - 1];
							field690[var28] -= var34.field576;
							field691[var28] -= var34.field574;
							field692[var28] -= var34.field575;
							field693[var28] -= var34.field577;
							field694[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field679 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field680 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field680) {
							var35 += field690[var41];
							var36 += field691[var41];
							var37 += field692[var41];
							var38 += field693[var41];
							var39 += field694[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field680) {
							var35 -= field690[var42];
							var36 -= field691[var42];
							var37 -= field692[var42];
							var38 -= field693[var42];
							var39 -= field694[var42];
						}

						if (var40 >= 1 && var40 < field680 - 1 && (!field686 || (field676[0][var27][var40] & 0x2) != 0 || (field676[var7][var27][var40] & 0x10) == 0 && method272(var40, var7, var27) == field698)) {
							if (var7 < field678) {
								field678 = var7;
							}

							int var43 = field675[var7][var27][var40] & 0xFF;
							int var44 = field697[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field688[var7][var27][var40];
								int var46 = field688[var7][var27 + 1][var40];
								int var47 = field688[var7][var27 + 1][var40 + 1];
								int var48 = field688[var7][var27][var40 + 1];
								int var49 = field677[var27][var40];
								int var50 = field677[var27 + 1][var40];
								int var51 = field677[var27 + 1][var40 + 1];
								int var52 = field677[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method266(var55, var56, var57);
									var55 = field685 + var55 & 0xFF;
									var57 += field684;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method266(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field682[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !ECJPTPHH.field567[var44 - 1].field572) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field695[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = JXPUZKMY.field772[method269(var54, 96)];
								}

								if (var44 == 0) {
									arg1.method347(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method269(var53, var49), method269(var53, var50), method269(var53, var51), method269(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field682[var7][var27][var40] + 1;
									byte var61 = field674[var7][var27][var40];
									ECJPTPHH var62 = ECJPTPHH.field567[var44 - 1];
									int var63 = var62.field570;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = JXPUZKMY.method294(var63);
										var65 = -1;
									} else if (var62.field569 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method266(var62.field573, var62.field574, var62.field575);
										var64 = JXPUZKMY.field772[method262(var62.field578, 96)];
									}

									arg1.method347(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method269(var53, var49), method269(var53, var50), method269(var53, var51), method269(var53, var52), method262(var65, var49), method262(var65, var50), method262(var65, var51), method262(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field680 - 1; var66++) {
				for (int var67 = 1; var67 < field679 - 1; var67++) {
					arg1.method346(var7, var67, var66, method272(var66, var7, var67));
				}
			}
		}

		arg1.method373(64, -50, -10, -50, 768);

		for (int var68 = 0; var68 < field679; var68++) {
			for (int var69 = 0; var69 < field680; var69++) {
				if ((field676[1][var68][var69] & 0x2) == 2) {
					arg1.method344(var68, var69);
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
				for (int var75 = 0; var75 <= field680; var75++) {
					for (int var76 = 0; var76 <= field679; var76++) {
						if ((field695[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field695[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field680 && (field695[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field695[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field695[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field688[var80][var76][var77] - var84;
								int var86 = field688[var79][var76][var77];
								OBOSMEDX.method345(var73, var78 * 128 + 128, var76 * 128, var85, var77 * 128, var86, var76 * 128, 1);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field695[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field695[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field695[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field679 && (field695[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field695[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field695[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field688[var92][var89][var75] - var96;
								int var98 = field688[var91][var89][var75];
								OBOSMEDX.method345(var73, var75 * 128, var90 * 128 + 128, var97, var75 * 128, var98, var89 * 128, 2);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field695[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field695[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field695[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field680 && (field695[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field695[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field679) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field695[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field688[var74][var101][var103];
								OBOSMEDX.method345(var73, var104 * 128 + 128, var102 * 128 + 128, var107, var103 * 128, var107, var101 * 128, 4);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field695[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public IJMWYKME(int arg0, int arg1, int[][][] arg2, byte[][][] arg3) {
		field678 = 99;
		field679 = arg1;
		field680 = arg0;
		field688 = arg2;
		field676 = arg3;
		field675 = new byte[4][field679][field680];
		field697 = new byte[4][field679][field680];
		field682 = new byte[4][field679][field680];
		field674 = new byte[4][field679][field680];
		field695 = new int[4][field679 + 1][field680 + 1];
		field687 = new byte[4][field679 + 1][field680 + 1];
		field677 = new int[field679 + 1][field680 + 1];
		field690 = new int[field680];
		field691 = new int[field680];
		field692 = new int[field680];
		field693 = new int[field680];
		field694 = new int[field680];
	}

	@ObfuscatedName("IJMWYKME.b(II)I")
	public static final int method261(int arg0, int arg1) {
		int var2 = method257(arg0 - 1, arg1 - 1) + method257(arg0 + 1, arg1 - 1) + method257(arg0 - 1, arg1 + 1) + method257(arg0 + 1, arg1 + 1);
		int var3 = method257(arg0 - 1, arg1) + method257(arg0 + 1, arg1) + method257(arg0, arg1 - 1) + method257(arg0, arg1 + 1);
		int var4 = method257(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("IJMWYKME.c(II)I")
	public final int method262(int arg0, int arg1) {
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

	@ObfuscatedName("IJMWYKME.a(IIILCGGBZSOS;ILOBOSMEDX;III)V")
	public final void method263(int arg0, int arg1, CGGBZSOS arg2, int arg3, OBOSMEDX arg4, int arg5, int arg6, int arg7) {
		if (field686 && (field676[0][arg0][arg6] & 0x2) == 0) {
			if ((field676[arg7][arg0][arg6] & 0x10) != 0) {
				return;
			}

			if (method272(arg6, arg7, arg0) != field698) {
				return;
			}
		}

		if (arg7 < field678) {
			field678 = arg7;
		}

		int var9 = field688[arg7][arg0][arg6];
		int var10 = field688[arg7][arg0 + 1][arg6];
		int var11 = field688[arg7][arg0 + 1][arg6 + 1];
		int var12 = field688[arg7][arg0][arg6 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		BQKZHFKO var14 = BQKZHFKO.method24(arg3);
		int var15 = (arg3 << 14) + (arg6 << 7) + arg0 + 0x40000000;
		if (!var14.field36) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg5 << 6) + arg1);
		if (arg1 == 22) {
			if (!field686 || var14.field36 || var14.field42) {
				MQTIFFLX var17;
				if (var14.field54 == -1 && var14.field37 == null) {
					var17 = var14.method20(22, arg5, var9, var10, var11, var12, -1);
				} else {
					var17 = new JBYEFPCA(var10, var14.field54, var12, arg3, var11, 22, arg5, var9, true);
				}

				arg4.method348(arg6, var17, var15, var16, var13, arg7, arg0);

				if (var14.field71 && var14.field36 && arg2 != null) {
					arg2.method28(arg0, arg6);
				}
			}
		} else if (arg1 == 10 || arg1 == 11) {
			MQTIFFLX var18;
			if (var14.field54 == -1 && var14.field37 == null) {
				var18 = var14.method20(10, arg5, var9, var10, var11, var12, -1);
			} else {
				var18 = new JBYEFPCA(var10, var14.field54, var12, arg3, var11, 10, arg5, var9, true);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg1 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg5 == 1 || arg5 == 3) {
					var20 = var14.field53;
					var21 = var14.field65;
				} else {
					var20 = var14.field65;
					var21 = var14.field53;
				}

				if (arg4.method352(var18, var15, var16, var19, arg0, arg7, var20, arg6, var21, var13) && var14.field80) {
					WEVRTBOZ var22;
					if (var18 instanceof WEVRTBOZ) {
						var22 = (WEVRTBOZ) var18;
					} else {
						var22 = var14.method20(10, arg5, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field1387 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field687[arg7][arg0 + var23][arg6 + var24]) {
									field687[arg7][arg0 + var23][arg6 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field71 && arg2 != null) {
				arg2.method27(arg6, arg5, var14.field53, var14.field45, var14.field65, arg0);
			}
		} else if (arg1 >= 12) {
			MQTIFFLX var26;
			if (var14.field54 == -1 && var14.field37 == null) {
				var26 = var14.method20(arg1, arg5, var9, var10, var11, var12, -1);
			} else {
				var26 = new JBYEFPCA(var10, var14.field54, var12, arg3, var11, arg1, arg5, var9, true);
			}

			arg4.method352(var26, var15, var16, 0, arg0, arg7, 1, arg6, 1, var13);

			if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg7 > 0) {
				field695[arg7][arg0][arg6] |= 0x924;
			}

			if (var14.field71 && arg2 != null) {
				arg2.method27(arg6, arg5, var14.field53, var14.field45, var14.field65, arg0);
			}
		} else if (arg1 == 0) {
			MQTIFFLX var27;
			if (var14.field54 == -1 && var14.field37 == null) {
				var27 = var14.method20(0, arg5, var9, var10, var11, var12, -1);
			} else {
				var27 = new JBYEFPCA(var10, var14.field54, var12, arg3, var11, 0, arg5, var9, true);
			}

			arg4.method350(var16, var27, var13, arg7, arg6, null, arg0, 0, var15, field689[arg5]);

			if (arg5 == 0) {
				if (var14.field80) {
					field687[arg7][arg0][arg6] = 50;
					field687[arg7][arg0][arg6 + 1] = 50;
				}

				if (var14.field35) {
					field695[arg7][arg0][arg6] |= 0x249;
				}
			} else if (arg5 == 1) {
				if (var14.field80) {
					field687[arg7][arg0][arg6 + 1] = 50;
					field687[arg7][arg0 + 1][arg6 + 1] = 50;
				}

				if (var14.field35) {
					field695[arg7][arg0][arg6 + 1] |= 0x492;
				}
			} else if (arg5 == 2) {
				if (var14.field80) {
					field687[arg7][arg0 + 1][arg6] = 50;
					field687[arg7][arg0 + 1][arg6 + 1] = 50;
				}

				if (var14.field35) {
					field695[arg7][arg0 + 1][arg6] |= 0x249;
				}
			} else if (arg5 == 3) {
				if (var14.field80) {
					field687[arg7][arg0][arg6] = 50;
					field687[arg7][arg0 + 1][arg6] = 50;
				}

				if (var14.field35) {
					field695[arg7][arg0][arg6] |= 0x492;
				}
			}

			if (var14.field71 && arg2 != null) {
				arg2.method26(arg6, arg1, var14.field45, arg0, arg5);
			}

			if (var14.field67 != 16) {
				arg4.method358(arg6, arg7, arg0, var14.field67);
			}
		} else if (arg1 == 1) {
			MQTIFFLX var28;
			if (var14.field54 == -1 && var14.field37 == null) {
				var28 = var14.method20(1, arg5, var9, var10, var11, var12, -1);
			} else {
				var28 = new JBYEFPCA(var10, var14.field54, var12, arg3, var11, 1, arg5, var9, true);
			}

			arg4.method350(var16, var28, var13, arg7, arg6, null, arg0, 0, var15, field683[arg5]);

			if (var14.field80) {
				if (arg5 == 0) {
					field687[arg7][arg0][arg6 + 1] = 50;
				} else if (arg5 == 1) {
					field687[arg7][arg0 + 1][arg6 + 1] = 50;
				} else if (arg5 == 2) {
					field687[arg7][arg0 + 1][arg6] = 50;
				} else if (arg5 == 3) {
					field687[arg7][arg0][arg6] = 50;
				}
			}

			if (var14.field71 && arg2 != null) {
				arg2.method26(arg6, arg1, var14.field45, arg0, arg5);
			}
		} else if (arg1 == 2) {
			int var29 = arg5 + 1 & 0x3;
			MQTIFFLX var30;
			MQTIFFLX var31;
			if (var14.field54 == -1 && var14.field37 == null) {
				var30 = var14.method20(2, arg5 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method20(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new JBYEFPCA(var10, var14.field54, var12, arg3, var11, 2, arg5 + 4, var9, true);
				var31 = new JBYEFPCA(var10, var14.field54, var12, arg3, var11, 2, var29, var9, true);
			}

			arg4.method350(var16, var30, var13, arg7, arg6, var31, arg0, field689[var29], var15, field689[arg5]);

			if (var14.field35) {
				if (arg5 == 0) {
					field695[arg7][arg0][arg6] |= 0x249;
					field695[arg7][arg0][arg6 + 1] |= 0x492;
				} else if (arg5 == 1) {
					field695[arg7][arg0][arg6 + 1] |= 0x492;
					field695[arg7][arg0 + 1][arg6] |= 0x249;
				} else if (arg5 == 2) {
					field695[arg7][arg0 + 1][arg6] |= 0x249;
					field695[arg7][arg0][arg6] |= 0x492;
				} else if (arg5 == 3) {
					field695[arg7][arg0][arg6] |= 0x492;
					field695[arg7][arg0][arg6] |= 0x249;
				}
			}

			if (var14.field71 && arg2 != null) {
				arg2.method26(arg6, arg1, var14.field45, arg0, arg5);
			}

			if (var14.field67 != 16) {
				arg4.method358(arg6, arg7, arg0, var14.field67);
			}
		} else if (arg1 == 3) {
			MQTIFFLX var32;
			if (var14.field54 == -1 && var14.field37 == null) {
				var32 = var14.method20(3, arg5, var9, var10, var11, var12, -1);
			} else {
				var32 = new JBYEFPCA(var10, var14.field54, var12, arg3, var11, 3, arg5, var9, true);
			}

			arg4.method350(var16, var32, var13, arg7, arg6, null, arg0, 0, var15, field683[arg5]);

			if (var14.field80) {
				if (arg5 == 0) {
					field687[arg7][arg0][arg6 + 1] = 50;
				} else if (arg5 == 1) {
					field687[arg7][arg0 + 1][arg6 + 1] = 50;
				} else if (arg5 == 2) {
					field687[arg7][arg0 + 1][arg6] = 50;
				} else if (arg5 == 3) {
					field687[arg7][arg0][arg6] = 50;
				}
			}

			if (var14.field71 && arg2 != null) {
				arg2.method26(arg6, arg1, var14.field45, arg0, arg5);
			}
		} else if (arg1 == 9) {
			MQTIFFLX var33;
			if (var14.field54 == -1 && var14.field37 == null) {
				var33 = var14.method20(arg1, arg5, var9, var10, var11, var12, -1);
			} else {
				var33 = new JBYEFPCA(var10, var14.field54, var12, arg3, var11, arg1, arg5, var9, true);
			}

			arg4.method352(var33, var15, var16, 0, arg0, arg7, 1, arg6, 1, var13);

			if (var14.field71 && arg2 != null) {
				arg2.method27(arg6, arg5, var14.field53, var14.field45, var14.field65, arg0);
			}
		} else {
			if (var14.field38) {
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
				MQTIFFLX var38;
				if (var14.field54 == -1 && var14.field37 == null) {
					var38 = var14.method20(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new JBYEFPCA(var10, var14.field54, var12, arg3, var11, 4, 0, var9, true);
				}

				arg4.method351(0, arg5 * 512, var38, var13, 0, field689[arg5], arg6, arg0, arg7, var16, var15);
			} else if (arg1 == 5) {
				int var39 = 16;
				int var40 = arg4.method368(arg7, arg0, arg6);
				if (var40 > 0) {
					var39 = BQKZHFKO.method24(var40 >> 14 & 0x7FFF).field67;
				}

				MQTIFFLX var41;
				if (var14.field54 == -1 && var14.field37 == null) {
					var41 = var14.method20(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new JBYEFPCA(var10, var14.field54, var12, arg3, var11, 4, 0, var9, true);
				}

				arg4.method351(field696[arg5] * var39, arg5 * 512, var41, var13, field681[arg5] * var39, field689[arg5], arg6, arg0, arg7, var16, var15);
			} else if (arg1 == 6) {
				MQTIFFLX var42;
				if (var14.field54 == -1 && var14.field37 == null) {
					var42 = var14.method20(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new JBYEFPCA(var10, var14.field54, var12, arg3, var11, 4, 0, var9, true);
				}

				arg4.method351(0, arg5, var42, var13, 0, 256, arg6, arg0, arg7, var16, var15);
			} else if (arg1 == 7) {
				MQTIFFLX var43;
				if (var14.field54 == -1 && var14.field37 == null) {
					var43 = var14.method20(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new JBYEFPCA(var10, var14.field54, var12, arg3, var11, 4, 0, var9, true);
				}

				arg4.method351(0, arg5, var43, var13, 0, 512, arg6, arg0, arg7, var16, var15);
			} else if (arg1 == 8) {
				MQTIFFLX var44;
				if (var14.field54 == -1 && var14.field37 == null) {
					var44 = var14.method20(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new JBYEFPCA(var10, var14.field54, var12, arg3, var11, 4, 0, var9, true);
				}

				arg4.method351(0, arg5, var44, var13, 0, 768, arg6, arg0, arg7, var16, var15);
			}
		}
	}

	@ObfuscatedName("IJMWYKME.a(ZI[B[LCGGBZSOS;LOBOSMEDX;I)V")
	public final void method264(int arg0, byte[] arg1, CGGBZSOS[] arg2, OBOSMEDX arg3, int arg4) {
		UAWAYCTK var6 = new UAWAYCTK(arg1);
		int var7 = -1;
		while (true) {
			int var8 = var6.method469();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method469();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method455();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg4 + var12;
				int var18 = arg0 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field676[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					CGGBZSOS var20 = null;
					if (var19 >= 0) {
						var20 = arg2[var19];
					}

					method263(var17, var15, var20, var7, arg3, var16, var18, var13);
				}
			}
		}
	}

	@ObfuscatedName("IJMWYKME.a(LELICEBAH;ILUAWAYCTK;)V")
	public static final void method265(ELICEBAH arg0, UAWAYCTK arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg1.method469();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			BQKZHFKO var4 = BQKZHFKO.method24(var2);
			var4.method22(arg0);

			while (true) {
				int var5 = arg1.method469();
				if (var5 == 0) {
					break;
				}

				arg1.method455();
			}
		}
	}

	@ObfuscatedName("IJMWYKME.a(III)I")
	public final int method266(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("IJMWYKME.a(IIII)I")
	public static final int method267(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - JXPUZKMY.field761[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("IJMWYKME.a(IIIIIILUAWAYCTK;I)V")
	public final void method268(int arg0, int arg1, int arg2, int arg3, int arg4, UAWAYCTK arg5, int arg6) {
		if (arg0 >= 0 && arg0 < 104 && arg4 >= 0 && arg4 < 104) {
			field676[arg6][arg0][arg4] = 0;
			while (true) {
				int var8 = arg5.method455();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg5.method455();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg6 == 0) {
						field688[0][arg0][arg4] = -var9 * 8;
						return;
					}

					field688[arg6][arg0][arg4] = field688[arg6 - 1][arg0][arg4] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field697[arg6][arg0][arg4] = arg5.method456();
					field682[arg6][arg0][arg4] = (byte) ((var8 - 2) / 4);
					field674[arg6][arg0][arg4] = (byte) (var8 + arg1 - 2 & 0x3);
				} else if (var8 <= 81) {
					field676[arg6][arg0][arg4] = (byte) (var8 - 49);
				} else {
					field675[arg6][arg0][arg4] = (byte) (var8 - 81);
				}
			}

			if (arg6 == 0) {
				field688[0][arg0][arg4] = -method271(arg0 + arg2 + 932731, arg4 + 556238 + arg3) * 8;
			} else {
				field688[arg6][arg0][arg4] = field688[arg6 - 1][arg0][arg4] - 240;
			}
		} else {
			while (true) {
				int var10 = arg5.method455();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg5.method455();
					return;
				}

				if (var10 <= 49) {
					arg5.method455();
				}
			}
		}
	}

	@ObfuscatedName("IJMWYKME.d(II)I")
	public static final int method269(int arg0, int arg1) {
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

	@ObfuscatedName("IJMWYKME.a(IB[BI)Z")
	public static final boolean method270(int arg0, byte[] arg1, int arg2) {
		boolean var3 = true;
		UAWAYCTK var4 = new UAWAYCTK(arg1);
		int var5 = -1;
		while (true) {
			int var6 = var4.method469();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method469();
					if (var9 == 0) {
						break;
					}

					var4.method455();
				} else {
					int var10 = var4.method469();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method455() >> 2;
					int var14 = arg0 + var12;
					int var15 = arg2 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						BQKZHFKO var16 = BQKZHFKO.method24(var5);
						if (var13 != 22 || !field686 || var16.field36 || var16.field42) {
							var3 &= var16.method16();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("IJMWYKME.e(II)I")
	public static final int method271(int arg0, int arg1) {
		int var2 = method275(arg0 + 45365, arg1 + 91923, 4) + (method275(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method275(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("IJMWYKME.b(IIII)I")
	public int method272(int arg0, int arg1, int arg2) {
		if ((field676[arg1][arg2][arg0] & 0x8) != 0) {
			return 0;
		}

		if (arg1 > 0 && (field676[1][arg2][arg0] & 0x2) != 0) {
			return arg1 - 1;
		}

		return arg1;
	}

	@ObfuscatedName("IJMWYKME.a(III[BIILOBOSMEDX;IBI[LCGGBZSOS;)V")
	public final void method273(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, OBOSMEDX arg6, int arg7, int arg8, CGGBZSOS[] arg9) {
		UAWAYCTK var11 = new UAWAYCTK(arg3);
		int var12 = -1;
		while (true) {
			int var13 = var11.method469();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method469();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method455();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg8 == var18 && var17 >= arg0 && var17 < arg0 + 8 && var16 >= arg7 && var16 < arg7 + 8) {
					BQKZHFKO var22 = BQKZHFKO.method24(var12);
					int var23 = arg1 + GNGTCMOJ.method212(var22.field65, var21, var22.field53, arg4, var17 & 0x7, var16 & 0x7);
					int var24 = arg2 + GNGTCMOJ.method213(var21, var22.field53, arg4, var17 & 0x7, var16 & 0x7, var22.field65);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg5;
						if ((field676[1][var23][var24] & 0x2) == 2) {
							var25 = arg5 - 1;
						}

						CGGBZSOS var26 = null;
						if (var25 >= 0) {
							var26 = arg9[var25];
						}

						method263(var23, var20, var26, var12, arg6, arg4 + var21 & 0x3, var24, arg5);
					}
				}
			}
		}
	}

	@ObfuscatedName("IJMWYKME.a(IIIIILOBOSMEDX;ILCGGBZSOS;I[[[II)V")
	public static final void method274(int arg0, int arg1, int arg2, int arg3, OBOSMEDX arg4, int arg5, CGGBZSOS arg6, int arg7, int[][][] arg8, int arg9) {
		int var10 = arg8[arg5][arg1][arg9];
		int var11 = arg8[arg5][arg1 + 1][arg9];
		int var12 = arg8[arg5][arg1 + 1][arg9 + 1];
		int var13 = arg8[arg5][arg1][arg9 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		BQKZHFKO var15 = BQKZHFKO.method24(arg0);
		int var16 = (arg0 << 14) + (arg9 << 7) + arg1 + 0x40000000;
		if (!var15.field36) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg2 << 6) + arg3);
		if (arg3 == 22) {
			MQTIFFLX var18;
			if (var15.field54 == -1 && var15.field37 == null) {
				var18 = var15.method20(22, arg2, var10, var11, var12, var13, -1);
			} else {
				var18 = new JBYEFPCA(var11, var15.field54, var13, arg0, var12, 22, arg2, var10, true);
			}

			arg4.method348(arg9, var18, var16, var17, var14, arg7, arg1);

			if (var15.field71 && var15.field36) {
				arg6.method28(arg1, arg9);
			}
		} else if (arg3 == 10 || arg3 == 11) {
			MQTIFFLX var19;
			if (var15.field54 == -1 && var15.field37 == null) {
				var19 = var15.method20(10, arg2, var10, var11, var12, var13, -1);
			} else {
				var19 = new JBYEFPCA(var11, var15.field54, var13, arg0, var12, 10, arg2, var10, true);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg3 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg2 == 1 || arg2 == 3) {
					var21 = var15.field53;
					var22 = var15.field65;
				} else {
					var21 = var15.field65;
					var22 = var15.field53;
				}

				arg4.method352(var19, var16, var17, var20, arg1, arg7, var21, arg9, var22, var14);
			}

			if (var15.field71) {
				arg6.method27(arg9, arg2, var15.field53, var15.field45, var15.field65, arg1);
			}
		} else if (arg3 >= 12) {
			MQTIFFLX var23;
			if (var15.field54 == -1 && var15.field37 == null) {
				var23 = var15.method20(arg3, arg2, var10, var11, var12, var13, -1);
			} else {
				var23 = new JBYEFPCA(var11, var15.field54, var13, arg0, var12, arg3, arg2, var10, true);
			}

			arg4.method352(var23, var16, var17, 0, arg1, arg7, 1, arg9, 1, var14);

			if (var15.field71) {
				arg6.method27(arg9, arg2, var15.field53, var15.field45, var15.field65, arg1);
			}
		} else if (arg3 == 0) {
			MQTIFFLX var24;
			if (var15.field54 == -1 && var15.field37 == null) {
				var24 = var15.method20(0, arg2, var10, var11, var12, var13, -1);
			} else {
				var24 = new JBYEFPCA(var11, var15.field54, var13, arg0, var12, 0, arg2, var10, true);
			}

			arg4.method350(var17, var24, var14, arg7, arg9, null, arg1, 0, var16, field689[arg2]);

			if (var15.field71) {
				arg6.method26(arg9, arg3, var15.field45, arg1, arg2);
			}
		} else if (arg3 == 1) {
			MQTIFFLX var25;
			if (var15.field54 == -1 && var15.field37 == null) {
				var25 = var15.method20(1, arg2, var10, var11, var12, var13, -1);
			} else {
				var25 = new JBYEFPCA(var11, var15.field54, var13, arg0, var12, 1, arg2, var10, true);
			}

			arg4.method350(var17, var25, var14, arg7, arg9, null, arg1, 0, var16, field683[arg2]);

			if (var15.field71) {
				arg6.method26(arg9, arg3, var15.field45, arg1, arg2);
			}
		} else if (arg3 == 2) {
			int var26 = arg2 + 1 & 0x3;
			MQTIFFLX var27;
			MQTIFFLX var28;
			if (var15.field54 == -1 && var15.field37 == null) {
				var27 = var15.method20(2, arg2 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method20(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new JBYEFPCA(var11, var15.field54, var13, arg0, var12, 2, arg2 + 4, var10, true);
				var28 = new JBYEFPCA(var11, var15.field54, var13, arg0, var12, 2, var26, var10, true);
			}

			arg4.method350(var17, var27, var14, arg7, arg9, var28, arg1, field689[var26], var16, field689[arg2]);

			if (var15.field71) {
				arg6.method26(arg9, arg3, var15.field45, arg1, arg2);
			}
		} else if (arg3 == 3) {
			MQTIFFLX var29;
			if (var15.field54 == -1 && var15.field37 == null) {
				var29 = var15.method20(3, arg2, var10, var11, var12, var13, -1);
			} else {
				var29 = new JBYEFPCA(var11, var15.field54, var13, arg0, var12, 3, arg2, var10, true);
			}

			arg4.method350(var17, var29, var14, arg7, arg9, null, arg1, 0, var16, field683[arg2]);

			if (var15.field71) {
				arg6.method26(arg9, arg3, var15.field45, arg1, arg2);
			}
		} else if (arg3 == 9) {
			MQTIFFLX var30;
			if (var15.field54 == -1 && var15.field37 == null) {
				var30 = var15.method20(arg3, arg2, var10, var11, var12, var13, -1);
			} else {
				var30 = new JBYEFPCA(var11, var15.field54, var13, arg0, var12, arg3, arg2, var10, true);
			}

			arg4.method352(var30, var16, var17, 0, arg1, arg7, 1, arg9, 1, var14);

			if (var15.field71) {
				arg6.method27(arg9, arg2, var15.field53, var15.field45, var15.field65, arg1);
			}
		} else {
			if (var15.field38) {
				if (arg2 == 1) {
					int var31 = var13;
					var13 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var31;
				} else if (arg2 == 2) {
					int var32 = var13;
					var13 = var11;
					var11 = var32;
					int var33 = var12;
					var12 = var10;
					var10 = var33;
				} else if (arg2 == 3) {
					int var34 = var13;
					var13 = var10;
					var10 = var11;
					var11 = var12;
					var12 = var34;
				}
			}

			if (arg3 == 4) {
				MQTIFFLX var35;
				if (var15.field54 == -1 && var15.field37 == null) {
					var35 = var15.method20(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new JBYEFPCA(var11, var15.field54, var13, arg0, var12, 4, 0, var10, true);
				}

				arg4.method351(0, arg2 * 512, var35, var14, 0, field689[arg2], arg9, arg1, arg7, var17, var16);
			} else if (arg3 == 5) {
				int var36 = 16;
				int var37 = arg4.method368(arg7, arg1, arg9);
				if (var37 > 0) {
					var36 = BQKZHFKO.method24(var37 >> 14 & 0x7FFF).field67;
				}

				MQTIFFLX var38;
				if (var15.field54 == -1 && var15.field37 == null) {
					var38 = var15.method20(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new JBYEFPCA(var11, var15.field54, var13, arg0, var12, 4, 0, var10, true);
				}

				arg4.method351(field696[arg2] * var36, arg2 * 512, var38, var14, field681[arg2] * var36, field689[arg2], arg9, arg1, arg7, var17, var16);
			} else if (arg3 == 6) {
				MQTIFFLX var39;
				if (var15.field54 == -1 && var15.field37 == null) {
					var39 = var15.method20(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new JBYEFPCA(var11, var15.field54, var13, arg0, var12, 4, 0, var10, true);
				}

				arg4.method351(0, arg2, var39, var14, 0, 256, arg9, arg1, arg7, var17, var16);
			} else if (arg3 == 7) {
				MQTIFFLX var40;
				if (var15.field54 == -1 && var15.field37 == null) {
					var40 = var15.method20(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new JBYEFPCA(var11, var15.field54, var13, arg0, var12, 4, 0, var10, true);
				}

				arg4.method351(0, arg2, var40, var14, 0, 512, arg9, arg1, arg7, var17, var16);
			} else if (arg3 == 8) {
				MQTIFFLX var41;
				if (var15.field54 == -1 && var15.field37 == null) {
					var41 = var15.method20(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new JBYEFPCA(var11, var15.field54, var13, arg0, var12, 4, 0, var10, true);
				}

				arg4.method351(0, arg2, var41, var14, 0, 768, arg9, arg1, arg7, var17, var16);
			}
		}
	}

	@ObfuscatedName("IJMWYKME.b(III)I")
	public static final int method275(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method261(var3, var5);
		int var8 = method261(var3 + 1, var5);
		int var9 = method261(var3, var5 + 1);
		int var10 = method261(var3 + 1, var5 + 1);
		int var11 = method267(var7, var8, var4, arg2);
		int var12 = method267(var9, var10, var4, arg2);
		return method267(var11, var12, var6, arg2);
	}

	@ObfuscatedName("IJMWYKME.a(IIII[LCGGBZSOS;[BI)V")
	public final void method276(int arg0, int arg1, int arg2, CGGBZSOS[] arg3, byte[] arg4, int arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg0 + var8 > 0 && arg0 + var8 < 103 && arg5 + var9 > 0 && arg5 + var9 < 103) {
						arg3[var7].field86[arg0 + var8][arg5 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		UAWAYCTK var10 = new UAWAYCTK(arg4);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method268(arg0 + var12, 0, arg2, arg1, arg5 + var13, var10, var11);
				}
			}
		}
	}
}
