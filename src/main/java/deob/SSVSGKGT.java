package deob;

import java.util.Random;

@ObfuscatedName("SSVSGKGT")
public final class SSVSGKGT extends UKUXLUWP {

	@ObfuscatedName("SSVSGKGT.E")
	public byte[][] field1236 = new byte[256][];

	@ObfuscatedName("SSVSGKGT.F")
	public int[] field1237 = new int[256];

	@ObfuscatedName("SSVSGKGT.G")
	public int[] field1238 = new int[256];

	@ObfuscatedName("SSVSGKGT.H")
	public int[] field1239 = new int[256];

	@ObfuscatedName("SSVSGKGT.I")
	public int[] field1240 = new int[256];

	@ObfuscatedName("SSVSGKGT.J")
	public int[] field1241 = new int[256];

	@ObfuscatedName("SSVSGKGT.L")
	public Random field1243 = new Random();

	@ObfuscatedName("SSVSGKGT.M")
	public boolean field1244 = false;

	@ObfuscatedName("SSVSGKGT.K")
	public int field1242;

	public SSVSGKGT(String arg0, boolean arg1, GWOEELWB arg2) {
		MLYYHULT var4 = new MLYYHULT(arg2.method249(arg0 + ".dat", null));
		MLYYHULT var5 = new MLYYHULT(arg2.method249("index.dat", null));
		boolean var6 = true;
		var5.field963 = var4.method298() + 4;
		int var7 = var5.method296();
		if (var7 > 0) {
			var5.field963 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field1239[var8] = var5.method296();
			field1240[var8] = var5.method296();
			int var10 = field1237[var8] = var5.method298();
			int var11 = field1238[var8] = var5.method298();
			int var12 = var5.method296();
			int var13 = var10 * var11;
			field1236[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field1236[var8][var14] = var4.method297();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field1236[var8][var10 * var16 + var15] = var4.method297();
					}
				}
			}

			if (var11 > field1242 && var8 < 128) {
				field1242 = var11;
			}

