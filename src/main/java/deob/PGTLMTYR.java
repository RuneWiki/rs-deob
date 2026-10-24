package deob;

@ObfuscatedName("PGTLMTYR")
public class PGTLMTYR extends HZZJZIMV {

	@ObfuscatedName("PGTLMTYR.m")
	public static int field951;

	@ObfuscatedName("PGTLMTYR.n")
	public static int field952;

	@ObfuscatedName("PGTLMTYR.o")
	public static int field953;

	@ObfuscatedName("PGTLMTYR.p")
	public static int field954;

	@ObfuscatedName("PGTLMTYR.q")
	public static int field955;

	@ObfuscatedName("PGTLMTYR.r")
	public static int field956;

	@ObfuscatedName("PGTLMTYR.s")
	public static int field957;

	@ObfuscatedName("PGTLMTYR.t")
	public static int field958;

	@ObfuscatedName("PGTLMTYR.u")
	public static int field959;

	@ObfuscatedName("PGTLMTYR.l")
	public static int[] field950;

	@ObfuscatedName("PGTLMTYR.a(III[I)V")
	public static void method339(int arg0, int arg1, int[] arg2) {
		field950 = arg2;
		field951 = arg0;
		field952 = arg1;
		method341(0, arg0, 0, arg1);
	}

	@ObfuscatedName("PGTLMTYR.a(I)V")
	public static void method340() {
		field955 = 0;
		field953 = 0;
		field956 = field951;
		field954 = field952;
		field957 = field956 - 1;
		field958 = field956 / 2;
	}

	@ObfuscatedName("PGTLMTYR.a(IIIII)V")
	public static void method341(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 < 0) {
			arg2 = 0;
		}

		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg1 > field951) {
			arg1 = field951;
		}

		if (arg3 > field952) {
			arg3 = field952;
		}

		field955 = arg2;
		field953 = arg0;
		field956 = arg1;
		field954 = arg3;
		field957 = field956 - 1;
		field958 = field956 / 2;
		field959 = field954 / 2;
	}

	@ObfuscatedName("PGTLMTYR.a(B)V")
	public static void method342() {
		int var0 = field952 * field951;
		for (int var1 = 0; var1 < var0; var1++) {
			field950[var1] = 0;
		}
	}

	@ObfuscatedName("PGTLMTYR.a(IZIIIII)V")
	public static void method343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 < field955) {
			arg1 -= field955 - arg0;
			arg0 = field955;
		}

		if (arg3 < field953) {
			arg4 -= field953 - arg3;
			arg3 = field953;
		}

		if (arg0 + arg1 > field956) {
			arg1 = field956 - arg0;
		}

		if (arg3 + arg4 > field954) {
			arg4 = field954 - arg3;
		}

		int var6 = 256 - arg5;
		int var7 = (arg2 >> 16 & 0xFF) * arg5;
		int var8 = (arg2 >> 8 & 0xFF) * arg5;
		int var9 = (arg2 & 0xFF) * arg5;
		int var10 = field951 - arg1;
		int var11 = field951 * arg3 + arg0;
		for (int var12 = 0; var12 < arg4; var12++) {
			for (int var13 = -arg1; var13 < 0; var13++) {
				int var14 = (field950[var11] >> 16 & 0xFF) * var6;
				int var15 = (field950[var11] >> 8 & 0xFF) * var6;
				int var16 = (field950[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field950[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("PGTLMTYR.a(IIIIZI)V")
	public static void method344(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 < field955) {
			arg1 -= field955 - arg0;
			arg0 = field955;
		}

		if (arg3 < field953) {
			arg2 -= field953 - arg3;
			arg3 = field953;
		}

		if (arg0 + arg1 > field956) {
			arg1 = field956 - arg0;
		}

		if (arg2 + arg3 > field954) {
			arg2 = field954 - arg3;
		}

		int var5 = field951 - arg1;
		int var6 = field951 * arg3 + arg0;
		for (int var7 = -arg2; var7 < 0; var7++) {
			for (int var8 = -arg1; var8 < 0; var8++) {
				field950[var6++] = arg4;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("PGTLMTYR.a(IIIIII)V")
	public static void method345(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method347(arg4, arg0, arg2, arg1);
		method347(arg3 + arg4 - 1, arg0, arg2, arg1);
		method349(arg0, arg4, arg2, arg3);
		method349(arg0, arg4, arg1 + arg2 - 1, arg3);
	}

	@ObfuscatedName("PGTLMTYR.a(IIIIIII)V")
	public static void method346(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method348(arg4, arg2, arg1, arg5, arg0);
		method348(arg4, arg2 + arg3 - 1, arg1, arg5, arg0);

		if (arg3 >= 3) {
			method350(arg5, arg2 + 1, arg4, arg3 - 2, arg1);
			method350(arg5, arg2 + 1, arg0 + arg4 - 1, arg3 - 2, arg1);
		}
	}

	@ObfuscatedName("PGTLMTYR.b(IIIII)V")
	public static void method347(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field953 && arg0 < field954) {
			if (arg2 < field955) {
				arg3 -= field955 - arg2;
				arg2 = field955;
			}

			if (arg2 + arg3 > field956) {
				arg3 = field956 - arg2;
			}

			int var4 = field951 * arg0 + arg2;
			for (int var5 = 0; var5 < arg3; var5++) {
				field950[var4 + var5] = arg1;
			}
		}
	}

	@ObfuscatedName("PGTLMTYR.b(IIIIII)V")
	public static void method348(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 >= field953 && arg1 < field954) {
			if (arg0 < field955) {
				arg4 -= field955 - arg0;
				arg0 = field955;
			}

			if (arg0 + arg4 > field956) {
				arg4 = field956 - arg0;
			}

			int var5 = 256 - arg3;
			int var6 = (arg2 >> 16 & 0xFF) * arg3;
			int var7 = (arg2 >> 8 & 0xFF) * arg3;
			int var8 = (arg2 & 0xFF) * arg3;
			int var9 = field951 * arg1 + arg0;
			for (int var10 = 0; var10 < arg4; var10++) {
				int var11 = (field950[var9] >> 16 & 0xFF) * var5;
				int var12 = (field950[var9] >> 8 & 0xFF) * var5;
				int var13 = (field950[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field950[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("PGTLMTYR.c(IIIII)V")
	public static void method349(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field955 && arg2 < field956) {
			if (arg1 < field953) {
				arg3 -= field953 - arg1;
				arg1 = field953;
			}

			if (arg1 + arg3 > field954) {
				arg3 = field954 - arg1;
			}

			int var4 = field951 * arg1 + arg2;
			for (int var5 = 0; var5 < arg3; var5++) {
				field950[field951 * var5 + var4] = arg0;
			}
		}
	}

	@ObfuscatedName("PGTLMTYR.c(IIIIII)V")
	public static void method350(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 >= field955 && arg2 < field956) {
			if (arg1 < field953) {
				arg3 -= field953 - arg1;
				arg1 = field953;
			}

			if (arg1 + arg3 > field954) {
				arg3 = field954 - arg1;
			}

			int var5 = 256 - arg0;
			int var6 = (arg4 >> 16 & 0xFF) * arg0;
			int var7 = (arg4 >> 8 & 0xFF) * arg0;
			int var8 = (arg4 & 0xFF) * arg0;
			int var9 = field951 * arg1 + arg2;
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = (field950[var9] >> 16 & 0xFF) * var5;
				int var12 = (field950[var9] >> 8 & 0xFF) * var5;
				int var13 = (field950[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field950[var9] = var14;
				var9 += field951;
			}
		}
	}
}
