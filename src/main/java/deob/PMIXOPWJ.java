package deob;

@ObfuscatedName("PMIXOPWJ")
public final class PMIXOPWJ {

	@ObfuscatedName("PMIXOPWJ.B")
	public int field1127;

	@ObfuscatedName("PMIXOPWJ.C")
	public int field1128;

	@ObfuscatedName("PMIXOPWJ.l")
	public int[][][] field1113;

	@ObfuscatedName("PMIXOPWJ.i")
	public byte[][][] field1110;

	@ObfuscatedName("PMIXOPWJ.x")
	public byte[][][] field1123;

	@ObfuscatedName("PMIXOPWJ.E")
	public byte[][][] field1129;

	@ObfuscatedName("PMIXOPWJ.k")
	public byte[][][] field1112;

	@ObfuscatedName("PMIXOPWJ.y")
	public byte[][][] field1124;

	@ObfuscatedName("PMIXOPWJ.w")
	public int[][][] field1122;

	@ObfuscatedName("PMIXOPWJ.z")
	public byte[][][] field1125;

	@ObfuscatedName("PMIXOPWJ.j")
	public int[][] field1111;

	@ObfuscatedName("PMIXOPWJ.p")
	public int[] field1116;

	@ObfuscatedName("PMIXOPWJ.q")
	public int[] field1117;

	@ObfuscatedName("PMIXOPWJ.r")
	public int[] field1118;

	@ObfuscatedName("PMIXOPWJ.s")
	public int[] field1119;

	@ObfuscatedName("PMIXOPWJ.t")
	public int[] field1120;

	@ObfuscatedName("PMIXOPWJ.a")
	public static final int[] field1105 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("PMIXOPWJ.d")
	public static final int[] field1107 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("PMIXOPWJ.e")
	public static final int[] field1108 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("PMIXOPWJ.o")
	public static boolean field1115 = true;

	@ObfuscatedName("PMIXOPWJ.v")
	public static final int[] field1121 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("PMIXOPWJ.A")
	public static int field1126 = 99;

	@ObfuscatedName("PMIXOPWJ.c")
	public static int field1106 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("PMIXOPWJ.m")
	public static int field1114 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("PMIXOPWJ.h")
	public static int field1109;

