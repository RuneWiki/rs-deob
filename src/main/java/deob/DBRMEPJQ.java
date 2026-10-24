package deob;

import java.util.Random;

@ObfuscatedName("DBRMEPJQ")
public final class DBRMEPJQ extends TQHEKXXC {

	@ObfuscatedName("DBRMEPJQ.J")
	public byte[][] field639 = new byte[256][];

	@ObfuscatedName("DBRMEPJQ.K")
	public int[] field640 = new int[256];

	@ObfuscatedName("DBRMEPJQ.L")
	public int[] field641 = new int[256];

	@ObfuscatedName("DBRMEPJQ.M")
	public int[] field642 = new int[256];

	@ObfuscatedName("DBRMEPJQ.N")
	public int[] field643 = new int[256];

	@ObfuscatedName("DBRMEPJQ.O")
	public int[] field644 = new int[256];

	@ObfuscatedName("DBRMEPJQ.Q")
	public Random field646 = new Random();

	@ObfuscatedName("DBRMEPJQ.R")
	public boolean field647 = false;

	@ObfuscatedName("DBRMEPJQ.P")
	public int field645;

	public DBRMEPJQ(String arg0, boolean arg1, XRWUKRPO arg2) {
		GLMIQHJI var4 = new GLMIQHJI(arg2.method581(arg0 + ".dat", null));
		GLMIQHJI var5 = new GLMIQHJI(arg2.method581("index.dat", null));
		boolean var6 = true;
		var5.field709 = var4.method246() + 4;
		int var7 = var5.method244();
		if (var7 > 0) {
			var5.field709 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field642[var8] = var5.method244();
			field643[var8] = var5.method244();
			int var10 = field640[var8] = var5.method246();
			int var11 = field641[var8] = var5.method246();
			int var12 = var5.method244();
			int var13 = var10 * var11;
			field639[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field639[var8][var14] = var4.method245();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field639[var8][var10 * var16 + var15] = var4.method245();
					}
				}
			}

			if (var11 > field645 && var8 < 128) {
				field645 = var11;
			}

