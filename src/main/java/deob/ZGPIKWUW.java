package deob;

import java.util.Random;

@ObfuscatedName("ZGPIKWUW")
public final class ZGPIKWUW extends MVOWZCMY {

	@ObfuscatedName("ZGPIKWUW.y")
	public byte[][] field1502 = new byte[256][];

	@ObfuscatedName("ZGPIKWUW.z")
	public int[] field1503 = new int[256];

	@ObfuscatedName("ZGPIKWUW.A")
	public int[] field1504 = new int[256];

	@ObfuscatedName("ZGPIKWUW.B")
	public int[] field1505 = new int[256];

	@ObfuscatedName("ZGPIKWUW.C")
	public int[] field1506 = new int[256];

	@ObfuscatedName("ZGPIKWUW.D")
	public int[] field1507 = new int[256];

	@ObfuscatedName("ZGPIKWUW.F")
	public Random field1509 = new Random();

	@ObfuscatedName("ZGPIKWUW.G")
	public boolean field1510 = false;

	@ObfuscatedName("ZGPIKWUW.E")
	public int field1508;

	public ZGPIKWUW(SXKKBWPU arg0, String arg1, boolean arg2) {
		TQYMAXSO var4 = new TQYMAXSO(arg0.method442(arg1 + ".dat", null));
		TQYMAXSO var5 = new TQYMAXSO(arg0.method442("index.dat", null));
		boolean var6 = true;
		var5.field1263 = var4.method470() + 4;
		int var7 = var5.method468();
		if (var7 > 0) {
			var5.field1263 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field1505[var8] = var5.method468();
			field1506[var8] = var5.method468();
			int var10 = field1503[var8] = var5.method470();
			int var11 = field1504[var8] = var5.method470();
			int var12 = var5.method468();
			int var13 = var10 * var11;
			field1502[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field1502[var8][var14] = var4.method469();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field1502[var8][var10 * var16 + var15] = var4.method469();
					}
				}
			}

			if (var11 > field1508 && var8 < 128) {
				field1508 = var11;
			}

