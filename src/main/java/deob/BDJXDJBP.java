package deob;

@ObfuscatedName("BDJXDJBP")
public class BDJXDJBP extends YCAZQYJA {

	@ObfuscatedName("BDJXDJBP.n")
	public static int field47;

	@ObfuscatedName("BDJXDJBP.o")
	public static int field48;

	@ObfuscatedName("BDJXDJBP.p")
	public static int field49;

	@ObfuscatedName("BDJXDJBP.q")
	public static int field50;

	@ObfuscatedName("BDJXDJBP.r")
	public static int field51;

	@ObfuscatedName("BDJXDJBP.s")
	public static int field52;

	@ObfuscatedName("BDJXDJBP.t")
	public static int field53;

	@ObfuscatedName("BDJXDJBP.u")
	public static int field54;

	@ObfuscatedName("BDJXDJBP.v")
	public static int field55;

	@ObfuscatedName("BDJXDJBP.m")
	public static int[] field46;

	@ObfuscatedName("BDJXDJBP.a(II[IZ)V")
	public static void method24(int arg0, int arg1, int[] arg2) {
		field46 = arg2;
		field47 = arg0;
		field48 = arg1;
		method26(0, arg0, arg1, 0);
	}

	@ObfuscatedName("BDJXDJBP.a(I)V")
	public static void method25() {
		field51 = 0;
		field49 = 0;
		field52 = field47;
		field50 = field48;
		field53 = field52 - 1;
		field54 = field52 / 2;
	}

	@ObfuscatedName("BDJXDJBP.a(IIZII)V")
	public static void method26(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg1 > field47) {
			arg1 = field47;
		}

		if (arg2 > field48) {
			arg2 = field48;
		}

		field51 = arg3;
		field49 = arg0;
		field52 = arg1;
		field50 = arg2;
		field53 = field52 - 1;
		field54 = field52 / 2;
		field55 = field50 / 2;
	}

	@ObfuscatedName("BDJXDJBP.b(I)V")
	public static void method27() {
		int var0 = field48 * field47;
		for (int var1 = 0; var1 < var0; var1++) {
			field46[var1] = 0;
		}
	}

	@ObfuscatedName("BDJXDJBP.a(IIIIBII)V")
	public static void method28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 < field51) {
			arg1 -= field51 - arg0;
			arg0 = field51;
		}

		if (arg3 < field49) {
			arg4 -= field49 - arg3;
			arg3 = field49;
		}

		if (arg0 + arg1 > field52) {
			arg1 = field52 - arg0;
		}

		if (arg3 + arg4 > field50) {
			arg4 = field50 - arg3;
		}

		int var6 = 256 - arg5;
		int var7 = (arg2 >> 16 & 0xFF) * arg5;
		int var8 = (arg2 >> 8 & 0xFF) * arg5;
		int var9 = (arg2 & 0xFF) * arg5;
		int var10 = field47 - arg1;
		int var11 = field47 * arg3 + arg0;
		for (int var12 = 0; var12 < arg4; var12++) {
			for (int var13 = -arg1; var13 < 0; var13++) {
				int var14 = (field46[var11] >> 16 & 0xFF) * var6;
				int var15 = (field46[var11] >> 8 & 0xFF) * var6;
				int var16 = (field46[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field46[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("BDJXDJBP.a(IIIIII)V")
	public static void method29(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 < field51) {
			arg1 -= field51 - arg0;
			arg0 = field51;
		}

		if (arg3 < field49) {
			arg4 -= field49 - arg3;
			arg3 = field49;
		}

		if (arg0 + arg1 > field52) {
			arg1 = field52 - arg0;
		}

		if (arg3 + arg4 > field50) {
			arg4 = field50 - arg3;
		}

		int var5 = field47 - arg1;
		int var6 = field47 * arg3 + arg0;
		for (int var7 = -arg4; var7 < 0; var7++) {
			for (int var8 = -arg1; var8 < 0; var8++) {
				field46[var6++] = arg2;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("BDJXDJBP.b(IIIIII)V")
	public static void method30(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method32(arg4, arg1, arg2, arg0);
		method32(arg3 + arg4 - 1, arg1, arg2, arg0);
		method34(arg1, arg4, arg2, arg3);
		method34(arg1, arg4, arg0 + arg2 - 1, arg3);
	}

	@ObfuscatedName("BDJXDJBP.a(IIIIIII)V")
	public static void method31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method33(arg2, arg0, arg1, arg5, arg3);
		method33(arg2 + arg4 - 1, arg0, arg1, arg5, arg3);

		if (arg4 >= 3) {
			method35(arg0, arg4 - 2, arg2 + 1, arg3, arg1);
			method35(arg0, arg4 - 2, arg2 + 1, arg3 + arg5 - 1, arg1);
		}
	}

	@ObfuscatedName("BDJXDJBP.a(IIIII)V")
	public static void method32(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field49 && arg0 < field50) {
			if (arg2 < field51) {
				arg3 -= field51 - arg2;
				arg2 = field51;
			}

			if (arg2 + arg3 > field52) {
				arg3 = field52 - arg2;
			}

			int var4 = field47 * arg0 + arg2;
			for (int var5 = 0; var5 < arg3; var5++) {
				field46[var4 + var5] = arg1;
			}
		}
	}

	@ObfuscatedName("BDJXDJBP.c(IIIIII)V")
	public static void method33(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field49 && arg0 < field50) {
			if (arg4 < field51) {
				arg3 -= field51 - arg4;
				arg4 = field51;
			}

			if (arg3 + arg4 > field52) {
				arg3 = field52 - arg4;
			}

			int var5 = 256 - arg1;
			int var6 = (arg2 >> 16 & 0xFF) * arg1;
			int var7 = (arg2 >> 8 & 0xFF) * arg1;
			int var8 = (arg2 & 0xFF) * arg1;
			int var9 = field47 * arg0 + arg4;
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = (field46[var9] >> 16 & 0xFF) * var5;
				int var12 = (field46[var9] >> 8 & 0xFF) * var5;
				int var13 = (field46[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field46[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("BDJXDJBP.b(IIIII)V")
	public static void method34(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field51 && arg2 < field52) {
			if (arg1 < field49) {
				arg3 -= field49 - arg1;
				arg1 = field49;
			}

			if (arg1 + arg3 > field50) {
				arg3 = field50 - arg1;
			}

			int var4 = field47 * arg1 + arg2;
			for (int var5 = 0; var5 < arg3; var5++) {
				field46[field47 * var5 + var4] = arg0;
			}
		}
	}

	@ObfuscatedName("BDJXDJBP.a(IIIZII)V")
	public static void method35(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 >= field51 && arg3 < field52) {
			if (arg2 < field49) {
				arg1 -= field49 - arg2;
				arg2 = field49;
			}

			if (arg1 + arg2 > field50) {
				arg1 = field50 - arg2;
			}

			int var5 = 256 - arg0;
			int var6 = (arg4 >> 16 & 0xFF) * arg0;
			int var7 = (arg4 >> 8 & 0xFF) * arg0;
			int var8 = (arg4 & 0xFF) * arg0;
			int var9 = field47 * arg2 + arg3;
			for (int var10 = 0; var10 < arg1; var10++) {
				int var11 = (field46[var9] >> 16 & 0xFF) * var5;
				int var12 = (field46[var9] >> 8 & 0xFF) * var5;
				int var13 = (field46[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field46[var9] = var14;
				var9 += field47;
			}
		}
	}
}
