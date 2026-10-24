package deob;

@ObfuscatedName("OKWPDMPE")
public class OKWPDMPE extends UXRJCYSS {

	@ObfuscatedName("OKWPDMPE.p")
	public static int field980;

	@ObfuscatedName("OKWPDMPE.q")
	public static int field981;

	@ObfuscatedName("OKWPDMPE.r")
	public static int field982;

	@ObfuscatedName("OKWPDMPE.s")
	public static int field983;

	@ObfuscatedName("OKWPDMPE.t")
	public static int field984;

	@ObfuscatedName("OKWPDMPE.u")
	public static int field985;

	@ObfuscatedName("OKWPDMPE.v")
	public static int field986;

	@ObfuscatedName("OKWPDMPE.w")
	public static int field987;

	@ObfuscatedName("OKWPDMPE.x")
	public static int field988;

	@ObfuscatedName("OKWPDMPE.o")
	public static int[] field979;

	@ObfuscatedName("OKWPDMPE.a(ZII[I)V")
	public static void method431(int arg0, int arg1, int[] arg2) {
		field979 = arg2;
		field980 = arg0;
		field981 = arg1;
		method433(arg0, arg1, 0, 0);
	}

	@ObfuscatedName("OKWPDMPE.a(B)V")
	public static void method432() {
		field984 = 0;
		field982 = 0;
		field985 = field980;
		field983 = field981;
		field986 = field985 - 1;
		field987 = field985 / 2;
	}

	@ObfuscatedName("OKWPDMPE.a(IIIII)V")
	public static void method433(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 < 0) {
			arg2 = 0;
		}

		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg0 > field980) {
			arg0 = field980;
		}

		if (arg1 > field981) {
			arg1 = field981;
		}

		field984 = arg2;
		field982 = arg3;
		field985 = arg0;
		field983 = arg1;
		field986 = field985 - 1;
		field987 = field985 / 2;
		field988 = field983 / 2;
	}

	@ObfuscatedName("OKWPDMPE.a(I)V")
	public static void method434() {
		int var0 = field981 * field980;
		for (int var1 = 0; var1 < var0; var1++) {
			field979[var1] = 0;
		}
	}

	@ObfuscatedName("OKWPDMPE.a(IBIIIII)V")
	public static void method435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 < field984) {
			arg3 -= field984 - arg2;
			arg2 = field984;
		}

		if (arg4 < field982) {
			arg0 -= field982 - arg4;
			arg4 = field982;
		}

		if (arg2 + arg3 > field985) {
			arg3 = field985 - arg2;
		}

		if (arg0 + arg4 > field983) {
			arg0 = field983 - arg4;
		}

		int var6 = 256 - arg5;
		int var7 = (arg1 >> 16 & 0xFF) * arg5;
		int var8 = (arg1 >> 8 & 0xFF) * arg5;
		int var9 = (arg1 & 0xFF) * arg5;
		int var10 = field980 - arg3;
		int var11 = field980 * arg4 + arg2;
		for (int var12 = 0; var12 < arg0; var12++) {
			for (int var13 = -arg3; var13 < 0; var13++) {
				int var14 = (field979[var11] >> 16 & 0xFF) * var6;
				int var15 = (field979[var11] >> 8 & 0xFF) * var6;
				int var16 = (field979[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field979[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("OKWPDMPE.a(IIIIII)V")
	public static void method436(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 < field984) {
			arg3 -= field984 - arg0;
			arg0 = field984;
		}

		if (arg1 < field982) {
			arg4 -= field982 - arg1;
			arg1 = field982;
		}

		if (arg0 + arg3 > field985) {
			arg3 = field985 - arg0;
		}

		if (arg1 + arg4 > field983) {
			arg4 = field983 - arg1;
		}

		int var5 = field980 - arg3;
		int var6 = field980 * arg1 + arg0;
		for (int var7 = -arg4; var7 < 0; var7++) {
			for (int var8 = -arg3; var8 < 0; var8++) {
				field979[var6++] = arg2;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("OKWPDMPE.b(IIIIII)V")
	public static void method437(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method439(arg4, arg1, arg3, arg2);
		method439(arg4, arg0 + arg1 - 1, arg3, arg2);
		method441(arg2, arg1, arg3, arg0);
		method441(arg2 + arg4 - 1, arg1, arg3, arg0);
	}

	@ObfuscatedName("OKWPDMPE.a(IIIIIII)V")
	public static void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method440(arg3, arg2, arg4, arg0, arg1);
		method440(arg3, arg2, arg4, arg0 + arg5 - 1, arg1);

		if (arg5 >= 3) {
			method442(arg1, arg5 - 2, arg0 + 1, arg3, arg2);
			method442(arg1 + arg4 - 1, arg5 - 2, arg0 + 1, arg3, arg2);
		}
	}

	@ObfuscatedName("OKWPDMPE.a(IIZII)V")
	public static void method439(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field982 && arg1 < field983) {
			if (arg3 < field984) {
				arg0 -= field984 - arg3;
				arg3 = field984;
			}

			if (arg0 + arg3 > field985) {
				arg0 = field985 - arg3;
			}

			int var4 = field980 * arg1 + arg3;
			for (int var5 = 0; var5 < arg0; var5++) {
				field979[var4 + var5] = arg2;
			}
		}
	}

	@ObfuscatedName("OKWPDMPE.a(IIIZII)V")
	public static void method440(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 >= field982 && arg3 < field983) {
			if (arg4 < field984) {
				arg2 -= field984 - arg4;
				arg4 = field984;
			}

			if (arg2 + arg4 > field985) {
				arg2 = field985 - arg4;
			}

			int var5 = 256 - arg0;
			int var6 = (arg1 >> 16 & 0xFF) * arg0;
			int var7 = (arg1 >> 8 & 0xFF) * arg0;
			int var8 = (arg1 & 0xFF) * arg0;
			int var9 = field980 * arg3 + arg4;
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = (field979[var9] >> 16 & 0xFF) * var5;
				int var12 = (field979[var9] >> 8 & 0xFF) * var5;
				int var13 = (field979[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field979[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("OKWPDMPE.b(IIIII)V")
	public static void method441(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field984 && arg0 < field985) {
			if (arg1 < field982) {
				arg3 -= field982 - arg1;
				arg1 = field982;
			}

			if (arg1 + arg3 > field983) {
				arg3 = field983 - arg1;
			}

			int var4 = field980 * arg1 + arg0;
			for (int var5 = 0; var5 < arg3; var5++) {
				field979[field980 * var5 + var4] = arg2;
			}
		}
	}

	@ObfuscatedName("OKWPDMPE.c(IIIIII)V")
	public static void method442(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field984 && arg0 < field985) {
			if (arg2 < field982) {
				arg1 -= field982 - arg2;
				arg2 = field982;
			}

			if (arg1 + arg2 > field983) {
				arg1 = field983 - arg2;
			}

			int var5 = 256 - arg3;
			int var6 = (arg4 >> 16 & 0xFF) * arg3;
			int var7 = (arg4 >> 8 & 0xFF) * arg3;
			int var8 = (arg4 & 0xFF) * arg3;
			int var9 = field980 * arg2 + arg0;
			for (int var10 = 0; var10 < arg1; var10++) {
				int var11 = (field979[var9] >> 16 & 0xFF) * var5;
				int var12 = (field979[var9] >> 8 & 0xFF) * var5;
				int var13 = (field979[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field979[var9] = var14;
				var9 += field980;
			}
		}
	}
}
