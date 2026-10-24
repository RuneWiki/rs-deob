package deob;

@ObfuscatedName("UJSJLLWF")
public class UJSJLLWF extends OHSXMHUZ {

	@ObfuscatedName("UJSJLLWF.n")
	public static int field1249;

	@ObfuscatedName("UJSJLLWF.o")
	public static int field1250;

	@ObfuscatedName("UJSJLLWF.p")
	public static int field1251;

	@ObfuscatedName("UJSJLLWF.q")
	public static int field1252;

	@ObfuscatedName("UJSJLLWF.r")
	public static int field1253;

	@ObfuscatedName("UJSJLLWF.s")
	public static int field1254;

	@ObfuscatedName("UJSJLLWF.t")
	public static int field1255;

	@ObfuscatedName("UJSJLLWF.u")
	public static int field1256;

	@ObfuscatedName("UJSJLLWF.v")
	public static int field1257;

	@ObfuscatedName("UJSJLLWF.m")
	public static int[] field1248;

	@ObfuscatedName("UJSJLLWF.a([IIII)V")
	public static void method479(int[] arg0, int arg1, int arg2) {
		field1248 = arg0;
		field1249 = arg1;
		field1250 = arg2;
		method481(0, 0, arg1, arg2);
	}

	@ObfuscatedName("UJSJLLWF.a(B)V")
	public static void method480() {
		field1253 = 0;
		field1251 = 0;
		field1254 = field1249;
		field1252 = field1250;
		field1255 = field1254 - 1;
		field1256 = field1254 / 2;
	}

	@ObfuscatedName("UJSJLLWF.a(IIIII)V")
	public static void method481(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg2 > field1249) {
			arg2 = field1249;
		}

		if (arg3 > field1250) {
			arg3 = field1250;
		}

		field1253 = arg0;
		field1251 = arg1;
		field1254 = arg2;
		field1252 = arg3;
		field1255 = field1254 - 1;
		field1256 = field1254 / 2;
		field1257 = field1252 / 2;
	}

	@ObfuscatedName("UJSJLLWF.a(I)V")
	public static void method482() {
		int var0 = field1250 * field1249;
		for (int var1 = 0; var1 < var0; var1++) {
			field1248[var1] = 0;
		}
	}

	@ObfuscatedName("UJSJLLWF.a(BIIIIII)V")
	public static void method483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 < field1253) {
			arg5 -= field1253 - arg2;
			arg2 = field1253;
		}

		if (arg1 < field1251) {
			arg0 -= field1251 - arg1;
			arg1 = field1251;
		}

		if (arg2 + arg5 > field1254) {
			arg5 = field1254 - arg2;
		}

		if (arg0 + arg1 > field1252) {
			arg0 = field1252 - arg1;
		}

		int var6 = 256 - arg3;
		int var7 = (arg4 >> 16 & 0xFF) * arg3;
		int var8 = (arg4 >> 8 & 0xFF) * arg3;
		int var9 = (arg4 & 0xFF) * arg3;
		int var10 = field1249 - arg5;
		int var11 = field1249 * arg1 + arg2;
		for (int var12 = 0; var12 < arg0; var12++) {
			for (int var13 = -arg5; var13 < 0; var13++) {
				int var14 = (field1248[var11] >> 16 & 0xFF) * var6;
				int var15 = (field1248[var11] >> 8 & 0xFF) * var6;
				int var16 = (field1248[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field1248[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("UJSJLLWF.a(IIIIII)V")
	public static void method484(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 < field1253) {
			arg4 -= field1253 - arg1;
			arg1 = field1253;
		}

		if (arg2 < field1251) {
			arg3 -= field1251 - arg2;
			arg2 = field1251;
		}

		if (arg1 + arg4 > field1254) {
			arg4 = field1254 - arg1;
		}

		if (arg2 + arg3 > field1252) {
			arg3 = field1252 - arg2;
		}

		int var5 = field1249 - arg4;
		int var6 = field1249 * arg2 + arg1;
		for (int var7 = -arg3; var7 < 0; var7++) {
			for (int var8 = -arg4; var8 < 0; var8++) {
				field1248[var6++] = arg0;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("UJSJLLWF.a(ZIIIII)V")
	public static void method485(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method487(arg2, arg3, arg1, arg0);
		method487(arg2, arg3, arg1, arg0 + arg4 - 1);
		method489(arg3, arg2, arg4, arg0);
		method489(arg3, arg1 + arg2 - 1, arg4, arg0);
	}

	@ObfuscatedName("UJSJLLWF.a(IIIIIIZ)V")
	public static void method486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method488(arg1, arg0, arg5, arg3, arg2);
		method488(arg1, arg0, arg5, arg3 + arg4 - 1, arg2);

		if (arg4 >= 3) {
			method490(arg3 + 1, arg1, arg4 - 2, arg2, arg0);
			method490(arg3 + 1, arg1 + arg5 - 1, arg4 - 2, arg2, arg0);
		}
	}

	@ObfuscatedName("UJSJLLWF.b(IIIII)V")
	public static void method487(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field1251 && arg3 < field1252) {
			if (arg0 < field1253) {
				arg2 -= field1253 - arg0;
				arg0 = field1253;
			}

			if (arg0 + arg2 > field1254) {
				arg2 = field1254 - arg0;
			}

			int var4 = field1249 * arg3 + arg0;
			for (int var5 = 0; var5 < arg2; var5++) {
				field1248[var4 + var5] = arg1;
			}
		}
	}

	@ObfuscatedName("UJSJLLWF.a(IIIIIB)V")
	public static void method488(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 >= field1251 && arg3 < field1252) {
			if (arg0 < field1253) {
				arg2 -= field1253 - arg0;
				arg0 = field1253;
			}

			if (arg0 + arg2 > field1254) {
				arg2 = field1254 - arg0;
			}

			int var5 = 256 - arg4;
			int var6 = (arg1 >> 16 & 0xFF) * arg4;
			int var7 = (arg1 >> 8 & 0xFF) * arg4;
			int var8 = (arg1 & 0xFF) * arg4;
			int var9 = field1249 * arg3 + arg0;
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = (field1248[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1248[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1248[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1248[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("UJSJLLWF.a(IBIII)V")
	public static void method489(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field1253 && arg1 < field1254) {
			if (arg3 < field1251) {
				arg2 -= field1251 - arg3;
				arg3 = field1251;
			}

			if (arg2 + arg3 > field1252) {
				arg2 = field1252 - arg3;
			}

			int var4 = field1249 * arg3 + arg1;
			for (int var5 = 0; var5 < arg2; var5++) {
				field1248[field1249 * var5 + var4] = arg0;
			}
		}
	}

	@ObfuscatedName("UJSJLLWF.b(IIIIII)V")
	public static void method490(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 >= field1253 && arg1 < field1254) {
			if (arg0 < field1251) {
				arg2 -= field1251 - arg0;
				arg0 = field1251;
			}

			if (arg0 + arg2 > field1252) {
				arg2 = field1252 - arg0;
			}

			int var5 = 256 - arg3;
			int var6 = (arg4 >> 16 & 0xFF) * arg3;
			int var7 = (arg4 >> 8 & 0xFF) * arg3;
			int var8 = (arg4 & 0xFF) * arg3;
			int var9 = field1249 * arg0 + arg1;
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = (field1248[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1248[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1248[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1248[var9] = var14;
				var9 += field1249;
			}
		}
	}
}
