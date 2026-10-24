package deob;

import java.util.Random;

@ObfuscatedName("RGWSJTPO")
public final class RGWSJTPO extends JJCVVTJN {

	@ObfuscatedName("RGWSJTPO.C")
	public byte[][] field974 = new byte[256][];

	@ObfuscatedName("RGWSJTPO.D")
	public int[] field975 = new int[256];

	@ObfuscatedName("RGWSJTPO.E")
	public int[] field976 = new int[256];

	@ObfuscatedName("RGWSJTPO.F")
	public int[] field977 = new int[256];

	@ObfuscatedName("RGWSJTPO.G")
	public int[] field978 = new int[256];

	@ObfuscatedName("RGWSJTPO.H")
	public int[] field979 = new int[256];

	@ObfuscatedName("RGWSJTPO.J")
	public Random field981 = new Random();

	@ObfuscatedName("RGWSJTPO.K")
	public boolean field982 = false;

	@ObfuscatedName("RGWSJTPO.I")
	public int field980;

	public RGWSJTPO(String arg0, boolean arg1, CXFTMSCH arg2) {
		MQZHAILV var4 = new MQZHAILV(arg2.method176(arg0 + ".dat", null));
		MQZHAILV var5 = new MQZHAILV(arg2.method176("index.dat", null));
		boolean var6 = true;
		var5.field797 = var4.method327() + 4;
		int var7 = var5.method325();
		if (var7 > 0) {
			var5.field797 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field977[var8] = var5.method325();
			field978[var8] = var5.method325();
			int var10 = field975[var8] = var5.method327();
			int var11 = field976[var8] = var5.method327();
			int var12 = var5.method325();
			int var13 = var10 * var11;
			field974[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field974[var8][var14] = var4.method326();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field974[var8][var10 * var16 + var15] = var4.method326();
					}
				}
			}

			if (var11 > field980 && var8 < 128) {
				field980 = var11;
			}

