package deob;

@ObfuscatedName("RQCEQFSS")
public final class RQCEQFSS {

	@ObfuscatedName("RQCEQFSS.x")
	public int field1120;

	@ObfuscatedName("RQCEQFSS.y")
	public int field1121;

	@ObfuscatedName("RQCEQFSS.o")
	public int[][][] field1111;

	@ObfuscatedName("RQCEQFSS.u")
	public byte[][][] field1117;

	@ObfuscatedName("RQCEQFSS.m")
	public byte[][][] field1109;

	@ObfuscatedName("RQCEQFSS.l")
	public byte[][][] field1108;

	@ObfuscatedName("RQCEQFSS.n")
	public byte[][][] field1110;

	@ObfuscatedName("RQCEQFSS.A")
	public byte[][][] field1123;

	@ObfuscatedName("RQCEQFSS.v")
	public int[][][] field1118;

	@ObfuscatedName("RQCEQFSS.C")
	public byte[][][] field1125;

	@ObfuscatedName("RQCEQFSS.d")
	public int[][] field1104;

	@ObfuscatedName("RQCEQFSS.p")
	public int[] field1112;

	@ObfuscatedName("RQCEQFSS.q")
	public int[] field1113;

	@ObfuscatedName("RQCEQFSS.r")
	public int[] field1114;

	@ObfuscatedName("RQCEQFSS.s")
	public int[] field1115;

	@ObfuscatedName("RQCEQFSS.t")
	public int[] field1116;

	@ObfuscatedName("RQCEQFSS.a")
	public static boolean field1101 = true;

	@ObfuscatedName("RQCEQFSS.c")
	public static final int[] field1103 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("RQCEQFSS.f")
	public static final int[] field1105 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("RQCEQFSS.h")
	public static final int[] field1106 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("RQCEQFSS.w")
	public static int field1119 = 99;

	@ObfuscatedName("RQCEQFSS.z")
	public static final int[] field1122 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("RQCEQFSS.k")
	public static int field1107 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("RQCEQFSS.B")
	public static int field1124 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("RQCEQFSS.b")
	public static int field1102;

	@ObfuscatedName("RQCEQFSS.a(IIII)V")
	public final void method461(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 8; var4++) {
			for (int var5 = 0; var5 < 8; var5++) {
				field1111[arg1][arg0 + var4][arg2 + var5] = 0;
			}
		}

