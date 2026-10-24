package deob;

import java.util.Random;

@ObfuscatedName("FDMAFIMR")
public final class FDMAFIMR extends OKWPDMPE {

	@ObfuscatedName("FDMAFIMR.F")
	public byte[][] field595 = new byte[256][];

	@ObfuscatedName("FDMAFIMR.G")
	public int[] field596 = new int[256];

	@ObfuscatedName("FDMAFIMR.H")
	public int[] field597 = new int[256];

	@ObfuscatedName("FDMAFIMR.I")
	public int[] field598 = new int[256];

	@ObfuscatedName("FDMAFIMR.J")
	public int[] field599 = new int[256];

	@ObfuscatedName("FDMAFIMR.K")
	public int[] field600 = new int[256];

	@ObfuscatedName("FDMAFIMR.M")
	public Random field602 = new Random();

	@ObfuscatedName("FDMAFIMR.N")
	public boolean field603 = false;

	@ObfuscatedName("FDMAFIMR.L")
	public int field601;

	public FDMAFIMR(VSUYIIVA arg0, String arg1, boolean arg2) {
		CFARFRSG var4 = new CFARFRSG(arg0.method570(arg1 + ".dat", null));
		CFARFRSG var5 = new CFARFRSG(arg0.method570("index.dat", null));
		boolean var6 = true;
		var5.field44 = var4.method32() + 4;
		int var7 = var5.method30();
		if (var7 > 0) {
			var5.field44 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field598[var8] = var5.method30();
			field599[var8] = var5.method30();
			int var10 = field596[var8] = var5.method32();
			int var11 = field597[var8] = var5.method32();
			int var12 = var5.method30();
			int var13 = var10 * var11;
			field595[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field595[var8][var14] = var4.method31();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field595[var8][var10 * var16 + var15] = var4.method31();
					}
				}
			}

			if (var11 > field601 && var8 < 128) {
				field601 = var11;
			}

