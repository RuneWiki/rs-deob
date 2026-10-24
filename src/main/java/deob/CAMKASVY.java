package deob;

import java.util.Random;

@ObfuscatedName("CAMKASVY")
public final class CAMKASVY extends CBERHIHM {

	@ObfuscatedName("CAMKASVY.D")
	public byte[][] field15 = new byte[256][];

	@ObfuscatedName("CAMKASVY.E")
	public int[] field16 = new int[256];

	@ObfuscatedName("CAMKASVY.F")
	public int[] field17 = new int[256];

	@ObfuscatedName("CAMKASVY.G")
	public int[] field18 = new int[256];

	@ObfuscatedName("CAMKASVY.H")
	public int[] field19 = new int[256];

	@ObfuscatedName("CAMKASVY.I")
	public int[] field20 = new int[256];

	@ObfuscatedName("CAMKASVY.K")
	public Random field22 = new Random();

	@ObfuscatedName("CAMKASVY.L")
	public boolean field23 = false;

	@ObfuscatedName("CAMKASVY.J")
	public int field21;

	public CAMKASVY(AKPFVPPG arg0, String arg1, boolean arg2) {
		FTMSICIZ var4 = new FTMSICIZ(arg0.method7(arg1 + ".dat", null));
		FTMSICIZ var5 = new FTMSICIZ(arg0.method7("index.dat", null));
		boolean var6 = true;
		var5.field535 = var4.method215() + 4;
		int var7 = var5.method213();
		if (var7 > 0) {
			var5.field535 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field18[var8] = var5.method213();
			field19[var8] = var5.method213();
			int var10 = field16[var8] = var5.method215();
			int var11 = field17[var8] = var5.method215();
			int var12 = var5.method213();
			int var13 = var10 * var11;
			field15[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field15[var8][var14] = var4.method214();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field15[var8][var10 * var16 + var15] = var4.method214();
					}
				}
			}

			if (var11 > field21 && var8 < 128) {
				field21 = var11;
			}

