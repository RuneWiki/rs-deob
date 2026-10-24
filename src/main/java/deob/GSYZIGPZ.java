package deob;

@ObfuscatedName("GSYZIGPZ")
public final class GSYZIGPZ {

	@ObfuscatedName("GSYZIGPZ.E")
	public int field702;

	@ObfuscatedName("GSYZIGPZ.F")
	public int field703;

	@ObfuscatedName("GSYZIGPZ.r")
	public int[][][] field691;

	@ObfuscatedName("GSYZIGPZ.h")
	public byte[][][] field684;

	@ObfuscatedName("GSYZIGPZ.n")
	public byte[][][] field687;

	@ObfuscatedName("GSYZIGPZ.w")
	public byte[][][] field695;

	@ObfuscatedName("GSYZIGPZ.k")
	public byte[][][] field686;

	@ObfuscatedName("GSYZIGPZ.c")
	public byte[][][] field681;

	@ObfuscatedName("GSYZIGPZ.b")
	public int[][][] field680;

	@ObfuscatedName("GSYZIGPZ.a")
	public byte[][][] field679;

	@ObfuscatedName("GSYZIGPZ.e")
	public int[][] field683;

	@ObfuscatedName("GSYZIGPZ.x")
	public int[] field696;

	@ObfuscatedName("GSYZIGPZ.y")
	public int[] field697;

	@ObfuscatedName("GSYZIGPZ.z")
	public int[] field698;

	@ObfuscatedName("GSYZIGPZ.A")
	public int[] field699;

	@ObfuscatedName("GSYZIGPZ.B")
	public int[] field700;

	@ObfuscatedName("GSYZIGPZ.d")
	public static boolean field682 = true;

	@ObfuscatedName("GSYZIGPZ.i")
	public static final int[] field685 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("GSYZIGPZ.p")
	public static final int[] field689 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("GSYZIGPZ.s")
	public static final int[] field692 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("GSYZIGPZ.v")
	public static final int[] field694 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("GSYZIGPZ.D")
	public static int field701 = 99;

	@ObfuscatedName("GSYZIGPZ.o")
	public static int field688 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("GSYZIGPZ.u")
	public static int field693 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("GSYZIGPZ.q")
	public static int field690;

	@ObfuscatedName("GSYZIGPZ.a(II)I")
	public static final int method227(int arg0, int arg1) {
		int var2 = method246(arg0 - 1, arg1 - 1) + method246(arg0 + 1, arg1 - 1) + method246(arg0 - 1, arg1 + 1) + method246(arg0 + 1, arg1 + 1);
		int var3 = method246(arg0 - 1, arg1) + method246(arg0 + 1, arg1) + method246(arg0, arg1 - 1) + method246(arg0, arg1 + 1);
		int var4 = method246(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("GSYZIGPZ.a(IBIII[LEAREBDMK;[B)V")
	public final void method228(int arg0, int arg1, int arg2, int arg3, EAREBDMK[] arg4, byte[] arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg1 + var8 > 0 && arg1 + var8 < 103 && arg3 + var9 > 0 && arg3 + var9 < 103) {
						arg4[var7].field615[arg1 + var8][arg3 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		NHEPCMLW var10 = new NHEPCMLW(arg5);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method237(var11, arg3 + var13, arg2, var10, arg0, 0, arg1 + var12);
				}
			}
		}
	}