	@ObfuscatedName("PMIXOPWJ.a(ZILFKUDHMAZ;[B[LZGDLGUZR;I)V")
	public final void method448(int arg0, FKUDHMAZ arg1, byte[] arg2, ZGDLGUZR[] arg3, int arg4) {
		EYMNCFMK var6 = new EYMNCFMK(arg2);
		int var7 = -1;
		while (true) {
			int var8 = var6.method253();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method253();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method239();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg4 + var12;
				int var18 = arg0 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field1110[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					ZGDLGUZR var20 = null;
					if (var19 >= 0) {
						var20 = arg3[var19];
					}

					method452(var16, var18, var15, var13, var7, var17, var20, arg1);
				}
			}
		}
	}

	@ObfuscatedName("PMIXOPWJ.a(III)I")
	public final int method449(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("PMIXOPWJ.a(IIIII)V")
	public final void method450(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg1; var5 <= arg1 + arg3; var5++) {
			for (int var6 = arg0; var6 <= arg0 + arg2; var6++) {
				if (var6 >= 0 && var6 < field1127 && var5 >= 0 && var5 < field1128) {
					field1125[0][var6][var5] = 127;

					if (arg0 == var6 && var6 > 0) {
						field1113[0][var6][var5] = field1113[0][var6 - 1][var5];
					}

					if (arg0 + arg2 == var6 && var6 < field1127 - 1) {
						field1113[0][var6][var5] = field1113[0][var6 + 1][var5];
					}

					if (arg1 == var5 && var5 > 0) {
						field1113[0][var6][var5] = field1113[0][var6][var5 - 1];
					}

					if (arg1 + arg3 == var5 && var5 < field1128 - 1) {
						field1113[0][var6][var5] = field1113[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("PMIXOPWJ.a(II)I")
	public static final int method451(int arg0, int arg1) {
		int var2 = method463(arg0 - 1, arg1 - 1) + method463(arg0 + 1, arg1 - 1) + method463(arg0 - 1, arg1 + 1) + method463(arg0 + 1, arg1 + 1);
		int var3 = method463(arg0 - 1, arg1) + method463(arg0 + 1, arg1) + method463(arg0, arg1 - 1) + method463(arg0, arg1 + 1);
		int var4 = method463(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("PMIXOPWJ.a(IIIIIILZGDLGUZR;BLFKUDHMAZ;)V")
	public final void method452(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, ZGDLGUZR arg6, FKUDHMAZ arg7) {
		if (field1115 && (field1110[0][arg5][arg1] & 0x2) == 0) {
			if ((field1110[arg3][arg5][arg1] & 0x10) != 0) {
				return;
			}

			if (method458(arg3, arg5, arg1) != field1109) {
				return;
			}
		}

		if (arg3 < field1126) {
			field1126 = arg3;
		}

		int var9 = field1113[arg3][arg5][arg1];
		int var10 = field1113[arg3][arg5 + 1][arg1];
		int var11 = field1113[arg3][arg5 + 1][arg1 + 1];
		int var12 = field1113[arg3][arg5][arg1 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		WEJSKHXC var14 = WEJSKHXC.method548(arg4);
		int var15 = (arg4 << 14) + (arg1 << 7) + arg5 + 0x40000000;
		if (!var14.field1397) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg0 << 6) + arg2);
		if (arg2 == 22) {
			if (!field1115 || var14.field1397 || var14.field1410) {
				UCNHLGIK var17;
				if (var14.field1405 == -1 && var14.field1389 == null) {
					var17 = var14.method549(22, arg0, var9, var10, var11, var12, -1);
				} else {
					var17 = new EFJXCNIG(var12, var11, var14.field1405, var10, var9, arg0, arg4, true, 22);
				}

				arg7.method285(arg3, arg5, var16, var17, var13, var15, arg1);

				if (var14.field1411 && var14.field1397 && arg6 != null) {
					arg6.method596(arg5, arg1);
				}
			}
		} else if (arg2 == 10 || arg2 == 11) {
			UCNHLGIK var18;
			if (var14.field1405 == -1 && var14.field1389 == null) {
				var18 = var14.method549(10, arg0, var9, var10, var11, var12, -1);
			} else {
				var18 = new EFJXCNIG(var12, var11, var14.field1405, var10, var9, arg0, arg4, true, 10);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg2 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg0 == 1 || arg0 == 3) {
					var20 = var14.field1408;
					var21 = var14.field1399;
				} else {
					var20 = var14.field1399;
					var21 = var14.field1408;
				}

				if (arg7.method289(arg1, var19, arg3, var20, var18, var16, var21, var13, arg5, var15) && var14.field1382) {
					OJGAHFXC var22;
					if (var18 instanceof OJGAHFXC) {
						var22 = (OJGAHFXC) var18;
					} else {
						var22 = var14.method549(10, arg0, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field1041 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field1125[arg3][arg5 + var23][arg1 + var24]) {
									field1125[arg3][arg5 + var23][arg1 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field1411 && arg6 != null) {
				arg6.method595(var14.field1418, var14.field1399, arg0, var14.field1408, arg1, arg5);
			}
		} else if (arg2 >= 12) {
			UCNHLGIK var26;
			if (var14.field1405 == -1 && var14.field1389 == null) {
				var26 = var14.method549(arg2, arg0, var9, var10, var11, var12, -1);
			} else {
				var26 = new EFJXCNIG(var12, var11, var14.field1405, var10, var9, arg0, arg4, true, arg2);
			}

			arg7.method289(arg1, 0, arg3, 1, var26, var16, 1, var13, arg5, var15);

			if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg3 > 0) {
				field1122[arg3][arg5][arg1] |= 0x924;
			}

			if (var14.field1411 && arg6 != null) {
				arg6.method595(var14.field1418, var14.field1399, arg0, var14.field1408, arg1, arg5);
			}
		} else if (arg2 == 0) {
			UCNHLGIK var27;
			if (var14.field1405 == -1 && var14.field1389 == null) {
				var27 = var14.method549(0, arg0, var9, var10, var11, var12, -1);
			} else {
				var27 = new EFJXCNIG(var12, var11, var14.field1405, var10, var9, arg0, arg4, true, 0);
			}

			arg7.method287(arg3, var13, 0, null, var27, field1107[arg0], arg5, var16, arg1, var15);

			if (arg0 == 0) {
				if (var14.field1382) {
					field1125[arg3][arg5][arg1] = 50;
					field1125[arg3][arg5][arg1 + 1] = 50;
				}

				if (var14.field1378) {
					field1122[arg3][arg5][arg1] |= 0x249;
				}
			} else if (arg0 == 1) {
				if (var14.field1382) {
					field1125[arg3][arg5][arg1 + 1] = 50;
					field1125[arg3][arg5 + 1][arg1 + 1] = 50;
				}

				if (var14.field1378) {
					field1122[arg3][arg5][arg1 + 1] |= 0x492;
				}
			} else if (arg0 == 2) {
				if (var14.field1382) {
					field1125[arg3][arg5 + 1][arg1] = 50;
					field1125[arg3][arg5 + 1][arg1 + 1] = 50;
				}

				if (var14.field1378) {
					field1122[arg3][arg5 + 1][arg1] |= 0x249;
				}
			} else if (arg0 == 3) {
				if (var14.field1382) {
					field1125[arg3][arg5][arg1] = 50;
					field1125[arg3][arg5 + 1][arg1] = 50;
				}

				if (var14.field1378) {
					field1122[arg3][arg5][arg1] |= 0x492;
				}
			}

			if (var14.field1411 && arg6 != null) {
				arg6.method594(arg5, var14.field1418, arg0, arg2, arg1);
			}

			if (var14.field1383 != 16) {
				arg7.method295(var14.field1383, arg3, arg1, arg5);
			}
		} else if (arg2 == 1) {
			UCNHLGIK var28;
			if (var14.field1405 == -1 && var14.field1389 == null) {
				var28 = var14.method549(1, arg0, var9, var10, var11, var12, -1);
			} else {
				var28 = new EFJXCNIG(var12, var11, var14.field1405, var10, var9, arg0, arg4, true, 1);
			}

			arg7.method287(arg3, var13, 0, null, var28, field1105[arg0], arg5, var16, arg1, var15);

			if (var14.field1382) {
				if (arg0 == 0) {
					field1125[arg3][arg5][arg1 + 1] = 50;
				} else if (arg0 == 1) {
					field1125[arg3][arg5 + 1][arg1 + 1] = 50;
				} else if (arg0 == 2) {
					field1125[arg3][arg5 + 1][arg1] = 50;
				} else if (arg0 == 3) {
					field1125[arg3][arg5][arg1] = 50;
				}
			}

			if (var14.field1411 && arg6 != null) {
				arg6.method594(arg5, var14.field1418, arg0, arg2, arg1);
			}
		} else if (arg2 == 2) {
			int var29 = arg0 + 1 & 0x3;
			UCNHLGIK var30;
			UCNHLGIK var31;
			if (var14.field1405 == -1 && var14.field1389 == null) {
				var30 = var14.method549(2, arg0 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method549(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new EFJXCNIG(var12, var11, var14.field1405, var10, var9, arg0 + 4, arg4, true, 2);
				var31 = new EFJXCNIG(var12, var11, var14.field1405, var10, var9, var29, arg4, true, 2);
			}

			arg7.method287(arg3, var13, field1107[var29], var31, var30, field1107[arg0], arg5, var16, arg1, var15);

			if (var14.field1378) {
				if (arg0 == 0) {
					field1122[arg3][arg5][arg1] |= 0x249;
					field1122[arg3][arg5][arg1 + 1] |= 0x492;
				} else if (arg0 == 1) {
					field1122[arg3][arg5][arg1 + 1] |= 0x492;
					field1122[arg3][arg5 + 1][arg1] |= 0x249;
				} else if (arg0 == 2) {
					field1122[arg3][arg5 + 1][arg1] |= 0x249;
					field1122[arg3][arg5][arg1] |= 0x492;
				} else if (arg0 == 3) {
					field1122[arg3][arg5][arg1] |= 0x492;
					field1122[arg3][arg5][arg1] |= 0x249;
				}
			}

			if (var14.field1411 && arg6 != null) {
				arg6.method594(arg5, var14.field1418, arg0, arg2, arg1);
			}

			if (var14.field1383 != 16) {
				arg7.method295(var14.field1383, arg3, arg1, arg5);
			}
		} else if (arg2 == 3) {
			UCNHLGIK var32;
			if (var14.field1405 == -1 && var14.field1389 == null) {
				var32 = var14.method549(3, arg0, var9, var10, var11, var12, -1);
			} else {
				var32 = new EFJXCNIG(var12, var11, var14.field1405, var10, var9, arg0, arg4, true, 3);
			}

			arg7.method287(arg3, var13, 0, null, var32, field1105[arg0], arg5, var16, arg1, var15);

			if (var14.field1382) {
				if (arg0 == 0) {
					field1125[arg3][arg5][arg1 + 1] = 50;
				} else if (arg0 == 1) {
					field1125[arg3][arg5 + 1][arg1 + 1] = 50;
				} else if (arg0 == 2) {
					field1125[arg3][arg5 + 1][arg1] = 50;
				} else if (arg0 == 3) {
					field1125[arg3][arg5][arg1] = 50;
				}
			}

			if (var14.field1411 && arg6 != null) {
				arg6.method594(arg5, var14.field1418, arg0, arg2, arg1);
			}
		} else if (arg2 == 9) {
			UCNHLGIK var33;
			if (var14.field1405 == -1 && var14.field1389 == null) {
				var33 = var14.method549(arg2, arg0, var9, var10, var11, var12, -1);
			} else {
				var33 = new EFJXCNIG(var12, var11, var14.field1405, var10, var9, arg0, arg4, true, arg2);
			}

			arg7.method289(arg1, 0, arg3, 1, var33, var16, 1, var13, arg5, var15);

			if (var14.field1411 && arg6 != null) {
				arg6.method595(var14.field1418, var14.field1399, arg0, var14.field1408, arg1, arg5);
			}
		} else {
			if (var14.field1417) {
				if (arg0 == 1) {
					int var34 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var9;
					var9 = var34;
				} else if (arg0 == 2) {
					int var35 = var12;
					var12 = var10;
					var10 = var35;
					int var36 = var11;
					var11 = var9;
					var9 = var36;
				} else if (arg0 == 3) {
					int var37 = var12;
					var12 = var9;
					var9 = var10;
					var10 = var11;
					var11 = var37;
				}
			}

			if (arg2 == 4) {
				UCNHLGIK var38;
				if (var14.field1405 == -1 && var14.field1389 == null) {
					var38 = var14.method549(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new EFJXCNIG(var12, var11, var14.field1405, var10, var9, 0, arg4, true, 4);
				}

				arg7.method288(var13, 0, var16, var15, 0, arg3, arg1, var38, arg5, arg0 * 512, field1107[arg0]);
			} else if (arg2 == 5) {
				int var39 = 16;
				int var40 = arg7.method305(arg3, arg5, arg1);
				if (var40 > 0) {
					var39 = WEJSKHXC.method548(var40 >> 14 & 0x7FFF).field1383;
				}

				UCNHLGIK var41;
				if (var14.field1405 == -1 && var14.field1389 == null) {
					var41 = var14.method549(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new EFJXCNIG(var12, var11, var14.field1405, var10, var9, 0, arg4, true, 4);
				}

				arg7.method288(var13, field1121[arg0] * var39, var16, var15, field1108[arg0] * var39, arg3, arg1, var41, arg5, arg0 * 512, field1107[arg0]);
			} else if (arg2 == 6) {
				UCNHLGIK var42;
				if (var14.field1405 == -1 && var14.field1389 == null) {
					var42 = var14.method549(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new EFJXCNIG(var12, var11, var14.field1405, var10, var9, 0, arg4, true, 4);
				}

				arg7.method288(var13, 0, var16, var15, 0, arg3, arg1, var42, arg5, arg0, 256);
			} else if (arg2 == 7) {
				UCNHLGIK var43;
				if (var14.field1405 == -1 && var14.field1389 == null) {
					var43 = var14.method549(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new EFJXCNIG(var12, var11, var14.field1405, var10, var9, 0, arg4, true, 4);
				}

				arg7.method288(var13, 0, var16, var15, 0, arg3, arg1, var43, arg5, arg0, 512);
			} else if (arg2 == 8) {
				UCNHLGIK var44;
				if (var14.field1405 == -1 && var14.field1389 == null) {
					var44 = var14.method549(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new EFJXCNIG(var12, var11, var14.field1405, var10, var9, 0, arg4, true, 4);
				}

				arg7.method288(var13, 0, var16, var15, 0, arg3, arg1, var44, arg5, arg0, 768);
			}
		}
	}

	public PMIXOPWJ(byte[][][] arg0, int arg1, int arg2, int[][][] arg3) {
		field1126 = 99;
		field1127 = arg2;
		field1128 = arg1;
		field1113 = arg3;
		field1110 = arg0;
		field1123 = new byte[4][field1127][field1128];
		field1129 = new byte[4][field1127][field1128];
		field1112 = new byte[4][field1127][field1128];
		field1124 = new byte[4][field1127][field1128];
		field1122 = new int[4][field1127 + 1][field1128 + 1];
		field1125 = new byte[4][field1127 + 1][field1128 + 1];
		field1111 = new int[field1127 + 1][field1128 + 1];
		field1116 = new int[field1128];
		field1117 = new int[field1128];
		field1118 = new int[field1128];
		field1119 = new int[field1128];
		field1120 = new int[field1128];
	}

	@ObfuscatedName("PMIXOPWJ.b(II)I")
	public final int method453(int arg0, int arg1) {
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

	@ObfuscatedName("PMIXOPWJ.a(II[BI)Z")
	public static final boolean method454(int arg0, int arg1, byte[] arg2) {
		boolean var3 = true;
		EYMNCFMK var4 = new EYMNCFMK(arg2);
		int var5 = -1;
		while (true) {
			int var6 = var4.method253();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method253();
					if (var9 == 0) {
						break;
					}

					var4.method239();
				} else {
					int var10 = var4.method253();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method239() >> 2;
					int var14 = arg0 + var12;
					int var15 = arg1 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						WEJSKHXC var16 = WEJSKHXC.method548(var5);
						if (var13 != 22 || !field1115 || var16.field1397 || var16.field1410) {
							var3 &= var16.method555();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("PMIXOPWJ.a(IIII)V")
	public final void method455(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 8; var4++) {
			for (int var5 = 0; var5 < 8; var5++) {
				field1113[arg1][arg2 + var4][arg0 + var5] = 0;
			}
		}

		if (arg2 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				field1113[arg1][arg2][arg0 + var6] = field1113[arg1][arg2 - 1][arg0 + var6];
			}
		}

		if (arg0 > 0) {
			for (int var7 = 1; var7 < 8; var7++) {
				field1113[arg1][arg2 + var7][arg0] = field1113[arg1][arg2 + var7][arg0 - 1];
			}
		}

		if (arg2 > 0 && field1113[arg1][arg2 - 1][arg0] != 0) {
			field1113[arg1][arg2][arg0] = field1113[arg1][arg2 - 1][arg0];
		} else if (arg0 > 0 && field1113[arg1][arg2][arg0 - 1] != 0) {
			field1113[arg1][arg2][arg0] = field1113[arg1][arg2][arg0 - 1];
		} else if (arg2 > 0 && arg0 > 0 && field1113[arg1][arg2 - 1][arg0 - 1] != 0) {
			field1113[arg1][arg2][arg0] = field1113[arg1][arg2 - 1][arg0 - 1];
		}
	}

	@ObfuscatedName("PMIXOPWJ.a(IIIILEYMNCFMK;III)V")
	public final void method456(int arg0, int arg1, int arg2, int arg3, EYMNCFMK arg4, int arg5, int arg6) {
		if (arg2 >= 0 && arg2 < 104 && arg3 >= 0 && arg3 < 104) {
			field1110[arg6][arg2][arg3] = 0;
			while (true) {
				int var8 = arg4.method239();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg4.method239();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg6 == 0) {
						field1113[0][arg2][arg3] = -var9 * 8;
						return;
					}

					field1113[arg6][arg2][arg3] = field1113[arg6 - 1][arg2][arg3] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field1129[arg6][arg2][arg3] = arg4.method240();
					field1112[arg6][arg2][arg3] = (byte) ((var8 - 2) / 4);
					field1124[arg6][arg2][arg3] = (byte) (var8 + arg0 - 2 & 0x3);
				} else if (var8 <= 81) {
					field1110[arg6][arg2][arg3] = (byte) (var8 - 49);
				} else {
					field1123[arg6][arg2][arg3] = (byte) (var8 - 81);
				}
			}

			if (arg6 == 0) {
				field1113[0][arg2][arg3] = -method461(arg2 + arg1 + 932731, arg3 + 556238 + arg5) * 8;
			} else {
				field1113[arg6][arg2][arg3] = field1113[arg6 - 1][arg2][arg3] - 240;
			}
		} else {
			while (true) {
				int var10 = arg4.method239();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg4.method239();
					return;
				}

				if (var10 <= 49) {
					arg4.method239();
				}
			}
		}
	}

	@ObfuscatedName("PMIXOPWJ.c(II)I")
	public static final int method457(int arg0, int arg1) {
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

	@ObfuscatedName("PMIXOPWJ.a(BIII)I")
	public int method458(int arg0, int arg1, int arg2) {
		if ((field1110[arg0][arg1][arg2] & 0x8) != 0) {
			return 0;
		}

		if (arg0 > 0 && (field1110[1][arg1][arg2] & 0x2) != 0) {
			return arg0 - 1;
		}

		return arg0;
	}

	@ObfuscatedName("PMIXOPWJ.b(III)I")
	public static final int method459(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method451(var3, var5);
		int var8 = method451(var3 + 1, var5);
		int var9 = method451(var3, var5 + 1);
		int var10 = method451(var3 + 1, var5 + 1);
		int var11 = method460(var7, var8, var4, arg2);
		int var12 = method460(var9, var10, var4, arg2);
		return method460(var11, var12, var6, arg2);
	}

	@ObfuscatedName("PMIXOPWJ.b(IIII)I")
	public static final int method460(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - AOGYQUKT.field31[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("PMIXOPWJ.d(II)I")
	public static final int method461(int arg0, int arg1) {
		int var2 = method459(arg0 + 45365, arg1 + 91923, 4) + (method459(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method459(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("PMIXOPWJ.c(III)Z")
	public static final boolean method462(int arg0, int arg1) {
		WEJSKHXC var2 = WEJSKHXC.method548(arg1);

		if (arg0 == 11) {
			arg0 = 10;
		}

		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}

		return var2.method553(arg0);
	}

	@ObfuscatedName("PMIXOPWJ.e(II)I")
	public static final int method463(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("PMIXOPWJ.a(II[BILFKUDHMAZ;III[LZGDLGUZR;II)V")
	public final void method464(int arg0, int arg1, byte[] arg2, int arg3, FKUDHMAZ arg4, int arg5, int arg6, ZGDLGUZR[] arg7, int arg8, int arg9) {
		EYMNCFMK var11 = new EYMNCFMK(arg2);
		int var12 = -1;
		while (true) {
			int var13 = var11.method253();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method253();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method239();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg0 == var18 && var17 >= arg5 && var17 < arg5 + 8 && var16 >= arg9 && var16 < arg9 + 8) {
					WEJSKHXC var22 = WEJSKHXC.method548(var12);
					int var23 = arg8 + VBKBPIQQ.method536(var22.field1399, var17 & 0x7, var16 & 0x7, var21, var22.field1408, arg6);
					int var24 = arg1 + VBKBPIQQ.method537(var16 & 0x7, var21, var17 & 0x7, var22.field1399, arg6, var22.field1408);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg3;
						if ((field1110[1][var23][var24] & 0x2) == 2) {
							var25 = arg3 - 1;
						}

						ZGDLGUZR var26 = null;
						if (var25 >= 0) {
							var26 = arg7[var25];
						}

						method452(arg6 + var21 & 0x3, var24, var20, arg3, var12, var23, var26, arg4);
					}
				}
			}
		}
	}

	@ObfuscatedName("PMIXOPWJ.a(ZLEYMNCFMK;LXQFIPMSR;)V")
	public static final void method465(EYMNCFMK arg0, XQFIPMSR arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method253();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			WEJSKHXC var4 = WEJSKHXC.method548(var2);
			var4.method550(arg1);

			while (true) {
				int var5 = arg0.method253();
				if (var5 == 0) {
					break;
				}

				arg0.method239();
			}
		}
	}

	@ObfuscatedName("PMIXOPWJ.a([LZGDLGUZR;IIII[BB)V")
	public final void method466(ZGDLGUZR[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg1 + var8 > 0 && arg1 + var8 < 103 && arg2 + var9 > 0 && arg2 + var9 < 103) {
						arg0[var7].field1518[arg1 + var8][arg2 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		EYMNCFMK var10 = new EYMNCFMK(arg5);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method456(0, arg4, arg1 + var12, arg2 + var13, var10, arg3, var11);
				}
			}
		}
	}

	@ObfuscatedName("PMIXOPWJ.a([LZGDLGUZR;IIIIBII[BI)V")
	public final void method467(ZGDLGUZR[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg8 + var10 > 0 && arg8 + var10 < 103 && arg1 + var11 > 0 && arg1 + var11 < 103) {
					arg0[arg6].field1518[arg8 + var10][arg1 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		EYMNCFMK var12 = new EYMNCFMK(arg7);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg5 == var13 && var14 >= arg4 && var14 < arg4 + 8 && var15 >= arg3 && var15 < arg3 + 8) {
						method456(arg2, 0, arg8 + VBKBPIQQ.method534(var14 & 0x7, var15 & 0x7, arg2), arg1 + VBKBPIQQ.method535(arg2, var14 & 0x7, var15 & 0x7), var12, 0, arg6);
					} else {
						method456(0, 0, -1, -1, var12, 0, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("PMIXOPWJ.a([[[ILFKUDHMAZ;IIIZLZGDLGUZR;IIII)V")
	public static final void method468(int[][][] arg0, FKUDHMAZ arg1, int arg2, int arg3, int arg4, ZGDLGUZR arg5, int arg6, int arg7, int arg8, int arg9) {
		int var10 = arg0[arg3][arg7][arg6];
		int var11 = arg0[arg3][arg7 + 1][arg6];
		int var12 = arg0[arg3][arg7 + 1][arg6 + 1];
		int var13 = arg0[arg3][arg7][arg6 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		WEJSKHXC var15 = WEJSKHXC.method548(arg2);
		int var16 = (arg2 << 14) + (arg6 << 7) + arg7 + 0x40000000;
		if (!var15.field1397) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg9 << 6) + arg4);
		if (arg4 == 22) {
			UCNHLGIK var18;
			if (var15.field1405 == -1 && var15.field1389 == null) {
				var18 = var15.method549(22, arg9, var10, var11, var12, var13, -1);
			} else {
				var18 = new EFJXCNIG(var13, var12, var15.field1405, var11, var10, arg9, arg2, true, 22);
			}

			arg1.method285(arg8, arg7, var17, var18, var14, var16, arg6);

			if (var15.field1411 && var15.field1397) {
				arg5.method596(arg7, arg6);
			}
		} else if (arg4 == 10 || arg4 == 11) {
			UCNHLGIK var19;
			if (var15.field1405 == -1 && var15.field1389 == null) {
				var19 = var15.method549(10, arg9, var10, var11, var12, var13, -1);
			} else {
				var19 = new EFJXCNIG(var13, var12, var15.field1405, var11, var10, arg9, arg2, true, 10);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg4 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg9 == 1 || arg9 == 3) {
					var21 = var15.field1408;
					var22 = var15.field1399;
				} else {
					var21 = var15.field1399;
					var22 = var15.field1408;
				}

				arg1.method289(arg6, var20, arg8, var21, var19, var17, var22, var14, arg7, var16);
			}

			if (var15.field1411) {
				arg5.method595(var15.field1418, var15.field1399, arg9, var15.field1408, arg6, arg7);
			}
		} else if (arg4 >= 12) {
			UCNHLGIK var23;
			if (var15.field1405 == -1 && var15.field1389 == null) {
				var23 = var15.method549(arg4, arg9, var10, var11, var12, var13, -1);
			} else {
				var23 = new EFJXCNIG(var13, var12, var15.field1405, var11, var10, arg9, arg2, true, arg4);
			}

			arg1.method289(arg6, 0, arg8, 1, var23, var17, 1, var14, arg7, var16);

			if (var15.field1411) {
				arg5.method595(var15.field1418, var15.field1399, arg9, var15.field1408, arg6, arg7);
			}
		} else if (arg4 == 0) {
			UCNHLGIK var24;
			if (var15.field1405 == -1 && var15.field1389 == null) {
				var24 = var15.method549(0, arg9, var10, var11, var12, var13, -1);
			} else {
				var24 = new EFJXCNIG(var13, var12, var15.field1405, var11, var10, arg9, arg2, true, 0);
			}

			arg1.method287(arg8, var14, 0, null, var24, field1107[arg9], arg7, var17, arg6, var16);

			if (var15.field1411) {
				arg5.method594(arg7, var15.field1418, arg9, arg4, arg6);
			}
		} else if (arg4 == 1) {
			UCNHLGIK var25;
			if (var15.field1405 == -1 && var15.field1389 == null) {
				var25 = var15.method549(1, arg9, var10, var11, var12, var13, -1);
			} else {
				var25 = new EFJXCNIG(var13, var12, var15.field1405, var11, var10, arg9, arg2, true, 1);
			}

			arg1.method287(arg8, var14, 0, null, var25, field1105[arg9], arg7, var17, arg6, var16);

			if (var15.field1411) {
				arg5.method594(arg7, var15.field1418, arg9, arg4, arg6);
			}
		} else if (arg4 == 2) {
			int var26 = arg9 + 1 & 0x3;
			UCNHLGIK var27;
			UCNHLGIK var28;
			if (var15.field1405 == -1 && var15.field1389 == null) {
				var27 = var15.method549(2, arg9 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method549(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new EFJXCNIG(var13, var12, var15.field1405, var11, var10, arg9 + 4, arg2, true, 2);
				var28 = new EFJXCNIG(var13, var12, var15.field1405, var11, var10, var26, arg2, true, 2);
			}

			arg1.method287(arg8, var14, field1107[var26], var28, var27, field1107[arg9], arg7, var17, arg6, var16);

			if (var15.field1411) {
				arg5.method594(arg7, var15.field1418, arg9, arg4, arg6);
			}
		} else if (arg4 == 3) {
			UCNHLGIK var29;
			if (var15.field1405 == -1 && var15.field1389 == null) {
				var29 = var15.method549(3, arg9, var10, var11, var12, var13, -1);
			} else {
				var29 = new EFJXCNIG(var13, var12, var15.field1405, var11, var10, arg9, arg2, true, 3);
			}

			arg1.method287(arg8, var14, 0, null, var29, field1105[arg9], arg7, var17, arg6, var16);

			if (var15.field1411) {
				arg5.method594(arg7, var15.field1418, arg9, arg4, arg6);
			}
		} else if (arg4 == 9) {
			UCNHLGIK var30;
			if (var15.field1405 == -1 && var15.field1389 == null) {
				var30 = var15.method549(arg4, arg9, var10, var11, var12, var13, -1);
			} else {
				var30 = new EFJXCNIG(var13, var12, var15.field1405, var11, var10, arg9, arg2, true, arg4);
			}

			arg1.method289(arg6, 0, arg8, 1, var30, var17, 1, var14, arg7, var16);

			if (var15.field1411) {
				arg5.method595(var15.field1418, var15.field1399, arg9, var15.field1408, arg6, arg7);
			}
		} else {
			if (var15.field1417) {
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

			if (arg4 == 4) {
				UCNHLGIK var35;
				if (var15.field1405 == -1 && var15.field1389 == null) {
					var35 = var15.method549(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new EFJXCNIG(var13, var12, var15.field1405, var11, var10, 0, arg2, true, 4);
				}

				arg1.method288(var14, 0, var17, var16, 0, arg8, arg6, var35, arg7, arg9 * 512, field1107[arg9]);
			} else if (arg4 == 5) {
				int var36 = 16;
				int var37 = arg1.method305(arg8, arg7, arg6);
				if (var37 > 0) {
					var36 = WEJSKHXC.method548(var37 >> 14 & 0x7FFF).field1383;
				}

				UCNHLGIK var38;
				if (var15.field1405 == -1 && var15.field1389 == null) {
					var38 = var15.method549(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new EFJXCNIG(var13, var12, var15.field1405, var11, var10, 0, arg2, true, 4);
				}

				arg1.method288(var14, field1121[arg9] * var36, var17, var16, field1108[arg9] * var36, arg8, arg6, var38, arg7, arg9 * 512, field1107[arg9]);
			} else if (arg4 == 6) {
				UCNHLGIK var39;
				if (var15.field1405 == -1 && var15.field1389 == null) {
					var39 = var15.method549(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new EFJXCNIG(var13, var12, var15.field1405, var11, var10, 0, arg2, true, 4);
				}

				arg1.method288(var14, 0, var17, var16, 0, arg8, arg6, var39, arg7, arg9, 256);
			} else if (arg4 == 7) {
				UCNHLGIK var40;
				if (var15.field1405 == -1 && var15.field1389 == null) {
					var40 = var15.method549(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new EFJXCNIG(var13, var12, var15.field1405, var11, var10, 0, arg2, true, 4);
				}

				arg1.method288(var14, 0, var17, var16, 0, arg8, arg6, var40, arg7, arg9, 512);
			} else if (arg4 == 8) {
				UCNHLGIK var41;
				if (var15.field1405 == -1 && var15.field1389 == null) {
					var41 = var15.method549(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new EFJXCNIG(var13, var12, var15.field1405, var11, var10, 0, arg2, true, 4);
				}

				arg1.method288(var14, 0, var17, var16, 0, arg8, arg6, var41, arg7, arg9, 768);
			}
		}
	}

	@ObfuscatedName("PMIXOPWJ.a(LFKUDHMAZ;B[LZGDLGUZR;)V")
	public final void method469(FKUDHMAZ arg0, ZGDLGUZR[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field1110[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field1110[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method596(var4, var5);
						}
					}
				}
			}
		}

		field1106 += (int) (Math.random() * 5.0D) - 2;
		if (field1106 < -8) {
			field1106 = -8;
		}

		if (field1106 > 8) {
			field1106 = 8;
		}

		field1114 += (int) (Math.random() * 5.0D) - 2;
		if (field1114 < -16) {
			field1114 = -16;
		}

		if (field1114 > 16) {
			field1114 = 16;
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
			for (int var16 = 1; var16 < field1128 - 1; var16++) {
				for (int var17 = 1; var17 < field1127 - 1; var17++) {
					int var18 = field1113[var7][var17 + 1][var16] - field1113[var7][var17 - 1][var16];
					int var19 = field1113[var7][var17][var16 + 1] - field1113[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field1111[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field1128; var26++) {
				field1116[var26] = 0;
				field1117[var26] = 0;
				field1118[var26] = 0;
				field1119[var26] = 0;
				field1120[var26] = 0;
			}

			for (int var27 = -5; var27 < field1127 + 5; var27++) {
				for (int var28 = 0; var28 < field1128; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field1127) {
						int var30 = field1123[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							HNBDHXHI var31 = HNBDHXHI.field823[var30 - 1];
							field1116[var28] += var31.field832;
							field1117[var28] += var31.field830;
							field1118[var28] += var31.field831;
							field1119[var28] += var31.field833;
							field1120[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field1127) {
						int var33 = field1123[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							HNBDHXHI var34 = HNBDHXHI.field823[var33 - 1];
							field1116[var28] -= var34.field832;
							field1117[var28] -= var34.field830;
							field1118[var28] -= var34.field831;
							field1119[var28] -= var34.field833;
							field1120[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field1127 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field1128 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field1128) {
							var35 += field1116[var41];
							var36 += field1117[var41];
							var37 += field1118[var41];
							var38 += field1119[var41];
							var39 += field1120[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field1128) {
							var35 -= field1116[var42];
							var36 -= field1117[var42];
							var37 -= field1118[var42];
							var38 -= field1119[var42];
							var39 -= field1120[var42];
						}

						if (var40 >= 1 && var40 < field1128 - 1 && (!field1115 || (field1110[0][var27][var40] & 0x2) != 0 || (field1110[var7][var27][var40] & 0x10) == 0 && method458(var7, var27, var40) == field1109)) {
							if (var7 < field1126) {
								field1126 = var7;
							}

							int var43 = field1123[var7][var27][var40] & 0xFF;
							int var44 = field1129[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field1113[var7][var27][var40];
								int var46 = field1113[var7][var27 + 1][var40];
								int var47 = field1113[var7][var27 + 1][var40 + 1];
								int var48 = field1113[var7][var27][var40 + 1];
								int var49 = field1111[var27][var40];
								int var50 = field1111[var27 + 1][var40];
								int var51 = field1111[var27 + 1][var40 + 1];
								int var52 = field1111[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method449(var55, var56, var57);
									var55 = field1106 + var55 & 0xFF;
									var57 += field1114;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method449(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field1112[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !HNBDHXHI.field823[var44 - 1].field828) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field1122[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = AOGYQUKT.field42[method457(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method284(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method457(var53, var49), method457(var53, var50), method457(var53, var51), method457(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field1112[var7][var27][var40] + 1;
									byte var61 = field1124[var7][var27][var40];
									HNBDHXHI var62 = HNBDHXHI.field823[var44 - 1];
									int var63 = var62.field826;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = AOGYQUKT.method13(var63);
										var65 = -1;
									} else if (var62.field825 == 0xFF00FF) {
										var65 = -2;
										var63 = -1;
										var64 = AOGYQUKT.field42[method453(var62.field834, 96)];
									} else {
										var65 = method449(var62.field829, var62.field830, var62.field831);
										var64 = AOGYQUKT.field42[method453(var62.field834, 96)];
									}

									arg0.method284(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method457(var53, var49), method457(var53, var50), method457(var53, var51), method457(var53, var52), method453(var65, var49), method453(var65, var50), method453(var65, var51), method453(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field1128 - 1; var66++) {
				for (int var67 = 1; var67 < field1127 - 1; var67++) {
					arg0.method283(var7, var67, var66, method458(var7, var67, var66));
				}
			}
		}

		arg0.method310(-50, -50, -10);

		for (int var68 = 0; var68 < field1127; var68++) {
			for (int var69 = 0; var69 < field1128; var69++) {
				if ((field1110[1][var68][var69] & 0x2) == 2) {
					arg0.method281(var69, var68);
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
				for (int var75 = 0; var75 <= field1128; var75++) {
					for (int var76 = 0; var76 <= field1127; var76++) {
						if ((field1122[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field1122[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field1128 && (field1122[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field1122[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field1122[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field1113[var80][var76][var77] - var84;
								int var86 = field1113[var79][var76][var77];
								FKUDHMAZ.method282(var86, var85, var78 * 128 + 128, var76 * 128, 1, var76 * 128, var77 * 128, var73);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field1122[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field1122[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field1122[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field1127 && (field1122[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field1122[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field1122[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field1113[var92][var89][var75] - var96;
								int var98 = field1113[var91][var89][var75];
								FKUDHMAZ.method282(var98, var97, var75 * 128, var89 * 128, 2, var90 * 128 + 128, var75 * 128, var73);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field1122[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field1122[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field1122[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field1128 && (field1122[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field1122[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field1127) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field1122[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field1113[var74][var101][var103];
								FKUDHMAZ.method282(var107, var107, var104 * 128 + 128, var101 * 128, 4, var102 * 128 + 128, var103 * 128, var73);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field1122[var74][var108][var109] &= ~var72;
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
