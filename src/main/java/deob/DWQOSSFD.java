package deob;

@ObfuscatedName("DWQOSSFD")
public final class DWQOSSFD {

	@ObfuscatedName("DWQOSSFD.g")
	public int field526;

	@ObfuscatedName("DWQOSSFD.h")
	public int field527;

	@ObfuscatedName("DWQOSSFD.H")
	public int[][][] field548;

	@ObfuscatedName("DWQOSSFD.k")
	public byte[][][] field530;

	@ObfuscatedName("DWQOSSFD.q")
	public byte[][][] field533;

	@ObfuscatedName("DWQOSSFD.b")
	public byte[][][] field524;

	@ObfuscatedName("DWQOSSFD.p")
	public byte[][][] field532;

	@ObfuscatedName("DWQOSSFD.D")
	public byte[][][] field544;

	@ObfuscatedName("DWQOSSFD.x")
	public int[][][] field539;

	@ObfuscatedName("DWQOSSFD.m")
	public byte[][][] field531;

	@ObfuscatedName("DWQOSSFD.C")
	public int[][] field543;

	@ObfuscatedName("DWQOSSFD.s")
	public int[] field534;

	@ObfuscatedName("DWQOSSFD.t")
	public int[] field535;

	@ObfuscatedName("DWQOSSFD.u")
	public int[] field536;

	@ObfuscatedName("DWQOSSFD.v")
	public int[] field537;

	@ObfuscatedName("DWQOSSFD.w")
	public int[] field538;

	@ObfuscatedName("DWQOSSFD.f")
	public static int field525 = 99;

	@ObfuscatedName("DWQOSSFD.i")
	public static final int[] field528 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("DWQOSSFD.j")
	public static final int[] field529 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("DWQOSSFD.y")
	public static final int[] field540 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("DWQOSSFD.z")
	public static final int[] field541 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("DWQOSSFD.E")
	public static boolean field545 = true;

	@ObfuscatedName("DWQOSSFD.F")
	public static int field546 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("DWQOSSFD.G")
	public static int field547 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("DWQOSSFD.B")
	public static int field542;

	@ObfuscatedName("DWQOSSFD.a(II)I")
	public static final int method188(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("DWQOSSFD.a(IIII)I")
	public static final int method189(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - OIDJTTQC.field1059[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("DWQOSSFD.a(III[BIZII[LYMCKWFGH;LGLVCMXFQ;I)V")
	public final void method190(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, YMCKWFGH[] arg7, GLVCMXFQ arg8, int arg9) {
		XOUQUKZW var11 = new XOUQUKZW(arg3);
		int var12 = -1;
		while (true) {
			int var13 = var11.method535();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method535();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method521();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg6 == var18 && var17 >= arg5 && var17 < arg5 + 8 && var16 >= arg2 && var16 < arg2 + 8) {
					SCWSBSIM var22 = SCWSBSIM.method464(var12);
					int var23 = arg0 + HSOVOELH.method314(var22.field1283, var22.field1249, arg1, var17 & 0x7, var16 & 0x7);
					int var24 = arg9 + HSOVOELH.method315(var16 & 0x7, arg1, var22.field1249, var17 & 0x7, var22.field1283);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = var18;
						if ((field530[1][var23][var24] & 0x2) == 2) {
							var25 = var18 - 1;
						}

						YMCKWFGH var26 = null;
						if (var25 >= 0) {
							var26 = arg7[var25];
						}

						method199(var18, var26, var24, arg1 + var21 & 0x3, var12, arg8, var23, var20);
					}
				}
			}
		}
	}

