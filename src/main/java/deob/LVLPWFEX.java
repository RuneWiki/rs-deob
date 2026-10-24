package deob;

@ObfuscatedName("LVLPWFEX")
public final class LVLPWFEX {

	@ObfuscatedName("LVLPWFEX.o")
	public int field1083;

	@ObfuscatedName("LVLPWFEX.p")
	public int field1084;

	@ObfuscatedName("LVLPWFEX.j")
	public int[][][] field1078;

	@ObfuscatedName("LVLPWFEX.c")
	public byte[][][] field1074;

	@ObfuscatedName("LVLPWFEX.b")
	public byte[][][] field1073;

	@ObfuscatedName("LVLPWFEX.m")
	public byte[][][] field1081;

	@ObfuscatedName("LVLPWFEX.w")
	public byte[][][] field1091;

	@ObfuscatedName("LVLPWFEX.B")
	public byte[][][] field1094;

	@ObfuscatedName("LVLPWFEX.C")
	public int[][][] field1095;

	@ObfuscatedName("LVLPWFEX.l")
	public byte[][][] field1080;

	@ObfuscatedName("LVLPWFEX.D")
	public int[][] field1096;

	@ObfuscatedName("LVLPWFEX.r")
	public int[] field1086;

	@ObfuscatedName("LVLPWFEX.s")
	public int[] field1087;

	@ObfuscatedName("LVLPWFEX.t")
	public int[] field1088;

	@ObfuscatedName("LVLPWFEX.u")
	public int[] field1089;

	@ObfuscatedName("LVLPWFEX.v")
	public int[] field1090;

	@ObfuscatedName("LVLPWFEX.e")
	public static final int[] field1075 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("LVLPWFEX.f")
	public static boolean field1076 = true;

	@ObfuscatedName("LVLPWFEX.k")
	public static final int[] field1079 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("LVLPWFEX.n")
	public static int field1082 = 99;

	@ObfuscatedName("LVLPWFEX.x")
	public static final int[] field1092 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("LVLPWFEX.y")
	public static final int[] field1093 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("LVLPWFEX.a")
	public static int field1072 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("LVLPWFEX.g")
	public static int field1077 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("LVLPWFEX.q")
	public static int field1085;

	@ObfuscatedName("LVLPWFEX.a(II)I")
	public static final int method479(int arg0, int arg1) {
		int var2 = method492(arg0 + 45365, arg1 + 91923, 4) + (method492(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method492(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("LVLPWFEX.a([B[LBXNXROZD;IIIIILKYNTOGBR;III)V")
	public final void method480(byte[] arg0, BXNXROZD[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, KYNTOGBR arg7, int arg8, int arg9) {
		EGCCHUZS var11 = new EGCCHUZS(arg0);
		int var12 = -1;
		while (true) {
			int var13 = var11.method275();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method275();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method261();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg9 == var18 && var17 >= arg6 && var17 < arg6 + 8 && var16 >= arg2 && var16 < arg2 + 8) {
					HGKOLOPU var22 = HGKOLOPU.method326(var12);
					int var23 = arg3 + XNQMQYFY.method572(var22.field697, var21, var22.field715, arg4, var16 & 0x7, var17 & 0x7);
					int var24 = arg8 + XNQMQYFY.method573(var17 & 0x7, var16 & 0x7, var22.field697, var22.field715, arg4, var21);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg5;
						if ((field1074[1][var23][var24] & 0x2) == 2) {
							var25 = arg5 - 1;
						}

						BXNXROZD var26 = null;
						if (var25 >= 0) {
							var26 = arg1[var25];
						}

						method498(var12, arg7, var26, var24, var20, arg5, arg4 + var21 & 0x3, var23);
					}
				}
			}
		}
	}

	@ObfuscatedName("LVLPWFEX.b(II)I")
	public static final int method481(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("LVLPWFEX.a(IIIIIIILEGCCHUZS;)V")
	public final void method482(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, EGCCHUZS arg6) {
		if (arg4 >= 0 && arg4 < 104 && arg1 >= 0 && arg1 < 104) {
			field1074[arg0][arg4][arg1] = 0;
			while (true) {
				int var8 = arg6.method261();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg6.method261();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg0 == 0) {
						field1078[0][arg4][arg1] = -var9 * 8;
						return;
					}

					field1078[arg0][arg4][arg1] = field1078[arg0 - 1][arg4][arg1] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field1081[arg0][arg4][arg1] = arg6.method262();
					field1091[arg0][arg4][arg1] = (byte) ((var8 - 2) / 4);
					field1094[arg0][arg4][arg1] = (byte) (var8 + arg5 - 2 & 0x3);
				} else if (var8 <= 81) {
					field1074[arg0][arg4][arg1] = (byte) (var8 - 49);
				} else {
					field1073[arg0][arg4][arg1] = (byte) (var8 - 81);
				}
			}

			if (arg0 == 0) {
				field1078[0][arg4][arg1] = -method479(arg4 + arg3 + 932731, arg1 + 556238 + arg2) * 8;
			} else {
				field1078[arg0][arg4][arg1] = field1078[arg0 - 1][arg4][arg1] - 240;
			}
		} else {
			while (true) {
				int var10 = arg6.method261();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg6.method261();
					return;
				}

				if (var10 <= 49) {
					arg6.method261();
				}
			}
		}
	}

