package deob;

@ObfuscatedName("CJZJWICI")
public final class CJZJWICI {

	@ObfuscatedName("CJZJWICI.y")
	public int field128;

	@ObfuscatedName("CJZJWICI.z")
	public int field129;

	@ObfuscatedName("CJZJWICI.s")
	public int[][][] field122;

	@ObfuscatedName("CJZJWICI.j")
	public byte[][][] field117;

	@ObfuscatedName("CJZJWICI.w")
	public byte[][][] field126;

	@ObfuscatedName("CJZJWICI.m")
	public byte[][][] field119;

	@ObfuscatedName("CJZJWICI.n")
	public byte[][][] field120;

	@ObfuscatedName("CJZJWICI.c")
	public byte[][][] field110;

	@ObfuscatedName("CJZJWICI.t")
	public int[][][] field123;

	@ObfuscatedName("CJZJWICI.l")
	public byte[][][] field118;

	@ObfuscatedName("CJZJWICI.C")
	public int[][] field131;

	@ObfuscatedName("CJZJWICI.e")
	public int[] field112;

	@ObfuscatedName("CJZJWICI.f")
	public int[] field113;

	@ObfuscatedName("CJZJWICI.g")
	public int[] field114;

	@ObfuscatedName("CJZJWICI.h")
	public int[] field115;

	@ObfuscatedName("CJZJWICI.i")
	public int[] field116;

	@ObfuscatedName("CJZJWICI.a")
	public static final int[] field109 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("CJZJWICI.o")
	public static final int[] field121 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("CJZJWICI.u")
	public static boolean field124 = true;

	@ObfuscatedName("CJZJWICI.v")
	public static final int[] field125 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("CJZJWICI.x")
	public static int field127 = 99;

	@ObfuscatedName("CJZJWICI.D")
	public static final int[] field132 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("CJZJWICI.d")
	public static int field111 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("CJZJWICI.E")
	public static int field133 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("CJZJWICI.A")
	public static int field130;

