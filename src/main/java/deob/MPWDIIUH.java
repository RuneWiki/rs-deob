package deob;

@ObfuscatedName("MPWDIIUH")
public final class MPWDIIUH {

	@ObfuscatedName("MPWDIIUH.w")
	public int field784;

	@ObfuscatedName("MPWDIIUH.x")
	public int field785;

	@ObfuscatedName("MPWDIIUH.c")
	public int[][][] field766;

	@ObfuscatedName("MPWDIIUH.B")
	public byte[][][] field789;

	@ObfuscatedName("MPWDIIUH.A")
	public byte[][][] field788;

	@ObfuscatedName("MPWDIIUH.r")
	public byte[][][] field779;

	@ObfuscatedName("MPWDIIUH.i")
	public byte[][][] field771;

	@ObfuscatedName("MPWDIIUH.e")
	public byte[][][] field768;

	@ObfuscatedName("MPWDIIUH.h")
	public int[][][] field770;

	@ObfuscatedName("MPWDIIUH.k")
	public byte[][][] field772;

	@ObfuscatedName("MPWDIIUH.g")
	public int[][] field769;

	@ObfuscatedName("MPWDIIUH.m")
	public int[] field774;

	@ObfuscatedName("MPWDIIUH.n")
	public int[] field775;

	@ObfuscatedName("MPWDIIUH.o")
	public int[] field776;

	@ObfuscatedName("MPWDIIUH.p")
	public int[] field777;

	@ObfuscatedName("MPWDIIUH.q")
	public int[] field778;

	@ObfuscatedName("MPWDIIUH.d")
	public static final int[] field767 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("MPWDIIUH.s")
	public static final int[] field780 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("MPWDIIUH.u")
	public static final int[] field782 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("MPWDIIUH.v")
	public static int field783 = 99;

	@ObfuscatedName("MPWDIIUH.y")
	public static final int[] field786 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("MPWDIIUH.D")
	public static boolean field790 = true;

	@ObfuscatedName("MPWDIIUH.l")
	public static int field773 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("MPWDIIUH.z")
	public static int field787 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("MPWDIIUH.t")
	public static int field781;

