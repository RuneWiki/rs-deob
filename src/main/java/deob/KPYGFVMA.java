package deob;

@ObfuscatedName("KPYGFVMA")
public class KPYGFVMA extends OZZFMONJ {

	@ObfuscatedName("KPYGFVMA.m")
	public static int field969;

	@ObfuscatedName("KPYGFVMA.n")
	public static int field970;

	@ObfuscatedName("KPYGFVMA.o")
	public static int field971;

	@ObfuscatedName("KPYGFVMA.p")
	public static int field972;

	@ObfuscatedName("KPYGFVMA.q")
	public static int field973;

	@ObfuscatedName("KPYGFVMA.r")
	public static int field974;

	@ObfuscatedName("KPYGFVMA.s")
	public static int field975;

	@ObfuscatedName("KPYGFVMA.t")
	public static int field976;

	@ObfuscatedName("KPYGFVMA.u")
	public static int field977;

	@ObfuscatedName("KPYGFVMA.l")
	public static int[] field968;

	@ObfuscatedName("KPYGFVMA.a(IBI[I)V")
	public static void method310(int arg0, int arg1, int[] arg2) {
		field968 = arg2;
		field969 = arg0;
		field970 = arg1;
		method312(0, arg1, arg0, 0);
	}

	@ObfuscatedName("KPYGFVMA.a(I)V")
	public static void method311() {
		field973 = 0;
		field971 = 0;
		field974 = field969;
		field972 = field970;
		field975 = field974 - 1;
		field976 = field974 / 2;
	}

	@ObfuscatedName("KPYGFVMA.a(IIIII)V")
	public static void method312(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg2 > field969) {
			arg2 = field969;
		}

		if (arg1 > field970) {
			arg1 = field970;
		}

		field973 = arg3;
		field971 = arg0;
		field974 = arg2;
		field972 = arg1;
		field975 = field974 - 1;
		field976 = field974 / 2;
		field977 = field972 / 2;
	}

	@ObfuscatedName("KPYGFVMA.a(B)V")
	public static void method313() {
		int var0 = field970 * field969;
		for (int var1 = 0; var1 < var0; var1++) {
			field968[var1] = 0;
		}
	}

	@ObfuscatedName("KPYGFVMA.a(IIIIIII)V")
	public static void method314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 < field973) {
			arg3 -= field973 - arg1;
			arg1 = field973;
		}

		if (arg5 < field971) {
			arg4 -= field971 - arg5;
			arg5 = field971;
		}

		if (arg1 + arg3 > field974) {
			arg3 = field974 - arg1;
		}

		if (arg4 + arg5 > field972) {
			arg4 = field972 - arg5;
		}

		int var6 = 256 - arg2;
		int var7 = (arg0 >> 16 & 0xFF) * arg2;
		int var8 = (arg0 >> 8 & 0xFF) * arg2;
		int var9 = (arg0 & 0xFF) * arg2;
		int var10 = field969 - arg3;
		int var11 = field969 * arg5 + arg1;
		for (int var12 = 0; var12 < arg4; var12++) {
			for (int var13 = -arg3; var13 < 0; var13++) {
				int var14 = (field968[var11] >> 16 & 0xFF) * var6;
				int var15 = (field968[var11] >> 8 & 0xFF) * var6;
				int var16 = (field968[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field968[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("KPYGFVMA.a(IBIIII)V")
	public static void method315(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 < field973) {
			arg4 -= field973 - arg1;
			arg1 = field973;
		}

		if (arg2 < field971) {
			arg3 -= field971 - arg2;
			arg2 = field971;
		}

		if (arg1 + arg4 > field974) {
			arg4 = field974 - arg1;
		}

		if (arg2 + arg3 > field972) {
			arg3 = field972 - arg2;
		}

		int var5 = field969 - arg4;
		int var6 = field969 * arg2 + arg1;
		for (int var7 = -arg3; var7 < 0; var7++) {
			for (int var8 = -arg4; var8 < 0; var8++) {
				field968[var6++] = arg0;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("KPYGFVMA.a(IIIIII)V")
	public static void method316(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method318(arg1, arg0, arg3, arg4);
		method318(arg1 + arg2 - 1, arg0, arg3, arg4);
		method320(arg3, arg4, arg1, arg2);
		method320(arg0 + arg3 - 1, arg4, arg1, arg2);
	}

	@ObfuscatedName("KPYGFVMA.b(IIIIIII)V")
	public static void method317(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method319(arg3, arg4, arg1, arg2, arg5);
		method319(arg3, arg4, arg1, arg2, arg0 + arg5 - 1);

		if (arg0 >= 3) {
			method321(arg4, arg5 + 1, arg2, arg0 - 2, arg3);
			method321(arg1 + arg4 - 1, arg5 + 1, arg2, arg0 - 2, arg3);
		}
	}

	@ObfuscatedName("KPYGFVMA.a(IIZII)V")
	public static void method318(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field971 && arg0 < field972) {
			if (arg2 < field973) {
				arg1 -= field973 - arg2;
				arg2 = field973;
			}

			if (arg1 + arg2 > field974) {
				arg1 = field974 - arg2;
			}

			int var4 = field969 * arg0 + arg2;
			for (int var5 = 0; var5 < arg1; var5++) {
				field968[var4 + var5] = arg3;
			}
		}
	}

	@ObfuscatedName("KPYGFVMA.b(IIIIII)V")
	public static void method319(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 >= field971 && arg4 < field972) {
			if (arg1 < field973) {
				arg2 -= field973 - arg1;
				arg1 = field973;
			}

			if (arg1 + arg2 > field974) {
				arg2 = field974 - arg1;
			}

			int var5 = 256 - arg0;
			int var6 = (arg3 >> 16 & 0xFF) * arg0;
			int var7 = (arg3 >> 8 & 0xFF) * arg0;
			int var8 = (arg3 & 0xFF) * arg0;
			int var9 = field969 * arg4 + arg1;
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = (field968[var9] >> 16 & 0xFF) * var5;
				int var12 = (field968[var9] >> 8 & 0xFF) * var5;
				int var13 = (field968[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field968[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("KPYGFVMA.a(BIIII)V")
	public static void method320(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field973 && arg0 < field974) {
			if (arg2 < field971) {
				arg3 -= field971 - arg2;
				arg2 = field971;
			}

			if (arg2 + arg3 > field972) {
				arg3 = field972 - arg2;
			}

			int var4 = field969 * arg2 + arg0;
			for (int var5 = 0; var5 < arg3; var5++) {
				field968[field969 * var5 + var4] = arg1;
			}
		}
	}

	@ObfuscatedName("KPYGFVMA.a(IIIBII)V")
	public static void method321(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field973 && arg0 < field974) {
			if (arg1 < field971) {
				arg3 -= field971 - arg1;
				arg1 = field971;
			}

			if (arg1 + arg3 > field972) {
				arg3 = field972 - arg1;
			}

			int var5 = 256 - arg4;
			int var6 = (arg2 >> 16 & 0xFF) * arg4;
			int var7 = (arg2 >> 8 & 0xFF) * arg4;
			int var8 = (arg2 & 0xFF) * arg4;
			int var9 = field969 * arg1 + arg0;
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = (field968[var9] >> 16 & 0xFF) * var5;
				int var12 = (field968[var9] >> 8 & 0xFF) * var5;
				int var13 = (field968[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field968[var9] = var14;
				var9 += field969;
			}
		}
	}
}
