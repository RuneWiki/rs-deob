package deob;

import java.util.Random;

@ObfuscatedName("XQKSIEVT")
public final class XQKSIEVT extends ANTOHTCU {

	@ObfuscatedName("XQKSIEVT.B")
	public byte[][] field1351 = new byte[256][];

	@ObfuscatedName("XQKSIEVT.C")
	public int[] field1352 = new int[256];

	@ObfuscatedName("XQKSIEVT.D")
	public int[] field1353 = new int[256];

	@ObfuscatedName("XQKSIEVT.E")
	public int[] field1354 = new int[256];

	@ObfuscatedName("XQKSIEVT.F")
	public int[] field1355 = new int[256];

	@ObfuscatedName("XQKSIEVT.G")
	public int[] field1356 = new int[256];

	@ObfuscatedName("XQKSIEVT.I")
	public Random field1358 = new Random();

	@ObfuscatedName("XQKSIEVT.J")
	public boolean field1359 = false;

	@ObfuscatedName("XQKSIEVT.H")
	public int field1357;

	public XQKSIEVT(boolean arg0, MAARFNGV arg1, String arg2) {
		EMWAMCXW var4 = new EMWAMCXW(arg1.method332(arg2 + ".dat", null));
		EMWAMCXW var5 = new EMWAMCXW(arg1.method332("index.dat", null));
		boolean var6 = true;
		var5.field617 = var4.method219() + 4;
		int var7 = var5.method217();
		if (var7 > 0) {
			var5.field617 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field1354[var8] = var5.method217();
			field1355[var8] = var5.method217();
			int var10 = field1352[var8] = var5.method219();
			int var11 = field1353[var8] = var5.method219();
			int var12 = var5.method217();
			int var13 = var10 * var11;
			field1351[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field1351[var8][var14] = var4.method218();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field1351[var8][var10 * var16 + var15] = var4.method218();
					}
				}
			}

			if (var11 > field1357 && var8 < 128) {
				field1357 = var11;
			}

