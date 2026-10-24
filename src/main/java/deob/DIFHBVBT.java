package deob;

@ObfuscatedName("DIFHBVBT")
public final class DIFHBVBT {

	@ObfuscatedName("DIFHBVBT.z")
	public int field523;

	@ObfuscatedName("DIFHBVBT.A")
	public int field524;

	@ObfuscatedName("DIFHBVBT.B")
	public int[][][] field525;

	@ObfuscatedName("DIFHBVBT.c")
	public byte[][][] field507;

	@ObfuscatedName("DIFHBVBT.h")
	public byte[][][] field510;

	@ObfuscatedName("DIFHBVBT.a")
	public byte[][][] field505;

	@ObfuscatedName("DIFHBVBT.C")
	public byte[][][] field526;

	@ObfuscatedName("DIFHBVBT.t")
	public byte[][][] field519;

	@ObfuscatedName("DIFHBVBT.D")
	public int[][][] field527;

	@ObfuscatedName("DIFHBVBT.H")
	public byte[][][] field529;

	@ObfuscatedName("DIFHBVBT.k")
	public int[][] field512;

	@ObfuscatedName("DIFHBVBT.n")
	public int[] field514;

	@ObfuscatedName("DIFHBVBT.o")
	public int[] field515;

	@ObfuscatedName("DIFHBVBT.p")
	public int[] field516;

	@ObfuscatedName("DIFHBVBT.q")
	public int[] field517;

	@ObfuscatedName("DIFHBVBT.r")
	public int[] field518;

	@ObfuscatedName("DIFHBVBT.b")
	public static final int[] field506 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("DIFHBVBT.d")
	public static final int[] field508 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("DIFHBVBT.j")
	public static final int[] field511 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("DIFHBVBT.x")
	public static boolean field521 = true;

	@ObfuscatedName("DIFHBVBT.y")
	public static int field522 = 99;

	@ObfuscatedName("DIFHBVBT.E")
	public static final int[] field528 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("DIFHBVBT.f")
	public static int field509 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("DIFHBVBT.v")
	public static int field520 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("DIFHBVBT.l")
	public static int field513;