	@ObfuscatedName("CJZJWICI.a(IIILMLYYHULT;IIII)V")
	public final void method43(int arg0, int arg1, MLYYHULT arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg6 >= 0 && arg6 < 104 && arg4 >= 0 && arg4 < 104) {
			field117[arg1][arg6][arg4] = 0;
			while (true) {
				int var8 = arg2.method296();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg2.method296();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg1 == 0) {
						field122[0][arg6][arg4] = -var9 * 8;
						return;
					}

					field122[arg1][arg6][arg4] = field122[arg1 - 1][arg6][arg4] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field119[arg1][arg6][arg4] = arg2.method297();
					field120[arg1][arg6][arg4] = (byte) ((var8 - 2) / 4);
					field110[arg1][arg6][arg4] = (byte) (var8 + arg3 - 2 & 0x3);
				} else if (var8 <= 81) {
					field117[arg1][arg6][arg4] = (byte) (var8 - 49);
				} else {
					field126[arg1][arg6][arg4] = (byte) (var8 - 81);
				}
			}

			if (arg1 == 0) {
				field122[0][arg6][arg4] = -method53(arg6 + arg5 + 932731, arg4 + 556238 + arg0) * 8;
			} else {
				field122[arg1][arg6][arg4] = field122[arg1 - 1][arg6][arg4] - 240;
			}
		} else {
			while (true) {
				int var10 = arg2.method296();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg2.method296();
					return;
				}

				if (var10 <= 49) {
					arg2.method296();
				}
			}
		}
	}

	@ObfuscatedName("CJZJWICI.a(III)I")
	public static final int method44(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method61(var3, var5);
		int var8 = method61(var3 + 1, var5);
		int var9 = method61(var3, var5 + 1);
		int var10 = method61(var3 + 1, var5 + 1);
		int var11 = method59(var7, var8, var4, arg2);
		int var12 = method59(var9, var10, var4, arg2);
		return method59(var11, var12, var6, arg2);
	}

	@ObfuscatedName("CJZJWICI.b(III)I")
	public final int method45(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("CJZJWICI.a(II)I")
	public static final int method46(int arg0, int arg1) {
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

	@ObfuscatedName("CJZJWICI.a(I[LOTPPFNKL;BLTAWLWNCF;I[B)V")
	public final void method47(int arg0, OTPPFNKL[] arg1, TAWLWNCF arg2, int arg3, byte[] arg4) {
		MLYYHULT var6 = new MLYYHULT(arg4);
		int var7 = -1;
		while (true) {
			int var8 = var6.method310();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method310();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method296();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg3 + var12;
				int var18 = arg0 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field117[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					OTPPFNKL var20 = null;
					if (var19 >= 0) {
						var20 = arg1[var19];
					}

					method52(var20, var15, arg2, var18, var16, var17, var7, var13);
				}
			}
		}
	}

	@ObfuscatedName("CJZJWICI.a(IIII[LOTPPFNKL;IIBLTAWLWNCF;[BI)V")
	public final void method48(int arg0, int arg1, int arg2, int arg3, OTPPFNKL[] arg4, int arg5, int arg6, TAWLWNCF arg7, byte[] arg8, int arg9) {
		MLYYHULT var11 = new MLYYHULT(arg8);
		int var12 = -1;
		while (true) {
			int var13 = var11.method310();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method310();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method296();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg0 == var18 && var17 >= arg6 && var17 < arg6 + 8 && var16 >= arg2 && var16 < arg2 + 8) {
					LYSBQDHB var22 = LYSBQDHB.method282(var12);
					int var23 = arg3 + KTYXNKDN.method271(arg5, var22.field882, var16 & 0x7, var17 & 0x7, var21, var22.field891);
					int var24 = arg1 + KTYXNKDN.method272(var22.field882, var16 & 0x7, var22.field891, var21, arg5, var17 & 0x7);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg9;
						if ((field117[1][var23][var24] & 0x2) == 2) {
							var25 = arg9 - 1;
						}

						OTPPFNKL var26 = null;
						if (var25 >= 0) {
							var26 = arg4[var25];
						}

						method52(var26, var20, arg7, var24, arg5 + var21 & 0x3, var23, var12, arg9);
					}
				}
			}
		}
	}

	@ObfuscatedName("CJZJWICI.c(III)Z")
	public static final boolean method49(int arg0, int arg1) {
		LYSBQDHB var2 = LYSBQDHB.method282(arg1);

		if (arg0 == 11) {
			arg0 = 10;
		}

		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}

		return var2.method273(arg0);
	}

	@ObfuscatedName("CJZJWICI.a(I[BII)Z")
	public static final boolean method50(byte[] arg0, int arg1, int arg2) {
		boolean var3 = true;
		MLYYHULT var4 = new MLYYHULT(arg0);
		int var5 = -1;
		while (true) {
			int var6 = var4.method310();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method310();
					if (var9 == 0) {
						break;
					}

					var4.method296();
				} else {
					int var10 = var4.method310();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method296() >> 2;
					int var14 = arg1 + var12;
					int var15 = arg2 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						LYSBQDHB var16 = LYSBQDHB.method282(var5);
						if (var13 != 22 || !field124 || var16.field881 || var16.field906) {
							var3 &= var16.method276();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("CJZJWICI.a(ZLFJSXIAWX;LMLYYHULT;)V")
	public static final void method51(FJSXIAWX arg0, MLYYHULT arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg1.method310();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			LYSBQDHB var4 = LYSBQDHB.method282(var2);
			var4.method280(arg0);

			while (true) {
				int var5 = arg1.method310();
				if (var5 == 0) {
					break;
				}

				arg1.method296();
			}
		}
	}

	@ObfuscatedName("CJZJWICI.a(LOTPPFNKL;IILTAWLWNCF;IIIII)V")
	public final void method52(OTPPFNKL arg0, int arg1, TAWLWNCF arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field124 && (field117[0][arg5][arg3] & 0x2) == 0) {
			if ((field117[arg7][arg5][arg3] & 0x10) != 0) {
				return;
			}

			if (method60(arg5, arg7, arg3) != field130) {
				return;
			}
		}

		if (arg7 < field127) {
			field127 = arg7;
		}

		int var9 = field122[arg7][arg5][arg3];
		int var10 = field122[arg7][arg5 + 1][arg3];
		int var11 = field122[arg7][arg5 + 1][arg3 + 1];
		int var12 = field122[arg7][arg5][arg3 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		LYSBQDHB var14 = LYSBQDHB.method282(arg6);
		int var15 = (arg6 << 14) + (arg3 << 7) + arg5 + 0x40000000;
		if (!var14.field881) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg4 << 6) + arg1);
		if (arg1 == 22) {
			if (!field124 || var14.field881 || var14.field906) {
				IWSGBTLV var17;
				if (var14.field883 == -1 && var14.field911 == null) {
					var17 = var14.method283(22, arg4, var9, var10, var11, var12, -1);
				} else {
					var17 = new DROEXFTE(true, arg4, arg6, 22, var9, var10, var11, var14.field883, var12);
				}

				arg2.method493(var17, var15, arg5, arg3, arg7, var16, var13);

				if (var14.field908 && var14.field881 && arg0 != null) {
					arg0.method356(arg3, arg5);
				}
			}
		} else if (arg1 == 10 || arg1 == 11) {
			IWSGBTLV var18;
			if (var14.field883 == -1 && var14.field911 == null) {
				var18 = var14.method283(10, arg4, var9, var10, var11, var12, -1);
			} else {
				var18 = new DROEXFTE(true, arg4, arg6, 10, var9, var10, var11, var14.field883, var12);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg1 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg4 == 1 || arg4 == 3) {
					var20 = var14.field891;
					var21 = var14.field882;
				} else {
					var20 = var14.field882;
					var21 = var14.field891;
				}

				if (arg2.method497(var18, arg3, var21, arg5, var16, var15, var19, arg7, var20, var13) && var14.field902) {
					CADBNSXE var22;
					if (var18 instanceof CADBNSXE) {
						var22 = (CADBNSXE) var18;
					} else {
						var22 = var14.method283(10, arg4, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field40 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field118[arg7][arg5 + var23][arg3 + var24]) {
									field118[arg7][arg5 + var23][arg3 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field908 && arg0 != null) {
				arg0.method355(var14.field923, var14.field891, arg3, var14.field882, arg5, arg4);
			}
		} else if (arg1 >= 12) {
			IWSGBTLV var26;
			if (var14.field883 == -1 && var14.field911 == null) {
				var26 = var14.method283(arg1, arg4, var9, var10, var11, var12, -1);
			} else {
				var26 = new DROEXFTE(true, arg4, arg6, arg1, var9, var10, var11, var14.field883, var12);
			}

			arg2.method497(var26, arg3, 1, arg5, var16, var15, 0, arg7, 1, var13);

			if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg7 > 0) {
				field123[arg7][arg5][arg3] |= 0x924;
			}

			if (var14.field908 && arg0 != null) {
				arg0.method355(var14.field923, var14.field891, arg3, var14.field882, arg5, arg4);
			}
		} else if (arg1 == 0) {
			IWSGBTLV var27;
			if (var14.field883 == -1 && var14.field911 == null) {
				var27 = var14.method283(0, arg4, var9, var10, var11, var12, -1);
			} else {
				var27 = new DROEXFTE(true, arg4, arg6, 0, var9, var10, var11, var14.field883, var12);
			}

			arg2.method495(0, field125[arg4], arg7, arg3, arg5, var27, var13, var15, var16, null);

			if (arg4 == 0) {
				if (var14.field902) {
					field118[arg7][arg5][arg3] = 50;
					field118[arg7][arg5][arg3 + 1] = 50;
				}

				if (var14.field897) {
					field123[arg7][arg5][arg3] |= 0x249;
				}
			} else if (arg4 == 1) {
				if (var14.field902) {
					field118[arg7][arg5][arg3 + 1] = 50;
					field118[arg7][arg5 + 1][arg3 + 1] = 50;
				}

				if (var14.field897) {
					field123[arg7][arg5][arg3 + 1] |= 0x492;
				}
			} else if (arg4 == 2) {
				if (var14.field902) {
					field118[arg7][arg5 + 1][arg3] = 50;
					field118[arg7][arg5 + 1][arg3 + 1] = 50;
				}

				if (var14.field897) {
					field123[arg7][arg5 + 1][arg3] |= 0x249;
				}
			} else if (arg4 == 3) {
				if (var14.field902) {
					field118[arg7][arg5][arg3] = 50;
					field118[arg7][arg5 + 1][arg3] = 50;
				}

				if (var14.field897) {
					field123[arg7][arg5][arg3] |= 0x492;
				}
			}

			if (var14.field908 && arg0 != null) {
				arg0.method354(var14.field923, arg1, arg3, arg5, arg4);
			}

			if (var14.field900 != 16) {
				arg2.method503(arg3, arg5, var14.field900, arg7);
			}
		} else if (arg1 == 1) {
			IWSGBTLV var28;
			if (var14.field883 == -1 && var14.field911 == null) {
				var28 = var14.method283(1, arg4, var9, var10, var11, var12, -1);
			} else {
				var28 = new DROEXFTE(true, arg4, arg6, 1, var9, var10, var11, var14.field883, var12);
			}

			arg2.method495(0, field132[arg4], arg7, arg3, arg5, var28, var13, var15, var16, null);

			if (var14.field902) {
				if (arg4 == 0) {
					field118[arg7][arg5][arg3 + 1] = 50;
				} else if (arg4 == 1) {
					field118[arg7][arg5 + 1][arg3 + 1] = 50;
				} else if (arg4 == 2) {
					field118[arg7][arg5 + 1][arg3] = 50;
				} else if (arg4 == 3) {
					field118[arg7][arg5][arg3] = 50;
				}
			}

			if (var14.field908 && arg0 != null) {
				arg0.method354(var14.field923, arg1, arg3, arg5, arg4);
			}
		} else if (arg1 == 2) {
			int var29 = arg4 + 1 & 0x3;
			IWSGBTLV var30;
			IWSGBTLV var31;
			if (var14.field883 == -1 && var14.field911 == null) {
				var30 = var14.method283(2, arg4 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method283(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new DROEXFTE(true, arg4 + 4, arg6, 2, var9, var10, var11, var14.field883, var12);
				var31 = new DROEXFTE(true, var29, arg6, 2, var9, var10, var11, var14.field883, var12);
			}

			arg2.method495(field125[var29], field125[arg4], arg7, arg3, arg5, var30, var13, var15, var16, var31);

			if (var14.field897) {
				if (arg4 == 0) {
					field123[arg7][arg5][arg3] |= 0x249;
					field123[arg7][arg5][arg3 + 1] |= 0x492;
				} else if (arg4 == 1) {
					field123[arg7][arg5][arg3 + 1] |= 0x492;
					field123[arg7][arg5 + 1][arg3] |= 0x249;
				} else if (arg4 == 2) {
					field123[arg7][arg5 + 1][arg3] |= 0x249;
					field123[arg7][arg5][arg3] |= 0x492;
				} else if (arg4 == 3) {
					field123[arg7][arg5][arg3] |= 0x492;
					field123[arg7][arg5][arg3] |= 0x249;
				}
			}

			if (var14.field908 && arg0 != null) {
				arg0.method354(var14.field923, arg1, arg3, arg5, arg4);
			}

			if (var14.field900 != 16) {
				arg2.method503(arg3, arg5, var14.field900, arg7);
			}
		} else if (arg1 == 3) {
			IWSGBTLV var32;
			if (var14.field883 == -1 && var14.field911 == null) {
				var32 = var14.method283(3, arg4, var9, var10, var11, var12, -1);
			} else {
				var32 = new DROEXFTE(true, arg4, arg6, 3, var9, var10, var11, var14.field883, var12);
			}

			arg2.method495(0, field132[arg4], arg7, arg3, arg5, var32, var13, var15, var16, null);

			if (var14.field902) {
				if (arg4 == 0) {
					field118[arg7][arg5][arg3 + 1] = 50;
				} else if (arg4 == 1) {
					field118[arg7][arg5 + 1][arg3 + 1] = 50;
				} else if (arg4 == 2) {
					field118[arg7][arg5 + 1][arg3] = 50;
				} else if (arg4 == 3) {
					field118[arg7][arg5][arg3] = 50;
				}
			}

			if (var14.field908 && arg0 != null) {
				arg0.method354(var14.field923, arg1, arg3, arg5, arg4);
			}
		} else if (arg1 == 9) {
			IWSGBTLV var33;
			if (var14.field883 == -1 && var14.field911 == null) {
				var33 = var14.method283(arg1, arg4, var9, var10, var11, var12, -1);
			} else {
				var33 = new DROEXFTE(true, arg4, arg6, arg1, var9, var10, var11, var14.field883, var12);
			}

			arg2.method497(var33, arg3, 1, arg5, var16, var15, 0, arg7, 1, var13);

			if (var14.field908 && arg0 != null) {
				arg0.method355(var14.field923, var14.field891, arg3, var14.field882, arg5, arg4);
			}
		} else {
			if (var14.field925) {
				if (arg4 == 1) {
					int var34 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var9;
					var9 = var34;
				} else if (arg4 == 2) {
					int var35 = var12;
					var12 = var10;
					var10 = var35;
					int var36 = var11;
					var11 = var9;
					var9 = var36;
				} else if (arg4 == 3) {
					int var37 = var12;
					var12 = var9;
					var9 = var10;
					var10 = var11;
					var11 = var37;
				}
			}

			if (arg1 == 4) {
				IWSGBTLV var38;
				if (var14.field883 == -1 && var14.field911 == null) {
					var38 = var14.method283(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new DROEXFTE(true, 0, arg6, 4, var9, var10, var11, var14.field883, var12);
				}

				arg2.method496(arg3, 0, arg7, arg5, var38, 0, arg4 * 512, var15, field125[arg4], var13, var16);
			} else if (arg1 == 5) {
				int var39 = 16;
				int var40 = arg2.method513(arg7, arg5, arg3);
				if (var40 > 0) {
					var39 = LYSBQDHB.method282(var40 >> 14 & 0x7FFF).field900;
				}

				IWSGBTLV var41;
				if (var14.field883 == -1 && var14.field911 == null) {
					var41 = var14.method283(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new DROEXFTE(true, 0, arg6, 4, var9, var10, var11, var14.field883, var12);
				}

				arg2.method496(arg3, field121[arg4] * var39, arg7, arg5, var41, field109[arg4] * var39, arg4 * 512, var15, field125[arg4], var13, var16);
			} else if (arg1 == 6) {
				IWSGBTLV var42;
				if (var14.field883 == -1 && var14.field911 == null) {
					var42 = var14.method283(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new DROEXFTE(true, 0, arg6, 4, var9, var10, var11, var14.field883, var12);
				}

				arg2.method496(arg3, 0, arg7, arg5, var42, 0, arg4, var15, 256, var13, var16);
			} else if (arg1 == 7) {
				IWSGBTLV var43;
				if (var14.field883 == -1 && var14.field911 == null) {
					var43 = var14.method283(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new DROEXFTE(true, 0, arg6, 4, var9, var10, var11, var14.field883, var12);
				}

				arg2.method496(arg3, 0, arg7, arg5, var43, 0, arg4, var15, 512, var13, var16);
			} else if (arg1 == 8) {
				IWSGBTLV var44;
				if (var14.field883 == -1 && var14.field911 == null) {
					var44 = var14.method283(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new DROEXFTE(true, 0, arg6, 4, var9, var10, var11, var14.field883, var12);
				}

				arg2.method496(arg3, 0, arg7, arg5, var44, 0, arg4, var15, 768, var13, var16);
			}
		}
	}

	@ObfuscatedName("CJZJWICI.b(II)I")
	public static final int method53(int arg0, int arg1) {
		int var2 = method44(arg0 + 45365, arg1 + 91923, 4) + (method44(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method44(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	public CJZJWICI(int arg0, int[][][] arg1, byte[][][] arg2, int arg3) {
		field127 = 99;
		field128 = arg3;
		field129 = arg0;
		field122 = arg1;
		field117 = arg2;
		field126 = new byte[4][field128][field129];
		field119 = new byte[4][field128][field129];
		field120 = new byte[4][field128][field129];
		field110 = new byte[4][field128][field129];
		field123 = new int[4][field128 + 1][field129 + 1];
		field118 = new byte[4][field128 + 1][field129 + 1];
		field131 = new int[field128 + 1][field129 + 1];
		field112 = new int[field129];
		field113 = new int[field129];
		field114 = new int[field129];
		field115 = new int[field129];
		field116 = new int[field129];
	}

	@ObfuscatedName("CJZJWICI.c(II)I")
	public final int method54(int arg0, int arg1) {
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

	@ObfuscatedName("CJZJWICI.a([BI[LOTPPFNKL;IIII)V")
	public final void method55(byte[] arg0, int arg1, OTPPFNKL[] arg2, int arg3, int arg4, int arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg1 + var8 > 0 && arg1 + var8 < 103 && arg3 + var9 > 0 && arg3 + var9 < 103) {
						arg2[var7].field1069[arg1 + var8][arg3 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		MLYYHULT var10 = new MLYYHULT(arg0);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method43(arg4, var11, var10, 0, arg3 + var13, arg5, arg1 + var12);
				}
			}
		}
	}

	@ObfuscatedName("CJZJWICI.a(IBI[LOTPPFNKL;II[BIII)V")
	public final void method56(int arg0, int arg1, OTPPFNKL[] arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg4 + var10 > 0 && arg4 + var10 < 103 && arg3 + var11 > 0 && arg3 + var11 < 103) {
					arg2[arg6].field1069[arg4 + var10][arg3 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		MLYYHULT var12 = new MLYYHULT(arg5);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg1 == var13 && var14 >= arg8 && var14 < arg8 + 8 && var15 >= arg0 && var15 < arg0 + 8) {
						method43(0, arg6, var12, arg7, arg3 + KTYXNKDN.method270(arg7, var15 & 0x7, var14 & 0x7), 0, arg4 + KTYXNKDN.method269(arg7, var15 & 0x7, var14 & 0x7));
					} else {
						method43(0, 0, var12, 0, -1, 0, -1);
					}
				}
			}
		}
	}

	@ObfuscatedName("CJZJWICI.d(II)I")
	public static final int method57(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("CJZJWICI.a(IIILTAWLWNCF;I[[[IIILOTPPFNKL;II)V")
	public static final void method58(int arg0, int arg1, int arg2, TAWLWNCF arg3, int arg4, int[][][] arg5, int arg6, OTPPFNKL arg7, int arg8, int arg9) {
		int var10 = arg5[arg0][arg2][arg6];
		int var11 = arg5[arg0][arg2 + 1][arg6];
		int var12 = arg5[arg0][arg2 + 1][arg6 + 1];
		int var13 = arg5[arg0][arg2][arg6 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		LYSBQDHB var15 = LYSBQDHB.method282(arg9);
		int var16 = (arg9 << 14) + (arg6 << 7) + arg2 + 0x40000000;
		if (!var15.field881) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg1 << 6) + arg8);
		if (arg8 == 22) {
			IWSGBTLV var18;
			if (var15.field883 == -1 && var15.field911 == null) {
				var18 = var15.method283(22, arg1, var10, var11, var12, var13, -1);
			} else {
				var18 = new DROEXFTE(true, arg1, arg9, 22, var10, var11, var12, var15.field883, var13);
			}

			arg3.method493(var18, var16, arg2, arg6, arg4, var17, var14);

			if (var15.field908 && var15.field881) {
				arg7.method356(arg6, arg2);
			}
		} else if (arg8 == 10 || arg8 == 11) {
			IWSGBTLV var19;
			if (var15.field883 == -1 && var15.field911 == null) {
				var19 = var15.method283(10, arg1, var10, var11, var12, var13, -1);
			} else {
				var19 = new DROEXFTE(true, arg1, arg9, 10, var10, var11, var12, var15.field883, var13);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg8 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg1 == 1 || arg1 == 3) {
					var21 = var15.field891;
					var22 = var15.field882;
				} else {
					var21 = var15.field882;
					var22 = var15.field891;
				}

				arg3.method497(var19, arg6, var22, arg2, var17, var16, var20, arg4, var21, var14);
			}

			if (var15.field908) {
				arg7.method355(var15.field923, var15.field891, arg6, var15.field882, arg2, arg1);
			}
		} else if (arg8 >= 12) {
			IWSGBTLV var23;
			if (var15.field883 == -1 && var15.field911 == null) {
				var23 = var15.method283(arg8, arg1, var10, var11, var12, var13, -1);
			} else {
				var23 = new DROEXFTE(true, arg1, arg9, arg8, var10, var11, var12, var15.field883, var13);
			}

			arg3.method497(var23, arg6, 1, arg2, var17, var16, 0, arg4, 1, var14);

			if (var15.field908) {
				arg7.method355(var15.field923, var15.field891, arg6, var15.field882, arg2, arg1);
			}
		} else if (arg8 == 0) {
			IWSGBTLV var24;
			if (var15.field883 == -1 && var15.field911 == null) {
				var24 = var15.method283(0, arg1, var10, var11, var12, var13, -1);
			} else {
				var24 = new DROEXFTE(true, arg1, arg9, 0, var10, var11, var12, var15.field883, var13);
			}

			arg3.method495(0, field125[arg1], arg4, arg6, arg2, var24, var14, var16, var17, null);

			if (var15.field908) {
				arg7.method354(var15.field923, arg8, arg6, arg2, arg1);
			}
		} else if (arg8 == 1) {
			IWSGBTLV var25;
			if (var15.field883 == -1 && var15.field911 == null) {
				var25 = var15.method283(1, arg1, var10, var11, var12, var13, -1);
			} else {
				var25 = new DROEXFTE(true, arg1, arg9, 1, var10, var11, var12, var15.field883, var13);
			}

			arg3.method495(0, field132[arg1], arg4, arg6, arg2, var25, var14, var16, var17, null);

			if (var15.field908) {
				arg7.method354(var15.field923, arg8, arg6, arg2, arg1);
			}
		} else if (arg8 == 2) {
			int var26 = arg1 + 1 & 0x3;
			IWSGBTLV var27;
			IWSGBTLV var28;
			if (var15.field883 == -1 && var15.field911 == null) {
				var27 = var15.method283(2, arg1 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method283(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new DROEXFTE(true, arg1 + 4, arg9, 2, var10, var11, var12, var15.field883, var13);
				var28 = new DROEXFTE(true, var26, arg9, 2, var10, var11, var12, var15.field883, var13);
			}

			arg3.method495(field125[var26], field125[arg1], arg4, arg6, arg2, var27, var14, var16, var17, var28);

			if (var15.field908) {
				arg7.method354(var15.field923, arg8, arg6, arg2, arg1);
			}
		} else if (arg8 == 3) {
			IWSGBTLV var29;
			if (var15.field883 == -1 && var15.field911 == null) {
				var29 = var15.method283(3, arg1, var10, var11, var12, var13, -1);
			} else {
				var29 = new DROEXFTE(true, arg1, arg9, 3, var10, var11, var12, var15.field883, var13);
			}

			arg3.method495(0, field132[arg1], arg4, arg6, arg2, var29, var14, var16, var17, null);

			if (var15.field908) {
				arg7.method354(var15.field923, arg8, arg6, arg2, arg1);
			}
		} else if (arg8 == 9) {
			IWSGBTLV var30;
			if (var15.field883 == -1 && var15.field911 == null) {
				var30 = var15.method283(arg8, arg1, var10, var11, var12, var13, -1);
			} else {
				var30 = new DROEXFTE(true, arg1, arg9, arg8, var10, var11, var12, var15.field883, var13);
			}

			arg3.method497(var30, arg6, 1, arg2, var17, var16, 0, arg4, 1, var14);

			if (var15.field908) {
				arg7.method355(var15.field923, var15.field891, arg6, var15.field882, arg2, arg1);
			}
		} else {
			if (var15.field925) {
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

			if (arg8 == 4) {
				IWSGBTLV var35;
				if (var15.field883 == -1 && var15.field911 == null) {
					var35 = var15.method283(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new DROEXFTE(true, 0, arg9, 4, var10, var11, var12, var15.field883, var13);
				}

				arg3.method496(arg6, 0, arg4, arg2, var35, 0, arg1 * 512, var16, field125[arg1], var14, var17);
			} else if (arg8 == 5) {
				int var36 = 16;
				int var37 = arg3.method513(arg4, arg2, arg6);
				if (var37 > 0) {
					var36 = LYSBQDHB.method282(var37 >> 14 & 0x7FFF).field900;
				}

				IWSGBTLV var38;
				if (var15.field883 == -1 && var15.field911 == null) {
					var38 = var15.method283(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new DROEXFTE(true, 0, arg9, 4, var10, var11, var12, var15.field883, var13);
				}

				arg3.method496(arg6, field121[arg1] * var36, arg4, arg2, var38, field109[arg1] * var36, arg1 * 512, var16, field125[arg1], var14, var17);
			} else if (arg8 == 6) {
				IWSGBTLV var39;
				if (var15.field883 == -1 && var15.field911 == null) {
					var39 = var15.method283(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new DROEXFTE(true, 0, arg9, 4, var10, var11, var12, var15.field883, var13);
				}

				arg3.method496(arg6, 0, arg4, arg2, var39, 0, arg1, var16, 256, var14, var17);
			} else if (arg8 == 7) {
				IWSGBTLV var40;
				if (var15.field883 == -1 && var15.field911 == null) {
					var40 = var15.method283(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new DROEXFTE(true, 0, arg9, 4, var10, var11, var12, var15.field883, var13);
				}

				arg3.method496(arg6, 0, arg4, arg2, var40, 0, arg1, var16, 512, var14, var17);
			} else if (arg8 == 8) {
				IWSGBTLV var41;
				if (var15.field883 == -1 && var15.field911 == null) {
					var41 = var15.method283(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new DROEXFTE(true, 0, arg9, 4, var10, var11, var12, var15.field883, var13);
				}

				arg3.method496(arg6, 0, arg4, arg2, var41, 0, arg1, var16, 768, var14, var17);
			}
		}
	}

	@ObfuscatedName("CJZJWICI.a(IIII)I")
	public static final int method59(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - PNDCOEKM.field1140[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("CJZJWICI.b(IIII)I")
	public int method60(int arg0, int arg1, int arg2) {
		if ((field117[arg1][arg0][arg2] & 0x8) != 0) {
			return 0;
		}

		if (arg1 > 0 && (field117[1][arg0][arg2] & 0x2) != 0) {
			return arg1 - 1;
		}

		return arg1;
	}

	@ObfuscatedName("CJZJWICI.e(II)I")
	public static final int method61(int arg0, int arg1) {
		int var2 = method57(arg0 - 1, arg1 - 1) + method57(arg0 + 1, arg1 - 1) + method57(arg0 - 1, arg1 + 1) + method57(arg0 + 1, arg1 + 1);
		int var3 = method57(arg0 - 1, arg1) + method57(arg0 + 1, arg1) + method57(arg0, arg1 - 1) + method57(arg0, arg1 + 1);
		int var4 = method57(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("CJZJWICI.a(B[LOTPPFNKL;LTAWLWNCF;)V")
	public final void method62(OTPPFNKL[] arg0, TAWLWNCF arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field117[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field117[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg0[var6].method356(var5, var4);
						}
					}
				}
			}
		}

		field111 += (int) (Math.random() * 5.0D) - 2;
		if (field111 < -8) {
			field111 = -8;
		}

		if (field111 > 8) {
			field111 = 8;
		}

		field133 += (int) (Math.random() * 5.0D) - 2;
		if (field133 < -16) {
			field133 = -16;
		}

		if (field133 > 16) {
			field133 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field118[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field129 - 1; var16++) {
				for (int var17 = 1; var17 < field128 - 1; var17++) {
					int var18 = field122[var7][var17 + 1][var16] - field122[var7][var17 - 1][var16];
					int var19 = field122[var7][var17][var16 + 1] - field122[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field131[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field129; var26++) {
				field112[var26] = 0;
				field113[var26] = 0;
				field114[var26] = 0;
				field115[var26] = 0;
				field116[var26] = 0;
			}

			for (int var27 = -5; var27 < field128 + 5; var27++) {
				for (int var28 = 0; var28 < field129; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field128) {
						int var30 = field126[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							SXDNVMNH var31 = SXDNVMNH.field1253[var30 - 1];
							field112[var28] += var31.field1262;
							field113[var28] += var31.field1260;
							field114[var28] += var31.field1261;
							field115[var28] += var31.field1263;
							field116[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field128) {
						int var33 = field126[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							SXDNVMNH var34 = SXDNVMNH.field1253[var33 - 1];
							field112[var28] -= var34.field1262;
							field113[var28] -= var34.field1260;
							field114[var28] -= var34.field1261;
							field115[var28] -= var34.field1263;
							field116[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field128 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field129 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field129) {
							var35 += field112[var41];
							var36 += field113[var41];
							var37 += field114[var41];
							var38 += field115[var41];
							var39 += field116[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field129) {
							var35 -= field112[var42];
							var36 -= field113[var42];
							var37 -= field114[var42];
							var38 -= field115[var42];
							var39 -= field116[var42];
						}

						if (var40 >= 1 && var40 < field129 - 1 && (!field124 || (field117[0][var27][var40] & 0x2) != 0 || (field117[var7][var27][var40] & 0x10) == 0 && method60(var27, var7, var40) == field130)) {
							if (var7 < field127) {
								field127 = var7;
							}

							int var43 = field126[var7][var27][var40] & 0xFF;
							int var44 = field119[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field122[var7][var27][var40];
								int var46 = field122[var7][var27 + 1][var40];
								int var47 = field122[var7][var27 + 1][var40 + 1];
								int var48 = field122[var7][var27][var40 + 1];
								int var49 = field131[var27][var40];
								int var50 = field131[var27 + 1][var40];
								int var51 = field131[var27 + 1][var40 + 1];
								int var52 = field131[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method45(var55, var56, var57);
									var55 = field111 + var55 & 0xFF;
									var57 += field133;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method45(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field120[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !SXDNVMNH.field1253[var44 - 1].field1258) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field123[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = PNDCOEKM.field1151[method46(var54, 96)];
								}

								if (var44 == 0) {
									arg1.method492(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method46(var53, var49), method46(var53, var50), method46(var53, var51), method46(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field120[var7][var27][var40] + 1;
									byte var61 = field110[var7][var27][var40];
									SXDNVMNH var62 = SXDNVMNH.field1253[var44 - 1];
									int var63 = var62.field1256;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = PNDCOEKM.method425(var63);
										var65 = -1;
									} else if (var62.field1255 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method45(var62.field1259, var62.field1260, var62.field1261);
										var64 = PNDCOEKM.field1151[method54(var62.field1264, 96)];
									}

									arg1.method492(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method46(var53, var49), method46(var53, var50), method46(var53, var51), method46(var53, var52), method54(var65, var49), method54(var65, var50), method54(var65, var51), method54(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field129 - 1; var66++) {
				for (int var67 = 1; var67 < field128 - 1; var67++) {
					arg1.method491(var7, var67, var66, method60(var67, var7, var66));
				}
			}
		}

		arg1.method518(-10, -50, -50);

		for (int var68 = 0; var68 < field128; var68++) {
			for (int var69 = 0; var69 < field129; var69++) {
				if ((field117[1][var68][var69] & 0x2) == 2) {
					arg1.method489(var68, var69);
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
				for (int var75 = 0; var75 <= field129; var75++) {
					for (int var76 = 0; var76 <= field128; var76++) {
						if ((field123[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field123[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field129 && (field123[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field123[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field123[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field122[var80][var76][var77] - var84;
								int var86 = field122[var79][var76][var77];
								TAWLWNCF.method490(var86, var77 * 128, var76 * 128, var85, var73, var76 * 128, var78 * 128 + 128, 1);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field123[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field123[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field123[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field128 && (field123[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field123[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field123[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field122[var92][var89][var75] - var96;
								int var98 = field122[var91][var89][var75];
								TAWLWNCF.method490(var98, var75 * 128, var89 * 128, var97, var73, var90 * 128 + 128, var75 * 128, 2);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field123[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field123[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field123[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field129 && (field123[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field123[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field128) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field123[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field122[var74][var101][var103];
								TAWLWNCF.method490(var107, var103 * 128, var101 * 128, var107, var73, var102 * 128 + 128, var104 * 128 + 128, 4);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field123[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("CJZJWICI.a(IIIII)V")
	public final void method63(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg2; var5 <= arg2 + arg3; var5++) {
			for (int var6 = arg1; var6 <= arg0 + arg1; var6++) {
				if (var6 >= 0 && var6 < field128 && var5 >= 0 && var5 < field129) {
					field118[0][var6][var5] = 127;

					if (arg1 == var6 && var6 > 0) {
						field122[0][var6][var5] = field122[0][var6 - 1][var5];
					}

					if (arg0 + arg1 == var6 && var6 < field128 - 1) {
						field122[0][var6][var5] = field122[0][var6 + 1][var5];
					}

					if (arg2 == var5 && var5 > 0) {
						field122[0][var6][var5] = field122[0][var6][var5 - 1];
					}

					if (arg2 + arg3 == var5 && var5 < field129 - 1) {
						field122[0][var6][var5] = field122[0][var6][var5 + 1];
					}
				}
			}
		}
	}
}
