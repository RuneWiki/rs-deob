package deob;

@ObfuscatedName("ACKHPAZA")
public class ACKHPAZA extends ORGNKIAP {

	@ObfuscatedName("ACKHPAZA.A")
	public static int field10;

	@ObfuscatedName("ACKHPAZA.s")
	public static int field2;

	@ObfuscatedName("ACKHPAZA.t")
	public static int field3;

	@ObfuscatedName("ACKHPAZA.u")
	public static int field4;

	@ObfuscatedName("ACKHPAZA.v")
	public static int field5;

	@ObfuscatedName("ACKHPAZA.w")
	public static int field6;

	@ObfuscatedName("ACKHPAZA.x")
	public static int field7;

	@ObfuscatedName("ACKHPAZA.y")
	public static int field8;

	@ObfuscatedName("ACKHPAZA.z")
	public static int field9;

	@ObfuscatedName("ACKHPAZA.r")
	public static int[] field1;

	@ObfuscatedName("ACKHPAZA.a(I[III)V")
	public static void method1(int arg0, int[] arg1, int arg2) {
		field1 = arg1;
		field2 = arg2;
		field3 = arg0;
		method3(0, arg2, 0, arg0);
	}

	@ObfuscatedName("ACKHPAZA.a(B)V")
	public static void method2() {
		field6 = 0;
		field4 = 0;
		field7 = field2;
		field5 = field3;
		field8 = field7 - 1;
		field9 = field7 / 2;
	}

	@ObfuscatedName("ACKHPAZA.a(IIZII)V")
	public static void method3(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 < 0) {
			arg2 = 0;
		}

		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg1 > field2) {
			arg1 = field2;
		}

		if (arg3 > field3) {
			arg3 = field3;
		}

		field6 = arg2;
		field4 = arg0;
		field7 = arg1;
		field5 = arg3;
		field8 = field7 - 1;
		field9 = field7 / 2;
		field10 = field5 / 2;
	}

	@ObfuscatedName("ACKHPAZA.a(I)V")
	public static void method4() {
		int var0 = field3 * field2;
		for (int var1 = 0; var1 < var0; var1++) {
			field1[var1] = 0;
		}
	}

	@ObfuscatedName("ACKHPAZA.a(IBIIIII)V")
	public static void method5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 < field6) {
			arg4 -= field6 - arg1;
			arg1 = field6;
		}

		if (arg5 < field4) {
			arg2 -= field4 - arg5;
			arg5 = field4;
		}

		if (arg1 + arg4 > field7) {
			arg4 = field7 - arg1;
		}

		if (arg2 + arg5 > field5) {
			arg2 = field5 - arg5;
		}

		int var6 = 256 - arg0;
		int var7 = (arg3 >> 16 & 0xFF) * arg0;
		int var8 = (arg3 >> 8 & 0xFF) * arg0;
		int var9 = (arg3 & 0xFF) * arg0;
		int var10 = field2 - arg4;
		int var11 = field2 * arg5 + arg1;
		for (int var12 = 0; var12 < arg2; var12++) {
			for (int var13 = -arg4; var13 < 0; var13++) {
				int var14 = (field1[var11] >> 16 & 0xFF) * var6;
				int var15 = (field1[var11] >> 8 & 0xFF) * var6;
				int var16 = (field1[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field1[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("ACKHPAZA.a(IIIIII)V")
	public static void method6(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 < field6) {
			arg0 -= field6 - arg4;
			arg4 = field6;
		}

		if (arg2 < field4) {
			arg1 -= field4 - arg2;
			arg2 = field4;
		}

		if (arg0 + arg4 > field7) {
			arg0 = field7 - arg4;
		}

		if (arg1 + arg2 > field5) {
			arg1 = field5 - arg2;
		}

		int var5 = field2 - arg0;
		int var6 = field2 * arg2 + arg4;
		for (int var7 = -arg1; var7 < 0; var7++) {
			for (int var8 = -arg0; var8 < 0; var8++) {
				field1[var6++] = arg3;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("ACKHPAZA.b(IIIIII)V")
	public static void method7(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method9(arg2, arg0, arg1, arg3);
		method9(arg2, arg0, arg1 + arg4 - 1, arg3);
		method11(arg0, arg1, arg4, arg2);
		method11(arg0 + arg3 - 1, arg1, arg4, arg2);
	}

	@ObfuscatedName("ACKHPAZA.a(IIIIIII)V")
	public static void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method10(arg3, arg2, arg1, arg0, arg5);
		method10(arg3, arg2, arg1, arg0, arg4 + arg5 - 1);

		if (arg4 >= 3) {
			method12(arg1, arg5 + 1, arg3, arg0, arg4 - 2);
			method12(arg1, arg5 + 1, arg3, arg0 + arg2 - 1, arg4 - 2);
		}
	}

	@ObfuscatedName("ACKHPAZA.a(IIIII)V")
	public static void method9(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field4 && arg2 < field5) {
			if (arg1 < field6) {
				arg3 -= field6 - arg1;
				arg1 = field6;
			}

			if (arg1 + arg3 > field7) {
				arg3 = field7 - arg1;
			}

			int var4 = field2 * arg2 + arg1;
			for (int var5 = 0; var5 < arg3; var5++) {
				field1[var4 + var5] = arg0;
			}
		}
	}

	@ObfuscatedName("ACKHPAZA.a(IIZIII)V")
	public static void method10(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 >= field4 && arg4 < field5) {
			if (arg3 < field6) {
				arg1 -= field6 - arg3;
				arg3 = field6;
			}

			if (arg1 + arg3 > field7) {
				arg1 = field7 - arg3;
			}

			int var5 = 256 - arg0;
			int var6 = (arg2 >> 16 & 0xFF) * arg0;
			int var7 = (arg2 >> 8 & 0xFF) * arg0;
			int var8 = (arg2 & 0xFF) * arg0;
			int var9 = field2 * arg4 + arg3;
			for (int var10 = 0; var10 < arg1; var10++) {
				int var11 = (field1[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("ACKHPAZA.a(IIIBI)V")
	public static void method11(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field6 && arg0 < field7) {
			if (arg1 < field4) {
				arg2 -= field4 - arg1;
				arg1 = field4;
			}

			if (arg1 + arg2 > field5) {
				arg2 = field5 - arg1;
			}

			int var4 = field2 * arg1 + arg0;
			for (int var5 = 0; var5 < arg2; var5++) {
				field1[field2 * var5 + var4] = arg3;
			}
		}
	}

	@ObfuscatedName("ACKHPAZA.c(IIIIII)V")
	public static void method12(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 >= field6 && arg3 < field7) {
			if (arg1 < field4) {
				arg4 -= field4 - arg1;
				arg1 = field4;
			}

			if (arg1 + arg4 > field5) {
				arg4 = field5 - arg1;
			}

			int var5 = 256 - arg2;
			int var6 = (arg0 >> 16 & 0xFF) * arg2;
			int var7 = (arg0 >> 8 & 0xFF) * arg2;
			int var8 = (arg0 & 0xFF) * arg2;
			int var9 = field2 * arg1 + arg3;
			for (int var10 = 0; var10 < arg4; var10++) {
				int var11 = (field1[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1[var9] = var14;
				var9 += field2;
			}
		}
	}
}
