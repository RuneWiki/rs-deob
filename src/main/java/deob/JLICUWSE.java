package deob;

import java.util.Random;

@ObfuscatedName("JLICUWSE")
public final class JLICUWSE extends RSDCQVXF {

	@ObfuscatedName("JLICUWSE.I")
	public byte[][] field1044 = new byte[256][];

	@ObfuscatedName("JLICUWSE.J")
	public int[] field1045 = new int[256];

	@ObfuscatedName("JLICUWSE.K")
	public int[] field1046 = new int[256];

	@ObfuscatedName("JLICUWSE.L")
	public int[] field1047 = new int[256];

	@ObfuscatedName("JLICUWSE.M")
	public int[] field1048 = new int[256];

	@ObfuscatedName("JLICUWSE.N")
	public int[] field1049 = new int[256];

	@ObfuscatedName("JLICUWSE.P")
	public Random field1051 = new Random();

	@ObfuscatedName("JLICUWSE.Q")
	public boolean field1052 = false;

	@ObfuscatedName("JLICUWSE.O")
	public int field1050;

	public JLICUWSE(String arg0, boolean arg1, DYBMLHQM arg2) {
		INLHDAGO var4 = new INLHDAGO(arg2.method248(arg0 + ".dat", null));
		INLHDAGO var5 = new INLHDAGO(arg2.method248("index.dat", null));
		boolean var6 = true;
		var5.field969 = var4.method310() + 4;
		int var7 = var5.method308();
		if (var7 > 0) {
			var5.field969 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field1047[var8] = var5.method308();
			field1048[var8] = var5.method308();
			int var10 = field1045[var8] = var5.method310();
			int var11 = field1046[var8] = var5.method310();
			int var12 = var5.method308();
			int var13 = var10 * var11;
			field1044[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field1044[var8][var14] = var4.method309();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field1044[var8][var10 * var16 + var15] = var4.method309();
					}
				}
			}

			if (var11 > field1050 && var8 < 128) {
				field1050 = var11;
			}

