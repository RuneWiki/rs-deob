package deob;

@ObfuscatedName("OMVHXJFV")
public class OMVHXJFV extends NTGUDCTQ {

	@ObfuscatedName("OMVHXJFV.m")
	public static int field1050;

	@ObfuscatedName("OMVHXJFV.n")
	public static int field1051;

	@ObfuscatedName("OMVHXJFV.o")
	public static int field1052;

	@ObfuscatedName("OMVHXJFV.p")
	public static int field1053;

	@ObfuscatedName("OMVHXJFV.q")
	public static int field1054;

	@ObfuscatedName("OMVHXJFV.r")
	public static int field1055;

	@ObfuscatedName("OMVHXJFV.s")
	public static int field1056;

	@ObfuscatedName("OMVHXJFV.t")
	public static int field1057;

	@ObfuscatedName("OMVHXJFV.u")
	public static int field1058;

	@ObfuscatedName("OMVHXJFV.l")
	public static int[] field1049;

	@ObfuscatedName("OMVHXJFV.a(I[III)V")
	public static void method415(int[] arg0, int arg1, int arg2) {
		field1049 = arg0;
		field1050 = arg2;
		field1051 = arg1;
		method417(arg2, 0, arg1, 0);
	}

	@ObfuscatedName("OMVHXJFV.a(I)V")
	public static void method416() {
		field1054 = 0;
		field1052 = 0;
		field1055 = field1050;
		field1053 = field1051;
		field1056 = field1055 - 1;
		field1057 = field1055 / 2;
	}

	@ObfuscatedName("OMVHXJFV.a(IIIII)V")
	public static void method417(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg0 > field1050) {
			arg0 = field1050;
		}

		if (arg2 > field1051) {
			arg2 = field1051;
		}

		field1054 = arg3;
		field1052 = arg1;
		field1055 = arg0;
		field1053 = arg2;
		field1056 = field1055 - 1;
		field1057 = field1055 / 2;
		field1058 = field1053 / 2;
	}

	@ObfuscatedName("OMVHXJFV.b(I)V")
	public static void method418() {
		int var0 = field1051 * field1050;
		for (int var1 = 0; var1 < var0; var1++) {
			field1049[var1] = 0;
		}
	}

	@ObfuscatedName("OMVHXJFV.a(IIIIIII)V")
	public static void method419(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 < field1054) {
			arg4 -= field1054 - arg3;
			arg3 = field1054;
		}

		if (arg5 < field1052) {
			arg0 -= field1052 - arg5;
			arg5 = field1052;
		}

		if (arg3 + arg4 > field1055) {
			arg4 = field1055 - arg3;
		}

		if (arg0 + arg5 > field1053) {
			arg0 = field1053 - arg5;
		}

		int var6 = 256 - arg1;
		int var7 = (arg2 >> 16 & 0xFF) * arg1;
		int var8 = (arg2 >> 8 & 0xFF) * arg1;
		int var9 = (arg2 & 0xFF) * arg1;
		int var10 = field1050 - arg4;
		int var11 = field1050 * arg5 + arg3;
		for (int var12 = 0; var12 < arg0; var12++) {
			for (int var13 = -arg4; var13 < 0; var13++) {
				int var14 = (field1049[var11] >> 16 & 0xFF) * var6;
				int var15 = (field1049[var11] >> 8 & 0xFF) * var6;
				int var16 = (field1049[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field1049[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("OMVHXJFV.a(IBIIII)V")
	public static void method420(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 < field1054) {
			arg3 -= field1054 - arg0;
			arg0 = field1054;
		}

		if (arg4 < field1052) {
			arg2 -= field1052 - arg4;
			arg4 = field1052;
		}

		if (arg0 + arg3 > field1055) {
			arg3 = field1055 - arg0;
		}

		if (arg2 + arg4 > field1053) {
			arg2 = field1053 - arg4;
		}

		int var5 = field1050 - arg3;
		int var6 = field1050 * arg4 + arg0;
		for (int var7 = -arg2; var7 < 0; var7++) {
			for (int var8 = -arg3; var8 < 0; var8++) {
				field1049[var6++] = arg1;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("OMVHXJFV.b(IBIIII)V")
	public static void method421(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method423(arg3, arg0, arg4, arg2);
		method423(arg1 + arg3 - 1, arg0, arg4, arg2);
		method425(arg1, arg4, arg3, arg2);
		method425(arg1, arg0 + arg4 - 1, arg3, arg2);
	}

	@ObfuscatedName("OMVHXJFV.a(IIZIIII)V")
	public static void method422(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method424(arg3, arg1, arg4, arg2, arg5);
		method424(arg3, arg1, arg4, arg2, arg0 + arg5 - 1);

		if (arg0 >= 3) {
			method426(arg3, arg1, arg0 - 2, arg5 + 1, arg2);
			method426(arg3, arg1 + arg4 - 1, arg0 - 2, arg5 + 1, arg2);
		}
	}

	@ObfuscatedName("OMVHXJFV.b(IIIII)V")
	public static void method423(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field1052 && arg0 < field1053) {
			if (arg2 < field1054) {
				arg1 -= field1054 - arg2;
				arg2 = field1054;
			}

			if (arg1 + arg2 > field1055) {
				arg1 = field1055 - arg2;
			}

			int var4 = field1050 * arg0 + arg2;
			for (int var5 = 0; var5 < arg1; var5++) {
				field1049[var4 + var5] = arg3;
			}
		}
	}

	@ObfuscatedName("OMVHXJFV.a(IIIIII)V")
	public static void method424(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 >= field1052 && arg4 < field1053) {
			if (arg1 < field1054) {
				arg2 -= field1054 - arg1;
				arg1 = field1054;
			}

			if (arg1 + arg2 > field1055) {
				arg2 = field1055 - arg1;
			}

			int var5 = 256 - arg3;
			int var6 = (arg0 >> 16 & 0xFF) * arg3;
			int var7 = (arg0 >> 8 & 0xFF) * arg3;
			int var8 = (arg0 & 0xFF) * arg3;
			int var9 = field1050 * arg4 + arg1;
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = (field1049[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1049[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1049[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1049[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("OMVHXJFV.a(IIIIZ)V")
	public static void method425(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field1054 && arg1 < field1055) {
			if (arg2 < field1052) {
				arg0 -= field1052 - arg2;
				arg2 = field1052;
			}

			if (arg0 + arg2 > field1053) {
				arg0 = field1053 - arg2;
			}

			int var4 = field1050 * arg2 + arg1;
			for (int var5 = 0; var5 < arg0; var5++) {
				field1049[field1050 * var5 + var4] = arg3;
			}
		}
	}

	@ObfuscatedName("OMVHXJFV.a(IIIBII)V")
	public static void method426(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 >= field1054 && arg1 < field1055) {
			if (arg3 < field1052) {
				arg2 -= field1052 - arg3;
				arg3 = field1052;
			}

			if (arg2 + arg3 > field1053) {
				arg2 = field1053 - arg3;
			}

			int var5 = 256 - arg4;
			int var6 = (arg0 >> 16 & 0xFF) * arg4;
			int var7 = (arg0 >> 8 & 0xFF) * arg4;
			int var8 = (arg0 & 0xFF) * arg4;
			int var9 = field1050 * arg3 + arg1;
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = (field1049[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1049[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1049[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1049[var9] = var14;
				var9 += field1050;
			}
		}
	}
}
