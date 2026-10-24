package deob;

@ObfuscatedName("YYTDUXDR")
public class YYTDUXDR extends RZDMTEAZ {

	@ObfuscatedName("YYTDUXDR.o")
	public static int field1436;

	@ObfuscatedName("YYTDUXDR.p")
	public static int field1437;

	@ObfuscatedName("YYTDUXDR.q")
	public static int field1438;

	@ObfuscatedName("YYTDUXDR.r")
	public static int field1439;

	@ObfuscatedName("YYTDUXDR.s")
	public static int field1440;

	@ObfuscatedName("YYTDUXDR.t")
	public static int field1441;

	@ObfuscatedName("YYTDUXDR.u")
	public static int field1442;

	@ObfuscatedName("YYTDUXDR.v")
	public static int field1443;

	@ObfuscatedName("YYTDUXDR.w")
	public static int field1444;

	@ObfuscatedName("YYTDUXDR.n")
	public static int[] field1435;

	@ObfuscatedName("YYTDUXDR.a([IIZI)V")
	public static void method576(int[] arg0, int arg1, int arg2) {
		field1435 = arg0;
		field1436 = arg2;
		field1437 = arg1;
		method578(arg2, 0, 0, arg1);
	}

	@ObfuscatedName("YYTDUXDR.a(I)V")
	public static void method577() {
		field1440 = 0;
		field1438 = 0;
		field1441 = field1436;
		field1439 = field1437;
		field1442 = field1441 - 1;
		field1443 = field1441 / 2;
	}

	@ObfuscatedName("YYTDUXDR.a(IIIII)V")
	public static void method578(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 < 0) {
			arg2 = 0;
		}

		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg0 > field1436) {
			arg0 = field1436;
		}

		if (arg3 > field1437) {
			arg3 = field1437;
		}

		field1440 = arg2;
		field1438 = arg1;
		field1441 = arg0;
		field1439 = arg3;
		field1442 = field1441 - 1;
		field1443 = field1441 / 2;
		field1444 = field1439 / 2;
	}

	@ObfuscatedName("YYTDUXDR.a(Z)V")
	public static void method579() {
		int var0 = field1437 * field1436;
		for (int var1 = 0; var1 < var0; var1++) {
			field1435[var1] = 0;
		}
	}

	@ObfuscatedName("YYTDUXDR.a(IIIIIII)V")
	public static void method580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 < field1440) {
			arg5 -= field1440 - arg2;
			arg2 = field1440;
		}

		if (arg3 < field1438) {
			arg4 -= field1438 - arg3;
			arg3 = field1438;
		}

		if (arg2 + arg5 > field1441) {
			arg5 = field1441 - arg2;
		}

		if (arg3 + arg4 > field1439) {
			arg4 = field1439 - arg3;
		}

		int var6 = 256 - arg1;
		int var7 = (arg0 >> 16 & 0xFF) * arg1;
		int var8 = (arg0 >> 8 & 0xFF) * arg1;
		int var9 = (arg0 & 0xFF) * arg1;
		int var10 = field1436 - arg5;
		int var11 = field1436 * arg3 + arg2;
		for (int var12 = 0; var12 < arg4; var12++) {
			for (int var13 = -arg5; var13 < 0; var13++) {
				int var14 = (field1435[var11] >> 16 & 0xFF) * var6;
				int var15 = (field1435[var11] >> 8 & 0xFF) * var6;
				int var16 = (field1435[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field1435[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("YYTDUXDR.a(IBIIII)V")
	public static void method581(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 < field1440) {
			arg2 -= field1440 - arg0;
			arg0 = field1440;
		}

		if (arg4 < field1438) {
			arg3 -= field1438 - arg4;
			arg4 = field1438;
		}

		if (arg0 + arg2 > field1441) {
			arg2 = field1441 - arg0;
		}

		if (arg3 + arg4 > field1439) {
			arg3 = field1439 - arg4;
		}

		int var5 = field1436 - arg2;
		int var6 = field1436 * arg4 + arg0;
		for (int var7 = -arg3; var7 < 0; var7++) {
			for (int var8 = -arg2; var8 < 0; var8++) {
				field1435[var6++] = arg1;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("YYTDUXDR.a(IIIIBI)V")
	public static void method582(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method584(arg1, arg0, arg4, arg2);
		method584(arg1, arg0, arg3 + arg4 - 1, arg2);
		method586(arg4, arg3, arg2, arg1);
		method586(arg4, arg3, arg0 + arg2 - 1, arg1);
	}

	@ObfuscatedName("YYTDUXDR.a(BIIIIII)V")
	public static void method583(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method585(arg0, arg5, arg4, arg3, arg2);
		method585(arg0, arg5, arg4, arg3, arg1 + arg2 - 1);

		if (arg1 >= 3) {
			method587(arg4, arg5, arg3, arg2 + 1, arg1 - 2);
			method587(arg0 + arg4 - 1, arg5, arg3, arg2 + 1, arg1 - 2);
		}
	}

	@ObfuscatedName("YYTDUXDR.b(IIIII)V")
	public static void method584(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field1438 && arg2 < field1439) {
			if (arg3 < field1440) {
				arg1 -= field1440 - arg3;
				arg3 = field1440;
			}

			if (arg1 + arg3 > field1441) {
				arg1 = field1441 - arg3;
			}

			int var4 = field1436 * arg2 + arg3;
			for (int var5 = 0; var5 < arg1; var5++) {
				field1435[var4 + var5] = arg0;
			}
		}
	}

	@ObfuscatedName("YYTDUXDR.a(IIIIII)V")
	public static void method585(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 >= field1438 && arg4 < field1439) {
			if (arg2 < field1440) {
				arg0 -= field1440 - arg2;
				arg2 = field1440;
			}

			if (arg0 + arg2 > field1441) {
				arg0 = field1441 - arg2;
			}

			int var5 = 256 - arg1;
			int var6 = (arg3 >> 16 & 0xFF) * arg1;
			int var7 = (arg3 >> 8 & 0xFF) * arg1;
			int var8 = (arg3 & 0xFF) * arg1;
			int var9 = field1436 * arg4 + arg2;
			for (int var10 = 0; var10 < arg0; var10++) {
				int var11 = (field1435[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1435[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1435[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1435[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("YYTDUXDR.c(IIIII)V")
	public static void method586(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field1440 && arg2 < field1441) {
			if (arg0 < field1438) {
				arg1 -= field1438 - arg0;
				arg0 = field1438;
			}

			if (arg0 + arg1 > field1439) {
				arg1 = field1439 - arg0;
			}

			int var4 = field1436 * arg0 + arg2;
			for (int var5 = 0; var5 < arg1; var5++) {
				field1435[field1436 * var5 + var4] = arg3;
			}
		}
	}

	@ObfuscatedName("YYTDUXDR.b(IIIIBI)V")
	public static void method587(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field1440 && arg0 < field1441) {
			if (arg3 < field1438) {
				arg4 -= field1438 - arg3;
				arg3 = field1438;
			}

			if (arg3 + arg4 > field1439) {
				arg4 = field1439 - arg3;
			}

			int var5 = 256 - arg1;
			int var6 = (arg2 >> 16 & 0xFF) * arg1;
			int var7 = (arg2 >> 8 & 0xFF) * arg1;
			int var8 = (arg2 & 0xFF) * arg1;
			int var9 = field1436 * arg3 + arg0;
			for (int var10 = 0; var10 < arg4; var10++) {
				int var11 = (field1435[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1435[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1435[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1435[var9] = var14;
				var9 += field1436;
			}
		}
	}
}
