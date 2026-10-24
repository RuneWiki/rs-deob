package deob;

@ObfuscatedName("QJLJTPQV")
public final class QJLJTPQV {

	@ObfuscatedName("QJLJTPQV.F")
	public int field968;

	@ObfuscatedName("QJLJTPQV.G")
	public int field969;

	@ObfuscatedName("QJLJTPQV.e")
	public int[][][] field949;

	@ObfuscatedName("QJLJTPQV.w")
	public byte[][][] field961;

	@ObfuscatedName("QJLJTPQV.J")
	public byte[][][] field970;

	@ObfuscatedName("QJLJTPQV.n")
	public byte[][][] field953;

	@ObfuscatedName("QJLJTPQV.y")
	public byte[][][] field962;

	@ObfuscatedName("QJLJTPQV.a")
	public byte[][][] field946;

	@ObfuscatedName("QJLJTPQV.f")
	public int[][][] field950;

	@ObfuscatedName("QJLJTPQV.C")
	public byte[][][] field965;

	@ObfuscatedName("QJLJTPQV.m")
	public int[][] field952;

	@ObfuscatedName("QJLJTPQV.o")
	public int[] field954;

	@ObfuscatedName("QJLJTPQV.p")
	public int[] field955;

	@ObfuscatedName("QJLJTPQV.q")
	public int[] field956;

	@ObfuscatedName("QJLJTPQV.r")
	public int[] field957;

	@ObfuscatedName("QJLJTPQV.s")
	public int[] field958;

	@ObfuscatedName("QJLJTPQV.b")
	public static boolean field947 = true;

	@ObfuscatedName("QJLJTPQV.k")
	public static final int[] field951 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("QJLJTPQV.v")
	public static final int[] field960 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("QJLJTPQV.A")
	public static final int[] field963 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("QJLJTPQV.B")
	public static final int[] field964 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("QJLJTPQV.E")
	public static int field967 = 99;

	@ObfuscatedName("QJLJTPQV.d")
	public static int field948 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("QJLJTPQV.D")
	public static int field966 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("QJLJTPQV.u")
	public static int field959;

