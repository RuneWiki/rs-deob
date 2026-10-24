package deob;

@ObfuscatedName("NBXZFIDS")
public class NBXZFIDS extends YBEHHNFF {

	@ObfuscatedName("NBXZFIDS.p")
	public static int field1027;

	@ObfuscatedName("NBXZFIDS.q")
	public static int field1028;

	@ObfuscatedName("NBXZFIDS.r")
	public static int field1029;

	@ObfuscatedName("NBXZFIDS.s")
	public static int field1030;

	@ObfuscatedName("NBXZFIDS.t")
	public static int field1031;

	@ObfuscatedName("NBXZFIDS.u")
	public static int field1032;

	@ObfuscatedName("NBXZFIDS.v")
	public static int field1033;

	@ObfuscatedName("NBXZFIDS.w")
	public static int field1034;

	@ObfuscatedName("NBXZFIDS.x")
	public static int field1035;

	@ObfuscatedName("NBXZFIDS.o")
	public static int[] field1026;

	@ObfuscatedName("NBXZFIDS.a(II[IZ)V")
	public static void method286(int arg0, int arg1, int[] arg2) {
		field1026 = arg2;
		field1027 = arg1;
		field1028 = arg0;
		method288(0, arg0, 0, arg1);
	}

	@ObfuscatedName("NBXZFIDS.a(Z)V")
	public static void method287() {
		field1031 = 0;
		field1029 = 0;
		field1032 = field1027;
		field1030 = field1028;
		field1033 = field1032 - 1;
		field1034 = field1032 / 2;
	}

	@ObfuscatedName("NBXZFIDS.a(IIIII)V")
	public static void method288(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg2 < 0) {
			arg2 = 0;
		}

		if (arg3 > field1027) {
			arg3 = field1027;
		}

		if (arg1 > field1028) {
			arg1 = field1028;
		}

		field1031 = arg0;
		field1029 = arg2;
		field1032 = arg3;
		field1030 = arg1;
		field1033 = field1032 - 1;
		field1034 = field1032 / 2;
		field1035 = field1030 / 2;
	}

	@ObfuscatedName("NBXZFIDS.a(I)V")
	public static void method289() {
		int var0 = field1028 * field1027;
		for (int var1 = 0; var1 < var0; var1++) {
			field1026[var1] = 0;
		}
	}

	@ObfuscatedName("NBXZFIDS.a(IIZIIII)V")
	public static void method290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 < field1031) {
			arg5 -= field1031 - arg1;
			arg1 = field1031;
		}

		if (arg4 < field1029) {
			arg2 -= field1029 - arg4;
			arg4 = field1029;
		}

		if (arg1 + arg5 > field1032) {
			arg5 = field1032 - arg1;
		}

		if (arg2 + arg4 > field1030) {
			arg2 = field1030 - arg4;
		}

		int var6 = 256 - arg0;
		int var7 = (arg3 >> 16 & 0xFF) * arg0;
		int var8 = (arg3 >> 8 & 0xFF) * arg0;
		int var9 = (arg3 & 0xFF) * arg0;
		int var10 = field1027 - arg5;
		int var11 = field1027 * arg4 + arg1;
		for (int var12 = 0; var12 < arg2; var12++) {
			for (int var13 = -arg5; var13 < 0; var13++) {
				int var14 = (field1026[var11] >> 16 & 0xFF) * var6;
				int var15 = (field1026[var11] >> 8 & 0xFF) * var6;
				int var16 = (field1026[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field1026[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("NBXZFIDS.a(IIIIII)V")
	public static void method291(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 < field1031) {
			arg1 -= field1031 - arg0;
			arg0 = field1031;
		}

		if (arg2 < field1029) {
			arg4 -= field1029 - arg2;
			arg2 = field1029;
		}

		if (arg0 + arg1 > field1032) {
			arg1 = field1032 - arg0;
		}

		if (arg2 + arg4 > field1030) {
			arg4 = field1030 - arg2;
		}

		int var5 = field1027 - arg1;
		int var6 = field1027 * arg2 + arg0;
		for (int var7 = -arg4; var7 < 0; var7++) {
			for (int var8 = -arg1; var8 < 0; var8++) {
				field1026[var6++] = arg3;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("NBXZFIDS.a(IIIIIB)V")
	public static void method292(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method294(arg2, arg3, arg1, arg4);
		method294(arg2, arg0 + arg3 - 1, arg1, arg4);
		method296(arg4, arg0, arg3, arg2);
		method296(arg4, arg0, arg3, arg1 + arg2 - 1);
	}

	@ObfuscatedName("NBXZFIDS.a(IIIIIII)V")
	public static void method293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method295(arg4, arg1, arg5, arg3, arg0);
		method295(arg4, arg1, arg2 + arg5 - 1, arg3, arg0);

		if (arg2 >= 3) {
			method297(arg5 + 1, arg1, arg3, arg2 - 2, arg0);
			method297(arg5 + 1, arg1, arg3 + arg4 - 1, arg2 - 2, arg0);
		}
	}

	@ObfuscatedName("NBXZFIDS.b(IIIII)V")
	public static void method294(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field1029 && arg1 < field1030) {
			if (arg0 < field1031) {
				arg2 -= field1031 - arg0;
				arg0 = field1031;
			}

			if (arg0 + arg2 > field1032) {
				arg2 = field1032 - arg0;
			}

			int var4 = field1027 * arg1 + arg0;
			for (int var5 = 0; var5 < arg2; var5++) {
				field1026[var4 + var5] = arg3;
			}
		}
	}

	@ObfuscatedName("NBXZFIDS.b(IIIIII)V")
	public static void method295(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 >= field1029 && arg2 < field1030) {
			if (arg3 < field1031) {
				arg0 -= field1031 - arg3;
				arg3 = field1031;
			}

			if (arg0 + arg3 > field1032) {
				arg0 = field1032 - arg3;
			}

			int var5 = 256 - arg1;
			int var6 = (arg4 >> 16 & 0xFF) * arg1;
			int var7 = (arg4 >> 8 & 0xFF) * arg1;
			int var8 = (arg4 & 0xFF) * arg1;
			int var9 = field1027 * arg2 + arg3;
			for (int var10 = 0; var10 < arg0; var10++) {
				int var11 = (field1026[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1026[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1026[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1026[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("NBXZFIDS.a(IIBII)V")
	public static void method296(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field1031 && arg3 < field1032) {
			if (arg2 < field1029) {
				arg1 -= field1029 - arg2;
				arg2 = field1029;
			}

			if (arg1 + arg2 > field1030) {
				arg1 = field1030 - arg2;
			}

			int var4 = field1027 * arg2 + arg3;
			for (int var5 = 0; var5 < arg1; var5++) {
				field1026[field1027 * var5 + var4] = arg0;
			}
		}
	}

	@ObfuscatedName("NBXZFIDS.a(IBIIII)V")
	public static void method297(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 >= field1031 && arg2 < field1032) {
			if (arg0 < field1029) {
				arg3 -= field1029 - arg0;
				arg0 = field1029;
			}

			if (arg0 + arg3 > field1030) {
				arg3 = field1030 - arg0;
			}

			int var5 = 256 - arg1;
			int var6 = (arg4 >> 16 & 0xFF) * arg1;
			int var7 = (arg4 >> 8 & 0xFF) * arg1;
			int var8 = (arg4 & 0xFF) * arg1;
			int var9 = field1027 * arg0 + arg2;
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = (field1026[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1026[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1026[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1026[var9] = var14;
				var9 += field1027;
			}
		}
	}
}
