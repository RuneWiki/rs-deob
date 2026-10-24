package deob;

@ObfuscatedName("UKUXLUWP")
public class UKUXLUWP extends DRKSBDQX {

	@ObfuscatedName("UKUXLUWP.o")
	public static int field1346;

	@ObfuscatedName("UKUXLUWP.p")
	public static int field1347;

	@ObfuscatedName("UKUXLUWP.q")
	public static int field1348;

	@ObfuscatedName("UKUXLUWP.r")
	public static int field1349;

	@ObfuscatedName("UKUXLUWP.s")
	public static int field1350;

	@ObfuscatedName("UKUXLUWP.t")
	public static int field1351;

	@ObfuscatedName("UKUXLUWP.u")
	public static int field1352;

	@ObfuscatedName("UKUXLUWP.v")
	public static int field1353;

	@ObfuscatedName("UKUXLUWP.w")
	public static int field1354;

	@ObfuscatedName("UKUXLUWP.n")
	public static int[] field1345;

	@ObfuscatedName("UKUXLUWP.a(I[IBI)V")
	public static void method541(int arg0, int[] arg1, int arg2) {
		field1345 = arg1;
		field1346 = arg0;
		field1347 = arg2;
		method543(0, 0, arg0, arg2);
	}

	@ObfuscatedName("UKUXLUWP.a(I)V")
	public static void method542() {
		field1350 = 0;
		field1348 = 0;
		field1351 = field1346;
		field1349 = field1347;
		field1352 = field1351 - 1;
		field1353 = field1351 / 2;
	}

	@ObfuscatedName("UKUXLUWP.a(IIIII)V")
	public static void method543(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg2 > field1346) {
			arg2 = field1346;
		}

		if (arg3 > field1347) {
			arg3 = field1347;
		}

		field1350 = arg0;
		field1348 = arg1;
		field1351 = arg2;
		field1349 = arg3;
		field1352 = field1351 - 1;
		field1353 = field1351 / 2;
		field1354 = field1349 / 2;
	}

	@ObfuscatedName("UKUXLUWP.a(B)V")
	public static void method544() {
		int var0 = field1347 * field1346;
		for (int var1 = 0; var1 < var0; var1++) {
			field1345[var1] = 0;
		}
	}

	@ObfuscatedName("UKUXLUWP.a(IIIIIII)V")
	public static void method545(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 < field1350) {
			arg5 -= field1350 - arg0;
			arg0 = field1350;
		}

		if (arg1 < field1348) {
			arg4 -= field1348 - arg1;
			arg1 = field1348;
		}

		if (arg0 + arg5 > field1351) {
			arg5 = field1351 - arg0;
		}

		if (arg1 + arg4 > field1349) {
			arg4 = field1349 - arg1;
		}

		int var6 = 256 - arg3;
		int var7 = (arg2 >> 16 & 0xFF) * arg3;
		int var8 = (arg2 >> 8 & 0xFF) * arg3;
		int var9 = (arg2 & 0xFF) * arg3;
		int var10 = field1346 - arg5;
		int var11 = field1346 * arg1 + arg0;
		for (int var12 = 0; var12 < arg4; var12++) {
			for (int var13 = -arg5; var13 < 0; var13++) {
				int var14 = (field1345[var11] >> 16 & 0xFF) * var6;
				int var15 = (field1345[var11] >> 8 & 0xFF) * var6;
				int var16 = (field1345[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field1345[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("UKUXLUWP.a(IIZIII)V")
	public static void method546(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 < field1350) {
			arg3 -= field1350 - arg1;
			arg1 = field1350;
		}

		if (arg2 < field1348) {
			arg4 -= field1348 - arg2;
			arg2 = field1348;
		}

		if (arg1 + arg3 > field1351) {
			arg3 = field1351 - arg1;
		}

		if (arg2 + arg4 > field1349) {
			arg4 = field1349 - arg2;
		}

		int var5 = field1346 - arg3;
		int var6 = field1346 * arg2 + arg1;
		for (int var7 = -arg4; var7 < 0; var7++) {
			for (int var8 = -arg3; var8 < 0; var8++) {
				field1345[var6++] = arg0;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("UKUXLUWP.a(IIIIII)V")
	public static void method547(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method549(arg3, arg0, arg4, arg2);
		method549(arg3, arg0 + arg1 - 1, arg4, arg2);
		method551(arg3, arg1, arg2, arg0);
		method551(arg3, arg1, arg2 + arg4 - 1, arg0);
	}

	@ObfuscatedName("UKUXLUWP.a(IIIIBII)V")
	public static void method548(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method550(arg0, arg1, arg5, arg3, arg2);
		method550(arg0 + arg4 - 1, arg1, arg5, arg3, arg2);

		if (arg4 >= 3) {
			method552(arg0 + 1, arg2, arg3, arg4 - 2, arg5);
			method552(arg0 + 1, arg1 + arg2 - 1, arg3, arg4 - 2, arg5);
		}
	}

	@ObfuscatedName("UKUXLUWP.b(IIIII)V")
	public static void method549(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field1348 && arg1 < field1349) {
			if (arg3 < field1350) {
				arg2 -= field1350 - arg3;
				arg3 = field1350;
			}

			if (arg2 + arg3 > field1351) {
				arg2 = field1351 - arg3;
			}

			int var4 = field1346 * arg1 + arg3;
			for (int var5 = 0; var5 < arg2; var5++) {
				field1345[var4 + var5] = arg0;
			}
		}
	}

	@ObfuscatedName("UKUXLUWP.b(IIIIII)V")
	public static void method550(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field1348 && arg0 < field1349) {
			if (arg4 < field1350) {
				arg1 -= field1350 - arg4;
				arg4 = field1350;
			}

			if (arg1 + arg4 > field1351) {
				arg1 = field1351 - arg4;
			}

			int var5 = 256 - arg3;
			int var6 = (arg2 >> 16 & 0xFF) * arg3;
			int var7 = (arg2 >> 8 & 0xFF) * arg3;
			int var8 = (arg2 & 0xFF) * arg3;
			int var9 = field1346 * arg0 + arg4;
			for (int var10 = 0; var10 < arg1; var10++) {
				int var11 = (field1345[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1345[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1345[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1345[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("UKUXLUWP.c(IIIII)V")
	public static void method551(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field1350 && arg2 < field1351) {
			if (arg3 < field1348) {
				arg1 -= field1348 - arg3;
				arg3 = field1348;
			}

			if (arg1 + arg3 > field1349) {
				arg1 = field1349 - arg3;
			}

			int var4 = field1346 * arg3 + arg2;
			for (int var5 = 0; var5 < arg1; var5++) {
				field1345[field1346 * var5 + var4] = arg0;
			}
		}
	}

	@ObfuscatedName("UKUXLUWP.a(IIIIZI)V")
	public static void method552(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 >= field1350 && arg1 < field1351) {
			if (arg0 < field1348) {
				arg3 -= field1348 - arg0;
				arg0 = field1348;
			}

			if (arg0 + arg3 > field1349) {
				arg3 = field1349 - arg0;
			}

			int var5 = 256 - arg2;
			int var6 = (arg4 >> 16 & 0xFF) * arg2;
			int var7 = (arg4 >> 8 & 0xFF) * arg2;
			int var8 = (arg4 & 0xFF) * arg2;
			int var9 = field1346 * arg0 + arg1;
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = (field1345[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1345[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1345[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1345[var9] = var14;
				var9 += field1346;
			}
		}
	}
}
