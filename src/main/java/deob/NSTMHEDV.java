package deob;

@ObfuscatedName("NSTMHEDV")
public final class NSTMHEDV {

	@ObfuscatedName("NSTMHEDV.m")
	public int field1046;

	@ObfuscatedName("NSTMHEDV.n")
	public int field1047;

	@ObfuscatedName("NSTMHEDV.u")
	public int[][][] field1053;

	@ObfuscatedName("NSTMHEDV.J")
	public byte[][][] field1061;

	@ObfuscatedName("NSTMHEDV.e")
	public byte[][][] field1040;

	@ObfuscatedName("NSTMHEDV.b")
	public byte[][][] field1037;

	@ObfuscatedName("NSTMHEDV.d")
	public byte[][][] field1039;

	@ObfuscatedName("NSTMHEDV.C")
	public byte[][][] field1059;

	@ObfuscatedName("NSTMHEDV.s")
	public int[][][] field1052;

	@ObfuscatedName("NSTMHEDV.r")
	public byte[][][] field1051;

	@ObfuscatedName("NSTMHEDV.q")
	public int[][] field1050;

	@ObfuscatedName("NSTMHEDV.x")
	public int[] field1054;

	@ObfuscatedName("NSTMHEDV.y")
	public int[] field1055;

	@ObfuscatedName("NSTMHEDV.z")
	public int[] field1056;

	@ObfuscatedName("NSTMHEDV.A")
	public int[] field1057;

	@ObfuscatedName("NSTMHEDV.B")
	public int[] field1058;

	@ObfuscatedName("NSTMHEDV.h")
	public static final int[] field1042 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("NSTMHEDV.k")
	public static boolean field1044 = true;

	@ObfuscatedName("NSTMHEDV.l")
	public static int field1045 = 99;

	@ObfuscatedName("NSTMHEDV.o")
	public static final int[] field1048 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("NSTMHEDV.p")
	public static final int[] field1049 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("NSTMHEDV.G")
	public static final int[] field1060 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("NSTMHEDV.c")
	public static int field1038 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("NSTMHEDV.j")
	public static int field1043 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("NSTMHEDV.g")
	public static int field1041;