	@ObfuscatedName("MPWDIIUH.a(II)I")
	public static final int method280(int arg0, int arg1) {
		int var2 = method289(arg0 + 45365, arg1 + 91923, 4) + (method289(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method289(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("MPWDIIUH.a(III)Z")
	public static final boolean method281(int arg0, int arg1) {
		ZXOFSHYE var2 = ZXOFSHYE.method588(arg0);

		if (arg1 == 11) {
			arg1 = 10;
		}

		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}

		return var2.method585(arg1);
	}

	@ObfuscatedName("MPWDIIUH.a(III[LMPYOQJPZ;[BII)V")
	public final void method282(int arg0, int arg1, MPYOQJPZ[] arg2, byte[] arg3, int arg4, int arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg5 + var8 > 0 && arg5 + var8 < 103 && arg0 + var9 > 0 && arg0 + var9 < 103) {
						arg2[var7].field795[arg5 + var8][arg0 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		MQZHAILV var10 = new MQZHAILV(arg3);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method283(0, arg0 + var13, arg1, arg4, var10, arg5 + var12, var11);
				}
			}
		}
	}

	@ObfuscatedName("MPWDIIUH.a(IIIIILMQZHAILV;II)V")
	public final void method283(int arg0, int arg1, int arg2, int arg3, MQZHAILV arg4, int arg5, int arg6) {
		if (arg5 >= 0 && arg5 < 104 && arg1 >= 0 && arg1 < 104) {
			field789[arg6][arg5][arg1] = 0;
			while (true) {
				int var8 = arg4.method325();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg4.method325();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg6 == 0) {
						field766[0][arg5][arg1] = -var9 * 8;
						return;
					}

					field766[arg6][arg5][arg1] = field766[arg6 - 1][arg5][arg1] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field779[arg6][arg5][arg1] = arg4.method326();
					field771[arg6][arg5][arg1] = (byte) ((var8 - 2) / 4);
					field768[arg6][arg5][arg1] = (byte) (var8 + arg0 - 2 & 0x3);
				} else if (var8 <= 81) {
					field789[arg6][arg5][arg1] = (byte) (var8 - 49);
				} else {
					field788[arg6][arg5][arg1] = (byte) (var8 - 81);
				}
			}

			if (arg6 == 0) {
				field766[0][arg5][arg1] = -method280(arg5 + arg3 + 932731, arg1 + 556238 + arg2) * 8;
			} else {
				field766[arg6][arg5][arg1] = field766[arg6 - 1][arg5][arg1] - 240;
			}
		} else {
			while (true) {
				int var10 = arg4.method325();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg4.method325();
					return;
				}

				if (var10 <= 49) {
					arg4.method325();
				}
			}
		}
	}

	@ObfuscatedName("MPWDIIUH.b(II)I")
	public static final int method284(int arg0, int arg1) {
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

	@ObfuscatedName("MPWDIIUH.a(IIZ[B)Z")
	public static final boolean method285(int arg0, int arg1, byte[] arg2) {
		boolean var3 = true;
		MQZHAILV var4 = new MQZHAILV(arg2);
		int var5 = -1;
		while (true) {
			int var6 = var4.method339();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method339();
					if (var9 == 0) {
						break;
					}

					var4.method325();
				} else {
					int var10 = var4.method339();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method325() >> 2;
					int var14 = arg0 + var12;
					int var15 = arg1 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						ZXOFSHYE var16 = ZXOFSHYE.method588(var5);
						if (var13 != 22 || !field790 || var16.field1448 || var16.field1475) {
							var3 &= var16.method587();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("MPWDIIUH.b(III)I")
	public final int method286(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("MPWDIIUH.a(LMQZHAILV;LYCBPJRVN;I)V")
	public static final void method287(MQZHAILV arg0, YCBPJRVN arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method339();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			ZXOFSHYE var4 = ZXOFSHYE.method588(var2);
			var4.method584(arg1);

			while (true) {
				int var5 = arg0.method339();
				if (var5 == 0) {
					break;
				}

				arg0.method325();
			}
		}
	}

	@ObfuscatedName("MPWDIIUH.c(II)I")
	public static final int method288(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("MPWDIIUH.c(III)I")
	public static final int method289(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method295(var3, var5);
		int var8 = method295(var3 + 1, var5);
		int var9 = method295(var3, var5 + 1);
		int var10 = method295(var3 + 1, var5 + 1);
		int var11 = method299(var7, var8, var4, arg2);
		int var12 = method299(var9, var10, var4, arg2);
		return method299(var11, var12, var6, arg2);
	}

	@ObfuscatedName("MPWDIIUH.a(IIIILRGNQYESN;ILMPYOQJPZ;II[[[II)V")
	public static final void method290(int arg0, int arg1, int arg2, int arg3, RGNQYESN arg4, int arg5, MPYOQJPZ arg6, int arg7, int[][][] arg8, int arg9) {
		int var10 = arg8[arg5][arg9][arg3];
		int var11 = arg8[arg5][arg9 + 1][arg3];
		int var12 = arg8[arg5][arg9 + 1][arg3 + 1];
		int var13 = arg8[arg5][arg9][arg3 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		ZXOFSHYE var15 = ZXOFSHYE.method588(arg2);
		int var16 = (arg2 << 14) + (arg3 << 7) + arg9 + 0x40000000;
		if (!var15.field1448) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg0 << 6) + arg7);
		if (arg7 == 22) {
			AVUWZCYT var18;
			if (var15.field1446 == -1 && var15.field1456 == null) {
				var18 = var15.method586(22, arg0, var10, var11, var12, var13, -1);
			} else {
				var18 = new UYLEXXVQ(var11, var13, var15.field1446, arg2, var12, arg0, var10, true, 22);
			}

			arg4.method412(arg3, var14, var18, var17, arg1, var16, arg9);

			if (var15.field1450 && var15.field1448) {
				arg6.method304(arg9, arg3);
			}
		} else if (arg7 == 10 || arg7 == 11) {
			AVUWZCYT var19;
			if (var15.field1446 == -1 && var15.field1456 == null) {
				var19 = var15.method586(10, arg0, var10, var11, var12, var13, -1);
			} else {
				var19 = new UYLEXXVQ(var11, var13, var15.field1446, arg2, var12, arg0, var10, true, 10);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg7 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg0 == 1 || arg0 == 3) {
					var21 = var15.field1488;
					var22 = var15.field1472;
				} else {
					var21 = var15.field1472;
					var22 = var15.field1488;
				}

				arg4.method416(var21, arg3, arg9, var17, var19, var22, var20, arg1, var16, var14);
			}

			if (var15.field1450) {
				arg6.method303(arg9, arg0, var15.field1488, var15.field1476, arg3, var15.field1472);
			}
		} else if (arg7 >= 12) {
			AVUWZCYT var23;
			if (var15.field1446 == -1 && var15.field1456 == null) {
				var23 = var15.method586(arg7, arg0, var10, var11, var12, var13, -1);
			} else {
				var23 = new UYLEXXVQ(var11, var13, var15.field1446, arg2, var12, arg0, var10, true, arg7);
			}

			arg4.method416(1, arg3, arg9, var17, var23, 1, 0, arg1, var16, var14);

			if (var15.field1450) {
				arg6.method303(arg9, arg0, var15.field1488, var15.field1476, arg3, var15.field1472);
			}
		} else if (arg7 == 0) {
			AVUWZCYT var24;
			if (var15.field1446 == -1 && var15.field1456 == null) {
				var24 = var15.method586(0, arg0, var10, var11, var12, var13, -1);
			} else {
				var24 = new UYLEXXVQ(var11, var13, var15.field1446, arg2, var12, arg0, var10, true, 0);
			}

			arg4.method414(0, var16, arg1, field780[arg0], arg3, var17, arg9, var24, var14, null);

			if (var15.field1450) {
				arg6.method302(arg7, arg3, var15.field1476, arg9, arg0);
			}
		} else if (arg7 == 1) {
			AVUWZCYT var25;
			if (var15.field1446 == -1 && var15.field1456 == null) {
				var25 = var15.method586(1, arg0, var10, var11, var12, var13, -1);
			} else {
				var25 = new UYLEXXVQ(var11, var13, var15.field1446, arg2, var12, arg0, var10, true, 1);
			}

			arg4.method414(0, var16, arg1, field786[arg0], arg3, var17, arg9, var25, var14, null);

			if (var15.field1450) {
				arg6.method302(arg7, arg3, var15.field1476, arg9, arg0);
			}
		} else if (arg7 == 2) {
			int var26 = arg0 + 1 & 0x3;
			AVUWZCYT var27;
			AVUWZCYT var28;
			if (var15.field1446 == -1 && var15.field1456 == null) {
				var27 = var15.method586(2, arg0 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method586(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new UYLEXXVQ(var11, var13, var15.field1446, arg2, var12, arg0 + 4, var10, true, 2);
				var28 = new UYLEXXVQ(var11, var13, var15.field1446, arg2, var12, var26, var10, true, 2);
			}

			arg4.method414(field780[var26], var16, arg1, field780[arg0], arg3, var17, arg9, var27, var14, var28);

			if (var15.field1450) {
				arg6.method302(arg7, arg3, var15.field1476, arg9, arg0);
			}
		} else if (arg7 == 3) {
			AVUWZCYT var29;
			if (var15.field1446 == -1 && var15.field1456 == null) {
				var29 = var15.method586(3, arg0, var10, var11, var12, var13, -1);
			} else {
				var29 = new UYLEXXVQ(var11, var13, var15.field1446, arg2, var12, arg0, var10, true, 3);
			}

			arg4.method414(0, var16, arg1, field786[arg0], arg3, var17, arg9, var29, var14, null);

			if (var15.field1450) {
				arg6.method302(arg7, arg3, var15.field1476, arg9, arg0);
			}
		} else if (arg7 == 9) {
			AVUWZCYT var30;
			if (var15.field1446 == -1 && var15.field1456 == null) {
				var30 = var15.method586(arg7, arg0, var10, var11, var12, var13, -1);
			} else {
				var30 = new UYLEXXVQ(var11, var13, var15.field1446, arg2, var12, arg0, var10, true, arg7);
			}

			arg4.method416(1, arg3, arg9, var17, var30, 1, 0, arg1, var16, var14);

			if (var15.field1450) {
				arg6.method303(arg9, arg0, var15.field1488, var15.field1476, arg3, var15.field1472);
			}
		} else {
			if (var15.field1443) {
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

			if (arg7 == 4) {
				AVUWZCYT var35;
				if (var15.field1446 == -1 && var15.field1456 == null) {
					var35 = var15.method586(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new UYLEXXVQ(var11, var13, var15.field1446, arg2, var12, 0, var10, true, 4);
				}

				arg4.method415(arg3, var16, var14, arg1, arg9, 0, field780[arg0], 0, arg0 * 512, var17, var35);
			} else if (arg7 == 5) {
				int var36 = 16;
				int var37 = arg4.method432(arg1, arg9, arg3);
				if (var37 > 0) {
					var36 = ZXOFSHYE.method588(var37 >> 14 & 0x7FFF).field1477;
				}

				AVUWZCYT var38;
				if (var15.field1446 == -1 && var15.field1456 == null) {
					var38 = var15.method586(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new UYLEXXVQ(var11, var13, var15.field1446, arg2, var12, 0, var10, true, 4);
				}

				arg4.method415(arg3, var16, var14, arg1, arg9, field767[arg0] * var36, field780[arg0], field782[arg0] * var36, arg0 * 512, var17, var38);
			} else if (arg7 == 6) {
				AVUWZCYT var39;
				if (var15.field1446 == -1 && var15.field1456 == null) {
					var39 = var15.method586(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new UYLEXXVQ(var11, var13, var15.field1446, arg2, var12, 0, var10, true, 4);
				}

				arg4.method415(arg3, var16, var14, arg1, arg9, 0, 256, 0, arg0, var17, var39);
			} else if (arg7 == 7) {
				AVUWZCYT var40;
				if (var15.field1446 == -1 && var15.field1456 == null) {
					var40 = var15.method586(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new UYLEXXVQ(var11, var13, var15.field1446, arg2, var12, 0, var10, true, 4);
				}

				arg4.method415(arg3, var16, var14, arg1, arg9, 0, 512, 0, arg0, var17, var40);
			} else if (arg7 == 8) {
				AVUWZCYT var41;
				if (var15.field1446 == -1 && var15.field1456 == null) {
					var41 = var15.method586(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new UYLEXXVQ(var11, var13, var15.field1446, arg2, var12, 0, var10, true, 4);
				}

				arg4.method415(arg3, var16, var14, arg1, arg9, 0, 768, 0, arg0, var17, var41);
			}
		}
	}

	@ObfuscatedName("MPWDIIUH.a(I[BIIIIIII[LMPYOQJPZ;)V")
	public final void method291(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, MPYOQJPZ[] arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg5 + var10 > 0 && arg5 + var10 < 103 && arg2 + var11 > 0 && arg2 + var11 < 103) {
					arg8[arg0].field795[arg5 + var10][arg2 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		MQZHAILV var12 = new MQZHAILV(arg1);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg3 == var13 && var14 >= arg6 && var14 < arg6 + 8 && var15 >= arg4 && var15 < arg4 + 8) {
						method283(arg7, arg2 + DDJBHEGS.method180(var15 & 0x7, var14 & 0x7, arg7), 0, 0, var12, arg5 + DDJBHEGS.method179(var15 & 0x7, arg7, var14 & 0x7), arg0);
					} else {
						method283(0, -1, 0, 0, var12, -1, 0);
					}
				}
			}
		}
	}

	public MPWDIIUH(int[][][] arg0, int arg1, int arg2, byte[][][] arg3) {
		field783 = 99;
		field784 = arg2;
		field785 = arg1;
		field766 = arg0;
		field789 = arg3;
		field788 = new byte[4][field784][field785];
		field779 = new byte[4][field784][field785];
		field771 = new byte[4][field784][field785];
		field768 = new byte[4][field784][field785];
		field770 = new int[4][field784 + 1][field785 + 1];
		field772 = new byte[4][field784 + 1][field785 + 1];
		field769 = new int[field784 + 1][field785 + 1];
		field774 = new int[field785];
		field775 = new int[field785];
		field776 = new int[field785];
		field777 = new int[field785];
		field778 = new int[field785];
	}

	@ObfuscatedName("MPWDIIUH.a(IILMPYOQJPZ;LRGNQYESN;IIIII)V")
	public final void method292(int arg0, int arg1, MPYOQJPZ arg2, RGNQYESN arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field790 && (field789[0][arg4][arg0] & 0x2) == 0) {
			if ((field789[arg1][arg4][arg0] & 0x10) != 0) {
				return;
			}

			if (method294(arg1, arg0, arg4) != field781) {
				return;
			}
		}

		if (arg1 < field783) {
			field783 = arg1;
		}

		int var9 = field766[arg1][arg4][arg0];
		int var10 = field766[arg1][arg4 + 1][arg0];
		int var11 = field766[arg1][arg4 + 1][arg0 + 1];
		int var12 = field766[arg1][arg4][arg0 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		ZXOFSHYE var14 = ZXOFSHYE.method588(arg7);
		int var15 = (arg7 << 14) + (arg0 << 7) + arg4 + 0x40000000;
		if (!var14.field1448) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg6 << 6) + arg5);
		if (arg5 == 22) {
			if (!field790 || var14.field1448 || var14.field1475) {
				AVUWZCYT var17;
				if (var14.field1446 == -1 && var14.field1456 == null) {
					var17 = var14.method586(22, arg6, var9, var10, var11, var12, -1);
				} else {
					var17 = new UYLEXXVQ(var10, var12, var14.field1446, arg7, var11, arg6, var9, true, 22);
				}

				arg3.method412(arg0, var13, var17, var16, arg1, var15, arg4);

				if (var14.field1450 && var14.field1448 && arg2 != null) {
					arg2.method304(arg4, arg0);
				}
			}
		} else if (arg5 == 10 || arg5 == 11) {
			AVUWZCYT var18;
			if (var14.field1446 == -1 && var14.field1456 == null) {
				var18 = var14.method586(10, arg6, var9, var10, var11, var12, -1);
			} else {
				var18 = new UYLEXXVQ(var10, var12, var14.field1446, arg7, var11, arg6, var9, true, 10);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg5 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg6 == 1 || arg6 == 3) {
					var20 = var14.field1488;
					var21 = var14.field1472;
				} else {
					var20 = var14.field1472;
					var21 = var14.field1488;
				}

				if (arg3.method416(var20, arg0, arg4, var16, var18, var21, var19, arg1, var15, var13) && var14.field1453) {
					YYHPBDED var22;
					if (var18 instanceof YYHPBDED) {
						var22 = (YYHPBDED) var18;
					} else {
						var22 = var14.method586(10, arg6, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field1369 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field772[arg1][arg4 + var23][arg0 + var24]) {
									field772[arg1][arg4 + var23][arg0 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field1450 && arg2 != null) {
				arg2.method303(arg4, arg6, var14.field1488, var14.field1476, arg0, var14.field1472);
			}
		} else if (arg5 >= 12) {
			AVUWZCYT var26;
			if (var14.field1446 == -1 && var14.field1456 == null) {
				var26 = var14.method586(arg5, arg6, var9, var10, var11, var12, -1);
			} else {
				var26 = new UYLEXXVQ(var10, var12, var14.field1446, arg7, var11, arg6, var9, true, arg5);
			}

			arg3.method416(1, arg0, arg4, var16, var26, 1, 0, arg1, var15, var13);

			if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg1 > 0) {
				field770[arg1][arg4][arg0] |= 0x924;
			}

			if (var14.field1450 && arg2 != null) {
				arg2.method303(arg4, arg6, var14.field1488, var14.field1476, arg0, var14.field1472);
			}
		} else if (arg5 == 0) {
			AVUWZCYT var27;
			if (var14.field1446 == -1 && var14.field1456 == null) {
				var27 = var14.method586(0, arg6, var9, var10, var11, var12, -1);
			} else {
				var27 = new UYLEXXVQ(var10, var12, var14.field1446, arg7, var11, arg6, var9, true, 0);
			}

			arg3.method414(0, var15, arg1, field780[arg6], arg0, var16, arg4, var27, var13, null);

			if (arg6 == 0) {
				if (var14.field1453) {
					field772[arg1][arg4][arg0] = 50;
					field772[arg1][arg4][arg0 + 1] = 50;
				}

				if (var14.field1447) {
					field770[arg1][arg4][arg0] |= 0x249;
				}
			} else if (arg6 == 1) {
				if (var14.field1453) {
					field772[arg1][arg4][arg0 + 1] = 50;
					field772[arg1][arg4 + 1][arg0 + 1] = 50;
				}

				if (var14.field1447) {
					field770[arg1][arg4][arg0 + 1] |= 0x492;
				}
			} else if (arg6 == 2) {
				if (var14.field1453) {
					field772[arg1][arg4 + 1][arg0] = 50;
					field772[arg1][arg4 + 1][arg0 + 1] = 50;
				}

				if (var14.field1447) {
					field770[arg1][arg4 + 1][arg0] |= 0x249;
				}
			} else if (arg6 == 3) {
				if (var14.field1453) {
					field772[arg1][arg4][arg0] = 50;
					field772[arg1][arg4 + 1][arg0] = 50;
				}

				if (var14.field1447) {
					field770[arg1][arg4][arg0] |= 0x492;
				}
			}

			if (var14.field1450 && arg2 != null) {
				arg2.method302(arg5, arg0, var14.field1476, arg4, arg6);
			}

			if (var14.field1477 != 16) {
				arg3.method422(arg0, arg4, arg1, var14.field1477);
			}
		} else if (arg5 == 1) {
			AVUWZCYT var28;
			if (var14.field1446 == -1 && var14.field1456 == null) {
				var28 = var14.method586(1, arg6, var9, var10, var11, var12, -1);
			} else {
				var28 = new UYLEXXVQ(var10, var12, var14.field1446, arg7, var11, arg6, var9, true, 1);
			}

			arg3.method414(0, var15, arg1, field786[arg6], arg0, var16, arg4, var28, var13, null);

			if (var14.field1453) {
				if (arg6 == 0) {
					field772[arg1][arg4][arg0 + 1] = 50;
				} else if (arg6 == 1) {
					field772[arg1][arg4 + 1][arg0 + 1] = 50;
				} else if (arg6 == 2) {
					field772[arg1][arg4 + 1][arg0] = 50;
				} else if (arg6 == 3) {
					field772[arg1][arg4][arg0] = 50;
				}
			}

			if (var14.field1450 && arg2 != null) {
				arg2.method302(arg5, arg0, var14.field1476, arg4, arg6);
			}
		} else if (arg5 == 2) {
			int var29 = arg6 + 1 & 0x3;
			AVUWZCYT var30;
			AVUWZCYT var31;
			if (var14.field1446 == -1 && var14.field1456 == null) {
				var30 = var14.method586(2, arg6 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method586(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new UYLEXXVQ(var10, var12, var14.field1446, arg7, var11, arg6 + 4, var9, true, 2);
				var31 = new UYLEXXVQ(var10, var12, var14.field1446, arg7, var11, var29, var9, true, 2);
			}

			arg3.method414(field780[var29], var15, arg1, field780[arg6], arg0, var16, arg4, var30, var13, var31);

			if (var14.field1447) {
				if (arg6 == 0) {
					field770[arg1][arg4][arg0] |= 0x249;
					field770[arg1][arg4][arg0 + 1] |= 0x492;
				} else if (arg6 == 1) {
					field770[arg1][arg4][arg0 + 1] |= 0x492;
					field770[arg1][arg4 + 1][arg0] |= 0x249;
				} else if (arg6 == 2) {
					field770[arg1][arg4 + 1][arg0] |= 0x249;
					field770[arg1][arg4][arg0] |= 0x492;
				} else if (arg6 == 3) {
					field770[arg1][arg4][arg0] |= 0x492;
					field770[arg1][arg4][arg0] |= 0x249;
				}
			}

			if (var14.field1450 && arg2 != null) {
				arg2.method302(arg5, arg0, var14.field1476, arg4, arg6);
			}

			if (var14.field1477 != 16) {
				arg3.method422(arg0, arg4, arg1, var14.field1477);
			}
		} else if (arg5 == 3) {
			AVUWZCYT var32;
			if (var14.field1446 == -1 && var14.field1456 == null) {
				var32 = var14.method586(3, arg6, var9, var10, var11, var12, -1);
			} else {
				var32 = new UYLEXXVQ(var10, var12, var14.field1446, arg7, var11, arg6, var9, true, 3);
			}

			arg3.method414(0, var15, arg1, field786[arg6], arg0, var16, arg4, var32, var13, null);

			if (var14.field1453) {
				if (arg6 == 0) {
					field772[arg1][arg4][arg0 + 1] = 50;
				} else if (arg6 == 1) {
					field772[arg1][arg4 + 1][arg0 + 1] = 50;
				} else if (arg6 == 2) {
					field772[arg1][arg4 + 1][arg0] = 50;
				} else if (arg6 == 3) {
					field772[arg1][arg4][arg0] = 50;
				}
			}

			if (var14.field1450 && arg2 != null) {
				arg2.method302(arg5, arg0, var14.field1476, arg4, arg6);
			}
		} else if (arg5 == 9) {
			AVUWZCYT var33;
			if (var14.field1446 == -1 && var14.field1456 == null) {
				var33 = var14.method586(arg5, arg6, var9, var10, var11, var12, -1);
			} else {
				var33 = new UYLEXXVQ(var10, var12, var14.field1446, arg7, var11, arg6, var9, true, arg5);
			}

			arg3.method416(1, arg0, arg4, var16, var33, 1, 0, arg1, var15, var13);

			if (var14.field1450 && arg2 != null) {
				arg2.method303(arg4, arg6, var14.field1488, var14.field1476, arg0, var14.field1472);
			}
		} else {
			if (var14.field1443) {
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
				AVUWZCYT var38;
				if (var14.field1446 == -1 && var14.field1456 == null) {
					var38 = var14.method586(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new UYLEXXVQ(var10, var12, var14.field1446, arg7, var11, 0, var9, true, 4);
				}

				arg3.method415(arg0, var15, var13, arg1, arg4, 0, field780[arg6], 0, arg6 * 512, var16, var38);
			} else if (arg5 == 5) {
				int var39 = 16;
				int var40 = arg3.method432(arg1, arg4, arg0);
				if (var40 > 0) {
					var39 = ZXOFSHYE.method588(var40 >> 14 & 0x7FFF).field1477;
				}

				AVUWZCYT var41;
				if (var14.field1446 == -1 && var14.field1456 == null) {
					var41 = var14.method586(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new UYLEXXVQ(var10, var12, var14.field1446, arg7, var11, 0, var9, true, 4);
				}

				arg3.method415(arg0, var15, var13, arg1, arg4, field767[arg6] * var39, field780[arg6], field782[arg6] * var39, arg6 * 512, var16, var41);
			} else if (arg5 == 6) {
				AVUWZCYT var42;
				if (var14.field1446 == -1 && var14.field1456 == null) {
					var42 = var14.method586(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new UYLEXXVQ(var10, var12, var14.field1446, arg7, var11, 0, var9, true, 4);
				}

				arg3.method415(arg0, var15, var13, arg1, arg4, 0, 256, 0, arg6, var16, var42);
			} else if (arg5 == 7) {
				AVUWZCYT var43;
				if (var14.field1446 == -1 && var14.field1456 == null) {
					var43 = var14.method586(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new UYLEXXVQ(var10, var12, var14.field1446, arg7, var11, 0, var9, true, 4);
				}

				arg3.method415(arg0, var15, var13, arg1, arg4, 0, 512, 0, arg6, var16, var43);
			} else if (arg5 == 8) {
				AVUWZCYT var44;
				if (var14.field1446 == -1 && var14.field1456 == null) {
					var44 = var14.method586(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new UYLEXXVQ(var10, var12, var14.field1446, arg7, var11, 0, var9, true, 4);
				}

				arg3.method415(arg0, var15, var13, arg1, arg4, 0, 768, 0, arg6, var16, var44);
			}
		}
	}

	@ObfuscatedName("MPWDIIUH.a([BIIIILRGNQYESN;IIZI[LMPYOQJPZ;)V")
	public final void method293(byte[] arg0, int arg1, int arg2, int arg3, int arg4, RGNQYESN arg5, int arg6, int arg7, int arg8, MPYOQJPZ[] arg9) {
		MQZHAILV var11 = new MQZHAILV(arg0);
		int var12 = -1;
		while (true) {
			int var13 = var11.method339();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method339();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method325();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg4 == var18 && var17 >= arg6 && var17 < arg6 + 8 && var16 >= arg1 && var16 < arg1 + 8) {
					ZXOFSHYE var22 = ZXOFSHYE.method588(var12);
					int var23 = arg8 + DDJBHEGS.method181(arg2, var22.field1472, var16 & 0x7, var17 & 0x7, var22.field1488);
					int var24 = arg3 + DDJBHEGS.method182(var22.field1488, var17 & 0x7, var16 & 0x7, var22.field1472, arg2);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg7;
						if ((field789[1][var23][var24] & 0x2) == 2) {
							var25 = arg7 - 1;
						}

						MPYOQJPZ var26 = null;
						if (var25 >= 0) {
							var26 = arg9[var25];
						}

						method292(var24, arg7, var26, arg5, var23, var20, arg2 + var21 & 0x3, var12);
					}
				}
			}
		}
	}

	@ObfuscatedName("MPWDIIUH.a(IIII)I")
	public int method294(int arg0, int arg1, int arg2) {
		if ((field789[arg0][arg2][arg1] & 0x8) != 0) {
			return 0;
		}

		if (arg0 > 0 && (field789[1][arg2][arg1] & 0x2) != 0) {
			return arg0 - 1;
		}

		return arg0;
	}

	@ObfuscatedName("MPWDIIUH.d(II)I")
	public static final int method295(int arg0, int arg1) {
		int var2 = method288(arg0 - 1, arg1 - 1) + method288(arg0 + 1, arg1 - 1) + method288(arg0 - 1, arg1 + 1) + method288(arg0 + 1, arg1 + 1);
		int var3 = method288(arg0 - 1, arg1) + method288(arg0 + 1, arg1) + method288(arg0, arg1 - 1) + method288(arg0, arg1 + 1);
		int var4 = method288(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("MPWDIIUH.a([BIBI[LMPYOQJPZ;LRGNQYESN;)V")
	public final void method296(byte[] arg0, int arg1, int arg2, MPYOQJPZ[] arg3, RGNQYESN arg4) {
		MQZHAILV var6 = new MQZHAILV(arg0);
		int var7 = -1;
		while (true) {
			int var8 = var6.method339();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method339();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method325();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg2 + var12;
				int var18 = arg1 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field789[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					MPYOQJPZ var20 = null;
					if (var19 >= 0) {
						var20 = arg3[var19];
					}

					method292(var18, var13, var20, arg4, var17, var15, var16, var7);
				}
			}
		}
	}

	@ObfuscatedName("MPWDIIUH.a(IIIII)V")
	public final void method297(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg3; var5 <= arg0 + arg3; var5++) {
			for (int var6 = arg2; var6 <= arg1 + arg2; var6++) {
				if (var6 >= 0 && var6 < field784 && var5 >= 0 && var5 < field785) {
					field772[0][var6][var5] = 127;

					if (arg2 == var6 && var6 > 0) {
						field766[0][var6][var5] = field766[0][var6 - 1][var5];
					}

					if (arg1 + arg2 == var6 && var6 < field784 - 1) {
						field766[0][var6][var5] = field766[0][var6 + 1][var5];
					}

					if (arg3 == var5 && var5 > 0) {
						field766[0][var6][var5] = field766[0][var6][var5 - 1];
					}

					if (arg0 + arg3 == var5 && var5 < field785 - 1) {
						field766[0][var6][var5] = field766[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("MPWDIIUH.e(II)I")
	public final int method298(int arg0, int arg1) {
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

	@ObfuscatedName("MPWDIIUH.b(IIII)I")
	public static final int method299(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - QSZFQZON.field892[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("MPWDIIUH.a([LMPYOQJPZ;ILRGNQYESN;)V")
	public final void method300(MPYOQJPZ[] arg0, RGNQYESN arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field789[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field789[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg0[var6].method304(var4, var5);
						}
					}
				}
			}
		}

		field773 += (int) (Math.random() * 5.0D) - 2;
		if (field773 < -8) {
			field773 = -8;
		}

		if (field773 > 8) {
			field773 = 8;
		}

		field787 += (int) (Math.random() * 5.0D) - 2;
		if (field787 < -16) {
			field787 = -16;
		}

		if (field787 > 16) {
			field787 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field772[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field785 - 1; var16++) {
				for (int var17 = 1; var17 < field784 - 1; var17++) {
					int var18 = field766[var7][var17 + 1][var16] - field766[var7][var17 - 1][var16];
					int var19 = field766[var7][var17][var16 + 1] - field766[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field769[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field785; var26++) {
				field774[var26] = 0;
				field775[var26] = 0;
				field776[var26] = 0;
				field777[var26] = 0;
				field778[var26] = 0;
			}

			for (int var27 = -5; var27 < field784 + 5; var27++) {
				for (int var28 = 0; var28 < field785; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field784) {
						int var30 = field788[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							BXKOBEWK var31 = BXKOBEWK.field4[var30 - 1];
							field774[var28] += var31.field13;
							field775[var28] += var31.field11;
							field776[var28] += var31.field12;
							field777[var28] += var31.field14;
							field778[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field784) {
						int var33 = field788[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							BXKOBEWK var34 = BXKOBEWK.field4[var33 - 1];
							field774[var28] -= var34.field13;
							field775[var28] -= var34.field11;
							field776[var28] -= var34.field12;
							field777[var28] -= var34.field14;
							field778[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field784 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field785 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field785) {
							var35 += field774[var41];
							var36 += field775[var41];
							var37 += field776[var41];
							var38 += field777[var41];
							var39 += field778[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field785) {
							var35 -= field774[var42];
							var36 -= field775[var42];
							var37 -= field776[var42];
							var38 -= field777[var42];
							var39 -= field778[var42];
						}

						if (var40 >= 1 && var40 < field785 - 1 && (!field790 || (field789[0][var27][var40] & 0x2) != 0 || (field789[var7][var27][var40] & 0x10) == 0 && method294(var7, var40, var27) == field781)) {
							if (var7 < field783) {
								field783 = var7;
							}

							int var43 = field788[var7][var27][var40] & 0xFF;
							int var44 = field779[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field766[var7][var27][var40];
								int var46 = field766[var7][var27 + 1][var40];
								int var47 = field766[var7][var27 + 1][var40 + 1];
								int var48 = field766[var7][var27][var40 + 1];
								int var49 = field769[var27][var40];
								int var50 = field769[var27 + 1][var40];
								int var51 = field769[var27 + 1][var40 + 1];
								int var52 = field769[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method286(var55, var56, var57);
									var55 = field773 + var55 & 0xFF;
									var57 += field787;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method286(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field771[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !BXKOBEWK.field4[var44 - 1].field9) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field770[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = QSZFQZON.field903[method284(var54, 96)];
								}

								if (var44 == 0) {
									arg1.method411(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method284(var53, var49), method284(var53, var50), method284(var53, var51), method284(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field771[var7][var27][var40] + 1;
									byte var61 = field768[var7][var27][var40];
									BXKOBEWK var62 = BXKOBEWK.field4[var44 - 1];
									int var63 = var62.field7;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = QSZFQZON.method391(var63);
										var65 = -1;
									} else if (var62.field6 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method286(var62.field10, var62.field11, var62.field12);
										var64 = QSZFQZON.field903[method298(var62.field15, 96)];
									}

									arg1.method411(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method284(var53, var49), method284(var53, var50), method284(var53, var51), method284(var53, var52), method298(var65, var49), method298(var65, var50), method298(var65, var51), method298(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field785 - 1; var66++) {
				for (int var67 = 1; var67 < field784 - 1; var67++) {
					arg1.method410(var7, var67, var66, method294(var7, var66, var67));
				}
			}
		}

		arg1.method437(768, 64, -50, -50, -10);

		for (int var68 = 0; var68 < field784; var68++) {
			for (int var69 = 0; var69 < field785; var69++) {
				if ((field789[1][var68][var69] & 0x2) == 2) {
					arg1.method408(var68, var69);
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
				for (int var75 = 0; var75 <= field785; var75++) {
					for (int var76 = 0; var76 <= field784; var76++) {
						if ((field770[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field770[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field785 && (field770[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field770[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field770[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field766[var80][var76][var77] - var84;
								int var86 = field766[var79][var76][var77];
								RGNQYESN.method409(var85, var76 * 128, var73, var86, var76 * 128, 1, var78 * 128 + 128, var77 * 128);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field770[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field770[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field770[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field784 && (field770[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field770[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field770[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field766[var92][var89][var75] - var96;
								int var98 = field766[var91][var89][var75];
								RGNQYESN.method409(var97, var90 * 128 + 128, var73, var98, var89 * 128, 2, var75 * 128, var75 * 128);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field770[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field770[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field770[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field785 && (field770[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field770[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field784) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field770[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field766[var74][var101][var103];
								RGNQYESN.method409(var107, var102 * 128 + 128, var73, var107, var101 * 128, 4, var104 * 128 + 128, var103 * 128);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field770[var74][var108][var109] &= ~var72;
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