	@ObfuscatedName("DWQOSSFD.a([BIII)Z")
	public static final boolean method191(byte[] arg0, int arg1, int arg2) {
		boolean var3 = true;
		XOUQUKZW var4 = new XOUQUKZW(arg0);
		int var5 = -1;
		while (true) {
			int var6 = var4.method535();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method535();
					if (var9 == 0) {
						break;
					}

					var4.method521();
				} else {
					int var10 = var4.method535();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method521() >> 2;
					int var14 = arg2 + var12;
					int var15 = arg1 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						SCWSBSIM var16 = SCWSBSIM.method464(var5);
						if (var13 != 22 || !field545 || var16.field1252 || var16.field1292) {
							var3 &= var16.method460();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("DWQOSSFD.a(III)I")
	public final int method192(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("DWQOSSFD.b(II)I")
	public static final int method193(int arg0, int arg1) {
		int var2 = method206(arg0 + 45365, arg1 + 91923, 4) + (method206(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method206(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("DWQOSSFD.a(IIBII)V")
	public final void method194(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
			for (int var6 = arg3; var6 <= arg1 + arg3; var6++) {
				if (var6 >= 0 && var6 < field526 && var5 >= 0 && var5 < field527) {
					field531[0][var6][var5] = 127;

					if (arg3 == var6 && var6 > 0) {
						field548[0][var6][var5] = field548[0][var6 - 1][var5];
					}

					if (arg1 + arg3 == var6 && var6 < field526 - 1) {
						field548[0][var6][var5] = field548[0][var6 + 1][var5];
					}

					if (arg0 == var5 && var5 > 0) {
						field548[0][var6][var5] = field548[0][var6][var5 - 1];
					}

					if (arg0 + arg2 == var5 && var5 < field527 - 1) {
						field548[0][var6][var5] = field548[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("DWQOSSFD.a(LTXSWXFHQ;ILXOUQUKZW;)V")
	public static final void method195(TXSWXFHQ arg0, XOUQUKZW arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg1.method535();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			SCWSBSIM var4 = SCWSBSIM.method464(var2);
			var4.method469(arg0);

			while (true) {
				int var5 = arg1.method535();
				if (var5 == 0) {
					break;
				}

				arg1.method521();
			}
		}
	}

	@ObfuscatedName("DWQOSSFD.c(II)I")
	public static final int method196(int arg0, int arg1) {
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

	@ObfuscatedName("DWQOSSFD.a(ILGLVCMXFQ;LYMCKWFGH;[[[IIIIIIII)V")
	public static final void method197(int arg0, GLVCMXFQ arg1, YMCKWFGH arg2, int[][][] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		int var10 = arg3[arg9][arg7][arg0];
		int var11 = arg3[arg9][arg7 + 1][arg0];
		int var12 = arg3[arg9][arg7 + 1][arg0 + 1];
		int var13 = arg3[arg9][arg7][arg0 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		SCWSBSIM var15 = SCWSBSIM.method464(arg6);
		int var16 = (arg6 << 14) + (arg0 << 7) + arg7 + 0x40000000;
		if (!var15.field1252) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg4 << 6) + arg8);
		if (arg8 == 22) {
			XPEMEMUL var18;
			if (var15.field1246 == -1 && var15.field1266 == null) {
				var18 = var15.method470(22, arg4, var10, var11, var12, var13, -1);
			} else {
				var18 = new LOFYMKZK(arg4, arg6, 22, var15.field1246, var11, var10, true, var13, var12);
			}

			arg1.method239(var14, arg0, var17, arg7, arg5, var18, var16);

			if (var15.field1274 && var15.field1252) {
				arg2.method572(arg7, arg0);
			}
		} else if (arg8 == 10 || arg8 == 11) {
			XPEMEMUL var19;
			if (var15.field1246 == -1 && var15.field1266 == null) {
				var19 = var15.method470(10, arg4, var10, var11, var12, var13, -1);
			} else {
				var19 = new LOFYMKZK(arg4, arg6, 10, var15.field1246, var11, var10, true, var13, var12);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg8 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg4 == 1 || arg4 == 3) {
					var21 = var15.field1283;
					var22 = var15.field1249;
				} else {
					var21 = var15.field1249;
					var22 = var15.field1283;
				}

				arg1.method243(var14, var19, arg0, var21, arg7, var17, var16, arg5, var20, var22);
			}

			if (var15.field1274) {
				arg2.method571(var15.field1272, var15.field1249, arg0, arg4, arg7, var15.field1283);
			}
		} else if (arg8 >= 12) {
			XPEMEMUL var23;
			if (var15.field1246 == -1 && var15.field1266 == null) {
				var23 = var15.method470(arg8, arg4, var10, var11, var12, var13, -1);
			} else {
				var23 = new LOFYMKZK(arg4, arg6, arg8, var15.field1246, var11, var10, true, var13, var12);
			}

			arg1.method243(var14, var23, arg0, 1, arg7, var17, var16, arg5, 0, 1);

			if (var15.field1274) {
				arg2.method571(var15.field1272, var15.field1249, arg0, arg4, arg7, var15.field1283);
			}
		} else if (arg8 == 0) {
			XPEMEMUL var24;
			if (var15.field1246 == -1 && var15.field1266 == null) {
				var24 = var15.method470(0, arg4, var10, var11, var12, var13, -1);
			} else {
				var24 = new LOFYMKZK(arg4, arg6, 0, var15.field1246, var11, var10, true, var13, var12);
			}

			arg1.method241(field528[arg4], var24, 0, var14, arg5, var17, var16, null, arg0, arg7);

			if (var15.field1274) {
				arg2.method570(arg0, arg8, var15.field1272, arg7, arg4);
			}
		} else if (arg8 == 1) {
			XPEMEMUL var25;
			if (var15.field1246 == -1 && var15.field1266 == null) {
				var25 = var15.method470(1, arg4, var10, var11, var12, var13, -1);
			} else {
				var25 = new LOFYMKZK(arg4, arg6, 1, var15.field1246, var11, var10, true, var13, var12);
			}

			arg1.method241(field541[arg4], var25, 0, var14, arg5, var17, var16, null, arg0, arg7);

			if (var15.field1274) {
				arg2.method570(arg0, arg8, var15.field1272, arg7, arg4);
			}
		} else if (arg8 == 2) {
			int var26 = arg4 + 1 & 0x3;
			XPEMEMUL var27;
			XPEMEMUL var28;
			if (var15.field1246 == -1 && var15.field1266 == null) {
				var27 = var15.method470(2, arg4 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method470(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new LOFYMKZK(arg4 + 4, arg6, 2, var15.field1246, var11, var10, true, var13, var12);
				var28 = new LOFYMKZK(var26, arg6, 2, var15.field1246, var11, var10, true, var13, var12);
			}

			arg1.method241(field528[arg4], var27, field528[var26], var14, arg5, var17, var16, var28, arg0, arg7);

			if (var15.field1274) {
				arg2.method570(arg0, arg8, var15.field1272, arg7, arg4);
			}
		} else if (arg8 == 3) {
			XPEMEMUL var29;
			if (var15.field1246 == -1 && var15.field1266 == null) {
				var29 = var15.method470(3, arg4, var10, var11, var12, var13, -1);
			} else {
				var29 = new LOFYMKZK(arg4, arg6, 3, var15.field1246, var11, var10, true, var13, var12);
			}

			arg1.method241(field541[arg4], var29, 0, var14, arg5, var17, var16, null, arg0, arg7);

			if (var15.field1274) {
				arg2.method570(arg0, arg8, var15.field1272, arg7, arg4);
			}
		} else if (arg8 == 9) {
			XPEMEMUL var30;
			if (var15.field1246 == -1 && var15.field1266 == null) {
				var30 = var15.method470(arg8, arg4, var10, var11, var12, var13, -1);
			} else {
				var30 = new LOFYMKZK(arg4, arg6, arg8, var15.field1246, var11, var10, true, var13, var12);
			}

			arg1.method243(var14, var30, arg0, 1, arg7, var17, var16, arg5, 0, 1);

			if (var15.field1274) {
				arg2.method571(var15.field1272, var15.field1249, arg0, arg4, arg7, var15.field1283);
			}
		} else {
			if (var15.field1263) {
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

			if (arg8 == 4) {
				XPEMEMUL var35;
				if (var15.field1246 == -1 && var15.field1266 == null) {
					var35 = var15.method470(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new LOFYMKZK(0, arg6, 4, var15.field1246, var11, var10, true, var13, var12);
				}

				arg1.method242(var35, arg4 * 512, var14, var16, arg7, arg5, field528[arg4], 0, var17, 0, arg0);
			} else if (arg8 == 5) {
				int var36 = 16;
				int var37 = arg1.method259(arg5, arg7, arg0);
				if (var37 > 0) {
					var36 = SCWSBSIM.method464(var37 >> 14 & 0x7FFF).field1255;
				}

				XPEMEMUL var38;
				if (var15.field1246 == -1 && var15.field1266 == null) {
					var38 = var15.method470(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new LOFYMKZK(0, arg6, 4, var15.field1246, var11, var10, true, var13, var12);
				}

				arg1.method242(var38, arg4 * 512, var14, var16, arg7, arg5, field528[arg4], field529[arg4] * var36, var17, field540[arg4] * var36, arg0);
			} else if (arg8 == 6) {
				XPEMEMUL var39;
				if (var15.field1246 == -1 && var15.field1266 == null) {
					var39 = var15.method470(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new LOFYMKZK(0, arg6, 4, var15.field1246, var11, var10, true, var13, var12);
				}

				arg1.method242(var39, arg4, var14, var16, arg7, arg5, 256, 0, var17, 0, arg0);
			} else if (arg8 == 7) {
				XPEMEMUL var40;
				if (var15.field1246 == -1 && var15.field1266 == null) {
					var40 = var15.method470(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new LOFYMKZK(0, arg6, 4, var15.field1246, var11, var10, true, var13, var12);
				}

				arg1.method242(var40, arg4, var14, var16, arg7, arg5, 512, 0, var17, 0, arg0);
			} else if (arg8 == 8) {
				XPEMEMUL var41;
				if (var15.field1246 == -1 && var15.field1266 == null) {
					var41 = var15.method470(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new LOFYMKZK(0, arg6, 4, var15.field1246, var11, var10, true, var13, var12);
				}

				arg1.method242(var41, arg4, var14, var16, arg7, arg5, 768, 0, var17, 0, arg0);
			}
		}
	}

	@ObfuscatedName("DWQOSSFD.a(LXOUQUKZW;IIZIIII)V")
	public final void method198(XOUQUKZW arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1 >= 0 && arg1 < 104 && arg4 >= 0 && arg4 < 104) {
			field530[arg2][arg1][arg4] = 0;
			while (true) {
				int var8 = arg0.method521();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg0.method521();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg2 == 0) {
						field548[0][arg1][arg4] = -var9 * 8;
						return;
					}

					field548[arg2][arg1][arg4] = field548[arg2 - 1][arg1][arg4] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field524[arg2][arg1][arg4] = arg0.method522();
					field532[arg2][arg1][arg4] = (byte) ((var8 - 2) / 4);
					field544[arg2][arg1][arg4] = (byte) (var8 + arg5 - 2 & 0x3);
				} else if (var8 <= 81) {
					field530[arg2][arg1][arg4] = (byte) (var8 - 49);
				} else {
					field533[arg2][arg1][arg4] = (byte) (var8 - 81);
				}
			}

			if (arg2 == 0) {
				field548[0][arg1][arg4] = -method193(arg1 + arg3 + 932731, arg4 + 556238 + arg6) * 8;
			} else {
				field548[arg2][arg1][arg4] = field548[arg2 - 1][arg1][arg4] - 240;
			}
		} else {
			while (true) {
				int var10 = arg0.method521();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg0.method521();
					return;
				}

				if (var10 <= 49) {
					arg0.method521();
				}
			}
		}
	}

	@ObfuscatedName("DWQOSSFD.a(ILYMCKWFGH;IIIILGLVCMXFQ;II)V")
	public final void method199(int arg0, YMCKWFGH arg1, int arg2, int arg3, int arg4, GLVCMXFQ arg5, int arg6, int arg7) {
		if (field545 && (field530[0][arg6][arg2] & 0x2) == 0) {
			if ((field530[arg0][arg6][arg2] & 0x10) != 0) {
				return;
			}

			if (method208(arg0, arg2, arg6) != field542) {
				return;
			}
		}

		if (arg0 < field525) {
			field525 = arg0;
		}

		int var9 = field548[arg0][arg6][arg2];
		int var10 = field548[arg0][arg6 + 1][arg2];
		int var11 = field548[arg0][arg6 + 1][arg2 + 1];
		int var12 = field548[arg0][arg6][arg2 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		SCWSBSIM var14 = SCWSBSIM.method464(arg4);
		int var15 = (arg4 << 14) + (arg2 << 7) + arg6 + 0x40000000;
		if (!var14.field1252) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg3 << 6) + arg7);
		if (arg7 == 22) {
			if (!field545 || var14.field1252 || var14.field1292) {
				XPEMEMUL var17;
				if (var14.field1246 == -1 && var14.field1266 == null) {
					var17 = var14.method470(22, arg3, var9, var10, var11, var12, -1);
				} else {
					var17 = new LOFYMKZK(arg3, arg4, 22, var14.field1246, var10, var9, true, var12, var11);
				}

				arg5.method239(var13, arg2, var16, arg6, arg0, var17, var15);

				if (var14.field1274 && var14.field1252 && arg1 != null) {
					arg1.method572(arg6, arg2);
				}
			}
		} else if (arg7 == 10 || arg7 == 11) {
			XPEMEMUL var18;
			if (var14.field1246 == -1 && var14.field1266 == null) {
				var18 = var14.method470(10, arg3, var9, var10, var11, var12, -1);
			} else {
				var18 = new LOFYMKZK(arg3, arg4, 10, var14.field1246, var10, var9, true, var12, var11);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg7 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg3 == 1 || arg3 == 3) {
					var20 = var14.field1283;
					var21 = var14.field1249;
				} else {
					var20 = var14.field1249;
					var21 = var14.field1283;
				}

				if (arg5.method243(var13, var18, arg2, var20, arg6, var16, var15, arg0, var19, var21) && var14.field1291) {
					KPUOCBCE var22;
					if (var18 instanceof KPUOCBCE) {
						var22 = (KPUOCBCE) var18;
					} else {
						var22 = var14.method470(10, arg3, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field881 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field531[arg0][arg6 + var23][arg2 + var24]) {
									field531[arg0][arg6 + var23][arg2 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field1274 && arg1 != null) {
				arg1.method571(var14.field1272, var14.field1249, arg2, arg3, arg6, var14.field1283);
			}
		} else if (arg7 >= 12) {
			XPEMEMUL var26;
			if (var14.field1246 == -1 && var14.field1266 == null) {
				var26 = var14.method470(arg7, arg3, var9, var10, var11, var12, -1);
			} else {
				var26 = new LOFYMKZK(arg3, arg4, arg7, var14.field1246, var10, var9, true, var12, var11);
			}

			arg5.method243(var13, var26, arg2, 1, arg6, var16, var15, arg0, 0, 1);

			if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg0 > 0) {
				field539[arg0][arg6][arg2] |= 0x924;
			}

			if (var14.field1274 && arg1 != null) {
				arg1.method571(var14.field1272, var14.field1249, arg2, arg3, arg6, var14.field1283);
			}
		} else if (arg7 == 0) {
			XPEMEMUL var27;
			if (var14.field1246 == -1 && var14.field1266 == null) {
				var27 = var14.method470(0, arg3, var9, var10, var11, var12, -1);
			} else {
				var27 = new LOFYMKZK(arg3, arg4, 0, var14.field1246, var10, var9, true, var12, var11);
			}

			arg5.method241(field528[arg3], var27, 0, var13, arg0, var16, var15, null, arg2, arg6);

			if (arg3 == 0) {
				if (var14.field1291) {
					field531[arg0][arg6][arg2] = 50;
					field531[arg0][arg6][arg2 + 1] = 50;
				}

				if (var14.field1269) {
					field539[arg0][arg6][arg2] |= 0x249;
				}
			} else if (arg3 == 1) {
				if (var14.field1291) {
					field531[arg0][arg6][arg2 + 1] = 50;
					field531[arg0][arg6 + 1][arg2 + 1] = 50;
				}

				if (var14.field1269) {
					field539[arg0][arg6][arg2 + 1] |= 0x492;
				}
			} else if (arg3 == 2) {
				if (var14.field1291) {
					field531[arg0][arg6 + 1][arg2] = 50;
					field531[arg0][arg6 + 1][arg2 + 1] = 50;
				}

				if (var14.field1269) {
					field539[arg0][arg6 + 1][arg2] |= 0x249;
				}
			} else if (arg3 == 3) {
				if (var14.field1291) {
					field531[arg0][arg6][arg2] = 50;
					field531[arg0][arg6 + 1][arg2] = 50;
				}

				if (var14.field1269) {
					field539[arg0][arg6][arg2] |= 0x492;
				}
			}

			if (var14.field1274 && arg1 != null) {
				arg1.method570(arg2, arg7, var14.field1272, arg6, arg3);
			}

			if (var14.field1255 != 16) {
				arg5.method249(arg0, var14.field1255, arg2, arg6);
			}
		} else if (arg7 == 1) {
			XPEMEMUL var28;
			if (var14.field1246 == -1 && var14.field1266 == null) {
				var28 = var14.method470(1, arg3, var9, var10, var11, var12, -1);
			} else {
				var28 = new LOFYMKZK(arg3, arg4, 1, var14.field1246, var10, var9, true, var12, var11);
			}

			arg5.method241(field541[arg3], var28, 0, var13, arg0, var16, var15, null, arg2, arg6);

			if (var14.field1291) {
				if (arg3 == 0) {
					field531[arg0][arg6][arg2 + 1] = 50;
				} else if (arg3 == 1) {
					field531[arg0][arg6 + 1][arg2 + 1] = 50;
				} else if (arg3 == 2) {
					field531[arg0][arg6 + 1][arg2] = 50;
				} else if (arg3 == 3) {
					field531[arg0][arg6][arg2] = 50;
				}
			}

			if (var14.field1274 && arg1 != null) {
				arg1.method570(arg2, arg7, var14.field1272, arg6, arg3);
			}
		} else if (arg7 == 2) {
			int var29 = arg3 + 1 & 0x3;
			XPEMEMUL var30;
			XPEMEMUL var31;
			if (var14.field1246 == -1 && var14.field1266 == null) {
				var30 = var14.method470(2, arg3 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method470(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new LOFYMKZK(arg3 + 4, arg4, 2, var14.field1246, var10, var9, true, var12, var11);
				var31 = new LOFYMKZK(var29, arg4, 2, var14.field1246, var10, var9, true, var12, var11);
			}

			arg5.method241(field528[arg3], var30, field528[var29], var13, arg0, var16, var15, var31, arg2, arg6);

			if (var14.field1269) {
				if (arg3 == 0) {
					field539[arg0][arg6][arg2] |= 0x249;
					field539[arg0][arg6][arg2 + 1] |= 0x492;
				} else if (arg3 == 1) {
					field539[arg0][arg6][arg2 + 1] |= 0x492;
					field539[arg0][arg6 + 1][arg2] |= 0x249;
				} else if (arg3 == 2) {
					field539[arg0][arg6 + 1][arg2] |= 0x249;
					field539[arg0][arg6][arg2] |= 0x492;
				} else if (arg3 == 3) {
					field539[arg0][arg6][arg2] |= 0x492;
					field539[arg0][arg6][arg2] |= 0x249;
				}
			}

			if (var14.field1274 && arg1 != null) {
				arg1.method570(arg2, arg7, var14.field1272, arg6, arg3);
			}

			if (var14.field1255 != 16) {
				arg5.method249(arg0, var14.field1255, arg2, arg6);
			}
		} else if (arg7 == 3) {
			XPEMEMUL var32;
			if (var14.field1246 == -1 && var14.field1266 == null) {
				var32 = var14.method470(3, arg3, var9, var10, var11, var12, -1);
			} else {
				var32 = new LOFYMKZK(arg3, arg4, 3, var14.field1246, var10, var9, true, var12, var11);
			}

			arg5.method241(field541[arg3], var32, 0, var13, arg0, var16, var15, null, arg2, arg6);

			if (var14.field1291) {
				if (arg3 == 0) {
					field531[arg0][arg6][arg2 + 1] = 50;
				} else if (arg3 == 1) {
					field531[arg0][arg6 + 1][arg2 + 1] = 50;
				} else if (arg3 == 2) {
					field531[arg0][arg6 + 1][arg2] = 50;
				} else if (arg3 == 3) {
					field531[arg0][arg6][arg2] = 50;
				}
			}

			if (var14.field1274 && arg1 != null) {
				arg1.method570(arg2, arg7, var14.field1272, arg6, arg3);
			}
		} else if (arg7 == 9) {
			XPEMEMUL var33;
			if (var14.field1246 == -1 && var14.field1266 == null) {
				var33 = var14.method470(arg7, arg3, var9, var10, var11, var12, -1);
			} else {
				var33 = new LOFYMKZK(arg3, arg4, arg7, var14.field1246, var10, var9, true, var12, var11);
			}

			arg5.method243(var13, var33, arg2, 1, arg6, var16, var15, arg0, 0, 1);

			if (var14.field1274 && arg1 != null) {
				arg1.method571(var14.field1272, var14.field1249, arg2, arg3, arg6, var14.field1283);
			}
		} else {
			if (var14.field1263) {
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

			if (arg7 == 4) {
				XPEMEMUL var38;
				if (var14.field1246 == -1 && var14.field1266 == null) {
					var38 = var14.method470(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new LOFYMKZK(0, arg4, 4, var14.field1246, var10, var9, true, var12, var11);
				}

				arg5.method242(var38, arg3 * 512, var13, var15, arg6, arg0, field528[arg3], 0, var16, 0, arg2);
			} else if (arg7 == 5) {
				int var39 = 16;
				int var40 = arg5.method259(arg0, arg6, arg2);
				if (var40 > 0) {
					var39 = SCWSBSIM.method464(var40 >> 14 & 0x7FFF).field1255;
				}

				XPEMEMUL var41;
				if (var14.field1246 == -1 && var14.field1266 == null) {
					var41 = var14.method470(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new LOFYMKZK(0, arg4, 4, var14.field1246, var10, var9, true, var12, var11);
				}

				arg5.method242(var41, arg3 * 512, var13, var15, arg6, arg0, field528[arg3], field529[arg3] * var39, var16, field540[arg3] * var39, arg2);
			} else if (arg7 == 6) {
				XPEMEMUL var42;
				if (var14.field1246 == -1 && var14.field1266 == null) {
					var42 = var14.method470(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new LOFYMKZK(0, arg4, 4, var14.field1246, var10, var9, true, var12, var11);
				}

				arg5.method242(var42, arg3, var13, var15, arg6, arg0, 256, 0, var16, 0, arg2);
			} else if (arg7 == 7) {
				XPEMEMUL var43;
				if (var14.field1246 == -1 && var14.field1266 == null) {
					var43 = var14.method470(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new LOFYMKZK(0, arg4, 4, var14.field1246, var10, var9, true, var12, var11);
				}

				arg5.method242(var43, arg3, var13, var15, arg6, arg0, 512, 0, var16, 0, arg2);
			} else if (arg7 == 8) {
				XPEMEMUL var44;
				if (var14.field1246 == -1 && var14.field1266 == null) {
					var44 = var14.method470(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new LOFYMKZK(0, arg4, 4, var14.field1246, var10, var9, true, var12, var11);
				}

				arg5.method242(var44, arg3, var13, var15, arg6, arg0, 768, 0, var16, 0, arg2);
			}
		}
	}

	@ObfuscatedName("DWQOSSFD.a(I[BIIII[LYMCKWFGH;)V")
	public final void method200(int arg0, byte[] arg1, int arg2, int arg3, int arg4, YMCKWFGH[] arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg4 + var8 > 0 && arg4 + var8 < 103 && arg0 + var9 > 0 && arg0 + var9 < 103) {
						arg5[var7].field1416[arg4 + var8][arg0 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		XOUQUKZW var10 = new XOUQUKZW(arg1);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method198(var10, arg4 + var12, var11, arg3, arg0 + var13, 0, arg2);
				}
			}
		}
	}

	@ObfuscatedName("DWQOSSFD.d(II)I")
	public static final int method201(int arg0, int arg1) {
		int var2 = method188(arg0 - 1, arg1 - 1) + method188(arg0 + 1, arg1 - 1) + method188(arg0 - 1, arg1 + 1) + method188(arg0 + 1, arg1 + 1);
		int var3 = method188(arg0 - 1, arg1) + method188(arg0 + 1, arg1) + method188(arg0, arg1 - 1) + method188(arg0, arg1 + 1);
		int var4 = method188(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("DWQOSSFD.b(III)Z")
	public static final boolean method202(int arg0, int arg1) {
		SCWSBSIM var2 = SCWSBSIM.method464(arg1);

		if (arg0 == 11) {
			arg0 = 10;
		}

		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}

		return var2.method461(arg0);
	}

	@ObfuscatedName("DWQOSSFD.a(II[LYMCKWFGH;Z[BIIIII)V")
	public final void method203(int arg0, int arg1, YMCKWFGH[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg1 + var10 > 0 && arg1 + var10 < 103 && arg7 + var11 > 0 && arg7 + var11 < 103) {
					arg2[arg5].field1416[arg1 + var10][arg7 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		XOUQUKZW var12 = new XOUQUKZW(arg3);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg6 == var13 && var14 >= arg8 && var14 < arg8 + 8 && var15 >= arg0 && var15 < arg0 + 8) {
						method198(var12, arg1 + HSOVOELH.method312(var14 & 0x7, arg4, var15 & 0x7), arg5, 0, arg7 + HSOVOELH.method313(var15 & 0x7, var14 & 0x7, arg4), arg4, 0);
					} else {
						method198(var12, -1, 0, 0, -1, 0, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("DWQOSSFD.a([LYMCKWFGH;LGLVCMXFQ;Z)V")
	public final void method204(YMCKWFGH[] arg0, GLVCMXFQ arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field530[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field530[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg0[var6].method572(var4, var5);
						}
					}
				}
			}
		}

		field547 += (int) (Math.random() * 5.0D) - 2;
		if (field547 < -8) {
			field547 = -8;
		}

		if (field547 > 8) {
			field547 = 8;
		}

		field546 += (int) (Math.random() * 5.0D) - 2;
		if (field546 < -16) {
			field546 = -16;
		}

		if (field546 > 16) {
			field546 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field531[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field527 - 1; var16++) {
				for (int var17 = 1; var17 < field526 - 1; var17++) {
					int var18 = field548[var7][var17 + 1][var16] - field548[var7][var17 - 1][var16];
					int var19 = field548[var7][var17][var16 + 1] - field548[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field543[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field527; var26++) {
				field534[var26] = 0;
				field535[var26] = 0;
				field536[var26] = 0;
				field537[var26] = 0;
				field538[var26] = 0;
			}

			for (int var27 = -5; var27 < field526 + 5; var27++) {
				for (int var28 = 0; var28 < field527; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field526) {
						int var30 = field533[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							ECSVNCGM var31 = ECSVNCGM.field552[var30 - 1];
							field534[var28] += var31.field561;
							field535[var28] += var31.field559;
							field536[var28] += var31.field560;
							field537[var28] += var31.field562;
							field538[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field526) {
						int var33 = field533[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							ECSVNCGM var34 = ECSVNCGM.field552[var33 - 1];
							field534[var28] -= var34.field561;
							field535[var28] -= var34.field559;
							field536[var28] -= var34.field560;
							field537[var28] -= var34.field562;
							field538[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field526 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field527 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field527) {
							var35 += field534[var41];
							var36 += field535[var41];
							var37 += field536[var41];
							var38 += field537[var41];
							var39 += field538[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field527) {
							var35 -= field534[var42];
							var36 -= field535[var42];
							var37 -= field536[var42];
							var38 -= field537[var42];
							var39 -= field538[var42];
						}

						if (var40 >= 1 && var40 < field527 - 1 && (!field545 || (field530[0][var27][var40] & 0x2) != 0 || (field530[var7][var27][var40] & 0x10) == 0 && method208(var7, var40, var27) == field542)) {
							if (var7 < field525) {
								field525 = var7;
							}

							int var43 = field533[var7][var27][var40] & 0xFF;
							int var44 = field524[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field548[var7][var27][var40];
								int var46 = field548[var7][var27 + 1][var40];
								int var47 = field548[var7][var27 + 1][var40 + 1];
								int var48 = field548[var7][var27][var40 + 1];
								int var49 = field543[var27][var40];
								int var50 = field543[var27 + 1][var40];
								int var51 = field543[var27 + 1][var40 + 1];
								int var52 = field543[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method192(var55, var56, var57);
									var55 = field547 + var55 & 0xFF;
									var57 += field546;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method192(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field532[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !ECSVNCGM.field552[var44 - 1].field557) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field539[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = OIDJTTQC.field1070[method196(var54, 96)];
								}

								if (var44 == 0) {
									arg1.method238(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method196(var53, var49), method196(var53, var50), method196(var53, var51), method196(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field532[var7][var27][var40] + 1;
									byte var61 = field544[var7][var27][var40];
									ECSVNCGM var62 = ECSVNCGM.field552[var44 - 1];
									int var63 = var62.field555;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = OIDJTTQC.method437(var63);
										var65 = -1;
									} else if (var62.field554 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method192(var62.field558, var62.field559, var62.field560);
										var64 = OIDJTTQC.field1070[method207(var62.field563, 96)];
									}

									arg1.method238(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method196(var53, var49), method196(var53, var50), method196(var53, var51), method196(var53, var52), method207(var65, var49), method207(var65, var50), method207(var65, var51), method207(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field527 - 1; var66++) {
				for (int var67 = 1; var67 < field526 - 1; var67++) {
					arg1.method237(var7, var67, var66, method208(var7, var66, var67));
				}
			}
		}

		arg1.method264(-50, -10, 768, -50, 64);

		for (int var68 = 0; var68 < field526; var68++) {
			for (int var69 = 0; var69 < field527; var69++) {
				if ((field530[1][var68][var69] & 0x2) == 2) {
					arg1.method235(var69, var68);
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
				for (int var75 = 0; var75 <= field527; var75++) {
					for (int var76 = 0; var76 <= field526; var76++) {
						if ((field539[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field539[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field527 && (field539[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field539[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field539[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field548[var80][var76][var77] - var84;
								int var86 = field548[var79][var76][var77];
								GLVCMXFQ.method236(var76 * 128, var73, var85, var76 * 128, var77 * 128, var86, var78 * 128 + 128, 1);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field539[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field539[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field539[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field526 && (field539[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field539[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field539[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field548[var92][var89][var75] - var96;
								int var98 = field548[var91][var89][var75];
								GLVCMXFQ.method236(var89 * 128, var73, var97, var90 * 128 + 128, var75 * 128, var98, var75 * 128, 2);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field539[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field539[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field539[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field527 && (field539[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field539[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field526) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field539[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field548[var74][var101][var103];
								GLVCMXFQ.method236(var101 * 128, var73, var107, var102 * 128 + 128, var103 * 128, var107, var104 * 128 + 128, 4);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field539[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public DWQOSSFD(int arg0, int[][][] arg1, byte[][][] arg2, int arg3) {
		field525 = 99;
		field526 = arg0;
		field527 = arg3;
		field548 = arg1;
		field530 = arg2;
		field533 = new byte[4][field526][field527];
		field524 = new byte[4][field526][field527];
		field532 = new byte[4][field526][field527];
		field544 = new byte[4][field526][field527];
		field539 = new int[4][field526 + 1][field527 + 1];
		field531 = new byte[4][field526 + 1][field527 + 1];
		field543 = new int[field526 + 1][field527 + 1];
		field534 = new int[field527];
		field535 = new int[field527];
		field536 = new int[field527];
		field537 = new int[field527];
		field538 = new int[field527];
	}

	@ObfuscatedName("DWQOSSFD.a(ILGLVCMXFQ;I[B[LYMCKWFGH;I)V")
	public final void method205(int arg0, GLVCMXFQ arg1, int arg2, byte[] arg3, YMCKWFGH[] arg4) {
		XOUQUKZW var6 = new XOUQUKZW(arg3);
		int var7 = -1;
		while (true) {
			int var8 = var6.method535();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method535();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method521();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg0 + var12;
				int var18 = arg2 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field530[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					YMCKWFGH var20 = null;
					if (var19 >= 0) {
						var20 = arg4[var19];
					}

					method199(var13, var20, var18, var16, var7, arg1, var17, var15);
				}
			}
		}
	}

	@ObfuscatedName("DWQOSSFD.c(III)I")
	public static final int method206(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method201(var3, var5);
		int var8 = method201(var3 + 1, var5);
		int var9 = method201(var3, var5 + 1);
		int var10 = method201(var3 + 1, var5 + 1);
		int var11 = method189(var7, var8, var4, arg2);
		int var12 = method189(var9, var10, var4, arg2);
		return method189(var11, var12, var6, arg2);
	}

	@ObfuscatedName("DWQOSSFD.e(II)I")
	public final int method207(int arg0, int arg1) {
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

	@ObfuscatedName("DWQOSSFD.a(BIII)I")
	public int method208(int arg0, int arg1, int arg2) {
		if ((field530[arg0][arg2][arg1] & 0x8) != 0) {
			return 0;
		}

		if (arg0 > 0 && (field530[1][arg2][arg1] & 0x2) != 0) {
			return arg0 - 1;
		}

		return arg0;
	}
}
