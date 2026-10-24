package deob;

import java.util.Random;

@ObfuscatedName("CWXRTTYV")
public final class CWXRTTYV extends BAXODNVH {

	@ObfuscatedName("CWXRTTYV.G")
	public byte[][] field552 = new byte[256][];

	@ObfuscatedName("CWXRTTYV.H")
	public int[] field553 = new int[256];

	@ObfuscatedName("CWXRTTYV.I")
	public int[] field554 = new int[256];

	@ObfuscatedName("CWXRTTYV.J")
	public int[] field555 = new int[256];

	@ObfuscatedName("CWXRTTYV.K")
	public int[] field556 = new int[256];

	@ObfuscatedName("CWXRTTYV.L")
	public int[] field557 = new int[256];

	@ObfuscatedName("CWXRTTYV.N")
	public Random field559 = new Random();

	@ObfuscatedName("CWXRTTYV.O")
	public boolean field560 = false;

	@ObfuscatedName("CWXRTTYV.M")
	public int field558;

	public CWXRTTYV(boolean arg0, String arg1, UUIGNTAD arg2) {
		CMGGUSPR var4 = new CMGGUSPR(arg2.method545(arg1 + ".dat", null));
		CMGGUSPR var5 = new CMGGUSPR(arg2.method545("index.dat", null));
		boolean var6 = true;
		var5.field540 = var4.method196() + 4;
		int var7 = var5.method194();
		if (var7 > 0) {
			var5.field540 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field555[var8] = var5.method194();
			field556[var8] = var5.method194();
			int var10 = field553[var8] = var5.method196();
			int var11 = field554[var8] = var5.method196();
			int var12 = var5.method194();
			int var13 = var10 * var11;
			field552[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field552[var8][var14] = var4.method195();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field552[var8][var10 * var16 + var15] = var4.method195();
					}
				}
			}

			if (var11 > field558 && var8 < 128) {
				field558 = var11;
			}

