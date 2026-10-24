package deob;

import java.util.Random;

@ObfuscatedName("OSNNCWUM")
public final class OSNNCWUM extends JJXDTORW {

	@ObfuscatedName("OSNNCWUM.E")
	public byte[][] field1093 = new byte[256][];

	@ObfuscatedName("OSNNCWUM.F")
	public int[] field1094 = new int[256];

	@ObfuscatedName("OSNNCWUM.G")
	public int[] field1095 = new int[256];

	@ObfuscatedName("OSNNCWUM.H")
	public int[] field1096 = new int[256];

	@ObfuscatedName("OSNNCWUM.I")
	public int[] field1097 = new int[256];

	@ObfuscatedName("OSNNCWUM.J")
	public int[] field1098 = new int[256];

	@ObfuscatedName("OSNNCWUM.L")
	public Random field1100 = new Random();

	@ObfuscatedName("OSNNCWUM.M")
	public boolean field1101 = false;

	@ObfuscatedName("OSNNCWUM.K")
	public int field1099;

	public OSNNCWUM(EAXVDNXA arg0, String arg1, boolean arg2) {
		CKBTFRZM var4 = new CKBTFRZM(arg0.method255(arg1 + ".dat", null));
		CKBTFRZM var5 = new CKBTFRZM(arg0.method255("index.dat", null));
		boolean var6 = true;
		var5.field92 = var4.method46() + 4;
		int var7 = var5.method44();
		if (var7 > 0) {
			var5.field92 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field1096[var8] = var5.method44();
			field1097[var8] = var5.method44();
			int var10 = field1094[var8] = var5.method46();
			int var11 = field1095[var8] = var5.method46();
			int var12 = var5.method44();
			int var13 = var10 * var11;
			field1093[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field1093[var8][var14] = var4.method45();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field1093[var8][var10 * var16 + var15] = var4.method45();
					}
				}
			}

			if (var11 > field1099 && var8 < 128) {
				field1099 = var11;
			}

