package deob;

import java.util.Random;

@ObfuscatedName("AKTTXKXI")
public final class AKTTXKXI extends TYMHEFTS {

	@ObfuscatedName("AKTTXKXI.F")
	public byte[][] field17 = new byte[256][];

	@ObfuscatedName("AKTTXKXI.G")
	public int[] field18 = new int[256];

	@ObfuscatedName("AKTTXKXI.H")
	public int[] field19 = new int[256];

	@ObfuscatedName("AKTTXKXI.I")
	public int[] field20 = new int[256];

	@ObfuscatedName("AKTTXKXI.J")
	public int[] field21 = new int[256];

	@ObfuscatedName("AKTTXKXI.K")
	public int[] field22 = new int[256];

	@ObfuscatedName("AKTTXKXI.M")
	public Random field24 = new Random();

	@ObfuscatedName("AKTTXKXI.N")
	public boolean field25 = false;

	@ObfuscatedName("AKTTXKXI.L")
	public int field23;

	public AKTTXKXI(SMIVAFST arg0, boolean arg1, String arg2) {
		BSNPYLEV var4 = new BSNPYLEV(arg0.method512(arg2 + ".dat", null));
		BSNPYLEV var5 = new BSNPYLEV(arg0.method512("index.dat", null));
		boolean var6 = true;
		var5.field55 = var4.method49() + 4;
		int var7 = var5.method47();
		if (var7 > 0) {
			var5.field55 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field20[var8] = var5.method47();
			field21[var8] = var5.method47();
			int var10 = field18[var8] = var5.method49();
			int var11 = field19[var8] = var5.method49();
			int var12 = var5.method47();
			int var13 = var10 * var11;
			field17[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field17[var8][var14] = var4.method48();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field17[var8][var10 * var16 + var15] = var4.method48();
					}
				}
			}

			if (var11 > field23 && var8 < 128) {
				field23 = var11;
			}

			field20[var8] = 1;
			field22[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field17[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field22[var8]--;
				field20[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field17[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field22[var8]--;
			}
		}

		if (arg1) {
			field22[32] = field22[73];
		} else {
			field22[32] = field22[105];
		}
	}

	@ObfuscatedName("AKTTXKXI.a(ILjava/lang/String;IBI)V")
	public void method3(int arg0, String arg1, int arg2, int arg3) {
		method8(arg0 - method7(arg1), arg1, arg3, arg2);
	}

	@ObfuscatedName("AKTTXKXI.a(IILjava/lang/String;BI)V")
	public void method4(int arg0, int arg1, String arg2, int arg3) {
		method8(arg3 - method7(arg2) / 2, arg2, arg1, arg0);
	}

	@ObfuscatedName("AKTTXKXI.a(ZZLjava/lang/String;III)V")
	public void method5(boolean arg0, String arg1, int arg2, int arg3, int arg4) {
		method12(arg4 - method6(arg1) / 2, arg0, arg2, arg1, arg3);
	}

	@ObfuscatedName("AKTTXKXI.a(ILjava/lang/String;)I")
	public int method6(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field22[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("AKTTXKXI.a(Ljava/lang/String;I)I")
	public int method7(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field22[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("AKTTXKXI.a(ILjava/lang/String;IIB)V")
	public void method8(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 != null) {
			arg2 -= field23;
			for (int var5 = 0; var5 < arg1.length(); var5++) {
				char var6 = arg1.charAt(var5);
				if (var6 != ' ') {
					method15(field17[var6], field20[var6] + arg0, field21[var6] + arg2, field18[var6], field19[var6], arg3);
				}

				arg0 += field22[var6];
			}
		}
	}

	@ObfuscatedName("AKTTXKXI.a(BLjava/lang/String;IIII)V")
	public void method9(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg1 -= method7(arg0) / 2;
			arg2 -= field23;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method15(field17[var7], field20[var7] + arg1, field21[var7] + arg2 + (int) (Math.sin(arg3 / 5.0D + var6 / 2.0D) * 5.0D), field18[var7], field19[var7], arg4);
				}

				arg1 += field22[var7];
			}
		}
	}

	@ObfuscatedName("AKTTXKXI.a(ZIIIILjava/lang/String;)V")
	public void method10(int arg0, int arg1, int arg2, int arg3, String arg4) {
		if (arg4 != null) {
			arg3 -= method7(arg4) / 2;
			arg2 -= field23;
			for (int var6 = 0; var6 < arg4.length(); var6++) {
				char var7 = arg4.charAt(var6);
				if (var7 != ' ') {
					method15(field17[var7], field20[var7] + arg3 + (int) (Math.sin(arg0 / 5.0D + var6 / 5.0D) * 5.0D), field21[var7] + arg2 + (int) (Math.sin(arg0 / 5.0D + var6 / 3.0D) * 5.0D), field18[var7], field19[var7], arg1);
				}

				arg3 += field22[var7];
			}
		}
	}

	@ObfuscatedName("AKTTXKXI.a(Ljava/lang/String;IIIIII)V")
	public void method11(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 != null) {
			double var7 = 7.0D - arg1 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg3 -= method7(arg0) / 2;
			arg4 -= field23;
			for (int var9 = 0; var9 < arg0.length(); var9++) {
				char var10 = arg0.charAt(var9);
				if (var10 != ' ') {
					method15(field17[var10], field20[var10] + arg3, field21[var10] + arg4 + (int) (Math.sin(var9 / 1.5D + arg2) * var7), field18[var10], field19[var10], arg5);
				}

				arg3 += field22[var10];
			}
		}
	}

