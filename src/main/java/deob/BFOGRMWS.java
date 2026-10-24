package deob;

import java.util.Random;

@ObfuscatedName("BFOGRMWS")
public final class BFOGRMWS extends IIPNJDNO {

	@ObfuscatedName("BFOGRMWS.C")
	public byte[][] field37 = new byte[256][];

	@ObfuscatedName("BFOGRMWS.D")
	public int[] field38 = new int[256];

	@ObfuscatedName("BFOGRMWS.E")
	public int[] field39 = new int[256];

	@ObfuscatedName("BFOGRMWS.F")
	public int[] field40 = new int[256];

	@ObfuscatedName("BFOGRMWS.G")
	public int[] field41 = new int[256];

	@ObfuscatedName("BFOGRMWS.H")
	public int[] field42 = new int[256];

	@ObfuscatedName("BFOGRMWS.J")
	public Random field44 = new Random();

	@ObfuscatedName("BFOGRMWS.K")
	public boolean field45 = false;

	@ObfuscatedName("BFOGRMWS.I")
	public int field43;

	public BFOGRMWS(CVNWKEAW arg0, boolean arg1, String arg2) {
		XOUQUKZW var4 = new XOUQUKZW(arg0.method180(arg2 + ".dat", null));
		XOUQUKZW var5 = new XOUQUKZW(arg0.method180("index.dat", null));
		boolean var6 = true;
		var5.field1367 = var4.method523() + 4;
		int var7 = var5.method521();
		if (var7 > 0) {
			var5.field1367 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field40[var8] = var5.method521();
			field41[var8] = var5.method521();
			int var10 = field38[var8] = var5.method523();
			int var11 = field39[var8] = var5.method523();
			int var12 = var5.method521();
			int var13 = var10 * var11;
			field37[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field37[var8][var14] = var4.method522();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field37[var8][var10 * var16 + var15] = var4.method522();
					}
				}
			}

			if (var11 > field43 && var8 < 128) {
				field43 = var11;
			}

