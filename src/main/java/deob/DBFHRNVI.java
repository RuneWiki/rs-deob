package deob;

@ObfuscatedName("DBFHRNVI")
public final class DBFHRNVI {

	@ObfuscatedName("DBFHRNVI.e")
	public int field569;

	@ObfuscatedName("DBFHRNVI.f")
	public int field570;

	@ObfuscatedName("DBFHRNVI.A")
	public int[][][] field583;

	@ObfuscatedName("DBFHRNVI.y")
	public byte[][][] field582;

	@ObfuscatedName("DBFHRNVI.l")
	public byte[][][] field573;

	@ObfuscatedName("DBFHRNVI.a")
	public byte[][][] field565;

	@ObfuscatedName("DBFHRNVI.s")
	public byte[][][] field578;

	@ObfuscatedName("DBFHRNVI.p")
	public byte[][][] field576;

	@ObfuscatedName("DBFHRNVI.b")
	public int[][][] field566;

	@ObfuscatedName("DBFHRNVI.h")
	public byte[][][] field571;

	@ObfuscatedName("DBFHRNVI.x")
	public int[][] field581;

	@ObfuscatedName("DBFHRNVI.C")
	public int[] field585;

	@ObfuscatedName("DBFHRNVI.D")
	public int[] field586;

	@ObfuscatedName("DBFHRNVI.E")
	public int[] field587;

	@ObfuscatedName("DBFHRNVI.F")
	public int[] field588;

	@ObfuscatedName("DBFHRNVI.G")
	public int[] field589;

	@ObfuscatedName("DBFHRNVI.c")
	public static boolean field567 = true;

	@ObfuscatedName("DBFHRNVI.d")
	public static int field568 = 99;

	@ObfuscatedName("DBFHRNVI.i")
	public static final int[] field572 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("DBFHRNVI.m")
	public static final int[] field574 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("DBFHRNVI.v")
	public static final int[] field579 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("DBFHRNVI.B")
	public static final int[] field584 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("DBFHRNVI.n")
	public static int field575 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("DBFHRNVI.r")
	public static int field577 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("DBFHRNVI.w")
	public static int field580;

	@ObfuscatedName("DBFHRNVI.a(IBI)Z")
	public static final boolean method164(int arg0, int arg1) {
		ELXAMLNA var2 = ELXAMLNA.method196(arg0);

		if (arg1 == 11) {
			arg1 = 10;
		}

		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}

