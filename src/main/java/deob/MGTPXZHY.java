package deob;

import java.util.Random;

@ObfuscatedName("MGTPXZHY")
public final class MGTPXZHY extends WNEQSCWL {

	@ObfuscatedName("MGTPXZHY.D")
	public byte[][] field818 = new byte[256][];

	@ObfuscatedName("MGTPXZHY.E")
	public int[] field819 = new int[256];

	@ObfuscatedName("MGTPXZHY.F")
	public int[] field820 = new int[256];

	@ObfuscatedName("MGTPXZHY.G")
	public int[] field821 = new int[256];

	@ObfuscatedName("MGTPXZHY.H")
	public int[] field822 = new int[256];

	@ObfuscatedName("MGTPXZHY.I")
	public int[] field823 = new int[256];

	@ObfuscatedName("MGTPXZHY.K")
	public Random field825 = new Random();

	@ObfuscatedName("MGTPXZHY.L")
	public boolean field826 = false;

	@ObfuscatedName("MGTPXZHY.J")
	public int field824;

	public MGTPXZHY(String arg0, boolean arg1, ESUFCMYV arg2) {
		RGCGKKUR var4 = new RGCGKKUR(arg2.method205(arg0 + ".dat", null));
		RGCGKKUR var5 = new RGCGKKUR(arg2.method205("index.dat", null));
		boolean var6 = true;
		var5.field1350 = var4.method457() + 4;
		int var7 = var5.method455();
		if (var7 > 0) {
			var5.field1350 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field821[var8] = var5.method455();
			field822[var8] = var5.method455();
			int var10 = field819[var8] = var5.method457();
			int var11 = field820[var8] = var5.method457();
			int var12 = var5.method455();
			int var13 = var10 * var11;
			field818[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field818[var8][var14] = var4.method456();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field818[var8][var10 * var16 + var15] = var4.method456();
					}
				}
			}

			if (var11 > field824 && var8 < 128) {
				field824 = var11;
			}

