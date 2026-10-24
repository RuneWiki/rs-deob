package deob;

import java.util.Random;

@ObfuscatedName("GCURPWTI")
public final class GCURPWTI extends NQLGXPRA {

	@ObfuscatedName("GCURPWTI.z")
	public byte[][] field670 = new byte[256][];

	@ObfuscatedName("GCURPWTI.A")
	public int[] field671 = new int[256];

	@ObfuscatedName("GCURPWTI.B")
	public int[] field672 = new int[256];

	@ObfuscatedName("GCURPWTI.C")
	public int[] field673 = new int[256];

	@ObfuscatedName("GCURPWTI.D")
	public int[] field674 = new int[256];

	@ObfuscatedName("GCURPWTI.E")
	public int[] field675 = new int[256];

	@ObfuscatedName("GCURPWTI.G")
	public Random field677 = new Random();

	@ObfuscatedName("GCURPWTI.H")
	public boolean field678 = false;

	@ObfuscatedName("GCURPWTI.F")
	public int field676;

	public GCURPWTI(INOFEYKQ arg0, boolean arg1, String arg2) {
		NHEPCMLW var4 = new NHEPCMLW(arg0.method277(arg2 + ".dat", null));
		NHEPCMLW var5 = new NHEPCMLW(arg0.method277("index.dat", null));
		boolean var6 = true;
		var5.field965 = var4.method351() + 4;
		int var7 = var5.method349();
		if (var7 > 0) {
			var5.field965 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field673[var8] = var5.method349();
			field674[var8] = var5.method349();
			int var10 = field671[var8] = var5.method351();
			int var11 = field672[var8] = var5.method351();
			int var12 = var5.method349();
			int var13 = var10 * var11;
			field670[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field670[var8][var14] = var4.method350();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field670[var8][var10 * var16 + var15] = var4.method350();
					}
				}
			}

			if (var11 > field676 && var8 < 128) {
				field676 = var11;
			}

