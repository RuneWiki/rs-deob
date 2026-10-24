package deob;

import java.util.Random;

@ObfuscatedName("DIVYVFFL")
public final class DIVYVFFL extends DSAVPBJG {

	@ObfuscatedName("DIVYVFFL.E")
	public byte[][] field553 = new byte[256][];

	@ObfuscatedName("DIVYVFFL.F")
	public int[] field554 = new int[256];

	@ObfuscatedName("DIVYVFFL.G")
	public int[] field555 = new int[256];

	@ObfuscatedName("DIVYVFFL.H")
	public int[] field556 = new int[256];

	@ObfuscatedName("DIVYVFFL.I")
	public int[] field557 = new int[256];

	@ObfuscatedName("DIVYVFFL.J")
	public int[] field558 = new int[256];

	@ObfuscatedName("DIVYVFFL.L")
	public Random field560 = new Random();

	@ObfuscatedName("DIVYVFFL.M")
	public boolean field561 = false;

	@ObfuscatedName("DIVYVFFL.K")
	public int field559;

	public DIVYVFFL(boolean arg0, String arg1, BYZSQZUF arg2) {
		IMUIZRAF var4 = new IMUIZRAF(arg2.method29(arg1 + ".dat", null));
		IMUIZRAF var5 = new IMUIZRAF(arg2.method29("index.dat", null));
		var5.field714 = var4.method240() + 4;
		int var6 = var5.method238();
		if (var6 > 0) {
			var5.field714 += (var6 - 1) * 3;
		}

		for (int var7 = 0; var7 < 256; var7++) {
			field556[var7] = var5.method238();
			field557[var7] = var5.method238();
			int var8 = field554[var7] = var5.method240();
			int var9 = field555[var7] = var5.method240();
			int var10 = var5.method238();
			int var11 = var8 * var9;
			field553[var7] = new byte[var11];
			if (var10 == 0) {
				for (int var12 = 0; var12 < var11; var12++) {
					field553[var7][var12] = var4.method239();
				}
			} else if (var10 == 1) {
				for (int var13 = 0; var13 < var8; var13++) {
					for (int var14 = 0; var14 < var9; var14++) {
						field553[var7][var8 * var14 + var13] = var4.method239();
					}
				}
			}

			if (var9 > field559 && var7 < 128) {
				field559 = var9;
			}

			field556[var7] = 1;
			field558[var7] = var8 + 2;
			int var15 = 0;
			for (int var16 = var9 / 7; var16 < var9; var16++) {
				var15 += field553[var7][var8 * var16];
			}

			if (var15 <= var9 / 7) {
				field558[var7]--;
				field556[var7] = 0;
			}

			int var17 = 0;
			for (int var18 = var9 / 7; var18 < var9; var18++) {
				var17 += field553[var7][var8 * var18 + var8 - 1];
			}

			if (var17 <= var9 / 7) {
				field558[var7]--;
			}
		}

		if (arg0) {
			field558[32] = field558[73];
		} else {
			field558[32] = field558[105];
		}
	}

	@ObfuscatedName("DIVYVFFL.a(Ljava/lang/String;IIII)V")
	public void method175(String arg0, int arg1, int arg2, int arg3) {
		method180(arg3, arg0, arg2 - method179(arg0), arg1);
	}

	@ObfuscatedName("DIVYVFFL.a(IIIILjava/lang/String;)V")
	public void method176(int arg0, int arg1, int arg2, String arg3) {
		method180(arg0, arg3, arg2 - method179(arg3) / 2, arg1);
	}

	@ObfuscatedName("DIVYVFFL.a(Ljava/lang/String;IIZII)V")
	public void method177(String arg0, int arg1, int arg2, boolean arg3, int arg4) {
		method184(arg4, arg0, arg3, arg2, arg1 - method178(arg0) / 2);
	}

