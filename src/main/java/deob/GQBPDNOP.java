package deob;

@ObfuscatedName("GQBPDNOP")
public final class GQBPDNOP {

	@ObfuscatedName("GQBPDNOP.v")
	public int field839;

	@ObfuscatedName("GQBPDNOP.w")
	public int field840;

	@ObfuscatedName("GQBPDNOP.y")
	public int[][][] field841;

	@ObfuscatedName("GQBPDNOP.H")
	public byte[][][] field845;

	@ObfuscatedName("GQBPDNOP.B")
	public byte[][][] field843;

	@ObfuscatedName("GQBPDNOP.t")
	public byte[][][] field837;

	@ObfuscatedName("GQBPDNOP.n")
	public byte[][][] field832;

	@ObfuscatedName("GQBPDNOP.r")
	public byte[][][] field835;

	@ObfuscatedName("GQBPDNOP.f")
	public int[][][] field825;

	@ObfuscatedName("GQBPDNOP.s")
	public byte[][][] field836;

	@ObfuscatedName("GQBPDNOP.C")
	public int[][] field844;

	@ObfuscatedName("GQBPDNOP.i")
	public int[] field827;

	@ObfuscatedName("GQBPDNOP.j")
	public int[] field828;

	@ObfuscatedName("GQBPDNOP.k")
	public int[] field829;

	@ObfuscatedName("GQBPDNOP.l")
	public int[] field830;

	@ObfuscatedName("GQBPDNOP.m")
	public int[] field831;

	@ObfuscatedName("GQBPDNOP.b")
	public static boolean field822 = true;

	@ObfuscatedName("GQBPDNOP.e")
	public static final int[] field824 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("GQBPDNOP.h")
	public static final int[] field826 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("GQBPDNOP.o")
	public static final int[] field833 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("GQBPDNOP.p")
	public static final int[] field834 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("GQBPDNOP.u")
	public static int field838 = 99;

	@ObfuscatedName("GQBPDNOP.a")
	public static int field821 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("GQBPDNOP.c")
	public static int field823 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("GQBPDNOP.z")
	public static int field842;