			field555[var8] = 1;
			field557[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field552[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field557[var8]--;
				field555[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field552[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field557[var8]--;
			}
		}

		if (arg0) {
			field557[32] = field557[73];
		} else {
			field557[32] = field557[105];
		}
	}

	@ObfuscatedName("CWXRTTYV.a(IIIBLjava/lang/String;)V")
	public void method231(int arg0, int arg1, int arg2, String arg3) {
		method236(arg2 - method235(arg3), arg0, arg3, arg1);
	}

	@ObfuscatedName("CWXRTTYV.a(IIZILjava/lang/String;)V")
	public void method232(int arg0, int arg1, int arg2, String arg3) {
		method236(arg1 - method235(arg3) / 2, arg0, arg3, arg2);
	}

	@ObfuscatedName("CWXRTTYV.a(IIZILjava/lang/String;Z)V")
	public void method233(int arg0, int arg1, boolean arg2, int arg3, String arg4) {
		method240(arg3 - method234(arg4) / 2, arg0, arg2, arg4, arg1);
	}

	@ObfuscatedName("CWXRTTYV.a(Ljava/lang/String;B)I")
	public int method234(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field557[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("CWXRTTYV.a(BLjava/lang/String;)I")
	public int method235(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field557[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("CWXRTTYV.a(IZILjava/lang/String;I)V")
	public void method236(int arg0, int arg1, String arg2, int arg3) {
		if (arg2 != null) {
			arg3 -= field558;
			for (int var5 = 0; var5 < arg2.length(); var5++) {
				char var6 = arg2.charAt(var5);
				if (var6 != ' ') {
					method243(field552[var6], field555[var6] + arg0, field556[var6] + arg3, field553[var6], field554[var6], arg1);
				}

				arg0 += field557[var6];
			}
		}
	}

	@ObfuscatedName("CWXRTTYV.a(IIIILjava/lang/String;I)V")
	public void method237(int arg0, int arg1, int arg2, String arg3, int arg4) {
		if (arg3 != null) {
			arg0 -= method235(arg3) / 2;
			arg4 -= field558;
			for (int var6 = 0; var6 < arg3.length(); var6++) {
				char var7 = arg3.charAt(var6);
				if (var7 != ' ') {
					method243(field552[var7], field555[var7] + arg0, field556[var7] + arg4 + (int) (Math.sin(arg1 / 5.0D + var6 / 2.0D) * 5.0D), field553[var7], field554[var7], arg2);
				}

				arg0 += field557[var7];
			}
		}
	}

	@ObfuscatedName("CWXRTTYV.a(IIIIILjava/lang/String;)V")
	public void method238(int arg0, int arg1, int arg2, int arg3, String arg4) {
		if (arg4 != null) {
			arg1 -= method235(arg4) / 2;
			arg3 -= field558;
			for (int var6 = 0; var6 < arg4.length(); var6++) {
				char var7 = arg4.charAt(var6);
				if (var7 != ' ') {
					method243(field552[var7], field555[var7] + arg1 + (int) (Math.sin(arg0 / 5.0D + var6 / 5.0D) * 5.0D), field556[var7] + arg3 + (int) (Math.sin(arg0 / 5.0D + var6 / 3.0D) * 5.0D), field553[var7], field554[var7], arg2);
				}

				arg1 += field557[var7];
			}
		}
	}

	@ObfuscatedName("CWXRTTYV.a(IIIIIILjava/lang/String;)V")
	public void method239(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
		if (arg5 != null) {
			double var7 = 7.0D - arg4 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg1 -= method235(arg5) / 2;
			arg2 -= field558;
			for (int var9 = 0; var9 < arg5.length(); var9++) {
				char var10 = arg5.charAt(var9);
				if (var10 != ' ') {
					method243(field552[var10], field555[var10] + arg1, field556[var10] + arg2 + (int) (Math.sin(var9 / 1.5D + arg3) * var7), field553[var10], field554[var10], arg0);
				}

				arg1 += field557[var10];
			}
		}
	}

	@ObfuscatedName("CWXRTTYV.a(IIIZLjava/lang/String;I)V")
	public void method240(int arg0, int arg1, boolean arg2, String arg3, int arg4) {
		field560 = false;
		int var6 = arg0;
		if (arg3 != null) {
			arg1 -= field558;
			for (int var7 = 0; var7 < arg3.length(); var7++) {
				if (arg3.charAt(var7) == '@' && var7 + 4 < arg3.length() && arg3.charAt(var7 + 4) == '@') {
					int var8 = method242(arg3.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg4 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg3.charAt(var7);
					if (var9 != ' ') {
						if (arg2) {
							method243(field552[var9], field555[var9] + arg0 + 1, field556[var9] + arg1 + 1, field553[var9], field554[var9], 0);
						}

						method243(field552[var9], field555[var9] + arg0, field556[var9] + arg1, field553[var9], field554[var9], arg4);
					}

					arg0 += field557[var9];
				}
			}

			if (field560) {
				BAXODNVH.method25(arg0 - var6, var6, 0x800000, (int) (field558 * 0.7D) + arg1);
			}
		}
	}

	@ObfuscatedName("CWXRTTYV.a(ILjava/lang/String;IIIIZ)V")
	public void method241(int arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (arg1 != null) {
			field559.setSeed(arg2);
			int var7 = (field559.nextInt() & 0x1F) + 192;
			arg0 -= field558;
			for (int var8 = 0; var8 < arg1.length(); var8++) {
				if (arg1.charAt(var8) == '@' && var8 + 4 < arg1.length() && arg1.charAt(var8 + 4) == '@') {
					int var9 = method242(arg1.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg4 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg1.charAt(var8);
					if (var10 != ' ') {
						if (arg5) {
							method245(0, field553[var10], field556[var10] + arg0 + 1, field554[var10], 192, field552[var10], field555[var10] + arg3 + 1);
						}

						method245(arg4, field553[var10], field556[var10] + arg0, field554[var10], var7, field552[var10], field555[var10] + arg3);
					}

					arg3 += field557[var10];
					if ((field559.nextInt() & 0x3) == 0) {
						arg3++;
					}
				}
			}
		}
	}

	@ObfuscatedName("CWXRTTYV.a(ILjava/lang/String;)I")
	public int method242(String arg0) {
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
				field560 = true;
			}

			if (arg0.equals("end")) {
				field560 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("CWXRTTYV.a([BIIIII)V")
	public void method243(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = BAXODNVH.field32 * arg2 + arg1;
		int var8 = BAXODNVH.field32 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < BAXODNVH.field34) {
			int var11 = BAXODNVH.field34 - arg2;
			arg4 -= var11;
			arg2 = BAXODNVH.field34;
			var10 += arg3 * var11;
			var7 += BAXODNVH.field32 * var11;
		}

		if (arg2 + arg4 >= BAXODNVH.field35) {
			arg4 -= arg2 + arg4 + 1 - BAXODNVH.field35;
		}

		if (arg1 < BAXODNVH.field36) {
			int var12 = BAXODNVH.field36 - arg1;
			arg3 -= var12;
			arg1 = BAXODNVH.field36;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= BAXODNVH.field37) {
			int var13 = arg1 + arg3 + 1 - BAXODNVH.field37;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method244(BAXODNVH.field31, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("CWXRTTYV.a([I[BIIIIIII)V")
	public void method244(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("CWXRTTYV.a(IIIII[BII)V")
	public void method245(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
		int var8 = BAXODNVH.field32 * arg2 + arg6;
		int var9 = BAXODNVH.field32 - arg1;
		int var10 = 0;
		int var11 = 0;
		if (arg2 < BAXODNVH.field34) {
			int var12 = BAXODNVH.field34 - arg2;
			arg3 -= var12;
			arg2 = BAXODNVH.field34;
			var11 += arg1 * var12;
			var8 += BAXODNVH.field32 * var12;
		}

		if (arg2 + arg3 >= BAXODNVH.field35) {
			arg3 -= arg2 + arg3 + 1 - BAXODNVH.field35;
		}

		if (arg6 < BAXODNVH.field36) {
			int var13 = BAXODNVH.field36 - arg6;
			arg1 -= var13;
			arg6 = BAXODNVH.field36;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg1 + arg6 >= BAXODNVH.field37) {
			int var14 = arg1 + arg6 + 1 - BAXODNVH.field37;
			arg1 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg1 > 0 && arg3 > 0) {
			method246(arg0, arg5, var10, BAXODNVH.field31, var8, var9, var11, arg1, arg3, arg4);
		}
	}

	@ObfuscatedName("CWXRTTYV.a(I[BI[IIIIIIII)V")
	public void method246(int arg0, byte[] arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		arg0 = ((arg0 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg9 & 0xFF0000) >> 8;
		arg9 = 256 - arg9;
		for (int var11 = -arg8; var11 < 0; var11++) {
			for (int var12 = -arg7; var12 < 0; var12++) {
				if (arg1[arg6++] == 0) {
					arg4++;
				} else {
					int var13 = arg3[arg4];
					arg3[arg4++] = (((var13 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((var13 & 0xFF00) * arg9 & 0xFF0000) >> 8) + arg0;
				}
			}

			arg4 += arg5;
			arg6 += arg2;
		}
	}
}