	@ObfuscatedName("DIVYVFFL.a(ILjava/lang/String;)I")
	public int method178(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field558[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("DIVYVFFL.a(ZLjava/lang/String;)I")
	public int method179(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field558[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("DIVYVFFL.a(ILjava/lang/String;III)V")
	public void method180(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 != null) {
			arg0 -= field559;
			for (int var5 = 0; var5 < arg1.length(); var5++) {
				char var6 = arg1.charAt(var5);
				if (var6 != ' ') {
					method187(field553[var6], field556[var6] + arg2, field557[var6] + arg0, field554[var6], field555[var6], arg3);
				}

				arg2 += field558[var6];
			}
		}
	}

	@ObfuscatedName("DIVYVFFL.a(IILjava/lang/String;III)V")
	public void method181(int arg0, int arg1, String arg2, int arg3, int arg4) {
		if (arg2 != null) {
			arg3 -= method179(arg2) / 2;
			arg0 -= field559;
			for (int var6 = 0; var6 < arg2.length(); var6++) {
				char var7 = arg2.charAt(var6);
				if (var7 != ' ') {
					method187(field553[var7], field556[var7] + arg3, field557[var7] + arg0 + (int) (Math.sin(arg1 / 5.0D + var6 / 2.0D) * 5.0D), field554[var7], field555[var7], arg4);
				}

				arg3 += field558[var7];
			}
		}
	}

	@ObfuscatedName("DIVYVFFL.a(IBILjava/lang/String;II)V")
	public void method182(int arg0, int arg1, String arg2, int arg3, int arg4) {
		if (arg2 != null) {
			arg3 -= method179(arg2) / 2;
			arg4 -= field559;
			for (int var6 = 0; var6 < arg2.length(); var6++) {
				char var7 = arg2.charAt(var6);
				if (var7 != ' ') {
					method187(field553[var7], field556[var7] + arg3 + (int) (Math.sin(arg1 / 5.0D + var6 / 5.0D) * 5.0D), field557[var7] + arg4 + (int) (Math.sin(arg1 / 5.0D + var6 / 3.0D) * 5.0D), field554[var7], field555[var7], arg0);
				}

				arg3 += field558[var7];
			}
		}
	}

	@ObfuscatedName("DIVYVFFL.a(IILjava/lang/String;IIII)V")
	public void method183(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
		if (arg2 != null) {
			double var7 = 7.0D - arg1 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg3 -= method179(arg2) / 2;
			arg5 -= field559;
			for (int var9 = 0; var9 < arg2.length(); var9++) {
				char var10 = arg2.charAt(var9);
				if (var10 != ' ') {
					method187(field553[var10], field556[var10] + arg3, field557[var10] + arg5 + (int) (Math.sin(var9 / 1.5D + arg0) * var7), field554[var10], field555[var10], arg4);
				}

				arg3 += field558[var10];
			}
		}
	}

	@ObfuscatedName("DIVYVFFL.a(ILjava/lang/String;ZIII)V")
	public void method184(int arg0, String arg1, boolean arg2, int arg3, int arg4) {
		field561 = false;
		int var6 = arg4;
		if (arg1 != null) {
			arg3 -= field559;
			for (int var7 = 0; var7 < arg1.length(); var7++) {
				if (arg1.charAt(var7) == '@' && var7 + 4 < arg1.length() && arg1.charAt(var7 + 4) == '@') {
					int var8 = method186(arg1.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg0 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg1.charAt(var7);
					if (var9 != ' ') {
						if (arg2) {
							method187(field553[var9], field556[var9] + arg4 + 1, field557[var9] + arg3 + 1, field554[var9], field555[var9], 0);
						}

						method187(field553[var9], field556[var9] + arg4, field557[var9] + arg3, field554[var9], field555[var9], arg0);
					}

					arg4 += field558[var9];
				}
			}

			if (field561) {
				DSAVPBJG.method199(0x800000, var6, (int) (field559 * 0.7D) + arg3, arg4 - var6);
			}
		}
	}

	@ObfuscatedName("DIVYVFFL.a(IILjava/lang/String;ZIII)V")
	public void method185(int arg0, int arg1, String arg2, boolean arg3, int arg4, int arg5) {
		if (arg2 != null) {
			field560.setSeed(arg5);
			int var7 = (field560.nextInt() & 0x1F) + 192;
			arg0 -= field559;
			for (int var8 = 0; var8 < arg2.length(); var8++) {
				if (arg2.charAt(var8) == '@' && var8 + 4 < arg2.length() && arg2.charAt(var8 + 4) == '@') {
					int var9 = method186(arg2.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg4 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg2.charAt(var8);
					if (var10 != ' ') {
						if (arg3) {
							method189(field553[var10], 192, 0, field556[var10] + arg1 + 1, field555[var10], field554[var10], field557[var10] + arg0 + 1);
						}

						method189(field553[var10], var7, arg4, field556[var10] + arg1, field555[var10], field554[var10], field557[var10] + arg0);
					}

					arg1 += field558[var10];
					if ((field560.nextInt() & 0x3) == 0) {
						arg1++;
					}
				}
			}
		}
	}

	@ObfuscatedName("DIVYVFFL.b(ILjava/lang/String;)I")
	public int method186(String arg0) {
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
				field561 = true;
			}

			if (arg0.equals("end")) {
				field561 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("DIVYVFFL.a([BIIIII)V")
	public void method187(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = DSAVPBJG.field563 * arg2 + arg1;
		int var8 = DSAVPBJG.field563 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < DSAVPBJG.field565) {
			int var11 = DSAVPBJG.field565 - arg2;
			arg4 -= var11;
			arg2 = DSAVPBJG.field565;
			var10 += arg3 * var11;
			var7 += DSAVPBJG.field563 * var11;
		}

		if (arg2 + arg4 >= DSAVPBJG.field566) {
			arg4 -= arg2 + arg4 + 1 - DSAVPBJG.field566;
		}

		if (arg1 < DSAVPBJG.field567) {
			int var12 = DSAVPBJG.field567 - arg1;
			arg3 -= var12;
			arg1 = DSAVPBJG.field567;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= DSAVPBJG.field568) {
			int var13 = arg1 + arg3 + 1 - DSAVPBJG.field568;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method188(DSAVPBJG.field562, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("DIVYVFFL.a([I[BIIIIIII)V")
	public void method188(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("DIVYVFFL.a(I[BIIIIII)V")
	public void method189(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = DSAVPBJG.field563 * arg6 + arg3;
		int var9 = DSAVPBJG.field563 - arg5;
		int var10 = 0;
		int var11 = 0;
		if (arg6 < DSAVPBJG.field565) {
			int var12 = DSAVPBJG.field565 - arg6;
			arg4 -= var12;
			arg6 = DSAVPBJG.field565;
			var11 += arg5 * var12;
			var8 += DSAVPBJG.field563 * var12;
		}

		if (arg4 + arg6 >= DSAVPBJG.field566) {
			arg4 -= arg4 + arg6 + 1 - DSAVPBJG.field566;
		}

		if (arg3 < DSAVPBJG.field567) {
			int var13 = DSAVPBJG.field567 - arg3;
			arg5 -= var13;
			arg3 = DSAVPBJG.field567;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg3 + arg5 >= DSAVPBJG.field568) {
			int var14 = arg3 + arg5 + 1 - DSAVPBJG.field568;
			arg5 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg5 > 0 && arg4 > 0) {
			method190(var10, arg5, var9, var8, arg2, arg4, arg0, var11, DSAVPBJG.field562, arg1);
		}
	}

	@ObfuscatedName("DIVYVFFL.a(IIIIIII[BI[II)V")
	public void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int[] arg8, int arg9) {
		arg4 = ((arg4 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg4 & 0xFF00) * arg9 & 0xFF0000) >> 8;
		arg9 = 256 - arg9;
		for (int var11 = -arg5; var11 < 0; var11++) {
			for (int var12 = -arg1; var12 < 0; var12++) {
				if (arg6[arg7++] == 0) {
					arg3++;
				} else {
					int var13 = arg8[arg3];
					arg8[arg3++] = (((var13 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((var13 & 0xFF00) * arg9 & 0xFF0000) >> 8) + arg4;
				}
			}

			arg3 += arg2;
			arg7 += arg0;
		}
	}
}
