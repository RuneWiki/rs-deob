package deob;

import java.util.Random;

@ObfuscatedName("NEJZODYM")
public final class NEJZODYM extends GEFFBGXP {

	@ObfuscatedName("NEJZODYM.B")
	public byte[][] field1079 = new byte[256][];

	@ObfuscatedName("NEJZODYM.C")
	public int[] field1080 = new int[256];

	@ObfuscatedName("NEJZODYM.D")
	public int[] field1081 = new int[256];

	@ObfuscatedName("NEJZODYM.E")
	public int[] field1082 = new int[256];

	@ObfuscatedName("NEJZODYM.F")
	public int[] field1083 = new int[256];

	@ObfuscatedName("NEJZODYM.G")
	public int[] field1084 = new int[256];

	@ObfuscatedName("NEJZODYM.I")
	public Random field1086 = new Random();

	@ObfuscatedName("NEJZODYM.J")
	public boolean field1087 = false;

	@ObfuscatedName("NEJZODYM.H")
	public int field1085;

	public NEJZODYM(MNPBQFWE arg0, boolean arg1, String arg2) {
		BJPWOXRJ var4 = new BJPWOXRJ(arg0.method429(arg2 + ".dat", null));
		BJPWOXRJ var5 = new BJPWOXRJ(arg0.method429("index.dat", null));
		boolean var6 = true;
		var5.field5 = var4.method17() + 4;
		int var7 = var5.method15();
		if (var7 > 0) {
			var5.field5 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field1082[var8] = var5.method15();
			field1083[var8] = var5.method15();
			int var10 = field1080[var8] = var5.method17();
			int var11 = field1081[var8] = var5.method17();
			int var12 = var5.method15();
			int var13 = var10 * var11;
			field1079[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field1079[var8][var14] = var4.method16();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field1079[var8][var10 * var16 + var15] = var4.method16();
					}
				}
			}

			if (var11 > field1085 && var8 < 128) {
				field1085 = var11;
			}

