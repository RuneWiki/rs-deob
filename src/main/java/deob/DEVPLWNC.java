package deob;

@ObfuscatedName("DEVPLWNC")
public class DEVPLWNC extends APQXVAYL {

	@ObfuscatedName("DEVPLWNC.m")
	public static int field525;

	@ObfuscatedName("DEVPLWNC.n")
	public static int field526;

	@ObfuscatedName("DEVPLWNC.o")
	public static int field527;

	@ObfuscatedName("DEVPLWNC.p")
	public static int field528;

	@ObfuscatedName("DEVPLWNC.q")
	public static int field529;

	@ObfuscatedName("DEVPLWNC.r")
	public static int field530;

	@ObfuscatedName("DEVPLWNC.s")
	public static int field531;

	@ObfuscatedName("DEVPLWNC.t")
	public static int field532;

	@ObfuscatedName("DEVPLWNC.u")
	public static int field533;

	@ObfuscatedName("DEVPLWNC.l")
	public static int[] field524;

	@ObfuscatedName("DEVPLWNC.a([IIIZ)V")
	public static void method159(int[] arg0, int arg1, int arg2) {
		field524 = arg0;
		field525 = arg1;
		field526 = arg2;
		method161(arg1, 0, arg2, 0);
	}

	@ObfuscatedName("DEVPLWNC.a(I)V")
	public static void method160() {
		field529 = 0;
		field527 = 0;
		field530 = field525;
		field528 = field526;
		field531 = field530 - 1;
		field532 = field530 / 2;
	}

	@ObfuscatedName("DEVPLWNC.a(IIIII)V")
	public static void method161(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg0 > field525) {
			arg0 = field525;
		}

		if (arg2 > field526) {
			arg2 = field526;
		}

		field529 = arg1;
		field527 = arg3;
		field530 = arg0;
		field528 = arg2;
		field531 = field530 - 1;
		field532 = field530 / 2;
		field533 = field528 / 2;
	}

	@ObfuscatedName("DEVPLWNC.b(I)V")
	public static void method162() {
		int var0 = field526 * field525;
		for (int var1 = 0; var1 < var0; var1++) {
			field524[var1] = 0;
		}
	}

	@ObfuscatedName("DEVPLWNC.a(ZIIIIII)V")
	public static void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 < field529) {
			arg3 -= field529 - arg4;
			arg4 = field529;
		}

		if (arg1 < field527) {
			arg2 -= field527 - arg1;
			arg1 = field527;
		}

		if (arg3 + arg4 > field530) {
			arg3 = field530 - arg4;
		}

		if (arg1 + arg2 > field528) {
			arg2 = field528 - arg1;
		}

		int var6 = 256 - arg0;
		int var7 = (arg5 >> 16 & 0xFF) * arg0;
		int var8 = (arg5 >> 8 & 0xFF) * arg0;
		int var9 = (arg5 & 0xFF) * arg0;
		int var10 = field525 - arg3;
		int var11 = field525 * arg1 + arg4;
		for (int var12 = 0; var12 < arg2; var12++) {
			for (int var13 = -arg3; var13 < 0; var13++) {
				int var14 = (field524[var11] >> 16 & 0xFF) * var6;
				int var15 = (field524[var11] >> 8 & 0xFF) * var6;
				int var16 = (field524[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field524[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("DEVPLWNC.a(IIIIII)V")
	public static void method164(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 < field529) {
			arg3 -= field529 - arg2;
			arg2 = field529;
		}

		if (arg4 < field527) {
			arg1 -= field527 - arg4;
			arg4 = field527;
		}

		if (arg2 + arg3 > field530) {
			arg3 = field530 - arg2;
		}

		if (arg1 + arg4 > field528) {
			arg1 = field528 - arg4;
		}

		int var5 = field525 - arg3;
		int var6 = field525 * arg4 + arg2;
		for (int var7 = -arg1; var7 < 0; var7++) {
			for (int var8 = -arg3; var8 < 0; var8++) {
				field524[var6++] = arg0;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("DEVPLWNC.b(IIIIII)V")
	public static void method165(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method167(arg1, arg4, arg0, arg2);
		method167(arg1, arg4, arg0, arg2 + arg3 - 1);
		method169(arg2, arg1, arg0, arg3);
		method169(arg2, arg1 + arg4 - 1, arg0, arg3);
	}

	@ObfuscatedName("DEVPLWNC.a(IIZIIII)V")
	public static void method166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method168(arg1, arg2, arg3, arg0, arg4);
		method168(arg1, arg2, arg3 + arg5 - 1, arg0, arg4);

		if (arg5 >= 3) {
			method170(arg1, arg0, arg5 - 2, arg2, arg3 + 1);
			method170(arg1, arg0, arg5 - 2, arg2 + arg4 - 1, arg3 + 1);
		}
	}

	@ObfuscatedName("DEVPLWNC.b(IIIII)V")
	public static void method167(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field527 && arg3 < field528) {
			if (arg0 < field529) {
				arg1 -= field529 - arg0;
				arg0 = field529;
			}

			if (arg0 + arg1 > field530) {
				arg1 = field530 - arg0;
			}

			int var4 = field525 * arg3 + arg0;
			for (int var5 = 0; var5 < arg1; var5++) {
				field524[var4 + var5] = arg2;
			}
		}
	}

	@ObfuscatedName("DEVPLWNC.a(IBIIII)V")
	public static void method168(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 >= field527 && arg2 < field528) {
			if (arg1 < field529) {
				arg4 -= field529 - arg1;
				arg1 = field529;
			}

			if (arg1 + arg4 > field530) {
				arg4 = field530 - arg1;
			}

			int var5 = 256 - arg3;
			int var6 = (arg0 >> 16 & 0xFF) * arg3;
			int var7 = (arg0 >> 8 & 0xFF) * arg3;
			int var8 = (arg0 & 0xFF) * arg3;
			int var9 = field525 * arg2 + arg1;
			for (int var10 = 0; var10 < arg4; var10++) {
				int var11 = (field524[var9] >> 16 & 0xFF) * var5;
				int var12 = (field524[var9] >> 8 & 0xFF) * var5;
				int var13 = (field524[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field524[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("DEVPLWNC.c(IIIII)V")
	public static void method169(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field529 && arg1 < field530) {
			if (arg0 < field527) {
				arg3 -= field527 - arg0;
				arg0 = field527;
			}

			if (arg0 + arg3 > field528) {
				arg3 = field528 - arg0;
			}

			int var4 = field525 * arg0 + arg1;
			for (int var5 = 0; var5 < arg3; var5++) {
				field524[field525 * var5 + var4] = arg2;
			}
		}
	}

	@ObfuscatedName("DEVPLWNC.c(IIIIII)V")
	public static void method170(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 >= field529 && arg3 < field530) {
			if (arg4 < field527) {
				arg2 -= field527 - arg4;
				arg4 = field527;
			}

			if (arg2 + arg4 > field528) {
				arg2 = field528 - arg4;
			}

			int var5 = 256 - arg1;
			int var6 = (arg0 >> 16 & 0xFF) * arg1;
			int var7 = (arg0 >> 8 & 0xFF) * arg1;
			int var8 = (arg0 & 0xFF) * arg1;
			int var9 = field525 * arg4 + arg3;
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = (field524[var9] >> 16 & 0xFF) * var5;
				int var12 = (field524[var9] >> 8 & 0xFF) * var5;
				int var13 = (field524[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field524[var9] = var14;
				var9 += field525;
			}
		}
	}
}
