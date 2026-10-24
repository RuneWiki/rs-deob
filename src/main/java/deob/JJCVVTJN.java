package deob;

@ObfuscatedName("JJCVVTJN")
public class JJCVVTJN extends YLJOEYBF {

	@ObfuscatedName("JJCVVTJN.m")
	public static int field676;

	@ObfuscatedName("JJCVVTJN.n")
	public static int field677;

	@ObfuscatedName("JJCVVTJN.o")
	public static int field678;

	@ObfuscatedName("JJCVVTJN.p")
	public static int field679;

	@ObfuscatedName("JJCVVTJN.q")
	public static int field680;

	@ObfuscatedName("JJCVVTJN.r")
	public static int field681;

	@ObfuscatedName("JJCVVTJN.s")
	public static int field682;

	@ObfuscatedName("JJCVVTJN.t")
	public static int field683;

	@ObfuscatedName("JJCVVTJN.u")
	public static int field684;

	@ObfuscatedName("JJCVVTJN.l")
	public static int[] field675;

	@ObfuscatedName("JJCVVTJN.a(IIZ[I)V")
	public static void method253(int arg0, int arg1, int[] arg2) {
		field675 = arg2;
		field676 = arg1;
		field677 = arg0;
		method255(arg0, 0, arg1, 0);
	}

	@ObfuscatedName("JJCVVTJN.a(B)V")
	public static void method254() {
		field680 = 0;
		field678 = 0;
		field681 = field676;
		field679 = field677;
		field682 = field681 - 1;
		field683 = field681 / 2;
	}

	@ObfuscatedName("JJCVVTJN.a(IIIIZ)V")
	public static void method255(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg2 > field676) {
			arg2 = field676;
		}

		if (arg0 > field677) {
			arg0 = field677;
		}

		field680 = arg3;
		field678 = arg1;
		field681 = arg2;
		field679 = arg0;
		field682 = field681 - 1;
		field683 = field681 / 2;
		field684 = field679 / 2;
	}

	@ObfuscatedName("JJCVVTJN.a(I)V")
	public static void method256() {
		int var0 = field677 * field676;
		for (int var1 = 0; var1 < var0; var1++) {
			field675[var1] = 0;
		}
	}

	@ObfuscatedName("JJCVVTJN.a(IIIBIII)V")
	public static void method257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 < field680) {
			arg1 -= field680 - arg4;
			arg4 = field680;
		}

		if (arg2 < field678) {
			arg5 -= field678 - arg2;
			arg2 = field678;
		}

		if (arg1 + arg4 > field681) {
			arg1 = field681 - arg4;
		}

		if (arg2 + arg5 > field679) {
			arg5 = field679 - arg2;
		}

		int var6 = 256 - arg0;
		int var7 = (arg3 >> 16 & 0xFF) * arg0;
		int var8 = (arg3 >> 8 & 0xFF) * arg0;
		int var9 = (arg3 & 0xFF) * arg0;
		int var10 = field676 - arg1;
		int var11 = field676 * arg2 + arg4;
		for (int var12 = 0; var12 < arg5; var12++) {
			for (int var13 = -arg1; var13 < 0; var13++) {
				int var14 = (field675[var11] >> 16 & 0xFF) * var6;
				int var15 = (field675[var11] >> 8 & 0xFF) * var6;
				int var16 = (field675[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field675[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("JJCVVTJN.a(IBIIII)V")
	public static void method258(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 < field680) {
			arg0 -= field680 - arg1;
			arg1 = field680;
		}

		if (arg3 < field678) {
			arg4 -= field678 - arg3;
			arg3 = field678;
		}

		if (arg0 + arg1 > field681) {
			arg0 = field681 - arg1;
		}

		if (arg3 + arg4 > field679) {
			arg4 = field679 - arg3;
		}

		int var5 = field676 - arg0;
		int var6 = field676 * arg3 + arg1;
		for (int var7 = -arg4; var7 < 0; var7++) {
			for (int var8 = -arg0; var8 < 0; var8++) {
				field675[var6++] = arg2;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("JJCVVTJN.a(IIIZII)V")
	public static void method259(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method261(arg2, arg0, arg4, arg1);
		method261(arg2, arg0, arg4, arg1 + arg3 - 1);
		method263(arg3, arg2, arg1, arg0);
		method263(arg3, arg2, arg1, arg0 + arg4 - 1);
	}

	@ObfuscatedName("JJCVVTJN.a(IIIIIII)V")
	public static void method260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method262(arg4, arg2, arg0, arg5, arg3);
		method262(arg4, arg2, arg0 + arg1 - 1, arg5, arg3);

		if (arg1 >= 3) {
			method264(arg2, arg5, arg0 + 1, arg4, arg1 - 2);
			method264(arg2, arg5, arg0 + 1, arg3 + arg4 - 1, arg1 - 2);
		}
	}

	@ObfuscatedName("JJCVVTJN.a(IBIII)V")
	public static void method261(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field678 && arg3 < field679) {
			if (arg1 < field680) {
				arg2 -= field680 - arg1;
				arg1 = field680;
			}

			if (arg1 + arg2 > field681) {
				arg2 = field681 - arg1;
			}

			int var4 = field676 * arg3 + arg1;
			for (int var5 = 0; var5 < arg2; var5++) {
				field675[var4 + var5] = arg0;
			}
		}
	}

	@ObfuscatedName("JJCVVTJN.a(IIIIII)V")
	public static void method262(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 >= field678 && arg2 < field679) {
			if (arg0 < field680) {
				arg4 -= field680 - arg0;
				arg0 = field680;
			}

			if (arg0 + arg4 > field681) {
				arg4 = field681 - arg0;
			}

			int var5 = 256 - arg1;
			int var6 = (arg3 >> 16 & 0xFF) * arg1;
			int var7 = (arg3 >> 8 & 0xFF) * arg1;
			int var8 = (arg3 & 0xFF) * arg1;
			int var9 = field676 * arg2 + arg0;
			for (int var10 = 0; var10 < arg4; var10++) {
				int var11 = (field675[var9] >> 16 & 0xFF) * var5;
				int var12 = (field675[var9] >> 8 & 0xFF) * var5;
				int var13 = (field675[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field675[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("JJCVVTJN.b(IBIII)V")
	public static void method263(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field680 && arg3 < field681) {
			if (arg2 < field678) {
				arg0 -= field678 - arg2;
				arg2 = field678;
			}

			if (arg0 + arg2 > field679) {
				arg0 = field679 - arg2;
			}

			int var4 = field676 * arg2 + arg3;
			for (int var5 = 0; var5 < arg0; var5++) {
				field675[field676 * var5 + var4] = arg1;
			}
		}
	}

	@ObfuscatedName("JJCVVTJN.a(IIIIZI)V")
	public static void method264(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 >= field680 && arg3 < field681) {
			if (arg2 < field678) {
				arg4 -= field678 - arg2;
				arg2 = field678;
			}

			if (arg2 + arg4 > field679) {
				arg4 = field679 - arg2;
			}

			int var5 = 256 - arg0;
			int var6 = (arg1 >> 16 & 0xFF) * arg0;
			int var7 = (arg1 >> 8 & 0xFF) * arg0;
			int var8 = (arg1 & 0xFF) * arg0;
			int var9 = field676 * arg2 + arg3;
			for (int var10 = 0; var10 < arg4; var10++) {
				int var11 = (field675[var9] >> 16 & 0xFF) * var5;
				int var12 = (field675[var9] >> 8 & 0xFF) * var5;
				int var13 = (field675[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field675[var9] = var14;
				var9 += field676;
			}
		}
	}
}
