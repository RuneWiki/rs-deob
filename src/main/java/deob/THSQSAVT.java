package deob;

import java.util.Random;

@ObfuscatedName("THSQSAVT")
public final class THSQSAVT extends JNJDBENA {

	@ObfuscatedName("THSQSAVT.C")
	public byte[][] field1255 = new byte[256][];

	@ObfuscatedName("THSQSAVT.D")
	public int[] field1256 = new int[256];

	@ObfuscatedName("THSQSAVT.E")
	public int[] field1257 = new int[256];

	@ObfuscatedName("THSQSAVT.F")
	public int[] field1258 = new int[256];

	@ObfuscatedName("THSQSAVT.G")
	public int[] field1259 = new int[256];

	@ObfuscatedName("THSQSAVT.H")
	public int[] field1260 = new int[256];

	@ObfuscatedName("THSQSAVT.J")
	public Random field1262 = new Random();

	@ObfuscatedName("THSQSAVT.K")
	public boolean field1263 = false;

	@ObfuscatedName("THSQSAVT.I")
	public int field1261;

	public THSQSAVT(DTIATKJO arg0, String arg1, boolean arg2) {
		GHHPHSRU var4 = new GHHPHSRU(arg0.method168(arg1 + ".dat", null));
		GHHPHSRU var5 = new GHHPHSRU(arg0.method168("index.dat", null));
		boolean var6 = true;
		var5.field667 = var4.method204() + 4;
		int var7 = var5.method202();
		if (var7 > 0) {
			var5.field667 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field1258[var8] = var5.method202();
			field1259[var8] = var5.method202();
			int var10 = field1256[var8] = var5.method204();
			int var11 = field1257[var8] = var5.method204();
			int var12 = var5.method202();
			int var13 = var10 * var11;
			field1255[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field1255[var8][var14] = var4.method203();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field1255[var8][var10 * var16 + var15] = var4.method203();
					}
				}
			}

			if (var11 > field1261 && var8 < 128) {
				field1261 = var11;
			}

