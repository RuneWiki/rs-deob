package deob;

@ObfuscatedName("GBJWVQAY")
public class GBJWVQAY extends KIFEZIQJ {

	@ObfuscatedName("GBJWVQAY.n")
	public static int field821;

	@ObfuscatedName("GBJWVQAY.o")
	public static int field822;

	@ObfuscatedName("GBJWVQAY.p")
	public static int field823;

	@ObfuscatedName("GBJWVQAY.q")
	public static int field824;

	@ObfuscatedName("GBJWVQAY.r")
	public static int field825;

	@ObfuscatedName("GBJWVQAY.s")
	public static int field826;

	@ObfuscatedName("GBJWVQAY.t")
	public static int field827;

	@ObfuscatedName("GBJWVQAY.u")
	public static int field828;

	@ObfuscatedName("GBJWVQAY.v")
	public static int field829;

	@ObfuscatedName("GBJWVQAY.m")
	public static int[] field820;

	@ObfuscatedName("GBJWVQAY.a(III[I)V")
	public static void method284(int arg0, int arg1, int[] arg2) {
		field820 = arg2;
		field821 = arg1;
		field822 = arg0;
		method286(0, 0, arg1, arg0);
	}

	@ObfuscatedName("GBJWVQAY.a(I)V")
	public static void method285() {
		field825 = 0;
		field823 = 0;
		field826 = field821;
		field824 = field822;
		field827 = field826 - 1;
		field828 = field826 / 2;
	}

	@ObfuscatedName("GBJWVQAY.a(IIBII)V")
	public static void method286(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg2 > field821) {
			arg2 = field821;
		}

		if (arg3 > field822) {
			arg3 = field822;
		}

		field825 = arg1;
		field823 = arg0;
		field826 = arg2;
		field824 = arg3;
		field827 = field826 - 1;
		field828 = field826 / 2;
		field829 = field824 / 2;
	}

	@ObfuscatedName("GBJWVQAY.a(Z)V")
	public static void method287() {
		int var0 = field822 * field821;
		for (int var1 = 0; var1 < var0; var1++) {
			field820[var1] = 0;
		}
	}

	@ObfuscatedName("GBJWVQAY.a(IIIIIII)V")
	public static void method288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 < field825) {
			arg2 -= field825 - arg1;
			arg1 = field825;
		}

		if (arg4 < field823) {
			arg3 -= field823 - arg4;
			arg4 = field823;
		}

		if (arg1 + arg2 > field826) {
			arg2 = field826 - arg1;
		}

		if (arg3 + arg4 > field824) {
			arg3 = field824 - arg4;
		}

		int var6 = 256 - arg0;
		int var7 = (arg5 >> 16 & 0xFF) * arg0;
		int var8 = (arg5 >> 8 & 0xFF) * arg0;
		int var9 = (arg5 & 0xFF) * arg0;
		int var10 = field821 - arg2;
		int var11 = field821 * arg4 + arg1;
		for (int var12 = 0; var12 < arg3; var12++) {
			for (int var13 = -arg2; var13 < 0; var13++) {
				int var14 = (field820[var11] >> 16 & 0xFF) * var6;
				int var15 = (field820[var11] >> 8 & 0xFF) * var6;
				int var16 = (field820[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field820[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("GBJWVQAY.a(IIIIII)V")
	public static void method289(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 < field825) {
			arg0 -= field825 - arg1;
			arg1 = field825;
		}

		if (arg3 < field823) {
			arg4 -= field823 - arg3;
			arg3 = field823;
		}

		if (arg0 + arg1 > field826) {
			arg0 = field826 - arg1;
		}

		if (arg3 + arg4 > field824) {
			arg4 = field824 - arg3;
		}

		int var5 = field821 - arg0;
		int var6 = field821 * arg3 + arg1;
		for (int var7 = -arg4; var7 < 0; var7++) {
			for (int var8 = -arg0; var8 < 0; var8++) {
				field820[var6++] = arg2;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("GBJWVQAY.b(IIIIII)V")
	public static void method290(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method292(arg3, arg2, arg4, arg1);
		method292(arg3, arg2, arg0 + arg4 - 1, arg1);
		method294(arg0, arg4, arg2, arg1);
		method294(arg0, arg4, arg2 + arg3 - 1, arg1);
	}

	@ObfuscatedName("GBJWVQAY.b(IIIIIII)V")
	public static void method291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method293(arg5, arg2, arg0, arg1, arg3);
		method293(arg5, arg2, arg0, arg1 + arg4 - 1, arg3);

		if (arg4 >= 3) {
			method295(arg4 - 2, arg0, arg2, arg1 + 1, arg5);
			method295(arg4 - 2, arg0, arg2 + arg3 - 1, arg1 + 1, arg5);
		}
	}

	@ObfuscatedName("GBJWVQAY.a(IIIII)V")
	public static void method292(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field823 && arg2 < field824) {
			if (arg1 < field825) {
				arg0 -= field825 - arg1;
				arg1 = field825;
			}

			if (arg0 + arg1 > field826) {
				arg0 = field826 - arg1;
			}

			int var4 = field821 * arg2 + arg1;
			for (int var5 = 0; var5 < arg0; var5++) {
				field820[var4 + var5] = arg3;
			}
		}
	}

	@ObfuscatedName("GBJWVQAY.a(IIIIIZ)V")
	public static void method293(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 >= field823 && arg3 < field824) {
			if (arg1 < field825) {
				arg4 -= field825 - arg1;
				arg1 = field825;
			}

			if (arg1 + arg4 > field826) {
				arg4 = field826 - arg1;
			}

			int var5 = 256 - arg0;
			int var6 = (arg2 >> 16 & 0xFF) * arg0;
			int var7 = (arg2 >> 8 & 0xFF) * arg0;
			int var8 = (arg2 & 0xFF) * arg0;
			int var9 = field821 * arg3 + arg1;
			for (int var10 = 0; var10 < arg4; var10++) {
				int var11 = (field820[var9] >> 16 & 0xFF) * var5;
				int var12 = (field820[var9] >> 8 & 0xFF) * var5;
				int var13 = (field820[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field820[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("GBJWVQAY.a(IIIIB)V")
	public static void method294(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field825 && arg2 < field826) {
			if (arg1 < field823) {
				arg0 -= field823 - arg1;
				arg1 = field823;
			}

			if (arg0 + arg1 > field824) {
				arg0 = field824 - arg1;
			}

			int var4 = field821 * arg1 + arg2;
			for (int var5 = 0; var5 < arg0; var5++) {
				field820[field821 * var5 + var4] = arg3;
			}
		}
	}

	@ObfuscatedName("GBJWVQAY.c(IIIIII)V")
	public static void method295(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 >= field825 && arg2 < field826) {
			if (arg3 < field823) {
				arg0 -= field823 - arg3;
				arg3 = field823;
			}

			if (arg0 + arg3 > field824) {
				arg0 = field824 - arg3;
			}

			int var5 = 256 - arg4;
			int var6 = (arg1 >> 16 & 0xFF) * arg4;
			int var7 = (arg1 >> 8 & 0xFF) * arg4;
			int var8 = (arg1 & 0xFF) * arg4;
			int var9 = field821 * arg3 + arg2;
			for (int var10 = 0; var10 < arg0; var10++) {
				int var11 = (field820[var9] >> 16 & 0xFF) * var5;
				int var12 = (field820[var9] >> 8 & 0xFF) * var5;
				int var13 = (field820[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field820[var9] = var14;
				var9 += field821;
			}
		}
	}
}
