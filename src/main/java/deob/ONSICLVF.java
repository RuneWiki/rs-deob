package deob;

import java.util.Random;

@ObfuscatedName("ONSICLVF")
public final class ONSICLVF extends DEVPLWNC {

	@ObfuscatedName("ONSICLVF.C")
	public byte[][] field1034 = new byte[256][];

	@ObfuscatedName("ONSICLVF.D")
	public int[] field1035 = new int[256];

	@ObfuscatedName("ONSICLVF.E")
	public int[] field1036 = new int[256];

	@ObfuscatedName("ONSICLVF.F")
	public int[] field1037 = new int[256];

	@ObfuscatedName("ONSICLVF.G")
	public int[] field1038 = new int[256];

	@ObfuscatedName("ONSICLVF.H")
	public int[] field1039 = new int[256];

	@ObfuscatedName("ONSICLVF.J")
	public Random field1041 = new Random();

	@ObfuscatedName("ONSICLVF.K")
	public boolean field1042 = false;

	@ObfuscatedName("ONSICLVF.I")
	public int field1040;

	public ONSICLVF(WEMOPWVJ arg0, boolean arg1, String arg2) {
		SVWJKJVI var4 = new SVWJKJVI(arg0.method559(arg2 + ".dat", null));
		SVWJKJVI var5 = new SVWJKJVI(arg0.method559("index.dat", null));
		boolean var6 = true;
		var5.field1263 = var4.method463() + 4;
		int var7 = var5.method461();
		if (var7 > 0) {
			var5.field1263 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field1037[var8] = var5.method461();
			field1038[var8] = var5.method461();
			int var10 = field1035[var8] = var5.method463();
			int var11 = field1036[var8] = var5.method463();
			int var12 = var5.method461();
			int var13 = var10 * var11;
			field1034[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field1034[var8][var14] = var4.method462();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field1034[var8][var10 * var16 + var15] = var4.method462();
					}
				}
			}

			if (var11 > field1040 && var8 < 128) {
				field1040 = var11;
			}

