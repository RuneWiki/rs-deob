package deob;

@ObfuscatedName("SBZYTIRX")
public final class SBZYTIRX {

	@ObfuscatedName("SBZYTIRX.k")
	public int field1336;

	@ObfuscatedName("SBZYTIRX.l")
	public int field1337;

	@ObfuscatedName("SBZYTIRX.i")
	public int[][][] field1334;

	@ObfuscatedName("SBZYTIRX.w")
	public byte[][][] field1346;

	@ObfuscatedName("SBZYTIRX.a")
	public byte[][][] field1327;

	@ObfuscatedName("SBZYTIRX.b")
	public byte[][][] field1328;

	@ObfuscatedName("SBZYTIRX.g")
	public byte[][][] field1332;

	@ObfuscatedName("SBZYTIRX.h")
	public byte[][][] field1333;

	@ObfuscatedName("SBZYTIRX.d")
	public int[][][] field1330;

	@ObfuscatedName("SBZYTIRX.y")
	public byte[][][] field1348;

	@ObfuscatedName("SBZYTIRX.c")
	public int[][] field1329;

	@ObfuscatedName("SBZYTIRX.m")
	public int[] field1338;

	@ObfuscatedName("SBZYTIRX.n")
	public int[] field1339;

	@ObfuscatedName("SBZYTIRX.o")
	public int[] field1340;

	@ObfuscatedName("SBZYTIRX.p")
	public int[] field1341;

	@ObfuscatedName("SBZYTIRX.q")
	public int[] field1342;

	@ObfuscatedName("SBZYTIRX.e")
	public static final int[] field1331 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("SBZYTIRX.j")
	public static int field1335 = 99;

	@ObfuscatedName("SBZYTIRX.r")
	public static final int[] field1343 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("SBZYTIRX.s")
	public static final int[] field1344 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("SBZYTIRX.u")
	public static final int[] field1345 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("SBZYTIRX.B")
	public static boolean field1349 = true;

	@ObfuscatedName("SBZYTIRX.x")
	public static int field1347 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("SBZYTIRX.C")
	public static int field1350 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("SBZYTIRX.D")
	public static int field1351;

	@ObfuscatedName("SBZYTIRX.a(II)I")
	public static final int method519(int arg0, int arg1) {
		int var2 = method522(arg0 - 1, arg1 - 1) + method522(arg0 + 1, arg1 - 1) + method522(arg0 - 1, arg1 + 1) + method522(arg0 + 1, arg1 + 1);
		int var3 = method522(arg0 - 1, arg1) + method522(arg0 + 1, arg1) + method522(arg0, arg1 - 1) + method522(arg0, arg1 + 1);
		int var4 = method522(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("SBZYTIRX.a(IIII)V")
	public final void method520(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 8; var4++) {
			for (int var5 = 0; var5 < 8; var5++) {
				field1334[arg0][arg1 + var4][arg2 + var5] = 0;
			}
		}

		if (arg1 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				field1334[arg0][arg1][arg2 + var6] = field1334[arg0][arg1 - 1][arg2 + var6];
			}
		}

		if (arg2 > 0) {
			for (int var7 = 1; var7 < 8; var7++) {
				field1334[arg0][arg1 + var7][arg2] = field1334[arg0][arg1 + var7][arg2 - 1];
			}
		}

		if (arg1 > 0 && field1334[arg0][arg1 - 1][arg2] != 0) {
			field1334[arg0][arg1][arg2] = field1334[arg0][arg1 - 1][arg2];
		} else if (arg2 > 0 && field1334[arg0][arg1][arg2 - 1] != 0) {
			field1334[arg0][arg1][arg2] = field1334[arg0][arg1][arg2 - 1];
		} else if (arg1 > 0 && arg2 > 0 && field1334[arg0][arg1 - 1][arg2 - 1] != 0) {
			field1334[arg0][arg1][arg2] = field1334[arg0][arg1 - 1][arg2 - 1];
		}
	}

