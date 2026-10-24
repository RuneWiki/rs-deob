package deob;

@ObfuscatedName("KVJNUKIT")
public class KVJNUKIT extends ZAQWNGNJ {

	@ObfuscatedName("KVJNUKIT.p")
	public static int field952;

	@ObfuscatedName("KVJNUKIT.q")
	public static int field953;

	@ObfuscatedName("KVJNUKIT.r")
	public static int field954;

	@ObfuscatedName("KVJNUKIT.s")
	public static int field955;

	@ObfuscatedName("KVJNUKIT.t")
	public static int field956;

	@ObfuscatedName("KVJNUKIT.u")
	public static int field957;

	@ObfuscatedName("KVJNUKIT.v")
	public static int field958;

	@ObfuscatedName("KVJNUKIT.w")
	public static int field959;

	@ObfuscatedName("KVJNUKIT.x")
	public static int field960;

	@ObfuscatedName("KVJNUKIT.o")
	public static int[] field951;

	@ObfuscatedName("KVJNUKIT.a(II[II)V")
	public static void method339(int arg0, int arg1, int[] arg2) {
		field951 = arg2;
		field952 = arg1;
		field953 = arg0;
		method341(0, 0, arg1, arg0);
	}

	@ObfuscatedName("KVJNUKIT.a(B)V")
	public static void method340() {
		field956 = 0;
		field954 = 0;
		field957 = field952;
		field955 = field953;
		field958 = field957 - 1;
		field959 = field957 / 2;
	}

	@ObfuscatedName("KVJNUKIT.a(IIZII)V")
	public static void method341(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg2 > field952) {
			arg2 = field952;
		}

		if (arg3 > field953) {
			arg3 = field953;
		}

		field956 = arg0;
		field954 = arg1;
		field957 = arg2;
		field955 = arg3;
		field958 = field957 - 1;
		field959 = field957 / 2;
		field960 = field955 / 2;
	}

	@ObfuscatedName("KVJNUKIT.a(Z)V")
	public static void method342() {
		int var0 = field953 * field952;
		for (int var1 = 0; var1 < var0; var1++) {
			field951[var1] = 0;
		}
	}

	@ObfuscatedName("KVJNUKIT.a(IIIIIII)V")
	public static void method343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 < field956) {
			arg1 -= field956 - arg0;
			arg0 = field956;
		}

		if (arg5 < field954) {
			arg2 -= field954 - arg5;
			arg5 = field954;
		}

		if (arg0 + arg1 > field957) {
			arg1 = field957 - arg0;
		}

		if (arg2 + arg5 > field955) {
			arg2 = field955 - arg5;
		}

		int var6 = 256 - arg4;
		int var7 = (arg3 >> 16 & 0xFF) * arg4;
		int var8 = (arg3 >> 8 & 0xFF) * arg4;
		int var9 = (arg3 & 0xFF) * arg4;
		int var10 = field952 - arg1;
		int var11 = field952 * arg5 + arg0;
		for (int var12 = 0; var12 < arg2; var12++) {
			for (int var13 = -arg1; var13 < 0; var13++) {
				int var14 = (field951[var11] >> 16 & 0xFF) * var6;
				int var15 = (field951[var11] >> 8 & 0xFF) * var6;
				int var16 = (field951[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field951[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("KVJNUKIT.a(IIZIII)V")
	public static void method344(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 < field956) {
			arg0 -= field956 - arg3;
			arg3 = field956;
		}

		if (arg2 < field954) {
			arg4 -= field954 - arg2;
			arg2 = field954;
		}

		if (arg0 + arg3 > field957) {
			arg0 = field957 - arg3;
		}

		if (arg2 + arg4 > field955) {
			arg4 = field955 - arg2;
		}

		int var5 = field952 - arg0;
		int var6 = field952 * arg2 + arg3;
		for (int var7 = -arg4; var7 < 0; var7++) {
			for (int var8 = -arg0; var8 < 0; var8++) {
				field951[var6++] = arg1;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("KVJNUKIT.a(IIIIBI)V")
	public static void method345(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method347(arg0, arg4, arg3, arg1);
		method347(arg0, arg2 + arg4 - 1, arg3, arg1);
		method349(arg1, arg2, arg4, arg3);
		method349(arg0 + arg1 - 1, arg2, arg4, arg3);
	}

	@ObfuscatedName("KVJNUKIT.a(BIIIIII)V")
	public static void method346(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method348(arg5, arg1, arg2, arg0, arg3);
		method348(arg5, arg1, arg2, arg0 + arg4 - 1, arg3);

		if (arg4 >= 3) {
			method350(arg1, arg0 + 1, arg5, arg4 - 2, arg3);
			method350(arg1, arg0 + 1, arg2 + arg5 - 1, arg4 - 2, arg3);
		}
	}

	@ObfuscatedName("KVJNUKIT.a(IIIII)V")
	public static void method347(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field954 && arg1 < field955) {
			if (arg3 < field956) {
				arg0 -= field956 - arg3;
				arg3 = field956;
			}

			if (arg0 + arg3 > field957) {
				arg0 = field957 - arg3;
			}

			int var4 = field952 * arg1 + arg3;
			for (int var5 = 0; var5 < arg0; var5++) {
				field951[var4 + var5] = arg2;
			}
		}
	}

	@ObfuscatedName("KVJNUKIT.a(IZIIII)V")
	public static void method348(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 >= field954 && arg3 < field955) {
			if (arg0 < field956) {
				arg2 -= field956 - arg0;
				arg0 = field956;
			}

			if (arg0 + arg2 > field957) {
				arg2 = field957 - arg0;
			}

			int var5 = 256 - arg1;
			int var6 = (arg4 >> 16 & 0xFF) * arg1;
			int var7 = (arg4 >> 8 & 0xFF) * arg1;
			int var8 = (arg4 & 0xFF) * arg1;
			int var9 = field952 * arg3 + arg0;
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = (field951[var9] >> 16 & 0xFF) * var5;
				int var12 = (field951[var9] >> 8 & 0xFF) * var5;
				int var13 = (field951[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field951[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("KVJNUKIT.b(IIIII)V")
	public static void method349(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field956 && arg0 < field957) {
			if (arg2 < field954) {
				arg1 -= field954 - arg2;
				arg2 = field954;
			}

			if (arg1 + arg2 > field955) {
				arg1 = field955 - arg2;
			}

			int var4 = field952 * arg2 + arg0;
			for (int var5 = 0; var5 < arg1; var5++) {
				field951[field952 * var5 + var4] = arg3;
			}
		}
	}

	@ObfuscatedName("KVJNUKIT.a(IIIZII)V")
	public static void method350(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 >= field956 && arg2 < field957) {
			if (arg1 < field954) {
				arg3 -= field954 - arg1;
				arg1 = field954;
			}

			if (arg1 + arg3 > field955) {
				arg3 = field955 - arg1;
			}

			int var5 = 256 - arg0;
			int var6 = (arg4 >> 16 & 0xFF) * arg0;
			int var7 = (arg4 >> 8 & 0xFF) * arg0;
			int var8 = (arg4 & 0xFF) * arg0;
			int var9 = field952 * arg1 + arg2;
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = (field951[var9] >> 16 & 0xFF) * var5;
				int var12 = (field951[var9] >> 8 & 0xFF) * var5;
				int var13 = (field951[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field951[var9] = var14;
				var9 += field952;
			}
		}
	}
}
