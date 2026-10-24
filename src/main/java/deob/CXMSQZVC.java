package deob;

@ObfuscatedName("CXMSQZVC")
public class CXMSQZVC extends OBKNBIRU {

	@ObfuscatedName("CXMSQZVC.n")
	public static int field568;

	@ObfuscatedName("CXMSQZVC.o")
	public static int field569;

	@ObfuscatedName("CXMSQZVC.p")
	public static int field570;

	@ObfuscatedName("CXMSQZVC.q")
	public static int field571;

	@ObfuscatedName("CXMSQZVC.r")
	public static int field572;

	@ObfuscatedName("CXMSQZVC.s")
	public static int field573;

	@ObfuscatedName("CXMSQZVC.t")
	public static int field574;

	@ObfuscatedName("CXMSQZVC.u")
	public static int field575;

	@ObfuscatedName("CXMSQZVC.v")
	public static int field576;

	@ObfuscatedName("CXMSQZVC.m")
	public static int[] field567;

	@ObfuscatedName("CXMSQZVC.a(III[I)V")
	public static void method197(int arg0, int arg1, int[] arg2) {
		field567 = arg2;
		field568 = arg1;
		field569 = arg0;
		method199(arg0, 0, 0, arg1);
	}

	@ObfuscatedName("CXMSQZVC.a(I)V")
	public static void method198() {
		field572 = 0;
		field570 = 0;
		field573 = field568;
		field571 = field569;
		field574 = field573 - 1;
		field575 = field573 / 2;
	}

	@ObfuscatedName("CXMSQZVC.a(IIIBI)V")
	public static void method199(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 < 0) {
			arg2 = 0;
		}

		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg3 > field568) {
			arg3 = field568;
		}

		if (arg0 > field569) {
			arg0 = field569;
		}

		field572 = arg2;
		field570 = arg1;
		field573 = arg3;
		field571 = arg0;
		field574 = field573 - 1;
		field575 = field573 / 2;
		field576 = field571 / 2;
	}

	@ObfuscatedName("CXMSQZVC.b(I)V")
	public static void method200() {
		int var0 = field569 * field568;
		for (int var1 = 0; var1 < var0; var1++) {
			field567[var1] = 0;
		}
	}

	@ObfuscatedName("CXMSQZVC.a(ZIIIIII)V")
	public static void method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 < field572) {
			arg5 -= field572 - arg4;
			arg4 = field572;
		}

		if (arg1 < field570) {
			arg2 -= field570 - arg1;
			arg1 = field570;
		}

		if (arg4 + arg5 > field573) {
			arg5 = field573 - arg4;
		}

		if (arg1 + arg2 > field571) {
			arg2 = field571 - arg1;
		}

		int var6 = 256 - arg3;
		int var7 = (arg0 >> 16 & 0xFF) * arg3;
		int var8 = (arg0 >> 8 & 0xFF) * arg3;
		int var9 = (arg0 & 0xFF) * arg3;
		int var10 = field568 - arg5;
		int var11 = field568 * arg1 + arg4;
		for (int var12 = 0; var12 < arg2; var12++) {
			for (int var13 = -arg5; var13 < 0; var13++) {
				int var14 = (field567[var11] >> 16 & 0xFF) * var6;
				int var15 = (field567[var11] >> 8 & 0xFF) * var6;
				int var16 = (field567[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field567[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("CXMSQZVC.a(IIIIII)V")
	public static void method202(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 < field572) {
			arg2 -= field572 - arg1;
			arg1 = field572;
		}

		if (arg3 < field570) {
			arg4 -= field570 - arg3;
			arg3 = field570;
		}

		if (arg1 + arg2 > field573) {
			arg2 = field573 - arg1;
		}

		if (arg3 + arg4 > field571) {
			arg4 = field571 - arg3;
		}

		int var5 = field568 - arg2;
		int var6 = field568 * arg3 + arg1;
		for (int var7 = -arg4; var7 < 0; var7++) {
			for (int var8 = -arg2; var8 < 0; var8++) {
				field567[var6++] = arg0;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("CXMSQZVC.a(IIIIZI)V")
	public static void method203(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method205(arg4, arg2, arg3, arg0);
		method205(arg4, arg2, arg3, arg0 + arg1 - 1);
		method207(arg2, arg1, arg0, arg3);
		method207(arg2, arg1, arg0, arg3 + arg4 - 1);
	}

	@ObfuscatedName("CXMSQZVC.a(IIIIIII)V")
	public static void method204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method206(arg2, arg1, arg4, arg0, arg5);
		method206(arg2, arg1, arg3 + arg4 - 1, arg0, arg5);

		if (arg3 >= 3) {
			method208(arg2, arg1, arg5, arg4 + 1, arg3 - 2);
			method208(arg0 + arg2 - 1, arg1, arg5, arg4 + 1, arg3 - 2);
		}
	}

	@ObfuscatedName("CXMSQZVC.a(IIBII)V")
	public static void method205(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field570 && arg3 < field571) {
			if (arg2 < field572) {
				arg0 -= field572 - arg2;
				arg2 = field572;
			}

			if (arg0 + arg2 > field573) {
				arg0 = field573 - arg2;
			}

			int var4 = field568 * arg3 + arg2;
			for (int var5 = 0; var5 < arg0; var5++) {
				field567[var4 + var5] = arg1;
			}
		}
	}

	@ObfuscatedName("CXMSQZVC.b(IIIIII)V")
	public static void method206(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 >= field570 && arg2 < field571) {
			if (arg0 < field572) {
				arg3 -= field572 - arg0;
				arg0 = field572;
			}

			if (arg0 + arg3 > field573) {
				arg3 = field573 - arg0;
			}

			int var5 = 256 - arg1;
			int var6 = (arg4 >> 16 & 0xFF) * arg1;
			int var7 = (arg4 >> 8 & 0xFF) * arg1;
			int var8 = (arg4 & 0xFF) * arg1;
			int var9 = field568 * arg2 + arg0;
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = (field567[var9] >> 16 & 0xFF) * var5;
				int var12 = (field567[var9] >> 8 & 0xFF) * var5;
				int var13 = (field567[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field567[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("CXMSQZVC.a(IIIIB)V")
	public static void method207(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field572 && arg3 < field573) {
			if (arg2 < field570) {
				arg1 -= field570 - arg2;
				arg2 = field570;
			}

			if (arg1 + arg2 > field571) {
				arg1 = field571 - arg2;
			}

			int var4 = field568 * arg2 + arg3;
			for (int var5 = 0; var5 < arg1; var5++) {
				field567[field568 * var5 + var4] = arg0;
			}
		}
	}

	@ObfuscatedName("CXMSQZVC.a(IIIIBI)V")
	public static void method208(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field572 && arg0 < field573) {
			if (arg3 < field570) {
				arg4 -= field570 - arg3;
				arg3 = field570;
			}

			if (arg3 + arg4 > field571) {
				arg4 = field571 - arg3;
			}

			int var5 = 256 - arg1;
			int var6 = (arg2 >> 16 & 0xFF) * arg1;
			int var7 = (arg2 >> 8 & 0xFF) * arg1;
			int var8 = (arg2 & 0xFF) * arg1;
			int var9 = field568 * arg3 + arg0;
			for (int var10 = 0; var10 < arg4; var10++) {
				int var11 = (field567[var9] >> 16 & 0xFF) * var5;
				int var12 = (field567[var9] >> 8 & 0xFF) * var5;
				int var13 = (field567[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field567[var9] = var14;
				var9 += field568;
			}
		}
	}
}