			field1505[var8] = 1;
			field1507[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field1502[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field1507[var8]--;
				field1505[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field1502[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field1507[var8]--;
			}
		}

		if (arg2) {
			field1507[32] = field1507[73];
		} else {
			field1507[32] = field1507[105];
		}
	}

	@ObfuscatedName("ZGPIKWUW.a(ILjava/lang/String;IIZ)V")
	public void method589(int arg0, String arg1, int arg2, int arg3) {
		method594(arg0, arg3, arg1, arg2 - method593(arg1));
	}

	@ObfuscatedName("ZGPIKWUW.a(IIILjava/lang/String;I)V")
	public void method590(int arg0, int arg1, String arg2, int arg3) {
		method594(arg3, arg0, arg2, arg1 - method593(arg2) / 2);
	}

	@ObfuscatedName("ZGPIKWUW.a(IIZILjava/lang/String;I)V")
	public void method591(int arg0, int arg1, boolean arg2, String arg3, int arg4) {
		method598(arg4, arg1 - method592(arg3) / 2, arg2, arg0, arg3);
	}

	@ObfuscatedName("ZGPIKWUW.a(ILjava/lang/String;)I")
	public int method592(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field1507[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("ZGPIKWUW.a(Ljava/lang/String;I)I")
	public int method593(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field1507[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("ZGPIKWUW.a(IILjava/lang/String;II)V")
	public void method594(int arg0, int arg1, String arg2, int arg3) {
		if (arg2 != null) {
			arg0 -= field1508;
			for (int var5 = 0; var5 < arg2.length(); var5++) {
				char var6 = arg2.charAt(var5);
				if (var6 != ' ') {
					method601(field1502[var6], field1505[var6] + arg3, field1506[var6] + arg0, field1503[var6], field1504[var6], arg1);
				}

				arg3 += field1507[var6];
			}
		}
	}

	@ObfuscatedName("ZGPIKWUW.a(IIILjava/lang/String;II)V")
	public void method595(int arg0, int arg1, int arg2, String arg3, int arg4) {
		if (arg3 != null) {
			arg1 -= method593(arg3) / 2;
			arg0 -= field1508;
			for (int var6 = 0; var6 < arg3.length(); var6++) {
				char var7 = arg3.charAt(var6);
				if (var7 != ' ') {
					method601(field1502[var7], field1505[var7] + arg1, field1506[var7] + arg0 + (int) (Math.sin(arg4 / 5.0D + var6 / 2.0D) * 5.0D), field1503[var7], field1504[var7], arg2);
				}

				arg1 += field1507[var7];
			}
		}
	}

	@ObfuscatedName("ZGPIKWUW.a(IIILjava/lang/String;IZ)V")
	public void method596(int arg0, int arg1, int arg2, String arg3, int arg4) {
		if (arg3 != null) {
			arg1 -= method593(arg3) / 2;
			arg2 -= field1508;
			for (int var6 = 0; var6 < arg3.length(); var6++) {
				char var7 = arg3.charAt(var6);
				if (var7 != ' ') {
					method601(field1502[var7], field1505[var7] + arg1 + (int) (Math.sin(arg0 / 5.0D + var6 / 5.0D) * 5.0D), field1506[var7] + arg2 + (int) (Math.sin(arg0 / 5.0D + var6 / 3.0D) * 5.0D), field1503[var7], field1504[var7], arg4);
				}

				arg1 += field1507[var7];
			}
		}
	}

	@ObfuscatedName("ZGPIKWUW.a(ILjava/lang/String;IIIII)V")
	public void method597(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 != null) {
			double var7 = 7.0D - arg3 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg5 -= method593(arg0) / 2;
			arg1 -= field1508;
			for (int var9 = 0; var9 < arg0.length(); var9++) {
				char var10 = arg0.charAt(var9);
				if (var10 != ' ') {
					method601(field1502[var10], field1505[var10] + arg5, field1506[var10] + arg1 + (int) (Math.sin(var9 / 1.5D + arg2) * var7), field1503[var10], field1504[var10], arg4);
				}

				arg5 += field1507[var10];
			}
		}
	}

	@ObfuscatedName("ZGPIKWUW.a(IIIZILjava/lang/String;)V")
	public void method598(int arg0, int arg1, boolean arg2, int arg3, String arg4) {
		field1510 = false;
		int var6 = arg1;
		if (arg4 != null) {
			arg3 -= field1508;
			for (int var7 = 0; var7 < arg4.length(); var7++) {
				if (arg4.charAt(var7) == '@' && var7 + 4 < arg4.length() && arg4.charAt(var7 + 4) == '@') {
					int var8 = method600(arg4.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg0 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg4.charAt(var7);
					if (var9 != ' ') {
						if (arg2) {
							method601(field1502[var9], field1505[var9] + arg1 + 1, field1506[var9] + arg3 + 1, field1503[var9], field1504[var9], 0);
						}

						method601(field1502[var9], field1505[var9] + arg1, field1506[var9] + arg3, field1503[var9], field1504[var9], arg0);
					}

					arg1 += field1507[var9];
				}
			}

			if (field1510) {
				MVOWZCMY.method348(0x800000, (int) (field1508 * 0.7D) + arg3, var6, arg1 - var6);
			}
		}
	}

	@ObfuscatedName("ZGPIKWUW.a(ILjava/lang/String;BIZII)V")
	public void method599(int arg0, String arg1, int arg2, boolean arg3, int arg4, int arg5) {
		if (arg1 != null) {
			field1509.setSeed(arg0);
			int var7 = (field1509.nextInt() & 0x1F) + 192;
			arg4 -= field1508;
			for (int var8 = 0; var8 < arg1.length(); var8++) {
				if (arg1.charAt(var8) == '@' && var8 + 4 < arg1.length() && arg1.charAt(var8 + 4) == '@') {
					int var9 = method600(arg1.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg5 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg1.charAt(var8);
					if (var10 != ' ') {
						if (arg3) {
							method603(field1506[var10] + arg4 + 1, 192, field1505[var10] + arg2 + 1, field1502[var10], field1503[var10], field1504[var10], 0);
						}

						method603(field1506[var10] + arg4, var7, field1505[var10] + arg2, field1502[var10], field1503[var10], field1504[var10], arg5);
					}

					arg2 += field1507[var10];
					if ((field1509.nextInt() & 0x3) == 0) {
						arg2++;
					}
				}
			}
		}
	}

	@ObfuscatedName("ZGPIKWUW.a(Ljava/lang/String;B)I")
	public int method600(String arg0) {
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
				field1510 = true;
			}

			if (arg0.equals("end")) {
				field1510 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("ZGPIKWUW.a([BIIIII)V")
	public void method601(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = MVOWZCMY.field978 * arg2 + arg1;
		int var8 = MVOWZCMY.field978 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < MVOWZCMY.field980) {
			int var11 = MVOWZCMY.field980 - arg2;
			arg4 -= var11;
			arg2 = MVOWZCMY.field980;
			var10 += arg3 * var11;
			var7 += MVOWZCMY.field978 * var11;
		}

		if (arg2 + arg4 >= MVOWZCMY.field981) {
			arg4 -= arg2 + arg4 + 1 - MVOWZCMY.field981;
		}

		if (arg1 < MVOWZCMY.field982) {
			int var12 = MVOWZCMY.field982 - arg1;
			arg3 -= var12;
			arg1 = MVOWZCMY.field982;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= MVOWZCMY.field983) {
			int var13 = arg1 + arg3 + 1 - MVOWZCMY.field983;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method602(MVOWZCMY.field977, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("ZGPIKWUW.a([I[BIIIIIII)V")
	public void method602(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("ZGPIKWUW.a(BIII[BIII)V")
	public void method603(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
		int var8 = MVOWZCMY.field978 * arg0 + arg2;
		int var9 = MVOWZCMY.field978 - arg4;
		int var10 = 0;
		int var11 = 0;
		if (arg0 < MVOWZCMY.field980) {
			int var12 = MVOWZCMY.field980 - arg0;
			arg5 -= var12;
			arg0 = MVOWZCMY.field980;
			var11 += arg4 * var12;
			var8 += MVOWZCMY.field978 * var12;
		}

		if (arg0 + arg5 >= MVOWZCMY.field981) {
			arg5 -= arg0 + arg5 + 1 - MVOWZCMY.field981;
		}

		if (arg2 < MVOWZCMY.field982) {
			int var13 = MVOWZCMY.field982 - arg2;
			arg4 -= var13;
			arg2 = MVOWZCMY.field982;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg2 + arg4 >= MVOWZCMY.field983) {
			int var14 = arg2 + arg4 + 1 - MVOWZCMY.field983;
			arg4 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg4 > 0 && arg5 > 0) {
			method604(arg5, arg6, arg3, var8, var10, arg4, var11, MVOWZCMY.field977, var9, arg1);
		}
	}

	@ObfuscatedName("ZGPIKWUW.a(II[BBIIII[III)V")
	public void method604(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
		arg1 = ((arg1 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg9 & 0xFF0000) >> 8;
		arg9 = 256 - arg9;
		for (int var11 = -arg0; var11 < 0; var11++) {
			for (int var12 = -arg5; var12 < 0; var12++) {
				if (arg2[arg6++] == 0) {
					arg3++;
				} else {
					int var13 = arg7[arg3];
					arg7[arg3++] = (((var13 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((var13 & 0xFF00) * arg9 & 0xFF0000) >> 8) + arg1;
				}
			}

			arg3 += arg8;
			arg6 += arg4;
		}
	}
}
