package deob;

@ObfuscatedName("BXGEDAMF")
public final class BXGEDAMF {

	@ObfuscatedName("BXGEDAMF.c")
	public int field104;

	@ObfuscatedName("BXGEDAMF.d")
	public int field105;

	@ObfuscatedName("BXGEDAMF.G")
	public int[][][] field126;

	@ObfuscatedName("BXGEDAMF.h")
	public byte[][][] field108;

	@ObfuscatedName("BXGEDAMF.n")
	public byte[][][] field113;

	@ObfuscatedName("BXGEDAMF.r")
	public byte[][][] field117;

	@ObfuscatedName("BXGEDAMF.f")
	public byte[][][] field107;

	@ObfuscatedName("BXGEDAMF.m")
	public byte[][][] field112;

	@ObfuscatedName("BXGEDAMF.F")
	public int[][][] field125;

	@ObfuscatedName("BXGEDAMF.e")
	public byte[][][] field106;

	@ObfuscatedName("BXGEDAMF.q")
	public int[][] field116;

	@ObfuscatedName("BXGEDAMF.u")
	public int[] field119;

	@ObfuscatedName("BXGEDAMF.v")
	public int[] field120;

	@ObfuscatedName("BXGEDAMF.w")
	public int[] field121;

	@ObfuscatedName("BXGEDAMF.x")
	public int[] field122;

	@ObfuscatedName("BXGEDAMF.y")
	public int[] field123;

	@ObfuscatedName("BXGEDAMF.a")
	public static final int[] field102 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("BXGEDAMF.b")
	public static int field103 = 99;

	@ObfuscatedName("BXGEDAMF.i")
	public static final int[] field109 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("BXGEDAMF.k")
	public static final int[] field110 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("BXGEDAMF.o")
	public static boolean field114 = true;

	@ObfuscatedName("BXGEDAMF.s")
	public static final int[] field118 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("BXGEDAMF.p")
	public static int field115 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("BXGEDAMF.B")
	public static int field124 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("BXGEDAMF.l")
	public static int field111;

	@ObfuscatedName("BXGEDAMF.a(ILJPCEPCNA;LVDSFJUIR;IIIIII)V")
	public final void method12(int arg0, JPCEPCNA arg1, VDSFJUIR arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field114 && (field108[0][arg7][arg4] & 0x2) == 0) {
			if ((field108[arg6][arg7][arg4] & 0x10) != 0) {
				return;
			}

			if (method19(arg4, arg6, arg7) != field111) {
				return;
			}
		}

		if (arg6 < field103) {
			field103 = arg6;
		}

