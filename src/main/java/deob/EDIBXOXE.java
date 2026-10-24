package deob;

import java.util.Random;

@ObfuscatedName("EDIBXOXE")
public final class EDIBXOXE extends PGTLMTYR {

	@ObfuscatedName("EDIBXOXE.B")
	public byte[][] field584 = new byte[256][];

	@ObfuscatedName("EDIBXOXE.C")
	public int[] field585 = new int[256];

	@ObfuscatedName("EDIBXOXE.D")
	public int[] field586 = new int[256];

	@ObfuscatedName("EDIBXOXE.E")
	public int[] field587 = new int[256];

	@ObfuscatedName("EDIBXOXE.F")
	public int[] field588 = new int[256];

	@ObfuscatedName("EDIBXOXE.G")
	public int[] field589 = new int[256];

	@ObfuscatedName("EDIBXOXE.I")
	public Random field591 = new Random();

	@ObfuscatedName("EDIBXOXE.J")
	public boolean field592 = false;

	@ObfuscatedName("EDIBXOXE.H")
	public int field590;

	public EDIBXOXE(FXNTEMPE arg0, String arg1, boolean arg2) {
		RSWRPCHR var4 = new RSWRPCHR(arg0.method212(arg1 + ".dat", null));
		RSWRPCHR var5 = new RSWRPCHR(arg0.method212("index.dat", null));
		boolean var6 = true;
		var5.field1038 = var4.method390() + 4;
		int var7 = var5.method388();
		if (var7 > 0) {
			var5.field1038 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field587[var8] = var5.method388();
			field588[var8] = var5.method388();
			int var10 = field585[var8] = var5.method390();
			int var11 = field586[var8] = var5.method390();
			int var12 = var5.method388();
			int var13 = var10 * var11;
			field584[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field584[var8][var14] = var4.method389();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field584[var8][var10 * var16 + var15] = var4.method389();
					}
				}
			}

			if (var11 > field590 && var8 < 128) {
				field590 = var11;
			}

