package deob;

@ObfuscatedName("TTGPXKMD")
public class TTGPXKMD extends EWMBJETC {

	@ObfuscatedName("TTGPXKMD.p")
	public static int field1187;

	@ObfuscatedName("TTGPXKMD.q")
	public static int field1188;

	@ObfuscatedName("TTGPXKMD.r")
	public static int field1189;

	@ObfuscatedName("TTGPXKMD.s")
	public static int field1190;

	@ObfuscatedName("TTGPXKMD.t")
	public static int field1191;

	@ObfuscatedName("TTGPXKMD.u")
	public static int field1192;

	@ObfuscatedName("TTGPXKMD.v")
	public static int field1193;

	@ObfuscatedName("TTGPXKMD.w")
	public static int field1194;

	@ObfuscatedName("TTGPXKMD.x")
	public static int field1195;

	@ObfuscatedName("TTGPXKMD.o")
	public static int[] field1186;

	@ObfuscatedName("TTGPXKMD.a(Z[III)V")
	public static void method427(int[] arg0, int arg1, int arg2) {
		field1186 = arg0;
		field1187 = arg2;
		field1188 = arg1;
		method429(0, arg2, arg1, 0);
	}

	@ObfuscatedName("TTGPXKMD.a(I)V")
	public static void method428() {
		field1191 = 0;
		field1189 = 0;
		field1192 = field1187;
		field1190 = field1188;
		field1193 = field1192 - 1;
		field1194 = field1192 / 2;
	}

	@ObfuscatedName("TTGPXKMD.a(IIIIB)V")
	public static void method429(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg1 > field1187) {
			arg1 = field1187;
		}

		if (arg2 > field1188) {
			arg2 = field1188;
		}

		field1191 = arg3;
		field1189 = arg0;
		field1192 = arg1;
		field1190 = arg2;
		field1193 = field1192 - 1;
		field1194 = field1192 / 2;
		field1195 = field1190 / 2;
	}

	@ObfuscatedName("TTGPXKMD.b(I)V")
	public static void method430() {
		int var0 = field1188 * field1187;
		for (int var1 = 0; var1 < var0; var1++) {
			field1186[var1] = 0;
		}
	}

	@ObfuscatedName("TTGPXKMD.a(IIIIIII)V")
	public static void method431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 < field1191) {
			arg1 -= field1191 - arg0;
			arg0 = field1191;
		}

		if (arg4 < field1189) {
			arg5 -= field1189 - arg4;
			arg4 = field1189;
		}

		if (arg0 + arg1 > field1192) {
			arg1 = field1192 - arg0;
		}

		if (arg4 + arg5 > field1190) {
			arg5 = field1190 - arg4;
		}

		int var6 = 256 - arg3;
		int var7 = (arg2 >> 16 & 0xFF) * arg3;
		int var8 = (arg2 >> 8 & 0xFF) * arg3;
		int var9 = (arg2 & 0xFF) * arg3;
		int var10 = field1187 - arg1;
		int var11 = field1187 * arg4 + arg0;
		for (int var12 = 0; var12 < arg5; var12++) {
			for (int var13 = -arg1; var13 < 0; var13++) {
				int var14 = (field1186[var11] >> 16 & 0xFF) * var6;
				int var15 = (field1186[var11] >> 8 & 0xFF) * var6;
				int var16 = (field1186[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field1186[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("TTGPXKMD.a(IIIZII)V")
	public static void method432(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 < field1191) {
			arg4 -= field1191 - arg3;
			arg3 = field1191;
		}

		if (arg1 < field1189) {
			arg2 -= field1189 - arg1;
			arg1 = field1189;
		}

		if (arg3 + arg4 > field1192) {
			arg4 = field1192 - arg3;
		}

		if (arg1 + arg2 > field1190) {
			arg2 = field1190 - arg1;
		}

		int var5 = field1187 - arg4;
		int var6 = field1187 * arg1 + arg3;
		for (int var7 = -arg2; var7 < 0; var7++) {
			for (int var8 = -arg4; var8 < 0; var8++) {
				field1186[var6++] = arg0;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("TTGPXKMD.a(IIIIII)V")
	public static void method433(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method435(arg1, arg2, arg3, arg0);
		method435(arg1 + arg4 - 1, arg2, arg3, arg0);
		method437(arg3, arg0, arg4, arg1);
		method437(arg3, arg0 + arg2 - 1, arg4, arg1);
	}

	@ObfuscatedName("TTGPXKMD.b(IIIIIII)V")
	public static void method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method436(arg0, arg1, arg3, arg4, arg2);
		method436(arg0 + arg5 - 1, arg1, arg3, arg4, arg2);

		if (arg5 >= 3) {
			method438(arg5 - 2, arg0 + 1, arg2, arg1, arg4);
			method438(arg5 - 2, arg0 + 1, arg2 + arg3 - 1, arg1, arg4);
		}
	}

	@ObfuscatedName("TTGPXKMD.a(BIIII)V")
	public static void method435(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field1189 && arg0 < field1190) {
			if (arg3 < field1191) {
				arg1 -= field1191 - arg3;
				arg3 = field1191;
			}

			if (arg1 + arg3 > field1192) {
				arg1 = field1192 - arg3;
			}

			int var4 = field1187 * arg0 + arg3;
			for (int var5 = 0; var5 < arg1; var5++) {
				field1186[var4 + var5] = arg2;
			}
		}
	}

	@ObfuscatedName("TTGPXKMD.a(IIIIZI)V")
	public static void method436(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field1189 && arg0 < field1190) {
			if (arg4 < field1191) {
				arg2 -= field1191 - arg4;
				arg4 = field1191;
			}

			if (arg2 + arg4 > field1192) {
				arg2 = field1192 - arg4;
			}

			int var5 = 256 - arg1;
			int var6 = (arg3 >> 16 & 0xFF) * arg1;
			int var7 = (arg3 >> 8 & 0xFF) * arg1;
			int var8 = (arg3 & 0xFF) * arg1;
			int var9 = field1187 * arg0 + arg4;
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = (field1186[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1186[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1186[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1186[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("TTGPXKMD.a(IIIII)V")
	public static void method437(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field1191 && arg1 < field1192) {
			if (arg3 < field1189) {
				arg2 -= field1189 - arg3;
				arg3 = field1189;
			}

			if (arg2 + arg3 > field1190) {
				arg2 = field1190 - arg3;
			}

			int var4 = field1187 * arg3 + arg1;
			for (int var5 = 0; var5 < arg2; var5++) {
				field1186[field1187 * var5 + var4] = arg0;
			}
		}
	}

	@ObfuscatedName("TTGPXKMD.b(IIIIII)V")
	public static void method438(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 >= field1191 && arg2 < field1192) {
			if (arg1 < field1189) {
				arg0 -= field1189 - arg1;
				arg1 = field1189;
			}

			if (arg0 + arg1 > field1190) {
				arg0 = field1190 - arg1;
			}

			int var5 = 256 - arg3;
			int var6 = (arg4 >> 16 & 0xFF) * arg3;
			int var7 = (arg4 >> 8 & 0xFF) * arg3;
			int var8 = (arg4 & 0xFF) * arg3;
			int var9 = field1187 * arg1 + arg2;
			for (int var10 = 0; var10 < arg0; var10++) {
				int var11 = (field1186[var9] >> 16 & 0xFF) * var5;
				int var12 = (field1186[var9] >> 8 & 0xFF) * var5;
				int var13 = (field1186[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field1186[var9] = var14;
				var9 += field1187;
			}
		}
	}
}