	@ObfuscatedName("GSYZIGPZ.a(II[B[LEAREBDMK;IIZIII)V")
	public final void method229(int arg0, int arg1, byte[] arg2, EAREBDMK[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg4 + var10 > 0 && arg4 + var10 < 103 && arg1 + var11 > 0 && arg1 + var11 < 103) {
					arg3[arg6].field615[arg4 + var10][arg1 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		NHEPCMLW var12 = new NHEPCMLW(arg2);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg5 == var13 && var14 >= arg0 && var14 < arg0 + 8 && var15 >= arg7 && var15 < arg7 + 8) {
						method237(arg6, arg1 + UBZWFZFP.method501(arg8, var15 & 0x7, var14 & 0x7), 0, var12, 0, arg8, arg4 + UBZWFZFP.method500(var15 & 0x7, arg8, var14 & 0x7));
					} else {
						method237(0, -1, 0, var12, 0, 0, -1);
					}
				}
			}
		}
	}

	@ObfuscatedName("GSYZIGPZ.a(IZIII)V")
	public final void method230(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg3; var5 <= arg0 + arg3; var5++) {
			for (int var6 = arg1; var6 <= arg1 + arg2; var6++) {
				if (var6 >= 0 && var6 < field702 && var5 >= 0 && var5 < field703) {
					field679[0][var6][var5] = 127;

					if (arg1 == var6 && var6 > 0) {
						field691[0][var6][var5] = field691[0][var6 - 1][var5];
					}

					if (arg1 + arg2 == var6 && var6 < field702 - 1) {
						field691[0][var6][var5] = field691[0][var6 + 1][var5];
					}

					if (arg3 == var5 && var5 > 0) {
						field691[0][var6][var5] = field691[0][var6][var5 - 1];
					}

					if (arg0 + arg3 == var5 && var5 < field703 - 1) {
						field691[0][var6][var5] = field691[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("GSYZIGPZ.a(III)I")
	public static final int method231(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method227(var3, var5);
		int var8 = method227(var3 + 1, var5);
		int var9 = method227(var3, var5 + 1);
		int var10 = method227(var3 + 1, var5 + 1);
		int var11 = method241(var7, var8, var4, arg2);
		int var12 = method241(var9, var10, var4, arg2);
		return method241(var11, var12, var6, arg2);
	}

	@ObfuscatedName("GSYZIGPZ.b(II)I")
	public static final int method232(int arg0, int arg1) {
		int var2 = method231(arg0 + 45365, arg1 + 91923, 4) + (method231(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method231(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("GSYZIGPZ.a(II[BI)Z")
	public static final boolean method233(int arg0, int arg1, byte[] arg2) {
		boolean var3 = true;
		NHEPCMLW var4 = new NHEPCMLW(arg2);
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
					int var14 = arg1 + var12;
					int var15 = arg0 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						NRKXAGEB var16 = NRKXAGEB.method400(var5);
						if (var13 != 22 || !field682 || var16.field1012 || var16.field990) {
							var3 &= var16.method405();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("GSYZIGPZ.c(II)I")
	public static final int method234(int arg0, int arg1) {
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

	@ObfuscatedName("GSYZIGPZ.a(IIBI)I")
	public int method235(int arg0, int arg1, int arg2) {
		if ((field684[arg2][arg1][arg0] & 0x8) != 0) {
			return 0;
		}

		if (arg2 > 0 && (field684[1][arg1][arg0] & 0x2) != 0) {
			return arg2 - 1;
		}

		return arg2;
	}

	@ObfuscatedName("GSYZIGPZ.a(LEAREBDMK;LTEXKPKZX;IIIIIIB)V")
	public final void method236(EAREBDMK arg0, TEXKPKZX arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field682 && (field684[0][arg2][arg7] & 0x2) == 0) {
			if ((field684[arg3][arg2][arg7] & 0x10) != 0) {
				return;
			}

			if (method235(arg7, arg2, arg3) != field690) {
				return;
			}
		}

		if (arg3 < field701) {
			field701 = arg3;
		}

		int var9 = field691[arg3][arg2][arg7];
		int var10 = field691[arg3][arg2 + 1][arg7];
		int var11 = field691[arg3][arg2 + 1][arg7 + 1];
		int var12 = field691[arg3][arg2][arg7 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		NRKXAGEB var14 = NRKXAGEB.method400(arg6);
		int var15 = (arg6 << 14) + (arg7 << 7) + arg2 + 0x40000000;
		if (!var14.field1012) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg4 << 6) + arg5);
		if (arg5 == 22) {
			if (!field682 || var14.field1012 || var14.field990) {
				ZJNSWWFY var17;
				if (var14.field1010 == -1 && var14.field1005 == null) {
					var17 = var14.method408(22, arg4, var9, var10, var11, var12, -1);
				} else {
					var17 = new DYEBQOMK(var9, var14.field1010, true, var12, var11, arg4, 22, var10, arg6);
				}

				arg1.method455(arg3, var16, var15, arg2, arg7, var17, var13);

				if (var14.field1000 && var14.field1012 && arg0 != null) {
					arg0.method191(arg2, arg7);
				}
			}
		} else if (arg5 == 10 || arg5 == 11) {
			ZJNSWWFY var18;
			if (var14.field1010 == -1 && var14.field1005 == null) {
				var18 = var14.method408(10, arg4, var9, var10, var11, var12, -1);
			} else {
				var18 = new DYEBQOMK(var9, var14.field1010, true, var12, var11, arg4, 10, var10, arg6);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg5 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg4 == 1 || arg4 == 3) {
					var20 = var14.field1017;
					var21 = var14.field987;
				} else {
					var20 = var14.field987;
					var21 = var14.field1017;
				}

				if (arg1.method459(var16, var13, var18, var15, arg2, var21, var19, arg3, var20, arg7) && var14.field995) {
					CSGBDGDY var22;
					if (var18 instanceof CSGBDGDY) {
						var22 = (CSGBDGDY) var18;
					} else {
						var22 = var14.method408(10, arg4, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field527 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field679[arg3][arg2 + var23][arg7 + var24]) {
									field679[arg3][arg2 + var23][arg7 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field1000 && arg0 != null) {
				arg0.method190(arg7, var14.field987, arg4, var14.field1017, arg2, var14.field1029);
			}
		} else if (arg5 >= 12) {
			ZJNSWWFY var26;
			if (var14.field1010 == -1 && var14.field1005 == null) {
				var26 = var14.method408(arg5, arg4, var9, var10, var11, var12, -1);
			} else {
				var26 = new DYEBQOMK(var9, var14.field1010, true, var12, var11, arg4, arg5, var10, arg6);
			}

			arg1.method459(var16, var13, var26, var15, arg2, 1, 0, arg3, 1, arg7);

			if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg3 > 0) {
				field680[arg3][arg2][arg7] |= 0x924;
			}

			if (var14.field1000 && arg0 != null) {
				arg0.method190(arg7, var14.field987, arg4, var14.field1017, arg2, var14.field1029);
			}
		} else if (arg5 == 0) {
			ZJNSWWFY var27;
			if (var14.field1010 == -1 && var14.field1005 == null) {
				var27 = var14.method408(0, arg4, var9, var10, var11, var12, -1);
			} else {
				var27 = new DYEBQOMK(var9, var14.field1010, true, var12, var11, arg4, 0, var10, arg6);
			}

			arg1.method457(null, 0, var16, field685[arg4], arg7, var27, arg2, var15, var13, arg3);

			if (arg4 == 0) {
				if (var14.field995) {
					field679[arg3][arg2][arg7] = 50;
					field679[arg3][arg2][arg7 + 1] = 50;
				}

				if (var14.field1001) {
					field680[arg3][arg2][arg7] |= 0x249;
				}
			} else if (arg4 == 1) {
				if (var14.field995) {
					field679[arg3][arg2][arg7 + 1] = 50;
					field679[arg3][arg2 + 1][arg7 + 1] = 50;
				}

				if (var14.field1001) {
					field680[arg3][arg2][arg7 + 1] |= 0x492;
				}
			} else if (arg4 == 2) {
				if (var14.field995) {
					field679[arg3][arg2 + 1][arg7] = 50;
					field679[arg3][arg2 + 1][arg7 + 1] = 50;
				}

				if (var14.field1001) {
					field680[arg3][arg2 + 1][arg7] |= 0x249;
				}
			} else if (arg4 == 3) {
				if (var14.field995) {
					field679[arg3][arg2][arg7] = 50;
					field679[arg3][arg2 + 1][arg7] = 50;
				}

				if (var14.field1001) {
					field680[arg3][arg2][arg7] |= 0x492;
				}
			}

			if (var14.field1000 && arg0 != null) {
				arg0.method189(arg4, arg7, arg2, var14.field1029, arg5);
			}

			if (var14.field993 != 16) {
				arg1.method465(var14.field993, arg7, arg3, arg2);
			}
		} else if (arg5 == 1) {
			ZJNSWWFY var28;
			if (var14.field1010 == -1 && var14.field1005 == null) {
				var28 = var14.method408(1, arg4, var9, var10, var11, var12, -1);
			} else {
				var28 = new DYEBQOMK(var9, var14.field1010, true, var12, var11, arg4, 1, var10, arg6);
			}

			arg1.method457(null, 0, var16, field694[arg4], arg7, var28, arg2, var15, var13, arg3);

			if (var14.field995) {
				if (arg4 == 0) {
					field679[arg3][arg2][arg7 + 1] = 50;
				} else if (arg4 == 1) {
					field679[arg3][arg2 + 1][arg7 + 1] = 50;
				} else if (arg4 == 2) {
					field679[arg3][arg2 + 1][arg7] = 50;
				} else if (arg4 == 3) {
					field679[arg3][arg2][arg7] = 50;
				}
			}

			if (var14.field1000 && arg0 != null) {
				arg0.method189(arg4, arg7, arg2, var14.field1029, arg5);
			}
		} else if (arg5 == 2) {
			int var29 = arg4 + 1 & 0x3;
			ZJNSWWFY var30;
			ZJNSWWFY var31;
			if (var14.field1010 == -1 && var14.field1005 == null) {
				var30 = var14.method408(2, arg4 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method408(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new DYEBQOMK(var9, var14.field1010, true, var12, var11, arg4 + 4, 2, var10, arg6);
				var31 = new DYEBQOMK(var9, var14.field1010, true, var12, var11, var29, 2, var10, arg6);
			}

			arg1.method457(var31, field685[var29], var16, field685[arg4], arg7, var30, arg2, var15, var13, arg3);

			if (var14.field1001) {
				if (arg4 == 0) {
					field680[arg3][arg2][arg7] |= 0x249;
					field680[arg3][arg2][arg7 + 1] |= 0x492;
				} else if (arg4 == 1) {
					field680[arg3][arg2][arg7 + 1] |= 0x492;
					field680[arg3][arg2 + 1][arg7] |= 0x249;
				} else if (arg4 == 2) {
					field680[arg3][arg2 + 1][arg7] |= 0x249;
					field680[arg3][arg2][arg7] |= 0x492;
				} else if (arg4 == 3) {
					field680[arg3][arg2][arg7] |= 0x492;
					field680[arg3][arg2][arg7] |= 0x249;
				}
			}

			if (var14.field1000 && arg0 != null) {
				arg0.method189(arg4, arg7, arg2, var14.field1029, arg5);
			}

			if (var14.field993 != 16) {
				arg1.method465(var14.field993, arg7, arg3, arg2);
			}
		} else if (arg5 == 3) {
			ZJNSWWFY var32;
			if (var14.field1010 == -1 && var14.field1005 == null) {
				var32 = var14.method408(3, arg4, var9, var10, var11, var12, -1);
			} else {
				var32 = new DYEBQOMK(var9, var14.field1010, true, var12, var11, arg4, 3, var10, arg6);
			}

			arg1.method457(null, 0, var16, field694[arg4], arg7, var32, arg2, var15, var13, arg3);

			if (var14.field995) {
				if (arg4 == 0) {
					field679[arg3][arg2][arg7 + 1] = 50;
				} else if (arg4 == 1) {
					field679[arg3][arg2 + 1][arg7 + 1] = 50;
				} else if (arg4 == 2) {
					field679[arg3][arg2 + 1][arg7] = 50;
				} else if (arg4 == 3) {
					field679[arg3][arg2][arg7] = 50;
				}
			}

			if (var14.field1000 && arg0 != null) {
				arg0.method189(arg4, arg7, arg2, var14.field1029, arg5);
			}
		} else if (arg5 == 9) {
			ZJNSWWFY var33;
			if (var14.field1010 == -1 && var14.field1005 == null) {
				var33 = var14.method408(arg5, arg4, var9, var10, var11, var12, -1);
			} else {
				var33 = new DYEBQOMK(var9, var14.field1010, true, var12, var11, arg4, arg5, var10, arg6);
			}

			arg1.method459(var16, var13, var33, var15, arg2, 1, 0, arg3, 1, arg7);

			if (var14.field1000 && arg0 != null) {
				arg0.method190(arg7, var14.field987, arg4, var14.field1017, arg2, var14.field1029);
			}
		} else {
			if (var14.field1018) {
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

			if (arg5 == 4) {
				ZJNSWWFY var38;
				if (var14.field1010 == -1 && var14.field1005 == null) {
					var38 = var14.method408(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new DYEBQOMK(var9, var14.field1010, true, var12, var11, 0, 4, var10, arg6);
				}

				arg1.method458(var16, var15, arg3, 0, 0, var38, arg4 * 512, field685[arg4], arg7, var13, arg2);
			} else if (arg5 == 5) {
				int var39 = 16;
				int var40 = arg1.method475(arg3, arg2, arg7);
				if (var40 > 0) {
					var39 = NRKXAGEB.method400(var40 >> 14 & 0x7FFF).field993;
				}

				ZJNSWWFY var41;
				if (var14.field1010 == -1 && var14.field1005 == null) {
					var41 = var14.method408(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new DYEBQOMK(var9, var14.field1010, true, var12, var11, 0, 4, var10, arg6);
				}

				arg1.method458(var16, var15, arg3, field692[arg4] * var39, field689[arg4] * var39, var41, arg4 * 512, field685[arg4], arg7, var13, arg2);
			} else if (arg5 == 6) {
				ZJNSWWFY var42;
				if (var14.field1010 == -1 && var14.field1005 == null) {
					var42 = var14.method408(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new DYEBQOMK(var9, var14.field1010, true, var12, var11, 0, 4, var10, arg6);
				}

				arg1.method458(var16, var15, arg3, 0, 0, var42, arg4, 256, arg7, var13, arg2);
			} else if (arg5 == 7) {
				ZJNSWWFY var43;
				if (var14.field1010 == -1 && var14.field1005 == null) {
					var43 = var14.method408(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new DYEBQOMK(var9, var14.field1010, true, var12, var11, 0, 4, var10, arg6);
				}

				arg1.method458(var16, var15, arg3, 0, 0, var43, arg4, 512, arg7, var13, arg2);
			} else if (arg5 == 8) {
				ZJNSWWFY var44;
				if (var14.field1010 == -1 && var14.field1005 == null) {
					var44 = var14.method408(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new DYEBQOMK(var9, var14.field1010, true, var12, var11, 0, 4, var10, arg6);
				}

				arg1.method458(var16, var15, arg3, 0, 0, var44, arg4, 768, arg7, var13, arg2);
			}
		}
	}

	@ObfuscatedName("GSYZIGPZ.a(IIIILNHEPCMLW;III)V")
	public final void method237(int arg0, int arg1, int arg2, NHEPCMLW arg3, int arg4, int arg5, int arg6) {
		if (arg6 >= 0 && arg6 < 104 && arg1 >= 0 && arg1 < 104) {
			field684[arg0][arg6][arg1] = 0;
			while (true) {
				int var8 = arg3.method349();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg3.method349();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg0 == 0) {
						field691[0][arg6][arg1] = -var9 * 8;
						return;
					}

					field691[arg0][arg6][arg1] = field691[arg0 - 1][arg6][arg1] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field695[arg0][arg6][arg1] = arg3.method350();
					field686[arg0][arg6][arg1] = (byte) ((var8 - 2) / 4);
					field681[arg0][arg6][arg1] = (byte) (var8 + arg5 - 2 & 0x3);
				} else if (var8 <= 81) {
					field684[arg0][arg6][arg1] = (byte) (var8 - 49);
				} else {
					field687[arg0][arg6][arg1] = (byte) (var8 - 81);
				}
			}

			if (arg0 == 0) {
				field691[0][arg6][arg1] = -method232(arg6 + arg2 + 932731, arg1 + 556238 + arg4) * 8;
			} else {
				field691[arg0][arg6][arg1] = field691[arg0 - 1][arg6][arg1] - 240;
			}
		} else {
			while (true) {
				int var10 = arg3.method349();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg3.method349();
					return;
				}

				if (var10 <= 49) {
					arg3.method349();
				}
			}
		}
	}

	@ObfuscatedName("GSYZIGPZ.b(III)Z")
	public static final boolean method238(int arg0, int arg1) {
		NRKXAGEB var2 = NRKXAGEB.method400(arg1);

		if (arg0 == 11) {
			arg0 = 10;
		}

		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}

		return var2.method401(arg0);
	}

	@ObfuscatedName("GSYZIGPZ.a(LNHEPCMLW;LVNVHYJAS;I)V")
	public static final void method239(NHEPCMLW arg0, VNVHYJAS arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method363();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			NRKXAGEB var4 = NRKXAGEB.method400(var2);
			var4.method407(arg1);

			while (true) {
				int var5 = arg0.method363();
				if (var5 == 0) {
					break;
				}

				arg0.method349();
			}
		}
	}

	@ObfuscatedName("GSYZIGPZ.c(III)I")
	public final int method240(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("GSYZIGPZ.a(IIII)I")
	public static final int method241(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - YFTZFAFG.field1439[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("GSYZIGPZ.a([LEAREBDMK;I[BIILTEXKPKZX;)V")
	public final void method242(EAREBDMK[] arg0, int arg1, byte[] arg2, int arg3, TEXKPKZX arg4) {
		NHEPCMLW var6 = new NHEPCMLW(arg2);
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
				int var17 = arg1 + var12;
				int var18 = arg3 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field684[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					EAREBDMK var20 = null;
					if (var19 >= 0) {
						var20 = arg0[var19];
					}

					method236(var20, arg4, var17, var13, var16, var15, var7, var18);
				}
			}
		}
	}

	@ObfuscatedName("GSYZIGPZ.d(II)I")
	public final int method243(int arg0, int arg1) {
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

	public GSYZIGPZ(int arg0, int[][][] arg1, int arg2, byte[][][] arg3) {
		field701 = 99;
		field702 = arg2;
		field703 = arg0;
		field691 = arg1;
		field684 = arg3;
		field687 = new byte[4][field702][field703];
		field695 = new byte[4][field702][field703];
		field686 = new byte[4][field702][field703];
		field681 = new byte[4][field702][field703];
		field680 = new int[4][field702 + 1][field703 + 1];
		field679 = new byte[4][field702 + 1][field703 + 1];
		field683 = new int[field702 + 1][field703 + 1];
		field696 = new int[field703];
		field697 = new int[field703];
		field698 = new int[field703];
		field699 = new int[field703];
		field700 = new int[field703];
	}

	@ObfuscatedName("GSYZIGPZ.a(I[[[IIIIILTEXKPKZX;ILEAREBDMK;II)V")
	public static final void method244(int arg0, int[][][] arg1, int arg2, int arg3, int arg4, int arg5, TEXKPKZX arg6, int arg7, EAREBDMK arg8, int arg9) {
		int var10 = arg1[arg5][arg9][arg3];
		int var11 = arg1[arg5][arg9 + 1][arg3];
		int var12 = arg1[arg5][arg9 + 1][arg3 + 1];
		int var13 = arg1[arg5][arg9][arg3 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		NRKXAGEB var15 = NRKXAGEB.method400(arg2);
		int var16 = (arg2 << 14) + (arg3 << 7) + arg9 + 0x40000000;
		if (!var15.field1012) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg7 << 6) + arg4);
		if (arg4 == 22) {
			ZJNSWWFY var18;
			if (var15.field1010 == -1 && var15.field1005 == null) {
				var18 = var15.method408(22, arg7, var10, var11, var12, var13, -1);
			} else {
				var18 = new DYEBQOMK(var10, var15.field1010, true, var13, var12, arg7, 22, var11, arg2);
			}

			arg6.method455(arg0, var17, var16, arg9, arg3, var18, var14);

			if (var15.field1000 && var15.field1012) {
				arg8.method191(arg9, arg3);
			}
		} else if (arg4 == 10 || arg4 == 11) {
			ZJNSWWFY var19;
			if (var15.field1010 == -1 && var15.field1005 == null) {
				var19 = var15.method408(10, arg7, var10, var11, var12, var13, -1);
			} else {
				var19 = new DYEBQOMK(var10, var15.field1010, true, var13, var12, arg7, 10, var11, arg2);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg4 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg7 == 1 || arg7 == 3) {
					var21 = var15.field1017;
					var22 = var15.field987;
				} else {
					var21 = var15.field987;
					var22 = var15.field1017;
				}

				arg6.method459(var17, var14, var19, var16, arg9, var22, var20, arg0, var21, arg3);
			}

			if (var15.field1000) {
				arg8.method190(arg3, var15.field987, arg7, var15.field1017, arg9, var15.field1029);
			}
		} else if (arg4 >= 12) {
			ZJNSWWFY var23;
			if (var15.field1010 == -1 && var15.field1005 == null) {
				var23 = var15.method408(arg4, arg7, var10, var11, var12, var13, -1);
			} else {
				var23 = new DYEBQOMK(var10, var15.field1010, true, var13, var12, arg7, arg4, var11, arg2);
			}

			arg6.method459(var17, var14, var23, var16, arg9, 1, 0, arg0, 1, arg3);

			if (var15.field1000) {
				arg8.method190(arg3, var15.field987, arg7, var15.field1017, arg9, var15.field1029);
			}
		} else if (arg4 == 0) {
			ZJNSWWFY var24;
			if (var15.field1010 == -1 && var15.field1005 == null) {
				var24 = var15.method408(0, arg7, var10, var11, var12, var13, -1);
			} else {
				var24 = new DYEBQOMK(var10, var15.field1010, true, var13, var12, arg7, 0, var11, arg2);
			}

			arg6.method457(null, 0, var17, field685[arg7], arg3, var24, arg9, var16, var14, arg0);

			if (var15.field1000) {
				arg8.method189(arg7, arg3, arg9, var15.field1029, arg4);
			}
		} else if (arg4 == 1) {
			ZJNSWWFY var25;
			if (var15.field1010 == -1 && var15.field1005 == null) {
				var25 = var15.method408(1, arg7, var10, var11, var12, var13, -1);
			} else {
				var25 = new DYEBQOMK(var10, var15.field1010, true, var13, var12, arg7, 1, var11, arg2);
			}

			arg6.method457(null, 0, var17, field694[arg7], arg3, var25, arg9, var16, var14, arg0);

			if (var15.field1000) {
				arg8.method189(arg7, arg3, arg9, var15.field1029, arg4);
			}
		} else if (arg4 == 2) {
			int var26 = arg7 + 1 & 0x3;
			ZJNSWWFY var27;
			ZJNSWWFY var28;
			if (var15.field1010 == -1 && var15.field1005 == null) {
				var27 = var15.method408(2, arg7 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method408(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new DYEBQOMK(var10, var15.field1010, true, var13, var12, arg7 + 4, 2, var11, arg2);
				var28 = new DYEBQOMK(var10, var15.field1010, true, var13, var12, var26, 2, var11, arg2);
			}

			arg6.method457(var28, field685[var26], var17, field685[arg7], arg3, var27, arg9, var16, var14, arg0);

			if (var15.field1000) {
				arg8.method189(arg7, arg3, arg9, var15.field1029, arg4);
			}
		} else if (arg4 == 3) {
			ZJNSWWFY var29;
			if (var15.field1010 == -1 && var15.field1005 == null) {
				var29 = var15.method408(3, arg7, var10, var11, var12, var13, -1);
			} else {
				var29 = new DYEBQOMK(var10, var15.field1010, true, var13, var12, arg7, 3, var11, arg2);
			}

			arg6.method457(null, 0, var17, field694[arg7], arg3, var29, arg9, var16, var14, arg0);

			if (var15.field1000) {
				arg8.method189(arg7, arg3, arg9, var15.field1029, arg4);
			}
		} else if (arg4 == 9) {
			ZJNSWWFY var30;
			if (var15.field1010 == -1 && var15.field1005 == null) {
				var30 = var15.method408(arg4, arg7, var10, var11, var12, var13, -1);
			} else {
				var30 = new DYEBQOMK(var10, var15.field1010, true, var13, var12, arg7, arg4, var11, arg2);
			}

			arg6.method459(var17, var14, var30, var16, arg9, 1, 0, arg0, 1, arg3);

			if (var15.field1000) {
				arg8.method190(arg3, var15.field987, arg7, var15.field1017, arg9, var15.field1029);
			}
		} else {
			if (var15.field1018) {
				if (arg7 == 1) {
					int var31 = var13;
					var13 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var31;
				} else if (arg7 == 2) {
					int var32 = var13;
					var13 = var11;
					var11 = var32;
					int var33 = var12;
					var12 = var10;
					var10 = var33;
				} else if (arg7 == 3) {
					int var34 = var13;
					var13 = var10;
					var10 = var11;
					var11 = var12;
					var12 = var34;
				}
			}

			if (arg4 == 4) {
				ZJNSWWFY var35;
				if (var15.field1010 == -1 && var15.field1005 == null) {
					var35 = var15.method408(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new DYEBQOMK(var10, var15.field1010, true, var13, var12, 0, 4, var11, arg2);
				}

				arg6.method458(var17, var16, arg0, 0, 0, var35, arg7 * 512, field685[arg7], arg3, var14, arg9);
			} else if (arg4 == 5) {
				int var36 = 16;
				int var37 = arg6.method475(arg0, arg9, arg3);
				if (var37 > 0) {
					var36 = NRKXAGEB.method400(var37 >> 14 & 0x7FFF).field993;
				}

				ZJNSWWFY var38;
				if (var15.field1010 == -1 && var15.field1005 == null) {
					var38 = var15.method408(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new DYEBQOMK(var10, var15.field1010, true, var13, var12, 0, 4, var11, arg2);
				}

				arg6.method458(var17, var16, arg0, field692[arg7] * var36, field689[arg7] * var36, var38, arg7 * 512, field685[arg7], arg3, var14, arg9);
			} else if (arg4 == 6) {
				ZJNSWWFY var39;
				if (var15.field1010 == -1 && var15.field1005 == null) {
					var39 = var15.method408(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new DYEBQOMK(var10, var15.field1010, true, var13, var12, 0, 4, var11, arg2);
				}

				arg6.method458(var17, var16, arg0, 0, 0, var39, arg7, 256, arg3, var14, arg9);
			} else if (arg4 == 7) {
				ZJNSWWFY var40;
				if (var15.field1010 == -1 && var15.field1005 == null) {
					var40 = var15.method408(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new DYEBQOMK(var10, var15.field1010, true, var13, var12, 0, 4, var11, arg2);
				}

				arg6.method458(var17, var16, arg0, 0, 0, var40, arg7, 512, arg3, var14, arg9);
			} else if (arg4 == 8) {
				ZJNSWWFY var41;
				if (var15.field1010 == -1 && var15.field1005 == null) {
					var41 = var15.method408(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new DYEBQOMK(var10, var15.field1010, true, var13, var12, 0, 4, var11, arg2);
				}

				arg6.method458(var17, var16, arg0, 0, 0, var41, arg7, 768, arg3, var14, arg9);
			}
		}
	}

	@ObfuscatedName("GSYZIGPZ.a(ILTEXKPKZX;I[BIIII[LEAREBDMK;II)V")
	public final void method245(int arg0, TEXKPKZX arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, EAREBDMK[] arg8, int arg9) {
		NHEPCMLW var11 = new NHEPCMLW(arg3);
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
				if (arg2 == var18 && var17 >= arg5 && var17 < arg5 + 8 && var16 >= arg0 && var16 < arg0 + 8) {
					NRKXAGEB var22 = NRKXAGEB.method400(var12);
					int var23 = arg6 + UBZWFZFP.method502(var21, var22.field987, arg4, var16 & 0x7, var22.field1017, var17 & 0x7);
					int var24 = arg7 + UBZWFZFP.method503(arg4, var21, var17 & 0x7, var22.field987, var22.field1017, var16 & 0x7);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg9;
						if ((field684[1][var23][var24] & 0x2) == 2) {
							var25 = arg9 - 1;
						}

						EAREBDMK var26 = null;
						if (var25 >= 0) {
							var26 = arg8[var25];
						}

						method236(var26, arg1, var23, arg9, arg4 + var21 & 0x3, var20, var12, var24);
					}
				}
			}
		}
	}

	@ObfuscatedName("GSYZIGPZ.e(II)I")
	public static final int method246(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("GSYZIGPZ.a(Z[LEAREBDMK;LTEXKPKZX;)V")
	public final void method247(EAREBDMK[] arg0, TEXKPKZX arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field684[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field684[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg0[var6].method191(var4, var5);
						}
					}
				}
			}
		}

		field693 += (int) (Math.random() * 5.0D) - 2;
		if (field693 < -8) {
			field693 = -8;
		}

		if (field693 > 8) {
			field693 = 8;
		}

		field688 += (int) (Math.random() * 5.0D) - 2;
		if (field688 < -16) {
			field688 = -16;
		}

		if (field688 > 16) {
			field688 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field679[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field703 - 1; var16++) {
				for (int var17 = 1; var17 < field702 - 1; var17++) {
					int var18 = field691[var7][var17 + 1][var16] - field691[var7][var17 - 1][var16];
					int var19 = field691[var7][var17][var16 + 1] - field691[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field683[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field703; var26++) {
				field696[var26] = 0;
				field697[var26] = 0;
				field698[var26] = 0;
				field699[var26] = 0;
				field700[var26] = 0;
			}

			for (int var27 = -5; var27 < field702 + 5; var27++) {
				for (int var28 = 0; var28 < field703; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field702) {
						int var30 = field687[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							UMMMVDGS var31 = UMMMVDGS.field1277[var30 - 1];
							field696[var28] += var31.field1286;
							field697[var28] += var31.field1284;
							field698[var28] += var31.field1285;
							field699[var28] += var31.field1287;
							field700[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field702) {
						int var33 = field687[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							UMMMVDGS var34 = UMMMVDGS.field1277[var33 - 1];
							field696[var28] -= var34.field1286;
							field697[var28] -= var34.field1284;
							field698[var28] -= var34.field1285;
							field699[var28] -= var34.field1287;
							field700[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field702 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field703 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field703) {
							var35 += field696[var41];
							var36 += field697[var41];
							var37 += field698[var41];
							var38 += field699[var41];
							var39 += field700[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field703) {
							var35 -= field696[var42];
							var36 -= field697[var42];
							var37 -= field698[var42];
							var38 -= field699[var42];
							var39 -= field700[var42];
						}

						if (var40 >= 1 && var40 < field703 - 1 && (!field682 || (field684[0][var27][var40] & 0x2) != 0 || (field684[var7][var27][var40] & 0x10) == 0 && method235(var40, var27, var7) == field690)) {
							if (var7 < field701) {
								field701 = var7;
							}

							int var43 = field687[var7][var27][var40] & 0xFF;
							int var44 = field695[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field691[var7][var27][var40];
								int var46 = field691[var7][var27 + 1][var40];
								int var47 = field691[var7][var27 + 1][var40 + 1];
								int var48 = field691[var7][var27][var40 + 1];
								int var49 = field683[var27][var40];
								int var50 = field683[var27 + 1][var40];
								int var51 = field683[var27 + 1][var40 + 1];
								int var52 = field683[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method240(var55, var56, var57);
									var55 = field693 + var55 & 0xFF;
									var57 += field688;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method240(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field686[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !UMMMVDGS.field1277[var44 - 1].field1282) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field680[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = YFTZFAFG.field1450[method234(var54, 96)];
								}

								if (var44 == 0) {
									arg1.method454(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method234(var53, var49), method234(var53, var50), method234(var53, var51), method234(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field686[var7][var27][var40] + 1;
									byte var61 = field681[var7][var27][var40];
									UMMMVDGS var62 = UMMMVDGS.field1277[var44 - 1];
									int var63 = var62.field1280;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = YFTZFAFG.method562(var63);
										var65 = -1;
									} else if (var62.field1279 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method240(var62.field1283, var62.field1284, var62.field1285);
										var64 = YFTZFAFG.field1450[method243(var62.field1288, 96)];
									}

									arg1.method454(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method234(var53, var49), method234(var53, var50), method234(var53, var51), method234(var53, var52), method243(var65, var49), method243(var65, var50), method243(var65, var51), method243(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field703 - 1; var66++) {
				for (int var67 = 1; var67 < field702 - 1; var67++) {
					arg1.method453(var7, var67, var66, method235(var66, var67, var7));
				}
			}
		}

		arg1.method480(64, -50, -50, -10, 768);

		for (int var68 = 0; var68 < field702; var68++) {
			for (int var69 = 0; var69 < field703; var69++) {
				if ((field684[1][var68][var69] & 0x2) == 2) {
					arg1.method451(var68, var69);
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
				for (int var75 = 0; var75 <= field703; var75++) {
					for (int var76 = 0; var76 <= field702; var76++) {
						if ((field680[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field680[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field703 && (field680[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field680[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field680[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field691[var80][var76][var77] - var84;
								int var86 = field691[var79][var76][var77];
								TEXKPKZX.method452(var76 * 128, var85, 1, var78 * 128 + 128, var76 * 128, var86, var73, var77 * 128);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field680[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field680[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field680[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field702 && (field680[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field680[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field680[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field691[var92][var89][var75] - var96;
								int var98 = field691[var91][var89][var75];
								TEXKPKZX.method452(var89 * 128, var97, 2, var75 * 128, var90 * 128 + 128, var98, var73, var75 * 128);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field680[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field680[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field680[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field703 && (field680[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field680[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field702) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field680[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field691[var74][var101][var103];
								TEXKPKZX.method452(var101 * 128, var107, 4, var104 * 128 + 128, var102 * 128 + 128, var107, var73, var103 * 128);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field680[var74][var108][var109] &= ~var72;
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
