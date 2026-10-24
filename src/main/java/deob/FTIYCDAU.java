package deob;

import java.util.Random;

@ObfuscatedName("FTIYCDAU")
public final class FTIYCDAU extends BDJXDJBP {

	@ObfuscatedName("FTIYCDAU.C")
	public byte[][] field754 = new byte[256][];

	@ObfuscatedName("FTIYCDAU.D")
	public int[] field755 = new int[256];

	@ObfuscatedName("FTIYCDAU.E")
	public int[] field756 = new int[256];

	@ObfuscatedName("FTIYCDAU.F")
	public int[] field757 = new int[256];

	@ObfuscatedName("FTIYCDAU.G")
	public int[] field758 = new int[256];

	@ObfuscatedName("FTIYCDAU.H")
	public int[] field759 = new int[256];

	@ObfuscatedName("FTIYCDAU.J")
	public Random field761 = new Random();

	@ObfuscatedName("FTIYCDAU.K")
	public boolean field762 = false;

	@ObfuscatedName("FTIYCDAU.I")
	public int field760;

	public FTIYCDAU(String arg0, HBJEXSJX arg1, boolean arg2) {
		EYMNCFMK var4 = new EYMNCFMK(arg1.method348(arg0 + ".dat", null));
		EYMNCFMK var5 = new EYMNCFMK(arg1.method348("index.dat", null));
		boolean var6 = true;
		var5.field679 = var4.method241() + 4;
		int var7 = var5.method239();
		if (var7 > 0) {
			var5.field679 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field757[var8] = var5.method239();
			field758[var8] = var5.method239();
			int var10 = field755[var8] = var5.method241();
			int var11 = field756[var8] = var5.method241();
			int var12 = var5.method239();
			int var13 = var10 * var11;
			field754[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field754[var8][var14] = var4.method240();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field754[var8][var10 * var16 + var15] = var4.method240();
					}
				}
			}

			if (var11 > field760 && var8 < 128) {
				field760 = var11;
			}

