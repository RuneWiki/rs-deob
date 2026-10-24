package deob;

@ObfuscatedName("TFOQVWKW")
public class TFOQVWKW {

	@ObfuscatedName("TFOQVWKW.a(IIII)I")
	public static int method461(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("TFOQVWKW.a(IIZI)I")
	public static int method462(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("TFOQVWKW.a(IIIIII)I")
	public static int method463(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg1 &= 0x3;
		if (arg1 == 0) {
			return arg2;
		}

		if (arg1 == 1) {
			return arg3;
		}

		if (arg1 == 2) {
			return 7 + 1 - arg2 - arg4;
		}

		return 7 + 1 - arg3 - arg0;
	}

	@ObfuscatedName("TFOQVWKW.a(IIIIBI)I")
	public static int method464(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg1 &= 0x3;
		if (arg1 == 0) {
			return arg0;
		}

		if (arg1 == 1) {
			return 7 + 1 - arg4 - arg3;
		}

		if (arg1 == 2) {
			return 7 + 1 - arg0 - arg2;
		}

		return arg4;
	}
}
