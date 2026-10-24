package deob;

@ObfuscatedName("TQHEKXXC")
public class TQHEKXXC extends KTAHMSMP {

	@ObfuscatedName("TQHEKXXC.s")
	public static int field1090;

	@ObfuscatedName("TQHEKXXC.t")
	public static int field1091;

	@ObfuscatedName("TQHEKXXC.u")
	public static int field1092;

	@ObfuscatedName("TQHEKXXC.v")
	public static int field1093;

	@ObfuscatedName("TQHEKXXC.w")
	public static int field1094;

	@ObfuscatedName("TQHEKXXC.x")
	public static int field1095;

	@ObfuscatedName("TQHEKXXC.y")
	public static int field1096;

	@ObfuscatedName("TQHEKXXC.z")
	public static int field1097;

	@ObfuscatedName("TQHEKXXC.A")
	public static int field1098;

	@ObfuscatedName("TQHEKXXC.r")
	public static int[] field1089;

	@ObfuscatedName("TQHEKXXC.a(III[I)V")
	public static void method473(int arg0, int arg1, int[] arg2) {
		field1089 = arg2;
		field1090 = arg1;
		field1091 = arg0;
		method475(0, arg1, arg0, 0);
	}

	@ObfuscatedName("TQHEKXXC.a(I)V")
	public static void method474() {
		field1094 = 0;
		field1092 = 0;
		field1095 = field1090;
		field1093 = field1091;
		field1096 = field1095 - 1;
		field1097 = field1095 / 2;
	}

	@ObfuscatedName("TQHEKXXC.a(IIIII)V")
	public static void method475(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg1 > field1090) {
			arg1 = field1090;
		}

		if (arg2 > field1091) {
			arg2 = field1091;
		}

		field1094 = arg0;
		field1092 = arg3;
		field1095 = arg1;
		field1093 = arg2;
		field1096 = field1095 - 1;
		field1097 = field1095 / 2;
		field1098 = field1093 / 2;
	}

	@ObfuscatedName("TQHEKXXC.b(I)V")
	public static void method476() {
		int var0 = field1091 * field1090;
		for (int var1 = 0; var1 < var0; var1++) {
			field1089[var1] = 0;
		}
	}

	@ObfuscatedName("TQHEKXXC.a(IIIIIII)V")
	public static void method477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 < field1094) {
			arg2 -= field1094 - arg1;
			arg1 = field1094;
		}

		if (arg3 < field1092) {
			arg5 -= field1092 - arg3;
			arg3 = field1092;
		}

		if (arg1 + arg2 > field1095) {
			arg2 = field1095 - arg1;
		}

		if (arg3 + arg5 > field1093) {
			arg5 = field1093 - arg3;
		}

		int var6 = 256 - arg4;
		int var7 = (arg0 >> 16 & 0xFF) * arg4;
		int var8 = (arg0 >> 8 & 0xFF) * arg4;
		int var9 = (arg0 & 0xFF) * arg4;
		int var10 = field1090 - arg2;
		int var11 = field1090 * arg3 + arg1;
		for (int var12 = 0; var12 < arg5; var12++) {
			for (int var13 = -arg2; var13 < 0; var13++) {
				int var14 = (field1089[var11] >> 16 & 0xFF) * var6;
				int var15 = (field1089[var11] >> 8 & 0xFF) * var6;
				int var16 = (field1089[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field1089[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("TQHEKXXC.a(IIIIIB)V")
	public static void method478(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 < field1094) {
			arg0 -= field1094 - arg1;
			arg1 = field1094;
		}

		if (arg3 < field1092) {
			arg4 -= field1092 - arg3;
			arg3 = field1092;
		}

		if (arg0 + arg1 > field1095) {
			arg0 = field1095 - arg1;
		}

		if (arg3 + arg4 > field1093) {
			arg4 = field1093 - arg3;
		}

		int var5 = field1090 - arg0;
		int var6 = field1090 * arg3 + arg1;
		for (int var7 = -arg4; var7 < 0; var7++) {
			for (int var8 = -arg0; var8 < 0; var8++) {
				field1089[var6++] = arg2;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("TQHEKXXC.a(IIIIII)V")
	public static void method479(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method481(arg4, arg0, arg2, arg3);
		method481(arg4, arg0, arg2, arg1 + arg3 - 1);
		method483(arg0, arg3, arg4, arg1);
		method483(arg0, arg3, arg2 + arg4 - 1, arg1);
	}

	@ObfuscatedName("TQHEKXXC.a(IIIZIII)V")
	public static void method480(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method482(arg4, arg2, arg1, arg0, arg3);
		method482(arg4 + arg5 - 1, arg2, arg1, arg0, arg3);

		if (arg5 >= 3) {
			method484(arg5 - 2, arg1, arg4 + 1, arg2, arg3);
			method484(arg5 - 2, arg1, arg4 + 1, arg0 + arg2 - 1, arg3);
		}
	}

	@ObfuscatedName("TQHEKXXC.b(IIIII)V")
	public static void method481(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field1092 && arg3 < field1093) {
			if (arg0 < field1094) {
				arg2 -= field1094 - arg0;
				arg0 = field1094;
			}

			if (arg0 + arg2 > field1095) {
				arg2 = field1095 - arg0;
			}

			int var4 = field1090 * arg3 + arg0;
			for (int var5 = 0; var5 < arg2; var5++) {
				field1089[var4 + var5] = arg1;
			}
		}
	}

	@ObfuscatedName("TQHEKXXC.b(IIIIII)V")
	public static void method482(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field1092 && arg0 < field1093) {
			if (arg1 < field1094) {
				arg3 -= field1094 - arg1;
				arg1 = field1094;
			}

			if (arg1 + arg3 > field1095) {
				arg3 = field1095 - arg1;
			}

			int var5 = 256 - arg2;
			int var6 = (arg4 >> 16 & 0xFF) * arg2;
			int var7 = (arg4 >> 8 & 0xFF) * arg2;
			int var8 = (arg4 & 0xFF) * arg2;
			int var9 = field1090 * arg0 + arg1;
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = (field1089[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1089[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1089[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1089[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("TQHEKXXC.c(IIIII)V")
	public static void method483(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field1094 && arg2 < field1095) {
			if (arg1 < field1092) {
				arg3 -= field1092 - arg1;
				arg1 = field1092;
			}

			if (arg1 + arg3 > field1093) {
				arg3 = field1093 - arg1;
			}

			int var4 = field1090 * arg1 + arg2;
			for (int var5 = 0; var5 < arg3; var5++) {
				field1089[field1090 * var5 + var4] = arg0;
			}
		}
	}

	@ObfuscatedName("TQHEKXXC.c(IIIIII)V")
	public static void method484(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 >= field1094 && arg3 < field1095) {
			if (arg2 < field1092) {
				arg0 -= field1092 - arg2;
				arg2 = field1092;
			}

			if (arg0 + arg2 > field1093) {
				arg0 = field1093 - arg2;
			}

			int var5 = 256 - arg1;
			int var6 = (arg4 >> 16 & 0xFF) * arg1;
			int var7 = (arg4 >> 8 & 0xFF) * arg1;
			int var8 = (arg4 & 0xFF) * arg1;
			int var9 = field1090 * arg2 + arg3;
			for (int var10 = 0; var10 < arg0; var10++) {
				int var11 = (field1089[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1089[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1089[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1089[var9] = var14;
				var9 += field1090;
			}
		}
	}
}
