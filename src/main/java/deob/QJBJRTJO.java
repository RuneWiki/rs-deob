package deob;

import java.util.Random;

@ObfuscatedName("QJBJRTJO")
public final class QJBJRTJO extends FBOVVAQK {

	@ObfuscatedName("QJBJRTJO.D")
	public byte[][] field972 = new byte[256][];

	@ObfuscatedName("QJBJRTJO.E")
	public int[] field973 = new int[256];

	@ObfuscatedName("QJBJRTJO.F")
	public int[] field974 = new int[256];

	@ObfuscatedName("QJBJRTJO.G")
	public int[] field975 = new int[256];

	@ObfuscatedName("QJBJRTJO.H")
	public int[] field976 = new int[256];

	@ObfuscatedName("QJBJRTJO.I")
	public int[] field977 = new int[256];

	@ObfuscatedName("QJBJRTJO.K")
	public Random field979 = new Random();

	@ObfuscatedName("QJBJRTJO.L")
	public boolean field980 = false;

	@ObfuscatedName("QJBJRTJO.J")
	public int field978;

	public QJBJRTJO(HRXSNEYZ arg0, String arg1, boolean arg2) {
		JHKSAGUC var4 = new JHKSAGUC(arg0.method289(arg1 + ".dat", null));
		JHKSAGUC var5 = new JHKSAGUC(arg0.method289("index.dat", null));
		boolean var6 = true;
		var5.field752 = var4.method308() + 4;
		int var7 = var5.method306();
		if (var7 > 0) {
			var5.field752 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field975[var8] = var5.method306();
			field976[var8] = var5.method306();
			int var10 = field973[var8] = var5.method308();
			int var11 = field974[var8] = var5.method308();
			int var12 = var5.method306();
			int var13 = var10 * var11;
			field972[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field972[var8][var14] = var4.method307();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field972[var8][var10 * var16 + var15] = var4.method307();
					}
				}
			}

			if (var11 > field978 && var8 < 128) {
				field978 = var11;
			}

