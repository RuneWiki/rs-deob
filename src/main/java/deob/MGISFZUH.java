package deob;

@ObfuscatedName("MGISFZUH")
public class MGISFZUH {

	@ObfuscatedName("MGISFZUH.a(IIII)I")
	public static int method364(int arg0, int arg1, int arg2) {
		arg2 &= 0x3;
		if (arg2 == 0) {
			return arg0;
		}

		if (arg2 == 1) {
			return arg1;
		}

		if (arg2 == 2) {
			return 7 - arg0;
		}

		return 7 - arg1;
	}

	@ObfuscatedName("MGISFZUH.a(IBII)I")
	public static int method365(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("MGISFZUH.a(IIIIIZ)I")
	public static int method366(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg3 &= 0x3;
		if (arg3 == 0) {
			return arg1;
		}

		if (arg3 == 1) {
			return arg0;
		}

		if (arg3 == 2) {
			return 7 + 1 - arg1 - arg4;
		}

		return 7 + 1 - arg0 - arg2;
	}

	@ObfuscatedName("MGISFZUH.a(IIBIII)I")
	public static int method367(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg2 &= 0x3;
		if (arg2 == 0) {
			return arg3;
		}

		if (arg2 == 1) {
			return 7 + 1 - arg4 - arg0;
		}

		if (arg2 == 2) {
			return 7 + 1 - arg3 - arg1;
		}

		return arg4;
	}
}