			field18[var8] = 1;
			field20[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field15[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field20[var8]--;
				field18[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field15[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field20[var8]--;
			}
		}

		if (arg2) {
			field20[32] = field20[73];
		} else {
			field20[32] = field20[105];
		}
	}

	@ObfuscatedName("CAMKASVY.a(IIBLjava/lang/String;I)V")
	public void method12(int arg0, int arg1, String arg2, int arg3) {
		method17(arg2, arg0 - method16(arg2), arg1, arg3);
	}

	@ObfuscatedName("CAMKASVY.a(IILjava/lang/String;IZ)V")
	public void method13(int arg0, int arg1, String arg2, int arg3) {
		method17(arg2, arg0 - method16(arg2) / 2, arg1, arg3);
	}

	@ObfuscatedName("CAMKASVY.a(ZIILjava/lang/String;II)V")
	public void method14(boolean arg0, int arg1, String arg2, int arg3, int arg4) {
		method21(arg1 - method15(arg2) / 2, arg3, arg0, arg2, arg4);
	}

	@ObfuscatedName("CAMKASVY.a(ZLjava/lang/String;)I")
	public int method15(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field20[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("CAMKASVY.a(ILjava/lang/String;)I")
	public int method16(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field20[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("CAMKASVY.a(ILjava/lang/String;III)V")
	public void method17(String arg0, int arg1, int arg2, int arg3) {
		if (arg0 != null) {
			arg2 -= field21;
			for (int var5 = 0; var5 < arg0.length(); var5++) {
				char var6 = arg0.charAt(var5);
				if (var6 != ' ') {
					method24(field15[var6], field18[var6] + arg1, field19[var6] + arg2, field16[var6], field17[var6], arg3);
				}

				arg1 += field20[var6];
			}
		}
	}

	@ObfuscatedName("CAMKASVY.a(ILjava/lang/String;IIII)V")
	public void method18(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg1 -= method16(arg0) / 2;
			arg2 -= field21;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method24(field15[var7], field18[var7] + arg1, field19[var7] + arg2 + (int) (Math.sin(arg4 / 5.0D + var6 / 2.0D) * 5.0D), field16[var7], field17[var7], arg3);
				}

				arg1 += field20[var7];
			}
		}
	}

	@ObfuscatedName("CAMKASVY.a(IILjava/lang/String;IIZ)V")
	public void method19(int arg0, int arg1, String arg2, int arg3, int arg4) {
		if (arg2 != null) {
			arg3 -= method16(arg2) / 2;
			arg0 -= field21;
			for (int var6 = 0; var6 < arg2.length(); var6++) {
				char var7 = arg2.charAt(var6);
				if (var7 != ' ') {
					method24(field15[var7], field18[var7] + arg3 + (int) (Math.sin(arg1 / 5.0D + var6 / 5.0D) * 5.0D), field19[var7] + arg0 + (int) (Math.sin(arg1 / 5.0D + var6 / 3.0D) * 5.0D), field16[var7], field17[var7], arg4);
				}

				arg3 += field20[var7];
			}
		}
	}

	@ObfuscatedName("CAMKASVY.a(IZIILjava/lang/String;II)V")
	public void method20(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
		if (arg3 != null) {
			double var7 = 7.0D - arg0 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg4 -= method16(arg3) / 2;
			arg1 -= field21;
			for (int var9 = 0; var9 < arg3.length(); var9++) {
				char var10 = arg3.charAt(var9);
				if (var10 != ' ') {
					method24(field15[var10], field18[var10] + arg4, field19[var10] + arg1 + (int) (Math.sin(var9 / 1.5D + arg5) * var7), field16[var10], field17[var10], arg2);
				}

				arg4 += field20[var10];
			}
		}
	}

	@ObfuscatedName("CAMKASVY.a(IIZBLjava/lang/String;I)V")
	public void method21(int arg0, int arg1, boolean arg2, String arg3, int arg4) {
		field23 = false;
		int var6 = arg0;
		if (arg3 != null) {
			arg1 -= field21;
			for (int var7 = 0; var7 < arg3.length(); var7++) {
				if (arg3.charAt(var7) == '@' && var7 + 4 < arg3.length() && arg3.charAt(var7 + 4) == '@') {
					int var8 = method23(arg3.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg4 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg3.charAt(var7);
					if (var9 != ' ') {
						if (arg2) {
							method24(field15[var9], field18[var9] + arg0 + 1, field19[var9] + arg1 + 1, field16[var9], field17[var9], 0);
						}

						method24(field15[var9], field18[var9] + arg0, field19[var9] + arg1, field16[var9], field17[var9], arg4);
					}

					arg0 += field20[var9];
				}
			}

			if (field23) {
				CBERHIHM.method36((int) (field21 * 0.7D) + arg1, var6, 0x800000, arg0 - var6);
			}
		}
	}

	@ObfuscatedName("CAMKASVY.a(ILjava/lang/String;IZIZI)V")
	public void method22(int arg0, String arg1, int arg2, boolean arg3, int arg4, int arg5) {
		if (arg1 != null) {
			field22.setSeed(arg0);
			int var7 = (field22.nextInt() & 0x1F) + 192;
			arg5 -= field21;
			for (int var8 = 0; var8 < arg1.length(); var8++) {
				if (arg1.charAt(var8) == '@' && var8 + 4 < arg1.length() && arg1.charAt(var8 + 4) == '@') {
					int var9 = method23(arg1.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg4 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg1.charAt(var8);
					if (var10 != ' ') {
						if (arg3) {
							method26(field15[var10], 192, field18[var10] + arg2 + 1, field16[var10], 0, field19[var10] + arg5 + 1, field17[var10]);
						}

						method26(field15[var10], var7, field18[var10] + arg2, field16[var10], arg4, field19[var10] + arg5, field17[var10]);
					}

					arg2 += field20[var10];
					if ((field22.nextInt() & 0x3) == 0) {
						arg2++;
					}
				}
			}
		}
	}

	@ObfuscatedName("CAMKASVY.b(ILjava/lang/String;)I")
	public int method23(String arg0) {
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
				field23 = true;
			}

			if (arg0.equals("end")) {
				field23 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("CAMKASVY.a([BIIIII)V")
	public void method24(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = CBERHIHM.field25 * arg2 + arg1;
		int var8 = CBERHIHM.field25 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < CBERHIHM.field27) {
			int var11 = CBERHIHM.field27 - arg2;
			arg4 -= var11;
			arg2 = CBERHIHM.field27;
			var10 += arg3 * var11;
			var7 += CBERHIHM.field25 * var11;
		}

		if (arg2 + arg4 >= CBERHIHM.field28) {
			arg4 -= arg2 + arg4 + 1 - CBERHIHM.field28;
		}

		if (arg1 < CBERHIHM.field29) {
			int var12 = CBERHIHM.field29 - arg1;
			arg3 -= var12;
			arg1 = CBERHIHM.field29;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= CBERHIHM.field30) {
			int var13 = arg1 + arg3 + 1 - CBERHIHM.field30;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method25(CBERHIHM.field24, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("CAMKASVY.a([I[BIIIIIII)V")
	public void method25(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("CAMKASVY.a([BIIZIIII)V")
	public void method26(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = CBERHIHM.field25 * arg5 + arg2;
		int var9 = CBERHIHM.field25 - arg3;
		int var10 = 0;
		int var11 = 0;
		if (arg5 < CBERHIHM.field27) {
			int var12 = CBERHIHM.field27 - arg5;
			arg6 -= var12;
			arg5 = CBERHIHM.field27;
			var11 += arg3 * var12;
			var8 += CBERHIHM.field25 * var12;
		}

		if (arg5 + arg6 >= CBERHIHM.field28) {
			arg6 -= arg5 + arg6 + 1 - CBERHIHM.field28;
		}

		if (arg2 < CBERHIHM.field29) {
			int var13 = CBERHIHM.field29 - arg2;
			arg3 -= var13;
			arg2 = CBERHIHM.field29;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg2 + arg3 >= CBERHIHM.field30) {
			int var14 = arg2 + arg3 + 1 - CBERHIHM.field30;
			arg3 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg3 > 0 && arg6 > 0) {
			method27(var8, arg3, CBERHIHM.field24, var11, var10, arg4, arg6, var9, arg1, arg0);
		}
	}

	@ObfuscatedName("CAMKASVY.a(II[IIIIIIII[B)V")
	public void method27(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9) {
		arg5 = ((arg5 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((arg5 & 0xFF00) * arg8 & 0xFF0000) >> 8;
		arg8 = 256 - arg8;
		for (int var11 = -arg6; var11 < 0; var11++) {
			for (int var12 = -arg1; var12 < 0; var12++) {
				if (arg9[arg3++] == 0) {
					arg0++;
				} else {
					int var13 = arg2[arg0];
					arg2[arg0++] = (((var13 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((var13 & 0xFF00) * arg8 & 0xFF0000) >> 8) + arg5;
				}
			}

			arg0 += arg7;
			arg3 += arg4;
		}
	}
}