	@ObfuscatedName("AKTTXKXI.a(IZILjava/lang/String;II)V")
	public void method12(int arg0, boolean arg1, int arg2, String arg3, int arg4) {
		field25 = false;
		int var6 = arg0;
		if (arg3 != null) {
			arg2 -= field23;
			for (int var7 = 0; var7 < arg3.length(); var7++) {
				if (arg3.charAt(var7) == '@' && var7 + 4 < arg3.length() && arg3.charAt(var7 + 4) == '@') {
					int var8 = method14(arg3.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg4 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg3.charAt(var7);
					if (var9 != ' ') {
						if (arg1) {
							method15(field17[var9], field20[var9] + arg0 + 1, field21[var9] + arg2 + 1, field18[var9], field19[var9], 0);
						}

						method15(field17[var9], field20[var9] + arg0, field21[var9] + arg2, field18[var9], field19[var9], arg4);
					}

					arg0 += field22[var9];
				}
			}

			if (field25) {
				TYMHEFTS.method531((int) (field23 * 0.7D) + arg2, arg0 - var6, 0x800000, var6);
			}
		}
	}

	@ObfuscatedName("AKTTXKXI.a(ZLjava/lang/String;IZIII)V")
	public void method13(boolean arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 != null) {
			field24.setSeed(arg4);
			int var7 = (field24.nextInt() & 0x1F) + 192;
			arg5 -= field23;
			for (int var8 = 0; var8 < arg1.length(); var8++) {
				if (arg1.charAt(var8) == '@' && var8 + 4 < arg1.length() && arg1.charAt(var8 + 4) == '@') {
					int var9 = method14(arg1.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg3 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg1.charAt(var8);
					if (var10 != ' ') {
						if (arg0) {
							method17(field21[var10] + arg5 + 1, field19[var10], 192, field17[var10], 0, field18[var10], field20[var10] + arg2 + 1);
						}

						method17(field21[var10] + arg5, field19[var10], var7, field17[var10], arg3, field18[var10], field20[var10] + arg2);
					}

					arg2 += field22[var10];
					if ((field24.nextInt() & 0x3) == 0) {
						arg2++;
					}
				}
			}
		}
	}

	@ObfuscatedName("AKTTXKXI.a(Ljava/lang/String;Z)I")
	public int method14(String arg0) {
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
				field25 = true;
			}

			if (arg0.equals("end")) {
				field25 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("AKTTXKXI.a([BIIIII)V")
	public void method15(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = TYMHEFTS.field1310 * arg2 + arg1;
		int var8 = TYMHEFTS.field1310 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < TYMHEFTS.field1312) {
			int var11 = TYMHEFTS.field1312 - arg2;
			arg4 -= var11;
			arg2 = TYMHEFTS.field1312;
			var10 += arg3 * var11;
			var7 += TYMHEFTS.field1310 * var11;
		}

		if (arg2 + arg4 >= TYMHEFTS.field1313) {
			arg4 -= arg2 + arg4 + 1 - TYMHEFTS.field1313;
		}

		if (arg1 < TYMHEFTS.field1314) {
			int var12 = TYMHEFTS.field1314 - arg1;
			arg3 -= var12;
			arg1 = TYMHEFTS.field1314;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= TYMHEFTS.field1315) {
			int var13 = arg1 + arg3 + 1 - TYMHEFTS.field1315;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method16(TYMHEFTS.field1309, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("AKTTXKXI.a([I[BIIIIIII)V")
	public void method16(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("AKTTXKXI.a(III[BIZII)V")
	public void method17(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
		int var8 = TYMHEFTS.field1310 * arg0 + arg6;
		int var9 = TYMHEFTS.field1310 - arg5;
		int var10 = 0;
		int var11 = 0;
		if (arg0 < TYMHEFTS.field1312) {
			int var12 = TYMHEFTS.field1312 - arg0;
			arg1 -= var12;
			arg0 = TYMHEFTS.field1312;
			var11 += arg5 * var12;
			var8 += TYMHEFTS.field1310 * var12;
		}

		if (arg0 + arg1 >= TYMHEFTS.field1313) {
			arg1 -= arg0 + arg1 + 1 - TYMHEFTS.field1313;
		}

		if (arg6 < TYMHEFTS.field1314) {
			int var13 = TYMHEFTS.field1314 - arg6;
			arg5 -= var13;
			arg6 = TYMHEFTS.field1314;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg5 + arg6 >= TYMHEFTS.field1315) {
			int var14 = arg5 + arg6 + 1 - TYMHEFTS.field1315;
			arg5 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg5 > 0 && arg1 > 0) {
			method18(var8, arg1, var10, var11, arg5, TYMHEFTS.field1309, arg2, var9, arg3, arg4);
		}
	}

	@ObfuscatedName("AKTTXKXI.a(IIIIII[III[BI)V")
	public void method18(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, byte[] arg8, int arg9) {
		arg9 = ((arg9 & 0xFF00FF) * arg6 & 0xFF00FF00) + ((arg9 & 0xFF00) * arg6 & 0xFF0000) >> 8;
		arg6 = 256 - arg6;
		for (int var11 = -arg1; var11 < 0; var11++) {
			for (int var12 = -arg4; var12 < 0; var12++) {
				if (arg8[arg3++] == 0) {
					arg0++;
				} else {
					int var13 = arg5[arg0];
					arg5[arg0++] = (((var13 & 0xFF00FF) * arg6 & 0xFF00FF00) + ((var13 & 0xFF00) * arg6 & 0xFF0000) >> 8) + arg9;
				}
			}

			arg0 += arg7;
			arg3 += arg2;
		}
	}
}