			field757[var8] = 1;
			field759[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field754[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field759[var8]--;
				field757[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field754[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field759[var8]--;
			}
		}

		if (arg2) {
			field759[32] = field759[73];
		} else {
			field759[32] = field759[105];
		}
	}

	@ObfuscatedName("FTIYCDAU.a(Ljava/lang/String;IIII)V")
	public void method330(String arg0, int arg1, int arg2, int arg3) {
		method335(arg2 - method334(arg0), arg1, arg0, arg3);
	}

	@ObfuscatedName("FTIYCDAU.a(BIILjava/lang/String;I)V")
	public void method331(int arg0, int arg1, String arg2, int arg3) {
		method335(arg3 - method334(arg2) / 2, arg0, arg2, arg1);
	}

	@ObfuscatedName("FTIYCDAU.a(IZIIILjava/lang/String;)V")
	public void method332(int arg0, boolean arg1, int arg2, int arg3, String arg4) {
		method339(arg1, arg4, arg2, arg0, arg3 - method333(arg4) / 2);
	}

	@ObfuscatedName("FTIYCDAU.a(Ljava/lang/String;Z)I")
	public int method333(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field759[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("FTIYCDAU.a(BLjava/lang/String;)I")
	public int method334(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field759[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("FTIYCDAU.a(IILjava/lang/String;II)V")
	public void method335(int arg0, int arg1, String arg2, int arg3) {
		if (arg2 != null) {
			arg1 -= field760;
			for (int var5 = 0; var5 < arg2.length(); var5++) {
				char var6 = arg2.charAt(var5);
				if (var6 != ' ') {
					method342(field754[var6], field757[var6] + arg0, field758[var6] + arg1, field755[var6], field756[var6], arg3);
				}

				arg0 += field759[var6];
			}
		}
	}

	@ObfuscatedName("FTIYCDAU.a(IILjava/lang/String;III)V")
	public void method336(int arg0, String arg1, int arg2, int arg3, int arg4) {
		if (arg1 != null) {
			arg4 -= method334(arg1) / 2;
			arg3 -= field760;
			for (int var6 = 0; var6 < arg1.length(); var6++) {
				char var7 = arg1.charAt(var6);
				if (var7 != ' ') {
					method342(field754[var7], field757[var7] + arg4, field758[var7] + arg3 + (int) (Math.sin(arg2 / 5.0D + var6 / 2.0D) * 5.0D), field755[var7], field756[var7], arg0);
				}

				arg4 += field759[var7];
			}
		}
	}

	@ObfuscatedName("FTIYCDAU.b(IILjava/lang/String;III)V")
	public void method337(int arg0, String arg1, int arg2, int arg3, int arg4) {
		if (arg1 != null) {
			arg3 -= method334(arg1) / 2;
			arg2 -= field760;
			for (int var6 = 0; var6 < arg1.length(); var6++) {
				char var7 = arg1.charAt(var6);
				if (var7 != ' ') {
					method342(field754[var7], field757[var7] + arg3 + (int) (Math.sin(arg0 / 5.0D + var6 / 5.0D) * 5.0D), field758[var7] + arg2 + (int) (Math.sin(arg0 / 5.0D + var6 / 3.0D) * 5.0D), field755[var7], field756[var7], arg4);
				}

				arg3 += field759[var7];
			}
		}
	}

	@ObfuscatedName("FTIYCDAU.a(Ljava/lang/String;IZIIII)V")
	public void method338(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 != null) {
			double var7 = 7.0D - arg5 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg3 -= method334(arg0) / 2;
			arg2 -= field760;
			for (int var9 = 0; var9 < arg0.length(); var9++) {
				char var10 = arg0.charAt(var9);
				if (var10 != ' ') {
					method342(field754[var10], field757[var10] + arg3, field758[var10] + arg2 + (int) (Math.sin(var9 / 1.5D + arg4) * var7), field755[var10], field756[var10], arg1);
				}

				arg3 += field759[var10];
			}
		}
	}

	@ObfuscatedName("FTIYCDAU.a(ZLjava/lang/String;IIII)V")
	public void method339(boolean arg0, String arg1, int arg2, int arg3, int arg4) {
		field762 = false;
		int var6 = arg4;
		if (arg1 != null) {
			arg2 -= field760;
			for (int var7 = 0; var7 < arg1.length(); var7++) {
				if (arg1.charAt(var7) == '@' && var7 + 4 < arg1.length() && arg1.charAt(var7 + 4) == '@') {
					int var8 = method341(arg1.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg3 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg1.charAt(var7);
					if (var9 != ' ') {
						if (arg0) {
							method342(field754[var9], field757[var9] + arg4 + 1, field758[var9] + arg2 + 1, field755[var9], field756[var9], 0);
						}

						method342(field754[var9], field757[var9] + arg4, field758[var9] + arg2, field755[var9], field756[var9], arg3);
					}

					arg4 += field759[var9];
				}
			}

			if (field762) {
				BDJXDJBP.method32((int) (field760 * 0.7D) + arg2, 0x800000, var6, arg4 - var6);
			}
		}
	}

	@ObfuscatedName("FTIYCDAU.a(Ljava/lang/String;IZIZII)V")
	public void method340(String arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
		if (arg0 != null) {
			field761.setSeed(arg5);
			int var7 = (field761.nextInt() & 0x1F) + 192;
			arg1 -= field760;
			for (int var8 = 0; var8 < arg0.length(); var8++) {
				if (arg0.charAt(var8) == '@' && var8 + 4 < arg0.length() && arg0.charAt(var8 + 4) == '@') {
					int var9 = method341(arg0.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg3 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg0.charAt(var8);
					if (var10 != ' ') {
						if (arg2) {
							method344(field758[var10] + arg1 + 1, field757[var10] + arg4 + 1, 0, field756[var10], field754[var10], field755[var10], 192);
						}

						method344(field758[var10] + arg1, field757[var10] + arg4, arg3, field756[var10], field754[var10], field755[var10], var7);
					}

					arg4 += field759[var10];
					if ((field761.nextInt() & 0x3) == 0) {
						arg4++;
					}
				}
			}
		}
	}

	@ObfuscatedName("FTIYCDAU.a(ILjava/lang/String;)I")
	public int method341(String arg0) {
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
				field762 = true;
			}

			if (arg0.equals("end")) {
				field762 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("FTIYCDAU.a([BIIIII)V")
	public void method342(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = BDJXDJBP.field47 * arg2 + arg1;
		int var8 = BDJXDJBP.field47 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < BDJXDJBP.field49) {
			int var11 = BDJXDJBP.field49 - arg2;
			arg4 -= var11;
			arg2 = BDJXDJBP.field49;
			var10 += arg3 * var11;
			var7 += BDJXDJBP.field47 * var11;
		}

		if (arg2 + arg4 >= BDJXDJBP.field50) {
			arg4 -= arg2 + arg4 + 1 - BDJXDJBP.field50;
		}

		if (arg1 < BDJXDJBP.field51) {
			int var12 = BDJXDJBP.field51 - arg1;
			arg3 -= var12;
			arg1 = BDJXDJBP.field51;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= BDJXDJBP.field52) {
			int var13 = arg1 + arg3 + 1 - BDJXDJBP.field52;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method343(BDJXDJBP.field46, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("FTIYCDAU.a([I[BIIIIIII)V")
	public void method343(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("FTIYCDAU.a(IIII[BIII)V")
	public void method344(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
		int var8 = BDJXDJBP.field47 * arg0 + arg1;
		int var9 = BDJXDJBP.field47 - arg5;
		int var10 = 0;
		int var11 = 0;
		if (arg0 < BDJXDJBP.field49) {
			int var12 = BDJXDJBP.field49 - arg0;
			arg3 -= var12;
			arg0 = BDJXDJBP.field49;
			var11 += arg5 * var12;
			var8 += BDJXDJBP.field47 * var12;
		}

		if (arg0 + arg3 >= BDJXDJBP.field50) {
			arg3 -= arg0 + arg3 + 1 - BDJXDJBP.field50;
		}

		if (arg1 < BDJXDJBP.field51) {
			int var13 = BDJXDJBP.field51 - arg1;
			arg5 -= var13;
			arg1 = BDJXDJBP.field51;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg1 + arg5 >= BDJXDJBP.field52) {
			int var14 = arg1 + arg5 + 1 - BDJXDJBP.field52;
			arg5 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg5 > 0 && arg3 > 0) {
			method345(var9, var10, var11, arg4, arg5, arg3, arg6, BDJXDJBP.field46, arg2, var8);
		}
	}

	@ObfuscatedName("FTIYCDAU.a(III[BIIZI[III)V")
	public void method345(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
		arg8 = ((arg8 & 0xFF00FF) * arg6 & 0xFF00FF00) + ((arg8 & 0xFF00) * arg6 & 0xFF0000) >> 8;
		arg6 = 256 - arg6;
		for (int var11 = -arg5; var11 < 0; var11++) {
			for (int var12 = -arg4; var12 < 0; var12++) {
				if (arg3[arg2++] == 0) {
					arg9++;
				} else {
					int var13 = arg7[arg9];
					arg7[arg9++] = (((var13 & 0xFF00FF) * arg6 & 0xFF00FF00) + ((var13 & 0xFF00) * arg6 & 0xFF0000) >> 8) + arg8;
				}
			}

			arg9 += arg0;
			arg2 += arg1;
		}
	}
}
