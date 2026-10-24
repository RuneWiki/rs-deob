package deob;

@ObfuscatedName("WXMXSJQQ")
public class WXMXSJQQ {

	@ObfuscatedName("WXMXSJQQ.a(IIIB)I")
	public static int method588(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("WXMXSJQQ.a(IIII)I")
	public static int method589(int arg0, int arg1, int arg2) {
		arg2 &= 0x3;
		if (arg2 == 0) {
			return arg0;
		}

		if (arg2 == 1) {
			return 7 - arg1;
		}

		if (arg2 == 2) {
			return 7 - arg0;
		}

		return arg1;
	}

	@ObfuscatedName("WXMXSJQQ.a(BIIIII)I")
	public static int method590(int arg0, int arg1, int arg2, int arg3, int arg4) {
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

	@ObfuscatedName("WXMXSJQQ.a(IIIIII)I")
	public static int method591(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg4 &= 0x3;
		if (arg4 == 0) {
			return arg3;
		}

		if (arg4 == 1) {
			return 7 + 1 - arg1 - arg0;
		}

		if (arg4 == 2) {
			return 7 + 1 - arg3 - arg2;
		}

		return arg1;
	}
}
