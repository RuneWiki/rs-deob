package deob;

@ObfuscatedName("MBPQTDOR")
public final class MBPQTDOR {

	@ObfuscatedName("MBPQTDOR.v")
	public int field881;

	@ObfuscatedName("MBPQTDOR.w")
	public int field882;

	@ObfuscatedName("MBPQTDOR.r")
	public int[][][] field877;

	@ObfuscatedName("MBPQTDOR.o")
	public byte[][][] field874;

	@ObfuscatedName("MBPQTDOR.z")
	public byte[][][] field885;

	@ObfuscatedName("MBPQTDOR.q")
	public byte[][][] field876;

	@ObfuscatedName("MBPQTDOR.x")
	public byte[][][] field883;

	@ObfuscatedName("MBPQTDOR.g")
	public byte[][][] field867;

	@ObfuscatedName("MBPQTDOR.t")
	public int[][][] field879;

	@ObfuscatedName("MBPQTDOR.A")
	public byte[][][] field886;

	@ObfuscatedName("MBPQTDOR.e")
	public int[][] field865;

	@ObfuscatedName("MBPQTDOR.j")
	public int[] field869;

	@ObfuscatedName("MBPQTDOR.k")
	public int[] field870;

	@ObfuscatedName("MBPQTDOR.l")
	public int[] field871;

	@ObfuscatedName("MBPQTDOR.m")
	public int[] field872;

	@ObfuscatedName("MBPQTDOR.n")
	public int[] field873;

	@ObfuscatedName("MBPQTDOR.c")
	public static boolean field863 = true;

	@ObfuscatedName("MBPQTDOR.d")
	public static final int[] field864 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("MBPQTDOR.f")
	public static final int[] field866 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("MBPQTDOR.h")
	public static final int[] field868 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("MBPQTDOR.p")
	public static final int[] field875 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("MBPQTDOR.u")
	public static int field880 = 99;

	@ObfuscatedName("MBPQTDOR.s")
	public static int field878 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("MBPQTDOR.y")
	public static int field884 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("MBPQTDOR.b")
	public static int field862;

