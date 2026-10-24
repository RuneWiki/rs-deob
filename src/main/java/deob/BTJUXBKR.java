package deob;

import java.util.Random;

@ObfuscatedName("BTJUXBKR")
public final class BTJUXBKR extends ZLDPKUPX {

	@ObfuscatedName("BTJUXBKR.F")
	public byte[][] field54 = new byte[256][];

	@ObfuscatedName("BTJUXBKR.G")
	public int[] field55 = new int[256];

	@ObfuscatedName("BTJUXBKR.H")
	public int[] field56 = new int[256];

	@ObfuscatedName("BTJUXBKR.I")
	public int[] field57 = new int[256];

	@ObfuscatedName("BTJUXBKR.J")
	public int[] field58 = new int[256];

	@ObfuscatedName("BTJUXBKR.K")
	public int[] field59 = new int[256];

	@ObfuscatedName("BTJUXBKR.M")
	public Random field61 = new Random();

	@ObfuscatedName("BTJUXBKR.N")
	public boolean field62 = false;

	@ObfuscatedName("BTJUXBKR.L")
	public int field60;

	public BTJUXBKR(String arg0, RPFMUSNN arg1, boolean arg2) {
		WNCFPLWV var4 = new WNCFPLWV(arg1.method414(arg0 + ".dat", null));
		WNCFPLWV var5 = new WNCFPLWV(arg1.method414("index.dat", null));
		boolean var6 = true;
		var5.field1375 = var4.method504() + 4;
		int var7 = var5.method502();
		if (var7 > 0) {
			var5.field1375 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field57[var8] = var5.method502();
			field58[var8] = var5.method502();
			int var10 = field55[var8] = var5.method504();
			int var11 = field56[var8] = var5.method504();
			int var12 = var5.method502();
			int var13 = var10 * var11;
			field54[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field54[var8][var14] = var4.method503();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field54[var8][var10 * var16 + var15] = var4.method503();
					}
				}
			}

			if (var11 > field60 && var8 < 128) {
				field60 = var11;
			}

