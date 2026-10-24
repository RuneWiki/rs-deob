package deob;

import java.util.Random;

@ObfuscatedName("ZTYSAOXK")
public final class ZTYSAOXK extends GBJWVQAY {

	@ObfuscatedName("ZTYSAOXK.D")
	public byte[][] field1507 = new byte[256][];

	@ObfuscatedName("ZTYSAOXK.E")
	public int[] field1508 = new int[256];

	@ObfuscatedName("ZTYSAOXK.F")
	public int[] field1509 = new int[256];

	@ObfuscatedName("ZTYSAOXK.G")
	public int[] field1510 = new int[256];

	@ObfuscatedName("ZTYSAOXK.H")
	public int[] field1511 = new int[256];

	@ObfuscatedName("ZTYSAOXK.I")
	public int[] field1512 = new int[256];

	@ObfuscatedName("ZTYSAOXK.K")
	public Random field1514 = new Random();

	@ObfuscatedName("ZTYSAOXK.L")
	public boolean field1515 = false;

	@ObfuscatedName("ZTYSAOXK.J")
	public int field1513;

	public ZTYSAOXK(boolean arg0, String arg1, FUZJMGZB arg2) {
		LBBVYYXO var4 = new LBBVYYXO(arg2.method277(arg1 + ".dat", null));
		LBBVYYXO var5 = new LBBVYYXO(arg2.method277("index.dat", null));
		boolean var6 = true;
		var5.field882 = var4.method371() + 4;
		int var7 = var5.method369();
		if (var7 > 0) {
			var5.field882 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field1510[var8] = var5.method369();
			field1511[var8] = var5.method369();
			int var10 = field1508[var8] = var5.method371();
			int var11 = field1509[var8] = var5.method371();
			int var12 = var5.method369();
			int var13 = var10 * var11;
			field1507[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field1507[var8][var14] = var4.method370();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field1507[var8][var10 * var16 + var15] = var4.method370();
					}
				}
			}

			if (var11 > field1513 && var8 < 128) {
				field1513 = var11;
			}

