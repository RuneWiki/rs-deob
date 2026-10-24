package deob;

import java.util.Random;

@ObfuscatedName("YCYYIGLM")
public final class YCYYIGLM extends KPYGFVMA {

	@ObfuscatedName("YCYYIGLM.A")
	public byte[][] field1509 = new byte[256][];

	@ObfuscatedName("YCYYIGLM.B")
	public int[] field1510 = new int[256];

	@ObfuscatedName("YCYYIGLM.C")
	public int[] field1511 = new int[256];

	@ObfuscatedName("YCYYIGLM.D")
	public int[] field1512 = new int[256];

	@ObfuscatedName("YCYYIGLM.E")
	public int[] field1513 = new int[256];

	@ObfuscatedName("YCYYIGLM.F")
	public int[] field1514 = new int[256];

	@ObfuscatedName("YCYYIGLM.H")
	public Random field1516 = new Random();

	@ObfuscatedName("YCYYIGLM.I")
	public boolean field1517 = false;

	@ObfuscatedName("YCYYIGLM.G")
	public int field1515;

	public YCYYIGLM(boolean arg0, LKPVZAQN arg1, String arg2) {
		WBEWPIXO var4 = new WBEWPIXO(arg1.method323(arg2 + ".dat", null));
		WBEWPIXO var5 = new WBEWPIXO(arg1.method323("index.dat", null));
		boolean var6 = true;
		var5.field1401 = var4.method517() + 4;
		int var7 = var5.method515();
		if (var7 > 0) {
			var5.field1401 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field1512[var8] = var5.method515();
			field1513[var8] = var5.method515();
			int var10 = field1510[var8] = var5.method517();
			int var11 = field1511[var8] = var5.method517();
			int var12 = var5.method515();
			int var13 = var10 * var11;
			field1509[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field1509[var8][var14] = var4.method516();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field1509[var8][var10 * var16 + var15] = var4.method516();
					}
				}
			}

			if (var11 > field1515 && var8 < 128) {
				field1515 = var11;
			}

