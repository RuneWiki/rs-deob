package deob;

import java.util.Random;

@ObfuscatedName("XZMPLIVN")
public final class XZMPLIVN extends UJSJLLWF {

	@ObfuscatedName("XZMPLIVN.B")
	public byte[][] field1472 = new byte[256][];

	@ObfuscatedName("XZMPLIVN.C")
	public int[] field1473 = new int[256];

	@ObfuscatedName("XZMPLIVN.D")
	public int[] field1474 = new int[256];

	@ObfuscatedName("XZMPLIVN.E")
	public int[] field1475 = new int[256];

	@ObfuscatedName("XZMPLIVN.F")
	public int[] field1476 = new int[256];

	@ObfuscatedName("XZMPLIVN.G")
	public int[] field1477 = new int[256];

	@ObfuscatedName("XZMPLIVN.I")
	public Random field1479 = new Random();

	@ObfuscatedName("XZMPLIVN.J")
	public boolean field1480 = false;

	@ObfuscatedName("XZMPLIVN.H")
	public int field1478;

	public XZMPLIVN(NXFIIFAD arg0, boolean arg1, String arg2) {
		MNKDCXXG var4 = new MNKDCXXG(arg0.method431(arg2 + ".dat", null));
		MNKDCXXG var5 = new MNKDCXXG(arg0.method431("index.dat", null));
		boolean var6 = true;
		var5.field1055 = var4.method388() + 4;
		int var7 = var5.method386();
		if (var7 > 0) {
			var5.field1055 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field1475[var8] = var5.method386();
			field1476[var8] = var5.method386();
			int var10 = field1473[var8] = var5.method388();
			int var11 = field1474[var8] = var5.method388();
			int var12 = var5.method386();
			int var13 = var10 * var11;
			field1472[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field1472[var8][var14] = var4.method387();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field1472[var8][var10 * var16 + var15] = var4.method387();
					}
				}
			}

			if (var11 > field1478 && var8 < 128) {
				field1478 = var11;
			}