			field975[var8] = 1;
			field977[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field972[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field977[var8]--;
				field975[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field972[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field977[var8]--;
			}
		}

		if (arg2) {
			field977[32] = field977[73];
		} else {
			field977[32] = field977[105];
		}
	}

	@ObfuscatedName("QJBJRTJO.a(IILjava/lang/String;II)V")
	public void method417(int arg0, String arg1, int arg2, int arg3) {
		method422(arg3, arg1, arg0 - method421(arg1), arg2);
	}

	@ObfuscatedName("QJBJRTJO.b(IILjava/lang/String;II)V")
	public void method418(int arg0, int arg1, String arg2, int arg3) {
		method422(arg3, arg2, arg1 - method421(arg2) / 2, arg0);
	}

	@ObfuscatedName("QJBJRTJO.a(ZLjava/lang/String;IIII)V")
	public void method419(boolean arg0, String arg1, int arg2, int arg3, int arg4) {
		method426(arg1, arg0, arg2 - method420(arg1) / 2, arg3, arg4);
	}

	@ObfuscatedName("QJBJRTJO.a(Ljava/lang/String;I)I")
	public int method420(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field977[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("QJBJRTJO.a(ILjava/lang/String;)I")
	public int method421(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field977[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("QJBJRTJO.a(IBLjava/lang/String;II)V")
	public void method422(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 != null) {
			arg3 -= field978;
			for (int var5 = 0; var5 < arg1.length(); var5++) {
				char var6 = arg1.charAt(var5);
				if (var6 != ' ') {
					method429(field972[var6], field975[var6] + arg2, field976[var6] + arg3, field973[var6], field974[var6], arg0);
				}

				arg2 += field977[var6];
			}
		}
	}

	@ObfuscatedName("QJBJRTJO.a(IILjava/lang/String;IIZ)V")
	public void method423(int arg0, int arg1, String arg2, int arg3, int arg4) {
		if (arg2 != null) {
			arg4 -= method421(arg2) / 2;
			arg1 -= field978;
			for (int var6 = 0; var6 < arg2.length(); var6++) {
				char var7 = arg2.charAt(var6);
				if (var7 != ' ') {
					method429(field972[var7], field975[var7] + arg4, field976[var7] + arg1 + (int) (Math.sin(arg3 / 5.0D + var6 / 2.0D) * 5.0D), field973[var7], field974[var7], arg0);
				}

				arg4 += field977[var7];
			}
		}
	}

	@ObfuscatedName("QJBJRTJO.a(IIIIILjava/lang/String;)V")
	public void method424(int arg0, int arg1, int arg2, int arg3, String arg4) {
		if (arg4 != null) {
			arg1 -= method421(arg4) / 2;
			arg0 -= field978;
			for (int var6 = 0; var6 < arg4.length(); var6++) {
				char var7 = arg4.charAt(var6);
				if (var7 != ' ') {
					method429(field972[var7], field975[var7] + arg1 + (int) (Math.sin(arg3 / 5.0D + var6 / 5.0D) * 5.0D), field976[var7] + arg0 + (int) (Math.sin(arg3 / 5.0D + var6 / 3.0D) * 5.0D), field973[var7], field974[var7], arg2);
				}

				arg1 += field977[var7];
			}
		}
	}

	@ObfuscatedName("QJBJRTJO.a(IIIIILjava/lang/String;I)V")
	public void method425(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
		if (arg5 != null) {
			double var7 = 7.0D - arg3 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg1 -= method421(arg5) / 2;
			arg2 -= field978;
			for (int var9 = 0; var9 < arg5.length(); var9++) {
				char var10 = arg5.charAt(var9);
				if (var10 != ' ') {
					method429(field972[var10], field975[var10] + arg1, field976[var10] + arg2 + (int) (Math.sin(var9 / 1.5D + arg4) * var7), field973[var10], field974[var10], arg0);
				}

				arg1 += field977[var10];
			}
		}
	}

	@ObfuscatedName("QJBJRTJO.a(Ljava/lang/String;ZZIII)V")
	public void method426(String arg0, boolean arg1, int arg2, int arg3, int arg4) {
		field980 = false;
		int var6 = arg2;
		if (arg0 != null) {
			arg4 -= field978;
			for (int var7 = 0; var7 < arg0.length(); var7++) {
				if (arg0.charAt(var7) == '@' && var7 + 4 < arg0.length() && arg0.charAt(var7 + 4) == '@') {
					int var8 = method428(arg0.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg3 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg0.charAt(var7);
					if (var9 != ' ') {
						if (arg1) {
							method429(field972[var9], field975[var9] + arg2 + 1, field976[var9] + arg4 + 1, field973[var9], field974[var9], 0);
						}

						method429(field972[var9], field975[var9] + arg2, field976[var9] + arg4, field973[var9], field974[var9], arg3);
					}

					arg2 += field977[var9];
				}
			}

			if (field980) {
				FBOVVAQK.method238(arg2 - var6, 0x800000, var6, (int) (field978 * 0.7D) + arg4);
			}
		}
	}

	@ObfuscatedName("QJBJRTJO.a(ZLjava/lang/String;IBIII)V")
	public void method427(boolean arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 != null) {
			field979.setSeed(arg3);
			int var7 = (field979.nextInt() & 0x1F) + 192;
			arg2 -= field978;
			for (int var8 = 0; var8 < arg1.length(); var8++) {
				if (arg1.charAt(var8) == '@' && var8 + 4 < arg1.length() && arg1.charAt(var8 + 4) == '@') {
					int var9 = method428(arg1.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg4 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg1.charAt(var8);
					if (var10 != ' ') {
						if (arg0) {
							method431(field975[var10] + arg5 + 1, field976[var10] + arg2 + 1, field972[var10], field974[var10], field973[var10], 0, 192);
						}

						method431(field975[var10] + arg5, field976[var10] + arg2, field972[var10], field974[var10], field973[var10], arg4, var7);
					}

					arg5 += field977[var10];
					if ((field979.nextInt() & 0x3) == 0) {
						arg5++;
					}
				}
			}
		}
	}

	@ObfuscatedName("QJBJRTJO.b(ILjava/lang/String;)I")
	public int method428(String arg0) {
		if (arg0.equals("red")) {
			return 0xFF0000;
		} else if (arg0.equals("gre")) {
			return 0xFF00;
		} else if (arg0.equals("blu")) {
			return 255;
		} else if (arg0.equals("yel")) {
			return 0xFFFF00;
		} else if (arg0.equals("cya")) {
			return 0xFFFF;
		} else if (arg0.equals("mag")) {
			return 0xFF00FF;
		} else if (arg0.equals("whi")) {
			return 0xFFFFFF;
		} else if (arg0.equals("bla")) {
			return 0;
		} else if (arg0.equals("lre")) {
			return 0xFF9040;
		} else if (arg0.equals("dre")) {
			return 0x800000;
		} else if (arg0.equals("dbl")) {
			return 128;
		} else if (arg0.equals("or1")) {
			return 0xFFB000;
		} else if (arg0.equals("or2")) {
			return 0xFF7000;
		} else if (arg0.equals("or3")) {
			return 0xFF3000;
		} else if (arg0.equals("gr1")) {
			return 0xC0FF00;
		} else if (arg0.equals("gr2")) {
			return 0x80FF00;
		} else if (arg0.equals("gr3")) {
			return 0x40FF00;
		} else {
			if (arg0.equals("str")) {
				field980 = true;
			}

			if (arg0.equals("end")) {
				field980 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("QJBJRTJO.a([BIIIII)V")
	public void method429(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = FBOVVAQK.field592 * arg2 + arg1;
		int var8 = FBOVVAQK.field592 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < FBOVVAQK.field594) {
			int var11 = FBOVVAQK.field594 - arg2;
			arg4 -= var11;
			arg2 = FBOVVAQK.field594;
			var10 += arg3 * var11;
			var7 += FBOVVAQK.field592 * var11;
		}

		if (arg2 + arg4 >= FBOVVAQK.field595) {
			arg4 -= arg2 + arg4 + 1 - FBOVVAQK.field595;
		}

		if (arg1 < FBOVVAQK.field596) {
			int var12 = FBOVVAQK.field596 - arg1;
			arg3 -= var12;
			arg1 = FBOVVAQK.field596;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= FBOVVAQK.field597) {
			int var13 = arg1 + arg3 + 1 - FBOVVAQK.field597;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method430(FBOVVAQK.field591, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("QJBJRTJO.a([I[BIIIIIII)V")
	public void method430(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int var11 = -arg6; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}

				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}

				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}

				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}

			for (int var13 = arg5; var13 < 0; var13++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}

			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("QJBJRTJO.a(II[BIZIII)V")
	public void method431(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = FBOVVAQK.field592 * arg1 + arg0;
		int var9 = FBOVVAQK.field592 - arg4;
		int var10 = 0;
		int var11 = 0;
		if (arg1 < FBOVVAQK.field594) {
			int var12 = FBOVVAQK.field594 - arg1;
			arg3 -= var12;
			arg1 = FBOVVAQK.field594;
			var11 += arg4 * var12;
			var8 += FBOVVAQK.field592 * var12;
		}

		if (arg1 + arg3 >= FBOVVAQK.field595) {
			arg3 -= arg1 + arg3 + 1 - FBOVVAQK.field595;
		}

		if (arg0 < FBOVVAQK.field596) {
			int var13 = FBOVVAQK.field596 - arg0;
			arg4 -= var13;
			arg0 = FBOVVAQK.field596;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg0 + arg4 >= FBOVVAQK.field597) {
			int var14 = arg0 + arg4 + 1 - FBOVVAQK.field597;
			arg4 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg4 > 0 && arg3 > 0) {
			method432(arg2, var8, var10, arg6, FBOVVAQK.field591, arg3, arg5, arg4, var11, var9);
		}
	}

	@ObfuscatedName("QJBJRTJO.a([BIIIB[IIIIII)V")
	public void method432(byte[] arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		arg6 = ((arg6 & 0xFF00FF) * arg3 & 0xFF00FF00) + ((arg6 & 0xFF00) * arg3 & 0xFF0000) >> 8;
		arg3 = 256 - arg3;
		for (int var11 = -arg5; var11 < 0; var11++) {
			for (int var12 = -arg7; var12 < 0; var12++) {
				if (arg0[arg8++] == 0) {
					arg1++;
				} else {
					int var13 = arg4[arg1];
					arg4[arg1++] = (((var13 & 0xFF00FF) * arg3 & 0xFF00FF00) + ((var13 & 0xFF00) * arg3 & 0xFF0000) >> 8) + arg6;
				}
			}

			arg1 += arg9;
			arg8 += arg2;
		}
	}
}
