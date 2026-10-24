package deob;

@ObfuscatedName("WNEQSCWL")
public class WNEQSCWL extends PFQOGDTY {

	@ObfuscatedName("WNEQSCWL.o")
	public static int field1453;

	@ObfuscatedName("WNEQSCWL.p")
	public static int field1454;

	@ObfuscatedName("WNEQSCWL.q")
	public static int field1455;

	@ObfuscatedName("WNEQSCWL.r")
	public static int field1456;

	@ObfuscatedName("WNEQSCWL.s")
	public static int field1457;

	@ObfuscatedName("WNEQSCWL.t")
	public static int field1458;

	@ObfuscatedName("WNEQSCWL.u")
	public static int field1459;

	@ObfuscatedName("WNEQSCWL.v")
	public static int field1460;

	@ObfuscatedName("WNEQSCWL.w")
	public static int field1461;

	@ObfuscatedName("WNEQSCWL.n")
	public static int[] field1452;

	@ObfuscatedName("WNEQSCWL.a(Z[III)V")
	public static void method568(int[] arg0, int arg1, int arg2) {
		field1452 = arg0;
		field1453 = arg1;
		field1454 = arg2;
		method570(0, arg2, arg1, 0);
	}

	@ObfuscatedName("WNEQSCWL.a(B)V")
	public static void method569() {
		field1457 = 0;
		field1455 = 0;
		field1458 = field1453;
		field1456 = field1454;
		field1459 = field1458 - 1;
		field1460 = field1458 / 2;
	}

	@ObfuscatedName("WNEQSCWL.a(IBIII)V")
	public static void method570(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg2 > field1453) {
			arg2 = field1453;
		}

		if (arg1 > field1454) {
			arg1 = field1454;
		}

		field1457 = arg0;
		field1455 = arg3;
		field1458 = arg2;
		field1456 = arg1;
		field1459 = field1458 - 1;
		field1460 = field1458 / 2;
		field1461 = field1456 / 2;
	}

	@ObfuscatedName("WNEQSCWL.a(Z)V")
	public static void method571() {
		int var0 = field1454 * field1453;
		for (int var1 = 0; var1 < var0; var1++) {
			field1452[var1] = 0;
		}
	}

	@ObfuscatedName("WNEQSCWL.a(IIIIIBI)V")
	public static void method572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 < field1457) {
			arg3 -= field1457 - arg4;
			arg4 = field1457;
		}

		if (arg2 < field1455) {
			arg0 -= field1455 - arg2;
			arg2 = field1455;
		}

		if (arg3 + arg4 > field1458) {
			arg3 = field1458 - arg4;
		}

		if (arg0 + arg2 > field1456) {
			arg0 = field1456 - arg2;
		}

		int var6 = 256 - arg1;
		int var7 = (arg5 >> 16 & 0xFF) * arg1;
		int var8 = (arg5 >> 8 & 0xFF) * arg1;
		int var9 = (arg5 & 0xFF) * arg1;
		int var10 = field1453 - arg3;
		int var11 = field1453 * arg2 + arg4;
		for (int var12 = 0; var12 < arg0; var12++) {
			for (int var13 = -arg3; var13 < 0; var13++) {
				int var14 = (field1452[var11] >> 16 & 0xFF) * var6;
				int var15 = (field1452[var11] >> 8 & 0xFF) * var6;
				int var16 = (field1452[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field1452[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("WNEQSCWL.a(BIIIII)V")
	public static void method573(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 < field1457) {
			arg4 -= field1457 - arg1;
			arg1 = field1457;
		}

		if (arg0 < field1455) {
			arg3 -= field1455 - arg0;
			arg0 = field1455;
		}

		if (arg1 + arg4 > field1458) {
			arg4 = field1458 - arg1;
		}

		if (arg0 + arg3 > field1456) {
			arg3 = field1456 - arg0;
		}

		int var5 = field1453 - arg4;
		int var6 = field1453 * arg0 + arg1;
		for (int var7 = -arg3; var7 < 0; var7++) {
			for (int var8 = -arg4; var8 < 0; var8++) {
				field1452[var6++] = arg2;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("WNEQSCWL.a(IIIIII)V")
	public static void method574(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method576(arg2, arg4, arg1, arg3);
		method576(arg2, arg4, arg0 + arg1 - 1, arg3);
		method578(arg3, arg0, arg1, arg2);
		method578(arg3, arg0, arg1, arg2 + arg4 - 1);
	}

	@ObfuscatedName("WNEQSCWL.a(IIIIIII)V")
	public static void method575(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method577(arg0, arg3, arg4, arg2, arg5);
		method577(arg0, arg3, arg1 + arg4 - 1, arg2, arg5);

		if (arg1 >= 3) {
			method579(arg5, arg1 - 2, arg2, arg4 + 1, arg3);
			method579(arg5, arg1 - 2, arg0 + arg2 - 1, arg4 + 1, arg3);
		}
	}

	@ObfuscatedName("WNEQSCWL.a(IIIII)V")
	public static void method576(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field1455 && arg2 < field1456) {
			if (arg0 < field1457) {
				arg1 -= field1457 - arg0;
				arg0 = field1457;
			}

			if (arg0 + arg1 > field1458) {
				arg1 = field1458 - arg0;
			}

			int var4 = field1453 * arg2 + arg0;
			for (int var5 = 0; var5 < arg1; var5++) {
				field1452[var4 + var5] = arg3;
			}
		}
	}

	@ObfuscatedName("WNEQSCWL.b(IIIIII)V")
	public static void method577(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 >= field1455 && arg2 < field1456) {
			if (arg3 < field1457) {
				arg0 -= field1457 - arg3;
				arg3 = field1457;
			}

			if (arg0 + arg3 > field1458) {
				arg0 = field1458 - arg3;
			}

			int var5 = 256 - arg1;
			int var6 = (arg4 >> 16 & 0xFF) * arg1;
			int var7 = (arg4 >> 8 & 0xFF) * arg1;
			int var8 = (arg4 & 0xFF) * arg1;
			int var9 = field1453 * arg2 + arg3;
			for (int var10 = 0; var10 < arg0; var10++) {
				int var11 = (field1452[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1452[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1452[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1452[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("WNEQSCWL.b(IIIII)V")
	public static void method578(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field1457 && arg3 < field1458) {
			if (arg2 < field1455) {
				arg1 -= field1455 - arg2;
				arg2 = field1455;
			}

			if (arg1 + arg2 > field1456) {
				arg1 = field1456 - arg2;
			}

			int var4 = field1453 * arg2 + arg3;
			for (int var5 = 0; var5 < arg1; var5++) {
				field1452[field1453 * var5 + var4] = arg0;
			}
		}
	}

	@ObfuscatedName("WNEQSCWL.c(IIIIII)V")
	public static void method579(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 >= field1457 && arg2 < field1458) {
			if (arg3 < field1455) {
				arg1 -= field1455 - arg3;
				arg3 = field1455;
			}

			if (arg1 + arg3 > field1456) {
				arg1 = field1456 - arg3;
			}

			int var5 = 256 - arg4;
			int var6 = (arg0 >> 16 & 0xFF) * arg4;
			int var7 = (arg0 >> 8 & 0xFF) * arg4;
			int var8 = (arg0 & 0xFF) * arg4;
			int var9 = field1453 * arg3 + arg2;
			for (int var10 = 0; var10 < arg1; var10++) {
				int var11 = (field1452[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1452[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1452[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1452[var9] = var14;
				var9 += field1453;
			}
		}
	}
}