			field977[var8] = 1;
			field979[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field974[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field979[var8]--;
				field977[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field974[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field979[var8]--;
			}
		}

		if (arg1) {
			field979[32] = field979[73];
		} else {
			field979[32] = field979[105];
		}
	}

	@ObfuscatedName("RGWSJTPO.a(IILjava/lang/String;II)V")
	public void method457(int arg0, String arg1, int arg2, int arg3) {
		method462(arg0, arg1, arg2, arg3 - method461(arg1));
	}

	@ObfuscatedName("RGWSJTPO.a(IIILjava/lang/String;I)V")
	public void method458(int arg0, int arg1, int arg2, String arg3) {
		method462(arg1, arg3, arg0, arg2 - method461(arg3) / 2);
	}

	@ObfuscatedName("RGWSJTPO.a(Ljava/lang/String;IZIBI)V")
	public void method459(String arg0, int arg1, boolean arg2, int arg3, int arg4) {
		method466(arg4, arg2, arg0, arg3 - method460(arg0) / 2, arg1);
	}

	@ObfuscatedName("RGWSJTPO.a(Ljava/lang/String;I)I")
	public int method460(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field979[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("RGWSJTPO.b(Ljava/lang/String;I)I")
	public int method461(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field979[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("RGWSJTPO.a(ILjava/lang/String;III)V")
	public void method462(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 != null) {
			arg2 -= field980;
			for (int var5 = 0; var5 < arg1.length(); var5++) {
				char var6 = arg1.charAt(var5);
				if (var6 != ' ') {
					method469(field974[var6], field977[var6] + arg3, field978[var6] + arg2, field975[var6], field976[var6], arg0);
				}

				arg3 += field979[var6];
			}
		}
	}

	@ObfuscatedName("RGWSJTPO.a(IIILjava/lang/String;II)V")
	public void method463(int arg0, int arg1, int arg2, String arg3, int arg4) {
		if (arg3 != null) {
			arg1 -= method461(arg3) / 2;
			arg4 -= field980;
			for (int var6 = 0; var6 < arg3.length(); var6++) {
				char var7 = arg3.charAt(var6);
				if (var7 != ' ') {
					method469(field974[var7], field977[var7] + arg1, field978[var7] + arg4 + (int) (Math.sin(arg0 / 5.0D + var6 / 2.0D) * 5.0D), field975[var7], field976[var7], arg2);
				}

				arg1 += field979[var7];
			}
		}
	}

	@ObfuscatedName("RGWSJTPO.a(IIIIILjava/lang/String;)V")
	public void method464(int arg0, int arg1, int arg2, int arg3, String arg4) {
		if (arg4 != null) {
			arg1 -= method461(arg4) / 2;
			arg0 -= field980;
			for (int var6 = 0; var6 < arg4.length(); var6++) {
				char var7 = arg4.charAt(var6);
				if (var7 != ' ') {
					method469(field974[var7], field977[var7] + arg1 + (int) (Math.sin(arg2 / 5.0D + var6 / 5.0D) * 5.0D), field978[var7] + arg0 + (int) (Math.sin(arg2 / 5.0D + var6 / 3.0D) * 5.0D), field975[var7], field976[var7], arg3);
				}

				arg1 += field979[var7];
			}
		}
	}

	@ObfuscatedName("RGWSJTPO.a(IIIIILjava/lang/String;I)V")
	public void method465(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
		if (arg4 != null) {
			double var7 = 7.0D - arg5 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg2 -= method461(arg4) / 2;
			arg3 -= field980;
			for (int var9 = 0; var9 < arg4.length(); var9++) {
				char var10 = arg4.charAt(var9);
				if (var10 != ' ') {
					method469(field974[var10], field977[var10] + arg2, field978[var10] + arg3 + (int) (Math.sin(var9 / 1.5D + arg0) * var7), field975[var10], field976[var10], arg1);
				}

				arg2 += field979[var10];
			}
		}
	}

	@ObfuscatedName("RGWSJTPO.a(IIZLjava/lang/String;II)V")
	public void method466(int arg0, boolean arg1, String arg2, int arg3, int arg4) {
		field982 = false;
		int var6 = arg3;
		if (arg2 != null) {
			arg0 -= field980;
			for (int var7 = 0; var7 < arg2.length(); var7++) {
				if (arg2.charAt(var7) == '@' && var7 + 4 < arg2.length() && arg2.charAt(var7 + 4) == '@') {
					int var8 = method468(arg2.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg4 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg2.charAt(var7);
					if (var9 != ' ') {
						if (arg1) {
							method469(field974[var9], field977[var9] + arg3 + 1, field978[var9] + arg0 + 1, field975[var9], field976[var9], 0);
						}

						method469(field974[var9], field977[var9] + arg3, field978[var9] + arg0, field975[var9], field976[var9], arg4);
					}

					arg3 += field979[var9];
				}
			}

			if (field982) {
				JJCVVTJN.method261(0x800000, var6, arg3 - var6, (int) (field980 * 0.7D) + arg0);
			}
		}
	}

	@ObfuscatedName("RGWSJTPO.a(Ljava/lang/String;BZIIII)V")
	public void method467(String arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 != null) {
			field981.setSeed(arg5);
			int var7 = (field981.nextInt() & 0x1F) + 192;
			arg4 -= field980;
			for (int var8 = 0; var8 < arg0.length(); var8++) {
				if (arg0.charAt(var8) == '@' && var8 + 4 < arg0.length() && arg0.charAt(var8 + 4) == '@') {
					int var9 = method468(arg0.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg3 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg0.charAt(var8);
					if (var10 != ' ') {
						if (arg1) {
							method471(field975[var10], field977[var10] + arg2 + 1, field976[var10], 192, field974[var10], 0, field978[var10] + arg4 + 1);
						}

						method471(field975[var10], field977[var10] + arg2, field976[var10], var7, field974[var10], arg3, field978[var10] + arg4);
					}

					arg2 += field979[var10];
					if ((field981.nextInt() & 0x3) == 0) {
						arg2++;
					}
				}
			}
		}
	}

	@ObfuscatedName("RGWSJTPO.c(Ljava/lang/String;I)I")
	public int method468(String arg0) {
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
				field982 = true;
			}

			if (arg0.equals("end")) {
				field982 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("RGWSJTPO.a([BIIIII)V")
	public void method469(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = JJCVVTJN.field676 * arg2 + arg1;
		int var8 = JJCVVTJN.field676 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < JJCVVTJN.field678) {
			int var11 = JJCVVTJN.field678 - arg2;
			arg4 -= var11;
			arg2 = JJCVVTJN.field678;
			var10 += arg3 * var11;
			var7 += JJCVVTJN.field676 * var11;
		}

		if (arg2 + arg4 >= JJCVVTJN.field679) {
			arg4 -= arg2 + arg4 + 1 - JJCVVTJN.field679;
		}

		if (arg1 < JJCVVTJN.field680) {
			int var12 = JJCVVTJN.field680 - arg1;
			arg3 -= var12;
			arg1 = JJCVVTJN.field680;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= JJCVVTJN.field681) {
			int var13 = arg1 + arg3 + 1 - JJCVVTJN.field681;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method470(JJCVVTJN.field675, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("RGWSJTPO.a([I[BIIIIIII)V")
	public void method470(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("RGWSJTPO.a(IIZII[BII)V")
	public void method471(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
		int var8 = JJCVVTJN.field676 * arg6 + arg1;
		int var9 = JJCVVTJN.field676 - arg0;
		int var10 = 0;
		int var11 = 0;
		if (arg6 < JJCVVTJN.field678) {
			int var12 = JJCVVTJN.field678 - arg6;
			arg2 -= var12;
			arg6 = JJCVVTJN.field678;
			var11 += arg0 * var12;
			var8 += JJCVVTJN.field676 * var12;
		}

		if (arg2 + arg6 >= JJCVVTJN.field679) {
			arg2 -= arg2 + arg6 + 1 - JJCVVTJN.field679;
		}

		if (arg1 < JJCVVTJN.field680) {
			int var13 = JJCVVTJN.field680 - arg1;
			arg0 -= var13;
			arg1 = JJCVVTJN.field680;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg0 + arg1 >= JJCVVTJN.field681) {
			int var14 = arg0 + arg1 + 1 - JJCVVTJN.field681;
			arg0 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg0 > 0 && arg2 > 0) {
			method472(arg3, arg2, var8, var9, JJCVVTJN.field675, arg4, var11, arg0, arg5, var10);
		}
	}

	@ObfuscatedName("RGWSJTPO.a(IBIII[I[BIIII)V")
	public void method472(int arg0, int arg1, int arg2, int arg3, int[] arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9) {
		arg8 = ((arg8 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg8 & 0xFF00) * arg0 & 0xFF0000) >> 8;
		arg0 = 256 - arg0;
		for (int var11 = -arg1; var11 < 0; var11++) {
			for (int var12 = -arg7; var12 < 0; var12++) {
				if (arg5[arg6++] == 0) {
					arg2++;
				} else {
					int var13 = arg4[arg2];
					arg4[arg2++] = (((var13 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((var13 & 0xFF00) * arg0 & 0xFF0000) >> 8) + arg8;
				}
			}

			arg2 += arg3;
			arg6 += arg9;
		}
	}
}
