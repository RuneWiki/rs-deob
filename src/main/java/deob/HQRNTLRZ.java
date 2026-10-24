package deob;

@ObfuscatedName("HQRNTLRZ")
public class HQRNTLRZ extends LMGYBGQR {

	@ObfuscatedName("HQRNTLRZ.p")
	public static int field737;

	@ObfuscatedName("HQRNTLRZ.q")
	public static int field738;

	@ObfuscatedName("HQRNTLRZ.r")
	public static int field739;

	@ObfuscatedName("HQRNTLRZ.s")
	public static int field740;

	@ObfuscatedName("HQRNTLRZ.t")
	public static int field741;

	@ObfuscatedName("HQRNTLRZ.u")
	public static int field742;

	@ObfuscatedName("HQRNTLRZ.v")
	public static int field743;

	@ObfuscatedName("HQRNTLRZ.w")
	public static int field744;

	@ObfuscatedName("HQRNTLRZ.x")
	public static int field745;

	@ObfuscatedName("HQRNTLRZ.o")
	public static int[] field736;

	@ObfuscatedName("HQRNTLRZ.a(BI[II)V")
	public static void method279(int arg0, int[] arg1, int arg2) {
		field736 = arg1;
		field737 = arg0;
		field738 = arg2;
		method281(0, 0, arg0, arg2);
	}

	@ObfuscatedName("HQRNTLRZ.a(I)V")
	public static void method280() {
		field741 = 0;
		field739 = 0;
		field742 = field737;
		field740 = field738;
		field743 = field742 - 1;
		field744 = field742 / 2;
	}

	@ObfuscatedName("HQRNTLRZ.a(ZIIII)V")
	public static void method281(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg2 > field737) {
			arg2 = field737;
		}

		if (arg3 > field738) {
			arg3 = field738;
		}