			field1239[var8] = 1;
			field1241[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field1236[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field1241[var8]--;
				field1239[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field1236[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field1241[var8]--;
			}
		}

		if (arg1) {
			field1241[32] = field1241[73];
		} else {
			field1241[32] = field1241[105];
		}
	}

	@ObfuscatedName("SSVSGKGT.a(IIIILjava/lang/String;)V")
	public void method453(int arg0, int arg1, int arg2, String arg3) {
		method458(arg2, arg0 - method457(arg3), arg1, arg3);
	}

	@ObfuscatedName("SSVSGKGT.b(IIIILjava/lang/String;)V")
	public void method454(int arg0, int arg1, int arg2, String arg3) {
		method458(arg0, arg2 - method457(arg3) / 2, arg1, arg3);
	}

	@ObfuscatedName("SSVSGKGT.a(Ljava/lang/String;IIZII)V")
	public void method455(String arg0, int arg1, boolean arg2, int arg3, int arg4) {
		method462(arg3 - method456(arg0) / 2, arg4, arg2, arg0, arg1);
	}

	@ObfuscatedName("SSVSGKGT.a(Ljava/lang/String;I)I")
	public int method456(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field1241[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("SSVSGKGT.b(Ljava/lang/String;I)I")
	public int method457(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field1241[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("SSVSGKGT.a(BIIILjava/lang/String;)V")
	public void method458(int arg0, int arg1, int arg2, String arg3) {
		if (arg3 != null) {
			arg2 -= field1242;
			for (int var5 = 0; var5 < arg3.length(); var5++) {
				char var6 = arg3.charAt(var5);
				if (var6 != ' ') {
					method465(field1236[var6], field1239[var6] + arg1, field1240[var6] + arg2, field1237[var6], field1238[var6], arg0);
				}

				arg1 += field1241[var6];
			}
		}
	}

	@ObfuscatedName("SSVSGKGT.a(IIIILjava/lang/String;I)V")
	public void method459(int arg0, int arg1, int arg2, int arg3, String arg4) {
		if (arg4 != null) {
			arg3 -= method457(arg4) / 2;
			arg1 -= field1242;
			for (int var6 = 0; var6 < arg4.length(); var6++) {
				char var7 = arg4.charAt(var6);
				if (var7 != ' ') {
					method465(field1236[var7], field1239[var7] + arg3, field1240[var7] + arg1 + (int) (Math.sin(arg0 / 5.0D + var6 / 2.0D) * 5.0D), field1237[var7], field1238[var7], arg2);
				}

				arg3 += field1241[var7];
			}
		}
	}

	@ObfuscatedName("SSVSGKGT.a(IIILjava/lang/String;II)V")
	public void method460(int arg0, int arg1, int arg2, String arg3, int arg4) {
		if (arg3 != null) {
			arg2 -= method457(arg3) / 2;
			arg0 -= field1242;
			for (int var6 = 0; var6 < arg3.length(); var6++) {
				char var7 = arg3.charAt(var6);
				if (var7 != ' ') {
					method465(field1236[var7], field1239[var7] + arg2 + (int) (Math.sin(arg4 / 5.0D + var6 / 5.0D) * 5.0D), field1240[var7] + arg0 + (int) (Math.sin(arg4 / 5.0D + var6 / 3.0D) * 5.0D), field1237[var7], field1238[var7], arg1);
				}

				arg2 += field1241[var7];
			}
		}
	}

	@ObfuscatedName("SSVSGKGT.a(IILjava/lang/String;IIII)V")
	public void method461(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 != null) {
			double var7 = 7.0D - arg2 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg5 -= method457(arg1) / 2;
			arg3 -= field1242;
			for (int var9 = 0; var9 < arg1.length(); var9++) {
				char var10 = arg1.charAt(var9);
				if (var10 != ' ') {
					method465(field1236[var10], field1239[var10] + arg5, field1240[var10] + arg3 + (int) (Math.sin(var9 / 1.5D + arg4) * var7), field1237[var10], field1238[var10], arg0);
				}

				arg5 += field1241[var10];
			}
		}
	}

	@ObfuscatedName("SSVSGKGT.a(IIZILjava/lang/String;I)V")
	public void method462(int arg0, int arg1, boolean arg2, String arg3, int arg4) {
		field1244 = false;
		int var6 = arg0;
		if (arg3 != null) {
			arg4 -= field1242;
			for (int var7 = 0; var7 < arg3.length(); var7++) {
				if (arg3.charAt(var7) == '@' && var7 + 4 < arg3.length() && arg3.charAt(var7 + 4) == '@') {
					int var8 = method464(arg3.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg1 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg3.charAt(var7);
					if (var9 != ' ') {
						if (arg2) {
							method465(field1236[var9], field1239[var9] + arg0 + 1, field1240[var9] + arg4 + 1, field1237[var9], field1238[var9], 0);
						}

						method465(field1236[var9], field1239[var9] + arg0, field1240[var9] + arg4, field1237[var9], field1238[var9], arg1);
					}

					arg0 += field1241[var9];
				}
			}

			if (field1244) {
				UKUXLUWP.method549(0x800000, (int) (field1242 * 0.7D) + arg4, arg0 - var6, var6);
			}
		}
	}

	@ObfuscatedName("SSVSGKGT.a(ILjava/lang/String;IIIIZ)V")
	public void method463(String arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (arg0 != null) {
			field1243.setSeed(arg3);
			int var7 = (field1243.nextInt() & 0x1F) + 192;
			arg2 -= field1242;
			for (int var8 = 0; var8 < arg0.length(); var8++) {
				if (arg0.charAt(var8) == '@' && var8 + 4 < arg0.length() && arg0.charAt(var8 + 4) == '@') {
					int var9 = method464(arg0.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg4 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg0.charAt(var8);
					if (var10 != ' ') {
						if (arg5) {
							method467(0, 192, field1238[var10], field1240[var10] + arg2 + 1, field1239[var10] + arg1 + 1, field1237[var10], field1236[var10]);
						}

						method467(arg4, var7, field1238[var10], field1240[var10] + arg2, field1239[var10] + arg1, field1237[var10], field1236[var10]);
					}

					arg1 += field1241[var10];
					if ((field1243.nextInt() & 0x3) == 0) {
						arg1++;
					}
				}
			}
		}
	}

	@ObfuscatedName("SSVSGKGT.a(ILjava/lang/String;)I")
	public int method464(String arg0) {
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
				field1244 = true;
			}

			if (arg0.equals("end")) {
				field1244 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("SSVSGKGT.a([BIIIII)V")
	public void method465(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = UKUXLUWP.field1346 * arg2 + arg1;
		int var8 = UKUXLUWP.field1346 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < UKUXLUWP.field1348) {
			int var11 = UKUXLUWP.field1348 - arg2;
			arg4 -= var11;
			arg2 = UKUXLUWP.field1348;
			var10 += arg3 * var11;
			var7 += UKUXLUWP.field1346 * var11;
		}

		if (arg2 + arg4 >= UKUXLUWP.field1349) {
			arg4 -= arg2 + arg4 + 1 - UKUXLUWP.field1349;
		}

		if (arg1 < UKUXLUWP.field1350) {
			int var12 = UKUXLUWP.field1350 - arg1;
			arg3 -= var12;
			arg1 = UKUXLUWP.field1350;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= UKUXLUWP.field1351) {
			int var13 = arg1 + arg3 + 1 - UKUXLUWP.field1351;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method466(UKUXLUWP.field1345, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("SSVSGKGT.a([I[BIIIIIII)V")
	public void method466(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("SSVSGKGT.a(IIIIII[BI)V")
	public void method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
		int var8 = UKUXLUWP.field1346 * arg3 + arg4;
		int var9 = UKUXLUWP.field1346 - arg5;
		int var10 = 0;
		int var11 = 0;
		if (arg3 < UKUXLUWP.field1348) {
			int var12 = UKUXLUWP.field1348 - arg3;
			arg2 -= var12;
			arg3 = UKUXLUWP.field1348;
			var11 += arg5 * var12;
			var8 += UKUXLUWP.field1346 * var12;
		}

		if (arg2 + arg3 >= UKUXLUWP.field1349) {
			arg2 -= arg2 + arg3 + 1 - UKUXLUWP.field1349;
		}

		if (arg4 < UKUXLUWP.field1350) {
			int var13 = UKUXLUWP.field1350 - arg4;
			arg5 -= var13;
			arg4 = UKUXLUWP.field1350;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg4 + arg5 >= UKUXLUWP.field1351) {
			int var14 = arg4 + arg5 + 1 - UKUXLUWP.field1351;
			arg5 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg5 > 0 && arg2 > 0) {
			method468(arg2, arg1, var9, var10, var8, arg6, arg0, var11, UKUXLUWP.field1345, arg5);
		}
	}

	@ObfuscatedName("SSVSGKGT.a(IIIIII[BII[II)V")
	public void method468(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int[] arg8, int arg9) {
		arg6 = ((arg6 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg6 & 0xFF00) * arg1 & 0xFF0000) >> 8;
		arg1 = 256 - arg1;
		for (int var11 = -arg0; var11 < 0; var11++) {
			for (int var12 = -arg9; var12 < 0; var12++) {
				if (arg5[arg7++] == 0) {
					arg4++;
				} else {
					int var13 = arg8[arg4];
					arg8[arg4++] = (((var13 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((var13 & 0xFF00) * arg1 & 0xFF0000) >> 8) + arg6;
				}
			}

			arg4 += arg2;
			arg7 += arg3;
		}
	}
}
