package deob;

@ObfuscatedName("YYAQTPDX")
public class YYAQTPDX {

	@ObfuscatedName("YYAQTPDX.a(BIII)I")
	public static int method586(int arg0, int arg1, int arg2) {
		arg1 &= 0x3;
		if (arg1 == 0) {
			return arg2;
		}

		if (arg1 == 1) {
			return arg0;
		}

		if (arg1 == 2) {
			return 7 - arg2;
		}

		return 7 - arg0;
	}

	@ObfuscatedName("YYAQTPDX.a(IIII)I")
	public static int method587(int arg0, int arg1, int arg2) {
		arg1 &= 0x3;
		if (arg1 == 0) {
			return arg0;
		}

		if (arg1 == 1) {
			return 7 - arg2;
		}

		if (arg1 == 2) {
			return 7 - arg0;
		}

		return arg2;
	}

	@ObfuscatedName("YYAQTPDX.a(IIIIII)I")
	public static int method588(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg4 &= 0x3;
		if (arg4 == 0) {
			return arg2;
		}

		if (arg4 == 1) {
			return arg0;
		}

		if (arg4 == 2) {
			return 7 + 1 - arg2 - arg3;
		}

		return 7 + 1 - arg0 - arg1;
	}

	@ObfuscatedName("YYAQTPDX.b(IIIIII)I")
	public static int method589(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg2 &= 0x3;
		if (arg2 == 0) {
			return arg1;
		}

		if (arg2 == 1) {
			return 7 + 1 - arg0 - arg3;
		}

		if (arg2 == 2) {
			return 7 + 1 - arg1 - arg4;
		}

		return arg0;
	}
}