			field1354[var8] = 1;
			field1356[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field1351[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field1356[var8]--;
				field1354[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field1351[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field1356[var8]--;
			}
		}

		if (arg0) {
			field1356[32] = field1356[73];
		} else {
			field1356[32] = field1356[105];
		}
	}

	@ObfuscatedName("XQKSIEVT.a(ILjava/lang/String;ZII)V")
	public void method480(int arg0, String arg1, int arg2, int arg3) {
		method485(arg1, arg2 - method484(arg1), arg0, arg3);
	}

	@ObfuscatedName("XQKSIEVT.a(Ljava/lang/String;IIII)V")
	public void method481(String arg0, int arg1, int arg2, int arg3) {
		method485(arg0, arg2 - method484(arg0) / 2, arg1, arg3);
	}

	@ObfuscatedName("XQKSIEVT.a(ZLjava/lang/String;IZII)V")
	public void method482(String arg0, int arg1, boolean arg2, int arg3, int arg4) {
		method489(arg2, arg3 - method483(arg0) / 2, arg1, arg4, arg0);
	}

	@ObfuscatedName("XQKSIEVT.a(ZLjava/lang/String;)I")
	public int method483(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field1356[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("XQKSIEVT.a(ILjava/lang/String;)I")
	public int method484(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field1356[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("XQKSIEVT.a(Ljava/lang/String;ZIII)V")
	public void method485(String arg0, int arg1, int arg2, int arg3) {
		if (arg0 != null) {
			arg3 -= field1357;
			for (int var5 = 0; var5 < arg0.length(); var5++) {
				char var6 = arg0.charAt(var5);
				if (var6 != ' ') {
					method492(field1351[var6], field1354[var6] + arg1, field1355[var6] + arg3, field1352[var6], field1353[var6], arg2);
				}

				arg1 += field1356[var6];
			}
		}
	}

	@ObfuscatedName("XQKSIEVT.a(Ljava/lang/String;IBIII)V")
	public void method486(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg2 -= method484(arg0) / 2;
			arg1 -= field1357;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method492(field1351[var7], field1354[var7] + arg2, field1355[var7] + arg1 + (int) (Math.sin(arg3 / 5.0D + var6 / 2.0D) * 5.0D), field1352[var7], field1353[var7], arg4);
				}

				arg2 += field1356[var7];
			}
		}
	}

	@ObfuscatedName("XQKSIEVT.a(IIILjava/lang/String;II)V")
	public void method487(int arg0, int arg1, String arg2, int arg3, int arg4) {
		if (arg2 != null) {
			arg4 -= method484(arg2) / 2;
			arg3 -= field1357;
			for (int var6 = 0; var6 < arg2.length(); var6++) {
				char var7 = arg2.charAt(var6);
				if (var7 != ' ') {
					method492(field1351[var7], field1354[var7] + arg4 + (int) (Math.sin(arg1 / 5.0D + var6 / 5.0D) * 5.0D), field1355[var7] + arg3 + (int) (Math.sin(arg1 / 5.0D + var6 / 3.0D) * 5.0D), field1352[var7], field1353[var7], arg0);
				}

				arg4 += field1356[var7];
			}
		}
	}

	@ObfuscatedName("XQKSIEVT.a(IIIIIILjava/lang/String;)V")
	public void method488(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
		if (arg5 != null) {
			double var7 = 7.0D - arg3 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg2 -= method484(arg5) / 2;
			arg1 -= field1357;
			for (int var9 = 0; var9 < arg5.length(); var9++) {
				char var10 = arg5.charAt(var9);
				if (var10 != ' ') {
					method492(field1351[var10], field1354[var10] + arg2, field1355[var10] + arg1 + (int) (Math.sin(var9 / 1.5D + arg4) * var7), field1352[var10], field1353[var10], arg0);
				}

				arg2 += field1356[var10];
			}
		}
	}

	@ObfuscatedName("XQKSIEVT.a(ZIIIILjava/lang/String;)V")
	public void method489(boolean arg0, int arg1, int arg2, int arg3, String arg4) {
		field1359 = false;
		int var6 = arg1;
		if (arg4 != null) {
			arg3 -= field1357;
			for (int var7 = 0; var7 < arg4.length(); var7++) {
				if (arg4.charAt(var7) == '@' && var7 + 4 < arg4.length() && arg4.charAt(var7 + 4) == '@') {
					int var8 = method491(arg4.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg2 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg4.charAt(var7);
					if (var9 != ' ') {
						if (arg0) {
							method492(field1351[var9], field1354[var9] + arg1 + 1, field1355[var9] + arg3 + 1, field1352[var9], field1353[var9], 0);
						}

						method492(field1351[var9], field1354[var9] + arg1, field1355[var9] + arg3, field1352[var9], field1353[var9], arg2);
					}

					arg1 += field1356[var9];
				}
			}

			if (field1359) {
				ANTOHTCU.method20(var6, (int) (field1357 * 0.7D) + arg3, arg1 - var6, 0x800000);
			}
		}
	}

	@ObfuscatedName("XQKSIEVT.a(ZIIZLjava/lang/String;II)V")
	public void method490(boolean arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
		if (arg3 != null) {
			field1358.setSeed(arg4);
			int var7 = (field1358.nextInt() & 0x1F) + 192;
			arg2 -= field1357;
			for (int var8 = 0; var8 < arg3.length(); var8++) {
				if (arg3.charAt(var8) == '@' && var8 + 4 < arg3.length() && arg3.charAt(var8 + 4) == '@') {
					int var9 = method491(arg3.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg5 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg3.charAt(var8);
					if (var10 != ' ') {
						if (arg0) {
							method494(field1355[var10] + arg2 + 1, field1351[var10], field1354[var10] + arg1 + 1, 0, 192, field1352[var10], field1353[var10]);
						}

						method494(field1355[var10] + arg2, field1351[var10], field1354[var10] + arg1, arg5, var7, field1352[var10], field1353[var10]);
					}

					arg1 += field1356[var10];
					if ((field1358.nextInt() & 0x3) == 0) {
						arg1++;
					}
				}
			}
		}
	}

	@ObfuscatedName("XQKSIEVT.b(ILjava/lang/String;)I")
	public int method491(String arg0) {
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
				field1359 = true;
			}

			if (arg0.equals("end")) {
				field1359 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("XQKSIEVT.a([BIIIII)V")
	public void method492(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = ANTOHTCU.field49 * arg2 + arg1;
		int var8 = ANTOHTCU.field49 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < ANTOHTCU.field51) {
			int var11 = ANTOHTCU.field51 - arg2;
			arg4 -= var11;
			arg2 = ANTOHTCU.field51;
			var10 += arg3 * var11;
			var7 += ANTOHTCU.field49 * var11;
		}

		if (arg2 + arg4 >= ANTOHTCU.field52) {
			arg4 -= arg2 + arg4 + 1 - ANTOHTCU.field52;
		}

		if (arg1 < ANTOHTCU.field53) {
			int var12 = ANTOHTCU.field53 - arg1;
			arg3 -= var12;
			arg1 = ANTOHTCU.field53;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= ANTOHTCU.field54) {
			int var13 = arg1 + arg3 + 1 - ANTOHTCU.field54;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method493(ANTOHTCU.field48, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("XQKSIEVT.a([I[BIIIIIII)V")
	public void method493(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("XQKSIEVT.a(IZ[BIIIII)V")
	public void method494(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = ANTOHTCU.field49 * arg0 + arg2;
		int var9 = ANTOHTCU.field49 - arg5;
		int var10 = 0;
		int var11 = 0;
		if (arg0 < ANTOHTCU.field51) {
			int var12 = ANTOHTCU.field51 - arg0;
			arg6 -= var12;
			arg0 = ANTOHTCU.field51;
			var11 += arg5 * var12;
			var8 += ANTOHTCU.field49 * var12;
		}

		if (arg0 + arg6 >= ANTOHTCU.field52) {
			arg6 -= arg0 + arg6 + 1 - ANTOHTCU.field52;
		}

		if (arg2 < ANTOHTCU.field53) {
			int var13 = ANTOHTCU.field53 - arg2;
			arg5 -= var13;
			arg2 = ANTOHTCU.field53;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg2 + arg5 >= ANTOHTCU.field54) {
			int var14 = arg2 + arg5 + 1 - ANTOHTCU.field54;
			arg5 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg5 > 0 && arg6 > 0) {
			method495(arg6, arg1, var9, ANTOHTCU.field48, arg5, var10, arg3, var11, arg4, var8);
		}
	}

	@ObfuscatedName("XQKSIEVT.a(II[BI[IIIIIII)V")
	public void method495(int arg0, byte[] arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		arg6 = ((arg6 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((arg6 & 0xFF00) * arg8 & 0xFF0000) >> 8;
		arg8 = 256 - arg8;
		for (int var11 = -arg0; var11 < 0; var11++) {
			for (int var12 = -arg4; var12 < 0; var12++) {
				if (arg1[arg7++] == 0) {
					arg9++;
				} else {
					int var13 = arg3[arg9];
					arg3[arg9++] = (((var13 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((var13 & 0xFF00) * arg8 & 0xFF0000) >> 8) + arg6;
				}
			}

			arg9 += arg2;
			arg7 += arg5;
		}
	}
}