		if (arg0 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				field1111[arg1][arg0][arg2 + var6] = field1111[arg1][arg0 - 1][arg2 + var6];
			}
		}

		if (arg2 > 0) {
			for (int var7 = 1; var7 < 8; var7++) {
				field1111[arg1][arg0 + var7][arg2] = field1111[arg1][arg0 + var7][arg2 - 1];
			}
		}

		if (arg0 > 0 && field1111[arg1][arg0 - 1][arg2] != 0) {
			field1111[arg1][arg0][arg2] = field1111[arg1][arg0 - 1][arg2];
		} else if (arg2 > 0 && field1111[arg1][arg0][arg2 - 1] != 0) {
			field1111[arg1][arg0][arg2] = field1111[arg1][arg0][arg2 - 1];
		} else if (arg0 > 0 && arg2 > 0 && field1111[arg1][arg0 - 1][arg2 - 1] != 0) {
			field1111[arg1][arg0][arg2] = field1111[arg1][arg0 - 1][arg2 - 1];
		}
	}

	@ObfuscatedName("RQCEQFSS.a(IIIIZ)V")
	public final void method462(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg2; var5 <= arg0 + arg2; var5++) {
			for (int var6 = arg3; var6 <= arg1 + arg3; var6++) {
				if (var6 >= 0 && var6 < field1120 && var5 >= 0 && var5 < field1121) {
					field1125[0][var6][var5] = 127;

					if (arg3 == var6 && var6 > 0) {
						field1111[0][var6][var5] = field1111[0][var6 - 1][var5];
					}

					if (arg1 + arg3 == var6 && var6 < field1120 - 1) {
						field1111[0][var6][var5] = field1111[0][var6 + 1][var5];
					}

					if (arg2 == var5 && var5 > 0) {
						field1111[0][var6][var5] = field1111[0][var6][var5 - 1];
					}

					if (arg0 + arg2 == var5 && var5 < field1121 - 1) {
						field1111[0][var6][var5] = field1111[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	public RQCEQFSS(byte[][][] arg0, int[][][] arg1, int arg2, int arg3) {
		field1119 = 99;
		field1120 = arg3;
		field1121 = arg2;
		field1111 = arg1;
		field1117 = arg0;
		field1109 = new byte[4][field1120][field1121];
		field1108 = new byte[4][field1120][field1121];
		field1110 = new byte[4][field1120][field1121];
		field1123 = new byte[4][field1120][field1121];
		field1118 = new int[4][field1120 + 1][field1121 + 1];
		field1125 = new byte[4][field1120 + 1][field1121 + 1];
		field1104 = new int[field1120 + 1][field1121 + 1];
		field1112 = new int[field1121];
		field1113 = new int[field1121];
		field1114 = new int[field1121];
		field1115 = new int[field1121];
		field1116 = new int[field1121];
	}

	@ObfuscatedName("RQCEQFSS.a([BII[LRUPQNTVM;III)V")
	public final void method463(byte[] arg0, int arg1, int arg2, RUPQNTVM[] arg3, int arg4, int arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg4 + var8 > 0 && arg4 + var8 < 103 && arg5 + var9 > 0 && arg5 + var9 < 103) {
						arg3[var7].field1130[arg4 + var8][arg5 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		BFQIDHPO var10 = new BFQIDHPO(arg0);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method470(0, arg4 + var12, arg2, var11, arg5 + var13, arg1, var10);
				}
			}
		}
	}

	@ObfuscatedName("RQCEQFSS.a(IIILPJTXDRVG;[B[LRUPQNTVM;)V")
	public final void method464(int arg0, int arg1, PJTXDRVG arg2, byte[] arg3, RUPQNTVM[] arg4) {
		BFQIDHPO var6 = new BFQIDHPO(arg3);
		int var7 = -1;
		while (true) {
			int var8 = var6.method68();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method68();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method54();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg1 + var12;
				int var18 = arg0 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field1117[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					RUPQNTVM var20 = null;
					if (var19 >= 0) {
						var20 = arg4[var19];
					}

					method478(var13, var17, arg2, var7, var18, var16, var20, var15);
				}
			}
		}
	}

	@ObfuscatedName("RQCEQFSS.a(III)I")
	public static final int method465(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method480(var3, var5);
		int var8 = method480(var3 + 1, var5);
		int var9 = method480(var3, var5 + 1);
		int var10 = method480(var3 + 1, var5 + 1);
		int var11 = method479(var7, var8, var4, arg2);
		int var12 = method479(var9, var10, var4, arg2);
		return method479(var11, var12, var6, arg2);
	}

	@ObfuscatedName("RQCEQFSS.a(ZI[BI)Z")
	public static final boolean method466(int arg0, byte[] arg1, int arg2) {
		boolean var3 = true;
		BFQIDHPO var4 = new BFQIDHPO(arg1);
		int var5 = -1;
		while (true) {
			int var6 = var4.method68();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method68();
					if (var9 == 0) {
						break;
					}

					var4.method54();
				} else {
					int var10 = var4.method68();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method54() >> 2;
					int var14 = arg2 + var12;
					int var15 = arg0 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						YCVHWRKK var16 = YCVHWRKK.method575(var5);
						if (var13 != 22 || !field1101 || var16.field1456 || var16.field1474) {
							var3 &= var16.method579();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("RQCEQFSS.a(IIII[B[LRUPQNTVM;IIII)V")
	public final void method467(int arg0, int arg1, int arg2, int arg3, byte[] arg4, RUPQNTVM[] arg5, int arg6, int arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg6 + var10 > 0 && arg6 + var10 < 103 && arg2 + var11 > 0 && arg2 + var11 < 103) {
					arg5[arg3].field1130[arg6 + var10][arg2 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		BFQIDHPO var12 = new BFQIDHPO(arg4);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg8 == var13 && var14 >= arg1 && var14 < arg1 + 8 && var15 >= arg7 && var15 < arg7 + 8) {
						method470(arg0, arg6 + MWBCSNDC.method344(var14 & 0x7, var15 & 0x7, arg0), 0, arg3, arg2 + MWBCSNDC.method345(var15 & 0x7, arg0, var14 & 0x7), 0, var12);
					} else {
						method470(0, -1, 0, 0, -1, 0, var12);
					}
				}
			}
		}
	}

	@ObfuscatedName("RQCEQFSS.a(II)I")
	public static final int method468(int arg0, int arg1) {
		int var2 = method465(arg0 + 45365, arg1 + 91923, 4) + (method465(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method465(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("RQCEQFSS.b(III)Z")
	public static final boolean method469(int arg0, int arg1) {
		YCVHWRKK var2 = YCVHWRKK.method575(arg0);

		if (arg1 == 11) {
			arg1 = 10;
		}

		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}

		return var2.method585(arg1);
	}

	@ObfuscatedName("RQCEQFSS.a(IIIIIILBFQIDHPO;I)V")
	public final void method470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, BFQIDHPO arg6) {
		if (arg1 >= 0 && arg1 < 104 && arg4 >= 0 && arg4 < 104) {
			field1117[arg3][arg1][arg4] = 0;
			while (true) {
				int var8 = arg6.method54();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg6.method54();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg3 == 0) {
						field1111[0][arg1][arg4] = -var9 * 8;
						return;
					}

					field1111[arg3][arg1][arg4] = field1111[arg3 - 1][arg1][arg4] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field1108[arg3][arg1][arg4] = arg6.method55();
					field1110[arg3][arg1][arg4] = (byte) ((var8 - 2) / 4);
					field1123[arg3][arg1][arg4] = (byte) (var8 + arg0 - 2 & 0x3);
				} else if (var8 <= 81) {
					field1117[arg3][arg1][arg4] = (byte) (var8 - 49);
				} else {
					field1109[arg3][arg1][arg4] = (byte) (var8 - 81);
				}
			}

			if (arg3 == 0) {
				field1111[0][arg1][arg4] = -method468(arg1 + arg2 + 932731, arg4 + 556238 + arg5) * 8;
			} else {
				field1111[arg3][arg1][arg4] = field1111[arg3 - 1][arg1][arg4] - 240;
			}
		} else {
			while (true) {
				int var10 = arg6.method54();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg6.method54();
					return;
				}

				if (var10 <= 49) {
					arg6.method54();
				}
			}
		}
	}

	@ObfuscatedName("RQCEQFSS.b(II)I")
	public static final int method471(int arg0, int arg1) {
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

	@ObfuscatedName("RQCEQFSS.a(BII[[[IIIIIILRUPQNTVM;LPJTXDRVG;)V")
	public static final void method472(int arg0, int arg1, int[][][] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, RUPQNTVM arg8, PJTXDRVG arg9) {
		int var10 = arg2[arg0][arg7][arg5];
		int var11 = arg2[arg0][arg7 + 1][arg5];
		int var12 = arg2[arg0][arg7 + 1][arg5 + 1];
		int var13 = arg2[arg0][arg7][arg5 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		YCVHWRKK var15 = YCVHWRKK.method575(arg3);
		int var16 = (arg3 << 14) + (arg5 << 7) + arg7 + 0x40000000;
		if (!var15.field1456) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg6 << 6) + arg4);
		if (arg4 == 22) {
			KCWTSCHR var18;
			if (var15.field1490 == -1 && var15.field1451 == null) {
				var18 = var15.method580(22, arg6, var10, var11, var12, var13, -1);
			} else {
				var18 = new VXTLNFMD(var13, arg3, true, var10, arg6, var11, var12, 22, var15.field1490);
			}

			arg9.method379(var18, var17, var14, arg5, arg7, arg1, var16);

			if (var15.field1488 && var15.field1456) {
				arg8.method486(arg7, arg5);
			}
		} else if (arg4 == 10 || arg4 == 11) {
			KCWTSCHR var19;
			if (var15.field1490 == -1 && var15.field1451 == null) {
				var19 = var15.method580(10, arg6, var10, var11, var12, var13, -1);
			} else {
				var19 = new VXTLNFMD(var13, arg3, true, var10, arg6, var11, var12, 10, var15.field1490);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg4 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg6 == 1 || arg6 == 3) {
					var21 = var15.field1470;
					var22 = var15.field1462;
				} else {
					var21 = var15.field1462;
					var22 = var15.field1470;
				}

				arg9.method383(arg7, var20, arg1, var17, var22, var21, var16, var14, arg5, var19);
			}

			if (var15.field1488) {
				arg8.method485(arg7, var15.field1462, var15.field1459, arg6, var15.field1470, arg5);
			}
		} else if (arg4 >= 12) {
			KCWTSCHR var23;
			if (var15.field1490 == -1 && var15.field1451 == null) {
				var23 = var15.method580(arg4, arg6, var10, var11, var12, var13, -1);
			} else {
				var23 = new VXTLNFMD(var13, arg3, true, var10, arg6, var11, var12, arg4, var15.field1490);
			}

			arg9.method383(arg7, 0, arg1, var17, 1, 1, var16, var14, arg5, var23);

			if (var15.field1488) {
				arg8.method485(arg7, var15.field1462, var15.field1459, arg6, var15.field1470, arg5);
			}
		} else if (arg4 == 0) {
			KCWTSCHR var24;
			if (var15.field1490 == -1 && var15.field1451 == null) {
				var24 = var15.method580(0, arg6, var10, var11, var12, var13, -1);
			} else {
				var24 = new VXTLNFMD(var13, arg3, true, var10, arg6, var11, var12, 0, var15.field1490);
			}

			arg9.method381(null, var16, field1103[arg6], 0, var14, arg1, var24, arg7, var17, arg5);

			if (var15.field1488) {
				arg8.method484(arg7, arg6, var15.field1459, arg4, arg5);
			}
		} else if (arg4 == 1) {
			KCWTSCHR var25;
			if (var15.field1490 == -1 && var15.field1451 == null) {
				var25 = var15.method580(1, arg6, var10, var11, var12, var13, -1);
			} else {
				var25 = new VXTLNFMD(var13, arg3, true, var10, arg6, var11, var12, 1, var15.field1490);
			}

			arg9.method381(null, var16, field1106[arg6], 0, var14, arg1, var25, arg7, var17, arg5);

			if (var15.field1488) {
				arg8.method484(arg7, arg6, var15.field1459, arg4, arg5);
			}
		} else if (arg4 == 2) {
			int var26 = arg6 + 1 & 0x3;
			KCWTSCHR var27;
			KCWTSCHR var28;
			if (var15.field1490 == -1 && var15.field1451 == null) {
				var27 = var15.method580(2, arg6 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method580(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new VXTLNFMD(var13, arg3, true, var10, arg6 + 4, var11, var12, 2, var15.field1490);
				var28 = new VXTLNFMD(var13, arg3, true, var10, var26, var11, var12, 2, var15.field1490);
			}

			arg9.method381(var28, var16, field1103[arg6], field1103[var26], var14, arg1, var27, arg7, var17, arg5);

			if (var15.field1488) {
				arg8.method484(arg7, arg6, var15.field1459, arg4, arg5);
			}
		} else if (arg4 == 3) {
			KCWTSCHR var29;
			if (var15.field1490 == -1 && var15.field1451 == null) {
				var29 = var15.method580(3, arg6, var10, var11, var12, var13, -1);
			} else {
				var29 = new VXTLNFMD(var13, arg3, true, var10, arg6, var11, var12, 3, var15.field1490);
			}

			arg9.method381(null, var16, field1106[arg6], 0, var14, arg1, var29, arg7, var17, arg5);

			if (var15.field1488) {
				arg8.method484(arg7, arg6, var15.field1459, arg4, arg5);
			}
		} else if (arg4 == 9) {
			KCWTSCHR var30;
			if (var15.field1490 == -1 && var15.field1451 == null) {
				var30 = var15.method580(arg4, arg6, var10, var11, var12, var13, -1);
			} else {
				var30 = new VXTLNFMD(var13, arg3, true, var10, arg6, var11, var12, arg4, var15.field1490);
			}

			arg9.method383(arg7, 0, arg1, var17, 1, 1, var16, var14, arg5, var30);

			if (var15.field1488) {
				arg8.method485(arg7, var15.field1462, var15.field1459, arg6, var15.field1470, arg5);
			}
		} else {
			if (var15.field1450) {
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
				KCWTSCHR var35;
				if (var15.field1490 == -1 && var15.field1451 == null) {
					var35 = var15.method580(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new VXTLNFMD(var13, arg3, true, var10, 0, var11, var12, 4, var15.field1490);
				}

				arg9.method382(var14, var35, var16, arg1, var17, field1103[arg6], arg5, 0, arg6 * 512, 0, arg7);
			} else if (arg4 == 5) {
				int var36 = 16;
				int var37 = arg9.method399(arg1, arg7, arg5);
				if (var37 > 0) {
					var36 = YCVHWRKK.method575(var37 >> 14 & 0x7FFF).field1477;
				}

				KCWTSCHR var38;
				if (var15.field1490 == -1 && var15.field1451 == null) {
					var38 = var15.method580(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new VXTLNFMD(var13, arg3, true, var10, 0, var11, var12, 4, var15.field1490);
				}

				arg9.method382(var14, var38, var16, arg1, var17, field1103[arg6], arg5, field1122[arg6] * var36, arg6 * 512, field1105[arg6] * var36, arg7);
			} else if (arg4 == 6) {
				KCWTSCHR var39;
				if (var15.field1490 == -1 && var15.field1451 == null) {
					var39 = var15.method580(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new VXTLNFMD(var13, arg3, true, var10, 0, var11, var12, 4, var15.field1490);
				}

				arg9.method382(var14, var39, var16, arg1, var17, 256, arg5, 0, arg6, 0, arg7);
			} else if (arg4 == 7) {
				KCWTSCHR var40;
				if (var15.field1490 == -1 && var15.field1451 == null) {
					var40 = var15.method580(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new VXTLNFMD(var13, arg3, true, var10, 0, var11, var12, 4, var15.field1490);
				}

				arg9.method382(var14, var40, var16, arg1, var17, 512, arg5, 0, arg6, 0, arg7);
			} else if (arg4 == 8) {
				KCWTSCHR var41;
				if (var15.field1490 == -1 && var15.field1451 == null) {
					var41 = var15.method580(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new VXTLNFMD(var13, arg3, true, var10, 0, var11, var12, 4, var15.field1490);
				}

				arg9.method382(var14, var41, var16, arg1, var17, 768, arg5, 0, arg6, 0, arg7);
			}
		}
	}

	@ObfuscatedName("RQCEQFSS.c(II)I")
	public static final int method473(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("RQCEQFSS.a(LPJTXDRVG;[LRUPQNTVM;I)V")
	public final void method474(PJTXDRVG arg0, RUPQNTVM[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field1117[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field1117[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method486(var4, var5);
						}
					}
				}
			}
		}

		field1107 += (int) (Math.random() * 5.0D) - 2;
		if (field1107 < -8) {
			field1107 = -8;
		}

		if (field1107 > 8) {
			field1107 = 8;
		}

		field1124 += (int) (Math.random() * 5.0D) - 2;
		if (field1124 < -16) {
			field1124 = -16;
		}

		if (field1124 > 16) {
			field1124 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field1125[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field1121 - 1; var16++) {
				for (int var17 = 1; var17 < field1120 - 1; var17++) {
					int var18 = field1111[var7][var17 + 1][var16] - field1111[var7][var17 - 1][var16];
					int var19 = field1111[var7][var17][var16 + 1] - field1111[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field1104[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field1121; var26++) {
				field1112[var26] = 0;
				field1113[var26] = 0;
				field1114[var26] = 0;
				field1115[var26] = 0;
				field1116[var26] = 0;
			}

			for (int var27 = -5; var27 < field1120 + 5; var27++) {
				for (int var28 = 0; var28 < field1121; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field1120) {
						int var30 = field1109[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							GJDLZXKK var31 = GJDLZXKK.field722[var30 - 1];
							field1112[var28] += var31.field731;
							field1113[var28] += var31.field729;
							field1114[var28] += var31.field730;
							field1115[var28] += var31.field732;
							field1116[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field1120) {
						int var33 = field1109[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							GJDLZXKK var34 = GJDLZXKK.field722[var33 - 1];
							field1112[var28] -= var34.field731;
							field1113[var28] -= var34.field729;
							field1114[var28] -= var34.field730;
							field1115[var28] -= var34.field732;
							field1116[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field1120 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field1121 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field1121) {
							var35 += field1112[var41];
							var36 += field1113[var41];
							var37 += field1114[var41];
							var38 += field1115[var41];
							var39 += field1116[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field1121) {
							var35 -= field1112[var42];
							var36 -= field1113[var42];
							var37 -= field1114[var42];
							var38 -= field1115[var42];
							var39 -= field1116[var42];
						}

						if (var40 >= 1 && var40 < field1121 - 1 && (!field1101 || (field1117[0][var27][var40] & 0x2) != 0 || (field1117[var7][var27][var40] & 0x10) == 0 && method481(var40, var7, var27) == field1102)) {
							if (var7 < field1119) {
								field1119 = var7;
							}

							int var43 = field1109[var7][var27][var40] & 0xFF;
							int var44 = field1108[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field1111[var7][var27][var40];
								int var46 = field1111[var7][var27 + 1][var40];
								int var47 = field1111[var7][var27 + 1][var40 + 1];
								int var48 = field1111[var7][var27][var40 + 1];
								int var49 = field1104[var27][var40];
								int var50 = field1104[var27 + 1][var40];
								int var51 = field1104[var27 + 1][var40 + 1];
								int var52 = field1104[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method482(var55, var56, var57);
									var55 = field1107 + var55 & 0xFF;
									var57 += field1124;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method482(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field1110[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !GJDLZXKK.field722[var44 - 1].field727) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field1118[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = PKGGFQZB.field1038[method471(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method378(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method471(var53, var49), method471(var53, var50), method471(var53, var51), method471(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field1110[var7][var27][var40] + 1;
									byte var61 = field1123[var7][var27][var40];
									GJDLZXKK var62 = GJDLZXKK.field722[var44 - 1];
									int var63 = var62.field725;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = PKGGFQZB.method430(var63);
										var65 = -1;
									} else if (var62.field724 == 0xFF00FF) {
										var65 = -2;
										var63 = -1;
										var64 = PKGGFQZB.field1038[method477(var62.field733, 96)];
									} else {
										var65 = method482(var62.field728, var62.field729, var62.field730);
										var64 = PKGGFQZB.field1038[method477(var62.field733, 96)];
									}

									arg0.method378(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method471(var53, var49), method471(var53, var50), method471(var53, var51), method471(var53, var52), method477(var65, var49), method477(var65, var50), method477(var65, var51), method477(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field1121 - 1; var66++) {
				for (int var67 = 1; var67 < field1120 - 1; var67++) {
					arg0.method377(var7, var67, var66, method481(var66, var7, var67));
				}
			}
		}

		arg0.method404(-50, -50, -10);

		for (int var68 = 0; var68 < field1120; var68++) {
			for (int var69 = 0; var69 < field1121; var69++) {
				if ((field1117[1][var68][var69] & 0x2) == 2) {
					arg0.method375(var69, var68);
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
				for (int var75 = 0; var75 <= field1121; var75++) {
					for (int var76 = 0; var76 <= field1120; var76++) {
						if ((field1118[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field1118[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field1121 && (field1118[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field1118[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field1118[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field1111[var80][var76][var77] - var84;
								int var86 = field1111[var79][var76][var77];
								PJTXDRVG.method376(var76 * 128, var78 * 128 + 128, var77 * 128, var85, var86, var76 * 128, var73, 1);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field1118[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field1118[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field1118[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field1120 && (field1118[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field1118[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field1118[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field1111[var92][var89][var75] - var96;
								int var98 = field1111[var91][var89][var75];
								PJTXDRVG.method376(var89 * 128, var75 * 128, var75 * 128, var97, var98, var90 * 128 + 128, var73, 2);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field1118[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field1118[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field1118[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field1121 && (field1118[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field1118[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field1120) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field1118[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field1111[var74][var101][var103];
								PJTXDRVG.method376(var101 * 128, var104 * 128 + 128, var103 * 128, var107, var107, var102 * 128 + 128, var73, 4);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field1118[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("RQCEQFSS.a(LBPHGILGU;LBFQIDHPO;I)V")
	public static final void method475(BPHGILGU arg0, BFQIDHPO arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg1.method68();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			YCVHWRKK var4 = YCVHWRKK.method575(var2);
			var4.method581(arg0);

			while (true) {
				int var5 = arg1.method68();
				if (var5 == 0) {
					break;
				}

				arg1.method54();
			}
		}
	}

	@ObfuscatedName("RQCEQFSS.a(IIBLPJTXDRVG;II[LRUPQNTVM;I[BII)V")
	public final void method476(int arg0, int arg1, PJTXDRVG arg2, int arg3, int arg4, RUPQNTVM[] arg5, int arg6, byte[] arg7, int arg8, int arg9) {
		BFQIDHPO var11 = new BFQIDHPO(arg7);
		int var12 = -1;
		while (true) {
			int var13 = var11.method68();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method68();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method54();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg8 == var18 && var17 >= arg6 && var17 < arg6 + 8 && var16 >= arg0 && var16 < arg0 + 8) {
					YCVHWRKK var22 = YCVHWRKK.method575(var12);
					int var23 = arg9 + MWBCSNDC.method346(var16 & 0x7, var22.field1462, arg3, var22.field1470, var21, var17 & 0x7);
					int var24 = arg1 + MWBCSNDC.method347(var22.field1462, var17 & 0x7, arg3, var21, var16 & 0x7, var22.field1470);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg4;
						if ((field1117[1][var23][var24] & 0x2) == 2) {
							var25 = arg4 - 1;
						}

						RUPQNTVM var26 = null;
						if (var25 >= 0) {
							var26 = arg5[var25];
						}

						method478(arg4, var23, arg2, var12, var24, arg3 + var21 & 0x3, var26, var20);
					}
				}
			}
		}
	}

	@ObfuscatedName("RQCEQFSS.d(II)I")
	public final int method477(int arg0, int arg1) {
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

	@ObfuscatedName("RQCEQFSS.a(ZIILPJTXDRVG;IIILRUPQNTVM;I)V")
	public final void method478(int arg0, int arg1, PJTXDRVG arg2, int arg3, int arg4, int arg5, RUPQNTVM arg6, int arg7) {
		if (field1101 && (field1117[0][arg1][arg4] & 0x2) == 0) {
			if ((field1117[arg0][arg1][arg4] & 0x10) != 0) {
				return;
			}

			if (method481(arg4, arg0, arg1) != field1102) {
				return;
			}
		}

		if (arg0 < field1119) {
			field1119 = arg0;
		}

		int var9 = field1111[arg0][arg1][arg4];
		int var10 = field1111[arg0][arg1 + 1][arg4];
		int var11 = field1111[arg0][arg1 + 1][arg4 + 1];
		int var12 = field1111[arg0][arg1][arg4 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		YCVHWRKK var14 = YCVHWRKK.method575(arg3);
		int var15 = (arg3 << 14) + (arg4 << 7) + arg1 + 0x40000000;
		if (!var14.field1456) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg5 << 6) + arg7);
		if (arg7 == 22) {
			if (!field1101 || var14.field1456 || var14.field1474) {
				KCWTSCHR var17;
				if (var14.field1490 == -1 && var14.field1451 == null) {
					var17 = var14.method580(22, arg5, var9, var10, var11, var12, -1);
				} else {
					var17 = new VXTLNFMD(var12, arg3, true, var9, arg5, var10, var11, 22, var14.field1490);
				}

				arg2.method379(var17, var16, var13, arg4, arg1, arg0, var15);

				if (var14.field1488 && var14.field1456 && arg6 != null) {
					arg6.method486(arg1, arg4);
				}
			}
		} else if (arg7 == 10 || arg7 == 11) {
			KCWTSCHR var18;
			if (var14.field1490 == -1 && var14.field1451 == null) {
				var18 = var14.method580(10, arg5, var9, var10, var11, var12, -1);
			} else {
				var18 = new VXTLNFMD(var12, arg3, true, var9, arg5, var10, var11, 10, var14.field1490);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg7 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg5 == 1 || arg5 == 3) {
					var20 = var14.field1470;
					var21 = var14.field1462;
				} else {
					var20 = var14.field1462;
					var21 = var14.field1470;
				}

				if (arg2.method383(arg1, var19, arg0, var16, var21, var20, var15, var13, arg4, var18) && var14.field1453) {
					XBVYIDUH var22;
					if (var18 instanceof XBVYIDUH) {
						var22 = (XBVYIDUH) var18;
					} else {
						var22 = var14.method580(10, arg5, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field1376 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field1125[arg0][arg1 + var23][arg4 + var24]) {
									field1125[arg0][arg1 + var23][arg4 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field1488 && arg6 != null) {
				arg6.method485(arg1, var14.field1462, var14.field1459, arg5, var14.field1470, arg4);
			}
		} else if (arg7 >= 12) {
			KCWTSCHR var26;
			if (var14.field1490 == -1 && var14.field1451 == null) {
				var26 = var14.method580(arg7, arg5, var9, var10, var11, var12, -1);
			} else {
				var26 = new VXTLNFMD(var12, arg3, true, var9, arg5, var10, var11, arg7, var14.field1490);
			}

			arg2.method383(arg1, 0, arg0, var16, 1, 1, var15, var13, arg4, var26);

			if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg0 > 0) {
				field1118[arg0][arg1][arg4] |= 0x924;
			}

			if (var14.field1488 && arg6 != null) {
				arg6.method485(arg1, var14.field1462, var14.field1459, arg5, var14.field1470, arg4);
			}
		} else if (arg7 == 0) {
			KCWTSCHR var27;
			if (var14.field1490 == -1 && var14.field1451 == null) {
				var27 = var14.method580(0, arg5, var9, var10, var11, var12, -1);
			} else {
				var27 = new VXTLNFMD(var12, arg3, true, var9, arg5, var10, var11, 0, var14.field1490);
			}

			arg2.method381(null, var15, field1103[arg5], 0, var13, arg0, var27, arg1, var16, arg4);

			if (arg5 == 0) {
				if (var14.field1453) {
					field1125[arg0][arg1][arg4] = 50;
					field1125[arg0][arg1][arg4 + 1] = 50;
				}

				if (var14.field1461) {
					field1118[arg0][arg1][arg4] |= 0x249;
				}
			} else if (arg5 == 1) {
				if (var14.field1453) {
					field1125[arg0][arg1][arg4 + 1] = 50;
					field1125[arg0][arg1 + 1][arg4 + 1] = 50;
				}

				if (var14.field1461) {
					field1118[arg0][arg1][arg4 + 1] |= 0x492;
				}
			} else if (arg5 == 2) {
				if (var14.field1453) {
					field1125[arg0][arg1 + 1][arg4] = 50;
					field1125[arg0][arg1 + 1][arg4 + 1] = 50;
				}

				if (var14.field1461) {
					field1118[arg0][arg1 + 1][arg4] |= 0x249;
				}
			} else if (arg5 == 3) {
				if (var14.field1453) {
					field1125[arg0][arg1][arg4] = 50;
					field1125[arg0][arg1 + 1][arg4] = 50;
				}

				if (var14.field1461) {
					field1118[arg0][arg1][arg4] |= 0x492;
				}
			}

			if (var14.field1488 && arg6 != null) {
				arg6.method484(arg1, arg5, var14.field1459, arg7, arg4);
			}

			if (var14.field1477 != 16) {
				arg2.method389(arg0, var14.field1477, arg1, arg4);
			}
		} else if (arg7 == 1) {
			KCWTSCHR var28;
			if (var14.field1490 == -1 && var14.field1451 == null) {
				var28 = var14.method580(1, arg5, var9, var10, var11, var12, -1);
			} else {
				var28 = new VXTLNFMD(var12, arg3, true, var9, arg5, var10, var11, 1, var14.field1490);
			}

			arg2.method381(null, var15, field1106[arg5], 0, var13, arg0, var28, arg1, var16, arg4);

			if (var14.field1453) {
				if (arg5 == 0) {
					field1125[arg0][arg1][arg4 + 1] = 50;
				} else if (arg5 == 1) {
					field1125[arg0][arg1 + 1][arg4 + 1] = 50;
				} else if (arg5 == 2) {
					field1125[arg0][arg1 + 1][arg4] = 50;
				} else if (arg5 == 3) {
					field1125[arg0][arg1][arg4] = 50;
				}
			}

			if (var14.field1488 && arg6 != null) {
				arg6.method484(arg1, arg5, var14.field1459, arg7, arg4);
			}
		} else if (arg7 == 2) {
			int var29 = arg5 + 1 & 0x3;
			KCWTSCHR var30;
			KCWTSCHR var31;
			if (var14.field1490 == -1 && var14.field1451 == null) {
				var30 = var14.method580(2, arg5 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method580(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new VXTLNFMD(var12, arg3, true, var9, arg5 + 4, var10, var11, 2, var14.field1490);
				var31 = new VXTLNFMD(var12, arg3, true, var9, var29, var10, var11, 2, var14.field1490);
			}

			arg2.method381(var31, var15, field1103[arg5], field1103[var29], var13, arg0, var30, arg1, var16, arg4);

			if (var14.field1461) {
				if (arg5 == 0) {
					field1118[arg0][arg1][arg4] |= 0x249;
					field1118[arg0][arg1][arg4 + 1] |= 0x492;
				} else if (arg5 == 1) {
					field1118[arg0][arg1][arg4 + 1] |= 0x492;
					field1118[arg0][arg1 + 1][arg4] |= 0x249;
				} else if (arg5 == 2) {
					field1118[arg0][arg1 + 1][arg4] |= 0x249;
					field1118[arg0][arg1][arg4] |= 0x492;
				} else if (arg5 == 3) {
					field1118[arg0][arg1][arg4] |= 0x492;
					field1118[arg0][arg1][arg4] |= 0x249;
				}
			}

			if (var14.field1488 && arg6 != null) {
				arg6.method484(arg1, arg5, var14.field1459, arg7, arg4);
			}

			if (var14.field1477 != 16) {
				arg2.method389(arg0, var14.field1477, arg1, arg4);
			}
		} else if (arg7 == 3) {
			KCWTSCHR var32;
			if (var14.field1490 == -1 && var14.field1451 == null) {
				var32 = var14.method580(3, arg5, var9, var10, var11, var12, -1);
			} else {
				var32 = new VXTLNFMD(var12, arg3, true, var9, arg5, var10, var11, 3, var14.field1490);
			}

			arg2.method381(null, var15, field1106[arg5], 0, var13, arg0, var32, arg1, var16, arg4);

			if (var14.field1453) {
				if (arg5 == 0) {
					field1125[arg0][arg1][arg4 + 1] = 50;
				} else if (arg5 == 1) {
					field1125[arg0][arg1 + 1][arg4 + 1] = 50;
				} else if (arg5 == 2) {
					field1125[arg0][arg1 + 1][arg4] = 50;
				} else if (arg5 == 3) {
					field1125[arg0][arg1][arg4] = 50;
				}
			}

			if (var14.field1488 && arg6 != null) {
				arg6.method484(arg1, arg5, var14.field1459, arg7, arg4);
			}
		} else if (arg7 == 9) {
			KCWTSCHR var33;
			if (var14.field1490 == -1 && var14.field1451 == null) {
				var33 = var14.method580(arg7, arg5, var9, var10, var11, var12, -1);
			} else {
				var33 = new VXTLNFMD(var12, arg3, true, var9, arg5, var10, var11, arg7, var14.field1490);
			}

			arg2.method383(arg1, 0, arg0, var16, 1, 1, var15, var13, arg4, var33);

			if (var14.field1488 && arg6 != null) {
				arg6.method485(arg1, var14.field1462, var14.field1459, arg5, var14.field1470, arg4);
			}
		} else {
			if (var14.field1450) {
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

			if (arg7 == 4) {
				KCWTSCHR var38;
				if (var14.field1490 == -1 && var14.field1451 == null) {
					var38 = var14.method580(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new VXTLNFMD(var12, arg3, true, var9, 0, var10, var11, 4, var14.field1490);
				}

				arg2.method382(var13, var38, var15, arg0, var16, field1103[arg5], arg4, 0, arg5 * 512, 0, arg1);
			} else if (arg7 == 5) {
				int var39 = 16;
				int var40 = arg2.method399(arg0, arg1, arg4);
				if (var40 > 0) {
					var39 = YCVHWRKK.method575(var40 >> 14 & 0x7FFF).field1477;
				}

				KCWTSCHR var41;
				if (var14.field1490 == -1 && var14.field1451 == null) {
					var41 = var14.method580(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new VXTLNFMD(var12, arg3, true, var9, 0, var10, var11, 4, var14.field1490);
				}

				arg2.method382(var13, var41, var15, arg0, var16, field1103[arg5], arg4, field1122[arg5] * var39, arg5 * 512, field1105[arg5] * var39, arg1);
			} else if (arg7 == 6) {
				KCWTSCHR var42;
				if (var14.field1490 == -1 && var14.field1451 == null) {
					var42 = var14.method580(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new VXTLNFMD(var12, arg3, true, var9, 0, var10, var11, 4, var14.field1490);
				}

				arg2.method382(var13, var42, var15, arg0, var16, 256, arg4, 0, arg5, 0, arg1);
			} else if (arg7 == 7) {
				KCWTSCHR var43;
				if (var14.field1490 == -1 && var14.field1451 == null) {
					var43 = var14.method580(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new VXTLNFMD(var12, arg3, true, var9, 0, var10, var11, 4, var14.field1490);
				}

				arg2.method382(var13, var43, var15, arg0, var16, 512, arg4, 0, arg5, 0, arg1);
			} else if (arg7 == 8) {
				KCWTSCHR var44;
				if (var14.field1490 == -1 && var14.field1451 == null) {
					var44 = var14.method580(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new VXTLNFMD(var12, arg3, true, var9, 0, var10, var11, 4, var14.field1490);
				}

				arg2.method382(var13, var44, var15, arg0, var16, 768, arg4, 0, arg5, 0, arg1);
			}
		}
	}

	@ObfuscatedName("RQCEQFSS.b(IIII)I")
	public static final int method479(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - PKGGFQZB.field1027[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("RQCEQFSS.e(II)I")
	public static final int method480(int arg0, int arg1) {
		int var2 = method473(arg0 - 1, arg1 - 1) + method473(arg0 + 1, arg1 - 1) + method473(arg0 - 1, arg1 + 1) + method473(arg0 + 1, arg1 + 1);
		int var3 = method473(arg0 - 1, arg1) + method473(arg0 + 1, arg1) + method473(arg0, arg1 - 1) + method473(arg0, arg1 + 1);
		int var4 = method473(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("RQCEQFSS.c(IIII)I")
	public int method481(int arg0, int arg1, int arg2) {
		if ((field1117[arg1][arg2][arg0] & 0x8) != 0) {
			return 0;
		}

		if (arg1 > 0 && (field1117[1][arg2][arg0] & 0x2) != 0) {
			return arg1 - 1;
		}

		return arg1;
	}

	@ObfuscatedName("RQCEQFSS.c(III)I")
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
}
