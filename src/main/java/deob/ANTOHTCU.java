package deob;

@ObfuscatedName("ANTOHTCU")
public class ANTOHTCU extends YPOWJZIQ {

	@ObfuscatedName("ANTOHTCU.o")
	public static int field49;

	@ObfuscatedName("ANTOHTCU.p")
	public static int field50;

	@ObfuscatedName("ANTOHTCU.q")
	public static int field51;

	@ObfuscatedName("ANTOHTCU.r")
	public static int field52;

	@ObfuscatedName("ANTOHTCU.s")
	public static int field53;

	@ObfuscatedName("ANTOHTCU.t")
	public static int field54;

	@ObfuscatedName("ANTOHTCU.u")
	public static int field55;

	@ObfuscatedName("ANTOHTCU.v")
	public static int field56;

	@ObfuscatedName("ANTOHTCU.w")
	public static int field57;

	@ObfuscatedName("ANTOHTCU.n")
	public static int[] field48;

	@ObfuscatedName("ANTOHTCU.a(II[IZ)V")
	public static void method12(int arg0, int arg1, int[] arg2) {
		field48 = arg2;
		field49 = arg0;
		field50 = arg1;
		method14(arg0, 0, arg1, 0);
	}

	@ObfuscatedName("ANTOHTCU.a(I)V")
	public static void method13() {
		field53 = 0;
		field51 = 0;
		field54 = field49;
		field52 = field50;
		field55 = field54 - 1;
		field56 = field54 / 2;
	}

	@ObfuscatedName("ANTOHTCU.a(IIIII)V")
	public static void method14(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg0 > field49) {
			arg0 = field49;
		}

		if (arg2 > field50) {
			arg2 = field50;
		}

		field53 = arg3;
		field51 = arg1;
		field54 = arg0;
		field52 = arg2;
		field55 = field54 - 1;
		field56 = field54 / 2;
		field57 = field52 / 2;
	}

	@ObfuscatedName("ANTOHTCU.a(Z)V")
	public static void method15() {
		int var0 = field50 * field49;
		for (int var1 = 0; var1 < var0; var1++) {
			field48[var1] = 0;
		}
	}

	@ObfuscatedName("ANTOHTCU.a(IIIIZII)V")
	public static void method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 < field53) {
			arg2 -= field53 - arg0;
			arg0 = field53;
		}

		if (arg5 < field51) {
			arg3 -= field51 - arg5;
			arg5 = field51;
		}

		if (arg0 + arg2 > field54) {
			arg2 = field54 - arg0;
		}

		if (arg3 + arg5 > field52) {
			arg3 = field52 - arg5;
		}

		int var6 = 256 - arg1;
		int var7 = (arg4 >> 16 & 0xFF) * arg1;
		int var8 = (arg4 >> 8 & 0xFF) * arg1;
		int var9 = (arg4 & 0xFF) * arg1;
		int var10 = field49 - arg2;
		int var11 = field49 * arg5 + arg0;
		for (int var12 = 0; var12 < arg3; var12++) {
			for (int var13 = -arg2; var13 < 0; var13++) {
				int var14 = (field48[var11] >> 16 & 0xFF) * var6;
				int var15 = (field48[var11] >> 8 & 0xFF) * var6;
				int var16 = (field48[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field48[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("ANTOHTCU.a(IIIIII)V")
	public static void method17(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 < field53) {
			arg3 -= field53 - arg0;
			arg0 = field53;
		}

		if (arg1 < field51) {
			arg4 -= field51 - arg1;
			arg1 = field51;
		}

		if (arg0 + arg3 > field54) {
			arg3 = field54 - arg0;
		}

		if (arg1 + arg4 > field52) {
			arg4 = field52 - arg1;
		}

		int var5 = field49 - arg3;
		int var6 = field49 * arg1 + arg0;
		for (int var7 = -arg4; var7 < 0; var7++) {
			for (int var8 = -arg3; var8 < 0; var8++) {
				field48[var6++] = arg2;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("ANTOHTCU.b(IIIIII)V")
	public static void method18(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method20(arg0, arg4, arg1, arg2);
		method20(arg0, arg3 + arg4 - 1, arg1, arg2);
		method22(arg2, arg3, arg0, arg4);
		method22(arg2, arg3, arg0 + arg1 - 1, arg4);
	}

	@ObfuscatedName("ANTOHTCU.a(ZIIIIII)V")
	public static void method19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method21(arg2, arg4, arg5, arg3, arg0);
		method21(arg2, arg4, arg1 + arg5 - 1, arg3, arg0);

		if (arg1 >= 3) {
			method23(arg5 + 1, arg0, arg4, arg1 - 2, arg2);
			method23(arg5 + 1, arg0 + arg3 - 1, arg4, arg1 - 2, arg2);
		}
	}

	@ObfuscatedName("ANTOHTCU.b(IIIII)V")
	public static void method20(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field51 && arg1 < field52) {
			if (arg0 < field53) {
				arg2 -= field53 - arg0;
				arg0 = field53;
			}

			if (arg0 + arg2 > field54) {
				arg2 = field54 - arg0;
			}

			int var4 = field49 * arg1 + arg0;
			for (int var5 = 0; var5 < arg2; var5++) {
				field48[var4 + var5] = arg3;
			}
		}
	}

	@ObfuscatedName("ANTOHTCU.a(IIZIII)V")
	public static void method21(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 >= field51 && arg2 < field52) {
			if (arg4 < field53) {
				arg3 -= field53 - arg4;
				arg4 = field53;
			}

			if (arg3 + arg4 > field54) {
				arg3 = field54 - arg4;
			}

			int var5 = 256 - arg0;
			int var6 = (arg1 >> 16 & 0xFF) * arg0;
			int var7 = (arg1 >> 8 & 0xFF) * arg0;
			int var8 = (arg1 & 0xFF) * arg0;
			int var9 = field49 * arg2 + arg4;
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = (field48[var9] >> 16 & 0xFF) * var5;
				int var12 = (field48[var9] >> 8 & 0xFF) * var5;
				int var13 = (field48[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field48[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("ANTOHTCU.c(IIIII)V")
	public static void method22(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field53 && arg2 < field54) {
			if (arg3 < field51) {
				arg1 -= field51 - arg3;
				arg3 = field51;
			}

			if (arg1 + arg3 > field52) {
				arg1 = field52 - arg3;
			}

			int var4 = field49 * arg3 + arg2;
			for (int var5 = 0; var5 < arg1; var5++) {
				field48[field49 * var5 + var4] = arg0;
			}
		}
	}

	@ObfuscatedName("ANTOHTCU.c(IIIIII)V")
	public static void method23(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 >= field53 && arg1 < field54) {
			if (arg0 < field51) {
				arg3 -= field51 - arg0;
				arg0 = field51;
			}

			if (arg0 + arg3 > field52) {
				arg3 = field52 - arg0;
			}

			int var5 = 256 - arg4;
			int var6 = (arg2 >> 16 & 0xFF) * arg4;
			int var7 = (arg2 >> 8 & 0xFF) * arg4;
			int var8 = (arg2 & 0xFF) * arg4;
			int var9 = field49 * arg0 + arg1;
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = (field48[var9] >> 16 & 0xFF) * var5;
				int var12 = (field48[var9] >> 8 & 0xFF) * var5;
				int var13 = (field48[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field48[var9] = var14;
				var9 += field49;
			}
		}
	}
}
