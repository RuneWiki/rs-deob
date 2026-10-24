package deob;

@ObfuscatedName("ZLDPKUPX")
public class ZLDPKUPX extends MCYIFIZT {

	@ObfuscatedName("ZLDPKUPX.p")
	public static int field1506;

	@ObfuscatedName("ZLDPKUPX.q")
	public static int field1507;

	@ObfuscatedName("ZLDPKUPX.r")
	public static int field1508;

	@ObfuscatedName("ZLDPKUPX.s")
	public static int field1509;

	@ObfuscatedName("ZLDPKUPX.t")
	public static int field1510;

	@ObfuscatedName("ZLDPKUPX.u")
	public static int field1511;

	@ObfuscatedName("ZLDPKUPX.v")
	public static int field1512;

	@ObfuscatedName("ZLDPKUPX.w")
	public static int field1513;

	@ObfuscatedName("ZLDPKUPX.x")
	public static int field1514;

	@ObfuscatedName("ZLDPKUPX.o")
	public static int[] field1505;

	@ObfuscatedName("ZLDPKUPX.a([IZII)V")
	public static void method592(int[] arg0, int arg1, int arg2) {
		field1505 = arg0;
		field1506 = arg1;
		field1507 = arg2;
		method594(arg2, 0, arg1, 0);
	}

	@ObfuscatedName("ZLDPKUPX.a(I)V")
	public static void method593() {
		field1510 = 0;
		field1508 = 0;
		field1511 = field1506;
		field1509 = field1507;
		field1512 = field1511 - 1;
		field1513 = field1511 / 2;
	}

	@ObfuscatedName("ZLDPKUPX.a(IIIII)V")
	public static void method594(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg2 > field1506) {
			arg2 = field1506;
		}

		if (arg0 > field1507) {
			arg0 = field1507;
		}

		field1510 = arg1;
		field1508 = arg3;
		field1511 = arg2;
		field1509 = arg0;
		field1512 = field1511 - 1;
		field1513 = field1511 / 2;
		field1514 = field1509 / 2;
	}

	@ObfuscatedName("ZLDPKUPX.b(I)V")
	public static void method595() {
		int var0 = field1507 * field1506;
		for (int var1 = 0; var1 < var0; var1++) {
			field1505[var1] = 0;
		}
	}

	@ObfuscatedName("ZLDPKUPX.a(IIIIIII)V")
	public static void method596(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 < field1510) {
			arg3 -= field1510 - arg4;
			arg4 = field1510;
		}

		if (arg0 < field1508) {
			arg2 -= field1508 - arg0;
			arg0 = field1508;
		}

		if (arg3 + arg4 > field1511) {
			arg3 = field1511 - arg4;
		}

		if (arg0 + arg2 > field1509) {
			arg2 = field1509 - arg0;
		}

		int var6 = 256 - arg1;
		int var7 = (arg5 >> 16 & 0xFF) * arg1;
		int var8 = (arg5 >> 8 & 0xFF) * arg1;
		int var9 = (arg5 & 0xFF) * arg1;
		int var10 = field1506 - arg3;
		int var11 = field1506 * arg0 + arg4;
		for (int var12 = 0; var12 < arg2; var12++) {
			for (int var13 = -arg3; var13 < 0; var13++) {
				int var14 = (field1505[var11] >> 16 & 0xFF) * var6;
				int var15 = (field1505[var11] >> 8 & 0xFF) * var6;
				int var16 = (field1505[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field1505[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("ZLDPKUPX.a(IIIIBI)V")
	public static void method597(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 < field1510) {
			arg0 -= field1510 - arg3;
			arg3 = field1510;
		}

		if (arg4 < field1508) {
			arg2 -= field1508 - arg4;
			arg4 = field1508;
		}

		if (arg0 + arg3 > field1511) {
			arg0 = field1511 - arg3;
		}

		if (arg2 + arg4 > field1509) {
			arg2 = field1509 - arg4;
		}

		int var5 = field1506 - arg0;
		int var6 = field1506 * arg4 + arg3;
		for (int var7 = -arg2; var7 < 0; var7++) {
			for (int var8 = -arg0; var8 < 0; var8++) {
				field1505[var6++] = arg1;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("ZLDPKUPX.a(IIZIII)V")
	public static void method598(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method600(arg3, arg2, arg1, arg4);
		method600(arg0 + arg3 - 1, arg2, arg1, arg4);
		method602(arg0, arg2, arg3, arg4);
		method602(arg0, arg2, arg3, arg1 + arg4 - 1);
	}

	@ObfuscatedName("ZLDPKUPX.b(IIIIIII)V")
	public static void method599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method601(arg3, arg2, arg1, arg4, arg0);
		method601(arg3, arg2, arg1, arg4, arg0 + arg5 - 1);

		if (arg5 >= 3) {
			method603(arg4, arg2, arg0 + 1, arg5 - 2, arg1);
			method603(arg4, arg2 + arg3 - 1, arg0 + 1, arg5 - 2, arg1);
		}
	}

	@ObfuscatedName("ZLDPKUPX.b(IIIII)V")
	public static void method600(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field1508 && arg0 < field1509) {
			if (arg3 < field1510) {
				arg2 -= field1510 - arg3;
				arg3 = field1510;
			}

			if (arg2 + arg3 > field1511) {
				arg2 = field1511 - arg3;
			}

			int var4 = field1506 * arg0 + arg3;
			for (int var5 = 0; var5 < arg2; var5++) {
				field1505[var4 + var5] = arg1;
			}
		}
	}

	@ObfuscatedName("ZLDPKUPX.a(IIIIZI)V")
	public static void method601(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 >= field1508 && arg4 < field1509) {
			if (arg1 < field1510) {
				arg0 -= field1510 - arg1;
				arg1 = field1510;
			}

			if (arg0 + arg1 > field1511) {
				arg0 = field1511 - arg1;
			}

			int var5 = 256 - arg3;
			int var6 = (arg2 >> 16 & 0xFF) * arg3;
			int var7 = (arg2 >> 8 & 0xFF) * arg3;
			int var8 = (arg2 & 0xFF) * arg3;
			int var9 = field1506 * arg4 + arg1;
			for (int var10 = 0; var10 < arg0; var10++) {
				int var11 = (field1505[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1505[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1505[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1505[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("ZLDPKUPX.a(IBIII)V")
	public static void method602(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field1510 && arg3 < field1511) {
			if (arg2 < field1508) {
				arg0 -= field1508 - arg2;
				arg2 = field1508;
			}

			if (arg0 + arg2 > field1509) {
				arg0 = field1509 - arg2;
			}

			int var4 = field1506 * arg2 + arg3;
			for (int var5 = 0; var5 < arg0; var5++) {
				field1505[field1506 * var5 + var4] = arg1;
			}
		}
	}

	@ObfuscatedName("ZLDPKUPX.a(IIIIII)V")
	public static void method603(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 >= field1510 && arg1 < field1511) {
			if (arg2 < field1508) {
				arg3 -= field1508 - arg2;
				arg2 = field1508;
			}

			if (arg2 + arg3 > field1509) {
				arg3 = field1509 - arg2;
			}

			int var5 = 256 - arg0;
			int var6 = (arg4 >> 16 & 0xFF) * arg0;
			int var7 = (arg4 >> 8 & 0xFF) * arg0;
			int var8 = (arg4 & 0xFF) * arg0;
			int var9 = field1506 * arg2 + arg1;
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = (field1505[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1505[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1505[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1505[var9] = var14;
				var9 += field1506;
			}
		}
	}
}