			field598[var8] = 1;
			field600[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field595[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field600[var8]--;
				field598[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field595[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field600[var8]--;
			}
		}

		if (arg2) {
			field600[32] = field600[73];
		} else {
			field600[32] = field600[105];
		}
	}

	@ObfuscatedName("FDMAFIMR.a(ILjava/lang/String;IZI)V")
	public void method277(int arg0, String arg1, int arg2, int arg3) {
		method282(arg1, arg2 - method281(arg1), arg3, arg0);
	}

	@ObfuscatedName("FDMAFIMR.a(ILjava/lang/String;III)V")
	public void method278(int arg0, String arg1, int arg2, int arg3) {
		method282(arg1, arg3 - method281(arg1) / 2, arg2, arg0);
	}

	@ObfuscatedName("FDMAFIMR.a(ILjava/lang/String;IIZI)V")
	public void method279(int arg0, String arg1, int arg2, boolean arg3, int arg4) {
		method286(arg0, arg1, arg4 - method280(arg1) / 2, arg3, arg2);
	}

	@ObfuscatedName("FDMAFIMR.a(ILjava/lang/String;)I")
	public int method280(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field600[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("FDMAFIMR.a(Ljava/lang/String;I)I")
	public int method281(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field600[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("FDMAFIMR.a(Ljava/lang/String;IIII)V")
	public void method282(String arg0, int arg1, int arg2, int arg3) {
		if (arg0 != null) {
			arg3 -= field601;
			for (int var5 = 0; var5 < arg0.length(); var5++) {
				char var6 = arg0.charAt(var5);
				if (var6 != ' ') {
					method289(field595[var6], field598[var6] + arg1, field599[var6] + arg3, field596[var6], field597[var6], arg2);
				}

				arg1 += field600[var6];
			}
		}
	}

	@ObfuscatedName("FDMAFIMR.a(Ljava/lang/String;IIIIB)V")
	public void method283(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg2 -= method281(arg0) / 2;
			arg4 -= field601;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method289(field595[var7], field598[var7] + arg2, field599[var7] + arg4 + (int) (Math.sin(arg3 / 5.0D + var6 / 2.0D) * 5.0D), field596[var7], field597[var7], arg1);
				}

				arg2 += field600[var7];
			}
		}
	}

	@ObfuscatedName("FDMAFIMR.a(Ljava/lang/String;IIIII)V")
	public void method284(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg1 -= method281(arg0) / 2;
			arg3 -= field601;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method289(field595[var7], field598[var7] + arg1 + (int) (Math.sin(arg4 / 5.0D + var6 / 5.0D) * 5.0D), field599[var7] + arg3 + (int) (Math.sin(arg4 / 5.0D + var6 / 3.0D) * 5.0D), field596[var7], field597[var7], arg2);
				}

				arg1 += field600[var7];
			}
		}
	}

	@ObfuscatedName("FDMAFIMR.a(IIIIIILjava/lang/String;)V")
	public void method285(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
		if (arg5 != null) {
			double var7 = 7.0D - arg2 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg0 -= method281(arg5) / 2;
			arg4 -= field601;
			for (int var9 = 0; var9 < arg5.length(); var9++) {
				char var10 = arg5.charAt(var9);
				if (var10 != ' ') {
					method289(field595[var10], field598[var10] + arg0, field599[var10] + arg4 + (int) (Math.sin(var9 / 1.5D + arg3) * var7), field596[var10], field597[var10], arg1);
				}

				arg0 += field600[var10];
			}
		}
	}

	@ObfuscatedName("FDMAFIMR.a(ILjava/lang/String;IZII)V")
	public void method286(int arg0, String arg1, int arg2, boolean arg3, int arg4) {
		field603 = false;
		int var6 = arg2;
		if (arg1 != null) {
			arg4 -= field601;
			for (int var7 = 0; var7 < arg1.length(); var7++) {
				if (arg1.charAt(var7) == '@' && var7 + 4 < arg1.length() && arg1.charAt(var7 + 4) == '@') {
					int var8 = method288(arg1.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg0 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg1.charAt(var7);
					if (var9 != ' ') {
						if (arg3) {
							method289(field595[var9], field598[var9] + arg2 + 1, field599[var9] + arg4 + 1, field596[var9], field597[var9], 0);
						}

						method289(field595[var9], field598[var9] + arg2, field599[var9] + arg4, field596[var9], field597[var9], arg0);
					}

					arg2 += field600[var9];
				}
			}

			if (field603) {
				OKWPDMPE.method439(arg2 - var6, (int) (field601 * 0.7D) + arg4, 0x800000, var6);
			}
		}
	}

	@ObfuscatedName("FDMAFIMR.a(ILjava/lang/String;IIIZI)V")
	public void method287(String arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		if (arg0 != null) {
			field602.setSeed(arg2);
			int var7 = (field602.nextInt() & 0x1F) + 192;
			arg1 -= field601;
			for (int var8 = 0; var8 < arg0.length(); var8++) {
				if (arg0.charAt(var8) == '@' && var8 + 4 < arg0.length() && arg0.charAt(var8 + 4) == '@') {
					int var9 = method288(arg0.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg3 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg0.charAt(var8);
					if (var10 != ' ') {
						if (arg4) {
							method291(field598[var10] + arg5 + 1, field595[var10], field599[var10] + arg1 + 1, field596[var10], 0, field597[var10], 192);
						}

						method291(field598[var10] + arg5, field595[var10], field599[var10] + arg1, field596[var10], arg3, field597[var10], var7);
					}

					arg5 += field600[var10];
					if ((field602.nextInt() & 0x3) == 0) {
						arg5++;
					}
				}
			}
		}
	}

	@ObfuscatedName("FDMAFIMR.b(ILjava/lang/String;)I")
	public int method288(String arg0) {
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
				field603 = true;
			}

			if (arg0.equals("end")) {
				field603 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("FDMAFIMR.a([BIIIII)V")
	public void method289(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = OKWPDMPE.field980 * arg2 + arg1;
		int var8 = OKWPDMPE.field980 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < OKWPDMPE.field982) {
			int var11 = OKWPDMPE.field982 - arg2;
			arg4 -= var11;
			arg2 = OKWPDMPE.field982;
			var10 += arg3 * var11;
			var7 += OKWPDMPE.field980 * var11;
		}

		if (arg2 + arg4 >= OKWPDMPE.field983) {
			arg4 -= arg2 + arg4 + 1 - OKWPDMPE.field983;
		}

		if (arg1 < OKWPDMPE.field984) {
			int var12 = OKWPDMPE.field984 - arg1;
			arg3 -= var12;
			arg1 = OKWPDMPE.field984;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= OKWPDMPE.field985) {
			int var13 = arg1 + arg3 + 1 - OKWPDMPE.field985;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method290(OKWPDMPE.field979, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("FDMAFIMR.a([I[BIIIIIII)V")
	public void method290(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("FDMAFIMR.a(II[BIIIII)V")
	public void method291(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = OKWPDMPE.field980 * arg2 + arg0;
		int var9 = OKWPDMPE.field980 - arg3;
		int var10 = 0;
		int var11 = 0;
		if (arg2 < OKWPDMPE.field982) {
			int var12 = OKWPDMPE.field982 - arg2;
			arg5 -= var12;
			arg2 = OKWPDMPE.field982;
			var11 += arg3 * var12;
			var8 += OKWPDMPE.field980 * var12;
		}

		if (arg2 + arg5 >= OKWPDMPE.field983) {
			arg5 -= arg2 + arg5 + 1 - OKWPDMPE.field983;
		}

		if (arg0 < OKWPDMPE.field984) {
			int var13 = OKWPDMPE.field984 - arg0;
			arg3 -= var13;
			arg0 = OKWPDMPE.field984;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg0 + arg3 >= OKWPDMPE.field985) {
			int var14 = arg0 + arg3 + 1 - OKWPDMPE.field985;
			arg3 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg3 > 0 && arg5 > 0) {
			method292(arg1, var8, arg4, var11, var9, arg3, var10, arg6, OKWPDMPE.field979, arg5);
		}
	}

	@ObfuscatedName("FDMAFIMR.a([BIIIIZIII[II)V")
	public void method292(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
		arg2 = ((arg2 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg7 & 0xFF0000) >> 8;
		arg7 = 256 - arg7;
		for (int var11 = -arg9; var11 < 0; var11++) {
			for (int var12 = -arg5; var12 < 0; var12++) {
				if (arg0[arg3++] == 0) {
					arg1++;
				} else {
					int var13 = arg8[arg1];
					arg8[arg1++] = (((var13 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((var13 & 0xFF00) * arg7 & 0xFF0000) >> 8) + arg2;
				}
			}

			arg1 += arg4;
			arg3 += arg6;
		}
	}
}