	@ObfuscatedName("QJLJTPQV.a(IIII)I")
	public static final int method406(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - VRKDWHDQ.field1268[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("QJLJTPQV.a([BIII)Z")
	public static final boolean method407(byte[] arg0, int arg1, int arg2) {
		boolean var3 = true;
		IMUIZRAF var4 = new IMUIZRAF(arg0);
		int var5 = -1;
		while (true) {
			int var6 = var4.method252();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method252();
					if (var9 == 0) {
						break;
					}

					var4.method238();
				} else {
					int var10 = var4.method252();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method238() >> 2;
					int var14 = arg1 + var12;
					int var15 = arg2 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						PZZVQRQI var16 = PZZVQRQI.method398(var5);
						if (var13 != 22 || !field947 || var16.field928 || var16.field925) {
							var3 &= var16.method401();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("QJLJTPQV.a([BIII[LWWMUUFBO;II)V")
	public final void method408(byte[] arg0, int arg1, int arg2, int arg3, WWMUUFBO[] arg4, int arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg1 + var8 > 0 && arg1 + var8 < 103 && arg2 + var9 > 0 && arg2 + var9 < 103) {
						arg4[var7].field1361[arg1 + var8][arg2 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		IMUIZRAF var10 = new IMUIZRAF(arg0);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method423(var10, arg3, 0, var11, arg1 + var12, arg5, arg2 + var13);
				}
			}
		}
	}

	public QJLJTPQV(int arg0, byte[][][] arg1, int arg2, int[][][] arg3) {
		field967 = 99;
		field968 = arg0;
		field969 = arg2;
		field949 = arg3;
		field961 = arg1;
		field970 = new byte[4][field968][field969];
		field953 = new byte[4][field968][field969];
		field962 = new byte[4][field968][field969];
		field946 = new byte[4][field968][field969];
		field950 = new int[4][field968 + 1][field969 + 1];
		field965 = new byte[4][field968 + 1][field969 + 1];
		field952 = new int[field968 + 1][field969 + 1];
		field954 = new int[field969];
		field955 = new int[field969];
		field956 = new int[field969];
		field957 = new int[field969];
		field958 = new int[field969];
	}

	@ObfuscatedName("QJLJTPQV.a(II)I")
	public final int method409(int arg0, int arg1) {
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

	@ObfuscatedName("QJLJTPQV.b(IIII)I")
	public int method410(int arg0, int arg1, int arg2) {
		if ((field961[arg2][arg0][arg1] & 0x8) != 0) {
			return 0;
		}

		if (arg2 > 0 && (field961[1][arg0][arg1] & 0x2) != 0) {
			return arg2 - 1;
		}

		return arg2;
	}

	@ObfuscatedName("QJLJTPQV.a(III[LWWMUUFBO;IIIII[B)V")
	public final void method411(int arg0, int arg1, WWMUUFBO[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg4 + var10 > 0 && arg4 + var10 < 103 && arg0 + var11 > 0 && arg0 + var11 < 103) {
					arg2[arg6].field1361[arg4 + var10][arg0 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		IMUIZRAF var12 = new IMUIZRAF(arg8);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg3 == var13 && var14 >= arg5 && var14 < arg5 + 8 && var15 >= arg7 && var15 < arg7 + 8) {
						method423(var12, 0, arg1, arg6, arg4 + YYAQTPDX.method586(var15 & 0x7, arg1, var14 & 0x7), 0, arg0 + YYAQTPDX.method587(var15 & 0x7, arg1, var14 & 0x7));
					} else {
						method423(var12, 0, 0, 0, -1, 0, -1);
					}
				}
			}
		}
	}

	@ObfuscatedName("QJLJTPQV.a(IIILLIOYHOWO;IIIILWWMUUFBO;)V")
	public final void method412(int arg0, int arg1, int arg2, LIOYHOWO arg3, int arg4, int arg5, int arg6, WWMUUFBO arg7) {
		if (field947 && (field961[0][arg2][arg4] & 0x2) == 0) {
			if ((field961[arg0][arg2][arg4] & 0x10) != 0) {
				return;
			}

			if (method410(arg2, arg4, arg0) != field959) {
				return;
			}
		}

		if (arg0 < field967) {
			field967 = arg0;
		}

		int var9 = field949[arg0][arg2][arg4];
		int var10 = field949[arg0][arg2 + 1][arg4];
		int var11 = field949[arg0][arg2 + 1][arg4 + 1];
		int var12 = field949[arg0][arg2][arg4 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		PZZVQRQI var14 = PZZVQRQI.method398(arg1);
		int var15 = (arg1 << 14) + (arg4 << 7) + arg2 + 0x40000000;
		if (!var14.field928) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg6 << 6) + arg5);
		if (arg5 == 22) {
			if (!field947 || var14.field928 || var14.field925) {
				AOBGXKOU var17;
				if (var14.field899 == -1 && var14.field915 == null) {
					var17 = var14.method405(22, arg6, var9, var10, var11, var12, -1);
				} else {
					var17 = new EZOFESYN(arg6, true, var10, var12, var11, var9, arg1, var14.field899, 22);
				}

				arg3.method331(arg2, var16, var15, arg0, arg4, var17, var13);

				if (var14.field943 && var14.field928 && arg7 != null) {
					arg7.method531(arg4, arg2);
				}
			}
		} else if (arg5 == 10 || arg5 == 11) {
			AOBGXKOU var18;
			if (var14.field899 == -1 && var14.field915 == null) {
				var18 = var14.method405(10, arg6, var9, var10, var11, var12, -1);
			} else {
				var18 = new EZOFESYN(arg6, true, var10, var12, var11, var9, arg1, var14.field899, 10);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg5 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg6 == 1 || arg6 == 3) {
					var20 = var14.field913;
					var21 = var14.field939;
				} else {
					var20 = var14.field939;
					var21 = var14.field913;
				}

				if (arg3.method335(var16, var13, arg0, var18, var19, var21, arg4, var15, arg2, var20) && var14.field923) {
					YABPKWWG var22;
					if (var18 instanceof YABPKWWG) {
						var22 = (YABPKWWG) var18;
					} else {
						var22 = var14.method405(10, arg6, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field1407 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field965[arg0][arg2 + var23][arg4 + var24]) {
									field965[arg0][arg2 + var23][arg4 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field943 && arg7 != null) {
				arg7.method530(arg6, var14.field939, arg2, var14.field913, var14.field936, arg4);
			}
		} else if (arg5 >= 12) {
			AOBGXKOU var26;
			if (var14.field899 == -1 && var14.field915 == null) {
				var26 = var14.method405(arg5, arg6, var9, var10, var11, var12, -1);
			} else {
				var26 = new EZOFESYN(arg6, true, var10, var12, var11, var9, arg1, var14.field899, arg5);
			}

			arg3.method335(var16, var13, arg0, var26, 0, 1, arg4, var15, arg2, 1);

			if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
				field950[arg0][arg2][arg4] |= 0x924;
			}

			if (var14.field943 && arg7 != null) {
				arg7.method530(arg6, var14.field939, arg2, var14.field913, var14.field936, arg4);
			}
		} else if (arg5 == 0) {
			AOBGXKOU var27;
			if (var14.field899 == -1 && var14.field915 == null) {
				var27 = var14.method405(0, arg6, var9, var10, var11, var12, -1);
			} else {
				var27 = new EZOFESYN(arg6, true, var10, var12, var11, var9, arg1, var14.field899, 0);
			}

			arg3.method333(arg0, field951[arg6], arg4, 0, var27, arg2, var15, null, var13, var16);

			if (arg6 == 0) {
				if (var14.field923) {
					field965[arg0][arg2][arg4] = 50;
					field965[arg0][arg2][arg4 + 1] = 50;
				}

				if (var14.field937) {
					field950[arg0][arg2][arg4] |= 0x249;
				}
			} else if (arg6 == 1) {
				if (var14.field923) {
					field965[arg0][arg2][arg4 + 1] = 50;
					field965[arg0][arg2 + 1][arg4 + 1] = 50;
				}

				if (var14.field937) {
					field950[arg0][arg2][arg4 + 1] |= 0x492;
				}
			} else if (arg6 == 2) {
				if (var14.field923) {
					field965[arg0][arg2 + 1][arg4] = 50;
					field965[arg0][arg2 + 1][arg4 + 1] = 50;
				}

				if (var14.field937) {
					field950[arg0][arg2 + 1][arg4] |= 0x249;
				}
			} else if (arg6 == 3) {
				if (var14.field923) {
					field965[arg0][arg2][arg4] = 50;
					field965[arg0][arg2 + 1][arg4] = 50;
				}

				if (var14.field937) {
					field950[arg0][arg2][arg4] |= 0x492;
				}
			}

			if (var14.field943 && arg7 != null) {
				arg7.method529(arg2, arg5, arg6, arg4, var14.field936);
			}

			if (var14.field911 != 16) {
				arg3.method341(arg4, arg2, arg0, var14.field911);
			}
		} else if (arg5 == 1) {
			AOBGXKOU var28;
			if (var14.field899 == -1 && var14.field915 == null) {
				var28 = var14.method405(1, arg6, var9, var10, var11, var12, -1);
			} else {
				var28 = new EZOFESYN(arg6, true, var10, var12, var11, var9, arg1, var14.field899, 1);
			}

			arg3.method333(arg0, field960[arg6], arg4, 0, var28, arg2, var15, null, var13, var16);

			if (var14.field923) {
				if (arg6 == 0) {
					field965[arg0][arg2][arg4 + 1] = 50;
				} else if (arg6 == 1) {
					field965[arg0][arg2 + 1][arg4 + 1] = 50;
				} else if (arg6 == 2) {
					field965[arg0][arg2 + 1][arg4] = 50;
				} else if (arg6 == 3) {
					field965[arg0][arg2][arg4] = 50;
				}
			}

			if (var14.field943 && arg7 != null) {
				arg7.method529(arg2, arg5, arg6, arg4, var14.field936);
			}
		} else if (arg5 == 2) {
			int var29 = arg6 + 1 & 0x3;
			AOBGXKOU var30;
			AOBGXKOU var31;
			if (var14.field899 == -1 && var14.field915 == null) {
				var30 = var14.method405(2, arg6 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method405(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new EZOFESYN(arg6 + 4, true, var10, var12, var11, var9, arg1, var14.field899, 2);
				var31 = new EZOFESYN(var29, true, var10, var12, var11, var9, arg1, var14.field899, 2);
			}

			arg3.method333(arg0, field951[arg6], arg4, field951[var29], var30, arg2, var15, var31, var13, var16);

			if (var14.field937) {
				if (arg6 == 0) {
					field950[arg0][arg2][arg4] |= 0x249;
					field950[arg0][arg2][arg4 + 1] |= 0x492;
				} else if (arg6 == 1) {
					field950[arg0][arg2][arg4 + 1] |= 0x492;
					field950[arg0][arg2 + 1][arg4] |= 0x249;
				} else if (arg6 == 2) {
					field950[arg0][arg2 + 1][arg4] |= 0x249;
					field950[arg0][arg2][arg4] |= 0x492;
				} else if (arg6 == 3) {
					field950[arg0][arg2][arg4] |= 0x492;
					field950[arg0][arg2][arg4] |= 0x249;
				}
			}

			if (var14.field943 && arg7 != null) {
				arg7.method529(arg2, arg5, arg6, arg4, var14.field936);
			}

			if (var14.field911 != 16) {
				arg3.method341(arg4, arg2, arg0, var14.field911);
			}
		} else if (arg5 == 3) {
			AOBGXKOU var32;
			if (var14.field899 == -1 && var14.field915 == null) {
				var32 = var14.method405(3, arg6, var9, var10, var11, var12, -1);
			} else {
				var32 = new EZOFESYN(arg6, true, var10, var12, var11, var9, arg1, var14.field899, 3);
			}

			arg3.method333(arg0, field960[arg6], arg4, 0, var32, arg2, var15, null, var13, var16);

			if (var14.field923) {
				if (arg6 == 0) {
					field965[arg0][arg2][arg4 + 1] = 50;
				} else if (arg6 == 1) {
					field965[arg0][arg2 + 1][arg4 + 1] = 50;
				} else if (arg6 == 2) {
					field965[arg0][arg2 + 1][arg4] = 50;
				} else if (arg6 == 3) {
					field965[arg0][arg2][arg4] = 50;
				}
			}

			if (var14.field943 && arg7 != null) {
				arg7.method529(arg2, arg5, arg6, arg4, var14.field936);
			}
		} else if (arg5 == 9) {
			AOBGXKOU var33;
			if (var14.field899 == -1 && var14.field915 == null) {
				var33 = var14.method405(arg5, arg6, var9, var10, var11, var12, -1);
			} else {
				var33 = new EZOFESYN(arg6, true, var10, var12, var11, var9, arg1, var14.field899, arg5);
			}

			arg3.method335(var16, var13, arg0, var33, 0, 1, arg4, var15, arg2, 1);

			if (var14.field943 && arg7 != null) {
				arg7.method530(arg6, var14.field939, arg2, var14.field913, var14.field936, arg4);
			}
		} else {
			if (var14.field905) {
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

			if (arg5 == 4) {
				AOBGXKOU var38;
				if (var14.field899 == -1 && var14.field915 == null) {
					var38 = var14.method405(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new EZOFESYN(0, true, var10, var12, var11, var9, arg1, var14.field899, 4);
				}

				arg3.method334(var16, var15, arg4, field951[arg6], var13, arg6 * 512, 0, 0, arg0, var38, arg2);
			} else if (arg5 == 5) {
				int var39 = 16;
				int var40 = arg3.method351(arg0, arg2, arg4);
				if (var40 > 0) {
					var39 = PZZVQRQI.method398(var40 >> 14 & 0x7FFF).field911;
				}

				AOBGXKOU var41;
				if (var14.field899 == -1 && var14.field915 == null) {
					var41 = var14.method405(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new EZOFESYN(0, true, var10, var12, var11, var9, arg1, var14.field899, 4);
				}

				arg3.method334(var16, var15, arg4, field951[arg6], var13, arg6 * 512, field963[arg6] * var39, field964[arg6] * var39, arg0, var41, arg2);
			} else if (arg5 == 6) {
				AOBGXKOU var42;
				if (var14.field899 == -1 && var14.field915 == null) {
					var42 = var14.method405(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new EZOFESYN(0, true, var10, var12, var11, var9, arg1, var14.field899, 4);
				}

				arg3.method334(var16, var15, arg4, 256, var13, arg6, 0, 0, arg0, var42, arg2);
			} else if (arg5 == 7) {
				AOBGXKOU var43;
				if (var14.field899 == -1 && var14.field915 == null) {
					var43 = var14.method405(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new EZOFESYN(0, true, var10, var12, var11, var9, arg1, var14.field899, 4);
				}

				arg3.method334(var16, var15, arg4, 512, var13, arg6, 0, 0, arg0, var43, arg2);
			} else if (arg5 == 8) {
				AOBGXKOU var44;
				if (var14.field899 == -1 && var14.field915 == null) {
					var44 = var14.method405(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new EZOFESYN(0, true, var10, var12, var11, var9, arg1, var14.field899, 4);
				}

				arg3.method334(var16, var15, arg4, 768, var13, arg6, 0, 0, arg0, var44, arg2);
			}
		}
	}

	@ObfuscatedName("QJLJTPQV.a(III)I")
	public final int method413(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("QJLJTPQV.a(LLIOYHOWO;I[BI[LWWMUUFBO;I)V")
	public final void method414(LIOYHOWO arg0, byte[] arg1, int arg2, WWMUUFBO[] arg3, int arg4) {
		IMUIZRAF var6 = new IMUIZRAF(arg1);
		int var7 = -1;
		while (true) {
			int var8 = var6.method252();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method252();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method238();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg2 + var12;
				int var18 = arg4 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field961[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					WWMUUFBO var20 = null;
					if (var19 >= 0) {
						var20 = arg3[var19];
					}

					method412(var13, var7, var17, arg0, var18, var15, var16, var20);
				}
			}
		}
	}

	@ObfuscatedName("QJLJTPQV.a(ILIMUIZRAF;LTDBJVJCU;)V")
	public static final void method415(IMUIZRAF arg0, TDBJVJCU arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method252();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			PZZVQRQI var4 = PZZVQRQI.method398(var2);
			var4.method396(arg1);

			while (true) {
				int var5 = arg0.method252();
				if (var5 == 0) {
					break;
				}

				arg0.method238();
			}
		}
	}

	@ObfuscatedName("QJLJTPQV.b(II)I")
	public static final int method416(int arg0, int arg1) {
		int var2 = method421(arg0 - 1, arg1 - 1) + method421(arg0 + 1, arg1 - 1) + method421(arg0 - 1, arg1 + 1) + method421(arg0 + 1, arg1 + 1);
		int var3 = method421(arg0 - 1, arg1) + method421(arg0 + 1, arg1) + method421(arg0, arg1 - 1) + method421(arg0, arg1 + 1);
		int var4 = method421(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("QJLJTPQV.a(I[[[IIILWWMUUFBO;IIIIILLIOYHOWO;)V")
	public static final void method417(int arg0, int[][][] arg1, int arg2, int arg3, WWMUUFBO arg4, int arg5, int arg6, int arg7, int arg8, LIOYHOWO arg9) {
		int var10 = arg1[arg2][arg0][arg6];
		int var11 = arg1[arg2][arg0 + 1][arg6];
		int var12 = arg1[arg2][arg0 + 1][arg6 + 1];
		int var13 = arg1[arg2][arg0][arg6 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		PZZVQRQI var15 = PZZVQRQI.method398(arg7);
		int var16 = (arg7 << 14) + (arg6 << 7) + arg0 + 0x40000000;
		if (!var15.field928) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg3 << 6) + arg5);
		if (arg5 == 22) {
			AOBGXKOU var18;
			if (var15.field899 == -1 && var15.field915 == null) {
				var18 = var15.method405(22, arg3, var10, var11, var12, var13, -1);
			} else {
				var18 = new EZOFESYN(arg3, true, var11, var13, var12, var10, arg7, var15.field899, 22);
			}

			arg9.method331(arg0, var17, var16, arg8, arg6, var18, var14);

			if (var15.field943 && var15.field928) {
				arg4.method531(arg6, arg0);
			}
		} else if (arg5 == 10 || arg5 == 11) {
			AOBGXKOU var19;
			if (var15.field899 == -1 && var15.field915 == null) {
				var19 = var15.method405(10, arg3, var10, var11, var12, var13, -1);
			} else {
				var19 = new EZOFESYN(arg3, true, var11, var13, var12, var10, arg7, var15.field899, 10);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg5 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg3 == 1 || arg3 == 3) {
					var21 = var15.field913;
					var22 = var15.field939;
				} else {
					var21 = var15.field939;
					var22 = var15.field913;
				}

				arg9.method335(var17, var14, arg8, var19, var20, var22, arg6, var16, arg0, var21);
			}

			if (var15.field943) {
				arg4.method530(arg3, var15.field939, arg0, var15.field913, var15.field936, arg6);
			}
		} else if (arg5 >= 12) {
			AOBGXKOU var23;
			if (var15.field899 == -1 && var15.field915 == null) {
				var23 = var15.method405(arg5, arg3, var10, var11, var12, var13, -1);
			} else {
				var23 = new EZOFESYN(arg3, true, var11, var13, var12, var10, arg7, var15.field899, arg5);
			}

			arg9.method335(var17, var14, arg8, var23, 0, 1, arg6, var16, arg0, 1);

			if (var15.field943) {
				arg4.method530(arg3, var15.field939, arg0, var15.field913, var15.field936, arg6);
			}
		} else if (arg5 == 0) {
			AOBGXKOU var24;
			if (var15.field899 == -1 && var15.field915 == null) {
				var24 = var15.method405(0, arg3, var10, var11, var12, var13, -1);
			} else {
				var24 = new EZOFESYN(arg3, true, var11, var13, var12, var10, arg7, var15.field899, 0);
			}

			arg9.method333(arg8, field951[arg3], arg6, 0, var24, arg0, var16, null, var14, var17);

			if (var15.field943) {
				arg4.method529(arg0, arg5, arg3, arg6, var15.field936);
			}
		} else if (arg5 == 1) {
			AOBGXKOU var25;
			if (var15.field899 == -1 && var15.field915 == null) {
				var25 = var15.method405(1, arg3, var10, var11, var12, var13, -1);
			} else {
				var25 = new EZOFESYN(arg3, true, var11, var13, var12, var10, arg7, var15.field899, 1);
			}

			arg9.method333(arg8, field960[arg3], arg6, 0, var25, arg0, var16, null, var14, var17);

			if (var15.field943) {
				arg4.method529(arg0, arg5, arg3, arg6, var15.field936);
			}
		} else if (arg5 == 2) {
			int var26 = arg3 + 1 & 0x3;
			AOBGXKOU var27;
			AOBGXKOU var28;
			if (var15.field899 == -1 && var15.field915 == null) {
				var27 = var15.method405(2, arg3 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method405(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new EZOFESYN(arg3 + 4, true, var11, var13, var12, var10, arg7, var15.field899, 2);
				var28 = new EZOFESYN(var26, true, var11, var13, var12, var10, arg7, var15.field899, 2);
			}

			arg9.method333(arg8, field951[arg3], arg6, field951[var26], var27, arg0, var16, var28, var14, var17);

			if (var15.field943) {
				arg4.method529(arg0, arg5, arg3, arg6, var15.field936);
			}
		} else if (arg5 == 3) {
			AOBGXKOU var29;
			if (var15.field899 == -1 && var15.field915 == null) {
				var29 = var15.method405(3, arg3, var10, var11, var12, var13, -1);
			} else {
				var29 = new EZOFESYN(arg3, true, var11, var13, var12, var10, arg7, var15.field899, 3);
			}

			arg9.method333(arg8, field960[arg3], arg6, 0, var29, arg0, var16, null, var14, var17);

			if (var15.field943) {
				arg4.method529(arg0, arg5, arg3, arg6, var15.field936);
			}
		} else if (arg5 == 9) {
			AOBGXKOU var30;
			if (var15.field899 == -1 && var15.field915 == null) {
				var30 = var15.method405(arg5, arg3, var10, var11, var12, var13, -1);
			} else {
				var30 = new EZOFESYN(arg3, true, var11, var13, var12, var10, arg7, var15.field899, arg5);
			}

			arg9.method335(var17, var14, arg8, var30, 0, 1, arg6, var16, arg0, 1);

			if (var15.field943) {
				arg4.method530(arg3, var15.field939, arg0, var15.field913, var15.field936, arg6);
			}
		} else {
			if (var15.field905) {
				if (arg3 == 1) {
					int var31 = var13;
					var13 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var31;
				} else if (arg3 == 2) {
					int var32 = var13;
					var13 = var11;
					var11 = var32;
					int var33 = var12;
					var12 = var10;
					var10 = var33;
				} else if (arg3 == 3) {
					int var34 = var13;
					var13 = var10;
					var10 = var11;
					var11 = var12;
					var12 = var34;
				}
			}

			if (arg5 == 4) {
				AOBGXKOU var35;
				if (var15.field899 == -1 && var15.field915 == null) {
					var35 = var15.method405(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new EZOFESYN(0, true, var11, var13, var12, var10, arg7, var15.field899, 4);
				}

				arg9.method334(var17, var16, arg6, field951[arg3], var14, arg3 * 512, 0, 0, arg8, var35, arg0);
			} else if (arg5 == 5) {
				int var36 = 16;
				int var37 = arg9.method351(arg8, arg0, arg6);
				if (var37 > 0) {
					var36 = PZZVQRQI.method398(var37 >> 14 & 0x7FFF).field911;
				}

				AOBGXKOU var38;
				if (var15.field899 == -1 && var15.field915 == null) {
					var38 = var15.method405(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new EZOFESYN(0, true, var11, var13, var12, var10, arg7, var15.field899, 4);
				}

				arg9.method334(var17, var16, arg6, field951[arg3], var14, arg3 * 512, field963[arg3] * var36, field964[arg3] * var36, arg8, var38, arg0);
			} else if (arg5 == 6) {
				AOBGXKOU var39;
				if (var15.field899 == -1 && var15.field915 == null) {
					var39 = var15.method405(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new EZOFESYN(0, true, var11, var13, var12, var10, arg7, var15.field899, 4);
				}

				arg9.method334(var17, var16, arg6, 256, var14, arg3, 0, 0, arg8, var39, arg0);
			} else if (arg5 == 7) {
				AOBGXKOU var40;
				if (var15.field899 == -1 && var15.field915 == null) {
					var40 = var15.method405(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new EZOFESYN(0, true, var11, var13, var12, var10, arg7, var15.field899, 4);
				}

				arg9.method334(var17, var16, arg6, 512, var14, arg3, 0, 0, arg8, var40, arg0);
			} else if (arg5 == 8) {
				AOBGXKOU var41;
				if (var15.field899 == -1 && var15.field915 == null) {
					var41 = var15.method405(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new EZOFESYN(0, true, var11, var13, var12, var10, arg7, var15.field899, 4);
				}

				arg9.method334(var17, var16, arg6, 768, var14, arg3, 0, 0, arg8, var41, arg0);
			}
		}
	}

	@ObfuscatedName("QJLJTPQV.c(II)I")
	public static final int method418(int arg0, int arg1) {
		int var2 = method426(arg0 + 45365, arg1 + 91923, 4) + (method426(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method426(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("QJLJTPQV.d(II)I")
	public static final int method419(int arg0, int arg1) {
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

	@ObfuscatedName("QJLJTPQV.a(I[LWWMUUFBO;IBIIILLIOYHOWO;II[B)V")
	public final void method420(int arg0, WWMUUFBO[] arg1, int arg2, int arg3, int arg4, int arg5, LIOYHOWO arg6, int arg7, int arg8, byte[] arg9) {
		IMUIZRAF var11 = new IMUIZRAF(arg9);
		int var12 = -1;
		while (true) {
			int var13 = var11.method252();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method252();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method238();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg4 == var18 && var17 >= arg2 && var17 < arg2 + 8 && var16 >= arg7 && var16 < arg7 + 8) {
					PZZVQRQI var22 = PZZVQRQI.method398(var12);
					int var23 = arg0 + YYAQTPDX.method588(var16 & 0x7, var22.field913, var17 & 0x7, var22.field939, arg3);
					int var24 = arg8 + YYAQTPDX.method589(var17 & 0x7, var16 & 0x7, arg3, var22.field939, var22.field913);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg5;
						if ((field961[1][var23][var24] & 0x2) == 2) {
							var25 = arg5 - 1;
						}

						WWMUUFBO var26 = null;
						if (var25 >= 0) {
							var26 = arg1[var25];
						}

						method412(arg5, var12, var23, arg6, var24, var20, arg3 + var21 & 0x3, var26);
					}
				}
			}
		}
	}

	@ObfuscatedName("QJLJTPQV.e(II)I")
	public static final int method421(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("QJLJTPQV.a(LLIOYHOWO;[LWWMUUFBO;I)V")
	public final void method422(LIOYHOWO arg0, WWMUUFBO[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field961[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field961[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method531(var5, var4);
						}
					}
				}
			}
		}

		field966 += (int) (Math.random() * 5.0D) - 2;
		if (field966 < -8) {
			field966 = -8;
		}

		if (field966 > 8) {
			field966 = 8;
		}

		field948 += (int) (Math.random() * 5.0D) - 2;
		if (field948 < -16) {
			field948 = -16;
		}

		if (field948 > 16) {
			field948 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field965[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field969 - 1; var16++) {
				for (int var17 = 1; var17 < field968 - 1; var17++) {
					int var18 = field949[var7][var17 + 1][var16] - field949[var7][var17 - 1][var16];
					int var19 = field949[var7][var17][var16 + 1] - field949[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field952[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field969; var26++) {
				field954[var26] = 0;
				field955[var26] = 0;
				field956[var26] = 0;
				field957[var26] = 0;
				field958[var26] = 0;
			}

			for (int var27 = -5; var27 < field968 + 5; var27++) {
				for (int var28 = 0; var28 < field969; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field968) {
						int var30 = field970[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							GQFZPMGS var31 = GQFZPMGS.field647[var30 - 1];
							field954[var28] += var31.field656;
							field955[var28] += var31.field654;
							field956[var28] += var31.field655;
							field957[var28] += var31.field657;
							field958[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field968) {
						int var33 = field970[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							GQFZPMGS var34 = GQFZPMGS.field647[var33 - 1];
							field954[var28] -= var34.field656;
							field955[var28] -= var34.field654;
							field956[var28] -= var34.field655;
							field957[var28] -= var34.field657;
							field958[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field968 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field969 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field969) {
							var35 += field954[var41];
							var36 += field955[var41];
							var37 += field956[var41];
							var38 += field957[var41];
							var39 += field958[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field969) {
							var35 -= field954[var42];
							var36 -= field955[var42];
							var37 -= field956[var42];
							var38 -= field957[var42];
							var39 -= field958[var42];
						}

						if (var40 >= 1 && var40 < field969 - 1 && (!field947 || (field961[0][var27][var40] & 0x2) != 0 || (field961[var7][var27][var40] & 0x10) == 0 && method410(var27, var40, var7) == field959)) {
							if (var7 < field967) {
								field967 = var7;
							}

							int var43 = field970[var7][var27][var40] & 0xFF;
							int var44 = field953[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field949[var7][var27][var40];
								int var46 = field949[var7][var27 + 1][var40];
								int var47 = field949[var7][var27 + 1][var40 + 1];
								int var48 = field949[var7][var27][var40 + 1];
								int var49 = field952[var27][var40];
								int var50 = field952[var27 + 1][var40];
								int var51 = field952[var27 + 1][var40 + 1];
								int var52 = field952[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method413(var55, var56, var57);
									var55 = field966 + var55 & 0xFF;
									var57 += field948;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method413(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field962[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !GQFZPMGS.field647[var44 - 1].field652) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field950[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = VRKDWHDQ.field1279[method419(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method330(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method419(var53, var49), method419(var53, var50), method419(var53, var51), method419(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field962[var7][var27][var40] + 1;
									byte var61 = field946[var7][var27][var40];
									GQFZPMGS var62 = GQFZPMGS.field647[var44 - 1];
									int var63 = var62.field650;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = VRKDWHDQ.method500(var63);
										var65 = -1;
									} else if (var62.field649 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method413(var62.field653, var62.field654, var62.field655);
										var64 = VRKDWHDQ.field1279[method409(var62.field658, 96)];
									}

									arg0.method330(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method419(var53, var49), method419(var53, var50), method419(var53, var51), method419(var53, var52), method409(var65, var49), method409(var65, var50), method409(var65, var51), method409(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field969 - 1; var66++) {
				for (int var67 = 1; var67 < field968 - 1; var67++) {
					arg0.method329(var7, var67, var66, method410(var67, var66, var7));
				}
			}
		}

		arg0.method356(768, 64, -50, -10, -50);

		for (int var68 = 0; var68 < field968; var68++) {
			for (int var69 = 0; var69 < field969; var69++) {
				if ((field961[1][var68][var69] & 0x2) == 2) {
					arg0.method327(var69, var68);
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
				for (int var75 = 0; var75 <= field969; var75++) {
					for (int var76 = 0; var76 <= field968; var76++) {
						if ((field950[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field950[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field969 && (field950[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field950[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field950[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field949[var80][var76][var77] - var84;
								int var86 = field949[var79][var76][var77];
								LIOYHOWO.method328(var76 * 128, var76 * 128, var78 * 128 + 128, 1, var73, var85, var77 * 128, var86);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field950[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field950[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field950[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field968 && (field950[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field950[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field950[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field949[var92][var89][var75] - var96;
								int var98 = field949[var91][var89][var75];
								LIOYHOWO.method328(var89 * 128, var90 * 128 + 128, var75 * 128, 2, var73, var97, var75 * 128, var98);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field950[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field950[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field950[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field969 && (field950[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field950[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field968) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field950[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field949[var74][var101][var103];
								LIOYHOWO.method328(var101 * 128, var102 * 128 + 128, var104 * 128 + 128, 4, var73, var107, var103 * 128, var107);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field950[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("QJLJTPQV.a(LIMUIZRAF;IIIIIII)V")
	public final void method423(IMUIZRAF arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg4 >= 0 && arg4 < 104 && arg6 >= 0 && arg6 < 104) {
			field961[arg3][arg4][arg6] = 0;
			while (true) {
				int var8 = arg0.method238();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg0.method238();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg3 == 0) {
						field949[0][arg4][arg6] = -var9 * 8;
						return;
					}

					field949[arg3][arg4][arg6] = field949[arg3 - 1][arg4][arg6] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field953[arg3][arg4][arg6] = arg0.method239();
					field962[arg3][arg4][arg6] = (byte) ((var8 - 2) / 4);
					field946[arg3][arg4][arg6] = (byte) (var8 + arg2 - 2 & 0x3);
				} else if (var8 <= 81) {
					field961[arg3][arg4][arg6] = (byte) (var8 - 49);
				} else {
					field970[arg3][arg4][arg6] = (byte) (var8 - 81);
				}
			}

			if (arg3 == 0) {
				field949[0][arg4][arg6] = -method418(arg4 + arg1 + 932731, arg6 + 556238 + arg5) * 8;
			} else {
				field949[arg3][arg4][arg6] = field949[arg3 - 1][arg4][arg6] - 240;
			}
		} else {
			while (true) {
				int var10 = arg0.method238();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg0.method238();
					return;
				}

				if (var10 <= 49) {
					arg0.method238();
				}
			}
		}
	}

	@ObfuscatedName("QJLJTPQV.a(IIIII)V")
	public final void method424(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg2; var5 <= arg2 + arg3; var5++) {
			for (int var6 = arg1; var6 <= arg0 + arg1; var6++) {
				if (var6 >= 0 && var6 < field968 && var5 >= 0 && var5 < field969) {
					field965[0][var6][var5] = 127;

					if (arg1 == var6 && var6 > 0) {
						field949[0][var6][var5] = field949[0][var6 - 1][var5];
					}

					if (arg0 + arg1 == var6 && var6 < field968 - 1) {
						field949[0][var6][var5] = field949[0][var6 + 1][var5];
					}

					if (arg2 == var5 && var5 > 0) {
						field949[0][var6][var5] = field949[0][var6][var5 - 1];
					}

					if (arg2 + arg3 == var5 && var5 < field969 - 1) {
						field949[0][var6][var5] = field949[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("QJLJTPQV.b(III)Z")
	public static final boolean method425(int arg0, int arg1) {
		PZZVQRQI var2 = PZZVQRQI.method398(arg1);

		if (arg0 == 11) {
			arg0 = 10;
		}

		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}

		return var2.method397(arg0);
	}

	@ObfuscatedName("QJLJTPQV.c(III)I")
	public static final int method426(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method416(var3, var5);
		int var8 = method416(var3 + 1, var5);
		int var9 = method416(var3, var5 + 1);
		int var10 = method416(var3 + 1, var5 + 1);
		int var11 = method406(var7, var8, var4, arg2);
		int var12 = method406(var9, var10, var4, arg2);
		return method406(var11, var12, var6, arg2);
	}
}