	@ObfuscatedName("LVLPWFEX.a(IIIII)V")
	public final void method483(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg3; var5 <= arg2 + arg3; var5++) {
			for (int var6 = arg0; var6 <= arg0 + arg1; var6++) {
				if (var6 >= 0 && var6 < field1083 && var5 >= 0 && var5 < field1084) {
					field1080[0][var6][var5] = 127;

					if (arg0 == var6 && var6 > 0) {
						field1078[0][var6][var5] = field1078[0][var6 - 1][var5];
					}

					if (arg0 + arg1 == var6 && var6 < field1083 - 1) {
						field1078[0][var6][var5] = field1078[0][var6 + 1][var5];
					}

					if (arg3 == var5 && var5 > 0) {
						field1078[0][var6][var5] = field1078[0][var6][var5 - 1];
					}

					if (arg2 + arg3 == var5 && var5 < field1084 - 1) {
						field1078[0][var6][var5] = field1078[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("LVLPWFEX.a(IIII)I")
	public static final int method484(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - PNDPOZTD.field1158[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("LVLPWFEX.c(II)I")
	public static final int method485(int arg0, int arg1) {
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

	@ObfuscatedName("LVLPWFEX.b(IIII)I")
	public int method486(int arg0, int arg1, int arg2) {
		if ((field1074[arg0][arg2][arg1] & 0x8) != 0) {
			return 0;
		}

		if (arg0 > 0 && (field1074[1][arg2][arg1] & 0x2) != 0) {
			return arg0 - 1;
		}

		return arg0;
	}

	@ObfuscatedName("LVLPWFEX.d(II)I")
	public final int method487(int arg0, int arg1) {
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

	@ObfuscatedName("LVLPWFEX.e(II)I")
	public static final int method488(int arg0, int arg1) {
		int var2 = method481(arg0 - 1, arg1 - 1) + method481(arg0 + 1, arg1 - 1) + method481(arg0 - 1, arg1 + 1) + method481(arg0 + 1, arg1 + 1);
		int var3 = method481(arg0 - 1, arg1) + method481(arg0 + 1, arg1) + method481(arg0, arg1 - 1) + method481(arg0, arg1 + 1);
		int var4 = method481(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("LVLPWFEX.a(III)I")
	public final int method489(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("LVLPWFEX.a(IIIIII[B[LBXNXROZD;II)V")
	public final void method490(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, BXNXROZD[] arg6, int arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg3 + var10 > 0 && arg3 + var10 < 103 && arg0 + var11 > 0 && arg0 + var11 < 103) {
					arg6[arg7].field49[arg3 + var10][arg0 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		EGCCHUZS var12 = new EGCCHUZS(arg5);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg1 == var13 && var14 >= arg8 && var14 < arg8 + 8 && var15 >= arg2 && var15 < arg2 + 8) {
						method482(arg7, arg0 + XNQMQYFY.method571(arg4, var15 & 0x7, var14 & 0x7), 0, 0, arg3 + XNQMQYFY.method570(var15 & 0x7, var14 & 0x7, arg4), arg4, var12);
					} else {
						method482(0, -1, 0, 0, -1, 0, var12);
					}
				}
			}
		}
	}

	@ObfuscatedName("LVLPWFEX.a(Z[BII)Z")
	public static final boolean method491(byte[] arg0, int arg1, int arg2) {
		boolean var3 = true;
		EGCCHUZS var4 = new EGCCHUZS(arg0);
		int var5 = -1;
		while (true) {
			int var6 = var4.method275();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method275();
					if (var9 == 0) {
						break;
					}

					var4.method261();
				} else {
					int var10 = var4.method275();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method261() >> 2;
					int var14 = arg1 + var12;
					int var15 = arg2 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						HGKOLOPU var16 = HGKOLOPU.method326(var5);
						if (var13 != 22 || !field1076 || var16.field705 || var16.field684) {
							var3 &= var16.method322();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("LVLPWFEX.b(III)I")
	public static final int method492(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method488(var3, var5);
		int var8 = method488(var3 + 1, var5);
		int var9 = method488(var3, var5 + 1);
		int var10 = method488(var3 + 1, var5 + 1);
		int var11 = method484(var7, var8, var4, arg2);
		int var12 = method484(var9, var10, var4, arg2);
		return method484(var11, var12, var6, arg2);
	}

	@ObfuscatedName("LVLPWFEX.a([LBXNXROZD;BII[BII)V")
	public final void method493(BXNXROZD[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg1 + var8 > 0 && arg1 + var8 < 103 && arg2 + var9 > 0 && arg2 + var9 < 103) {
						arg0[var7].field49[arg1 + var8][arg2 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		EGCCHUZS var10 = new EGCCHUZS(arg3);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method482(var11, arg2 + var13, arg4, arg5, arg1 + var12, 0, var10);
				}
			}
		}
	}

	public LVLPWFEX(int[][][] arg0, int arg1, int arg2, byte[][][] arg3) {
		field1082 = 99;
		field1083 = arg2;
		field1084 = arg1;
		field1078 = arg0;
		field1074 = arg3;
		field1073 = new byte[4][field1083][field1084];
		field1081 = new byte[4][field1083][field1084];
		field1091 = new byte[4][field1083][field1084];
		field1094 = new byte[4][field1083][field1084];
		field1095 = new int[4][field1083 + 1][field1084 + 1];
		field1080 = new byte[4][field1083 + 1][field1084 + 1];
		field1096 = new int[field1083 + 1][field1084 + 1];
		field1086 = new int[field1084];
		field1087 = new int[field1084];
		field1088 = new int[field1084];
		field1089 = new int[field1084];
		field1090 = new int[field1084];
	}

	@ObfuscatedName("LVLPWFEX.a([LBXNXROZD;LKYNTOGBR;Z)V")
	public final void method494(BXNXROZD[] arg0, KYNTOGBR arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field1074[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field1074[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg0[var6].method15(var4, var5);
						}
					}
				}
			}
		}

		field1072 += (int) (Math.random() * 5.0D) - 2;
		if (field1072 < -8) {
			field1072 = -8;
		}

		if (field1072 > 8) {
			field1072 = 8;
		}

		field1077 += (int) (Math.random() * 5.0D) - 2;
		if (field1077 < -16) {
			field1077 = -16;
		}

		if (field1077 > 16) {
			field1077 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field1080[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field1084 - 1; var16++) {
				for (int var17 = 1; var17 < field1083 - 1; var17++) {
					int var18 = field1078[var7][var17 + 1][var16] - field1078[var7][var17 - 1][var16];
					int var19 = field1078[var7][var17][var16 + 1] - field1078[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field1096[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field1084; var26++) {
				field1086[var26] = 0;
				field1087[var26] = 0;
				field1088[var26] = 0;
				field1089[var26] = 0;
				field1090[var26] = 0;
			}

			for (int var27 = -5; var27 < field1083 + 5; var27++) {
				for (int var28 = 0; var28 < field1084; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field1083) {
						int var30 = field1073[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							GLVFVUWP var31 = GLVFVUWP.field669[var30 - 1];
							field1086[var28] += var31.field678;
							field1087[var28] += var31.field676;
							field1088[var28] += var31.field677;
							field1089[var28] += var31.field679;
							field1090[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field1083) {
						int var33 = field1073[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							GLVFVUWP var34 = GLVFVUWP.field669[var33 - 1];
							field1086[var28] -= var34.field678;
							field1087[var28] -= var34.field676;
							field1088[var28] -= var34.field677;
							field1089[var28] -= var34.field679;
							field1090[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field1083 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field1084 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field1084) {
							var35 += field1086[var41];
							var36 += field1087[var41];
							var37 += field1088[var41];
							var38 += field1089[var41];
							var39 += field1090[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field1084) {
							var35 -= field1086[var42];
							var36 -= field1087[var42];
							var37 -= field1088[var42];
							var38 -= field1089[var42];
							var39 -= field1090[var42];
						}

						if (var40 >= 1 && var40 < field1084 - 1 && (!field1076 || (field1074[0][var27][var40] & 0x2) != 0 || (field1074[var7][var27][var40] & 0x10) == 0 && method486(var7, var40, var27) == field1085)) {
							if (var7 < field1082) {
								field1082 = var7;
							}

							int var43 = field1073[var7][var27][var40] & 0xFF;
							int var44 = field1081[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field1078[var7][var27][var40];
								int var46 = field1078[var7][var27 + 1][var40];
								int var47 = field1078[var7][var27 + 1][var40 + 1];
								int var48 = field1078[var7][var27][var40 + 1];
								int var49 = field1096[var27][var40];
								int var50 = field1096[var27 + 1][var40];
								int var51 = field1096[var27 + 1][var40 + 1];
								int var52 = field1096[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method489(var55, var56, var57);
									var55 = field1072 + var55 & 0xFF;
									var57 += field1077;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method489(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field1091[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !GLVFVUWP.field669[var44 - 1].field674) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field1095[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = PNDPOZTD.field1169[method485(var54, 96)];
								}

								if (var44 == 0) {
									arg1.method419(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method485(var53, var49), method485(var53, var50), method485(var53, var51), method485(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field1091[var7][var27][var40] + 1;
									byte var61 = field1094[var7][var27][var40];
									GLVFVUWP var62 = GLVFVUWP.field669[var44 - 1];
									int var63 = var62.field672;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = PNDPOZTD.method508(var63);
										var65 = -1;
									} else if (var62.field671 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method489(var62.field675, var62.field676, var62.field677);
										var64 = PNDPOZTD.field1169[method487(var62.field680, 96)];
									}

									arg1.method419(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method485(var53, var49), method485(var53, var50), method485(var53, var51), method485(var53, var52), method487(var65, var49), method487(var65, var50), method487(var65, var51), method487(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field1084 - 1; var66++) {
				for (int var67 = 1; var67 < field1083 - 1; var67++) {
					arg1.method418(var7, var67, var66, method486(var7, var66, var67));
				}
			}
		}

		arg1.method445(768, -50, 64, -50, -10);

		for (int var68 = 0; var68 < field1083; var68++) {
			for (int var69 = 0; var69 < field1084; var69++) {
				if ((field1074[1][var68][var69] & 0x2) == 2) {
					arg1.method416(var69, var68);
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
				for (int var75 = 0; var75 <= field1084; var75++) {
					for (int var76 = 0; var76 <= field1083; var76++) {
						if ((field1095[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field1095[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field1084 && (field1095[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field1095[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field1095[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field1078[var80][var76][var77] - var84;
								int var86 = field1078[var79][var76][var77];
								KYNTOGBR.method417(var85, 1, var73, var76 * 128, var78 * 128 + 128, var77 * 128, var86, var76 * 128);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field1095[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field1095[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field1095[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field1083 && (field1095[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field1095[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field1095[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field1078[var92][var89][var75] - var96;
								int var98 = field1078[var91][var89][var75];
								KYNTOGBR.method417(var97, 2, var73, var89 * 128, var75 * 128, var75 * 128, var98, var90 * 128 + 128);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field1095[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field1095[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field1095[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field1084 && (field1095[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field1095[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field1083) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field1095[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field1078[var74][var101][var103];
								KYNTOGBR.method417(var107, 4, var73, var101 * 128, var104 * 128 + 128, var103 * 128, var107, var102 * 128 + 128);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field1095[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("LVLPWFEX.a(LEGCCHUZS;LDHNAQSHE;I)V")
	public static final void method495(EGCCHUZS arg0, DHNAQSHE arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method275();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			HGKOLOPU var4 = HGKOLOPU.method326(var2);
			var4.method320(arg1);

			while (true) {
				int var5 = arg0.method275();
				if (var5 == 0) {
					break;
				}

				arg0.method261();
			}
		}
	}

	@ObfuscatedName("LVLPWFEX.a(LKYNTOGBR;[[[IIIILBXNXROZD;IIIII)V")
	public static final void method496(KYNTOGBR arg0, int[][][] arg1, int arg2, int arg3, int arg4, BXNXROZD arg5, int arg6, int arg7, int arg8, int arg9) {
		int var10 = arg1[arg2][arg6][arg7];
		int var11 = arg1[arg2][arg6 + 1][arg7];
		int var12 = arg1[arg2][arg6 + 1][arg7 + 1];
		int var13 = arg1[arg2][arg6][arg7 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		HGKOLOPU var15 = HGKOLOPU.method326(arg4);
		int var16 = (arg4 << 14) + (arg7 << 7) + arg6 + 0x40000000;
		if (!var15.field705) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg9 << 6) + arg3);
		if (arg3 == 22) {
			BXTJETAB var18;
			if (var15.field708 == -1 && var15.field691 == null) {
				var18 = var15.method321(22, arg9, var10, var11, var12, var13, -1);
			} else {
				var18 = new WFUJSESJ(var15.field708, var10, arg9, var11, arg4, 22, true, var12, var13);
			}

			arg0.method420(arg8, var17, var14, arg7, var16, arg6, var18);

			if (var15.field719 && var15.field705) {
				arg5.method15(arg6, arg7);
			}
		} else if (arg3 == 10 || arg3 == 11) {
			BXTJETAB var19;
			if (var15.field708 == -1 && var15.field691 == null) {
				var19 = var15.method321(10, arg9, var10, var11, var12, var13, -1);
			} else {
				var19 = new WFUJSESJ(var15.field708, var10, arg9, var11, arg4, 10, true, var12, var13);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg3 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg9 == 1 || arg9 == 3) {
					var21 = var15.field697;
					var22 = var15.field715;
				} else {
					var21 = var15.field715;
					var22 = var15.field697;
				}

				arg0.method424(var14, var19, arg6, var21, arg8, var22, var20, var17, arg7, var16);
			}

			if (var15.field719) {
				arg5.method14(arg9, var15.field715, arg7, arg6, var15.field726, var15.field697);
			}
		} else if (arg3 >= 12) {
			BXTJETAB var23;
			if (var15.field708 == -1 && var15.field691 == null) {
				var23 = var15.method321(arg3, arg9, var10, var11, var12, var13, -1);
			} else {
				var23 = new WFUJSESJ(var15.field708, var10, arg9, var11, arg4, arg3, true, var12, var13);
			}

			arg0.method424(var14, var23, arg6, 1, arg8, 1, 0, var17, arg7, var16);

			if (var15.field719) {
				arg5.method14(arg9, var15.field715, arg7, arg6, var15.field726, var15.field697);
			}
		} else if (arg3 == 0) {
			BXTJETAB var24;
			if (var15.field708 == -1 && var15.field691 == null) {
				var24 = var15.method321(0, arg9, var10, var11, var12, var13, -1);
			} else {
				var24 = new WFUJSESJ(var15.field708, var10, arg9, var11, arg4, 0, true, var12, var13);
			}

			arg0.method422(0, arg8, null, var16, var14, arg6, field1092[arg9], var24, arg7, var17);

			if (var15.field719) {
				arg5.method13(arg3, arg9, var15.field726, arg6, arg7);
			}
		} else if (arg3 == 1) {
			BXTJETAB var25;
			if (var15.field708 == -1 && var15.field691 == null) {
				var25 = var15.method321(1, arg9, var10, var11, var12, var13, -1);
			} else {
				var25 = new WFUJSESJ(var15.field708, var10, arg9, var11, arg4, 1, true, var12, var13);
			}

			arg0.method422(0, arg8, null, var16, var14, arg6, field1093[arg9], var25, arg7, var17);

			if (var15.field719) {
				arg5.method13(arg3, arg9, var15.field726, arg6, arg7);
			}
		} else if (arg3 == 2) {
			int var26 = arg9 + 1 & 0x3;
			BXTJETAB var27;
			BXTJETAB var28;
			if (var15.field708 == -1 && var15.field691 == null) {
				var27 = var15.method321(2, arg9 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method321(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new WFUJSESJ(var15.field708, var10, arg9 + 4, var11, arg4, 2, true, var12, var13);
				var28 = new WFUJSESJ(var15.field708, var10, var26, var11, arg4, 2, true, var12, var13);
			}

			arg0.method422(field1092[var26], arg8, var28, var16, var14, arg6, field1092[arg9], var27, arg7, var17);

			if (var15.field719) {
				arg5.method13(arg3, arg9, var15.field726, arg6, arg7);
			}
		} else if (arg3 == 3) {
			BXTJETAB var29;
			if (var15.field708 == -1 && var15.field691 == null) {
				var29 = var15.method321(3, arg9, var10, var11, var12, var13, -1);
			} else {
				var29 = new WFUJSESJ(var15.field708, var10, arg9, var11, arg4, 3, true, var12, var13);
			}

			arg0.method422(0, arg8, null, var16, var14, arg6, field1093[arg9], var29, arg7, var17);

			if (var15.field719) {
				arg5.method13(arg3, arg9, var15.field726, arg6, arg7);
			}
		} else if (arg3 == 9) {
			BXTJETAB var30;
			if (var15.field708 == -1 && var15.field691 == null) {
				var30 = var15.method321(arg3, arg9, var10, var11, var12, var13, -1);
			} else {
				var30 = new WFUJSESJ(var15.field708, var10, arg9, var11, arg4, arg3, true, var12, var13);
			}

			arg0.method424(var14, var30, arg6, 1, arg8, 1, 0, var17, arg7, var16);

			if (var15.field719) {
				arg5.method14(arg9, var15.field715, arg7, arg6, var15.field726, var15.field697);
			}
		} else {
			if (var15.field729) {
				if (arg9 == 1) {
					int var31 = var13;
					var13 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var31;
				} else if (arg9 == 2) {
					int var32 = var13;
					var13 = var11;
					var11 = var32;
					int var33 = var12;
					var12 = var10;
					var10 = var33;
				} else if (arg9 == 3) {
					int var34 = var13;
					var13 = var10;
					var10 = var11;
					var11 = var12;
					var12 = var34;
				}
			}

			if (arg3 == 4) {
				BXTJETAB var35;
				if (var15.field708 == -1 && var15.field691 == null) {
					var35 = var15.method321(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new WFUJSESJ(var15.field708, var10, 0, var11, arg4, 4, true, var12, var13);
				}

				arg0.method423(var14, 0, var35, field1092[arg9], arg6, 0, arg9 * 512, arg8, arg7, var17, var16);
			} else if (arg3 == 5) {
				int var36 = 16;
				int var37 = arg0.method440(arg8, arg6, arg7);
				if (var37 > 0) {
					var36 = HGKOLOPU.method326(var37 >> 14 & 0x7FFF).field724;
				}

				BXTJETAB var38;
				if (var15.field708 == -1 && var15.field691 == null) {
					var38 = var15.method321(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new WFUJSESJ(var15.field708, var10, 0, var11, arg4, 4, true, var12, var13);
				}

				arg0.method423(var14, field1079[arg9] * var36, var38, field1092[arg9], arg6, field1075[arg9] * var36, arg9 * 512, arg8, arg7, var17, var16);
			} else if (arg3 == 6) {
				BXTJETAB var39;
				if (var15.field708 == -1 && var15.field691 == null) {
					var39 = var15.method321(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new WFUJSESJ(var15.field708, var10, 0, var11, arg4, 4, true, var12, var13);
				}

				arg0.method423(var14, 0, var39, 256, arg6, 0, arg9, arg8, arg7, var17, var16);
			} else if (arg3 == 7) {
				BXTJETAB var40;
				if (var15.field708 == -1 && var15.field691 == null) {
					var40 = var15.method321(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new WFUJSESJ(var15.field708, var10, 0, var11, arg4, 4, true, var12, var13);
				}

				arg0.method423(var14, 0, var40, 512, arg6, 0, arg9, arg8, arg7, var17, var16);
			} else if (arg3 == 8) {
				BXTJETAB var41;
				if (var15.field708 == -1 && var15.field691 == null) {
					var41 = var15.method321(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new WFUJSESJ(var15.field708, var10, 0, var11, arg4, 4, true, var12, var13);
				}

				arg0.method423(var14, 0, var41, 768, arg6, 0, arg9, arg8, arg7, var17, var16);
			}
		}
	}

	@ObfuscatedName("LVLPWFEX.a(IIZ)Z")
	public static final boolean method497(int arg0, int arg1) {
		HGKOLOPU var2 = HGKOLOPU.method326(arg1);

		if (arg0 == 11) {
			arg0 = 10;
		}

		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}

		return var2.method328(arg0);
	}

	@ObfuscatedName("LVLPWFEX.a(ILKYNTOGBR;LBXNXROZD;IIIBII)V")
	public final void method498(int arg0, KYNTOGBR arg1, BXNXROZD arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field1076 && (field1074[0][arg7][arg3] & 0x2) == 0) {
			if ((field1074[arg5][arg7][arg3] & 0x10) != 0) {
				return;
			}

			if (method486(arg5, arg3, arg7) != field1085) {
				return;
			}
		}

		if (arg5 < field1082) {
			field1082 = arg5;
		}

		int var9 = field1078[arg5][arg7][arg3];
		int var10 = field1078[arg5][arg7 + 1][arg3];
		int var11 = field1078[arg5][arg7 + 1][arg3 + 1];
		int var12 = field1078[arg5][arg7][arg3 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		HGKOLOPU var14 = HGKOLOPU.method326(arg0);
		int var15 = (arg0 << 14) + (arg3 << 7) + arg7 + 0x40000000;
		if (!var14.field705) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg6 << 6) + arg4);
		if (arg4 == 22) {
			if (!field1076 || var14.field705 || var14.field684) {
				BXTJETAB var17;
				if (var14.field708 == -1 && var14.field691 == null) {
					var17 = var14.method321(22, arg6, var9, var10, var11, var12, -1);
				} else {
					var17 = new WFUJSESJ(var14.field708, var9, arg6, var10, arg0, 22, true, var11, var12);
				}

				arg1.method420(arg5, var16, var13, arg3, var15, arg7, var17);

				if (var14.field719 && var14.field705 && arg2 != null) {
					arg2.method15(arg7, arg3);
				}
			}
		} else if (arg4 == 10 || arg4 == 11) {
			BXTJETAB var18;
			if (var14.field708 == -1 && var14.field691 == null) {
				var18 = var14.method321(10, arg6, var9, var10, var11, var12, -1);
			} else {
				var18 = new WFUJSESJ(var14.field708, var9, arg6, var10, arg0, 10, true, var11, var12);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg4 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg6 == 1 || arg6 == 3) {
					var20 = var14.field697;
					var21 = var14.field715;
				} else {
					var20 = var14.field715;
					var21 = var14.field697;
				}

				if (arg1.method424(var13, var18, arg7, var20, arg5, var21, var19, var16, arg3, var15) && var14.field701) {
					IGXVZOHI var22;
					if (var18 instanceof IGXVZOHI) {
						var22 = (IGXVZOHI) var18;
					} else {
						var22 = var14.method321(10, arg6, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field802 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field1080[arg5][arg7 + var23][arg3 + var24]) {
									field1080[arg5][arg7 + var23][arg3 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field719 && arg2 != null) {
				arg2.method14(arg6, var14.field715, arg3, arg7, var14.field726, var14.field697);
			}
		} else if (arg4 >= 12) {
			BXTJETAB var26;
			if (var14.field708 == -1 && var14.field691 == null) {
				var26 = var14.method321(arg4, arg6, var9, var10, var11, var12, -1);
			} else {
				var26 = new WFUJSESJ(var14.field708, var9, arg6, var10, arg0, arg4, true, var11, var12);
			}

			arg1.method424(var13, var26, arg7, 1, arg5, 1, 0, var16, arg3, var15);

			if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg5 > 0) {
				field1095[arg5][arg7][arg3] |= 0x924;
			}

			if (var14.field719 && arg2 != null) {
				arg2.method14(arg6, var14.field715, arg3, arg7, var14.field726, var14.field697);
			}
		} else if (arg4 == 0) {
			BXTJETAB var27;
			if (var14.field708 == -1 && var14.field691 == null) {
				var27 = var14.method321(0, arg6, var9, var10, var11, var12, -1);
			} else {
				var27 = new WFUJSESJ(var14.field708, var9, arg6, var10, arg0, 0, true, var11, var12);
			}

			arg1.method422(0, arg5, null, var15, var13, arg7, field1092[arg6], var27, arg3, var16);

			if (arg6 == 0) {
				if (var14.field701) {
					field1080[arg5][arg7][arg3] = 50;
					field1080[arg5][arg7][arg3 + 1] = 50;
				}

				if (var14.field713) {
					field1095[arg5][arg7][arg3] |= 0x249;
				}
			} else if (arg6 == 1) {
				if (var14.field701) {
					field1080[arg5][arg7][arg3 + 1] = 50;
					field1080[arg5][arg7 + 1][arg3 + 1] = 50;
				}

				if (var14.field713) {
					field1095[arg5][arg7][arg3 + 1] |= 0x492;
				}
			} else if (arg6 == 2) {
				if (var14.field701) {
					field1080[arg5][arg7 + 1][arg3] = 50;
					field1080[arg5][arg7 + 1][arg3 + 1] = 50;
				}

				if (var14.field713) {
					field1095[arg5][arg7 + 1][arg3] |= 0x249;
				}
			} else if (arg6 == 3) {
				if (var14.field701) {
					field1080[arg5][arg7][arg3] = 50;
					field1080[arg5][arg7 + 1][arg3] = 50;
				}

				if (var14.field713) {
					field1095[arg5][arg7][arg3] |= 0x492;
				}
			}

			if (var14.field719 && arg2 != null) {
				arg2.method13(arg4, arg6, var14.field726, arg7, arg3);
			}

			if (var14.field724 != 16) {
				arg1.method430(arg7, var14.field724, arg5, arg3);
			}
		} else if (arg4 == 1) {
			BXTJETAB var28;
			if (var14.field708 == -1 && var14.field691 == null) {
				var28 = var14.method321(1, arg6, var9, var10, var11, var12, -1);
			} else {
				var28 = new WFUJSESJ(var14.field708, var9, arg6, var10, arg0, 1, true, var11, var12);
			}

			arg1.method422(0, arg5, null, var15, var13, arg7, field1093[arg6], var28, arg3, var16);

			if (var14.field701) {
				if (arg6 == 0) {
					field1080[arg5][arg7][arg3 + 1] = 50;
				} else if (arg6 == 1) {
					field1080[arg5][arg7 + 1][arg3 + 1] = 50;
				} else if (arg6 == 2) {
					field1080[arg5][arg7 + 1][arg3] = 50;
				} else if (arg6 == 3) {
					field1080[arg5][arg7][arg3] = 50;
				}
			}

			if (var14.field719 && arg2 != null) {
				arg2.method13(arg4, arg6, var14.field726, arg7, arg3);
			}
		} else if (arg4 == 2) {
			int var29 = arg6 + 1 & 0x3;
			BXTJETAB var30;
			BXTJETAB var31;
			if (var14.field708 == -1 && var14.field691 == null) {
				var30 = var14.method321(2, arg6 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method321(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new WFUJSESJ(var14.field708, var9, arg6 + 4, var10, arg0, 2, true, var11, var12);
				var31 = new WFUJSESJ(var14.field708, var9, var29, var10, arg0, 2, true, var11, var12);
			}

			arg1.method422(field1092[var29], arg5, var31, var15, var13, arg7, field1092[arg6], var30, arg3, var16);

			if (var14.field713) {
				if (arg6 == 0) {
					field1095[arg5][arg7][arg3] |= 0x249;
					field1095[arg5][arg7][arg3 + 1] |= 0x492;
				} else if (arg6 == 1) {
					field1095[arg5][arg7][arg3 + 1] |= 0x492;
					field1095[arg5][arg7 + 1][arg3] |= 0x249;
				} else if (arg6 == 2) {
					field1095[arg5][arg7 + 1][arg3] |= 0x249;
					field1095[arg5][arg7][arg3] |= 0x492;
				} else if (arg6 == 3) {
					field1095[arg5][arg7][arg3] |= 0x492;
					field1095[arg5][arg7][arg3] |= 0x249;
				}
			}

			if (var14.field719 && arg2 != null) {
				arg2.method13(arg4, arg6, var14.field726, arg7, arg3);
			}

			if (var14.field724 != 16) {
				arg1.method430(arg7, var14.field724, arg5, arg3);
			}
		} else if (arg4 == 3) {
			BXTJETAB var32;
			if (var14.field708 == -1 && var14.field691 == null) {
				var32 = var14.method321(3, arg6, var9, var10, var11, var12, -1);
			} else {
				var32 = new WFUJSESJ(var14.field708, var9, arg6, var10, arg0, 3, true, var11, var12);
			}

			arg1.method422(0, arg5, null, var15, var13, arg7, field1093[arg6], var32, arg3, var16);

			if (var14.field701) {
				if (arg6 == 0) {
					field1080[arg5][arg7][arg3 + 1] = 50;
				} else if (arg6 == 1) {
					field1080[arg5][arg7 + 1][arg3 + 1] = 50;
				} else if (arg6 == 2) {
					field1080[arg5][arg7 + 1][arg3] = 50;
				} else if (arg6 == 3) {
					field1080[arg5][arg7][arg3] = 50;
				}
			}

			if (var14.field719 && arg2 != null) {
				arg2.method13(arg4, arg6, var14.field726, arg7, arg3);
			}
		} else if (arg4 == 9) {
			BXTJETAB var33;
			if (var14.field708 == -1 && var14.field691 == null) {
				var33 = var14.method321(arg4, arg6, var9, var10, var11, var12, -1);
			} else {
				var33 = new WFUJSESJ(var14.field708, var9, arg6, var10, arg0, arg4, true, var11, var12);
			}

			arg1.method424(var13, var33, arg7, 1, arg5, 1, 0, var16, arg3, var15);

			if (var14.field719 && arg2 != null) {
				arg2.method14(arg6, var14.field715, arg3, arg7, var14.field726, var14.field697);
			}
		} else {
			if (var14.field729) {
				if (arg6 == 1) {
					int var34 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var9;
					var9 = var34;
				} else if (arg6 == 2) {
					int var35 = var12;
					var12 = var10;
					var10 = var35;
					int var36 = var11;
					var11 = var9;
					var9 = var36;
				} else if (arg6 == 3) {
					int var37 = var12;
					var12 = var9;
					var9 = var10;
					var10 = var11;
					var11 = var37;
				}
			}

			if (arg4 == 4) {
				BXTJETAB var38;
				if (var14.field708 == -1 && var14.field691 == null) {
					var38 = var14.method321(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new WFUJSESJ(var14.field708, var9, 0, var10, arg0, 4, true, var11, var12);
				}

				arg1.method423(var13, 0, var38, field1092[arg6], arg7, 0, arg6 * 512, arg5, arg3, var16, var15);
			} else if (arg4 == 5) {
				int var39 = 16;
				int var40 = arg1.method440(arg5, arg7, arg3);
				if (var40 > 0) {
					var39 = HGKOLOPU.method326(var40 >> 14 & 0x7FFF).field724;
				}

				BXTJETAB var41;
				if (var14.field708 == -1 && var14.field691 == null) {
					var41 = var14.method321(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new WFUJSESJ(var14.field708, var9, 0, var10, arg0, 4, true, var11, var12);
				}

				arg1.method423(var13, field1079[arg6] * var39, var41, field1092[arg6], arg7, field1075[arg6] * var39, arg6 * 512, arg5, arg3, var16, var15);
			} else if (arg4 == 6) {
				BXTJETAB var42;
				if (var14.field708 == -1 && var14.field691 == null) {
					var42 = var14.method321(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new WFUJSESJ(var14.field708, var9, 0, var10, arg0, 4, true, var11, var12);
				}

				arg1.method423(var13, 0, var42, 256, arg7, 0, arg6, arg5, arg3, var16, var15);
			} else if (arg4 == 7) {
				BXTJETAB var43;
				if (var14.field708 == -1 && var14.field691 == null) {
					var43 = var14.method321(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new WFUJSESJ(var14.field708, var9, 0, var10, arg0, 4, true, var11, var12);
				}

				arg1.method423(var13, 0, var43, 512, arg7, 0, arg6, arg5, arg3, var16, var15);
			} else if (arg4 == 8) {
				BXTJETAB var44;
				if (var14.field708 == -1 && var14.field691 == null) {
					var44 = var14.method321(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new WFUJSESJ(var14.field708, var9, 0, var10, arg0, 4, true, var11, var12);
				}

				arg1.method423(var13, 0, var44, 768, arg7, 0, arg6, arg5, arg3, var16, var15);
			}
		}
	}

	@ObfuscatedName("LVLPWFEX.a(ILKYNTOGBR;I[B[LBXNXROZD;I)V")
	public final void method499(int arg0, KYNTOGBR arg1, byte[] arg2, BXNXROZD[] arg3, int arg4) {
		EGCCHUZS var6 = new EGCCHUZS(arg2);
		int var7 = -1;
		while (true) {
			int var8 = var6.method275();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method275();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method261();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg4 + var12;
				int var18 = arg0 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field1074[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					BXNXROZD var20 = null;
					if (var19 >= 0) {
						var20 = arg3[var19];
					}

					method498(var7, arg1, var20, var18, var15, var13, var16, var17);
				}
			}
		}
	}
}