	@ObfuscatedName("GQBPDNOP.a(LWBEWPIXO;LIBVXWOKK;I)V")
	public static final void method247(WBEWPIXO arg0, IBVXWOKK arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method529();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			FUIMNWOZ var4 = FUIMNWOZ.method246(var2);
			var4.method241(arg1);

			while (true) {
				int var5 = arg0.method529();
				if (var5 == 0) {
					break;
				}

				arg0.method515();
			}
		}
	}

	@ObfuscatedName("GQBPDNOP.a(IIII[LBBOYCGQQ;BII[BILQPWZYOZR;)V")
	public final void method248(int arg0, int arg1, int arg2, int arg3, BBOYCGQQ[] arg4, int arg5, int arg6, byte[] arg7, int arg8, QPWZYOZR arg9) {
		WBEWPIXO var11 = new WBEWPIXO(arg7);
		int var12 = -1;
		while (true) {
			int var13 = var11.method529();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method529();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method515();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg8 == var18 && var17 >= arg1 && var17 < arg1 + 8 && var16 >= arg6 && var16 < arg6 + 8) {
					FUIMNWOZ var22 = FUIMNWOZ.method246(var12);
					int var23 = arg5 + XSVEHPAI.method586(var17 & 0x7, var22.field814, arg0, var22.field804, var21, var16 & 0x7);
					int var24 = arg2 + XSVEHPAI.method587(arg0, var16 & 0x7, var21, var22.field814, var17 & 0x7, var22.field804);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg3;
						if ((field845[1][var23][var24] & 0x2) == 2) {
							var25 = arg3 - 1;
						}

						BBOYCGQQ var26 = null;
						if (var25 >= 0) {
							var26 = arg4[var25];
						}

						method260(var20, arg3, var23, var26, var12, var24, arg9, arg0 + var21 & 0x3);
					}
				}
			}
		}
	}

	@ObfuscatedName("GQBPDNOP.a(IBII)I")
	public int method249(int arg0, int arg1, int arg2) {
		if ((field845[arg0][arg1][arg2] & 0x8) != 0) {
			return 0;
		}

		if (arg0 > 0 && (field845[1][arg1][arg2] & 0x2) != 0) {
			return arg0 - 1;
		}

		return arg0;
	}

	@ObfuscatedName("GQBPDNOP.a(IIII)I")
	public static final int method250(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - PIHSODZS.field1195[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("GQBPDNOP.a(II)I")
	public static final int method251(int arg0, int arg1) {
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

	@ObfuscatedName("GQBPDNOP.a(I[BII)Z")
	public static final boolean method252(byte[] arg0, int arg1, int arg2) {
		boolean var3 = true;
		WBEWPIXO var4 = new WBEWPIXO(arg0);
		int var5 = -1;
		while (true) {
			int var6 = var4.method529();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method529();
					if (var9 == 0) {
						break;
					}

					var4.method515();
				} else {
					int var10 = var4.method529();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method515() >> 2;
					int var14 = arg2 + var12;
					int var15 = arg1 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						FUIMNWOZ var16 = FUIMNWOZ.method246(var5);
						if (var13 != 22 || !field822 || var16.field807 || var16.field776) {
							var3 &= var16.method245();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("GQBPDNOP.a(III)I")
	public final int method253(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("GQBPDNOP.a(IIB)Z")
	public static final boolean method254(int arg0, int arg1) {
		FUIMNWOZ var2 = FUIMNWOZ.method246(arg0);

		if (arg1 == 11) {
			arg1 = 10;
		}

		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}

		return var2.method243(arg1);
	}

	public GQBPDNOP(int arg0, byte[][][] arg1, int arg2, int[][][] arg3) {
		field838 = 99;
		field839 = arg0;
		field840 = arg2;
		field841 = arg3;
		field845 = arg1;
		field843 = new byte[4][field839][field840];
		field837 = new byte[4][field839][field840];
		field832 = new byte[4][field839][field840];
		field835 = new byte[4][field839][field840];
		field825 = new int[4][field839 + 1][field840 + 1];
		field836 = new byte[4][field839 + 1][field840 + 1];
		field844 = new int[field839 + 1][field840 + 1];
		field827 = new int[field840];
		field828 = new int[field840];
		field829 = new int[field840];
		field830 = new int[field840];
		field831 = new int[field840];
	}

	@ObfuscatedName("GQBPDNOP.a(IIIIIILWBEWPIXO;I)V")
	public final void method255(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, WBEWPIXO arg6) {
		if (arg3 >= 0 && arg3 < 104 && arg2 >= 0 && arg2 < 104) {
			field845[arg5][arg3][arg2] = 0;
			while (true) {
				int var8 = arg6.method515();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg6.method515();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg5 == 0) {
						field841[0][arg3][arg2] = -var9 * 8;
						return;
					}

					field841[arg5][arg3][arg2] = field841[arg5 - 1][arg3][arg2] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field837[arg5][arg3][arg2] = arg6.method516();
					field832[arg5][arg3][arg2] = (byte) ((var8 - 2) / 4);
					field835[arg5][arg3][arg2] = (byte) (var8 + arg4 - 2 & 0x3);
				} else if (var8 <= 81) {
					field845[arg5][arg3][arg2] = (byte) (var8 - 49);
				} else {
					field843[arg5][arg3][arg2] = (byte) (var8 - 81);
				}
			}

			if (arg5 == 0) {
				field841[0][arg3][arg2] = -method256(arg3 + arg0 + 932731, arg2 + 556238 + arg1) * 8;
			} else {
				field841[arg5][arg3][arg2] = field841[arg5 - 1][arg3][arg2] - 240;
			}
		} else {
			while (true) {
				int var10 = arg6.method515();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg6.method515();
					return;
				}

				if (var10 <= 49) {
					arg6.method515();
				}
			}
		}
	}

	@ObfuscatedName("GQBPDNOP.b(II)I")
	public static final int method256(int arg0, int arg1) {
		int var2 = method262(arg0 + 45365, arg1 + 91923, 4) + (method262(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method262(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("GQBPDNOP.a(BIIIILBBOYCGQQ;IIILQPWZYOZR;[[[I)V")
	public static final void method257(int arg0, int arg1, int arg2, int arg3, BBOYCGQQ arg4, int arg5, int arg6, int arg7, QPWZYOZR arg8, int[][][] arg9) {
		int var10 = arg9[arg0][arg6][arg2];
		int var11 = arg9[arg0][arg6 + 1][arg2];
		int var12 = arg9[arg0][arg6 + 1][arg2 + 1];
		int var13 = arg9[arg0][arg6][arg2 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		FUIMNWOZ var15 = FUIMNWOZ.method246(arg3);
		int var16 = (arg3 << 14) + (arg2 << 7) + arg6 + 0x40000000;
		if (!var15.field807) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg7 << 6) + arg1);
		if (arg1 == 22) {
			DKQKXOQO var18;
			if (var15.field783 == -1 && var15.field771 == null) {
				var18 = var15.method244(22, arg7, var10, var11, var12, var13, -1);
			} else {
				var18 = new XEVZUZBV(var11, true, arg3, var15.field783, var13, var10, arg7, var12, 22);
			}

			arg8.method405(arg6, arg5, var16, var18, arg2, var14, var17);

			if (var15.field780 && var15.field807) {
				arg4.method30(arg2, arg6);
			}
		} else if (arg1 == 10 || arg1 == 11) {
			DKQKXOQO var19;
			if (var15.field783 == -1 && var15.field771 == null) {
				var19 = var15.method244(10, arg7, var10, var11, var12, var13, -1);
			} else {
				var19 = new XEVZUZBV(var11, true, arg3, var15.field783, var13, var10, arg7, var12, 10);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg1 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg7 == 1 || arg7 == 3) {
					var21 = var15.field804;
					var22 = var15.field814;
				} else {
					var21 = var15.field814;
					var22 = var15.field804;
				}

				arg8.method409(var14, arg5, arg2, var16, var22, var19, var17, var21, arg6, var20);
			}

			if (var15.field780) {
				arg4.method29(arg2, arg6, var15.field804, var15.field814, var15.field779, arg7);
			}
		} else if (arg1 >= 12) {
			DKQKXOQO var23;
			if (var15.field783 == -1 && var15.field771 == null) {
				var23 = var15.method244(arg1, arg7, var10, var11, var12, var13, -1);
			} else {
				var23 = new XEVZUZBV(var11, true, arg3, var15.field783, var13, var10, arg7, var12, arg1);
			}

			arg8.method409(var14, arg5, arg2, var16, 1, var23, var17, 1, arg6, 0);

			if (var15.field780) {
				arg4.method29(arg2, arg6, var15.field804, var15.field814, var15.field779, arg7);
			}
		} else if (arg1 == 0) {
			DKQKXOQO var24;
			if (var15.field783 == -1 && var15.field771 == null) {
				var24 = var15.method244(0, arg7, var10, var11, var12, var13, -1);
			} else {
				var24 = new XEVZUZBV(var11, true, arg3, var15.field783, var13, var10, arg7, var12, 0);
			}

			arg8.method407(0, var17, var14, field833[arg7], null, var24, arg6, arg5, var16, arg2);

			if (var15.field780) {
				arg4.method28(arg2, arg1, arg7, var15.field779, arg6);
			}
		} else if (arg1 == 1) {
			DKQKXOQO var25;
			if (var15.field783 == -1 && var15.field771 == null) {
				var25 = var15.method244(1, arg7, var10, var11, var12, var13, -1);
			} else {
				var25 = new XEVZUZBV(var11, true, arg3, var15.field783, var13, var10, arg7, var12, 1);
			}

			arg8.method407(0, var17, var14, field834[arg7], null, var25, arg6, arg5, var16, arg2);

			if (var15.field780) {
				arg4.method28(arg2, arg1, arg7, var15.field779, arg6);
			}
		} else if (arg1 == 2) {
			int var26 = arg7 + 1 & 0x3;
			DKQKXOQO var27;
			DKQKXOQO var28;
			if (var15.field783 == -1 && var15.field771 == null) {
				var27 = var15.method244(2, arg7 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method244(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new XEVZUZBV(var11, true, arg3, var15.field783, var13, var10, arg7 + 4, var12, 2);
				var28 = new XEVZUZBV(var11, true, arg3, var15.field783, var13, var10, var26, var12, 2);
			}

			arg8.method407(field833[var26], var17, var14, field833[arg7], var28, var27, arg6, arg5, var16, arg2);

			if (var15.field780) {
				arg4.method28(arg2, arg1, arg7, var15.field779, arg6);
			}
		} else if (arg1 == 3) {
			DKQKXOQO var29;
			if (var15.field783 == -1 && var15.field771 == null) {
				var29 = var15.method244(3, arg7, var10, var11, var12, var13, -1);
			} else {
				var29 = new XEVZUZBV(var11, true, arg3, var15.field783, var13, var10, arg7, var12, 3);
			}

			arg8.method407(0, var17, var14, field834[arg7], null, var29, arg6, arg5, var16, arg2);

			if (var15.field780) {
				arg4.method28(arg2, arg1, arg7, var15.field779, arg6);
			}
		} else if (arg1 == 9) {
			DKQKXOQO var30;
			if (var15.field783 == -1 && var15.field771 == null) {
				var30 = var15.method244(arg1, arg7, var10, var11, var12, var13, -1);
			} else {
				var30 = new XEVZUZBV(var11, true, arg3, var15.field783, var13, var10, arg7, var12, arg1);
			}

			arg8.method409(var14, arg5, arg2, var16, 1, var30, var17, 1, arg6, 0);

			if (var15.field780) {
				arg4.method29(arg2, arg6, var15.field804, var15.field814, var15.field779, arg7);
			}
		} else {
			if (var15.field813) {
				if (arg7 == 1) {
					int var31 = var13;
					var13 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var31;
				} else if (arg7 == 2) {
					int var32 = var13;
					var13 = var11;
					var11 = var32;
					int var33 = var12;
					var12 = var10;
					var10 = var33;
				} else if (arg7 == 3) {
					int var34 = var13;
					var13 = var10;
					var10 = var11;
					var11 = var12;
					var12 = var34;
				}
			}

			if (arg1 == 4) {
				DKQKXOQO var35;
				if (var15.field783 == -1 && var15.field771 == null) {
					var35 = var15.method244(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new XEVZUZBV(var11, true, arg3, var15.field783, var13, var10, 0, var12, 4);
				}

				arg8.method408(arg7 * 512, var35, 0, 0, var14, arg2, var17, arg5, field833[arg7], arg6, var16);
			} else if (arg1 == 5) {
				int var36 = 16;
				int var37 = arg8.method425(arg5, arg6, arg2);
				if (var37 > 0) {
					var36 = FUIMNWOZ.method246(var37 >> 14 & 0x7FFF).field782;
				}

				DKQKXOQO var38;
				if (var15.field783 == -1 && var15.field771 == null) {
					var38 = var15.method244(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new XEVZUZBV(var11, true, arg3, var15.field783, var13, var10, 0, var12, 4);
				}

				arg8.method408(arg7 * 512, var38, field826[arg7] * var36, field824[arg7] * var36, var14, arg2, var17, arg5, field833[arg7], arg6, var16);
			} else if (arg1 == 6) {
				DKQKXOQO var39;
				if (var15.field783 == -1 && var15.field771 == null) {
					var39 = var15.method244(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new XEVZUZBV(var11, true, arg3, var15.field783, var13, var10, 0, var12, 4);
				}

				arg8.method408(arg7, var39, 0, 0, var14, arg2, var17, arg5, 256, arg6, var16);
			} else if (arg1 == 7) {
				DKQKXOQO var40;
				if (var15.field783 == -1 && var15.field771 == null) {
					var40 = var15.method244(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new XEVZUZBV(var11, true, arg3, var15.field783, var13, var10, 0, var12, 4);
				}

				arg8.method408(arg7, var40, 0, 0, var14, arg2, var17, arg5, 512, arg6, var16);
			} else if (arg1 == 8) {
				DKQKXOQO var41;
				if (var15.field783 == -1 && var15.field771 == null) {
					var41 = var15.method244(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new XEVZUZBV(var11, true, arg3, var15.field783, var13, var10, 0, var12, 4);
				}

				arg8.method408(arg7, var41, 0, 0, var14, arg2, var17, arg5, 768, arg6, var16);
			}
		}
	}

	@ObfuscatedName("GQBPDNOP.c(II)I")
	public static final int method258(int arg0, int arg1) {
		int var2 = method261(arg0 - 1, arg1 - 1) + method261(arg0 + 1, arg1 - 1) + method261(arg0 - 1, arg1 + 1) + method261(arg0 + 1, arg1 + 1);
		int var3 = method261(arg0 - 1, arg1) + method261(arg0 + 1, arg1) + method261(arg0, arg1 - 1) + method261(arg0, arg1 + 1);
		int var4 = method261(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("GQBPDNOP.d(II)I")
	public final int method259(int arg0, int arg1) {
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

	@ObfuscatedName("GQBPDNOP.a(IIILBBOYCGQQ;IIILQPWZYOZR;I)V")
	public final void method260(int arg0, int arg1, int arg2, BBOYCGQQ arg3, int arg4, int arg5, QPWZYOZR arg6, int arg7) {
		if (field822 && (field845[0][arg2][arg5] & 0x2) == 0) {
			if ((field845[arg1][arg2][arg5] & 0x10) != 0) {
				return;
			}

			if (method249(arg1, arg2, arg5) != field842) {
				return;
			}
		}

		if (arg1 < field838) {
			field838 = arg1;
		}

		int var9 = field841[arg1][arg2][arg5];
		int var10 = field841[arg1][arg2 + 1][arg5];
		int var11 = field841[arg1][arg2 + 1][arg5 + 1];
		int var12 = field841[arg1][arg2][arg5 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		FUIMNWOZ var14 = FUIMNWOZ.method246(arg4);
		int var15 = (arg4 << 14) + (arg5 << 7) + arg2 + 0x40000000;
		if (!var14.field807) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg7 << 6) + arg0);
		if (arg0 == 22) {
			if (!field822 || var14.field807 || var14.field776) {
				DKQKXOQO var17;
				if (var14.field783 == -1 && var14.field771 == null) {
					var17 = var14.method244(22, arg7, var9, var10, var11, var12, -1);
				} else {
					var17 = new XEVZUZBV(var10, true, arg4, var14.field783, var12, var9, arg7, var11, 22);
				}

				arg6.method405(arg2, arg1, var15, var17, arg5, var13, var16);

				if (var14.field780 && var14.field807 && arg3 != null) {
					arg3.method30(arg5, arg2);
				}
			}
		} else if (arg0 == 10 || arg0 == 11) {
			DKQKXOQO var18;
			if (var14.field783 == -1 && var14.field771 == null) {
				var18 = var14.method244(10, arg7, var9, var10, var11, var12, -1);
			} else {
				var18 = new XEVZUZBV(var10, true, arg4, var14.field783, var12, var9, arg7, var11, 10);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg0 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg7 == 1 || arg7 == 3) {
					var20 = var14.field804;
					var21 = var14.field814;
				} else {
					var20 = var14.field814;
					var21 = var14.field804;
				}

				if (arg6.method409(var13, arg1, arg5, var15, var21, var18, var16, var20, arg2, var19) && var14.field777) {
					FCIDIKVY var22;
					if (var18 instanceof FCIDIKVY) {
						var22 = (FCIDIKVY) var18;
					} else {
						var22 = var14.method244(10, arg7, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field708 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field836[arg1][arg2 + var23][arg5 + var24]) {
									field836[arg1][arg2 + var23][arg5 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field780 && arg3 != null) {
				arg3.method29(arg5, arg2, var14.field804, var14.field814, var14.field779, arg7);
			}
		} else if (arg0 >= 12) {
			DKQKXOQO var26;
			if (var14.field783 == -1 && var14.field771 == null) {
				var26 = var14.method244(arg0, arg7, var9, var10, var11, var12, -1);
			} else {
				var26 = new XEVZUZBV(var10, true, arg4, var14.field783, var12, var9, arg7, var11, arg0);
			}

			arg6.method409(var13, arg1, arg5, var15, 1, var26, var16, 1, arg2, 0);

			if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg1 > 0) {
				field825[arg1][arg2][arg5] |= 0x924;
			}

			if (var14.field780 && arg3 != null) {
				arg3.method29(arg5, arg2, var14.field804, var14.field814, var14.field779, arg7);
			}
		} else if (arg0 == 0) {
			DKQKXOQO var27;
			if (var14.field783 == -1 && var14.field771 == null) {
				var27 = var14.method244(0, arg7, var9, var10, var11, var12, -1);
			} else {
				var27 = new XEVZUZBV(var10, true, arg4, var14.field783, var12, var9, arg7, var11, 0);
			}

			arg6.method407(0, var16, var13, field833[arg7], null, var27, arg2, arg1, var15, arg5);

			if (arg7 == 0) {
				if (var14.field777) {
					field836[arg1][arg2][arg5] = 50;
					field836[arg1][arg2][arg5 + 1] = 50;
				}

				if (var14.field787) {
					field825[arg1][arg2][arg5] |= 0x249;
				}
			} else if (arg7 == 1) {
				if (var14.field777) {
					field836[arg1][arg2][arg5 + 1] = 50;
					field836[arg1][arg2 + 1][arg5 + 1] = 50;
				}

				if (var14.field787) {
					field825[arg1][arg2][arg5 + 1] |= 0x492;
				}
			} else if (arg7 == 2) {
				if (var14.field777) {
					field836[arg1][arg2 + 1][arg5] = 50;
					field836[arg1][arg2 + 1][arg5 + 1] = 50;
				}

				if (var14.field787) {
					field825[arg1][arg2 + 1][arg5] |= 0x249;
				}
			} else if (arg7 == 3) {
				if (var14.field777) {
					field836[arg1][arg2][arg5] = 50;
					field836[arg1][arg2 + 1][arg5] = 50;
				}

				if (var14.field787) {
					field825[arg1][arg2][arg5] |= 0x492;
				}
			}

			if (var14.field780 && arg3 != null) {
				arg3.method28(arg5, arg0, arg7, var14.field779, arg2);
			}

			if (var14.field782 != 16) {
				arg6.method415(arg1, var14.field782, arg5, arg2);
			}
		} else if (arg0 == 1) {
			DKQKXOQO var28;
			if (var14.field783 == -1 && var14.field771 == null) {
				var28 = var14.method244(1, arg7, var9, var10, var11, var12, -1);
			} else {
				var28 = new XEVZUZBV(var10, true, arg4, var14.field783, var12, var9, arg7, var11, 1);
			}

			arg6.method407(0, var16, var13, field834[arg7], null, var28, arg2, arg1, var15, arg5);

			if (var14.field777) {
				if (arg7 == 0) {
					field836[arg1][arg2][arg5 + 1] = 50;
				} else if (arg7 == 1) {
					field836[arg1][arg2 + 1][arg5 + 1] = 50;
				} else if (arg7 == 2) {
					field836[arg1][arg2 + 1][arg5] = 50;
				} else if (arg7 == 3) {
					field836[arg1][arg2][arg5] = 50;
				}
			}

			if (var14.field780 && arg3 != null) {
				arg3.method28(arg5, arg0, arg7, var14.field779, arg2);
			}
		} else if (arg0 == 2) {
			int var29 = arg7 + 1 & 0x3;
			DKQKXOQO var30;
			DKQKXOQO var31;
			if (var14.field783 == -1 && var14.field771 == null) {
				var30 = var14.method244(2, arg7 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method244(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new XEVZUZBV(var10, true, arg4, var14.field783, var12, var9, arg7 + 4, var11, 2);
				var31 = new XEVZUZBV(var10, true, arg4, var14.field783, var12, var9, var29, var11, 2);
			}

			arg6.method407(field833[var29], var16, var13, field833[arg7], var31, var30, arg2, arg1, var15, arg5);

			if (var14.field787) {
				if (arg7 == 0) {
					field825[arg1][arg2][arg5] |= 0x249;
					field825[arg1][arg2][arg5 + 1] |= 0x492;
				} else if (arg7 == 1) {
					field825[arg1][arg2][arg5 + 1] |= 0x492;
					field825[arg1][arg2 + 1][arg5] |= 0x249;
				} else if (arg7 == 2) {
					field825[arg1][arg2 + 1][arg5] |= 0x249;
					field825[arg1][arg2][arg5] |= 0x492;
				} else if (arg7 == 3) {
					field825[arg1][arg2][arg5] |= 0x492;
					field825[arg1][arg2][arg5] |= 0x249;
				}
			}

			if (var14.field780 && arg3 != null) {
				arg3.method28(arg5, arg0, arg7, var14.field779, arg2);
			}

			if (var14.field782 != 16) {
				arg6.method415(arg1, var14.field782, arg5, arg2);
			}
		} else if (arg0 == 3) {
			DKQKXOQO var32;
			if (var14.field783 == -1 && var14.field771 == null) {
				var32 = var14.method244(3, arg7, var9, var10, var11, var12, -1);
			} else {
				var32 = new XEVZUZBV(var10, true, arg4, var14.field783, var12, var9, arg7, var11, 3);
			}

			arg6.method407(0, var16, var13, field834[arg7], null, var32, arg2, arg1, var15, arg5);

			if (var14.field777) {
				if (arg7 == 0) {
					field836[arg1][arg2][arg5 + 1] = 50;
				} else if (arg7 == 1) {
					field836[arg1][arg2 + 1][arg5 + 1] = 50;
				} else if (arg7 == 2) {
					field836[arg1][arg2 + 1][arg5] = 50;
				} else if (arg7 == 3) {
					field836[arg1][arg2][arg5] = 50;
				}
			}

			if (var14.field780 && arg3 != null) {
				arg3.method28(arg5, arg0, arg7, var14.field779, arg2);
			}
		} else if (arg0 == 9) {
			DKQKXOQO var33;
			if (var14.field783 == -1 && var14.field771 == null) {
				var33 = var14.method244(arg0, arg7, var9, var10, var11, var12, -1);
			} else {
				var33 = new XEVZUZBV(var10, true, arg4, var14.field783, var12, var9, arg7, var11, arg0);
			}

			arg6.method409(var13, arg1, arg5, var15, 1, var33, var16, 1, arg2, 0);

			if (var14.field780 && arg3 != null) {
				arg3.method29(arg5, arg2, var14.field804, var14.field814, var14.field779, arg7);
			}
		} else {
			if (var14.field813) {
				if (arg7 == 1) {
					int var34 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var9;
					var9 = var34;
				} else if (arg7 == 2) {
					int var35 = var12;
					var12 = var10;
					var10 = var35;
					int var36 = var11;
					var11 = var9;
					var9 = var36;
				} else if (arg7 == 3) {
					int var37 = var12;
					var12 = var9;
					var9 = var10;
					var10 = var11;
					var11 = var37;
				}
			}

			if (arg0 == 4) {
				DKQKXOQO var38;
				if (var14.field783 == -1 && var14.field771 == null) {
					var38 = var14.method244(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new XEVZUZBV(var10, true, arg4, var14.field783, var12, var9, 0, var11, 4);
				}

				arg6.method408(arg7 * 512, var38, 0, 0, var13, arg5, var16, arg1, field833[arg7], arg2, var15);
			} else if (arg0 == 5) {
				int var39 = 16;
				int var40 = arg6.method425(arg1, arg2, arg5);
				if (var40 > 0) {
					var39 = FUIMNWOZ.method246(var40 >> 14 & 0x7FFF).field782;
				}

				DKQKXOQO var41;
				if (var14.field783 == -1 && var14.field771 == null) {
					var41 = var14.method244(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new XEVZUZBV(var10, true, arg4, var14.field783, var12, var9, 0, var11, 4);
				}

				arg6.method408(arg7 * 512, var41, field826[arg7] * var39, field824[arg7] * var39, var13, arg5, var16, arg1, field833[arg7], arg2, var15);
			} else if (arg0 == 6) {
				DKQKXOQO var42;
				if (var14.field783 == -1 && var14.field771 == null) {
					var42 = var14.method244(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new XEVZUZBV(var10, true, arg4, var14.field783, var12, var9, 0, var11, 4);
				}

				arg6.method408(arg7, var42, 0, 0, var13, arg5, var16, arg1, 256, arg2, var15);
			} else if (arg0 == 7) {
				DKQKXOQO var43;
				if (var14.field783 == -1 && var14.field771 == null) {
					var43 = var14.method244(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new XEVZUZBV(var10, true, arg4, var14.field783, var12, var9, 0, var11, 4);
				}

				arg6.method408(arg7, var43, 0, 0, var13, arg5, var16, arg1, 512, arg2, var15);
			} else if (arg0 == 8) {
				DKQKXOQO var44;
				if (var14.field783 == -1 && var14.field771 == null) {
					var44 = var14.method244(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new XEVZUZBV(var10, true, arg4, var14.field783, var12, var9, 0, var11, 4);
				}

				arg6.method408(arg7, var44, 0, 0, var13, arg5, var16, arg1, 768, arg2, var15);
			}
		}
	}

	@ObfuscatedName("GQBPDNOP.e(II)I")
	public static final int method261(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("GQBPDNOP.b(III)I")
	public static final int method262(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method258(var3, var5);
		int var8 = method258(var3 + 1, var5);
		int var9 = method258(var3, var5 + 1);
		int var10 = method258(var3 + 1, var5 + 1);
		int var11 = method250(var7, var8, var4, arg2);
		int var12 = method250(var9, var10, var4, arg2);
		return method250(var11, var12, var6, arg2);
	}

	@ObfuscatedName("GQBPDNOP.a([LBBOYCGQQ;LQPWZYOZR;I)V")
	public final void method263(BBOYCGQQ[] arg0, QPWZYOZR arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field845[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field845[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg0[var6].method30(var5, var4);
						}
					}
				}
			}
		}

		field821 += (int) (Math.random() * 5.0D) - 2;
		if (field821 < -8) {
			field821 = -8;
		}

		if (field821 > 8) {
			field821 = 8;
		}

		field823 += (int) (Math.random() * 5.0D) - 2;
		if (field823 < -16) {
			field823 = -16;
		}

		if (field823 > 16) {
			field823 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field836[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field840 - 1; var16++) {
				for (int var17 = 1; var17 < field839 - 1; var17++) {
					int var18 = field841[var7][var17 + 1][var16] - field841[var7][var17 - 1][var16];
					int var19 = field841[var7][var17][var16 + 1] - field841[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field844[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field840; var26++) {
				field827[var26] = 0;
				field828[var26] = 0;
				field829[var26] = 0;
				field830[var26] = 0;
				field831[var26] = 0;
			}

			for (int var27 = -5; var27 < field839 + 5; var27++) {
				for (int var28 = 0; var28 < field840; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field839) {
						int var30 = field843[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							QRIJREXW var31 = QRIJREXW.field1310[var30 - 1];
							field827[var28] += var31.field1319;
							field828[var28] += var31.field1317;
							field829[var28] += var31.field1318;
							field830[var28] += var31.field1320;
							field831[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field839) {
						int var33 = field843[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							QRIJREXW var34 = QRIJREXW.field1310[var33 - 1];
							field827[var28] -= var34.field1319;
							field828[var28] -= var34.field1317;
							field829[var28] -= var34.field1318;
							field830[var28] -= var34.field1320;
							field831[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field839 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field840 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field840) {
							var35 += field827[var41];
							var36 += field828[var41];
							var37 += field829[var41];
							var38 += field830[var41];
							var39 += field831[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field840) {
							var35 -= field827[var42];
							var36 -= field828[var42];
							var37 -= field829[var42];
							var38 -= field830[var42];
							var39 -= field831[var42];
						}

						if (var40 >= 1 && var40 < field840 - 1 && (!field822 || (field845[0][var27][var40] & 0x2) != 0 || (field845[var7][var27][var40] & 0x10) == 0 && method249(var7, var27, var40) == field842)) {
							if (var7 < field838) {
								field838 = var7;
							}

							int var43 = field843[var7][var27][var40] & 0xFF;
							int var44 = field837[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field841[var7][var27][var40];
								int var46 = field841[var7][var27 + 1][var40];
								int var47 = field841[var7][var27 + 1][var40 + 1];
								int var48 = field841[var7][var27][var40 + 1];
								int var49 = field844[var27][var40];
								int var50 = field844[var27 + 1][var40];
								int var51 = field844[var27 + 1][var40 + 1];
								int var52 = field844[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method253(var55, var56, var57);
									var55 = field821 + var55 & 0xFF;
									var57 += field823;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method253(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field832[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !QRIJREXW.field1310[var44 - 1].field1315) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field825[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = PIHSODZS.field1206[method251(var54, 96)];
								}

								if (var44 == 0) {
									arg1.method404(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method251(var53, var49), method251(var53, var50), method251(var53, var51), method251(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field832[var7][var27][var40] + 1;
									byte var61 = field835[var7][var27][var40];
									QRIJREXW var62 = QRIJREXW.field1310[var44 - 1];
									int var63 = var62.field1313;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = PIHSODZS.method378(var63);
										var65 = -1;
									} else if (var62.field1312 == 0xFF00FF) {
										var65 = -2;
										var63 = -1;
										var64 = PIHSODZS.field1206[method259(var62.field1321, 96)];
									} else {
										var65 = method253(var62.field1316, var62.field1317, var62.field1318);
										var64 = PIHSODZS.field1206[method259(var62.field1321, 96)];
									}

									arg1.method404(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method251(var53, var49), method251(var53, var50), method251(var53, var51), method251(var53, var52), method259(var65, var49), method259(var65, var50), method259(var65, var51), method259(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field840 - 1; var66++) {
				for (int var67 = 1; var67 < field839 - 1; var67++) {
					arg1.method403(var7, var67, var66, method249(var7, var67, var66));
				}
			}
		}

		arg1.method430(-50, -10, -50);

		for (int var68 = 0; var68 < field839; var68++) {
			for (int var69 = 0; var69 < field840; var69++) {
				if ((field845[1][var68][var69] & 0x2) == 2) {
					arg1.method401(var69, var68);
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
				for (int var75 = 0; var75 <= field840; var75++) {
					for (int var76 = 0; var76 <= field839; var76++) {
						if ((field825[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field825[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field840 && (field825[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field825[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field825[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field841[var80][var76][var77] - var84;
								int var86 = field841[var79][var76][var77];
								QPWZYOZR.method402(var85, var78 * 128 + 128, var76 * 128, var86, var76 * 128, var73, 1, var77 * 128);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field825[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field825[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field825[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field839 && (field825[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field825[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field825[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field841[var92][var89][var75] - var96;
								int var98 = field841[var91][var89][var75];
								QPWZYOZR.method402(var97, var75 * 128, var90 * 128 + 128, var98, var89 * 128, var73, 2, var75 * 128);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field825[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field825[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field825[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field840 && (field825[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field825[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field839) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field825[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field841[var74][var101][var103];
								QPWZYOZR.method402(var107, var104 * 128 + 128, var102 * 128 + 128, var107, var101 * 128, var73, 4, var103 * 128);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field825[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("GQBPDNOP.a(IIIIB)V")
	public final void method264(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg1; var5 <= arg0 + arg1; var5++) {
			for (int var6 = arg2; var6 <= arg2 + arg3; var6++) {
				if (var6 >= 0 && var6 < field839 && var5 >= 0 && var5 < field840) {
					field836[0][var6][var5] = 127;

					if (arg2 == var6 && var6 > 0) {
						field841[0][var6][var5] = field841[0][var6 - 1][var5];
					}

					if (arg2 + arg3 == var6 && var6 < field839 - 1) {
						field841[0][var6][var5] = field841[0][var6 + 1][var5];
					}

					if (arg1 == var5 && var5 > 0) {
						field841[0][var6][var5] = field841[0][var6][var5 - 1];
					}

					if (arg0 + arg1 == var5 && var5 < field840 - 1) {
						field841[0][var6][var5] = field841[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("GQBPDNOP.a(BIII)V")
	public final void method265(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 8; var4++) {
			for (int var5 = 0; var5 < 8; var5++) {
				field841[arg2][arg1 + var4][arg0 + var5] = 0;
			}
		}

		if (arg1 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				field841[arg2][arg1][arg0 + var6] = field841[arg2][arg1 - 1][arg0 + var6];
			}
		}

		if (arg0 > 0) {
			for (int var7 = 1; var7 < 8; var7++) {
				field841[arg2][arg1 + var7][arg0] = field841[arg2][arg1 + var7][arg0 - 1];
			}
		}

		if (arg1 > 0 && field841[arg2][arg1 - 1][arg0] != 0) {
			field841[arg2][arg1][arg0] = field841[arg2][arg1 - 1][arg0];
		} else if (arg0 > 0 && field841[arg2][arg1][arg0 - 1] != 0) {
			field841[arg2][arg1][arg0] = field841[arg2][arg1][arg0 - 1];
		} else if (arg1 > 0 && arg0 > 0 && field841[arg2][arg1 - 1][arg0 - 1] != 0) {
			field841[arg2][arg1][arg0] = field841[arg2][arg1 - 1][arg0 - 1];
		}
	}

	@ObfuscatedName("GQBPDNOP.a(III[LBBOYCGQQ;[BZI)V")
	public final void method266(int arg0, int arg1, int arg2, BBOYCGQQ[] arg3, byte[] arg4, int arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg2 + var8 > 0 && arg2 + var8 < 103 && arg0 + var9 > 0 && arg0 + var9 < 103) {
						arg3[var7].field120[arg2 + var8][arg0 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		WBEWPIXO var10 = new WBEWPIXO(arg4);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method255(arg5, arg1, arg0 + var13, arg2 + var12, 0, var11, var10);
				}
			}
		}
	}

	@ObfuscatedName("GQBPDNOP.a(LQPWZYOZR;II[LBBOYCGQQ;I[B)V")
	public final void method267(QPWZYOZR arg0, int arg1, BBOYCGQQ[] arg2, int arg3, byte[] arg4) {
		WBEWPIXO var6 = new WBEWPIXO(arg4);
		int var7 = -1;
		while (true) {
			int var8 = var6.method529();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method529();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method515();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg3 + var12;
				int var18 = arg1 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field845[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					BBOYCGQQ var20 = null;
					if (var19 >= 0) {
						var20 = arg2[var19];
					}

					method260(var15, var13, var17, var20, var7, var18, arg0, var16);
				}
			}
		}
	}

	@ObfuscatedName("GQBPDNOP.a(BIIIIII[BI[LBBOYCGQQ;)V")
	public final void method268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, BBOYCGQQ[] arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg4 + var10 > 0 && arg4 + var10 < 103 && arg7 + var11 > 0 && arg7 + var11 < 103) {
					arg8[arg3].field120[arg4 + var10][arg7 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		WBEWPIXO var12 = new WBEWPIXO(arg6);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg0 == var13 && var14 >= arg2 && var14 < arg2 + 8 && var15 >= arg1 && var15 < arg1 + 8) {
						method255(0, 0, arg7 + XSVEHPAI.method585(arg5, var14 & 0x7, var15 & 0x7), arg4 + XSVEHPAI.method584(var15 & 0x7, arg5, var14 & 0x7), arg5, arg3, var12);
					} else {
						method255(0, 0, -1, -1, 0, 0, var12);
					}
				}
			}
		}
	}
}
