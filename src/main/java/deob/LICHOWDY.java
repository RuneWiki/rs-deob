package deob;

import java.util.Random;

@ObfuscatedName("LICHOWDY")
public final class LICHOWDY extends IBBQNXJX {

	@ObfuscatedName("LICHOWDY.D")
	public byte[][] field1042 = new byte[256][];

	@ObfuscatedName("LICHOWDY.E")
	public int[] field1043 = new int[256];

	@ObfuscatedName("LICHOWDY.F")
	public int[] field1044 = new int[256];

	@ObfuscatedName("LICHOWDY.G")
	public int[] field1045 = new int[256];

	@ObfuscatedName("LICHOWDY.H")
	public int[] field1046 = new int[256];

	@ObfuscatedName("LICHOWDY.I")
	public int[] field1047 = new int[256];

	@ObfuscatedName("LICHOWDY.K")
	public Random field1049 = new Random();

	@ObfuscatedName("LICHOWDY.L")
	public boolean field1050 = false;

	@ObfuscatedName("LICHOWDY.J")
	public int field1048;

	public LICHOWDY(JUPFHAZZ arg0, String arg1, boolean arg2) {
		TKPFKOXP var4 = new TKPFKOXP(arg0.method372(arg1 + ".dat", null));
		TKPFKOXP var5 = new TKPFKOXP(arg0.method372("index.dat", null));
		boolean var6 = true;
		var5.field1382 = var4.method531() + 4;
		int var7 = var5.method529();
		if (var7 > 0) {
			var5.field1382 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field1045[var8] = var5.method529();
			field1046[var8] = var5.method529();
			int var10 = field1043[var8] = var5.method531();
			int var11 = field1044[var8] = var5.method531();
			int var12 = var5.method529();
			int var13 = var10 * var11;
			field1042[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field1042[var8][var14] = var4.method530();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field1042[var8][var10 * var16 + var15] = var4.method530();
					}
				}
			}

			if (var11 > field1048 && var8 < 128) {
				field1048 = var11;
			}

