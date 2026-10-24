package deob;

import java.util.Random;

@ObfuscatedName("JQUNTFOC")
public final class JQUNTFOC extends LRYUPGSZ {

	@ObfuscatedName("JQUNTFOC.F")
	public byte[][] field839 = new byte[256][];

	@ObfuscatedName("JQUNTFOC.G")
	public int[] field840 = new int[256];

	@ObfuscatedName("JQUNTFOC.H")
	public int[] field841 = new int[256];

	@ObfuscatedName("JQUNTFOC.I")
	public int[] field842 = new int[256];

	@ObfuscatedName("JQUNTFOC.J")
	public int[] field843 = new int[256];

	@ObfuscatedName("JQUNTFOC.K")
	public int[] field844 = new int[256];

	@ObfuscatedName("JQUNTFOC.M")
	public Random field846 = new Random();

	@ObfuscatedName("JQUNTFOC.N")
	public boolean field847 = false;

	@ObfuscatedName("JQUNTFOC.L")
	public int field845;

	public JQUNTFOC(LYZBHNJP arg0, boolean arg1, String arg2) {
		ZOMNSJJM var4 = new ZOMNSJJM(arg0.method290(arg2 + ".dat", null));
		ZOMNSJJM var5 = new ZOMNSJJM(arg0.method290("index.dat", null));
		boolean var6 = true;
		var5.field1457 = var4.method549() + 4;
		int var7 = var5.method547();
		if (var7 > 0) {
			var5.field1457 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field842[var8] = var5.method547();
			field843[var8] = var5.method547();
			int var10 = field840[var8] = var5.method549();
			int var11 = field841[var8] = var5.method549();
			int var12 = var5.method547();
			int var13 = var10 * var11;
			field839[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field839[var8][var14] = var4.method548();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field839[var8][var10 * var16 + var15] = var4.method548();
					}
				}
			}

			if (var11 > field845 && var8 < 128) {
				field845 = var11;
			}

