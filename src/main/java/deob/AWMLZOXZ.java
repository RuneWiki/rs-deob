package deob;

import java.util.Random;

@ObfuscatedName("AWMLZOXZ")
public final class AWMLZOXZ extends FVBHOYJF {

	@ObfuscatedName("AWMLZOXZ.z")
	public byte[][] field58 = new byte[256][];

	@ObfuscatedName("AWMLZOXZ.A")
	public int[] field59 = new int[256];

	@ObfuscatedName("AWMLZOXZ.B")
	public int[] field60 = new int[256];

	@ObfuscatedName("AWMLZOXZ.C")
	public int[] field61 = new int[256];

	@ObfuscatedName("AWMLZOXZ.D")
	public int[] field62 = new int[256];

	@ObfuscatedName("AWMLZOXZ.E")
	public int[] field63 = new int[256];

	@ObfuscatedName("AWMLZOXZ.G")
	public Random field65 = new Random();

	@ObfuscatedName("AWMLZOXZ.H")
	public boolean field66 = false;

	@ObfuscatedName("AWMLZOXZ.F")
	public int field64;

	public AWMLZOXZ(String arg0, IEMHZJLX arg1, boolean arg2) {
		MVHXDWGI var4 = new MVHXDWGI(arg1.method242(arg0 + ".dat", null));
		MVHXDWGI var5 = new MVHXDWGI(arg1.method242("index.dat", null));
		boolean var6 = true;
		var5.field1014 = var4.method359() + 4;
		int var7 = var5.method357();
		if (var7 > 0) {
			var5.field1014 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field61[var8] = var5.method357();
			field62[var8] = var5.method357();
			int var10 = field59[var8] = var5.method359();
			int var11 = field60[var8] = var5.method359();
			int var12 = var5.method357();
			int var13 = var10 * var11;
			field58[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field58[var8][var14] = var4.method358();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field58[var8][var10 * var16 + var15] = var4.method358();
					}
				}
			}

			if (var11 > field64 && var8 < 128) {
				field64 = var11;
			}

