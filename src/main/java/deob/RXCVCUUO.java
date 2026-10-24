package deob;

import java.util.Random;

@ObfuscatedName("RXCVCUUO")
public final class RXCVCUUO extends KNERFXXY {

	@ObfuscatedName("RXCVCUUO.C")
	public byte[][] field1041 = new byte[256][];

	@ObfuscatedName("RXCVCUUO.D")
	public int[] field1042 = new int[256];

	@ObfuscatedName("RXCVCUUO.E")
	public int[] field1043 = new int[256];

	@ObfuscatedName("RXCVCUUO.F")
	public int[] field1044 = new int[256];

	@ObfuscatedName("RXCVCUUO.G")
	public int[] field1045 = new int[256];

	@ObfuscatedName("RXCVCUUO.H")
	public int[] field1046 = new int[256];

	@ObfuscatedName("RXCVCUUO.J")
	public Random field1048 = new Random();

	@ObfuscatedName("RXCVCUUO.K")
	public boolean field1049 = false;

	@ObfuscatedName("RXCVCUUO.I")
	public int field1047;

	public RXCVCUUO(boolean arg0, String arg1, OTSGNSQM arg2) {
		YOXDZEVD var4 = new YOXDZEVD(arg2.method376(arg1 + ".dat", null));
		YOXDZEVD var5 = new YOXDZEVD(arg2.method376("index.dat", null));
		boolean var6 = true;
		var5.field1393 = var4.method551() + 4;
		int var7 = var5.method549();
		if (var7 > 0) {
			var5.field1393 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field1044[var8] = var5.method549();
			field1045[var8] = var5.method549();
			int var10 = field1042[var8] = var5.method551();
			int var11 = field1043[var8] = var5.method551();
			int var12 = var5.method549();
			int var13 = var10 * var11;
			field1041[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field1041[var8][var14] = var4.method550();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field1041[var8][var10 * var16 + var15] = var4.method550();
					}
				}
			}

			if (var11 > field1047 && var8 < 128) {
				field1047 = var11;
			}

