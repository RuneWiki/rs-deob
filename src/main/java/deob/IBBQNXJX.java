package deob;

@ObfuscatedName("IBBQNXJX")
public class IBBQNXJX extends KGLULAMW {

	@ObfuscatedName("IBBQNXJX.p")
	public static int field816;

	@ObfuscatedName("IBBQNXJX.q")
	public static int field817;

	@ObfuscatedName("IBBQNXJX.r")
	public static int field818;

	@ObfuscatedName("IBBQNXJX.s")
	public static int field819;

	@ObfuscatedName("IBBQNXJX.t")
	public static int field820;

	@ObfuscatedName("IBBQNXJX.u")
	public static int field821;

	@ObfuscatedName("IBBQNXJX.v")
	public static int field822;

	@ObfuscatedName("IBBQNXJX.w")
	public static int field823;

	@ObfuscatedName("IBBQNXJX.x")
	public static int field824;

	@ObfuscatedName("IBBQNXJX.o")
	public static int[] field815;

	@ObfuscatedName("IBBQNXJX.a([IIII)V")
	public static void method251(int[] arg0, int arg1, int arg2) {
		field815 = arg0;
		field816 = arg1;
		field817 = arg2;
		method253(0, 0, arg1, arg2);
	}

	@ObfuscatedName("IBBQNXJX.a(I)V")
	public static void method252() {
		field820 = 0;
		field818 = 0;
		field821 = field816;
		field819 = field817;
		field822 = field821 - 1;
		field823 = field821 / 2;
	}

	@ObfuscatedName("IBBQNXJX.a(IIIII)V")
	public static void method253(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg2 > field816) {
			arg2 = field816;
		}

		if (arg3 > field817) {
			arg3 = field817;
		}

		field820 = arg1;
		field818 = arg0;
		field821 = arg2;
		field819 = arg3;
		field822 = field821 - 1;
		field823 = field821 / 2;
		field824 = field819 / 2;
	}

	@ObfuscatedName("IBBQNXJX.b(I)V")
	public static void method254() {
		int var0 = field817 * field816;
		for (int var1 = 0; var1 < var0; var1++) {
			field815[var1] = 0;
		}
	}

	@ObfuscatedName("IBBQNXJX.a(IIIIIII)V")
	public static void method255(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg5 < field820) {
			arg1 -= field820 - arg5;
			arg5 = field820;
		}

		if (arg4 < field818) {
			arg3 -= field818 - arg4;
			arg4 = field818;
		}

		if (arg1 + arg5 > field821) {
			arg1 = field821 - arg5;
		}

		if (arg3 + arg4 > field819) {
			arg3 = field819 - arg4;
		}

		int var6 = 256 - arg2;
		int var7 = (arg0 >> 16 & 0xFF) * arg2;
		int var8 = (arg0 >> 8 & 0xFF) * arg2;
		int var9 = (arg0 & 0xFF) * arg2;
		int var10 = field816 - arg1;
		int var11 = field816 * arg4 + arg5;
		for (int var12 = 0; var12 < arg3; var12++) {
			for (int var13 = -arg1; var13 < 0; var13++) {
				int var14 = (field815[var11] >> 16 & 0xFF) * var6;
				int var15 = (field815[var11] >> 8 & 0xFF) * var6;
				int var16 = (field815[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field815[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("IBBQNXJX.a(IIIIIB)V")
	public static void method256(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 < field820) {
			arg1 -= field820 - arg0;
			arg0 = field820;
		}

		if (arg2 < field818) {
			arg4 -= field818 - arg2;
			arg2 = field818;
		}

		if (arg0 + arg1 > field821) {
			arg1 = field821 - arg0;
		}

		if (arg2 + arg4 > field819) {
			arg4 = field819 - arg2;
		}

		int var5 = field816 - arg1;
		int var6 = field816 * arg2 + arg0;
		for (int var7 = -arg4; var7 < 0; var7++) {
			for (int var8 = -arg1; var8 < 0; var8++) {
				field815[var6++] = arg3;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("IBBQNXJX.a(IIIIII)V")
	public static void method257(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method259(arg3, arg0, arg1, arg4);
		method259(arg3, arg0, arg1 + arg2 - 1, arg4);
		method261(arg2, arg1, arg0, arg4);
		method261(arg2, arg1, arg0 + arg3 - 1, arg4);
	}

	@ObfuscatedName("IBBQNXJX.b(IIIIIII)V")
	public static void method258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method260(arg0, arg5, arg3, arg2, arg1);
		method260(arg0, arg5, arg3, arg2, arg1 + arg4 - 1);

		if (arg4 >= 3) {
			method262(arg3, arg1 + 1, arg4 - 2, arg5, arg0);
			method262(arg3, arg1 + 1, arg4 - 2, arg2 + arg5 - 1, arg0);
		}
	}

	@ObfuscatedName("IBBQNXJX.a(IIIIB)V")
	public static void method259(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field818 && arg2 < field819) {
			if (arg1 < field820) {
				arg0 -= field820 - arg1;
				arg1 = field820;
			}

			if (arg0 + arg1 > field821) {
				arg0 = field821 - arg1;
			}

			int var4 = field816 * arg2 + arg1;
			for (int var5 = 0; var5 < arg0; var5++) {
				field815[var4 + var5] = arg3;
			}
		}
	}

	@ObfuscatedName("IBBQNXJX.b(IIIIII)V")
	public static void method260(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 >= field818 && arg4 < field819) {
			if (arg1 < field820) {
				arg3 -= field820 - arg1;
				arg1 = field820;
			}

			if (arg1 + arg3 > field821) {
				arg3 = field821 - arg1;
			}

			int var5 = 256 - arg0;
			int var6 = (arg2 >> 16 & 0xFF) * arg0;
			int var7 = (arg2 >> 8 & 0xFF) * arg0;
			int var8 = (arg2 & 0xFF) * arg0;
			int var9 = field816 * arg4 + arg1;
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = (field815[var9] >> 16 & 0xFF) * var5;
				int var12 = (field815[var9] >> 8 & 0xFF) * var5;
				int var13 = (field815[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field815[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("IBBQNXJX.b(IIIII)V")
	public static void method261(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field820 && arg2 < field821) {
			if (arg1 < field818) {
				arg0 -= field818 - arg1;
				arg1 = field818;
			}

			if (arg0 + arg1 > field819) {
				arg0 = field819 - arg1;
			}

			int var4 = field816 * arg1 + arg2;
			for (int var5 = 0; var5 < arg0; var5++) {
				field815[field816 * var5 + var4] = arg3;
			}
		}
	}

	@ObfuscatedName("IBBQNXJX.a(IIIBII)V")
	public static void method262(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 >= field820 && arg3 < field821) {
			if (arg1 < field818) {
				arg2 -= field818 - arg1;
				arg1 = field818;
			}

			if (arg1 + arg2 > field819) {
				arg2 = field819 - arg1;
			}

			int var5 = 256 - arg4;
			int var6 = (arg0 >> 16 & 0xFF) * arg4;
			int var7 = (arg0 >> 8 & 0xFF) * arg4;
			int var8 = (arg0 & 0xFF) * arg4;
			int var9 = field816 * arg1 + arg3;
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = (field815[var9] >> 16 & 0xFF) * var5;
				int var12 = (field815[var9] >> 8 & 0xFF) * var5;
				int var13 = (field815[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field815[var9] = var14;
				var9 += field816;
			}
		}
	}
}
