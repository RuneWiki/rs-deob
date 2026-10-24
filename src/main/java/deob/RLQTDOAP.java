package deob;

import java.util.Random;

@ObfuscatedName("RLQTDOAP")
public final class RLQTDOAP extends JOVUNXBE {

	@ObfuscatedName("RLQTDOAP.C")
	public byte[][] field1268 = new byte[256][];

	@ObfuscatedName("RLQTDOAP.D")
	public int[] field1269 = new int[256];

	@ObfuscatedName("RLQTDOAP.E")
	public int[] field1270 = new int[256];

	@ObfuscatedName("RLQTDOAP.F")
	public int[] field1271 = new int[256];

	@ObfuscatedName("RLQTDOAP.G")
	public int[] field1272 = new int[256];

	@ObfuscatedName("RLQTDOAP.H")
	public int[] field1273 = new int[256];

	@ObfuscatedName("RLQTDOAP.J")
	public Random field1275 = new Random();

	@ObfuscatedName("RLQTDOAP.K")
	public boolean field1276 = false;

	@ObfuscatedName("RLQTDOAP.I")
	public int field1274;

	public RLQTDOAP(boolean arg0, String arg1, TKEGJSFV arg2) {
		EGCCHUZS var4 = new EGCCHUZS(arg2.method542(arg1 + ".dat", null));
		EGCCHUZS var5 = new EGCCHUZS(arg2.method542("index.dat", null));
		boolean var6 = true;
		var5.field589 = var4.method263() + 4;
		int var7 = var5.method261();
		if (var7 > 0) {
			var5.field589 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field1271[var8] = var5.method261();
			field1272[var8] = var5.method261();
			int var10 = field1269[var8] = var5.method263();
			int var11 = field1270[var8] = var5.method263();
			int var12 = var5.method261();
			int var13 = var10 * var11;
			field1268[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field1268[var8][var14] = var4.method262();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field1268[var8][var10 * var16 + var15] = var4.method262();
					}
				}
			}

			if (var11 > field1274 && var8 < 128) {
				field1274 = var11;
			}

