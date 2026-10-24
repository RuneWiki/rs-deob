package deob;

import java.util.Random;

@ObfuscatedName("KGPDNFPL")
public final class KGPDNFPL extends IGZZCJOU {

	@ObfuscatedName("KGPDNFPL.E")
	public byte[][] field897 = new byte[256][];

	@ObfuscatedName("KGPDNFPL.F")
	public int[] field898 = new int[256];

	@ObfuscatedName("KGPDNFPL.G")
	public int[] field899 = new int[256];

	@ObfuscatedName("KGPDNFPL.H")
	public int[] field900 = new int[256];

	@ObfuscatedName("KGPDNFPL.I")
	public int[] field901 = new int[256];

	@ObfuscatedName("KGPDNFPL.J")
	public int[] field902 = new int[256];

	@ObfuscatedName("KGPDNFPL.L")
	public Random field904 = new Random();

	@ObfuscatedName("KGPDNFPL.M")
	public boolean field905 = false;

	@ObfuscatedName("KGPDNFPL.K")
	public int field903;

	public KGPDNFPL(String arg0, MJLXHQTQ arg1, boolean arg2) {
		XGRGMPUQ var4 = new XGRGMPUQ(arg1.method317(arg0 + ".dat", null));
		XGRGMPUQ var5 = new XGRGMPUQ(arg1.method317("index.dat", null));
		boolean var6 = true;
		var5.field1432 = var4.method467() + 4;
		int var7 = var5.method465();
		if (var7 > 0) {
			var5.field1432 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field900[var8] = var5.method465();
			field901[var8] = var5.method465();
			int var10 = field898[var8] = var5.method467();
			int var11 = field899[var8] = var5.method467();
			int var12 = var5.method465();
			int var13 = var10 * var11;
			field897[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field897[var8][var14] = var4.method466();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field897[var8][var10 * var16 + var15] = var4.method466();
					}
				}
			}

			if (var11 > field903 && var8 < 128) {
				field903 = var11;
			}

