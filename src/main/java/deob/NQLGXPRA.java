package deob;

@ObfuscatedName("NQLGXPRA")
public class NQLGXPRA extends KWULTEKW {

	@ObfuscatedName("NQLGXPRA.m")
	public static int field978;

	@ObfuscatedName("NQLGXPRA.n")
	public static int field979;

	@ObfuscatedName("NQLGXPRA.o")
	public static int field980;

	@ObfuscatedName("NQLGXPRA.p")
	public static int field981;

	@ObfuscatedName("NQLGXPRA.q")
	public static int field982;

	@ObfuscatedName("NQLGXPRA.r")
	public static int field983;

	@ObfuscatedName("NQLGXPRA.s")
	public static int field984;

	@ObfuscatedName("NQLGXPRA.t")
	public static int field985;

	@ObfuscatedName("NQLGXPRA.u")
	public static int field986;

	@ObfuscatedName("NQLGXPRA.l")
	public static int[] field977;

	@ObfuscatedName("NQLGXPRA.a(I[III)V")
	public static void method388(int arg0, int[] arg1, int arg2) {
		field977 = arg1;
		field978 = arg0;
		field979 = arg2;
		method390(0, arg2, 0, arg0);
	}

	@ObfuscatedName("NQLGXPRA.a(I)V")
	public static void method389() {
		field982 = 0;
		field980 = 0;
		field983 = field978;
		field981 = field979;
		field984 = field983 - 1;
		field985 = field983 / 2;
	}

	@ObfuscatedName("NQLGXPRA.a(IIBII)V")
	public static void method390(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg2 < 0) {
			arg2 = 0;
		}

		if (arg3 > field978) {
			arg3 = field978;
		}

		if (arg1 > field979) {
			arg1 = field979;
		}

		field982 = arg0;
		field980 = arg2;
		field983 = arg3;
		field981 = arg1;
		field984 = field983 - 1;
		field985 = field983 / 2;
		field986 = field981 / 2;
	}

	@ObfuscatedName("NQLGXPRA.b(I)V")
	public static void method391() {
		int var0 = field979 * field978;
		for (int var1 = 0; var1 < var0; var1++) {
			field977[var1] = 0;
		}
	}

	@ObfuscatedName("NQLGXPRA.a(IIIIIII)V")
	public static void method392(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg5 < field982) {
			arg0 -= field982 - arg5;
			arg5 = field982;
		}

		if (arg1 < field980) {
			arg4 -= field980 - arg1;
			arg1 = field980;
		}

		if (arg0 + arg5 > field983) {
			arg0 = field983 - arg5;
		}

		if (arg1 + arg4 > field981) {
			arg4 = field981 - arg1;
		}

		int var6 = 256 - arg3;
		int var7 = (arg2 >> 16 & 0xFF) * arg3;
		int var8 = (arg2 >> 8 & 0xFF) * arg3;
		int var9 = (arg2 & 0xFF) * arg3;
		int var10 = field978 - arg0;
		int var11 = field978 * arg1 + arg5;
		for (int var12 = 0; var12 < arg4; var12++) {
			for (int var13 = -arg0; var13 < 0; var13++) {
				int var14 = (field977[var11] >> 16 & 0xFF) * var6;
				int var15 = (field977[var11] >> 8 & 0xFF) * var6;
				int var16 = (field977[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field977[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("NQLGXPRA.a(IIIIII)V")
	public static void method393(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 < field982) {
			arg4 -= field982 - arg0;
			arg0 = field982;
		}

		if (arg3 < field980) {
			arg2 -= field980 - arg3;
			arg3 = field980;
		}

		if (arg0 + arg4 > field983) {
			arg4 = field983 - arg0;
		}

		if (arg2 + arg3 > field981) {
			arg2 = field981 - arg3;
		}

		int var5 = field978 - arg4;
		int var6 = field978 * arg3 + arg0;
		for (int var7 = -arg2; var7 < 0; var7++) {
			for (int var8 = -arg4; var8 < 0; var8++) {
				field977[var6++] = arg1;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("NQLGXPRA.a(IBIIII)V")
	public static void method394(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method396(arg1, arg0, arg4, arg2);
		method396(arg1 + arg3 - 1, arg0, arg4, arg2);
		method398(arg0, arg1, arg4, arg3);
		method398(arg0, arg1, arg2 + arg4 - 1, arg3);
	}

	@ObfuscatedName("NQLGXPRA.b(IIIIIII)V")
	public static void method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method397(arg0, arg2, arg5, arg1, arg4);
		method397(arg0 + arg3 - 1, arg2, arg5, arg1, arg4);

		if (arg3 >= 3) {
			method399(arg0 + 1, arg1, arg3 - 2, arg4, arg2);
			method399(arg0 + 1, arg1 + arg5 - 1, arg3 - 2, arg4, arg2);
		}
	}

	@ObfuscatedName("NQLGXPRA.a(IIIII)V")
	public static void method396(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field980 && arg0 < field981) {
			if (arg2 < field982) {
				arg3 -= field982 - arg2;
				arg2 = field982;
			}

			if (arg2 + arg3 > field983) {
				arg3 = field983 - arg2;
			}

			int var4 = field978 * arg0 + arg2;
			for (int var5 = 0; var5 < arg3; var5++) {
				field977[var4 + var5] = arg1;
			}
		}
	}

	@ObfuscatedName("NQLGXPRA.a(IIBIII)V")
	public static void method397(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field980 && arg0 < field981) {
			if (arg3 < field982) {
				arg2 -= field982 - arg3;
				arg3 = field982;
			}

			if (arg2 + arg3 > field983) {
				arg2 = field983 - arg3;
			}

			int var5 = 256 - arg1;
			int var6 = (arg4 >> 16 & 0xFF) * arg1;
			int var7 = (arg4 >> 8 & 0xFF) * arg1;
			int var8 = (arg4 & 0xFF) * arg1;
			int var9 = field978 * arg0 + arg3;
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = (field977[var9] >> 16 & 0xFF) * var5;
				int var12 = (field977[var9] >> 8 & 0xFF) * var5;
				int var13 = (field977[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field977[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("NQLGXPRA.b(IIIII)V")
	public static void method398(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field982 && arg2 < field983) {
			if (arg1 < field980) {
				arg3 -= field980 - arg1;
				arg1 = field980;
			}

			if (arg1 + arg3 > field981) {
				arg3 = field981 - arg1;
			}

			int var4 = field978 * arg1 + arg2;
			for (int var5 = 0; var5 < arg3; var5++) {
				field977[field978 * var5 + var4] = arg0;
			}
		}
	}

	@ObfuscatedName("NQLGXPRA.a(IIIIIB)V")
	public static void method399(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 >= field982 && arg1 < field983) {
			if (arg0 < field980) {
				arg2 -= field980 - arg0;
				arg0 = field980;
			}

			if (arg0 + arg2 > field981) {
				arg2 = field981 - arg0;
			}

			int var5 = 256 - arg4;
			int var6 = (arg3 >> 16 & 0xFF) * arg4;
			int var7 = (arg3 >> 8 & 0xFF) * arg4;
			int var8 = (arg3 & 0xFF) * arg4;
			int var9 = field978 * arg0 + arg1;
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = (field977[var9] >> 16 & 0xFF) * var5;
				int var12 = (field977[var9] >> 8 & 0xFF) * var5;
				int var13 = (field977[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field977[var9] = var14;
				var9 += field978;
			}
		}
	}
}