			field1096[var8] = 1;
			field1098[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field1093[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field1098[var8]--;
				field1096[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field1093[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field1098[var8]--;
			}
		}

		if (arg2) {
			field1098[32] = field1098[73];
		} else {
			field1098[32] = field1098[105];
		}
	}

	@ObfuscatedName("OSNNCWUM.a(Ljava/lang/String;IIBI)V")
	public void method463(String arg0, int arg1, int arg2, int arg3) {
		method468(arg0, arg2, arg1, arg3 - method467(arg0));
	}

	@ObfuscatedName("OSNNCWUM.a(IIIILjava/lang/String;)V")
	public void method464(int arg0, int arg1, int arg2, String arg3) {
		method468(arg3, arg0, arg1, arg2 - method467(arg3) / 2);
	}

	@ObfuscatedName("OSNNCWUM.a(IBLjava/lang/String;IIZ)V")
	public void method465(int arg0, String arg1, int arg2, int arg3, boolean arg4) {
		method472(arg0 - method466(arg1) / 2, arg4, arg3, arg2, arg1);
	}

	@ObfuscatedName("OSNNCWUM.a(Ljava/lang/String;Z)I")
	public int method466(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field1098[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("OSNNCWUM.a(Ljava/lang/String;I)I")
	public int method467(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field1098[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("OSNNCWUM.a(Ljava/lang/String;IIIB)V")
	public void method468(String arg0, int arg1, int arg2, int arg3) {
		if (arg0 != null) {
			arg1 -= field1099;
			for (int var5 = 0; var5 < arg0.length(); var5++) {
				char var6 = arg0.charAt(var5);
				if (var6 != ' ') {
					method475(field1093[var6], field1096[var6] + arg3, field1097[var6] + arg1, field1094[var6], field1095[var6], arg2);
				}

				arg3 += field1098[var6];
			}
		}
	}

	@ObfuscatedName("OSNNCWUM.a(IILjava/lang/String;ZII)V")
	public void method469(int arg0, int arg1, String arg2, int arg3, int arg4) {
		if (arg2 != null) {
			arg3 -= method467(arg2) / 2;
			arg1 -= field1099;
			for (int var6 = 0; var6 < arg2.length(); var6++) {
				char var7 = arg2.charAt(var6);
				if (var7 != ' ') {
					method475(field1093[var7], field1096[var7] + arg3, field1097[var7] + arg1 + (int) (Math.sin(arg0 / 5.0D + var6 / 2.0D) * 5.0D), field1094[var7], field1095[var7], arg4);
				}

				arg3 += field1098[var7];
			}
		}
	}

	@ObfuscatedName("OSNNCWUM.a(Ljava/lang/String;IIIII)V")
	public void method470(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg4 -= method467(arg0) / 2;
			arg2 -= field1099;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method475(field1093[var7], field1096[var7] + arg4 + (int) (Math.sin(arg1 / 5.0D + var6 / 5.0D) * 5.0D), field1097[var7] + arg2 + (int) (Math.sin(arg1 / 5.0D + var6 / 3.0D) * 5.0D), field1094[var7], field1095[var7], arg3);
				}

				arg4 += field1098[var7];
			}
		}
	}

	@ObfuscatedName("OSNNCWUM.a(IIIILjava/lang/String;II)V")
	public void method471(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
		if (arg3 != null) {
			double var7 = 7.0D - arg2 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg4 -= method467(arg3) / 2;
			arg5 -= field1099;
			for (int var9 = 0; var9 < arg3.length(); var9++) {
				char var10 = arg3.charAt(var9);
				if (var10 != ' ') {
					method475(field1093[var10], field1096[var10] + arg4, field1097[var10] + arg5 + (int) (Math.sin(var9 / 1.5D + arg0) * var7), field1094[var10], field1095[var10], arg1);
				}

				arg4 += field1098[var10];
			}
		}
	}

	@ObfuscatedName("OSNNCWUM.a(IZIILjava/lang/String;B)V")
	public void method472(int arg0, boolean arg1, int arg2, int arg3, String arg4) {
		field1101 = false;
		int var6 = arg0;
		if (arg4 != null) {
			arg3 -= field1099;
			for (int var7 = 0; var7 < arg4.length(); var7++) {
				if (arg4.charAt(var7) == '@' && var7 + 4 < arg4.length() && arg4.charAt(var7 + 4) == '@') {
					int var8 = method474(arg4.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg2 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg4.charAt(var7);
					if (var9 != ' ') {
						if (arg1) {
							method475(field1093[var9], field1096[var9] + arg0 + 1, field1097[var9] + arg3 + 1, field1094[var9], field1095[var9], 0);
						}

						method475(field1093[var9], field1096[var9] + arg0, field1097[var9] + arg3, field1094[var9], field1095[var9], arg2);
					}

					arg0 += field1098[var9];
				}
			}

			if (field1101) {
				JJXDTORW.method420(0x800000, (int) (field1099 * 0.7D) + arg3, var6, arg0 - var6);
			}
		}
	}

	@ObfuscatedName("OSNNCWUM.a(IIIZZLjava/lang/String;I)V")
	public void method473(int arg0, int arg1, int arg2, boolean arg3, String arg4, int arg5) {
		if (arg4 != null) {
			field1100.setSeed(arg0);
			int var7 = (field1100.nextInt() & 0x1F) + 192;
			arg2 -= field1099;
			for (int var8 = 0; var8 < arg4.length(); var8++) {
				if (arg4.charAt(var8) == '@' && var8 + 4 < arg4.length() && arg4.charAt(var8 + 4) == '@') {
					int var9 = method474(arg4.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg1 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg4.charAt(var8);
					if (var10 != ' ') {
						if (arg3) {
							method477(0, field1095[var10], field1094[var10], field1096[var10] + arg5 + 1, field1097[var10] + arg2 + 1, field1093[var10], 192);
						}

						method477(arg1, field1095[var10], field1094[var10], field1096[var10] + arg5, field1097[var10] + arg2, field1093[var10], var7);
					}

					arg5 += field1098[var10];
					if ((field1100.nextInt() & 0x3) == 0) {
						arg5++;
					}
				}
			}
		}
	}

	@ObfuscatedName("OSNNCWUM.a(Ljava/lang/String;B)I")
	public int method474(String arg0) {
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
				field1101 = true;
			}

			if (arg0.equals("end")) {
				field1101 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("OSNNCWUM.a([BIIIII)V")
	public void method475(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = JJXDTORW.field965 * arg2 + arg1;
		int var8 = JJXDTORW.field965 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < JJXDTORW.field967) {
			int var11 = JJXDTORW.field967 - arg2;
			arg4 -= var11;
			arg2 = JJXDTORW.field967;
			var10 += arg3 * var11;
			var7 += JJXDTORW.field965 * var11;
		}

		if (arg2 + arg4 >= JJXDTORW.field968) {
			arg4 -= arg2 + arg4 + 1 - JJXDTORW.field968;
		}

		if (arg1 < JJXDTORW.field969) {
			int var12 = JJXDTORW.field969 - arg1;
			arg3 -= var12;
			arg1 = JJXDTORW.field969;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= JJXDTORW.field970) {
			int var13 = arg1 + arg3 + 1 - JJXDTORW.field970;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method476(JJXDTORW.field964, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("OSNNCWUM.a([I[BIIIIIII)V")
	public void method476(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("OSNNCWUM.a(IIIIII[BI)V")
	public void method477(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
		int var8 = JJXDTORW.field965 * arg4 + arg3;
		int var9 = JJXDTORW.field965 - arg2;
		int var10 = 0;
		int var11 = 0;
		if (arg4 < JJXDTORW.field967) {
			int var12 = JJXDTORW.field967 - arg4;
			arg1 -= var12;
			arg4 = JJXDTORW.field967;
			var11 += arg2 * var12;
			var8 += JJXDTORW.field965 * var12;
		}

		if (arg1 + arg4 >= JJXDTORW.field968) {
			arg1 -= arg1 + arg4 + 1 - JJXDTORW.field968;
		}

		if (arg3 < JJXDTORW.field969) {
			int var13 = JJXDTORW.field969 - arg3;
			arg2 -= var13;
			arg3 = JJXDTORW.field969;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg2 + arg3 >= JJXDTORW.field970) {
			int var14 = arg2 + arg3 + 1 - JJXDTORW.field970;
			arg2 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg2 > 0 && arg1 > 0) {
			method478(var11, JJXDTORW.field964, arg1, arg2, arg5, arg6, arg0, var8, var10, var9);
		}
	}

	@ObfuscatedName("OSNNCWUM.a(I[III[BIIIIBI)V")
	public void method478(int arg0, int[] arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		arg6 = ((arg6 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((arg6 & 0xFF00) * arg5 & 0xFF0000) >> 8;
		arg5 = 256 - arg5;
		for (int var11 = -arg2; var11 < 0; var11++) {
			for (int var12 = -arg3; var12 < 0; var12++) {
				if (arg4[arg0++] == 0) {
					arg7++;
				} else {
					int var13 = arg1[arg7];
					arg1[arg7++] = (((var13 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((var13 & 0xFF00) * arg5 & 0xFF0000) >> 8) + arg6;
				}
			}

			arg7 += arg9;
			arg0 += arg8;
		}
	}
}
