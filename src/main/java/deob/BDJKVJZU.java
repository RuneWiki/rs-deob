package deob;

import java.util.Random;

@ObfuscatedName("BDJKVJZU")
public final class BDJKVJZU extends CXMSQZVC {

	@ObfuscatedName("BDJKVJZU.E")
	public byte[][] field36 = new byte[256][];

	@ObfuscatedName("BDJKVJZU.F")
	public int[] field37 = new int[256];

	@ObfuscatedName("BDJKVJZU.G")
	public int[] field38 = new int[256];

	@ObfuscatedName("BDJKVJZU.H")
	public int[] field39 = new int[256];

	@ObfuscatedName("BDJKVJZU.I")
	public int[] field40 = new int[256];

	@ObfuscatedName("BDJKVJZU.J")
	public int[] field41 = new int[256];

	@ObfuscatedName("BDJKVJZU.L")
	public Random field43 = new Random();

	@ObfuscatedName("BDJKVJZU.M")
	public boolean field44 = false;

	@ObfuscatedName("BDJKVJZU.K")
	public int field42;

	public BDJKVJZU(boolean arg0, TXPLZUUI arg1, String arg2) {
		PKHWFJLM var4 = new PKHWFJLM(arg1.method506(arg2 + ".dat", null));
		PKHWFJLM var5 = new PKHWFJLM(arg1.method506("index.dat", null));
		boolean var6 = true;
		var5.field971 = var4.method332() + 4;
		int var7 = var5.method330();
		if (var7 > 0) {
			var5.field971 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field39[var8] = var5.method330();
			field40[var8] = var5.method330();
			int var10 = field37[var8] = var5.method332();
			int var11 = field38[var8] = var5.method332();
			int var12 = var5.method330();
			int var13 = var10 * var11;
			field36[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field36[var8][var14] = var4.method331();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field36[var8][var10 * var16 + var15] = var4.method331();
					}
				}
			}

			if (var11 > field42 && var8 < 128) {
				field42 = var11;
			}