		return var2.method199(arg1);
	}

	@ObfuscatedName("DBFHRNVI.a(IIIII)V")
	public final void method165(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg3; var5 <= arg1 + arg3; var5++) {
			for (int var6 = arg2; var6 <= arg0 + arg2; var6++) {
				if (var6 >= 0 && var6 < field569 && var5 >= 0 && var5 < field570) {
					field571[0][var6][var5] = 127;

					if (arg2 == var6 && var6 > 0) {
						field583[0][var6][var5] = field583[0][var6 - 1][var5];
					}

					if (arg0 + arg2 == var6 && var6 < field569 - 1) {
						field583[0][var6][var5] = field583[0][var6 + 1][var5];
					}

					if (arg3 == var5 && var5 > 0) {
						field583[0][var6][var5] = field583[0][var6][var5 - 1];
					}

					if (arg1 + arg3 == var5 && var5 < field570 - 1) {
						field583[0][var6][var5] = field583[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("DBFHRNVI.a(IIIIIIILPQBRPYKE;)V")
	public final void method166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, PQBRPYKE arg6) {
		if (arg1 >= 0 && arg1 < 104 && arg3 >= 0 && arg3 < 104) {
			field582[arg4][arg1][arg3] = 0;
			while (true) {
				int var8 = arg6.method340();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg6.method340();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg4 == 0) {
						field583[0][arg1][arg3] = -var9 * 8;
						return;
					}

					field583[arg4][arg1][arg3] = field583[arg4 - 1][arg1][arg3] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field565[arg4][arg1][arg3] = arg6.method341();
					field578[arg4][arg1][arg3] = (byte) ((var8 - 2) / 4);
					field576[arg4][arg1][arg3] = (byte) (var8 + arg0 - 2 & 0x3);
				} else if (var8 <= 81) {
					field582[arg4][arg1][arg3] = (byte) (var8 - 49);
				} else {
					field573[arg4][arg1][arg3] = (byte) (var8 - 81);
				}
			}

			if (arg4 == 0) {
				field583[0][arg1][arg3] = -method167(arg1 + arg5 + 932731, arg3 + 556238 + arg2) * 8;
			} else {
				field583[arg4][arg1][arg3] = field583[arg4 - 1][arg1][arg3] - 240;
			}
		} else {
			while (true) {
				int var10 = arg6.method340();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg6.method340();
					return;
				}

				if (var10 <= 49) {
					arg6.method340();
				}
			}
		}
	}

	@ObfuscatedName("DBFHRNVI.a(II)I")
	public static final int method167(int arg0, int arg1) {
		int var2 = method174(arg0 + 45365, arg1 + 91923, 4) + (method174(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method174(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("DBFHRNVI.a([BIIB[LEOSBSGLH;II)V")
	public final void method168(byte[] arg0, int arg1, int arg2, EOSBSGLH[] arg3, int arg4, int arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg2 + var8 > 0 && arg2 + var8 < 103 && arg4 + var9 > 0 && arg4 + var9 < 103) {
						arg3[var7].field678[arg2 + var8][arg4 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		PQBRPYKE var10 = new PQBRPYKE(arg0);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method166(0, arg2 + var12, arg5, arg4 + var13, var11, arg1, var10);
				}
			}
		}
	}

	@ObfuscatedName("DBFHRNVI.a([[[IIIILEOSBSGLH;IIIIILUMNOCQQA;)V")
	public static final void method169(int[][][] arg0, int arg1, int arg2, int arg3, EOSBSGLH arg4, int arg5, int arg6, int arg7, int arg8, UMNOCQQA arg9) {
		int var10 = arg0[arg2][arg3][arg5];
		int var11 = arg0[arg2][arg3 + 1][arg5];
		int var12 = arg0[arg2][arg3 + 1][arg5 + 1];
		int var13 = arg0[arg2][arg3][arg5 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		ELXAMLNA var15 = ELXAMLNA.method196(arg6);
		int var16 = (arg6 << 14) + (arg5 << 7) + arg3 + 0x40000000;
		if (!var15.field672) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg7 << 6) + arg8);
		if (arg8 == 22) {
			GHXFOOXU var18;
			if (var15.field636 == -1 && var15.field664 == null) {
				var18 = var15.method201(22, arg7, var10, var11, var12, var13, -1);
			} else {
				var18 = new DZGXSGHB(var15.field636, arg6, arg7, var11, var12, var10, 22, true, var13);
			}

			arg9.method477(var16, var18, arg5, arg3, arg1, var17, var14);

			if (var15.field637 && var15.field672) {
				arg4.method205(arg3, arg5);
			}
		} else if (arg8 == 10 || arg8 == 11) {
			GHXFOOXU var19;
			if (var15.field636 == -1 && var15.field664 == null) {
				var19 = var15.method201(10, arg7, var10, var11, var12, var13, -1);
			} else {
				var19 = new DZGXSGHB(var15.field636, arg6, arg7, var11, var12, var10, 10, true, var13);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg8 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg7 == 1 || arg7 == 3) {
					var21 = var15.field661;
					var22 = var15.field631;
				} else {
					var21 = var15.field631;
					var22 = var15.field661;
				}

				arg9.method481(arg3, var21, var16, var19, var20, var17, var22, arg5, var14, arg1);
			}

			if (var15.field637) {
				arg4.method204(var15.field631, arg5, var15.field661, arg3, var15.field635, arg7);
			}
		} else if (arg8 >= 12) {
			GHXFOOXU var23;
			if (var15.field636 == -1 && var15.field664 == null) {
				var23 = var15.method201(arg8, arg7, var10, var11, var12, var13, -1);
			} else {
				var23 = new DZGXSGHB(var15.field636, arg6, arg7, var11, var12, var10, arg8, true, var13);
			}

			arg9.method481(arg3, 1, var16, var23, 0, var17, 1, arg5, var14, arg1);

			if (var15.field637) {
				arg4.method204(var15.field631, arg5, var15.field661, arg3, var15.field635, arg7);
			}
		} else if (arg8 == 0) {
			GHXFOOXU var24;
			if (var15.field636 == -1 && var15.field664 == null) {
				var24 = var15.method201(0, arg7, var10, var11, var12, var13, -1);
			} else {
				var24 = new DZGXSGHB(var15.field636, arg6, arg7, var11, var12, var10, 0, true, var13);
			}

			arg9.method479(var14, null, arg5, field572[arg7], arg3, 0, arg1, var16, var24, var17);

			if (var15.field637) {
				arg4.method203(var15.field635, arg3, arg7, arg5, arg8);
			}
		} else if (arg8 == 1) {
			GHXFOOXU var25;
			if (var15.field636 == -1 && var15.field664 == null) {
				var25 = var15.method201(1, arg7, var10, var11, var12, var13, -1);
			} else {
				var25 = new DZGXSGHB(var15.field636, arg6, arg7, var11, var12, var10, 1, true, var13);
			}

			arg9.method479(var14, null, arg5, field579[arg7], arg3, 0, arg1, var16, var25, var17);

			if (var15.field637) {
				arg4.method203(var15.field635, arg3, arg7, arg5, arg8);
			}
		} else if (arg8 == 2) {
			int var26 = arg7 + 1 & 0x3;
			GHXFOOXU var27;
			GHXFOOXU var28;
			if (var15.field636 == -1 && var15.field664 == null) {
				var27 = var15.method201(2, arg7 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method201(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new DZGXSGHB(var15.field636, arg6, arg7 + 4, var11, var12, var10, 2, true, var13);
				var28 = new DZGXSGHB(var15.field636, arg6, var26, var11, var12, var10, 2, true, var13);
			}

			arg9.method479(var14, var28, arg5, field572[arg7], arg3, field572[var26], arg1, var16, var27, var17);

			if (var15.field637) {
				arg4.method203(var15.field635, arg3, arg7, arg5, arg8);
			}
		} else if (arg8 == 3) {
			GHXFOOXU var29;
			if (var15.field636 == -1 && var15.field664 == null) {
				var29 = var15.method201(3, arg7, var10, var11, var12, var13, -1);
			} else {
				var29 = new DZGXSGHB(var15.field636, arg6, arg7, var11, var12, var10, 3, true, var13);
			}

			arg9.method479(var14, null, arg5, field579[arg7], arg3, 0, arg1, var16, var29, var17);

			if (var15.field637) {
				arg4.method203(var15.field635, arg3, arg7, arg5, arg8);
			}
		} else if (arg8 == 9) {
			GHXFOOXU var30;
			if (var15.field636 == -1 && var15.field664 == null) {
				var30 = var15.method201(arg8, arg7, var10, var11, var12, var13, -1);
			} else {
				var30 = new DZGXSGHB(var15.field636, arg6, arg7, var11, var12, var10, arg8, true, var13);
			}

			arg9.method481(arg3, 1, var16, var30, 0, var17, 1, arg5, var14, arg1);

			if (var15.field637) {
				arg4.method204(var15.field631, arg5, var15.field661, arg3, var15.field635, arg7);
			}
		} else {
			if (var15.field658) {
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

			if (arg8 == 4) {
				GHXFOOXU var35;
				if (var15.field636 == -1 && var15.field664 == null) {
					var35 = var15.method201(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new DZGXSGHB(var15.field636, arg6, 0, var11, var12, var10, 4, true, var13);
				}

				arg9.method480(field572[arg7], 0, var16, var14, arg3, 0, var17, arg1, arg5, arg7 * 512, var35);
			} else if (arg8 == 5) {
				int var36 = 16;
				int var37 = arg9.method497(arg1, arg3, arg5);
				if (var37 > 0) {
					var36 = ELXAMLNA.method196(var37 >> 14 & 0x7FFF).field639;
				}

				GHXFOOXU var38;
				if (var15.field636 == -1 && var15.field664 == null) {
					var38 = var15.method201(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new DZGXSGHB(var15.field636, arg6, 0, var11, var12, var10, 4, true, var13);
				}

				arg9.method480(field572[arg7], field574[arg7] * var36, var16, var14, arg3, field584[arg7] * var36, var17, arg1, arg5, arg7 * 512, var38);
			} else if (arg8 == 6) {
				GHXFOOXU var39;
				if (var15.field636 == -1 && var15.field664 == null) {
					var39 = var15.method201(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new DZGXSGHB(var15.field636, arg6, 0, var11, var12, var10, 4, true, var13);
				}

				arg9.method480(256, 0, var16, var14, arg3, 0, var17, arg1, arg5, arg7, var39);
			} else if (arg8 == 7) {
				GHXFOOXU var40;
				if (var15.field636 == -1 && var15.field664 == null) {
					var40 = var15.method201(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new DZGXSGHB(var15.field636, arg6, 0, var11, var12, var10, 4, true, var13);
				}

				arg9.method480(512, 0, var16, var14, arg3, 0, var17, arg1, arg5, arg7, var40);
			} else if (arg8 == 8) {
				GHXFOOXU var41;
				if (var15.field636 == -1 && var15.field664 == null) {
					var41 = var15.method201(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new DZGXSGHB(var15.field636, arg6, 0, var11, var12, var10, 4, true, var13);
				}

				arg9.method480(768, 0, var16, var14, arg3, 0, var17, arg1, arg5, arg7, var41);
			}
		}
	}

	@ObfuscatedName("DBFHRNVI.a(LUMNOCQQA;[LEOSBSGLH;[BIIB)V")
	public final void method170(UMNOCQQA arg0, EOSBSGLH[] arg1, byte[] arg2, int arg3, int arg4) {
		PQBRPYKE var6 = new PQBRPYKE(arg2);
		int var7 = -1;
		while (true) {
			int var8 = var6.method354();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method354();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method340();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg3 + var12;
				int var18 = arg4 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field582[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					EOSBSGLH var20 = null;
					if (var19 >= 0) {
						var20 = arg1[var19];
					}

					method171(arg0, var7, var18, var13, var17, var20, var15, var16);
				}
			}
		}
	}

	public DBFHRNVI(int arg0, byte[][][] arg1, int[][][] arg2, int arg3) {
		field568 = 99;
		field569 = arg0;
		field570 = arg3;
		field583 = arg2;
		field582 = arg1;
		field573 = new byte[4][field569][field570];
		field565 = new byte[4][field569][field570];
		field578 = new byte[4][field569][field570];
		field576 = new byte[4][field569][field570];
		field566 = new int[4][field569 + 1][field570 + 1];
		field571 = new byte[4][field569 + 1][field570 + 1];
		field581 = new int[field569 + 1][field570 + 1];
		field585 = new int[field570];
		field586 = new int[field570];
		field587 = new int[field570];
		field588 = new int[field570];
		field589 = new int[field570];
	}

	@ObfuscatedName("DBFHRNVI.a(LUMNOCQQA;IIIZILEOSBSGLH;II)V")
	public final void method171(UMNOCQQA arg0, int arg1, int arg2, int arg3, int arg4, EOSBSGLH arg5, int arg6, int arg7) {
		if (field567 && (field582[0][arg4][arg2] & 0x2) == 0) {
			if ((field582[arg3][arg4][arg2] & 0x10) != 0) {
				return;
			}

			if (method173(arg2, arg3, arg4) != field580) {
				return;
			}
		}

		if (arg3 < field568) {
			field568 = arg3;
		}

		int var9 = field583[arg3][arg4][arg2];
		int var10 = field583[arg3][arg4 + 1][arg2];
		int var11 = field583[arg3][arg4 + 1][arg2 + 1];
		int var12 = field583[arg3][arg4][arg2 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		ELXAMLNA var14 = ELXAMLNA.method196(arg1);
		int var15 = (arg1 << 14) + (arg2 << 7) + arg4 + 0x40000000;
		if (!var14.field672) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg7 << 6) + arg6);
		if (arg6 == 22) {
			if (!field567 || var14.field672 || var14.field666) {
				GHXFOOXU var17;
				if (var14.field636 == -1 && var14.field664 == null) {
					var17 = var14.method201(22, arg7, var9, var10, var11, var12, -1);
				} else {
					var17 = new DZGXSGHB(var14.field636, arg1, arg7, var10, var11, var9, 22, true, var12);
				}

				arg0.method477(var15, var17, arg2, arg4, arg3, var16, var13);

				if (var14.field637 && var14.field672 && arg5 != null) {
					arg5.method205(arg4, arg2);
				}
			}
		} else if (arg6 == 10 || arg6 == 11) {
			GHXFOOXU var18;
			if (var14.field636 == -1 && var14.field664 == null) {
				var18 = var14.method201(10, arg7, var9, var10, var11, var12, -1);
			} else {
				var18 = new DZGXSGHB(var14.field636, arg1, arg7, var10, var11, var9, 10, true, var12);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg6 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg7 == 1 || arg7 == 3) {
					var20 = var14.field661;
					var21 = var14.field631;
				} else {
					var20 = var14.field631;
					var21 = var14.field661;
				}

				if (arg0.method481(arg4, var20, var15, var18, var19, var16, var21, arg2, var13, arg3) && var14.field630) {
					FLXAIVEA var22;
					if (var18 instanceof FLXAIVEA) {
						var22 = (FLXAIVEA) var18;
					} else {
						var22 = var14.method201(10, arg7, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field708 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field571[arg3][arg4 + var23][arg2 + var24]) {
									field571[arg3][arg4 + var23][arg2 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field637 && arg5 != null) {
				arg5.method204(var14.field631, arg2, var14.field661, arg4, var14.field635, arg7);
			}
		} else if (arg6 >= 12) {
			GHXFOOXU var26;
			if (var14.field636 == -1 && var14.field664 == null) {
				var26 = var14.method201(arg6, arg7, var9, var10, var11, var12, -1);
			} else {
				var26 = new DZGXSGHB(var14.field636, arg1, arg7, var10, var11, var9, arg6, true, var12);
			}

			arg0.method481(arg4, 1, var15, var26, 0, var16, 1, arg2, var13, arg3);

			if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg3 > 0) {
				field566[arg3][arg4][arg2] |= 0x924;
			}

			if (var14.field637 && arg5 != null) {
				arg5.method204(var14.field631, arg2, var14.field661, arg4, var14.field635, arg7);
			}
		} else if (arg6 == 0) {
			GHXFOOXU var27;
			if (var14.field636 == -1 && var14.field664 == null) {
				var27 = var14.method201(0, arg7, var9, var10, var11, var12, -1);
			} else {
				var27 = new DZGXSGHB(var14.field636, arg1, arg7, var10, var11, var9, 0, true, var12);
			}

			arg0.method479(var13, null, arg2, field572[arg7], arg4, 0, arg3, var15, var27, var16);

			if (arg7 == 0) {
				if (var14.field630) {
					field571[arg3][arg4][arg2] = 50;
					field571[arg3][arg4][arg2 + 1] = 50;
				}

				if (var14.field641) {
					field566[arg3][arg4][arg2] |= 0x249;
				}
			} else if (arg7 == 1) {
				if (var14.field630) {
					field571[arg3][arg4][arg2 + 1] = 50;
					field571[arg3][arg4 + 1][arg2 + 1] = 50;
				}

				if (var14.field641) {
					field566[arg3][arg4][arg2 + 1] |= 0x492;
				}
			} else if (arg7 == 2) {
				if (var14.field630) {
					field571[arg3][arg4 + 1][arg2] = 50;
					field571[arg3][arg4 + 1][arg2 + 1] = 50;
				}

				if (var14.field641) {
					field566[arg3][arg4 + 1][arg2] |= 0x249;
				}
			} else if (arg7 == 3) {
				if (var14.field630) {
					field571[arg3][arg4][arg2] = 50;
					field571[arg3][arg4 + 1][arg2] = 50;
				}

				if (var14.field641) {
					field566[arg3][arg4][arg2] |= 0x492;
				}
			}

			if (var14.field637 && arg5 != null) {
				arg5.method203(var14.field635, arg4, arg7, arg2, arg6);
			}

			if (var14.field639 != 16) {
				arg0.method487(arg3, arg2, arg4, var14.field639);
			}
		} else if (arg6 == 1) {
			GHXFOOXU var28;
			if (var14.field636 == -1 && var14.field664 == null) {
				var28 = var14.method201(1, arg7, var9, var10, var11, var12, -1);
			} else {
				var28 = new DZGXSGHB(var14.field636, arg1, arg7, var10, var11, var9, 1, true, var12);
			}

			arg0.method479(var13, null, arg2, field579[arg7], arg4, 0, arg3, var15, var28, var16);

			if (var14.field630) {
				if (arg7 == 0) {
					field571[arg3][arg4][arg2 + 1] = 50;
				} else if (arg7 == 1) {
					field571[arg3][arg4 + 1][arg2 + 1] = 50;
				} else if (arg7 == 2) {
					field571[arg3][arg4 + 1][arg2] = 50;
				} else if (arg7 == 3) {
					field571[arg3][arg4][arg2] = 50;
				}
			}

			if (var14.field637 && arg5 != null) {
				arg5.method203(var14.field635, arg4, arg7, arg2, arg6);
			}
		} else if (arg6 == 2) {
			int var29 = arg7 + 1 & 0x3;
			GHXFOOXU var30;
			GHXFOOXU var31;
			if (var14.field636 == -1 && var14.field664 == null) {
				var30 = var14.method201(2, arg7 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method201(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new DZGXSGHB(var14.field636, arg1, arg7 + 4, var10, var11, var9, 2, true, var12);
				var31 = new DZGXSGHB(var14.field636, arg1, var29, var10, var11, var9, 2, true, var12);
			}

			arg0.method479(var13, var31, arg2, field572[arg7], arg4, field572[var29], arg3, var15, var30, var16);

			if (var14.field641) {
				if (arg7 == 0) {
					field566[arg3][arg4][arg2] |= 0x249;
					field566[arg3][arg4][arg2 + 1] |= 0x492;
				} else if (arg7 == 1) {
					field566[arg3][arg4][arg2 + 1] |= 0x492;
					field566[arg3][arg4 + 1][arg2] |= 0x249;
				} else if (arg7 == 2) {
					field566[arg3][arg4 + 1][arg2] |= 0x249;
					field566[arg3][arg4][arg2] |= 0x492;
				} else if (arg7 == 3) {
					field566[arg3][arg4][arg2] |= 0x492;
					field566[arg3][arg4][arg2] |= 0x249;
				}
			}

			if (var14.field637 && arg5 != null) {
				arg5.method203(var14.field635, arg4, arg7, arg2, arg6);
			}

			if (var14.field639 != 16) {
				arg0.method487(arg3, arg2, arg4, var14.field639);
			}
		} else if (arg6 == 3) {
			GHXFOOXU var32;
			if (var14.field636 == -1 && var14.field664 == null) {
				var32 = var14.method201(3, arg7, var9, var10, var11, var12, -1);
			} else {
				var32 = new DZGXSGHB(var14.field636, arg1, arg7, var10, var11, var9, 3, true, var12);
			}

			arg0.method479(var13, null, arg2, field579[arg7], arg4, 0, arg3, var15, var32, var16);

			if (var14.field630) {
				if (arg7 == 0) {
					field571[arg3][arg4][arg2 + 1] = 50;
				} else if (arg7 == 1) {
					field571[arg3][arg4 + 1][arg2 + 1] = 50;
				} else if (arg7 == 2) {
					field571[arg3][arg4 + 1][arg2] = 50;
				} else if (arg7 == 3) {
					field571[arg3][arg4][arg2] = 50;
				}
			}

			if (var14.field637 && arg5 != null) {
				arg5.method203(var14.field635, arg4, arg7, arg2, arg6);
			}
		} else if (arg6 == 9) {
			GHXFOOXU var33;
			if (var14.field636 == -1 && var14.field664 == null) {
				var33 = var14.method201(arg6, arg7, var9, var10, var11, var12, -1);
			} else {
				var33 = new DZGXSGHB(var14.field636, arg1, arg7, var10, var11, var9, arg6, true, var12);
			}

			arg0.method481(arg4, 1, var15, var33, 0, var16, 1, arg2, var13, arg3);

			if (var14.field637 && arg5 != null) {
				arg5.method204(var14.field631, arg2, var14.field661, arg4, var14.field635, arg7);
			}
		} else {
			if (var14.field658) {
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

			if (arg6 == 4) {
				GHXFOOXU var38;
				if (var14.field636 == -1 && var14.field664 == null) {
					var38 = var14.method201(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new DZGXSGHB(var14.field636, arg1, 0, var10, var11, var9, 4, true, var12);
				}

				arg0.method480(field572[arg7], 0, var15, var13, arg4, 0, var16, arg3, arg2, arg7 * 512, var38);
			} else if (arg6 == 5) {
				int var39 = 16;
				int var40 = arg0.method497(arg3, arg4, arg2);
				if (var40 > 0) {
					var39 = ELXAMLNA.method196(var40 >> 14 & 0x7FFF).field639;
				}

				GHXFOOXU var41;
				if (var14.field636 == -1 && var14.field664 == null) {
					var41 = var14.method201(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new DZGXSGHB(var14.field636, arg1, 0, var10, var11, var9, 4, true, var12);
				}

				arg0.method480(field572[arg7], field574[arg7] * var39, var15, var13, arg4, field584[arg7] * var39, var16, arg3, arg2, arg7 * 512, var41);
			} else if (arg6 == 6) {
				GHXFOOXU var42;
				if (var14.field636 == -1 && var14.field664 == null) {
					var42 = var14.method201(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new DZGXSGHB(var14.field636, arg1, 0, var10, var11, var9, 4, true, var12);
				}

				arg0.method480(256, 0, var15, var13, arg4, 0, var16, arg3, arg2, arg7, var42);
			} else if (arg6 == 7) {
				GHXFOOXU var43;
				if (var14.field636 == -1 && var14.field664 == null) {
					var43 = var14.method201(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new DZGXSGHB(var14.field636, arg1, 0, var10, var11, var9, 4, true, var12);
				}

				arg0.method480(512, 0, var15, var13, arg4, 0, var16, arg3, arg2, arg7, var43);
			} else if (arg6 == 8) {
				GHXFOOXU var44;
				if (var14.field636 == -1 && var14.field664 == null) {
					var44 = var14.method201(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new DZGXSGHB(var14.field636, arg1, 0, var10, var11, var9, 4, true, var12);
				}

				arg0.method480(768, 0, var15, var13, arg4, 0, var16, arg3, arg2, arg7, var44);
			}
		}
	}

	@ObfuscatedName("DBFHRNVI.a([LEOSBSGLH;IIIZIII[BI)V")
	public final void method172(EOSBSGLH[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg3 + var10 > 0 && arg3 + var10 < 103 && arg2 + var11 > 0 && arg2 + var11 < 103) {
					arg0[arg6].field678[arg3 + var10][arg2 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		PQBRPYKE var12 = new PQBRPYKE(arg7);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg5 == var13 && var14 >= arg1 && var14 < arg1 + 8 && var15 >= arg8 && var15 < arg8 + 8) {
						method166(arg4, arg3 + YPGIYMSL.method575(var14 & 0x7, var15 & 0x7, arg4), 0, arg2 + YPGIYMSL.method576(arg4, var15 & 0x7, var14 & 0x7), arg6, 0, var12);
					} else {
						method166(0, -1, 0, -1, 0, 0, var12);
					}
				}
			}
		}
	}

	@ObfuscatedName("DBFHRNVI.a(IIII)I")
	public int method173(int arg0, int arg1, int arg2) {
		if ((field582[arg1][arg2][arg0] & 0x8) != 0) {
			return 0;
		}

		if (arg1 > 0 && (field582[1][arg2][arg0] & 0x2) != 0) {
			return arg1 - 1;
		}

		return arg1;
	}

	@ObfuscatedName("DBFHRNVI.a(III)I")
	public static final int method174(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method176(var3, var5);
		int var8 = method176(var3 + 1, var5);
		int var9 = method176(var3, var5 + 1);
		int var10 = method176(var3 + 1, var5 + 1);
		int var11 = method180(var7, var8, var4, arg2);
		int var12 = method180(var9, var10, var4, arg2);
		return method180(var11, var12, var6, arg2);
	}

	@ObfuscatedName("DBFHRNVI.b(II)I")
	public static final int method175(int arg0, int arg1) {
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

	@ObfuscatedName("DBFHRNVI.c(II)I")
	public static final int method176(int arg0, int arg1) {
		int var2 = method182(arg0 - 1, arg1 - 1) + method182(arg0 + 1, arg1 - 1) + method182(arg0 - 1, arg1 + 1) + method182(arg0 + 1, arg1 + 1);
		int var3 = method182(arg0 - 1, arg1) + method182(arg0 + 1, arg1) + method182(arg0, arg1 - 1) + method182(arg0, arg1 + 1);
		int var4 = method182(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("DBFHRNVI.b(IIII)V")
	public final void method177(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 8; var4++) {
			for (int var5 = 0; var5 < 8; var5++) {
				field583[arg0][arg1 + var4][arg2 + var5] = 0;
			}
		}

		if (arg1 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				field583[arg0][arg1][arg2 + var6] = field583[arg0][arg1 - 1][arg2 + var6];
			}
		}

		if (arg2 > 0) {
			for (int var7 = 1; var7 < 8; var7++) {
				field583[arg0][arg1 + var7][arg2] = field583[arg0][arg1 + var7][arg2 - 1];
			}
		}

		if (arg1 > 0 && field583[arg0][arg1 - 1][arg2] != 0) {
			field583[arg0][arg1][arg2] = field583[arg0][arg1 - 1][arg2];
		} else if (arg2 > 0 && field583[arg0][arg1][arg2 - 1] != 0) {
			field583[arg0][arg1][arg2] = field583[arg0][arg1][arg2 - 1];
		} else if (arg1 > 0 && arg2 > 0 && field583[arg0][arg1 - 1][arg2 - 1] != 0) {
			field583[arg0][arg1][arg2] = field583[arg0][arg1 - 1][arg2 - 1];
		}
	}

	@ObfuscatedName("DBFHRNVI.a(IIB[B)Z")
	public static final boolean method178(int arg0, int arg1, byte[] arg2) {
		boolean var3 = true;
		PQBRPYKE var4 = new PQBRPYKE(arg2);
		int var5 = -1;
		while (true) {
			int var6 = var4.method354();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method354();
					if (var9 == 0) {
						break;
					}

					var4.method340();
				} else {
					int var10 = var4.method354();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method340() >> 2;
					int var14 = arg0 + var12;
					int var15 = arg1 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						ELXAMLNA var16 = ELXAMLNA.method196(var5);
						if (var13 != 22 || !field567 || var16.field672 || var16.field666) {
							var3 &= var16.method200();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("DBFHRNVI.a(LPQBRPYKE;ILQUPTMIEH;)V")
	public static final void method179(PQBRPYKE arg0, QUPTMIEH arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method354();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			ELXAMLNA var4 = ELXAMLNA.method196(var2);
			var4.method192(arg1);

			while (true) {
				int var5 = arg0.method354();
				if (var5 == 0) {
					break;
				}

				arg0.method340();
			}
		}
	}

	@ObfuscatedName("DBFHRNVI.c(IIII)I")
	public static final int method180(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - ORCVJTAI.field1069[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("DBFHRNVI.d(II)I")
	public final int method181(int arg0, int arg1) {
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

	@ObfuscatedName("DBFHRNVI.e(II)I")
	public static final int method182(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("DBFHRNVI.b(III)I")
	public final int method183(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("DBFHRNVI.a(IIILUMNOCQQA;I[LEOSBSGLH;III[BI)V")
	public final void method184(int arg0, int arg1, int arg2, UMNOCQQA arg3, EOSBSGLH[] arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9) {
		PQBRPYKE var11 = new PQBRPYKE(arg8);
		int var12 = -1;
		while (true) {
			int var13 = var11.method354();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method354();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method340();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg0 == var18 && var17 >= arg9 && var17 < arg9 + 8 && var16 >= arg2 && var16 < arg2 + 8) {
					ELXAMLNA var22 = ELXAMLNA.method196(var12);
					int var23 = arg1 + YPGIYMSL.method577(var17 & 0x7, var22.field631, arg7, var22.field661, var21, var16 & 0x7);
					int var24 = arg6 + YPGIYMSL.method578(arg7, var16 & 0x7, var22.field661, var17 & 0x7, var21, var22.field631);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg5;
						if ((field582[1][var23][var24] & 0x2) == 2) {
							var25 = arg5 - 1;
						}

						EOSBSGLH var26 = null;
						if (var25 >= 0) {
							var26 = arg4[var25];
						}

						method171(arg3, var12, var24, arg5, var23, var26, var20, arg7 + var21 & 0x3);
					}
				}
			}
		}
	}

	@ObfuscatedName("DBFHRNVI.a(I[LEOSBSGLH;LUMNOCQQA;)V")
	public final void method185(EOSBSGLH[] arg0, UMNOCQQA arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field582[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field582[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg0[var6].method205(var4, var5);
						}
					}
				}
			}
		}

		field577 += (int) (Math.random() * 5.0D) - 2;
		if (field577 < -8) {
			field577 = -8;
		}

		if (field577 > 8) {
			field577 = 8;
		}

		field575 += (int) (Math.random() * 5.0D) - 2;
		if (field575 < -16) {
			field575 = -16;
		}

		if (field575 > 16) {
			field575 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field571[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field570 - 1; var16++) {
				for (int var17 = 1; var17 < field569 - 1; var17++) {
					int var18 = field583[var7][var17 + 1][var16] - field583[var7][var17 - 1][var16];
					int var19 = field583[var7][var17][var16 + 1] - field583[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field581[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field570; var26++) {
				field585[var26] = 0;
				field586[var26] = 0;
				field587[var26] = 0;
				field588[var26] = 0;
				field589[var26] = 0;
			}

			for (int var27 = -5; var27 < field569 + 5; var27++) {
				for (int var28 = 0; var28 < field570; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field569) {
						int var30 = field573[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							LDSGOGGM var31 = LDSGOGGM.field1004[var30 - 1];
							field585[var28] += var31.field1013;
							field586[var28] += var31.field1011;
							field587[var28] += var31.field1012;
							field588[var28] += var31.field1014;
							field589[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field569) {
						int var33 = field573[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							LDSGOGGM var34 = LDSGOGGM.field1004[var33 - 1];
							field585[var28] -= var34.field1013;
							field586[var28] -= var34.field1011;
							field587[var28] -= var34.field1012;
							field588[var28] -= var34.field1014;
							field589[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field569 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field570 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field570) {
							var35 += field585[var41];
							var36 += field586[var41];
							var37 += field587[var41];
							var38 += field588[var41];
							var39 += field589[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field570) {
							var35 -= field585[var42];
							var36 -= field586[var42];
							var37 -= field587[var42];
							var38 -= field588[var42];
							var39 -= field589[var42];
						}

						if (var40 >= 1 && var40 < field570 - 1 && (!field567 || (field582[0][var27][var40] & 0x2) != 0 || (field582[var7][var27][var40] & 0x10) == 0 && method173(var40, var7, var27) == field580)) {
							if (var7 < field568) {
								field568 = var7;
							}

							int var43 = field573[var7][var27][var40] & 0xFF;
							int var44 = field565[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field583[var7][var27][var40];
								int var46 = field583[var7][var27 + 1][var40];
								int var47 = field583[var7][var27 + 1][var40 + 1];
								int var48 = field583[var7][var27][var40 + 1];
								int var49 = field581[var27][var40];
								int var50 = field581[var27 + 1][var40];
								int var51 = field581[var27 + 1][var40 + 1];
								int var52 = field581[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method183(var55, var56, var57);
									var55 = field577 + var55 & 0xFF;
									var57 += field575;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method183(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field578[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !LDSGOGGM.field1004[var44 - 1].field1009) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field566[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = ORCVJTAI.field1080[method175(var54, 96)];
								}

								if (var44 == 0) {
									arg1.method476(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method175(var53, var49), method175(var53, var50), method175(var53, var51), method175(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field578[var7][var27][var40] + 1;
									byte var61 = field576[var7][var27][var40];
									LDSGOGGM var62 = LDSGOGGM.field1004[var44 - 1];
									int var63 = var62.field1007;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = ORCVJTAI.method312(var63);
										var65 = -1;
									} else if (var62.field1006 == 0xFF00FF) {
										var65 = -2;
										var63 = -1;
										var64 = ORCVJTAI.field1080[method181(var62.field1015, 96)];
									} else {
										var65 = method183(var62.field1010, var62.field1011, var62.field1012);
										var64 = ORCVJTAI.field1080[method181(var62.field1015, 96)];
									}

									arg1.method476(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method175(var53, var49), method175(var53, var50), method175(var53, var51), method175(var53, var52), method181(var65, var49), method181(var65, var50), method181(var65, var51), method181(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field570 - 1; var66++) {
				for (int var67 = 1; var67 < field569 - 1; var67++) {
					arg1.method475(var7, var67, var66, method173(var66, var7, var67));
				}
			}
		}

		arg1.method502(-50, -50, -10);

		for (int var68 = 0; var68 < field569; var68++) {
			for (int var69 = 0; var69 < field570; var69++) {
				if ((field582[1][var68][var69] & 0x2) == 2) {
					arg1.method473(var68, var69);
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
				for (int var75 = 0; var75 <= field570; var75++) {
					for (int var76 = 0; var76 <= field569; var76++) {
						if ((field566[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field566[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field570 && (field566[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field566[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field566[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field583[var80][var76][var77] - var84;
								int var86 = field583[var79][var76][var77];
								UMNOCQQA.method474(var86, var76 * 128, var78 * 128 + 128, var76 * 128, var77 * 128, 1, var73, var85);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field566[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field566[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field566[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field569 && (field566[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field566[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field566[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field583[var92][var89][var75] - var96;
								int var98 = field583[var91][var89][var75];
								UMNOCQQA.method474(var98, var89 * 128, var75 * 128, var90 * 128 + 128, var75 * 128, 2, var73, var97);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field566[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field566[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field566[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field570 && (field566[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field566[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field569) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field566[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field583[var74][var101][var103];
								UMNOCQQA.method474(var107, var101 * 128, var104 * 128 + 128, var102 * 128 + 128, var103 * 128, 4, var73, var107);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field566[var74][var108][var109] &= ~var72;
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
