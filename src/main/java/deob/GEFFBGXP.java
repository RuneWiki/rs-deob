package deob;

@ObfuscatedName("GEFFBGXP")
public class GEFFBGXP extends HSUOZGYX {

	@ObfuscatedName("GEFFBGXP.l")
	public static int field623;

	@ObfuscatedName("GEFFBGXP.m")
	public static int field624;

	@ObfuscatedName("GEFFBGXP.n")
	public static int field625;

	@ObfuscatedName("GEFFBGXP.o")
	public static int field626;

	@ObfuscatedName("GEFFBGXP.p")
	public static int field627;

	@ObfuscatedName("GEFFBGXP.q")
	public static int field628;

	@ObfuscatedName("GEFFBGXP.r")
	public static int field629;

	@ObfuscatedName("GEFFBGXP.s")
	public static int field630;

	@ObfuscatedName("GEFFBGXP.t")
	public static int field631;

	@ObfuscatedName("GEFFBGXP.k")
	public static int[] field622;

	@ObfuscatedName("GEFFBGXP.a(III[I)V")
	public static void method223(int arg0, int arg1, int[] arg2) {
		field622 = arg2;
		field623 = arg1;
		field624 = arg0;
		method225(arg0, 0, arg1, 0);
	}

	@ObfuscatedName("GEFFBGXP.a(Z)V")
	public static void method224() {
		field627 = 0;
		field625 = 0;
		field628 = field623;
		field626 = field624;
		field629 = field628 - 1;
		field630 = field628 / 2;
	}

	@ObfuscatedName("GEFFBGXP.a(IIIII)V")
	public static void method225(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg2 > field623) {
			arg2 = field623;
		}

		if (arg0 > field624) {
			arg0 = field624;
		}

		field627 = arg1;
		field625 = arg3;
		field628 = arg2;
		field626 = arg0;
		field629 = field628 - 1;
		field630 = field628 / 2;
		field631 = field626 / 2;
	}

	@ObfuscatedName("GEFFBGXP.b(Z)V")
	public static void method226() {
		int var0 = field624 * field623;
		for (int var1 = 0; var1 < var0; var1++) {
			field622[var1] = 0;
		}
	}

	@ObfuscatedName("GEFFBGXP.a(IIIIIBI)V")
	public static void method227(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 < field627) {
			arg5 -= field627 - arg3;
			arg3 = field627;
		}

		if (arg2 < field625) {
			arg0 -= field625 - arg2;
			arg2 = field625;
		}

		if (arg3 + arg5 > field628) {
			arg5 = field628 - arg3;
		}

		if (arg0 + arg2 > field626) {
			arg0 = field626 - arg2;
		}

		int var6 = 256 - arg4;
		int var7 = (arg1 >> 16 & 0xFF) * arg4;
		int var8 = (arg1 >> 8 & 0xFF) * arg4;
		int var9 = (arg1 & 0xFF) * arg4;
		int var10 = field623 - arg5;
		int var11 = field623 * arg2 + arg3;
		for (int var12 = 0; var12 < arg0; var12++) {
			for (int var13 = -arg5; var13 < 0; var13++) {
				int var14 = (field622[var11] >> 16 & 0xFF) * var6;
				int var15 = (field622[var11] >> 8 & 0xFF) * var6;
				int var16 = (field622[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field622[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("GEFFBGXP.a(IIIIIZ)V")
	public static void method228(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 < field627) {
			arg2 -= field627 - arg3;
			arg3 = field627;
		}

		if (arg0 < field625) {
			arg1 -= field625 - arg0;
			arg0 = field625;
		}

		if (arg2 + arg3 > field628) {
			arg2 = field628 - arg3;
		}

		if (arg0 + arg1 > field626) {
			arg1 = field626 - arg0;
		}

		int var5 = field623 - arg2;
		int var6 = field623 * arg0 + arg3;
		for (int var7 = -arg1; var7 < 0; var7++) {
			for (int var8 = -arg2; var8 < 0; var8++) {
				field622[var6++] = arg4;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("GEFFBGXP.a(IIIIBI)V")
	public static void method229(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method231(arg0, arg2, arg3, arg4);
		method231(arg0, arg2, arg1 + arg3 - 1, arg4);
		method233(arg1, arg0, arg3, arg4);
		method233(arg1, arg0 + arg2 - 1, arg3, arg4);
	}

	@ObfuscatedName("GEFFBGXP.a(IIIIIIB)V")
	public static void method230(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method232(arg0, arg2, arg5, arg4, arg1);
		method232(arg0, arg2 + arg3 - 1, arg5, arg4, arg1);

		if (arg3 >= 3) {
			method234(arg4, arg3 - 2, arg5, arg1, arg2 + 1);
			method234(arg4, arg3 - 2, arg5, arg0 + arg1 - 1, arg2 + 1);
		}
	}

	@ObfuscatedName("GEFFBGXP.a(IIBII)V")
	public static void method231(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field625 && arg2 < field626) {
			if (arg0 < field627) {
				arg1 -= field627 - arg0;
				arg0 = field627;
			}

			if (arg0 + arg1 > field628) {
				arg1 = field628 - arg0;
			}

			int var4 = field623 * arg2 + arg0;
			for (int var5 = 0; var5 < arg1; var5++) {
				field622[var4 + var5] = arg3;
			}
		}
	}

	@ObfuscatedName("GEFFBGXP.a(IIIIII)V")
	public static void method232(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 >= field625 && arg1 < field626) {
			if (arg4 < field627) {
				arg0 -= field627 - arg4;
				arg4 = field627;
			}

			if (arg0 + arg4 > field628) {
				arg0 = field628 - arg4;
			}

			int var5 = 256 - arg3;
			int var6 = (arg2 >> 16 & 0xFF) * arg3;
			int var7 = (arg2 >> 8 & 0xFF) * arg3;
			int var8 = (arg2 & 0xFF) * arg3;
			int var9 = field623 * arg1 + arg4;
			for (int var10 = 0; var10 < arg0; var10++) {
				int var11 = (field622[var9] >> 16 & 0xFF) * var5;
				int var12 = (field622[var9] >> 8 & 0xFF) * var5;
				int var13 = (field622[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field622[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("GEFFBGXP.b(IIIII)V")
	public static void method233(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field627 && arg1 < field628) {
			if (arg2 < field625) {
				arg0 -= field625 - arg2;
				arg2 = field625;
			}

			if (arg0 + arg2 > field626) {
				arg0 = field626 - arg2;
			}

			int var4 = field623 * arg2 + arg1;
			for (int var5 = 0; var5 < arg0; var5++) {
				field622[field623 * var5 + var4] = arg3;
			}
		}
	}

	@ObfuscatedName("GEFFBGXP.b(IIIIII)V")
	public static void method234(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 >= field627 && arg3 < field628) {
			if (arg4 < field625) {
				arg1 -= field625 - arg4;
				arg4 = field625;
			}

			if (arg1 + arg4 > field626) {
				arg1 = field626 - arg4;
			}

			int var5 = 256 - arg0;
			int var6 = (arg2 >> 16 & 0xFF) * arg0;
			int var7 = (arg2 >> 8 & 0xFF) * arg0;
			int var8 = (arg2 & 0xFF) * arg0;
			int var9 = field623 * arg4 + arg3;
			for (int var10 = 0; var10 < arg1; var10++) {
				int var11 = (field622[var9] >> 16 & 0xFF) * var5;
				int var12 = (field622[var9] >> 8 & 0xFF) * var5;
				int var13 = (field622[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field622[var9] = var14;
				var9 += field623;
			}
		}
	}
}
