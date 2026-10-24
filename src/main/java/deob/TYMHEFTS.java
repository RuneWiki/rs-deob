package deob;

@ObfuscatedName("TYMHEFTS")
public class TYMHEFTS extends ICYNFRTV {

	@ObfuscatedName("TYMHEFTS.q")
	public static int field1310;

	@ObfuscatedName("TYMHEFTS.r")
	public static int field1311;

	@ObfuscatedName("TYMHEFTS.s")
	public static int field1312;

	@ObfuscatedName("TYMHEFTS.t")
	public static int field1313;

	@ObfuscatedName("TYMHEFTS.u")
	public static int field1314;

	@ObfuscatedName("TYMHEFTS.v")
	public static int field1315;

	@ObfuscatedName("TYMHEFTS.w")
	public static int field1316;

	@ObfuscatedName("TYMHEFTS.x")
	public static int field1317;

	@ObfuscatedName("TYMHEFTS.y")
	public static int field1318;

	@ObfuscatedName("TYMHEFTS.p")
	public static int[] field1309;

	@ObfuscatedName("TYMHEFTS.a([IIII)V")
	public static void method523(int[] arg0, int arg1, int arg2) {
		field1309 = arg0;
		field1310 = arg2;
		field1311 = arg1;
		method525(0, 0, arg1, arg2);
	}

	@ObfuscatedName("TYMHEFTS.a(B)V")
	public static void method524() {
		field1314 = 0;
		field1312 = 0;
		field1315 = field1310;
		field1313 = field1311;
		field1316 = field1315 - 1;
		field1317 = field1315 / 2;
	}

	@ObfuscatedName("TYMHEFTS.a(IIIII)V")
	public static void method525(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg3 > field1310) {
			arg3 = field1310;
		}

		if (arg2 > field1311) {
			arg2 = field1311;
		}

		field1314 = arg0;
		field1312 = arg1;
		field1315 = arg3;
		field1313 = arg2;
		field1316 = field1315 - 1;
		field1317 = field1315 / 2;
		field1318 = field1313 / 2;
	}

	@ObfuscatedName("TYMHEFTS.a(I)V")
	public static void method526() {
		int var0 = field1311 * field1310;
		for (int var1 = 0; var1 < var0; var1++) {
			field1309[var1] = 0;
		}
	}

	@ObfuscatedName("TYMHEFTS.a(IBIIIII)V")
	public static void method527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 < field1314) {
			arg1 -= field1314 - arg2;
			arg2 = field1314;
		}

		if (arg4 < field1312) {
			arg0 -= field1312 - arg4;
			arg4 = field1312;
		}

		if (arg1 + arg2 > field1315) {
			arg1 = field1315 - arg2;
		}

		if (arg0 + arg4 > field1313) {
			arg0 = field1313 - arg4;
		}

		int var6 = 256 - arg3;
		int var7 = (arg5 >> 16 & 0xFF) * arg3;
		int var8 = (arg5 >> 8 & 0xFF) * arg3;
		int var9 = (arg5 & 0xFF) * arg3;
		int var10 = field1310 - arg1;
		int var11 = field1310 * arg4 + arg2;
		for (int var12 = 0; var12 < arg0; var12++) {
			for (int var13 = -arg1; var13 < 0; var13++) {
				int var14 = (field1309[var11] >> 16 & 0xFF) * var6;
				int var15 = (field1309[var11] >> 8 & 0xFF) * var6;
				int var16 = (field1309[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field1309[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("TYMHEFTS.a(BIIIII)V")
	public static void method528(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 < field1314) {
			arg0 -= field1314 - arg2;
			arg2 = field1314;
		}

		if (arg1 < field1312) {
			arg3 -= field1312 - arg1;
			arg1 = field1312;
		}

		if (arg0 + arg2 > field1315) {
			arg0 = field1315 - arg2;
		}

		if (arg1 + arg3 > field1313) {
			arg3 = field1313 - arg1;
		}

		int var5 = field1310 - arg0;
		int var6 = field1310 * arg1 + arg2;
		for (int var7 = -arg3; var7 < 0; var7++) {
			for (int var8 = -arg0; var8 < 0; var8++) {
				field1309[var6++] = arg4;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("TYMHEFTS.a(IIIIII)V")
	public static void method529(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method531(arg2, arg0, arg3, arg4);
		method531(arg1 + arg2 - 1, arg0, arg3, arg4);
		method533(arg1, arg3, arg2, arg4);
		method533(arg1, arg3, arg2, arg0 + arg4 - 1);
	}

	@ObfuscatedName("TYMHEFTS.a(IIIIIII)V")
	public static void method530(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method532(arg3, arg4, arg0, arg2, arg1);
		method532(arg3, arg4, arg0, arg2, arg1 + arg5 - 1);

		if (arg5 >= 3) {
			method534(arg5 - 2, arg3, arg2, arg1 + 1, arg0);
			method534(arg5 - 2, arg3, arg2, arg1 + 1, arg0 + arg4 - 1);
		}
	}

	@ObfuscatedName("TYMHEFTS.b(IIIII)V")
	public static void method531(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field1312 && arg0 < field1313) {
			if (arg3 < field1314) {
				arg1 -= field1314 - arg3;
				arg3 = field1314;
			}

			if (arg1 + arg3 > field1315) {
				arg1 = field1315 - arg3;
			}

			int var4 = field1310 * arg0 + arg3;
			for (int var5 = 0; var5 < arg1; var5++) {
				field1309[var4 + var5] = arg2;
			}
		}
	}

	@ObfuscatedName("TYMHEFTS.a(IIIIBI)V")
	public static void method532(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 >= field1312 && arg4 < field1313) {
			if (arg2 < field1314) {
				arg1 -= field1314 - arg2;
				arg2 = field1314;
			}

			if (arg1 + arg2 > field1315) {
				arg1 = field1315 - arg2;
			}

			int var5 = 256 - arg3;
			int var6 = (arg0 >> 16 & 0xFF) * arg3;
			int var7 = (arg0 >> 8 & 0xFF) * arg3;
			int var8 = (arg0 & 0xFF) * arg3;
			int var9 = field1310 * arg4 + arg2;
			for (int var10 = 0; var10 < arg1; var10++) {
				int var11 = (field1309[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1309[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1309[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1309[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("TYMHEFTS.c(IIIII)V")
	public static void method533(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field1314 && arg3 < field1315) {
			if (arg2 < field1312) {
				arg0 -= field1312 - arg2;
				arg2 = field1312;
			}

			if (arg0 + arg2 > field1313) {
				arg0 = field1313 - arg2;
			}

			int var4 = field1310 * arg2 + arg3;
			for (int var5 = 0; var5 < arg0; var5++) {
				field1309[field1310 * var5 + var4] = arg1;
			}
		}
	}

	@ObfuscatedName("TYMHEFTS.a(IIIIZI)V")
	public static void method534(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 >= field1314 && arg4 < field1315) {
			if (arg3 < field1312) {
				arg0 -= field1312 - arg3;
				arg3 = field1312;
			}

			if (arg0 + arg3 > field1313) {
				arg0 = field1313 - arg3;
			}

			int var5 = 256 - arg2;
			int var6 = (arg1 >> 16 & 0xFF) * arg2;
			int var7 = (arg1 >> 8 & 0xFF) * arg2;
			int var8 = (arg1 & 0xFF) * arg2;
			int var9 = field1310 * arg3 + arg4;
			for (int var10 = 0; var10 < arg0; var10++) {
				int var11 = (field1309[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1309[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1309[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1309[var9] = var14;
				var9 += field1310;
			}
		}
	}
}