		field741 = arg0;
		field739 = arg1;
		field742 = arg2;
		field740 = arg3;
		field743 = field742 - 1;
		field744 = field742 / 2;
		field745 = field740 / 2;
	}

	@ObfuscatedName("HQRNTLRZ.b(I)V")
	public static void method282() {
		int var0 = field738 * field737;
		for (int var1 = 0; var1 < var0; var1++) {
			field736[var1] = 0;
		}
	}

	@ObfuscatedName("HQRNTLRZ.a(IIIIIII)V")
	public static void method283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 < field741) {
			arg1 -= field741 - arg4;
			arg4 = field741;
		}

		if (arg2 < field739) {
			arg5 -= field739 - arg2;
			arg2 = field739;
		}

		if (arg1 + arg4 > field742) {
			arg1 = field742 - arg4;
		}

		if (arg2 + arg5 > field740) {
			arg5 = field740 - arg2;
		}

		int var6 = 256 - arg3;
		int var7 = (arg0 >> 16 & 0xFF) * arg3;
		int var8 = (arg0 >> 8 & 0xFF) * arg3;
		int var9 = (arg0 & 0xFF) * arg3;
		int var10 = field737 - arg1;
		int var11 = field737 * arg2 + arg4;
		for (int var12 = 0; var12 < arg5; var12++) {
			for (int var13 = -arg1; var13 < 0; var13++) {
				int var14 = (field736[var11] >> 16 & 0xFF) * var6;
				int var15 = (field736[var11] >> 8 & 0xFF) * var6;
				int var16 = (field736[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field736[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("HQRNTLRZ.a(IIIIII)V")
	public static void method284(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 < field741) {
			arg3 -= field741 - arg0;
			arg0 = field741;
		}

		if (arg1 < field739) {
			arg4 -= field739 - arg1;
			arg1 = field739;
		}

		if (arg0 + arg3 > field742) {
			arg3 = field742 - arg0;
		}

		if (arg1 + arg4 > field740) {
			arg4 = field740 - arg1;
		}

		int var5 = field737 - arg3;
		int var6 = field737 * arg1 + arg0;
		for (int var7 = -arg4; var7 < 0; var7++) {
			for (int var8 = -arg3; var8 < 0; var8++) {
				field736[var6++] = arg2;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("HQRNTLRZ.b(IIIIII)V")
	public static void method285(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method287(arg1, arg4, arg3, arg2);
		method287(arg1, arg0 + arg4 - 1, arg3, arg2);
		method289(arg2, arg1, arg4, arg0);
		method289(arg2 + arg3 - 1, arg1, arg4, arg0);
	}

	@ObfuscatedName("HQRNTLRZ.b(IIIIIII)V")
	public static void method286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method288(arg3, arg1, arg2, arg4, arg5);
		method288(arg3, arg1, arg2, arg0 + arg4 - 1, arg5);

		if (arg0 >= 3) {
			method290(arg0 - 2, arg5, arg4 + 1, arg1, arg2);
			method290(arg0 - 2, arg3 + arg5 - 1, arg4 + 1, arg1, arg2);
		}
	}

	@ObfuscatedName("HQRNTLRZ.a(IIIII)V")
	public static void method287(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field739 && arg1 < field740) {
			if (arg3 < field741) {
				arg2 -= field741 - arg3;
				arg3 = field741;
			}

			if (arg2 + arg3 > field742) {
				arg2 = field742 - arg3;
			}

			int var4 = field737 * arg1 + arg3;
			for (int var5 = 0; var5 < arg2; var5++) {
				field736[var4 + var5] = arg0;
			}
		}
	}

	@ObfuscatedName("HQRNTLRZ.c(IIIIII)V")
	public static void method288(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 >= field739 && arg3 < field740) {
			if (arg4 < field741) {
				arg0 -= field741 - arg4;
				arg4 = field741;
			}

			if (arg0 + arg4 > field742) {
				arg0 = field742 - arg4;
			}

			int var5 = 256 - arg2;
			int var6 = (arg1 >> 16 & 0xFF) * arg2;
			int var7 = (arg1 >> 8 & 0xFF) * arg2;
			int var8 = (arg1 & 0xFF) * arg2;
			int var9 = field737 * arg3 + arg4;
			for (int var10 = 0; var10 < arg0; var10++) {
				int var11 = (field736[var9] >> 16 & 0xFF) * var5;
				int var12 = (field736[var9] >> 8 & 0xFF) * var5;
				int var13 = (field736[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field736[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("HQRNTLRZ.b(IIIII)V")
	public static void method289(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field741 && arg0 < field742) {
			if (arg2 < field739) {
				arg3 -= field739 - arg2;
				arg2 = field739;
			}

			if (arg2 + arg3 > field740) {
				arg3 = field740 - arg2;
			}

			int var4 = field737 * arg2 + arg0;
			for (int var5 = 0; var5 < arg3; var5++) {
				field736[field737 * var5 + var4] = arg1;
			}
		}
	}

	@ObfuscatedName("HQRNTLRZ.a(IIBIII)V")
	public static void method290(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 >= field741 && arg1 < field742) {
			if (arg2 < field739) {
				arg0 -= field739 - arg2;
				arg2 = field739;
			}

			if (arg0 + arg2 > field740) {
				arg0 = field740 - arg2;
			}

			int var5 = 256 - arg4;
			int var6 = (arg3 >> 16 & 0xFF) * arg4;
			int var7 = (arg3 >> 8 & 0xFF) * arg4;
			int var8 = (arg3 & 0xFF) * arg4;
			int var9 = field737 * arg2 + arg1;
			for (int var10 = 0; var10 < arg0; var10++) {
				int var11 = (field736[var9] >> 16 & 0xFF) * var5;
				int var12 = (field736[var9] >> 8 & 0xFF) * var5;
				int var13 = (field736[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field736[var9] = var14;
				var9 += field737;
			}
		}
	}
}
