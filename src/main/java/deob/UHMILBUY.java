package deob;

@ObfuscatedName("UHMILBUY")
public class UHMILBUY {

	@ObfuscatedName("UHMILBUY.a(IIII)I")
	public static int method426(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("UHMILBUY.b(IIII)I")
	public static int method427(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("UHMILBUY.a(IZIIII)I")
	public static int method428(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg3 &= 0x3;
		if (arg3 == 0) {
			return arg1;
		}

		if (arg3 == 1) {
			return arg4;
		}

		if (arg3 == 2) {
			return 7 + 1 - arg1 - arg0;
		}

		return 7 + 1 - arg4 - arg2;
	}

	@ObfuscatedName("UHMILBUY.a(IIIBII)I")
	public static int method429(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg0 &= 0x3;
		if (arg0 == 0) {
			return arg1;
		}

		if (arg0 == 1) {
			return 7 + 1 - arg3 - arg4;
		}

		if (arg0 == 2) {
			return 7 + 1 - arg1 - arg2;
		}

		return arg3;
	}
}
