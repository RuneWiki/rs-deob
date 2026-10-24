package deob;

@ObfuscatedName("TIJYBGAE")
public class TIJYBGAE extends IVMCUDWL {

	@ObfuscatedName("TIJYBGAE.m")
	public static int field1345;

	@ObfuscatedName("TIJYBGAE.n")
	public static int field1346;

	@ObfuscatedName("TIJYBGAE.o")
	public static int field1347;

	@ObfuscatedName("TIJYBGAE.p")
	public static int field1348;

	@ObfuscatedName("TIJYBGAE.q")
	public static int field1349;

	@ObfuscatedName("TIJYBGAE.r")
	public static int field1350;

	@ObfuscatedName("TIJYBGAE.s")
	public static int field1351;

	@ObfuscatedName("TIJYBGAE.t")
	public static int field1352;

	@ObfuscatedName("TIJYBGAE.u")
	public static int field1353;

	@ObfuscatedName("TIJYBGAE.l")
	public static int[] field1344;

	@ObfuscatedName("TIJYBGAE.a(II[II)V")
	public static void method487(int arg0, int arg1, int[] arg2) {
		field1344 = arg2;
		field1345 = arg0;
		field1346 = arg1;
		method489(arg1, 0, 0, arg0);
	}

	@ObfuscatedName("TIJYBGAE.a(I)V")
	public static void method488() {
		field1349 = 0;
		field1347 = 0;
		field1350 = field1345;
		field1348 = field1346;
		field1351 = field1350 - 1;
		field1352 = field1350 / 2;
	}

	@ObfuscatedName("TIJYBGAE.a(IIIII)V")
	public static void method489(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg2 < 0) {
			arg2 = 0;
		}

		if (arg3 > field1345) {
			arg3 = field1345;
		}

		if (arg0 > field1346) {
			arg0 = field1346;
		}

		field1349 = arg1;
		field1347 = arg2;
		field1350 = arg3;
		field1348 = arg0;
		field1351 = field1350 - 1;
		field1352 = field1350 / 2;
		field1353 = field1348 / 2;
	}

	@ObfuscatedName("TIJYBGAE.b(I)V")
	public static void method490() {
		int var0 = field1346 * field1345;
		for (int var1 = 0; var1 < var0; var1++) {
			field1344[var1] = 0;
		}
	}

	@ObfuscatedName("TIJYBGAE.a(IIIIIII)V")
	public static void method491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 < field1349) {
			arg4 -= field1349 - arg1;
			arg1 = field1349;
		}

		if (arg2 < field1347) {
			arg0 -= field1347 - arg2;
			arg2 = field1347;
		}

		if (arg1 + arg4 > field1350) {
			arg4 = field1350 - arg1;
		}

		if (arg0 + arg2 > field1348) {
			arg0 = field1348 - arg2;
		}

		int var6 = 256 - arg3;
		int var7 = (arg5 >> 16 & 0xFF) * arg3;
		int var8 = (arg5 >> 8 & 0xFF) * arg3;
		int var9 = (arg5 & 0xFF) * arg3;
		int var10 = field1345 - arg4;
		int var11 = field1345 * arg2 + arg1;
		for (int var12 = 0; var12 < arg0; var12++) {
			for (int var13 = -arg4; var13 < 0; var13++) {
				int var14 = (field1344[var11] >> 16 & 0xFF) * var6;
				int var15 = (field1344[var11] >> 8 & 0xFF) * var6;
				int var16 = (field1344[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field1344[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("TIJYBGAE.a(IIIIII)V")
	public static void method492(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 < field1349) {
			arg0 -= field1349 - arg4;
			arg4 = field1349;
		}

		if (arg1 < field1347) {
			arg3 -= field1347 - arg1;
			arg1 = field1347;
		}

		if (arg0 + arg4 > field1350) {
			arg0 = field1350 - arg4;
		}

		if (arg1 + arg3 > field1348) {
			arg3 = field1348 - arg1;
		}

		int var5 = field1345 - arg0;
		int var6 = field1345 * arg1 + arg4;
		for (int var7 = -arg3; var7 < 0; var7++) {
			for (int var8 = -arg0; var8 < 0; var8++) {
				field1344[var6++] = arg2;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("TIJYBGAE.a(IIIIBI)V")
	public static void method493(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method495(arg3, arg0, arg4, arg1);
		method495(arg2 + arg3 - 1, arg0, arg4, arg1);
		method497(arg3, arg2, arg4, arg0);
		method497(arg3, arg2, arg1 + arg4 - 1, arg0);
	}

	@ObfuscatedName("TIJYBGAE.a(IIIIIIZ)V")
	public static void method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method496(arg0, arg4, arg3, arg1, arg2);
		method496(arg0, arg4, arg3, arg1, arg2 + arg5 - 1);

		if (arg5 >= 3) {
			method498(arg2 + 1, arg3, arg0, arg5 - 2, arg1);
			method498(arg2 + 1, arg3, arg0, arg5 - 2, arg1 + arg4 - 1);
		}
	}

	@ObfuscatedName("TIJYBGAE.b(IIIII)V")
	public static void method495(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field1347 && arg0 < field1348) {
			if (arg2 < field1349) {
				arg3 -= field1349 - arg2;
				arg2 = field1349;
			}

			if (arg2 + arg3 > field1350) {
				arg3 = field1350 - arg2;
			}

			int var4 = field1345 * arg0 + arg2;
			for (int var5 = 0; var5 < arg3; var5++) {
				field1344[var4 + var5] = arg1;
			}
		}
	}

	@ObfuscatedName("TIJYBGAE.a(IIBIII)V")
	public static void method496(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 >= field1347 && arg4 < field1348) {
			if (arg3 < field1349) {
				arg1 -= field1349 - arg3;
				arg3 = field1349;
			}

			if (arg1 + arg3 > field1350) {
				arg1 = field1350 - arg3;
			}

			int var5 = 256 - arg0;
			int var6 = (arg2 >> 16 & 0xFF) * arg0;
			int var7 = (arg2 >> 8 & 0xFF) * arg0;
			int var8 = (arg2 & 0xFF) * arg0;
			int var9 = field1345 * arg4 + arg3;
			for (int var10 = 0; var10 < arg1; var10++) {
				int var11 = (field1344[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1344[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1344[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1344[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("TIJYBGAE.c(IIIII)V")
	public static void method497(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field1349 && arg2 < field1350) {
			if (arg0 < field1347) {
				arg1 -= field1347 - arg0;
				arg0 = field1347;
			}

			if (arg0 + arg1 > field1348) {
				arg1 = field1348 - arg0;
			}

			int var4 = field1345 * arg0 + arg2;
			for (int var5 = 0; var5 < arg1; var5++) {
				field1344[field1345 * var5 + var4] = arg3;
			}
		}
	}

	@ObfuscatedName("TIJYBGAE.b(IIIIII)V")
	public static void method498(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 >= field1349 && arg4 < field1350) {
			if (arg0 < field1347) {
				arg3 -= field1347 - arg0;
				arg0 = field1347;
			}

			if (arg0 + arg3 > field1348) {
				arg3 = field1348 - arg0;
			}

			int var5 = 256 - arg2;
			int var6 = (arg1 >> 16 & 0xFF) * arg2;
			int var7 = (arg1 >> 8 & 0xFF) * arg2;
			int var8 = (arg1 & 0xFF) * arg2;
			int var9 = field1345 * arg0 + arg4;
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = (field1344[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1344[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1344[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1344[var9] = var14;
				var9 += field1345;
			}
		}
	}
}
