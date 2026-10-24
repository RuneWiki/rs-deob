package deob;

@ObfuscatedName("FCKTYQCQ")
public class FCKTYQCQ {

	@ObfuscatedName("FCKTYQCQ.a(IBII)I")
	public static int method201(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("FCKTYQCQ.a(IIBI)I")
	public static int method202(int arg0, int arg1, int arg2) {
		arg0 &= 0x3;
		if (arg0 == 0) {
			return arg2;
		}

		if (arg0 == 1) {
			return 7 - arg1;
		}

		if (arg0 == 2) {
			return 7 - arg2;
		}

		return arg1;
	}

	@ObfuscatedName("FCKTYQCQ.a(IIBIII)I")
	public static int method203(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg2 &= 0x3;
		if (arg2 == 0) {
			return arg3;
		}

		if (arg2 == 1) {
			return arg4;
		}

		if (arg2 == 2) {
			return 7 + 1 - arg3 - arg0;
		}

		return 7 + 1 - arg4 - arg1;
	}

	@ObfuscatedName("FCKTYQCQ.a(IIIIII)I")
	public static int method204(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg1 &= 0x3;
		if (arg1 == 0) {
			return arg0;
		}

		if (arg1 == 1) {
			return 7 + 1 - arg2 - arg3;
		}

		if (arg1 == 2) {
			return 7 + 1 - arg0 - arg4;
		}

		return arg2;
	}
}