	@ObfuscatedName("NSTMHEDV.a(ZLDNRIFKTO;LMWSOISVX;)V")
	public static final void method357(DNRIFKTO arg0, MWSOISVX arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method203();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			SRQVPDWQ var4 = SRQVPDWQ.method445(var2);
			var4.method448(arg1);

			while (true) {
				int var5 = arg0.method203();
				if (var5 == 0) {
					break;
				}

				arg0.method189();
			}
		}
	}

	@ObfuscatedName("NSTMHEDV.a(LDNRIFKTO;IIIIIII)V")
	public final void method358(DNRIFKTO arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg6 >= 0 && arg6 < 104 && arg1 >= 0 && arg1 < 104) {
			field1061[arg3][arg6][arg1] = 0;
			while (true) {
				int var8 = arg0.method189();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg0.method189();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg3 == 0) {
						field1053[0][arg6][arg1] = -var9 * 8;
						return;
					}

					field1053[arg3][arg6][arg1] = field1053[arg3 - 1][arg6][arg1] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field1037[arg3][arg6][arg1] = arg0.method190();
					field1039[arg3][arg6][arg1] = (byte) ((var8 - 2) / 4);
					field1059[arg3][arg6][arg1] = (byte) (var8 + arg4 - 2 & 0x3);
				} else if (var8 <= 81) {
					field1061[arg3][arg6][arg1] = (byte) (var8 - 49);
				} else {
					field1040[arg3][arg6][arg1] = (byte) (var8 - 81);
				}
			}

			if (arg3 == 0) {
				field1053[0][arg6][arg1] = -method362(arg6 + arg2 + 932731, arg1 + 556238 + arg5) * 8;
			} else {
				field1053[arg3][arg6][arg1] = field1053[arg3 - 1][arg6][arg1] - 240;
			}
		} else {
			while (true) {
				int var10 = arg0.method189();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg0.method189();
					return;
				}

				if (var10 <= 49) {
					arg0.method189();
				}
			}
		}
	}

	@ObfuscatedName("NSTMHEDV.a(IZIII)V")
	public final void method359(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg2; var5 <= arg1 + arg2; var5++) {
			for (int var6 = arg3; var6 <= arg0 + arg3; var6++) {
				if (var6 >= 0 && var6 < field1046 && var5 >= 0 && var5 < field1047) {
					field1051[0][var6][var5] = 127;

					if (arg3 == var6 && var6 > 0) {
						field1053[0][var6][var5] = field1053[0][var6 - 1][var5];
					}

					if (arg0 + arg3 == var6 && var6 < field1046 - 1) {
						field1053[0][var6][var5] = field1053[0][var6 + 1][var5];
					}

					if (arg2 == var5 && var5 > 0) {
						field1053[0][var6][var5] = field1053[0][var6][var5 - 1];
					}

					if (arg1 + arg2 == var5 && var5 < field1047 - 1) {
						field1053[0][var6][var5] = field1053[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("NSTMHEDV.a(III)I")
	public final int method360(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("NSTMHEDV.a(II)I")
	public final int method361(int arg0, int arg1) {
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

	@ObfuscatedName("NSTMHEDV.b(II)I")
	public static final int method362(int arg0, int arg1) {
		int var2 = method367(arg0 + 45365, arg1 + 91923, 4) + (method367(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method367(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("NSTMHEDV.a(IIII)I")
	public static final int method363(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - AWNOLVYV.field31[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("NSTMHEDV.a(IIIIIIILURWDWMOD;LXSMXYXEY;I[[[I)V")
	public static final void method364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, URWDWMOD arg6, XSMXYXEY arg7, int arg8, int[][][] arg9) {
		int var10 = arg9[arg5][arg4][arg2];
		int var11 = arg9[arg5][arg4 + 1][arg2];
		int var12 = arg9[arg5][arg4 + 1][arg2 + 1];
		int var13 = arg9[arg5][arg4][arg2 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		SRQVPDWQ var15 = SRQVPDWQ.method445(arg3);
		int var16 = (arg3 << 14) + (arg2 << 7) + arg4 + 0x40000000;
		if (!var15.field1249) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg0 << 6) + arg8);
		if (arg8 == 22) {
			XEUTUWWF var18;
			if (var15.field1264 == -1 && var15.field1247 == null) {
				var18 = var15.method446(22, arg0, var10, var11, var12, var13, -1);
			} else {
				var18 = new OXCIEWBY(var10, var11, var15.field1264, arg0, var12, arg3, var13, true, 22);
			}

			arg7.method544(var16, var18, var17, arg4, arg2, arg1, var14);

			if (var15.field1242 && var15.field1249) {
				arg6.method503(arg2, arg4);
			}
		} else if (arg8 == 10 || arg8 == 11) {
			XEUTUWWF var19;
			if (var15.field1264 == -1 && var15.field1247 == null) {
				var19 = var15.method446(10, arg0, var10, var11, var12, var13, -1);
			} else {
				var19 = new OXCIEWBY(var10, var11, var15.field1264, arg0, var12, arg3, var13, true, 10);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg8 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg0 == 1 || arg0 == 3) {
					var21 = var15.field1238;
					var22 = var15.field1239;
				} else {
					var21 = var15.field1239;
					var22 = var15.field1238;
				}

				arg7.method548(arg4, var21, var16, var19, var20, var22, var14, arg1, var17, arg2);
			}

			if (var15.field1242) {
				arg6.method502(var15.field1238, arg0, var15.field1239, var15.field1243, arg2, arg4);
			}
		} else if (arg8 >= 12) {
			XEUTUWWF var23;
			if (var15.field1264 == -1 && var15.field1247 == null) {
				var23 = var15.method446(arg8, arg0, var10, var11, var12, var13, -1);
			} else {
				var23 = new OXCIEWBY(var10, var11, var15.field1264, arg0, var12, arg3, var13, true, arg8);
			}

			arg7.method548(arg4, 1, var16, var23, 0, 1, var14, arg1, var17, arg2);

			if (var15.field1242) {
				arg6.method502(var15.field1238, arg0, var15.field1239, var15.field1243, arg2, arg4);
			}
		} else if (arg8 == 0) {
			XEUTUWWF var24;
			if (var15.field1264 == -1 && var15.field1247 == null) {
				var24 = var15.method446(0, arg0, var10, var11, var12, var13, -1);
			} else {
				var24 = new OXCIEWBY(var10, var11, var15.field1264, arg0, var12, arg3, var13, true, 0);
			}

			arg7.method546(var16, var17, arg4, var24, null, arg1, arg2, field1049[arg0], 0, var14);

			if (var15.field1242) {
				arg6.method501(var15.field1243, arg8, arg0, arg4, arg2);
			}
		} else if (arg8 == 1) {
			XEUTUWWF var25;
			if (var15.field1264 == -1 && var15.field1247 == null) {
				var25 = var15.method446(1, arg0, var10, var11, var12, var13, -1);
			} else {
				var25 = new OXCIEWBY(var10, var11, var15.field1264, arg0, var12, arg3, var13, true, 1);
			}

			arg7.method546(var16, var17, arg4, var25, null, arg1, arg2, field1060[arg0], 0, var14);

			if (var15.field1242) {
				arg6.method501(var15.field1243, arg8, arg0, arg4, arg2);
			}
		} else if (arg8 == 2) {
			int var26 = arg0 + 1 & 0x3;
			XEUTUWWF var27;
			XEUTUWWF var28;
			if (var15.field1264 == -1 && var15.field1247 == null) {
				var27 = var15.method446(2, arg0 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method446(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new OXCIEWBY(var10, var11, var15.field1264, arg0 + 4, var12, arg3, var13, true, 2);
				var28 = new OXCIEWBY(var10, var11, var15.field1264, var26, var12, arg3, var13, true, 2);
			}

			arg7.method546(var16, var17, arg4, var27, var28, arg1, arg2, field1049[arg0], field1049[var26], var14);

			if (var15.field1242) {
				arg6.method501(var15.field1243, arg8, arg0, arg4, arg2);
			}
		} else if (arg8 == 3) {
			XEUTUWWF var29;
			if (var15.field1264 == -1 && var15.field1247 == null) {
				var29 = var15.method446(3, arg0, var10, var11, var12, var13, -1);
			} else {
				var29 = new OXCIEWBY(var10, var11, var15.field1264, arg0, var12, arg3, var13, true, 3);
			}

			arg7.method546(var16, var17, arg4, var29, null, arg1, arg2, field1060[arg0], 0, var14);

			if (var15.field1242) {
				arg6.method501(var15.field1243, arg8, arg0, arg4, arg2);
			}
		} else if (arg8 == 9) {
			XEUTUWWF var30;
			if (var15.field1264 == -1 && var15.field1247 == null) {
				var30 = var15.method446(arg8, arg0, var10, var11, var12, var13, -1);
			} else {
				var30 = new OXCIEWBY(var10, var11, var15.field1264, arg0, var12, arg3, var13, true, arg8);
			}

			arg7.method548(arg4, 1, var16, var30, 0, 1, var14, arg1, var17, arg2);

			if (var15.field1242) {
				arg6.method502(var15.field1238, arg0, var15.field1239, var15.field1243, arg2, arg4);
			}
		} else {
			if (var15.field1233) {
				if (arg0 == 1) {
					int var31 = var13;
					var13 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var31;
				} else if (arg0 == 2) {
					int var32 = var13;
					var13 = var11;
					var11 = var32;
					int var33 = var12;
					var12 = var10;
					var10 = var33;
				} else if (arg0 == 3) {
					int var34 = var13;
					var13 = var10;
					var10 = var11;
					var11 = var12;
					var12 = var34;
				}
			}

			if (arg8 == 4) {
				XEUTUWWF var35;
				if (var15.field1264 == -1 && var15.field1247 == null) {
					var35 = var15.method446(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new OXCIEWBY(var10, var11, var15.field1264, 0, var12, arg3, var13, true, 4);
				}

				arg7.method547(arg0 * 512, 0, var17, arg1, arg4, field1049[arg0], var14, arg2, 0, var35, var16);
			} else if (arg8 == 5) {
				int var36 = 16;
				int var37 = arg7.method564(arg1, arg4, arg2);
				if (var37 > 0) {
					var36 = SRQVPDWQ.method445(var37 >> 14 & 0x7FFF).field1221;
				}

				XEUTUWWF var38;
				if (var15.field1264 == -1 && var15.field1247 == null) {
					var38 = var15.method446(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new OXCIEWBY(var10, var11, var15.field1264, 0, var12, arg3, var13, true, 4);
				}

				arg7.method547(arg0 * 512, field1042[arg0] * var36, var17, arg1, arg4, field1049[arg0], var14, arg2, field1048[arg0] * var36, var38, var16);
			} else if (arg8 == 6) {
				XEUTUWWF var39;
				if (var15.field1264 == -1 && var15.field1247 == null) {
					var39 = var15.method446(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new OXCIEWBY(var10, var11, var15.field1264, 0, var12, arg3, var13, true, 4);
				}

				arg7.method547(arg0, 0, var17, arg1, arg4, 256, var14, arg2, 0, var39, var16);
			} else if (arg8 == 7) {
				XEUTUWWF var40;
				if (var15.field1264 == -1 && var15.field1247 == null) {
					var40 = var15.method446(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new OXCIEWBY(var10, var11, var15.field1264, 0, var12, arg3, var13, true, 4);
				}

				arg7.method547(arg0, 0, var17, arg1, arg4, 512, var14, arg2, 0, var40, var16);
			} else if (arg8 == 8) {
				XEUTUWWF var41;
				if (var15.field1264 == -1 && var15.field1247 == null) {
					var41 = var15.method446(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new OXCIEWBY(var10, var11, var15.field1264, 0, var12, arg3, var13, true, 4);
				}

				arg7.method547(arg0, 0, var17, arg1, arg4, 768, var14, arg2, 0, var41, var16);
			}
		}
	}

	@ObfuscatedName("NSTMHEDV.c(II)I")
	public static final int method365(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("NSTMHEDV.a(ZIIILURWDWMOD;ILXSMXYXEY;II)V")
	public final void method366(int arg0, int arg1, int arg2, URWDWMOD arg3, int arg4, XSMXYXEY arg5, int arg6, int arg7) {
		if (field1044 && (field1061[0][arg2][arg4] & 0x2) == 0) {
			if ((field1061[arg7][arg2][arg4] & 0x10) != 0) {
				return;
			}

			if (method375(arg4, arg2, arg7) != field1041) {
				return;
			}
		}

		if (arg7 < field1045) {
			field1045 = arg7;
		}

		int var9 = field1053[arg7][arg2][arg4];
		int var10 = field1053[arg7][arg2 + 1][arg4];
		int var11 = field1053[arg7][arg2 + 1][arg4 + 1];
		int var12 = field1053[arg7][arg2][arg4 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		SRQVPDWQ var14 = SRQVPDWQ.method445(arg0);
		int var15 = (arg0 << 14) + (arg4 << 7) + arg2 + 0x40000000;
		if (!var14.field1249) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg6 << 6) + arg1);
		if (arg1 == 22) {
			if (!field1044 || var14.field1249 || var14.field1236) {
				XEUTUWWF var17;
				if (var14.field1264 == -1 && var14.field1247 == null) {
					var17 = var14.method446(22, arg6, var9, var10, var11, var12, -1);
				} else {
					var17 = new OXCIEWBY(var9, var10, var14.field1264, arg6, var11, arg0, var12, true, 22);
				}

				arg5.method544(var15, var17, var16, arg2, arg4, arg7, var13);

				if (var14.field1242 && var14.field1249 && arg3 != null) {
					arg3.method503(arg4, arg2);
				}
			}
		} else if (arg1 == 10 || arg1 == 11) {
			XEUTUWWF var18;
			if (var14.field1264 == -1 && var14.field1247 == null) {
				var18 = var14.method446(10, arg6, var9, var10, var11, var12, -1);
			} else {
				var18 = new OXCIEWBY(var9, var10, var14.field1264, arg6, var11, arg0, var12, true, 10);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg1 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg6 == 1 || arg6 == 3) {
					var20 = var14.field1238;
					var21 = var14.field1239;
				} else {
					var20 = var14.field1239;
					var21 = var14.field1238;
				}

				if (arg5.method548(arg2, var20, var15, var18, var19, var21, var13, arg7, var16, arg4) && var14.field1230) {
					SNMMQNPZ var22;
					if (var18 instanceof SNMMQNPZ) {
						var22 = (SNMMQNPZ) var18;
					} else {
						var22 = var14.method446(10, arg6, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field1177 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field1051[arg7][arg2 + var23][arg4 + var24]) {
									field1051[arg7][arg2 + var23][arg4 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field1242 && arg3 != null) {
				arg3.method502(var14.field1238, arg6, var14.field1239, var14.field1243, arg4, arg2);
			}
		} else if (arg1 >= 12) {
			XEUTUWWF var26;
			if (var14.field1264 == -1 && var14.field1247 == null) {
				var26 = var14.method446(arg1, arg6, var9, var10, var11, var12, -1);
			} else {
				var26 = new OXCIEWBY(var9, var10, var14.field1264, arg6, var11, arg0, var12, true, arg1);
			}

			arg5.method548(arg2, 1, var15, var26, 0, 1, var13, arg7, var16, arg4);

			if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg7 > 0) {
				field1052[arg7][arg2][arg4] |= 0x924;
			}

			if (var14.field1242 && arg3 != null) {
				arg3.method502(var14.field1238, arg6, var14.field1239, var14.field1243, arg4, arg2);
			}
		} else if (arg1 == 0) {
			XEUTUWWF var27;
			if (var14.field1264 == -1 && var14.field1247 == null) {
				var27 = var14.method446(0, arg6, var9, var10, var11, var12, -1);
			} else {
				var27 = new OXCIEWBY(var9, var10, var14.field1264, arg6, var11, arg0, var12, true, 0);
			}

			arg5.method546(var15, var16, arg2, var27, null, arg7, arg4, field1049[arg6], 0, var13);

			if (arg6 == 0) {
				if (var14.field1230) {
					field1051[arg7][arg2][arg4] = 50;
					field1051[arg7][arg2][arg4 + 1] = 50;
				}

				if (var14.field1259) {
					field1052[arg7][arg2][arg4] |= 0x249;
				}
			} else if (arg6 == 1) {
				if (var14.field1230) {
					field1051[arg7][arg2][arg4 + 1] = 50;
					field1051[arg7][arg2 + 1][arg4 + 1] = 50;
				}

				if (var14.field1259) {
					field1052[arg7][arg2][arg4 + 1] |= 0x492;
				}
			} else if (arg6 == 2) {
				if (var14.field1230) {
					field1051[arg7][arg2 + 1][arg4] = 50;
					field1051[arg7][arg2 + 1][arg4 + 1] = 50;
				}

				if (var14.field1259) {
					field1052[arg7][arg2 + 1][arg4] |= 0x249;
				}
			} else if (arg6 == 3) {
				if (var14.field1230) {
					field1051[arg7][arg2][arg4] = 50;
					field1051[arg7][arg2 + 1][arg4] = 50;
				}

				if (var14.field1259) {
					field1052[arg7][arg2][arg4] |= 0x492;
				}
			}

			if (var14.field1242 && arg3 != null) {
				arg3.method501(var14.field1243, arg1, arg6, arg2, arg4);
			}

			if (var14.field1221 != 16) {
				arg5.method554(arg4, arg2, var14.field1221, arg7);
			}
		} else if (arg1 == 1) {
			XEUTUWWF var28;
			if (var14.field1264 == -1 && var14.field1247 == null) {
				var28 = var14.method446(1, arg6, var9, var10, var11, var12, -1);
			} else {
				var28 = new OXCIEWBY(var9, var10, var14.field1264, arg6, var11, arg0, var12, true, 1);
			}

			arg5.method546(var15, var16, arg2, var28, null, arg7, arg4, field1060[arg6], 0, var13);

			if (var14.field1230) {
				if (arg6 == 0) {
					field1051[arg7][arg2][arg4 + 1] = 50;
				} else if (arg6 == 1) {
					field1051[arg7][arg2 + 1][arg4 + 1] = 50;
				} else if (arg6 == 2) {
					field1051[arg7][arg2 + 1][arg4] = 50;
				} else if (arg6 == 3) {
					field1051[arg7][arg2][arg4] = 50;
				}
			}

			if (var14.field1242 && arg3 != null) {
				arg3.method501(var14.field1243, arg1, arg6, arg2, arg4);
			}
		} else if (arg1 == 2) {
			int var29 = arg6 + 1 & 0x3;
			XEUTUWWF var30;
			XEUTUWWF var31;
			if (var14.field1264 == -1 && var14.field1247 == null) {
				var30 = var14.method446(2, arg6 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method446(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new OXCIEWBY(var9, var10, var14.field1264, arg6 + 4, var11, arg0, var12, true, 2);
				var31 = new OXCIEWBY(var9, var10, var14.field1264, var29, var11, arg0, var12, true, 2);
			}

			arg5.method546(var15, var16, arg2, var30, var31, arg7, arg4, field1049[arg6], field1049[var29], var13);

			if (var14.field1259) {
				if (arg6 == 0) {
					field1052[arg7][arg2][arg4] |= 0x249;
					field1052[arg7][arg2][arg4 + 1] |= 0x492;
				} else if (arg6 == 1) {
					field1052[arg7][arg2][arg4 + 1] |= 0x492;
					field1052[arg7][arg2 + 1][arg4] |= 0x249;
				} else if (arg6 == 2) {
					field1052[arg7][arg2 + 1][arg4] |= 0x249;
					field1052[arg7][arg2][arg4] |= 0x492;
				} else if (arg6 == 3) {
					field1052[arg7][arg2][arg4] |= 0x492;
					field1052[arg7][arg2][arg4] |= 0x249;
				}
			}

			if (var14.field1242 && arg3 != null) {
				arg3.method501(var14.field1243, arg1, arg6, arg2, arg4);
			}

			if (var14.field1221 != 16) {
				arg5.method554(arg4, arg2, var14.field1221, arg7);
			}
		} else if (arg1 == 3) {
			XEUTUWWF var32;
			if (var14.field1264 == -1 && var14.field1247 == null) {
				var32 = var14.method446(3, arg6, var9, var10, var11, var12, -1);
			} else {
				var32 = new OXCIEWBY(var9, var10, var14.field1264, arg6, var11, arg0, var12, true, 3);
			}

			arg5.method546(var15, var16, arg2, var32, null, arg7, arg4, field1060[arg6], 0, var13);

			if (var14.field1230) {
				if (arg6 == 0) {
					field1051[arg7][arg2][arg4 + 1] = 50;
				} else if (arg6 == 1) {
					field1051[arg7][arg2 + 1][arg4 + 1] = 50;
				} else if (arg6 == 2) {
					field1051[arg7][arg2 + 1][arg4] = 50;
				} else if (arg6 == 3) {
					field1051[arg7][arg2][arg4] = 50;
				}
			}

			if (var14.field1242 && arg3 != null) {
				arg3.method501(var14.field1243, arg1, arg6, arg2, arg4);
			}
		} else if (arg1 == 9) {
			XEUTUWWF var33;
			if (var14.field1264 == -1 && var14.field1247 == null) {
				var33 = var14.method446(arg1, arg6, var9, var10, var11, var12, -1);
			} else {
				var33 = new OXCIEWBY(var9, var10, var14.field1264, arg6, var11, arg0, var12, true, arg1);
			}

			arg5.method548(arg2, 1, var15, var33, 0, 1, var13, arg7, var16, arg4);

			if (var14.field1242 && arg3 != null) {
				arg3.method502(var14.field1238, arg6, var14.field1239, var14.field1243, arg4, arg2);
			}
		} else {
			if (var14.field1233) {
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

			if (arg1 == 4) {
				XEUTUWWF var38;
				if (var14.field1264 == -1 && var14.field1247 == null) {
					var38 = var14.method446(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new OXCIEWBY(var9, var10, var14.field1264, 0, var11, arg0, var12, true, 4);
				}

				arg5.method547(arg6 * 512, 0, var16, arg7, arg2, field1049[arg6], var13, arg4, 0, var38, var15);
			} else if (arg1 == 5) {
				int var39 = 16;
				int var40 = arg5.method564(arg7, arg2, arg4);
				if (var40 > 0) {
					var39 = SRQVPDWQ.method445(var40 >> 14 & 0x7FFF).field1221;
				}

				XEUTUWWF var41;
				if (var14.field1264 == -1 && var14.field1247 == null) {
					var41 = var14.method446(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new OXCIEWBY(var9, var10, var14.field1264, 0, var11, arg0, var12, true, 4);
				}

				arg5.method547(arg6 * 512, field1042[arg6] * var39, var16, arg7, arg2, field1049[arg6], var13, arg4, field1048[arg6] * var39, var41, var15);
			} else if (arg1 == 6) {
				XEUTUWWF var42;
				if (var14.field1264 == -1 && var14.field1247 == null) {
					var42 = var14.method446(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new OXCIEWBY(var9, var10, var14.field1264, 0, var11, arg0, var12, true, 4);
				}

				arg5.method547(arg6, 0, var16, arg7, arg2, 256, var13, arg4, 0, var42, var15);
			} else if (arg1 == 7) {
				XEUTUWWF var43;
				if (var14.field1264 == -1 && var14.field1247 == null) {
					var43 = var14.method446(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new OXCIEWBY(var9, var10, var14.field1264, 0, var11, arg0, var12, true, 4);
				}

				arg5.method547(arg6, 0, var16, arg7, arg2, 512, var13, arg4, 0, var43, var15);
			} else if (arg1 == 8) {
				XEUTUWWF var44;
				if (var14.field1264 == -1 && var14.field1247 == null) {
					var44 = var14.method446(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new OXCIEWBY(var9, var10, var14.field1264, 0, var11, arg0, var12, true, 4);
				}

				arg5.method547(arg6, 0, var16, arg7, arg2, 768, var13, arg4, 0, var44, var15);
			}
		}
	}

	@ObfuscatedName("NSTMHEDV.b(III)I")
	public static final int method367(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method377(var3, var5);
		int var8 = method377(var3 + 1, var5);
		int var9 = method377(var3, var5 + 1);
		int var10 = method377(var3 + 1, var5 + 1);
		int var11 = method363(var7, var8, var4, arg2);
		int var12 = method363(var9, var10, var4, arg2);
		return method363(var11, var12, var6, arg2);
	}

	@ObfuscatedName("NSTMHEDV.a(II[LURWDWMOD;IIIIILXSMXYXEY;I[B)V")
	public final void method368(int arg0, int arg1, URWDWMOD[] arg2, int arg3, int arg4, int arg5, int arg6, XSMXYXEY arg7, int arg8, byte[] arg9) {
		DNRIFKTO var11 = new DNRIFKTO(arg9);
		int var12 = -1;
		while (true) {
			int var13 = var11.method203();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method203();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method189();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg3 == var18 && var17 >= arg5 && var17 < arg5 + 8 && var16 >= arg0 && var16 < arg0 + 8) {
					SRQVPDWQ var22 = SRQVPDWQ.method445(var12);
					int var23 = arg4 + KZRWVGKU.method306(var16 & 0x7, var17 & 0x7, var22.field1238, var21, var22.field1239, arg1);
					int var24 = arg6 + KZRWVGKU.method307(var22.field1238, var16 & 0x7, arg1, var22.field1239, var21, var17 & 0x7);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg8;
						if ((field1061[1][var23][var24] & 0x2) == 2) {
							var25 = arg8 - 1;
						}

						URWDWMOD var26 = null;
						if (var25 >= 0) {
							var26 = arg2[var25];
						}

						method366(var12, var20, var23, var26, var24, arg7, arg1 + var21 & 0x3, arg8);
					}
				}
			}
		}
	}

	public NSTMHEDV(int arg0, byte[][][] arg1, int[][][] arg2, int arg3) {
		field1045 = 99;
		field1046 = arg3;
		field1047 = arg0;
		field1053 = arg2;
		field1061 = arg1;
		field1040 = new byte[4][field1046][field1047];
		field1037 = new byte[4][field1046][field1047];
		field1039 = new byte[4][field1046][field1047];
		field1059 = new byte[4][field1046][field1047];
		field1052 = new int[4][field1046 + 1][field1047 + 1];
		field1051 = new byte[4][field1046 + 1][field1047 + 1];
		field1050 = new int[field1046 + 1][field1047 + 1];
		field1054 = new int[field1047];
		field1055 = new int[field1047];
		field1056 = new int[field1047];
		field1057 = new int[field1047];
		field1058 = new int[field1047];
	}

	@ObfuscatedName("NSTMHEDV.d(II)I")
	public static final int method369(int arg0, int arg1) {
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

	@ObfuscatedName("NSTMHEDV.c(III)Z")
	public static final boolean method370(int arg0, int arg1) {
		SRQVPDWQ var2 = SRQVPDWQ.method445(arg1);

		if (arg0 == 11) {
			arg0 = 10;
		}

		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}

		return var2.method454(arg0);
	}

	@ObfuscatedName("NSTMHEDV.a(I[BII)Z")
	public static final boolean method371(int arg0, byte[] arg1, int arg2) {
		boolean var3 = true;
		DNRIFKTO var4 = new DNRIFKTO(arg1);
		int var5 = -1;
		while (true) {
			int var6 = var4.method203();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method203();
					if (var9 == 0) {
						break;
					}

					var4.method189();
				} else {
					int var10 = var4.method203();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method189() >> 2;
					int var14 = arg2 + var12;
					int var15 = arg0 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						SRQVPDWQ var16 = SRQVPDWQ.method445(var5);
						if (var13 != 22 || !field1044 || var16.field1249 || var16.field1236) {
							var3 &= var16.method444();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("NSTMHEDV.a(III[BLXSMXYXEY;[LURWDWMOD;)V")
	public final void method372(int arg0, int arg1, byte[] arg2, XSMXYXEY arg3, URWDWMOD[] arg4) {
		DNRIFKTO var6 = new DNRIFKTO(arg2);
		int var7 = -1;
		while (true) {
			int var8 = var6.method203();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method203();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method189();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg1 + var12;
				int var18 = arg0 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field1061[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					URWDWMOD var20 = null;
					if (var19 >= 0) {
						var20 = arg4[var19];
					}

					method366(var7, var15, var17, var20, var18, arg3, var16, var13);
				}
			}
		}
	}

	@ObfuscatedName("NSTMHEDV.a(IIIII[LURWDWMOD;I[BII)V")
	public final void method373(int arg0, int arg1, int arg2, int arg3, URWDWMOD[] arg4, int arg5, byte[] arg6, int arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg2 + var10 > 0 && arg2 + var10 < 103 && arg1 + var11 > 0 && arg1 + var11 < 103) {
					arg4[arg8].field1310[arg2 + var10][arg1 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		DNRIFKTO var12 = new DNRIFKTO(arg6);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg3 == var13 && var14 >= arg7 && var14 < arg7 + 8 && var15 >= arg0 && var15 < arg0 + 8) {
						method358(var12, arg1 + KZRWVGKU.method305(arg5, var14 & 0x7, var15 & 0x7), 0, arg8, arg5, 0, arg2 + KZRWVGKU.method304(var15 & 0x7, var14 & 0x7, arg5));
					} else {
						method358(var12, -1, 0, 0, 0, 0, -1);
					}
				}
			}
		}
	}

	@ObfuscatedName("NSTMHEDV.a([LURWDWMOD;LXSMXYXEY;I)V")
	public final void method374(URWDWMOD[] arg0, XSMXYXEY arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field1061[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field1061[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg0[var6].method503(var5, var4);
						}
					}
				}
			}
		}

		field1038 += (int) (Math.random() * 5.0D) - 2;
		if (field1038 < -8) {
			field1038 = -8;
		}

		if (field1038 > 8) {
			field1038 = 8;
		}

		field1043 += (int) (Math.random() * 5.0D) - 2;
		if (field1043 < -16) {
			field1043 = -16;
		}

		if (field1043 > 16) {
			field1043 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field1051[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field1047 - 1; var16++) {
				for (int var17 = 1; var17 < field1046 - 1; var17++) {
					int var18 = field1053[var7][var17 + 1][var16] - field1053[var7][var17 - 1][var16];
					int var19 = field1053[var7][var17][var16 + 1] - field1053[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field1050[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field1047; var26++) {
				field1054[var26] = 0;
				field1055[var26] = 0;
				field1056[var26] = 0;
				field1057[var26] = 0;
				field1058[var26] = 0;
			}

			for (int var27 = -5; var27 < field1046 + 5; var27++) {
				for (int var28 = 0; var28 < field1047; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field1046) {
						int var30 = field1040[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							HCUFYAUI var31 = HCUFYAUI.field624[var30 - 1];
							field1054[var28] += var31.field633;
							field1055[var28] += var31.field631;
							field1056[var28] += var31.field632;
							field1057[var28] += var31.field634;
							field1058[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field1046) {
						int var33 = field1040[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							HCUFYAUI var34 = HCUFYAUI.field624[var33 - 1];
							field1054[var28] -= var34.field633;
							field1055[var28] -= var34.field631;
							field1056[var28] -= var34.field632;
							field1057[var28] -= var34.field634;
							field1058[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field1046 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field1047 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field1047) {
							var35 += field1054[var41];
							var36 += field1055[var41];
							var37 += field1056[var41];
							var38 += field1057[var41];
							var39 += field1058[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field1047) {
							var35 -= field1054[var42];
							var36 -= field1055[var42];
							var37 -= field1056[var42];
							var38 -= field1057[var42];
							var39 -= field1058[var42];
						}

						if (var40 >= 1 && var40 < field1047 - 1 && (!field1044 || (field1061[0][var27][var40] & 0x2) != 0 || (field1061[var7][var27][var40] & 0x10) == 0 && method375(var40, var27, var7) == field1041)) {
							if (var7 < field1045) {
								field1045 = var7;
							}

							int var43 = field1040[var7][var27][var40] & 0xFF;
							int var44 = field1037[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field1053[var7][var27][var40];
								int var46 = field1053[var7][var27 + 1][var40];
								int var47 = field1053[var7][var27 + 1][var40 + 1];
								int var48 = field1053[var7][var27][var40 + 1];
								int var49 = field1050[var27][var40];
								int var50 = field1050[var27 + 1][var40];
								int var51 = field1050[var27 + 1][var40 + 1];
								int var52 = field1050[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method360(var55, var56, var57);
									var55 = field1038 + var55 & 0xFF;
									var57 += field1043;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method360(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field1039[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !HCUFYAUI.field624[var44 - 1].field629) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field1052[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = AWNOLVYV.field42[method369(var54, 96)];
								}

								if (var44 == 0) {
									arg1.method543(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method369(var53, var49), method369(var53, var50), method369(var53, var51), method369(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field1039[var7][var27][var40] + 1;
									byte var61 = field1059[var7][var27][var40];
									HCUFYAUI var62 = HCUFYAUI.field624[var44 - 1];
									int var63 = var62.field627;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = AWNOLVYV.method8(var63);
										var65 = -1;
									} else if (var62.field626 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method360(var62.field630, var62.field631, var62.field632);
										var64 = AWNOLVYV.field42[method361(var62.field635, 96)];
									}

									arg1.method543(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method369(var53, var49), method369(var53, var50), method369(var53, var51), method369(var53, var52), method361(var65, var49), method361(var65, var50), method361(var65, var51), method361(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field1047 - 1; var66++) {
				for (int var67 = 1; var67 < field1046 - 1; var67++) {
					arg1.method542(var7, var67, var66, method375(var66, var67, var7));
				}
			}
		}

		arg1.method569(-50, 768, 64, -10, -50);

		for (int var68 = 0; var68 < field1046; var68++) {
			for (int var69 = 0; var69 < field1047; var69++) {
				if ((field1061[1][var68][var69] & 0x2) == 2) {
					arg1.method540(var68, var69);
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
				for (int var75 = 0; var75 <= field1047; var75++) {
					for (int var76 = 0; var76 <= field1046; var76++) {
						if ((field1052[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field1052[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field1047 && (field1052[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field1052[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field1052[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field1053[var80][var76][var77] - var84;
								int var86 = field1053[var79][var76][var77];
								XSMXYXEY.method541(1, var76 * 128, var77 * 128, var76 * 128, var78 * 128 + 128, var86, var85, var73);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field1052[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field1052[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field1052[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field1046 && (field1052[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field1052[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field1052[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field1053[var92][var89][var75] - var96;
								int var98 = field1053[var91][var89][var75];
								XSMXYXEY.method541(2, var90 * 128 + 128, var75 * 128, var89 * 128, var75 * 128, var98, var97, var73);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field1052[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field1052[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field1052[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field1047 && (field1052[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field1052[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field1046) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field1052[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field1053[var74][var101][var103];
								XSMXYXEY.method541(4, var102 * 128 + 128, var103 * 128, var101 * 128, var104 * 128 + 128, var107, var107, var73);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field1052[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("NSTMHEDV.b(IIII)I")
	public int method375(int arg0, int arg1, int arg2) {
		if ((field1061[arg2][arg1][arg0] & 0x8) != 0) {
			return 0;
		}

		if (arg2 > 0 && (field1061[1][arg1][arg0] & 0x2) != 0) {
			return arg2 - 1;
		}

		return arg2;
	}

	@ObfuscatedName("NSTMHEDV.a(III[BB[LURWDWMOD;I)V")
	public final void method376(int arg0, int arg1, int arg2, byte[] arg3, URWDWMOD[] arg4, int arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg2 + var8 > 0 && arg2 + var8 < 103 && arg0 + var9 > 0 && arg0 + var9 < 103) {
						arg4[var7].field1310[arg2 + var8][arg0 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		DNRIFKTO var10 = new DNRIFKTO(arg3);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method358(var10, arg0 + var13, arg5, var11, 0, arg1, arg2 + var12);
				}
			}
		}
	}

	@ObfuscatedName("NSTMHEDV.e(II)I")
	public static final int method377(int arg0, int arg1) {
		int var2 = method365(arg0 - 1, arg1 - 1) + method365(arg0 + 1, arg1 - 1) + method365(arg0 - 1, arg1 + 1) + method365(arg0 + 1, arg1 + 1);
		int var3 = method365(arg0 - 1, arg1) + method365(arg0 + 1, arg1) + method365(arg0, arg1 - 1) + method365(arg0, arg1 + 1);
		int var4 = method365(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}
}
