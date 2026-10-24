package deob;

@ObfuscatedName("SNNOFNNG")
public final class SNNOFNNG {

	@ObfuscatedName("SNNOFNNG.q")
	public int field1295;

	@ObfuscatedName("SNNOFNNG.r")
	public int field1296;

	@ObfuscatedName("SNNOFNNG.B")
	public int[][][] field1304;

	@ObfuscatedName("SNNOFNNG.z")
	public byte[][][] field1302;

	@ObfuscatedName("SNNOFNNG.h")
	public byte[][][] field1288;

	@ObfuscatedName("SNNOFNNG.j")
	public byte[][][] field1290;

	@ObfuscatedName("SNNOFNNG.v")
	public byte[][][] field1299;

	@ObfuscatedName("SNNOFNNG.n")
	public byte[][][] field1293;

	@ObfuscatedName("SNNOFNNG.y")
	public int[][][] field1301;

	@ObfuscatedName("SNNOFNNG.A")
	public byte[][][] field1303;

	@ObfuscatedName("SNNOFNNG.l")
	public int[][] field1291;

	@ObfuscatedName("SNNOFNNG.b")
	public int[] field1283;

	@ObfuscatedName("SNNOFNNG.c")
	public int[] field1284;

	@ObfuscatedName("SNNOFNNG.d")
	public int[] field1285;

	@ObfuscatedName("SNNOFNNG.e")
	public int[] field1286;

	@ObfuscatedName("SNNOFNNG.f")
	public int[] field1287;

	@ObfuscatedName("SNNOFNNG.i")
	public static final int[] field1289 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("SNNOFNNG.m")
	public static boolean field1292 = true;

	@ObfuscatedName("SNNOFNNG.p")
	public static int field1294 = 99;

	@ObfuscatedName("SNNOFNNG.t")
	public static final int[] field1297 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("SNNOFNNG.x")
	public static final int[] field1300 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("SNNOFNNG.E")
	public static final int[] field1306 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("SNNOFNNG.a")
	public static int field1282 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("SNNOFNNG.u")
	public static int field1298 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("SNNOFNNG.C")
	public static int field1305;

