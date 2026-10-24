package deob;

@ObfuscatedName("a")
public class class1 {

	@ObfuscatedName("a.a(IIII)I")
	public static int method1(int arg0, int arg1, int arg2) {
		arg1 &= 0x3;
		if (arg1 == 0) {
			return arg0;
		}

		if (arg1 == 1) {
			return arg2;
		}

		if (arg1 == 2) {
			return 7 - arg0;
		}

		return 7 - arg2;
	}

	@ObfuscatedName("a.b(IIII)I")
	public static int method2(int arg0, int arg1, int arg2) {
		arg2 &= 0x3;
		if (arg2 == 0) {
			return arg1;
		}

		if (arg2 == 1) {
			return 7 - arg0;
		}

		if (arg2 == 2) {
			return 7 - arg1;
		}

		return arg0;
	}

	@ObfuscatedName("a.a(ZIIIII)I")
	public static int method3(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg1 &= 0x3;
		if (arg1 == 0) {
			return arg0;
		}

		if (arg1 == 1) {
			return arg3;
		}

		if (arg1 == 2) {
			return 7 + 1 - arg0 - arg2;
		}

		return 7 + 1 - arg3 - arg4;
	}

	@ObfuscatedName("a.a(IIIIII)I")
	public static int method4(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg3 &= 0x3;
		if (arg3 == 0) {
			return arg2;
		}

		if (arg3 == 1) {
			return 7 + 1 - arg4 - arg0;
		}

		if (arg3 == 2) {
			return 7 + 1 - arg2 - arg1;
		}

		return arg4;
	}
}