			field1271[var8] = 1;
			field1273[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field1268[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field1273[var8]--;
				field1271[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field1268[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field1273[var8]--;
			}
		}

		if (arg0) {
			field1273[32] = field1273[73];
		} else {
			field1273[32] = field1273[105];
		}
	}

	@ObfuscatedName("RLQTDOAP.a(ILjava/lang/String;III)V")
	public void method525(int arg0, String arg1, int arg2, int arg3) {
		method530(arg2, arg1, arg0 - method529(arg1), arg3);
	}

	@ObfuscatedName("RLQTDOAP.a(IIIILjava/lang/String;)V")
	public void method526(int arg0, int arg1, int arg2, String arg3) {
		method530(arg1, arg3, arg2 - method529(arg3) / 2, arg0);
	}

	@ObfuscatedName("RLQTDOAP.a(IIIZZLjava/lang/String;)V")
	public void method527(int arg0, int arg1, int arg2, boolean arg3, String arg4) {
		method534(arg4, arg1, arg0, arg2 - method528(arg4) / 2, arg3);
	}

	@ObfuscatedName("RLQTDOAP.a(Ljava/lang/String;I)I")
	public int method528(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field1273[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("RLQTDOAP.a(ILjava/lang/String;)I")
	public int method529(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field1273[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("RLQTDOAP.b(ILjava/lang/String;III)V")
	public void method530(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 != null) {
			arg0 -= field1274;
			for (int var5 = 0; var5 < arg1.length(); var5++) {
				char var6 = arg1.charAt(var5);
				if (var6 != ' ') {
					method537(field1268[var6], field1271[var6] + arg2, field1272[var6] + arg0, field1269[var6], field1270[var6], arg3);
				}

				arg2 += field1273[var6];
			}
		}
	}

	@ObfuscatedName("RLQTDOAP.a(IIILjava/lang/String;II)V")
	public void method531(int arg0, int arg1, String arg2, int arg3, int arg4) {
		if (arg2 != null) {
			arg3 -= method529(arg2) / 2;
			arg4 -= field1274;
			for (int var6 = 0; var6 < arg2.length(); var6++) {
				char var7 = arg2.charAt(var6);
				if (var7 != ' ') {
					method537(field1268[var7], field1271[var7] + arg3, field1272[var7] + arg4 + (int) (Math.sin(arg0 / 5.0D + var6 / 2.0D) * 5.0D), field1269[var7], field1270[var7], arg1);
				}

				arg3 += field1273[var7];
			}
		}
	}

	@ObfuscatedName("RLQTDOAP.a(Ljava/lang/String;IBIII)V")
	public void method532(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg3 -= method529(arg0) / 2;
			arg2 -= field1274;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method537(field1268[var7], field1271[var7] + arg3 + (int) (Math.sin(arg1 / 5.0D + var6 / 5.0D) * 5.0D), field1272[var7] + arg2 + (int) (Math.sin(arg1 / 5.0D + var6 / 3.0D) * 5.0D), field1269[var7], field1270[var7], arg4);
				}

				arg3 += field1273[var7];
			}
		}
	}

	@ObfuscatedName("RLQTDOAP.a(IIZIILjava/lang/String;I)V")
	public void method533(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
		if (arg4 != null) {
			double var7 = 7.0D - arg1 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg3 -= method529(arg4) / 2;
			arg0 -= field1274;
			for (int var9 = 0; var9 < arg4.length(); var9++) {
				char var10 = arg4.charAt(var9);
				if (var10 != ' ') {
					method537(field1268[var10], field1271[var10] + arg3, field1272[var10] + arg0 + (int) (Math.sin(var9 / 1.5D + arg5) * var7), field1269[var10], field1270[var10], arg2);
				}

				arg3 += field1273[var10];
			}
		}
	}

	@ObfuscatedName("RLQTDOAP.a(Ljava/lang/String;IIIIZ)V")
	public void method534(String arg0, int arg1, int arg2, int arg3, boolean arg4) {
		field1276 = false;
		int var6 = arg3;
		if (arg0 != null) {
			arg2 -= field1274;
			for (int var7 = 0; var7 < arg0.length(); var7++) {
				if (arg0.charAt(var7) == '@' && var7 + 4 < arg0.length() && arg0.charAt(var7 + 4) == '@') {
					int var8 = method536(arg0.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg1 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg0.charAt(var7);
					if (var9 != ' ') {
						if (arg4) {
							method537(field1268[var9], field1271[var9] + arg3 + 1, field1272[var9] + arg2 + 1, field1269[var9], field1270[var9], 0);
						}

						method537(field1268[var9], field1271[var9] + arg3, field1272[var9] + arg2, field1269[var9], field1270[var9], arg1);
					}

					arg3 += field1273[var9];
				}
			}

			if (field1276) {
				JOVUNXBE.method388((int) (field1274 * 0.7D) + arg2, var6, arg3 - var6, 0x800000);
			}
		}
	}

	@ObfuscatedName("RLQTDOAP.a(IILjava/lang/String;IIIZ)V")
	public void method535(int arg0, int arg1, String arg2, int arg3, int arg4, boolean arg5) {
		if (arg2 != null) {
			field1275.setSeed(arg1);
			int var7 = (field1275.nextInt() & 0x1F) + 192;
			arg3 -= field1274;
			for (int var8 = 0; var8 < arg2.length(); var8++) {
				if (arg2.charAt(var8) == '@' && var8 + 4 < arg2.length() && arg2.charAt(var8 + 4) == '@') {
					int var9 = method536(arg2.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg0 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg2.charAt(var8);
					if (var10 != ' ') {
						if (arg5) {
							method539(field1268[var10], field1272[var10] + arg3 + 1, 0, field1270[var10], field1271[var10] + arg4 + 1, field1269[var10], 192);
						}

						method539(field1268[var10], field1272[var10] + arg3, arg0, field1270[var10], field1271[var10] + arg4, field1269[var10], var7);
					}

					arg4 += field1273[var10];
					if ((field1275.nextInt() & 0x3) == 0) {
						arg4++;
					}
				}
			}
		}
	}

	@ObfuscatedName("RLQTDOAP.a(Ljava/lang/String;Z)I")
	public int method536(String arg0) {
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
				field1276 = true;
			}

			if (arg0.equals("end")) {
				field1276 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("RLQTDOAP.a([BIIIII)V")
	public void method537(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = JOVUNXBE.field851 * arg2 + arg1;
		int var8 = JOVUNXBE.field851 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < JOVUNXBE.field853) {
			int var11 = JOVUNXBE.field853 - arg2;
			arg4 -= var11;
			arg2 = JOVUNXBE.field853;
			var10 += arg3 * var11;
			var7 += JOVUNXBE.field851 * var11;
		}

		if (arg2 + arg4 >= JOVUNXBE.field854) {
			arg4 -= arg2 + arg4 + 1 - JOVUNXBE.field854;
		}

		if (arg1 < JOVUNXBE.field855) {
			int var12 = JOVUNXBE.field855 - arg1;
			arg3 -= var12;
			arg1 = JOVUNXBE.field855;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= JOVUNXBE.field856) {
			int var13 = arg1 + arg3 + 1 - JOVUNXBE.field856;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method538(JOVUNXBE.field850, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("RLQTDOAP.a([I[BIIIIIII)V")
	public void method538(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("RLQTDOAP.a([BZIIIIII)V")
	public void method539(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = JOVUNXBE.field851 * arg1 + arg4;
		int var9 = JOVUNXBE.field851 - arg5;
		int var10 = 0;
		int var11 = 0;
		if (arg1 < JOVUNXBE.field853) {
			int var12 = JOVUNXBE.field853 - arg1;
			arg3 -= var12;
			arg1 = JOVUNXBE.field853;
			var11 += arg5 * var12;
			var8 += JOVUNXBE.field851 * var12;
		}

		if (arg1 + arg3 >= JOVUNXBE.field854) {
			arg3 -= arg1 + arg3 + 1 - JOVUNXBE.field854;
		}

		if (arg4 < JOVUNXBE.field855) {
			int var13 = JOVUNXBE.field855 - arg4;
			arg5 -= var13;
			arg4 = JOVUNXBE.field855;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg4 + arg5 >= JOVUNXBE.field856) {
			int var14 = arg4 + arg5 + 1 - JOVUNXBE.field856;
			arg5 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg5 > 0 && arg3 > 0) {
			method540(arg2, var9, arg3, arg6, arg0, JOVUNXBE.field850, var10, var11, arg5, var8);
		}
	}

	@ObfuscatedName("RLQTDOAP.a(IIIII[B[IIIII)V")
	public void method540(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
		arg0 = ((arg0 & 0xFF00FF) * arg3 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg3 & 0xFF0000) >> 8;
		arg3 = 256 - arg3;
		for (int var11 = -arg2; var11 < 0; var11++) {
			for (int var12 = -arg8; var12 < 0; var12++) {
				if (arg4[arg7++] == 0) {
					arg9++;
				} else {
					int var13 = arg5[arg9];
					arg5[arg9++] = (((var13 & 0xFF00FF) * arg3 & 0xFF00FF00) + ((var13 & 0xFF00) * arg3 & 0xFF0000) >> 8) + arg0;
				}
			}

			arg9 += arg1;
			arg7 += arg6;
		}
	}
}
