package deob;

@ObfuscatedName("GNGTCMOJ")
public class GNGTCMOJ {

	@ObfuscatedName("GNGTCMOJ.a(IIII)I")
	public static int method210(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("GNGTCMOJ.b(IIII)I")
	public static int method211(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("GNGTCMOJ.a(IIIIIII)I")
	public static int method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg1 & 0x1) == 1) {
			int var6 = arg0;
			arg0 = arg2;
			arg2 = var6;
		}

		arg3 &= 0x3;
		if (arg3 == 0) {
			return arg4;
		}

		if (arg3 == 1) {
			return arg5;
		}

		if (arg3 == 2) {
			return 7 + 1 - arg4 - arg0;
		}

		return 7 + 1 - arg5 - arg2;
	}

	@ObfuscatedName("GNGTCMOJ.b(IIIIIII)I")
	public static int method213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg0 & 0x1) == 1) {
			int var6 = arg5;
			arg5 = arg1;
			arg1 = var6;
		}

		arg2 &= 0x3;
		if (arg2 == 0) {
			return arg4;
		}

		if (arg2 == 1) {
			return 7 + 1 - arg3 - arg5;
		}

		if (arg2 == 2) {
			return 7 + 1 - arg4 - arg1;
		}

		return arg3;
	}
}
