package deob;

@ObfuscatedName("HSOVOELH")
public class HSOVOELH {

	@ObfuscatedName("HSOVOELH.a(IIIB)I")
	public static int method312(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("HSOVOELH.b(IIIB)I")
	public static int method313(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("HSOVOELH.a(IIIIII)I")
	public static int method314(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg2 &= 0x3;
		if (arg2 == 0) {
			return arg3;
		}

		if (arg2 == 1) {
			return arg4;
		}

		if (arg2 == 2) {
			return 7 + 1 - arg3 - arg1;
		}

		return 7 + 1 - arg4 - arg0;
	}

	@ObfuscatedName("HSOVOELH.b(IIIIII)I")
	public static int method315(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg1 &= 0x3;
		if (arg1 == 0) {
			return arg0;
		}

		if (arg1 == 1) {
			return 7 + 1 - arg3 - arg2;
		}

		if (arg1 == 2) {
			return 7 + 1 - arg0 - arg4;
		}

		return arg3;
	}
}
