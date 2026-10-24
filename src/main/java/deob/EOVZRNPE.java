package deob;

import java.util.Random;

@ObfuscatedName("EOVZRNPE")
public final class EOVZRNPE extends VDGJUQAS {

	@ObfuscatedName("EOVZRNPE.C")
	public byte[][] field577 = new byte[256][];

	@ObfuscatedName("EOVZRNPE.D")
	public int[] field578 = new int[256];

	@ObfuscatedName("EOVZRNPE.E")
	public int[] field579 = new int[256];

	@ObfuscatedName("EOVZRNPE.F")
	public int[] field580 = new int[256];

	@ObfuscatedName("EOVZRNPE.G")
	public int[] field581 = new int[256];

	@ObfuscatedName("EOVZRNPE.H")
	public int[] field582 = new int[256];

	@ObfuscatedName("EOVZRNPE.J")
	public Random field584 = new Random();

	@ObfuscatedName("EOVZRNPE.K")
	public boolean field585 = false;

	@ObfuscatedName("EOVZRNPE.I")
	public int field583;

	public EOVZRNPE(String arg0, boolean arg1, FNOQZAYQ arg2) {
		DNRIFKTO var4 = new DNRIFKTO(arg2.method246(arg0 + ".dat", null));
		DNRIFKTO var5 = new DNRIFKTO(arg2.method246("index.dat", null));
		boolean var6 = true;
		var5.field563 = var4.method191() + 4;
		int var7 = var5.method189();
		if (var7 > 0) {
			var5.field563 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field580[var8] = var5.method189();
			field581[var8] = var5.method189();
			int var10 = field578[var8] = var5.method191();
			int var11 = field579[var8] = var5.method191();
			int var12 = var5.method189();
			int var13 = var10 * var11;
			field577[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field577[var8][var14] = var4.method190();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field577[var8][var10 * var16 + var15] = var4.method190();
					}
				}
			}

			if (var11 > field583 && var8 < 128) {
				field583 = var11;
			}