			field39[var8] = 1;
			field41[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field36[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field41[var8]--;
				field39[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field36[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field41[var8]--;
			}
		}

		if (arg0) {
			field41[32] = field41[73];
		} else {
			field41[32] = field41[105];
		}
	}

	@ObfuscatedName("BDJKVJZU.a(Ljava/lang/String;IIII)V")
	public void method8(String arg0, int arg1, int arg2, int arg3) {
		method13(arg3 - method12(arg0), arg0, arg2, arg1);
	}

	@ObfuscatedName("BDJKVJZU.a(IILjava/lang/String;IZ)V")
	public void method9(int arg0, int arg1, String arg2, int arg3) {
		method13(arg1 - method12(arg2) / 2, arg2, arg3, arg0);
	}

	@ObfuscatedName("BDJKVJZU.a(ILjava/lang/String;ZIII)V")
	public void method10(int arg0, String arg1, boolean arg2, int arg3, int arg4) {
		method17(arg3, arg0 - method11(arg1) / 2, arg4, arg1, arg2);
	}

	@ObfuscatedName("BDJKVJZU.a(Ljava/lang/String;Z)I")
	public int method11(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field41[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("BDJKVJZU.a(ILjava/lang/String;)I")
	public int method12(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field41[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("BDJKVJZU.a(IBLjava/lang/String;II)V")
	public void method13(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 != null) {
			arg3 -= field42;
			for (int var5 = 0; var5 < arg1.length(); var5++) {
				char var6 = arg1.charAt(var5);
				if (var6 != ' ') {
					method20(field36[var6], field39[var6] + arg0, field40[var6] + arg3, field37[var6], field38[var6], arg2);
				}

				arg0 += field41[var6];
			}
		}
	}

	@ObfuscatedName("BDJKVJZU.a(IILjava/lang/String;III)V")
	public void method14(int arg0, String arg1, int arg2, int arg3, int arg4) {
		if (arg1 != null) {
			arg4 -= method12(arg1) / 2;
			arg3 -= field42;
			for (int var6 = 0; var6 < arg1.length(); var6++) {
				char var7 = arg1.charAt(var6);
				if (var7 != ' ') {
					method20(field36[var7], field39[var7] + arg4, field40[var7] + arg3 + (int) (Math.sin(arg2 / 5.0D + var6 / 2.0D) * 5.0D), field37[var7], field38[var7], arg0);
				}

				arg4 += field41[var7];
			}
		}
	}

	@ObfuscatedName("BDJKVJZU.a(IZIILjava/lang/String;I)V")
	public void method15(int arg0, int arg1, int arg2, String arg3, int arg4) {
		if (arg3 != null) {
			arg0 -= method12(arg3) / 2;
			arg1 -= field42;
			for (int var6 = 0; var6 < arg3.length(); var6++) {
				char var7 = arg3.charAt(var6);
				if (var7 != ' ') {
					method20(field36[var7], field39[var7] + arg0 + (int) (Math.sin(arg2 / 5.0D + var6 / 5.0D) * 5.0D), field40[var7] + arg1 + (int) (Math.sin(arg2 / 5.0D + var6 / 3.0D) * 5.0D), field37[var7], field38[var7], arg4);
				}

				arg0 += field41[var7];
			}
		}
	}

	@ObfuscatedName("BDJKVJZU.a(IIILjava/lang/String;III)V")
	public void method16(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
		if (arg3 != null) {
			double var7 = 7.0D - arg5 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg4 -= method12(arg3) / 2;
			arg2 -= field42;
			for (int var9 = 0; var9 < arg3.length(); var9++) {
				char var10 = arg3.charAt(var9);
				if (var10 != ' ') {
					method20(field36[var10], field39[var10] + arg4, field40[var10] + arg2 + (int) (Math.sin(var9 / 1.5D + arg1) * var7), field37[var10], field38[var10], arg0);
				}

				arg4 += field41[var10];
			}
		}
	}

	@ObfuscatedName("BDJKVJZU.a(IZIILjava/lang/String;Z)V")
	public void method17(int arg0, int arg1, int arg2, String arg3, boolean arg4) {
		field44 = false;
		int var6 = arg1;
		if (arg3 != null) {
			arg0 -= field42;
			for (int var7 = 0; var7 < arg3.length(); var7++) {
				if (arg3.charAt(var7) == '@' && var7 + 4 < arg3.length() && arg3.charAt(var7 + 4) == '@') {
					int var8 = method19(arg3.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg2 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg3.charAt(var7);
					if (var9 != ' ') {
						if (arg4) {
							method20(field36[var9], field39[var9] + arg1 + 1, field40[var9] + arg0 + 1, field37[var9], field38[var9], 0);
						}

						method20(field36[var9], field39[var9] + arg1, field40[var9] + arg0, field37[var9], field38[var9], arg2);
					}

					arg1 += field41[var9];
				}
			}

			if (field44) {
				CXMSQZVC.method205(arg1 - var6, 0x800000, var6, (int) (field42 * 0.7D) + arg0);
			}
		}
	}

	@ObfuscatedName("BDJKVJZU.a(IIIZLjava/lang/String;II)V")
	public void method18(int arg0, int arg1, boolean arg2, String arg3, int arg4, int arg5) {
		if (arg3 != null) {
			field43.setSeed(arg0);
			int var7 = (field43.nextInt() & 0x1F) + 192;
			arg4 -= field42;
			for (int var8 = 0; var8 < arg3.length(); var8++) {
				if (arg3.charAt(var8) == '@' && var8 + 4 < arg3.length() && arg3.charAt(var8 + 4) == '@') {
					int var9 = method19(arg3.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg5 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg3.charAt(var8);
					if (var10 != ' ') {
						if (arg2) {
							method22(field40[var10] + arg4 + 1, field39[var10] + arg1 + 1, field37[var10], field36[var10], field38[var10], 192, 0);
						}

						method22(field40[var10] + arg4, field39[var10] + arg1, field37[var10], field36[var10], field38[var10], var7, arg5);
					}

					arg1 += field41[var10];
					if ((field43.nextInt() & 0x3) == 0) {
						arg1++;
					}
				}
			}
		}
	}

	@ObfuscatedName("BDJKVJZU.b(Ljava/lang/String;Z)I")
	public int method19(String arg0) {
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
				field44 = true;
			}

			if (arg0.equals("end")) {
				field44 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("BDJKVJZU.a([BIIIII)V")
	public void method20(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = CXMSQZVC.field568 * arg2 + arg1;
		int var8 = CXMSQZVC.field568 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < CXMSQZVC.field570) {
			int var11 = CXMSQZVC.field570 - arg2;
			arg4 -= var11;
			arg2 = CXMSQZVC.field570;
			var10 += arg3 * var11;
			var7 += CXMSQZVC.field568 * var11;
		}

		if (arg2 + arg4 >= CXMSQZVC.field571) {
			arg4 -= arg2 + arg4 + 1 - CXMSQZVC.field571;
		}

		if (arg1 < CXMSQZVC.field572) {
			int var12 = CXMSQZVC.field572 - arg1;
			arg3 -= var12;
			arg1 = CXMSQZVC.field572;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= CXMSQZVC.field573) {
			int var13 = arg1 + arg3 + 1 - CXMSQZVC.field573;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method21(CXMSQZVC.field567, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("BDJKVJZU.a([I[BIIIIIII)V")
	public void method21(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("BDJKVJZU.a(IIZI[BIII)V")
	public void method22(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
		int var8 = CXMSQZVC.field568 * arg0 + arg1;
		int var9 = CXMSQZVC.field568 - arg2;
		int var10 = 0;
		int var11 = 0;
		if (arg0 < CXMSQZVC.field570) {
			int var12 = CXMSQZVC.field570 - arg0;
			arg4 -= var12;
			arg0 = CXMSQZVC.field570;
			var11 += arg2 * var12;
			var8 += CXMSQZVC.field568 * var12;
		}

		if (arg0 + arg4 >= CXMSQZVC.field571) {
			arg4 -= arg0 + arg4 + 1 - CXMSQZVC.field571;
		}

		if (arg1 < CXMSQZVC.field572) {
			int var13 = CXMSQZVC.field572 - arg1;
			arg2 -= var13;
			arg1 = CXMSQZVC.field572;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg1 + arg2 >= CXMSQZVC.field573) {
			int var14 = arg1 + arg2 + 1 - CXMSQZVC.field573;
			arg2 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg2 > 0 && arg4 > 0) {
			method23(var11, var9, CXMSQZVC.field567, var10, arg4, arg3, arg6, arg5, var8, arg2);
		}
	}

	@ObfuscatedName("BDJKVJZU.a(II[III[BIIIII)V")
	public void method23(int arg0, int arg1, int[] arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9) {
		arg6 = ((arg6 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((arg6 & 0xFF00) * arg7 & 0xFF0000) >> 8;
		arg7 = 256 - arg7;
		for (int var11 = -arg4; var11 < 0; var11++) {
			for (int var12 = -arg9; var12 < 0; var12++) {
				if (arg5[arg0++] == 0) {
					arg8++;
				} else {
					int var13 = arg2[arg8];
					arg2[arg8++] = (((var13 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((var13 & 0xFF00) * arg7 & 0xFF0000) >> 8) + arg6;
				}
			}

			arg8 += arg1;
			arg0 += arg3;
		}
	}
}
