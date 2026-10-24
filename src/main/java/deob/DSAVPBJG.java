package deob;

@ObfuscatedName("DSAVPBJG")
public class DSAVPBJG extends WLTWEDNK {

	@ObfuscatedName("DSAVPBJG.p")
	public static int field563;

	@ObfuscatedName("DSAVPBJG.q")
	public static int field564;

	@ObfuscatedName("DSAVPBJG.r")
	public static int field565;

	@ObfuscatedName("DSAVPBJG.s")
	public static int field566;

	@ObfuscatedName("DSAVPBJG.t")
	public static int field567;

	@ObfuscatedName("DSAVPBJG.u")
	public static int field568;

	@ObfuscatedName("DSAVPBJG.v")
	public static int field569;

	@ObfuscatedName("DSAVPBJG.w")
	public static int field570;

	@ObfuscatedName("DSAVPBJG.x")
	public static int field571;

	@ObfuscatedName("DSAVPBJG.o")
	public static int[] field562;

	@ObfuscatedName("DSAVPBJG.a(I[III)V")
	public static void method191(int[] arg0, int arg1, int arg2) {
		field562 = arg0;
		field563 = arg1;
		field564 = arg2;
		method193(arg1, arg2, 0, 0);
	}

	@ObfuscatedName("DSAVPBJG.a(B)V")
	public static void method192() {
		field567 = 0;
		field565 = 0;
		field568 = field563;
		field566 = field564;
		field569 = field568 - 1;
		field570 = field568 / 2;
	}

	@ObfuscatedName("DSAVPBJG.a(IIIIZ)V")
	public static void method193(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 < 0) {
			arg2 = 0;
		}

		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg0 > field563) {
			arg0 = field563;
		}

		if (arg1 > field564) {
			arg1 = field564;
		}

		field567 = arg2;
		field565 = arg3;
		field568 = arg0;
		field566 = arg1;
		field569 = field568 - 1;
		field570 = field568 / 2;
		field571 = field566 / 2;
	}

	@ObfuscatedName("DSAVPBJG.a(I)V")
	public static void method194() {
		int var0 = field564 * field563;
		for (int var1 = 0; var1 < var0; var1++) {
			field562[var1] = 0;
		}
	}

	@ObfuscatedName("DSAVPBJG.a(IIIIIII)V")
	public static void method195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 < field567) {
			arg1 -= field567 - arg3;
			arg3 = field567;
		}

		if (arg2 < field565) {
			arg4 -= field565 - arg2;
			arg2 = field565;
		}

		if (arg1 + arg3 > field568) {
			arg1 = field568 - arg3;
		}

		if (arg2 + arg4 > field566) {
			arg4 = field566 - arg2;
		}

		int var6 = 256 - arg0;
		int var7 = (arg5 >> 16 & 0xFF) * arg0;
		int var8 = (arg5 >> 8 & 0xFF) * arg0;
		int var9 = (arg5 & 0xFF) * arg0;
		int var10 = field563 - arg1;
		int var11 = field563 * arg2 + arg3;
		for (int var12 = 0; var12 < arg4; var12++) {
			for (int var13 = -arg1; var13 < 0; var13++) {
				int var14 = (field562[var11] >> 16 & 0xFF) * var6;
				int var15 = (field562[var11] >> 8 & 0xFF) * var6;
				int var16 = (field562[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field562[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("DSAVPBJG.a(IIIIII)V")
	public static void method196(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 < field567) {
			arg2 -= field567 - arg1;
			arg1 = field567;
		}

		if (arg4 < field565) {
			arg3 -= field565 - arg4;
			arg4 = field565;
		}

		if (arg1 + arg2 > field568) {
			arg2 = field568 - arg1;
		}

		if (arg3 + arg4 > field566) {
			arg3 = field566 - arg4;
		}

		int var5 = field563 - arg2;
		int var6 = field563 * arg4 + arg1;
		for (int var7 = -arg3; var7 < 0; var7++) {
			for (int var8 = -arg2; var8 < 0; var8++) {
				field562[var6++] = arg0;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("DSAVPBJG.a(IIIIBI)V")
	public static void method197(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method199(arg4, arg2, arg0, arg1);
		method199(arg4, arg2, arg0 + arg3 - 1, arg1);
		method201(arg2, arg3, arg0, arg4);
		method201(arg1 + arg2 - 1, arg3, arg0, arg4);
	}

	@ObfuscatedName("DSAVPBJG.b(IIIIIII)V")
	public static void method198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method200(arg3, arg0, arg5, arg2, arg1);
		method200(arg3, arg0 + arg4 - 1, arg5, arg2, arg1);

		if (arg4 >= 3) {
			method202(arg0 + 1, arg2, arg4 - 2, arg3, arg5);
			method202(arg0 + 1, arg1 + arg2 - 1, arg4 - 2, arg3, arg5);
		}
	}

	@ObfuscatedName("DSAVPBJG.a(IIIII)V")
	public static void method199(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field565 && arg2 < field566) {
			if (arg1 < field567) {
				arg3 -= field567 - arg1;
				arg1 = field567;
			}

			if (arg1 + arg3 > field568) {
				arg3 = field568 - arg1;
			}

			int var4 = field563 * arg2 + arg1;
			for (int var5 = 0; var5 < arg3; var5++) {
				field562[var4 + var5] = arg0;
			}
		}
	}

	@ObfuscatedName("DSAVPBJG.a(IZIIII)V")
	public static void method200(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 >= field565 && arg1 < field566) {
			if (arg3 < field567) {
				arg4 -= field567 - arg3;
				arg3 = field567;
			}

			if (arg3 + arg4 > field568) {
				arg4 = field568 - arg3;
			}

			int var5 = 256 - arg2;
			int var6 = (arg0 >> 16 & 0xFF) * arg2;
			int var7 = (arg0 >> 8 & 0xFF) * arg2;
			int var8 = (arg0 & 0xFF) * arg2;
			int var9 = field563 * arg1 + arg3;
			for (int var10 = 0; var10 < arg4; var10++) {
				int var11 = (field562[var9] >> 16 & 0xFF) * var5;
				int var12 = (field562[var9] >> 8 & 0xFF) * var5;
				int var13 = (field562[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field562[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("DSAVPBJG.a(IIIIB)V")
	public static void method201(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field567 && arg0 < field568) {
			if (arg2 < field565) {
				arg1 -= field565 - arg2;
				arg2 = field565;
			}

			if (arg1 + arg2 > field566) {
				arg1 = field566 - arg2;
			}

			int var4 = field563 * arg2 + arg0;
			for (int var5 = 0; var5 < arg1; var5++) {
				field562[field563 * var5 + var4] = arg3;
			}
		}
	}

	@ObfuscatedName("DSAVPBJG.b(IIIIII)V")
	public static void method202(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 >= field567 && arg1 < field568) {
			if (arg0 < field565) {
				arg2 -= field565 - arg0;
				arg0 = field565;
			}

			if (arg0 + arg2 > field566) {
				arg2 = field566 - arg0;
			}

			int var5 = 256 - arg4;
			int var6 = (arg3 >> 16 & 0xFF) * arg4;
			int var7 = (arg3 >> 8 & 0xFF) * arg4;
			int var8 = (arg3 & 0xFF) * arg4;
			int var9 = field563 * arg0 + arg1;
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = (field562[var9] >> 16 & 0xFF) * var5;
				int var12 = (field562[var9] >> 8 & 0xFF) * var5;
				int var13 = (field562[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field562[var9] = var14;
				var9 += field563;
			}
		}
	}
}