			field57[var8] = 1;
			field59[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field54[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field59[var8]--;
				field57[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field54[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field59[var8]--;
			}
		}

		if (arg2) {
			field59[32] = field59[73];
		} else {
			field59[32] = field59[105];
		}
	}

	@ObfuscatedName("BTJUXBKR.a(Ljava/lang/String;IIII)V")
	public void method11(String arg0, int arg1, int arg2, int arg3) {
		method16(arg3 - method15(arg0), arg1, arg0, arg2);
	}

	@ObfuscatedName("BTJUXBKR.a(ILjava/lang/String;III)V")
	public void method12(int arg0, String arg1, int arg2, int arg3) {
		method16(arg2 - method15(arg1) / 2, arg3, arg1, arg0);
	}

	@ObfuscatedName("BTJUXBKR.a(Ljava/lang/String;ZIZII)V")
	public void method13(String arg0, int arg1, boolean arg2, int arg3, int arg4) {
		method20(arg2, arg1, arg4, arg3 - method14(arg0) / 2, arg0);
	}

	@ObfuscatedName("BTJUXBKR.a(ILjava/lang/String;)I")
	public int method14(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field59[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("BTJUXBKR.b(ILjava/lang/String;)I")
	public int method15(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field59[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("BTJUXBKR.a(IILjava/lang/String;II)V")
	public void method16(int arg0, int arg1, String arg2, int arg3) {
		if (arg2 != null) {
			arg3 -= field60;
			for (int var5 = 0; var5 < arg2.length(); var5++) {
				char var6 = arg2.charAt(var5);
				if (var6 != ' ') {
					method23(field54[var6], field57[var6] + arg0, field58[var6] + arg3, field55[var6], field56[var6], arg1);
				}

				arg0 += field59[var6];
			}
		}
	}

	@ObfuscatedName("BTJUXBKR.a(ILjava/lang/String;IIII)V")
	public void method17(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg2 -= method15(arg0) / 2;
			arg4 -= field60;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method23(field54[var7], field57[var7] + arg2, field58[var7] + arg4 + (int) (Math.sin(arg3 / 5.0D + var6 / 2.0D) * 5.0D), field55[var7], field56[var7], arg1);
				}

				arg2 += field59[var7];
			}
		}
	}

	@ObfuscatedName("BTJUXBKR.a(IIIBILjava/lang/String;)V")
	public void method18(int arg0, int arg1, int arg2, int arg3, String arg4) {
		if (arg4 != null) {
			arg0 -= method15(arg4) / 2;
			arg3 -= field60;
			for (int var6 = 0; var6 < arg4.length(); var6++) {
				char var7 = arg4.charAt(var6);
				if (var7 != ' ') {
					method23(field54[var7], field57[var7] + arg0 + (int) (Math.sin(arg1 / 5.0D + var6 / 5.0D) * 5.0D), field58[var7] + arg3 + (int) (Math.sin(arg1 / 5.0D + var6 / 3.0D) * 5.0D), field55[var7], field56[var7], arg2);
				}

				arg0 += field59[var7];
			}
		}
	}

	@ObfuscatedName("BTJUXBKR.a(IIIILjava/lang/String;II)V")
	public void method19(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
		if (arg4 != null) {
			double var7 = 7.0D - arg3 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg5 -= method15(arg4) / 2;
			arg1 -= field60;
			for (int var9 = 0; var9 < arg4.length(); var9++) {
				char var10 = arg4.charAt(var9);
				if (var10 != ' ') {
					method23(field54[var10], field57[var10] + arg5, field58[var10] + arg1 + (int) (Math.sin(var9 / 1.5D + arg0) * var7), field55[var10], field56[var10], arg2);
				}

				arg5 += field59[var10];
			}
		}
	}

	@ObfuscatedName("BTJUXBKR.a(BZIIILjava/lang/String;)V")
	public void method20(boolean arg0, int arg1, int arg2, int arg3, String arg4) {
		field62 = false;
		int var6 = arg3;
		if (arg4 != null) {
			arg1 -= field60;
			for (int var7 = 0; var7 < arg4.length(); var7++) {
				if (arg4.charAt(var7) == '@' && var7 + 4 < arg4.length() && arg4.charAt(var7 + 4) == '@') {
					int var8 = method22(arg4.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg2 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg4.charAt(var7);
					if (var9 != ' ') {
						if (arg0) {
							method23(field54[var9], field57[var9] + arg3 + 1, field58[var9] + arg1 + 1, field55[var9], field56[var9], 0);
						}

						method23(field54[var9], field57[var9] + arg3, field58[var9] + arg1, field55[var9], field56[var9], arg2);
					}

					arg3 += field59[var9];
				}
			}

			if (field62) {
				ZLDPKUPX.method600((int) (field60 * 0.7D) + arg1, 0x800000, arg3 - var6, var6);
			}
		}
	}

	@ObfuscatedName("BTJUXBKR.a(IBIZILjava/lang/String;I)V")
	public void method21(int arg0, int arg1, boolean arg2, int arg3, String arg4, int arg5) {
		if (arg4 != null) {
			field61.setSeed(arg3);
			int var7 = (field61.nextInt() & 0x1F) + 192;
			arg1 -= field60;
			for (int var8 = 0; var8 < arg4.length(); var8++) {
				if (arg4.charAt(var8) == '@' && var8 + 4 < arg4.length() && arg4.charAt(var8 + 4) == '@') {
					int var9 = method22(arg4.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg5 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg4.charAt(var8);
					if (var10 != ' ') {
						if (arg2) {
							method25(field58[var10] + arg1 + 1, field56[var10], field57[var10] + arg0 + 1, 192, 0, field55[var10], field54[var10]);
						}

						method25(field58[var10] + arg1, field56[var10], field57[var10] + arg0, var7, arg5, field55[var10], field54[var10]);
					}

					arg0 += field59[var10];
					if ((field61.nextInt() & 0x3) == 0) {
						arg0++;
					}
				}
			}
		}
	}

	@ObfuscatedName("BTJUXBKR.c(ILjava/lang/String;)I")
	public int method22(String arg0) {
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
				field62 = true;
			}

			if (arg0.equals("end")) {
				field62 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("BTJUXBKR.a([BIIIII)V")
	public void method23(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = ZLDPKUPX.field1506 * arg2 + arg1;
		int var8 = ZLDPKUPX.field1506 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < ZLDPKUPX.field1508) {
			int var11 = ZLDPKUPX.field1508 - arg2;
			arg4 -= var11;
			arg2 = ZLDPKUPX.field1508;
			var10 += arg3 * var11;
			var7 += ZLDPKUPX.field1506 * var11;
		}

		if (arg2 + arg4 >= ZLDPKUPX.field1509) {
			arg4 -= arg2 + arg4 + 1 - ZLDPKUPX.field1509;
		}

		if (arg1 < ZLDPKUPX.field1510) {
			int var12 = ZLDPKUPX.field1510 - arg1;
			arg3 -= var12;
			arg1 = ZLDPKUPX.field1510;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= ZLDPKUPX.field1511) {
			int var13 = arg1 + arg3 + 1 - ZLDPKUPX.field1511;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method24(ZLDPKUPX.field1505, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("BTJUXBKR.a([I[BIIIIIII)V")
	public void method24(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("BTJUXBKR.a(IIIIIII[B)V")
	public void method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
		int var8 = ZLDPKUPX.field1506 * arg0 + arg2;
		int var9 = ZLDPKUPX.field1506 - arg5;
		int var10 = 0;
		int var11 = 0;
		if (arg0 < ZLDPKUPX.field1508) {
			int var12 = ZLDPKUPX.field1508 - arg0;
			arg1 -= var12;
			arg0 = ZLDPKUPX.field1508;
			var11 += arg5 * var12;
			var8 += ZLDPKUPX.field1506 * var12;
		}

		if (arg0 + arg1 >= ZLDPKUPX.field1509) {
			arg1 -= arg0 + arg1 + 1 - ZLDPKUPX.field1509;
		}

		if (arg2 < ZLDPKUPX.field1510) {
			int var13 = ZLDPKUPX.field1510 - arg2;
			arg5 -= var13;
			arg2 = ZLDPKUPX.field1510;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg2 + arg5 >= ZLDPKUPX.field1511) {
			int var14 = arg2 + arg5 + 1 - ZLDPKUPX.field1511;
			arg5 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg5 > 0 && arg1 > 0) {
			method26(var8, ZLDPKUPX.field1505, arg4, arg3, var10, var11, var9, arg5, arg6, arg1);
		}
	}

	@ObfuscatedName("BTJUXBKR.a(BI[IIIIIII[BI)V")
	public void method26(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9) {
		arg2 = ((arg2 & 0xFF00FF) * arg3 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg3 & 0xFF0000) >> 8;
		arg3 = 256 - arg3;
		for (int var11 = -arg9; var11 < 0; var11++) {
			for (int var12 = -arg7; var12 < 0; var12++) {
				if (arg8[arg5++] == 0) {
					arg0++;
				} else {
					int var13 = arg1[arg0];
					arg1[arg0++] = (((var13 & 0xFF00FF) * arg3 & 0xFF00FF00) + ((var13 & 0xFF00) * arg3 & 0xFF0000) >> 8) + arg2;
				}
			}

			arg0 += arg6;
			arg5 += arg4;
		}
	}
}
