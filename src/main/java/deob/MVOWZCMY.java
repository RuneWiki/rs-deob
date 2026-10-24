package deob;

@ObfuscatedName("MVOWZCMY")
public class MVOWZCMY extends USMRNXZO {

	@ObfuscatedName("MVOWZCMY.n")
	public static int field978;

	@ObfuscatedName("MVOWZCMY.o")
	public static int field979;

	@ObfuscatedName("MVOWZCMY.p")
	public static int field980;

	@ObfuscatedName("MVOWZCMY.q")
	public static int field981;

	@ObfuscatedName("MVOWZCMY.r")
	public static int field982;

	@ObfuscatedName("MVOWZCMY.s")
	public static int field983;

	@ObfuscatedName("MVOWZCMY.t")
	public static int field984;

	@ObfuscatedName("MVOWZCMY.u")
	public static int field985;

	@ObfuscatedName("MVOWZCMY.v")
	public static int field986;

	@ObfuscatedName("MVOWZCMY.m")
	public static int[] field977;

	@ObfuscatedName("MVOWZCMY.a(III[I)V")
	public static void method340(int arg0, int arg1, int[] arg2) {
		field977 = arg2;
		field978 = arg1;
		field979 = arg0;
		method342(0, 0, arg1, arg0);
	}

	@ObfuscatedName("MVOWZCMY.a(I)V")
	public static void method341() {
		field982 = 0;
		field980 = 0;
		field983 = field978;
		field981 = field979;
		field984 = field983 - 1;
		field985 = field983 / 2;
	}

	@ObfuscatedName("MVOWZCMY.a(IIIII)V")
	public static void method342(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg2 > field978) {
			arg2 = field978;
		}

		if (arg3 > field979) {
			arg3 = field979;
		}

		field982 = arg1;
		field980 = arg0;
		field983 = arg2;
		field981 = arg3;
		field984 = field983 - 1;
		field985 = field983 / 2;
		field986 = field981 / 2;
	}

	@ObfuscatedName("MVOWZCMY.b(I)V")
	public static void method343() {
		int var0 = field979 * field978;
		for (int var1 = 0; var1 < var0; var1++) {
			field977[var1] = 0;
		}
	}

	@ObfuscatedName("MVOWZCMY.a(IIIIIII)V")
	public static void method344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 < field982) {
			arg0 -= field982 - arg1;
			arg1 = field982;
		}

		if (arg3 < field980) {
			arg5 -= field980 - arg3;
			arg3 = field980;
		}

		if (arg0 + arg1 > field983) {
			arg0 = field983 - arg1;
		}

		if (arg3 + arg5 > field981) {
			arg5 = field981 - arg3;
		}

		int var6 = 256 - arg4;
		int var7 = (arg2 >> 16 & 0xFF) * arg4;
		int var8 = (arg2 >> 8 & 0xFF) * arg4;
		int var9 = (arg2 & 0xFF) * arg4;
		int var10 = field978 - arg0;
		int var11 = field978 * arg3 + arg1;
		for (int var12 = 0; var12 < arg5; var12++) {
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

	@ObfuscatedName("MVOWZCMY.a(IIIIII)V")
	public static void method345(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 < field982) {
			arg0 -= field982 - arg2;
			arg2 = field982;
		}

		if (arg4 < field980) {
			arg3 -= field980 - arg4;
			arg4 = field980;
		}

		if (arg0 + arg2 > field983) {
			arg0 = field983 - arg2;
		}

		if (arg3 + arg4 > field981) {
			arg3 = field981 - arg4;
		}

		int var5 = field978 - arg0;
		int var6 = field978 * arg4 + arg2;
		for (int var7 = -arg3; var7 < 0; var7++) {
			for (int var8 = -arg0; var8 < 0; var8++) {
				field977[var6++] = arg1;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("MVOWZCMY.b(IIIIII)V")
	public static void method346(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method348(arg1, arg2, arg0, arg3);
		method348(arg1, arg2 + arg4 - 1, arg0, arg3);
		method350(arg2, arg1, arg4, arg0);
		method350(arg2, arg1, arg4, arg0 + arg3 - 1);
	}

	@ObfuscatedName("MVOWZCMY.b(IIIIIII)V")
	public static void method347(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method349(arg5, arg4, arg3, arg0, arg2);
		method349(arg5, arg4, arg1 + arg3 - 1, arg0, arg2);

		if (arg1 >= 3) {
			method351(arg4, arg3 + 1, arg1 - 2, arg5, arg0);
			method351(arg2 + arg4 - 1, arg3 + 1, arg1 - 2, arg5, arg0);
		}
	}

	@ObfuscatedName("MVOWZCMY.b(IIIII)V")
	public static void method348(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field980 && arg1 < field981) {
			if (arg2 < field982) {
				arg3 -= field982 - arg2;
				arg2 = field982;
			}

			if (arg2 + arg3 > field983) {
				arg3 = field983 - arg2;
			}

			int var4 = field978 * arg1 + arg2;
			for (int var5 = 0; var5 < arg3; var5++) {
				field977[var4 + var5] = arg0;
			}
		}
	}

	@ObfuscatedName("MVOWZCMY.c(IIIIII)V")
	public static void method349(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 >= field980 && arg2 < field981) {
			if (arg1 < field982) {
				arg4 -= field982 - arg1;
				arg1 = field982;
			}

			if (arg1 + arg4 > field983) {
				arg4 = field983 - arg1;
			}

			int var5 = 256 - arg3;
			int var6 = (arg0 >> 16 & 0xFF) * arg3;
			int var7 = (arg0 >> 8 & 0xFF) * arg3;
			int var8 = (arg0 & 0xFF) * arg3;
			int var9 = field978 * arg2 + arg1;
			for (int var10 = 0; var10 < arg4; var10++) {
				int var11 = (field977[var9] >> 16 & 0xFF) * var5;
				int var12 = (field977[var9] >> 8 & 0xFF) * var5;
				int var13 = (field977[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field977[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("MVOWZCMY.a(IIIIZ)V")
	public static void method350(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field982 && arg3 < field983) {
			if (arg0 < field980) {
				arg2 -= field980 - arg0;
				arg0 = field980;
			}

			if (arg0 + arg2 > field981) {
				arg2 = field981 - arg0;
			}

			int var4 = field978 * arg0 + arg3;
			for (int var5 = 0; var5 < arg2; var5++) {
				field977[field978 * var5 + var4] = arg1;
			}
		}
	}

	@ObfuscatedName("MVOWZCMY.a(IIIIZI)V")
	public static void method351(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field982 && arg0 < field983) {
			if (arg1 < field980) {
				arg2 -= field980 - arg1;
				arg1 = field980;
			}

			if (arg1 + arg2 > field981) {
				arg2 = field981 - arg1;
			}

			int var5 = 256 - arg4;
			int var6 = (arg3 >> 16 & 0xFF) * arg4;
			int var7 = (arg3 >> 8 & 0xFF) * arg4;
			int var8 = (arg3 & 0xFF) * arg4;
			int var9 = field978 * arg1 + arg0;
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