		int var9 = field126[arg6][arg7][arg4];
		int var10 = field126[arg6][arg7 + 1][arg4];
		int var11 = field126[arg6][arg7 + 1][arg4 + 1];
		int var12 = field126[arg6][arg7][arg4 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		SOLNFIIQ var14 = SOLNFIIQ.method499(arg0);
		int var15 = (arg0 << 14) + (arg4 << 7) + arg7 + 0x40000000;
		if (!var14.field1322) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg3 << 6) + arg5);
		if (arg5 == 22) {
			if (!field114 || var14.field1322 || var14.field1318) {
				CRKDFBCP var17;
				if (var14.field1290 == -1 && var14.field1327 == null) {
					var17 = var14.method496(22, arg3, var9, var10, var11, var12, -1);
				} else {
					var17 = new BMMXGYBV(22, var12, arg0, var14.field1290, var11, var10, var9, true, arg3);
				}

				arg1.method326(var16, arg7, var13, arg6, arg4, var17, var15);

				if (var14.field1314 && var14.field1322 && arg2 != null) {
					arg2.method573(arg7, arg4);
				}
			}
		} else if (arg5 == 10 || arg5 == 11) {
			CRKDFBCP var18;
			if (var14.field1290 == -1 && var14.field1327 == null) {
				var18 = var14.method496(10, arg3, var9, var10, var11, var12, -1);
			} else {
				var18 = new BMMXGYBV(10, var12, arg0, var14.field1290, var11, var10, var9, true, arg3);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg5 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg3 == 1 || arg3 == 3) {
					var20 = var14.field1326;
					var21 = var14.field1284;
				} else {
					var20 = var14.field1284;
					var21 = var14.field1326;
				}

				if (arg1.method330(var13, var16, var20, arg4, var19, var15, arg6, var21, arg7, var18) && var14.field1282) {
					OGORHYVW var22;
					if (var18 instanceof OGORHYVW) {
						var22 = (OGORHYVW) var18;
					} else {
						var22 = var14.method496(10, arg3, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field1132 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field106[arg6][arg7 + var23][arg4 + var24]) {
									field106[arg6][arg7 + var23][arg4 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field1314 && arg2 != null) {
				arg2.method572(var14.field1284, arg3, arg7, var14.field1319, arg4, var14.field1326);
			}
		} else if (arg5 >= 12) {
			CRKDFBCP var26;
			if (var14.field1290 == -1 && var14.field1327 == null) {
				var26 = var14.method496(arg5, arg3, var9, var10, var11, var12, -1);
			} else {
				var26 = new BMMXGYBV(arg5, var12, arg0, var14.field1290, var11, var10, var9, true, arg3);
			}

			arg1.method330(var13, var16, 1, arg4, 0, var15, arg6, 1, arg7, var26);

			if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg6 > 0) {
				field125[arg6][arg7][arg4] |= 0x924;
			}

			if (var14.field1314 && arg2 != null) {
				arg2.method572(var14.field1284, arg3, arg7, var14.field1319, arg4, var14.field1326);
			}
		} else if (arg5 == 0) {
			CRKDFBCP var27;
			if (var14.field1290 == -1 && var14.field1327 == null) {
				var27 = var14.method496(0, arg3, var9, var10, var11, var12, -1);
			} else {
				var27 = new BMMXGYBV(0, var12, arg0, var14.field1290, var11, var10, var9, true, arg3);
			}

			arg1.method328(arg4, arg7, var13, null, field118[arg3], arg6, var16, var15, 0, var27);

			if (arg3 == 0) {
				if (var14.field1282) {
					field106[arg6][arg7][arg4] = 50;
					field106[arg6][arg7][arg4 + 1] = 50;
				}

				if (var14.field1297) {
					field125[arg6][arg7][arg4] |= 0x249;
				}
			} else if (arg3 == 1) {
				if (var14.field1282) {
					field106[arg6][arg7][arg4 + 1] = 50;
					field106[arg6][arg7 + 1][arg4 + 1] = 50;
				}

				if (var14.field1297) {
					field125[arg6][arg7][arg4 + 1] |= 0x492;
				}
			} else if (arg3 == 2) {
				if (var14.field1282) {
					field106[arg6][arg7 + 1][arg4] = 50;
					field106[arg6][arg7 + 1][arg4 + 1] = 50;
				}

				if (var14.field1297) {
					field125[arg6][arg7 + 1][arg4] |= 0x249;
				}
			} else if (arg3 == 3) {
				if (var14.field1282) {
					field106[arg6][arg7][arg4] = 50;
					field106[arg6][arg7 + 1][arg4] = 50;
				}

				if (var14.field1297) {
					field125[arg6][arg7][arg4] |= 0x492;
				}
			}

			if (var14.field1314 && arg2 != null) {
				arg2.method571(arg5, arg7, arg3, var14.field1319, arg4);
			}

			if (var14.field1316 != 16) {
				arg1.method336(arg4, arg7, var14.field1316, arg6);
			}
		} else if (arg5 == 1) {
			CRKDFBCP var28;
			if (var14.field1290 == -1 && var14.field1327 == null) {
				var28 = var14.method496(1, arg3, var9, var10, var11, var12, -1);
			} else {
				var28 = new BMMXGYBV(1, var12, arg0, var14.field1290, var11, var10, var9, true, arg3);
			}

			arg1.method328(arg4, arg7, var13, null, field109[arg3], arg6, var16, var15, 0, var28);

			if (var14.field1282) {
				if (arg3 == 0) {
					field106[arg6][arg7][arg4 + 1] = 50;
				} else if (arg3 == 1) {
					field106[arg6][arg7 + 1][arg4 + 1] = 50;
				} else if (arg3 == 2) {
					field106[arg6][arg7 + 1][arg4] = 50;
				} else if (arg3 == 3) {
					field106[arg6][arg7][arg4] = 50;
				}
			}

			if (var14.field1314 && arg2 != null) {
				arg2.method571(arg5, arg7, arg3, var14.field1319, arg4);
			}
		} else if (arg5 == 2) {
			int var29 = arg3 + 1 & 0x3;
			CRKDFBCP var30;
			CRKDFBCP var31;
			if (var14.field1290 == -1 && var14.field1327 == null) {
				var30 = var14.method496(2, arg3 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method496(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new BMMXGYBV(2, var12, arg0, var14.field1290, var11, var10, var9, true, arg3 + 4);
				var31 = new BMMXGYBV(2, var12, arg0, var14.field1290, var11, var10, var9, true, var29);
			}

			arg1.method328(arg4, arg7, var13, var31, field118[arg3], arg6, var16, var15, field118[var29], var30);

			if (var14.field1297) {
				if (arg3 == 0) {
					field125[arg6][arg7][arg4] |= 0x249;
					field125[arg6][arg7][arg4 + 1] |= 0x492;
				} else if (arg3 == 1) {
					field125[arg6][arg7][arg4 + 1] |= 0x492;
					field125[arg6][arg7 + 1][arg4] |= 0x249;
				} else if (arg3 == 2) {
					field125[arg6][arg7 + 1][arg4] |= 0x249;
					field125[arg6][arg7][arg4] |= 0x492;
				} else if (arg3 == 3) {
					field125[arg6][arg7][arg4] |= 0x492;
					field125[arg6][arg7][arg4] |= 0x249;
				}
			}

			if (var14.field1314 && arg2 != null) {
				arg2.method571(arg5, arg7, arg3, var14.field1319, arg4);
			}

			if (var14.field1316 != 16) {
				arg1.method336(arg4, arg7, var14.field1316, arg6);
			}
		} else if (arg5 == 3) {
			CRKDFBCP var32;
			if (var14.field1290 == -1 && var14.field1327 == null) {
				var32 = var14.method496(3, arg3, var9, var10, var11, var12, -1);
			} else {
				var32 = new BMMXGYBV(3, var12, arg0, var14.field1290, var11, var10, var9, true, arg3);
			}

			arg1.method328(arg4, arg7, var13, null, field109[arg3], arg6, var16, var15, 0, var32);

			if (var14.field1282) {
				if (arg3 == 0) {
					field106[arg6][arg7][arg4 + 1] = 50;
				} else if (arg3 == 1) {
					field106[arg6][arg7 + 1][arg4 + 1] = 50;
				} else if (arg3 == 2) {
					field106[arg6][arg7 + 1][arg4] = 50;
				} else if (arg3 == 3) {
					field106[arg6][arg7][arg4] = 50;
				}
			}

			if (var14.field1314 && arg2 != null) {
				arg2.method571(arg5, arg7, arg3, var14.field1319, arg4);
			}
		} else if (arg5 == 9) {
			CRKDFBCP var33;
			if (var14.field1290 == -1 && var14.field1327 == null) {
				var33 = var14.method496(arg5, arg3, var9, var10, var11, var12, -1);
			} else {
				var33 = new BMMXGYBV(arg5, var12, arg0, var14.field1290, var11, var10, var9, true, arg3);
			}

			arg1.method330(var13, var16, 1, arg4, 0, var15, arg6, 1, arg7, var33);

			if (var14.field1314 && arg2 != null) {
				arg2.method572(var14.field1284, arg3, arg7, var14.field1319, arg4, var14.field1326);
			}
		} else {
			if (var14.field1306) {
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

			if (arg5 == 4) {
				CRKDFBCP var38;
				if (var14.field1290 == -1 && var14.field1327 == null) {
					var38 = var14.method496(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new BMMXGYBV(4, var12, arg0, var14.field1290, var11, var10, var9, true, 0);
				}

				arg1.method329(var16, var38, 0, var15, arg4, arg6, arg7, 0, field118[arg3], arg3 * 512, var13);
			} else if (arg5 == 5) {
				int var39 = 16;
				int var40 = arg1.method346(arg6, arg7, arg4);
				if (var40 > 0) {
					var39 = SOLNFIIQ.method499(var40 >> 14 & 0x7FFF).field1316;
				}

				CRKDFBCP var41;
				if (var14.field1290 == -1 && var14.field1327 == null) {
					var41 = var14.method496(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new BMMXGYBV(4, var12, arg0, var14.field1290, var11, var10, var9, true, 0);
				}

				arg1.method329(var16, var41, field110[arg3] * var39, var15, arg4, arg6, arg7, field102[arg3] * var39, field118[arg3], arg3 * 512, var13);
			} else if (arg5 == 6) {
				CRKDFBCP var42;
				if (var14.field1290 == -1 && var14.field1327 == null) {
					var42 = var14.method496(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new BMMXGYBV(4, var12, arg0, var14.field1290, var11, var10, var9, true, 0);
				}

				arg1.method329(var16, var42, 0, var15, arg4, arg6, arg7, 0, 256, arg3, var13);
			} else if (arg5 == 7) {
				CRKDFBCP var43;
				if (var14.field1290 == -1 && var14.field1327 == null) {
					var43 = var14.method496(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new BMMXGYBV(4, var12, arg0, var14.field1290, var11, var10, var9, true, 0);
				}

				arg1.method329(var16, var43, 0, var15, arg4, arg6, arg7, 0, 512, arg3, var13);
			} else if (arg5 == 8) {
				CRKDFBCP var44;
				if (var14.field1290 == -1 && var14.field1327 == null) {
					var44 = var14.method496(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new BMMXGYBV(4, var12, arg0, var14.field1290, var11, var10, var9, true, 0);
				}

				arg1.method329(var16, var44, 0, var15, arg4, arg6, arg7, 0, 768, arg3, var13);
			}
		}
	}

	@ObfuscatedName("BXGEDAMF.a(ZLTKPFKOXP;LFOFQGQZJ;)V")
	public static final void method13(TKPFKOXP arg0, FOFQGQZJ arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method543();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			SOLNFIIQ var4 = SOLNFIIQ.method499(var2);
			var4.method504(arg1);

			while (true) {
				int var5 = arg0.method543();
				if (var5 == 0) {
					break;
				}

				arg0.method529();
			}
		}
	}

	@ObfuscatedName("BXGEDAMF.a(ZI[BI)Z")
	public static final boolean method14(int arg0, byte[] arg1, int arg2) {
		boolean var3 = true;
		TKPFKOXP var4 = new TKPFKOXP(arg1);
		int var5 = -1;
		while (true) {
			int var6 = var4.method543();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method543();
					if (var9 == 0) {
						break;
					}

					var4.method529();
				} else {
					int var10 = var4.method543();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method529() >> 2;
					int var14 = arg2 + var12;
					int var15 = arg0 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						SOLNFIIQ var16 = SOLNFIIQ.method499(var5);
						if (var13 != 22 || !field114 || var16.field1322 || var16.field1318) {
							var3 &= var16.method498();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("BXGEDAMF.a(II)I")
	public static final int method15(int arg0, int arg1) {
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

	@ObfuscatedName("BXGEDAMF.a(IIIIIIILTKPFKOXP;)V")
	public final void method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, TKPFKOXP arg6) {
		if (arg5 >= 0 && arg5 < 104 && arg1 >= 0 && arg1 < 104) {
			field108[arg0][arg5][arg1] = 0;
			while (true) {
				int var8 = arg6.method529();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg6.method529();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg0 == 0) {
						field126[0][arg5][arg1] = -var9 * 8;
						return;
					}

					field126[arg0][arg5][arg1] = field126[arg0 - 1][arg5][arg1] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field117[arg0][arg5][arg1] = arg6.method530();
					field107[arg0][arg5][arg1] = (byte) ((var8 - 2) / 4);
					field112[arg0][arg5][arg1] = (byte) (var8 + arg3 - 2 & 0x3);
				} else if (var8 <= 81) {
					field108[arg0][arg5][arg1] = (byte) (var8 - 49);
				} else {
					field113[arg0][arg5][arg1] = (byte) (var8 - 81);
				}
			}

			if (arg0 == 0) {
				field126[0][arg5][arg1] = -method25(arg5 + arg4 + 932731, arg1 + 556238 + arg2) * 8;
			} else {
				field126[arg0][arg5][arg1] = field126[arg0 - 1][arg5][arg1] - 240;
			}
		} else {
			while (true) {
				int var10 = arg6.method529();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg6.method529();
					return;
				}

				if (var10 <= 49) {
					arg6.method529();
				}
			}
		}
	}

	@ObfuscatedName("BXGEDAMF.a(IIII)I")
	public static final int method17(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - GHWCMNQP.field750[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("BXGEDAMF.b(II)I")
	public final int method18(int arg0, int arg1) {
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

	@ObfuscatedName("BXGEDAMF.a(IIBI)I")
	public int method19(int arg0, int arg1, int arg2) {
		if ((field108[arg1][arg2][arg0] & 0x8) != 0) {
			return 0;
		}

		if (arg1 > 0 && (field108[1][arg2][arg0] & 0x2) != 0) {
			return arg1 - 1;
		}

		return arg1;
	}

	@ObfuscatedName("BXGEDAMF.a(III)I")
	public static final int method20(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method28(var3, var5);
		int var8 = method28(var3 + 1, var5);
		int var9 = method28(var3, var5 + 1);
		int var10 = method28(var3 + 1, var5 + 1);
		int var11 = method17(var7, var8, var4, arg2);
		int var12 = method17(var9, var10, var4, arg2);
		return method17(var11, var12, var6, arg2);
	}

	public BXGEDAMF(int[][][] arg0, byte[][][] arg1, int arg2, int arg3) {
		field103 = 99;
		field104 = arg2;
		field105 = arg3;
		field126 = arg0;
		field108 = arg1;
		field113 = new byte[4][field104][field105];
		field117 = new byte[4][field104][field105];
		field107 = new byte[4][field104][field105];
		field112 = new byte[4][field104][field105];
		field125 = new int[4][field104 + 1][field105 + 1];
		field106 = new byte[4][field104 + 1][field105 + 1];
		field116 = new int[field104 + 1][field105 + 1];
		field119 = new int[field105];
		field120 = new int[field105];
		field121 = new int[field105];
		field122 = new int[field105];
		field123 = new int[field105];
	}

	@ObfuscatedName("BXGEDAMF.a([LVDSFJUIR;LJPCEPCNA;Z)V")
	public final void method21(VDSFJUIR[] arg0, JPCEPCNA arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field108[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field108[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg0[var6].method573(var4, var5);
						}
					}
				}
			}
		}

		field124 += (int) (Math.random() * 5.0D) - 2;
		if (field124 < -8) {
			field124 = -8;
		}

		if (field124 > 8) {
			field124 = 8;
		}

		field115 += (int) (Math.random() * 5.0D) - 2;
		if (field115 < -16) {
			field115 = -16;
		}

		if (field115 > 16) {
			field115 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field106[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field105 - 1; var16++) {
				for (int var17 = 1; var17 < field104 - 1; var17++) {
					int var18 = field126[var7][var17 + 1][var16] - field126[var7][var17 - 1][var16];
					int var19 = field126[var7][var17][var16 + 1] - field126[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field116[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field105; var26++) {
				field119[var26] = 0;
				field120[var26] = 0;
				field121[var26] = 0;
				field122[var26] = 0;
				field123[var26] = 0;
			}

			for (int var27 = -5; var27 < field104 + 5; var27++) {
				for (int var28 = 0; var28 < field105; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field104) {
						int var30 = field113[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							FBZMYCDC var31 = FBZMYCDC.field680[var30 - 1];
							field119[var28] += var31.field689;
							field120[var28] += var31.field687;
							field121[var28] += var31.field688;
							field122[var28] += var31.field690;
							field123[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field104) {
						int var33 = field113[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							FBZMYCDC var34 = FBZMYCDC.field680[var33 - 1];
							field119[var28] -= var34.field689;
							field120[var28] -= var34.field687;
							field121[var28] -= var34.field688;
							field122[var28] -= var34.field690;
							field123[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field104 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field105 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field105) {
							var35 += field119[var41];
							var36 += field120[var41];
							var37 += field121[var41];
							var38 += field122[var41];
							var39 += field123[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field105) {
							var35 -= field119[var42];
							var36 -= field120[var42];
							var37 -= field121[var42];
							var38 -= field122[var42];
							var39 -= field123[var42];
						}

						if (var40 >= 1 && var40 < field105 - 1 && (!field114 || (field108[0][var27][var40] & 0x2) != 0 || (field108[var7][var27][var40] & 0x10) == 0 && method19(var40, var7, var27) == field111)) {
							if (var7 < field103) {
								field103 = var7;
							}

							int var43 = field113[var7][var27][var40] & 0xFF;
							int var44 = field117[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field126[var7][var27][var40];
								int var46 = field126[var7][var27 + 1][var40];
								int var47 = field126[var7][var27 + 1][var40 + 1];
								int var48 = field126[var7][var27][var40 + 1];
								int var49 = field116[var27][var40];
								int var50 = field116[var27 + 1][var40];
								int var51 = field116[var27 + 1][var40 + 1];
								int var52 = field116[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method30(var55, var56, var57);
									var55 = field124 + var55 & 0xFF;
									var57 += field115;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method30(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field107[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !FBZMYCDC.field680[var44 - 1].field685) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field125[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = GHWCMNQP.field761[method15(var54, 96)];
								}

								if (var44 == 0) {
									arg1.method325(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method15(var53, var49), method15(var53, var50), method15(var53, var51), method15(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field107[var7][var27][var40] + 1;
									byte var61 = field112[var7][var27][var40];
									FBZMYCDC var62 = FBZMYCDC.field680[var44 - 1];
									int var63 = var62.field683;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = GHWCMNQP.method232(var63);
										var65 = -1;
									} else if (var62.field682 == 0xFF00FF) {
										var65 = -2;
										var63 = -1;
										var64 = GHWCMNQP.field761[method18(var62.field691, 96)];
									} else {
										var65 = method30(var62.field686, var62.field687, var62.field688);
										var64 = GHWCMNQP.field761[method18(var62.field691, 96)];
									}

									arg1.method325(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method15(var53, var49), method15(var53, var50), method15(var53, var51), method15(var53, var52), method18(var65, var49), method18(var65, var50), method18(var65, var51), method18(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field105 - 1; var66++) {
				for (int var67 = 1; var67 < field104 - 1; var67++) {
					arg1.method324(var7, var67, var66, method19(var66, var7, var67));
				}
			}
		}

		arg1.method351(-10, -50, -50);

		for (int var68 = 0; var68 < field104; var68++) {
			for (int var69 = 0; var69 < field105; var69++) {
				if ((field108[1][var68][var69] & 0x2) == 2) {
					arg1.method322(var68, var69);
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
				for (int var75 = 0; var75 <= field105; var75++) {
					for (int var76 = 0; var76 <= field104; var76++) {
						if ((field125[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field125[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field105 && (field125[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field125[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field125[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field126[var80][var76][var77] - var84;
								int var86 = field126[var79][var76][var77];
								JPCEPCNA.method323(var77 * 128, var76 * 128, var76 * 128, var85, var86, var78 * 128 + 128, 1, var73);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field125[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field125[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field125[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field104 && (field125[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field125[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field125[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field126[var92][var89][var75] - var96;
								int var98 = field126[var91][var89][var75];
								JPCEPCNA.method323(var75 * 128, var89 * 128, var90 * 128 + 128, var97, var98, var75 * 128, 2, var73);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field125[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field125[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field125[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field105 && (field125[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field125[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field104) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field125[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field126[var74][var101][var103];
								JPCEPCNA.method323(var103 * 128, var101 * 128, var102 * 128 + 128, var107, var107, var104 * 128 + 128, 4, var73);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field125[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("BXGEDAMF.c(II)I")
	public static final int method22(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("BXGEDAMF.a(I[BIII[LVDSFJUIR;I)V")
	public final void method23(int arg0, byte[] arg1, int arg2, int arg3, int arg4, VDSFJUIR[] arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg3 + var8 > 0 && arg3 + var8 < 103 && arg2 + var9 > 0 && arg2 + var9 < 103) {
						arg5[var7].field1415[arg3 + var8][arg2 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		TKPFKOXP var10 = new TKPFKOXP(arg1);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method16(var11, arg2 + var13, arg0, 0, arg4, arg3 + var12, var10);
				}
			}
		}
	}

	@ObfuscatedName("BXGEDAMF.a(ILJPCEPCNA;IIIIII[LVDSFJUIR;I[B)V")
	public final void method24(int arg0, JPCEPCNA arg1, int arg2, int arg3, int arg4, int arg5, int arg6, VDSFJUIR[] arg7, int arg8, byte[] arg9) {
		TKPFKOXP var11 = new TKPFKOXP(arg9);
		int var12 = -1;
		while (true) {
			int var13 = var11.method543();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method543();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method529();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg3 == var18 && var17 >= arg0 && var17 < arg0 + 8 && var16 >= arg5 && var16 < arg5 + 8) {
					SOLNFIIQ var22 = SOLNFIIQ.method499(var12);
					int var23 = arg4 + OWCLRNAL.method461(var16 & 0x7, var21, var22.field1326, var22.field1284, arg6, var17 & 0x7);
					int var24 = arg2 + OWCLRNAL.method462(var22.field1326, var22.field1284, arg6, var17 & 0x7, var21, var16 & 0x7);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg8;
						if ((field108[1][var23][var24] & 0x2) == 2) {
							var25 = arg8 - 1;
						}

						VDSFJUIR var26 = null;
						if (var25 >= 0) {
							var26 = arg7[var25];
						}

						method12(var12, arg1, var26, arg6 + var21 & 0x3, var24, var20, arg8, var23);
					}
				}
			}
		}
	}

	@ObfuscatedName("BXGEDAMF.d(II)I")
	public static final int method25(int arg0, int arg1) {
		int var2 = method20(arg0 + 45365, arg1 + 91923, 4) + (method20(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method20(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("BXGEDAMF.a(IIIII)V")
	public final void method26(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg2; var5 <= arg1 + arg2; var5++) {
			for (int var6 = arg0; var6 <= arg0 + arg3; var6++) {
				if (var6 >= 0 && var6 < field104 && var5 >= 0 && var5 < field105) {
					field106[0][var6][var5] = 127;

					if (arg0 == var6 && var6 > 0) {
						field126[0][var6][var5] = field126[0][var6 - 1][var5];
					}

					if (arg0 + arg3 == var6 && var6 < field104 - 1) {
						field126[0][var6][var5] = field126[0][var6 + 1][var5];
					}

					if (arg2 == var5 && var5 > 0) {
						field126[0][var6][var5] = field126[0][var6][var5 - 1];
					}

					if (arg1 + arg2 == var5 && var5 < field105 - 1) {
						field126[0][var6][var5] = field126[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("BXGEDAMF.a(BII)Z")
	public static final boolean method27(int arg0, int arg1) {
		SOLNFIIQ var2 = SOLNFIIQ.method499(arg1);

		if (arg0 == 11) {
			arg0 = 10;
		}

		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}

		return var2.method505(arg0);
	}

	@ObfuscatedName("BXGEDAMF.e(II)I")
	public static final int method28(int arg0, int arg1) {
		int var2 = method22(arg0 - 1, arg1 - 1) + method22(arg0 + 1, arg1 - 1) + method22(arg0 - 1, arg1 + 1) + method22(arg0 + 1, arg1 + 1);
		int var3 = method22(arg0 - 1, arg1) + method22(arg0 + 1, arg1) + method22(arg0, arg1 - 1) + method22(arg0, arg1 + 1);
		int var4 = method22(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("BXGEDAMF.a([[[ILVDSFJUIR;IIILJPCEPCNA;IBIII)V")
	public static final void method29(int[][][] arg0, VDSFJUIR arg1, int arg2, int arg3, int arg4, JPCEPCNA arg5, int arg6, int arg7, int arg8, int arg9) {
		int var10 = arg0[arg7][arg6][arg2];
		int var11 = arg0[arg7][arg6 + 1][arg2];
		int var12 = arg0[arg7][arg6 + 1][arg2 + 1];
		int var13 = arg0[arg7][arg6][arg2 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		SOLNFIIQ var15 = SOLNFIIQ.method499(arg8);
		int var16 = (arg8 << 14) + (arg2 << 7) + arg6 + 0x40000000;
		if (!var15.field1322) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg3 << 6) + arg9);
		if (arg9 == 22) {
			CRKDFBCP var18;
			if (var15.field1290 == -1 && var15.field1327 == null) {
				var18 = var15.method496(22, arg3, var10, var11, var12, var13, -1);
			} else {
				var18 = new BMMXGYBV(22, var13, arg8, var15.field1290, var12, var11, var10, true, arg3);
			}

			arg5.method326(var17, arg6, var14, arg4, arg2, var18, var16);

			if (var15.field1314 && var15.field1322) {
				arg1.method573(arg6, arg2);
			}
		} else if (arg9 == 10 || arg9 == 11) {
			CRKDFBCP var19;
			if (var15.field1290 == -1 && var15.field1327 == null) {
				var19 = var15.method496(10, arg3, var10, var11, var12, var13, -1);
			} else {
				var19 = new BMMXGYBV(10, var13, arg8, var15.field1290, var12, var11, var10, true, arg3);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg9 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg3 == 1 || arg3 == 3) {
					var21 = var15.field1326;
					var22 = var15.field1284;
				} else {
					var21 = var15.field1284;
					var22 = var15.field1326;
				}

				arg5.method330(var14, var17, var21, arg2, var20, var16, arg4, var22, arg6, var19);
			}

			if (var15.field1314) {
				arg1.method572(var15.field1284, arg3, arg6, var15.field1319, arg2, var15.field1326);
			}
		} else if (arg9 >= 12) {
			CRKDFBCP var23;
			if (var15.field1290 == -1 && var15.field1327 == null) {
				var23 = var15.method496(arg9, arg3, var10, var11, var12, var13, -1);
			} else {
				var23 = new BMMXGYBV(arg9, var13, arg8, var15.field1290, var12, var11, var10, true, arg3);
			}

			arg5.method330(var14, var17, 1, arg2, 0, var16, arg4, 1, arg6, var23);

			if (var15.field1314) {
				arg1.method572(var15.field1284, arg3, arg6, var15.field1319, arg2, var15.field1326);
			}
		} else if (arg9 == 0) {
			CRKDFBCP var24;
			if (var15.field1290 == -1 && var15.field1327 == null) {
				var24 = var15.method496(0, arg3, var10, var11, var12, var13, -1);
			} else {
				var24 = new BMMXGYBV(0, var13, arg8, var15.field1290, var12, var11, var10, true, arg3);
			}

			arg5.method328(arg2, arg6, var14, null, field118[arg3], arg4, var17, var16, 0, var24);

			if (var15.field1314) {
				arg1.method571(arg9, arg6, arg3, var15.field1319, arg2);
			}
		} else if (arg9 == 1) {
			CRKDFBCP var25;
			if (var15.field1290 == -1 && var15.field1327 == null) {
				var25 = var15.method496(1, arg3, var10, var11, var12, var13, -1);
			} else {
				var25 = new BMMXGYBV(1, var13, arg8, var15.field1290, var12, var11, var10, true, arg3);
			}

			arg5.method328(arg2, arg6, var14, null, field109[arg3], arg4, var17, var16, 0, var25);

			if (var15.field1314) {
				arg1.method571(arg9, arg6, arg3, var15.field1319, arg2);
			}
		} else if (arg9 == 2) {
			int var26 = arg3 + 1 & 0x3;
			CRKDFBCP var27;
			CRKDFBCP var28;
			if (var15.field1290 == -1 && var15.field1327 == null) {
				var27 = var15.method496(2, arg3 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method496(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new BMMXGYBV(2, var13, arg8, var15.field1290, var12, var11, var10, true, arg3 + 4);
				var28 = new BMMXGYBV(2, var13, arg8, var15.field1290, var12, var11, var10, true, var26);
			}

			arg5.method328(arg2, arg6, var14, var28, field118[arg3], arg4, var17, var16, field118[var26], var27);

			if (var15.field1314) {
				arg1.method571(arg9, arg6, arg3, var15.field1319, arg2);
			}
		} else if (arg9 == 3) {
			CRKDFBCP var29;
			if (var15.field1290 == -1 && var15.field1327 == null) {
				var29 = var15.method496(3, arg3, var10, var11, var12, var13, -1);
			} else {
				var29 = new BMMXGYBV(3, var13, arg8, var15.field1290, var12, var11, var10, true, arg3);
			}

			arg5.method328(arg2, arg6, var14, null, field109[arg3], arg4, var17, var16, 0, var29);

			if (var15.field1314) {
				arg1.method571(arg9, arg6, arg3, var15.field1319, arg2);
			}
		} else if (arg9 == 9) {
			CRKDFBCP var30;
			if (var15.field1290 == -1 && var15.field1327 == null) {
				var30 = var15.method496(arg9, arg3, var10, var11, var12, var13, -1);
			} else {
				var30 = new BMMXGYBV(arg9, var13, arg8, var15.field1290, var12, var11, var10, true, arg3);
			}

			arg5.method330(var14, var17, 1, arg2, 0, var16, arg4, 1, arg6, var30);

			if (var15.field1314) {
				arg1.method572(var15.field1284, arg3, arg6, var15.field1319, arg2, var15.field1326);
			}
		} else {
			if (var15.field1306) {
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

			if (arg9 == 4) {
				CRKDFBCP var35;
				if (var15.field1290 == -1 && var15.field1327 == null) {
					var35 = var15.method496(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new BMMXGYBV(4, var13, arg8, var15.field1290, var12, var11, var10, true, 0);
				}

				arg5.method329(var17, var35, 0, var16, arg2, arg4, arg6, 0, field118[arg3], arg3 * 512, var14);
			} else if (arg9 == 5) {
				int var36 = 16;
				int var37 = arg5.method346(arg4, arg6, arg2);
				if (var37 > 0) {
					var36 = SOLNFIIQ.method499(var37 >> 14 & 0x7FFF).field1316;
				}

				CRKDFBCP var38;
				if (var15.field1290 == -1 && var15.field1327 == null) {
					var38 = var15.method496(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new BMMXGYBV(4, var13, arg8, var15.field1290, var12, var11, var10, true, 0);
				}

				arg5.method329(var17, var38, field110[arg3] * var36, var16, arg2, arg4, arg6, field102[arg3] * var36, field118[arg3], arg3 * 512, var14);
			} else if (arg9 == 6) {
				CRKDFBCP var39;
				if (var15.field1290 == -1 && var15.field1327 == null) {
					var39 = var15.method496(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new BMMXGYBV(4, var13, arg8, var15.field1290, var12, var11, var10, true, 0);
				}

				arg5.method329(var17, var39, 0, var16, arg2, arg4, arg6, 0, 256, arg3, var14);
			} else if (arg9 == 7) {
				CRKDFBCP var40;
				if (var15.field1290 == -1 && var15.field1327 == null) {
					var40 = var15.method496(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new BMMXGYBV(4, var13, arg8, var15.field1290, var12, var11, var10, true, 0);
				}

				arg5.method329(var17, var40, 0, var16, arg2, arg4, arg6, 0, 512, arg3, var14);
			} else if (arg9 == 8) {
				CRKDFBCP var41;
				if (var15.field1290 == -1 && var15.field1327 == null) {
					var41 = var15.method496(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new BMMXGYBV(4, var13, arg8, var15.field1290, var12, var11, var10, true, 0);
				}

				arg5.method329(var17, var41, 0, var16, arg2, arg4, arg6, 0, 768, arg3, var14);
			}
		}
	}

	@ObfuscatedName("BXGEDAMF.b(III)I")
	public final int method30(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("BXGEDAMF.a(III[BIIZI[LVDSFJUIR;I)V")
	public final void method31(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, VDSFJUIR[] arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg4 + var10 > 0 && arg4 + var10 < 103 && arg0 + var11 > 0 && arg0 + var11 < 103) {
					arg7[arg8].field1415[arg4 + var10][arg0 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		TKPFKOXP var12 = new TKPFKOXP(arg3);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg2 == var13 && var14 >= arg6 && var14 < arg6 + 8 && var15 >= arg5 && var15 < arg5 + 8) {
						method16(arg8, arg0 + OWCLRNAL.method460(arg1, var14 & 0x7, var15 & 0x7), 0, arg1, 0, arg4 + OWCLRNAL.method459(arg1, var15 & 0x7, var14 & 0x7), var12);
					} else {
						method16(0, -1, 0, 0, 0, -1, var12);
					}
				}
			}
		}
	}

	@ObfuscatedName("BXGEDAMF.a([B[LVDSFJUIR;IILJPCEPCNA;I)V")
	public final void method32(byte[] arg0, VDSFJUIR[] arg1, int arg2, JPCEPCNA arg3, int arg4) {
		TKPFKOXP var6 = new TKPFKOXP(arg0);
		int var7 = -1;
		while (true) {
			int var8 = var6.method543();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method543();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method529();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg2 + var12;
				int var18 = arg4 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field108[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					VDSFJUIR var20 = null;
					if (var19 >= 0) {
						var20 = arg1[var19];
					}

					method12(var7, arg3, var20, var16, var18, var15, var13, var17);
				}
			}
		}
	}

	@ObfuscatedName("BXGEDAMF.b(IIII)V")
	public final void method33(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 8; var4++) {
			for (int var5 = 0; var5 < 8; var5++) {
				field126[arg1][arg2 + var4][arg0 + var5] = 0;
			}
		}

		if (arg2 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				field126[arg1][arg2][arg0 + var6] = field126[arg1][arg2 - 1][arg0 + var6];
			}
		}

		if (arg0 > 0) {
			for (int var7 = 1; var7 < 8; var7++) {
				field126[arg1][arg2 + var7][arg0] = field126[arg1][arg2 + var7][arg0 - 1];
			}
		}

		if (arg2 > 0 && field126[arg1][arg2 - 1][arg0] != 0) {
			field126[arg1][arg2][arg0] = field126[arg1][arg2 - 1][arg0];
		} else if (arg0 > 0 && field126[arg1][arg2][arg0 - 1] != 0) {
			field126[arg1][arg2][arg0] = field126[arg1][arg2][arg0 - 1];
		} else if (arg2 > 0 && arg0 > 0 && field126[arg1][arg2 - 1][arg0 - 1] != 0) {
			field126[arg1][arg2][arg0] = field126[arg1][arg2 - 1][arg0 - 1];
		}
	}
}
