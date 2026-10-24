package deob;

@ObfuscatedName("KPOYRTLL")
public final class KPOYRTLL {

	@ObfuscatedName("KPOYRTLL.n")
	public int field793;

	@ObfuscatedName("KPOYRTLL.o")
	public int field794;

	@ObfuscatedName("KPOYRTLL.w")
	public int[][][] field800;

	@ObfuscatedName("KPOYRTLL.C")
	public byte[][][] field804;

	@ObfuscatedName("KPOYRTLL.p")
	public byte[][][] field795;

	@ObfuscatedName("KPOYRTLL.b")
	public byte[][][] field781;

	@ObfuscatedName("KPOYRTLL.l")
	public byte[][][] field791;

	@ObfuscatedName("KPOYRTLL.x")
	public byte[][][] field801;

	@ObfuscatedName("KPOYRTLL.c")
	public int[][][] field782;

	@ObfuscatedName("KPOYRTLL.k")
	public byte[][][] field790;

	@ObfuscatedName("KPOYRTLL.t")
	public int[][] field797;

	@ObfuscatedName("KPOYRTLL.e")
	public int[] field784;

	@ObfuscatedName("KPOYRTLL.f")
	public int[] field785;

	@ObfuscatedName("KPOYRTLL.g")
	public int[] field786;

	@ObfuscatedName("KPOYRTLL.h")
	public int[] field787;

	@ObfuscatedName("KPOYRTLL.i")
	public int[] field788;

	@ObfuscatedName("KPOYRTLL.d")
	public static final int[] field783 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("KPOYRTLL.j")
	public static final int[] field789 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("KPOYRTLL.m")
	public static int field792 = 99;

	@ObfuscatedName("KPOYRTLL.u")
	public static final int[] field798 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("KPOYRTLL.v")
	public static final int[] field799 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("KPOYRTLL.E")
	public static boolean field805 = true;

	@ObfuscatedName("KPOYRTLL.z")
	public static int field802 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("KPOYRTLL.B")
	public static int field803 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("KPOYRTLL.s")
	public static int field796;

	public KPOYRTLL(int arg0, int arg1, byte[][][] arg2, int[][][] arg3) {
		field792 = 99;
		field793 = arg0;
		field794 = arg1;
		field800 = arg3;
		field804 = arg2;
		field795 = new byte[4][field793][field794];
		field781 = new byte[4][field793][field794];
		field791 = new byte[4][field793][field794];
		field801 = new byte[4][field793][field794];
		field782 = new int[4][field793 + 1][field794 + 1];
		field790 = new byte[4][field793 + 1][field794 + 1];
		field797 = new int[field793 + 1][field794 + 1];
		field784 = new int[field794];
		field785 = new int[field794];
		field786 = new int[field794];
		field787 = new int[field794];
		field788 = new int[field794];
	}

	@ObfuscatedName("KPOYRTLL.a(III)I")
	public static final int method243(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method258(var3, var5);
		int var8 = method258(var3 + 1, var5);
		int var9 = method258(var3, var5 + 1);
		int var10 = method258(var3 + 1, var5 + 1);
		int var11 = method257(var7, var8, var4, arg2);
		int var12 = method257(var9, var10, var4, arg2);
		return method257(var11, var12, var6, arg2);
	}

