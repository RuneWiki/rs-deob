package deob;

@ObfuscatedName("SSYGWTYM")
public final class SSYGWTYM {

	@ObfuscatedName("SSYGWTYM.C")
	public int field1162;

	@ObfuscatedName("SSYGWTYM.D")
	public int field1163;

	@ObfuscatedName("SSYGWTYM.f")
	public int[][][] field1145;

	@ObfuscatedName("SSYGWTYM.a")
	public byte[][][] field1140;

	@ObfuscatedName("SSYGWTYM.E")
	public byte[][][] field1164;

	@ObfuscatedName("SSYGWTYM.x")
	public byte[][][] field1157;

	@ObfuscatedName("SSYGWTYM.y")
	public byte[][][] field1158;

	@ObfuscatedName("SSYGWTYM.o")
	public byte[][][] field1151;

	@ObfuscatedName("SSYGWTYM.k")
	public int[][][] field1149;

	@ObfuscatedName("SSYGWTYM.e")
	public byte[][][] field1144;

	@ObfuscatedName("SSYGWTYM.z")
	public int[][] field1159;

	@ObfuscatedName("SSYGWTYM.p")
	public int[] field1152;

	@ObfuscatedName("SSYGWTYM.q")
	public int[] field1153;

	@ObfuscatedName("SSYGWTYM.r")
	public int[] field1154;

	@ObfuscatedName("SSYGWTYM.s")
	public int[] field1155;

	@ObfuscatedName("SSYGWTYM.t")
	public int[] field1156;

	@ObfuscatedName("SSYGWTYM.b")
	public static boolean field1141 = true;

	@ObfuscatedName("SSYGWTYM.c")
	public static final int[] field1142 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("SSYGWTYM.d")
	public static final int[] field1143 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("SSYGWTYM.l")
	public static final int[] field1150 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("SSYGWTYM.A")
	public static final int[] field1160 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("SSYGWTYM.B")
	public static int field1161 = 99;

	@ObfuscatedName("SSYGWTYM.g")
	public static int field1146 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("SSYGWTYM.h")
	public static int field1147 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("SSYGWTYM.j")
	public static int field1148;