			field1082[var8] = 1;
			field1084[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field1079[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field1084[var8]--;
				field1082[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field1079[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field1084[var8]--;
			}
		}

		if (arg1) {
			field1084[32] = field1084[73];
		} else {
			field1084[32] = field1084[105];
		}
	}

	@ObfuscatedName("NEJZODYM.a(BIILjava/lang/String;I)V")
	public void method431(int arg0, int arg1, String arg2, int arg3) {
		method436(arg3, arg0, arg2, arg1 - method435(arg2));
	}

	@ObfuscatedName("NEJZODYM.a(IIILjava/lang/String;I)V")
	public void method432(int arg0, int arg1, String arg2, int arg3) {
		method436(arg3, arg1, arg2, arg0 - method435(arg2) / 2);
	}

	@ObfuscatedName("NEJZODYM.a(ILjava/lang/String;ZIIZ)V")
	public void method433(int arg0, String arg1, int arg2, int arg3, boolean arg4) {
		method440(arg1, arg3, arg0, arg2 - method434(arg1) / 2, arg4);
	}

	@ObfuscatedName("NEJZODYM.a(ZLjava/lang/String;)I")
	public int method434(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field1084[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("NEJZODYM.a(Ljava/lang/String;I)I")
	public int method435(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field1084[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("NEJZODYM.b(BIILjava/lang/String;I)V")
	public void method436(int arg0, int arg1, String arg2, int arg3) {
		if (arg2 != null) {
			arg1 -= field1085;
			for (int var5 = 0; var5 < arg2.length(); var5++) {
				char var6 = arg2.charAt(var5);
				if (var6 != ' ') {
					method443(field1079[var6], field1082[var6] + arg3, field1083[var6] + arg1, field1080[var6], field1081[var6], arg0);
				}

				arg3 += field1084[var6];
			}
		}
	}

	@ObfuscatedName("NEJZODYM.a(ILjava/lang/String;IIII)V")
	public void method437(int arg0, String arg1, int arg2, int arg3, int arg4) {
		if (arg1 != null) {
			arg2 -= method435(arg1) / 2;
			arg0 -= field1085;
			for (int var6 = 0; var6 < arg1.length(); var6++) {
				char var7 = arg1.charAt(var6);
				if (var7 != ' ') {
					method443(field1079[var7], field1082[var7] + arg2, field1083[var7] + arg0 + (int) (Math.sin(arg3 / 5.0D + var6 / 2.0D) * 5.0D), field1080[var7], field1081[var7], arg4);
				}

				arg2 += field1084[var7];
			}
		}
	}

	@ObfuscatedName("NEJZODYM.a(IIILjava/lang/String;II)V")
	public void method438(int arg0, int arg1, String arg2, int arg3, int arg4) {
		if (arg2 != null) {
			arg0 -= method435(arg2) / 2;
			arg3 -= field1085;
			for (int var6 = 0; var6 < arg2.length(); var6++) {
				char var7 = arg2.charAt(var6);
				if (var7 != ' ') {
					method443(field1079[var7], field1082[var7] + arg0 + (int) (Math.sin(arg1 / 5.0D + var6 / 5.0D) * 5.0D), field1083[var7] + arg3 + (int) (Math.sin(arg1 / 5.0D + var6 / 3.0D) * 5.0D), field1080[var7], field1081[var7], arg4);
				}

				arg0 += field1084[var7];
			}
		}
	}

	@ObfuscatedName("NEJZODYM.a(IIIIIILjava/lang/String;)V")
	public void method439(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
		if (arg5 != null) {
			double var7 = 7.0D - arg4 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg0 -= method435(arg5) / 2;
			arg3 -= field1085;
			for (int var9 = 0; var9 < arg5.length(); var9++) {
				char var10 = arg5.charAt(var9);
				if (var10 != ' ') {
					method443(field1079[var10], field1082[var10] + arg0, field1083[var10] + arg3 + (int) (Math.sin(var9 / 1.5D + arg2) * var7), field1080[var10], field1081[var10], arg1);
				}

				arg0 += field1084[var10];
			}
		}
	}

	@ObfuscatedName("NEJZODYM.a(Ljava/lang/String;IIIIZ)V")
	public void method440(String arg0, int arg1, int arg2, int arg3, boolean arg4) {
		field1087 = false;
		int var6 = arg3;
		if (arg0 != null) {
			arg1 -= field1085;
			for (int var7 = 0; var7 < arg0.length(); var7++) {
				if (arg0.charAt(var7) == '@' && var7 + 4 < arg0.length() && arg0.charAt(var7 + 4) == '@') {
					int var8 = method442(arg0.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg2 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg0.charAt(var7);
					if (var9 != ' ') {
						if (arg4) {
							method443(field1079[var9], field1082[var9] + arg3 + 1, field1083[var9] + arg1 + 1, field1080[var9], field1081[var9], 0);
						}

						method443(field1079[var9], field1082[var9] + arg3, field1083[var9] + arg1, field1080[var9], field1081[var9], arg2);
					}

					arg3 += field1084[var9];
				}
			}

			if (field1087) {
				GEFFBGXP.method231(var6, arg3 - var6, (int) (field1085 * 0.7D) + arg1, 0x800000);
			}
		}
	}

	@ObfuscatedName("NEJZODYM.a(ZILjava/lang/String;IIII)V")
	public void method441(boolean arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
		if (arg2 != null) {
			field1086.setSeed(arg1);
			int var7 = (field1086.nextInt() & 0x1F) + 192;
			arg3 -= field1085;
			for (int var8 = 0; var8 < arg2.length(); var8++) {
				if (arg2.charAt(var8) == '@' && var8 + 4 < arg2.length() && arg2.charAt(var8 + 4) == '@') {
					int var9 = method442(arg2.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg5 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg2.charAt(var8);
					if (var10 != ' ') {
						if (arg0) {
							method445(field1079[var10], field1080[var10], field1082[var10] + arg4 + 1, 192, 0, field1081[var10], field1083[var10] + arg3 + 1);
						}

						method445(field1079[var10], field1080[var10], field1082[var10] + arg4, var7, arg5, field1081[var10], field1083[var10] + arg3);
					}

					arg4 += field1084[var10];
					if ((field1086.nextInt() & 0x3) == 0) {
						arg4++;
					}
				}
			}
		}
	}

	@ObfuscatedName("NEJZODYM.a(Ljava/lang/String;B)I")
	public int method442(String arg0) {
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
				field1087 = true;
			}

			if (arg0.equals("end")) {
				field1087 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("NEJZODYM.a([BIIIII)V")
	public void method443(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = GEFFBGXP.field623 * arg2 + arg1;
		int var8 = GEFFBGXP.field623 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < GEFFBGXP.field625) {
			int var11 = GEFFBGXP.field625 - arg2;
			arg4 -= var11;
			arg2 = GEFFBGXP.field625;
			var10 += arg3 * var11;
			var7 += GEFFBGXP.field623 * var11;
		}

		if (arg2 + arg4 >= GEFFBGXP.field626) {
			arg4 -= arg2 + arg4 + 1 - GEFFBGXP.field626;
		}

		if (arg1 < GEFFBGXP.field627) {
			int var12 = GEFFBGXP.field627 - arg1;
			arg3 -= var12;
			arg1 = GEFFBGXP.field627;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= GEFFBGXP.field628) {
			int var13 = arg1 + arg3 + 1 - GEFFBGXP.field628;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method444(GEFFBGXP.field622, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("NEJZODYM.a([I[BIIIIIII)V")
	public void method444(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("NEJZODYM.a([BIIIIIII)V")
	public void method445(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = GEFFBGXP.field623 * arg6 + arg2;
		int var9 = GEFFBGXP.field623 - arg1;
		int var10 = 0;
		int var11 = 0;
		if (arg6 < GEFFBGXP.field625) {
			int var12 = GEFFBGXP.field625 - arg6;
			arg5 -= var12;
			arg6 = GEFFBGXP.field625;
			var11 += arg1 * var12;
			var8 += GEFFBGXP.field623 * var12;
		}

		if (arg5 + arg6 >= GEFFBGXP.field626) {
			arg5 -= arg5 + arg6 + 1 - GEFFBGXP.field626;
		}

		if (arg2 < GEFFBGXP.field627) {
			int var13 = GEFFBGXP.field627 - arg2;
			arg1 -= var13;
			arg2 = GEFFBGXP.field627;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg1 + arg2 >= GEFFBGXP.field628) {
			int var14 = arg1 + arg2 + 1 - GEFFBGXP.field628;
			arg1 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg1 > 0 && arg5 > 0) {
			method446(var11, var10, var9, var8, arg1, arg3, arg4, arg0, arg5, GEFFBGXP.field622);
		}
	}

	@ObfuscatedName("NEJZODYM.a(IIIIIII[BII[I)V")
	public void method446(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, int[] arg9) {
		arg6 = ((arg6 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((arg6 & 0xFF00) * arg5 & 0xFF0000) >> 8;
		arg5 = 256 - arg5;
		for (int var11 = -arg8; var11 < 0; var11++) {
			for (int var12 = -arg4; var12 < 0; var12++) {
				if (arg7[arg0++] == 0) {
					arg3++;
				} else {
					int var13 = arg9[arg3];
					arg9[arg3++] = (((var13 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((var13 & 0xFF00) * arg5 & 0xFF0000) >> 8) + arg6;
				}
			}

			arg3 += arg2;
			arg0 += arg1;
		}
	}
}