			field580[var8] = 1;
			field582[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field577[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field582[var8]--;
				field580[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field577[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field582[var8]--;
			}
		}

		if (arg1) {
			field582[32] = field582[73];
		} else {
			field582[32] = field582[105];
		}
	}

	@ObfuscatedName("EOVZRNPE.a(IIILjava/lang/String;I)V")
	public void method229(int arg0, int arg1, String arg2, int arg3) {
		method234(arg3 - method233(arg2), arg2, arg0, arg1);
	}

	@ObfuscatedName("EOVZRNPE.a(IILjava/lang/String;BI)V")
	public void method230(int arg0, int arg1, String arg2, int arg3) {
		method234(arg1 - method233(arg2) / 2, arg2, arg0, arg3);
	}

	@ObfuscatedName("EOVZRNPE.a(ILjava/lang/String;ZIII)V")
	public void method231(String arg0, boolean arg1, int arg2, int arg3, int arg4) {
		method238(arg4 - method232(arg0) / 2, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("EOVZRNPE.a(Ljava/lang/String;I)I")
	public int method232(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field582[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("EOVZRNPE.a(ILjava/lang/String;)I")
	public int method233(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field582[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("EOVZRNPE.a(ILjava/lang/String;III)V")
	public void method234(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 != null) {
			arg3 -= field583;
			for (int var5 = 0; var5 < arg1.length(); var5++) {
				char var6 = arg1.charAt(var5);
				if (var6 != ' ') {
					method241(field577[var6], field580[var6] + arg0, field581[var6] + arg3, field578[var6], field579[var6], arg2);
				}

				arg0 += field582[var6];
			}
		}
	}

	@ObfuscatedName("EOVZRNPE.a(ILjava/lang/String;IIII)V")
	public void method235(int arg0, String arg1, int arg2, int arg3, int arg4) {
		if (arg1 != null) {
			arg3 -= method233(arg1) / 2;
			arg2 -= field583;
			for (int var6 = 0; var6 < arg1.length(); var6++) {
				char var7 = arg1.charAt(var6);
				if (var7 != ' ') {
					method241(field577[var7], field580[var7] + arg3, field581[var7] + arg2 + (int) (Math.sin(arg4 / 5.0D + var6 / 2.0D) * 5.0D), field578[var7], field579[var7], arg0);
				}

				arg3 += field582[var7];
			}
		}
	}

	@ObfuscatedName("EOVZRNPE.a(IBLjava/lang/String;III)V")
	public void method236(int arg0, String arg1, int arg2, int arg3, int arg4) {
		if (arg1 != null) {
			arg2 -= method233(arg1) / 2;
			arg0 -= field583;
			for (int var6 = 0; var6 < arg1.length(); var6++) {
				char var7 = arg1.charAt(var6);
				if (var7 != ' ') {
					method241(field577[var7], field580[var7] + arg2 + (int) (Math.sin(arg3 / 5.0D + var6 / 5.0D) * 5.0D), field581[var7] + arg0 + (int) (Math.sin(arg3 / 5.0D + var6 / 3.0D) * 5.0D), field578[var7], field579[var7], arg4);
				}

				arg2 += field582[var7];
			}
		}
	}

	@ObfuscatedName("EOVZRNPE.a(IIIIILjava/lang/String;I)V")
	public void method237(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
		if (arg4 != null) {
			double var7 = 7.0D - arg3 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg1 -= method233(arg4) / 2;
			arg0 -= field583;
			for (int var9 = 0; var9 < arg4.length(); var9++) {
				char var10 = arg4.charAt(var9);
				if (var10 != ' ') {
					method241(field577[var10], field580[var10] + arg1, field581[var10] + arg0 + (int) (Math.sin(var9 / 1.5D + arg5) * var7), field578[var10], field579[var10], arg2);
				}

				arg1 += field582[var10];
			}
		}
	}

	@ObfuscatedName("EOVZRNPE.a(IILjava/lang/String;ZII)V")
	public void method238(int arg0, String arg1, boolean arg2, int arg3, int arg4) {
		field585 = false;
		int var6 = arg0;
		if (arg1 != null) {
			arg3 -= field583;
			for (int var7 = 0; var7 < arg1.length(); var7++) {
				if (arg1.charAt(var7) == '@' && var7 + 4 < arg1.length() && arg1.charAt(var7 + 4) == '@') {
					int var8 = method240(arg1.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg4 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg1.charAt(var7);
					if (var9 != ' ') {
						if (arg2) {
							method241(field577[var9], field580[var9] + arg0 + 1, field581[var9] + arg3 + 1, field578[var9], field579[var9], 0);
						}

						method241(field577[var9], field580[var9] + arg0, field581[var9] + arg3, field578[var9], field579[var9], arg4);
					}

					arg0 += field582[var9];
				}
			}

			if (field585) {
				VDGJUQAS.method520((int) (field583 * 0.7D) + arg3, arg0 - var6, var6, 0x800000);
			}
		}
	}

	@ObfuscatedName("EOVZRNPE.a(ILjava/lang/String;ZZIII)V")
	public void method239(int arg0, String arg1, boolean arg2, int arg3, int arg4, int arg5) {
		if (arg1 != null) {
			field584.setSeed(arg4);
			int var7 = (field584.nextInt() & 0x1F) + 192;
			arg3 -= field583;
			for (int var8 = 0; var8 < arg1.length(); var8++) {
				if (arg1.charAt(var8) == '@' && var8 + 4 < arg1.length() && arg1.charAt(var8 + 4) == '@') {
					int var9 = method240(arg1.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg5 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg1.charAt(var8);
					if (var10 != ' ') {
						if (arg2) {
							method243(field580[var10] + arg0 + 1, 0, 192, field581[var10] + arg3 + 1, field577[var10], field579[var10], field578[var10]);
						}

						method243(field580[var10] + arg0, arg5, var7, field581[var10] + arg3, field577[var10], field579[var10], field578[var10]);
					}

					arg0 += field582[var10];
					if ((field584.nextInt() & 0x3) == 0) {
						arg0++;
					}
				}
			}
		}
	}

	@ObfuscatedName("EOVZRNPE.b(Ljava/lang/String;I)I")
	public int method240(String arg0) {
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
				field585 = true;
			}

			if (arg0.equals("end")) {
				field585 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("EOVZRNPE.a([BIIIII)V")
	public void method241(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = VDGJUQAS.field1312 * arg2 + arg1;
		int var8 = VDGJUQAS.field1312 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < VDGJUQAS.field1314) {
			int var11 = VDGJUQAS.field1314 - arg2;
			arg4 -= var11;
			arg2 = VDGJUQAS.field1314;
			var10 += arg3 * var11;
			var7 += VDGJUQAS.field1312 * var11;
		}

		if (arg2 + arg4 >= VDGJUQAS.field1315) {
			arg4 -= arg2 + arg4 + 1 - VDGJUQAS.field1315;
		}

		if (arg1 < VDGJUQAS.field1316) {
			int var12 = VDGJUQAS.field1316 - arg1;
			arg3 -= var12;
			arg1 = VDGJUQAS.field1316;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= VDGJUQAS.field1317) {
			int var13 = arg1 + arg3 + 1 - VDGJUQAS.field1317;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method242(VDGJUQAS.field1311, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("EOVZRNPE.a([I[BIIIIIII)V")
	public void method242(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("EOVZRNPE.a(IIIII[BII)V")
	public void method243(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
		int var8 = VDGJUQAS.field1312 * arg3 + arg0;
		int var9 = VDGJUQAS.field1312 - arg6;
		int var10 = 0;
		int var11 = 0;
		if (arg3 < VDGJUQAS.field1314) {
			int var12 = VDGJUQAS.field1314 - arg3;
			arg5 -= var12;
			arg3 = VDGJUQAS.field1314;
			var11 += arg6 * var12;
			var8 += VDGJUQAS.field1312 * var12;
		}

		if (arg3 + arg5 >= VDGJUQAS.field1315) {
			arg5 -= arg3 + arg5 + 1 - VDGJUQAS.field1315;
		}

		if (arg0 < VDGJUQAS.field1316) {
			int var13 = VDGJUQAS.field1316 - arg0;
			arg6 -= var13;
			arg0 = VDGJUQAS.field1316;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg0 + arg6 >= VDGJUQAS.field1317) {
			int var14 = arg0 + arg6 + 1 - VDGJUQAS.field1317;
			arg6 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg6 > 0 && arg5 > 0) {
			method244(arg1, var9, arg2, arg6, arg5, var10, arg4, var8, VDGJUQAS.field1311, var11);
		}
	}

	@ObfuscatedName("EOVZRNPE.a(IIIIII[BII[II)V")
	public void method244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int[] arg8, int arg9) {
		arg0 = ((arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		arg2 = 256 - arg2;
		for (int var11 = -arg4; var11 < 0; var11++) {
			for (int var12 = -arg3; var12 < 0; var12++) {
				if (arg6[arg9++] == 0) {
					arg7++;
				} else {
					int var13 = arg8[arg7];
					arg8[arg7++] = (((var13 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((var13 & 0xFF00) * arg2 & 0xFF0000) >> 8) + arg0;
				}
			}

			arg7 += arg1;
			arg9 += arg5;
		}
	}
}
