package deob;

import java.util.Random;

@ObfuscatedName("ZFUOSNLM")
public final class ZFUOSNLM extends NBXZFIDS {

	@ObfuscatedName("ZFUOSNLM.D")
	public byte[][] field1495 = new byte[256][];

	@ObfuscatedName("ZFUOSNLM.E")
	public int[] field1496 = new int[256];

	@ObfuscatedName("ZFUOSNLM.F")
	public int[] field1497 = new int[256];

	@ObfuscatedName("ZFUOSNLM.G")
	public int[] field1498 = new int[256];

	@ObfuscatedName("ZFUOSNLM.H")
	public int[] field1499 = new int[256];

	@ObfuscatedName("ZFUOSNLM.I")
	public int[] field1500 = new int[256];

	@ObfuscatedName("ZFUOSNLM.K")
	public Random field1502 = new Random();

	@ObfuscatedName("ZFUOSNLM.L")
	public boolean field1503 = false;

	@ObfuscatedName("ZFUOSNLM.J")
	public int field1501;

	public ZFUOSNLM(boolean arg0, XOJZVVDK arg1, String arg2) {
		PQBRPYKE var4 = new PQBRPYKE(arg1.method560(arg2 + ".dat", null));
		PQBRPYKE var5 = new PQBRPYKE(arg1.method560("index.dat", null));
		boolean var6 = true;
		var5.field1091 = var4.method342() + 4;
		int var7 = var5.method340();
		if (var7 > 0) {
			var5.field1091 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field1498[var8] = var5.method340();
			field1499[var8] = var5.method340();
			int var10 = field1496[var8] = var5.method342();
			int var11 = field1497[var8] = var5.method342();
			int var12 = var5.method340();
			int var13 = var10 * var11;
			field1495[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field1495[var8][var14] = var4.method341();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field1495[var8][var10 * var16 + var15] = var4.method341();
					}
				}
			}

			if (var11 > field1501 && var8 < 128) {
				field1501 = var11;
			}