			field1475[var8] = 1;
			field1477[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field1472[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field1477[var8]--;
				field1475[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field1472[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field1477[var8]--;
			}
		}

		if (arg1) {
			field1477[32] = field1477[73];
		} else {
			field1477[32] = field1477[105];
		}
	}

	@ObfuscatedName("XZMPLIVN.a(IILjava/lang/String;II)V")
	public void method584(int arg0, String arg1, int arg2, int arg3) {
		method589(arg3, arg1, arg2 - method588(arg1), arg0);
	}

	@ObfuscatedName("XZMPLIVN.a(IIIILjava/lang/String;)V")
	public void method585(int arg0, int arg1, int arg2, String arg3) {
		method589(arg0, arg3, arg2 - method588(arg3) / 2, arg1);
	}

	@ObfuscatedName("XZMPLIVN.a(IZIBILjava/lang/String;)V")
	public void method586(int arg0, boolean arg1, int arg2, int arg3, String arg4) {
		method593(arg0, arg3 - method587(arg4) / 2, arg1, arg2, arg4);
	}

	@ObfuscatedName("XZMPLIVN.a(Ljava/lang/String;I)I")
	public int method587(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field1477[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("XZMPLIVN.a(Ljava/lang/String;Z)I")
	public int method588(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field1477[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("XZMPLIVN.a(ILjava/lang/String;III)V")
	public void method589(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 != null) {
			arg3 -= field1478;
			for (int var5 = 0; var5 < arg1.length(); var5++) {
				char var6 = arg1.charAt(var5);
				if (var6 != ' ') {
					method596(field1472[var6], field1475[var6] + arg2, field1476[var6] + arg3, field1473[var6], field1474[var6], arg0);
				}

				arg2 += field1477[var6];
			}
		}
	}

	@ObfuscatedName("XZMPLIVN.a(ILjava/lang/String;IIII)V")
	public void method590(int arg0, String arg1, int arg2, int arg3, int arg4) {
		if (arg1 != null) {
			arg0 -= method588(arg1) / 2;
			arg4 -= field1478;
			for (int var6 = 0; var6 < arg1.length(); var6++) {
				char var7 = arg1.charAt(var6);
				if (var7 != ' ') {
					method596(field1472[var7], field1475[var7] + arg0, field1476[var7] + arg4 + (int) (Math.sin(arg3 / 5.0D + var6 / 2.0D) * 5.0D), field1473[var7], field1474[var7], arg2);
				}

				arg0 += field1477[var7];
			}
		}
	}

	@ObfuscatedName("XZMPLIVN.a(IIZIILjava/lang/String;)V")
	public void method591(int arg0, int arg1, int arg2, int arg3, String arg4) {
		if (arg4 != null) {
			arg1 -= method588(arg4) / 2;
			arg3 -= field1478;
			for (int var6 = 0; var6 < arg4.length(); var6++) {
				char var7 = arg4.charAt(var6);
				if (var7 != ' ') {
					method596(field1472[var7], field1475[var7] + arg1 + (int) (Math.sin(arg0 / 5.0D + var6 / 5.0D) * 5.0D), field1476[var7] + arg3 + (int) (Math.sin(arg0 / 5.0D + var6 / 3.0D) * 5.0D), field1473[var7], field1474[var7], arg2);
				}

				arg1 += field1477[var7];
			}
		}
	}

	@ObfuscatedName("XZMPLIVN.a(IIZIIILjava/lang/String;)V")
	public void method592(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
		if (arg5 != null) {
			double var7 = 7.0D - arg1 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg3 -= method588(arg5) / 2;
			arg2 -= field1478;
			for (int var9 = 0; var9 < arg5.length(); var9++) {
				char var10 = arg5.charAt(var9);
				if (var10 != ' ') {
					method596(field1472[var10], field1475[var10] + arg3, field1476[var10] + arg2 + (int) (Math.sin(var9 / 1.5D + arg4) * var7), field1473[var10], field1474[var10], arg0);
				}

				arg3 += field1477[var10];
			}
		}
	}

	@ObfuscatedName("XZMPLIVN.a(BIIZILjava/lang/String;)V")
	public void method593(int arg0, int arg1, boolean arg2, int arg3, String arg4) {
		field1480 = false;
		int var6 = arg1;
		if (arg4 != null) {
			arg3 -= field1478;
			for (int var7 = 0; var7 < arg4.length(); var7++) {
				if (arg4.charAt(var7) == '@' && var7 + 4 < arg4.length() && arg4.charAt(var7 + 4) == '@') {
					int var8 = method595(arg4.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg0 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg4.charAt(var7);
					if (var9 != ' ') {
						if (arg2) {
							method596(field1472[var9], field1475[var9] + arg1 + 1, field1476[var9] + arg3 + 1, field1473[var9], field1474[var9], 0);
						}

						method596(field1472[var9], field1475[var9] + arg1, field1476[var9] + arg3, field1473[var9], field1474[var9], arg0);
					}

					arg1 += field1477[var9];
				}
			}

			if (field1480) {
				UJSJLLWF.method487(var6, 0x800000, arg1 - var6, (int) (field1478 * 0.7D) + arg3);
			}
		}
	}

	@ObfuscatedName("XZMPLIVN.a(ZIILjava/lang/String;III)V")
	public void method594(boolean arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
		if (arg2 != null) {
			field1479.setSeed(arg4);
			int var7 = (field1479.nextInt() & 0x1F) + 192;
			arg5 -= field1478;
			for (int var8 = 0; var8 < arg2.length(); var8++) {
				if (arg2.charAt(var8) == '@' && var8 + 4 < arg2.length() && arg2.charAt(var8 + 4) == '@') {
					int var9 = method595(arg2.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg3 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg2.charAt(var8);
					if (var10 != ' ') {
						if (arg0) {
							method598(0, field1474[var10], field1476[var10] + arg5 + 1, field1473[var10], field1475[var10] + arg1 + 1, field1472[var10], 192);
						}

						method598(arg3, field1474[var10], field1476[var10] + arg5, field1473[var10], field1475[var10] + arg1, field1472[var10], var7);
					}

					arg1 += field1477[var10];
					if ((field1479.nextInt() & 0x3) == 0) {
						arg1++;
					}
				}
			}
		}
	}

	@ObfuscatedName("XZMPLIVN.a(BLjava/lang/String;)I")
	public int method595(String arg0) {
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
				field1480 = true;
			}

			if (arg0.equals("end")) {
				field1480 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("XZMPLIVN.a([BIIIII)V")
	public void method596(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = UJSJLLWF.field1249 * arg2 + arg1;
		int var8 = UJSJLLWF.field1249 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < UJSJLLWF.field1251) {
			int var11 = UJSJLLWF.field1251 - arg2;
			arg4 -= var11;
			arg2 = UJSJLLWF.field1251;
			var10 += arg3 * var11;
			var7 += UJSJLLWF.field1249 * var11;
		}

		if (arg2 + arg4 >= UJSJLLWF.field1252) {
			arg4 -= arg2 + arg4 + 1 - UJSJLLWF.field1252;
		}

		if (arg1 < UJSJLLWF.field1253) {
			int var12 = UJSJLLWF.field1253 - arg1;
			arg3 -= var12;
			arg1 = UJSJLLWF.field1253;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= UJSJLLWF.field1254) {
			int var13 = arg1 + arg3 + 1 - UJSJLLWF.field1254;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method597(UJSJLLWF.field1248, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("XZMPLIVN.a([I[BIIIIIII)V")
	public void method597(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("XZMPLIVN.a(IIIII[BII)V")
	public void method598(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
		int var8 = UJSJLLWF.field1249 * arg2 + arg4;
		int var9 = UJSJLLWF.field1249 - arg3;
		int var10 = 0;
		int var11 = 0;
		if (arg2 < UJSJLLWF.field1251) {
			int var12 = UJSJLLWF.field1251 - arg2;
			arg1 -= var12;
			arg2 = UJSJLLWF.field1251;
			var11 += arg3 * var12;
			var8 += UJSJLLWF.field1249 * var12;
		}

		if (arg1 + arg2 >= UJSJLLWF.field1252) {
			arg1 -= arg1 + arg2 + 1 - UJSJLLWF.field1252;
		}

		if (arg4 < UJSJLLWF.field1253) {
			int var13 = UJSJLLWF.field1253 - arg4;
			arg3 -= var13;
			arg4 = UJSJLLWF.field1253;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg3 + arg4 >= UJSJLLWF.field1254) {
			int var14 = arg3 + arg4 + 1 - UJSJLLWF.field1254;
			arg3 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg3 > 0 && arg1 > 0) {
			method599(var8, arg1, arg3, arg0, arg6, UJSJLLWF.field1248, arg5, var9, var10, var11);
		}
	}

	@ObfuscatedName("XZMPLIVN.a(IIIIIB[I[BIII)V")
	public void method599(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, byte[] arg6, int arg7, int arg8, int arg9) {
		arg3 = ((arg3 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((arg3 & 0xFF00) * arg4 & 0xFF0000) >> 8;
		arg4 = 256 - arg4;
		for (int var11 = -arg1; var11 < 0; var11++) {
			for (int var12 = -arg2; var12 < 0; var12++) {
				if (arg6[arg9++] == 0) {
					arg0++;
				} else {
					int var13 = arg5[arg0];
					arg5[arg0++] = (((var13 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((var13 & 0xFF00) * arg4 & 0xFF0000) >> 8) + arg3;
				}
			}

			arg0 += arg7;
			arg9 += arg8;
		}
	}
}