	@ObfuscatedName("SNNOFNNG.a(II)I")
	public static final int method465(int arg0, int arg1) {
		int var2 = method470(arg0 - 1, arg1 - 1) + method470(arg0 + 1, arg1 - 1) + method470(arg0 - 1, arg1 + 1) + method470(arg0 + 1, arg1 + 1);
		int var3 = method470(arg0 - 1, arg1) + method470(arg0 + 1, arg1) + method470(arg0, arg1 - 1) + method470(arg0, arg1 + 1);
		int var4 = method470(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("SNNOFNNG.a(IBII)I")
	public int method466(int arg0, int arg1, int arg2) {
		if ((field1302[arg0][arg2][arg1] & 0x8) != 0) {
			return 0;
		}

		if (arg0 > 0 && (field1302[1][arg2][arg1] & 0x2) != 0) {
			return arg0 - 1;
		}

		return arg0;
	}

	@ObfuscatedName("SNNOFNNG.a([LAOKWRKNA;IIIIII[BII)V")
	public final void method467(AOKWRKNA[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg6 + var10 > 0 && arg6 + var10 < 103 && arg1 + var11 > 0 && arg1 + var11 < 103) {
					arg0[arg4].field5[arg6 + var10][arg1 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		IUVBENCV var12 = new IUVBENCV(arg7);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg5 == var13 && var14 >= arg2 && var14 < arg2 + 8 && var15 >= arg8 && var15 < arg8 + 8) {
						method480(arg1 + BSWTKMFD.method42(var14 & 0x7, var15 & 0x7, arg3), arg3, 0, var12, arg6 + BSWTKMFD.method41(var15 & 0x7, arg3, var14 & 0x7), 0, arg4);
					} else {
						method480(-1, 0, 0, var12, -1, 0, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("SNNOFNNG.a(IIIII)V")
	public final void method468(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg1; var5 <= arg0 + arg1; var5++) {
			for (int var6 = arg3; var6 <= arg2 + arg3; var6++) {
				if (var6 >= 0 && var6 < field1295 && var5 >= 0 && var5 < field1296) {
					field1303[0][var6][var5] = 127;

					if (arg3 == var6 && var6 > 0) {
						field1304[0][var6][var5] = field1304[0][var6 - 1][var5];
					}

					if (arg2 + arg3 == var6 && var6 < field1295 - 1) {
						field1304[0][var6][var5] = field1304[0][var6 + 1][var5];
					}

					if (arg1 == var5 && var5 > 0) {
						field1304[0][var6][var5] = field1304[0][var6][var5 - 1];
					}

					if (arg0 + arg1 == var5 && var5 < field1296 - 1) {
						field1304[0][var6][var5] = field1304[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("SNNOFNNG.b(II)I")
	public final int method469(int arg0, int arg1) {
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

	@ObfuscatedName("SNNOFNNG.c(II)I")
	public static final int method470(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("SNNOFNNG.a(IIII)I")
	public static final int method471(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - ZGIYLEBF.field1494[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("SNNOFNNG.a(LBISZONYZ;BLIUVBENCV;)V")
	public static final void method472(BISZONYZ arg0, IUVBENCV arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg1.method259();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			MCFQOEAW var4 = MCFQOEAW.method341(var2);
			var4.method335(arg0);

			while (true) {
				int var5 = arg1.method259();
				if (var5 == 0) {
					break;
				}

				arg1.method245();
			}
		}
	}

	@ObfuscatedName("SNNOFNNG.a(I[BIIILPOACSVST;II[LAOKWRKNA;IZ)V")
	public final void method473(int arg0, byte[] arg1, int arg2, int arg3, int arg4, POACSVST arg5, int arg6, int arg7, AOKWRKNA[] arg8, int arg9) {
		IUVBENCV var11 = new IUVBENCV(arg1);
		int var12 = -1;
		while (true) {
			int var13 = var11.method259();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method259();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method245();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg7 == var18 && var17 >= arg3 && var17 < arg3 + 8 && var16 >= arg6 && var16 < arg6 + 8) {
					MCFQOEAW var22 = MCFQOEAW.method341(var12);
					int var23 = arg0 + BSWTKMFD.method43(var17 & 0x7, var22.field914, var16 & 0x7, var22.field947, var21, arg9);
					int var24 = arg2 + BSWTKMFD.method44(var17 & 0x7, var22.field947, arg9, var16 & 0x7, var21, var22.field914);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg4;
						if ((field1302[1][var23][var24] & 0x2) == 2) {
							var25 = arg4 - 1;
						}

						AOKWRKNA var26 = null;
						if (var25 >= 0) {
							var26 = arg8[var25];
						}

						method483(var12, var24, var20, arg9 + var21 & 0x3, var26, arg4, var23, arg5);
					}
				}
			}
		}
	}

	@ObfuscatedName("SNNOFNNG.a([BI[LAOKWRKNA;IZII)V")
	public final void method474(byte[] arg0, int arg1, AOKWRKNA[] arg2, int arg3, int arg4, int arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg5 + var8 > 0 && arg5 + var8 < 103 && arg1 + var9 > 0 && arg1 + var9 < 103) {
						arg2[var7].field5[arg5 + var8][arg1 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		IUVBENCV var10 = new IUVBENCV(arg0);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method480(arg1 + var13, 0, arg4, var10, arg5 + var12, arg3, var11);
				}
			}
		}
	}

	@ObfuscatedName("SNNOFNNG.a(III)I")
	public static final int method475(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method465(var3, var5);
		int var8 = method465(var3 + 1, var5);
		int var9 = method465(var3, var5 + 1);
		int var10 = method465(var3 + 1, var5 + 1);
		int var11 = method471(var7, var8, var4, arg2);
		int var12 = method471(var9, var10, var4, arg2);
		return method471(var11, var12, var6, arg2);
	}

	@ObfuscatedName("SNNOFNNG.a(I[LAOKWRKNA;LPOACSVST;B[BI)V")
	public final void method476(int arg0, AOKWRKNA[] arg1, POACSVST arg2, byte[] arg3, int arg4) {
		IUVBENCV var6 = new IUVBENCV(arg3);
		int var7 = -1;
		while (true) {
			int var8 = var6.method259();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method259();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method245();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg4 + var12;
				int var18 = arg0 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field1302[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					AOKWRKNA var20 = null;
					if (var19 >= 0) {
						var20 = arg1[var19];
					}

					method483(var7, var18, var15, var16, var20, var13, var17, arg2);
				}
			}
		}
	}

	@ObfuscatedName("SNNOFNNG.d(II)I")
	public static final int method477(int arg0, int arg1) {
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

	@ObfuscatedName("SNNOFNNG.b(IIII)V")
	public final void method478(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 8; var4++) {
			for (int var5 = 0; var5 < 8; var5++) {
				field1304[arg2][arg0 + var4][arg1 + var5] = 0;
			}
		}

		if (arg0 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				field1304[arg2][arg0][arg1 + var6] = field1304[arg2][arg0 - 1][arg1 + var6];
			}
		}

		if (arg1 > 0) {
			for (int var7 = 1; var7 < 8; var7++) {
				field1304[arg2][arg0 + var7][arg1] = field1304[arg2][arg0 + var7][arg1 - 1];
			}
		}

		if (arg0 > 0 && field1304[arg2][arg0 - 1][arg1] != 0) {
			field1304[arg2][arg0][arg1] = field1304[arg2][arg0 - 1][arg1];
		} else if (arg1 > 0 && field1304[arg2][arg0][arg1 - 1] != 0) {
			field1304[arg2][arg0][arg1] = field1304[arg2][arg0][arg1 - 1];
		} else if (arg0 > 0 && arg1 > 0 && field1304[arg2][arg0 - 1][arg1 - 1] != 0) {
			field1304[arg2][arg0][arg1] = field1304[arg2][arg0 - 1][arg1 - 1];
		}
	}

	@ObfuscatedName("SNNOFNNG.b(III)I")
	public final int method479(int arg0, int arg1, int arg2) {
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

	public SNNOFNNG(int[][][] arg0, byte[][][] arg1, int arg2, int arg3) {
		field1294 = 99;
		field1295 = arg3;
		field1296 = arg2;
		field1304 = arg0;
		field1302 = arg1;
		field1288 = new byte[4][field1295][field1296];
		field1290 = new byte[4][field1295][field1296];
		field1299 = new byte[4][field1295][field1296];
		field1293 = new byte[4][field1295][field1296];
		field1301 = new int[4][field1295 + 1][field1296 + 1];
		field1303 = new byte[4][field1295 + 1][field1296 + 1];
		field1291 = new int[field1295 + 1][field1296 + 1];
		field1283 = new int[field1296];
		field1284 = new int[field1296];
		field1285 = new int[field1296];
		field1286 = new int[field1296];
		field1287 = new int[field1296];
	}

	@ObfuscatedName("SNNOFNNG.a(IIIILIUVBENCV;III)V")
	public final void method480(int arg0, int arg1, int arg2, IUVBENCV arg3, int arg4, int arg5, int arg6) {
		if (arg4 >= 0 && arg4 < 104 && arg0 >= 0 && arg0 < 104) {
			field1302[arg6][arg4][arg0] = 0;
			while (true) {
				int var8 = arg3.method245();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg3.method245();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg6 == 0) {
						field1304[0][arg4][arg0] = -var9 * 8;
						return;
					}

					field1304[arg6][arg4][arg0] = field1304[arg6 - 1][arg4][arg0] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field1290[arg6][arg4][arg0] = arg3.method246();
					field1299[arg6][arg4][arg0] = (byte) ((var8 - 2) / 4);
					field1293[arg6][arg4][arg0] = (byte) (var8 + arg1 - 2 & 0x3);
				} else if (var8 <= 81) {
					field1302[arg6][arg4][arg0] = (byte) (var8 - 49);
				} else {
					field1288[arg6][arg4][arg0] = (byte) (var8 - 81);
				}
			}

			if (arg6 == 0) {
				field1304[0][arg4][arg0] = -method482(arg4 + arg2 + 932731, arg0 + 556238 + arg5) * 8;
			} else {
				field1304[arg6][arg4][arg0] = field1304[arg6 - 1][arg4][arg0] - 240;
			}
		} else {
			while (true) {
				int var10 = arg3.method245();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg3.method245();
					return;
				}

				if (var10 <= 49) {
					arg3.method245();
				}
			}
		}
	}

	@ObfuscatedName("SNNOFNNG.a(IIIIIIILPOACSVST;LAOKWRKNA;[[[II)V")
	public static final void method481(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, POACSVST arg6, AOKWRKNA arg7, int[][][] arg8, int arg9) {
		int var10 = arg8[arg1][arg3][arg0];
		int var11 = arg8[arg1][arg3 + 1][arg0];
		int var12 = arg8[arg1][arg3 + 1][arg0 + 1];
		int var13 = arg8[arg1][arg3][arg0 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		MCFQOEAW var15 = MCFQOEAW.method341(arg9);
		int var16 = (arg9 << 14) + (arg0 << 7) + arg3 + 0x40000000;
		if (!var15.field936) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg4 << 6) + arg2);
		if (arg2 == 22) {
			TFGCPINZ var18;
			if (var15.field953 == -1 && var15.field922 == null) {
				var18 = var15.method338(22, arg4, var10, var11, var12, var13, -1);
			} else {
				var18 = new YUINHFWF(var13, var12, var15.field953, 22, true, var11, var10, arg9, arg4);
			}

			arg6.method393(var16, arg0, arg3, arg5, var17, var14, var18);

			if (var15.field935 && var15.field936) {
				arg7.method4(arg0, arg3);
			}
		} else if (arg2 == 10 || arg2 == 11) {
			TFGCPINZ var19;
			if (var15.field953 == -1 && var15.field922 == null) {
				var19 = var15.method338(10, arg4, var10, var11, var12, var13, -1);
			} else {
				var19 = new YUINHFWF(var13, var12, var15.field953, 10, true, var11, var10, arg9, arg4);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg2 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg4 == 1 || arg4 == 3) {
					var21 = var15.field947;
					var22 = var15.field914;
				} else {
					var21 = var15.field914;
					var22 = var15.field947;
				}

				arg6.method397(arg0, var19, var20, var16, var21, var22, arg3, arg5, var14, var17);
			}

			if (var15.field935) {
				arg7.method3(var15.field914, arg0, arg4, arg3, var15.field913, var15.field947);
			}
		} else if (arg2 >= 12) {
			TFGCPINZ var23;
			if (var15.field953 == -1 && var15.field922 == null) {
				var23 = var15.method338(arg2, arg4, var10, var11, var12, var13, -1);
			} else {
				var23 = new YUINHFWF(var13, var12, var15.field953, arg2, true, var11, var10, arg9, arg4);
			}

			arg6.method397(arg0, var23, 0, var16, 1, 1, arg3, arg5, var14, var17);

			if (var15.field935) {
				arg7.method3(var15.field914, arg0, arg4, arg3, var15.field913, var15.field947);
			}
		} else if (arg2 == 0) {
			TFGCPINZ var24;
			if (var15.field953 == -1 && var15.field922 == null) {
				var24 = var15.method338(0, arg4, var10, var11, var12, var13, -1);
			} else {
				var24 = new YUINHFWF(var13, var12, var15.field953, 0, true, var11, var10, arg9, arg4);
			}

			arg6.method395(arg5, 0, field1289[arg4], var16, arg0, var17, var24, var14, arg3, null);

			if (var15.field935) {
				arg7.method2(arg0, arg3, var15.field913, arg4, arg2);
			}
		} else if (arg2 == 1) {
			TFGCPINZ var25;
			if (var15.field953 == -1 && var15.field922 == null) {
				var25 = var15.method338(1, arg4, var10, var11, var12, var13, -1);
			} else {
				var25 = new YUINHFWF(var13, var12, var15.field953, 1, true, var11, var10, arg9, arg4);
			}

			arg6.method395(arg5, 0, field1300[arg4], var16, arg0, var17, var25, var14, arg3, null);

			if (var15.field935) {
				arg7.method2(arg0, arg3, var15.field913, arg4, arg2);
			}
		} else if (arg2 == 2) {
			int var26 = arg4 + 1 & 0x3;
			TFGCPINZ var27;
			TFGCPINZ var28;
			if (var15.field953 == -1 && var15.field922 == null) {
				var27 = var15.method338(2, arg4 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method338(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new YUINHFWF(var13, var12, var15.field953, 2, true, var11, var10, arg9, arg4 + 4);
				var28 = new YUINHFWF(var13, var12, var15.field953, 2, true, var11, var10, arg9, var26);
			}

			arg6.method395(arg5, field1289[var26], field1289[arg4], var16, arg0, var17, var27, var14, arg3, var28);

			if (var15.field935) {
				arg7.method2(arg0, arg3, var15.field913, arg4, arg2);
			}
		} else if (arg2 == 3) {
			TFGCPINZ var29;
			if (var15.field953 == -1 && var15.field922 == null) {
				var29 = var15.method338(3, arg4, var10, var11, var12, var13, -1);
			} else {
				var29 = new YUINHFWF(var13, var12, var15.field953, 3, true, var11, var10, arg9, arg4);
			}

			arg6.method395(arg5, 0, field1300[arg4], var16, arg0, var17, var29, var14, arg3, null);

			if (var15.field935) {
				arg7.method2(arg0, arg3, var15.field913, arg4, arg2);
			}
		} else if (arg2 == 9) {
			TFGCPINZ var30;
			if (var15.field953 == -1 && var15.field922 == null) {
				var30 = var15.method338(arg2, arg4, var10, var11, var12, var13, -1);
			} else {
				var30 = new YUINHFWF(var13, var12, var15.field953, arg2, true, var11, var10, arg9, arg4);
			}

			arg6.method397(arg0, var30, 0, var16, 1, 1, arg3, arg5, var14, var17);

			if (var15.field935) {
				arg7.method3(var15.field914, arg0, arg4, arg3, var15.field913, var15.field947);
			}
		} else {
			if (var15.field950) {
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

			if (arg2 == 4) {
				TFGCPINZ var35;
				if (var15.field953 == -1 && var15.field922 == null) {
					var35 = var15.method338(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new YUINHFWF(var13, var12, var15.field953, 4, true, var11, var10, arg9, 0);
				}

				arg6.method396(arg0, var14, 0, arg4 * 512, 0, var16, var17, arg5, field1289[arg4], var35, arg3);
			} else if (arg2 == 5) {
				int var36 = 16;
				int var37 = arg6.method413(arg5, arg3, arg0);
				if (var37 > 0) {
					var36 = MCFQOEAW.method341(var37 >> 14 & 0x7FFF).field956;
				}

				TFGCPINZ var38;
				if (var15.field953 == -1 && var15.field922 == null) {
					var38 = var15.method338(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new YUINHFWF(var13, var12, var15.field953, 4, true, var11, var10, arg9, 0);
				}

				arg6.method396(arg0, var14, field1297[arg4] * var36, arg4 * 512, field1306[arg4] * var36, var16, var17, arg5, field1289[arg4], var38, arg3);
			} else if (arg2 == 6) {
				TFGCPINZ var39;
				if (var15.field953 == -1 && var15.field922 == null) {
					var39 = var15.method338(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new YUINHFWF(var13, var12, var15.field953, 4, true, var11, var10, arg9, 0);
				}

				arg6.method396(arg0, var14, 0, arg4, 0, var16, var17, arg5, 256, var39, arg3);
			} else if (arg2 == 7) {
				TFGCPINZ var40;
				if (var15.field953 == -1 && var15.field922 == null) {
					var40 = var15.method338(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new YUINHFWF(var13, var12, var15.field953, 4, true, var11, var10, arg9, 0);
				}

				arg6.method396(arg0, var14, 0, arg4, 0, var16, var17, arg5, 512, var40, arg3);
			} else if (arg2 == 8) {
				TFGCPINZ var41;
				if (var15.field953 == -1 && var15.field922 == null) {
					var41 = var15.method338(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new YUINHFWF(var13, var12, var15.field953, 4, true, var11, var10, arg9, 0);
				}

				arg6.method396(arg0, var14, 0, arg4, 0, var16, var17, arg5, 768, var41, arg3);
			}
		}
	}

	@ObfuscatedName("SNNOFNNG.e(II)I")
	public static final int method482(int arg0, int arg1) {
		int var2 = method475(arg0 + 45365, arg1 + 91923, 4) + (method475(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method475(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("SNNOFNNG.a(IIIILAOKWRKNA;IIILPOACSVST;)V")
	public final void method483(int arg0, int arg1, int arg2, int arg3, AOKWRKNA arg4, int arg5, int arg6, POACSVST arg7) {
		if (field1292 && (field1302[0][arg6][arg1] & 0x2) == 0) {
			if ((field1302[arg5][arg6][arg1] & 0x10) != 0) {
				return;
			}

			if (method466(arg5, arg1, arg6) != field1305) {
				return;
			}
		}

		if (arg5 < field1294) {
			field1294 = arg5;
		}

		int var9 = field1304[arg5][arg6][arg1];
		int var10 = field1304[arg5][arg6 + 1][arg1];
		int var11 = field1304[arg5][arg6 + 1][arg1 + 1];
		int var12 = field1304[arg5][arg6][arg1 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		MCFQOEAW var14 = MCFQOEAW.method341(arg0);
		int var15 = (arg0 << 14) + (arg1 << 7) + arg6 + 0x40000000;
		if (!var14.field936) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg3 << 6) + arg2);
		if (arg2 == 22) {
			if (!field1292 || var14.field936 || var14.field959) {
				TFGCPINZ var17;
				if (var14.field953 == -1 && var14.field922 == null) {
					var17 = var14.method338(22, arg3, var9, var10, var11, var12, -1);
				} else {
					var17 = new YUINHFWF(var12, var11, var14.field953, 22, true, var10, var9, arg0, arg3);
				}

				arg7.method393(var15, arg1, arg6, arg5, var16, var13, var17);

				if (var14.field935 && var14.field936 && arg4 != null) {
					arg4.method4(arg1, arg6);
				}
			}
		} else if (arg2 == 10 || arg2 == 11) {
			TFGCPINZ var18;
			if (var14.field953 == -1 && var14.field922 == null) {
				var18 = var14.method338(10, arg3, var9, var10, var11, var12, -1);
			} else {
				var18 = new YUINHFWF(var12, var11, var14.field953, 10, true, var10, var9, arg0, arg3);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg2 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg3 == 1 || arg3 == 3) {
					var20 = var14.field947;
					var21 = var14.field914;
				} else {
					var20 = var14.field914;
					var21 = var14.field947;
				}

				if (arg7.method397(arg1, var18, var19, var15, var20, var21, arg6, arg5, var13, var16) && var14.field930) {
					JJMVUSJJ var22;
					if (var18 instanceof JJMVUSJJ) {
						var22 = (JJMVUSJJ) var18;
					} else {
						var22 = var14.method338(10, arg3, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field826 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field1303[arg5][arg6 + var23][arg1 + var24]) {
									field1303[arg5][arg6 + var23][arg1 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field935 && arg4 != null) {
				arg4.method3(var14.field914, arg1, arg3, arg6, var14.field913, var14.field947);
			}
		} else if (arg2 >= 12) {
			TFGCPINZ var26;
			if (var14.field953 == -1 && var14.field922 == null) {
				var26 = var14.method338(arg2, arg3, var9, var10, var11, var12, -1);
			} else {
				var26 = new YUINHFWF(var12, var11, var14.field953, arg2, true, var10, var9, arg0, arg3);
			}

			arg7.method397(arg1, var26, 0, var15, 1, 1, arg6, arg5, var13, var16);

			if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg5 > 0) {
				field1301[arg5][arg6][arg1] |= 0x924;
			}

			if (var14.field935 && arg4 != null) {
				arg4.method3(var14.field914, arg1, arg3, arg6, var14.field913, var14.field947);
			}
		} else if (arg2 == 0) {
			TFGCPINZ var27;
			if (var14.field953 == -1 && var14.field922 == null) {
				var27 = var14.method338(0, arg3, var9, var10, var11, var12, -1);
			} else {
				var27 = new YUINHFWF(var12, var11, var14.field953, 0, true, var10, var9, arg0, arg3);
			}

			arg7.method395(arg5, 0, field1289[arg3], var15, arg1, var16, var27, var13, arg6, null);

			if (arg3 == 0) {
				if (var14.field930) {
					field1303[arg5][arg6][arg1] = 50;
					field1303[arg5][arg6][arg1 + 1] = 50;
				}

				if (var14.field954) {
					field1301[arg5][arg6][arg1] |= 0x249;
				}
			} else if (arg3 == 1) {
				if (var14.field930) {
					field1303[arg5][arg6][arg1 + 1] = 50;
					field1303[arg5][arg6 + 1][arg1 + 1] = 50;
				}

				if (var14.field954) {
					field1301[arg5][arg6][arg1 + 1] |= 0x492;
				}
			} else if (arg3 == 2) {
				if (var14.field930) {
					field1303[arg5][arg6 + 1][arg1] = 50;
					field1303[arg5][arg6 + 1][arg1 + 1] = 50;
				}

				if (var14.field954) {
					field1301[arg5][arg6 + 1][arg1] |= 0x249;
				}
			} else if (arg3 == 3) {
				if (var14.field930) {
					field1303[arg5][arg6][arg1] = 50;
					field1303[arg5][arg6 + 1][arg1] = 50;
				}

				if (var14.field954) {
					field1301[arg5][arg6][arg1] |= 0x492;
				}
			}

			if (var14.field935 && arg4 != null) {
				arg4.method2(arg1, arg6, var14.field913, arg3, arg2);
			}

			if (var14.field956 != 16) {
				arg7.method403(arg1, arg5, var14.field956, arg6);
			}
		} else if (arg2 == 1) {
			TFGCPINZ var28;
			if (var14.field953 == -1 && var14.field922 == null) {
				var28 = var14.method338(1, arg3, var9, var10, var11, var12, -1);
			} else {
				var28 = new YUINHFWF(var12, var11, var14.field953, 1, true, var10, var9, arg0, arg3);
			}

			arg7.method395(arg5, 0, field1300[arg3], var15, arg1, var16, var28, var13, arg6, null);

			if (var14.field930) {
				if (arg3 == 0) {
					field1303[arg5][arg6][arg1 + 1] = 50;
				} else if (arg3 == 1) {
					field1303[arg5][arg6 + 1][arg1 + 1] = 50;
				} else if (arg3 == 2) {
					field1303[arg5][arg6 + 1][arg1] = 50;
				} else if (arg3 == 3) {
					field1303[arg5][arg6][arg1] = 50;
				}
			}

			if (var14.field935 && arg4 != null) {
				arg4.method2(arg1, arg6, var14.field913, arg3, arg2);
			}
		} else if (arg2 == 2) {
			int var29 = arg3 + 1 & 0x3;
			TFGCPINZ var30;
			TFGCPINZ var31;
			if (var14.field953 == -1 && var14.field922 == null) {
				var30 = var14.method338(2, arg3 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method338(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new YUINHFWF(var12, var11, var14.field953, 2, true, var10, var9, arg0, arg3 + 4);
				var31 = new YUINHFWF(var12, var11, var14.field953, 2, true, var10, var9, arg0, var29);
			}

			arg7.method395(arg5, field1289[var29], field1289[arg3], var15, arg1, var16, var30, var13, arg6, var31);

			if (var14.field954) {
				if (arg3 == 0) {
					field1301[arg5][arg6][arg1] |= 0x249;
					field1301[arg5][arg6][arg1 + 1] |= 0x492;
				} else if (arg3 == 1) {
					field1301[arg5][arg6][arg1 + 1] |= 0x492;
					field1301[arg5][arg6 + 1][arg1] |= 0x249;
				} else if (arg3 == 2) {
					field1301[arg5][arg6 + 1][arg1] |= 0x249;
					field1301[arg5][arg6][arg1] |= 0x492;
				} else if (arg3 == 3) {
					field1301[arg5][arg6][arg1] |= 0x492;
					field1301[arg5][arg6][arg1] |= 0x249;
				}
			}

			if (var14.field935 && arg4 != null) {
				arg4.method2(arg1, arg6, var14.field913, arg3, arg2);
			}

			if (var14.field956 != 16) {
				arg7.method403(arg1, arg5, var14.field956, arg6);
			}
		} else if (arg2 == 3) {
			TFGCPINZ var32;
			if (var14.field953 == -1 && var14.field922 == null) {
				var32 = var14.method338(3, arg3, var9, var10, var11, var12, -1);
			} else {
				var32 = new YUINHFWF(var12, var11, var14.field953, 3, true, var10, var9, arg0, arg3);
			}

			arg7.method395(arg5, 0, field1300[arg3], var15, arg1, var16, var32, var13, arg6, null);

			if (var14.field930) {
				if (arg3 == 0) {
					field1303[arg5][arg6][arg1 + 1] = 50;
				} else if (arg3 == 1) {
					field1303[arg5][arg6 + 1][arg1 + 1] = 50;
				} else if (arg3 == 2) {
					field1303[arg5][arg6 + 1][arg1] = 50;
				} else if (arg3 == 3) {
					field1303[arg5][arg6][arg1] = 50;
				}
			}

			if (var14.field935 && arg4 != null) {
				arg4.method2(arg1, arg6, var14.field913, arg3, arg2);
			}
		} else if (arg2 == 9) {
			TFGCPINZ var33;
			if (var14.field953 == -1 && var14.field922 == null) {
				var33 = var14.method338(arg2, arg3, var9, var10, var11, var12, -1);
			} else {
				var33 = new YUINHFWF(var12, var11, var14.field953, arg2, true, var10, var9, arg0, arg3);
			}

			arg7.method397(arg1, var33, 0, var15, 1, 1, arg6, arg5, var13, var16);

			if (var14.field935 && arg4 != null) {
				arg4.method3(var14.field914, arg1, arg3, arg6, var14.field913, var14.field947);
			}
		} else {
			if (var14.field950) {
				if (arg3 == 1) {
					int var34 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var9;
					var9 = var34;
				} else if (arg3 == 2) {
					int var35 = var12;
					var12 = var10;
					var10 = var35;
					int var36 = var11;
					var11 = var9;
					var9 = var36;
				} else if (arg3 == 3) {
					int var37 = var12;
					var12 = var9;
					var9 = var10;
					var10 = var11;
					var11 = var37;
				}
			}

			if (arg2 == 4) {
				TFGCPINZ var38;
				if (var14.field953 == -1 && var14.field922 == null) {
					var38 = var14.method338(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new YUINHFWF(var12, var11, var14.field953, 4, true, var10, var9, arg0, 0);
				}

				arg7.method396(arg1, var13, 0, arg3 * 512, 0, var15, var16, arg5, field1289[arg3], var38, arg6);
			} else if (arg2 == 5) {
				int var39 = 16;
				int var40 = arg7.method413(arg5, arg6, arg1);
				if (var40 > 0) {
					var39 = MCFQOEAW.method341(var40 >> 14 & 0x7FFF).field956;
				}

				TFGCPINZ var41;
				if (var14.field953 == -1 && var14.field922 == null) {
					var41 = var14.method338(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new YUINHFWF(var12, var11, var14.field953, 4, true, var10, var9, arg0, 0);
				}

				arg7.method396(arg1, var13, field1297[arg3] * var39, arg3 * 512, field1306[arg3] * var39, var15, var16, arg5, field1289[arg3], var41, arg6);
			} else if (arg2 == 6) {
				TFGCPINZ var42;
				if (var14.field953 == -1 && var14.field922 == null) {
					var42 = var14.method338(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new YUINHFWF(var12, var11, var14.field953, 4, true, var10, var9, arg0, 0);
				}

				arg7.method396(arg1, var13, 0, arg3, 0, var15, var16, arg5, 256, var42, arg6);
			} else if (arg2 == 7) {
				TFGCPINZ var43;
				if (var14.field953 == -1 && var14.field922 == null) {
					var43 = var14.method338(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new YUINHFWF(var12, var11, var14.field953, 4, true, var10, var9, arg0, 0);
				}

				arg7.method396(arg1, var13, 0, arg3, 0, var15, var16, arg5, 512, var43, arg6);
			} else if (arg2 == 8) {
				TFGCPINZ var44;
				if (var14.field953 == -1 && var14.field922 == null) {
					var44 = var14.method338(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new YUINHFWF(var12, var11, var14.field953, 4, true, var10, var9, arg0, 0);
				}

				arg7.method396(arg1, var13, 0, arg3, 0, var15, var16, arg5, 768, var44, arg6);
			}
		}
	}

	@ObfuscatedName("SNNOFNNG.a(I[BII)Z")
	public static final boolean method484(int arg0, byte[] arg1, int arg2) {
		boolean var3 = true;
		IUVBENCV var4 = new IUVBENCV(arg1);
		int var5 = -1;
		while (true) {
			int var6 = var4.method259();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method259();
					if (var9 == 0) {
						break;
					}

					var4.method245();
				} else {
					int var10 = var4.method259();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method245() >> 2;
					int var14 = arg0 + var12;
					int var15 = arg2 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						MCFQOEAW var16 = MCFQOEAW.method341(var5);
						if (var13 != 22 || !field1292 || var16.field936 || var16.field959) {
							var3 &= var16.method342();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("SNNOFNNG.a(IIZ)Z")
	public static final boolean method485(int arg0, int arg1) {
		MCFQOEAW var2 = MCFQOEAW.method341(arg1);

		if (arg0 == 11) {
			arg0 = 10;
		}

		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}

		return var2.method337(arg0);
	}

	@ObfuscatedName("SNNOFNNG.a([LAOKWRKNA;ZLPOACSVST;)V")
	public final void method486(AOKWRKNA[] arg0, POACSVST arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field1302[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field1302[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg0[var6].method4(var5, var4);
						}
					}
				}
			}
		}

		field1282 += (int) (Math.random() * 5.0D) - 2;
		if (field1282 < -8) {
			field1282 = -8;
		}

		if (field1282 > 8) {
			field1282 = 8;
		}

		field1298 += (int) (Math.random() * 5.0D) - 2;
		if (field1298 < -16) {
			field1298 = -16;
		}

		if (field1298 > 16) {
			field1298 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field1303[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field1296 - 1; var16++) {
				for (int var17 = 1; var17 < field1295 - 1; var17++) {
					int var18 = field1304[var7][var17 + 1][var16] - field1304[var7][var17 - 1][var16];
					int var19 = field1304[var7][var17][var16 + 1] - field1304[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field1291[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field1296; var26++) {
				field1283[var26] = 0;
				field1284[var26] = 0;
				field1285[var26] = 0;
				field1286[var26] = 0;
				field1287[var26] = 0;
			}

			for (int var27 = -5; var27 < field1295 + 5; var27++) {
				for (int var28 = 0; var28 < field1296; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field1295) {
						int var30 = field1288[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							YDUFKDFX var31 = YDUFKDFX.field1456[var30 - 1];
							field1283[var28] += var31.field1465;
							field1284[var28] += var31.field1463;
							field1285[var28] += var31.field1464;
							field1286[var28] += var31.field1466;
							field1287[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field1295) {
						int var33 = field1288[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							YDUFKDFX var34 = YDUFKDFX.field1456[var33 - 1];
							field1283[var28] -= var34.field1465;
							field1284[var28] -= var34.field1463;
							field1285[var28] -= var34.field1464;
							field1286[var28] -= var34.field1466;
							field1287[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field1295 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field1296 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field1296) {
							var35 += field1283[var41];
							var36 += field1284[var41];
							var37 += field1285[var41];
							var38 += field1286[var41];
							var39 += field1287[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field1296) {
							var35 -= field1283[var42];
							var36 -= field1284[var42];
							var37 -= field1285[var42];
							var38 -= field1286[var42];
							var39 -= field1287[var42];
						}

						if (var40 >= 1 && var40 < field1296 - 1 && (!field1292 || (field1302[0][var27][var40] & 0x2) != 0 || (field1302[var7][var27][var40] & 0x10) == 0 && method466(var7, var40, var27) == field1305)) {
							if (var7 < field1294) {
								field1294 = var7;
							}

							int var43 = field1288[var7][var27][var40] & 0xFF;
							int var44 = field1290[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field1304[var7][var27][var40];
								int var46 = field1304[var7][var27 + 1][var40];
								int var47 = field1304[var7][var27 + 1][var40 + 1];
								int var48 = field1304[var7][var27][var40 + 1];
								int var49 = field1291[var27][var40];
								int var50 = field1291[var27 + 1][var40];
								int var51 = field1291[var27 + 1][var40 + 1];
								int var52 = field1291[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method479(var55, var56, var57);
									var55 = field1282 + var55 & 0xFF;
									var57 += field1298;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method479(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field1299[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !YDUFKDFX.field1456[var44 - 1].field1461) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field1301[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = ZGIYLEBF.field1505[method477(var54, 96)];
								}

								if (var44 == 0) {
									arg1.method392(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method477(var53, var49), method477(var53, var50), method477(var53, var51), method477(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field1299[var7][var27][var40] + 1;
									byte var61 = field1293[var7][var27][var40];
									YDUFKDFX var62 = YDUFKDFX.field1456[var44 - 1];
									int var63 = var62.field1459;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = ZGIYLEBF.method591(var63);
										var65 = -1;
									} else if (var62.field1458 == 0xFF00FF) {
										var65 = -2;
										var63 = -1;
										var64 = ZGIYLEBF.field1505[method469(var62.field1467, 96)];
									} else {
										var65 = method479(var62.field1462, var62.field1463, var62.field1464);
										var64 = ZGIYLEBF.field1505[method469(var62.field1467, 96)];
									}

									arg1.method392(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method477(var53, var49), method477(var53, var50), method477(var53, var51), method477(var53, var52), method469(var65, var49), method469(var65, var50), method469(var65, var51), method469(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field1296 - 1; var66++) {
				for (int var67 = 1; var67 < field1295 - 1; var67++) {
					arg1.method391(var7, var67, var66, method466(var7, var66, var67));
				}
			}
		}

		arg1.method418(-50, -50, -10);

		for (int var68 = 0; var68 < field1295; var68++) {
			for (int var69 = 0; var69 < field1296; var69++) {
				if ((field1302[1][var68][var69] & 0x2) == 2) {
					arg1.method389(var69, var68);
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
				for (int var75 = 0; var75 <= field1296; var75++) {
					for (int var76 = 0; var76 <= field1295; var76++) {
						if ((field1301[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field1301[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field1296 && (field1301[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field1301[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field1301[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field1304[var80][var76][var77] - var84;
								int var86 = field1304[var79][var76][var77];
								POACSVST.method390(var76 * 128, var76 * 128, var86, var85, var73, 1, var77 * 128, var78 * 128 + 128);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field1301[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field1301[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field1301[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field1295 && (field1301[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field1301[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field1301[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field1304[var92][var89][var75] - var96;
								int var98 = field1304[var91][var89][var75];
								POACSVST.method390(var89 * 128, var90 * 128 + 128, var98, var97, var73, 2, var75 * 128, var75 * 128);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field1301[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field1301[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field1301[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field1296 && (field1301[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field1301[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field1295) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field1301[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field1304[var74][var101][var103];
								POACSVST.method390(var101 * 128, var102 * 128 + 128, var107, var107, var73, 4, var103 * 128, var104 * 128 + 128);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field1301[var74][var108][var109] &= ~var72;
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
