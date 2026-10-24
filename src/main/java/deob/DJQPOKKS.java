package deob;

@ObfuscatedName("DJQPOKKS")
public class DJQPOKKS extends YYTDUXDR {

	@ObfuscatedName("DJQPOKKS.B")
	public static boolean field578 = true;

	@ObfuscatedName("DJQPOKKS.E")
	public static boolean field581 = true;

	@ObfuscatedName("DJQPOKKS.I")
	public static int[] field585 = new int[512];

	@ObfuscatedName("DJQPOKKS.J")
	public static int[] field586 = new int[2048];

	@ObfuscatedName("DJQPOKKS.K")
	public static int[] field587 = new int[2048];

	@ObfuscatedName("DJQPOKKS.L")
	public static int[] field588 = new int[2048];

	@ObfuscatedName("DJQPOKKS.O")
	public static KWBPZBYX[] field591 = new KWBPZBYX[50];

	@ObfuscatedName("DJQPOKKS.P")
	public static boolean[] field592 = new boolean[50];

	@ObfuscatedName("DJQPOKKS.Q")
	public static int[] field593 = new int[50];

	@ObfuscatedName("DJQPOKKS.T")
	public static int[][] field596 = new int[50][];

	@ObfuscatedName("DJQPOKKS.U")
	public static int[] field597 = new int[50];

	@ObfuscatedName("DJQPOKKS.W")
	public static int[] field599 = new int[0x10000];

	@ObfuscatedName("DJQPOKKS.X")
	public static int[][] field600 = new int[50][];

	@ObfuscatedName("DJQPOKKS.F")
	public static int field582;

	@ObfuscatedName("DJQPOKKS.G")
	public static int field583;

	@ObfuscatedName("DJQPOKKS.H")
	public static int field584;

	@ObfuscatedName("DJQPOKKS.N")
	public static int field590;

	@ObfuscatedName("DJQPOKKS.R")
	public static int field594;

	@ObfuscatedName("DJQPOKKS.V")
	public static int field598;

	@ObfuscatedName("DJQPOKKS.C")
	public static boolean field579;

	@ObfuscatedName("DJQPOKKS.D")
	public static boolean field580;

	@ObfuscatedName("DJQPOKKS.M")
	public static int[] field589;

	@ObfuscatedName("DJQPOKKS.S")
	public static int[][] field595;

	@ObfuscatedName("DJQPOKKS.b(I)V")
	public static final void method244() {
		field585 = null;
		field585 = null;
		field587 = null;
		field588 = null;
		field589 = null;
		field591 = null;
		field592 = null;
		field593 = null;
		field595 = null;
		field596 = null;
		field597 = null;
		field599 = null;
		field600 = null;
	}

	@ObfuscatedName("DJQPOKKS.c(I)V")
	public static final void method245() {
		field589 = new int[YYTDUXDR.field1437];
		for (int var0 = 0; var0 < YYTDUXDR.field1437; var0++) {
			field589[var0] = YYTDUXDR.field1436 * var0;
		}

		field583 = YYTDUXDR.field1436 / 2;
		field584 = YYTDUXDR.field1437 / 2;
	}

	@ObfuscatedName("DJQPOKKS.a(III)V")
	public static final void method246(int arg0, int arg1) {
		field589 = new int[arg1];
		for (int var2 = 0; var2 < arg1; var2++) {
			field589[var2] = arg0 * var2;
		}

		field583 = arg0 / 2;
		field584 = arg1 / 2;
	}

	@ObfuscatedName("DJQPOKKS.d(I)V")
	public static final void method247() {
		field595 = null;

		for (int var0 = 0; var0 < 50; var0++) {
			field596[var0] = null;
		}
	}

	@ObfuscatedName("DJQPOKKS.a(II)V")
	public static final void method248(int arg0) {
		if (field595 == null) {
			field594 = arg0;
			if (field578) {
				field595 = new int[field594][16384];
			} else {
				field595 = new int[field594][0x10000];
			}

			for (int var1 = 0; var1 < 50; var1++) {
				field596[var1] = null;
			}
		}
	}

