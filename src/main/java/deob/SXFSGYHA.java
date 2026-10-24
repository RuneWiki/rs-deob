package deob;

@ObfuscatedName("SXFSGYHA")
public class SXFSGYHA extends IYPTVTAD {

	@ObfuscatedName("SXFSGYHA.q")
	public static int field1126;

	@ObfuscatedName("SXFSGYHA.r")
	public static int field1127;

	@ObfuscatedName("SXFSGYHA.s")
	public static int field1128;

	@ObfuscatedName("SXFSGYHA.t")
	public static int field1129;

	@ObfuscatedName("SXFSGYHA.u")
	public static int field1130;

	@ObfuscatedName("SXFSGYHA.v")
	public static int field1131;

	@ObfuscatedName("SXFSGYHA.w")
	public static int field1132;

	@ObfuscatedName("SXFSGYHA.x")
	public static int field1133;

	@ObfuscatedName("SXFSGYHA.y")
	public static int field1134;

	@ObfuscatedName("SXFSGYHA.p")
	public static int[] field1125;

	@ObfuscatedName("SXFSGYHA.a(I[III)V")
	public static void method516(int arg0, int[] arg1, int arg2) {
		field1125 = arg1;
		field1126 = arg0;
		field1127 = arg2;
		method518(0, arg0, arg2, 0);
	}

	@ObfuscatedName("SXFSGYHA.a(I)V")
	public static void method517() {
		field1130 = 0;
		field1128 = 0;
		field1131 = field1126;
		field1129 = field1127;
		field1132 = field1131 - 1;
		field1133 = field1131 / 2;
	}

	@ObfuscatedName("SXFSGYHA.a(IIIII)V")
	public static void method518(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg1 > field1126) {
			arg1 = field1126;
		}

		if (arg2 > field1127) {
			arg2 = field1127;
		}

		field1130 = arg3;
		field1128 = arg0;
		field1131 = arg1;
		field1129 = arg2;
		field1132 = field1131 - 1;
		field1133 = field1131 / 2;
		field1134 = field1129 / 2;
	}

	@ObfuscatedName("SXFSGYHA.a(Z)V")
	public static void method519() {
		int var0 = field1127 * field1126;
		for (int var1 = 0; var1 < var0; var1++) {
			field1125[var1] = 0;
		}
	}

	@ObfuscatedName("SXFSGYHA.a(IIIIIII)V")
	public static void method520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg5 < field1130) {
			arg4 -= field1130 - arg5;
			arg5 = field1130;
		}

		if (arg1 < field1128) {
			arg2 -= field1128 - arg1;
			arg1 = field1128;
		}

		if (arg4 + arg5 > field1131) {
			arg4 = field1131 - arg5;
		}

		if (arg1 + arg2 > field1129) {
			arg2 = field1129 - arg1;
		}

		int var6 = 256 - arg3;
		int var7 = (arg0 >> 16 & 0xFF) * arg3;
		int var8 = (arg0 >> 8 & 0xFF) * arg3;
		int var9 = (arg0 & 0xFF) * arg3;
		int var10 = field1126 - arg4;
		int var11 = field1126 * arg1 + arg5;
		for (int var12 = 0; var12 < arg2; var12++) {
			for (int var13 = -arg4; var13 < 0; var13++) {
				int var14 = (field1125[var11] >> 16 & 0xFF) * var6;
				int var15 = (field1125[var11] >> 8 & 0xFF) * var6;
				int var16 = (field1125[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field1125[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("SXFSGYHA.a(IIIIII)V")
	public static void method521(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 < field1130) {
			arg1 -= field1130 - arg2;
			arg2 = field1130;
		}

		if (arg3 < field1128) {
			arg4 -= field1128 - arg3;
			arg3 = field1128;
		}

		if (arg1 + arg2 > field1131) {
			arg1 = field1131 - arg2;
		}

		if (arg3 + arg4 > field1129) {
			arg4 = field1129 - arg3;
		}

		int var5 = field1126 - arg1;
		int var6 = field1126 * arg3 + arg2;
		for (int var7 = -arg4; var7 < 0; var7++) {
			for (int var8 = -arg1; var8 < 0; var8++) {
				field1125[var6++] = arg0;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("SXFSGYHA.b(IIIIII)V")
	public static void method522(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method524(arg4, arg1, arg0, arg2);
		method524(arg3 + arg4 - 1, arg1, arg0, arg2);
		method526(arg0, arg3, arg1, arg4);
		method526(arg0, arg3, arg1 + arg2 - 1, arg4);
	}

	@ObfuscatedName("SXFSGYHA.b(IIIIIII)V")
	public static void method523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method525(arg4, arg1, arg3, arg0, arg2);
		method525(arg4 + arg5 - 1, arg1, arg3, arg0, arg2);

		if (arg5 >= 3) {
			method527(arg0, arg4 + 1, arg2, arg1, arg5 - 2);
			method527(arg0 + arg3 - 1, arg4 + 1, arg2, arg1, arg5 - 2);
		}
	}

	@ObfuscatedName("SXFSGYHA.b(IIIII)V")
	public static void method524(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field1128 && arg0 < field1129) {
			if (arg1 < field1130) {
				arg3 -= field1130 - arg1;
				arg1 = field1130;
			}

			if (arg1 + arg3 > field1131) {
				arg3 = field1131 - arg1;
			}

			int var4 = field1126 * arg0 + arg1;
			for (int var5 = 0; var5 < arg3; var5++) {
				field1125[var4 + var5] = arg2;
			}
		}
	}

	@ObfuscatedName("SXFSGYHA.c(IIIIII)V")
	public static void method525(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field1128 && arg0 < field1129) {
			if (arg3 < field1130) {
				arg2 -= field1130 - arg3;
				arg3 = field1130;
			}

			if (arg2 + arg3 > field1131) {
				arg2 = field1131 - arg3;
			}

			int var5 = 256 - arg4;
			int var6 = (arg1 >> 16 & 0xFF) * arg4;
			int var7 = (arg1 >> 8 & 0xFF) * arg4;
			int var8 = (arg1 & 0xFF) * arg4;
			int var9 = field1126 * arg0 + arg3;
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = (field1125[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1125[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1125[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1125[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("SXFSGYHA.a(IIBII)V")
	public static void method526(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field1130 && arg2 < field1131) {
			if (arg3 < field1128) {
				arg1 -= field1128 - arg3;
				arg3 = field1128;
			}

			if (arg1 + arg3 > field1129) {
				arg1 = field1129 - arg3;
			}

			int var4 = field1126 * arg3 + arg2;
			for (int var5 = 0; var5 < arg1; var5++) {
				field1125[field1126 * var5 + var4] = arg0;
			}
		}
	}

	@ObfuscatedName("SXFSGYHA.d(IIIIII)V")
	public static void method527(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field1130 && arg0 < field1131) {
			if (arg1 < field1128) {
				arg4 -= field1128 - arg1;
				arg1 = field1128;
			}

			if (arg1 + arg4 > field1129) {
				arg4 = field1129 - arg1;
			}

			int var5 = 256 - arg2;
			int var6 = (arg3 >> 16 & 0xFF) * arg2;
			int var7 = (arg3 >> 8 & 0xFF) * arg2;
			int var8 = (arg3 & 0xFF) * arg2;
			int var9 = field1126 * arg1 + arg0;
			for (int var10 = 0; var10 < arg4; var10++) {
				int var11 = (field1125[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1125[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1125[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1125[var9] = var14;
				var9 += field1126;
			}
		}
	}
}
