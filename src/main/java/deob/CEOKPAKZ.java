package deob;

@ObfuscatedName("CEOKPAKZ")
public class CEOKPAKZ {

	@ObfuscatedName("CEOKPAKZ.a(IIIB)I")
	public static int method6(int arg0, int arg1, int arg2) {
		arg0 &= 0x3;
		if (arg0 == 0) {
			return arg2;
		}

		if (arg0 == 1) {
			return arg1;
		}

		if (arg0 == 2) {
			return 7 - arg2;
		}

		return 7 - arg1;
	}

	@ObfuscatedName("CEOKPAKZ.a(IIII)I")
	public static int method7(int arg0, int arg1, int arg2) {
		arg1 &= 0x3;
		if (arg1 == 0) {
			return arg2;
		}

		if (arg1 == 1) {
			return 7 - arg0;
		}

		if (arg1 == 2) {
			return 7 - arg2;
		}

		return arg0;
	}

	@ObfuscatedName("CEOKPAKZ.a(IIIIII)I")
	public static int method8(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg3 &= 0x3;
		if (arg3 == 0) {
			return arg2;
		}

		if (arg3 == 1) {
			return arg4;
		}

		if (arg3 == 2) {
			return 7 + 1 - arg2 - arg0;
		}

		return 7 + 1 - arg4 - arg1;
	}

	@ObfuscatedName("CEOKPAKZ.a(IIBIII)I")
	public static int method9(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg3 &= 0x3;
		if (arg3 == 0) {
			return arg1;
		}

		if (arg3 == 1) {
			return 7 + 1 - arg4 - arg2;
		}

		if (arg3 == 2) {
			return 7 + 1 - arg1 - arg0;
		}

		return arg4;
	}
}