			field1037[var8] = 1;
			field1039[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field1034[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field1039[var8]--;
				field1037[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field1034[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field1039[var8]--;
			}
		}

		if (arg1) {
			field1039[32] = field1039[73];
		} else {
			field1039[32] = field1039[105];
		}
	}

	@ObfuscatedName("ONSICLVF.a(IILjava/lang/String;II)V")
	public void method359(int arg0, String arg1, int arg2, int arg3) {
		method364(arg0, arg2, arg3 - method363(arg1), arg1);
	}

	@ObfuscatedName("ONSICLVF.a(IBLjava/lang/String;II)V")
	public void method360(int arg0, String arg1, int arg2, int arg3) {
		method364(arg0, arg3, arg2 - method363(arg1) / 2, arg1);
	}

	@ObfuscatedName("ONSICLVF.a(IILjava/lang/String;IZI)V")
	public void method361(int arg0, int arg1, String arg2, boolean arg3, int arg4) {
		method368(arg4, arg3, arg2, arg0 - method362(arg2) / 2, arg1);
	}

	@ObfuscatedName("ONSICLVF.a(Ljava/lang/String;I)I")
	public int method362(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field1039[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("ONSICLVF.a(BLjava/lang/String;)I")
	public int method363(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field1039[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("ONSICLVF.a(IIBILjava/lang/String;)V")
	public void method364(int arg0, int arg1, int arg2, String arg3) {
		if (arg3 != null) {
			arg0 -= field1040;
			for (int var5 = 0; var5 < arg3.length(); var5++) {
				char var6 = arg3.charAt(var5);
				if (var6 != ' ') {
					method371(field1034[var6], field1037[var6] + arg2, field1038[var6] + arg0, field1035[var6], field1036[var6], arg1);
				}

				arg2 += field1039[var6];
			}
		}
	}

	@ObfuscatedName("ONSICLVF.a(IIIILjava/lang/String;I)V")
	public void method365(int arg0, int arg1, int arg2, String arg3, int arg4) {
		if (arg3 != null) {
			arg0 -= method363(arg3) / 2;
			arg4 -= field1040;
			for (int var6 = 0; var6 < arg3.length(); var6++) {
				char var7 = arg3.charAt(var6);
				if (var7 != ' ') {
					method371(field1034[var7], field1037[var7] + arg0, field1038[var7] + arg4 + (int) (Math.sin(arg1 / 5.0D + var6 / 2.0D) * 5.0D), field1035[var7], field1036[var7], arg2);
				}

				arg0 += field1039[var7];
			}
		}
	}

	@ObfuscatedName("ONSICLVF.a(Ljava/lang/String;IIIII)V")
	public void method366(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg3 -= method363(arg0) / 2;
			arg2 -= field1040;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method371(field1034[var7], field1037[var7] + arg3 + (int) (Math.sin(arg1 / 5.0D + var6 / 5.0D) * 5.0D), field1038[var7] + arg2 + (int) (Math.sin(arg1 / 5.0D + var6 / 3.0D) * 5.0D), field1035[var7], field1036[var7], arg4);
				}

				arg3 += field1039[var7];
			}
		}
	}

	@ObfuscatedName("ONSICLVF.a(IIILjava/lang/String;III)V")
	public void method367(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
		if (arg2 != null) {
			double var7 = 7.0D - arg4 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg5 -= method363(arg2) / 2;
			arg0 -= field1040;
			for (int var9 = 0; var9 < arg2.length(); var9++) {
				char var10 = arg2.charAt(var9);
				if (var10 != ' ') {
					method371(field1034[var10], field1037[var10] + arg5, field1038[var10] + arg0 + (int) (Math.sin(var9 / 1.5D + arg3) * var7), field1035[var10], field1036[var10], arg1);
				}

				arg5 += field1039[var10];
			}
		}
	}

	@ObfuscatedName("ONSICLVF.a(IZLjava/lang/String;III)V")
	public void method368(int arg0, boolean arg1, String arg2, int arg3, int arg4) {
		field1042 = false;
		int var6 = arg3;
		if (arg2 != null) {
			arg4 -= field1040;
			for (int var7 = 0; var7 < arg2.length(); var7++) {
				if (arg2.charAt(var7) == '@' && var7 + 4 < arg2.length() && arg2.charAt(var7 + 4) == '@') {
					int var8 = method370(arg2.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg0 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg2.charAt(var7);
					if (var9 != ' ') {
						if (arg1) {
							method371(field1034[var9], field1037[var9] + arg3 + 1, field1038[var9] + arg4 + 1, field1035[var9], field1036[var9], 0);
						}

						method371(field1034[var9], field1037[var9] + arg3, field1038[var9] + arg4, field1035[var9], field1036[var9], arg0);
					}

					arg3 += field1039[var9];
				}
			}

			if (field1042) {
				DEVPLWNC.method167(var6, arg3 - var6, 0x800000, (int) (field1040 * 0.7D) + arg4);
			}
		}
	}

	@ObfuscatedName("ONSICLVF.a(IILjava/lang/String;IIZZ)V")
	public void method369(int arg0, int arg1, String arg2, int arg3, int arg4, boolean arg5) {
		if (arg2 != null) {
			field1041.setSeed(arg3);
			int var7 = (field1041.nextInt() & 0x1F) + 192;
			arg0 -= field1040;
			for (int var8 = 0; var8 < arg2.length(); var8++) {
				if (arg2.charAt(var8) == '@' && var8 + 4 < arg2.length() && arg2.charAt(var8 + 4) == '@') {
					int var9 = method370(arg2.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg1 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg2.charAt(var8);
					if (var10 != ' ') {
						if (arg5) {
							method373(field1034[var10], 0, field1035[var10], field1036[var10], field1038[var10] + arg0 + 1, field1037[var10] + arg4 + 1, 192);
						}

						method373(field1034[var10], arg1, field1035[var10], field1036[var10], field1038[var10] + arg0, field1037[var10] + arg4, var7);
					}

					arg4 += field1039[var10];
					if ((field1041.nextInt() & 0x3) == 0) {
						arg4++;
					}
				}
			}
		}
	}

	@ObfuscatedName("ONSICLVF.b(Ljava/lang/String;I)I")
	public int method370(String arg0) {
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
				field1042 = true;
			}

			if (arg0.equals("end")) {
				field1042 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("ONSICLVF.a([BIIIII)V")
	public void method371(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = DEVPLWNC.field525 * arg2 + arg1;
		int var8 = DEVPLWNC.field525 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < DEVPLWNC.field527) {
			int var11 = DEVPLWNC.field527 - arg2;
			arg4 -= var11;
			arg2 = DEVPLWNC.field527;
			var10 += arg3 * var11;
			var7 += DEVPLWNC.field525 * var11;
		}

		if (arg2 + arg4 >= DEVPLWNC.field528) {
			arg4 -= arg2 + arg4 + 1 - DEVPLWNC.field528;
		}

		if (arg1 < DEVPLWNC.field529) {
			int var12 = DEVPLWNC.field529 - arg1;
			arg3 -= var12;
			arg1 = DEVPLWNC.field529;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= DEVPLWNC.field530) {
			int var13 = arg1 + arg3 + 1 - DEVPLWNC.field530;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method372(DEVPLWNC.field524, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("ONSICLVF.a([I[BIIIIIII)V")
	public void method372(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("ONSICLVF.a([BIIIIIII)V")
	public void method373(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = DEVPLWNC.field525 * arg4 + arg5;
		int var9 = DEVPLWNC.field525 - arg2;
		int var10 = 0;
		int var11 = 0;
		if (arg4 < DEVPLWNC.field527) {
			int var12 = DEVPLWNC.field527 - arg4;
			arg3 -= var12;
			arg4 = DEVPLWNC.field527;
			var11 += arg2 * var12;
			var8 += DEVPLWNC.field525 * var12;
		}

		if (arg3 + arg4 >= DEVPLWNC.field528) {
			arg3 -= arg3 + arg4 + 1 - DEVPLWNC.field528;
		}

		if (arg5 < DEVPLWNC.field529) {
			int var13 = DEVPLWNC.field529 - arg5;
			arg2 -= var13;
			arg5 = DEVPLWNC.field529;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg2 + arg5 >= DEVPLWNC.field530) {
			int var14 = arg2 + arg5 + 1 - DEVPLWNC.field530;
			arg2 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg2 > 0 && arg3 > 0) {
			method374(var10, arg6, arg3, var9, arg0, var8, DEVPLWNC.field524, arg2, var11, arg1);
		}
	}

	@ObfuscatedName("ONSICLVF.a(IBIII[BI[IIII)V")
	public void method374(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
		arg9 = ((arg9 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg9 & 0xFF00) * arg1 & 0xFF0000) >> 8;
		arg1 = 256 - arg1;
		for (int var11 = -arg2; var11 < 0; var11++) {
			for (int var12 = -arg7; var12 < 0; var12++) {
				if (arg4[arg8++] == 0) {
					arg5++;
				} else {
					int var13 = arg6[arg5];
					arg6[arg5++] = (((var13 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((var13 & 0xFF00) * arg1 & 0xFF0000) >> 8) + arg9;
				}
			}

			arg5 += arg3;
			arg8 += arg0;
		}
	}
}
