package deob;

@ObfuscatedName("YIGACPUG")
public final class YIGACPUG {

	@ObfuscatedName("YIGACPUG.j")
	public int field1430;

	@ObfuscatedName("YIGACPUG.k")
	public int field1431;

	@ObfuscatedName("YIGACPUG.p")
	public int[][][] field1435;

	@ObfuscatedName("YIGACPUG.A")
	public byte[][][] field1444;

	@ObfuscatedName("YIGACPUG.r")
	public byte[][][] field1437;

	@ObfuscatedName("YIGACPUG.o")
	public byte[][][] field1434;

	@ObfuscatedName("YIGACPUG.G")
	public byte[][][] field1448;

	@ObfuscatedName("YIGACPUG.g")
	public byte[][][] field1427;

	@ObfuscatedName("YIGACPUG.t")
	public int[][][] field1438;

	@ObfuscatedName("YIGACPUG.h")
	public byte[][][] field1428;

	@ObfuscatedName("YIGACPUG.D")
	public int[][] field1447;

	@ObfuscatedName("YIGACPUG.u")
	public int[] field1439;

	@ObfuscatedName("YIGACPUG.v")
	public int[] field1440;

	@ObfuscatedName("YIGACPUG.w")
	public int[] field1441;

	@ObfuscatedName("YIGACPUG.x")
	public int[] field1442;

	@ObfuscatedName("YIGACPUG.y")
	public int[] field1443;

	@ObfuscatedName("YIGACPUG.a")
	public static final int[] field1424 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("YIGACPUG.b")
	public static final int[] field1425 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("YIGACPUG.i")
	public static int field1429 = 99;

	@ObfuscatedName("YIGACPUG.m")
	public static boolean field1432 = true;

	@ObfuscatedName("YIGACPUG.B")
	public static final int[] field1445 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("YIGACPUG.C")
	public static final int[] field1446 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("YIGACPUG.f")
	public static int field1426 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("YIGACPUG.q")
	public static int field1436 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("YIGACPUG.n")
	public static int field1433;

	@ObfuscatedName("YIGACPUG.a([BIIIIIII[LZSRJFSKK;I)V")
	public final void method550(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, ZSRJFSKK[] arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg8 + var10 > 0 && arg8 + var10 < 103 && arg1 + var11 > 0 && arg1 + var11 < 103) {
					arg7[arg6].field1480[arg8 + var10][arg1 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		FTMSICIZ var12 = new FTMSICIZ(arg0);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg3 == var13 && var14 >= arg4 && var14 < arg4 + 8 && var15 >= arg2 && var15 < arg2 + 8) {
						method563(arg1 + EWLSABLL.method195(arg5, var15 & 0x7, var14 & 0x7), arg6, arg5, arg8 + EWLSABLL.method194(var14 & 0x7, var15 & 0x7, arg5), var12, 0, 0);
					} else {
						method563(-1, 0, 0, -1, var12, 0, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("YIGACPUG.a(IIIB)V")
	public final void method551(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 8; var4++) {
			for (int var5 = 0; var5 < 8; var5++) {
				field1435[arg1][arg2 + var4][arg0 + var5] = 0;
			}
		}

		if (arg2 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				field1435[arg1][arg2][arg0 + var6] = field1435[arg1][arg2 - 1][arg0 + var6];
			}
		}

		if (arg0 > 0) {
			for (int var7 = 1; var7 < 8; var7++) {
				field1435[arg1][arg2 + var7][arg0] = field1435[arg1][arg2 + var7][arg0 - 1];
			}
		}

		if (arg2 > 0 && field1435[arg1][arg2 - 1][arg0] != 0) {
			field1435[arg1][arg2][arg0] = field1435[arg1][arg2 - 1][arg0];
		} else if (arg0 > 0 && field1435[arg1][arg2][arg0 - 1] != 0) {
			field1435[arg1][arg2][arg0] = field1435[arg1][arg2][arg0 - 1];
		} else if (arg2 > 0 && arg0 > 0 && field1435[arg1][arg2 - 1][arg0 - 1] != 0) {
			field1435[arg1][arg2][arg0] = field1435[arg1][arg2 - 1][arg0 - 1];
		}
	}

	@ObfuscatedName("YIGACPUG.a(ZLLVBGZMMP;LFTMSICIZ;)V")
	public static final void method552(LVBGZMMP arg0, FTMSICIZ arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg1.method227();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			PZYCJUKA var4 = PZYCJUKA.method409(var2);
			var4.method414(arg0);

			while (true) {
				int var5 = arg1.method227();
				if (var5 == 0) {
					break;
				}

				arg1.method213();
			}
		}
	}

	@ObfuscatedName("YIGACPUG.a(IIII)I")
	public int method553(int arg0, int arg1, int arg2) {
		if ((field1444[arg0][arg1][arg2] & 0x8) != 0) {
			return 0;
		}

		if (arg0 > 0 && (field1444[1][arg1][arg2] & 0x2) != 0) {
			return arg0 - 1;
		}

		return arg0;
	}

