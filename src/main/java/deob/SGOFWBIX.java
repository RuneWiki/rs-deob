package deob;

@ObfuscatedName("SGOFWBIX")
public final class SGOFWBIX {

	@ObfuscatedName("SGOFWBIX.x")
	public int field1155;

	@ObfuscatedName("SGOFWBIX.y")
	public int field1156;

	@ObfuscatedName("SGOFWBIX.n")
	public int[][][] field1145;

	@ObfuscatedName("SGOFWBIX.j")
	public byte[][][] field1142;

	@ObfuscatedName("SGOFWBIX.g")
	public byte[][][] field1139;

	@ObfuscatedName("SGOFWBIX.p")
	public byte[][][] field1147;

	@ObfuscatedName("SGOFWBIX.h")
	public byte[][][] field1140;

	@ObfuscatedName("SGOFWBIX.A")
	public byte[][][] field1158;

	@ObfuscatedName("SGOFWBIX.o")
	public int[][][] field1146;

	@ObfuscatedName("SGOFWBIX.d")
	public byte[][][] field1136;

	@ObfuscatedName("SGOFWBIX.k")
	public int[][] field1143;

	@ObfuscatedName("SGOFWBIX.r")
	public int[] field1149;

	@ObfuscatedName("SGOFWBIX.s")
	public int[] field1150;

	@ObfuscatedName("SGOFWBIX.t")
	public int[] field1151;

	@ObfuscatedName("SGOFWBIX.u")
	public int[] field1152;

	@ObfuscatedName("SGOFWBIX.v")
	public int[] field1153;

	@ObfuscatedName("SGOFWBIX.c")
	public static final int[] field1135 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("SGOFWBIX.i")
	public static final int[] field1141 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("SGOFWBIX.l")
	public static final int[] field1144 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("SGOFWBIX.q")
	public static boolean field1148 = true;

	@ObfuscatedName("SGOFWBIX.w")
	public static int field1154 = 99;

	@ObfuscatedName("SGOFWBIX.z")
	public static final int[] field1157 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("SGOFWBIX.a")
	public static int field1134 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("SGOFWBIX.e")
	public static int field1137 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("SGOFWBIX.f")
	public static int field1138;

	@ObfuscatedName("SGOFWBIX.a(IZI)Z")
	public static final boolean method402(int arg0, int arg1) {
		DHQCHKXN var2 = DHQCHKXN.method194(arg0);

		if (arg1 == 11) {
			arg1 = 10;
		}

		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}