			field1510[var8] = 1;
			field1512[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field1507[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field1512[var8]--;
				field1510[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field1507[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field1512[var8]--;
			}
		}

		if (arg0) {
			field1512[32] = field1512[73];
		} else {
			field1512[32] = field1512[105];
		}
	}

	@ObfuscatedName("ZTYSAOXK.a(IIIILjava/lang/String;)V")
	public void method588(int arg0, int arg1, int arg2, String arg3) {
		method593(arg3, arg0, arg1 - method592(arg3), arg2);
	}

	@ObfuscatedName("ZTYSAOXK.a(IIILjava/lang/String;B)V")
	public void method589(int arg0, int arg1, int arg2, String arg3) {
		method593(arg3, arg2, arg1 - method592(arg3) / 2, arg0);
	}

	@ObfuscatedName("ZTYSAOXK.a(ZLjava/lang/String;BIII)V")
	public void method590(boolean arg0, String arg1, int arg2, int arg3, int arg4) {
		method597(arg2, arg1, arg0, arg4 - method591(arg1) / 2, arg3);
	}

	@ObfuscatedName("ZTYSAOXK.a(Ljava/lang/String;B)I")
	public int method591(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field1512[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("ZTYSAOXK.a(BLjava/lang/String;)I")
	public int method592(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field1512[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("ZTYSAOXK.a(Ljava/lang/String;IIII)V")
	public void method593(String arg0, int arg1, int arg2, int arg3) {
		if (arg0 != null) {
			arg1 -= field1513;
			for (int var5 = 0; var5 < arg0.length(); var5++) {
				char var6 = arg0.charAt(var5);
				if (var6 != ' ') {
					method600(field1507[var6], field1510[var6] + arg2, field1511[var6] + arg1, field1508[var6], field1509[var6], arg3);
				}

				arg2 += field1512[var6];
			}
		}
	}

	@ObfuscatedName("ZTYSAOXK.a(Ljava/lang/String;IIIII)V")
	public void method594(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg1 -= method592(arg0) / 2;
			arg3 -= field1513;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method600(field1507[var7], field1510[var7] + arg1, field1511[var7] + arg3 + (int) (Math.sin(arg2 / 5.0D + var6 / 2.0D) * 5.0D), field1508[var7], field1509[var7], arg4);
				}

				arg1 += field1512[var7];
			}
		}
	}

	@ObfuscatedName("ZTYSAOXK.a(Ljava/lang/String;IIIBI)V")
	public void method595(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg3 -= method592(arg0) / 2;
			arg4 -= field1513;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method600(field1507[var7], field1510[var7] + arg3 + (int) (Math.sin(arg1 / 5.0D + var6 / 5.0D) * 5.0D), field1511[var7] + arg4 + (int) (Math.sin(arg1 / 5.0D + var6 / 3.0D) * 5.0D), field1508[var7], field1509[var7], arg2);
				}

				arg3 += field1512[var7];
			}
		}
	}

	@ObfuscatedName("ZTYSAOXK.a(Ljava/lang/String;IBIIII)V")
	public void method596(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 != null) {
			double var7 = 7.0D - arg2 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg3 -= method592(arg0) / 2;
			arg1 -= field1513;
			for (int var9 = 0; var9 < arg0.length(); var9++) {
				char var10 = arg0.charAt(var9);
				if (var10 != ' ') {
					method600(field1507[var10], field1510[var10] + arg3, field1511[var10] + arg1 + (int) (Math.sin(var9 / 1.5D + arg5) * var7), field1508[var10], field1509[var10], arg4);
				}

				arg3 += field1512[var10];
			}
		}
	}

	@ObfuscatedName("ZTYSAOXK.a(ILjava/lang/String;ZIZI)V")
	public void method597(int arg0, String arg1, boolean arg2, int arg3, int arg4) {
		field1515 = false;
		int var6 = arg3;
		if (arg1 != null) {
			arg4 -= field1513;
			for (int var7 = 0; var7 < arg1.length(); var7++) {
				if (arg1.charAt(var7) == '@' && var7 + 4 < arg1.length() && arg1.charAt(var7 + 4) == '@') {
					int var8 = method599(arg1.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg0 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg1.charAt(var7);
					if (var9 != ' ') {
						if (arg2) {
							method600(field1507[var9], field1510[var9] + arg3 + 1, field1511[var9] + arg4 + 1, field1508[var9], field1509[var9], 0);
						}

						method600(field1507[var9], field1510[var9] + arg3, field1511[var9] + arg4, field1508[var9], field1509[var9], arg0);
					}

					arg3 += field1512[var9];
				}
			}

			if (field1515) {
				GBJWVQAY.method292(arg3 - var6, var6, (int) (field1513 * 0.7D) + arg4, 0x800000);
			}
		}
	}

	@ObfuscatedName("ZTYSAOXK.a(ZLjava/lang/String;IIIII)V")
	public void method598(boolean arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 != null) {
			field1514.setSeed(arg4);
			int var7 = (field1514.nextInt() & 0x1F) + 192;
			arg2 -= field1513;
			for (int var8 = 0; var8 < arg1.length(); var8++) {
				if (arg1.charAt(var8) == '@' && var8 + 4 < arg1.length() && arg1.charAt(var8 + 4) == '@') {
					int var9 = method599(arg1.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg5 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg1.charAt(var8);
					if (var10 != ' ') {
						if (arg0) {
							method602(192, field1511[var10] + arg2 + 1, 0, field1510[var10] + arg3 + 1, field1508[var10], field1509[var10], field1507[var10]);
						}

						method602(var7, field1511[var10] + arg2, arg5, field1510[var10] + arg3, field1508[var10], field1509[var10], field1507[var10]);
					}

					arg3 += field1512[var10];
					if ((field1514.nextInt() & 0x3) == 0) {
						arg3++;
					}
				}
			}
		}
	}

	@ObfuscatedName("ZTYSAOXK.a(ILjava/lang/String;)I")
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
				field1515 = true;
			}

			if (arg0.equals("end")) {
				field1515 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("ZTYSAOXK.a([BIIIII)V")
	public void method600(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = GBJWVQAY.field821 * arg2 + arg1;
		int var8 = GBJWVQAY.field821 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < GBJWVQAY.field823) {
			int var11 = GBJWVQAY.field823 - arg2;
			arg4 -= var11;
			arg2 = GBJWVQAY.field823;
			var10 += arg3 * var11;
			var7 += GBJWVQAY.field821 * var11;
		}

		if (arg2 + arg4 >= GBJWVQAY.field824) {
			arg4 -= arg2 + arg4 + 1 - GBJWVQAY.field824;
		}

		if (arg1 < GBJWVQAY.field825) {
			int var12 = GBJWVQAY.field825 - arg1;
			arg3 -= var12;
			arg1 = GBJWVQAY.field825;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= GBJWVQAY.field826) {
			int var13 = arg1 + arg3 + 1 - GBJWVQAY.field826;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method601(GBJWVQAY.field820, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("ZTYSAOXK.a([I[BIIIIIII)V")
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

	@ObfuscatedName("ZTYSAOXK.a(IIZIIII[B)V")
	public void method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
		int var8 = GBJWVQAY.field821 * arg1 + arg3;
		int var9 = GBJWVQAY.field821 - arg4;
		int var10 = 0;
		int var11 = 0;
		if (arg1 < GBJWVQAY.field823) {
			int var12 = GBJWVQAY.field823 - arg1;
			arg5 -= var12;
			arg1 = GBJWVQAY.field823;
			var11 += arg4 * var12;
			var8 += GBJWVQAY.field821 * var12;
		}

		if (arg1 + arg5 >= GBJWVQAY.field824) {
			arg5 -= arg1 + arg5 + 1 - GBJWVQAY.field824;
		}

		if (arg3 < GBJWVQAY.field825) {
			int var13 = GBJWVQAY.field825 - arg3;
			arg4 -= var13;
			arg3 = GBJWVQAY.field825;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg3 + arg4 >= GBJWVQAY.field826) {
			int var14 = arg3 + arg4 + 1 - GBJWVQAY.field826;
			arg4 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg4 > 0 && arg5 > 0) {
			method603(var8, var11, arg5, arg2, arg0, arg4, var10, GBJWVQAY.field820, var9, arg6);
		}
	}

	@ObfuscatedName("ZTYSAOXK.a(IIIIIIII[II[B)V")
	public void method603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, byte[] arg9) {
		arg3 = ((arg3 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((arg3 & 0xFF00) * arg4 & 0xFF0000) >> 8;
		arg4 = 256 - arg4;
		for (int var11 = -arg2; var11 < 0; var11++) {
			for (int var12 = -arg5; var12 < 0; var12++) {
				if (arg9[arg1++] == 0) {
					arg0++;
				} else {
					int var13 = arg7[arg0];
					arg7[arg0++] = (((var13 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((var13 & 0xFF00) * arg4 & 0xFF0000) >> 8) + arg3;
				}
			}

			arg0 += arg8;
			arg1 += arg6;
		}
	}
}
