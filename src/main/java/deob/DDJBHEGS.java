package deob;

@ObfuscatedName("DDJBHEGS")
public class DDJBHEGS {

	@ObfuscatedName("DDJBHEGS.a(IIII)I")
	public static int method179(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("DDJBHEGS.b(IIII)I")
	public static int method180(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("DDJBHEGS.a(IIIBII)I")
	public static int method181(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg0 &= 0x3;
		if (arg0 == 0) {
			return arg3;
		}

		if (arg0 == 1) {
			return arg2;
		}

		if (arg0 == 2) {
			return 7 + 1 - arg3 - arg1;
		}

		return 7 + 1 - arg2 - arg4;
	}

	@ObfuscatedName("DDJBHEGS.a(IIIZII)I")
	public static int method182(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg4 &= 0x3;
		if (arg4 == 0) {
			return arg2;
		}

		if (arg4 == 1) {
			return 7 + 1 - arg1 - arg3;
		}

		if (arg4 == 2) {
			return 7 + 1 - arg2 - arg0;
		}

		return arg1;
	}
}