			field40[var8] = 1;
			field42[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field37[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field42[var8]--;
				field40[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field37[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field42[var8]--;
			}
		}

		if (arg1) {
			field42[32] = field42[73];
		} else {
			field42[32] = field42[105];
		}
	}

	@ObfuscatedName("BFOGRMWS.a(Ljava/lang/String;IZII)V")
	public void method14(String arg0, int arg1, int arg2, int arg3) {
		method19(arg0, arg3, arg1, arg2 - method18(arg0));
	}

	@ObfuscatedName("BFOGRMWS.a(IZIILjava/lang/String;)V")
	public void method15(int arg0, int arg1, int arg2, String arg3) {
		method19(arg3, arg2, arg0, arg1 - method18(arg3) / 2);
	}

	@ObfuscatedName("BFOGRMWS.a(ZLjava/lang/String;IIII)V")
	public void method16(boolean arg0, String arg1, int arg2, int arg3, int arg4) {
		method23(arg2 - method17(arg1) / 2, arg3, arg1, arg4, arg0);
	}

	@ObfuscatedName("BFOGRMWS.a(Ljava/lang/String;Z)I")
	public int method17(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field42[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("BFOGRMWS.a(Ljava/lang/String;I)I")
	public int method18(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field42[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("BFOGRMWS.a(Ljava/lang/String;IIII)V")
	public void method19(String arg0, int arg1, int arg2, int arg3) {
		if (arg0 != null) {
			arg2 -= field43;
			for (int var5 = 0; var5 < arg0.length(); var5++) {
				char var6 = arg0.charAt(var5);
				if (var6 != ' ') {
					method26(field37[var6], field40[var6] + arg3, field41[var6] + arg2, field38[var6], field39[var6], arg1);
				}

				arg3 += field42[var6];
			}
		}
	}

	@ObfuscatedName("BFOGRMWS.a(Ljava/lang/String;IIIBI)V")
	public void method20(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg1 -= method18(arg0) / 2;
			arg3 -= field43;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method26(field37[var7], field40[var7] + arg1, field41[var7] + arg3 + (int) (Math.sin(arg2 / 5.0D + var6 / 2.0D) * 5.0D), field38[var7], field39[var7], arg4);
				}

				arg1 += field42[var7];
			}
		}
	}

	@ObfuscatedName("BFOGRMWS.b(ZLjava/lang/String;IIII)V")
	public void method21(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg4 -= method18(arg0) / 2;
			arg1 -= field43;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method26(field37[var7], field40[var7] + arg4 + (int) (Math.sin(arg3 / 5.0D + var6 / 5.0D) * 5.0D), field41[var7] + arg1 + (int) (Math.sin(arg3 / 5.0D + var6 / 3.0D) * 5.0D), field38[var7], field39[var7], arg2);
				}

				arg4 += field42[var7];
			}
		}
	}

	@ObfuscatedName("BFOGRMWS.a(ILjava/lang/String;IIIII)V")
	public void method22(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 != null) {
			double var7 = 7.0D - arg3 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg5 -= method18(arg1) / 2;
			arg4 -= field43;
			for (int var9 = 0; var9 < arg1.length(); var9++) {
				char var10 = arg1.charAt(var9);
				if (var10 != ' ') {
					method26(field37[var10], field40[var10] + arg5, field41[var10] + arg4 + (int) (Math.sin(var9 / 1.5D + arg2) * var7), field38[var10], field39[var10], arg0);
				}

				arg5 += field42[var10];
			}
		}
	}

	@ObfuscatedName("BFOGRMWS.a(IILjava/lang/String;ZIZ)V")
	public void method23(int arg0, int arg1, String arg2, int arg3, boolean arg4) {
		field45 = false;
		int var6 = arg0;
		if (arg2 != null) {
			arg1 -= field43;
			for (int var7 = 0; var7 < arg2.length(); var7++) {
				if (arg2.charAt(var7) == '@' && var7 + 4 < arg2.length() && arg2.charAt(var7 + 4) == '@') {
					int var8 = method25(arg2.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg3 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg2.charAt(var7);
					if (var9 != ' ') {
						if (arg4) {
							method26(field37[var9], field40[var9] + arg0 + 1, field41[var9] + arg1 + 1, field38[var9], field39[var9], 0);
						}

						method26(field37[var9], field40[var9] + arg0, field41[var9] + arg1, field38[var9], field39[var9], arg3);
					}

					arg0 += field42[var9];
				}
			}

			if (field45) {
				IIPNJDNO.method325(0x800000, arg0 - var6, var6, (int) (field43 * 0.7D) + arg1);
			}
		}
	}

	@ObfuscatedName("BFOGRMWS.a(Ljava/lang/String;IIIIIZ)V")
	public void method24(String arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (arg0 != null) {
			field44.setSeed(arg1);
			int var7 = (field44.nextInt() & 0x1F) + 192;
			arg2 -= field43;
			for (int var8 = 0; var8 < arg0.length(); var8++) {
				if (arg0.charAt(var8) == '@' && var8 + 4 < arg0.length() && arg0.charAt(var8 + 4) == '@') {
					int var9 = method25(arg0.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg3 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg0.charAt(var8);
					if (var10 != ' ') {
						if (arg5) {
							method28(field38[var10], field40[var10] + arg4 + 1, 0, field37[var10], field39[var10], field41[var10] + arg2 + 1, 192);
						}

						method28(field38[var10], field40[var10] + arg4, arg3, field37[var10], field39[var10], field41[var10] + arg2, var7);
					}

					arg4 += field42[var10];
					if ((field44.nextInt() & 0x3) == 0) {
						arg4++;
					}
				}
			}
		}
	}

	@ObfuscatedName("BFOGRMWS.a(ZLjava/lang/String;)I")
	public int method25(String arg0) {
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
				field45 = true;
			}

			if (arg0.equals("end")) {
				field45 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("BFOGRMWS.a([BIIIII)V")
	public void method26(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = IIPNJDNO.field812 * arg2 + arg1;
		int var8 = IIPNJDNO.field812 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < IIPNJDNO.field814) {
			int var11 = IIPNJDNO.field814 - arg2;
			arg4 -= var11;
			arg2 = IIPNJDNO.field814;
			var10 += arg3 * var11;
			var7 += IIPNJDNO.field812 * var11;
		}

		if (arg2 + arg4 >= IIPNJDNO.field815) {
			arg4 -= arg2 + arg4 + 1 - IIPNJDNO.field815;
		}

		if (arg1 < IIPNJDNO.field816) {
			int var12 = IIPNJDNO.field816 - arg1;
			arg3 -= var12;
			arg1 = IIPNJDNO.field816;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= IIPNJDNO.field817) {
			int var13 = arg1 + arg3 + 1 - IIPNJDNO.field817;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method27(IIPNJDNO.field811, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("BFOGRMWS.a([I[BIIIIIII)V")
	public void method27(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("BFOGRMWS.a(IIIZ[BIII)V")
	public void method28(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
		int var8 = IIPNJDNO.field812 * arg5 + arg1;
		int var9 = IIPNJDNO.field812 - arg0;
		int var10 = 0;
		int var11 = 0;
		if (arg5 < IIPNJDNO.field814) {
			int var12 = IIPNJDNO.field814 - arg5;
			arg4 -= var12;
			arg5 = IIPNJDNO.field814;
			var11 += arg0 * var12;
			var8 += IIPNJDNO.field812 * var12;
		}

		if (arg4 + arg5 >= IIPNJDNO.field815) {
			arg4 -= arg4 + arg5 + 1 - IIPNJDNO.field815;
		}

		if (arg1 < IIPNJDNO.field816) {
			int var13 = IIPNJDNO.field816 - arg1;
			arg0 -= var13;
			arg1 = IIPNJDNO.field816;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg0 + arg1 >= IIPNJDNO.field817) {
			int var14 = arg0 + arg1 + 1 - IIPNJDNO.field817;
			arg0 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg0 > 0 && arg4 > 0) {
			method29(arg4, var10, var9, arg0, arg3, var11, var8, arg6, arg2, IIPNJDNO.field811);
		}
	}

	@ObfuscatedName("BFOGRMWS.a(IZIII[BIIII[I)V")
	public void method29(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
		arg8 = ((arg8 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((arg8 & 0xFF00) * arg7 & 0xFF0000) >> 8;
		arg7 = 256 - arg7;
		for (int var11 = -arg0; var11 < 0; var11++) {
			for (int var12 = -arg3; var12 < 0; var12++) {
				if (arg4[arg5++] == 0) {
					arg6++;
				} else {
					int var13 = arg9[arg6];
					arg9[arg6++] = (((var13 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((var13 & 0xFF00) * arg7 & 0xFF0000) >> 8) + arg8;
				}
			}

			arg6 += arg2;
			arg5 += arg1;
		}
	}
}