	@ObfuscatedName("SSYGWTYM.a(II)I")
	public static final int method397(int arg0, int arg1) {
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

	@ObfuscatedName("SSYGWTYM.a(IIIII)V")
	public final void method398(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
			for (int var6 = arg3; var6 <= arg1 + arg3; var6++) {
				if (var6 >= 0 && var6 < field1162 && var5 >= 0 && var5 < field1163) {
					field1144[0][var6][var5] = 127;

					if (arg3 == var6 && var6 > 0) {
						field1145[0][var6][var5] = field1145[0][var6 - 1][var5];
					}

					if (arg1 + arg3 == var6 && var6 < field1162 - 1) {
						field1145[0][var6][var5] = field1145[0][var6 + 1][var5];
					}

					if (arg0 == var5 && var5 > 0) {
						field1145[0][var6][var5] = field1145[0][var6][var5 - 1];
					}

					if (arg0 + arg2 == var5 && var5 < field1163 - 1) {
						field1145[0][var6][var5] = field1145[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("SSYGWTYM.b(II)I")
	public static final int method399(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("SSYGWTYM.a(IIII)I")
	public static final int method400(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - PTUBVHCT.field987[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	public SSYGWTYM(int[][][] arg0, int arg1, int arg2, byte[][][] arg3) {
		field1161 = 99;
		field1162 = arg1;
		field1163 = arg2;
		field1145 = arg0;
		field1140 = arg3;
		field1164 = new byte[4][field1162][field1163];
		field1157 = new byte[4][field1162][field1163];
		field1158 = new byte[4][field1162][field1163];
		field1151 = new byte[4][field1162][field1163];
		field1149 = new int[4][field1162 + 1][field1163 + 1];
		field1144 = new byte[4][field1162 + 1][field1163 + 1];
		field1159 = new int[field1162 + 1][field1163 + 1];
		field1152 = new int[field1163];
		field1153 = new int[field1163];
		field1154 = new int[field1163];
		field1155 = new int[field1163];
		field1156 = new int[field1163];
	}

	@ObfuscatedName("SSYGWTYM.a(IBII)V")
	public final void method401(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 8; var4++) {
			for (int var5 = 0; var5 < 8; var5++) {
				field1145[arg0][arg2 + var4][arg1 + var5] = 0;
			}
		}

		if (arg2 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				field1145[arg0][arg2][arg1 + var6] = field1145[arg0][arg2 - 1][arg1 + var6];
			}
		}

		if (arg1 > 0) {
			for (int var7 = 1; var7 < 8; var7++) {
				field1145[arg0][arg2 + var7][arg1] = field1145[arg0][arg2 + var7][arg1 - 1];
			}
		}

		if (arg2 > 0 && field1145[arg0][arg2 - 1][arg1] != 0) {
			field1145[arg0][arg2][arg1] = field1145[arg0][arg2 - 1][arg1];
		} else if (arg1 > 0 && field1145[arg0][arg2][arg1 - 1] != 0) {
			field1145[arg0][arg2][arg1] = field1145[arg0][arg2][arg1 - 1];
		} else if (arg2 > 0 && arg1 > 0 && field1145[arg0][arg2 - 1][arg1 - 1] != 0) {
			field1145[arg0][arg2][arg1] = field1145[arg0][arg2 - 1][arg1 - 1];
		}
	}

	@ObfuscatedName("SSYGWTYM.a(IIIILEMWAMCXW;III)V")
	public final void method402(int arg0, int arg1, int arg2, EMWAMCXW arg3, int arg4, int arg5, int arg6) {
		if (arg4 >= 0 && arg4 < 104 && arg0 >= 0 && arg0 < 104) {
			field1140[arg6][arg4][arg0] = 0;
			while (true) {
				int var8 = arg3.method217();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg3.method217();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg6 == 0) {
						field1145[0][arg4][arg0] = -var9 * 8;
						return;
					}

					field1145[arg6][arg4][arg0] = field1145[arg6 - 1][arg4][arg0] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field1157[arg6][arg4][arg0] = arg3.method218();
					field1158[arg6][arg4][arg0] = (byte) ((var8 - 2) / 4);
					field1151[arg6][arg4][arg0] = (byte) (var8 + arg2 - 2 & 0x3);
				} else if (var8 <= 81) {
					field1140[arg6][arg4][arg0] = (byte) (var8 - 49);
				} else {
					field1164[arg6][arg4][arg0] = (byte) (var8 - 81);
				}
			}

			if (arg6 == 0) {
				field1145[0][arg4][arg0] = -method414(arg4 + arg1 + 932731, arg0 + 556238 + arg5) * 8;
			} else {
				field1145[arg6][arg4][arg0] = field1145[arg6 - 1][arg4][arg0] - 240;
			}
		} else {
			while (true) {
				int var10 = arg3.method217();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg3.method217();
					return;
				}

				if (var10 <= 49) {
					arg3.method217();
				}
			}
		}
	}

	@ObfuscatedName("SSYGWTYM.c(II)I")
	public static final int method403(int arg0, int arg1) {
		int var2 = method399(arg0 - 1, arg1 - 1) + method399(arg0 + 1, arg1 - 1) + method399(arg0 - 1, arg1 + 1) + method399(arg0 + 1, arg1 + 1);
		int var3 = method399(arg0 - 1, arg1) + method399(arg0 + 1, arg1) + method399(arg0, arg1 - 1) + method399(arg0, arg1 + 1);
		int var4 = method399(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("SSYGWTYM.a([LCAMRNFMB;IIII[BZ)V")
	public final void method404(CAMRNFMB[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg3 + var8 > 0 && arg3 + var8 < 103 && arg1 + var9 > 0 && arg1 + var9 < 103) {
						arg0[var7].field119[arg3 + var8][arg1 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		EMWAMCXW var10 = new EMWAMCXW(arg5);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method402(arg1 + var13, arg2, 0, var10, arg3 + var12, arg4, var11);
				}
			}
		}
	}

	@ObfuscatedName("SSYGWTYM.a(IIIZ)I")
	public int method405(int arg0, int arg1, int arg2) {
		if ((field1140[arg1][arg2][arg0] & 0x8) != 0) {
			return 0;
		}

		if (arg1 > 0 && (field1140[1][arg2][arg0] & 0x2) != 0) {
			return arg1 - 1;
		}

		return arg1;
	}

	@ObfuscatedName("SSYGWTYM.a(LEMWAMCXW;ILKMIIMWED;)V")
	public static final void method406(EMWAMCXW arg0, KMIIMWED arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method231();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			AMVKCKZF var4 = AMVKCKZF.method4(var2);
			var4.method7(arg1);

			while (true) {
				int var5 = arg0.method231();
				if (var5 == 0) {
					break;
				}

				arg0.method217();
			}
		}
	}

	@ObfuscatedName("SSYGWTYM.a(IZI[LCAMRNFMB;[BLZPFBNGWW;)V")
	public final void method407(int arg0, int arg1, CAMRNFMB[] arg2, byte[] arg3, ZPFBNGWW arg4) {
		EMWAMCXW var6 = new EMWAMCXW(arg3);
		int var7 = -1;
		while (true) {
			int var8 = var6.method231();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method231();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method217();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg0 + var12;
				int var18 = arg1 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field1140[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					CAMRNFMB var20 = null;
					if (var19 >= 0) {
						var20 = arg2[var19];
					}

					method416(var15, var16, var18, var13, var17, var7, arg4, var20);
				}
			}
		}
	}

	@ObfuscatedName("SSYGWTYM.a([LCAMRNFMB;LZPFBNGWW;B)V")
	public final void method408(CAMRNFMB[] arg0, ZPFBNGWW arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field1140[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field1140[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg0[var6].method31(var5, var4);
						}
					}
				}
			}
		}

		field1146 += (int) (Math.random() * 5.0D) - 2;
		if (field1146 < -8) {
			field1146 = -8;
		}

		if (field1146 > 8) {
			field1146 = 8;
		}

		field1147 += (int) (Math.random() * 5.0D) - 2;
		if (field1147 < -16) {
			field1147 = -16;
		}

		if (field1147 > 16) {
			field1147 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field1144[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field1163 - 1; var16++) {
				for (int var17 = 1; var17 < field1162 - 1; var17++) {
					int var18 = field1145[var7][var17 + 1][var16] - field1145[var7][var17 - 1][var16];
					int var19 = field1145[var7][var17][var16 + 1] - field1145[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field1159[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field1163; var26++) {
				field1152[var26] = 0;
				field1153[var26] = 0;
				field1154[var26] = 0;
				field1155[var26] = 0;
				field1156[var26] = 0;
			}

			for (int var27 = -5; var27 < field1162 + 5; var27++) {
				for (int var28 = 0; var28 < field1163; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field1162) {
						int var30 = field1164[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							RSGRNXCC var31 = RSGRNXCC.field1114[var30 - 1];
							field1152[var28] += var31.field1123;
							field1153[var28] += var31.field1121;
							field1154[var28] += var31.field1122;
							field1155[var28] += var31.field1124;
							field1156[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field1162) {
						int var33 = field1164[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							RSGRNXCC var34 = RSGRNXCC.field1114[var33 - 1];
							field1152[var28] -= var34.field1123;
							field1153[var28] -= var34.field1121;
							field1154[var28] -= var34.field1122;
							field1155[var28] -= var34.field1124;
							field1156[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field1162 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field1163 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field1163) {
							var35 += field1152[var41];
							var36 += field1153[var41];
							var37 += field1154[var41];
							var38 += field1155[var41];
							var39 += field1156[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field1163) {
							var35 -= field1152[var42];
							var36 -= field1153[var42];
							var37 -= field1154[var42];
							var38 -= field1155[var42];
							var39 -= field1156[var42];
						}

						if (var40 >= 1 && var40 < field1163 - 1 && (!field1141 || (field1140[0][var27][var40] & 0x2) != 0 || (field1140[var7][var27][var40] & 0x10) == 0 && method405(var40, var7, var27) == field1148)) {
							if (var7 < field1161) {
								field1161 = var7;
							}

							int var43 = field1164[var7][var27][var40] & 0xFF;
							int var44 = field1157[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field1145[var7][var27][var40];
								int var46 = field1145[var7][var27 + 1][var40];
								int var47 = field1145[var7][var27 + 1][var40 + 1];
								int var48 = field1145[var7][var27][var40 + 1];
								int var49 = field1159[var27][var40];
								int var50 = field1159[var27 + 1][var40];
								int var51 = field1159[var27 + 1][var40 + 1];
								int var52 = field1159[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method412(var55, var56, var57);
									var55 = field1146 + var55 & 0xFF;
									var57 += field1147;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method412(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field1158[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !RSGRNXCC.field1114[var44 - 1].field1119) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field1149[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = PTUBVHCT.field998[method397(var54, 96)];
								}

								if (var44 == 0) {
									arg1.method521(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method397(var53, var49), method397(var53, var50), method397(var53, var51), method397(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field1158[var7][var27][var40] + 1;
									byte var61 = field1151[var7][var27][var40];
									RSGRNXCC var62 = RSGRNXCC.field1114[var44 - 1];
									int var63 = var62.field1117;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = PTUBVHCT.method355(var63);
										var65 = -1;
									} else if (var62.field1116 == 0xFF00FF) {
										var65 = -2;
										var63 = -1;
										var64 = PTUBVHCT.field998[method411(var62.field1125, 96)];
									} else {
										var65 = method412(var62.field1120, var62.field1121, var62.field1122);
										var64 = PTUBVHCT.field998[method411(var62.field1125, 96)];
									}

									arg1.method521(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method397(var53, var49), method397(var53, var50), method397(var53, var51), method397(var53, var52), method411(var65, var49), method411(var65, var50), method411(var65, var51), method411(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field1163 - 1; var66++) {
				for (int var67 = 1; var67 < field1162 - 1; var67++) {
					arg1.method520(var7, var67, var66, method405(var66, var7, var67));
				}
			}
		}

		arg1.method547(-10, -50, -50);

		for (int var68 = 0; var68 < field1162; var68++) {
			for (int var69 = 0; var69 < field1163; var69++) {
				if ((field1140[1][var68][var69] & 0x2) == 2) {
					arg1.method518(var69, var68);
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
				for (int var75 = 0; var75 <= field1163; var75++) {
					for (int var76 = 0; var76 <= field1162; var76++) {
						if ((field1149[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field1149[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field1163 && (field1149[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field1149[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field1149[var80 + 1][var76][var82] & var70) == 0) {
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
								ZPFBNGWW.method519(var85, var78 * 128 + 128, var77 * 128, var76 * 128, var76 * 128, 1, var73, var86);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field1149[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field1149[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field1149[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field1162 && (field1149[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field1149[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field1149[var92 + 1][var94][var75] & var71) == 0) {
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
								ZPFBNGWW.method519(var97, var75 * 128, var75 * 128, var89 * 128, var90 * 128 + 128, 2, var73, var98);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field1149[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field1149[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field1149[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field1163 && (field1149[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field1149[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field1162) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field1149[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field1145[var74][var101][var103];
								ZPFBNGWW.method519(var107, var104 * 128 + 128, var103 * 128, var101 * 128, var102 * 128 + 128, 4, var73, var107);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field1149[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("SSYGWTYM.a(II[LCAMRNFMB;I[BLZPFBNGWW;IIIII)V")
	public final void method409(int arg0, int arg1, CAMRNFMB[] arg2, int arg3, byte[] arg4, ZPFBNGWW arg5, int arg6, int arg7, int arg8, int arg9) {
		EMWAMCXW var11 = new EMWAMCXW(arg4);
		int var12 = -1;
		while (true) {
			int var13 = var11.method231();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method231();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method217();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg9 == var18 && var17 >= arg1 && var17 < arg1 + 8 && var16 >= arg6 && var16 < arg6 + 8) {
					AMVKCKZF var22 = AMVKCKZF.method4(var12);
					int var23 = arg7 + FPWTEYKY.method261(var21, arg0, var22.field21, var17 & 0x7, var16 & 0x7, var22.field30);
					int var24 = arg3 + FPWTEYKY.method262(var17 & 0x7, var16 & 0x7, arg0, var21, var22.field30, var22.field21);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg8;
						if ((field1140[1][var23][var24] & 0x2) == 2) {
							var25 = arg8 - 1;
						}

						CAMRNFMB var26 = null;
						if (var25 >= 0) {
							var26 = arg2[var25];
						}

						method416(var20, arg0 + var21 & 0x3, var24, arg8, var23, var12, arg5, var26);
					}
				}
			}
		}
	}

	@ObfuscatedName("SSYGWTYM.a(III)I")
	public static final int method410(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method403(var3, var5);
		int var8 = method403(var3 + 1, var5);
		int var9 = method403(var3, var5 + 1);
		int var10 = method403(var3 + 1, var5 + 1);
		int var11 = method400(var7, var8, var4, arg2);
		int var12 = method400(var9, var10, var4, arg2);
		return method400(var11, var12, var6, arg2);
	}

	@ObfuscatedName("SSYGWTYM.d(II)I")
	public final int method411(int arg0, int arg1) {
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

	@ObfuscatedName("SSYGWTYM.b(III)I")
	public final int method412(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("SSYGWTYM.c(III)Z")
	public static final boolean method413(int arg0, int arg1) {
		AMVKCKZF var2 = AMVKCKZF.method4(arg0);

		if (arg1 == 11) {
			arg1 = 10;
		}

		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}

		return var2.method9(arg1);
	}

	@ObfuscatedName("SSYGWTYM.e(II)I")
	public static final int method414(int arg0, int arg1) {
		int var2 = method410(arg0 + 45365, arg1 + 91923, 4) + (method410(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method410(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("SSYGWTYM.a(IIII[BIIII[LCAMRNFMB;)V")
	public final void method415(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, CAMRNFMB[] arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg2 + var10 > 0 && arg2 + var10 < 103 && arg7 + var11 > 0 && arg7 + var11 < 103) {
					arg8[arg5].field119[arg2 + var10][arg7 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		EMWAMCXW var12 = new EMWAMCXW(arg4);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg3 == var13 && var14 >= arg0 && var14 < arg0 + 8 && var15 >= arg1 && var15 < arg1 + 8) {
						method402(arg7 + FPWTEYKY.method260(var14 & 0x7, arg6, var15 & 0x7), 0, arg6, var12, arg2 + FPWTEYKY.method259(var14 & 0x7, arg6, var15 & 0x7), 0, arg5);
					} else {
						method402(-1, 0, 0, var12, -1, 0, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("SSYGWTYM.a(IIIIIIILZPFBNGWW;LCAMRNFMB;)V")
	public final void method416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, ZPFBNGWW arg6, CAMRNFMB arg7) {
		if (field1141 && (field1140[0][arg4][arg2] & 0x2) == 0) {
			if ((field1140[arg3][arg4][arg2] & 0x10) != 0) {
				return;
			}

			if (method405(arg2, arg3, arg4) != field1148) {
				return;
			}
		}

		if (arg3 < field1161) {
			field1161 = arg3;
		}

		int var9 = field1145[arg3][arg4][arg2];
		int var10 = field1145[arg3][arg4 + 1][arg2];
		int var11 = field1145[arg3][arg4 + 1][arg2 + 1];
		int var12 = field1145[arg3][arg4][arg2 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		AMVKCKZF var14 = AMVKCKZF.method4(arg5);
		int var15 = (arg5 << 14) + (arg2 << 7) + arg4 + 0x40000000;
		if (!var14.field4) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg1 << 6) + arg0);
		if (arg0 == 22) {
			if (!field1141 || var14.field4 || var14.field10) {
				DVAULXJA var17;
				if (var14.field20 == -1 && var14.field17 == null) {
					var17 = var14.method5(22, arg1, var9, var10, var11, var12, -1);
				} else {
					var17 = new QARHEJHA(var11, var12, arg1, 22, var9, arg5, var10, var14.field20, true);
				}

				arg6.method522(arg2, arg4, var15, var13, var16, var17, arg3);

				if (var14.field24 && var14.field4 && arg7 != null) {
					arg7.method31(arg2, arg4);
				}
			}
		} else if (arg0 == 10 || arg0 == 11) {
			DVAULXJA var18;
			if (var14.field20 == -1 && var14.field17 == null) {
				var18 = var14.method5(10, arg1, var9, var10, var11, var12, -1);
			} else {
				var18 = new QARHEJHA(var11, var12, arg1, 10, var9, arg5, var10, var14.field20, true);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg0 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg1 == 1 || arg1 == 3) {
					var20 = var14.field30;
					var21 = var14.field21;
				} else {
					var20 = var14.field21;
					var21 = var14.field30;
				}

				if (arg6.method526(var13, var16, arg2, var19, var18, var20, var21, arg3, arg4, var15) && var14.field7) {
					IEHKDFMR var22;
					if (var18 instanceof IEHKDFMR) {
						var22 = (IEHKDFMR) var18;
					} else {
						var22 = var14.method5(10, arg1, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field686 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field1144[arg3][arg4 + var23][arg2 + var24]) {
									field1144[arg3][arg4 + var23][arg2 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field24 && arg7 != null) {
				arg7.method30(var14.field30, var14.field22, arg2, arg4, var14.field21, arg1);
			}
		} else if (arg0 >= 12) {
			DVAULXJA var26;
			if (var14.field20 == -1 && var14.field17 == null) {
				var26 = var14.method5(arg0, arg1, var9, var10, var11, var12, -1);
			} else {
				var26 = new QARHEJHA(var11, var12, arg1, arg0, var9, arg5, var10, var14.field20, true);
			}

			arg6.method526(var13, var16, arg2, 0, var26, 1, 1, arg3, arg4, var15);

			if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg3 > 0) {
				field1149[arg3][arg4][arg2] |= 0x924;
			}

			if (var14.field24 && arg7 != null) {
				arg7.method30(var14.field30, var14.field22, arg2, arg4, var14.field21, arg1);
			}
		} else if (arg0 == 0) {
			DVAULXJA var27;
			if (var14.field20 == -1 && var14.field17 == null) {
				var27 = var14.method5(0, arg1, var9, var10, var11, var12, -1);
			} else {
				var27 = new QARHEJHA(var11, var12, arg1, 0, var9, arg5, var10, var14.field20, true);
			}

			arg6.method524(arg3, 0, var13, var15, var27, arg2, null, var16, field1160[arg1], arg4);

			if (arg1 == 0) {
				if (var14.field7) {
					field1144[arg3][arg4][arg2] = 50;
					field1144[arg3][arg4][arg2 + 1] = 50;
				}

				if (var14.field29) {
					field1149[arg3][arg4][arg2] |= 0x249;
				}
			} else if (arg1 == 1) {
				if (var14.field7) {
					field1144[arg3][arg4][arg2 + 1] = 50;
					field1144[arg3][arg4 + 1][arg2 + 1] = 50;
				}

				if (var14.field29) {
					field1149[arg3][arg4][arg2 + 1] |= 0x492;
				}
			} else if (arg1 == 2) {
				if (var14.field7) {
					field1144[arg3][arg4 + 1][arg2] = 50;
					field1144[arg3][arg4 + 1][arg2 + 1] = 50;
				}

				if (var14.field29) {
					field1149[arg3][arg4 + 1][arg2] |= 0x249;
				}
			} else if (arg1 == 3) {
				if (var14.field7) {
					field1144[arg3][arg4][arg2] = 50;
					field1144[arg3][arg4 + 1][arg2] = 50;
				}

				if (var14.field29) {
					field1149[arg3][arg4][arg2] |= 0x492;
				}
			}

			if (var14.field24 && arg7 != null) {
				arg7.method29(arg4, arg2, arg0, var14.field22, arg1);
			}

			if (var14.field35 != 16) {
				arg6.method532(var14.field35, arg2, arg4, arg3);
			}
		} else if (arg0 == 1) {
			DVAULXJA var28;
			if (var14.field20 == -1 && var14.field17 == null) {
				var28 = var14.method5(1, arg1, var9, var10, var11, var12, -1);
			} else {
				var28 = new QARHEJHA(var11, var12, arg1, 1, var9, arg5, var10, var14.field20, true);
			}

			arg6.method524(arg3, 0, var13, var15, var28, arg2, null, var16, field1142[arg1], arg4);

			if (var14.field7) {
				if (arg1 == 0) {
					field1144[arg3][arg4][arg2 + 1] = 50;
				} else if (arg1 == 1) {
					field1144[arg3][arg4 + 1][arg2 + 1] = 50;
				} else if (arg1 == 2) {
					field1144[arg3][arg4 + 1][arg2] = 50;
				} else if (arg1 == 3) {
					field1144[arg3][arg4][arg2] = 50;
				}
			}

			if (var14.field24 && arg7 != null) {
				arg7.method29(arg4, arg2, arg0, var14.field22, arg1);
			}
		} else if (arg0 == 2) {
			int var29 = arg1 + 1 & 0x3;
			DVAULXJA var30;
			DVAULXJA var31;
			if (var14.field20 == -1 && var14.field17 == null) {
				var30 = var14.method5(2, arg1 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method5(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new QARHEJHA(var11, var12, arg1 + 4, 2, var9, arg5, var10, var14.field20, true);
				var31 = new QARHEJHA(var11, var12, var29, 2, var9, arg5, var10, var14.field20, true);
			}

			arg6.method524(arg3, field1160[var29], var13, var15, var30, arg2, var31, var16, field1160[arg1], arg4);

			if (var14.field29) {
				if (arg1 == 0) {
					field1149[arg3][arg4][arg2] |= 0x249;
					field1149[arg3][arg4][arg2 + 1] |= 0x492;
				} else if (arg1 == 1) {
					field1149[arg3][arg4][arg2 + 1] |= 0x492;
					field1149[arg3][arg4 + 1][arg2] |= 0x249;
				} else if (arg1 == 2) {
					field1149[arg3][arg4 + 1][arg2] |= 0x249;
					field1149[arg3][arg4][arg2] |= 0x492;
				} else if (arg1 == 3) {
					field1149[arg3][arg4][arg2] |= 0x492;
					field1149[arg3][arg4][arg2] |= 0x249;
				}
			}

			if (var14.field24 && arg7 != null) {
				arg7.method29(arg4, arg2, arg0, var14.field22, arg1);
			}

			if (var14.field35 != 16) {
				arg6.method532(var14.field35, arg2, arg4, arg3);
			}
		} else if (arg0 == 3) {
			DVAULXJA var32;
			if (var14.field20 == -1 && var14.field17 == null) {
				var32 = var14.method5(3, arg1, var9, var10, var11, var12, -1);
			} else {
				var32 = new QARHEJHA(var11, var12, arg1, 3, var9, arg5, var10, var14.field20, true);
			}

			arg6.method524(arg3, 0, var13, var15, var32, arg2, null, var16, field1142[arg1], arg4);

			if (var14.field7) {
				if (arg1 == 0) {
					field1144[arg3][arg4][arg2 + 1] = 50;
				} else if (arg1 == 1) {
					field1144[arg3][arg4 + 1][arg2 + 1] = 50;
				} else if (arg1 == 2) {
					field1144[arg3][arg4 + 1][arg2] = 50;
				} else if (arg1 == 3) {
					field1144[arg3][arg4][arg2] = 50;
				}
			}

			if (var14.field24 && arg7 != null) {
				arg7.method29(arg4, arg2, arg0, var14.field22, arg1);
			}
		} else if (arg0 == 9) {
			DVAULXJA var33;
			if (var14.field20 == -1 && var14.field17 == null) {
				var33 = var14.method5(arg0, arg1, var9, var10, var11, var12, -1);
			} else {
				var33 = new QARHEJHA(var11, var12, arg1, arg0, var9, arg5, var10, var14.field20, true);
			}

			arg6.method526(var13, var16, arg2, 0, var33, 1, 1, arg3, arg4, var15);

			if (var14.field24 && arg7 != null) {
				arg7.method30(var14.field30, var14.field22, arg2, arg4, var14.field21, arg1);
			}
		} else {
			if (var14.field47) {
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

			if (arg0 == 4) {
				DVAULXJA var38;
				if (var14.field20 == -1 && var14.field17 == null) {
					var38 = var14.method5(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new QARHEJHA(var11, var12, 0, 4, var9, arg5, var10, var14.field20, true);
				}

				arg6.method525(var38, arg3, var15, arg4, 0, 0, var16, var13, arg1 * 512, field1160[arg1], arg2);
			} else if (arg0 == 5) {
				int var39 = 16;
				int var40 = arg6.method542(arg3, arg4, arg2);
				if (var40 > 0) {
					var39 = AMVKCKZF.method4(var40 >> 14 & 0x7FFF).field35;
				}

				DVAULXJA var41;
				if (var14.field20 == -1 && var14.field17 == null) {
					var41 = var14.method5(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new QARHEJHA(var11, var12, 0, 4, var9, arg5, var10, var14.field20, true);
				}

				arg6.method525(var41, arg3, var15, arg4, field1143[arg1] * var39, field1150[arg1] * var39, var16, var13, arg1 * 512, field1160[arg1], arg2);
			} else if (arg0 == 6) {
				DVAULXJA var42;
				if (var14.field20 == -1 && var14.field17 == null) {
					var42 = var14.method5(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new QARHEJHA(var11, var12, 0, 4, var9, arg5, var10, var14.field20, true);
				}

				arg6.method525(var42, arg3, var15, arg4, 0, 0, var16, var13, arg1, 256, arg2);
			} else if (arg0 == 7) {
				DVAULXJA var43;
				if (var14.field20 == -1 && var14.field17 == null) {
					var43 = var14.method5(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new QARHEJHA(var11, var12, 0, 4, var9, arg5, var10, var14.field20, true);
				}

				arg6.method525(var43, arg3, var15, arg4, 0, 0, var16, var13, arg1, 512, arg2);
			} else if (arg0 == 8) {
				DVAULXJA var44;
				if (var14.field20 == -1 && var14.field17 == null) {
					var44 = var14.method5(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new QARHEJHA(var11, var12, 0, 4, var9, arg5, var10, var14.field20, true);
				}

				arg6.method525(var44, arg3, var15, arg4, 0, 0, var16, var13, arg1, 768, arg2);
			}
		}
	}

	@ObfuscatedName("SSYGWTYM.a(I[[[ILZPFBNGWW;IILCAMRNFMB;IIIII)V")
	public static final void method417(int arg0, int[][][] arg1, ZPFBNGWW arg2, int arg3, int arg4, CAMRNFMB arg5, int arg6, int arg7, int arg8, int arg9) {
		int var10 = arg1[arg9][arg0][arg8];
		int var11 = arg1[arg9][arg0 + 1][arg8];
		int var12 = arg1[arg9][arg0 + 1][arg8 + 1];
		int var13 = arg1[arg9][arg0][arg8 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		AMVKCKZF var15 = AMVKCKZF.method4(arg6);
		int var16 = (arg6 << 14) + (arg8 << 7) + arg0 + 0x40000000;
		if (!var15.field4) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg3 << 6) + arg7);
		if (arg7 == 22) {
			DVAULXJA var18;
			if (var15.field20 == -1 && var15.field17 == null) {
				var18 = var15.method5(22, arg3, var10, var11, var12, var13, -1);
			} else {
				var18 = new QARHEJHA(var12, var13, arg3, 22, var10, arg6, var11, var15.field20, true);
			}

			arg2.method522(arg8, arg0, var16, var14, var17, var18, arg4);

			if (var15.field24 && var15.field4) {
				arg5.method31(arg8, arg0);
			}
		} else if (arg7 == 10 || arg7 == 11) {
			DVAULXJA var19;
			if (var15.field20 == -1 && var15.field17 == null) {
				var19 = var15.method5(10, arg3, var10, var11, var12, var13, -1);
			} else {
				var19 = new QARHEJHA(var12, var13, arg3, 10, var10, arg6, var11, var15.field20, true);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg7 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg3 == 1 || arg3 == 3) {
					var21 = var15.field30;
					var22 = var15.field21;
				} else {
					var21 = var15.field21;
					var22 = var15.field30;
				}

				arg2.method526(var14, var17, arg8, var20, var19, var21, var22, arg4, arg0, var16);
			}

			if (var15.field24) {
				arg5.method30(var15.field30, var15.field22, arg8, arg0, var15.field21, arg3);
			}
		} else if (arg7 >= 12) {
			DVAULXJA var23;
			if (var15.field20 == -1 && var15.field17 == null) {
				var23 = var15.method5(arg7, arg3, var10, var11, var12, var13, -1);
			} else {
				var23 = new QARHEJHA(var12, var13, arg3, arg7, var10, arg6, var11, var15.field20, true);
			}

			arg2.method526(var14, var17, arg8, 0, var23, 1, 1, arg4, arg0, var16);

			if (var15.field24) {
				arg5.method30(var15.field30, var15.field22, arg8, arg0, var15.field21, arg3);
			}
		} else if (arg7 == 0) {
			DVAULXJA var24;
			if (var15.field20 == -1 && var15.field17 == null) {
				var24 = var15.method5(0, arg3, var10, var11, var12, var13, -1);
			} else {
				var24 = new QARHEJHA(var12, var13, arg3, 0, var10, arg6, var11, var15.field20, true);
			}

			arg2.method524(arg4, 0, var14, var16, var24, arg8, null, var17, field1160[arg3], arg0);

			if (var15.field24) {
				arg5.method29(arg0, arg8, arg7, var15.field22, arg3);
			}
		} else if (arg7 == 1) {
			DVAULXJA var25;
			if (var15.field20 == -1 && var15.field17 == null) {
				var25 = var15.method5(1, arg3, var10, var11, var12, var13, -1);
			} else {
				var25 = new QARHEJHA(var12, var13, arg3, 1, var10, arg6, var11, var15.field20, true);
			}

			arg2.method524(arg4, 0, var14, var16, var25, arg8, null, var17, field1142[arg3], arg0);

			if (var15.field24) {
				arg5.method29(arg0, arg8, arg7, var15.field22, arg3);
			}
		} else if (arg7 == 2) {
			int var26 = arg3 + 1 & 0x3;
			DVAULXJA var27;
			DVAULXJA var28;
			if (var15.field20 == -1 && var15.field17 == null) {
				var27 = var15.method5(2, arg3 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method5(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new QARHEJHA(var12, var13, arg3 + 4, 2, var10, arg6, var11, var15.field20, true);
				var28 = new QARHEJHA(var12, var13, var26, 2, var10, arg6, var11, var15.field20, true);
			}

			arg2.method524(arg4, field1160[var26], var14, var16, var27, arg8, var28, var17, field1160[arg3], arg0);

			if (var15.field24) {
				arg5.method29(arg0, arg8, arg7, var15.field22, arg3);
			}
		} else if (arg7 == 3) {
			DVAULXJA var29;
			if (var15.field20 == -1 && var15.field17 == null) {
				var29 = var15.method5(3, arg3, var10, var11, var12, var13, -1);
			} else {
				var29 = new QARHEJHA(var12, var13, arg3, 3, var10, arg6, var11, var15.field20, true);
			}

			arg2.method524(arg4, 0, var14, var16, var29, arg8, null, var17, field1142[arg3], arg0);

			if (var15.field24) {
				arg5.method29(arg0, arg8, arg7, var15.field22, arg3);
			}
		} else if (arg7 == 9) {
			DVAULXJA var30;
			if (var15.field20 == -1 && var15.field17 == null) {
				var30 = var15.method5(arg7, arg3, var10, var11, var12, var13, -1);
			} else {
				var30 = new QARHEJHA(var12, var13, arg3, arg7, var10, arg6, var11, var15.field20, true);
			}

			arg2.method526(var14, var17, arg8, 0, var30, 1, 1, arg4, arg0, var16);

			if (var15.field24) {
				arg5.method30(var15.field30, var15.field22, arg8, arg0, var15.field21, arg3);
			}
		} else {
			if (var15.field47) {
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

			if (arg7 == 4) {
				DVAULXJA var35;
				if (var15.field20 == -1 && var15.field17 == null) {
					var35 = var15.method5(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new QARHEJHA(var12, var13, 0, 4, var10, arg6, var11, var15.field20, true);
				}

				arg2.method525(var35, arg4, var16, arg0, 0, 0, var17, var14, arg3 * 512, field1160[arg3], arg8);
			} else if (arg7 == 5) {
				int var36 = 16;
				int var37 = arg2.method542(arg4, arg0, arg8);
				if (var37 > 0) {
					var36 = AMVKCKZF.method4(var37 >> 14 & 0x7FFF).field35;
				}

				DVAULXJA var38;
				if (var15.field20 == -1 && var15.field17 == null) {
					var38 = var15.method5(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new QARHEJHA(var12, var13, 0, 4, var10, arg6, var11, var15.field20, true);
				}

				arg2.method525(var38, arg4, var16, arg0, field1143[arg3] * var36, field1150[arg3] * var36, var17, var14, arg3 * 512, field1160[arg3], arg8);
			} else if (arg7 == 6) {
				DVAULXJA var39;
				if (var15.field20 == -1 && var15.field17 == null) {
					var39 = var15.method5(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new QARHEJHA(var12, var13, 0, 4, var10, arg6, var11, var15.field20, true);
				}

				arg2.method525(var39, arg4, var16, arg0, 0, 0, var17, var14, arg3, 256, arg8);
			} else if (arg7 == 7) {
				DVAULXJA var40;
				if (var15.field20 == -1 && var15.field17 == null) {
					var40 = var15.method5(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new QARHEJHA(var12, var13, 0, 4, var10, arg6, var11, var15.field20, true);
				}

				arg2.method525(var40, arg4, var16, arg0, 0, 0, var17, var14, arg3, 512, arg8);
			} else if (arg7 == 8) {
				DVAULXJA var41;
				if (var15.field20 == -1 && var15.field17 == null) {
					var41 = var15.method5(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new QARHEJHA(var12, var13, 0, 4, var10, arg6, var11, var15.field20, true);
				}

				arg2.method525(var41, arg4, var16, arg0, 0, 0, var17, var14, arg3, 768, arg8);
			}
		}
	}

	@ObfuscatedName("SSYGWTYM.a(I[BIZ)Z")
	public static final boolean method418(int arg0, byte[] arg1, int arg2) {
		boolean var3 = true;
		EMWAMCXW var4 = new EMWAMCXW(arg1);
		int var5 = -1;
		while (true) {
			int var6 = var4.method231();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method231();
					if (var9 == 0) {
						break;
					}

					var4.method217();
				} else {
					int var10 = var4.method231();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method217() >> 2;
					int var14 = arg0 + var12;
					int var15 = arg2 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						AMVKCKZF var16 = AMVKCKZF.method4(var5);
						if (var13 != 22 || !field1141 || var16.field4 || var16.field10) {
							var3 &= var16.method6();
							var8 = true;
						}
					}
				}
			}
		}
	}
}