			field587[var8] = 1;
			field589[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field584[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field589[var8]--;
				field587[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field584[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field589[var8]--;
			}
		}

		if (arg2) {
			field589[32] = field589[73];
		} else {
			field589[32] = field589[105];
		}
	}

	@ObfuscatedName("EDIBXOXE.a(ILjava/lang/String;III)V")
	public void method178(String arg0, int arg1, int arg2, int arg3) {
		method183(arg2 - method182(arg0), arg1, arg3, arg0);
	}

	@ObfuscatedName("EDIBXOXE.a(IIIILjava/lang/String;)V")
	public void method179(int arg0, int arg1, int arg2, String arg3) {
		method183(arg1 - method182(arg3) / 2, arg0, arg2, arg3);
	}

	@ObfuscatedName("EDIBXOXE.a(ZILjava/lang/String;III)V")
	public void method180(boolean arg0, int arg1, String arg2, int arg3, int arg4) {
		method187(arg4 - method181(arg2) / 2, arg2, arg1, arg0, arg3);
	}

	@ObfuscatedName("EDIBXOXE.a(ILjava/lang/String;)I")
	public int method181(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field589[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("EDIBXOXE.b(ILjava/lang/String;)I")
	public int method182(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field589[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("EDIBXOXE.a(IBIILjava/lang/String;)V")
	public void method183(int arg0, int arg1, int arg2, String arg3) {
		if (arg3 != null) {
			arg2 -= field590;
			for (int var5 = 0; var5 < arg3.length(); var5++) {
				char var6 = arg3.charAt(var5);
				if (var6 != ' ') {
					method190(field584[var6], field587[var6] + arg0, field588[var6] + arg2, field585[var6], field586[var6], arg1);
				}

				arg0 += field589[var6];
			}
		}
	}

	@ObfuscatedName("EDIBXOXE.a(Ljava/lang/String;IIIZI)V")
	public void method184(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg4 -= method182(arg0) / 2;
			arg1 -= field590;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method190(field584[var7], field587[var7] + arg4, field588[var7] + arg1 + (int) (Math.sin(arg3 / 5.0D + var6 / 2.0D) * 5.0D), field585[var7], field586[var7], arg2);
				}

				arg4 += field589[var7];
			}
		}
	}

	@ObfuscatedName("EDIBXOXE.b(ZILjava/lang/String;III)V")
	public void method185(int arg0, String arg1, int arg2, int arg3, int arg4) {
		if (arg1 != null) {
			arg2 -= method182(arg1) / 2;
			arg4 -= field590;
			for (int var6 = 0; var6 < arg1.length(); var6++) {
				char var7 = arg1.charAt(var6);
				if (var7 != ' ') {
					method190(field584[var7], field587[var7] + arg2 + (int) (Math.sin(arg0 / 5.0D + var6 / 5.0D) * 5.0D), field588[var7] + arg4 + (int) (Math.sin(arg0 / 5.0D + var6 / 3.0D) * 5.0D), field585[var7], field586[var7], arg3);
				}

				arg2 += field589[var7];
			}
		}
	}

	@ObfuscatedName("EDIBXOXE.a(IIILjava/lang/String;III)V")
	public void method186(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
		if (arg3 != null) {
			double var7 = 7.0D - arg0 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg5 -= method182(arg3) / 2;
			arg2 -= field590;
			for (int var9 = 0; var9 < arg3.length(); var9++) {
				char var10 = arg3.charAt(var9);
				if (var10 != ' ') {
					method190(field584[var10], field587[var10] + arg5, field588[var10] + arg2 + (int) (Math.sin(var9 / 1.5D + arg1) * var7), field585[var10], field586[var10], arg4);
				}

				arg5 += field589[var10];
			}
		}
	}

	@ObfuscatedName("EDIBXOXE.a(ILjava/lang/String;IIZI)V")
	public void method187(int arg0, String arg1, int arg2, boolean arg3, int arg4) {
		field592 = false;
		int var6 = arg0;
		if (arg1 != null) {
			arg4 -= field590;
			for (int var7 = 0; var7 < arg1.length(); var7++) {
				if (arg1.charAt(var7) == '@' && var7 + 4 < arg1.length() && arg1.charAt(var7 + 4) == '@') {
					int var8 = method189(arg1.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg2 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg1.charAt(var7);
					if (var9 != ' ') {
						if (arg3) {
							method190(field584[var9], field587[var9] + arg0 + 1, field588[var9] + arg4 + 1, field585[var9], field586[var9], 0);
						}

						method190(field584[var9], field587[var9] + arg0, field588[var9] + arg4, field585[var9], field586[var9], arg2);
					}

					arg0 += field589[var9];
				}
			}

			if (field592) {
				PGTLMTYR.method347((int) (field590 * 0.7D) + arg4, 0x800000, var6, arg0 - var6);
			}
		}
	}

	@ObfuscatedName("EDIBXOXE.a(ZIZIILjava/lang/String;I)V")
	public void method188(int arg0, boolean arg1, int arg2, int arg3, String arg4, int arg5) {
		if (arg4 != null) {
			field591.setSeed(arg5);
			int var7 = (field591.nextInt() & 0x1F) + 192;
			arg0 -= field590;
			for (int var8 = 0; var8 < arg4.length(); var8++) {
				if (arg4.charAt(var8) == '@' && var8 + 4 < arg4.length() && arg4.charAt(var8 + 4) == '@') {
					int var9 = method189(arg4.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg3 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg4.charAt(var8);
					if (var10 != ' ') {
						if (arg1) {
							method192(field584[var10], 0, field585[var10], field587[var10] + arg2 + 1, field586[var10], 192, field588[var10] + arg0 + 1);
						}

						method192(field584[var10], arg3, field585[var10], field587[var10] + arg2, field586[var10], var7, field588[var10] + arg0);
					}

					arg2 += field589[var10];
					if ((field591.nextInt() & 0x3) == 0) {
						arg2++;
					}
				}
			}
		}
	}

	@ObfuscatedName("EDIBXOXE.a(Ljava/lang/String;I)I")
	public int method189(String arg0) {
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
				field592 = true;
			}

			if (arg0.equals("end")) {
				field592 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("EDIBXOXE.a([BIIIII)V")
	public void method190(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = PGTLMTYR.field951 * arg2 + arg1;
		int var8 = PGTLMTYR.field951 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < PGTLMTYR.field953) {
			int var11 = PGTLMTYR.field953 - arg2;
			arg4 -= var11;
			arg2 = PGTLMTYR.field953;
			var10 += arg3 * var11;
			var7 += PGTLMTYR.field951 * var11;
		}

		if (arg2 + arg4 >= PGTLMTYR.field954) {
			arg4 -= arg2 + arg4 + 1 - PGTLMTYR.field954;
		}

		if (arg1 < PGTLMTYR.field955) {
			int var12 = PGTLMTYR.field955 - arg1;
			arg3 -= var12;
			arg1 = PGTLMTYR.field955;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= PGTLMTYR.field956) {
			int var13 = arg1 + arg3 + 1 - PGTLMTYR.field956;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method191(PGTLMTYR.field950, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("EDIBXOXE.a([I[BIIIIIII)V")
	public void method191(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("EDIBXOXE.a(Z[BIIIIII)V")
	public void method192(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = PGTLMTYR.field951 * arg6 + arg3;
		int var9 = PGTLMTYR.field951 - arg2;
		int var10 = 0;
		int var11 = 0;
		if (arg6 < PGTLMTYR.field953) {
			int var12 = PGTLMTYR.field953 - arg6;
			arg4 -= var12;
			arg6 = PGTLMTYR.field953;
			var11 += arg2 * var12;
			var8 += PGTLMTYR.field951 * var12;
		}

		if (arg4 + arg6 >= PGTLMTYR.field954) {
			arg4 -= arg4 + arg6 + 1 - PGTLMTYR.field954;
		}

		if (arg3 < PGTLMTYR.field955) {
			int var13 = PGTLMTYR.field955 - arg3;
			arg2 -= var13;
			arg3 = PGTLMTYR.field955;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg2 + arg3 >= PGTLMTYR.field956) {
			int var14 = arg2 + arg3 + 1 - PGTLMTYR.field956;
			arg2 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg2 > 0 && arg4 > 0) {
			method193(arg4, var11, var8, var10, var9, PGTLMTYR.field950, arg1, arg2, arg5, arg0);
		}
	}

	@ObfuscatedName("EDIBXOXE.a(IIIIII[IIII[B)V")
	public void method193(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, byte[] arg9) {
		arg6 = ((arg6 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((arg6 & 0xFF00) * arg8 & 0xFF0000) >> 8;
		arg8 = 256 - arg8;
		for (int var11 = -arg0; var11 < 0; var11++) {
			for (int var12 = -arg7; var12 < 0; var12++) {
				if (arg9[arg1++] == 0) {
					arg2++;
				} else {
					int var13 = arg5[arg2];
					arg5[arg2++] = (((var13 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((var13 & 0xFF00) * arg8 & 0xFF0000) >> 8) + arg6;
				}
			}

			arg2 += arg4;
			arg1 += arg3;
		}
	}
}
