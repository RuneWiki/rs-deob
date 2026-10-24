package deob;

@ObfuscatedName("VDGJUQAS")
public class VDGJUQAS extends NFNHZJTP {

	@ObfuscatedName("VDGJUQAS.n")
	public static int field1312;

	@ObfuscatedName("VDGJUQAS.o")
	public static int field1313;

	@ObfuscatedName("VDGJUQAS.p")
	public static int field1314;

	@ObfuscatedName("VDGJUQAS.q")
	public static int field1315;

	@ObfuscatedName("VDGJUQAS.r")
	public static int field1316;

	@ObfuscatedName("VDGJUQAS.s")
	public static int field1317;

	@ObfuscatedName("VDGJUQAS.t")
	public static int field1318;

	@ObfuscatedName("VDGJUQAS.u")
	public static int field1319;

	@ObfuscatedName("VDGJUQAS.v")
	public static int field1320;

	@ObfuscatedName("VDGJUQAS.m")
	public static int[] field1311;

	@ObfuscatedName("VDGJUQAS.a([IIII)V")
	public static void method512(int[] arg0, int arg1, int arg2) {
		field1311 = arg0;
		field1312 = arg2;
		field1313 = arg1;
		method514(0, 0, arg1, arg2);
	}

	@ObfuscatedName("VDGJUQAS.a(I)V")
	public static void method513() {
		field1316 = 0;
		field1314 = 0;
		field1317 = field1312;
		field1315 = field1313;
		field1318 = field1317 - 1;
		field1319 = field1317 / 2;
	}

	@ObfuscatedName("VDGJUQAS.a(IIIII)V")
	public static void method514(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg3 > field1312) {
			arg3 = field1312;
		}

		if (arg2 > field1313) {
			arg2 = field1313;
		}

		field1316 = arg0;
		field1314 = arg1;
		field1317 = arg3;
		field1315 = arg2;
		field1318 = field1317 - 1;
		field1319 = field1317 / 2;
		field1320 = field1315 / 2;
	}

	@ObfuscatedName("VDGJUQAS.a(B)V")
	public static void method515() {
		int var0 = field1313 * field1312;
		for (int var1 = 0; var1 < var0; var1++) {
			field1311[var1] = 0;
		}
	}

	@ObfuscatedName("VDGJUQAS.a(IIIIIII)V")
	public static void method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 < field1316) {
			arg0 -= field1316 - arg3;
			arg3 = field1316;
		}

		if (arg5 < field1314) {
			arg2 -= field1314 - arg5;
			arg5 = field1314;
		}

		if (arg0 + arg3 > field1317) {
			arg0 = field1317 - arg3;
		}

		if (arg2 + arg5 > field1315) {
			arg2 = field1315 - arg5;
		}

		int var6 = 256 - arg1;
		int var7 = (arg4 >> 16 & 0xFF) * arg1;
		int var8 = (arg4 >> 8 & 0xFF) * arg1;
		int var9 = (arg4 & 0xFF) * arg1;
		int var10 = field1312 - arg0;
		int var11 = field1312 * arg5 + arg3;
		for (int var12 = 0; var12 < arg2; var12++) {
			for (int var13 = -arg0; var13 < 0; var13++) {
				int var14 = (field1311[var11] >> 16 & 0xFF) * var6;
				int var15 = (field1311[var11] >> 8 & 0xFF) * var6;
				int var16 = (field1311[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field1311[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("VDGJUQAS.a(IIIIZI)V")
	public static void method517(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 < field1316) {
			arg3 -= field1316 - arg2;
			arg2 = field1316;
		}

		if (arg4 < field1314) {
			arg0 -= field1314 - arg4;
			arg4 = field1314;
		}

		if (arg2 + arg3 > field1317) {
			arg3 = field1317 - arg2;
		}

		if (arg0 + arg4 > field1315) {
			arg0 = field1315 - arg4;
		}

		int var5 = field1312 - arg3;
		int var6 = field1312 * arg4 + arg2;
		for (int var7 = -arg0; var7 < 0; var7++) {
			for (int var8 = -arg3; var8 < 0; var8++) {
				field1311[var6++] = arg1;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("VDGJUQAS.a(IIIIII)V")
	public static void method518(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method520(arg4, arg3, arg1, arg2);
		method520(arg0 + arg4 - 1, arg3, arg1, arg2);
		method522(arg2, arg1, arg0, arg4);
		method522(arg2, arg1 + arg3 - 1, arg0, arg4);
	}

	@ObfuscatedName("VDGJUQAS.a(IIIIIIZ)V")
	public static void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method521(arg0, arg4, arg1, arg2, arg3);
		method521(arg0, arg4, arg1, arg2 + arg5 - 1, arg3);

		if (arg5 >= 3) {
			method523(arg2 + 1, arg5 - 2, arg1, arg3, arg4);
			method523(arg2 + 1, arg5 - 2, arg0 + arg1 - 1, arg3, arg4);
		}
	}

	@ObfuscatedName("VDGJUQAS.b(IIIII)V")
	public static void method520(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field1314 && arg0 < field1315) {
			if (arg2 < field1316) {
				arg1 -= field1316 - arg2;
				arg2 = field1316;
			}

			if (arg1 + arg2 > field1317) {
				arg1 = field1317 - arg2;
			}

			int var4 = field1312 * arg0 + arg2;
			for (int var5 = 0; var5 < arg1; var5++) {
				field1311[var4 + var5] = arg3;
			}
		}
	}

	@ObfuscatedName("VDGJUQAS.b(IIIIII)V")
	public static void method521(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 >= field1314 && arg3 < field1315) {
			if (arg2 < field1316) {
				arg0 -= field1316 - arg2;
				arg2 = field1316;
			}

			if (arg0 + arg2 > field1317) {
				arg0 = field1317 - arg2;
			}

			int var5 = 256 - arg4;
			int var6 = (arg1 >> 16 & 0xFF) * arg4;
			int var7 = (arg1 >> 8 & 0xFF) * arg4;
			int var8 = (arg1 & 0xFF) * arg4;
			int var9 = field1312 * arg3 + arg2;
			for (int var10 = 0; var10 < arg0; var10++) {
				int var11 = (field1311[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1311[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1311[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1311[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("VDGJUQAS.a(IIIIZ)V")
	public static void method522(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field1316 && arg1 < field1317) {
			if (arg3 < field1314) {
				arg2 -= field1314 - arg3;
				arg3 = field1314;
			}

			if (arg2 + arg3 > field1315) {
				arg2 = field1315 - arg3;
			}

			int var4 = field1312 * arg3 + arg1;
			for (int var5 = 0; var5 < arg2; var5++) {
				field1311[field1312 * var5 + var4] = arg0;
			}
		}
	}

	@ObfuscatedName("VDGJUQAS.a(IIIIIZ)V")
	public static void method523(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 >= field1316 && arg2 < field1317) {
			if (arg0 < field1314) {
				arg1 -= field1314 - arg0;
				arg0 = field1314;
			}

			if (arg0 + arg1 > field1315) {
				arg1 = field1315 - arg0;
			}

			int var5 = 256 - arg3;
			int var6 = (arg4 >> 16 & 0xFF) * arg3;
			int var7 = (arg4 >> 8 & 0xFF) * arg3;
			int var8 = (arg4 & 0xFF) * arg3;
			int var9 = field1312 * arg0 + arg2;
			for (int var10 = 0; var10 < arg1; var10++) {
				int var11 = (field1311[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1311[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1311[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1311[var9] = var14;
				var9 += field1312;
			}
		}
	}
}