			field61[var8] = 1;
			field63[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field58[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field63[var8]--;
				field61[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field58[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field63[var8]--;
			}
		}

		if (arg2) {
			field63[32] = field63[73];
		} else {
			field63[32] = field63[105];
		}
	}

	@ObfuscatedName("AWMLZOXZ.a(IILjava/lang/String;IZ)V")
	public void method17(int arg0, int arg1, String arg2, int arg3) {
		method22(arg3, arg2, arg0 - method21(arg2), arg1);
	}

	@ObfuscatedName("AWMLZOXZ.a(ILjava/lang/String;III)V")
	public void method18(int arg0, String arg1, int arg2, int arg3) {
		method22(arg2, arg1, arg3 - method21(arg1) / 2, arg0);
	}

	@ObfuscatedName("AWMLZOXZ.a(Ljava/lang/String;ZIIII)V")
	public void method19(String arg0, boolean arg1, int arg2, int arg3, int arg4) {
		method26(arg4 - method20(arg0) / 2, arg2, arg1, arg0, arg3);
	}

	@ObfuscatedName("AWMLZOXZ.a(ILjava/lang/String;)I")
	public int method20(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field63[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("AWMLZOXZ.a(Ljava/lang/String;I)I")
	public int method21(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field63[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("AWMLZOXZ.a(BILjava/lang/String;II)V")
	public void method22(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 != null) {
			arg0 -= field64;
			for (int var5 = 0; var5 < arg1.length(); var5++) {
				char var6 = arg1.charAt(var5);
				if (var6 != ' ') {
					method29(field58[var6], field61[var6] + arg2, field62[var6] + arg0, field59[var6], field60[var6], arg3);
				}

				arg2 += field63[var6];
			}
		}
	}

	@ObfuscatedName("AWMLZOXZ.a(ILjava/lang/String;IIII)V")
	public void method23(int arg0, String arg1, int arg2, int arg3, int arg4) {
		if (arg1 != null) {
			arg0 -= method21(arg1) / 2;
			arg3 -= field64;
			for (int var6 = 0; var6 < arg1.length(); var6++) {
				char var7 = arg1.charAt(var6);
				if (var7 != ' ') {
					method29(field58[var7], field61[var7] + arg0, field62[var7] + arg3 + (int) (Math.sin(arg4 / 5.0D + var6 / 2.0D) * 5.0D), field59[var7], field60[var7], arg2);
				}

				arg0 += field63[var7];
			}
		}
	}

	@ObfuscatedName("AWMLZOXZ.a(BIIIILjava/lang/String;)V")
	public void method24(int arg0, int arg1, int arg2, int arg3, String arg4) {
		if (arg4 != null) {
			arg2 -= method21(arg4) / 2;
			arg1 -= field64;
			for (int var6 = 0; var6 < arg4.length(); var6++) {
				char var7 = arg4.charAt(var6);
				if (var7 != ' ') {
					method29(field58[var7], field61[var7] + arg2 + (int) (Math.sin(arg0 / 5.0D + var6 / 5.0D) * 5.0D), field62[var7] + arg1 + (int) (Math.sin(arg0 / 5.0D + var6 / 3.0D) * 5.0D), field59[var7], field60[var7], arg3);
				}

				arg2 += field63[var7];
			}
		}
	}

	@ObfuscatedName("AWMLZOXZ.a(IZIIILjava/lang/String;I)V")
	public void method25(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
		if (arg4 != null) {
			double var7 = 7.0D - arg3 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg1 -= method21(arg4) / 2;
			arg0 -= field64;
			for (int var9 = 0; var9 < arg4.length(); var9++) {
				char var10 = arg4.charAt(var9);
				if (var10 != ' ') {
					method29(field58[var10], field61[var10] + arg1, field62[var10] + arg0 + (int) (Math.sin(var9 / 1.5D + arg2) * var7), field59[var10], field60[var10], arg5);
				}

				arg1 += field63[var10];
			}
		}
	}

	@ObfuscatedName("AWMLZOXZ.a(IIIZLjava/lang/String;I)V")
	public void method26(int arg0, int arg1, boolean arg2, String arg3, int arg4) {
		field66 = false;
		int var6 = arg0;
		if (arg3 != null) {
			arg1 -= field64;
			for (int var7 = 0; var7 < arg3.length(); var7++) {
				if (arg3.charAt(var7) == '@' && var7 + 4 < arg3.length() && arg3.charAt(var7 + 4) == '@') {
					int var8 = method28(arg3.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg4 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg3.charAt(var7);
					if (var9 != ' ') {
						if (arg2) {
							method29(field58[var9], field61[var9] + arg0 + 1, field62[var9] + arg1 + 1, field59[var9], field60[var9], 0);
						}

						method29(field58[var9], field61[var9] + arg0, field62[var9] + arg1, field59[var9], field60[var9], arg4);
					}

					arg0 += field63[var9];
				}
			}

			if (field66) {
				FVBHOYJF.method217(var6, (int) (field64 * 0.7D) + arg1, 0x800000, arg0 - var6);
			}
		}
	}

	@ObfuscatedName("AWMLZOXZ.a(IILjava/lang/String;IZBI)V")
	public void method27(int arg0, int arg1, String arg2, int arg3, boolean arg4, int arg5) {
		if (arg2 != null) {
			field65.setSeed(arg5);
			int var7 = (field65.nextInt() & 0x1F) + 192;
			arg3 -= field64;
			for (int var8 = 0; var8 < arg2.length(); var8++) {
				if (arg2.charAt(var8) == '@' && var8 + 4 < arg2.length() && arg2.charAt(var8 + 4) == '@') {
					int var9 = method28(arg2.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg0 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg2.charAt(var8);
					if (var10 != ' ') {
						if (arg4) {
							method31(192, field61[var10] + arg1 + 1, field59[var10], field60[var10], field58[var10], 0, field62[var10] + arg3 + 1);
						}

						method31(var7, field61[var10] + arg1, field59[var10], field60[var10], field58[var10], arg0, field62[var10] + arg3);
					}

					arg1 += field63[var10];
					if ((field65.nextInt() & 0x3) == 0) {
						arg1++;
					}
				}
			}
		}
	}

	@ObfuscatedName("AWMLZOXZ.a(BLjava/lang/String;)I")
	public int method28(String arg0) {
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
				field66 = true;
			}

			if (arg0.equals("end")) {
				field66 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("AWMLZOXZ.a([BIIIII)V")
	public void method29(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = FVBHOYJF.field640 * arg2 + arg1;
		int var8 = FVBHOYJF.field640 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < FVBHOYJF.field642) {
			int var11 = FVBHOYJF.field642 - arg2;
			arg4 -= var11;
			arg2 = FVBHOYJF.field642;
			var10 += arg3 * var11;
			var7 += FVBHOYJF.field640 * var11;
		}

		if (arg2 + arg4 >= FVBHOYJF.field643) {
			arg4 -= arg2 + arg4 + 1 - FVBHOYJF.field643;
		}

		if (arg1 < FVBHOYJF.field644) {
			int var12 = FVBHOYJF.field644 - arg1;
			arg3 -= var12;
			arg1 = FVBHOYJF.field644;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= FVBHOYJF.field645) {
			int var13 = arg1 + arg3 + 1 - FVBHOYJF.field645;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method30(FVBHOYJF.field639, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("AWMLZOXZ.a([I[BIIIIIII)V")
	public void method30(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("AWMLZOXZ.a(IIII[BIII)V")
	public void method31(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
		int var8 = FVBHOYJF.field640 * arg6 + arg1;
		int var9 = FVBHOYJF.field640 - arg2;
		int var10 = 0;
		int var11 = 0;
		if (arg6 < FVBHOYJF.field642) {
			int var12 = FVBHOYJF.field642 - arg6;
			arg3 -= var12;
			arg6 = FVBHOYJF.field642;
			var11 += arg2 * var12;
			var8 += FVBHOYJF.field640 * var12;
		}

		if (arg3 + arg6 >= FVBHOYJF.field643) {
			arg3 -= arg3 + arg6 + 1 - FVBHOYJF.field643;
		}

		if (arg1 < FVBHOYJF.field644) {
			int var13 = FVBHOYJF.field644 - arg1;
			arg2 -= var13;
			arg1 = FVBHOYJF.field644;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg1 + arg2 >= FVBHOYJF.field645) {
			int var14 = arg1 + arg2 + 1 - FVBHOYJF.field645;
			arg2 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg2 > 0 && arg3 > 0) {
			method32(var8, arg5, var9, var10, var11, arg0, arg2, arg3, arg4, FVBHOYJF.field639);
		}
	}

	@ObfuscatedName("AWMLZOXZ.a(IIIIIBIII[B[I)V")
	public void method32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int[] arg9) {
		arg1 = ((arg1 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg5 & 0xFF0000) >> 8;
		arg5 = 256 - arg5;
		for (int var11 = -arg7; var11 < 0; var11++) {
			for (int var12 = -arg6; var12 < 0; var12++) {
				if (arg8[arg4++] == 0) {
					arg0++;
				} else {
					int var13 = arg9[arg0];
					arg9[arg0++] = (((var13 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((var13 & 0xFF00) * arg5 & 0xFF0000) >> 8) + arg1;
				}
			}

			arg0 += arg2;
			arg4 += arg3;
		}
	}
}