	@ObfuscatedName("DJQPOKKS.a(LQDHHNYHL;I)V")
	public static final void method249(QDHHNYHL arg0) {
		field590 = 0;
		for (int var1 = 0; var1 < 50; var1++) {
			try {
				field591[var1] = new KWBPZBYX(arg0, String.valueOf(var1), 0);
				if (field578 && field591[var1].field910 == 128) {
					field591[var1].method366();
				} else {
					field591[var1].method367();
				}

				field590++;
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("DJQPOKKS.b(II)I")
	public static final int method250(int arg0) {
		if (field593[arg0] != 0) {
			return field593[arg0];
		}

		int var1 = 0;
		int var2 = 0;
		int var3 = 0;
		int var4 = field600[arg0].length;
		for (int var5 = 0; var5 < var4; var5++) {
			var1 += field600[arg0][var5] >> 16 & 0xFF;
			var2 += field600[arg0][var5] >> 8 & 0xFF;
			var3 += field600[arg0][var5] & 0xFF;
		}

		int var6 = var3 / var4 + (var1 / var4 << 16) + (var2 / var4 << 8);
		var6 = method254(var6, 1.4D);
		if (var6 == 0) {
			var6 = 1;
		}

		field593[arg0] = var6;
		return var6;
	}

	@ObfuscatedName("DJQPOKKS.c(II)V")
	public static final void method251(int arg0) {
		if (field596[arg0] != null) {
			field595[field594++] = field596[arg0];
			field596[arg0] = null;
		}
	}

	@ObfuscatedName("DJQPOKKS.e(I)[I")
	public static final int[] method252(int arg0) {
		field597[arg0] = field598++;

		if (field596[arg0] != null) {
			return field596[arg0];
		}

		int[] var1;
		if (field594 > 0) {
			var1 = field595[--field594];
			field595[field594] = null;
		} else {
			int var2 = 0;
			int var3 = -1;
			for (int var4 = 0; var4 < field590; var4++) {
				if (field596[var4] != null && (field597[var4] < var2 || var3 == -1)) {
					var2 = field597[var4];
					var3 = var4;
				}
			}

			var1 = field596[var3];
			field596[var3] = null;
		}

		field596[arg0] = var1;
		KWBPZBYX var5 = field591[arg0];
		int[] var6 = field600[arg0];
		if (field578) {
			field592[arg0] = false;
			for (int var7 = 0; var7 < 4096; var7++) {
				int var8 = var1[var7] = var6[var5.field904[var7]] & 0xF8F8FF;
				if (var8 == 0) {
					field592[arg0] = true;
				}

				var1[var7 + 4096] = var8 - (var8 >>> 3) & 0xF8F8FF;
				var1[var7 + 8192] = var8 - (var8 >>> 2) & 0xF8F8FF;
				var1[var7 + 12288] = var8 - (var8 >>> 2) - (var8 >>> 3) & 0xF8F8FF;
			}
		} else {
			if (var5.field906 == 64) {
				for (int var9 = 0; var9 < 128; var9++) {
					for (int var10 = 0; var10 < 128; var10++) {
						var1[(var9 << 7) + var10] = var6[var5.field904[(var9 >> 1 << 6) + (var10 >> 1)]];
					}
				}
			} else {
				for (int var11 = 0; var11 < 16384; var11++) {
					var1[var11] = var6[var5.field904[var11]];
				}
			}

			field592[arg0] = false;
			for (int var12 = 0; var12 < 16384; var12++) {
				var1[var12] &= 0xF8F8FF;
				int var13 = var1[var12];
				if (var13 == 0) {
					field592[arg0] = true;
				}

				var1[var12 + 16384] = var13 - (var13 >>> 3) & 0xF8F8FF;
				var1[var12 + 32768] = var13 - (var13 >>> 2) & 0xF8F8FF;
				var1[var12 + 49152] = var13 - (var13 >>> 2) - (var13 >>> 3) & 0xF8F8FF;
			}
		}

		return var1;
	}

	@ObfuscatedName("DJQPOKKS.a(ID)V")
	public static final void method253(double arg0) {
		arg0 += Math.random() * 0.03D - 0.015D;
		int var2 = 0;
		for (int var3 = 0; var3 < 512; var3++) {
			double var4 = var3 / 8 / 64.0D + 0.0078125D;
			double var6 = (var3 & 0x7) / 8.0D + 0.0625D;
			for (int var8 = 0; var8 < 128; var8++) {
				double var9 = var8 / 128.0D;
				double var11 = var9;
				double var13 = var9;
				double var15 = var9;
				if (var6 != 0.0D) {
					double var17;
					if (var9 < 0.5D) {
						var17 = (var6 + 1.0D) * var9;
					} else {
						var17 = var6 + var9 - var6 * var9;
					}

					double var19 = var9 * 2.0D - var17;
					double var21 = var4 + 0.3333333333333333D;
					if (var21 > 1.0D) {
						var21--;
					}

					double var25 = var4 - 0.3333333333333333D;
					if (var25 < 0.0D) {
						var25++;
					}

					if (var21 * 6.0D < 1.0D) {
						var11 = (var17 - var19) * 6.0D * var21 + var19;
					} else if (var21 * 2.0D < 1.0D) {
						var11 = var17;
					} else if (var21 * 3.0D < 2.0D) {
						var11 = (var17 - var19) * (0.6666666666666666D - var21) * 6.0D + var19;
					} else {
						var11 = var19;
					}

					if (var4 * 6.0D < 1.0D) {
						var13 = (var17 - var19) * 6.0D * var4 + var19;
					} else if (var4 * 2.0D < 1.0D) {
						var13 = var17;
					} else if (var4 * 3.0D < 2.0D) {
						var13 = (var17 - var19) * (0.6666666666666666D - var4) * 6.0D + var19;
					} else {
						var13 = var19;
					}

					if (var25 * 6.0D < 1.0D) {
						var15 = (var17 - var19) * 6.0D * var25 + var19;
					} else if (var25 * 2.0D < 1.0D) {
						var15 = var17;
					} else if (var25 * 3.0D < 2.0D) {
						var15 = (var17 - var19) * (0.6666666666666666D - var25) * 6.0D + var19;
					} else {
						var15 = var19;
					}
				}

				int var27 = (int) (var11 * 256.0D);
				int var28 = (int) (var13 * 256.0D);
				int var29 = (int) (var15 * 256.0D);
				int var30 = (var27 << 16) + (var28 << 8) + var29;
				var30 = method254(var30, arg0);
				if (var30 == 0) {
					var30 = 1;
				}

				field599[var2++] = var30;
			}
		}

		for (int var31 = 0; var31 < 50; var31++) {
			if (field591[var31] != null) {
				int[] var32 = field591[var31].field905;
				field600[var31] = new int[var32.length];
				for (int var33 = 0; var33 < var32.length; var33++) {
					field600[var31][var33] = method254(var32[var33], arg0);
					if ((field600[var31][var33] & 0xF8F8FF) == 0 && var33 != 0) {
						field600[var31][var33] = 1;
					}
				}
			}
		}

		for (int var34 = 0; var34 < 50; var34++) {
			method251(var34);
		}
	}

	@ObfuscatedName("DJQPOKKS.b(ID)I")
	public static int method254(int arg0, double arg1) {
		double var3 = (arg0 >> 16) / 256.0D;
		double var5 = (arg0 >> 8 & 0xFF) / 256.0D;
		double var7 = (arg0 & 0xFF) / 256.0D;
		var3 = Math.pow(var3, arg1);
		var5 = Math.pow(var5, arg1);
		var7 = Math.pow(var7, arg1);
		int var9 = (int) (var3 * 256.0D);
		int var10 = (int) (var5 * 256.0D);
		int var11 = (int) (var7 * 256.0D);
		return (var9 << 16) + (var10 << 8) + var11;
	}

	@ObfuscatedName("DJQPOKKS.a(IIIIIIIII)V")
	public static final void method255(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var9 = 0;
		int var10 = 0;
		if (arg0 != arg1) {
			var9 = (arg4 - arg3 << 16) / (arg1 - arg0);
			var10 = (arg7 - arg6 << 15) / (arg1 - arg0);
		}

		int var11 = 0;
		int var12 = 0;
		if (arg1 != arg2) {
			var11 = (arg5 - arg4 << 16) / (arg2 - arg1);
			var12 = (arg8 - arg7 << 15) / (arg2 - arg1);
		}

		int var13 = 0;
		int var14 = 0;
		if (arg0 != arg2) {
			var13 = (arg3 - arg5 << 16) / (arg0 - arg2);
			var14 = (arg6 - arg8 << 15) / (arg0 - arg2);
		}

		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < YYTDUXDR.field1439) {
				if (arg1 > YYTDUXDR.field1439) {
					arg1 = YYTDUXDR.field1439;
				}

				if (arg2 > YYTDUXDR.field1439) {
					arg2 = YYTDUXDR.field1439;
				}

				if (arg1 < arg2) {
					int var15 = arg3 <<= 16;
					int var16 = arg6 <<= 15;
					if (arg0 < 0) {
						var15 -= arg0 * var13;
						arg3 -= arg0 * var9;
						var16 -= arg0 * var14;
						arg6 -= arg0 * var10;
						arg0 = 0;
					}

					arg4 <<= 16;
					arg7 <<= 15;
					if (arg1 < 0) {
						arg4 -= arg1 * var11;
						arg7 -= arg1 * var12;
						arg1 = 0;
					}

					if (arg0 != arg1 && var13 < var9 || arg0 == arg1 && var13 > var11) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = field589[arg0];
						while (--arg1 >= 0) {
							method256(YYTDUXDR.field1435, arg0, 0, 0, var15 >> 16, arg3 >> 16, var16 >> 7, arg6 >> 7);
							var15 += var13;
							arg3 += var9;
							var16 += var14;
							arg6 += var10;
							arg0 += YYTDUXDR.field1436;
						}

						while (--arg2 >= 0) {
							method256(YYTDUXDR.field1435, arg0, 0, 0, var15 >> 16, arg4 >> 16, var16 >> 7, arg7 >> 7);
							var15 += var13;
							arg4 += var11;
							var16 += var14;
							arg7 += var12;
							arg0 += YYTDUXDR.field1436;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = field589[arg0];
						while (--arg1 >= 0) {
							method256(YYTDUXDR.field1435, arg0, 0, 0, arg3 >> 16, var15 >> 16, arg6 >> 7, var16 >> 7);
							var15 += var13;
							arg3 += var9;
							var16 += var14;
							arg6 += var10;
							arg0 += YYTDUXDR.field1436;
						}

						while (--arg2 >= 0) {
							method256(YYTDUXDR.field1435, arg0, 0, 0, arg4 >> 16, var15 >> 16, arg7 >> 7, var16 >> 7);
							var15 += var13;
							arg4 += var11;
							var16 += var14;
							arg7 += var12;
							arg0 += YYTDUXDR.field1436;
						}
					}
				} else {
					int var17 = arg3 <<= 16;
					int var18 = arg6 <<= 15;
					if (arg0 < 0) {
						var17 -= arg0 * var13;
						arg3 -= arg0 * var9;
						var18 -= arg0 * var14;
						arg6 -= arg0 * var10;
						arg0 = 0;
					}

					arg5 <<= 16;
					arg8 <<= 15;
					if (arg2 < 0) {
						arg5 -= arg2 * var11;
						arg8 -= arg2 * var12;
						arg2 = 0;
					}

					if (arg0 != arg2 && var13 < var9 || arg0 == arg2 && var11 > var9) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = field589[arg0];
						while (--arg2 >= 0) {
							method256(YYTDUXDR.field1435, arg0, 0, 0, var17 >> 16, arg3 >> 16, var18 >> 7, arg6 >> 7);
							var17 += var13;
							arg3 += var9;
							var18 += var14;
							arg6 += var10;
							arg0 += YYTDUXDR.field1436;
						}

						while (--arg1 >= 0) {
							method256(YYTDUXDR.field1435, arg0, 0, 0, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
							arg5 += var11;
							arg3 += var9;
							arg8 += var12;
							arg6 += var10;
							arg0 += YYTDUXDR.field1436;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = field589[arg0];
						while (--arg2 >= 0) {
							method256(YYTDUXDR.field1435, arg0, 0, 0, arg3 >> 16, var17 >> 16, arg6 >> 7, var18 >> 7);
							var17 += var13;
							arg3 += var9;
							var18 += var14;
							arg6 += var10;
							arg0 += YYTDUXDR.field1436;
						}

						while (--arg1 >= 0) {
							method256(YYTDUXDR.field1435, arg0, 0, 0, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
							arg5 += var11;
							arg3 += var9;
							arg8 += var12;
							arg6 += var10;
							arg0 += YYTDUXDR.field1436;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < YYTDUXDR.field1439) {
				if (arg2 > YYTDUXDR.field1439) {
					arg2 = YYTDUXDR.field1439;
				}

				if (arg0 > YYTDUXDR.field1439) {
					arg0 = YYTDUXDR.field1439;
				}

				if (arg2 < arg0) {
					int var19 = arg4 <<= 16;
					int var20 = arg7 <<= 15;
					if (arg1 < 0) {
						var19 -= arg1 * var9;
						arg4 -= arg1 * var11;
						var20 -= arg1 * var10;
						arg7 -= arg1 * var12;
						arg1 = 0;
					}

					arg5 <<= 16;
					arg8 <<= 15;
					if (arg2 < 0) {
						arg5 -= arg2 * var13;
						arg8 -= arg2 * var14;
						arg2 = 0;
					}

					if (arg1 != arg2 && var9 < var11 || arg1 == arg2 && var9 > var13) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = field589[arg1];
						while (--arg2 >= 0) {
							method256(YYTDUXDR.field1435, arg1, 0, 0, var19 >> 16, arg4 >> 16, var20 >> 7, arg7 >> 7);
							var19 += var9;
							arg4 += var11;
							var20 += var10;
							arg7 += var12;
							arg1 += YYTDUXDR.field1436;
						}

						while (--arg0 >= 0) {
							method256(YYTDUXDR.field1435, arg1, 0, 0, var19 >> 16, arg5 >> 16, var20 >> 7, arg8 >> 7);
							var19 += var9;
							arg5 += var13;
							var20 += var10;
							arg8 += var14;
							arg1 += YYTDUXDR.field1436;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = field589[arg1];
						while (--arg2 >= 0) {
							method256(YYTDUXDR.field1435, arg1, 0, 0, arg4 >> 16, var19 >> 16, arg7 >> 7, var20 >> 7);
							var19 += var9;
							arg4 += var11;
							var20 += var10;
							arg7 += var12;
							arg1 += YYTDUXDR.field1436;
						}

						while (--arg0 >= 0) {
							method256(YYTDUXDR.field1435, arg1, 0, 0, arg5 >> 16, var19 >> 16, arg8 >> 7, var20 >> 7);
							var19 += var9;
							arg5 += var13;
							var20 += var10;
							arg8 += var14;
							arg1 += YYTDUXDR.field1436;
						}
					}
				} else {
					int var21 = arg4 <<= 16;
					int var22 = arg7 <<= 15;
					if (arg1 < 0) {
						var21 -= arg1 * var9;
						arg4 -= arg1 * var11;
						var22 -= arg1 * var10;
						arg7 -= arg1 * var12;
						arg1 = 0;
					}

					arg3 <<= 16;
					arg6 <<= 15;
					if (arg0 < 0) {
						arg3 -= arg0 * var13;
						arg6 -= arg0 * var14;
						arg0 = 0;
					}

					if (var9 < var11) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = field589[arg1];
						while (--arg0 >= 0) {
							method256(YYTDUXDR.field1435, arg1, 0, 0, var21 >> 16, arg4 >> 16, var22 >> 7, arg7 >> 7);
							var21 += var9;
							arg4 += var11;
							var22 += var10;
							arg7 += var12;
							arg1 += YYTDUXDR.field1436;
						}

						while (--arg2 >= 0) {
							method256(YYTDUXDR.field1435, arg1, 0, 0, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
							arg3 += var13;
							arg4 += var11;
							arg6 += var14;
							arg7 += var12;
							arg1 += YYTDUXDR.field1436;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = field589[arg1];
						while (--arg0 >= 0) {
							method256(YYTDUXDR.field1435, arg1, 0, 0, arg4 >> 16, var21 >> 16, arg7 >> 7, var22 >> 7);
							var21 += var9;
							arg4 += var11;
							var22 += var10;
							arg7 += var12;
							arg1 += YYTDUXDR.field1436;
						}

						while (--arg2 >= 0) {
							method256(YYTDUXDR.field1435, arg1, 0, 0, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
							arg3 += var13;
							arg4 += var11;
							arg6 += var14;
							arg7 += var12;
							arg1 += YYTDUXDR.field1436;
						}
					}
				}
			}
		} else if (arg2 < YYTDUXDR.field1439) {
			if (arg0 > YYTDUXDR.field1439) {
				arg0 = YYTDUXDR.field1439;
			}

			if (arg1 > YYTDUXDR.field1439) {
				arg1 = YYTDUXDR.field1439;
			}

			if (arg0 < arg1) {
				int var23 = arg5 <<= 16;
				int var24 = arg8 <<= 15;
				if (arg2 < 0) {
					var23 -= arg2 * var11;
					arg5 -= arg2 * var13;
					var24 -= arg2 * var12;
					arg8 -= arg2 * var14;
					arg2 = 0;
				}

				arg3 <<= 16;
				arg6 <<= 15;
				if (arg0 < 0) {
					arg3 -= arg0 * var9;
					arg6 -= arg0 * var10;
					arg0 = 0;
				}

				if (var11 < var13) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = field589[arg2];
					while (--arg0 >= 0) {
						method256(YYTDUXDR.field1435, arg2, 0, 0, var23 >> 16, arg5 >> 16, var24 >> 7, arg8 >> 7);
						var23 += var11;
						arg5 += var13;
						var24 += var12;
						arg8 += var14;
						arg2 += YYTDUXDR.field1436;
					}

					while (--arg1 >= 0) {
						method256(YYTDUXDR.field1435, arg2, 0, 0, var23 >> 16, arg3 >> 16, var24 >> 7, arg6 >> 7);
						var23 += var11;
						arg3 += var9;
						var24 += var12;
						arg6 += var10;
						arg2 += YYTDUXDR.field1436;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = field589[arg2];
					while (--arg0 >= 0) {
						method256(YYTDUXDR.field1435, arg2, 0, 0, arg5 >> 16, var23 >> 16, arg8 >> 7, var24 >> 7);
						var23 += var11;
						arg5 += var13;
						var24 += var12;
						arg8 += var14;
						arg2 += YYTDUXDR.field1436;
					}

					while (--arg1 >= 0) {
						method256(YYTDUXDR.field1435, arg2, 0, 0, arg3 >> 16, var23 >> 16, arg6 >> 7, var24 >> 7);
						var23 += var11;
						arg3 += var9;
						var24 += var12;
						arg6 += var10;
						arg2 += YYTDUXDR.field1436;
					}
				}
			} else {
				int var25 = arg5 <<= 16;
				int var26 = arg8 <<= 15;
				if (arg2 < 0) {
					var25 -= arg2 * var11;
					arg5 -= arg2 * var13;
					var26 -= arg2 * var12;
					arg8 -= arg2 * var14;
					arg2 = 0;
				}

				arg4 <<= 16;
				arg7 <<= 15;
				if (arg1 < 0) {
					arg4 -= arg1 * var9;
					arg7 -= arg1 * var10;
					arg1 = 0;
				}

				if (var11 < var13) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = field589[arg2];
					while (--arg1 >= 0) {
						method256(YYTDUXDR.field1435, arg2, 0, 0, var25 >> 16, arg5 >> 16, var26 >> 7, arg8 >> 7);
						var25 += var11;
						arg5 += var13;
						var26 += var12;
						arg8 += var14;
						arg2 += YYTDUXDR.field1436;
					}

					while (--arg0 >= 0) {
						method256(YYTDUXDR.field1435, arg2, 0, 0, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
						arg4 += var9;
						arg5 += var13;
						arg7 += var10;
						arg8 += var14;
						arg2 += YYTDUXDR.field1436;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = field589[arg2];
					while (--arg1 >= 0) {
						method256(YYTDUXDR.field1435, arg2, 0, 0, arg5 >> 16, var25 >> 16, arg8 >> 7, var26 >> 7);
						var25 += var11;
						arg5 += var13;
						var26 += var12;
						arg8 += var14;
						arg2 += YYTDUXDR.field1436;
					}

					while (--arg0 >= 0) {
						method256(YYTDUXDR.field1435, arg2, 0, 0, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
						arg4 += var9;
						arg5 += var13;
						arg7 += var10;
						arg8 += var14;
						arg2 += YYTDUXDR.field1436;
					}
				}
			}
		}
	}

	@ObfuscatedName("DJQPOKKS.a([IIIIIIII)V")
	public static final void method256(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field581) {
			int var8;
			int var9;
			if (field579) {
				if (arg5 - arg4 > 3) {
					var8 = (arg7 - arg6) / (arg5 - arg4);
				} else {
					var8 = 0;
				}

				if (arg5 > YYTDUXDR.field1442) {
					arg5 = YYTDUXDR.field1442;
				}

				if (arg4 < 0) {
					arg6 -= arg4 * var8;
					arg4 = 0;
				}

				if (arg4 >= arg5) {
					return;
				}

				arg1 += arg4;
				var9 = arg5 - arg4 >> 2;
				var8 <<= 2;
			} else if (arg4 < arg5) {
				arg1 += arg4;
				var9 = arg5 - arg4 >> 2;
				if (var9 > 0) {
					var8 = (arg7 - arg6) * field585[var9] >> 15;
				} else {
					var8 = 0;
				}
			} else {
				return;
			}

			int var23;
			if (field582 == 0) {
				while (--var9 >= 0) {
					int var10 = field599[arg6 >> 8];
					arg6 += var8;
					var23 = arg1 + 1;
					arg0[arg1] = var10;
					arg0[var23++] = var10;
					arg0[var23++] = var10;
					arg1 = var23 + 1;
					arg0[var23] = var10;
				}

				int var11 = arg5 - arg4 & 0x3;
				if (var11 > 0) {
					int var12 = field599[arg6 >> 8];
					do {
						arg0[arg1++] = var12;
						var11--;
					} while (var11 > 0);

					return;
				}
			} else {
				int var13 = field582;
				int var14 = 256 - field582;
				while (--var9 >= 0) {
					int var15 = field599[arg6 >> 8];
					arg6 += var8;
					var15 = ((var15 & 0xFF00FF) * var14 >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var14 >> 8 & 0xFF00);
					var23 = arg1 + 1;
					arg0[arg1] = ((arg0[var23] & 0xFF00) * var13 >> 8 & 0xFF00) + ((arg0[var23] & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + var15;
					arg0[var23++] = ((arg0[var23] & 0xFF00) * var13 >> 8 & 0xFF00) + ((arg0[var23] & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + var15;
					arg0[var23++] = ((arg0[var23] & 0xFF00) * var13 >> 8 & 0xFF00) + ((arg0[var23] & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + var15;
					arg1 = var23 + 1;
					arg0[var23] = ((arg0[arg1] & 0xFF00) * var13 >> 8 & 0xFF00) + ((arg0[arg1] & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + var15;
				}

				int var16 = arg5 - arg4 & 0x3;
				if (var16 > 0) {
					int var17 = field599[arg6 >> 8];
					var17 = ((var17 & 0xFF00FF) * var14 >> 8 & 0xFF00FF) + ((var17 & 0xFF00) * var14 >> 8 & 0xFF00);
					do {
						arg0[arg1++] = ((arg0[arg1] & 0xFF00) * var13 >> 8 & 0xFF00) + ((arg0[arg1] & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + var17;
						var16--;
					} while (var16 > 0);
				}
			}
		} else if (arg4 < arg5) {
			int var18 = (arg7 - arg6) / (arg5 - arg4);
			if (field579) {
				if (arg5 > YYTDUXDR.field1442) {
					arg5 = YYTDUXDR.field1442;
				}

				if (arg4 < 0) {
					arg6 -= arg4 * var18;
					arg4 = 0;
				}

				if (arg4 >= arg5) {
					return;
				}
			}

			arg1 += arg4;
			int var19 = arg5 - arg4;
			if (field582 == 0) {
				do {
					arg0[arg1++] = field599[arg6 >> 8];
					arg6 += var18;
					var19--;
				} while (var19 > 0);
			} else {
				int var20 = field582;
				int var21 = 256 - field582;
				do {
					int var22 = field599[arg6 >> 8];
					arg6 += var18;
					var22 = ((var22 & 0xFF00FF) * var21 >> 8 & 0xFF00FF) + ((var22 & 0xFF00) * var21 >> 8 & 0xFF00);
					arg0[arg1++] = ((arg0[arg1] & 0xFF00) * var20 >> 8 & 0xFF00) + ((arg0[arg1] & 0xFF00FF) * var20 >> 8 & 0xFF00FF) + var22;
					var19--;
				} while (var19 > 0);
			}
		}
	}

	@ObfuscatedName("DJQPOKKS.b(IIIIIII)V")
	public static final void method257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var7 = 0;
		if (arg0 != arg1) {
			var7 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}

		int var8 = 0;
		if (arg1 != arg2) {
			var8 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}

		int var9 = 0;
		if (arg0 != arg2) {
			var9 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}

		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < YYTDUXDR.field1439) {
				if (arg1 > YYTDUXDR.field1439) {
					arg1 = YYTDUXDR.field1439;
				}

				if (arg2 > YYTDUXDR.field1439) {
					arg2 = YYTDUXDR.field1439;
				}

				if (arg1 < arg2) {
					int var10 = arg3 <<= 16;
					if (arg0 < 0) {
						var10 -= arg0 * var9;
						arg3 -= arg0 * var7;
						arg0 = 0;
					}

					arg4 <<= 16;
					if (arg1 < 0) {
						arg4 -= arg1 * var8;
						arg1 = 0;
					}

					if (arg0 != arg1 && var9 < var7 || arg0 == arg1 && var9 > var8) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = field589[arg0];
						while (--arg1 >= 0) {
							method258(YYTDUXDR.field1435, arg0, arg6, 0, var10 >> 16, arg3 >> 16);
							var10 += var9;
							arg3 += var7;
							arg0 += YYTDUXDR.field1436;
						}

						while (--arg2 >= 0) {
							method258(YYTDUXDR.field1435, arg0, arg6, 0, var10 >> 16, arg4 >> 16);
							var10 += var9;
							arg4 += var8;
							arg0 += YYTDUXDR.field1436;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = field589[arg0];
						while (--arg1 >= 0) {
							method258(YYTDUXDR.field1435, arg0, arg6, 0, arg3 >> 16, var10 >> 16);
							var10 += var9;
							arg3 += var7;
							arg0 += YYTDUXDR.field1436;
						}

						while (--arg2 >= 0) {
							method258(YYTDUXDR.field1435, arg0, arg6, 0, arg4 >> 16, var10 >> 16);
							var10 += var9;
							arg4 += var8;
							arg0 += YYTDUXDR.field1436;
						}
					}
				} else {
					int var11 = arg3 <<= 16;
					if (arg0 < 0) {
						var11 -= arg0 * var9;
						arg3 -= arg0 * var7;
						arg0 = 0;
					}

					arg5 <<= 16;
					if (arg2 < 0) {
						arg5 -= arg2 * var8;
						arg2 = 0;
					}

					if (arg0 != arg2 && var9 < var7 || arg0 == arg2 && var8 > var7) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = field589[arg0];
						while (--arg2 >= 0) {
							method258(YYTDUXDR.field1435, arg0, arg6, 0, var11 >> 16, arg3 >> 16);
							var11 += var9;
							arg3 += var7;
							arg0 += YYTDUXDR.field1436;
						}

						while (--arg1 >= 0) {
							method258(YYTDUXDR.field1435, arg0, arg6, 0, arg5 >> 16, arg3 >> 16);
							arg5 += var8;
							arg3 += var7;
							arg0 += YYTDUXDR.field1436;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = field589[arg0];
						while (--arg2 >= 0) {
							method258(YYTDUXDR.field1435, arg0, arg6, 0, arg3 >> 16, var11 >> 16);
							var11 += var9;
							arg3 += var7;
							arg0 += YYTDUXDR.field1436;
						}

						while (--arg1 >= 0) {
							method258(YYTDUXDR.field1435, arg0, arg6, 0, arg3 >> 16, arg5 >> 16);
							arg5 += var8;
							arg3 += var7;
							arg0 += YYTDUXDR.field1436;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < YYTDUXDR.field1439) {
				if (arg2 > YYTDUXDR.field1439) {
					arg2 = YYTDUXDR.field1439;
				}

				if (arg0 > YYTDUXDR.field1439) {
					arg0 = YYTDUXDR.field1439;
				}

				if (arg2 < arg0) {
					int var12 = arg4 <<= 16;
					if (arg1 < 0) {
						var12 -= arg1 * var7;
						arg4 -= arg1 * var8;
						arg1 = 0;
					}

					arg5 <<= 16;
					if (arg2 < 0) {
						arg5 -= arg2 * var9;
						arg2 = 0;
					}

					if (arg1 != arg2 && var7 < var8 || arg1 == arg2 && var7 > var9) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = field589[arg1];
						while (--arg2 >= 0) {
							method258(YYTDUXDR.field1435, arg1, arg6, 0, var12 >> 16, arg4 >> 16);
							var12 += var7;
							arg4 += var8;
							arg1 += YYTDUXDR.field1436;
						}

						while (--arg0 >= 0) {
							method258(YYTDUXDR.field1435, arg1, arg6, 0, var12 >> 16, arg5 >> 16);
							var12 += var7;
							arg5 += var9;
							arg1 += YYTDUXDR.field1436;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = field589[arg1];
						while (--arg2 >= 0) {
							method258(YYTDUXDR.field1435, arg1, arg6, 0, arg4 >> 16, var12 >> 16);
							var12 += var7;
							arg4 += var8;
							arg1 += YYTDUXDR.field1436;
						}

						while (--arg0 >= 0) {
							method258(YYTDUXDR.field1435, arg1, arg6, 0, arg5 >> 16, var12 >> 16);
							var12 += var7;
							arg5 += var9;
							arg1 += YYTDUXDR.field1436;
						}
					}
				} else {
					int var13 = arg4 <<= 16;
					if (arg1 < 0) {
						var13 -= arg1 * var7;
						arg4 -= arg1 * var8;
						arg1 = 0;
					}

					arg3 <<= 16;
					if (arg0 < 0) {
						arg3 -= arg0 * var9;
						arg0 = 0;
					}

					if (var7 < var8) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = field589[arg1];
						while (--arg0 >= 0) {
							method258(YYTDUXDR.field1435, arg1, arg6, 0, var13 >> 16, arg4 >> 16);
							var13 += var7;
							arg4 += var8;
							arg1 += YYTDUXDR.field1436;
						}

						while (--arg2 >= 0) {
							method258(YYTDUXDR.field1435, arg1, arg6, 0, arg3 >> 16, arg4 >> 16);
							arg3 += var9;
							arg4 += var8;
							arg1 += YYTDUXDR.field1436;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = field589[arg1];
						while (--arg0 >= 0) {
							method258(YYTDUXDR.field1435, arg1, arg6, 0, arg4 >> 16, var13 >> 16);
							var13 += var7;
							arg4 += var8;
							arg1 += YYTDUXDR.field1436;
						}

						while (--arg2 >= 0) {
							method258(YYTDUXDR.field1435, arg1, arg6, 0, arg4 >> 16, arg3 >> 16);
							arg3 += var9;
							arg4 += var8;
							arg1 += YYTDUXDR.field1436;
						}
					}
				}
			}
		} else if (arg2 < YYTDUXDR.field1439) {
			if (arg0 > YYTDUXDR.field1439) {
				arg0 = YYTDUXDR.field1439;
			}

			if (arg1 > YYTDUXDR.field1439) {
				arg1 = YYTDUXDR.field1439;
			}

			if (arg0 < arg1) {
				int var14 = arg5 <<= 16;
				if (arg2 < 0) {
					var14 -= arg2 * var8;
					arg5 -= arg2 * var9;
					arg2 = 0;
				}

				arg3 <<= 16;
				if (arg0 < 0) {
					arg3 -= arg0 * var7;
					arg0 = 0;
				}

				if (var8 < var9) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = field589[arg2];
					while (--arg0 >= 0) {
						method258(YYTDUXDR.field1435, arg2, arg6, 0, var14 >> 16, arg5 >> 16);
						var14 += var8;
						arg5 += var9;
						arg2 += YYTDUXDR.field1436;
					}

					while (--arg1 >= 0) {
						method258(YYTDUXDR.field1435, arg2, arg6, 0, var14 >> 16, arg3 >> 16);
						var14 += var8;
						arg3 += var7;
						arg2 += YYTDUXDR.field1436;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = field589[arg2];
					while (--arg0 >= 0) {
						method258(YYTDUXDR.field1435, arg2, arg6, 0, arg5 >> 16, var14 >> 16);
						var14 += var8;
						arg5 += var9;
						arg2 += YYTDUXDR.field1436;
					}

					while (--arg1 >= 0) {
						method258(YYTDUXDR.field1435, arg2, arg6, 0, arg3 >> 16, var14 >> 16);
						var14 += var8;
						arg3 += var7;
						arg2 += YYTDUXDR.field1436;
					}
				}
			} else {
				int var15 = arg5 <<= 16;
				if (arg2 < 0) {
					var15 -= arg2 * var8;
					arg5 -= arg2 * var9;
					arg2 = 0;
				}

				arg4 <<= 16;
				if (arg1 < 0) {
					arg4 -= arg1 * var7;
					arg1 = 0;
				}

				if (var8 < var9) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = field589[arg2];
					while (--arg1 >= 0) {
						method258(YYTDUXDR.field1435, arg2, arg6, 0, var15 >> 16, arg5 >> 16);
						var15 += var8;
						arg5 += var9;
						arg2 += YYTDUXDR.field1436;
					}

					while (--arg0 >= 0) {
						method258(YYTDUXDR.field1435, arg2, arg6, 0, arg4 >> 16, arg5 >> 16);
						arg4 += var7;
						arg5 += var9;
						arg2 += YYTDUXDR.field1436;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = field589[arg2];
					while (--arg1 >= 0) {
						method258(YYTDUXDR.field1435, arg2, arg6, 0, arg5 >> 16, var15 >> 16);
						var15 += var8;
						arg5 += var9;
						arg2 += YYTDUXDR.field1436;
					}

					while (--arg0 >= 0) {
						method258(YYTDUXDR.field1435, arg2, arg6, 0, arg5 >> 16, arg4 >> 16);
						arg4 += var7;
						arg5 += var9;
						arg2 += YYTDUXDR.field1436;
					}
				}
			}
		}
	}

	@ObfuscatedName("DJQPOKKS.a([IIIIII)V")
	public static final void method258(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (field579) {
			if (arg5 > YYTDUXDR.field1442) {
				arg5 = YYTDUXDR.field1442;
			}

			if (arg4 < 0) {
				arg4 = 0;
			}
		}

		if (arg4 < arg5) {
			arg1 += arg4;
			int var6 = arg5 - arg4 >> 2;
			int var11;
			if (field582 == 0) {
				while (--var6 >= 0) {
					var11 = arg1 + 1;
					arg0[arg1] = arg2;
					arg0[var11++] = arg2;
					arg0[var11++] = arg2;
					arg1 = var11 + 1;
					arg0[var11] = arg2;
				}

				int var7 = arg5 - arg4 & 0x3;
				while (--var7 >= 0) {
					arg0[arg1++] = arg2;
				}
			} else {
				int var8 = field582;
				int var9 = 256 - field582;
				arg2 = ((arg2 & 0xFF00FF) * var9 >> 8 & 0xFF00FF) + ((arg2 & 0xFF00) * var9 >> 8 & 0xFF00);
				while (--var6 >= 0) {
					var11 = arg1 + 1;
					arg0[arg1] = ((arg0[var11] & 0xFF00) * var8 >> 8 & 0xFF00) + ((arg0[var11] & 0xFF00FF) * var8 >> 8 & 0xFF00FF) + arg2;
					arg0[var11++] = ((arg0[var11] & 0xFF00) * var8 >> 8 & 0xFF00) + ((arg0[var11] & 0xFF00FF) * var8 >> 8 & 0xFF00FF) + arg2;
					arg0[var11++] = ((arg0[var11] & 0xFF00) * var8 >> 8 & 0xFF00) + ((arg0[var11] & 0xFF00FF) * var8 >> 8 & 0xFF00FF) + arg2;
					arg1 = var11 + 1;
					arg0[var11] = ((arg0[arg1] & 0xFF00) * var8 >> 8 & 0xFF00) + ((arg0[arg1] & 0xFF00FF) * var8 >> 8 & 0xFF00FF) + arg2;
				}

				int var10 = arg5 - arg4 & 0x3;
				while (--var10 >= 0) {
					arg0[arg1++] = ((arg0[arg1] & 0xFF00) * var8 >> 8 & 0xFF00) + ((arg0[arg1] & 0xFF00FF) * var8 >> 8 & 0xFF00FF) + arg2;
				}
			}
		}
	}

	@ObfuscatedName("DJQPOKKS.a(IIIIIIIIIIIIIIIIIII)V")
	public static final void method259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		int[] var19 = method252(arg18);
		field580 = !field592[arg18];
		arg10 = arg9 - arg10;
		arg13 = arg12 - arg13;
		arg16 = arg15 - arg16;
		arg11 -= arg9;
		arg14 -= arg12;
		arg17 -= arg15;
		int var20 = arg11 * arg12 - arg9 * arg14 << 14;
		int var21 = arg14 * arg15 - arg12 * arg17 << 8;
		int var22 = arg9 * arg17 - arg11 * arg15 << 5;
		int var23 = arg10 * arg12 - arg9 * arg13 << 14;
		int var24 = arg13 * arg15 - arg12 * arg16 << 8;
		int var25 = arg9 * arg16 - arg10 * arg15 << 5;
		int var26 = arg11 * arg13 - arg10 * arg14 << 14;
		int var27 = arg14 * arg16 - arg13 * arg17 << 8;
		int var28 = arg10 * arg17 - arg11 * arg16 << 5;
		int var29 = 0;
		int var30 = 0;
		if (arg0 != arg1) {
			var29 = (arg4 - arg3 << 16) / (arg1 - arg0);
			var30 = (arg7 - arg6 << 16) / (arg1 - arg0);
		}

		int var31 = 0;
		int var32 = 0;
		if (arg1 != arg2) {
			var31 = (arg5 - arg4 << 16) / (arg2 - arg1);
			var32 = (arg8 - arg7 << 16) / (arg2 - arg1);
		}

		int var33 = 0;
		int var34 = 0;
		if (arg0 != arg2) {
			var33 = (arg3 - arg5 << 16) / (arg0 - arg2);
			var34 = (arg6 - arg8 << 16) / (arg0 - arg2);
		}

		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < YYTDUXDR.field1439) {
				if (arg1 > YYTDUXDR.field1439) {
					arg1 = YYTDUXDR.field1439;
				}

				if (arg2 > YYTDUXDR.field1439) {
					arg2 = YYTDUXDR.field1439;
				}

				if (arg1 < arg2) {
					int var35 = arg3 <<= 16;
					int var36 = arg6 <<= 16;
					if (arg0 < 0) {
						var35 -= arg0 * var33;
						arg3 -= arg0 * var29;
						var36 -= arg0 * var34;
						arg6 -= arg0 * var30;
						arg0 = 0;
					}

					arg4 <<= 16;
					arg7 <<= 16;
					if (arg1 < 0) {
						arg4 -= arg1 * var31;
						arg7 -= arg1 * var32;
						arg1 = 0;
					}

					int var37 = arg0 - field584;
					var20 += var22 * var37;
					var23 += var25 * var37;
					var26 += var28 * var37;
					if (arg0 != arg1 && var33 < var29 || arg0 == arg1 && var33 > var31) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = field589[arg0];
						while (--arg1 >= 0) {
							method260(YYTDUXDR.field1435, var19, 0, 0, arg0, var35 >> 16, arg3 >> 16, var36 >> 8, arg6 >> 8, var20, var23, var26, var21, var24, var27);
							var35 += var33;
							arg3 += var29;
							var36 += var34;
							arg6 += var30;
							arg0 += YYTDUXDR.field1436;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}

						while (--arg2 >= 0) {
							method260(YYTDUXDR.field1435, var19, 0, 0, arg0, var35 >> 16, arg4 >> 16, var36 >> 8, arg7 >> 8, var20, var23, var26, var21, var24, var27);
							var35 += var33;
							arg4 += var31;
							var36 += var34;
							arg7 += var32;
							arg0 += YYTDUXDR.field1436;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = field589[arg0];
						while (--arg1 >= 0) {
							method260(YYTDUXDR.field1435, var19, 0, 0, arg0, arg3 >> 16, var35 >> 16, arg6 >> 8, var36 >> 8, var20, var23, var26, var21, var24, var27);
							var35 += var33;
							arg3 += var29;
							var36 += var34;
							arg6 += var30;
							arg0 += YYTDUXDR.field1436;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}

						while (--arg2 >= 0) {
							method260(YYTDUXDR.field1435, var19, 0, 0, arg0, arg4 >> 16, var35 >> 16, arg7 >> 8, var36 >> 8, var20, var23, var26, var21, var24, var27);
							var35 += var33;
							arg4 += var31;
							var36 += var34;
							arg7 += var32;
							arg0 += YYTDUXDR.field1436;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					}
				} else {
					int var38 = arg3 <<= 16;
					int var39 = arg6 <<= 16;
					if (arg0 < 0) {
						var38 -= arg0 * var33;
						arg3 -= arg0 * var29;
						var39 -= arg0 * var34;
						arg6 -= arg0 * var30;
						arg0 = 0;
					}

					arg5 <<= 16;
					arg8 <<= 16;
					if (arg2 < 0) {
						arg5 -= arg2 * var31;
						arg8 -= arg2 * var32;
						arg2 = 0;
					}

					int var40 = arg0 - field584;
					var20 += var22 * var40;
					var23 += var25 * var40;
					var26 += var28 * var40;
					if ((arg0 == arg2 || var33 >= var29) && (arg0 != arg2 || var31 <= var29)) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = field589[arg0];
						while (--arg2 >= 0) {
							method260(YYTDUXDR.field1435, var19, 0, 0, arg0, arg3 >> 16, var38 >> 16, arg6 >> 8, var39 >> 8, var20, var23, var26, var21, var24, var27);
							var38 += var33;
							arg3 += var29;
							var39 += var34;
							arg6 += var30;
							arg0 += YYTDUXDR.field1436;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}

						while (--arg1 >= 0) {
							method260(YYTDUXDR.field1435, var19, 0, 0, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, var20, var23, var26, var21, var24, var27);
							arg5 += var31;
							arg3 += var29;
							arg8 += var32;
							arg6 += var30;
							arg0 += YYTDUXDR.field1436;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = field589[arg0];
						while (--arg2 >= 0) {
							method260(YYTDUXDR.field1435, var19, 0, 0, arg0, var38 >> 16, arg3 >> 16, var39 >> 8, arg6 >> 8, var20, var23, var26, var21, var24, var27);
							var38 += var33;
							arg3 += var29;
							var39 += var34;
							arg6 += var30;
							arg0 += YYTDUXDR.field1436;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}

						while (--arg1 >= 0) {
							method260(YYTDUXDR.field1435, var19, 0, 0, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, var20, var23, var26, var21, var24, var27);
							arg5 += var31;
							arg3 += var29;
							arg8 += var32;
							arg6 += var30;
							arg0 += YYTDUXDR.field1436;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < YYTDUXDR.field1439) {
				if (arg2 > YYTDUXDR.field1439) {
					arg2 = YYTDUXDR.field1439;
				}

				if (arg0 > YYTDUXDR.field1439) {
					arg0 = YYTDUXDR.field1439;
				}

				if (arg2 < arg0) {
					int var41 = arg4 <<= 16;
					int var42 = arg7 <<= 16;
					if (arg1 < 0) {
						var41 -= arg1 * var29;
						arg4 -= arg1 * var31;
						var42 -= arg1 * var30;
						arg7 -= arg1 * var32;
						arg1 = 0;
					}

					arg5 <<= 16;
					arg8 <<= 16;
					if (arg2 < 0) {
						arg5 -= arg2 * var33;
						arg8 -= arg2 * var34;
						arg2 = 0;
					}

					int var43 = arg1 - field584;
					var20 += var22 * var43;
					var23 += var25 * var43;
					var26 += var28 * var43;
					if (arg1 != arg2 && var29 < var31 || arg1 == arg2 && var29 > var33) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = field589[arg1];
						while (--arg2 >= 0) {
							method260(YYTDUXDR.field1435, var19, 0, 0, arg1, var41 >> 16, arg4 >> 16, var42 >> 8, arg7 >> 8, var20, var23, var26, var21, var24, var27);
							var41 += var29;
							arg4 += var31;
							var42 += var30;
							arg7 += var32;
							arg1 += YYTDUXDR.field1436;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}

						while (--arg0 >= 0) {
							method260(YYTDUXDR.field1435, var19, 0, 0, arg1, var41 >> 16, arg5 >> 16, var42 >> 8, arg8 >> 8, var20, var23, var26, var21, var24, var27);
							var41 += var29;
							arg5 += var33;
							var42 += var30;
							arg8 += var34;
							arg1 += YYTDUXDR.field1436;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = field589[arg1];
						while (--arg2 >= 0) {
							method260(YYTDUXDR.field1435, var19, 0, 0, arg1, arg4 >> 16, var41 >> 16, arg7 >> 8, var42 >> 8, var20, var23, var26, var21, var24, var27);
							var41 += var29;
							arg4 += var31;
							var42 += var30;
							arg7 += var32;
							arg1 += YYTDUXDR.field1436;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}

						while (--arg0 >= 0) {
							method260(YYTDUXDR.field1435, var19, 0, 0, arg1, arg5 >> 16, var41 >> 16, arg8 >> 8, var42 >> 8, var20, var23, var26, var21, var24, var27);
							var41 += var29;
							arg5 += var33;
							var42 += var30;
							arg8 += var34;
							arg1 += YYTDUXDR.field1436;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					}
				} else {
					int var44 = arg4 <<= 16;
					int var45 = arg7 <<= 16;
					if (arg1 < 0) {
						var44 -= arg1 * var29;
						arg4 -= arg1 * var31;
						var45 -= arg1 * var30;
						arg7 -= arg1 * var32;
						arg1 = 0;
					}

					arg3 <<= 16;
					arg6 <<= 16;
					if (arg0 < 0) {
						arg3 -= arg0 * var33;
						arg6 -= arg0 * var34;
						arg0 = 0;
					}

					int var46 = arg1 - field584;
					var20 += var22 * var46;
					var23 += var25 * var46;
					var26 += var28 * var46;
					if (var29 < var31) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = field589[arg1];
						while (--arg0 >= 0) {
							method260(YYTDUXDR.field1435, var19, 0, 0, arg1, var44 >> 16, arg4 >> 16, var45 >> 8, arg7 >> 8, var20, var23, var26, var21, var24, var27);
							var44 += var29;
							arg4 += var31;
							var45 += var30;
							arg7 += var32;
							arg1 += YYTDUXDR.field1436;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}

						while (--arg2 >= 0) {
							method260(YYTDUXDR.field1435, var19, 0, 0, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, var20, var23, var26, var21, var24, var27);
							arg3 += var33;
							arg4 += var31;
							arg6 += var34;
							arg7 += var32;
							arg1 += YYTDUXDR.field1436;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = field589[arg1];
						while (--arg0 >= 0) {
							method260(YYTDUXDR.field1435, var19, 0, 0, arg1, arg4 >> 16, var44 >> 16, arg7 >> 8, var45 >> 8, var20, var23, var26, var21, var24, var27);
							var44 += var29;
							arg4 += var31;
							var45 += var30;
							arg7 += var32;
							arg1 += YYTDUXDR.field1436;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}

						while (--arg2 >= 0) {
							method260(YYTDUXDR.field1435, var19, 0, 0, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, var20, var23, var26, var21, var24, var27);
							arg3 += var33;
							arg4 += var31;
							arg6 += var34;
							arg7 += var32;
							arg1 += YYTDUXDR.field1436;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					}
				}
			}
		} else if (arg2 < YYTDUXDR.field1439) {
			if (arg0 > YYTDUXDR.field1439) {
				arg0 = YYTDUXDR.field1439;
			}

			if (arg1 > YYTDUXDR.field1439) {
				arg1 = YYTDUXDR.field1439;
			}

			if (arg0 < arg1) {
				int var47 = arg5 <<= 16;
				int var48 = arg8 <<= 16;
				if (arg2 < 0) {
					var47 -= arg2 * var31;
					arg5 -= arg2 * var33;
					var48 -= arg2 * var32;
					arg8 -= arg2 * var34;
					arg2 = 0;
				}

				arg3 <<= 16;
				arg6 <<= 16;
				if (arg0 < 0) {
					arg3 -= arg0 * var29;
					arg6 -= arg0 * var30;
					arg0 = 0;
				}

				int var49 = arg2 - field584;
				var20 += var22 * var49;
				var23 += var25 * var49;
				var26 += var28 * var49;
				if (var31 < var33) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = field589[arg2];
					while (--arg0 >= 0) {
						method260(YYTDUXDR.field1435, var19, 0, 0, arg2, var47 >> 16, arg5 >> 16, var48 >> 8, arg8 >> 8, var20, var23, var26, var21, var24, var27);
						var47 += var31;
						arg5 += var33;
						var48 += var32;
						arg8 += var34;
						arg2 += YYTDUXDR.field1436;
						var20 += var22;
						var23 += var25;
						var26 += var28;
					}

					while (--arg1 >= 0) {
						method260(YYTDUXDR.field1435, var19, 0, 0, arg2, var47 >> 16, arg3 >> 16, var48 >> 8, arg6 >> 8, var20, var23, var26, var21, var24, var27);
						var47 += var31;
						arg3 += var29;
						var48 += var32;
						arg6 += var30;
						arg2 += YYTDUXDR.field1436;
						var20 += var22;
						var23 += var25;
						var26 += var28;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = field589[arg2];
					while (--arg0 >= 0) {
						method260(YYTDUXDR.field1435, var19, 0, 0, arg2, arg5 >> 16, var47 >> 16, arg8 >> 8, var48 >> 8, var20, var23, var26, var21, var24, var27);
						var47 += var31;
						arg5 += var33;
						var48 += var32;
						arg8 += var34;
						arg2 += YYTDUXDR.field1436;
						var20 += var22;
						var23 += var25;
						var26 += var28;
					}

					while (--arg1 >= 0) {
						method260(YYTDUXDR.field1435, var19, 0, 0, arg2, arg3 >> 16, var47 >> 16, arg6 >> 8, var48 >> 8, var20, var23, var26, var21, var24, var27);
						var47 += var31;
						arg3 += var29;
						var48 += var32;
						arg6 += var30;
						arg2 += YYTDUXDR.field1436;
						var20 += var22;
						var23 += var25;
						var26 += var28;
					}
				}
			} else {
				int var50 = arg5 <<= 16;
				int var51 = arg8 <<= 16;
				if (arg2 < 0) {
					var50 -= arg2 * var31;
					arg5 -= arg2 * var33;
					var51 -= arg2 * var32;
					arg8 -= arg2 * var34;
					arg2 = 0;
				}

				arg4 <<= 16;
				arg7 <<= 16;
				if (arg1 < 0) {
					arg4 -= arg1 * var29;
					arg7 -= arg1 * var30;
					arg1 = 0;
				}

				int var52 = arg2 - field584;
				var20 += var22 * var52;
				var23 += var25 * var52;
				var26 += var28 * var52;
				if (var31 < var33) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = field589[arg2];
					while (--arg1 >= 0) {
						method260(YYTDUXDR.field1435, var19, 0, 0, arg2, var50 >> 16, arg5 >> 16, var51 >> 8, arg8 >> 8, var20, var23, var26, var21, var24, var27);
						var50 += var31;
						arg5 += var33;
						var51 += var32;
						arg8 += var34;
						arg2 += YYTDUXDR.field1436;
						var20 += var22;
						var23 += var25;
						var26 += var28;
					}

					while (--arg0 >= 0) {
						method260(YYTDUXDR.field1435, var19, 0, 0, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, var20, var23, var26, var21, var24, var27);
						arg4 += var29;
						arg5 += var33;
						arg7 += var30;
						arg8 += var34;
						arg2 += YYTDUXDR.field1436;
						var20 += var22;
						var23 += var25;
						var26 += var28;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = field589[arg2];
					while (--arg1 >= 0) {
						method260(YYTDUXDR.field1435, var19, 0, 0, arg2, arg5 >> 16, var50 >> 16, arg8 >> 8, var51 >> 8, var20, var23, var26, var21, var24, var27);
						var50 += var31;
						arg5 += var33;
						var51 += var32;
						arg8 += var34;
						arg2 += YYTDUXDR.field1436;
						var20 += var22;
						var23 += var25;
						var26 += var28;
					}

					while (--arg0 >= 0) {
						method260(YYTDUXDR.field1435, var19, 0, 0, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, var20, var23, var26, var21, var24, var27);
						arg4 += var29;
						arg5 += var33;
						arg7 += var30;
						arg8 += var34;
						arg2 += YYTDUXDR.field1436;
						var20 += var22;
						var23 += var25;
						var26 += var28;
					}
				}
			}
		}
	}

	@ObfuscatedName("DJQPOKKS.a([I[IIIIIIIIIIIIII)V")
	public static final void method260(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
		if (arg5 < arg6) {
			int var15;
			int var16;
			if (field579) {
				var15 = (arg8 - arg7) / (arg6 - arg5);

				if (arg6 > YYTDUXDR.field1442) {
					arg6 = YYTDUXDR.field1442;
				}

				if (arg5 < 0) {
					arg7 -= arg5 * var15;
					arg5 = 0;
				}

				if (arg5 >= arg6) {
					return;
				}

				var16 = arg6 - arg5 >> 3;
				var15 <<= 12;
				arg7 <<= 9;
			} else {
				if (arg6 - arg5 > 7) {
					var16 = arg6 - arg5 >> 3;
					var15 = (arg8 - arg7) * field585[var16] >> 6;
				} else {
					var16 = 0;
					var15 = 0;
				}

				arg7 <<= 9;
			}

			arg4 += arg5;
			int var59;
			if (field578) {
				int var17 = 0;
				int var18 = 0;
				int var19 = arg5 - field583;
				arg9 += (arg12 >> 3) * var19;
				arg10 += (arg13 >> 3) * var19;
				arg11 += (arg14 >> 3) * var19;
				int var20 = arg11 >> 12;
				if (var20 != 0) {
					arg2 = arg9 / var20;
					arg3 = arg10 / var20;

					if (arg2 < 0) {
						arg2 = 0;
					} else if (arg2 > 4032) {
						arg2 = 4032;
					}
				}

				arg9 += arg12;
				arg10 += arg13;
				arg11 += arg14;
				int var21 = arg11 >> 12;
				if (var21 != 0) {
					var17 = arg9 / var21;
					var18 = arg10 / var21;

					if (var17 < 7) {
						var17 = 7;
					} else if (var17 > 4032) {
						var17 = 4032;
					}
				}

				int var22 = var17 - arg2 >> 3;
				int var23 = var18 - arg3 >> 3;
				arg2 += arg7 >> 3 & 0xC0000;
				int var24 = arg7 >> 23;
				if (field580) {
					while (var16-- > 0) {
						var59 = arg4 + 1;
						arg0[arg4] = arg1[(arg2 >> 6) + (arg3 & 0xFC0)] >>> var24;
						arg2 += var22;
						arg3 += var23;
						arg0[var59++] = arg1[(arg2 >> 6) + (arg3 & 0xFC0)] >>> var24;
						arg2 += var22;
						arg3 += var23;
						arg0[var59++] = arg1[(arg2 >> 6) + (arg3 & 0xFC0)] >>> var24;
						arg2 += var22;
						arg3 += var23;
						arg0[var59++] = arg1[(arg2 >> 6) + (arg3 & 0xFC0)] >>> var24;
						arg2 += var22;
						arg3 += var23;
						arg0[var59++] = arg1[(arg2 >> 6) + (arg3 & 0xFC0)] >>> var24;
						arg2 += var22;
						arg3 += var23;
						arg0[var59++] = arg1[(arg2 >> 6) + (arg3 & 0xFC0)] >>> var24;
						arg2 += var22;
						arg3 += var23;
						arg0[var59++] = arg1[(arg2 >> 6) + (arg3 & 0xFC0)] >>> var24;
						arg2 += var22;
						arg3 += var23;
						arg4 = var59 + 1;
						arg0[var59] = arg1[(arg2 >> 6) + (arg3 & 0xFC0)] >>> var24;
						arg2 = var17;
						arg3 = var18;
						arg9 += arg12;
						arg10 += arg13;
						arg11 += arg14;
						int var25 = arg11 >> 12;
						if (var25 != 0) {
							var17 = arg9 / var25;
							var18 = arg10 / var25;

							if (var17 < 7) {
								var17 = 7;
							} else if (var17 > 4032) {
								var17 = 4032;
							}
						}

						var22 = var17 - arg2 >> 3;
						var23 = var18 - arg3 >> 3;
						arg7 += var15;
						arg2 += arg7 >> 3 & 0xC0000;
						var24 = arg7 >> 23;
					}

					int var26 = arg6 - arg5 & 0x7;
					while (var26-- > 0) {
						arg0[arg4++] = arg1[(arg2 >> 6) + (arg3 & 0xFC0)] >>> var24;
						arg2 += var22;
						arg3 += var23;
					}
				} else {
					while (var16-- > 0) {
						int var27;
						if ((var27 = arg1[(arg2 >> 6) + (arg3 & 0xFC0)] >>> var24) != 0) {
							arg0[arg4] = var27;
						}

						var59 = arg4 + 1;
						arg2 += var22;
						arg3 += var23;
						int var28;
						if ((var28 = arg1[(arg2 >> 6) + (arg3 & 0xFC0)] >>> var24) != 0) {
							arg0[var59] = var28;
						}

						var59++;
						arg2 += var22;
						arg3 += var23;
						int var29;
						if ((var29 = arg1[(arg2 >> 6) + (arg3 & 0xFC0)] >>> var24) != 0) {
							arg0[var59] = var29;
						}

						var59++;
						arg2 += var22;
						arg3 += var23;
						int var30;
						if ((var30 = arg1[(arg2 >> 6) + (arg3 & 0xFC0)] >>> var24) != 0) {
							arg0[var59] = var30;
						}

						var59++;
						arg2 += var22;
						arg3 += var23;
						int var31;
						if ((var31 = arg1[(arg2 >> 6) + (arg3 & 0xFC0)] >>> var24) != 0) {
							arg0[var59] = var31;
						}

						var59++;
						arg2 += var22;
						arg3 += var23;
						int var32;
						if ((var32 = arg1[(arg2 >> 6) + (arg3 & 0xFC0)] >>> var24) != 0) {
							arg0[var59] = var32;
						}

						var59++;
						arg2 += var22;
						arg3 += var23;
						int var33;
						if ((var33 = arg1[(arg2 >> 6) + (arg3 & 0xFC0)] >>> var24) != 0) {
							arg0[var59] = var33;
						}

						var59++;
						arg2 += var22;
						arg3 += var23;
						int var34;
						if ((var34 = arg1[(arg2 >> 6) + (arg3 & 0xFC0)] >>> var24) != 0) {
							arg0[var59] = var34;
						}

						arg4 = var59 + 1;
						arg2 = var17;
						arg3 = var18;
						arg9 += arg12;
						arg10 += arg13;
						arg11 += arg14;
						int var35 = arg11 >> 12;
						if (var35 != 0) {
							var17 = arg9 / var35;
							var18 = arg10 / var35;

							if (var17 < 7) {
								var17 = 7;
							} else if (var17 > 4032) {
								var17 = 4032;
							}
						}

						var22 = var17 - arg2 >> 3;
						var23 = var18 - arg3 >> 3;
						arg7 += var15;
						arg2 += arg7 >> 3 & 0xC0000;
						var24 = arg7 >> 23;
					}

					int var36 = arg6 - arg5 & 0x7;
					while (var36-- > 0) {
						int var37;
						if ((var37 = arg1[(arg2 >> 6) + (arg3 & 0xFC0)] >>> var24) != 0) {
							arg0[arg4] = var37;
						}

						arg4++;
						arg2 += var22;
						arg3 += var23;
					}
				}
			} else {
				int var38 = 0;
				int var39 = 0;
				int var40 = arg5 - field583;
				arg9 += (arg12 >> 3) * var40;
				arg10 += (arg13 >> 3) * var40;
				arg11 += (arg14 >> 3) * var40;
				int var41 = arg11 >> 14;
				if (var41 != 0) {
					arg2 = arg9 / var41;
					arg3 = arg10 / var41;

					if (arg2 < 0) {
						arg2 = 0;
					} else if (arg2 > 16256) {
						arg2 = 16256;
					}
				}

				arg9 += arg12;
				arg10 += arg13;
				arg11 += arg14;
				int var42 = arg11 >> 14;
				if (var42 != 0) {
					var38 = arg9 / var42;
					var39 = arg10 / var42;

					if (var38 < 7) {
						var38 = 7;
					} else if (var38 > 16256) {
						var38 = 16256;
					}
				}

				int var43 = var38 - arg2 >> 3;
				int var44 = var39 - arg3 >> 3;
				arg2 += arg7 & 0x600000;
				int var45 = arg7 >> 23;
				if (field580) {
					while (var16-- > 0) {
						var59 = arg4 + 1;
						arg0[arg4] = arg1[(arg2 >> 7) + (arg3 & 0x3F80)] >>> var45;
						arg2 += var43;
						arg3 += var44;
						arg0[var59++] = arg1[(arg2 >> 7) + (arg3 & 0x3F80)] >>> var45;
						arg2 += var43;
						arg3 += var44;
						arg0[var59++] = arg1[(arg2 >> 7) + (arg3 & 0x3F80)] >>> var45;
						arg2 += var43;
						arg3 += var44;
						arg0[var59++] = arg1[(arg2 >> 7) + (arg3 & 0x3F80)] >>> var45;
						arg2 += var43;
						arg3 += var44;
						arg0[var59++] = arg1[(arg2 >> 7) + (arg3 & 0x3F80)] >>> var45;
						arg2 += var43;
						arg3 += var44;
						arg0[var59++] = arg1[(arg2 >> 7) + (arg3 & 0x3F80)] >>> var45;
						arg2 += var43;
						arg3 += var44;
						arg0[var59++] = arg1[(arg2 >> 7) + (arg3 & 0x3F80)] >>> var45;
						arg2 += var43;
						arg3 += var44;
						arg4 = var59 + 1;
						arg0[var59] = arg1[(arg2 >> 7) + (arg3 & 0x3F80)] >>> var45;
						arg2 = var38;
						arg3 = var39;
						arg9 += arg12;
						arg10 += arg13;
						arg11 += arg14;
						int var46 = arg11 >> 14;
						if (var46 != 0) {
							var38 = arg9 / var46;
							var39 = arg10 / var46;

							if (var38 < 7) {
								var38 = 7;
							} else if (var38 > 16256) {
								var38 = 16256;
							}
						}

						var43 = var38 - arg2 >> 3;
						var44 = var39 - arg3 >> 3;
						arg7 += var15;
						arg2 += arg7 & 0x600000;
						var45 = arg7 >> 23;
					}

					int var47 = arg6 - arg5 & 0x7;
					while (var47-- > 0) {
						arg0[arg4++] = arg1[(arg2 >> 7) + (arg3 & 0x3F80)] >>> var45;
						arg2 += var43;
						arg3 += var44;
					}
				} else {
					while (var16-- > 0) {
						int var48;
						if ((var48 = arg1[(arg2 >> 7) + (arg3 & 0x3F80)] >>> var45) != 0) {
							arg0[arg4] = var48;
						}

						var59 = arg4 + 1;
						arg2 += var43;
						arg3 += var44;
						int var49;
						if ((var49 = arg1[(arg2 >> 7) + (arg3 & 0x3F80)] >>> var45) != 0) {
							arg0[var59] = var49;
						}

						var59++;
						arg2 += var43;
						arg3 += var44;
						int var50;
						if ((var50 = arg1[(arg2 >> 7) + (arg3 & 0x3F80)] >>> var45) != 0) {
							arg0[var59] = var50;
						}

						var59++;
						arg2 += var43;
						arg3 += var44;
						int var51;
						if ((var51 = arg1[(arg2 >> 7) + (arg3 & 0x3F80)] >>> var45) != 0) {
							arg0[var59] = var51;
						}

						var59++;
						arg2 += var43;
						arg3 += var44;
						int var52;
						if ((var52 = arg1[(arg2 >> 7) + (arg3 & 0x3F80)] >>> var45) != 0) {
							arg0[var59] = var52;
						}

						var59++;
						arg2 += var43;
						arg3 += var44;
						int var53;
						if ((var53 = arg1[(arg2 >> 7) + (arg3 & 0x3F80)] >>> var45) != 0) {
							arg0[var59] = var53;
						}

						var59++;
						arg2 += var43;
						arg3 += var44;
						int var54;
						if ((var54 = arg1[(arg2 >> 7) + (arg3 & 0x3F80)] >>> var45) != 0) {
							arg0[var59] = var54;
						}

						var59++;
						arg2 += var43;
						arg3 += var44;
						int var55;
						if ((var55 = arg1[(arg2 >> 7) + (arg3 & 0x3F80)] >>> var45) != 0) {
							arg0[var59] = var55;
						}

						arg4 = var59 + 1;
						arg2 = var38;
						arg3 = var39;
						arg9 += arg12;
						arg10 += arg13;
						arg11 += arg14;
						int var56 = arg11 >> 14;
						if (var56 != 0) {
							var38 = arg9 / var56;
							var39 = arg10 / var56;

							if (var38 < 7) {
								var38 = 7;
							} else if (var38 > 16256) {
								var38 = 16256;
							}
						}

						var43 = var38 - arg2 >> 3;
						var44 = var39 - arg3 >> 3;
						arg7 += var15;
						arg2 += arg7 & 0x600000;
						var45 = arg7 >> 23;
					}

					int var57 = arg6 - arg5 & 0x7;
					while (var57-- > 0) {
						int var58;
						if ((var58 = arg1[(arg2 >> 7) + (arg3 & 0x3F80)] >>> var45) != 0) {
							arg0[arg4] = var58;
						}

						arg4++;
						arg2 += var43;
						arg3 += var44;
					}
				}
			}
		}
	}

	static {
		for (int var0 = 1; var0 < 512; var0++) {
			field585[var0] = 32768 / var0;
		}

		for (int var1 = 1; var1 < 2048; var1++) {
			field586[var1] = 0x10000 / var1;
		}

		for (int var2 = 0; var2 < 2048; var2++) {
			field587[var2] = (int) (Math.sin(var2 * 0.0030679615D) * 65536.0D);
			field588[var2] = (int) (Math.cos(var2 * 0.0030679615D) * 65536.0D);
		}
	}
}
