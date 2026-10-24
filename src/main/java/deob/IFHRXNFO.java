package deob;

@ObfuscatedName("IFHRXNFO")
public class IFHRXNFO extends BIJRHVKA {

	@ObfuscatedName("IFHRXNFO.n")
	public static int field760;

	@ObfuscatedName("IFHRXNFO.o")
	public static int field761;

	@ObfuscatedName("IFHRXNFO.p")
	public static int field762;

	@ObfuscatedName("IFHRXNFO.q")
	public static int field763;

	@ObfuscatedName("IFHRXNFO.r")
	public static int field764;

	@ObfuscatedName("IFHRXNFO.s")
	public static int field765;

	@ObfuscatedName("IFHRXNFO.t")
	public static int field766;

	@ObfuscatedName("IFHRXNFO.u")
	public static int field767;

	@ObfuscatedName("IFHRXNFO.v")
	public static int field768;

	@ObfuscatedName("IFHRXNFO.m")
	public static int[] field759;

	@ObfuscatedName("IFHRXNFO.a(I[III)V")
	public static void method310(int arg0, int[] arg1, int arg2) {
		field759 = arg1;
		field760 = arg2;
		field761 = arg0;
		method312(arg2, arg0, 0, 0);
	}

	@ObfuscatedName("IFHRXNFO.a(B)V")
	public static void method311() {
		field764 = 0;
		field762 = 0;
		field765 = field760;
		field763 = field761;
		field766 = field765 - 1;
		field767 = field765 / 2;
	}

	@ObfuscatedName("IFHRXNFO.a(IIIII)V")
	public static void method312(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 < 0) {
			arg2 = 0;
		}

		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg0 > field760) {
			arg0 = field760;
		}

		if (arg1 > field761) {
			arg1 = field761;
		}

		field764 = arg2;
		field762 = arg3;
		field765 = arg0;
		field763 = arg1;
		field766 = field765 - 1;
		field767 = field765 / 2;
		field768 = field763 / 2;
	}

	@ObfuscatedName("IFHRXNFO.a(I)V")
	public static void method313() {
		int var0 = field761 * field760;
		for (int var1 = 0; var1 < var0; var1++) {
			field759[var1] = 0;
		}
	}

	@ObfuscatedName("IFHRXNFO.a(IZIIIII)V")
	public static void method314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 < field764) {
			arg4 -= field764 - arg1;
			arg1 = field764;
		}

		if (arg3 < field762) {
			arg0 -= field762 - arg3;
			arg3 = field762;
		}

		if (arg1 + arg4 > field765) {
			arg4 = field765 - arg1;
		}

		if (arg0 + arg3 > field763) {
			arg0 = field763 - arg3;
		}

		int var6 = 256 - arg2;
		int var7 = (arg5 >> 16 & 0xFF) * arg2;
		int var8 = (arg5 >> 8 & 0xFF) * arg2;
		int var9 = (arg5 & 0xFF) * arg2;
		int var10 = field760 - arg4;
		int var11 = field760 * arg3 + arg1;
		for (int var12 = 0; var12 < arg0; var12++) {
			for (int var13 = -arg4; var13 < 0; var13++) {
				int var14 = (field759[var11] >> 16 & 0xFF) * var6;
				int var15 = (field759[var11] >> 8 & 0xFF) * var6;
				int var16 = (field759[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field759[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("IFHRXNFO.a(IIIIII)V")
	public static void method315(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 < field764) {
			arg2 -= field764 - arg1;
			arg1 = field764;
		}

		if (arg4 < field762) {
			arg3 -= field762 - arg4;
			arg4 = field762;
		}

		if (arg1 + arg2 > field765) {
			arg2 = field765 - arg1;
		}

		if (arg3 + arg4 > field763) {
			arg3 = field763 - arg4;
		}

		int var5 = field760 - arg2;
		int var6 = field760 * arg4 + arg1;
		for (int var7 = -arg3; var7 < 0; var7++) {
			for (int var8 = -arg2; var8 < 0; var8++) {
				field759[var6++] = arg0;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("IFHRXNFO.b(IIIIII)V")
	public static void method316(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method318(arg1, arg0, arg2, arg4);
		method318(arg1, arg0 + arg3 - 1, arg2, arg4);
		method320(arg2, arg4, arg0, arg3);
		method320(arg1 + arg2 - 1, arg4, arg0, arg3);
	}

	@ObfuscatedName("IFHRXNFO.a(IIIIIII)V")
	public static void method317(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method319(arg4, arg1, arg3, arg2, arg0);
		method319(arg4, arg1, arg3 + arg5 - 1, arg2, arg0);

		if (arg5 >= 3) {
			method321(arg4, arg2, arg5 - 2, arg1, arg3 + 1);
			method321(arg4, arg0 + arg2 - 1, arg5 - 2, arg1, arg3 + 1);
		}
	}

	@ObfuscatedName("IFHRXNFO.b(IIIII)V")
	public static void method318(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field762 && arg1 < field763) {
			if (arg2 < field764) {
				arg0 -= field764 - arg2;
				arg2 = field764;
			}

			if (arg0 + arg2 > field765) {
				arg0 = field765 - arg2;
			}

			int var4 = field760 * arg1 + arg2;
			for (int var5 = 0; var5 < arg0; var5++) {
				field759[var4 + var5] = arg3;
			}
		}
	}

	@ObfuscatedName("IFHRXNFO.a(IIBIII)V")
	public static void method319(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 >= field762 && arg2 < field763) {
			if (arg3 < field764) {
				arg4 -= field764 - arg3;
				arg3 = field764;
			}

			if (arg3 + arg4 > field765) {
				arg4 = field765 - arg3;
			}

			int var5 = 256 - arg0;
			int var6 = (arg1 >> 16 & 0xFF) * arg0;
			int var7 = (arg1 >> 8 & 0xFF) * arg0;
			int var8 = (arg1 & 0xFF) * arg0;
			int var9 = field760 * arg2 + arg3;
			for (int var10 = 0; var10 < arg4; var10++) {
				int var11 = (field759[var9] >> 16 & 0xFF) * var5;
				int var12 = (field759[var9] >> 8 & 0xFF) * var5;
				int var13 = (field759[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field759[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("IFHRXNFO.c(IIIII)V")
	public static void method320(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field764 && arg0 < field765) {
			if (arg2 < field762) {
				arg3 -= field762 - arg2;
				arg2 = field762;
			}

			if (arg2 + arg3 > field763) {
				arg3 = field763 - arg2;
			}

			int var4 = field760 * arg2 + arg0;
			for (int var5 = 0; var5 < arg3; var5++) {
				field759[field760 * var5 + var4] = arg1;
			}
		}
	}

	@ObfuscatedName("IFHRXNFO.a(BIIIII)V")
	public static void method321(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 >= field764 && arg1 < field765) {
			if (arg4 < field762) {
				arg2 -= field762 - arg4;
				arg4 = field762;
			}

			if (arg2 + arg4 > field763) {
				arg2 = field763 - arg4;
			}

			int var5 = 256 - arg0;
			int var6 = (arg3 >> 16 & 0xFF) * arg0;
			int var7 = (arg3 >> 8 & 0xFF) * arg0;
			int var8 = (arg3 & 0xFF) * arg0;
			int var9 = field760 * arg4 + arg1;
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = (field759[var9] >> 16 & 0xFF) * var5;
				int var12 = (field759[var9] >> 8 & 0xFF) * var5;
				int var13 = (field759[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field759[var9] = var14;
				var9 += field760;
			}
		}
	}
}