			field1044[var8] = 1;
			field1046[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field1041[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field1046[var8]--;
				field1044[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field1041[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field1046[var8]--;
			}
		}

		if (arg0) {
			field1046[32] = field1046[73];
		} else {
			field1046[32] = field1046[105];
		}
	}

	@ObfuscatedName("RXCVCUUO.a(IIBLjava/lang/String;I)V")
	public void method381(int arg0, int arg1, String arg2, int arg3) {
		method386(arg0 - method385(arg2), arg2, arg3, arg1);
	}

	@ObfuscatedName("RXCVCUUO.a(IILjava/lang/String;II)V")
	public void method382(int arg0, String arg1, int arg2, int arg3) {
		method386(arg3 - method385(arg1) / 2, arg1, arg0, arg2);
	}

	@ObfuscatedName("RXCVCUUO.a(IIIZLjava/lang/String;I)V")
	public void method383(int arg0, int arg1, int arg2, boolean arg3, String arg4) {
		method390(arg4, arg0, arg2 - method384(arg4) / 2, arg1, arg3);
	}

	@ObfuscatedName("RXCVCUUO.a(Ljava/lang/String;Z)I")
	public int method384(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field1046[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("RXCVCUUO.a(ILjava/lang/String;)I")
	public int method385(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field1046[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("RXCVCUUO.a(ILjava/lang/String;III)V")
	public void method386(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 != null) {
			arg3 -= field1047;
			for (int var5 = 0; var5 < arg1.length(); var5++) {
				char var6 = arg1.charAt(var5);
				if (var6 != ' ') {
					method393(field1041[var6], field1044[var6] + arg0, field1045[var6] + arg3, field1042[var6], field1043[var6], arg2);
				}

				arg0 += field1046[var6];
			}
		}
	}

	@ObfuscatedName("RXCVCUUO.a(IIIIILjava/lang/String;)V")
	public void method387(int arg0, int arg1, int arg2, int arg3, String arg4) {
		if (arg4 != null) {
			arg1 -= method385(arg4) / 2;
			arg0 -= field1047;
			for (int var6 = 0; var6 < arg4.length(); var6++) {
				char var7 = arg4.charAt(var6);
				if (var7 != ' ') {
					method393(field1041[var7], field1044[var7] + arg1, field1045[var7] + arg0 + (int) (Math.sin(arg2 / 5.0D + var6 / 2.0D) * 5.0D), field1042[var7], field1043[var7], arg3);
				}

				arg1 += field1046[var7];
			}
		}
	}

	@ObfuscatedName("RXCVCUUO.b(IIIIILjava/lang/String;)V")
	public void method388(int arg0, int arg1, int arg2, int arg3, String arg4) {
		if (arg4 != null) {
			arg3 -= method385(arg4) / 2;
			arg1 -= field1047;
			for (int var6 = 0; var6 < arg4.length(); var6++) {
				char var7 = arg4.charAt(var6);
				if (var7 != ' ') {
					method393(field1041[var7], field1044[var7] + arg3 + (int) (Math.sin(arg2 / 5.0D + var6 / 5.0D) * 5.0D), field1045[var7] + arg1 + (int) (Math.sin(arg2 / 5.0D + var6 / 3.0D) * 5.0D), field1042[var7], field1043[var7], arg0);
				}

				arg3 += field1046[var7];
			}
		}
	}

	@ObfuscatedName("RXCVCUUO.a(ILjava/lang/String;IBIII)V")
	public void method389(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 != null) {
			double var7 = 7.0D - arg2 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg5 -= method385(arg1) / 2;
			arg0 -= field1047;
			for (int var9 = 0; var9 < arg1.length(); var9++) {
				char var10 = arg1.charAt(var9);
				if (var10 != ' ') {
					method393(field1041[var10], field1044[var10] + arg5, field1045[var10] + arg0 + (int) (Math.sin(var9 / 1.5D + arg3) * var7), field1042[var10], field1043[var10], arg4);
				}

				arg5 += field1046[var10];
			}
		}
	}

	@ObfuscatedName("RXCVCUUO.a(Ljava/lang/String;IBIIZ)V")
	public void method390(String arg0, int arg1, int arg2, int arg3, boolean arg4) {
		field1049 = false;
		int var6 = arg2;
		if (arg0 != null) {
			arg1 -= field1047;
			for (int var7 = 0; var7 < arg0.length(); var7++) {
				if (arg0.charAt(var7) == '@' && var7 + 4 < arg0.length() && arg0.charAt(var7 + 4) == '@') {
					int var8 = method392(arg0.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg3 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg0.charAt(var7);
					if (var9 != ' ') {
						if (arg4) {
							method393(field1041[var9], field1044[var9] + arg2 + 1, field1045[var9] + arg1 + 1, field1042[var9], field1043[var9], 0);
						}

						method393(field1041[var9], field1044[var9] + arg2, field1045[var9] + arg1, field1042[var9], field1043[var9], arg3);
					}

					arg2 += field1046[var9];
				}
			}

			if (field1049) {
				KNERFXXY.method287(0x800000, var6, (int) (field1047 * 0.7D) + arg1, arg2 - var6);
			}
		}
	}

	@ObfuscatedName("RXCVCUUO.a(IZILjava/lang/String;III)V")
	public void method391(int arg0, boolean arg1, int arg2, String arg3, int arg4, int arg5) {
		if (arg3 != null) {
			field1048.setSeed(arg5);
			int var7 = (field1048.nextInt() & 0x1F) + 192;
			arg0 -= field1047;
			for (int var8 = 0; var8 < arg3.length(); var8++) {
				if (arg3.charAt(var8) == '@' && var8 + 4 < arg3.length() && arg3.charAt(var8 + 4) == '@') {
					int var9 = method392(arg3.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg2 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg3.charAt(var8);
					if (var10 != ' ') {
						if (arg1) {
							method395(field1045[var10] + arg0 + 1, field1043[var10], 192, 0, field1042[var10], field1041[var10], field1044[var10] + arg4 + 1);
						}

						method395(field1045[var10] + arg0, field1043[var10], var7, arg2, field1042[var10], field1041[var10], field1044[var10] + arg4);
					}

					arg4 += field1046[var10];
					if ((field1048.nextInt() & 0x3) == 0) {
						arg4++;
					}
				}
			}
		}
	}

	@ObfuscatedName("RXCVCUUO.b(Ljava/lang/String;Z)I")
	public int method392(String arg0) {
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
				field1049 = true;
			}

			if (arg0.equals("end")) {
				field1049 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("RXCVCUUO.a([BIIIII)V")
	public void method393(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = KNERFXXY.field825 * arg2 + arg1;
		int var8 = KNERFXXY.field825 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < KNERFXXY.field827) {
			int var11 = KNERFXXY.field827 - arg2;
			arg4 -= var11;
			arg2 = KNERFXXY.field827;
			var10 += arg3 * var11;
			var7 += KNERFXXY.field825 * var11;
		}

		if (arg2 + arg4 >= KNERFXXY.field828) {
			arg4 -= arg2 + arg4 + 1 - KNERFXXY.field828;
		}

		if (arg1 < KNERFXXY.field829) {
			int var12 = KNERFXXY.field829 - arg1;
			arg3 -= var12;
			arg1 = KNERFXXY.field829;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= KNERFXXY.field830) {
			int var13 = arg1 + arg3 + 1 - KNERFXXY.field830;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method394(KNERFXXY.field824, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("RXCVCUUO.a([I[BIIIIIII)V")
	public void method394(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("RXCVCUUO.a(IIIII[BIB)V")
	public void method395(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
		int var8 = KNERFXXY.field825 * arg0 + arg6;
		int var9 = KNERFXXY.field825 - arg4;
		int var10 = 0;
		int var11 = 0;
		if (arg0 < KNERFXXY.field827) {
			int var12 = KNERFXXY.field827 - arg0;
			arg1 -= var12;
			arg0 = KNERFXXY.field827;
			var11 += arg4 * var12;
			var8 += KNERFXXY.field825 * var12;
		}

		if (arg0 + arg1 >= KNERFXXY.field828) {
			arg1 -= arg0 + arg1 + 1 - KNERFXXY.field828;
		}

		if (arg6 < KNERFXXY.field829) {
			int var13 = KNERFXXY.field829 - arg6;
			arg4 -= var13;
			arg6 = KNERFXXY.field829;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg4 + arg6 >= KNERFXXY.field830) {
			int var14 = arg4 + arg6 + 1 - KNERFXXY.field830;
			arg4 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg4 > 0 && arg1 > 0) {
			method396(var11, arg5, arg3, KNERFXXY.field824, arg1, arg4, var10, var8, var9, arg2);
		}
	}

	@ObfuscatedName("RXCVCUUO.a(BI[BI[IIIIIII)V")
	public void method396(int arg0, byte[] arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		arg2 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
		arg9 = 256 - arg9;
		for (int var11 = -arg4; var11 < 0; var11++) {
			for (int var12 = -arg5; var12 < 0; var12++) {
				if (arg1[arg0++] == 0) {
					arg7++;
				} else {
					int var13 = arg3[arg7];
					arg3[arg7++] = (((var13 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((var13 & 0xFF00) * arg9 & 0xFF0000) >> 8) + arg2;
				}
			}

			arg7 += arg8;
			arg0 += arg6;
		}
	}
}