			field1498[var8] = 1;
			field1500[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field1495[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field1500[var8]--;
				field1498[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field1495[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field1500[var8]--;
			}
		}

		if (arg0) {
			field1500[32] = field1500[73];
		} else {
			field1500[32] = field1500[105];
		}
	}

	@ObfuscatedName("ZFUOSNLM.a(IIILjava/lang/String;I)V")
	public void method585(int arg0, int arg1, String arg2, int arg3) {
		method590(arg2, arg3, arg0, arg1 - method589(arg2));
	}

	@ObfuscatedName("ZFUOSNLM.a(Ljava/lang/String;IIII)V")
	public void method586(String arg0, int arg1, int arg2, int arg3) {
		method590(arg0, arg3, arg2, arg1 - method589(arg0) / 2);
	}

	@ObfuscatedName("ZFUOSNLM.a(IIILjava/lang/String;ZI)V")
	public void method587(int arg0, int arg1, int arg2, String arg3, boolean arg4) {
		method594(arg0 - method588(arg3) / 2, arg3, arg2, arg1, arg4);
	}

	@ObfuscatedName("ZFUOSNLM.a(Ljava/lang/String;Z)I")
	public int method588(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field1500[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("ZFUOSNLM.a(ILjava/lang/String;)I")
	public int method589(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field1500[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("ZFUOSNLM.a(Ljava/lang/String;IZII)V")
	public void method590(String arg0, int arg1, int arg2, int arg3) {
		if (arg0 != null) {
			arg1 -= field1501;
			for (int var5 = 0; var5 < arg0.length(); var5++) {
				char var6 = arg0.charAt(var5);
				if (var6 != ' ') {
					method597(field1495[var6], field1498[var6] + arg3, field1499[var6] + arg1, field1496[var6], field1497[var6], arg2);
				}

				arg3 += field1500[var6];
			}
		}
	}

	@ObfuscatedName("ZFUOSNLM.a(Ljava/lang/String;IIIII)V")
	public void method591(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg1 -= method589(arg0) / 2;
			arg4 -= field1501;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method597(field1495[var7], field1498[var7] + arg1, field1499[var7] + arg4 + (int) (Math.sin(arg3 / 5.0D + var6 / 2.0D) * 5.0D), field1496[var7], field1497[var7], arg2);
				}

				arg1 += field1500[var7];
			}
		}
	}

	@ObfuscatedName("ZFUOSNLM.a(IIILjava/lang/String;BI)V")
	public void method592(int arg0, int arg1, int arg2, String arg3, int arg4) {
		if (arg3 != null) {
			arg4 -= method589(arg3) / 2;
			arg1 -= field1501;
			for (int var6 = 0; var6 < arg3.length(); var6++) {
				char var7 = arg3.charAt(var6);
				if (var7 != ' ') {
					method597(field1495[var7], field1498[var7] + arg4 + (int) (Math.sin(arg2 / 5.0D + var6 / 5.0D) * 5.0D), field1499[var7] + arg1 + (int) (Math.sin(arg2 / 5.0D + var6 / 3.0D) * 5.0D), field1496[var7], field1497[var7], arg0);
				}

				arg4 += field1500[var7];
			}
		}
	}

	@ObfuscatedName("ZFUOSNLM.a(IIILjava/lang/String;III)V")
	public void method593(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
		if (arg2 != null) {
			double var7 = 7.0D - arg3 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg4 -= method589(arg2) / 2;
			arg0 -= field1501;
			for (int var9 = 0; var9 < arg2.length(); var9++) {
				char var10 = arg2.charAt(var9);
				if (var10 != ' ') {
					method597(field1495[var10], field1498[var10] + arg4, field1499[var10] + arg0 + (int) (Math.sin(var9 / 1.5D + arg1) * var7), field1496[var10], field1497[var10], arg5);
				}

				arg4 += field1500[var10];
			}
		}
	}

	@ObfuscatedName("ZFUOSNLM.a(ILjava/lang/String;IIIZ)V")
	public void method594(int arg0, String arg1, int arg2, int arg3, boolean arg4) {
		field1503 = false;
		int var6 = arg0;
		if (arg1 != null) {
			arg2 -= field1501;
			for (int var7 = 0; var7 < arg1.length(); var7++) {
				if (arg1.charAt(var7) == '@' && var7 + 4 < arg1.length() && arg1.charAt(var7 + 4) == '@') {
					int var8 = method596(arg1.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg3 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg1.charAt(var7);
					if (var9 != ' ') {
						if (arg4) {
							method597(field1495[var9], field1498[var9] + arg0 + 1, field1499[var9] + arg2 + 1, field1496[var9], field1497[var9], 0);
						}

						method597(field1495[var9], field1498[var9] + arg0, field1499[var9] + arg2, field1496[var9], field1497[var9], arg3);
					}

					arg0 += field1500[var9];
				}
			}

			if (field1503) {
				NBXZFIDS.method294(var6, (int) (field1501 * 0.7D) + arg2, arg0 - var6, 0x800000);
			}
		}
	}

	@ObfuscatedName("ZFUOSNLM.a(IZZLjava/lang/String;III)V")
	public void method595(int arg0, boolean arg1, String arg2, int arg3, int arg4, int arg5) {
		if (arg2 != null) {
			field1502.setSeed(arg3);
			int var7 = (field1502.nextInt() & 0x1F) + 192;
			arg5 -= field1501;
			for (int var8 = 0; var8 < arg2.length(); var8++) {
				if (arg2.charAt(var8) == '@' && var8 + 4 < arg2.length() && arg2.charAt(var8 + 4) == '@') {
					int var9 = method596(arg2.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg0 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg2.charAt(var8);
					if (var10 != ' ') {
						if (arg1) {
							method599(192, field1499[var10] + arg5 + 1, 0, field1497[var10], field1498[var10] + arg4 + 1, field1495[var10], field1496[var10]);
						}

						method599(var7, field1499[var10] + arg5, arg0, field1497[var10], field1498[var10] + arg4, field1495[var10], field1496[var10]);
					}

					arg4 += field1500[var10];
					if ((field1502.nextInt() & 0x3) == 0) {
						arg4++;
					}
				}
			}
		}
	}

	@ObfuscatedName("ZFUOSNLM.b(ILjava/lang/String;)I")
	public int method596(String arg0) {
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
				field1503 = true;
			}

			if (arg0.equals("end")) {
				field1503 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("ZFUOSNLM.a([BIIIII)V")
	public void method597(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = NBXZFIDS.field1027 * arg2 + arg1;
		int var8 = NBXZFIDS.field1027 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < NBXZFIDS.field1029) {
			int var11 = NBXZFIDS.field1029 - arg2;
			arg4 -= var11;
			arg2 = NBXZFIDS.field1029;
			var10 += arg3 * var11;
			var7 += NBXZFIDS.field1027 * var11;
		}

		if (arg2 + arg4 >= NBXZFIDS.field1030) {
			arg4 -= arg2 + arg4 + 1 - NBXZFIDS.field1030;
		}

		if (arg1 < NBXZFIDS.field1031) {
			int var12 = NBXZFIDS.field1031 - arg1;
			arg3 -= var12;
			arg1 = NBXZFIDS.field1031;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= NBXZFIDS.field1032) {
			int var13 = arg1 + arg3 + 1 - NBXZFIDS.field1032;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method598(NBXZFIDS.field1026, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("ZFUOSNLM.a([I[BIIIIIII)V")
	public void method598(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("ZFUOSNLM.a(IIIII[BII)V")
	public void method599(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
		int var8 = NBXZFIDS.field1027 * arg1 + arg4;
		int var9 = NBXZFIDS.field1027 - arg6;
		int var10 = 0;
		int var11 = 0;
		if (arg1 < NBXZFIDS.field1029) {
			int var12 = NBXZFIDS.field1029 - arg1;
			arg3 -= var12;
			arg1 = NBXZFIDS.field1029;
			var11 += arg6 * var12;
			var8 += NBXZFIDS.field1027 * var12;
		}

		if (arg1 + arg3 >= NBXZFIDS.field1030) {
			arg3 -= arg1 + arg3 + 1 - NBXZFIDS.field1030;
		}

		if (arg4 < NBXZFIDS.field1031) {
			int var13 = NBXZFIDS.field1031 - arg4;
			arg6 -= var13;
			arg4 = NBXZFIDS.field1031;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg4 + arg6 >= NBXZFIDS.field1032) {
			int var14 = arg4 + arg6 + 1 - NBXZFIDS.field1032;
			arg6 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg6 > 0 && arg3 > 0) {
			method600(arg0, arg6, NBXZFIDS.field1026, arg3, var11, var8, arg2, var9, arg5, var10);
		}
	}

	@ObfuscatedName("ZFUOSNLM.a(II[IIIIIII[BI)V")
	public void method600(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9) {
		arg6 = ((arg6 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg6 & 0xFF00) * arg0 & 0xFF0000) >> 8;
		arg0 = 256 - arg0;
		for (int var11 = -arg3; var11 < 0; var11++) {
			for (int var12 = -arg1; var12 < 0; var12++) {
				if (arg8[arg4++] == 0) {
					arg5++;
				} else {
					int var13 = arg2[arg5];
					arg2[arg5++] = (((var13 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((var13 & 0xFF00) * arg0 & 0xFF0000) >> 8) + arg6;
				}
			}

			arg5 += arg7;
			arg4 += arg9;
		}
	}
}