			field642[var8] = 1;
			field644[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field639[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field644[var8]--;
				field642[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field639[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field644[var8]--;
			}
		}

		if (arg1) {
			field644[32] = field644[73];
		} else {
			field644[32] = field644[105];
		}
	}

	@ObfuscatedName("DBRMEPJQ.a(IIIILjava/lang/String;)V")
	public void method189(int arg0, int arg1, int arg2, String arg3) {
		method194(arg3, arg0, arg2 - method193(arg3), arg1);
	}

	@ObfuscatedName("DBRMEPJQ.a(IIILjava/lang/String;I)V")
	public void method190(int arg0, int arg1, String arg2, int arg3) {
		method194(arg2, arg3, arg1 - method193(arg2) / 2, arg0);
	}

	@ObfuscatedName("DBRMEPJQ.a(IIILjava/lang/String;IZ)V")
	public void method191(int arg0, int arg1, int arg2, String arg3, boolean arg4) {
		method198(arg3, arg1, arg4, arg0 - method192(arg3) / 2, arg2);
	}

	@ObfuscatedName("DBRMEPJQ.a(Ljava/lang/String;I)I")
	public int method192(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field644[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("DBRMEPJQ.b(Ljava/lang/String;I)I")
	public int method193(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field644[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("DBRMEPJQ.a(BLjava/lang/String;III)V")
	public void method194(String arg0, int arg1, int arg2, int arg3) {
		if (arg0 != null) {
			arg3 -= field645;
			for (int var5 = 0; var5 < arg0.length(); var5++) {
				char var6 = arg0.charAt(var5);
				if (var6 != ' ') {
					method201(field639[var6], field642[var6] + arg2, field643[var6] + arg3, field640[var6], field641[var6], arg1);
				}

				arg2 += field644[var6];
			}
		}
	}

	@ObfuscatedName("DBRMEPJQ.a(IZLjava/lang/String;III)V")
	public void method195(int arg0, String arg1, int arg2, int arg3, int arg4) {
		if (arg1 != null) {
			arg0 -= method193(arg1) / 2;
			arg2 -= field645;
			for (int var6 = 0; var6 < arg1.length(); var6++) {
				char var7 = arg1.charAt(var6);
				if (var7 != ' ') {
					method201(field639[var7], field642[var7] + arg0, field643[var7] + arg2 + (int) (Math.sin(arg4 / 5.0D + var6 / 2.0D) * 5.0D), field640[var7], field641[var7], arg3);
				}

				arg0 += field644[var7];
			}
		}
	}

	@ObfuscatedName("DBRMEPJQ.a(Ljava/lang/String;IZIII)V")
	public void method196(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg4 -= method193(arg0) / 2;
			arg3 -= field645;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method201(field639[var7], field642[var7] + arg4 + (int) (Math.sin(arg2 / 5.0D + var6 / 5.0D) * 5.0D), field643[var7] + arg3 + (int) (Math.sin(arg2 / 5.0D + var6 / 3.0D) * 5.0D), field640[var7], field641[var7], arg1);
				}

				arg4 += field644[var7];
			}
		}
	}

	@ObfuscatedName("DBRMEPJQ.a(IIILjava/lang/String;IBI)V")
	public void method197(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
		if (arg3 != null) {
			double var7 = 7.0D - arg0 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg5 -= method193(arg3) / 2;
			arg4 -= field645;
			for (int var9 = 0; var9 < arg3.length(); var9++) {
				char var10 = arg3.charAt(var9);
				if (var10 != ' ') {
					method201(field639[var10], field642[var10] + arg5, field643[var10] + arg4 + (int) (Math.sin(var9 / 1.5D + arg2) * var7), field640[var10], field641[var10], arg1);
				}

				arg5 += field644[var10];
			}
		}
	}

	@ObfuscatedName("DBRMEPJQ.a(Ljava/lang/String;IZZII)V")
	public void method198(String arg0, int arg1, boolean arg2, int arg3, int arg4) {
		field647 = false;
		int var6 = arg3;
		if (arg0 != null) {
			arg1 -= field645;
			for (int var7 = 0; var7 < arg0.length(); var7++) {
				if (arg0.charAt(var7) == '@' && var7 + 4 < arg0.length() && arg0.charAt(var7 + 4) == '@') {
					int var8 = method200(arg0.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg4 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg0.charAt(var7);
					if (var9 != ' ') {
						if (arg2) {
							method201(field639[var9], field642[var9] + arg3 + 1, field643[var9] + arg1 + 1, field640[var9], field641[var9], 0);
						}

						method201(field639[var9], field642[var9] + arg3, field643[var9] + arg1, field640[var9], field641[var9], arg4);
					}

					arg3 += field644[var9];
				}
			}

			if (field647) {
				TQHEKXXC.method481(var6, 0x800000, arg3 - var6, (int) (field645 * 0.7D) + arg1);
			}
		}
	}

	@ObfuscatedName("DBRMEPJQ.a(IZILjava/lang/String;ZII)V")
	public void method199(int arg0, boolean arg1, int arg2, String arg3, int arg4, int arg5) {
		if (arg3 != null) {
			field646.setSeed(arg0);
			int var7 = (field646.nextInt() & 0x1F) + 192;
			arg2 -= field645;
			for (int var8 = 0; var8 < arg3.length(); var8++) {
				if (arg3.charAt(var8) == '@' && var8 + 4 < arg3.length() && arg3.charAt(var8 + 4) == '@') {
					int var9 = method200(arg3.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg5 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg3.charAt(var8);
					if (var10 != ' ') {
						if (arg1) {
							method203(field641[var10], 192, field643[var10] + arg2 + 1, field639[var10], field640[var10], 0, field642[var10] + arg4 + 1);
						}

						method203(field641[var10], var7, field643[var10] + arg2, field639[var10], field640[var10], arg5, field642[var10] + arg4);
					}

					arg4 += field644[var10];
					if ((field646.nextInt() & 0x3) == 0) {
						arg4++;
					}
				}
			}
		}
	}

	@ObfuscatedName("DBRMEPJQ.a(Ljava/lang/String;B)I")
	public int method200(String arg0) {
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
				field647 = true;
			}

			if (arg0.equals("end")) {
				field647 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("DBRMEPJQ.a([BIIIII)V")
	public void method201(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = TQHEKXXC.field1090 * arg2 + arg1;
		int var8 = TQHEKXXC.field1090 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < TQHEKXXC.field1092) {
			int var11 = TQHEKXXC.field1092 - arg2;
			arg4 -= var11;
			arg2 = TQHEKXXC.field1092;
			var10 += arg3 * var11;
			var7 += TQHEKXXC.field1090 * var11;
		}

		if (arg2 + arg4 >= TQHEKXXC.field1093) {
			arg4 -= arg2 + arg4 + 1 - TQHEKXXC.field1093;
		}

		if (arg1 < TQHEKXXC.field1094) {
			int var12 = TQHEKXXC.field1094 - arg1;
			arg3 -= var12;
			arg1 = TQHEKXXC.field1094;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= TQHEKXXC.field1095) {
			int var13 = arg1 + arg3 + 1 - TQHEKXXC.field1095;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method202(TQHEKXXC.field1089, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("DBRMEPJQ.a([I[BIIIIIII)V")
	public void method202(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("DBRMEPJQ.a(III[BIZII)V")
	public void method203(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
		int var8 = TQHEKXXC.field1090 * arg2 + arg6;
		int var9 = TQHEKXXC.field1090 - arg4;
		int var10 = 0;
		int var11 = 0;
		if (arg2 < TQHEKXXC.field1092) {
			int var12 = TQHEKXXC.field1092 - arg2;
			arg0 -= var12;
			arg2 = TQHEKXXC.field1092;
			var11 += arg4 * var12;
			var8 += TQHEKXXC.field1090 * var12;
		}

		if (arg0 + arg2 >= TQHEKXXC.field1093) {
			arg0 -= arg0 + arg2 + 1 - TQHEKXXC.field1093;
		}

		if (arg6 < TQHEKXXC.field1094) {
			int var13 = TQHEKXXC.field1094 - arg6;
			arg4 -= var13;
			arg6 = TQHEKXXC.field1094;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg4 + arg6 >= TQHEKXXC.field1095) {
			int var14 = arg4 + arg6 + 1 - TQHEKXXC.field1095;
			arg4 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg4 > 0 && arg0 > 0) {
			method204(var8, TQHEKXXC.field1089, var10, arg3, arg0, var9, arg4, arg1, var11, arg5);
		}
	}

	@ObfuscatedName("DBRMEPJQ.a(I[II[BIZIIIII)V")
	public void method204(int arg0, int[] arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		arg9 = ((arg9 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((arg9 & 0xFF00) * arg7 & 0xFF0000) >> 8;
		arg7 = 256 - arg7;
		for (int var11 = -arg4; var11 < 0; var11++) {
			for (int var12 = -arg6; var12 < 0; var12++) {
				if (arg3[arg8++] == 0) {
					arg0++;
				} else {
					int var13 = arg1[arg0];
					arg1[arg0++] = (((var13 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((var13 & 0xFF00) * arg7 & 0xFF0000) >> 8) + arg9;
				}
			}

			arg0 += arg5;
			arg8 += arg2;
		}
	}
}