			field673[var8] = 1;
			field675[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field670[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field675[var8]--;
				field673[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field670[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field675[var8]--;
			}
		}

		if (arg1) {
			field675[32] = field675[73];
		} else {
			field675[32] = field675[105];
		}
	}

	@ObfuscatedName("GCURPWTI.a(IZILjava/lang/String;I)V")
	public void method211(int arg0, int arg1, String arg2, int arg3) {
		method216(arg2, arg0 - method215(arg2), arg1, arg3);
	}

	@ObfuscatedName("GCURPWTI.a(IILjava/lang/String;BI)V")
	public void method212(int arg0, int arg1, String arg2, int arg3) {
		method216(arg2, arg1 - method215(arg2) / 2, arg3, arg0);
	}

	@ObfuscatedName("GCURPWTI.a(IZZIILjava/lang/String;)V")
	public void method213(int arg0, boolean arg1, int arg2, int arg3, String arg4) {
		method220(arg3, arg4, arg1, arg0, arg2 - method214(arg4) / 2);
	}

	@ObfuscatedName("GCURPWTI.a(ILjava/lang/String;)I")
	public int method214(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field675[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("GCURPWTI.a(Ljava/lang/String;B)I")
	public int method215(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field675[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("GCURPWTI.a(Ljava/lang/String;IBII)V")
	public void method216(String arg0, int arg1, int arg2, int arg3) {
		if (arg0 != null) {
			arg2 -= field676;
			for (int var5 = 0; var5 < arg0.length(); var5++) {
				char var6 = arg0.charAt(var5);
				if (var6 != ' ') {
					method223(field670[var6], field673[var6] + arg1, field674[var6] + arg2, field671[var6], field672[var6], arg3);
				}

				arg1 += field675[var6];
			}
		}
	}

	@ObfuscatedName("GCURPWTI.a(IIIIILjava/lang/String;)V")
	public void method217(int arg0, int arg1, int arg2, int arg3, String arg4) {
		if (arg4 != null) {
			arg3 -= method215(arg4) / 2;
			arg1 -= field676;
			for (int var6 = 0; var6 < arg4.length(); var6++) {
				char var7 = arg4.charAt(var6);
				if (var7 != ' ') {
					method223(field670[var7], field673[var7] + arg3, field674[var7] + arg1 + (int) (Math.sin(arg0 / 5.0D + var6 / 2.0D) * 5.0D), field671[var7], field672[var7], arg2);
				}

				arg3 += field675[var7];
			}
		}
	}

	@ObfuscatedName("GCURPWTI.a(Ljava/lang/String;IIIII)V")
	public void method218(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg1 -= method215(arg0) / 2;
			arg2 -= field676;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method223(field670[var7], field673[var7] + arg1 + (int) (Math.sin(arg3 / 5.0D + var6 / 5.0D) * 5.0D), field674[var7] + arg2 + (int) (Math.sin(arg3 / 5.0D + var6 / 3.0D) * 5.0D), field671[var7], field672[var7], arg4);
				}

				arg1 += field675[var7];
			}
		}
	}

	@ObfuscatedName("GCURPWTI.a(IIIIZLjava/lang/String;I)V")
	public void method219(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
		if (arg4 != null) {
			double var7 = 7.0D - arg0 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg2 -= method215(arg4) / 2;
			arg5 -= field676;
			for (int var9 = 0; var9 < arg4.length(); var9++) {
				char var10 = arg4.charAt(var9);
				if (var10 != ' ') {
					method223(field670[var10], field673[var10] + arg2, field674[var10] + arg5 + (int) (Math.sin(var9 / 1.5D + arg1) * var7), field671[var10], field672[var10], arg3);
				}

				arg2 += field675[var10];
			}
		}
	}

	@ObfuscatedName("GCURPWTI.a(ILjava/lang/String;ZZII)V")
	public void method220(int arg0, String arg1, boolean arg2, int arg3, int arg4) {
		field678 = false;
		int var6 = arg4;
		if (arg1 != null) {
			arg0 -= field676;
			for (int var7 = 0; var7 < arg1.length(); var7++) {
				if (arg1.charAt(var7) == '@' && var7 + 4 < arg1.length() && arg1.charAt(var7 + 4) == '@') {
					int var8 = method222(arg1.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg3 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg1.charAt(var7);
					if (var9 != ' ') {
						if (arg2) {
							method223(field670[var9], field673[var9] + arg4 + 1, field674[var9] + arg0 + 1, field671[var9], field672[var9], 0);
						}

						method223(field670[var9], field673[var9] + arg4, field674[var9] + arg0, field671[var9], field672[var9], arg3);
					}

					arg4 += field675[var9];
				}
			}

			if (field678) {
				NQLGXPRA.method396((int) (field676 * 0.7D) + arg0, 0x800000, var6, arg4 - var6);
			}
		}
	}

	@ObfuscatedName("GCURPWTI.a(IIZIZILjava/lang/String;)V")
	public void method221(int arg0, int arg1, int arg2, boolean arg3, int arg4, String arg5) {
		if (arg5 != null) {
			field677.setSeed(arg1);
			int var7 = (field677.nextInt() & 0x1F) + 192;
			arg0 -= field676;
			for (int var8 = 0; var8 < arg5.length(); var8++) {
				if (arg5.charAt(var8) == '@' && var8 + 4 < arg5.length() && arg5.charAt(var8 + 4) == '@') {
					int var9 = method222(arg5.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg2 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg5.charAt(var8);
					if (var10 != ' ') {
						if (arg3) {
							method225(field674[var10] + arg0 + 1, field672[var10], 192, field670[var10], 0, field671[var10], field673[var10] + arg4 + 1);
						}

						method225(field674[var10] + arg0, field672[var10], var7, field670[var10], arg2, field671[var10], field673[var10] + arg4);
					}

					arg4 += field675[var10];
					if ((field677.nextInt() & 0x3) == 0) {
						arg4++;
					}
				}
			}
		}
	}

	@ObfuscatedName("GCURPWTI.a(Ljava/lang/String;I)I")
	public int method222(String arg0) {
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
				field678 = true;
			}

			if (arg0.equals("end")) {
				field678 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("GCURPWTI.a([BIIIII)V")
	public void method223(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = NQLGXPRA.field978 * arg2 + arg1;
		int var8 = NQLGXPRA.field978 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < NQLGXPRA.field980) {
			int var11 = NQLGXPRA.field980 - arg2;
			arg4 -= var11;
			arg2 = NQLGXPRA.field980;
			var10 += arg3 * var11;
			var7 += NQLGXPRA.field978 * var11;
		}

		if (arg2 + arg4 >= NQLGXPRA.field981) {
			arg4 -= arg2 + arg4 + 1 - NQLGXPRA.field981;
		}

		if (arg1 < NQLGXPRA.field982) {
			int var12 = NQLGXPRA.field982 - arg1;
			arg3 -= var12;
			arg1 = NQLGXPRA.field982;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= NQLGXPRA.field983) {
			int var13 = arg1 + arg3 + 1 - NQLGXPRA.field983;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method224(NQLGXPRA.field977, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("GCURPWTI.a([I[BIIIIIII)V")
	public void method224(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("GCURPWTI.a(III[BBIII)V")
	public void method225(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
		int var8 = NQLGXPRA.field978 * arg0 + arg6;
		int var9 = NQLGXPRA.field978 - arg5;
		int var10 = 0;
		int var11 = 0;
		if (arg0 < NQLGXPRA.field980) {
			int var12 = NQLGXPRA.field980 - arg0;
			arg1 -= var12;
			arg0 = NQLGXPRA.field980;
			var11 += arg5 * var12;
			var8 += NQLGXPRA.field978 * var12;
		}

		if (arg0 + arg1 >= NQLGXPRA.field981) {
			arg1 -= arg0 + arg1 + 1 - NQLGXPRA.field981;
		}

		if (arg6 < NQLGXPRA.field982) {
			int var13 = NQLGXPRA.field982 - arg6;
			arg5 -= var13;
			arg6 = NQLGXPRA.field982;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg5 + arg6 >= NQLGXPRA.field983) {
			int var14 = arg5 + arg6 + 1 - NQLGXPRA.field983;
			arg5 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg5 > 0 && arg1 > 0) {
			method226(var10, var8, arg5, arg3, arg1, arg4, var9, arg2, NQLGXPRA.field977, var11);
		}
	}

	@ObfuscatedName("GCURPWTI.a(III[BIIII[IZI)V")
	public void method226(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
		arg5 = ((arg5 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((arg5 & 0xFF00) * arg7 & 0xFF0000) >> 8;
		arg7 = 256 - arg7;
		for (int var11 = -arg4; var11 < 0; var11++) {
			for (int var12 = -arg2; var12 < 0; var12++) {
				if (arg3[arg9++] == 0) {
					arg1++;
				} else {
					int var13 = arg8[arg1];
					arg8[arg1++] = (((var13 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((var13 & 0xFF00) * arg7 & 0xFF0000) >> 8) + arg5;
				}
			}

			arg1 += arg6;
			arg9 += arg0;
		}
	}
}