	@ObfuscatedName("SBZYTIRX.a(IIIILJFQWYHZJ;LLQLHEUAQ;III)V")
	public final void method521(int arg0, int arg1, int arg2, int arg3, JFQWYHZJ arg4, LQLHEUAQ arg5, int arg6, int arg7) {
		if (field1349 && (field1346[0][arg2][arg1] & 0x2) == 0) {
			if ((field1346[arg0][arg2][arg1] & 0x10) != 0) {
				return;
			}

			if (method533(arg2, arg0, arg1) != field1351) {
				return;
			}
		}

		if (arg0 < field1335) {
			field1335 = arg0;
		}

		int var9 = field1334[arg0][arg2][arg1];
		int var10 = field1334[arg0][arg2 + 1][arg1];
		int var11 = field1334[arg0][arg2 + 1][arg1 + 1];
		int var12 = field1334[arg0][arg2][arg1 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		CUIVWWJO var14 = CUIVWWJO.method203(arg3);
		int var15 = (arg3 << 14) + (arg1 << 7) + arg2 + 0x40000000;
		if (!var14.field586) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg7 << 6) + arg6);
		if (arg6 == 22) {
			if (!field1349 || var14.field586 || var14.field551) {
				XBYIDFVN var17;
				if (var14.field563 == -1 && var14.field562 == null) {
					var17 = var14.method205(22, arg7, var9, var10, var11, var12, -1);
				} else {
					var17 = new QQWZAYRQ(var10, var14.field563, arg3, var11, arg7, 22, true, var9, var12);
				}

				arg4.method258(arg0, var17, arg1, arg2, var13, var15, var16);

				if (var14.field570 && var14.field586 && arg5 != null) {
					arg5.method326(arg2, arg1);
				}
			}
		} else if (arg6 == 10 || arg6 == 11) {
			XBYIDFVN var18;
			if (var14.field563 == -1 && var14.field562 == null) {
				var18 = var14.method205(10, arg7, var9, var10, var11, var12, -1);
			} else {
				var18 = new QQWZAYRQ(var10, var14.field563, arg3, var11, arg7, 10, true, var9, var12);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg6 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg7 == 1 || arg7 == 3) {
					var20 = var14.field594;
					var21 = var14.field554;
				} else {
					var20 = var14.field554;
					var21 = var14.field594;
				}

				if (arg4.method262(arg2, var18, arg1, var19, var21, var15, var16, var13, var20, arg0) && var14.field590) {
					PDVZPZLT var22;
					if (var18 instanceof PDVZPZLT) {
						var22 = (PDVZPZLT) var18;
					} else {
						var22 = var14.method205(10, arg7, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field1158 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field1348[arg0][arg2 + var23][arg1 + var24]) {
									field1348[arg0][arg2 + var23][arg1 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field570 && arg5 != null) {
				arg5.method325(arg1, var14.field553, var14.field554, arg7, arg2, var14.field594);
			}
		} else if (arg6 >= 12) {
			XBYIDFVN var26;
			if (var14.field563 == -1 && var14.field562 == null) {
				var26 = var14.method205(arg6, arg7, var9, var10, var11, var12, -1);
			} else {
				var26 = new QQWZAYRQ(var10, var14.field563, arg3, var11, arg7, arg6, true, var9, var12);
			}

			arg4.method262(arg2, var26, arg1, 0, 1, var15, var16, var13, 1, arg0);

			if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg0 > 0) {
				field1330[arg0][arg2][arg1] |= 0x924;
			}

			if (var14.field570 && arg5 != null) {
				arg5.method325(arg1, var14.field553, var14.field554, arg7, arg2, var14.field594);
			}
		} else if (arg6 == 0) {
			XBYIDFVN var27;
			if (var14.field563 == -1 && var14.field562 == null) {
				var27 = var14.method205(0, arg7, var9, var10, var11, var12, -1);
			} else {
				var27 = new QQWZAYRQ(var10, var14.field563, arg3, var11, arg7, 0, true, var9, var12);
			}

			arg4.method260(field1345[arg7], 0, arg1, var15, null, var27, var16, arg2, arg0, var13);

			if (arg7 == 0) {
				if (var14.field590) {
					field1348[arg0][arg2][arg1] = 50;
					field1348[arg0][arg2][arg1 + 1] = 50;
				}

				if (var14.field582) {
					field1330[arg0][arg2][arg1] |= 0x249;
				}
			} else if (arg7 == 1) {
				if (var14.field590) {
					field1348[arg0][arg2][arg1 + 1] = 50;
					field1348[arg0][arg2 + 1][arg1 + 1] = 50;
				}

				if (var14.field582) {
					field1330[arg0][arg2][arg1 + 1] |= 0x492;
				}
			} else if (arg7 == 2) {
				if (var14.field590) {
					field1348[arg0][arg2 + 1][arg1] = 50;
					field1348[arg0][arg2 + 1][arg1 + 1] = 50;
				}

				if (var14.field582) {
					field1330[arg0][arg2 + 1][arg1] |= 0x249;
				}
			} else if (arg7 == 3) {
				if (var14.field590) {
					field1348[arg0][arg2][arg1] = 50;
					field1348[arg0][arg2 + 1][arg1] = 50;
				}

				if (var14.field582) {
					field1330[arg0][arg2][arg1] |= 0x492;
				}
			}

			if (var14.field570 && arg5 != null) {
				arg5.method324(var14.field553, arg2, arg7, arg6, arg1);
			}

			if (var14.field557 != 16) {
				arg4.method268(var14.field557, arg2, arg0, arg1);
			}
		} else if (arg6 == 1) {
			XBYIDFVN var28;
			if (var14.field563 == -1 && var14.field562 == null) {
				var28 = var14.method205(1, arg7, var9, var10, var11, var12, -1);
			} else {
				var28 = new QQWZAYRQ(var10, var14.field563, arg3, var11, arg7, 1, true, var9, var12);
			}

			arg4.method260(field1331[arg7], 0, arg1, var15, null, var28, var16, arg2, arg0, var13);

			if (var14.field590) {
				if (arg7 == 0) {
					field1348[arg0][arg2][arg1 + 1] = 50;
				} else if (arg7 == 1) {
					field1348[arg0][arg2 + 1][arg1 + 1] = 50;
				} else if (arg7 == 2) {
					field1348[arg0][arg2 + 1][arg1] = 50;
				} else if (arg7 == 3) {
					field1348[arg0][arg2][arg1] = 50;
				}
			}

			if (var14.field570 && arg5 != null) {
				arg5.method324(var14.field553, arg2, arg7, arg6, arg1);
			}
		} else if (arg6 == 2) {
			int var29 = arg7 + 1 & 0x3;
			XBYIDFVN var30;
			XBYIDFVN var31;
			if (var14.field563 == -1 && var14.field562 == null) {
				var30 = var14.method205(2, arg7 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method205(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new QQWZAYRQ(var10, var14.field563, arg3, var11, arg7 + 4, 2, true, var9, var12);
				var31 = new QQWZAYRQ(var10, var14.field563, arg3, var11, var29, 2, true, var9, var12);
			}

			arg4.method260(field1345[arg7], field1345[var29], arg1, var15, var31, var30, var16, arg2, arg0, var13);

			if (var14.field582) {
				if (arg7 == 0) {
					field1330[arg0][arg2][arg1] |= 0x249;
					field1330[arg0][arg2][arg1 + 1] |= 0x492;
				} else if (arg7 == 1) {
					field1330[arg0][arg2][arg1 + 1] |= 0x492;
					field1330[arg0][arg2 + 1][arg1] |= 0x249;
				} else if (arg7 == 2) {
					field1330[arg0][arg2 + 1][arg1] |= 0x249;
					field1330[arg0][arg2][arg1] |= 0x492;
				} else if (arg7 == 3) {
					field1330[arg0][arg2][arg1] |= 0x492;
					field1330[arg0][arg2][arg1] |= 0x249;
				}
			}

			if (var14.field570 && arg5 != null) {
				arg5.method324(var14.field553, arg2, arg7, arg6, arg1);
			}

			if (var14.field557 != 16) {
				arg4.method268(var14.field557, arg2, arg0, arg1);
			}
		} else if (arg6 == 3) {
			XBYIDFVN var32;
			if (var14.field563 == -1 && var14.field562 == null) {
				var32 = var14.method205(3, arg7, var9, var10, var11, var12, -1);
			} else {
				var32 = new QQWZAYRQ(var10, var14.field563, arg3, var11, arg7, 3, true, var9, var12);
			}

			arg4.method260(field1331[arg7], 0, arg1, var15, null, var32, var16, arg2, arg0, var13);

			if (var14.field590) {
				if (arg7 == 0) {
					field1348[arg0][arg2][arg1 + 1] = 50;
				} else if (arg7 == 1) {
					field1348[arg0][arg2 + 1][arg1 + 1] = 50;
				} else if (arg7 == 2) {
					field1348[arg0][arg2 + 1][arg1] = 50;
				} else if (arg7 == 3) {
					field1348[arg0][arg2][arg1] = 50;
				}
			}

			if (var14.field570 && arg5 != null) {
				arg5.method324(var14.field553, arg2, arg7, arg6, arg1);
			}
		} else if (arg6 == 9) {
			XBYIDFVN var33;
			if (var14.field563 == -1 && var14.field562 == null) {
				var33 = var14.method205(arg6, arg7, var9, var10, var11, var12, -1);
			} else {
				var33 = new QQWZAYRQ(var10, var14.field563, arg3, var11, arg7, arg6, true, var9, var12);
			}

			arg4.method262(arg2, var33, arg1, 0, 1, var15, var16, var13, 1, arg0);

			if (var14.field570 && arg5 != null) {
				arg5.method325(arg1, var14.field553, var14.field554, arg7, arg2, var14.field594);
			}
		} else {
			if (var14.field559) {
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
				XBYIDFVN var38;
				if (var14.field563 == -1 && var14.field562 == null) {
					var38 = var14.method205(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new QQWZAYRQ(var10, var14.field563, arg3, var11, 0, 4, true, var9, var12);
				}

				arg4.method261(arg0, arg1, 0, arg2, var38, field1345[arg7], 0, arg7 * 512, var15, var16, var13);
			} else if (arg6 == 5) {
				int var39 = 16;
				int var40 = arg4.method278(arg0, arg2, arg1);
				if (var40 > 0) {
					var39 = CUIVWWJO.method203(var40 >> 14 & 0x7FFF).field557;
				}

				XBYIDFVN var41;
				if (var14.field563 == -1 && var14.field562 == null) {
					var41 = var14.method205(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new QQWZAYRQ(var10, var14.field563, arg3, var11, 0, 4, true, var9, var12);
				}

				arg4.method261(arg0, arg1, field1343[arg7] * var39, arg2, var41, field1345[arg7], field1344[arg7] * var39, arg7 * 512, var15, var16, var13);
			} else if (arg6 == 6) {
				XBYIDFVN var42;
				if (var14.field563 == -1 && var14.field562 == null) {
					var42 = var14.method205(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new QQWZAYRQ(var10, var14.field563, arg3, var11, 0, 4, true, var9, var12);
				}

				arg4.method261(arg0, arg1, 0, arg2, var42, 256, 0, arg7, var15, var16, var13);
			} else if (arg6 == 7) {
				XBYIDFVN var43;
				if (var14.field563 == -1 && var14.field562 == null) {
					var43 = var14.method205(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new QQWZAYRQ(var10, var14.field563, arg3, var11, 0, 4, true, var9, var12);
				}

				arg4.method261(arg0, arg1, 0, arg2, var43, 512, 0, arg7, var15, var16, var13);
			} else if (arg6 == 8) {
				XBYIDFVN var44;
				if (var14.field563 == -1 && var14.field562 == null) {
					var44 = var14.method205(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new QQWZAYRQ(var10, var14.field563, arg3, var11, 0, 4, true, var9, var12);
				}

				arg4.method261(arg0, arg1, 0, arg2, var44, 768, 0, arg7, var15, var16, var13);
			}
		}
	}

	@ObfuscatedName("SBZYTIRX.b(II)I")
	public static final int method522(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("SBZYTIRX.a(IIII[[[IIILLQLHEUAQ;ILJFQWYHZJ;I)V")
	public static final void method523(int arg0, int arg1, int arg2, int[][][] arg3, int arg4, int arg5, LQLHEUAQ arg6, int arg7, JFQWYHZJ arg8, int arg9) {
		int var10 = arg3[arg7][arg4][arg5];
		int var11 = arg3[arg7][arg4 + 1][arg5];
		int var12 = arg3[arg7][arg4 + 1][arg5 + 1];
		int var13 = arg3[arg7][arg4][arg5 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		CUIVWWJO var15 = CUIVWWJO.method203(arg9);
		int var16 = (arg9 << 14) + (arg5 << 7) + arg4 + 0x40000000;
		if (!var15.field586) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg2 << 6) + arg0);
		if (arg0 == 22) {
			XBYIDFVN var18;
			if (var15.field563 == -1 && var15.field562 == null) {
				var18 = var15.method205(22, arg2, var10, var11, var12, var13, -1);
			} else {
				var18 = new QQWZAYRQ(var11, var15.field563, arg9, var12, arg2, 22, true, var10, var13);
			}

			arg8.method258(arg1, var18, arg5, arg4, var14, var16, var17);

			if (var15.field570 && var15.field586) {
				arg6.method326(arg4, arg5);
			}
		} else if (arg0 == 10 || arg0 == 11) {
			XBYIDFVN var19;
			if (var15.field563 == -1 && var15.field562 == null) {
				var19 = var15.method205(10, arg2, var10, var11, var12, var13, -1);
			} else {
				var19 = new QQWZAYRQ(var11, var15.field563, arg9, var12, arg2, 10, true, var10, var13);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg0 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg2 == 1 || arg2 == 3) {
					var21 = var15.field594;
					var22 = var15.field554;
				} else {
					var21 = var15.field554;
					var22 = var15.field594;
				}

				arg8.method262(arg4, var19, arg5, var20, var22, var16, var17, var14, var21, arg1);
			}

			if (var15.field570) {
				arg6.method325(arg5, var15.field553, var15.field554, arg2, arg4, var15.field594);
			}
		} else if (arg0 >= 12) {
			XBYIDFVN var23;
			if (var15.field563 == -1 && var15.field562 == null) {
				var23 = var15.method205(arg0, arg2, var10, var11, var12, var13, -1);
			} else {
				var23 = new QQWZAYRQ(var11, var15.field563, arg9, var12, arg2, arg0, true, var10, var13);
			}

			arg8.method262(arg4, var23, arg5, 0, 1, var16, var17, var14, 1, arg1);

			if (var15.field570) {
				arg6.method325(arg5, var15.field553, var15.field554, arg2, arg4, var15.field594);
			}
		} else if (arg0 == 0) {
			XBYIDFVN var24;
			if (var15.field563 == -1 && var15.field562 == null) {
				var24 = var15.method205(0, arg2, var10, var11, var12, var13, -1);
			} else {
				var24 = new QQWZAYRQ(var11, var15.field563, arg9, var12, arg2, 0, true, var10, var13);
			}

			arg8.method260(field1345[arg2], 0, arg5, var16, null, var24, var17, arg4, arg1, var14);

			if (var15.field570) {
				arg6.method324(var15.field553, arg4, arg2, arg0, arg5);
			}
		} else if (arg0 == 1) {
			XBYIDFVN var25;
			if (var15.field563 == -1 && var15.field562 == null) {
				var25 = var15.method205(1, arg2, var10, var11, var12, var13, -1);
			} else {
				var25 = new QQWZAYRQ(var11, var15.field563, arg9, var12, arg2, 1, true, var10, var13);
			}

			arg8.method260(field1331[arg2], 0, arg5, var16, null, var25, var17, arg4, arg1, var14);

			if (var15.field570) {
				arg6.method324(var15.field553, arg4, arg2, arg0, arg5);
			}
		} else if (arg0 == 2) {
			int var26 = arg2 + 1 & 0x3;
			XBYIDFVN var27;
			XBYIDFVN var28;
			if (var15.field563 == -1 && var15.field562 == null) {
				var27 = var15.method205(2, arg2 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method205(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new QQWZAYRQ(var11, var15.field563, arg9, var12, arg2 + 4, 2, true, var10, var13);
				var28 = new QQWZAYRQ(var11, var15.field563, arg9, var12, var26, 2, true, var10, var13);
			}

			arg8.method260(field1345[arg2], field1345[var26], arg5, var16, var28, var27, var17, arg4, arg1, var14);

			if (var15.field570) {
				arg6.method324(var15.field553, arg4, arg2, arg0, arg5);
			}
		} else if (arg0 == 3) {
			XBYIDFVN var29;
			if (var15.field563 == -1 && var15.field562 == null) {
				var29 = var15.method205(3, arg2, var10, var11, var12, var13, -1);
			} else {
				var29 = new QQWZAYRQ(var11, var15.field563, arg9, var12, arg2, 3, true, var10, var13);
			}

			arg8.method260(field1331[arg2], 0, arg5, var16, null, var29, var17, arg4, arg1, var14);

			if (var15.field570) {
				arg6.method324(var15.field553, arg4, arg2, arg0, arg5);
			}
		} else if (arg0 == 9) {
			XBYIDFVN var30;
			if (var15.field563 == -1 && var15.field562 == null) {
				var30 = var15.method205(arg0, arg2, var10, var11, var12, var13, -1);
			} else {
				var30 = new QQWZAYRQ(var11, var15.field563, arg9, var12, arg2, arg0, true, var10, var13);
			}

			arg8.method262(arg4, var30, arg5, 0, 1, var16, var17, var14, 1, arg1);

			if (var15.field570) {
				arg6.method325(arg5, var15.field553, var15.field554, arg2, arg4, var15.field594);
			}
		} else {
			if (var15.field559) {
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

			if (arg0 == 4) {
				XBYIDFVN var35;
				if (var15.field563 == -1 && var15.field562 == null) {
					var35 = var15.method205(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new QQWZAYRQ(var11, var15.field563, arg9, var12, 0, 4, true, var10, var13);
				}

				arg8.method261(arg1, arg5, 0, arg4, var35, field1345[arg2], 0, arg2 * 512, var16, var17, var14);
			} else if (arg0 == 5) {
				int var36 = 16;
				int var37 = arg8.method278(arg1, arg4, arg5);
				if (var37 > 0) {
					var36 = CUIVWWJO.method203(var37 >> 14 & 0x7FFF).field557;
				}

				XBYIDFVN var38;
				if (var15.field563 == -1 && var15.field562 == null) {
					var38 = var15.method205(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new QQWZAYRQ(var11, var15.field563, arg9, var12, 0, 4, true, var10, var13);
				}

				arg8.method261(arg1, arg5, field1343[arg2] * var36, arg4, var38, field1345[arg2], field1344[arg2] * var36, arg2 * 512, var16, var17, var14);
			} else if (arg0 == 6) {
				XBYIDFVN var39;
				if (var15.field563 == -1 && var15.field562 == null) {
					var39 = var15.method205(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new QQWZAYRQ(var11, var15.field563, arg9, var12, 0, 4, true, var10, var13);
				}

				arg8.method261(arg1, arg5, 0, arg4, var39, 256, 0, arg2, var16, var17, var14);
			} else if (arg0 == 7) {
				XBYIDFVN var40;
				if (var15.field563 == -1 && var15.field562 == null) {
					var40 = var15.method205(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new QQWZAYRQ(var11, var15.field563, arg9, var12, 0, 4, true, var10, var13);
				}

				arg8.method261(arg1, arg5, 0, arg4, var40, 512, 0, arg2, var16, var17, var14);
			} else if (arg0 == 8) {
				XBYIDFVN var41;
				if (var15.field563 == -1 && var15.field562 == null) {
					var41 = var15.method205(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new QQWZAYRQ(var11, var15.field563, arg9, var12, 0, 4, true, var10, var13);
				}

				arg8.method261(arg1, arg5, 0, arg4, var41, 768, 0, arg2, var16, var17, var14);
			}
		}
	}

	@ObfuscatedName("SBZYTIRX.a(III)I")
	public final int method524(int arg0, int arg1, int arg2) {
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

	public SBZYTIRX(int[][][] arg0, int arg1, byte[][][] arg2, int arg3) {
		field1335 = 99;
		field1336 = arg3;
		field1337 = arg1;
		field1334 = arg0;
		field1346 = arg2;
		field1327 = new byte[4][field1336][field1337];
		field1328 = new byte[4][field1336][field1337];
		field1332 = new byte[4][field1336][field1337];
		field1333 = new byte[4][field1336][field1337];
		field1330 = new int[4][field1336 + 1][field1337 + 1];
		field1348 = new byte[4][field1336 + 1][field1337 + 1];
		field1329 = new int[field1336 + 1][field1337 + 1];
		field1338 = new int[field1337];
		field1339 = new int[field1337];
		field1340 = new int[field1337];
		field1341 = new int[field1337];
		field1342 = new int[field1337];
	}

	@ObfuscatedName("SBZYTIRX.a(IIIIILMVHXDWGI;IB)V")
	public final void method525(int arg0, int arg1, int arg2, int arg3, int arg4, MVHXDWGI arg5, int arg6) {
		if (arg4 >= 0 && arg4 < 104 && arg6 >= 0 && arg6 < 104) {
			field1346[arg2][arg4][arg6] = 0;
			while (true) {
				int var8 = arg5.method357();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg5.method357();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg2 == 0) {
						field1334[0][arg4][arg6] = -var9 * 8;
						return;
					}

					field1334[arg2][arg4][arg6] = field1334[arg2 - 1][arg4][arg6] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field1328[arg2][arg4][arg6] = arg5.method358();
					field1332[arg2][arg4][arg6] = (byte) ((var8 - 2) / 4);
					field1333[arg2][arg4][arg6] = (byte) (var8 + arg3 - 2 & 0x3);
				} else if (var8 <= 81) {
					field1346[arg2][arg4][arg6] = (byte) (var8 - 49);
				} else {
					field1327[arg2][arg4][arg6] = (byte) (var8 - 81);
				}
			}

			if (arg2 == 0) {
				field1334[0][arg4][arg6] = -method532(arg4 + arg0 + 932731, arg6 + 556238 + arg1) * 8;
			} else {
				field1334[arg2][arg4][arg6] = field1334[arg2 - 1][arg4][arg6] - 240;
			}
		} else {
			while (true) {
				int var10 = arg5.method357();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg5.method357();
					return;
				}

				if (var10 <= 49) {
					arg5.method357();
				}
			}
		}
	}

	@ObfuscatedName("SBZYTIRX.b(IIII)I")
	public static final int method526(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - THHUVKBK.field1412[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("SBZYTIRX.c(II)I")
	public static final int method527(int arg0, int arg1) {
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

	@ObfuscatedName("SBZYTIRX.a([LLQLHEUAQ;LJFQWYHZJ;II[BIIIIII)V")
	public final void method528(LQLHEUAQ[] arg0, JFQWYHZJ arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		MVHXDWGI var11 = new MVHXDWGI(arg4);
		int var12 = -1;
		while (true) {
			int var13 = var11.method371();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method371();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method357();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg2 == var18 && var17 >= arg5 && var17 < arg5 + 8 && var16 >= arg9 && var16 < arg9 + 8) {
					CUIVWWJO var22 = CUIVWWJO.method203(var12);
					int var23 = arg3 + GSBGVYYO.method226(var16 & 0x7, var21, var22.field554, var17 & 0x7, arg8, var22.field594);
					int var24 = arg7 + GSBGVYYO.method227(var22.field554, var22.field594, var16 & 0x7, var17 & 0x7, arg8, var21);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg6;
						if ((field1346[1][var23][var24] & 0x2) == 2) {
							var25 = arg6 - 1;
						}

						LQLHEUAQ var26 = null;
						if (var25 >= 0) {
							var26 = arg0[var25];
						}

						method521(arg6, var24, var23, var12, arg1, var26, var20, arg8 + var21 & 0x3);
					}
				}
			}
		}
	}

	@ObfuscatedName("SBZYTIRX.a([B[LLQLHEUAQ;LJFQWYHZJ;III)V")
	public final void method529(byte[] arg0, LQLHEUAQ[] arg1, JFQWYHZJ arg2, int arg3, int arg4) {
		MVHXDWGI var6 = new MVHXDWGI(arg0);
		int var7 = -1;
		while (true) {
			int var8 = var6.method371();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method371();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method357();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg3 + var12;
				int var18 = arg4 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field1346[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					LQLHEUAQ var20 = null;
					if (var19 >= 0) {
						var20 = arg1[var19];
					}

					method521(var13, var18, var17, var7, arg2, var20, var15, var16);
				}
			}
		}
	}

	@ObfuscatedName("SBZYTIRX.b(III)I")
	public static final int method530(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method519(var3, var5);
		int var8 = method519(var3 + 1, var5);
		int var9 = method519(var3, var5 + 1);
		int var10 = method519(var3 + 1, var5 + 1);
		int var11 = method526(var7, var8, var4, arg2);
		int var12 = method526(var9, var10, var4, arg2);
		return method526(var11, var12, var6, arg2);
	}

	@ObfuscatedName("SBZYTIRX.a(I[BIIZI[LLQLHEUAQ;)V")
	public final void method531(int arg0, byte[] arg1, int arg2, int arg3, int arg4, LQLHEUAQ[] arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg2 + var8 > 0 && arg2 + var8 < 103 && arg3 + var9 > 0 && arg3 + var9 < 103) {
						arg5[var7].field900[arg2 + var8][arg3 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		MVHXDWGI var10 = new MVHXDWGI(arg1);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method525(arg0, arg4, var11, 0, arg2 + var12, var10, arg3 + var13);
				}
			}
		}
	}

	@ObfuscatedName("SBZYTIRX.d(II)I")
	public static final int method532(int arg0, int arg1) {
		int var2 = method530(arg0 + 45365, arg1 + 91923, 4) + (method530(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method530(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("SBZYTIRX.a(IZII)I")
	public int method533(int arg0, int arg1, int arg2) {
		if ((field1346[arg1][arg0][arg2] & 0x8) != 0) {
			return 0;
		}

		if (arg1 > 0 && (field1346[1][arg0][arg2] & 0x2) != 0) {
			return arg1 - 1;
		}

		return arg1;
	}

	@ObfuscatedName("SBZYTIRX.a(IBI)Z")
	public static final boolean method534(int arg0, int arg1) {
		CUIVWWJO var2 = CUIVWWJO.method203(arg1);

		if (arg0 == 11) {
			arg0 = 10;
		}

		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}

		return var2.method198(arg0);
	}

	@ObfuscatedName("SBZYTIRX.a([LLQLHEUAQ;II[BIIIZII)V")
	public final void method535(LQLHEUAQ[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg4 + var10 > 0 && arg4 + var10 < 103 && arg7 + var11 > 0 && arg7 + var11 < 103) {
					arg0[arg8].field900[arg4 + var10][arg7 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		MVHXDWGI var12 = new MVHXDWGI(arg3);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg2 == var13 && var14 >= arg1 && var14 < arg1 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
						method525(0, 0, arg8, arg5, arg4 + GSBGVYYO.method224(var14 & 0x7, arg5, var15 & 0x7), var12, arg7 + GSBGVYYO.method225(var14 & 0x7, var15 & 0x7, arg5));
					} else {
						method525(0, 0, 0, 0, -1, var12, -1);
					}
				}
			}
		}
	}

	@ObfuscatedName("SBZYTIRX.a(IBIII)V")
	public final void method536(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg1; var5 <= arg1 + arg3; var5++) {
			for (int var6 = arg2; var6 <= arg0 + arg2; var6++) {
				if (var6 >= 0 && var6 < field1336 && var5 >= 0 && var5 < field1337) {
					field1348[0][var6][var5] = 127;

					if (arg2 == var6 && var6 > 0) {
						field1334[0][var6][var5] = field1334[0][var6 - 1][var5];
					}

					if (arg0 + arg2 == var6 && var6 < field1336 - 1) {
						field1334[0][var6][var5] = field1334[0][var6 + 1][var5];
					}

					if (arg1 == var5 && var5 > 0) {
						field1334[0][var6][var5] = field1334[0][var6][var5 - 1];
					}

					if (arg1 + arg3 == var5 && var5 < field1337 - 1) {
						field1334[0][var6][var5] = field1334[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("SBZYTIRX.a(I[BII)Z")
	public static final boolean method537(byte[] arg0, int arg1, int arg2) {
		boolean var3 = true;
		MVHXDWGI var4 = new MVHXDWGI(arg0);
		int var5 = -1;
		while (true) {
			int var6 = var4.method371();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method371();
					if (var9 == 0) {
						break;
					}

					var4.method357();
				} else {
					int var10 = var4.method371();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method357() >> 2;
					int var14 = arg2 + var12;
					int var15 = arg1 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						CUIVWWJO var16 = CUIVWWJO.method203(var5);
						if (var13 != 22 || !field1349 || var16.field586 || var16.field551) {
							var3 &= var16.method199();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("SBZYTIRX.e(II)I")
	public final int method538(int arg0, int arg1) {
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

	@ObfuscatedName("SBZYTIRX.a(LRKMPVAZH;ILMVHXDWGI;)V")
	public static final void method539(RKMPVAZH arg0, MVHXDWGI arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg1.method371();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			CUIVWWJO var4 = CUIVWWJO.method203(var2);
			var4.method202(arg0);

			while (true) {
				int var5 = arg1.method371();
				if (var5 == 0) {
					break;
				}

				arg1.method357();
			}
		}
	}

	@ObfuscatedName("SBZYTIRX.a(ILJFQWYHZJ;[LLQLHEUAQ;)V")
	public final void method540(JFQWYHZJ arg0, LQLHEUAQ[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field1346[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field1346[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method326(var4, var5);
						}
					}
				}
			}
		}

		field1350 += (int) (Math.random() * 5.0D) - 2;
		if (field1350 < -8) {
			field1350 = -8;
		}

		if (field1350 > 8) {
			field1350 = 8;
		}

		field1347 += (int) (Math.random() * 5.0D) - 2;
		if (field1347 < -16) {
			field1347 = -16;
		}

		if (field1347 > 16) {
			field1347 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field1348[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field1337 - 1; var16++) {
				for (int var17 = 1; var17 < field1336 - 1; var17++) {
					int var18 = field1334[var7][var17 + 1][var16] - field1334[var7][var17 - 1][var16];
					int var19 = field1334[var7][var17][var16 + 1] - field1334[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field1329[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field1337; var26++) {
				field1338[var26] = 0;
				field1339[var26] = 0;
				field1340[var26] = 0;
				field1341[var26] = 0;
				field1342[var26] = 0;
			}

			for (int var27 = -5; var27 < field1336 + 5; var27++) {
				for (int var28 = 0; var28 < field1337; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field1336) {
						int var30 = field1327[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							QDVRTZST var31 = QDVRTZST.field1215[var30 - 1];
							field1338[var28] += var31.field1224;
							field1339[var28] += var31.field1222;
							field1340[var28] += var31.field1223;
							field1341[var28] += var31.field1225;
							field1342[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field1336) {
						int var33 = field1327[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							QDVRTZST var34 = QDVRTZST.field1215[var33 - 1];
							field1338[var28] -= var34.field1224;
							field1339[var28] -= var34.field1222;
							field1340[var28] -= var34.field1223;
							field1341[var28] -= var34.field1225;
							field1342[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field1336 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field1337 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field1337) {
							var35 += field1338[var41];
							var36 += field1339[var41];
							var37 += field1340[var41];
							var38 += field1341[var41];
							var39 += field1342[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field1337) {
							var35 -= field1338[var42];
							var36 -= field1339[var42];
							var37 -= field1340[var42];
							var38 -= field1341[var42];
							var39 -= field1342[var42];
						}

						if (var40 >= 1 && var40 < field1337 - 1 && (!field1349 || (field1346[0][var27][var40] & 0x2) != 0 || (field1346[var7][var27][var40] & 0x10) == 0 && method533(var27, var7, var40) == field1351)) {
							if (var7 < field1335) {
								field1335 = var7;
							}

							int var43 = field1327[var7][var27][var40] & 0xFF;
							int var44 = field1328[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field1334[var7][var27][var40];
								int var46 = field1334[var7][var27 + 1][var40];
								int var47 = field1334[var7][var27 + 1][var40 + 1];
								int var48 = field1334[var7][var27][var40 + 1];
								int var49 = field1329[var27][var40];
								int var50 = field1329[var27 + 1][var40];
								int var51 = field1329[var27 + 1][var40 + 1];
								int var52 = field1329[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method524(var55, var56, var57);
									var55 = field1350 + var55 & 0xFF;
									var57 += field1347;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method524(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field1332[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !QDVRTZST.field1215[var44 - 1].field1220) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field1330[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = THHUVKBK.field1423[method527(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method257(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method527(var53, var49), method527(var53, var50), method527(var53, var51), method527(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field1332[var7][var27][var40] + 1;
									byte var61 = field1333[var7][var27][var40];
									QDVRTZST var62 = QDVRTZST.field1215[var44 - 1];
									int var63 = var62.field1218;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = THHUVKBK.method559(var63);
										var65 = -1;
									} else if (var62.field1217 == 0xFF00FF) {
										var65 = -2;
										var63 = -1;
										var64 = THHUVKBK.field1423[method538(var62.field1226, 96)];
									} else {
										var65 = method524(var62.field1221, var62.field1222, var62.field1223);
										var64 = THHUVKBK.field1423[method538(var62.field1226, 96)];
									}

									arg0.method257(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method527(var53, var49), method527(var53, var50), method527(var53, var51), method527(var53, var52), method538(var65, var49), method538(var65, var50), method538(var65, var51), method538(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field1337 - 1; var66++) {
				for (int var67 = 1; var67 < field1336 - 1; var67++) {
					arg0.method256(var7, var67, var66, method533(var67, var7, var66));
				}
			}
		}

		arg0.method283(-50, -10, -50);

		for (int var68 = 0; var68 < field1336; var68++) {
			for (int var69 = 0; var69 < field1337; var69++) {
				if ((field1346[1][var68][var69] & 0x2) == 2) {
					arg0.method254(var69, var68);
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
				for (int var75 = 0; var75 <= field1337; var75++) {
					for (int var76 = 0; var76 <= field1336; var76++) {
						if ((field1330[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field1330[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field1337 && (field1330[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field1330[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field1330[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field1334[var80][var76][var77] - var84;
								int var86 = field1334[var79][var76][var77];
								JFQWYHZJ.method255(var86, var76 * 128, var78 * 128 + 128, var85, var73, var76 * 128, var77 * 128, 1);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field1330[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field1330[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field1330[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field1336 && (field1330[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field1330[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field1330[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field1334[var92][var89][var75] - var96;
								int var98 = field1334[var91][var89][var75];
								JFQWYHZJ.method255(var98, var90 * 128 + 128, var75 * 128, var97, var73, var89 * 128, var75 * 128, 2);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field1330[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field1330[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field1330[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field1337 && (field1330[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field1330[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field1336) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field1330[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field1334[var74][var101][var103];
								JFQWYHZJ.method255(var107, var102 * 128 + 128, var104 * 128 + 128, var107, var73, var101 * 128, var103 * 128, 4);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field1330[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