		return var2.method188(arg1);
	}

	@ObfuscatedName("SGOFWBIX.a(II)I")
	public static final int method403(int arg0, int arg1) {
		int var2 = method411(arg0 - 1, arg1 - 1) + method411(arg0 + 1, arg1 - 1) + method411(arg0 - 1, arg1 + 1) + method411(arg0 + 1, arg1 + 1);
		int var3 = method411(arg0 - 1, arg1) + method411(arg0 + 1, arg1) + method411(arg0, arg1 - 1) + method411(arg0, arg1 + 1);
		int var4 = method411(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("SGOFWBIX.a(III)I")
	public final int method404(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("SGOFWBIX.a(IIZI)I")
	public int method405(int arg0, int arg1, int arg2) {
		if ((field1142[arg1][arg0][arg2] & 0x8) != 0) {
			return 0;
		}

		if (arg1 > 0 && (field1142[1][arg0][arg2] & 0x2) != 0) {
			return arg1 - 1;
		}

		return arg1;
	}

	@ObfuscatedName("SGOFWBIX.b(II)I")
	public static final int method406(int arg0, int arg1) {
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

	@ObfuscatedName("SGOFWBIX.a([B[LXSQWUDHM;IIIII)V")
	public final void method407(byte[] arg0, XSQWUDHM[] arg1, int arg2, int arg3, int arg4, int arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg2 + var8 > 0 && arg2 + var8 < 103 && arg3 + var9 > 0 && arg3 + var9 < 103) {
						arg1[var7].field1351[arg2 + var8][arg3 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		XQPFGONL var10 = new XQPFGONL(arg0);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method409(var11, arg3 + var13, var10, arg4, arg5, 0, arg2 + var12);
				}
			}
		}
	}

	@ObfuscatedName("SGOFWBIX.b(III)I")
	public static final int method408(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method403(var3, var5);
		int var8 = method403(var3 + 1, var5);
		int var9 = method403(var3, var5 + 1);
		int var10 = method403(var3 + 1, var5 + 1);
		int var11 = method413(var7, var8, var4, arg2);
		int var12 = method413(var9, var10, var4, arg2);
		return method413(var11, var12, var6, arg2);
	}

	@ObfuscatedName("SGOFWBIX.a(IBILXQPFGONL;IIII)V")
	public final void method409(int arg0, int arg1, XQPFGONL arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg6 >= 0 && arg6 < 104 && arg1 >= 0 && arg1 < 104) {
			field1142[arg0][arg6][arg1] = 0;
			while (true) {
				int var8 = arg2.method478();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg2.method478();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg0 == 0) {
						field1145[0][arg6][arg1] = -var9 * 8;
						return;
					}

					field1145[arg0][arg6][arg1] = field1145[arg0 - 1][arg6][arg1] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field1147[arg0][arg6][arg1] = arg2.method479();
					field1140[arg0][arg6][arg1] = (byte) ((var8 - 2) / 4);
					field1158[arg0][arg6][arg1] = (byte) (var8 + arg5 - 2 & 0x3);
				} else if (var8 <= 81) {
					field1142[arg0][arg6][arg1] = (byte) (var8 - 49);
				} else {
					field1139[arg0][arg6][arg1] = (byte) (var8 - 81);
				}
			}

			if (arg0 == 0) {
				field1145[0][arg6][arg1] = -method420(arg6 + arg4 + 932731, arg1 + 556238 + arg3) * 8;
			} else {
				field1145[arg0][arg6][arg1] = field1145[arg0 - 1][arg6][arg1] - 240;
			}
		} else {
			while (true) {
				int var10 = arg2.method478();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg2.method478();
					return;
				}

				if (var10 <= 49) {
					arg2.method478();
				}
			}
		}
	}

	@ObfuscatedName("SGOFWBIX.a(III[B)Z")
	public static final boolean method410(int arg0, int arg1, byte[] arg2) {
		boolean var3 = true;
		XQPFGONL var4 = new XQPFGONL(arg2);
		int var5 = -1;
		while (true) {
			int var6 = var4.method492();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method492();
					if (var9 == 0) {
						break;
					}

					var4.method478();
				} else {
					int var10 = var4.method492();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method478() >> 2;
					int var14 = arg0 + var12;
					int var15 = arg1 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						DHQCHKXN var16 = DHQCHKXN.method194(var5);
						if (var13 != 22 || !field1148 || var16.field585 || var16.field565) {
							var3 &= var16.method193();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("SGOFWBIX.c(II)I")
	public static final int method411(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("SGOFWBIX.a(BLWNPVPVVL;LXQPFGONL;)V")
	public static final void method412(WNPVPVVL arg0, XQPFGONL arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg1.method492();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			DHQCHKXN var4 = DHQCHKXN.method194(var2);
			var4.method190(arg0);

			while (true) {
				int var5 = arg1.method492();
				if (var5 == 0) {
					break;
				}

				arg1.method478();
			}
		}
	}

	@ObfuscatedName("SGOFWBIX.a(IIII)I")
	public static final int method413(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - JJAEHWOM.field858[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("SGOFWBIX.a(IIIII)V")
	public final void method414(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg0; var5 <= arg0 + arg1; var5++) {
			for (int var6 = arg3; var6 <= arg2 + arg3; var6++) {
				if (var6 >= 0 && var6 < field1155 && var5 >= 0 && var5 < field1156) {
					field1136[0][var6][var5] = 127;

					if (arg3 == var6 && var6 > 0) {
						field1145[0][var6][var5] = field1145[0][var6 - 1][var5];
					}

					if (arg2 + arg3 == var6 && var6 < field1155 - 1) {
						field1145[0][var6][var5] = field1145[0][var6 + 1][var5];
					}

					if (arg0 == var5 && var5 > 0) {
						field1145[0][var6][var5] = field1145[0][var6][var5 - 1];
					}

					if (arg0 + arg1 == var5 && var5 < field1156 - 1) {
						field1145[0][var6][var5] = field1145[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("SGOFWBIX.a(BLZCHENGKI;[LXSQWUDHM;III[BIIII)V")
	public final void method415(ZCHENGKI arg0, XSQWUDHM[] arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9) {
		XQPFGONL var11 = new XQPFGONL(arg5);
		int var12 = -1;
		while (true) {
			int var13 = var11.method492();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method492();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method478();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg2 == var18 && var17 >= arg3 && var17 < arg3 + 8 && var16 >= arg8 && var16 < arg8 + 8) {
					DHQCHKXN var22 = DHQCHKXN.method194(var12);
					int var23 = arg6 + MGISFZUH.method366(var16 & 0x7, var17 & 0x7, var22.field567, arg9, var22.field598);
					int var24 = arg4 + MGISFZUH.method367(var22.field598, var22.field567, arg9, var16 & 0x7, var17 & 0x7);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = var18;
						if ((field1142[1][var23][var24] & 0x2) == 2) {
							var25 = var18 - 1;
						}

						XSQWUDHM var26 = null;
						if (var25 >= 0) {
							var26 = arg1[var25];
						}

						method421(var18, var20, var24, arg0, var12, var26, arg9 + var21 & 0x3, var23);
					}
				}
			}
		}
	}

	@ObfuscatedName("SGOFWBIX.a([LXSQWUDHM;ILZCHENGKI;)V")
	public final void method416(XSQWUDHM[] arg0, ZCHENGKI arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field1142[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field1142[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg0[var6].method517(var4, var5);
						}
					}
				}
			}
		}

		field1134 += (int) (Math.random() * 5.0D) - 2;
		if (field1134 < -8) {
			field1134 = -8;
		}

		if (field1134 > 8) {
			field1134 = 8;
		}

		field1137 += (int) (Math.random() * 5.0D) - 2;
		if (field1137 < -16) {
			field1137 = -16;
		}

		if (field1137 > 16) {
			field1137 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field1136[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field1156 - 1; var16++) {
				for (int var17 = 1; var17 < field1155 - 1; var17++) {
					int var18 = field1145[var7][var17 + 1][var16] - field1145[var7][var17 - 1][var16];
					int var19 = field1145[var7][var17][var16 + 1] - field1145[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field1143[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field1156; var26++) {
				field1149[var26] = 0;
				field1150[var26] = 0;
				field1151[var26] = 0;
				field1152[var26] = 0;
				field1153[var26] = 0;
			}

			for (int var27 = -5; var27 < field1155 + 5; var27++) {
				for (int var28 = 0; var28 < field1156; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field1155) {
						int var30 = field1139[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							IWTQKRSS var31 = IWTQKRSS.field821[var30 - 1];
							field1149[var28] += var31.field830;
							field1150[var28] += var31.field828;
							field1151[var28] += var31.field829;
							field1152[var28] += var31.field831;
							field1153[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field1155) {
						int var33 = field1139[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							IWTQKRSS var34 = IWTQKRSS.field821[var33 - 1];
							field1149[var28] -= var34.field830;
							field1150[var28] -= var34.field828;
							field1151[var28] -= var34.field829;
							field1152[var28] -= var34.field831;
							field1153[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field1155 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field1156 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field1156) {
							var35 += field1149[var41];
							var36 += field1150[var41];
							var37 += field1151[var41];
							var38 += field1152[var41];
							var39 += field1153[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field1156) {
							var35 -= field1149[var42];
							var36 -= field1150[var42];
							var37 -= field1151[var42];
							var38 -= field1152[var42];
							var39 -= field1153[var42];
						}

						if (var40 >= 1 && var40 < field1156 - 1 && (!field1148 || (field1142[0][var27][var40] & 0x2) != 0 || (field1142[var7][var27][var40] & 0x10) == 0 && method405(var27, var7, var40) == field1138)) {
							if (var7 < field1154) {
								field1154 = var7;
							}

							int var43 = field1139[var7][var27][var40] & 0xFF;
							int var44 = field1147[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field1145[var7][var27][var40];
								int var46 = field1145[var7][var27 + 1][var40];
								int var47 = field1145[var7][var27 + 1][var40 + 1];
								int var48 = field1145[var7][var27][var40 + 1];
								int var49 = field1143[var27][var40];
								int var50 = field1143[var27 + 1][var40];
								int var51 = field1143[var27 + 1][var40 + 1];
								int var52 = field1143[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method404(var55, var56, var57);
									var55 = field1134 + var55 & 0xFF;
									var57 += field1137;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method404(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field1140[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !IWTQKRSS.field821[var44 - 1].field826) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field1146[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = JJAEHWOM.field869[method406(var54, 96)];
								}

								if (var44 == 0) {
									arg1.method544(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method406(var53, var49), method406(var53, var50), method406(var53, var51), method406(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field1140[var7][var27][var40] + 1;
									byte var61 = field1158[var7][var27][var40];
									IWTQKRSS var62 = IWTQKRSS.field821[var44 - 1];
									int var63 = var62.field824;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = JJAEHWOM.method276(var63);
										var65 = -1;
									} else if (var62.field823 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method404(var62.field827, var62.field828, var62.field829);
										var64 = JJAEHWOM.field869[method422(var62.field832, 96)];
									}

									arg1.method544(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method406(var53, var49), method406(var53, var50), method406(var53, var51), method406(var53, var52), method422(var65, var49), method422(var65, var50), method422(var65, var51), method422(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field1156 - 1; var66++) {
				for (int var67 = 1; var67 < field1155 - 1; var67++) {
					arg1.method543(var7, var67, var66, method405(var67, var7, var66));
				}
			}
		}

		arg1.method570(768, -50, -10, -50, 64);

		for (int var68 = 0; var68 < field1155; var68++) {
			for (int var69 = 0; var69 < field1156; var69++) {
				if ((field1142[1][var68][var69] & 0x2) == 2) {
					arg1.method541(var69, var68);
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
				for (int var75 = 0; var75 <= field1156; var75++) {
					for (int var76 = 0; var76 <= field1155; var76++) {
						if ((field1146[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field1146[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field1156 && (field1146[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field1146[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field1146[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field1145[var80][var76][var77] - var84;
								int var86 = field1145[var79][var76][var77];
								ZCHENGKI.method542(var76 * 128, var76 * 128, var85, 1, var77 * 128, var78 * 128 + 128, var86, var73);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field1146[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field1146[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field1146[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field1155 && (field1146[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field1146[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field1146[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field1145[var92][var89][var75] - var96;
								int var98 = field1145[var91][var89][var75];
								ZCHENGKI.method542(var90 * 128 + 128, var89 * 128, var97, 2, var75 * 128, var75 * 128, var98, var73);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field1146[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field1146[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field1146[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field1156 && (field1146[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field1146[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field1155) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field1146[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field1145[var74][var101][var103];
								ZCHENGKI.method542(var102 * 128 + 128, var101 * 128, var107, 4, var103 * 128, var104 * 128 + 128, var107, var73);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field1146[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("SGOFWBIX.a(LZCHENGKI;I[B[LXSQWUDHM;II)V")
	public final void method417(ZCHENGKI arg0, int arg1, byte[] arg2, XSQWUDHM[] arg3, int arg4) {
		XQPFGONL var6 = new XQPFGONL(arg2);
		int var7 = -1;
		while (true) {
			int var8 = var6.method492();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method492();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method478();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg1 + var12;
				int var18 = arg4 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field1142[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					XSQWUDHM var20 = null;
					if (var19 >= 0) {
						var20 = arg3[var19];
					}

					method421(var13, var15, var18, arg0, var7, var20, var16, var17);
				}
			}
		}
	}

	@ObfuscatedName("SGOFWBIX.a(ZIII[LXSQWUDHM;II[BII)V")
	public final void method418(int arg0, int arg1, int arg2, XSQWUDHM[] arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg4 + var10 > 0 && arg4 + var10 < 103 && arg2 + var11 > 0 && arg2 + var11 < 103) {
					arg3[arg1].field1351[arg4 + var10][arg2 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		XQPFGONL var12 = new XQPFGONL(arg6);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg8 == var13 && var14 >= arg0 && var14 < arg0 + 8 && var15 >= arg5 && var15 < arg5 + 8) {
						method409(arg1, arg2 + MGISFZUH.method365(var14 & 0x7, arg7, var15 & 0x7), var12, 0, 0, arg7, arg4 + MGISFZUH.method364(var14 & 0x7, var15 & 0x7, arg7));
					} else {
						method409(0, -1, var12, 0, 0, 0, -1);
					}
				}
			}
		}
	}

	@ObfuscatedName("SGOFWBIX.a(LZCHENGKI;IIIZII[[[ILXSQWUDHM;II)V")
	public static final void method419(ZCHENGKI arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[][][] arg6, XSQWUDHM arg7, int arg8, int arg9) {
		int var10 = arg6[arg3][arg5][arg4];
		int var11 = arg6[arg3][arg5 + 1][arg4];
		int var12 = arg6[arg3][arg5 + 1][arg4 + 1];
		int var13 = arg6[arg3][arg5][arg4 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		DHQCHKXN var15 = DHQCHKXN.method194(arg8);
		int var16 = (arg8 << 14) + (arg4 << 7) + arg5 + 0x40000000;
		if (!var15.field585) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg1 << 6) + arg2);
		if (arg2 == 22) {
			SMAWMDZY var18;
			if (var15.field584 == -1 && var15.field604 == null) {
				var18 = var15.method191(22, arg1, var10, var11, var12, var13, -1);
			} else {
				var18 = new IKYTXJCI(var11, arg1, var10, true, arg8, 22, var12, var13, var15.field584);
			}

			arg0.method545(arg9, arg4, var16, arg5, var14, var17, var18);

			if (var15.field566 && var15.field585) {
				arg7.method517(arg5, arg4);
			}
		} else if (arg2 == 10 || arg2 == 11) {
			SMAWMDZY var19;
			if (var15.field584 == -1 && var15.field604 == null) {
				var19 = var15.method191(10, arg1, var10, var11, var12, var13, -1);
			} else {
				var19 = new IKYTXJCI(var11, arg1, var10, true, arg8, 10, var12, var13, var15.field584);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg2 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg1 == 1 || arg1 == 3) {
					var21 = var15.field567;
					var22 = var15.field598;
				} else {
					var21 = var15.field598;
					var22 = var15.field567;
				}

				arg0.method549(var17, var14, var16, var19, arg4, var22, arg9, arg5, var20, var21);
			}

			if (var15.field566) {
				arg7.method516(arg1, arg4, arg5, var15.field567, var15.field586, var15.field598);
			}
		} else if (arg2 >= 12) {
			SMAWMDZY var23;
			if (var15.field584 == -1 && var15.field604 == null) {
				var23 = var15.method191(arg2, arg1, var10, var11, var12, var13, -1);
			} else {
				var23 = new IKYTXJCI(var11, arg1, var10, true, arg8, arg2, var12, var13, var15.field584);
			}

			arg0.method549(var17, var14, var16, var23, arg4, 1, arg9, arg5, 0, 1);

			if (var15.field566) {
				arg7.method516(arg1, arg4, arg5, var15.field567, var15.field586, var15.field598);
			}
		} else if (arg2 == 0) {
			SMAWMDZY var24;
			if (var15.field584 == -1 && var15.field604 == null) {
				var24 = var15.method191(0, arg1, var10, var11, var12, var13, -1);
			} else {
				var24 = new IKYTXJCI(var11, arg1, var10, true, arg8, 0, var12, var13, var15.field584);
			}

			arg0.method547(0, var24, field1157[arg1], null, arg9, var16, var14, var17, arg4, arg5);

			if (var15.field566) {
				arg7.method515(arg2, arg1, var15.field586, arg5, arg4);
			}
		} else if (arg2 == 1) {
			SMAWMDZY var25;
			if (var15.field584 == -1 && var15.field604 == null) {
				var25 = var15.method191(1, arg1, var10, var11, var12, var13, -1);
			} else {
				var25 = new IKYTXJCI(var11, arg1, var10, true, arg8, 1, var12, var13, var15.field584);
			}

			arg0.method547(0, var25, field1141[arg1], null, arg9, var16, var14, var17, arg4, arg5);

			if (var15.field566) {
				arg7.method515(arg2, arg1, var15.field586, arg5, arg4);
			}
		} else if (arg2 == 2) {
			int var26 = arg1 + 1 & 0x3;
			SMAWMDZY var27;
			SMAWMDZY var28;
			if (var15.field584 == -1 && var15.field604 == null) {
				var27 = var15.method191(2, arg1 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method191(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new IKYTXJCI(var11, arg1 + 4, var10, true, arg8, 2, var12, var13, var15.field584);
				var28 = new IKYTXJCI(var11, var26, var10, true, arg8, 2, var12, var13, var15.field584);
			}

			arg0.method547(field1157[var26], var27, field1157[arg1], var28, arg9, var16, var14, var17, arg4, arg5);

			if (var15.field566) {
				arg7.method515(arg2, arg1, var15.field586, arg5, arg4);
			}
		} else if (arg2 == 3) {
			SMAWMDZY var29;
			if (var15.field584 == -1 && var15.field604 == null) {
				var29 = var15.method191(3, arg1, var10, var11, var12, var13, -1);
			} else {
				var29 = new IKYTXJCI(var11, arg1, var10, true, arg8, 3, var12, var13, var15.field584);
			}

			arg0.method547(0, var29, field1141[arg1], null, arg9, var16, var14, var17, arg4, arg5);

			if (var15.field566) {
				arg7.method515(arg2, arg1, var15.field586, arg5, arg4);
			}
		} else if (arg2 == 9) {
			SMAWMDZY var30;
			if (var15.field584 == -1 && var15.field604 == null) {
				var30 = var15.method191(arg2, arg1, var10, var11, var12, var13, -1);
			} else {
				var30 = new IKYTXJCI(var11, arg1, var10, true, arg8, arg2, var12, var13, var15.field584);
			}

			arg0.method549(var17, var14, var16, var30, arg4, 1, arg9, arg5, 0, 1);

			if (var15.field566) {
				arg7.method516(arg1, arg4, arg5, var15.field567, var15.field586, var15.field598);
			}
		} else {
			if (var15.field568) {
				if (arg1 == 1) {
					int var31 = var13;
					var13 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var31;
				} else if (arg1 == 2) {
					int var32 = var13;
					var13 = var11;
					var11 = var32;
					int var33 = var12;
					var12 = var10;
					var10 = var33;
				} else if (arg1 == 3) {
					int var34 = var13;
					var13 = var10;
					var10 = var11;
					var11 = var12;
					var12 = var34;
				}
			}

			if (arg2 == 4) {
				SMAWMDZY var35;
				if (var15.field584 == -1 && var15.field604 == null) {
					var35 = var15.method191(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new IKYTXJCI(var11, 0, var10, true, arg8, 4, var12, var13, var15.field584);
				}

				arg0.method548(var14, arg9, 0, var35, arg1 * 512, field1157[arg1], 0, arg4, arg5, var16, var17);
			} else if (arg2 == 5) {
				int var36 = 16;
				int var37 = arg0.method565(arg9, arg5, arg4);
				if (var37 > 0) {
					var36 = DHQCHKXN.method194(var37 >> 14 & 0x7FFF).field603;
				}

				SMAWMDZY var38;
				if (var15.field584 == -1 && var15.field604 == null) {
					var38 = var15.method191(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new IKYTXJCI(var11, 0, var10, true, arg8, 4, var12, var13, var15.field584);
				}

				arg0.method548(var14, arg9, field1144[arg1] * var36, var38, arg1 * 512, field1157[arg1], field1135[arg1] * var36, arg4, arg5, var16, var17);
			} else if (arg2 == 6) {
				SMAWMDZY var39;
				if (var15.field584 == -1 && var15.field604 == null) {
					var39 = var15.method191(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new IKYTXJCI(var11, 0, var10, true, arg8, 4, var12, var13, var15.field584);
				}

				arg0.method548(var14, arg9, 0, var39, arg1, 256, 0, arg4, arg5, var16, var17);
			} else if (arg2 == 7) {
				SMAWMDZY var40;
				if (var15.field584 == -1 && var15.field604 == null) {
					var40 = var15.method191(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new IKYTXJCI(var11, 0, var10, true, arg8, 4, var12, var13, var15.field584);
				}

				arg0.method548(var14, arg9, 0, var40, arg1, 512, 0, arg4, arg5, var16, var17);
			} else if (arg2 == 8) {
				SMAWMDZY var41;
				if (var15.field584 == -1 && var15.field604 == null) {
					var41 = var15.method191(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new IKYTXJCI(var11, 0, var10, true, arg8, 4, var12, var13, var15.field584);
				}

				arg0.method548(var14, arg9, 0, var41, arg1, 768, 0, arg4, arg5, var16, var17);
			}
		}
	}

	@ObfuscatedName("SGOFWBIX.d(II)I")
	public static final int method420(int arg0, int arg1) {
		int var2 = method408(arg0 + 45365, arg1 + 91923, 4) + (method408(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method408(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("SGOFWBIX.a(IIILZCHENGKI;ILXSQWUDHM;III)V")
	public final void method421(int arg0, int arg1, int arg2, ZCHENGKI arg3, int arg4, XSQWUDHM arg5, int arg6, int arg7) {
		if (field1148 && (field1142[0][arg7][arg2] & 0x2) == 0) {
			if ((field1142[arg0][arg7][arg2] & 0x10) != 0) {
				return;
			}

			if (method405(arg7, arg0, arg2) != field1138) {
				return;
			}
		}

		if (arg0 < field1154) {
			field1154 = arg0;
		}

		int var9 = field1145[arg0][arg7][arg2];
		int var10 = field1145[arg0][arg7 + 1][arg2];
		int var11 = field1145[arg0][arg7 + 1][arg2 + 1];
		int var12 = field1145[arg0][arg7][arg2 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		DHQCHKXN var14 = DHQCHKXN.method194(arg4);
		int var15 = (arg4 << 14) + (arg2 << 7) + arg7 + 0x40000000;
		if (!var14.field585) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg6 << 6) + arg1);
		if (arg1 == 22) {
			if (!field1148 || var14.field585 || var14.field565) {
				SMAWMDZY var17;
				if (var14.field584 == -1 && var14.field604 == null) {
					var17 = var14.method191(22, arg6, var9, var10, var11, var12, -1);
				} else {
					var17 = new IKYTXJCI(var10, arg6, var9, true, arg4, 22, var11, var12, var14.field584);
				}

				arg3.method545(arg0, arg2, var15, arg7, var13, var16, var17);

				if (var14.field566 && var14.field585 && arg5 != null) {
					arg5.method517(arg7, arg2);
				}
			}
		} else if (arg1 == 10 || arg1 == 11) {
			SMAWMDZY var18;
			if (var14.field584 == -1 && var14.field604 == null) {
				var18 = var14.method191(10, arg6, var9, var10, var11, var12, -1);
			} else {
				var18 = new IKYTXJCI(var10, arg6, var9, true, arg4, 10, var11, var12, var14.field584);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg1 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg6 == 1 || arg6 == 3) {
					var20 = var14.field567;
					var21 = var14.field598;
				} else {
					var20 = var14.field598;
					var21 = var14.field567;
				}

				if (arg3.method549(var16, var13, var15, var18, arg2, var21, arg0, arg7, var19, var20) && var14.field601) {
					ITSMSHJO var22;
					if (var18 instanceof ITSMSHJO) {
						var22 = (ITSMSHJO) var18;
					} else {
						var22 = var14.method191(10, arg6, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field777 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field1136[arg0][arg7 + var23][arg2 + var24]) {
									field1136[arg0][arg7 + var23][arg2 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field566 && arg5 != null) {
				arg5.method516(arg6, arg2, arg7, var14.field567, var14.field586, var14.field598);
			}
		} else if (arg1 >= 12) {
			SMAWMDZY var26;
			if (var14.field584 == -1 && var14.field604 == null) {
				var26 = var14.method191(arg1, arg6, var9, var10, var11, var12, -1);
			} else {
				var26 = new IKYTXJCI(var10, arg6, var9, true, arg4, arg1, var11, var12, var14.field584);
			}

			arg3.method549(var16, var13, var15, var26, arg2, 1, arg0, arg7, 0, 1);

			if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg0 > 0) {
				field1146[arg0][arg7][arg2] |= 0x924;
			}

			if (var14.field566 && arg5 != null) {
				arg5.method516(arg6, arg2, arg7, var14.field567, var14.field586, var14.field598);
			}
		} else if (arg1 == 0) {
			SMAWMDZY var27;
			if (var14.field584 == -1 && var14.field604 == null) {
				var27 = var14.method191(0, arg6, var9, var10, var11, var12, -1);
			} else {
				var27 = new IKYTXJCI(var10, arg6, var9, true, arg4, 0, var11, var12, var14.field584);
			}

			arg3.method547(0, var27, field1157[arg6], null, arg0, var15, var13, var16, arg2, arg7);

			if (arg6 == 0) {
				if (var14.field601) {
					field1136[arg0][arg7][arg2] = 50;
					field1136[arg0][arg7][arg2 + 1] = 50;
				}

				if (var14.field570) {
					field1146[arg0][arg7][arg2] |= 0x249;
				}
			} else if (arg6 == 1) {
				if (var14.field601) {
					field1136[arg0][arg7][arg2 + 1] = 50;
					field1136[arg0][arg7 + 1][arg2 + 1] = 50;
				}

				if (var14.field570) {
					field1146[arg0][arg7][arg2 + 1] |= 0x492;
				}
			} else if (arg6 == 2) {
				if (var14.field601) {
					field1136[arg0][arg7 + 1][arg2] = 50;
					field1136[arg0][arg7 + 1][arg2 + 1] = 50;
				}

				if (var14.field570) {
					field1146[arg0][arg7 + 1][arg2] |= 0x249;
				}
			} else if (arg6 == 3) {
				if (var14.field601) {
					field1136[arg0][arg7][arg2] = 50;
					field1136[arg0][arg7 + 1][arg2] = 50;
				}

				if (var14.field570) {
					field1146[arg0][arg7][arg2] |= 0x492;
				}
			}

			if (var14.field566 && arg5 != null) {
				arg5.method515(arg1, arg6, var14.field586, arg7, arg2);
			}

			if (var14.field603 != 16) {
				arg3.method555(var14.field603, arg7, arg0, arg2);
			}
		} else if (arg1 == 1) {
			SMAWMDZY var28;
			if (var14.field584 == -1 && var14.field604 == null) {
				var28 = var14.method191(1, arg6, var9, var10, var11, var12, -1);
			} else {
				var28 = new IKYTXJCI(var10, arg6, var9, true, arg4, 1, var11, var12, var14.field584);
			}

			arg3.method547(0, var28, field1141[arg6], null, arg0, var15, var13, var16, arg2, arg7);

			if (var14.field601) {
				if (arg6 == 0) {
					field1136[arg0][arg7][arg2 + 1] = 50;
				} else if (arg6 == 1) {
					field1136[arg0][arg7 + 1][arg2 + 1] = 50;
				} else if (arg6 == 2) {
					field1136[arg0][arg7 + 1][arg2] = 50;
				} else if (arg6 == 3) {
					field1136[arg0][arg7][arg2] = 50;
				}
			}

			if (var14.field566 && arg5 != null) {
				arg5.method515(arg1, arg6, var14.field586, arg7, arg2);
			}
		} else if (arg1 == 2) {
			int var29 = arg6 + 1 & 0x3;
			SMAWMDZY var30;
			SMAWMDZY var31;
			if (var14.field584 == -1 && var14.field604 == null) {
				var30 = var14.method191(2, arg6 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method191(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new IKYTXJCI(var10, arg6 + 4, var9, true, arg4, 2, var11, var12, var14.field584);
				var31 = new IKYTXJCI(var10, var29, var9, true, arg4, 2, var11, var12, var14.field584);
			}

			arg3.method547(field1157[var29], var30, field1157[arg6], var31, arg0, var15, var13, var16, arg2, arg7);

			if (var14.field570) {
				if (arg6 == 0) {
					field1146[arg0][arg7][arg2] |= 0x249;
					field1146[arg0][arg7][arg2 + 1] |= 0x492;
				} else if (arg6 == 1) {
					field1146[arg0][arg7][arg2 + 1] |= 0x492;
					field1146[arg0][arg7 + 1][arg2] |= 0x249;
				} else if (arg6 == 2) {
					field1146[arg0][arg7 + 1][arg2] |= 0x249;
					field1146[arg0][arg7][arg2] |= 0x492;
				} else if (arg6 == 3) {
					field1146[arg0][arg7][arg2] |= 0x492;
					field1146[arg0][arg7][arg2] |= 0x249;
				}
			}

			if (var14.field566 && arg5 != null) {
				arg5.method515(arg1, arg6, var14.field586, arg7, arg2);
			}

			if (var14.field603 != 16) {
				arg3.method555(var14.field603, arg7, arg0, arg2);
			}
		} else if (arg1 == 3) {
			SMAWMDZY var32;
			if (var14.field584 == -1 && var14.field604 == null) {
				var32 = var14.method191(3, arg6, var9, var10, var11, var12, -1);
			} else {
				var32 = new IKYTXJCI(var10, arg6, var9, true, arg4, 3, var11, var12, var14.field584);
			}

			arg3.method547(0, var32, field1141[arg6], null, arg0, var15, var13, var16, arg2, arg7);

			if (var14.field601) {
				if (arg6 == 0) {
					field1136[arg0][arg7][arg2 + 1] = 50;
				} else if (arg6 == 1) {
					field1136[arg0][arg7 + 1][arg2 + 1] = 50;
				} else if (arg6 == 2) {
					field1136[arg0][arg7 + 1][arg2] = 50;
				} else if (arg6 == 3) {
					field1136[arg0][arg7][arg2] = 50;
				}
			}

			if (var14.field566 && arg5 != null) {
				arg5.method515(arg1, arg6, var14.field586, arg7, arg2);
			}
		} else if (arg1 == 9) {
			SMAWMDZY var33;
			if (var14.field584 == -1 && var14.field604 == null) {
				var33 = var14.method191(arg1, arg6, var9, var10, var11, var12, -1);
			} else {
				var33 = new IKYTXJCI(var10, arg6, var9, true, arg4, arg1, var11, var12, var14.field584);
			}

			arg3.method549(var16, var13, var15, var33, arg2, 1, arg0, arg7, 0, 1);

			if (var14.field566 && arg5 != null) {
				arg5.method516(arg6, arg2, arg7, var14.field567, var14.field586, var14.field598);
			}
		} else {
			if (var14.field568) {
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
				SMAWMDZY var38;
				if (var14.field584 == -1 && var14.field604 == null) {
					var38 = var14.method191(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new IKYTXJCI(var10, 0, var9, true, arg4, 4, var11, var12, var14.field584);
				}

				arg3.method548(var13, arg0, 0, var38, arg6 * 512, field1157[arg6], 0, arg2, arg7, var15, var16);
			} else if (arg1 == 5) {
				int var39 = 16;
				int var40 = arg3.method565(arg0, arg7, arg2);
				if (var40 > 0) {
					var39 = DHQCHKXN.method194(var40 >> 14 & 0x7FFF).field603;
				}

				SMAWMDZY var41;
				if (var14.field584 == -1 && var14.field604 == null) {
					var41 = var14.method191(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new IKYTXJCI(var10, 0, var9, true, arg4, 4, var11, var12, var14.field584);
				}

				arg3.method548(var13, arg0, field1144[arg6] * var39, var41, arg6 * 512, field1157[arg6], field1135[arg6] * var39, arg2, arg7, var15, var16);
			} else if (arg1 == 6) {
				SMAWMDZY var42;
				if (var14.field584 == -1 && var14.field604 == null) {
					var42 = var14.method191(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new IKYTXJCI(var10, 0, var9, true, arg4, 4, var11, var12, var14.field584);
				}

				arg3.method548(var13, arg0, 0, var42, arg6, 256, 0, arg2, arg7, var15, var16);
			} else if (arg1 == 7) {
				SMAWMDZY var43;
				if (var14.field584 == -1 && var14.field604 == null) {
					var43 = var14.method191(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new IKYTXJCI(var10, 0, var9, true, arg4, 4, var11, var12, var14.field584);
				}

				arg3.method548(var13, arg0, 0, var43, arg6, 512, 0, arg2, arg7, var15, var16);
			} else if (arg1 == 8) {
				SMAWMDZY var44;
				if (var14.field584 == -1 && var14.field604 == null) {
					var44 = var14.method191(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new IKYTXJCI(var10, 0, var9, true, arg4, 4, var11, var12, var14.field584);
				}

				arg3.method548(var13, arg0, 0, var44, arg6, 768, 0, arg2, arg7, var15, var16);
			}
		}
	}

	@ObfuscatedName("SGOFWBIX.e(II)I")
	public final int method422(int arg0, int arg1) {
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

	public SGOFWBIX(int[][][] arg0, int arg1, int arg2, byte[][][] arg3) {
		field1154 = 99;
		field1155 = arg2;
		field1156 = arg1;
		field1145 = arg0;
		field1142 = arg3;
		field1139 = new byte[4][field1155][field1156];
		field1147 = new byte[4][field1155][field1156];
		field1140 = new byte[4][field1155][field1156];
		field1158 = new byte[4][field1155][field1156];
		field1146 = new int[4][field1155 + 1][field1156 + 1];
		field1136 = new byte[4][field1155 + 1][field1156 + 1];
		field1143 = new int[field1155 + 1][field1156 + 1];
		field1149 = new int[field1156];
		field1150 = new int[field1156];
		field1151 = new int[field1156];
		field1152 = new int[field1156];
		field1153 = new int[field1156];
	}
}
