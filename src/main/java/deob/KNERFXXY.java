package deob;

@ObfuscatedName("KNERFXXY")
public class KNERFXXY extends JJFDBATQ {

	@ObfuscatedName("KNERFXXY.o")
	public static int field825;

	@ObfuscatedName("KNERFXXY.p")
	public static int field826;

	@ObfuscatedName("KNERFXXY.q")
	public static int field827;

	@ObfuscatedName("KNERFXXY.r")
	public static int field828;

	@ObfuscatedName("KNERFXXY.s")
	public static int field829;

	@ObfuscatedName("KNERFXXY.t")
	public static int field830;

	@ObfuscatedName("KNERFXXY.u")
	public static int field831;

	@ObfuscatedName("KNERFXXY.v")
	public static int field832;

	@ObfuscatedName("KNERFXXY.w")
	public static int field833;

	@ObfuscatedName("KNERFXXY.n")
	public static int[] field824;

	@ObfuscatedName("KNERFXXY.a(IIB[I)V")
	public static void method279(int arg0, int arg1, int[] arg2) {
		field824 = arg2;
		field825 = arg1;
		field826 = arg0;
		method281(0, arg0, arg1, 0);
	}

	@ObfuscatedName("KNERFXXY.a(Z)V")
	public static void method280() {
		field829 = 0;
		field827 = 0;
		field830 = field825;
		field828 = field826;
		field831 = field830 - 1;
		field832 = field830 / 2;
	}

	@ObfuscatedName("KNERFXXY.a(IIIII)V")
	public static void method281(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg2 > field825) {
			arg2 = field825;
		}

		if (arg1 > field826) {
			arg1 = field826;
		}

		field829 = arg3;
		field827 = arg0;
		field830 = arg2;
		field828 = arg1;
		field831 = field830 - 1;
		field832 = field830 / 2;
		field833 = field828 / 2;
	}

	@ObfuscatedName("KNERFXXY.a(I)V")
	public static void method282() {
		int var0 = field826 * field825;
		for (int var1 = 0; var1 < var0; var1++) {
			field824[var1] = 0;
		}
	}

	@ObfuscatedName("KNERFXXY.a(IIIIIBI)V")
	public static void method283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 < field829) {
			arg2 -= field829 - arg4;
			arg4 = field829;
		}

		if (arg3 < field827) {
			arg0 -= field827 - arg3;
			arg3 = field827;
		}

		if (arg2 + arg4 > field830) {
			arg2 = field830 - arg4;
		}

		if (arg0 + arg3 > field828) {
			arg0 = field828 - arg3;
		}

		int var6 = 256 - arg5;
		int var7 = (arg1 >> 16 & 0xFF) * arg5;
		int var8 = (arg1 >> 8 & 0xFF) * arg5;
		int var9 = (arg1 & 0xFF) * arg5;
		int var10 = field825 - arg2;
		int var11 = field825 * arg3 + arg4;
		for (int var12 = 0; var12 < arg0; var12++) {
			for (int var13 = -arg2; var13 < 0; var13++) {
				int var14 = (field824[var11] >> 16 & 0xFF) * var6;
				int var15 = (field824[var11] >> 8 & 0xFF) * var6;
				int var16 = (field824[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field824[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("KNERFXXY.a(IIIBII)V")
	public static void method284(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 < field829) {
			arg4 -= field829 - arg0;
			arg0 = field829;
		}

		if (arg1 < field827) {
			arg3 -= field827 - arg1;
			arg1 = field827;
		}

		if (arg0 + arg4 > field830) {
			arg4 = field830 - arg0;
		}

		if (arg1 + arg3 > field828) {
			arg3 = field828 - arg1;
		}

		int var5 = field825 - arg4;
		int var6 = field825 * arg1 + arg0;
		for (int var7 = -arg3; var7 < 0; var7++) {
			for (int var8 = -arg4; var8 < 0; var8++) {
				field824[var6++] = arg2;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("KNERFXXY.a(IIIIIB)V")
	public static void method285(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method287(arg2, arg3, arg0, arg4);
		method287(arg2, arg3, arg0 + arg1 - 1, arg4);
		method289(arg2, arg3, arg1, arg0);
		method289(arg2, arg3 + arg4 - 1, arg1, arg0);
	}

	@ObfuscatedName("KNERFXXY.a(IIIIIII)V")
	public static void method286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method288(arg2, arg1, arg3, arg0, arg5);
		method288(arg2, arg1, arg3, arg0, arg4 + arg5 - 1);

		if (arg4 >= 3) {
			method290(arg0, arg2, arg3, arg5 + 1, arg4 - 2);
			method290(arg0, arg1 + arg2 - 1, arg3, arg5 + 1, arg4 - 2);
		}
	}

	@ObfuscatedName("KNERFXXY.a(IIIBI)V")
	public static void method287(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field827 && arg2 < field828) {
			if (arg1 < field829) {
				arg3 -= field829 - arg1;
				arg1 = field829;
			}

			if (arg1 + arg3 > field830) {
				arg3 = field830 - arg1;
			}

			int var4 = field825 * arg2 + arg1;
			for (int var5 = 0; var5 < arg3; var5++) {
				field824[var4 + var5] = arg0;
			}
		}
	}

	@ObfuscatedName("KNERFXXY.a(IIIIII)V")
	public static void method288(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 >= field827 && arg4 < field828) {
			if (arg0 < field829) {
				arg1 -= field829 - arg0;
				arg0 = field829;
			}

			if (arg0 + arg1 > field830) {
				arg1 = field830 - arg0;
			}

			int var5 = 256 - arg2;
			int var6 = (arg3 >> 16 & 0xFF) * arg2;
			int var7 = (arg3 >> 8 & 0xFF) * arg2;
			int var8 = (arg3 & 0xFF) * arg2;
			int var9 = field825 * arg4 + arg0;
			for (int var10 = 0; var10 < arg1; var10++) {
				int var11 = (field824[var9] >> 16 & 0xFF) * var5;
				int var12 = (field824[var9] >> 8 & 0xFF) * var5;
				int var13 = (field824[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field824[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("KNERFXXY.a(ZIIII)V")
	public static void method289(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field829 && arg1 < field830) {
			if (arg3 < field827) {
				arg2 -= field827 - arg3;
				arg3 = field827;
			}

			if (arg2 + arg3 > field828) {
				arg2 = field828 - arg3;
			}

			int var4 = field825 * arg3 + arg1;
			for (int var5 = 0; var5 < arg2; var5++) {
				field824[field825 * var5 + var4] = arg0;
			}
		}
	}

	@ObfuscatedName("KNERFXXY.b(IIIIII)V")
	public static void method290(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 >= field829 && arg1 < field830) {
			if (arg3 < field827) {
				arg4 -= field827 - arg3;
				arg3 = field827;
			}

			if (arg3 + arg4 > field828) {
				arg4 = field828 - arg3;
			}

			int var5 = 256 - arg2;
			int var6 = (arg0 >> 16 & 0xFF) * arg2;
			int var7 = (arg0 >> 8 & 0xFF) * arg2;
			int var8 = (arg0 & 0xFF) * arg2;
			int var9 = field825 * arg3 + arg1;
			for (int var10 = 0; var10 < arg4; var10++) {
				int var11 = (field824[var9] >> 16 & 0xFF) * var5;
				int var12 = (field824[var9] >> 8 & 0xFF) * var5;
				int var13 = (field824[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field824[var9] = var14;
				var9 += field825;
			}
		}
	}
}
