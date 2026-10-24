package deob;

@ObfuscatedName("JJXDTORW")
public class JJXDTORW extends FRLKXEIS {

	@ObfuscatedName("JJXDTORW.p")
	public static int field965;

	@ObfuscatedName("JJXDTORW.q")
	public static int field966;

	@ObfuscatedName("JJXDTORW.r")
	public static int field967;

	@ObfuscatedName("JJXDTORW.s")
	public static int field968;

	@ObfuscatedName("JJXDTORW.t")
	public static int field969;

	@ObfuscatedName("JJXDTORW.u")
	public static int field970;

	@ObfuscatedName("JJXDTORW.v")
	public static int field971;

	@ObfuscatedName("JJXDTORW.w")
	public static int field972;

	@ObfuscatedName("JJXDTORW.x")
	public static int field973;

	@ObfuscatedName("JJXDTORW.o")
	public static int[] field964;

	@ObfuscatedName("JJXDTORW.a(III[I)V")
	public static void method412(int arg0, int arg1, int[] arg2) {
		field964 = arg2;
		field965 = arg1;
		field966 = arg0;
		method414(0, arg1, 0, arg0);
	}

	@ObfuscatedName("JJXDTORW.a(B)V")
	public static void method413() {
		field969 = 0;
		field967 = 0;
		field970 = field965;
		field968 = field966;
		field971 = field970 - 1;
		field972 = field970 / 2;
	}

	@ObfuscatedName("JJXDTORW.a(IIZII)V")
	public static void method414(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg2 < 0) {
			arg2 = 0;
		}

		if (arg1 > field965) {
			arg1 = field965;
		}

		if (arg3 > field966) {
			arg3 = field966;
		}

		field969 = arg0;
		field967 = arg2;
		field970 = arg1;
		field968 = arg3;
		field971 = field970 - 1;
		field972 = field970 / 2;
		field973 = field968 / 2;
	}

	@ObfuscatedName("JJXDTORW.a(I)V")
	public static void method415() {
		int var0 = field966 * field965;
		for (int var1 = 0; var1 < var0; var1++) {
			field964[var1] = 0;
		}
	}

	@ObfuscatedName("JJXDTORW.a(IIBIIII)V")
	public static void method416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 < field969) {
			arg3 -= field969 - arg0;
			arg0 = field969;
		}

		if (arg4 < field967) {
			arg1 -= field967 - arg4;
			arg4 = field967;
		}

		if (arg0 + arg3 > field970) {
			arg3 = field970 - arg0;
		}

		if (arg1 + arg4 > field968) {
			arg1 = field968 - arg4;
		}

		int var6 = 256 - arg5;
		int var7 = (arg2 >> 16 & 0xFF) * arg5;
		int var8 = (arg2 >> 8 & 0xFF) * arg5;
		int var9 = (arg2 & 0xFF) * arg5;
		int var10 = field965 - arg3;
		int var11 = field965 * arg4 + arg0;
		for (int var12 = 0; var12 < arg1; var12++) {
			for (int var13 = -arg3; var13 < 0; var13++) {
				int var14 = (field964[var11] >> 16 & 0xFF) * var6;
				int var15 = (field964[var11] >> 8 & 0xFF) * var6;
				int var16 = (field964[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field964[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("JJXDTORW.a(IIIIII)V")
	public static void method417(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 < field969) {
			arg3 -= field969 - arg2;
			arg2 = field969;
		}

		if (arg0 < field967) {
			arg1 -= field967 - arg0;
			arg0 = field967;
		}

		if (arg2 + arg3 > field970) {
			arg3 = field970 - arg2;
		}

		if (arg0 + arg1 > field968) {
			arg1 = field968 - arg0;
		}

		int var5 = field965 - arg3;
		int var6 = field965 * arg0 + arg2;
		for (int var7 = -arg1; var7 < 0; var7++) {
			for (int var8 = -arg3; var8 < 0; var8++) {
				field964[var6++] = arg4;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("JJXDTORW.b(IIIIII)V")
	public static void method418(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method420(arg2, arg3, arg4, arg0);
		method420(arg2, arg1 + arg3 - 1, arg4, arg0);
		method422(arg4, arg2, arg3, arg1);
		method422(arg0 + arg4 - 1, arg2, arg3, arg1);
	}

	@ObfuscatedName("JJXDTORW.a(ZIIIIII)V")
	public static void method419(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method421(arg0, arg4, arg3, arg1, arg2);
		method421(arg0, arg4, arg3, arg1 + arg5 - 1, arg2);

		if (arg5 >= 3) {
			method423(arg2, arg3, arg0, arg5 - 2, arg1 + 1);
			method423(arg2, arg3, arg0 + arg4 - 1, arg5 - 2, arg1 + 1);
		}
	}

	@ObfuscatedName("JJXDTORW.a(IIIII)V")
	public static void method420(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field967 && arg1 < field968) {
			if (arg2 < field969) {
				arg3 -= field969 - arg2;
				arg2 = field969;
			}

			if (arg2 + arg3 > field970) {
				arg3 = field970 - arg2;
			}

			int var4 = field965 * arg1 + arg2;
			for (int var5 = 0; var5 < arg3; var5++) {
				field964[var4 + var5] = arg0;
			}
		}
	}

	@ObfuscatedName("JJXDTORW.c(IIIIII)V")
	public static void method421(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 >= field967 && arg3 < field968) {
			if (arg0 < field969) {
				arg1 -= field969 - arg0;
				arg0 = field969;
			}

			if (arg0 + arg1 > field970) {
				arg1 = field970 - arg0;
			}

			int var5 = 256 - arg4;
			int var6 = (arg2 >> 16 & 0xFF) * arg4;
			int var7 = (arg2 >> 8 & 0xFF) * arg4;
			int var8 = (arg2 & 0xFF) * arg4;
			int var9 = field965 * arg3 + arg0;
			for (int var10 = 0; var10 < arg1; var10++) {
				int var11 = (field964[var9] >> 16 & 0xFF) * var5;
				int var12 = (field964[var9] >> 8 & 0xFF) * var5;
				int var13 = (field964[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field964[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("JJXDTORW.a(IIIZI)V")
	public static void method422(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field969 && arg0 < field970) {
			if (arg2 < field967) {
				arg3 -= field967 - arg2;
				arg2 = field967;
			}

			if (arg2 + arg3 > field968) {
				arg3 = field968 - arg2;
			}

			int var4 = field965 * arg2 + arg0;
			for (int var5 = 0; var5 < arg3; var5++) {
				field964[field965 * var5 + var4] = arg1;
			}
		}
	}

	@ObfuscatedName("JJXDTORW.d(IIIIII)V")
	public static void method423(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 >= field969 && arg2 < field970) {
			if (arg4 < field967) {
				arg3 -= field967 - arg4;
				arg4 = field967;
			}

			if (arg3 + arg4 > field968) {
				arg3 = field968 - arg4;
			}

			int var5 = 256 - arg0;
			int var6 = (arg1 >> 16 & 0xFF) * arg0;
			int var7 = (arg1 >> 8 & 0xFF) * arg0;
			int var8 = (arg1 & 0xFF) * arg0;
			int var9 = field965 * arg4 + arg2;
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = (field964[var9] >> 16 & 0xFF) * var5;
				int var12 = (field964[var9] >> 8 & 0xFF) * var5;
				int var13 = (field964[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field964[var9] = var14;
				var9 += field965;
			}
		}
	}
}
