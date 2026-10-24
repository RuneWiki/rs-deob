package deob;

@ObfuscatedName("FVBHOYJF")
public class FVBHOYJF extends MUOTSYDS {

	@ObfuscatedName("FVBHOYJF.l")
	public static int field640;

	@ObfuscatedName("FVBHOYJF.m")
	public static int field641;

	@ObfuscatedName("FVBHOYJF.n")
	public static int field642;

	@ObfuscatedName("FVBHOYJF.o")
	public static int field643;

	@ObfuscatedName("FVBHOYJF.p")
	public static int field644;

	@ObfuscatedName("FVBHOYJF.q")
	public static int field645;

	@ObfuscatedName("FVBHOYJF.r")
	public static int field646;

	@ObfuscatedName("FVBHOYJF.s")
	public static int field647;

	@ObfuscatedName("FVBHOYJF.t")
	public static int field648;

	@ObfuscatedName("FVBHOYJF.k")
	public static int[] field639;

	@ObfuscatedName("FVBHOYJF.a([IIIB)V")
	public static void method209(int[] arg0, int arg1, int arg2) {
		field639 = arg0;
		field640 = arg2;
		field641 = arg1;
		method211(0, 0, arg1, arg2);
	}

	@ObfuscatedName("FVBHOYJF.a(I)V")
	public static void method210() {
		field644 = 0;
		field642 = 0;
		field645 = field640;
		field643 = field641;
		field646 = field645 - 1;
		field647 = field645 / 2;
	}

	@ObfuscatedName("FVBHOYJF.a(IIIII)V")
	public static void method211(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg3 > field640) {
			arg3 = field640;
		}

		if (arg2 > field641) {
			arg2 = field641;
		}

		field644 = arg1;
		field642 = arg0;
		field645 = arg3;
		field643 = arg2;
		field646 = field645 - 1;
		field647 = field645 / 2;
		field648 = field643 / 2;
	}

	@ObfuscatedName("FVBHOYJF.a(B)V")
	public static void method212() {
		int var0 = field641 * field640;
		for (int var1 = 0; var1 < var0; var1++) {
			field639[var1] = 0;
		}
	}

	@ObfuscatedName("FVBHOYJF.a(IIIIIII)V")
	public static void method213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 < field644) {
			arg2 -= field644 - arg4;
			arg4 = field644;
		}

		if (arg1 < field642) {
			arg5 -= field642 - arg1;
			arg1 = field642;
		}

		if (arg2 + arg4 > field645) {
			arg2 = field645 - arg4;
		}

		if (arg1 + arg5 > field643) {
			arg5 = field643 - arg1;
		}

		int var6 = 256 - arg3;
		int var7 = (arg0 >> 16 & 0xFF) * arg3;
		int var8 = (arg0 >> 8 & 0xFF) * arg3;
		int var9 = (arg0 & 0xFF) * arg3;
		int var10 = field640 - arg2;
		int var11 = field640 * arg1 + arg4;
		for (int var12 = 0; var12 < arg5; var12++) {
			for (int var13 = -arg2; var13 < 0; var13++) {
				int var14 = (field639[var11] >> 16 & 0xFF) * var6;
				int var15 = (field639[var11] >> 8 & 0xFF) * var6;
				int var16 = (field639[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field639[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("FVBHOYJF.a(IIIIII)V")
	public static void method214(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 < field644) {
			arg4 -= field644 - arg2;
			arg2 = field644;
		}

		if (arg3 < field642) {
			arg1 -= field642 - arg3;
			arg3 = field642;
		}

		if (arg2 + arg4 > field645) {
			arg4 = field645 - arg2;
		}

		if (arg1 + arg3 > field643) {
			arg1 = field643 - arg3;
		}

		int var5 = field640 - arg4;
		int var6 = field640 * arg3 + arg2;
		for (int var7 = -arg1; var7 < 0; var7++) {
			for (int var8 = -arg4; var8 < 0; var8++) {
				field639[var6++] = arg0;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("FVBHOYJF.b(IIIIII)V")
	public static void method215(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method217(arg4, arg3, arg1, arg2);
		method217(arg4, arg0 + arg3 - 1, arg1, arg2);
		method219(arg3, arg0, arg4, arg1);
		method219(arg3, arg0, arg2 + arg4 - 1, arg1);
	}

	@ObfuscatedName("FVBHOYJF.a(IIIIIIB)V")
	public static void method216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method218(arg1, arg0, arg4, arg2, arg5);
		method218(arg1, arg0, arg4, arg2, arg3 + arg5 - 1);

		if (arg3 >= 3) {
			method220(arg2, arg5 + 1, arg0, arg3 - 2, arg1);
			method220(arg2, arg5 + 1, arg0 + arg4 - 1, arg3 - 2, arg1);
		}
	}

	@ObfuscatedName("FVBHOYJF.b(IIIII)V")
	public static void method217(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field642 && arg1 < field643) {
			if (arg0 < field644) {
				arg3 -= field644 - arg0;
				arg0 = field644;
			}

			if (arg0 + arg3 > field645) {
				arg3 = field645 - arg0;
			}

			int var4 = field640 * arg1 + arg0;
			for (int var5 = 0; var5 < arg3; var5++) {
				field639[var4 + var5] = arg2;
			}
		}
	}

	@ObfuscatedName("FVBHOYJF.c(IIIIII)V")
	public static void method218(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 >= field642 && arg4 < field643) {
			if (arg1 < field644) {
				arg2 -= field644 - arg1;
				arg1 = field644;
			}

			if (arg1 + arg2 > field645) {
				arg2 = field645 - arg1;
			}

			int var5 = 256 - arg3;
			int var6 = (arg0 >> 16 & 0xFF) * arg3;
			int var7 = (arg0 >> 8 & 0xFF) * arg3;
			int var8 = (arg0 & 0xFF) * arg3;
			int var9 = field640 * arg4 + arg1;
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = (field639[var9] >> 16 & 0xFF) * var5;
				int var12 = (field639[var9] >> 8 & 0xFF) * var5;
				int var13 = (field639[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field639[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("FVBHOYJF.a(IIBII)V")
	public static void method219(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field644 && arg2 < field645) {
			if (arg0 < field642) {
				arg1 -= field642 - arg0;
				arg0 = field642;
			}

			if (arg0 + arg1 > field643) {
				arg1 = field643 - arg0;
			}

			int var4 = field640 * arg0 + arg2;
			for (int var5 = 0; var5 < arg1; var5++) {
				field639[field640 * var5 + var4] = arg3;
			}
		}
	}

	@ObfuscatedName("FVBHOYJF.d(IIIIII)V")
	public static void method220(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 >= field644 && arg2 < field645) {
			if (arg1 < field642) {
				arg3 -= field642 - arg1;
				arg1 = field642;
			}

			if (arg1 + arg3 > field643) {
				arg3 = field643 - arg1;
			}

			int var5 = 256 - arg0;
			int var6 = (arg4 >> 16 & 0xFF) * arg0;
			int var7 = (arg4 >> 8 & 0xFF) * arg0;
			int var8 = (arg4 & 0xFF) * arg0;
			int var9 = field640 * arg1 + arg2;
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = (field639[var9] >> 16 & 0xFF) * var5;
				int var12 = (field639[var9] >> 8 & 0xFF) * var5;
				int var13 = (field639[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field639[var9] = var14;
				var9 += field640;
			}
		}
	}
}