			field1045[var8] = 1;
			field1047[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field1042[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field1047[var8]--;
				field1045[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field1042[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field1047[var8]--;
			}
		}

		if (arg2) {
			field1047[32] = field1047[73];
		} else {
			field1047[32] = field1047[105];
		}
	}

	@ObfuscatedName("LICHOWDY.a(IIILjava/lang/String;I)V")
	public void method379(int arg0, int arg1, String arg2, int arg3) {
		method384(arg2, arg1, arg3 - method383(arg2), arg0);
	}

	@ObfuscatedName("LICHOWDY.a(Ljava/lang/String;BIII)V")
	public void method380(String arg0, int arg1, int arg2, int arg3) {
		method384(arg0, arg2, arg1 - method383(arg0) / 2, arg3);
	}

	@ObfuscatedName("LICHOWDY.a(ILjava/lang/String;ZIII)V")
	public void method381(String arg0, boolean arg1, int arg2, int arg3, int arg4) {
		method388(arg4 - method382(arg0) / 2, arg2, arg3, arg1, arg0);
	}

	@ObfuscatedName("LICHOWDY.a(Ljava/lang/String;B)I")
	public int method382(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field1047[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("LICHOWDY.a(Ljava/lang/String;I)I")
	public int method383(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field1047[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("LICHOWDY.a(Ljava/lang/String;IIZI)V")
	public void method384(String arg0, int arg1, int arg2, int arg3) {
		if (arg0 != null) {
			arg1 -= field1048;
			for (int var5 = 0; var5 < arg0.length(); var5++) {
				char var6 = arg0.charAt(var5);
				if (var6 != ' ') {
					method391(field1042[var6], field1045[var6] + arg2, field1046[var6] + arg1, field1043[var6], field1044[var6], arg3);
				}

				arg2 += field1047[var6];
			}
		}
	}

	@ObfuscatedName("LICHOWDY.a(IIIIILjava/lang/String;)V")
	public void method385(int arg0, int arg1, int arg2, int arg3, String arg4) {
		if (arg4 != null) {
			arg3 -= method383(arg4) / 2;
			arg0 -= field1048;
			for (int var6 = 0; var6 < arg4.length(); var6++) {
				char var7 = arg4.charAt(var6);
				if (var7 != ' ') {
					method391(field1042[var7], field1045[var7] + arg3, field1046[var7] + arg0 + (int) (Math.sin(arg1 / 5.0D + var6 / 2.0D) * 5.0D), field1043[var7], field1044[var7], arg2);
				}

				arg3 += field1047[var7];
			}
		}
	}

	@ObfuscatedName("LICHOWDY.b(IIIIILjava/lang/String;)V")
	public void method386(int arg0, int arg1, int arg2, int arg3, String arg4) {
		if (arg4 != null) {
			arg2 -= method383(arg4) / 2;
			arg1 -= field1048;
			for (int var6 = 0; var6 < arg4.length(); var6++) {
				char var7 = arg4.charAt(var6);
				if (var7 != ' ') {
					method391(field1042[var7], field1045[var7] + arg2 + (int) (Math.sin(arg0 / 5.0D + var6 / 5.0D) * 5.0D), field1046[var7] + arg1 + (int) (Math.sin(arg0 / 5.0D + var6 / 3.0D) * 5.0D), field1043[var7], field1044[var7], arg3);
				}

				arg2 += field1047[var7];
			}
		}
	}

	@ObfuscatedName("LICHOWDY.a(IIILjava/lang/String;III)V")
	public void method387(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
		if (arg2 != null) {
			double var7 = 7.0D - arg5 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg3 -= method383(arg2) / 2;
			arg4 -= field1048;
			for (int var9 = 0; var9 < arg2.length(); var9++) {
				char var10 = arg2.charAt(var9);
				if (var10 != ' ') {
					method391(field1042[var10], field1045[var10] + arg3, field1046[var10] + arg4 + (int) (Math.sin(var9 / 1.5D + arg1) * var7), field1043[var10], field1044[var10], arg0);
				}

				arg3 += field1047[var10];
			}
		}
	}

	@ObfuscatedName("LICHOWDY.a(IIIIZLjava/lang/String;)V")
	public void method388(int arg0, int arg1, int arg2, boolean arg3, String arg4) {
		field1050 = false;
		int var6 = arg0;
		if (arg4 != null) {
			arg1 -= field1048;
			for (int var7 = 0; var7 < arg4.length(); var7++) {
				if (arg4.charAt(var7) == '@' && var7 + 4 < arg4.length() && arg4.charAt(var7 + 4) == '@') {
					int var8 = method390(arg4.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg2 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg4.charAt(var7);
					if (var9 != ' ') {
						if (arg3) {
							method391(field1042[var9], field1045[var9] + arg0 + 1, field1046[var9] + arg1 + 1, field1043[var9], field1044[var9], 0);
						}

						method391(field1042[var9], field1045[var9] + arg0, field1046[var9] + arg1, field1043[var9], field1044[var9], arg2);
					}

					arg0 += field1047[var9];
				}
			}

			if (field1050) {
				IBBQNXJX.method259(arg0 - var6, var6, (int) (field1048 * 0.7D) + arg1, 0x800000);
			}
		}
	}

	@ObfuscatedName("LICHOWDY.a(IIIIZLjava/lang/String;I)V")
	public void method389(int arg0, int arg1, int arg2, int arg3, boolean arg4, String arg5) {
		if (arg5 != null) {
			field1049.setSeed(arg0);
			int var7 = (field1049.nextInt() & 0x1F) + 192;
			arg1 -= field1048;
			for (int var8 = 0; var8 < arg5.length(); var8++) {
				if (arg5.charAt(var8) == '@' && var8 + 4 < arg5.length() && arg5.charAt(var8 + 4) == '@') {
					int var9 = method390(arg5.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg2 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg5.charAt(var8);
					if (var10 != ' ') {
						if (arg4) {
							method393(field1046[var10] + arg1 + 1, field1044[var10], field1042[var10], 0, field1045[var10] + arg3 + 1, 192, field1043[var10]);
						}

						method393(field1046[var10] + arg1, field1044[var10], field1042[var10], arg2, field1045[var10] + arg3, var7, field1043[var10]);
					}

					arg3 += field1047[var10];
					if ((field1049.nextInt() & 0x3) == 0) {
						arg3++;
					}
				}
			}
		}
	}

	@ObfuscatedName("LICHOWDY.b(Ljava/lang/String;I)I")
	public int method390(String arg0) {
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
				field1050 = true;
			}

			if (arg0.equals("end")) {
				field1050 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("LICHOWDY.a([BIIIII)V")
	public void method391(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = IBBQNXJX.field816 * arg2 + arg1;
		int var8 = IBBQNXJX.field816 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < IBBQNXJX.field818) {
			int var11 = IBBQNXJX.field818 - arg2;
			arg4 -= var11;
			arg2 = IBBQNXJX.field818;
			var10 += arg3 * var11;
			var7 += IBBQNXJX.field816 * var11;
		}

		if (arg2 + arg4 >= IBBQNXJX.field819) {
			arg4 -= arg2 + arg4 + 1 - IBBQNXJX.field819;
		}

		if (arg1 < IBBQNXJX.field820) {
			int var12 = IBBQNXJX.field820 - arg1;
			arg3 -= var12;
			arg1 = IBBQNXJX.field820;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= IBBQNXJX.field821) {
			int var13 = arg1 + arg3 + 1 - IBBQNXJX.field821;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method392(IBBQNXJX.field815, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("LICHOWDY.a([I[BIIIIIII)V")
	public void method392(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("LICHOWDY.a(II[BIIIIZ)V")
	public void method393(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = IBBQNXJX.field816 * arg0 + arg4;
		int var9 = IBBQNXJX.field816 - arg6;
		int var10 = 0;
		int var11 = 0;
		if (arg0 < IBBQNXJX.field818) {
			int var12 = IBBQNXJX.field818 - arg0;
			arg1 -= var12;
			arg0 = IBBQNXJX.field818;
			var11 += arg6 * var12;
			var8 += IBBQNXJX.field816 * var12;
		}

		if (arg0 + arg1 >= IBBQNXJX.field819) {
			arg1 -= arg0 + arg1 + 1 - IBBQNXJX.field819;
		}

		if (arg4 < IBBQNXJX.field820) {
			int var13 = IBBQNXJX.field820 - arg4;
			arg6 -= var13;
			arg4 = IBBQNXJX.field820;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg4 + arg6 >= IBBQNXJX.field821) {
			int var14 = arg4 + arg6 + 1 - IBBQNXJX.field821;
			arg6 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg6 > 0 && arg1 > 0) {
			method394(arg2, var8, arg3, var11, var9, arg1, arg5, arg6, IBBQNXJX.field815, var10);
		}
	}

	@ObfuscatedName("LICHOWDY.a([BIIIIIII[III)V")
	public void method394(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
		arg2 = ((arg2 & 0xFF00FF) * arg6 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg6 & 0xFF0000) >> 8;
		arg6 = 256 - arg6;
		for (int var11 = -arg5; var11 < 0; var11++) {
			for (int var12 = -arg7; var12 < 0; var12++) {
				if (arg0[arg3++] == 0) {
					arg1++;
				} else {
					int var13 = arg8[arg1];
					arg8[arg1++] = (((var13 & 0xFF00FF) * arg6 & 0xFF00FF00) + ((var13 & 0xFF00) * arg6 & 0xFF0000) >> 8) + arg2;
				}
			}

			arg1 += arg4;
			arg3 += arg9;
		}
	}
}