			field842[var8] = 1;
			field844[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field839[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field844[var8]--;
				field842[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field839[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field844[var8]--;
			}
		}

		if (arg1) {
			field844[32] = field844[73];
		} else {
			field844[32] = field844[105];
		}
	}

	@ObfuscatedName("JQUNTFOC.a(Ljava/lang/String;IIZI)V")
	public void method236(String arg0, int arg1, int arg2, int arg3) {
		method241(arg3, arg0, arg1, arg2 - method240(arg0));
	}

	@ObfuscatedName("JQUNTFOC.a(IILjava/lang/String;ZI)V")
	public void method237(int arg0, int arg1, String arg2, int arg3) {
		method241(arg1, arg2, arg0, arg3 - method240(arg2) / 2);
	}

	@ObfuscatedName("JQUNTFOC.a(IIILjava/lang/String;IZ)V")
	public void method238(int arg0, int arg1, String arg2, int arg3, boolean arg4) {
		method245(arg3 - method239(arg2) / 2, arg2, arg4, arg1, arg0);
	}

	@ObfuscatedName("JQUNTFOC.a(ZLjava/lang/String;)I")
	public int method239(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field844[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("JQUNTFOC.a(BLjava/lang/String;)I")
	public int method240(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field844[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("JQUNTFOC.a(ILjava/lang/String;III)V")
	public void method241(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 != null) {
			arg2 -= field845;
			for (int var5 = 0; var5 < arg1.length(); var5++) {
				char var6 = arg1.charAt(var5);
				if (var6 != ' ') {
					method248(field839[var6], field842[var6] + arg3, field843[var6] + arg2, field840[var6], field841[var6], arg0);
				}

				arg3 += field844[var6];
			}
		}
	}

	@ObfuscatedName("JQUNTFOC.a(ZLjava/lang/String;IIII)V")
	public void method242(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg1 -= method240(arg0) / 2;
			arg4 -= field845;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method248(field839[var7], field842[var7] + arg1, field843[var7] + arg4 + (int) (Math.sin(arg2 / 5.0D + var6 / 2.0D) * 5.0D), field840[var7], field841[var7], arg3);
				}

				arg1 += field844[var7];
			}
		}
	}

	@ObfuscatedName("JQUNTFOC.a(ILjava/lang/String;ZIII)V")
	public void method243(int arg0, String arg1, int arg2, int arg3, int arg4) {
		if (arg1 != null) {
			arg0 -= method240(arg1) / 2;
			arg3 -= field845;
			for (int var6 = 0; var6 < arg1.length(); var6++) {
				char var7 = arg1.charAt(var6);
				if (var7 != ' ') {
					method248(field839[var7], field842[var7] + arg0 + (int) (Math.sin(arg2 / 5.0D + var6 / 5.0D) * 5.0D), field843[var7] + arg3 + (int) (Math.sin(arg2 / 5.0D + var6 / 3.0D) * 5.0D), field840[var7], field841[var7], arg4);
				}

				arg0 += field844[var7];
			}
		}
	}

	@ObfuscatedName("JQUNTFOC.a(IIILjava/lang/String;III)V")
	public void method244(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
		if (arg2 != null) {
			double var7 = 7.0D - arg5 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg0 -= method240(arg2) / 2;
			arg1 -= field845;
			for (int var9 = 0; var9 < arg2.length(); var9++) {
				char var10 = arg2.charAt(var9);
				if (var10 != ' ') {
					method248(field839[var10], field842[var10] + arg0, field843[var10] + arg1 + (int) (Math.sin(var9 / 1.5D + arg4) * var7), field840[var10], field841[var10], arg3);
				}

				arg0 += field844[var10];
			}
		}
	}

	@ObfuscatedName("JQUNTFOC.a(IILjava/lang/String;ZII)V")
	public void method245(int arg0, String arg1, boolean arg2, int arg3, int arg4) {
		field847 = false;
		int var6 = arg0;
		if (arg1 != null) {
			arg3 -= field845;
			for (int var7 = 0; var7 < arg1.length(); var7++) {
				if (arg1.charAt(var7) == '@' && var7 + 4 < arg1.length() && arg1.charAt(var7 + 4) == '@') {
					int var8 = method247(arg1.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg4 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg1.charAt(var7);
					if (var9 != ' ') {
						if (arg2) {
							method248(field839[var9], field842[var9] + arg0 + 1, field843[var9] + arg3 + 1, field840[var9], field841[var9], 0);
						}

						method248(field839[var9], field842[var9] + arg0, field843[var9] + arg3, field840[var9], field841[var9], arg4);
					}

					arg0 += field844[var9];
				}
			}

			if (field847) {
				LRYUPGSZ.method272(0x800000, arg0 - var6, var6, (int) (field845 * 0.7D) + arg3);
			}
		}
	}

	@ObfuscatedName("JQUNTFOC.a(IIIZILjava/lang/String;I)V")
	public void method246(int arg0, int arg1, boolean arg2, int arg3, String arg4, int arg5) {
		if (arg4 != null) {
			field846.setSeed(arg5);
			int var7 = (field846.nextInt() & 0x1F) + 192;
			arg3 -= field845;
			for (int var8 = 0; var8 < arg4.length(); var8++) {
				if (arg4.charAt(var8) == '@' && var8 + 4 < arg4.length() && arg4.charAt(var8 + 4) == '@') {
					int var9 = method247(arg4.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg1 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg4.charAt(var8);
					if (var10 != ' ') {
						if (arg2) {
							method250(field839[var10], 0, field841[var10], 192, field843[var10] + arg3 + 1, field840[var10], field842[var10] + arg0 + 1);
						}

						method250(field839[var10], arg1, field841[var10], var7, field843[var10] + arg3, field840[var10], field842[var10] + arg0);
					}

					arg0 += field844[var10];
					if ((field846.nextInt() & 0x3) == 0) {
						arg0++;
					}
				}
			}
		}
	}

	@ObfuscatedName("JQUNTFOC.a(ILjava/lang/String;)I")
	public int method247(String arg0) {
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
				field847 = true;
			}

			if (arg0.equals("end")) {
				field847 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("JQUNTFOC.a([BIIIII)V")
	public void method248(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = LRYUPGSZ.field880 * arg2 + arg1;
		int var8 = LRYUPGSZ.field880 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < LRYUPGSZ.field882) {
			int var11 = LRYUPGSZ.field882 - arg2;
			arg4 -= var11;
			arg2 = LRYUPGSZ.field882;
			var10 += arg3 * var11;
			var7 += LRYUPGSZ.field880 * var11;
		}

		if (arg2 + arg4 >= LRYUPGSZ.field883) {
			arg4 -= arg2 + arg4 + 1 - LRYUPGSZ.field883;
		}

		if (arg1 < LRYUPGSZ.field884) {
			int var12 = LRYUPGSZ.field884 - arg1;
			arg3 -= var12;
			arg1 = LRYUPGSZ.field884;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= LRYUPGSZ.field885) {
			int var13 = arg1 + arg3 + 1 - LRYUPGSZ.field885;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method249(LRYUPGSZ.field879, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("JQUNTFOC.a([I[BIIIIIII)V")
	public void method249(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("JQUNTFOC.a(B[BIIIIII)V")
	public void method250(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = LRYUPGSZ.field880 * arg4 + arg6;
		int var9 = LRYUPGSZ.field880 - arg5;
		int var10 = 0;
		int var11 = 0;
		if (arg4 < LRYUPGSZ.field882) {
			int var12 = LRYUPGSZ.field882 - arg4;
			arg2 -= var12;
			arg4 = LRYUPGSZ.field882;
			var11 += arg5 * var12;
			var8 += LRYUPGSZ.field880 * var12;
		}

		if (arg2 + arg4 >= LRYUPGSZ.field883) {
			arg2 -= arg2 + arg4 + 1 - LRYUPGSZ.field883;
		}

		if (arg6 < LRYUPGSZ.field884) {
			int var13 = LRYUPGSZ.field884 - arg6;
			arg5 -= var13;
			arg6 = LRYUPGSZ.field884;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg5 + arg6 >= LRYUPGSZ.field885) {
			int var14 = arg5 + arg6 + 1 - LRYUPGSZ.field885;
			arg5 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg5 > 0 && arg2 > 0) {
			method251(var8, arg2, var9, arg0, var10, arg5, var11, arg1, arg3, LRYUPGSZ.field879);
		}
	}

	@ObfuscatedName("JQUNTFOC.a(III[BIIIIII[I)V")
	public void method251(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
		arg7 = ((arg7 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((arg7 & 0xFF00) * arg8 & 0xFF0000) >> 8;
		arg8 = 256 - arg8;
		for (int var11 = -arg1; var11 < 0; var11++) {
			for (int var12 = -arg5; var12 < 0; var12++) {
				if (arg3[arg6++] == 0) {
					arg0++;
				} else {
					int var13 = arg9[arg0];
					arg9[arg0++] = (((var13 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((var13 & 0xFF00) * arg8 & 0xFF0000) >> 8) + arg7;
				}
			}

			arg0 += arg2;
			arg6 += arg4;
		}
	}
}
