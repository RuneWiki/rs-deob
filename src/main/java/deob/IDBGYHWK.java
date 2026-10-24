package deob;

import java.util.Random;

@ObfuscatedName("IDBGYHWK")
public final class IDBGYHWK extends TTGPXKMD {

	@ObfuscatedName("IDBGYHWK.E")
	public byte[][] field659 = new byte[256][];

	@ObfuscatedName("IDBGYHWK.F")
	public int[] field660 = new int[256];

	@ObfuscatedName("IDBGYHWK.G")
	public int[] field661 = new int[256];

	@ObfuscatedName("IDBGYHWK.H")
	public int[] field662 = new int[256];

	@ObfuscatedName("IDBGYHWK.I")
	public int[] field663 = new int[256];

	@ObfuscatedName("IDBGYHWK.J")
	public int[] field664 = new int[256];

	@ObfuscatedName("IDBGYHWK.L")
	public Random field666 = new Random();

	@ObfuscatedName("IDBGYHWK.M")
	public boolean field667 = false;

	@ObfuscatedName("IDBGYHWK.K")
	public int field665;

	public IDBGYHWK(String arg0, RVLWVPJQ arg1, boolean arg2) {
		UAWAYCTK var4 = new UAWAYCTK(arg1.method424(arg0 + ".dat", null));
		UAWAYCTK var5 = new UAWAYCTK(arg1.method424("index.dat", null));
		boolean var6 = true;
		var5.field1252 = var4.method457() + 4;
		int var7 = var5.method455();
		if (var7 > 0) {
			var5.field1252 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field662[var8] = var5.method455();
			field663[var8] = var5.method455();
			int var10 = field660[var8] = var5.method457();
			int var11 = field661[var8] = var5.method457();
			int var12 = var5.method455();
			int var13 = var10 * var11;
			field659[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field659[var8][var14] = var4.method456();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field659[var8][var10 * var16 + var15] = var4.method456();
					}
				}
			}

			if (var11 > field665 && var8 < 128) {
				field665 = var11;
			}

