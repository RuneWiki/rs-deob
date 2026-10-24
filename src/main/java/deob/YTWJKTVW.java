package deob;

@ObfuscatedName("YTWJKTVW")
public final class YTWJKTVW {

	@ObfuscatedName("YTWJKTVW.f")
	public int field1473;

	@ObfuscatedName("YTWJKTVW.g")
	public int field1474;

	@ObfuscatedName("YTWJKTVW.m")
	public int[][][] field1478;

	@ObfuscatedName("YTWJKTVW.C")
	public byte[][][] field1490;

	@ObfuscatedName("YTWJKTVW.G")
	public byte[][][] field1493;

	@ObfuscatedName("YTWJKTVW.E")
	public byte[][][] field1491;

	@ObfuscatedName("YTWJKTVW.b")
	public byte[][][] field1470;

	@ObfuscatedName("YTWJKTVW.p")
	public byte[][][] field1480;

	@ObfuscatedName("YTWJKTVW.v")
	public int[][][] field1484;

	@ObfuscatedName("YTWJKTVW.n")
	public byte[][][] field1479;

	@ObfuscatedName("YTWJKTVW.F")
	public int[][] field1492;

	@ObfuscatedName("YTWJKTVW.w")
	public int[] field1485;

	@ObfuscatedName("YTWJKTVW.x")
	public int[] field1486;

	@ObfuscatedName("YTWJKTVW.y")
	public int[] field1487;

	@ObfuscatedName("YTWJKTVW.z")
	public int[] field1488;

	@ObfuscatedName("YTWJKTVW.A")
	public int[] field1489;

	@ObfuscatedName("YTWJKTVW.a")
	public static final int[] field1469 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("YTWJKTVW.d")
	public static final int[] field1471 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("YTWJKTVW.e")
	public static int field1472 = 99;

	@ObfuscatedName("YTWJKTVW.h")
	public static final int[] field1475 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("YTWJKTVW.q")
	public static boolean field1481 = true;

	@ObfuscatedName("YTWJKTVW.t")
	public static final int[] field1483 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("YTWJKTVW.j")
	public static int field1476 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("YTWJKTVW.l")
	public static int field1477 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("YTWJKTVW.r")
	public static int field1482;

	@ObfuscatedName("YTWJKTVW.a(III)I")
	public static final int method558(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method573(var3, var5);
		int var8 = method573(var3 + 1, var5);
		int var9 = method573(var3, var5 + 1);
		int var10 = method573(var3 + 1, var5 + 1);
		int var11 = method579(var7, var8, var4, arg2);
		int var12 = method579(var9, var10, var4, arg2);
		return method579(var11, var12, var6, arg2);
	}

	@ObfuscatedName("YTWJKTVW.a(IBII)I")
	public int method559(int arg0, int arg1, int arg2) {
		if ((field1490[arg2][arg1][arg0] & 0x8) != 0) {
			return 0;
		}

		if (arg2 > 0 && (field1490[1][arg1][arg0] & 0x2) != 0) {
			return arg2 - 1;
		}

		return arg2;
	}

	@ObfuscatedName("YTWJKTVW.a([[[IIIILMCPCRICF;LFUVVWALN;IIZII)V")
	public static final void method560(int[][][] arg0, int arg1, int arg2, int arg3, MCPCRICF arg4, FUVVWALN arg5, int arg6, int arg7, int arg8, int arg9) {
		int var10 = arg0[arg2][arg9][arg3];
		int var11 = arg0[arg2][arg9 + 1][arg3];
		int var12 = arg0[arg2][arg9 + 1][arg3 + 1];
		int var13 = arg0[arg2][arg9][arg3 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		DZZSWICG var15 = DZZSWICG.method184(arg1);
		int var16 = (arg1 << 14) + (arg3 << 7) + arg9 + 0x40000000;
		if (!var15.field569) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg8 << 6) + arg6);
		if (arg6 == 22) {
			BSABUCFC var18;
			if (var15.field559 == -1 && var15.field543 == null) {
				var18 = var15.method190(22, arg8, var10, var11, var12, var13, -1);
			} else {
				var18 = new HVMNUAXR(var12, var11, var13, true, var10, 22, arg8, arg1, var15.field559);
			}

			arg4.method335(arg7, var16, arg9, var17, arg3, var18, var14);

			if (var15.field555 && var15.field569) {
				arg5.method231(arg9, arg3);
			}
		} else if (arg6 == 10 || arg6 == 11) {
			BSABUCFC var19;
			if (var15.field559 == -1 && var15.field543 == null) {
				var19 = var15.method190(10, arg8, var10, var11, var12, var13, -1);
			} else {
				var19 = new HVMNUAXR(var12, var11, var13, true, var10, 10, arg8, arg1, var15.field559);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg6 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg8 == 1 || arg8 == 3) {
					var21 = var15.field580;
					var22 = var15.field561;
				} else {
					var21 = var15.field561;
					var22 = var15.field580;
				}

				arg4.method339(arg3, arg7, var22, var16, var14, arg9, var17, var21, var19, var20);
			}