			field821[var8] = 1;
			field823[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field818[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field823[var8]--;
				field821[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field818[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field823[var8]--;
			}
		}

		if (arg1) {
			field823[32] = field823[73];
		} else {
			field823[32] = field823[105];
		}
	}

	@ObfuscatedName("MGTPXZHY.a(IILjava/lang/String;II)V")
	public void method270(int arg0, int arg1, String arg2, int arg3) {
		method275(arg3, arg2, arg0, arg1 - method274(arg2));
	}

	@ObfuscatedName("MGTPXZHY.a(IIILjava/lang/String;I)V")
	public void method271(int arg0, int arg1, String arg2, int arg3) {
		method275(arg1, arg2, arg3, arg0 - method274(arg2) / 2);
	}

	@ObfuscatedName("MGTPXZHY.a(IIIZILjava/lang/String;)V")
	public void method272(int arg0, int arg1, boolean arg2, int arg3, String arg4) {
		method279(arg4, arg3 - method273(arg4) / 2, arg0, arg2, arg1);
	}

	@ObfuscatedName("MGTPXZHY.a(ILjava/lang/String;)I")
	public int method273(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field823[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("MGTPXZHY.b(ILjava/lang/String;)I")
	public int method274(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field823[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("MGTPXZHY.a(IBLjava/lang/String;II)V")
	public void method275(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 != null) {
			arg2 -= field824;
			for (int var5 = 0; var5 < arg1.length(); var5++) {
				char var6 = arg1.charAt(var5);
				if (var6 != ' ') {
					method282(field818[var6], field821[var6] + arg3, field822[var6] + arg2, field819[var6], field820[var6], arg0);
				}

				arg3 += field823[var6];
			}
		}
	}

	@ObfuscatedName("MGTPXZHY.a(Ljava/lang/String;IIIBI)V")
	public void method276(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg2 -= method274(arg0) / 2;
			arg3 -= field824;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method282(field818[var7], field821[var7] + arg2, field822[var7] + arg3 + (int) (Math.sin(arg4 / 5.0D + var6 / 2.0D) * 5.0D), field819[var7], field820[var7], arg1);
				}

				arg2 += field823[var7];
			}
		}
	}

	@ObfuscatedName("MGTPXZHY.a(IIIILjava/lang/String;I)V")
	public void method277(int arg0, int arg1, int arg2, String arg3, int arg4) {
		if (arg3 != null) {
			arg1 -= method274(arg3) / 2;
			arg0 -= field824;
			for (int var6 = 0; var6 < arg3.length(); var6++) {
				char var7 = arg3.charAt(var6);
				if (var7 != ' ') {
					method282(field818[var7], field821[var7] + arg1 + (int) (Math.sin(arg2 / 5.0D + var6 / 5.0D) * 5.0D), field822[var7] + arg0 + (int) (Math.sin(arg2 / 5.0D + var6 / 3.0D) * 5.0D), field819[var7], field820[var7], arg4);
				}

				arg1 += field823[var7];
			}
		}
	}

	@ObfuscatedName("MGTPXZHY.a(BIIIIILjava/lang/String;)V")
	public void method278(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
		if (arg5 != null) {
			double var7 = 7.0D - arg0 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg3 -= method274(arg5) / 2;
			arg2 -= field824;
			for (int var9 = 0; var9 < arg5.length(); var9++) {
				char var10 = arg5.charAt(var9);
				if (var10 != ' ') {
					method282(field818[var10], field821[var10] + arg3, field822[var10] + arg2 + (int) (Math.sin(var9 / 1.5D + arg4) * var7), field819[var10], field820[var10], arg1);
				}

				arg3 += field823[var10];
			}
		}
	}

	@ObfuscatedName("MGTPXZHY.a(Ljava/lang/String;IIZII)V")
	public void method279(String arg0, int arg1, int arg2, boolean arg3, int arg4) {
		field826 = false;
		int var6 = arg1;
		if (arg0 != null) {
			arg2 -= field824;
			for (int var7 = 0; var7 < arg0.length(); var7++) {
				if (arg0.charAt(var7) == '@' && var7 + 4 < arg0.length() && arg0.charAt(var7 + 4) == '@') {
					int var8 = method281(arg0.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg4 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg0.charAt(var7);
					if (var9 != ' ') {
						if (arg3) {
							method282(field818[var9], field821[var9] + arg1 + 1, field822[var9] + arg2 + 1, field819[var9], field820[var9], 0);
						}

						method282(field818[var9], field821[var9] + arg1, field822[var9] + arg2, field819[var9], field820[var9], arg4);
					}

					arg1 += field823[var9];
				}
			}

			if (field826) {
				WNEQSCWL.method576(var6, arg1 - var6, (int) (field824 * 0.7D) + arg2, 0x800000);
			}
		}
	}

	@ObfuscatedName("MGTPXZHY.a(ILjava/lang/String;IIZII)V")
	public void method280(int arg0, String arg1, int arg2, boolean arg3, int arg4, int arg5) {
		if (arg1 != null) {
			field825.setSeed(arg5);
			int var7 = (field825.nextInt() & 0x1F) + 192;
			arg0 -= field824;
			for (int var8 = 0; var8 < arg1.length(); var8++) {
				if (arg1.charAt(var8) == '@' && var8 + 4 < arg1.length() && arg1.charAt(var8 + 4) == '@') {
					int var9 = method281(arg1.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg4 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg1.charAt(var8);
					if (var10 != ' ') {
						if (arg3) {
							method284(0, field821[var10] + arg2 + 1, field820[var10], field822[var10] + arg0 + 1, field819[var10], 192, field818[var10]);
						}

						method284(arg4, field821[var10] + arg2, field820[var10], field822[var10] + arg0, field819[var10], var7, field818[var10]);
					}

					arg2 += field823[var10];
					if ((field825.nextInt() & 0x3) == 0) {
						arg2++;
					}
				}
			}
		}
	}

	@ObfuscatedName("MGTPXZHY.a(Ljava/lang/String;Z)I")
	public int method281(String arg0) {
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
				field826 = true;
			}

			if (arg0.equals("end")) {
				field826 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("MGTPXZHY.a([BIIIII)V")
	public void method282(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = WNEQSCWL.field1453 * arg2 + arg1;
		int var8 = WNEQSCWL.field1453 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < WNEQSCWL.field1455) {
			int var11 = WNEQSCWL.field1455 - arg2;
			arg4 -= var11;
			arg2 = WNEQSCWL.field1455;
			var10 += arg3 * var11;
			var7 += WNEQSCWL.field1453 * var11;
		}

		if (arg2 + arg4 >= WNEQSCWL.field1456) {
			arg4 -= arg2 + arg4 + 1 - WNEQSCWL.field1456;
		}

		if (arg1 < WNEQSCWL.field1457) {
			int var12 = WNEQSCWL.field1457 - arg1;
			arg3 -= var12;
			arg1 = WNEQSCWL.field1457;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= WNEQSCWL.field1458) {
			int var13 = arg1 + arg3 + 1 - WNEQSCWL.field1458;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method283(WNEQSCWL.field1452, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("MGTPXZHY.a([I[BIIIIIII)V")
	public void method283(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("MGTPXZHY.a(IIIIIII[B)V")
	public void method284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
		int var8 = WNEQSCWL.field1453 * arg3 + arg1;
		int var9 = WNEQSCWL.field1453 - arg4;
		int var10 = 0;
		int var11 = 0;
		if (arg3 < WNEQSCWL.field1455) {
			int var12 = WNEQSCWL.field1455 - arg3;
			arg2 -= var12;
			arg3 = WNEQSCWL.field1455;
			var11 += arg4 * var12;
			var8 += WNEQSCWL.field1453 * var12;
		}

		if (arg2 + arg3 >= WNEQSCWL.field1456) {
			arg2 -= arg2 + arg3 + 1 - WNEQSCWL.field1456;
		}

		if (arg1 < WNEQSCWL.field1457) {
			int var13 = WNEQSCWL.field1457 - arg1;
			arg4 -= var13;
			arg1 = WNEQSCWL.field1457;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg1 + arg4 >= WNEQSCWL.field1458) {
			int var14 = arg1 + arg4 + 1 - WNEQSCWL.field1458;
			arg4 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg4 > 0 && arg2 > 0) {
			method285(arg6, arg4, arg0, var10, var9, arg5, arg2, var11, WNEQSCWL.field1452, var8);
		}
	}

	@ObfuscatedName("MGTPXZHY.a([BIIIIIIII[II)V")
	public void method285(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
		arg2 = ((arg2 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg5 & 0xFF0000) >> 8;
		arg5 = 256 - arg5;
		for (int var11 = -arg6; var11 < 0; var11++) {
			for (int var12 = -arg1; var12 < 0; var12++) {
				if (arg0[arg7++] == 0) {
					arg9++;
				} else {
					int var13 = arg8[arg9];
					arg8[arg9++] = (((var13 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((var13 & 0xFF00) * arg5 & 0xFF0000) >> 8) + arg2;
				}
			}

			arg9 += arg4;
			arg7 += arg3;
		}
	}
}
