package deob;

@ObfuscatedName("CBERHIHM")
public class CBERHIHM extends EDVKOEOK {

	@ObfuscatedName("CBERHIHM.p")
	public static int field25;

	@ObfuscatedName("CBERHIHM.q")
	public static int field26;

	@ObfuscatedName("CBERHIHM.r")
	public static int field27;

	@ObfuscatedName("CBERHIHM.s")
	public static int field28;

	@ObfuscatedName("CBERHIHM.t")
	public static int field29;

	@ObfuscatedName("CBERHIHM.u")
	public static int field30;

	@ObfuscatedName("CBERHIHM.v")
	public static int field31;

	@ObfuscatedName("CBERHIHM.w")
	public static int field32;

	@ObfuscatedName("CBERHIHM.x")
	public static int field33;

	@ObfuscatedName("CBERHIHM.o")
	public static int[] field24;

	@ObfuscatedName("CBERHIHM.a(B[III)V")
	public static void method28(int[] arg0, int arg1, int arg2) {
		field24 = arg0;
		field25 = arg2;
		field26 = arg1;
		method30(arg1, 0, 0, arg2);
	}

	@ObfuscatedName("CBERHIHM.a(Z)V")
	public static void method29() {
		field29 = 0;
		field27 = 0;
		field30 = field25;
		field28 = field26;
		field31 = field30 - 1;
		field32 = field30 / 2;
	}

	@ObfuscatedName("CBERHIHM.a(IIIIZ)V")
	public static void method30(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 < 0) {
			arg2 = 0;
		}

		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg3 > field25) {
			arg3 = field25;
		}

		if (arg0 > field26) {
			arg0 = field26;
		}

		field29 = arg2;
		field27 = arg1;
		field30 = arg3;
		field28 = arg0;
		field31 = field30 - 1;
		field32 = field30 / 2;
		field33 = field28 / 2;
	}

	@ObfuscatedName("CBERHIHM.a(B)V")
	public static void method31() {
		int var0 = field26 * field25;
		for (int var1 = 0; var1 < var0; var1++) {
			field24[var1] = 0;
		}
	}

	@ObfuscatedName("CBERHIHM.a(IIIIIII)V")
	public static void method32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 < field29) {
			arg1 -= field29 - arg0;
			arg0 = field29;
		}

		if (arg5 < field27) {
			arg2 -= field27 - arg5;
			arg5 = field27;
		}

		if (arg0 + arg1 > field30) {
			arg1 = field30 - arg0;
		}

		if (arg2 + arg5 > field28) {
			arg2 = field28 - arg5;
		}

		int var6 = 256 - arg4;
		int var7 = (arg3 >> 16 & 0xFF) * arg4;
		int var8 = (arg3 >> 8 & 0xFF) * arg4;
		int var9 = (arg3 & 0xFF) * arg4;
		int var10 = field25 - arg1;
		int var11 = field25 * arg5 + arg0;
		for (int var12 = 0; var12 < arg2; var12++) {
			for (int var13 = -arg1; var13 < 0; var13++) {
				int var14 = (field24[var11] >> 16 & 0xFF) * var6;
				int var15 = (field24[var11] >> 8 & 0xFF) * var6;
				int var16 = (field24[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field24[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("CBERHIHM.a(IIIIII)V")
	public static void method33(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 < field29) {
			arg4 -= field29 - arg0;
			arg0 = field29;
		}

		if (arg2 < field27) {
			arg3 -= field27 - arg2;
			arg2 = field27;
		}

		if (arg0 + arg4 > field30) {
			arg4 = field30 - arg0;
		}

		if (arg2 + arg3 > field28) {
			arg3 = field28 - arg2;
		}

		int var5 = field25 - arg4;
		int var6 = field25 * arg2 + arg0;
		for (int var7 = -arg3; var7 < 0; var7++) {
			for (int var8 = -arg4; var8 < 0; var8++) {
				field24[var6++] = arg1;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("CBERHIHM.a(IIIIIZ)V")
	public static void method34(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method36(arg4, arg3, arg2, arg0);
		method36(arg1 + arg4 - 1, arg3, arg2, arg0);
		method38(arg1, arg2, arg4, arg3);
		method38(arg1, arg2, arg4, arg0 + arg3 - 1);
	}

	@ObfuscatedName("CBERHIHM.b(IIIIIII)V")
	public static void method35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method37(arg5, arg1, arg4, arg3, arg0);
		method37(arg5, arg1, arg2 + arg4 - 1, arg3, arg0);

		if (arg2 >= 3) {
			method39(arg0, arg5, arg2 - 2, arg4 + 1, arg3);
			method39(arg0 + arg1 - 1, arg5, arg2 - 2, arg4 + 1, arg3);
		}
	}

	@ObfuscatedName("CBERHIHM.a(IIIII)V")
	public static void method36(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field27 && arg0 < field28) {
			if (arg1 < field29) {
				arg3 -= field29 - arg1;
				arg1 = field29;
			}

			if (arg1 + arg3 > field30) {
				arg3 = field30 - arg1;
			}

			int var4 = field25 * arg0 + arg1;
			for (int var5 = 0; var5 < arg3; var5++) {
				field24[var4 + var5] = arg2;
			}
		}
	}

	@ObfuscatedName("CBERHIHM.a(IIBIII)V")
	public static void method37(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 >= field27 && arg2 < field28) {
			if (arg4 < field29) {
				arg1 -= field29 - arg4;
				arg4 = field29;
			}

			if (arg1 + arg4 > field30) {
				arg1 = field30 - arg4;
			}

			int var5 = 256 - arg3;
			int var6 = (arg0 >> 16 & 0xFF) * arg3;
			int var7 = (arg0 >> 8 & 0xFF) * arg3;
			int var8 = (arg0 & 0xFF) * arg3;
			int var9 = field25 * arg2 + arg4;
			for (int var10 = 0; var10 < arg1; var10++) {
				int var11 = (field24[var9] >> 16 & 0xFF) * var5;
				int var12 = (field24[var9] >> 8 & 0xFF) * var5;
				int var13 = (field24[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field24[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("CBERHIHM.a(IZIII)V")
	public static void method38(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field29 && arg3 < field30) {
			if (arg2 < field27) {
				arg0 -= field27 - arg2;
				arg2 = field27;
			}

			if (arg0 + arg2 > field28) {
				arg0 = field28 - arg2;
			}

			int var4 = field25 * arg2 + arg3;
			for (int var5 = 0; var5 < arg0; var5++) {
				field24[field25 * var5 + var4] = arg1;
			}
		}
	}

	@ObfuscatedName("CBERHIHM.a(BIIIII)V")
	public static void method39(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field29 && arg0 < field30) {
			if (arg3 < field27) {
				arg2 -= field27 - arg3;
				arg3 = field27;
			}

			if (arg2 + arg3 > field28) {
				arg2 = field28 - arg3;
			}

			int var5 = 256 - arg4;
			int var6 = (arg1 >> 16 & 0xFF) * arg4;
			int var7 = (arg1 >> 8 & 0xFF) * arg4;
			int var8 = (arg1 & 0xFF) * arg4;
			int var9 = field25 * arg3 + arg0;
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = (field24[var9] >> 16 & 0xFF) * var5;
				int var12 = (field24[var9] >> 8 & 0xFF) * var5;
				int var13 = (field24[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field24[var9] = var14;
				var9 += field25;
			}
		}
	}
}
