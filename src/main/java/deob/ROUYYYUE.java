package deob;

@ObfuscatedName("ROUYYYUE")
public class ROUYYYUE {

	@ObfuscatedName("ROUYYYUE.a(IIII)I")
	public static int method384(int arg0, int arg1, int arg2) {
		arg0 &= 0x3;
		if (arg0 == 0) {
			return arg1;
		}

		if (arg0 == 1) {
			return arg2;
		}

		if (arg0 == 2) {
			return 7 - arg1;
		}

		return 7 - arg2;
	}

	@ObfuscatedName("ROUYYYUE.a(IIIZ)I")
	public static int method385(int arg0, int arg1, int arg2) {
		arg0 &= 0x3;
		if (arg0 == 0) {
			return arg1;
		}

		if (arg0 == 1) {
			return 7 - arg2;
		}

		if (arg0 == 2) {
			return 7 - arg1;
		}

		return arg2;
	}

	@ObfuscatedName("ROUYYYUE.a(ZIIIII)I")
	public static int method386(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg3 &= 0x3;
		if (arg3 == 0) {
			return arg1;
		}

		if (arg3 == 1) {
			return arg2;
		}

		if (arg3 == 2) {
			return 7 + 1 - arg1 - arg4;
		}

		return 7 + 1 - arg2 - arg0;
	}

	@ObfuscatedName("ROUYYYUE.a(IIIIII)I")
	public static int method387(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg4 &= 0x3;
		if (arg4 == 0) {
			return arg1;
		}

		if (arg4 == 1) {
			return 7 + 1 - arg3 - arg0;
		}

		if (arg4 == 2) {
			return 7 + 1 - arg1 - arg2;
		}

		return arg3;
	}
}
