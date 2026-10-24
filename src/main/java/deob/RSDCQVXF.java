package deob;

@ObfuscatedName("RSDCQVXF")
public class RSDCQVXF extends MOVYLKVL {

	@ObfuscatedName("RSDCQVXF.q")
	public static int field1193;

	@ObfuscatedName("RSDCQVXF.r")
	public static int field1194;

	@ObfuscatedName("RSDCQVXF.s")
	public static int field1195;

	@ObfuscatedName("RSDCQVXF.t")
	public static int field1196;

	@ObfuscatedName("RSDCQVXF.u")
	public static int field1197;

	@ObfuscatedName("RSDCQVXF.v")
	public static int field1198;

	@ObfuscatedName("RSDCQVXF.w")
	public static int field1199;

	@ObfuscatedName("RSDCQVXF.x")
	public static int field1200;

	@ObfuscatedName("RSDCQVXF.y")
	public static int field1201;

	@ObfuscatedName("RSDCQVXF.p")
	public static int[] field1192;

	@ObfuscatedName("RSDCQVXF.a(II[II)V")
	public static void method453(int arg0, int[] arg1, int arg2) {
		field1192 = arg1;
		field1193 = arg0;
		field1194 = arg2;
		method455(arg0, arg2, 0, 0);
	}

	@ObfuscatedName("RSDCQVXF.a(Z)V")
	public static void method454() {
		field1197 = 0;
		field1195 = 0;
		field1198 = field1193;
		field1196 = field1194;
		field1199 = field1198 - 1;
		field1200 = field1198 / 2;
	}

	@ObfuscatedName("RSDCQVXF.a(IIIII)V")
	public static void method455(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg2 < 0) {
			arg2 = 0;
		}

		if (arg0 > field1193) {
			arg0 = field1193;
		}

		if (arg1 > field1194) {
			arg1 = field1194;
		}

		field1197 = arg3;
		field1195 = arg2;
		field1198 = arg0;
		field1196 = arg1;
		field1199 = field1198 - 1;
		field1200 = field1198 / 2;
		field1201 = field1196 / 2;
	}

	@ObfuscatedName("RSDCQVXF.b(Z)V")
	public static void method456() {
		int var0 = field1194 * field1193;
		for (int var1 = 0; var1 < var0; var1++) {
			field1192[var1] = 0;
		}
	}

	@ObfuscatedName("RSDCQVXF.a(IIIIIII)V")
	public static void method457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 < field1197) {
			arg4 -= field1197 - arg3;
			arg3 = field1197;
		}

		if (arg5 < field1195) {
			arg2 -= field1195 - arg5;
			arg5 = field1195;
		}

		if (arg3 + arg4 > field1198) {
			arg4 = field1198 - arg3;
		}

		if (arg2 + arg5 > field1196) {
			arg2 = field1196 - arg5;
		}

		int var6 = 256 - arg0;
		int var7 = (arg1 >> 16 & 0xFF) * arg0;
		int var8 = (arg1 >> 8 & 0xFF) * arg0;
		int var9 = (arg1 & 0xFF) * arg0;
		int var10 = field1193 - arg4;
		int var11 = field1193 * arg5 + arg3;
		for (int var12 = 0; var12 < arg2; var12++) {
			for (int var13 = -arg4; var13 < 0; var13++) {
				int var14 = (field1192[var11] >> 16 & 0xFF) * var6;
				int var15 = (field1192[var11] >> 8 & 0xFF) * var6;
				int var16 = (field1192[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field1192[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("RSDCQVXF.a(BIIIII)V")
	public static void method458(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 < field1197) {
			arg0 -= field1197 - arg3;
			arg3 = field1197;
		}

		if (arg2 < field1195) {
			arg4 -= field1195 - arg2;
			arg2 = field1195;
		}

		if (arg0 + arg3 > field1198) {
			arg0 = field1198 - arg3;
		}

		if (arg2 + arg4 > field1196) {
			arg4 = field1196 - arg2;
		}

		int var5 = field1193 - arg0;
		int var6 = field1193 * arg2 + arg3;
		for (int var7 = -arg4; var7 < 0; var7++) {
			for (int var8 = -arg0; var8 < 0; var8++) {
				field1192[var6++] = arg1;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("RSDCQVXF.a(IIIIII)V")
	public static void method459(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method461(arg2, arg1, arg4, arg0);
		method461(arg2, arg1, arg3 + arg4 - 1, arg0);
		method463(arg4, arg1, arg0, arg3);
		method463(arg4, arg1 + arg2 - 1, arg0, arg3);
	}

	@ObfuscatedName("RSDCQVXF.a(IIIIBII)V")
	public static void method460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method462(arg4, arg1, arg2, arg5, arg3);
		method462(arg4, arg1, arg0 + arg2 - 1, arg5, arg3);

		if (arg0 >= 3) {
			method464(arg4, arg2 + 1, arg1, arg0 - 2, arg3);
			method464(arg4, arg2 + 1, arg1 + arg5 - 1, arg0 - 2, arg3);
		}
	}

	@ObfuscatedName("RSDCQVXF.a(IBIII)V")
	public static void method461(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field1195 && arg2 < field1196) {
			if (arg1 < field1197) {
				arg0 -= field1197 - arg1;
				arg1 = field1197;
			}

			if (arg0 + arg1 > field1198) {
				arg0 = field1198 - arg1;
			}

			int var4 = field1193 * arg2 + arg1;
			for (int var5 = 0; var5 < arg0; var5++) {
				field1192[var4 + var5] = arg3;
			}
		}
	}

	@ObfuscatedName("RSDCQVXF.b(IIIIII)V")
	public static void method462(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 >= field1195 && arg2 < field1196) {
			if (arg1 < field1197) {
				arg3 -= field1197 - arg1;
				arg1 = field1197;
			}

			if (arg1 + arg3 > field1198) {
				arg3 = field1198 - arg1;
			}

			int var5 = 256 - arg0;
			int var6 = (arg4 >> 16 & 0xFF) * arg0;
			int var7 = (arg4 >> 8 & 0xFF) * arg0;
			int var8 = (arg4 & 0xFF) * arg0;
			int var9 = field1193 * arg2 + arg1;
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = (field1192[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1192[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1192[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1192[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("RSDCQVXF.b(IIIII)V")
	public static void method463(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field1197 && arg1 < field1198) {
			if (arg0 < field1195) {
				arg3 -= field1195 - arg0;
				arg0 = field1195;
			}

			if (arg0 + arg3 > field1196) {
				arg3 = field1196 - arg0;
			}

			int var4 = field1193 * arg0 + arg1;
			for (int var5 = 0; var5 < arg3; var5++) {
				field1192[field1193 * var5 + var4] = arg2;
			}
		}
	}

	@ObfuscatedName("RSDCQVXF.c(IIIIII)V")
	public static void method464(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 >= field1197 && arg2 < field1198) {
			if (arg1 < field1195) {
				arg3 -= field1195 - arg1;
				arg1 = field1195;
			}

			if (arg1 + arg3 > field1196) {
				arg3 = field1196 - arg1;
			}

			int var5 = 256 - arg0;
			int var6 = (arg4 >> 16 & 0xFF) * arg0;
			int var7 = (arg4 >> 8 & 0xFF) * arg0;
			int var8 = (arg4 & 0xFF) * arg0;
			int var9 = field1193 * arg1 + arg2;
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = (field1192[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1192[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1192[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1192[var9] = var14;
				var9 += field1193;
			}
		}
	}
}