			field1047[var8] = 1;
			field1049[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field1044[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field1049[var8]--;
				field1047[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field1044[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field1049[var8]--;
			}
		}

		if (arg1) {
			field1049[32] = field1049[73];
		} else {
			field1049[32] = field1049[105];
		}
	}

	@ObfuscatedName("JLICUWSE.a(Ljava/lang/String;IIII)V")
	public void method355(String arg0, int arg1, int arg2, int arg3) {
		method360(arg3 - method359(arg0), arg1, arg0, arg2);
	}

	@ObfuscatedName("JLICUWSE.a(IIILjava/lang/String;I)V")
	public void method356(int arg0, int arg1, String arg2, int arg3) {
		method360(arg3 - method359(arg2) / 2, arg1, arg2, arg0);
	}

	@ObfuscatedName("JLICUWSE.a(ZIILjava/lang/String;II)V")
	public void method357(boolean arg0, int arg1, int arg2, String arg3, int arg4) {
		method364(arg2, arg4, arg1 - method358(arg3) / 2, arg0, arg3);
	}

	@ObfuscatedName("JLICUWSE.a(ZLjava/lang/String;)I")
	public int method358(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field1049[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("JLICUWSE.a(Ljava/lang/String;I)I")
	public int method359(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field1049[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("JLICUWSE.a(ZIILjava/lang/String;I)V")
	public void method360(int arg0, int arg1, String arg2, int arg3) {
		if (arg2 != null) {
			arg3 -= field1050;
			for (int var5 = 0; var5 < arg2.length(); var5++) {
				char var6 = arg2.charAt(var5);
				if (var6 != ' ') {
					method367(field1044[var6], field1047[var6] + arg0, field1048[var6] + arg3, field1045[var6], field1046[var6], arg1);
				}

				arg0 += field1049[var6];
			}
		}
	}

	@ObfuscatedName("JLICUWSE.a(ILjava/lang/String;IIII)V")
	public void method361(int arg0, String arg1, int arg2, int arg3, int arg4) {
		if (arg1 != null) {
			arg2 -= method359(arg1) / 2;
			arg3 -= field1050;
			for (int var6 = 0; var6 < arg1.length(); var6++) {
				char var7 = arg1.charAt(var6);
				if (var7 != ' ') {
					method367(field1044[var7], field1047[var7] + arg2, field1048[var7] + arg3 + (int) (Math.sin(arg0 / 5.0D + var6 / 2.0D) * 5.0D), field1045[var7], field1046[var7], arg4);
				}

				arg2 += field1049[var7];
			}
		}
	}

	@ObfuscatedName("JLICUWSE.b(ILjava/lang/String;IIII)V")
	public void method362(int arg0, String arg1, int arg2, int arg3, int arg4) {
		if (arg1 != null) {
			arg4 -= method359(arg1) / 2;
			arg2 -= field1050;
			for (int var6 = 0; var6 < arg1.length(); var6++) {
				char var7 = arg1.charAt(var6);
				if (var7 != ' ') {
					method367(field1044[var7], field1047[var7] + arg4 + (int) (Math.sin(arg0 / 5.0D + var6 / 5.0D) * 5.0D), field1048[var7] + arg2 + (int) (Math.sin(arg0 / 5.0D + var6 / 3.0D) * 5.0D), field1045[var7], field1046[var7], arg3);
				}

				arg4 += field1049[var7];
			}
		}
	}

	@ObfuscatedName("JLICUWSE.a(IIIIILjava/lang/String;I)V")
	public void method363(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
		if (arg4 != null) {
			double var7 = 7.0D - arg2 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg5 -= method359(arg4) / 2;
			arg1 -= field1050;
			for (int var9 = 0; var9 < arg4.length(); var9++) {
				char var10 = arg4.charAt(var9);
				if (var10 != ' ') {
					method367(field1044[var10], field1047[var10] + arg5, field1048[var10] + arg1 + (int) (Math.sin(var9 / 1.5D + arg0) * var7), field1045[var10], field1046[var10], arg3);
				}

				arg5 += field1049[var10];
			}
		}
	}

	@ObfuscatedName("JLICUWSE.a(IIBIZLjava/lang/String;)V")
	public void method364(int arg0, int arg1, int arg2, boolean arg3, String arg4) {
		field1052 = false;
		int var6 = arg2;
		if (arg4 != null) {
			arg1 -= field1050;
			for (int var7 = 0; var7 < arg4.length(); var7++) {
				if (arg4.charAt(var7) == '@' && var7 + 4 < arg4.length() && arg4.charAt(var7 + 4) == '@') {
					int var8 = method366(arg4.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg0 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg4.charAt(var7);
					if (var9 != ' ') {
						if (arg3) {
							method367(field1044[var9], field1047[var9] + arg2 + 1, field1048[var9] + arg1 + 1, field1045[var9], field1046[var9], 0);
						}

						method367(field1044[var9], field1047[var9] + arg2, field1048[var9] + arg1, field1045[var9], field1046[var9], arg0);
					}

					arg2 += field1049[var9];
				}
			}

			if (field1052) {
				RSDCQVXF.method461(arg2 - var6, var6, (int) (field1050 * 0.7D) + arg1, 0x800000);
			}
		}
	}

	@ObfuscatedName("JLICUWSE.a(IZLjava/lang/String;IIII)V")
	public void method365(int arg0, boolean arg1, String arg2, int arg3, int arg4, int arg5) {
		if (arg2 != null) {
			field1051.setSeed(arg4);
			int var7 = (field1051.nextInt() & 0x1F) + 192;
			arg0 -= field1050;
			for (int var8 = 0; var8 < arg2.length(); var8++) {
				if (arg2.charAt(var8) == '@' && var8 + 4 < arg2.length() && arg2.charAt(var8 + 4) == '@') {
					int var9 = method366(arg2.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg3 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg2.charAt(var8);
					if (var10 != ' ') {
						if (arg1) {
							method369(field1048[var10] + arg0 + 1, field1047[var10] + arg5 + 1, field1044[var10], 0, 192, field1045[var10], field1046[var10]);
						}

						method369(field1048[var10] + arg0, field1047[var10] + arg5, field1044[var10], arg3, var7, field1045[var10], field1046[var10]);
					}

					arg5 += field1049[var10];
					if ((field1051.nextInt() & 0x3) == 0) {
						arg5++;
					}
				}
			}
		}
	}

	@ObfuscatedName("JLICUWSE.a(BLjava/lang/String;)I")
	public int method366(String arg0) {
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
				field1052 = true;
			}

			if (arg0.equals("end")) {
				field1052 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("JLICUWSE.a([BIIIII)V")
	public void method367(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = RSDCQVXF.field1193 * arg2 + arg1;
		int var8 = RSDCQVXF.field1193 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < RSDCQVXF.field1195) {
			int var11 = RSDCQVXF.field1195 - arg2;
			arg4 -= var11;
			arg2 = RSDCQVXF.field1195;
			var10 += arg3 * var11;
			var7 += RSDCQVXF.field1193 * var11;
		}

		if (arg2 + arg4 >= RSDCQVXF.field1196) {
			arg4 -= arg2 + arg4 + 1 - RSDCQVXF.field1196;
		}

		if (arg1 < RSDCQVXF.field1197) {
			int var12 = RSDCQVXF.field1197 - arg1;
			arg3 -= var12;
			arg1 = RSDCQVXF.field1197;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= RSDCQVXF.field1198) {
			int var13 = arg1 + arg3 + 1 - RSDCQVXF.field1198;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method368(RSDCQVXF.field1192, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("JLICUWSE.a([I[BIIIIIII)V")
	public void method368(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("JLICUWSE.a(III[BIIII)V")
	public void method369(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = RSDCQVXF.field1193 * arg0 + arg1;
		int var9 = RSDCQVXF.field1193 - arg5;
		int var10 = 0;
		int var11 = 0;
		if (arg0 < RSDCQVXF.field1195) {
			int var12 = RSDCQVXF.field1195 - arg0;
			arg6 -= var12;
			arg0 = RSDCQVXF.field1195;
			var11 += arg5 * var12;
			var8 += RSDCQVXF.field1193 * var12;
		}

		if (arg0 + arg6 >= RSDCQVXF.field1196) {
			arg6 -= arg0 + arg6 + 1 - RSDCQVXF.field1196;
		}

		if (arg1 < RSDCQVXF.field1197) {
			int var13 = RSDCQVXF.field1197 - arg1;
			arg5 -= var13;
			arg1 = RSDCQVXF.field1197;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg1 + arg5 >= RSDCQVXF.field1198) {
			int var14 = arg1 + arg5 + 1 - RSDCQVXF.field1198;
			arg5 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg5 > 0 && arg6 > 0) {
			method370(var11, arg2, arg5, RSDCQVXF.field1192, arg3, var9, arg4, var10, var8, arg6);
		}
	}

	@ObfuscatedName("JLICUWSE.a(I[BI[IIIIIIII)V")
	public void method370(int arg0, byte[] arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		arg4 = ((arg4 & 0xFF00FF) * arg6 & 0xFF00FF00) + ((arg4 & 0xFF00) * arg6 & 0xFF0000) >> 8;
		arg6 = 256 - arg6;
		for (int var11 = -arg9; var11 < 0; var11++) {
			for (int var12 = -arg2; var12 < 0; var12++) {
				if (arg1[arg0++] == 0) {
					arg8++;
				} else {
					int var13 = arg3[arg8];
					arg3[arg8++] = (((var13 & 0xFF00FF) * arg6 & 0xFF00FF00) + ((var13 & 0xFF00) * arg6 & 0xFF0000) >> 8) + arg4;
				}
			}

			arg8 += arg5;
			arg0 += arg7;
		}
	}
}