			if (var15.field555) {
				arg5.method230(var15.field580, arg8, arg9, var15.field579, var15.field561, arg3);
			}
		} else if (arg6 >= 12) {
			BSABUCFC var23;
			if (var15.field559 == -1 && var15.field543 == null) {
				var23 = var15.method190(arg6, arg8, var10, var11, var12, var13, -1);
			} else {
				var23 = new HVMNUAXR(var12, var11, var13, true, var10, arg6, arg8, arg1, var15.field559);
			}

			arg4.method339(arg3, arg7, 1, var16, var14, arg9, var17, 1, var23, 0);

			if (var15.field555) {
				arg5.method230(var15.field580, arg8, arg9, var15.field579, var15.field561, arg3);
			}
		} else if (arg6 == 0) {
			BSABUCFC var24;
			if (var15.field559 == -1 && var15.field543 == null) {
				var24 = var15.method190(0, arg8, var10, var11, var12, var13, -1);
			} else {
				var24 = new HVMNUAXR(var12, var11, var13, true, var10, 0, arg8, arg1, var15.field559);
			}

			arg4.method337(0, arg3, var17, field1483[arg8], null, arg9, arg7, var16, var14, var24);

			if (var15.field555) {
				arg5.method229(arg6, var15.field579, arg8, arg9, arg3);
			}
		} else if (arg6 == 1) {
			BSABUCFC var25;
			if (var15.field559 == -1 && var15.field543 == null) {
				var25 = var15.method190(1, arg8, var10, var11, var12, var13, -1);
			} else {
				var25 = new HVMNUAXR(var12, var11, var13, true, var10, 1, arg8, arg1, var15.field559);
			}

			arg4.method337(0, arg3, var17, field1471[arg8], null, arg9, arg7, var16, var14, var25);

			if (var15.field555) {
				arg5.method229(arg6, var15.field579, arg8, arg9, arg3);
			}
		} else if (arg6 == 2) {
			int var26 = arg8 + 1 & 0x3;
			BSABUCFC var27;
			BSABUCFC var28;
			if (var15.field559 == -1 && var15.field543 == null) {
				var27 = var15.method190(2, arg8 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method190(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new HVMNUAXR(var12, var11, var13, true, var10, 2, arg8 + 4, arg1, var15.field559);
				var28 = new HVMNUAXR(var12, var11, var13, true, var10, 2, var26, arg1, var15.field559);
			}

			arg4.method337(field1483[var26], arg3, var17, field1483[arg8], var28, arg9, arg7, var16, var14, var27);

			if (var15.field555) {
				arg5.method229(arg6, var15.field579, arg8, arg9, arg3);
			}
		} else if (arg6 == 3) {
			BSABUCFC var29;
			if (var15.field559 == -1 && var15.field543 == null) {
				var29 = var15.method190(3, arg8, var10, var11, var12, var13, -1);
			} else {
				var29 = new HVMNUAXR(var12, var11, var13, true, var10, 3, arg8, arg1, var15.field559);
			}

			arg4.method337(0, arg3, var17, field1471[arg8], null, arg9, arg7, var16, var14, var29);

			if (var15.field555) {
				arg5.method229(arg6, var15.field579, arg8, arg9, arg3);
			}
		} else if (arg6 == 9) {
			BSABUCFC var30;
			if (var15.field559 == -1 && var15.field543 == null) {
				var30 = var15.method190(arg6, arg8, var10, var11, var12, var13, -1);
			} else {
				var30 = new HVMNUAXR(var12, var11, var13, true, var10, arg6, arg8, arg1, var15.field559);
			}

			arg4.method339(arg3, arg7, 1, var16, var14, arg9, var17, 1, var30, 0);

			if (var15.field555) {
				arg5.method230(var15.field580, arg8, arg9, var15.field579, var15.field561, arg3);
			}
		} else {
			if (var15.field551) {
				if (arg8 == 1) {
					int var31 = var13;
					var13 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var31;
				} else if (arg8 == 2) {
					int var32 = var13;
					var13 = var11;
					var11 = var32;
					int var33 = var12;
					var12 = var10;
					var10 = var33;
				} else if (arg8 == 3) {
					int var34 = var13;
					var13 = var10;
					var10 = var11;
					var11 = var12;
					var12 = var34;
				}
			}

			if (arg6 == 4) {
				BSABUCFC var35;
				if (var15.field559 == -1 && var15.field543 == null) {
					var35 = var15.method190(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new HVMNUAXR(var12, var11, var13, true, var10, 4, 0, arg1, var15.field559);
				}

				arg4.method338(var16, var14, 0, field1483[arg8], var17, var35, arg3, arg8 * 512, 0, arg9, arg7);
			} else if (arg6 == 5) {
				int var36 = 16;
				int var37 = arg4.method355(arg7, arg9, arg3);
				if (var37 > 0) {
					var36 = DZZSWICG.method184(var37 >> 14 & 0x7FFF).field565;
				}

				BSABUCFC var38;
				if (var15.field559 == -1 && var15.field543 == null) {
					var38 = var15.method190(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new HVMNUAXR(var12, var11, var13, true, var10, 4, 0, arg1, var15.field559);
				}

				arg4.method338(var16, var14, field1475[arg8] * var36, field1483[arg8], var17, var38, arg3, arg8 * 512, field1469[arg8] * var36, arg9, arg7);
			} else if (arg6 == 6) {
				BSABUCFC var39;
				if (var15.field559 == -1 && var15.field543 == null) {
					var39 = var15.method190(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new HVMNUAXR(var12, var11, var13, true, var10, 4, 0, arg1, var15.field559);
				}

				arg4.method338(var16, var14, 0, 256, var17, var39, arg3, arg8, 0, arg9, arg7);
			} else if (arg6 == 7) {
				BSABUCFC var40;
				if (var15.field559 == -1 && var15.field543 == null) {
					var40 = var15.method190(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new HVMNUAXR(var12, var11, var13, true, var10, 4, 0, arg1, var15.field559);
				}

				arg4.method338(var16, var14, 0, 512, var17, var40, arg3, arg8, 0, arg9, arg7);
			} else if (arg6 == 8) {
				BSABUCFC var41;
				if (var15.field559 == -1 && var15.field543 == null) {
					var41 = var15.method190(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new HVMNUAXR(var12, var11, var13, true, var10, 4, 0, arg1, var15.field559);
				}

				arg4.method338(var16, var14, 0, 768, var17, var41, arg3, arg8, 0, arg9, arg7);
			}
		}
	}

	@ObfuscatedName("YTWJKTVW.a(III[BIIILMCPCRICF;II[LFUVVWALN;)V")
	public final void method561(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, MCPCRICF arg6, int arg7, int arg8, FUVVWALN[] arg9) {
		WNCFPLWV var11 = new WNCFPLWV(arg3);
		int var12 = -1;
		while (true) {
			int var13 = var11.method516();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method516();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method502();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg7 == var18 && var17 >= arg2 && var17 < arg2 + 8 && var16 >= arg1 && var16 < arg1 + 8) {
					DZZSWICG var22 = DZZSWICG.method184(var12);
					int var23 = arg0 + YZFMUVTK.method582(var22.field561, var17 & 0x7, var16 & 0x7, arg4, var22.field580, var21);
					int var24 = arg8 + YZFMUVTK.method583(var17 & 0x7, var16 & 0x7, var22.field580, var22.field561, var21, arg4);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg5;
						if ((field1490[1][var23][var24] & 0x2) == 2) {
							var25 = arg5 - 1;
						}

						FUVVWALN var26 = null;
						if (var25 >= 0) {
							var26 = arg9[var25];
						}

						method578(var12, arg4 + var21 & 0x3, var26, var23, var20, arg6, arg5, var24);
					}
				}
			}
		}
	}

	@ObfuscatedName("YTWJKTVW.a(ZIIII)V")
	public final void method562(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg2; var5 <= arg1 + arg2; var5++) {
			for (int var6 = arg0; var6 <= arg0 + arg3; var6++) {
				if (var6 >= 0 && var6 < field1473 && var5 >= 0 && var5 < field1474) {
					field1479[0][var6][var5] = 127;

					if (arg0 == var6 && var6 > 0) {
						field1478[0][var6][var5] = field1478[0][var6 - 1][var5];
					}

					if (arg0 + arg3 == var6 && var6 < field1473 - 1) {
						field1478[0][var6][var5] = field1478[0][var6 + 1][var5];
					}

					if (arg2 == var5 && var5 > 0) {
						field1478[0][var6][var5] = field1478[0][var6][var5 - 1];
					}

					if (arg1 + arg2 == var5 && var5 < field1474 - 1) {
						field1478[0][var6][var5] = field1478[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("YTWJKTVW.a(II)I")
	public final int method563(int arg0, int arg1) {
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

	@ObfuscatedName("YTWJKTVW.b(II)I")
	public static final int method564(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("YTWJKTVW.a(ILWNCFPLWV;LHKGQPBYJ;)V")
	public static final void method565(WNCFPLWV arg0, HKGQPBYJ arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method516();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			DZZSWICG var4 = DZZSWICG.method184(var2);
			var4.method188(arg1);

			while (true) {
				int var5 = arg0.method516();
				if (var5 == 0) {
					break;
				}

				arg0.method502();
			}
		}
	}

	@ObfuscatedName("YTWJKTVW.a(IIII)V")
	public final void method566(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 8; var4++) {
			for (int var5 = 0; var5 < 8; var5++) {
				field1478[arg0][arg1 + var4][arg2 + var5] = 0;
			}
		}

		if (arg1 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				field1478[arg0][arg1][arg2 + var6] = field1478[arg0][arg1 - 1][arg2 + var6];
			}
		}

		if (arg2 > 0) {
			for (int var7 = 1; var7 < 8; var7++) {
				field1478[arg0][arg1 + var7][arg2] = field1478[arg0][arg1 + var7][arg2 - 1];
			}
		}

		if (arg1 > 0 && field1478[arg0][arg1 - 1][arg2] != 0) {
			field1478[arg0][arg1][arg2] = field1478[arg0][arg1 - 1][arg2];
		} else if (arg2 > 0 && field1478[arg0][arg1][arg2 - 1] != 0) {
			field1478[arg0][arg1][arg2] = field1478[arg0][arg1][arg2 - 1];
		} else if (arg1 > 0 && arg2 > 0 && field1478[arg0][arg1 - 1][arg2 - 1] != 0) {
			field1478[arg0][arg1][arg2] = field1478[arg0][arg1 - 1][arg2 - 1];
		}
	}

	@ObfuscatedName("YTWJKTVW.a(ILMCPCRICF;[LFUVVWALN;)V")
	public final void method567(MCPCRICF arg0, FUVVWALN[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field1490[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field1490[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method231(var4, var5);
						}
					}
				}
			}
		}

		field1476 += (int) (Math.random() * 5.0D) - 2;
		if (field1476 < -8) {
			field1476 = -8;
		}

		if (field1476 > 8) {
			field1476 = 8;
		}

		field1477 += (int) (Math.random() * 5.0D) - 2;
		if (field1477 < -16) {
			field1477 = -16;
		}

		if (field1477 > 16) {
			field1477 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field1479[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field1474 - 1; var16++) {
				for (int var17 = 1; var17 < field1473 - 1; var17++) {
					int var18 = field1478[var7][var17 + 1][var16] - field1478[var7][var17 - 1][var16];
					int var19 = field1478[var7][var17][var16 + 1] - field1478[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field1492[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field1474; var26++) {
				field1485[var26] = 0;
				field1486[var26] = 0;
				field1487[var26] = 0;
				field1488[var26] = 0;
				field1489[var26] = 0;
			}

			for (int var27 = -5; var27 < field1473 + 5; var27++) {
				for (int var28 = 0; var28 < field1474; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field1473) {
						int var30 = field1493[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							OMGTLVPK var31 = OMGTLVPK.field902[var30 - 1];
							field1485[var28] += var31.field911;
							field1486[var28] += var31.field909;
							field1487[var28] += var31.field910;
							field1488[var28] += var31.field912;
							field1489[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field1473) {
						int var33 = field1493[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							OMGTLVPK var34 = OMGTLVPK.field902[var33 - 1];
							field1485[var28] -= var34.field911;
							field1486[var28] -= var34.field909;
							field1487[var28] -= var34.field910;
							field1488[var28] -= var34.field912;
							field1489[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field1473 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field1474 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field1474) {
							var35 += field1485[var41];
							var36 += field1486[var41];
							var37 += field1487[var41];
							var38 += field1488[var41];
							var39 += field1489[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field1474) {
							var35 -= field1485[var42];
							var36 -= field1486[var42];
							var37 -= field1487[var42];
							var38 -= field1488[var42];
							var39 -= field1489[var42];
						}

						if (var40 >= 1 && var40 < field1474 - 1 && (!field1481 || (field1490[0][var27][var40] & 0x2) != 0 || (field1490[var7][var27][var40] & 0x10) == 0 && method559(var40, var27, var7) == field1482)) {
							if (var7 < field1472) {
								field1472 = var7;
							}

							int var43 = field1493[var7][var27][var40] & 0xFF;
							int var44 = field1491[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field1478[var7][var27][var40];
								int var46 = field1478[var7][var27 + 1][var40];
								int var47 = field1478[var7][var27 + 1][var40 + 1];
								int var48 = field1478[var7][var27][var40 + 1];
								int var49 = field1492[var27][var40];
								int var50 = field1492[var27 + 1][var40];
								int var51 = field1492[var27 + 1][var40 + 1];
								int var52 = field1492[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method577(var55, var56, var57);
									var55 = field1476 + var55 & 0xFF;
									var57 += field1477;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method577(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field1470[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !OMGTLVPK.field902[var44 - 1].field907) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field1484[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = EHATXTET.field613[method568(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method334(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method568(var53, var49), method568(var53, var50), method568(var53, var51), method568(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field1470[var7][var27][var40] + 1;
									byte var61 = field1480[var7][var27][var40];
									OMGTLVPK var62 = OMGTLVPK.field902[var44 - 1];
									int var63 = var62.field905;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = EHATXTET.method204(var63);
										var65 = -1;
									} else if (var62.field904 == 0xFF00FF) {
										var65 = -2;
										var63 = -1;
										var64 = EHATXTET.field613[method563(var62.field913, 96)];
									} else {
										var65 = method577(var62.field908, var62.field909, var62.field910);
										var64 = EHATXTET.field613[method563(var62.field913, 96)];
									}

									arg0.method334(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method568(var53, var49), method568(var53, var50), method568(var53, var51), method568(var53, var52), method563(var65, var49), method563(var65, var50), method563(var65, var51), method563(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field1474 - 1; var66++) {
				for (int var67 = 1; var67 < field1473 - 1; var67++) {
					arg0.method333(var7, var67, var66, method559(var66, var67, var7));
				}
			}
		}

		arg0.method360(-50, -10, -50);

		for (int var68 = 0; var68 < field1473; var68++) {
			for (int var69 = 0; var69 < field1474; var69++) {
				if ((field1490[1][var68][var69] & 0x2) == 2) {
					arg0.method331(var68, var69);
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
				for (int var75 = 0; var75 <= field1474; var75++) {
					for (int var76 = 0; var76 <= field1473; var76++) {
						if ((field1484[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field1484[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field1474 && (field1484[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field1484[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field1484[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field1478[var80][var76][var77] - var84;
								int var86 = field1478[var79][var76][var77];
								MCPCRICF.method332(1, var73, var76 * 128, var86, var78 * 128 + 128, var85, var77 * 128, var76 * 128);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field1484[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field1484[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field1484[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field1473 && (field1484[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field1484[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field1484[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field1478[var92][var89][var75] - var96;
								int var98 = field1478[var91][var89][var75];
								MCPCRICF.method332(2, var73, var90 * 128 + 128, var98, var75 * 128, var97, var75 * 128, var89 * 128);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field1484[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field1484[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field1484[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field1474 && (field1484[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field1484[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field1473) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field1484[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field1478[var74][var101][var103];
								MCPCRICF.method332(4, var73, var102 * 128 + 128, var107, var104 * 128 + 128, var107, var103 * 128, var101 * 128);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field1484[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("YTWJKTVW.c(II)I")
	public static final int method568(int arg0, int arg1) {
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

	@ObfuscatedName("YTWJKTVW.d(II)I")
	public static final int method569(int arg0, int arg1) {
		int var2 = method558(arg0 + 45365, arg1 + 91923, 4) + (method558(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method558(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("YTWJKTVW.a([LFUVVWALN;[BBIILMCPCRICF;)V")
	public final void method570(FUVVWALN[] arg0, byte[] arg1, int arg2, int arg3, MCPCRICF arg4) {
		WNCFPLWV var6 = new WNCFPLWV(arg1);
		int var7 = -1;
		while (true) {
			int var8 = var6.method516();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method516();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method502();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg2 + var12;
				int var18 = arg3 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field1490[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					FUVVWALN var20 = null;
					if (var19 >= 0) {
						var20 = arg0[var19];
					}

					method578(var7, var16, var20, var17, var15, arg4, var13, var18);
				}
			}
		}
	}

	@ObfuscatedName("YTWJKTVW.a(I[BII)Z")
	public static final boolean method571(int arg0, byte[] arg1, int arg2) {
		boolean var3 = true;
		WNCFPLWV var4 = new WNCFPLWV(arg1);
		int var5 = -1;
		while (true) {
			int var6 = var4.method516();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method516();
					if (var9 == 0) {
						break;
					}

					var4.method502();
				} else {
					int var10 = var4.method516();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method502() >> 2;
					int var14 = arg0 + var12;
					int var15 = arg2 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						DZZSWICG var16 = DZZSWICG.method184(var5);
						if (var13 != 22 || !field1481 || var16.field569 || var16.field577) {
							var3 &= var16.method186();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("YTWJKTVW.a(IIILWNCFPLWV;IBII)V")
	public final void method572(int arg0, int arg1, int arg2, WNCFPLWV arg3, int arg4, int arg5, int arg6) {
		if (arg4 >= 0 && arg4 < 104 && arg2 >= 0 && arg2 < 104) {
			field1490[arg6][arg4][arg2] = 0;
			while (true) {
				int var8 = arg3.method502();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg3.method502();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg6 == 0) {
						field1478[0][arg4][arg2] = -var9 * 8;
						return;
					}

					field1478[arg6][arg4][arg2] = field1478[arg6 - 1][arg4][arg2] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field1491[arg6][arg4][arg2] = arg3.method503();
					field1470[arg6][arg4][arg2] = (byte) ((var8 - 2) / 4);
					field1480[arg6][arg4][arg2] = (byte) (var8 + arg1 - 2 & 0x3);
				} else if (var8 <= 81) {
					field1490[arg6][arg4][arg2] = (byte) (var8 - 49);
				} else {
					field1493[arg6][arg4][arg2] = (byte) (var8 - 81);
				}
			}

			if (arg6 == 0) {
				field1478[0][arg4][arg2] = -method569(arg4 + arg5 + 932731, arg2 + 556238 + arg0) * 8;
			} else {
				field1478[arg6][arg4][arg2] = field1478[arg6 - 1][arg4][arg2] - 240;
			}
		} else {
			while (true) {
				int var10 = arg3.method502();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg3.method502();
					return;
				}

				if (var10 <= 49) {
					arg3.method502();
				}
			}
		}
	}

	@ObfuscatedName("YTWJKTVW.e(II)I")
	public static final int method573(int arg0, int arg1) {
		int var2 = method564(arg0 - 1, arg1 - 1) + method564(arg0 + 1, arg1 - 1) + method564(arg0 - 1, arg1 + 1) + method564(arg0 + 1, arg1 + 1);
		int var3 = method564(arg0 - 1, arg1) + method564(arg0 + 1, arg1) + method564(arg0, arg1 - 1) + method564(arg0, arg1 + 1);
		int var4 = method564(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	public YTWJKTVW(int arg0, int[][][] arg1, int arg2, byte[][][] arg3) {
		field1472 = 99;
		field1473 = arg0;
		field1474 = arg2;
		field1478 = arg1;
		field1490 = arg3;
		field1493 = new byte[4][field1473][field1474];
		field1491 = new byte[4][field1473][field1474];
		field1470 = new byte[4][field1473][field1474];
		field1480 = new byte[4][field1473][field1474];
		field1484 = new int[4][field1473 + 1][field1474 + 1];
		field1479 = new byte[4][field1473 + 1][field1474 + 1];
		field1492 = new int[field1473 + 1][field1474 + 1];
		field1485 = new int[field1474];
		field1486 = new int[field1474];
		field1487 = new int[field1474];
		field1488 = new int[field1474];
		field1489 = new int[field1474];
	}

	@ObfuscatedName("YTWJKTVW.a(IBI[BII[LFUVVWALN;)V")
	public final void method574(int arg0, int arg1, byte[] arg2, int arg3, int arg4, FUVVWALN[] arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg4 + var8 > 0 && arg4 + var8 < 103 && arg0 + var9 > 0 && arg0 + var9 < 103) {
						arg5[var7].field667[arg4 + var8][arg0 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		WNCFPLWV var10 = new WNCFPLWV(arg2);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method572(arg3, 0, arg0 + var13, var10, arg4 + var12, arg1, var11);
				}
			}
		}
	}

	@ObfuscatedName("YTWJKTVW.b(III)Z")
	public static final boolean method575(int arg0, int arg1) {
		DZZSWICG var2 = DZZSWICG.method184(arg0);

		if (arg1 == 11) {
			arg1 = 10;
		}

		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}

		return var2.method185(arg1);
	}

	@ObfuscatedName("YTWJKTVW.a(ZIII[BI[LFUVVWALN;III)V")
	public final void method576(int arg0, int arg1, int arg2, byte[] arg3, int arg4, FUVVWALN[] arg5, int arg6, int arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg6 + var10 > 0 && arg6 + var10 < 103 && arg2 + var11 > 0 && arg2 + var11 < 103) {
					arg5[arg1].field667[arg6 + var10][arg2 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		WNCFPLWV var12 = new WNCFPLWV(arg3);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg8 == var13 && var14 >= arg4 && var14 < arg4 + 8 && var15 >= arg0 && var15 < arg0 + 8) {
						method572(0, arg7, arg2 + YZFMUVTK.method581(arg7, var15 & 0x7, var14 & 0x7), var12, arg6 + YZFMUVTK.method580(var15 & 0x7, var14 & 0x7, arg7), 0, arg1);
					} else {
						method572(0, 0, -1, var12, -1, 0, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("YTWJKTVW.c(III)I")
	public final int method577(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("YTWJKTVW.a(IILFUVVWALN;IIILMCPCRICF;II)V")
	public final void method578(int arg0, int arg1, FUVVWALN arg2, int arg3, int arg4, MCPCRICF arg5, int arg6, int arg7) {
		if (field1481 && (field1490[0][arg3][arg7] & 0x2) == 0) {
			if ((field1490[arg6][arg3][arg7] & 0x10) != 0) {
				return;
			}

			if (method559(arg7, arg3, arg6) != field1482) {
				return;
			}
		}

		if (arg6 < field1472) {
			field1472 = arg6;
		}

		int var9 = field1478[arg6][arg3][arg7];
		int var10 = field1478[arg6][arg3 + 1][arg7];
		int var11 = field1478[arg6][arg3 + 1][arg7 + 1];
		int var12 = field1478[arg6][arg3][arg7 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		DZZSWICG var14 = DZZSWICG.method184(arg0);
		int var15 = (arg0 << 14) + (arg7 << 7) + arg3 + 0x40000000;
		if (!var14.field569) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg1 << 6) + arg4);
		if (arg4 == 22) {
			if (!field1481 || var14.field569 || var14.field577) {
				BSABUCFC var17;
				if (var14.field559 == -1 && var14.field543 == null) {
					var17 = var14.method190(22, arg1, var9, var10, var11, var12, -1);
				} else {
					var17 = new HVMNUAXR(var11, var10, var12, true, var9, 22, arg1, arg0, var14.field559);
				}

				arg5.method335(arg6, var15, arg3, var16, arg7, var17, var13);

				if (var14.field555 && var14.field569 && arg2 != null) {
					arg2.method231(arg3, arg7);
				}
			}
		} else if (arg4 == 10 || arg4 == 11) {
			BSABUCFC var18;
			if (var14.field559 == -1 && var14.field543 == null) {
				var18 = var14.method190(10, arg1, var9, var10, var11, var12, -1);
			} else {
				var18 = new HVMNUAXR(var11, var10, var12, true, var9, 10, arg1, arg0, var14.field559);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg4 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg1 == 1 || arg1 == 3) {
					var20 = var14.field580;
					var21 = var14.field561;
				} else {
					var20 = var14.field561;
					var21 = var14.field580;
				}

				if (arg5.method339(arg7, arg6, var21, var15, var13, arg3, var16, var20, var18, var19) && var14.field583) {
					UNLYQRUD var22;
					if (var18 instanceof UNLYQRUD) {
						var22 = (UNLYQRUD) var18;
					} else {
						var22 = var14.method190(10, arg1, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field1291 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field1479[arg6][arg3 + var23][arg7 + var24]) {
									field1479[arg6][arg3 + var23][arg7 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field555 && arg2 != null) {
				arg2.method230(var14.field580, arg1, arg3, var14.field579, var14.field561, arg7);
			}
		} else if (arg4 >= 12) {
			BSABUCFC var26;
			if (var14.field559 == -1 && var14.field543 == null) {
				var26 = var14.method190(arg4, arg1, var9, var10, var11, var12, -1);
			} else {
				var26 = new HVMNUAXR(var11, var10, var12, true, var9, arg4, arg1, arg0, var14.field559);
			}

			arg5.method339(arg7, arg6, 1, var15, var13, arg3, var16, 1, var26, 0);

			if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg6 > 0) {
				field1484[arg6][arg3][arg7] |= 0x924;
			}

			if (var14.field555 && arg2 != null) {
				arg2.method230(var14.field580, arg1, arg3, var14.field579, var14.field561, arg7);
			}
		} else if (arg4 == 0) {
			BSABUCFC var27;
			if (var14.field559 == -1 && var14.field543 == null) {
				var27 = var14.method190(0, arg1, var9, var10, var11, var12, -1);
			} else {
				var27 = new HVMNUAXR(var11, var10, var12, true, var9, 0, arg1, arg0, var14.field559);
			}

			arg5.method337(0, arg7, var16, field1483[arg1], null, arg3, arg6, var15, var13, var27);

			if (arg1 == 0) {
				if (var14.field583) {
					field1479[arg6][arg3][arg7] = 50;
					field1479[arg6][arg3][arg7 + 1] = 50;
				}

				if (var14.field589) {
					field1484[arg6][arg3][arg7] |= 0x249;
				}
			} else if (arg1 == 1) {
				if (var14.field583) {
					field1479[arg6][arg3][arg7 + 1] = 50;
					field1479[arg6][arg3 + 1][arg7 + 1] = 50;
				}

				if (var14.field589) {
					field1484[arg6][arg3][arg7 + 1] |= 0x492;
				}
			} else if (arg1 == 2) {
				if (var14.field583) {
					field1479[arg6][arg3 + 1][arg7] = 50;
					field1479[arg6][arg3 + 1][arg7 + 1] = 50;
				}

				if (var14.field589) {
					field1484[arg6][arg3 + 1][arg7] |= 0x249;
				}
			} else if (arg1 == 3) {
				if (var14.field583) {
					field1479[arg6][arg3][arg7] = 50;
					field1479[arg6][arg3 + 1][arg7] = 50;
				}

				if (var14.field589) {
					field1484[arg6][arg3][arg7] |= 0x492;
				}
			}

			if (var14.field555 && arg2 != null) {
				arg2.method229(arg4, var14.field579, arg1, arg3, arg7);
			}

			if (var14.field565 != 16) {
				arg5.method345(arg6, var14.field565, arg3, arg7);
			}
		} else if (arg4 == 1) {
			BSABUCFC var28;
			if (var14.field559 == -1 && var14.field543 == null) {
				var28 = var14.method190(1, arg1, var9, var10, var11, var12, -1);
			} else {
				var28 = new HVMNUAXR(var11, var10, var12, true, var9, 1, arg1, arg0, var14.field559);
			}

			arg5.method337(0, arg7, var16, field1471[arg1], null, arg3, arg6, var15, var13, var28);

			if (var14.field583) {
				if (arg1 == 0) {
					field1479[arg6][arg3][arg7 + 1] = 50;
				} else if (arg1 == 1) {
					field1479[arg6][arg3 + 1][arg7 + 1] = 50;
				} else if (arg1 == 2) {
					field1479[arg6][arg3 + 1][arg7] = 50;
				} else if (arg1 == 3) {
					field1479[arg6][arg3][arg7] = 50;
				}
			}

			if (var14.field555 && arg2 != null) {
				arg2.method229(arg4, var14.field579, arg1, arg3, arg7);
			}
		} else if (arg4 == 2) {
			int var29 = arg1 + 1 & 0x3;
			BSABUCFC var30;
			BSABUCFC var31;
			if (var14.field559 == -1 && var14.field543 == null) {
				var30 = var14.method190(2, arg1 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method190(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new HVMNUAXR(var11, var10, var12, true, var9, 2, arg1 + 4, arg0, var14.field559);
				var31 = new HVMNUAXR(var11, var10, var12, true, var9, 2, var29, arg0, var14.field559);
			}

			arg5.method337(field1483[var29], arg7, var16, field1483[arg1], var31, arg3, arg6, var15, var13, var30);

			if (var14.field589) {
				if (arg1 == 0) {
					field1484[arg6][arg3][arg7] |= 0x249;
					field1484[arg6][arg3][arg7 + 1] |= 0x492;
				} else if (arg1 == 1) {
					field1484[arg6][arg3][arg7 + 1] |= 0x492;
					field1484[arg6][arg3 + 1][arg7] |= 0x249;
				} else if (arg1 == 2) {
					field1484[arg6][arg3 + 1][arg7] |= 0x249;
					field1484[arg6][arg3][arg7] |= 0x492;
				} else if (arg1 == 3) {
					field1484[arg6][arg3][arg7] |= 0x492;
					field1484[arg6][arg3][arg7] |= 0x249;
				}
			}

			if (var14.field555 && arg2 != null) {
				arg2.method229(arg4, var14.field579, arg1, arg3, arg7);
			}

			if (var14.field565 != 16) {
				arg5.method345(arg6, var14.field565, arg3, arg7);
			}
		} else if (arg4 == 3) {
			BSABUCFC var32;
			if (var14.field559 == -1 && var14.field543 == null) {
				var32 = var14.method190(3, arg1, var9, var10, var11, var12, -1);
			} else {
				var32 = new HVMNUAXR(var11, var10, var12, true, var9, 3, arg1, arg0, var14.field559);
			}

			arg5.method337(0, arg7, var16, field1471[arg1], null, arg3, arg6, var15, var13, var32);

			if (var14.field583) {
				if (arg1 == 0) {
					field1479[arg6][arg3][arg7 + 1] = 50;
				} else if (arg1 == 1) {
					field1479[arg6][arg3 + 1][arg7 + 1] = 50;
				} else if (arg1 == 2) {
					field1479[arg6][arg3 + 1][arg7] = 50;
				} else if (arg1 == 3) {
					field1479[arg6][arg3][arg7] = 50;
				}
			}

			if (var14.field555 && arg2 != null) {
				arg2.method229(arg4, var14.field579, arg1, arg3, arg7);
			}
		} else if (arg4 == 9) {
			BSABUCFC var33;
			if (var14.field559 == -1 && var14.field543 == null) {
				var33 = var14.method190(arg4, arg1, var9, var10, var11, var12, -1);
			} else {
				var33 = new HVMNUAXR(var11, var10, var12, true, var9, arg4, arg1, arg0, var14.field559);
			}

			arg5.method339(arg7, arg6, 1, var15, var13, arg3, var16, 1, var33, 0);

			if (var14.field555 && arg2 != null) {
				arg2.method230(var14.field580, arg1, arg3, var14.field579, var14.field561, arg7);
			}
		} else {
			if (var14.field551) {
				if (arg1 == 1) {
					int var34 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var9;
					var9 = var34;
				} else if (arg1 == 2) {
					int var35 = var12;
					var12 = var10;
					var10 = var35;
					int var36 = var11;
					var11 = var9;
					var9 = var36;
				} else if (arg1 == 3) {
					int var37 = var12;
					var12 = var9;
					var9 = var10;
					var10 = var11;
					var11 = var37;
				}
			}

			if (arg4 == 4) {
				BSABUCFC var38;
				if (var14.field559 == -1 && var14.field543 == null) {
					var38 = var14.method190(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new HVMNUAXR(var11, var10, var12, true, var9, 4, 0, arg0, var14.field559);
				}

				arg5.method338(var15, var13, 0, field1483[arg1], var16, var38, arg7, arg1 * 512, 0, arg3, arg6);
			} else if (arg4 == 5) {
				int var39 = 16;
				int var40 = arg5.method355(arg6, arg3, arg7);
				if (var40 > 0) {
					var39 = DZZSWICG.method184(var40 >> 14 & 0x7FFF).field565;
				}

				BSABUCFC var41;
				if (var14.field559 == -1 && var14.field543 == null) {
					var41 = var14.method190(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new HVMNUAXR(var11, var10, var12, true, var9, 4, 0, arg0, var14.field559);
				}

				arg5.method338(var15, var13, field1475[arg1] * var39, field1483[arg1], var16, var41, arg7, arg1 * 512, field1469[arg1] * var39, arg3, arg6);
			} else if (arg4 == 6) {
				BSABUCFC var42;
				if (var14.field559 == -1 && var14.field543 == null) {
					var42 = var14.method190(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new HVMNUAXR(var11, var10, var12, true, var9, 4, 0, arg0, var14.field559);
				}

				arg5.method338(var15, var13, 0, 256, var16, var42, arg7, arg1, 0, arg3, arg6);
			} else if (arg4 == 7) {
				BSABUCFC var43;
				if (var14.field559 == -1 && var14.field543 == null) {
					var43 = var14.method190(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new HVMNUAXR(var11, var10, var12, true, var9, 4, 0, arg0, var14.field559);
				}

				arg5.method338(var15, var13, 0, 512, var16, var43, arg7, arg1, 0, arg3, arg6);
			} else if (arg4 == 8) {
				BSABUCFC var44;
				if (var14.field559 == -1 && var14.field543 == null) {
					var44 = var14.method190(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new HVMNUAXR(var11, var10, var12, true, var9, 4, 0, arg0, var14.field559);
				}

				arg5.method338(var15, var13, 0, 768, var16, var44, arg7, arg1, 0, arg3, arg6);
			}
		}
	}

	@ObfuscatedName("YTWJKTVW.b(IIII)I")
	public static final int method579(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - EHATXTET.field602[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}
}
