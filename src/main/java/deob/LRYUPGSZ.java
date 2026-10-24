package deob;

@ObfuscatedName("LRYUPGSZ")
public class LRYUPGSZ extends CJDGAOKT {

	@ObfuscatedName("LRYUPGSZ.p")
	public static int field880;

	@ObfuscatedName("LRYUPGSZ.q")
	public static int field881;

	@ObfuscatedName("LRYUPGSZ.r")
	public static int field882;

	@ObfuscatedName("LRYUPGSZ.s")
	public static int field883;

	@ObfuscatedName("LRYUPGSZ.t")
	public static int field884;

	@ObfuscatedName("LRYUPGSZ.u")
	public static int field885;

	@ObfuscatedName("LRYUPGSZ.v")
	public static int field886;

	@ObfuscatedName("LRYUPGSZ.w")
	public static int field887;

	@ObfuscatedName("LRYUPGSZ.x")
	public static int field888;

	@ObfuscatedName("LRYUPGSZ.o")
	public static int[] field879;

	@ObfuscatedName("LRYUPGSZ.a(ZI[II)V")
	public static void method264(int arg0, int[] arg1, int arg2) {
		field879 = arg1;
		field880 = arg0;
		field881 = arg2;
		method266(0, 0, arg0, arg2);
	}

	@ObfuscatedName("LRYUPGSZ.a(B)V")
	public static void method265() {
		field884 = 0;
		field882 = 0;
		field885 = field880;
		field883 = field881;
		field886 = field885 - 1;
		field887 = field885 / 2;
	}

	@ObfuscatedName("LRYUPGSZ.a(IIBII)V")
	public static void method266(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg2 > field880) {
			arg2 = field880;
		}

		if (arg3 > field881) {
			arg3 = field881;
		}

		field884 = arg1;
		field882 = arg0;
		field885 = arg2;
		field883 = arg3;
		field886 = field885 - 1;
		field887 = field885 / 2;
		field888 = field883 / 2;
	}

	@ObfuscatedName("LRYUPGSZ.a(I)V")
	public static void method267() {
		int var0 = field881 * field880;
		for (int var1 = 0; var1 < var0; var1++) {
			field879[var1] = 0;
		}
	}

	@ObfuscatedName("LRYUPGSZ.a(IIIIIII)V")
	public static void method268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 < field884) {
			arg2 -= field884 - arg3;
			arg3 = field884;
		}

		if (arg4 < field882) {
			arg0 -= field882 - arg4;
			arg4 = field882;
		}

		if (arg2 + arg3 > field885) {
			arg2 = field885 - arg3;
		}

		if (arg0 + arg4 > field883) {
			arg0 = field883 - arg4;
		}

		int var6 = 256 - arg1;
		int var7 = (arg5 >> 16 & 0xFF) * arg1;
		int var8 = (arg5 >> 8 & 0xFF) * arg1;
		int var9 = (arg5 & 0xFF) * arg1;
		int var10 = field880 - arg2;
		int var11 = field880 * arg4 + arg3;
		for (int var12 = 0; var12 < arg0; var12++) {
			for (int var13 = -arg2; var13 < 0; var13++) {
				int var14 = (field879[var11] >> 16 & 0xFF) * var6;
				int var15 = (field879[var11] >> 8 & 0xFF) * var6;
				int var16 = (field879[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field879[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("LRYUPGSZ.a(IIIIII)V")
	public static void method269(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 < field884) {
			arg1 -= field884 - arg4;
			arg4 = field884;
		}

		if (arg3 < field882) {
			arg2 -= field882 - arg3;
			arg3 = field882;
		}

		if (arg1 + arg4 > field885) {
			arg1 = field885 - arg4;
		}

		if (arg2 + arg3 > field883) {
			arg2 = field883 - arg3;
		}

		int var5 = field880 - arg1;
		int var6 = field880 * arg3 + arg4;
		for (int var7 = -arg2; var7 < 0; var7++) {
			for (int var8 = -arg1; var8 < 0; var8++) {
				field879[var6++] = arg0;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("LRYUPGSZ.a(IZIIII)V")
	public static void method270(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method272(arg4, arg2, arg3, arg0);
		method272(arg4, arg2, arg3, arg0 + arg1 - 1);
		method274(arg1, arg4, arg0, arg3);
		method274(arg1, arg4, arg0, arg2 + arg3 - 1);
	}

	@ObfuscatedName("LRYUPGSZ.a(IIIBIII)V")
	public static void method271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method273(arg1, arg3, arg5, arg4, arg0);
		method273(arg1 + arg2 - 1, arg3, arg5, arg4, arg0);

		if (arg2 >= 3) {
			method275(arg0, arg2 - 2, arg1 + 1, arg3, arg5);
			method275(arg0, arg2 - 2, arg1 + 1, arg3, arg4 + arg5 - 1);
		}
	}

	@ObfuscatedName("LRYUPGSZ.a(IIIII)V")
	public static void method272(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field882 && arg3 < field883) {
			if (arg2 < field884) {
				arg1 -= field884 - arg2;
				arg2 = field884;
			}

			if (arg1 + arg2 > field885) {
				arg1 = field885 - arg2;
			}

			int var4 = field880 * arg3 + arg2;
			for (int var5 = 0; var5 < arg1; var5++) {
				field879[var4 + var5] = arg0;
			}
		}
	}

	@ObfuscatedName("LRYUPGSZ.a(IIIZII)V")
	public static void method273(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field882 && arg0 < field883) {
			if (arg2 < field884) {
				arg3 -= field884 - arg2;
				arg2 = field884;
			}

			if (arg2 + arg3 > field885) {
				arg3 = field885 - arg2;
			}

			int var5 = 256 - arg4;
			int var6 = (arg1 >> 16 & 0xFF) * arg4;
			int var7 = (arg1 >> 8 & 0xFF) * arg4;
			int var8 = (arg1 & 0xFF) * arg4;
			int var9 = field880 * arg0 + arg2;
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = (field879[var9] >> 16 & 0xFF) * var5;
				int var12 = (field879[var9] >> 8 & 0xFF) * var5;
				int var13 = (field879[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field879[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("LRYUPGSZ.a(IIZII)V")
	public static void method274(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field884 && arg3 < field885) {
			if (arg2 < field882) {
				arg0 -= field882 - arg2;
				arg2 = field882;
			}

			if (arg0 + arg2 > field883) {
				arg0 = field883 - arg2;
			}

			int var4 = field880 * arg2 + arg3;
			for (int var5 = 0; var5 < arg0; var5++) {
				field879[field880 * var5 + var4] = arg1;
			}
		}
	}

	@ObfuscatedName("LRYUPGSZ.a(BIIIII)V")
	public static void method275(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 >= field884 && arg4 < field885) {
			if (arg2 < field882) {
				arg1 -= field882 - arg2;
				arg2 = field882;
			}

			if (arg1 + arg2 > field883) {
				arg1 = field883 - arg2;
			}

			int var5 = 256 - arg0;
			int var6 = (arg3 >> 16 & 0xFF) * arg0;
			int var7 = (arg3 >> 8 & 0xFF) * arg0;
			int var8 = (arg3 & 0xFF) * arg0;
			int var9 = field880 * arg2 + arg4;
			for (int var10 = 0; var10 < arg1; var10++) {
				int var11 = (field879[var9] >> 16 & 0xFF) * var5;
				int var12 = (field879[var9] >> 8 & 0xFF) * var5;
				int var13 = (field879[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field879[var9] = var14;
				var9 += field880;
			}
		}
	}
}