	@ObfuscatedName("KPOYRTLL.a(IIIIIBI[B[LASFXKKJM;I)V")
	public final void method244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, ASFXKKJM[] arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg0 + var10 > 0 && arg0 + var10 < 103 && arg4 + var11 > 0 && arg4 + var11 < 103) {
					arg7[arg5].field13[arg0 + var10][arg4 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		RGCGKKUR var12 = new RGCGKKUR(arg6);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg8 == var13 && var14 >= arg2 && var14 < arg2 + 8 && var15 >= arg3 && var15 < arg3 + 8) {
						method248(arg5, 0, arg4 + AOGMWZWE.method2(arg1, var15 & 0x7, var14 & 0x7), 0, arg0 + AOGMWZWE.method1(var15 & 0x7, arg1, var14 & 0x7), arg1, var12);
					} else {
						method248(0, 0, -1, 0, -1, 0, var12);
					}
				}
			}
		}
	}

	@ObfuscatedName("KPOYRTLL.a([LASFXKKJM;[BIIIIIIIILOUUKQIMK;)V")
	public final void method245(ASFXKKJM[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, OUUKQIMK arg9) {
		RGCGKKUR var11 = new RGCGKKUR(arg1);
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
				if (arg4 == var18 && var17 >= arg2 && var17 < arg2 + 8 && var16 >= arg3 && var16 < arg3 + 8) {
					NNXJFXRX var22 = NNXJFXRX.method323(var12);
					int var23 = arg5 + AOGMWZWE.method3(var22.field997, var16 & 0x7, var22.field987, var21, var17 & 0x7, arg8);
					int var24 = arg7 + AOGMWZWE.method4(var21, var16 & 0x7, var22.field997, arg8, var17 & 0x7, var22.field987);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg6;
						if ((field804[1][var23][var24] & 0x2) == 2) {
							var25 = arg6 - 1;
						}

						ASFXKKJM var26 = null;
						if (var25 >= 0) {
							var26 = arg0[var25];
						}

						method254(var20, var26, arg9, var12, var23, arg8 + var21 & 0x3, var24, arg6);
					}
				}
			}
		}
	}

	@ObfuscatedName("KPOYRTLL.b(III)I")
	public final int method246(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("KPOYRTLL.c(III)Z")
	public static final boolean method247(int arg0, int arg1) {
		NNXJFXRX var2 = NNXJFXRX.method323(arg0);

		if (arg1 == 11) {
			arg1 = 10;
		}

		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}

		return var2.method329(arg1);
	}

	@ObfuscatedName("KPOYRTLL.a(IZIIIIILRGCGKKUR;)V")
	public final void method248(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, RGCGKKUR arg6) {
		if (arg4 >= 0 && arg4 < 104 && arg2 >= 0 && arg2 < 104) {
			field804[arg0][arg4][arg2] = 0;
			while (true) {
				int var8 = arg6.method455();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg6.method455();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg0 == 0) {
						field800[0][arg4][arg2] = -var9 * 8;
						return;
					}

					field800[arg0][arg4][arg2] = field800[arg0 - 1][arg4][arg2] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field781[arg0][arg4][arg2] = arg6.method456();
					field791[arg0][arg4][arg2] = (byte) ((var8 - 2) / 4);
					field801[arg0][arg4][arg2] = (byte) (var8 + arg5 - 2 & 0x3);
				} else if (var8 <= 81) {
					field804[arg0][arg4][arg2] = (byte) (var8 - 49);
				} else {
					field795[arg0][arg4][arg2] = (byte) (var8 - 81);
				}
			}

			if (arg0 == 0) {
				field800[0][arg4][arg2] = -method262(arg4 + arg1 + 932731, arg2 + 556238 + arg3) * 8;
			} else {
				field800[arg0][arg4][arg2] = field800[arg0 - 1][arg4][arg2] - 240;
			}
		} else {
			while (true) {
				int var10 = arg6.method455();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg6.method455();
					return;
				}

				if (var10 <= 49) {
					arg6.method455();
				}
			}
		}
	}

	@ObfuscatedName("KPOYRTLL.a(II)I")
	public static final int method249(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("KPOYRTLL.a(ZLRGCGKKUR;LNTGEPOMK;)V")
	public static final void method250(RGCGKKUR arg0, NTGEPOMK arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method469();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			NNXJFXRX var4 = NNXJFXRX.method323(var2);
			var4.method324(arg1);

			while (true) {
				int var5 = arg0.method469();
				if (var5 == 0) {
					break;
				}

				arg0.method455();
			}
		}
	}

	@ObfuscatedName("KPOYRTLL.a([BIZILOUUKQIMK;[LASFXKKJM;)V")
	public final void method251(byte[] arg0, int arg1, int arg2, OUUKQIMK arg3, ASFXKKJM[] arg4) {
		RGCGKKUR var6 = new RGCGKKUR(arg0);
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
				int var17 = arg2 + var12;
				int var18 = arg1 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field804[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					ASFXKKJM var20 = null;
					if (var19 >= 0) {
						var20 = arg4[var19];
					}

					method254(var15, var20, arg3, var7, var17, var16, var18, var13);
				}
			}
		}
	}

	@ObfuscatedName("KPOYRTLL.a(IIII)I")
	public int method252(int arg0, int arg1, int arg2) {
		if ((field804[arg2][arg0][arg1] & 0x8) != 0) {
			return 0;
		}

		if (arg2 > 0 && (field804[1][arg0][arg1] & 0x2) != 0) {
			return arg2 - 1;
		}

		return arg2;
	}

	@ObfuscatedName("KPOYRTLL.a(LOUUKQIMK;IIILASFXKKJM;II[[[IIII)V")
	public static final void method253(OUUKQIMK arg0, int arg1, int arg2, int arg3, ASFXKKJM arg4, int arg5, int[][][] arg6, int arg7, int arg8, int arg9) {
		int var10 = arg6[arg1][arg9][arg8];
		int var11 = arg6[arg1][arg9 + 1][arg8];
		int var12 = arg6[arg1][arg9 + 1][arg8 + 1];
		int var13 = arg6[arg1][arg9][arg8 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		NNXJFXRX var15 = NNXJFXRX.method323(arg7);
		int var16 = (arg7 << 14) + (arg8 << 7) + arg9 + 0x40000000;
		if (!var15.field973) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg5 << 6) + arg3);
		if (arg3 == 22) {
			MODNYPGG var18;
			if (var15.field964 == -1 && var15.field963 == null) {
				var18 = var15.method328(22, arg5, var10, var11, var12, var13, -1);
			} else {
				var18 = new QHSYTCMW(var11, arg5, var12, var13, 22, var10, var15.field964, true, arg7);
			}

			arg0.method370(arg8, var17, arg2, arg9, var18, var14, var16);

			if (var15.field982 && var15.field973) {
				arg4.method8(arg9, arg8);
			}
		} else if (arg3 == 10 || arg3 == 11) {
			MODNYPGG var19;
			if (var15.field964 == -1 && var15.field963 == null) {
				var19 = var15.method328(10, arg5, var10, var11, var12, var13, -1);
			} else {
				var19 = new QHSYTCMW(var11, arg5, var12, var13, 10, var10, var15.field964, true, arg7);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg3 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg5 == 1 || arg5 == 3) {
					var21 = var15.field987;
					var22 = var15.field997;
				} else {
					var21 = var15.field997;
					var22 = var15.field987;
				}

				arg0.method374(arg9, var21, var17, arg2, var22, var20, var14, arg8, var19, var16);
			}

			if (var15.field982) {
				arg4.method7(arg8, arg5, arg9, var15.field959, var15.field987, var15.field997);
			}
		} else if (arg3 >= 12) {
			MODNYPGG var23;
			if (var15.field964 == -1 && var15.field963 == null) {
				var23 = var15.method328(arg3, arg5, var10, var11, var12, var13, -1);
			} else {
				var23 = new QHSYTCMW(var11, arg5, var12, var13, arg3, var10, var15.field964, true, arg7);
			}

			arg0.method374(arg9, 1, var17, arg2, 1, 0, var14, arg8, var23, var16);

			if (var15.field982) {
				arg4.method7(arg8, arg5, arg9, var15.field959, var15.field987, var15.field997);
			}
		} else if (arg3 == 0) {
			MODNYPGG var24;
			if (var15.field964 == -1 && var15.field963 == null) {
				var24 = var15.method328(0, arg5, var10, var11, var12, var13, -1);
			} else {
				var24 = new QHSYTCMW(var11, arg5, var12, var13, 0, var10, var15.field964, true, arg7);
			}

			arg0.method372(arg9, arg2, var24, null, var17, 0, field798[arg5], var14, arg8, var16);

			if (var15.field982) {
				arg4.method6(arg8, var15.field959, arg3, arg9, arg5);
			}
		} else if (arg3 == 1) {
			MODNYPGG var25;
			if (var15.field964 == -1 && var15.field963 == null) {
				var25 = var15.method328(1, arg5, var10, var11, var12, var13, -1);
			} else {
				var25 = new QHSYTCMW(var11, arg5, var12, var13, 1, var10, var15.field964, true, arg7);
			}

			arg0.method372(arg9, arg2, var25, null, var17, 0, field789[arg5], var14, arg8, var16);

			if (var15.field982) {
				arg4.method6(arg8, var15.field959, arg3, arg9, arg5);
			}
		} else if (arg3 == 2) {
			int var26 = arg5 + 1 & 0x3;
			MODNYPGG var27;
			MODNYPGG var28;
			if (var15.field964 == -1 && var15.field963 == null) {
				var27 = var15.method328(2, arg5 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method328(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new QHSYTCMW(var11, arg5 + 4, var12, var13, 2, var10, var15.field964, true, arg7);
				var28 = new QHSYTCMW(var11, var26, var12, var13, 2, var10, var15.field964, true, arg7);
			}

			arg0.method372(arg9, arg2, var27, var28, var17, field798[var26], field798[arg5], var14, arg8, var16);

			if (var15.field982) {
				arg4.method6(arg8, var15.field959, arg3, arg9, arg5);
			}
		} else if (arg3 == 3) {
			MODNYPGG var29;
			if (var15.field964 == -1 && var15.field963 == null) {
				var29 = var15.method328(3, arg5, var10, var11, var12, var13, -1);
			} else {
				var29 = new QHSYTCMW(var11, arg5, var12, var13, 3, var10, var15.field964, true, arg7);
			}

			arg0.method372(arg9, arg2, var29, null, var17, 0, field789[arg5], var14, arg8, var16);

			if (var15.field982) {
				arg4.method6(arg8, var15.field959, arg3, arg9, arg5);
			}
		} else if (arg3 == 9) {
			MODNYPGG var30;
			if (var15.field964 == -1 && var15.field963 == null) {
				var30 = var15.method328(arg3, arg5, var10, var11, var12, var13, -1);
			} else {
				var30 = new QHSYTCMW(var11, arg5, var12, var13, arg3, var10, var15.field964, true, arg7);
			}

			arg0.method374(arg9, 1, var17, arg2, 1, 0, var14, arg8, var30, var16);

			if (var15.field982) {
				arg4.method7(arg8, arg5, arg9, var15.field959, var15.field987, var15.field997);
			}
		} else {
			if (var15.field970) {
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

			if (arg3 == 4) {
				MODNYPGG var35;
				if (var15.field964 == -1 && var15.field963 == null) {
					var35 = var15.method328(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new QHSYTCMW(var11, 0, var12, var13, 4, var10, var15.field964, true, arg7);
				}

				arg0.method373(var35, var17, arg5 * 512, field798[arg5], arg8, arg2, 0, var14, 0, arg9, var16);
			} else if (arg3 == 5) {
				int var36 = 16;
				int var37 = arg0.method390(arg2, arg9, arg8);
				if (var37 > 0) {
					var36 = NNXJFXRX.method323(var37 >> 14 & 0x7FFF).field972;
				}

				MODNYPGG var38;
				if (var15.field964 == -1 && var15.field963 == null) {
					var38 = var15.method328(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new QHSYTCMW(var11, 0, var12, var13, 4, var10, var15.field964, true, arg7);
				}

				arg0.method373(var38, var17, arg5 * 512, field798[arg5], arg8, arg2, field783[arg5] * var36, var14, field799[arg5] * var36, arg9, var16);
			} else if (arg3 == 6) {
				MODNYPGG var39;
				if (var15.field964 == -1 && var15.field963 == null) {
					var39 = var15.method328(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new QHSYTCMW(var11, 0, var12, var13, 4, var10, var15.field964, true, arg7);
				}

				arg0.method373(var39, var17, arg5, 256, arg8, arg2, 0, var14, 0, arg9, var16);
			} else if (arg3 == 7) {
				MODNYPGG var40;
				if (var15.field964 == -1 && var15.field963 == null) {
					var40 = var15.method328(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new QHSYTCMW(var11, 0, var12, var13, 4, var10, var15.field964, true, arg7);
				}

				arg0.method373(var40, var17, arg5, 512, arg8, arg2, 0, var14, 0, arg9, var16);
			} else if (arg3 == 8) {
				MODNYPGG var41;
				if (var15.field964 == -1 && var15.field963 == null) {
					var41 = var15.method328(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new QHSYTCMW(var11, 0, var12, var13, 4, var10, var15.field964, true, arg7);
				}

				arg0.method373(var41, var17, arg5, 768, arg8, arg2, 0, var14, 0, arg9, var16);
			}
		}
	}

	@ObfuscatedName("KPOYRTLL.a(ILASFXKKJM;LOUUKQIMK;IIIIII)V")
	public final void method254(int arg0, ASFXKKJM arg1, OUUKQIMK arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field805 && (field804[0][arg4][arg6] & 0x2) == 0) {
			if ((field804[arg7][arg4][arg6] & 0x10) != 0) {
				return;
			}

			if (method252(arg4, arg6, arg7) != field796) {
				return;
			}
		}

		if (arg7 < field792) {
			field792 = arg7;
		}

		int var9 = field800[arg7][arg4][arg6];
		int var10 = field800[arg7][arg4 + 1][arg6];
		int var11 = field800[arg7][arg4 + 1][arg6 + 1];
		int var12 = field800[arg7][arg4][arg6 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		NNXJFXRX var14 = NNXJFXRX.method323(arg3);
		int var15 = (arg3 << 14) + (arg6 << 7) + arg4 + 0x40000000;
		if (!var14.field973) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg5 << 6) + arg0);
		if (arg0 == 22) {
			if (!field805 || var14.field973 || var14.field957) {
				MODNYPGG var17;
				if (var14.field964 == -1 && var14.field963 == null) {
					var17 = var14.method328(22, arg5, var9, var10, var11, var12, -1);
				} else {
					var17 = new QHSYTCMW(var10, arg5, var11, var12, 22, var9, var14.field964, true, arg3);
				}

				arg2.method370(arg6, var16, arg7, arg4, var17, var13, var15);

				if (var14.field982 && var14.field973 && arg1 != null) {
					arg1.method8(arg4, arg6);
				}
			}
		} else if (arg0 == 10 || arg0 == 11) {
			MODNYPGG var18;
			if (var14.field964 == -1 && var14.field963 == null) {
				var18 = var14.method328(10, arg5, var9, var10, var11, var12, -1);
			} else {
				var18 = new QHSYTCMW(var10, arg5, var11, var12, 10, var9, var14.field964, true, arg3);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg0 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg5 == 1 || arg5 == 3) {
					var20 = var14.field987;
					var21 = var14.field997;
				} else {
					var20 = var14.field997;
					var21 = var14.field987;
				}

				if (arg2.method374(arg4, var20, var16, arg7, var21, var19, var13, arg6, var18, var15) && var14.field1002) {
					NGYJLUVS var22;
					if (var18 instanceof NGYJLUVS) {
						var22 = (NGYJLUVS) var18;
					} else {
						var22 = var14.method328(10, arg5, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field883 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field790[arg7][arg4 + var23][arg6 + var24]) {
									field790[arg7][arg4 + var23][arg6 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field982 && arg1 != null) {
				arg1.method7(arg6, arg5, arg4, var14.field959, var14.field987, var14.field997);
			}
		} else if (arg0 >= 12) {
			MODNYPGG var26;
			if (var14.field964 == -1 && var14.field963 == null) {
				var26 = var14.method328(arg0, arg5, var9, var10, var11, var12, -1);
			} else {
				var26 = new QHSYTCMW(var10, arg5, var11, var12, arg0, var9, var14.field964, true, arg3);
			}

			arg2.method374(arg4, 1, var16, arg7, 1, 0, var13, arg6, var26, var15);

			if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg7 > 0) {
				field782[arg7][arg4][arg6] |= 0x924;
			}

			if (var14.field982 && arg1 != null) {
				arg1.method7(arg6, arg5, arg4, var14.field959, var14.field987, var14.field997);
			}
		} else if (arg0 == 0) {
			MODNYPGG var27;
			if (var14.field964 == -1 && var14.field963 == null) {
				var27 = var14.method328(0, arg5, var9, var10, var11, var12, -1);
			} else {
				var27 = new QHSYTCMW(var10, arg5, var11, var12, 0, var9, var14.field964, true, arg3);
			}

			arg2.method372(arg4, arg7, var27, null, var16, 0, field798[arg5], var13, arg6, var15);

			if (arg5 == 0) {
				if (var14.field1002) {
					field790[arg7][arg4][arg6] = 50;
					field790[arg7][arg4][arg6 + 1] = 50;
				}

				if (var14.field958) {
					field782[arg7][arg4][arg6] |= 0x249;
				}
			} else if (arg5 == 1) {
				if (var14.field1002) {
					field790[arg7][arg4][arg6 + 1] = 50;
					field790[arg7][arg4 + 1][arg6 + 1] = 50;
				}

				if (var14.field958) {
					field782[arg7][arg4][arg6 + 1] |= 0x492;
				}
			} else if (arg5 == 2) {
				if (var14.field1002) {
					field790[arg7][arg4 + 1][arg6] = 50;
					field790[arg7][arg4 + 1][arg6 + 1] = 50;
				}

				if (var14.field958) {
					field782[arg7][arg4 + 1][arg6] |= 0x249;
				}
			} else if (arg5 == 3) {
				if (var14.field1002) {
					field790[arg7][arg4][arg6] = 50;
					field790[arg7][arg4 + 1][arg6] = 50;
				}

				if (var14.field958) {
					field782[arg7][arg4][arg6] |= 0x492;
				}
			}

			if (var14.field982 && arg1 != null) {
				arg1.method6(arg6, var14.field959, arg0, arg4, arg5);
			}

			if (var14.field972 != 16) {
				arg2.method380(arg7, arg4, var14.field972, arg6);
			}
		} else if (arg0 == 1) {
			MODNYPGG var28;
			if (var14.field964 == -1 && var14.field963 == null) {
				var28 = var14.method328(1, arg5, var9, var10, var11, var12, -1);
			} else {
				var28 = new QHSYTCMW(var10, arg5, var11, var12, 1, var9, var14.field964, true, arg3);
			}

			arg2.method372(arg4, arg7, var28, null, var16, 0, field789[arg5], var13, arg6, var15);

			if (var14.field1002) {
				if (arg5 == 0) {
					field790[arg7][arg4][arg6 + 1] = 50;
				} else if (arg5 == 1) {
					field790[arg7][arg4 + 1][arg6 + 1] = 50;
				} else if (arg5 == 2) {
					field790[arg7][arg4 + 1][arg6] = 50;
				} else if (arg5 == 3) {
					field790[arg7][arg4][arg6] = 50;
				}
			}

			if (var14.field982 && arg1 != null) {
				arg1.method6(arg6, var14.field959, arg0, arg4, arg5);
			}
		} else if (arg0 == 2) {
			int var29 = arg5 + 1 & 0x3;
			MODNYPGG var30;
			MODNYPGG var31;
			if (var14.field964 == -1 && var14.field963 == null) {
				var30 = var14.method328(2, arg5 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method328(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new QHSYTCMW(var10, arg5 + 4, var11, var12, 2, var9, var14.field964, true, arg3);
				var31 = new QHSYTCMW(var10, var29, var11, var12, 2, var9, var14.field964, true, arg3);
			}

			arg2.method372(arg4, arg7, var30, var31, var16, field798[var29], field798[arg5], var13, arg6, var15);

			if (var14.field958) {
				if (arg5 == 0) {
					field782[arg7][arg4][arg6] |= 0x249;
					field782[arg7][arg4][arg6 + 1] |= 0x492;
				} else if (arg5 == 1) {
					field782[arg7][arg4][arg6 + 1] |= 0x492;
					field782[arg7][arg4 + 1][arg6] |= 0x249;
				} else if (arg5 == 2) {
					field782[arg7][arg4 + 1][arg6] |= 0x249;
					field782[arg7][arg4][arg6] |= 0x492;
				} else if (arg5 == 3) {
					field782[arg7][arg4][arg6] |= 0x492;
					field782[arg7][arg4][arg6] |= 0x249;
				}
			}

			if (var14.field982 && arg1 != null) {
				arg1.method6(arg6, var14.field959, arg0, arg4, arg5);
			}

			if (var14.field972 != 16) {
				arg2.method380(arg7, arg4, var14.field972, arg6);
			}
		} else if (arg0 == 3) {
			MODNYPGG var32;
			if (var14.field964 == -1 && var14.field963 == null) {
				var32 = var14.method328(3, arg5, var9, var10, var11, var12, -1);
			} else {
				var32 = new QHSYTCMW(var10, arg5, var11, var12, 3, var9, var14.field964, true, arg3);
			}

			arg2.method372(arg4, arg7, var32, null, var16, 0, field789[arg5], var13, arg6, var15);

			if (var14.field1002) {
				if (arg5 == 0) {
					field790[arg7][arg4][arg6 + 1] = 50;
				} else if (arg5 == 1) {
					field790[arg7][arg4 + 1][arg6 + 1] = 50;
				} else if (arg5 == 2) {
					field790[arg7][arg4 + 1][arg6] = 50;
				} else if (arg5 == 3) {
					field790[arg7][arg4][arg6] = 50;
				}
			}

			if (var14.field982 && arg1 != null) {
				arg1.method6(arg6, var14.field959, arg0, arg4, arg5);
			}
		} else if (arg0 == 9) {
			MODNYPGG var33;
			if (var14.field964 == -1 && var14.field963 == null) {
				var33 = var14.method328(arg0, arg5, var9, var10, var11, var12, -1);
			} else {
				var33 = new QHSYTCMW(var10, arg5, var11, var12, arg0, var9, var14.field964, true, arg3);
			}

			arg2.method374(arg4, 1, var16, arg7, 1, 0, var13, arg6, var33, var15);

			if (var14.field982 && arg1 != null) {
				arg1.method7(arg6, arg5, arg4, var14.field959, var14.field987, var14.field997);
			}
		} else {
			if (var14.field970) {
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

			if (arg0 == 4) {
				MODNYPGG var38;
				if (var14.field964 == -1 && var14.field963 == null) {
					var38 = var14.method328(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new QHSYTCMW(var10, 0, var11, var12, 4, var9, var14.field964, true, arg3);
				}

				arg2.method373(var38, var16, arg5 * 512, field798[arg5], arg6, arg7, 0, var13, 0, arg4, var15);
			} else if (arg0 == 5) {
				int var39 = 16;
				int var40 = arg2.method390(arg7, arg4, arg6);
				if (var40 > 0) {
					var39 = NNXJFXRX.method323(var40 >> 14 & 0x7FFF).field972;
				}

				MODNYPGG var41;
				if (var14.field964 == -1 && var14.field963 == null) {
					var41 = var14.method328(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new QHSYTCMW(var10, 0, var11, var12, 4, var9, var14.field964, true, arg3);
				}

				arg2.method373(var41, var16, arg5 * 512, field798[arg5], arg6, arg7, field783[arg5] * var39, var13, field799[arg5] * var39, arg4, var15);
			} else if (arg0 == 6) {
				MODNYPGG var42;
				if (var14.field964 == -1 && var14.field963 == null) {
					var42 = var14.method328(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new QHSYTCMW(var10, 0, var11, var12, 4, var9, var14.field964, true, arg3);
				}

				arg2.method373(var42, var16, arg5, 256, arg6, arg7, 0, var13, 0, arg4, var15);
			} else if (arg0 == 7) {
				MODNYPGG var43;
				if (var14.field964 == -1 && var14.field963 == null) {
					var43 = var14.method328(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new QHSYTCMW(var10, 0, var11, var12, 4, var9, var14.field964, true, arg3);
				}

				arg2.method373(var43, var16, arg5, 512, arg6, arg7, 0, var13, 0, arg4, var15);
			} else if (arg0 == 8) {
				MODNYPGG var44;
				if (var14.field964 == -1 && var14.field963 == null) {
					var44 = var14.method328(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new QHSYTCMW(var10, 0, var11, var12, 4, var9, var14.field964, true, arg3);
				}

				arg2.method373(var44, var16, arg5, 768, arg6, arg7, 0, var13, 0, arg4, var15);
			}
		}
	}

	@ObfuscatedName("KPOYRTLL.a(IIIB)V")
	public final void method255(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 8; var4++) {
			for (int var5 = 0; var5 < 8; var5++) {
				field800[arg2][arg0 + var4][arg1 + var5] = 0;
			}
		}

		if (arg0 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				field800[arg2][arg0][arg1 + var6] = field800[arg2][arg0 - 1][arg1 + var6];
			}
		}

		if (arg1 > 0) {
			for (int var7 = 1; var7 < 8; var7++) {
				field800[arg2][arg0 + var7][arg1] = field800[arg2][arg0 + var7][arg1 - 1];
			}
		}

		if (arg0 > 0 && field800[arg2][arg0 - 1][arg1] != 0) {
			field800[arg2][arg0][arg1] = field800[arg2][arg0 - 1][arg1];
		} else if (arg1 > 0 && field800[arg2][arg0][arg1 - 1] != 0) {
			field800[arg2][arg0][arg1] = field800[arg2][arg0][arg1 - 1];
		} else if (arg0 > 0 && arg1 > 0 && field800[arg2][arg0 - 1][arg1 - 1] != 0) {
			field800[arg2][arg0][arg1] = field800[arg2][arg0 - 1][arg1 - 1];
		}
	}

	@ObfuscatedName("KPOYRTLL.a(IIIBI)V")
	public final void method256(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg1; var5 <= arg0 + arg1; var5++) {
			for (int var6 = arg3; var6 <= arg2 + arg3; var6++) {
				if (var6 >= 0 && var6 < field793 && var5 >= 0 && var5 < field794) {
					field790[0][var6][var5] = 127;

					if (arg3 == var6 && var6 > 0) {
						field800[0][var6][var5] = field800[0][var6 - 1][var5];
					}

					if (arg2 + arg3 == var6 && var6 < field793 - 1) {
						field800[0][var6][var5] = field800[0][var6 + 1][var5];
					}

					if (arg1 == var5 && var5 > 0) {
						field800[0][var6][var5] = field800[0][var6][var5 - 1];
					}

					if (arg0 + arg1 == var5 && var5 < field794 - 1) {
						field800[0][var6][var5] = field800[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("KPOYRTLL.b(IIII)I")
	public static final int method257(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - DABPNVTX.field518[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("KPOYRTLL.b(II)I")
	public static final int method258(int arg0, int arg1) {
		int var2 = method249(arg0 - 1, arg1 - 1) + method249(arg0 + 1, arg1 - 1) + method249(arg0 - 1, arg1 + 1) + method249(arg0 + 1, arg1 + 1);
		int var3 = method249(arg0 - 1, arg1) + method249(arg0 + 1, arg1) + method249(arg0, arg1 - 1) + method249(arg0, arg1 + 1);
		int var4 = method249(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("KPOYRTLL.a([LASFXKKJM;LOUUKQIMK;I)V")
	public final void method259(ASFXKKJM[] arg0, OUUKQIMK arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field804[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field804[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg0[var6].method8(var4, var5);
						}
					}
				}
			}
		}

		field803 += (int) (Math.random() * 5.0D) - 2;
		if (field803 < -8) {
			field803 = -8;
		}

		if (field803 > 8) {
			field803 = 8;
		}

		field802 += (int) (Math.random() * 5.0D) - 2;
		if (field802 < -16) {
			field802 = -16;
		}

		if (field802 > 16) {
			field802 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field790[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field794 - 1; var16++) {
				for (int var17 = 1; var17 < field793 - 1; var17++) {
					int var18 = field800[var7][var17 + 1][var16] - field800[var7][var17 - 1][var16];
					int var19 = field800[var7][var17][var16 + 1] - field800[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field797[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field794; var26++) {
				field784[var26] = 0;
				field785[var26] = 0;
				field786[var26] = 0;
				field787[var26] = 0;
				field788[var26] = 0;
			}

			for (int var27 = -5; var27 < field793 + 5; var27++) {
				for (int var28 = 0; var28 < field794; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field793) {
						int var30 = field795[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							UGHJOVKI var31 = UGHJOVKI.field1423[var30 - 1];
							field784[var28] += var31.field1432;
							field785[var28] += var31.field1430;
							field786[var28] += var31.field1431;
							field787[var28] += var31.field1433;
							field788[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field793) {
						int var33 = field795[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							UGHJOVKI var34 = UGHJOVKI.field1423[var33 - 1];
							field784[var28] -= var34.field1432;
							field785[var28] -= var34.field1430;
							field786[var28] -= var34.field1431;
							field787[var28] -= var34.field1433;
							field788[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field793 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field794 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field794) {
							var35 += field784[var41];
							var36 += field785[var41];
							var37 += field786[var41];
							var38 += field787[var41];
							var39 += field788[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field794) {
							var35 -= field784[var42];
							var36 -= field785[var42];
							var37 -= field786[var42];
							var38 -= field787[var42];
							var39 -= field788[var42];
						}

						if (var40 >= 1 && var40 < field794 - 1 && (!field805 || (field804[0][var27][var40] & 0x2) != 0 || (field804[var7][var27][var40] & 0x10) == 0 && method252(var27, var40, var7) == field796)) {
							if (var7 < field792) {
								field792 = var7;
							}

							int var43 = field795[var7][var27][var40] & 0xFF;
							int var44 = field781[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field800[var7][var27][var40];
								int var46 = field800[var7][var27 + 1][var40];
								int var47 = field800[var7][var27 + 1][var40 + 1];
								int var48 = field800[var7][var27][var40 + 1];
								int var49 = field797[var27][var40];
								int var50 = field797[var27 + 1][var40];
								int var51 = field797[var27 + 1][var40 + 1];
								int var52 = field797[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method246(var55, var56, var57);
									var55 = field803 + var55 & 0xFF;
									var57 += field802;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method246(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field791[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !UGHJOVKI.field1423[var44 - 1].field1428) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field782[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = DABPNVTX.field529[method260(var54, 96)];
								}

								if (var44 == 0) {
									arg1.method369(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method260(var53, var49), method260(var53, var50), method260(var53, var51), method260(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field791[var7][var27][var40] + 1;
									byte var61 = field801[var7][var27][var40];
									UGHJOVKI var62 = UGHJOVKI.field1423[var44 - 1];
									int var63 = var62.field1426;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = DABPNVTX.method191(var63);
										var65 = -1;
									} else if (var62.field1425 == 0xFF00FF) {
										var65 = -2;
										var63 = -1;
										var64 = DABPNVTX.field529[method264(var62.field1434, 96)];
									} else {
										var65 = method246(var62.field1429, var62.field1430, var62.field1431);
										var64 = DABPNVTX.field529[method264(var62.field1434, 96)];
									}

									arg1.method369(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method260(var53, var49), method260(var53, var50), method260(var53, var51), method260(var53, var52), method264(var65, var49), method264(var65, var50), method264(var65, var51), method264(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field794 - 1; var66++) {
				for (int var67 = 1; var67 < field793 - 1; var67++) {
					arg1.method368(var7, var67, var66, method252(var67, var66, var7));
				}
			}
		}

		arg1.method395(-50, -10, -50);

		for (int var68 = 0; var68 < field793; var68++) {
			for (int var69 = 0; var69 < field794; var69++) {
				if ((field804[1][var68][var69] & 0x2) == 2) {
					arg1.method366(var69, var68);
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
				for (int var75 = 0; var75 <= field794; var75++) {
					for (int var76 = 0; var76 <= field793; var76++) {
						if ((field782[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field782[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field794 && (field782[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field782[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field782[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field800[var80][var76][var77] - var84;
								int var86 = field800[var79][var76][var77];
								OUUKQIMK.method367(var76 * 128, var78 * 128 + 128, var86, var73, var85, 1, var76 * 128, var77 * 128);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field782[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field782[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field782[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field793 && (field782[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field782[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field782[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field800[var92][var89][var75] - var96;
								int var98 = field800[var91][var89][var75];
								OUUKQIMK.method367(var89 * 128, var75 * 128, var98, var73, var97, 2, var90 * 128 + 128, var75 * 128);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field782[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field782[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field782[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field794 && (field782[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field782[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field793) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field782[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field800[var74][var101][var103];
								OUUKQIMK.method367(var101 * 128, var104 * 128 + 128, var107, var73, var107, 4, var102 * 128 + 128, var103 * 128);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field782[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("KPOYRTLL.c(II)I")
	public static final int method260(int arg0, int arg1) {
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

	@ObfuscatedName("KPOYRTLL.a(IIII[LASFXKKJM;[BI)V")
	public final void method261(int arg0, int arg1, int arg2, ASFXKKJM[] arg3, byte[] arg4, int arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg0 + var8 > 0 && arg0 + var8 < 103 && arg2 + var9 > 0 && arg2 + var9 < 103) {
						arg3[var7].field13[arg0 + var8][arg2 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		RGCGKKUR var10 = new RGCGKKUR(arg4);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method248(var11, arg5, arg2 + var13, arg1, arg0 + var12, 0, var10);
				}
			}
		}
	}

	@ObfuscatedName("KPOYRTLL.d(II)I")
	public static final int method262(int arg0, int arg1) {
		int var2 = method243(arg0 + 45365, arg1 + 91923, 4) + (method243(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method243(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("KPOYRTLL.a(I[BII)Z")
	public static final boolean method263(byte[] arg0, int arg1, int arg2) {
		boolean var3 = true;
		RGCGKKUR var4 = new RGCGKKUR(arg0);
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
					int var14 = arg2 + var12;
					int var15 = arg1 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						NNXJFXRX var16 = NNXJFXRX.method323(var5);
						if (var13 != 22 || !field805 || var16.field973 || var16.field957) {
							var3 &= var16.method332();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("KPOYRTLL.e(II)I")
	public final int method264(int arg0, int arg1) {
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
}