			field1258[var8] = 1;
			field1260[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field1255[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field1260[var8]--;
				field1258[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field1255[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field1260[var8]--;
			}
		}

		if (arg2) {
			field1260[32] = field1260[73];
		} else {
			field1260[32] = field1260[105];
		}
	}

	@ObfuscatedName("THSQSAVT.a(IIIILjava/lang/String;)V")
	public void method472(int arg0, int arg1, int arg2, String arg3) {
		method477(arg0, arg3, arg2, arg1 - method476(arg3));
	}

	@ObfuscatedName("THSQSAVT.a(IIILjava/lang/String;I)V")
	public void method473(int arg0, int arg1, int arg2, String arg3) {
		method477(arg2, arg3, arg0, arg1 - method476(arg3) / 2);
	}

	@ObfuscatedName("THSQSAVT.a(ZIIILjava/lang/String;I)V")
	public void method474(boolean arg0, int arg1, int arg2, String arg3, int arg4) {
		method481(arg4 - method475(arg3) / 2, arg3, arg1, arg2, arg0);
	}

	@ObfuscatedName("THSQSAVT.a(Ljava/lang/String;I)I")
	public int method475(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field1260[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("THSQSAVT.a(ILjava/lang/String;)I")
	public int method476(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field1260[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("THSQSAVT.a(ILjava/lang/String;III)V")
	public void method477(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 != null) {
			arg2 -= field1261;
			for (int var5 = 0; var5 < arg1.length(); var5++) {
				char var6 = arg1.charAt(var5);
				if (var6 != ' ') {
					method484(field1255[var6], field1258[var6] + arg3, field1259[var6] + arg2, field1256[var6], field1257[var6], arg0);
				}

				arg3 += field1260[var6];
			}
		}
	}

	@ObfuscatedName("THSQSAVT.a(IIILjava/lang/String;ZI)V")
	public void method478(int arg0, int arg1, int arg2, String arg3, int arg4) {
		if (arg3 != null) {
			arg2 -= method476(arg3) / 2;
			arg1 -= field1261;
			for (int var6 = 0; var6 < arg3.length(); var6++) {
				char var7 = arg3.charAt(var6);
				if (var7 != ' ') {
					method484(field1255[var7], field1258[var7] + arg2, field1259[var7] + arg1 + (int) (Math.sin(arg0 / 5.0D + var6 / 2.0D) * 5.0D), field1256[var7], field1257[var7], arg4);
				}

				arg2 += field1260[var7];
			}
		}
	}

	@ObfuscatedName("THSQSAVT.a(IIILjava/lang/String;BI)V")
	public void method479(int arg0, int arg1, int arg2, String arg3, int arg4) {
		if (arg3 != null) {
			arg1 -= method476(arg3) / 2;
			arg2 -= field1261;
			for (int var6 = 0; var6 < arg3.length(); var6++) {
				char var7 = arg3.charAt(var6);
				if (var7 != ' ') {
					method484(field1255[var7], field1258[var7] + arg1 + (int) (Math.sin(arg0 / 5.0D + var6 / 5.0D) * 5.0D), field1259[var7] + arg2 + (int) (Math.sin(arg0 / 5.0D + var6 / 3.0D) * 5.0D), field1256[var7], field1257[var7], arg4);
				}

				arg1 += field1260[var7];
			}
		}
	}

	@ObfuscatedName("THSQSAVT.a(IIIIILjava/lang/String;I)V")
	public void method480(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
		if (arg4 != null) {
			double var7 = 7.0D - arg2 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg1 -= method476(arg4) / 2;
			arg0 -= field1261;
			for (int var9 = 0; var9 < arg4.length(); var9++) {
				char var10 = arg4.charAt(var9);
				if (var10 != ' ') {
					method484(field1255[var10], field1258[var10] + arg1, field1259[var10] + arg0 + (int) (Math.sin(var9 / 1.5D + arg3) * var7), field1256[var10], field1257[var10], arg5);
				}

				arg1 += field1260[var10];
			}
		}
	}

	@ObfuscatedName("THSQSAVT.a(ILjava/lang/String;IIZZ)V")
	public void method481(int arg0, String arg1, int arg2, int arg3, boolean arg4) {
		field1263 = false;
		int var6 = arg0;
		if (arg1 != null) {
			arg3 -= field1261;
			for (int var7 = 0; var7 < arg1.length(); var7++) {
				if (arg1.charAt(var7) == '@' && var7 + 4 < arg1.length() && arg1.charAt(var7 + 4) == '@') {
					int var8 = method483(arg1.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg2 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg1.charAt(var7);
					if (var9 != ' ') {
						if (arg4) {
							method484(field1255[var9], field1258[var9] + arg0 + 1, field1259[var9] + arg3 + 1, field1256[var9], field1257[var9], 0);
						}

						method484(field1255[var9], field1258[var9] + arg0, field1259[var9] + arg3, field1256[var9], field1257[var9], arg2);
					}

					arg0 += field1260[var9];
				}
			}

			if (field1263) {
				JNJDBENA.method291(var6, arg0 - var6, 0x800000, (int) (field1261 * 0.7D) + arg3);
			}
		}
	}

	@ObfuscatedName("THSQSAVT.a(IIZILjava/lang/String;ZI)V")
	public void method482(int arg0, int arg1, boolean arg2, int arg3, String arg4, int arg5) {
		if (arg4 != null) {
			field1262.setSeed(arg0);
			int var7 = (field1262.nextInt() & 0x1F) + 192;
			arg5 -= field1261;
			for (int var8 = 0; var8 < arg4.length(); var8++) {
				if (arg4.charAt(var8) == '@' && var8 + 4 < arg4.length() && arg4.charAt(var8 + 4) == '@') {
					int var9 = method483(arg4.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg1 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg4.charAt(var8);
					if (var10 != ' ') {
						if (arg2) {
							method486(field1259[var10] + arg5 + 1, 192, field1258[var10] + arg3 + 1, field1257[var10], field1255[var10], field1256[var10], 0);
						}

						method486(field1259[var10] + arg5, var7, field1258[var10] + arg3, field1257[var10], field1255[var10], field1256[var10], arg1);
					}

					arg3 += field1260[var10];
					if ((field1262.nextInt() & 0x3) == 0) {
						arg3++;
					}
				}
			}
		}
	}

	@ObfuscatedName("THSQSAVT.b(ILjava/lang/String;)I")
	public int method483(String arg0) {
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
				field1263 = true;
			}

			if (arg0.equals("end")) {
				field1263 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("THSQSAVT.a([BIIIII)V")
	public void method484(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = JNJDBENA.field810 * arg2 + arg1;
		int var8 = JNJDBENA.field810 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < JNJDBENA.field812) {
			int var11 = JNJDBENA.field812 - arg2;
			arg4 -= var11;
			arg2 = JNJDBENA.field812;
			var10 += arg3 * var11;
			var7 += JNJDBENA.field810 * var11;
		}

		if (arg2 + arg4 >= JNJDBENA.field813) {
			arg4 -= arg2 + arg4 + 1 - JNJDBENA.field813;
		}

		if (arg1 < JNJDBENA.field814) {
			int var12 = JNJDBENA.field814 - arg1;
			arg3 -= var12;
			arg1 = JNJDBENA.field814;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= JNJDBENA.field815) {
			int var13 = arg1 + arg3 + 1 - JNJDBENA.field815;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method485(JNJDBENA.field809, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("THSQSAVT.a([I[BIIIIIII)V")
	public void method485(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("THSQSAVT.a(IIIBI[BII)V")
	public void method486(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
		int var8 = JNJDBENA.field810 * arg0 + arg2;
		int var9 = JNJDBENA.field810 - arg5;
		int var10 = 0;
		int var11 = 0;
		if (arg0 < JNJDBENA.field812) {
			int var12 = JNJDBENA.field812 - arg0;
			arg3 -= var12;
			arg0 = JNJDBENA.field812;
			var11 += arg5 * var12;
			var8 += JNJDBENA.field810 * var12;
		}

		if (arg0 + arg3 >= JNJDBENA.field813) {
			arg3 -= arg0 + arg3 + 1 - JNJDBENA.field813;
		}

		if (arg2 < JNJDBENA.field814) {
			int var13 = JNJDBENA.field814 - arg2;
			arg5 -= var13;
			arg2 = JNJDBENA.field814;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg2 + arg5 >= JNJDBENA.field815) {
			int var14 = arg2 + arg5 + 1 - JNJDBENA.field815;
			arg5 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg5 > 0 && arg3 > 0) {
			method487(var9, arg5, var11, arg4, var10, var8, arg1, arg3, JNJDBENA.field809, arg6);
		}
	}

	@ObfuscatedName("THSQSAVT.a(ZIII[BIIII[II)V")
	public void method487(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
		arg9 = ((arg9 & 0xFF00FF) * arg6 & 0xFF00FF00) + ((arg9 & 0xFF00) * arg6 & 0xFF0000) >> 8;
		arg6 = 256 - arg6;
		for (int var11 = -arg7; var11 < 0; var11++) {
			for (int var12 = -arg1; var12 < 0; var12++) {
				if (arg3[arg2++] == 0) {
					arg5++;
				} else {
					int var13 = arg8[arg5];
					arg8[arg5++] = (((var13 & 0xFF00FF) * arg6 & 0xFF00FF00) + ((var13 & 0xFF00) * arg6 & 0xFF0000) >> 8) + arg9;
				}
			}

			arg5 += arg0;
			arg2 += arg4;
		}
	}
}