	@ObfuscatedName("DIFHBVBT.a(LCFARFRSG;IIIIIII)V")
	public final void method234(CFARFRSG arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1 >= 0 && arg1 < 104 && arg3 >= 0 && arg3 < 104) {
			field507[arg5][arg1][arg3] = 0;
			while (true) {
				int var8 = arg0.method30();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg0.method30();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg5 == 0) {
						field525[0][arg1][arg3] = -var9 * 8;
						return;
					}

					field525[arg5][arg1][arg3] = field525[arg5 - 1][arg1][arg3] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field505[arg5][arg1][arg3] = arg0.method31();
					field526[arg5][arg1][arg3] = (byte) ((var8 - 2) / 4);
					field519[arg5][arg1][arg3] = (byte) (var8 + arg4 - 2 & 0x3);
				} else if (var8 <= 81) {
					field507[arg5][arg1][arg3] = (byte) (var8 - 49);
				} else {
					field510[arg5][arg1][arg3] = (byte) (var8 - 81);
				}
			}

			if (arg5 == 0) {
				field525[0][arg1][arg3] = -method245(arg1 + arg2 + 932731, arg3 + 556238 + arg6) * 8;
			} else {
				field525[arg5][arg1][arg3] = field525[arg5 - 1][arg1][arg3] - 240;
			}
		} else {
			while (true) {
				int var10 = arg0.method30();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg0.method30();
					return;
				}

				if (var10 <= 49) {
					arg0.method30();
				}
			}
		}
	}

	@ObfuscatedName("DIFHBVBT.a(III)I")
	public static final int method235(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method237(var3, var5);
		int var8 = method237(var3 + 1, var5);
		int var9 = method237(var3, var5 + 1);
		int var10 = method237(var3 + 1, var5 + 1);
		int var11 = method248(var7, var8, var4, arg2);
		int var12 = method248(var9, var10, var4, arg2);
		return method248(var11, var12, var6, arg2);
	}

	@ObfuscatedName("DIFHBVBT.a(IZIII)V")
	public final void method236(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg0; var5 <= arg0 + arg1; var5++) {
			for (int var6 = arg3; var6 <= arg2 + arg3; var6++) {
				if (var6 >= 0 && var6 < field523 && var5 >= 0 && var5 < field524) {
					field529[0][var6][var5] = 127;

					if (arg3 == var6 && var6 > 0) {
						field525[0][var6][var5] = field525[0][var6 - 1][var5];
					}

					if (arg2 + arg3 == var6 && var6 < field523 - 1) {
						field525[0][var6][var5] = field525[0][var6 + 1][var5];
					}

					if (arg0 == var5 && var5 > 0) {
						field525[0][var6][var5] = field525[0][var6][var5 - 1];
					}

					if (arg0 + arg1 == var5 && var5 < field524 - 1) {
						field525[0][var6][var5] = field525[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("DIFHBVBT.a(II)I")
	public static final int method237(int arg0, int arg1) {
		int var2 = method250(arg0 - 1, arg1 - 1) + method250(arg0 + 1, arg1 - 1) + method250(arg0 - 1, arg1 + 1) + method250(arg0 + 1, arg1 + 1);
		int var3 = method250(arg0 - 1, arg1) + method250(arg0 + 1, arg1) + method250(arg0, arg1 - 1) + method250(arg0, arg1 + 1);
		int var4 = method250(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("DIFHBVBT.b(II)I")
	public final int method238(int arg0, int arg1) {
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

	@ObfuscatedName("DIFHBVBT.a(LSIPXLNWG;IILHQFIXEZL;IIIII)V")
	public final void method239(SIPXLNWG arg0, int arg1, HQFIXEZL arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field521 && (field507[0][arg1][arg3] & 0x2) == 0) {
			if ((field507[arg4][arg1][arg3] & 0x10) != 0) {
				return;
			}

			if (method249(arg1, arg4, arg3) != field513) {
				return;
			}
		}

		if (arg4 < field522) {
			field522 = arg4;
		}

		int var9 = field525[arg4][arg1][arg3];
		int var10 = field525[arg4][arg1 + 1][arg3];
		int var11 = field525[arg4][arg1 + 1][arg3 + 1];
		int var12 = field525[arg4][arg1][arg3 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		QMZPELNG var14 = QMZPELNG.method486(arg5);
		int var15 = (arg5 << 14) + (arg3 << 7) + arg1 + 0x40000000;
		if (!var14.field1155) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg6 << 6) + arg7);
		if (arg7 == 22) {
			if (!field521 || var14.field1155 || var14.field1168) {
				CYZGZTKE var17;
				if (var14.field1169 == -1 && var14.field1143 == null) {
					var17 = var14.method478(22, arg6, var9, var10, var11, var12, -1);
				} else {
					var17 = new LPVEAYFU(true, var12, var9, var10, arg5, 22, arg6, var11, var14.field1169);
				}

				arg0.method502(var16, arg4, var13, var15, arg3, arg1, var17);

				if (var14.field1165 && var14.field1155 && arg2 != null) {
					arg2.method303(arg1, arg3);
				}
			}
		} else if (arg7 == 10 || arg7 == 11) {
			CYZGZTKE var18;
			if (var14.field1169 == -1 && var14.field1143 == null) {
				var18 = var14.method478(10, arg6, var9, var10, var11, var12, -1);
			} else {
				var18 = new LPVEAYFU(true, var12, var9, var10, arg5, 10, arg6, var11, var14.field1169);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg7 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg6 == 1 || arg6 == 3) {
					var20 = var14.field1142;
					var21 = var14.field1178;
				} else {
					var20 = var14.field1178;
					var21 = var14.field1142;
				}

				if (arg0.method506(arg3, arg1, var13, var15, var19, var18, var21, arg4, var20, var16) && var14.field1145) {
					LFTMDGKK var22;
					if (var18 instanceof LFTMDGKK) {
						var22 = (LFTMDGKK) var18;
					} else {
						var22 = var14.method478(10, arg6, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field844 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field529[arg4][arg1 + var23][arg3 + var24]) {
									field529[arg4][arg1 + var23][arg3 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field1165 && arg2 != null) {
				arg2.method302(arg3, arg1, var14.field1178, arg6, var14.field1142, var14.field1156);
			}
		} else if (arg7 >= 12) {
			CYZGZTKE var26;
			if (var14.field1169 == -1 && var14.field1143 == null) {
				var26 = var14.method478(arg7, arg6, var9, var10, var11, var12, -1);
			} else {
				var26 = new LPVEAYFU(true, var12, var9, var10, arg5, arg7, arg6, var11, var14.field1169);
			}

			arg0.method506(arg3, arg1, var13, var15, 0, var26, 1, arg4, 1, var16);

			if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg4 > 0) {
				field527[arg4][arg1][arg3] |= 0x924;
			}

			if (var14.field1165 && arg2 != null) {
				arg2.method302(arg3, arg1, var14.field1178, arg6, var14.field1142, var14.field1156);
			}
		} else if (arg7 == 0) {
			CYZGZTKE var27;
			if (var14.field1169 == -1 && var14.field1143 == null) {
				var27 = var14.method478(0, arg6, var9, var10, var11, var12, -1);
			} else {
				var27 = new LPVEAYFU(true, var12, var9, var10, arg5, 0, arg6, var11, var14.field1169);
			}

			arg0.method504(null, var15, var16, 0, var27, var13, arg1, arg4, arg3, field506[arg6]);

			if (arg6 == 0) {
				if (var14.field1145) {
					field529[arg4][arg1][arg3] = 50;
					field529[arg4][arg1][arg3 + 1] = 50;
				}

				if (var14.field1177) {
					field527[arg4][arg1][arg3] |= 0x249;
				}
			} else if (arg6 == 1) {
				if (var14.field1145) {
					field529[arg4][arg1][arg3 + 1] = 50;
					field529[arg4][arg1 + 1][arg3 + 1] = 50;
				}

				if (var14.field1177) {
					field527[arg4][arg1][arg3 + 1] |= 0x492;
				}
			} else if (arg6 == 2) {
				if (var14.field1145) {
					field529[arg4][arg1 + 1][arg3] = 50;
					field529[arg4][arg1 + 1][arg3 + 1] = 50;
				}

				if (var14.field1177) {
					field527[arg4][arg1 + 1][arg3] |= 0x249;
				}
			} else if (arg6 == 3) {
				if (var14.field1145) {
					field529[arg4][arg1][arg3] = 50;
					field529[arg4][arg1 + 1][arg3] = 50;
				}

				if (var14.field1177) {
					field527[arg4][arg1][arg3] |= 0x492;
				}
			}

			if (var14.field1165 && arg2 != null) {
				arg2.method301(arg7, arg1, var14.field1156, arg6, arg3);
			}

			if (var14.field1171 != 16) {
				arg0.method512(var14.field1171, arg3, arg4, arg1);
			}
		} else if (arg7 == 1) {
			CYZGZTKE var28;
			if (var14.field1169 == -1 && var14.field1143 == null) {
				var28 = var14.method478(1, arg6, var9, var10, var11, var12, -1);
			} else {
				var28 = new LPVEAYFU(true, var12, var9, var10, arg5, 1, arg6, var11, var14.field1169);
			}

			arg0.method504(null, var15, var16, 0, var28, var13, arg1, arg4, arg3, field528[arg6]);

			if (var14.field1145) {
				if (arg6 == 0) {
					field529[arg4][arg1][arg3 + 1] = 50;
				} else if (arg6 == 1) {
					field529[arg4][arg1 + 1][arg3 + 1] = 50;
				} else if (arg6 == 2) {
					field529[arg4][arg1 + 1][arg3] = 50;
				} else if (arg6 == 3) {
					field529[arg4][arg1][arg3] = 50;
				}
			}

			if (var14.field1165 && arg2 != null) {
				arg2.method301(arg7, arg1, var14.field1156, arg6, arg3);
			}
		} else if (arg7 == 2) {
			int var29 = arg6 + 1 & 0x3;
			CYZGZTKE var30;
			CYZGZTKE var31;
			if (var14.field1169 == -1 && var14.field1143 == null) {
				var30 = var14.method478(2, arg6 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method478(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new LPVEAYFU(true, var12, var9, var10, arg5, 2, arg6 + 4, var11, var14.field1169);
				var31 = new LPVEAYFU(true, var12, var9, var10, arg5, 2, var29, var11, var14.field1169);
			}

			arg0.method504(var31, var15, var16, field506[var29], var30, var13, arg1, arg4, arg3, field506[arg6]);

			if (var14.field1177) {
				if (arg6 == 0) {
					field527[arg4][arg1][arg3] |= 0x249;
					field527[arg4][arg1][arg3 + 1] |= 0x492;
				} else if (arg6 == 1) {
					field527[arg4][arg1][arg3 + 1] |= 0x492;
					field527[arg4][arg1 + 1][arg3] |= 0x249;
				} else if (arg6 == 2) {
					field527[arg4][arg1 + 1][arg3] |= 0x249;
					field527[arg4][arg1][arg3] |= 0x492;
				} else if (arg6 == 3) {
					field527[arg4][arg1][arg3] |= 0x492;
					field527[arg4][arg1][arg3] |= 0x249;
				}
			}

			if (var14.field1165 && arg2 != null) {
				arg2.method301(arg7, arg1, var14.field1156, arg6, arg3);
			}

			if (var14.field1171 != 16) {
				arg0.method512(var14.field1171, arg3, arg4, arg1);
			}
		} else if (arg7 == 3) {
			CYZGZTKE var32;
			if (var14.field1169 == -1 && var14.field1143 == null) {
				var32 = var14.method478(3, arg6, var9, var10, var11, var12, -1);
			} else {
				var32 = new LPVEAYFU(true, var12, var9, var10, arg5, 3, arg6, var11, var14.field1169);
			}

			arg0.method504(null, var15, var16, 0, var32, var13, arg1, arg4, arg3, field528[arg6]);

			if (var14.field1145) {
				if (arg6 == 0) {
					field529[arg4][arg1][arg3 + 1] = 50;
				} else if (arg6 == 1) {
					field529[arg4][arg1 + 1][arg3 + 1] = 50;
				} else if (arg6 == 2) {
					field529[arg4][arg1 + 1][arg3] = 50;
				} else if (arg6 == 3) {
					field529[arg4][arg1][arg3] = 50;
				}
			}

			if (var14.field1165 && arg2 != null) {
				arg2.method301(arg7, arg1, var14.field1156, arg6, arg3);
			}
		} else if (arg7 == 9) {
			CYZGZTKE var33;
			if (var14.field1169 == -1 && var14.field1143 == null) {
				var33 = var14.method478(arg7, arg6, var9, var10, var11, var12, -1);
			} else {
				var33 = new LPVEAYFU(true, var12, var9, var10, arg5, arg7, arg6, var11, var14.field1169);
			}

			arg0.method506(arg3, arg1, var13, var15, 0, var33, 1, arg4, 1, var16);

			if (var14.field1165 && arg2 != null) {
				arg2.method302(arg3, arg1, var14.field1178, arg6, var14.field1142, var14.field1156);
			}
		} else {
			if (var14.field1170) {
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

			if (arg7 == 4) {
				CYZGZTKE var38;
				if (var14.field1169 == -1 && var14.field1143 == null) {
					var38 = var14.method478(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new LPVEAYFU(true, var12, var9, var10, arg5, 4, 0, var11, var14.field1169);
				}

				arg0.method505(var13, arg1, arg4, var15, arg6 * 512, var16, var38, arg3, field506[arg6], 0, 0);
			} else if (arg7 == 5) {
				int var39 = 16;
				int var40 = arg0.method522(arg4, arg1, arg3);
				if (var40 > 0) {
					var39 = QMZPELNG.method486(var40 >> 14 & 0x7FFF).field1171;
				}

				CYZGZTKE var41;
				if (var14.field1169 == -1 && var14.field1143 == null) {
					var41 = var14.method478(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new LPVEAYFU(true, var12, var9, var10, arg5, 4, 0, var11, var14.field1169);
				}

				arg0.method505(var13, arg1, arg4, var15, arg6 * 512, var16, var41, arg3, field506[arg6], field508[arg6] * var39, field511[arg6] * var39);
			} else if (arg7 == 6) {
				CYZGZTKE var42;
				if (var14.field1169 == -1 && var14.field1143 == null) {
					var42 = var14.method478(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new LPVEAYFU(true, var12, var9, var10, arg5, 4, 0, var11, var14.field1169);
				}

				arg0.method505(var13, arg1, arg4, var15, arg6, var16, var42, arg3, 256, 0, 0);
			} else if (arg7 == 7) {
				CYZGZTKE var43;
				if (var14.field1169 == -1 && var14.field1143 == null) {
					var43 = var14.method478(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new LPVEAYFU(true, var12, var9, var10, arg5, 4, 0, var11, var14.field1169);
				}

				arg0.method505(var13, arg1, arg4, var15, arg6, var16, var43, arg3, 512, 0, 0);
			} else if (arg7 == 8) {
				CYZGZTKE var44;
				if (var14.field1169 == -1 && var14.field1143 == null) {
					var44 = var14.method478(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new LPVEAYFU(true, var12, var9, var10, arg5, 4, 0, var11, var14.field1169);
				}

				arg0.method505(var13, arg1, arg4, var15, arg6, var16, var44, arg3, 768, 0, 0);
			}
		}
	}

	public DIFHBVBT(int arg0, int arg1, int[][][] arg2, byte[][][] arg3) {
		field522 = 99;
		field523 = arg0;
		field524 = arg1;
		field525 = arg2;
		field507 = arg3;
		field510 = new byte[4][field523][field524];
		field505 = new byte[4][field523][field524];
		field526 = new byte[4][field523][field524];
		field519 = new byte[4][field523][field524];
		field527 = new int[4][field523 + 1][field524 + 1];
		field529 = new byte[4][field523 + 1][field524 + 1];
		field512 = new int[field523 + 1][field524 + 1];
		field514 = new int[field524];
		field515 = new int[field524];
		field516 = new int[field524];
		field517 = new int[field524];
		field518 = new int[field524];
	}

	@ObfuscatedName("DIFHBVBT.a(IZI[B)Z")
	public static final boolean method240(int arg0, int arg1, byte[] arg2) {
		boolean var3 = true;
		CFARFRSG var4 = new CFARFRSG(arg2);
		int var5 = -1;
		while (true) {
			int var6 = var4.method44();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method44();
					if (var9 == 0) {
						break;
					}

					var4.method30();
				} else {
					int var10 = var4.method44();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method30() >> 2;
					int var14 = arg1 + var12;
					int var15 = arg0 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						QMZPELNG var16 = QMZPELNG.method486(var5);
						if (var13 != 22 || !field521 || var16.field1155 || var16.field1168) {
							var3 &= var16.method479();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("DIFHBVBT.b(III)I")
	public final int method241(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("DIFHBVBT.a(II[[[IIIIILHQFIXEZL;ILSIPXLNWG;Z)V")
	public static final void method242(int arg0, int arg1, int[][][] arg2, int arg3, int arg4, int arg5, int arg6, HQFIXEZL arg7, int arg8, SIPXLNWG arg9) {
		int var10 = arg2[arg6][arg4][arg3];
		int var11 = arg2[arg6][arg4 + 1][arg3];
		int var12 = arg2[arg6][arg4 + 1][arg3 + 1];
		int var13 = arg2[arg6][arg4][arg3 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		QMZPELNG var15 = QMZPELNG.method486(arg1);
		int var16 = (arg1 << 14) + (arg3 << 7) + arg4 + 0x40000000;
		if (!var15.field1155) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg0 << 6) + arg8);
		if (arg8 == 22) {
			CYZGZTKE var18;
			if (var15.field1169 == -1 && var15.field1143 == null) {
				var18 = var15.method478(22, arg0, var10, var11, var12, var13, -1);
			} else {
				var18 = new LPVEAYFU(true, var13, var10, var11, arg1, 22, arg0, var12, var15.field1169);
			}

			arg9.method502(var17, arg5, var14, var16, arg3, arg4, var18);

			if (var15.field1165 && var15.field1155) {
				arg7.method303(arg4, arg3);
			}
		} else if (arg8 == 10 || arg8 == 11) {
			CYZGZTKE var19;
			if (var15.field1169 == -1 && var15.field1143 == null) {
				var19 = var15.method478(10, arg0, var10, var11, var12, var13, -1);
			} else {
				var19 = new LPVEAYFU(true, var13, var10, var11, arg1, 10, arg0, var12, var15.field1169);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg8 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg0 == 1 || arg0 == 3) {
					var21 = var15.field1142;
					var22 = var15.field1178;
				} else {
					var21 = var15.field1178;
					var22 = var15.field1142;
				}

				arg9.method506(arg3, arg4, var14, var16, var20, var19, var22, arg5, var21, var17);
			}

			if (var15.field1165) {
				arg7.method302(arg3, arg4, var15.field1178, arg0, var15.field1142, var15.field1156);
			}
		} else if (arg8 >= 12) {
			CYZGZTKE var23;
			if (var15.field1169 == -1 && var15.field1143 == null) {
				var23 = var15.method478(arg8, arg0, var10, var11, var12, var13, -1);
			} else {
				var23 = new LPVEAYFU(true, var13, var10, var11, arg1, arg8, arg0, var12, var15.field1169);
			}

			arg9.method506(arg3, arg4, var14, var16, 0, var23, 1, arg5, 1, var17);

			if (var15.field1165) {
				arg7.method302(arg3, arg4, var15.field1178, arg0, var15.field1142, var15.field1156);
			}
		} else if (arg8 == 0) {
			CYZGZTKE var24;
			if (var15.field1169 == -1 && var15.field1143 == null) {
				var24 = var15.method478(0, arg0, var10, var11, var12, var13, -1);
			} else {
				var24 = new LPVEAYFU(true, var13, var10, var11, arg1, 0, arg0, var12, var15.field1169);
			}

			arg9.method504(null, var16, var17, 0, var24, var14, arg4, arg5, arg3, field506[arg0]);

			if (var15.field1165) {
				arg7.method301(arg8, arg4, var15.field1156, arg0, arg3);
			}
		} else if (arg8 == 1) {
			CYZGZTKE var25;
			if (var15.field1169 == -1 && var15.field1143 == null) {
				var25 = var15.method478(1, arg0, var10, var11, var12, var13, -1);
			} else {
				var25 = new LPVEAYFU(true, var13, var10, var11, arg1, 1, arg0, var12, var15.field1169);
			}

			arg9.method504(null, var16, var17, 0, var25, var14, arg4, arg5, arg3, field528[arg0]);

			if (var15.field1165) {
				arg7.method301(arg8, arg4, var15.field1156, arg0, arg3);
			}
		} else if (arg8 == 2) {
			int var26 = arg0 + 1 & 0x3;
			CYZGZTKE var27;
			CYZGZTKE var28;
			if (var15.field1169 == -1 && var15.field1143 == null) {
				var27 = var15.method478(2, arg0 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method478(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new LPVEAYFU(true, var13, var10, var11, arg1, 2, arg0 + 4, var12, var15.field1169);
				var28 = new LPVEAYFU(true, var13, var10, var11, arg1, 2, var26, var12, var15.field1169);
			}

			arg9.method504(var28, var16, var17, field506[var26], var27, var14, arg4, arg5, arg3, field506[arg0]);

			if (var15.field1165) {
				arg7.method301(arg8, arg4, var15.field1156, arg0, arg3);
			}
		} else if (arg8 == 3) {
			CYZGZTKE var29;
			if (var15.field1169 == -1 && var15.field1143 == null) {
				var29 = var15.method478(3, arg0, var10, var11, var12, var13, -1);
			} else {
				var29 = new LPVEAYFU(true, var13, var10, var11, arg1, 3, arg0, var12, var15.field1169);
			}

			arg9.method504(null, var16, var17, 0, var29, var14, arg4, arg5, arg3, field528[arg0]);

			if (var15.field1165) {
				arg7.method301(arg8, arg4, var15.field1156, arg0, arg3);
			}
		} else if (arg8 == 9) {
			CYZGZTKE var30;
			if (var15.field1169 == -1 && var15.field1143 == null) {
				var30 = var15.method478(arg8, arg0, var10, var11, var12, var13, -1);
			} else {
				var30 = new LPVEAYFU(true, var13, var10, var11, arg1, arg8, arg0, var12, var15.field1169);
			}

			arg9.method506(arg3, arg4, var14, var16, 0, var30, 1, arg5, 1, var17);

			if (var15.field1165) {
				arg7.method302(arg3, arg4, var15.field1178, arg0, var15.field1142, var15.field1156);
			}
		} else {
			if (var15.field1170) {
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
				CYZGZTKE var35;
				if (var15.field1169 == -1 && var15.field1143 == null) {
					var35 = var15.method478(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new LPVEAYFU(true, var13, var10, var11, arg1, 4, 0, var12, var15.field1169);
				}

				arg9.method505(var14, arg4, arg5, var16, arg0 * 512, var17, var35, arg3, field506[arg0], 0, 0);
			} else if (arg8 == 5) {
				int var36 = 16;
				int var37 = arg9.method522(arg5, arg4, arg3);
				if (var37 > 0) {
					var36 = QMZPELNG.method486(var37 >> 14 & 0x7FFF).field1171;
				}

				CYZGZTKE var38;
				if (var15.field1169 == -1 && var15.field1143 == null) {
					var38 = var15.method478(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new LPVEAYFU(true, var13, var10, var11, arg1, 4, 0, var12, var15.field1169);
				}

				arg9.method505(var14, arg4, arg5, var16, arg0 * 512, var17, var38, arg3, field506[arg0], field508[arg0] * var36, field511[arg0] * var36);
			} else if (arg8 == 6) {
				CYZGZTKE var39;
				if (var15.field1169 == -1 && var15.field1143 == null) {
					var39 = var15.method478(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new LPVEAYFU(true, var13, var10, var11, arg1, 4, 0, var12, var15.field1169);
				}

				arg9.method505(var14, arg4, arg5, var16, arg0, var17, var39, arg3, 256, 0, 0);
			} else if (arg8 == 7) {
				CYZGZTKE var40;
				if (var15.field1169 == -1 && var15.field1143 == null) {
					var40 = var15.method478(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new LPVEAYFU(true, var13, var10, var11, arg1, 4, 0, var12, var15.field1169);
				}

				arg9.method505(var14, arg4, arg5, var16, arg0, var17, var40, arg3, 512, 0, 0);
			} else if (arg8 == 8) {
				CYZGZTKE var41;
				if (var15.field1169 == -1 && var15.field1143 == null) {
					var41 = var15.method478(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new LPVEAYFU(true, var13, var10, var11, arg1, 4, 0, var12, var15.field1169);
				}

				arg9.method505(var14, arg4, arg5, var16, arg0, var17, var41, arg3, 768, 0, 0);
			}
		}
	}

	@ObfuscatedName("DIFHBVBT.a(IZI)Z")
	public static final boolean method243(int arg0, int arg1) {
		QMZPELNG var2 = QMZPELNG.method486(arg0);

		if (arg1 == 11) {
			arg1 = 10;
		}

		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}

		return var2.method480(arg1);
	}

	@ObfuscatedName("DIFHBVBT.a(LCFARFRSG;LOBRIXRSB;I)V")
	public static final void method244(CFARFRSG arg0, OBRIXRSB arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method44();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			QMZPELNG var4 = QMZPELNG.method486(var2);
			var4.method488(arg1);

			while (true) {
				int var5 = arg0.method44();
				if (var5 == 0) {
					break;
				}

				arg0.method30();
			}
		}
	}

	@ObfuscatedName("DIFHBVBT.c(II)I")
	public static final int method245(int arg0, int arg1) {
		int var2 = method235(arg0 + 45365, arg1 + 91923, 4) + (method235(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method235(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("DIFHBVBT.a(I[BIZII[LHQFIXEZL;)V")
	public final void method246(int arg0, byte[] arg1, int arg2, int arg3, int arg4, HQFIXEZL[] arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg0 + var8 > 0 && arg0 + var8 < 103 && arg4 + var9 > 0 && arg4 + var9 < 103) {
						arg5[var7].field667[arg0 + var8][arg4 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		CFARFRSG var10 = new CFARFRSG(arg1);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method234(var10, arg0 + var12, arg2, arg4 + var13, 0, var11, arg3);
				}
			}
		}
	}

	@ObfuscatedName("DIFHBVBT.a(LSIPXLNWG;[LHQFIXEZL;B)V")
	public final void method247(SIPXLNWG arg0, HQFIXEZL[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field507[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field507[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method303(var4, var5);
						}
					}
				}
			}
		}

		field520 += (int) (Math.random() * 5.0D) - 2;
		if (field520 < -8) {
			field520 = -8;
		}

		if (field520 > 8) {
			field520 = 8;
		}

		field509 += (int) (Math.random() * 5.0D) - 2;
		if (field509 < -16) {
			field509 = -16;
		}

		if (field509 > 16) {
			field509 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field529[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field524 - 1; var16++) {
				for (int var17 = 1; var17 < field523 - 1; var17++) {
					int var18 = field525[var7][var17 + 1][var16] - field525[var7][var17 - 1][var16];
					int var19 = field525[var7][var17][var16 + 1] - field525[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field512[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field524; var26++) {
				field514[var26] = 0;
				field515[var26] = 0;
				field516[var26] = 0;
				field517[var26] = 0;
				field518[var26] = 0;
			}

			for (int var27 = -5; var27 < field523 + 5; var27++) {
				for (int var28 = 0; var28 < field524; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field523) {
						int var30 = field510[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							YOJCLTLA var31 = YOJCLTLA.field1472[var30 - 1];
							field514[var28] += var31.field1481;
							field515[var28] += var31.field1479;
							field516[var28] += var31.field1480;
							field517[var28] += var31.field1482;
							field518[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field523) {
						int var33 = field510[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							YOJCLTLA var34 = YOJCLTLA.field1472[var33 - 1];
							field514[var28] -= var34.field1481;
							field515[var28] -= var34.field1479;
							field516[var28] -= var34.field1480;
							field517[var28] -= var34.field1482;
							field518[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field523 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field524 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field524) {
							var35 += field514[var41];
							var36 += field515[var41];
							var37 += field516[var41];
							var38 += field517[var41];
							var39 += field518[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field524) {
							var35 -= field514[var42];
							var36 -= field515[var42];
							var37 -= field516[var42];
							var38 -= field517[var42];
							var39 -= field518[var42];
						}

						if (var40 >= 1 && var40 < field524 - 1 && (!field521 || (field507[0][var27][var40] & 0x2) != 0 || (field507[var7][var27][var40] & 0x10) == 0 && method249(var27, var7, var40) == field513)) {
							if (var7 < field522) {
								field522 = var7;
							}

							int var43 = field510[var7][var27][var40] & 0xFF;
							int var44 = field505[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field525[var7][var27][var40];
								int var46 = field525[var7][var27 + 1][var40];
								int var47 = field525[var7][var27 + 1][var40 + 1];
								int var48 = field525[var7][var27][var40 + 1];
								int var49 = field512[var27][var40];
								int var50 = field512[var27 + 1][var40];
								int var51 = field512[var27 + 1][var40 + 1];
								int var52 = field512[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method241(var55, var56, var57);
									var55 = field520 + var55 & 0xFF;
									var57 += field509;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method241(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field526[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !YOJCLTLA.field1472[var44 - 1].field1477) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field527[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = UJNRJRYE.field1300[method254(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method501(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method254(var53, var49), method254(var53, var50), method254(var53, var51), method254(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field526[var7][var27][var40] + 1;
									byte var61 = field519[var7][var27][var40];
									YOJCLTLA var62 = YOJCLTLA.field1472[var44 - 1];
									int var63 = var62.field1475;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = UJNRJRYE.method553(var63);
										var65 = -1;
									} else if (var62.field1474 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method241(var62.field1478, var62.field1479, var62.field1480);
										var64 = UJNRJRYE.field1300[method238(var62.field1483, 96)];
									}

									arg0.method501(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method254(var53, var49), method254(var53, var50), method254(var53, var51), method254(var53, var52), method238(var65, var49), method238(var65, var50), method238(var65, var51), method238(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field524 - 1; var66++) {
				for (int var67 = 1; var67 < field523 - 1; var67++) {
					arg0.method500(var7, var67, var66, method249(var67, var7, var66));
				}
			}
		}

		arg0.method527(-10, -50, -50, 768, 64);

		for (int var68 = 0; var68 < field523; var68++) {
			for (int var69 = 0; var69 < field524; var69++) {
				if ((field507[1][var68][var69] & 0x2) == 2) {
					arg0.method498(var69, var68);
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
				for (int var75 = 0; var75 <= field524; var75++) {
					for (int var76 = 0; var76 <= field523; var76++) {
						if ((field527[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field527[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field524 && (field527[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field527[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field527[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field525[var80][var76][var77] - var84;
								int var86 = field525[var79][var76][var77];
								SIPXLNWG.method499(var76 * 128, var86, var78 * 128 + 128, var73, var76 * 128, 1, var85, var77 * 128);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field527[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field527[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field527[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field523 && (field527[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field527[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field527[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field525[var92][var89][var75] - var96;
								int var98 = field525[var91][var89][var75];
								SIPXLNWG.method499(var90 * 128 + 128, var98, var75 * 128, var73, var89 * 128, 2, var97, var75 * 128);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field527[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field527[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field527[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field524 && (field527[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field527[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field523) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field527[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field525[var74][var101][var103];
								SIPXLNWG.method499(var102 * 128 + 128, var107, var104 * 128 + 128, var73, var101 * 128, 4, var107, var103 * 128);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field527[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("DIFHBVBT.a(IIII)I")
	public static final int method248(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - UJNRJRYE.field1289[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("DIFHBVBT.a(BIII)I")
	public int method249(int arg0, int arg1, int arg2) {
		if ((field507[arg1][arg0][arg2] & 0x8) != 0) {
			return 0;
		}

		if (arg1 > 0 && (field507[1][arg0][arg2] & 0x2) != 0) {
			return arg1 - 1;
		}

		return arg1;
	}

	@ObfuscatedName("DIFHBVBT.d(II)I")
	public static final int method250(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("DIFHBVBT.a([BI[LHQFIXEZL;IZIILSIPXLNWG;III)V")
	public final void method251(byte[] arg0, int arg1, HQFIXEZL[] arg2, int arg3, int arg4, int arg5, SIPXLNWG arg6, int arg7, int arg8, int arg9) {
		CFARFRSG var11 = new CFARFRSG(arg0);
		int var12 = -1;
		while (true) {
			int var13 = var11.method44();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method44();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method30();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg4 == var18 && var17 >= arg9 && var17 < arg9 + 8 && var16 >= arg1 && var16 < arg1 + 8) {
					QMZPELNG var22 = QMZPELNG.method486(var12);
					int var23 = arg5 + RGOEUNSS.method493(var21, var22.field1178, var17 & 0x7, var16 & 0x7, var22.field1142, arg8);
					int var24 = arg7 + RGOEUNSS.method494(var22.field1142, arg8, var22.field1178, var17 & 0x7, var21, var16 & 0x7);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg3;
						if ((field507[1][var23][var24] & 0x2) == 2) {
							var25 = arg3 - 1;
						}

						HQFIXEZL var26 = null;
						if (var25 >= 0) {
							var26 = arg2[var25];
						}

						method239(arg6, var23, var26, var24, arg3, var12, arg8 + var21 & 0x3, var20);
					}
				}
			}
		}
	}

	@ObfuscatedName("DIFHBVBT.a(III[BII[LHQFIXEZL;III)V")
	public final void method252(int arg0, int arg1, byte[] arg2, int arg3, int arg4, HQFIXEZL[] arg5, int arg6, int arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg7 + var10 > 0 && arg7 + var10 < 103 && arg8 + var11 > 0 && arg8 + var11 < 103) {
					arg5[arg3].field667[arg7 + var10][arg8 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		CFARFRSG var12 = new CFARFRSG(arg2);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg0 == var13 && var14 >= arg4 && var14 < arg4 + 8 && var15 >= arg1 && var15 < arg1 + 8) {
						method234(var12, arg7 + RGOEUNSS.method491(arg6, var15 & 0x7, var14 & 0x7), 0, arg8 + RGOEUNSS.method492(var15 & 0x7, var14 & 0x7, arg6), arg6, arg3, 0);
					} else {
						method234(var12, -1, 0, -1, 0, 0, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("DIFHBVBT.a(LSIPXLNWG;[LHQFIXEZL;[BIII)V")
	public final void method253(SIPXLNWG arg0, HQFIXEZL[] arg1, byte[] arg2, int arg3, int arg4) {
		CFARFRSG var6 = new CFARFRSG(arg2);
		int var7 = -1;
		while (true) {
			int var8 = var6.method44();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method44();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method30();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg4 + var12;
				int var18 = arg3 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field507[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					HQFIXEZL var20 = null;
					if (var19 >= 0) {
						var20 = arg1[var19];
					}

					method239(arg0, var17, var20, var18, var13, var7, var16, var15);
				}
			}
		}
	}

	@ObfuscatedName("DIFHBVBT.e(II)I")
	public static final int method254(int arg0, int arg1) {
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
}