	@ObfuscatedName("YIGACPUG.a(II)I")
	public static final int method554(int arg0, int arg1) {
		int var2 = method558(arg0 + 45365, arg1 + 91923, 4) + (method558(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method558(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("YIGACPUG.a(III)I")
	public final int method555(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("YIGACPUG.a(IIIIILXNSGYTEG;I[BI[LZSRJFSKK;I)V")
	public final void method556(int arg0, int arg1, int arg2, int arg3, XNSGYTEG arg4, int arg5, byte[] arg6, int arg7, ZSRJFSKK[] arg8, int arg9) {
		FTMSICIZ var11 = new FTMSICIZ(arg6);
		int var12 = -1;
		while (true) {
			int var13 = var11.method227();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method227();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method213();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg1 == var18 && var17 >= arg5 && var17 < arg5 + 8 && var16 >= arg9 && var16 < arg9 + 8) {
					PZYCJUKA var22 = PZYCJUKA.method409(var12);
					int var23 = arg2 + EWLSABLL.method196(var22.field977, var17 & 0x7, var22.field982, var21, var16 & 0x7, arg0);
					int var24 = arg3 + EWLSABLL.method197(var21, var22.field977, var17 & 0x7, var16 & 0x7, arg0, var22.field982);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg7;
						if ((field1444[1][var23][var24] & 0x2) == 2) {
							var25 = arg7 - 1;
						}

						ZSRJFSKK var26 = null;
						if (var25 >= 0) {
							var26 = arg8[var25];
						}

						method559(var12, arg7, var24, arg0 + var21 & 0x3, var26, var23, var20, arg4);
					}
				}
			}
		}
	}

	public YIGACPUG(int[][][] arg0, int arg1, byte[][][] arg2, int arg3) {
		field1429 = 99;
		field1430 = arg1;
		field1431 = arg3;
		field1435 = arg0;
		field1444 = arg2;
		field1437 = new byte[4][field1430][field1431];
		field1434 = new byte[4][field1430][field1431];
		field1448 = new byte[4][field1430][field1431];
		field1427 = new byte[4][field1430][field1431];
		field1438 = new int[4][field1430 + 1][field1431 + 1];
		field1428 = new byte[4][field1430 + 1][field1431 + 1];
		field1447 = new int[field1430 + 1][field1431 + 1];
		field1439 = new int[field1431];
		field1440 = new int[field1431];
		field1441 = new int[field1431];
		field1442 = new int[field1431];
		field1443 = new int[field1431];
	}

	@ObfuscatedName("YIGACPUG.b(II)I")
	public final int method557(int arg0, int arg1) {
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

	@ObfuscatedName("YIGACPUG.b(III)I")
	public static final int method558(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method570(var3, var5);
		int var8 = method570(var3 + 1, var5);
		int var9 = method570(var3, var5 + 1);
		int var10 = method570(var3 + 1, var5 + 1);
		int var11 = method560(var7, var8, var4, arg2);
		int var12 = method560(var9, var10, var4, arg2);
		return method560(var11, var12, var6, arg2);
	}

	@ObfuscatedName("YIGACPUG.a(IIIIILZSRJFSKK;IILXNSGYTEG;)V")
	public final void method559(int arg0, int arg1, int arg2, int arg3, ZSRJFSKK arg4, int arg5, int arg6, XNSGYTEG arg7) {
		if (field1432 && (field1444[0][arg5][arg2] & 0x2) == 0) {
			if ((field1444[arg1][arg5][arg2] & 0x10) != 0) {
				return;
			}

			if (method553(arg1, arg5, arg2) != field1433) {
				return;
			}
		}

		if (arg1 < field1429) {
			field1429 = arg1;
		}

		int var9 = field1435[arg1][arg5][arg2];
		int var10 = field1435[arg1][arg5 + 1][arg2];
		int var11 = field1435[arg1][arg5 + 1][arg2 + 1];
		int var12 = field1435[arg1][arg5][arg2 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		PZYCJUKA var14 = PZYCJUKA.method409(arg0);
		int var15 = (arg0 << 14) + (arg2 << 7) + arg5 + 0x40000000;
		if (!var14.field980) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg3 << 6) + arg6);
		if (arg6 == 22) {
			if (!field1432 || var14.field980 || var14.field1007) {
				YPQKGFZW var17;
				if (var14.field979 == -1 && var14.field1014 == null) {
					var17 = var14.method413(22, arg3, var9, var10, var11, var12, -1);
				} else {
					var17 = new GEKFXIMX(arg0, var10, var9, 22, var14.field979, var12, var11, arg3, true);
				}

				arg7.method493(var13, var16, arg1, var15, var17, arg2, arg5);

				if (var14.field976 && var14.field980 && arg4 != null) {
					arg4.method579(arg5, arg2);
				}
			}
		} else if (arg6 == 10 || arg6 == 11) {
			YPQKGFZW var18;
			if (var14.field979 == -1 && var14.field1014 == null) {
				var18 = var14.method413(10, arg3, var9, var10, var11, var12, -1);
			} else {
				var18 = new GEKFXIMX(arg0, var10, var9, 10, var14.field979, var12, var11, arg3, true);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg6 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg3 == 1 || arg3 == 3) {
					var20 = var14.field977;
					var21 = var14.field982;
				} else {
					var20 = var14.field982;
					var21 = var14.field977;
				}

				if (arg7.method497(var21, arg2, arg5, var15, var20, arg1, var18, var16, var13, var19) && var14.field998) {
					KUGNQTGL var22;
					if (var18 instanceof KUGNQTGL) {
						var22 = (KUGNQTGL) var18;
					} else {
						var22 = var14.method413(10, arg3, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field694 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field1428[arg1][arg5 + var23][arg2 + var24]) {
									field1428[arg1][arg5 + var23][arg2 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field976 && arg4 != null) {
				arg4.method578(var14.field977, arg5, arg2, var14.field1011, arg3, var14.field982);
			}
		} else if (arg6 >= 12) {
			YPQKGFZW var26;
			if (var14.field979 == -1 && var14.field1014 == null) {
				var26 = var14.method413(arg6, arg3, var9, var10, var11, var12, -1);
			} else {
				var26 = new GEKFXIMX(arg0, var10, var9, arg6, var14.field979, var12, var11, arg3, true);
			}

			arg7.method497(1, arg2, arg5, var15, 1, arg1, var26, var16, var13, 0);

			if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg1 > 0) {
				field1438[arg1][arg5][arg2] |= 0x924;
			}

			if (var14.field976 && arg4 != null) {
				arg4.method578(var14.field977, arg5, arg2, var14.field1011, arg3, var14.field982);
			}
		} else if (arg6 == 0) {
			YPQKGFZW var27;
			if (var14.field979 == -1 && var14.field1014 == null) {
				var27 = var14.method413(0, arg3, var9, var10, var11, var12, -1);
			} else {
				var27 = new GEKFXIMX(arg0, var10, var9, 0, var14.field979, var12, var11, arg3, true);
			}

			arg7.method495(var15, arg1, arg5, null, var16, var13, arg2, 0, field1446[arg3], var27);

			if (arg3 == 0) {
				if (var14.field998) {
					field1428[arg1][arg5][arg2] = 50;
					field1428[arg1][arg5][arg2 + 1] = 50;
				}

				if (var14.field992) {
					field1438[arg1][arg5][arg2] |= 0x249;
				}
			} else if (arg3 == 1) {
				if (var14.field998) {
					field1428[arg1][arg5][arg2 + 1] = 50;
					field1428[arg1][arg5 + 1][arg2 + 1] = 50;
				}

				if (var14.field992) {
					field1438[arg1][arg5][arg2 + 1] |= 0x492;
				}
			} else if (arg3 == 2) {
				if (var14.field998) {
					field1428[arg1][arg5 + 1][arg2] = 50;
					field1428[arg1][arg5 + 1][arg2 + 1] = 50;
				}

				if (var14.field992) {
					field1438[arg1][arg5 + 1][arg2] |= 0x249;
				}
			} else if (arg3 == 3) {
				if (var14.field998) {
					field1428[arg1][arg5][arg2] = 50;
					field1428[arg1][arg5 + 1][arg2] = 50;
				}

				if (var14.field992) {
					field1438[arg1][arg5][arg2] |= 0x492;
				}
			}

			if (var14.field976 && arg4 != null) {
				arg4.method577(var14.field1011, arg5, arg2, arg3, arg6);
			}

			if (var14.field1000 != 16) {
				arg7.method503(arg5, var14.field1000, arg1, arg2);
			}
		} else if (arg6 == 1) {
			YPQKGFZW var28;
			if (var14.field979 == -1 && var14.field1014 == null) {
				var28 = var14.method413(1, arg3, var9, var10, var11, var12, -1);
			} else {
				var28 = new GEKFXIMX(arg0, var10, var9, 1, var14.field979, var12, var11, arg3, true);
			}

			arg7.method495(var15, arg1, arg5, null, var16, var13, arg2, 0, field1445[arg3], var28);

			if (var14.field998) {
				if (arg3 == 0) {
					field1428[arg1][arg5][arg2 + 1] = 50;
				} else if (arg3 == 1) {
					field1428[arg1][arg5 + 1][arg2 + 1] = 50;
				} else if (arg3 == 2) {
					field1428[arg1][arg5 + 1][arg2] = 50;
				} else if (arg3 == 3) {
					field1428[arg1][arg5][arg2] = 50;
				}
			}

			if (var14.field976 && arg4 != null) {
				arg4.method577(var14.field1011, arg5, arg2, arg3, arg6);
			}
		} else if (arg6 == 2) {
			int var29 = arg3 + 1 & 0x3;
			YPQKGFZW var30;
			YPQKGFZW var31;
			if (var14.field979 == -1 && var14.field1014 == null) {
				var30 = var14.method413(2, arg3 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method413(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new GEKFXIMX(arg0, var10, var9, 2, var14.field979, var12, var11, arg3 + 4, true);
				var31 = new GEKFXIMX(arg0, var10, var9, 2, var14.field979, var12, var11, var29, true);
			}

			arg7.method495(var15, arg1, arg5, var31, var16, var13, arg2, field1446[var29], field1446[arg3], var30);

			if (var14.field992) {
				if (arg3 == 0) {
					field1438[arg1][arg5][arg2] |= 0x249;
					field1438[arg1][arg5][arg2 + 1] |= 0x492;
				} else if (arg3 == 1) {
					field1438[arg1][arg5][arg2 + 1] |= 0x492;
					field1438[arg1][arg5 + 1][arg2] |= 0x249;
				} else if (arg3 == 2) {
					field1438[arg1][arg5 + 1][arg2] |= 0x249;
					field1438[arg1][arg5][arg2] |= 0x492;
				} else if (arg3 == 3) {
					field1438[arg1][arg5][arg2] |= 0x492;
					field1438[arg1][arg5][arg2] |= 0x249;
				}
			}

			if (var14.field976 && arg4 != null) {
				arg4.method577(var14.field1011, arg5, arg2, arg3, arg6);
			}

			if (var14.field1000 != 16) {
				arg7.method503(arg5, var14.field1000, arg1, arg2);
			}
		} else if (arg6 == 3) {
			YPQKGFZW var32;
			if (var14.field979 == -1 && var14.field1014 == null) {
				var32 = var14.method413(3, arg3, var9, var10, var11, var12, -1);
			} else {
				var32 = new GEKFXIMX(arg0, var10, var9, 3, var14.field979, var12, var11, arg3, true);
			}

			arg7.method495(var15, arg1, arg5, null, var16, var13, arg2, 0, field1445[arg3], var32);

			if (var14.field998) {
				if (arg3 == 0) {
					field1428[arg1][arg5][arg2 + 1] = 50;
				} else if (arg3 == 1) {
					field1428[arg1][arg5 + 1][arg2 + 1] = 50;
				} else if (arg3 == 2) {
					field1428[arg1][arg5 + 1][arg2] = 50;
				} else if (arg3 == 3) {
					field1428[arg1][arg5][arg2] = 50;
				}
			}

			if (var14.field976 && arg4 != null) {
				arg4.method577(var14.field1011, arg5, arg2, arg3, arg6);
			}
		} else if (arg6 == 9) {
			YPQKGFZW var33;
			if (var14.field979 == -1 && var14.field1014 == null) {
				var33 = var14.method413(arg6, arg3, var9, var10, var11, var12, -1);
			} else {
				var33 = new GEKFXIMX(arg0, var10, var9, arg6, var14.field979, var12, var11, arg3, true);
			}

			arg7.method497(1, arg2, arg5, var15, 1, arg1, var33, var16, var13, 0);

			if (var14.field976 && arg4 != null) {
				arg4.method578(var14.field977, arg5, arg2, var14.field1011, arg3, var14.field982);
			}
		} else {
			if (var14.field989) {
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

			if (arg6 == 4) {
				YPQKGFZW var38;
				if (var14.field979 == -1 && var14.field1014 == null) {
					var38 = var14.method413(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new GEKFXIMX(arg0, var10, var9, 4, var14.field979, var12, var11, 0, true);
				}

				arg7.method496(0, arg5, arg1, arg2, 0, var38, field1446[arg3], var15, arg3 * 512, var16, var13);
			} else if (arg6 == 5) {
				int var39 = 16;
				int var40 = arg7.method513(arg1, arg5, arg2);
				if (var40 > 0) {
					var39 = PZYCJUKA.method409(var40 >> 14 & 0x7FFF).field1000;
				}

				YPQKGFZW var41;
				if (var14.field979 == -1 && var14.field1014 == null) {
					var41 = var14.method413(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new GEKFXIMX(arg0, var10, var9, 4, var14.field979, var12, var11, 0, true);
				}

				arg7.method496(field1424[arg3] * var39, arg5, arg1, arg2, field1425[arg3] * var39, var41, field1446[arg3], var15, arg3 * 512, var16, var13);
			} else if (arg6 == 6) {
				YPQKGFZW var42;
				if (var14.field979 == -1 && var14.field1014 == null) {
					var42 = var14.method413(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new GEKFXIMX(arg0, var10, var9, 4, var14.field979, var12, var11, 0, true);
				}

				arg7.method496(0, arg5, arg1, arg2, 0, var42, 256, var15, arg3, var16, var13);
			} else if (arg6 == 7) {
				YPQKGFZW var43;
				if (var14.field979 == -1 && var14.field1014 == null) {
					var43 = var14.method413(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new GEKFXIMX(arg0, var10, var9, 4, var14.field979, var12, var11, 0, true);
				}

				arg7.method496(0, arg5, arg1, arg2, 0, var43, 512, var15, arg3, var16, var13);
			} else if (arg6 == 8) {
				YPQKGFZW var44;
				if (var14.field979 == -1 && var14.field1014 == null) {
					var44 = var14.method413(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new GEKFXIMX(arg0, var10, var9, 4, var14.field979, var12, var11, 0, true);
				}

				arg7.method496(0, arg5, arg1, arg2, 0, var44, 768, var15, arg3, var16, var13);
			}
		}
	}

	@ObfuscatedName("YIGACPUG.b(IIII)I")
	public static final int method560(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - ZUDKHAVN.field1491[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("YIGACPUG.c(II)I")
	public static final int method561(int arg0, int arg1) {
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

	@ObfuscatedName("YIGACPUG.c(III)Z")
	public static final boolean method562(int arg0, int arg1) {
		PZYCJUKA var2 = PZYCJUKA.method409(arg1);

		if (arg0 == 11) {
			arg0 = 10;
		}

		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}

		return var2.method417(arg0);
	}

	@ObfuscatedName("YIGACPUG.a(IIIILFTMSICIZ;III)V")
	public final void method563(int arg0, int arg1, int arg2, int arg3, FTMSICIZ arg4, int arg5, int arg6) {
		if (arg3 >= 0 && arg3 < 104 && arg0 >= 0 && arg0 < 104) {
			field1444[arg1][arg3][arg0] = 0;
			while (true) {
				int var8 = arg4.method213();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg4.method213();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg1 == 0) {
						field1435[0][arg3][arg0] = -var9 * 8;
						return;
					}

					field1435[arg1][arg3][arg0] = field1435[arg1 - 1][arg3][arg0] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field1434[arg1][arg3][arg0] = arg4.method214();
					field1448[arg1][arg3][arg0] = (byte) ((var8 - 2) / 4);
					field1427[arg1][arg3][arg0] = (byte) (var8 + arg2 - 2 & 0x3);
				} else if (var8 <= 81) {
					field1444[arg1][arg3][arg0] = (byte) (var8 - 49);
				} else {
					field1437[arg1][arg3][arg0] = (byte) (var8 - 81);
				}
			}

			if (arg1 == 0) {
				field1435[0][arg3][arg0] = -method554(arg3 + arg5 + 932731, arg0 + 556238 + arg6) * 8;
			} else {
				field1435[arg1][arg3][arg0] = field1435[arg1 - 1][arg3][arg0] - 240;
			}
		} else {
			while (true) {
				int var10 = arg4.method213();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg4.method213();
					return;
				}

				if (var10 <= 49) {
					arg4.method213();
				}
			}
		}
	}

	@ObfuscatedName("YIGACPUG.a(IIIII)V")
	public final void method564(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg0; var5 <= arg0 + arg3; var5++) {
			for (int var6 = arg1; var6 <= arg1 + arg2; var6++) {
				if (var6 >= 0 && var6 < field1430 && var5 >= 0 && var5 < field1431) {
					field1428[0][var6][var5] = 127;

					if (arg1 == var6 && var6 > 0) {
						field1435[0][var6][var5] = field1435[0][var6 - 1][var5];
					}

					if (arg1 + arg2 == var6 && var6 < field1430 - 1) {
						field1435[0][var6][var5] = field1435[0][var6 + 1][var5];
					}

					if (arg0 == var5 && var5 > 0) {
						field1435[0][var6][var5] = field1435[0][var6][var5 - 1];
					}

					if (arg0 + arg3 == var5 && var5 < field1431 - 1) {
						field1435[0][var6][var5] = field1435[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("YIGACPUG.d(II)I")
	public static final int method565(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("YIGACPUG.a([LZSRJFSKK;II[BIII)V")
	public final void method566(ZSRJFSKK[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg4 + var8 > 0 && arg4 + var8 < 103 && arg1 + var9 > 0 && arg1 + var9 < 103) {
						arg0[var7].field1480[arg4 + var8][arg1 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		FTMSICIZ var10 = new FTMSICIZ(arg3);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method563(arg1 + var13, var11, 0, arg4 + var12, var10, arg5, arg2);
				}
			}
		}
	}

	@ObfuscatedName("YIGACPUG.a([BIII)Z")
	public static final boolean method567(byte[] arg0, int arg1, int arg2) {
		boolean var3 = true;
		FTMSICIZ var4 = new FTMSICIZ(arg0);
		int var5 = -1;
		while (true) {
			int var6 = var4.method227();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method227();
					if (var9 == 0) {
						break;
					}

					var4.method213();
				} else {
					int var10 = var4.method227();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method213() >> 2;
					int var14 = arg1 + var12;
					int var15 = arg2 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						PZYCJUKA var16 = PZYCJUKA.method409(var5);
						if (var13 != 22 || !field1432 || var16.field980 || var16.field1007) {
							var3 &= var16.method416();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("YIGACPUG.a(ILXNSGYTEG;[LZSRJFSKK;)V")
	public final void method568(XNSGYTEG arg0, ZSRJFSKK[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field1444[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field1444[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method579(var4, var5);
						}
					}
				}
			}
		}

		field1426 += (int) (Math.random() * 5.0D) - 2;
		if (field1426 < -8) {
			field1426 = -8;
		}

		if (field1426 > 8) {
			field1426 = 8;
		}

		field1436 += (int) (Math.random() * 5.0D) - 2;
		if (field1436 < -16) {
			field1436 = -16;
		}

		if (field1436 > 16) {
			field1436 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field1428[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field1431 - 1; var16++) {
				for (int var17 = 1; var17 < field1430 - 1; var17++) {
					int var18 = field1435[var7][var17 + 1][var16] - field1435[var7][var17 - 1][var16];
					int var19 = field1435[var7][var17][var16 + 1] - field1435[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field1447[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field1431; var26++) {
				field1439[var26] = 0;
				field1440[var26] = 0;
				field1441[var26] = 0;
				field1442[var26] = 0;
				field1443[var26] = 0;
			}

			for (int var27 = -5; var27 < field1430 + 5; var27++) {
				for (int var28 = 0; var28 < field1431; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field1430) {
						int var30 = field1437[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							TFMGYYZY var31 = TFMGYYZY.field1291[var30 - 1];
							field1439[var28] += var31.field1300;
							field1440[var28] += var31.field1298;
							field1441[var28] += var31.field1299;
							field1442[var28] += var31.field1301;
							field1443[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field1430) {
						int var33 = field1437[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							TFMGYYZY var34 = TFMGYYZY.field1291[var33 - 1];
							field1439[var28] -= var34.field1300;
							field1440[var28] -= var34.field1298;
							field1441[var28] -= var34.field1299;
							field1442[var28] -= var34.field1301;
							field1443[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field1430 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field1431 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field1431) {
							var35 += field1439[var41];
							var36 += field1440[var41];
							var37 += field1441[var41];
							var38 += field1442[var41];
							var39 += field1443[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field1431) {
							var35 -= field1439[var42];
							var36 -= field1440[var42];
							var37 -= field1441[var42];
							var38 -= field1442[var42];
							var39 -= field1443[var42];
						}

						if (var40 >= 1 && var40 < field1431 - 1 && (!field1432 || (field1444[0][var27][var40] & 0x2) != 0 || (field1444[var7][var27][var40] & 0x10) == 0 && method553(var7, var27, var40) == field1433)) {
							if (var7 < field1429) {
								field1429 = var7;
							}

							int var43 = field1437[var7][var27][var40] & 0xFF;
							int var44 = field1434[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field1435[var7][var27][var40];
								int var46 = field1435[var7][var27 + 1][var40];
								int var47 = field1435[var7][var27 + 1][var40 + 1];
								int var48 = field1435[var7][var27][var40 + 1];
								int var49 = field1447[var27][var40];
								int var50 = field1447[var27 + 1][var40];
								int var51 = field1447[var27 + 1][var40 + 1];
								int var52 = field1447[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method555(var55, var56, var57);
									var55 = field1426 + var55 & 0xFF;
									var57 += field1436;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method555(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field1448[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !TFMGYYZY.field1291[var44 - 1].field1296) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field1438[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = ZUDKHAVN.field1502[method561(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method492(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method561(var53, var49), method561(var53, var50), method561(var53, var51), method561(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field1448[var7][var27][var40] + 1;
									byte var61 = field1427[var7][var27][var40];
									TFMGYYZY var62 = TFMGYYZY.field1291[var44 - 1];
									int var63 = var62.field1294;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = ZUDKHAVN.method594(var63);
										var65 = -1;
									} else if (var62.field1293 == 0xFF00FF) {
										var65 = -2;
										var63 = -1;
										var64 = ZUDKHAVN.field1502[method557(var62.field1302, 96)];
									} else {
										var65 = method555(var62.field1297, var62.field1298, var62.field1299);
										var64 = ZUDKHAVN.field1502[method557(var62.field1302, 96)];
									}

									arg0.method492(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method561(var53, var49), method561(var53, var50), method561(var53, var51), method561(var53, var52), method557(var65, var49), method557(var65, var50), method557(var65, var51), method557(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field1431 - 1; var66++) {
				for (int var67 = 1; var67 < field1430 - 1; var67++) {
					arg0.method491(var7, var67, var66, method553(var7, var67, var66));
				}
			}
		}

		arg0.method518(-10, -50, -50);

		for (int var68 = 0; var68 < field1430; var68++) {
			for (int var69 = 0; var69 < field1431; var69++) {
				if ((field1444[1][var68][var69] & 0x2) == 2) {
					arg0.method489(var68, var69);
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
				for (int var75 = 0; var75 <= field1431; var75++) {
					for (int var76 = 0; var76 <= field1430; var76++) {
						if ((field1438[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field1438[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field1431 && (field1438[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field1438[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field1438[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field1435[var80][var76][var77] - var84;
								int var86 = field1435[var79][var76][var77];
								XNSGYTEG.method490(var86, var77 * 128, var78 * 128 + 128, var76 * 128, var76 * 128, var73, var85, 1);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field1438[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field1438[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field1438[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field1430 && (field1438[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field1438[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field1438[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field1435[var92][var89][var75] - var96;
								int var98 = field1435[var91][var89][var75];
								XNSGYTEG.method490(var98, var75 * 128, var75 * 128, var89 * 128, var90 * 128 + 128, var73, var97, 2);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field1438[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field1438[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field1438[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field1431 && (field1438[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field1438[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field1430) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field1438[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field1435[var74][var101][var103];
								XNSGYTEG.method490(var107, var103 * 128, var104 * 128 + 128, var101 * 128, var102 * 128 + 128, var73, var107, 4);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field1438[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("YIGACPUG.a(II[LZSRJFSKK;[BLXNSGYTEG;B)V")
	public final void method569(int arg0, int arg1, ZSRJFSKK[] arg2, byte[] arg3, XNSGYTEG arg4) {
		FTMSICIZ var6 = new FTMSICIZ(arg3);
		int var7 = -1;
		while (true) {
			int var8 = var6.method227();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method227();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method213();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg0 + var12;
				int var18 = arg1 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field1444[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					ZSRJFSKK var20 = null;
					if (var19 >= 0) {
						var20 = arg2[var19];
					}

					method559(var7, var13, var18, var16, var20, var17, var15, arg4);
				}
			}
		}
	}

	@ObfuscatedName("YIGACPUG.e(II)I")
	public static final int method570(int arg0, int arg1) {
		int var2 = method565(arg0 - 1, arg1 - 1) + method565(arg0 + 1, arg1 - 1) + method565(arg0 - 1, arg1 + 1) + method565(arg0 + 1, arg1 + 1);
		int var3 = method565(arg0 - 1, arg1) + method565(arg0 + 1, arg1) + method565(arg0, arg1 - 1) + method565(arg0, arg1 + 1);
		int var4 = method565(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("YIGACPUG.a(ILXNSGYTEG;IILZSRJFSKK;III[[[III)V")
	public static final void method571(int arg0, XNSGYTEG arg1, int arg2, int arg3, ZSRJFSKK arg4, int arg5, int arg6, int[][][] arg7, int arg8, int arg9) {
		int var10 = arg7[arg6][arg0][arg5];
		int var11 = arg7[arg6][arg0 + 1][arg5];
		int var12 = arg7[arg6][arg0 + 1][arg5 + 1];
		int var13 = arg7[arg6][arg0][arg5 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		PZYCJUKA var15 = PZYCJUKA.method409(arg9);
		int var16 = (arg9 << 14) + (arg5 << 7) + arg0 + 0x40000000;
		if (!var15.field980) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg2 << 6) + arg3);
		if (arg3 == 22) {
			YPQKGFZW var18;
			if (var15.field979 == -1 && var15.field1014 == null) {
				var18 = var15.method413(22, arg2, var10, var11, var12, var13, -1);
			} else {
				var18 = new GEKFXIMX(arg9, var11, var10, 22, var15.field979, var13, var12, arg2, true);
			}

			arg1.method493(var14, var17, arg8, var16, var18, arg5, arg0);

			if (var15.field976 && var15.field980) {
				arg4.method579(arg0, arg5);
			}
		} else if (arg3 == 10 || arg3 == 11) {
			YPQKGFZW var19;
			if (var15.field979 == -1 && var15.field1014 == null) {
				var19 = var15.method413(10, arg2, var10, var11, var12, var13, -1);
			} else {
				var19 = new GEKFXIMX(arg9, var11, var10, 10, var15.field979, var13, var12, arg2, true);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg3 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg2 == 1 || arg2 == 3) {
					var21 = var15.field977;
					var22 = var15.field982;
				} else {
					var21 = var15.field982;
					var22 = var15.field977;
				}

				arg1.method497(var22, arg5, arg0, var16, var21, arg8, var19, var17, var14, var20);
			}

			if (var15.field976) {
				arg4.method578(var15.field977, arg0, arg5, var15.field1011, arg2, var15.field982);
			}
		} else if (arg3 >= 12) {
			YPQKGFZW var23;
			if (var15.field979 == -1 && var15.field1014 == null) {
				var23 = var15.method413(arg3, arg2, var10, var11, var12, var13, -1);
			} else {
				var23 = new GEKFXIMX(arg9, var11, var10, arg3, var15.field979, var13, var12, arg2, true);
			}

			arg1.method497(1, arg5, arg0, var16, 1, arg8, var23, var17, var14, 0);

			if (var15.field976) {
				arg4.method578(var15.field977, arg0, arg5, var15.field1011, arg2, var15.field982);
			}
		} else if (arg3 == 0) {
			YPQKGFZW var24;
			if (var15.field979 == -1 && var15.field1014 == null) {
				var24 = var15.method413(0, arg2, var10, var11, var12, var13, -1);
			} else {
				var24 = new GEKFXIMX(arg9, var11, var10, 0, var15.field979, var13, var12, arg2, true);
			}

			arg1.method495(var16, arg8, arg0, null, var17, var14, arg5, 0, field1446[arg2], var24);

			if (var15.field976) {
				arg4.method577(var15.field1011, arg0, arg5, arg2, arg3);
			}
		} else if (arg3 == 1) {
			YPQKGFZW var25;
			if (var15.field979 == -1 && var15.field1014 == null) {
				var25 = var15.method413(1, arg2, var10, var11, var12, var13, -1);
			} else {
				var25 = new GEKFXIMX(arg9, var11, var10, 1, var15.field979, var13, var12, arg2, true);
			}

			arg1.method495(var16, arg8, arg0, null, var17, var14, arg5, 0, field1445[arg2], var25);

			if (var15.field976) {
				arg4.method577(var15.field1011, arg0, arg5, arg2, arg3);
			}
		} else if (arg3 == 2) {
			int var26 = arg2 + 1 & 0x3;
			YPQKGFZW var27;
			YPQKGFZW var28;
			if (var15.field979 == -1 && var15.field1014 == null) {
				var27 = var15.method413(2, arg2 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method413(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new GEKFXIMX(arg9, var11, var10, 2, var15.field979, var13, var12, arg2 + 4, true);
				var28 = new GEKFXIMX(arg9, var11, var10, 2, var15.field979, var13, var12, var26, true);
			}

			arg1.method495(var16, arg8, arg0, var28, var17, var14, arg5, field1446[var26], field1446[arg2], var27);

			if (var15.field976) {
				arg4.method577(var15.field1011, arg0, arg5, arg2, arg3);
			}
		} else if (arg3 == 3) {
			YPQKGFZW var29;
			if (var15.field979 == -1 && var15.field1014 == null) {
				var29 = var15.method413(3, arg2, var10, var11, var12, var13, -1);
			} else {
				var29 = new GEKFXIMX(arg9, var11, var10, 3, var15.field979, var13, var12, arg2, true);
			}

			arg1.method495(var16, arg8, arg0, null, var17, var14, arg5, 0, field1445[arg2], var29);

			if (var15.field976) {
				arg4.method577(var15.field1011, arg0, arg5, arg2, arg3);
			}
		} else if (arg3 == 9) {
			YPQKGFZW var30;
			if (var15.field979 == -1 && var15.field1014 == null) {
				var30 = var15.method413(arg3, arg2, var10, var11, var12, var13, -1);
			} else {
				var30 = new GEKFXIMX(arg9, var11, var10, arg3, var15.field979, var13, var12, arg2, true);
			}

			arg1.method497(1, arg5, arg0, var16, 1, arg8, var30, var17, var14, 0);

			if (var15.field976) {
				arg4.method578(var15.field977, arg0, arg5, var15.field1011, arg2, var15.field982);
			}
		} else {
			if (var15.field989) {
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
				YPQKGFZW var35;
				if (var15.field979 == -1 && var15.field1014 == null) {
					var35 = var15.method413(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new GEKFXIMX(arg9, var11, var10, 4, var15.field979, var13, var12, 0, true);
				}

				arg1.method496(0, arg0, arg8, arg5, 0, var35, field1446[arg2], var16, arg2 * 512, var17, var14);
			} else if (arg3 == 5) {
				int var36 = 16;
				int var37 = arg1.method513(arg8, arg0, arg5);
				if (var37 > 0) {
					var36 = PZYCJUKA.method409(var37 >> 14 & 0x7FFF).field1000;
				}

				YPQKGFZW var38;
				if (var15.field979 == -1 && var15.field1014 == null) {
					var38 = var15.method413(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new GEKFXIMX(arg9, var11, var10, 4, var15.field979, var13, var12, 0, true);
				}

				arg1.method496(field1424[arg2] * var36, arg0, arg8, arg5, field1425[arg2] * var36, var38, field1446[arg2], var16, arg2 * 512, var17, var14);
			} else if (arg3 == 6) {
				YPQKGFZW var39;
				if (var15.field979 == -1 && var15.field1014 == null) {
					var39 = var15.method413(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new GEKFXIMX(arg9, var11, var10, 4, var15.field979, var13, var12, 0, true);
				}

				arg1.method496(0, arg0, arg8, arg5, 0, var39, 256, var16, arg2, var17, var14);
			} else if (arg3 == 7) {
				YPQKGFZW var40;
				if (var15.field979 == -1 && var15.field1014 == null) {
					var40 = var15.method413(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new GEKFXIMX(arg9, var11, var10, 4, var15.field979, var13, var12, 0, true);
				}

				arg1.method496(0, arg0, arg8, arg5, 0, var40, 512, var16, arg2, var17, var14);
			} else if (arg3 == 8) {
				YPQKGFZW var41;
				if (var15.field979 == -1 && var15.field1014 == null) {
					var41 = var15.method413(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new GEKFXIMX(arg9, var11, var10, 4, var15.field979, var13, var12, 0, true);
				}

				arg1.method496(0, arg0, arg8, arg5, 0, var41, 768, var16, arg2, var17, var14);
			}
		}
	}
}