			field900[var8] = 1;
			field902[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field897[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field902[var8]--;
				field900[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field897[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field902[var8]--;
			}
		}

		if (arg2) {
			field902[32] = field902[73];
		} else {
			field902[32] = field902[105];
		}
	}

	@ObfuscatedName("KGPDNFPL.a(ILjava/lang/String;III)V")
	public void method270(int arg0, String arg1, int arg2, int arg3) {
		method275(arg0, arg2 - method274(arg1), arg3, arg1);
	}

	@ObfuscatedName("KGPDNFPL.a(Ljava/lang/String;ZIII)V")
	public void method271(String arg0, int arg1, int arg2, int arg3) {
		method275(arg2, arg3 - method274(arg0) / 2, arg1, arg0);
	}

	@ObfuscatedName("KGPDNFPL.a(IILjava/lang/String;IZI)V")
	public void method272(int arg0, int arg1, String arg2, int arg3, boolean arg4) {
		method279(arg2, arg0 - method273(arg2) / 2, arg3, arg4, arg1);
	}

	@ObfuscatedName("KGPDNFPL.a(ZLjava/lang/String;)I")
	public int method273(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field902[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("KGPDNFPL.a(Ljava/lang/String;I)I")
	public int method274(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field902[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("KGPDNFPL.a(IIILjava/lang/String;B)V")
	public void method275(int arg0, int arg1, int arg2, String arg3) {
		if (arg3 != null) {
			arg0 -= field903;
			for (int var5 = 0; var5 < arg3.length(); var5++) {
				char var6 = arg3.charAt(var5);
				if (var6 != ' ') {
					method282(field897[var6], field900[var6] + arg1, field901[var6] + arg0, field898[var6], field899[var6], arg2);
				}

				arg1 += field902[var6];
			}
		}
	}

	@ObfuscatedName("KGPDNFPL.a(IIBILjava/lang/String;I)V")
	public void method276(int arg0, int arg1, int arg2, String arg3, int arg4) {
		if (arg3 != null) {
			arg2 -= method274(arg3) / 2;
			arg4 -= field903;
			for (int var6 = 0; var6 < arg3.length(); var6++) {
				char var7 = arg3.charAt(var6);
				if (var7 != ' ') {
					method282(field897[var7], field900[var7] + arg2, field901[var7] + arg4 + (int) (Math.sin(arg1 / 5.0D + var6 / 2.0D) * 5.0D), field898[var7], field899[var7], arg0);
				}

				arg2 += field902[var7];
			}
		}
	}

	@ObfuscatedName("KGPDNFPL.a(Ljava/lang/String;IZIII)V")
	public void method277(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg1 -= method274(arg0) / 2;
			arg4 -= field903;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method282(field897[var7], field900[var7] + arg1 + (int) (Math.sin(arg3 / 5.0D + var6 / 5.0D) * 5.0D), field901[var7] + arg4 + (int) (Math.sin(arg3 / 5.0D + var6 / 3.0D) * 5.0D), field898[var7], field899[var7], arg2);
				}

				arg1 += field902[var7];
			}
		}
	}

	@ObfuscatedName("KGPDNFPL.a(IILjava/lang/String;IIIB)V")
	public void method278(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
		if (arg2 != null) {
			double var7 = 7.0D - arg5 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg3 -= method274(arg2) / 2;
			arg0 -= field903;
			for (int var9 = 0; var9 < arg2.length(); var9++) {
				char var10 = arg2.charAt(var9);
				if (var10 != ' ') {
					method282(field897[var10], field900[var10] + arg3, field901[var10] + arg0 + (int) (Math.sin(var9 / 1.5D + arg1) * var7), field898[var10], field899[var10], arg4);
				}

				arg3 += field902[var10];
			}
		}
	}

	@ObfuscatedName("KGPDNFPL.a(ILjava/lang/String;IIZI)V")
	public void method279(String arg0, int arg1, int arg2, boolean arg3, int arg4) {
		field905 = false;
		int var6 = arg1;
		if (arg0 != null) {
			arg4 -= field903;
			for (int var7 = 0; var7 < arg0.length(); var7++) {
				if (arg0.charAt(var7) == '@' && var7 + 4 < arg0.length() && arg0.charAt(var7 + 4) == '@') {
					int var8 = method281(arg0.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg2 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg0.charAt(var7);
					if (var9 != ' ') {
						if (arg3) {
							method282(field897[var9], field900[var9] + arg1 + 1, field901[var9] + arg4 + 1, field898[var9], field899[var9], 0);
						}

						method282(field897[var9], field900[var9] + arg1, field901[var9] + arg4, field898[var9], field899[var9], arg2);
					}

					arg1 += field902[var9];
				}
			}

			if (field905) {
				IGZZCJOU.method248(0x800000, (int) (field903 * 0.7D) + arg4, arg1 - var6, var6);
			}
		}
	}

	@ObfuscatedName("KGPDNFPL.a(ILjava/lang/String;IIIIZ)V")
	public void method280(String arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (arg0 != null) {
			field904.setSeed(arg1);
			int var7 = (field904.nextInt() & 0x1F) + 192;
			arg4 -= field903;
			for (int var8 = 0; var8 < arg0.length(); var8++) {
				if (arg0.charAt(var8) == '@' && var8 + 4 < arg0.length() && arg0.charAt(var8 + 4) == '@') {
					int var9 = method281(arg0.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg2 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg0.charAt(var8);
					if (var10 != ' ') {
						if (arg5) {
							method284(field899[var10], field900[var10] + arg3 + 1, 192, 0, field898[var10], field897[var10], field901[var10] + arg4 + 1);
						}

						method284(field899[var10], field900[var10] + arg3, var7, arg2, field898[var10], field897[var10], field901[var10] + arg4);
					}

					arg3 += field902[var10];
					if ((field904.nextInt() & 0x3) == 0) {
						arg3++;
					}
				}
			}
		}
	}

	@ObfuscatedName("KGPDNFPL.a(ILjava/lang/String;)I")
	public int method281(String arg0) {
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
				field905 = true;
			}

			if (arg0.equals("end")) {
				field905 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("KGPDNFPL.a([BIIIII)V")
	public void method282(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = IGZZCJOU.field796 * arg2 + arg1;
		int var8 = IGZZCJOU.field796 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < IGZZCJOU.field798) {
			int var11 = IGZZCJOU.field798 - arg2;
			arg4 -= var11;
			arg2 = IGZZCJOU.field798;
			var10 += arg3 * var11;
			var7 += IGZZCJOU.field796 * var11;
		}

		if (arg2 + arg4 >= IGZZCJOU.field799) {
			arg4 -= arg2 + arg4 + 1 - IGZZCJOU.field799;
		}

		if (arg1 < IGZZCJOU.field800) {
			int var12 = IGZZCJOU.field800 - arg1;
			arg3 -= var12;
			arg1 = IGZZCJOU.field800;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= IGZZCJOU.field801) {
			int var13 = arg1 + arg3 + 1 - IGZZCJOU.field801;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method283(IGZZCJOU.field795, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("KGPDNFPL.a([I[BIIIIIII)V")
	public void method283(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("KGPDNFPL.a(IIIII[BIZ)V")
	public void method284(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
		int var8 = IGZZCJOU.field796 * arg6 + arg1;
		int var9 = IGZZCJOU.field796 - arg4;
		int var10 = 0;
		int var11 = 0;
		if (arg6 < IGZZCJOU.field798) {
			int var12 = IGZZCJOU.field798 - arg6;
			arg0 -= var12;
			arg6 = IGZZCJOU.field798;
			var11 += arg4 * var12;
			var8 += IGZZCJOU.field796 * var12;
		}

		if (arg0 + arg6 >= IGZZCJOU.field799) {
			arg0 -= arg0 + arg6 + 1 - IGZZCJOU.field799;
		}

		if (arg1 < IGZZCJOU.field800) {
			int var13 = IGZZCJOU.field800 - arg1;
			arg4 -= var13;
			arg1 = IGZZCJOU.field800;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg1 + arg4 >= IGZZCJOU.field801) {
			int var14 = arg1 + arg4 + 1 - IGZZCJOU.field801;
			arg4 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg4 > 0 && arg0 > 0) {
			method285(var11, arg0, var10, var9, arg4, arg5, IGZZCJOU.field795, var8, arg3, arg2);
		}
	}

	@ObfuscatedName("KGPDNFPL.a(IIIIII[B[IIII)V")
	public void method285(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int[] arg6, int arg7, int arg8, int arg9) {
		arg8 = ((arg8 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg8 & 0xFF00) * arg9 & 0xFF0000) >> 8;
		arg9 = 256 - arg9;
		for (int var11 = -arg1; var11 < 0; var11++) {
			for (int var12 = -arg4; var12 < 0; var12++) {
				if (arg5[arg0++] == 0) {
					arg7++;
				} else {
					int var13 = arg6[arg7];
					arg6[arg7++] = (((var13 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((var13 & 0xFF00) * arg9 & 0xFF0000) >> 8) + arg8;
				}
			}

			arg7 += arg3;
			arg0 += arg2;
		}
	}
}
