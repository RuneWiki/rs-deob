package deob;

@ObfuscatedName("BAXODNVH")
public class BAXODNVH extends IOXDUYYH {

	@ObfuscatedName("BAXODNVH.o")
	public static int field32;

	@ObfuscatedName("BAXODNVH.p")
	public static int field33;

	@ObfuscatedName("BAXODNVH.q")
	public static int field34;

	@ObfuscatedName("BAXODNVH.r")
	public static int field35;

	@ObfuscatedName("BAXODNVH.s")
	public static int field36;

	@ObfuscatedName("BAXODNVH.t")
	public static int field37;

	@ObfuscatedName("BAXODNVH.u")
	public static int field38;

	@ObfuscatedName("BAXODNVH.v")
	public static int field39;

	@ObfuscatedName("BAXODNVH.w")
	public static int field40;

	@ObfuscatedName("BAXODNVH.n")
	public static int[] field31;

	@ObfuscatedName("BAXODNVH.a(I[IIB)V")
	public static void method17(int arg0, int[] arg1, int arg2) {
		field31 = arg1;
		field32 = arg0;
		field33 = arg2;
		method19(0, arg2, arg0, 0);
	}

	@ObfuscatedName("BAXODNVH.a(I)V")
	public static void method18() {
		field36 = 0;
		field34 = 0;
		field37 = field32;
		field35 = field33;
		field38 = field37 - 1;
		field39 = field37 / 2;
	}

	@ObfuscatedName("BAXODNVH.a(IIIII)V")
	public static void method19(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg2 > field32) {
			arg2 = field32;
		}

		if (arg1 > field33) {
			arg1 = field33;
		}

		field36 = arg3;
		field34 = arg0;
		field37 = arg2;
		field35 = arg1;
		field38 = field37 - 1;
		field39 = field37 / 2;
		field40 = field35 / 2;
	}

	@ObfuscatedName("BAXODNVH.b(I)V")
	public static void method20() {
		int var0 = field33 * field32;
		for (int var1 = 0; var1 < var0; var1++) {
			field31[var1] = 0;
		}
	}

	@ObfuscatedName("BAXODNVH.a(IZIIIII)V")
	public static void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 < field36) {
			arg1 -= field36 - arg4;
			arg4 = field36;
		}

		if (arg2 < field34) {
			arg3 -= field34 - arg2;
			arg2 = field34;
		}

		if (arg1 + arg4 > field37) {
			arg1 = field37 - arg4;
		}

		if (arg2 + arg3 > field35) {
			arg3 = field35 - arg2;
		}

		int var6 = 256 - arg0;
		int var7 = (arg5 >> 16 & 0xFF) * arg0;
		int var8 = (arg5 >> 8 & 0xFF) * arg0;
		int var9 = (arg5 & 0xFF) * arg0;
		int var10 = field32 - arg1;
		int var11 = field32 * arg2 + arg4;
		for (int var12 = 0; var12 < arg3; var12++) {
			for (int var13 = -arg1; var13 < 0; var13++) {
				int var14 = (field31[var11] >> 16 & 0xFF) * var6;
				int var15 = (field31[var11] >> 8 & 0xFF) * var6;
				int var16 = (field31[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field31[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("BAXODNVH.a(IIIIII)V")
	public static void method22(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 < field36) {
			arg0 -= field36 - arg1;
			arg1 = field36;
		}

		if (arg4 < field34) {
			arg2 -= field34 - arg4;
			arg4 = field34;
		}

		if (arg0 + arg1 > field37) {
			arg0 = field37 - arg1;
		}

		if (arg2 + arg4 > field35) {
			arg2 = field35 - arg4;
		}

		int var5 = field32 - arg0;
		int var6 = field32 * arg4 + arg1;
		for (int var7 = -arg2; var7 < 0; var7++) {
			for (int var8 = -arg0; var8 < 0; var8++) {
				field31[var6++] = arg3;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("BAXODNVH.b(IIIIII)V")
	public static void method23(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method25(arg1, arg3, arg2, arg4);
		method25(arg1, arg3, arg2, arg0 + arg4 - 1);
		method27(arg0, arg3, arg4, arg2);
		method27(arg0, arg1 + arg3 - 1, arg4, arg2);
	}

	@ObfuscatedName("BAXODNVH.a(IIIIIIZ)V")
	public static void method24(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method26(arg1, arg3, arg5, arg4, arg0);
		method26(arg1 + arg2 - 1, arg3, arg5, arg4, arg0);

		if (arg2 >= 3) {
			method28(arg3, arg5, arg2 - 2, arg4, arg1 + 1);
			method28(arg3, arg5, arg2 - 2, arg0 + arg4 - 1, arg1 + 1);
		}
	}

	@ObfuscatedName("BAXODNVH.b(IIIII)V")
	public static void method25(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field34 && arg3 < field35) {
			if (arg1 < field36) {
				arg0 -= field36 - arg1;
				arg1 = field36;
			}

			if (arg0 + arg1 > field37) {
				arg0 = field37 - arg1;
			}

			int var4 = field32 * arg3 + arg1;
			for (int var5 = 0; var5 < arg0; var5++) {
				field31[var4 + var5] = arg2;
			}
		}
	}

	@ObfuscatedName("BAXODNVH.c(IIIIII)V")
	public static void method26(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field34 && arg0 < field35) {
			if (arg3 < field36) {
				arg4 -= field36 - arg3;
				arg3 = field36;
			}

			if (arg3 + arg4 > field37) {
				arg4 = field37 - arg3;
			}

			int var5 = 256 - arg2;
			int var6 = (arg1 >> 16 & 0xFF) * arg2;
			int var7 = (arg1 >> 8 & 0xFF) * arg2;
			int var8 = (arg1 & 0xFF) * arg2;
			int var9 = field32 * arg0 + arg3;
			for (int var10 = 0; var10 < arg4; var10++) {
				int var11 = (field31[var9] >> 16 & 0xFF) * var5;
				int var12 = (field31[var9] >> 8 & 0xFF) * var5;
				int var13 = (field31[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field31[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("BAXODNVH.c(IIIII)V")
	public static void method27(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field36 && arg1 < field37) {
			if (arg2 < field34) {
				arg0 -= field34 - arg2;
				arg2 = field34;
			}

			if (arg0 + arg2 > field35) {
				arg0 = field35 - arg2;
			}

			int var4 = field32 * arg2 + arg1;
			for (int var5 = 0; var5 < arg0; var5++) {
				field31[field32 * var5 + var4] = arg3;
			}
		}
	}

	@ObfuscatedName("BAXODNVH.a(IIBIII)V")
	public static void method28(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 >= field36 && arg3 < field37) {
			if (arg4 < field34) {
				arg2 -= field34 - arg4;
				arg4 = field34;
			}

			if (arg2 + arg4 > field35) {
				arg2 = field35 - arg4;
			}

			int var5 = 256 - arg1;
			int var6 = (arg0 >> 16 & 0xFF) * arg1;
			int var7 = (arg0 >> 8 & 0xFF) * arg1;
			int var8 = (arg0 & 0xFF) * arg1;
			int var9 = field32 * arg4 + arg3;
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = (field31[var9] >> 16 & 0xFF) * var5;
				int var12 = (field31[var9] >> 8 & 0xFF) * var5;
				int var13 = (field31[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field31[var9] = var14;
				var9 += field32;
			}
		}
	}
}