			field1512[var8] = 1;
			field1514[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field1509[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field1514[var8]--;
				field1512[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field1509[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field1514[var8]--;
			}
		}

		if (arg0) {
			field1514[32] = field1514[73];
		} else {
			field1514[32] = field1514[105];
		}
	}

	@ObfuscatedName("YCYYIGLM.a(IILjava/lang/String;II)V")
	public void method588(int arg0, int arg1, String arg2, int arg3) {
		method593(arg0, arg3, arg2, arg1 - method592(arg2));
	}

	@ObfuscatedName("YCYYIGLM.a(IIILjava/lang/String;I)V")
	public void method589(int arg0, int arg1, int arg2, String arg3) {
		method593(arg1, arg0, arg3, arg2 - method592(arg3) / 2);
	}

	@ObfuscatedName("YCYYIGLM.a(IZLjava/lang/String;III)V")
	public void method590(int arg0, boolean arg1, String arg2, int arg3, int arg4) {
		method597(arg1, arg2, arg3 - method591(arg2) / 2, arg0, arg4);
	}

	@ObfuscatedName("YCYYIGLM.a(ZLjava/lang/String;)I")
	public int method591(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field1514[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("YCYYIGLM.a(ILjava/lang/String;)I")
	public int method592(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field1514[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("YCYYIGLM.a(ZIILjava/lang/String;I)V")
	public void method593(int arg0, int arg1, String arg2, int arg3) {
		if (arg2 != null) {
			arg1 -= field1515;
			for (int var5 = 0; var5 < arg2.length(); var5++) {
				char var6 = arg2.charAt(var5);
				if (var6 != ' ') {
					method600(field1509[var6], field1512[var6] + arg3, field1513[var6] + arg1, field1510[var6], field1511[var6], arg0);
				}

				arg3 += field1514[var6];
			}
		}
	}

	@ObfuscatedName("YCYYIGLM.a(Ljava/lang/String;IIIII)V")
	public void method594(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg3 -= method592(arg0) / 2;
			arg1 -= field1515;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method600(field1509[var7], field1512[var7] + arg3, field1513[var7] + arg1 + (int) (Math.sin(arg2 / 5.0D + var6 / 2.0D) * 5.0D), field1510[var7], field1511[var7], arg4);
				}

				arg3 += field1514[var7];
			}
		}
	}

	@ObfuscatedName("YCYYIGLM.a(IIIIILjava/lang/String;)V")
	public void method595(int arg0, int arg1, int arg2, int arg3, String arg4) {
		if (arg4 != null) {
			arg1 -= method592(arg4) / 2;
			arg2 -= field1515;
			for (int var6 = 0; var6 < arg4.length(); var6++) {
				char var7 = arg4.charAt(var6);
				if (var7 != ' ') {
					method600(field1509[var7], field1512[var7] + arg1 + (int) (Math.sin(arg3 / 5.0D + var6 / 5.0D) * 5.0D), field1513[var7] + arg2 + (int) (Math.sin(arg3 / 5.0D + var6 / 3.0D) * 5.0D), field1510[var7], field1511[var7], arg0);
				}

				arg1 += field1514[var7];
			}
		}
	}

	@ObfuscatedName("YCYYIGLM.a(IIIZIILjava/lang/String;)V")
	public void method596(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
		if (arg5 != null) {
			double var7 = 7.0D - arg4 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg3 -= method592(arg5) / 2;
			arg1 -= field1515;
			for (int var9 = 0; var9 < arg5.length(); var9++) {
				char var10 = arg5.charAt(var9);
				if (var10 != ' ') {
					method600(field1509[var10], field1512[var10] + arg3, field1513[var10] + arg1 + (int) (Math.sin(var9 / 1.5D + arg2) * var7), field1510[var10], field1511[var10], arg0);
				}

				arg3 += field1514[var10];
			}
		}
	}

	@ObfuscatedName("YCYYIGLM.a(BZLjava/lang/String;III)V")
	public void method597(boolean arg0, String arg1, int arg2, int arg3, int arg4) {
		field1517 = false;
		int var6 = arg2;
		if (arg1 != null) {
			arg4 -= field1515;
			for (int var7 = 0; var7 < arg1.length(); var7++) {
				if (arg1.charAt(var7) == '@' && var7 + 4 < arg1.length() && arg1.charAt(var7 + 4) == '@') {
					int var8 = method599(arg1.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg3 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg1.charAt(var7);
					if (var9 != ' ') {
						if (arg0) {
							method600(field1509[var9], field1512[var9] + arg2 + 1, field1513[var9] + arg4 + 1, field1510[var9], field1511[var9], 0);
						}

						method600(field1509[var9], field1512[var9] + arg2, field1513[var9] + arg4, field1510[var9], field1511[var9], arg3);
					}

					arg2 += field1514[var9];
				}
			}

			if (field1517) {
				KPYGFVMA.method318((int) (field1515 * 0.7D) + arg4, arg2 - var6, var6, 0x800000);
			}
		}
	}

	@ObfuscatedName("YCYYIGLM.a(Ljava/lang/String;ZIIIII)V")
	public void method598(String arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 != null) {
			field1516.setSeed(arg5);
			int var7 = (field1516.nextInt() & 0x1F) + 192;
			arg3 -= field1515;
			for (int var8 = 0; var8 < arg0.length(); var8++) {
				if (arg0.charAt(var8) == '@' && var8 + 4 < arg0.length() && arg0.charAt(var8 + 4) == '@') {
					int var9 = method599(arg0.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg4 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg0.charAt(var8);
					if (var10 != ' ') {
						if (arg1) {
							method602(field1511[var10], field1512[var10] + arg2 + 1, field1510[var10], 0, field1513[var10] + arg3 + 1, 192, field1509[var10]);
						}

						method602(field1511[var10], field1512[var10] + arg2, field1510[var10], arg4, field1513[var10] + arg3, var7, field1509[var10]);
					}

					arg2 += field1514[var10];
					if ((field1516.nextInt() & 0x3) == 0) {
						arg2++;
					}
				}
			}
		}
	}

	@ObfuscatedName("YCYYIGLM.a(Ljava/lang/String;Z)I")
	public int method599(String arg0) {
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
				field1517 = true;
			}

			if (arg0.equals("end")) {
				field1517 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("YCYYIGLM.a([BIIIII)V")
	public void method600(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = KPYGFVMA.field969 * arg2 + arg1;
		int var8 = KPYGFVMA.field969 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < KPYGFVMA.field971) {
			int var11 = KPYGFVMA.field971 - arg2;
			arg4 -= var11;
			arg2 = KPYGFVMA.field971;
			var10 += arg3 * var11;
			var7 += KPYGFVMA.field969 * var11;
		}

		if (arg2 + arg4 >= KPYGFVMA.field972) {
			arg4 -= arg2 + arg4 + 1 - KPYGFVMA.field972;
		}

		if (arg1 < KPYGFVMA.field973) {
			int var12 = KPYGFVMA.field973 - arg1;
			arg3 -= var12;
			arg1 = KPYGFVMA.field973;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= KPYGFVMA.field974) {
			int var13 = arg1 + arg3 + 1 - KPYGFVMA.field974;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method601(KPYGFVMA.field968, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("YCYYIGLM.a([I[BIIIIIII)V")
	public void method601(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("YCYYIGLM.a(IIIIIII[B)V")
	public void method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
		int var8 = KPYGFVMA.field969 * arg4 + arg1;
		int var9 = KPYGFVMA.field969 - arg2;
		int var10 = 0;
		int var11 = 0;
		if (arg4 < KPYGFVMA.field971) {
			int var12 = KPYGFVMA.field971 - arg4;
			arg0 -= var12;
			arg4 = KPYGFVMA.field971;
			var11 += arg2 * var12;
			var8 += KPYGFVMA.field969 * var12;
		}

		if (arg0 + arg4 >= KPYGFVMA.field972) {
			arg0 -= arg0 + arg4 + 1 - KPYGFVMA.field972;
		}

		if (arg1 < KPYGFVMA.field973) {
			int var13 = KPYGFVMA.field973 - arg1;
			arg2 -= var13;
			arg1 = KPYGFVMA.field973;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg1 + arg2 >= KPYGFVMA.field974) {
			int var14 = arg1 + arg2 + 1 - KPYGFVMA.field974;
			arg2 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg2 > 0 && arg0 > 0) {
			method603(arg3, arg0, arg5, var10, arg6, var11, arg2, var8, KPYGFVMA.field968, var9);
		}
	}

	@ObfuscatedName("YCYYIGLM.a(IIIII[BIII[II)V")
	public void method603(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
		arg0 = ((arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		arg2 = 256 - arg2;
		for (int var11 = -arg1; var11 < 0; var11++) {
			for (int var12 = -arg6; var12 < 0; var12++) {
				if (arg4[arg5++] == 0) {
					arg7++;
				} else {
					int var13 = arg8[arg7];
					arg8[arg7++] = (((var13 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((var13 & 0xFF00) * arg2 & 0xFF0000) >> 8) + arg0;
				}
			}

			arg7 += arg9;
			arg5 += arg3;
		}
	}
}