			field662[var8] = 1;
			field664[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field659[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field664[var8]--;
				field662[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field659[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field664[var8]--;
			}
		}

		if (arg2) {
			field664[32] = field664[73];
		} else {
			field664[32] = field664[105];
		}
	}

	@ObfuscatedName("IDBGYHWK.a(Ljava/lang/String;IIII)V")
	public void method240(String arg0, int arg1, int arg2, int arg3) {
		method245(arg2, arg1 - method244(arg0), arg3, arg0);
	}

	@ObfuscatedName("IDBGYHWK.a(IILjava/lang/String;II)V")
	public void method241(int arg0, int arg1, String arg2, int arg3) {
		method245(arg3, arg1 - method244(arg2) / 2, arg0, arg2);
	}

	@ObfuscatedName("IDBGYHWK.a(IIZLjava/lang/String;II)V")
	public void method242(int arg0, boolean arg1, String arg2, int arg3, int arg4) {
		method249(arg1, arg2, arg0, arg3 - method243(arg2) / 2, arg4);
	}

	@ObfuscatedName("IDBGYHWK.a(Ljava/lang/String;Z)I")
	public int method243(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field664[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("IDBGYHWK.b(Ljava/lang/String;Z)I")
	public int method244(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field664[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("IDBGYHWK.a(IIILjava/lang/String;B)V")
	public void method245(int arg0, int arg1, int arg2, String arg3) {
		if (arg3 != null) {
			arg2 -= field665;
			for (int var5 = 0; var5 < arg3.length(); var5++) {
				char var6 = arg3.charAt(var5);
				if (var6 != ' ') {
					method252(field659[var6], field662[var6] + arg1, field663[var6] + arg2, field660[var6], field661[var6], arg0);
				}

				arg1 += field664[var6];
			}
		}
	}

	@ObfuscatedName("IDBGYHWK.a(ILjava/lang/String;IIII)V")
	public void method246(int arg0, String arg1, int arg2, int arg3, int arg4) {
		if (arg1 != null) {
			arg4 -= method244(arg1) / 2;
			arg0 -= field665;
			for (int var6 = 0; var6 < arg1.length(); var6++) {
				char var7 = arg1.charAt(var6);
				if (var7 != ' ') {
					method252(field659[var7], field662[var7] + arg4, field663[var7] + arg0 + (int) (Math.sin(arg2 / 5.0D + var6 / 2.0D) * 5.0D), field660[var7], field661[var7], arg3);
				}

				arg4 += field664[var7];
			}
		}
	}

	@ObfuscatedName("IDBGYHWK.a(IIIILjava/lang/String;I)V")
	public void method247(int arg0, int arg1, int arg2, String arg3, int arg4) {
		if (arg3 != null) {
			arg4 -= method244(arg3) / 2;
			arg2 -= field665;
			for (int var6 = 0; var6 < arg3.length(); var6++) {
				char var7 = arg3.charAt(var6);
				if (var7 != ' ') {
					method252(field659[var7], field662[var7] + arg4 + (int) (Math.sin(arg1 / 5.0D + var6 / 5.0D) * 5.0D), field663[var7] + arg2 + (int) (Math.sin(arg1 / 5.0D + var6 / 3.0D) * 5.0D), field660[var7], field661[var7], arg0);
				}

				arg4 += field664[var7];
			}
		}
	}

	@ObfuscatedName("IDBGYHWK.a(IIILjava/lang/String;III)V")
	public void method248(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
		if (arg3 != null) {
			double var7 = 7.0D - arg4 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg2 -= method244(arg3) / 2;
			arg5 -= field665;
			for (int var9 = 0; var9 < arg3.length(); var9++) {
				char var10 = arg3.charAt(var9);
				if (var10 != ' ') {
					method252(field659[var10], field662[var10] + arg2, field663[var10] + arg5 + (int) (Math.sin(var9 / 1.5D + arg0) * var7), field660[var10], field661[var10], arg1);
				}

				arg2 += field664[var10];
			}
		}
	}

	@ObfuscatedName("IDBGYHWK.a(ZILjava/lang/String;III)V")
	public void method249(boolean arg0, String arg1, int arg2, int arg3, int arg4) {
		field667 = false;
		int var6 = arg3;
		if (arg1 != null) {
			arg4 -= field665;
			for (int var7 = 0; var7 < arg1.length(); var7++) {
				if (arg1.charAt(var7) == '@' && var7 + 4 < arg1.length() && arg1.charAt(var7 + 4) == '@') {
					int var8 = method251(arg1.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg2 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg1.charAt(var7);
					if (var9 != ' ') {
						if (arg0) {
							method252(field659[var9], field662[var9] + arg3 + 1, field663[var9] + arg4 + 1, field660[var9], field661[var9], 0);
						}

						method252(field659[var9], field662[var9] + arg3, field663[var9] + arg4, field660[var9], field661[var9], arg2);
					}

					arg3 += field664[var9];
				}
			}

			if (field667) {
				TTGPXKMD.method435((int) (field665 * 0.7D) + arg4, arg3 - var6, 0x800000, var6);
			}
		}
	}

	@ObfuscatedName("IDBGYHWK.a(ILjava/lang/String;IIIIZ)V")
	public void method250(int arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (arg1 != null) {
			field666.setSeed(arg0);
			int var7 = (field666.nextInt() & 0x1F) + 192;
			arg4 -= field665;
			for (int var8 = 0; var8 < arg1.length(); var8++) {
				if (arg1.charAt(var8) == '@' && var8 + 4 < arg1.length() && arg1.charAt(var8 + 4) == '@') {
					int var9 = method251(arg1.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg2 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg1.charAt(var8);
					if (var10 != ' ') {
						if (arg5) {
							method254(field660[var10], field659[var10], field662[var10] + arg3 + 1, 0, 192, field661[var10], field663[var10] + arg4 + 1);
						}

						method254(field660[var10], field659[var10], field662[var10] + arg3, arg2, var7, field661[var10], field663[var10] + arg4);
					}

					arg3 += field664[var10];
					if ((field666.nextInt() & 0x3) == 0) {
						arg3++;
					}
				}
			}
		}
	}

	@ObfuscatedName("IDBGYHWK.a(ZLjava/lang/String;)I")
	public int method251(String arg0) {
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
				field667 = true;
			}

			if (arg0.equals("end")) {
				field667 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("IDBGYHWK.a([BIIIII)V")
	public void method252(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = TTGPXKMD.field1187 * arg2 + arg1;
		int var8 = TTGPXKMD.field1187 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < TTGPXKMD.field1189) {
			int var11 = TTGPXKMD.field1189 - arg2;
			arg4 -= var11;
			arg2 = TTGPXKMD.field1189;
			var10 += arg3 * var11;
			var7 += TTGPXKMD.field1187 * var11;
		}

		if (arg2 + arg4 >= TTGPXKMD.field1190) {
			arg4 -= arg2 + arg4 + 1 - TTGPXKMD.field1190;
		}

		if (arg1 < TTGPXKMD.field1191) {
			int var12 = TTGPXKMD.field1191 - arg1;
			arg3 -= var12;
			arg1 = TTGPXKMD.field1191;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= TTGPXKMD.field1192) {
			int var13 = arg1 + arg3 + 1 - TTGPXKMD.field1192;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method253(TTGPXKMD.field1186, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("IDBGYHWK.a([I[BIIIIIII)V")
	public void method253(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("IDBGYHWK.a(I[BIIIIII)V")
	public void method254(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = TTGPXKMD.field1187 * arg6 + arg2;
		int var9 = TTGPXKMD.field1187 - arg0;
		int var10 = 0;
		int var11 = 0;
		if (arg6 < TTGPXKMD.field1189) {
			int var12 = TTGPXKMD.field1189 - arg6;
			arg5 -= var12;
			arg6 = TTGPXKMD.field1189;
			var11 += arg0 * var12;
			var8 += TTGPXKMD.field1187 * var12;
		}

		if (arg5 + arg6 >= TTGPXKMD.field1190) {
			arg5 -= arg5 + arg6 + 1 - TTGPXKMD.field1190;
		}

		if (arg2 < TTGPXKMD.field1191) {
			int var13 = TTGPXKMD.field1191 - arg2;
			arg0 -= var13;
			arg2 = TTGPXKMD.field1191;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg0 + arg2 >= TTGPXKMD.field1192) {
			int var14 = arg0 + arg2 + 1 - TTGPXKMD.field1192;
			arg0 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg0 > 0 && arg5 > 0) {
			method255(TTGPXKMD.field1186, var11, arg5, arg3, var10, arg1, var8, var9, arg0, arg4);
		}
	}

	@ObfuscatedName("IDBGYHWK.a([IIIII[BIIIIB)V")
	public void method255(int[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9) {
		arg3 = ((arg3 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg3 & 0xFF00) * arg9 & 0xFF0000) >> 8;
		arg9 = 256 - arg9;
		for (int var11 = -arg2; var11 < 0; var11++) {
			for (int var12 = -arg8; var12 < 0; var12++) {
				if (arg5[arg1++] == 0) {
					arg6++;
				} else {
					int var13 = arg0[arg6];
					arg0[arg6++] = (((var13 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((var13 & 0xFF00) * arg9 & 0xFF0000) >> 8) + arg3;
				}
			}

			arg6 += arg7;
			arg1 += arg4;
		}
	}
}