	@ObfuscatedName("MBPQTDOR.a(I[LGDVKBIIV;IIII[B)V")
	public final void method312(int arg0, GDVKBIIV[] arg1, int arg2, int arg3, int arg4, byte[] arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg2 + var8 > 0 && arg2 + var8 < 103 && arg4 + var9 > 0 && arg4 + var9 < 103) {
						arg1[var7].field711[arg2 + var8][arg4 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		YOXDZEVD var10 = new YOXDZEVD(arg5);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method330(arg0, arg3, arg4 + var13, var11, arg2 + var12, 0, var10);
				}
			}
		}
	}

	@ObfuscatedName("MBPQTDOR.a(IIII)I")
	public int method313(int arg0, int arg1, int arg2) {
		if ((field874[arg2][arg0][arg1] & 0x8) != 0) {
			return 0;
		}

		if (arg2 > 0 && (field874[1][arg0][arg1] & 0x2) != 0) {
			return arg2 - 1;
		}

		return arg2;
	}

	@ObfuscatedName("MBPQTDOR.a(II[BI)Z")
	public static final boolean method314(int arg0, byte[] arg1, int arg2) {
		boolean var3 = true;
		YOXDZEVD var4 = new YOXDZEVD(arg1);
		int var5 = -1;
		while (true) {
			int var6 = var4.method563();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method563();
					if (var9 == 0) {
						break;
					}

					var4.method549();
				} else {
					int var10 = var4.method563();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method549() >> 2;
					int var14 = arg2 + var12;
					int var15 = arg0 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						SHDUUMNW var16 = SHDUUMNW.method410(var5);
						if (var13 != 22 || !field863 || var16.field1109 || var16.field1092) {
							var3 &= var16.method413();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("MBPQTDOR.a(II)I")
	public static final int method315(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("MBPQTDOR.a(III)Z")
	public static final boolean method316(int arg0, int arg1) {
		SHDUUMNW var2 = SHDUUMNW.method410(arg1);

		if (arg0 == 11) {
			arg0 = 10;
		}

		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}

		return var2.method411(arg0);
	}

	@ObfuscatedName("MBPQTDOR.a(ZLUUFZOKXH;LYOXDZEVD;)V")
	public static final void method317(UUFZOKXH arg0, YOXDZEVD arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg1.method563();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			SHDUUMNW var4 = SHDUUMNW.method410(var2);
			var4.method403(arg0);

			while (true) {
				int var5 = arg1.method563();
				if (var5 == 0) {
					break;
				}

				arg1.method549();
			}
		}
	}

	@ObfuscatedName("MBPQTDOR.b(II)I")
	public static final int method318(int arg0, int arg1) {
		int var2 = method315(arg0 - 1, arg1 - 1) + method315(arg0 + 1, arg1 - 1) + method315(arg0 - 1, arg1 + 1) + method315(arg0 + 1, arg1 + 1);
		int var3 = method315(arg0 - 1, arg1) + method315(arg0 + 1, arg1) + method315(arg0, arg1 - 1) + method315(arg0, arg1 + 1);
		int var4 = method315(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("MBPQTDOR.a(I[LGDVKBIIV;IIIIZII[B)V")
	public final void method319(int arg0, GDVKBIIV[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg5 + var10 > 0 && arg5 + var10 < 103 && arg7 + var11 > 0 && arg7 + var11 < 103) {
					arg1[arg0].field711[arg5 + var10][arg7 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		YOXDZEVD var12 = new YOXDZEVD(arg8);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg3 == var13 && var14 >= arg2 && var14 < arg2 + 8 && var15 >= arg4 && var15 < arg4 + 8) {
						method330(0, 0, arg7 + UHMILBUY.method427(var14 & 0x7, var15 & 0x7, arg6), arg0, arg5 + UHMILBUY.method426(arg6, var15 & 0x7, var14 & 0x7), arg6, var12);
					} else {
						method330(0, 0, -1, 0, -1, 0, var12);
					}
				}
			}
		}
	}

	@ObfuscatedName("MBPQTDOR.a(II[LGDVKBIIV;[BZLVNYQVBWD;)V")
	public final void method320(int arg0, int arg1, GDVKBIIV[] arg2, byte[] arg3, VNYQVBWD arg4) {
		YOXDZEVD var6 = new YOXDZEVD(arg3);
		int var7 = -1;
		while (true) {
			int var8 = var6.method563();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method563();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method549();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg1 + var12;
				int var18 = arg0 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field874[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					GDVKBIIV var20 = null;
					if (var19 >= 0) {
						var20 = arg2[var19];
					}

					method331(arg4, var15, var13, var7, var20, var16, var17, var18);
				}
			}
		}
	}

	public MBPQTDOR(byte[][][] arg0, int[][][] arg1, int arg2, int arg3) {
		field880 = 99;
		field881 = arg2;
		field882 = arg3;
		field877 = arg1;
		field874 = arg0;
		field885 = new byte[4][field881][field882];
		field876 = new byte[4][field881][field882];
		field883 = new byte[4][field881][field882];
		field867 = new byte[4][field881][field882];
		field879 = new int[4][field881 + 1][field882 + 1];
		field886 = new byte[4][field881 + 1][field882 + 1];
		field865 = new int[field881 + 1][field882 + 1];
		field869 = new int[field882];
		field870 = new int[field882];
		field871 = new int[field882];
		field872 = new int[field882];
		field873 = new int[field882];
	}

	@ObfuscatedName("MBPQTDOR.b(III)I")
	public static final int method321(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method318(var3, var5);
		int var8 = method318(var3 + 1, var5);
		int var9 = method318(var3, var5 + 1);
		int var10 = method318(var3 + 1, var5 + 1);
		int var11 = method324(var7, var8, var4, arg2);
		int var12 = method324(var9, var10, var4, arg2);
		return method324(var11, var12, var6, arg2);
	}

	@ObfuscatedName("MBPQTDOR.a(ILVNYQVBWD;IIIII[B[LGDVKBIIV;II)V")
	public final void method322(VNYQVBWD arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, GDVKBIIV[] arg7, int arg8, int arg9) {
		YOXDZEVD var11 = new YOXDZEVD(arg6);
		int var12 = -1;
		while (true) {
			int var13 = var11.method563();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method563();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method549();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg9 == var18 && var17 >= arg3 && var17 < arg3 + 8 && var16 >= arg4 && var16 < arg4 + 8) {
					SHDUUMNW var22 = SHDUUMNW.method410(var12);
					int var23 = arg8 + UHMILBUY.method428(var22.field1125, var17 & 0x7, var22.field1094, arg2, var16 & 0x7);
					int var24 = arg5 + UHMILBUY.method429(arg2, var16 & 0x7, var22.field1094, var17 & 0x7, var22.field1125);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = var18;
						if ((field874[1][var23][var24] & 0x2) == 2) {
							var25 = var18 - 1;
						}

						GDVKBIIV var26 = null;
						if (var25 >= 0) {
							var26 = arg7[var25];
						}

						method331(arg0, var20, var18, var12, var26, arg2 + var21 & 0x3, var23, var24);
					}
				}
			}
		}
	}

	@ObfuscatedName("MBPQTDOR.a(LGDVKBIIV;IIIIILVNYQVBWD;II[[[II)V")
	public static final void method323(GDVKBIIV arg0, int arg1, int arg2, int arg3, int arg4, int arg5, VNYQVBWD arg6, int arg7, int[][][] arg8, int arg9) {
		int var10 = arg8[arg4][arg2][arg1];
		int var11 = arg8[arg4][arg2 + 1][arg1];
		int var12 = arg8[arg4][arg2 + 1][arg1 + 1];
		int var13 = arg8[arg4][arg2][arg1 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		SHDUUMNW var15 = SHDUUMNW.method410(arg7);
		int var16 = (arg7 << 14) + (arg1 << 7) + arg2 + 0x40000000;
		if (!var15.field1109) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg3 << 6) + arg5);
		if (arg5 == 22) {
			YDNCHMHU var18;
			if (var15.field1088 == -1 && var15.field1090 == null) {
				var18 = var15.method405(22, arg3, var10, var11, var12, var13, -1);
			} else {
				var18 = new CAXQGHNZ(arg3, var12, 22, true, var15.field1088, arg7, var10, var11, var13);
			}

			arg6.method463(arg1, arg2, var16, var18, var17, var14, arg9);

			if (var15.field1093 && var15.field1109) {
				arg0.method218(arg1, arg2);
			}
		} else if (arg5 == 10 || arg5 == 11) {
			YDNCHMHU var19;
			if (var15.field1088 == -1 && var15.field1090 == null) {
				var19 = var15.method405(10, arg3, var10, var11, var12, var13, -1);
			} else {
				var19 = new CAXQGHNZ(arg3, var12, 10, true, var15.field1088, arg7, var10, var11, var13);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg5 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg3 == 1 || arg3 == 3) {
					var21 = var15.field1094;
					var22 = var15.field1125;
				} else {
					var21 = var15.field1125;
					var22 = var15.field1094;
				}

				arg6.method467(var19, var20, var21, var17, var22, var14, arg9, arg1, arg2, var16);
			}

			if (var15.field1093) {
				arg0.method217(arg3, var15.field1094, arg1, var15.field1125, arg2, var15.field1129);
			}
		} else if (arg5 >= 12) {
			YDNCHMHU var23;
			if (var15.field1088 == -1 && var15.field1090 == null) {
				var23 = var15.method405(arg5, arg3, var10, var11, var12, var13, -1);
			} else {
				var23 = new CAXQGHNZ(arg3, var12, arg5, true, var15.field1088, arg7, var10, var11, var13);
			}

			arg6.method467(var23, 0, 1, var17, 1, var14, arg9, arg1, arg2, var16);

			if (var15.field1093) {
				arg0.method217(arg3, var15.field1094, arg1, var15.field1125, arg2, var15.field1129);
			}
		} else if (arg5 == 0) {
			YDNCHMHU var24;
			if (var15.field1088 == -1 && var15.field1090 == null) {
				var24 = var15.method405(0, arg3, var10, var11, var12, var13, -1);
			} else {
				var24 = new CAXQGHNZ(arg3, var12, 0, true, var15.field1088, arg7, var10, var11, var13);
			}

			arg6.method465(var17, field875[arg3], null, arg9, 0, var14, arg1, var24, arg2, var16);

			if (var15.field1093) {
				arg0.method216(arg1, var15.field1129, arg5, arg3, arg2);
			}
		} else if (arg5 == 1) {
			YDNCHMHU var25;
			if (var15.field1088 == -1 && var15.field1090 == null) {
				var25 = var15.method405(1, arg3, var10, var11, var12, var13, -1);
			} else {
				var25 = new CAXQGHNZ(arg3, var12, 1, true, var15.field1088, arg7, var10, var11, var13);
			}

			arg6.method465(var17, field864[arg3], null, arg9, 0, var14, arg1, var25, arg2, var16);

			if (var15.field1093) {
				arg0.method216(arg1, var15.field1129, arg5, arg3, arg2);
			}
		} else if (arg5 == 2) {
			int var26 = arg3 + 1 & 0x3;
			YDNCHMHU var27;
			YDNCHMHU var28;
			if (var15.field1088 == -1 && var15.field1090 == null) {
				var27 = var15.method405(2, arg3 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method405(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new CAXQGHNZ(arg3 + 4, var12, 2, true, var15.field1088, arg7, var10, var11, var13);
				var28 = new CAXQGHNZ(var26, var12, 2, true, var15.field1088, arg7, var10, var11, var13);
			}

			arg6.method465(var17, field875[arg3], var28, arg9, field875[var26], var14, arg1, var27, arg2, var16);

			if (var15.field1093) {
				arg0.method216(arg1, var15.field1129, arg5, arg3, arg2);
			}
		} else if (arg5 == 3) {
			YDNCHMHU var29;
			if (var15.field1088 == -1 && var15.field1090 == null) {
				var29 = var15.method405(3, arg3, var10, var11, var12, var13, -1);
			} else {
				var29 = new CAXQGHNZ(arg3, var12, 3, true, var15.field1088, arg7, var10, var11, var13);
			}

			arg6.method465(var17, field864[arg3], null, arg9, 0, var14, arg1, var29, arg2, var16);

			if (var15.field1093) {
				arg0.method216(arg1, var15.field1129, arg5, arg3, arg2);
			}
		} else if (arg5 == 9) {
			YDNCHMHU var30;
			if (var15.field1088 == -1 && var15.field1090 == null) {
				var30 = var15.method405(arg5, arg3, var10, var11, var12, var13, -1);
			} else {
				var30 = new CAXQGHNZ(arg3, var12, arg5, true, var15.field1088, arg7, var10, var11, var13);
			}

			arg6.method467(var30, 0, 1, var17, 1, var14, arg9, arg1, arg2, var16);

			if (var15.field1093) {
				arg0.method217(arg3, var15.field1094, arg1, var15.field1125, arg2, var15.field1129);
			}
		} else {
			if (var15.field1118) {
				if (arg3 == 1) {
					int var31 = var13;
					var13 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var31;
				} else if (arg3 == 2) {
					int var32 = var13;
					var13 = var11;
					var11 = var32;
					int var33 = var12;
					var12 = var10;
					var10 = var33;
				} else if (arg3 == 3) {
					int var34 = var13;
					var13 = var10;
					var10 = var11;
					var11 = var12;
					var12 = var34;
				}
			}

			if (arg5 == 4) {
				YDNCHMHU var35;
				if (var15.field1088 == -1 && var15.field1090 == null) {
					var35 = var15.method405(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new CAXQGHNZ(0, var12, 4, true, var15.field1088, arg7, var10, var11, var13);
				}

				arg6.method466(var35, field875[arg3], var16, 0, arg3 * 512, arg2, var17, arg1, 0, arg9, var14);
			} else if (arg5 == 5) {
				int var36 = 16;
				int var37 = arg6.method483(arg9, arg2, arg1);
				if (var37 > 0) {
					var36 = SHDUUMNW.method410(var37 >> 14 & 0x7FFF).field1116;
				}

				YDNCHMHU var38;
				if (var15.field1088 == -1 && var15.field1090 == null) {
					var38 = var15.method405(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new CAXQGHNZ(0, var12, 4, true, var15.field1088, arg7, var10, var11, var13);
				}

				arg6.method466(var38, field875[arg3], var16, field866[arg3] * var36, arg3 * 512, arg2, var17, arg1, field868[arg3] * var36, arg9, var14);
			} else if (arg5 == 6) {
				YDNCHMHU var39;
				if (var15.field1088 == -1 && var15.field1090 == null) {
					var39 = var15.method405(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new CAXQGHNZ(0, var12, 4, true, var15.field1088, arg7, var10, var11, var13);
				}

				arg6.method466(var39, 256, var16, 0, arg3, arg2, var17, arg1, 0, arg9, var14);
			} else if (arg5 == 7) {
				YDNCHMHU var40;
				if (var15.field1088 == -1 && var15.field1090 == null) {
					var40 = var15.method405(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new CAXQGHNZ(0, var12, 4, true, var15.field1088, arg7, var10, var11, var13);
				}

				arg6.method466(var40, 512, var16, 0, arg3, arg2, var17, arg1, 0, arg9, var14);
			} else if (arg5 == 8) {
				YDNCHMHU var41;
				if (var15.field1088 == -1 && var15.field1090 == null) {
					var41 = var15.method405(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new CAXQGHNZ(0, var12, 4, true, var15.field1088, arg7, var10, var11, var13);
				}

				arg6.method466(var41, 768, var16, 0, arg3, arg2, var17, arg1, 0, arg9, var14);
			}
		}
	}

	@ObfuscatedName("MBPQTDOR.b(IIII)I")
	public static final int method324(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - LLQSXMOX.field849[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("MBPQTDOR.c(II)I")
	public static final int method325(int arg0, int arg1) {
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

	@ObfuscatedName("MBPQTDOR.c(III)I")
	public final int method326(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("MBPQTDOR.d(II)I")
	public final int method327(int arg0, int arg1) {
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

	@ObfuscatedName("MBPQTDOR.e(II)I")
	public static final int method328(int arg0, int arg1) {
		int var2 = method321(arg0 + 45365, arg1 + 91923, 4) + (method321(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method321(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("MBPQTDOR.a(ZIIII)V")
	public final void method329(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg2; var5 <= arg1 + arg2; var5++) {
			for (int var6 = arg3; var6 <= arg0 + arg3; var6++) {
				if (var6 >= 0 && var6 < field881 && var5 >= 0 && var5 < field882) {
					field886[0][var6][var5] = 127;

					if (arg3 == var6 && var6 > 0) {
						field877[0][var6][var5] = field877[0][var6 - 1][var5];
					}

					if (arg0 + arg3 == var6 && var6 < field881 - 1) {
						field877[0][var6][var5] = field877[0][var6 + 1][var5];
					}

					if (arg2 == var5 && var5 > 0) {
						field877[0][var6][var5] = field877[0][var6][var5 - 1];
					}

					if (arg1 + arg2 == var5 && var5 < field882 - 1) {
						field877[0][var6][var5] = field877[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("MBPQTDOR.a(IIIIIIILYOXDZEVD;)V")
	public final void method330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, YOXDZEVD arg6) {
		if (arg4 >= 0 && arg4 < 104 && arg2 >= 0 && arg2 < 104) {
			field874[arg3][arg4][arg2] = 0;
			while (true) {
				int var8 = arg6.method549();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg6.method549();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg3 == 0) {
						field877[0][arg4][arg2] = -var9 * 8;
						return;
					}

					field877[arg3][arg4][arg2] = field877[arg3 - 1][arg4][arg2] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field876[arg3][arg4][arg2] = arg6.method550();
					field883[arg3][arg4][arg2] = (byte) ((var8 - 2) / 4);
					field867[arg3][arg4][arg2] = (byte) (var8 + arg5 - 2 & 0x3);
				} else if (var8 <= 81) {
					field874[arg3][arg4][arg2] = (byte) (var8 - 49);
				} else {
					field885[arg3][arg4][arg2] = (byte) (var8 - 81);
				}
			}

			if (arg3 == 0) {
				field877[0][arg4][arg2] = -method328(arg4 + arg1 + 932731, arg2 + 556238 + arg0) * 8;
			} else {
				field877[arg3][arg4][arg2] = field877[arg3 - 1][arg4][arg2] - 240;
			}
		} else {
			while (true) {
				int var10 = arg6.method549();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg6.method549();
					return;
				}

				if (var10 <= 49) {
					arg6.method549();
				}
			}
		}
	}

	@ObfuscatedName("MBPQTDOR.a(LVNYQVBWD;IIIBLGDVKBIIV;III)V")
	public final void method331(VNYQVBWD arg0, int arg1, int arg2, int arg3, GDVKBIIV arg4, int arg5, int arg6, int arg7) {
		if (field863 && (field874[0][arg6][arg7] & 0x2) == 0) {
			if ((field874[arg2][arg6][arg7] & 0x10) != 0) {
				return;
			}

			if (method313(arg6, arg7, arg2) != field862) {
				return;
			}
		}

		if (arg2 < field880) {
			field880 = arg2;
		}

		int var9 = field877[arg2][arg6][arg7];
		int var10 = field877[arg2][arg6 + 1][arg7];
		int var11 = field877[arg2][arg6 + 1][arg7 + 1];
		int var12 = field877[arg2][arg6][arg7 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		SHDUUMNW var14 = SHDUUMNW.method410(arg3);
		int var15 = (arg3 << 14) + (arg7 << 7) + arg6 + 0x40000000;
		if (!var14.field1109) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg5 << 6) + arg1);
		if (arg1 == 22) {
			if (!field863 || var14.field1109 || var14.field1092) {
				YDNCHMHU var17;
				if (var14.field1088 == -1 && var14.field1090 == null) {
					var17 = var14.method405(22, arg5, var9, var10, var11, var12, -1);
				} else {
					var17 = new CAXQGHNZ(arg5, var11, 22, true, var14.field1088, arg3, var9, var10, var12);
				}

				arg0.method463(arg7, arg6, var15, var17, var16, var13, arg2);

				if (var14.field1093 && var14.field1109 && arg4 != null) {
					arg4.method218(arg7, arg6);
				}
			}
		} else if (arg1 == 10 || arg1 == 11) {
			YDNCHMHU var18;
			if (var14.field1088 == -1 && var14.field1090 == null) {
				var18 = var14.method405(10, arg5, var9, var10, var11, var12, -1);
			} else {
				var18 = new CAXQGHNZ(arg5, var11, 10, true, var14.field1088, arg3, var9, var10, var12);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg1 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg5 == 1 || arg5 == 3) {
					var20 = var14.field1094;
					var21 = var14.field1125;
				} else {
					var20 = var14.field1125;
					var21 = var14.field1094;
				}

				if (arg0.method467(var18, var19, var20, var16, var21, var13, arg2, arg7, arg6, var15) && var14.field1100) {
					OIBEFFXI var22;
					if (var18 instanceof OIBEFFXI) {
						var22 = (OIBEFFXI) var18;
					} else {
						var22 = var14.method405(10, arg5, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field977 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field886[arg2][arg6 + var23][arg7 + var24]) {
									field886[arg2][arg6 + var23][arg7 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field1093 && arg4 != null) {
				arg4.method217(arg5, var14.field1094, arg7, var14.field1125, arg6, var14.field1129);
			}
		} else if (arg1 >= 12) {
			YDNCHMHU var26;
			if (var14.field1088 == -1 && var14.field1090 == null) {
				var26 = var14.method405(arg1, arg5, var9, var10, var11, var12, -1);
			} else {
				var26 = new CAXQGHNZ(arg5, var11, arg1, true, var14.field1088, arg3, var9, var10, var12);
			}

			arg0.method467(var26, 0, 1, var16, 1, var13, arg2, arg7, arg6, var15);

			if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg2 > 0) {
				field879[arg2][arg6][arg7] |= 0x924;
			}

			if (var14.field1093 && arg4 != null) {
				arg4.method217(arg5, var14.field1094, arg7, var14.field1125, arg6, var14.field1129);
			}
		} else if (arg1 == 0) {
			YDNCHMHU var27;
			if (var14.field1088 == -1 && var14.field1090 == null) {
				var27 = var14.method405(0, arg5, var9, var10, var11, var12, -1);
			} else {
				var27 = new CAXQGHNZ(arg5, var11, 0, true, var14.field1088, arg3, var9, var10, var12);
			}

			arg0.method465(var16, field875[arg5], null, arg2, 0, var13, arg7, var27, arg6, var15);

			if (arg5 == 0) {
				if (var14.field1100) {
					field886[arg2][arg6][arg7] = 50;
					field886[arg2][arg6][arg7 + 1] = 50;
				}

				if (var14.field1103) {
					field879[arg2][arg6][arg7] |= 0x249;
				}
			} else if (arg5 == 1) {
				if (var14.field1100) {
					field886[arg2][arg6][arg7 + 1] = 50;
					field886[arg2][arg6 + 1][arg7 + 1] = 50;
				}

				if (var14.field1103) {
					field879[arg2][arg6][arg7 + 1] |= 0x492;
				}
			} else if (arg5 == 2) {
				if (var14.field1100) {
					field886[arg2][arg6 + 1][arg7] = 50;
					field886[arg2][arg6 + 1][arg7 + 1] = 50;
				}

				if (var14.field1103) {
					field879[arg2][arg6 + 1][arg7] |= 0x249;
				}
			} else if (arg5 == 3) {
				if (var14.field1100) {
					field886[arg2][arg6][arg7] = 50;
					field886[arg2][arg6 + 1][arg7] = 50;
				}

				if (var14.field1103) {
					field879[arg2][arg6][arg7] |= 0x492;
				}
			}

			if (var14.field1093 && arg4 != null) {
				arg4.method216(arg7, var14.field1129, arg1, arg5, arg6);
			}

			if (var14.field1116 != 16) {
				arg0.method473(arg6, arg2, var14.field1116, arg7);
			}
		} else if (arg1 == 1) {
			YDNCHMHU var28;
			if (var14.field1088 == -1 && var14.field1090 == null) {
				var28 = var14.method405(1, arg5, var9, var10, var11, var12, -1);
			} else {
				var28 = new CAXQGHNZ(arg5, var11, 1, true, var14.field1088, arg3, var9, var10, var12);
			}

			arg0.method465(var16, field864[arg5], null, arg2, 0, var13, arg7, var28, arg6, var15);

			if (var14.field1100) {
				if (arg5 == 0) {
					field886[arg2][arg6][arg7 + 1] = 50;
				} else if (arg5 == 1) {
					field886[arg2][arg6 + 1][arg7 + 1] = 50;
				} else if (arg5 == 2) {
					field886[arg2][arg6 + 1][arg7] = 50;
				} else if (arg5 == 3) {
					field886[arg2][arg6][arg7] = 50;
				}
			}

			if (var14.field1093 && arg4 != null) {
				arg4.method216(arg7, var14.field1129, arg1, arg5, arg6);
			}
		} else if (arg1 == 2) {
			int var29 = arg5 + 1 & 0x3;
			YDNCHMHU var30;
			YDNCHMHU var31;
			if (var14.field1088 == -1 && var14.field1090 == null) {
				var30 = var14.method405(2, arg5 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method405(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new CAXQGHNZ(arg5 + 4, var11, 2, true, var14.field1088, arg3, var9, var10, var12);
				var31 = new CAXQGHNZ(var29, var11, 2, true, var14.field1088, arg3, var9, var10, var12);
			}

			arg0.method465(var16, field875[arg5], var31, arg2, field875[var29], var13, arg7, var30, arg6, var15);

			if (var14.field1103) {
				if (arg5 == 0) {
					field879[arg2][arg6][arg7] |= 0x249;
					field879[arg2][arg6][arg7 + 1] |= 0x492;
				} else if (arg5 == 1) {
					field879[arg2][arg6][arg7 + 1] |= 0x492;
					field879[arg2][arg6 + 1][arg7] |= 0x249;
				} else if (arg5 == 2) {
					field879[arg2][arg6 + 1][arg7] |= 0x249;
					field879[arg2][arg6][arg7] |= 0x492;
				} else if (arg5 == 3) {
					field879[arg2][arg6][arg7] |= 0x492;
					field879[arg2][arg6][arg7] |= 0x249;
				}
			}

			if (var14.field1093 && arg4 != null) {
				arg4.method216(arg7, var14.field1129, arg1, arg5, arg6);
			}

			if (var14.field1116 != 16) {
				arg0.method473(arg6, arg2, var14.field1116, arg7);
			}
		} else if (arg1 == 3) {
			YDNCHMHU var32;
			if (var14.field1088 == -1 && var14.field1090 == null) {
				var32 = var14.method405(3, arg5, var9, var10, var11, var12, -1);
			} else {
				var32 = new CAXQGHNZ(arg5, var11, 3, true, var14.field1088, arg3, var9, var10, var12);
			}

			arg0.method465(var16, field864[arg5], null, arg2, 0, var13, arg7, var32, arg6, var15);

			if (var14.field1100) {
				if (arg5 == 0) {
					field886[arg2][arg6][arg7 + 1] = 50;
				} else if (arg5 == 1) {
					field886[arg2][arg6 + 1][arg7 + 1] = 50;
				} else if (arg5 == 2) {
					field886[arg2][arg6 + 1][arg7] = 50;
				} else if (arg5 == 3) {
					field886[arg2][arg6][arg7] = 50;
				}
			}

			if (var14.field1093 && arg4 != null) {
				arg4.method216(arg7, var14.field1129, arg1, arg5, arg6);
			}
		} else if (arg1 == 9) {
			YDNCHMHU var33;
			if (var14.field1088 == -1 && var14.field1090 == null) {
				var33 = var14.method405(arg1, arg5, var9, var10, var11, var12, -1);
			} else {
				var33 = new CAXQGHNZ(arg5, var11, arg1, true, var14.field1088, arg3, var9, var10, var12);
			}

			arg0.method467(var33, 0, 1, var16, 1, var13, arg2, arg7, arg6, var15);

			if (var14.field1093 && arg4 != null) {
				arg4.method217(arg5, var14.field1094, arg7, var14.field1125, arg6, var14.field1129);
			}
		} else {
			if (var14.field1118) {
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
				YDNCHMHU var38;
				if (var14.field1088 == -1 && var14.field1090 == null) {
					var38 = var14.method405(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new CAXQGHNZ(0, var11, 4, true, var14.field1088, arg3, var9, var10, var12);
				}

				arg0.method466(var38, field875[arg5], var15, 0, arg5 * 512, arg6, var16, arg7, 0, arg2, var13);
			} else if (arg1 == 5) {
				int var39 = 16;
				int var40 = arg0.method483(arg2, arg6, arg7);
				if (var40 > 0) {
					var39 = SHDUUMNW.method410(var40 >> 14 & 0x7FFF).field1116;
				}

				YDNCHMHU var41;
				if (var14.field1088 == -1 && var14.field1090 == null) {
					var41 = var14.method405(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new CAXQGHNZ(0, var11, 4, true, var14.field1088, arg3, var9, var10, var12);
				}

				arg0.method466(var41, field875[arg5], var15, field866[arg5] * var39, arg5 * 512, arg6, var16, arg7, field868[arg5] * var39, arg2, var13);
			} else if (arg1 == 6) {
				YDNCHMHU var42;
				if (var14.field1088 == -1 && var14.field1090 == null) {
					var42 = var14.method405(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new CAXQGHNZ(0, var11, 4, true, var14.field1088, arg3, var9, var10, var12);
				}

				arg0.method466(var42, 256, var15, 0, arg5, arg6, var16, arg7, 0, arg2, var13);
			} else if (arg1 == 7) {
				YDNCHMHU var43;
				if (var14.field1088 == -1 && var14.field1090 == null) {
					var43 = var14.method405(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new CAXQGHNZ(0, var11, 4, true, var14.field1088, arg3, var9, var10, var12);
				}

				arg0.method466(var43, 512, var15, 0, arg5, arg6, var16, arg7, 0, arg2, var13);
			} else if (arg1 == 8) {
				YDNCHMHU var44;
				if (var14.field1088 == -1 && var14.field1090 == null) {
					var44 = var14.method405(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new CAXQGHNZ(0, var11, 4, true, var14.field1088, arg3, var9, var10, var12);
				}

				arg0.method466(var44, 768, var15, 0, arg5, arg6, var16, arg7, 0, arg2, var13);
			}
		}
	}

	@ObfuscatedName("MBPQTDOR.a(LVNYQVBWD;B[LGDVKBIIV;)V")
	public final void method332(VNYQVBWD arg0, GDVKBIIV[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field874[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field874[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method218(var5, var4);
						}
					}
				}
			}
		}

		field884 += (int) (Math.random() * 5.0D) - 2;
		if (field884 < -8) {
			field884 = -8;
		}

		if (field884 > 8) {
			field884 = 8;
		}

		field878 += (int) (Math.random() * 5.0D) - 2;
		if (field878 < -16) {
			field878 = -16;
		}

		if (field878 > 16) {
			field878 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field886[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field882 - 1; var16++) {
				for (int var17 = 1; var17 < field881 - 1; var17++) {
					int var18 = field877[var7][var17 + 1][var16] - field877[var7][var17 - 1][var16];
					int var19 = field877[var7][var17][var16 + 1] - field877[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field865[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field882; var26++) {
				field869[var26] = 0;
				field870[var26] = 0;
				field871[var26] = 0;
				field872[var26] = 0;
				field873[var26] = 0;
			}

			for (int var27 = -5; var27 < field881 + 5; var27++) {
				for (int var28 = 0; var28 < field882; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field881) {
						int var30 = field885[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							XDCFWJPT var31 = XDCFWJPT.field1318[var30 - 1];
							field869[var28] += var31.field1327;
							field870[var28] += var31.field1325;
							field871[var28] += var31.field1326;
							field872[var28] += var31.field1328;
							field873[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field881) {
						int var33 = field885[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							XDCFWJPT var34 = XDCFWJPT.field1318[var33 - 1];
							field869[var28] -= var34.field1327;
							field870[var28] -= var34.field1325;
							field871[var28] -= var34.field1326;
							field872[var28] -= var34.field1328;
							field873[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field881 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field882 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field882) {
							var35 += field869[var41];
							var36 += field870[var41];
							var37 += field871[var41];
							var38 += field872[var41];
							var39 += field873[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field882) {
							var35 -= field869[var42];
							var36 -= field870[var42];
							var37 -= field871[var42];
							var38 -= field872[var42];
							var39 -= field873[var42];
						}

						if (var40 >= 1 && var40 < field882 - 1 && (!field863 || (field874[0][var27][var40] & 0x2) != 0 || (field874[var7][var27][var40] & 0x10) == 0 && method313(var27, var40, var7) == field862)) {
							if (var7 < field880) {
								field880 = var7;
							}

							int var43 = field885[var7][var27][var40] & 0xFF;
							int var44 = field876[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field877[var7][var27][var40];
								int var46 = field877[var7][var27 + 1][var40];
								int var47 = field877[var7][var27 + 1][var40 + 1];
								int var48 = field877[var7][var27][var40 + 1];
								int var49 = field865[var27][var40];
								int var50 = field865[var27 + 1][var40];
								int var51 = field865[var27 + 1][var40 + 1];
								int var52 = field865[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method326(var55, var56, var57);
									var55 = field884 + var55 & 0xFF;
									var57 += field878;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method326(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field883[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !XDCFWJPT.field1318[var44 - 1].field1323) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field879[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = LLQSXMOX.field860[method325(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method462(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method325(var53, var49), method325(var53, var50), method325(var53, var51), method325(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field883[var7][var27][var40] + 1;
									byte var61 = field867[var7][var27][var40];
									XDCFWJPT var62 = XDCFWJPT.field1318[var44 - 1];
									int var63 = var62.field1321;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = LLQSXMOX.method301(var63);
										var65 = -1;
									} else if (var62.field1320 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method326(var62.field1324, var62.field1325, var62.field1326);
										var64 = LLQSXMOX.field860[method327(var62.field1329, 96)];
									}

									arg0.method462(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method325(var53, var49), method325(var53, var50), method325(var53, var51), method325(var53, var52), method327(var65, var49), method327(var65, var50), method327(var65, var51), method327(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field882 - 1; var66++) {
				for (int var67 = 1; var67 < field881 - 1; var67++) {
					arg0.method461(var7, var67, var66, method313(var67, var66, var7));
				}
			}
		}

		arg0.method488(-10, -50, -50, 64, 768);

		for (int var68 = 0; var68 < field881; var68++) {
			for (int var69 = 0; var69 < field882; var69++) {
				if ((field874[1][var68][var69] & 0x2) == 2) {
					arg0.method459(var69, var68);
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
				for (int var75 = 0; var75 <= field882; var75++) {
					for (int var76 = 0; var76 <= field881; var76++) {
						if ((field879[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field879[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field882 && (field879[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field879[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field879[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field877[var80][var76][var77] - var84;
								int var86 = field877[var79][var76][var77];
								VNYQVBWD.method460(var76 * 128, var85, var76 * 128, 1, var73, var78 * 128 + 128, var86, var77 * 128);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field879[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field879[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field879[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field881 && (field879[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field879[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field879[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field877[var92][var89][var75] - var96;
								int var98 = field877[var91][var89][var75];
								VNYQVBWD.method460(var90 * 128 + 128, var97, var89 * 128, 2, var73, var75 * 128, var98, var75 * 128);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field879[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field879[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field879[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field882 && (field879[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field879[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field881) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field879[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field877[var74][var101][var103];
								VNYQVBWD.method460(var102 * 128 + 128, var107, var101 * 128, 4, var73, var104 * 128 + 128, var107, var103 * 128);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field879[var74][var108][var109] &= ~var72;
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
