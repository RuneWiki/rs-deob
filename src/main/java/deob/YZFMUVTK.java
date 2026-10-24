package deob;

@ObfuscatedName("YZFMUVTK")
public class YZFMUVTK {

	@ObfuscatedName("YZFMUVTK.a(IIII)I")
	public static int method580(int arg0, int arg1, int arg2) {
		arg2 &= 0x3;
		if (arg2 == 0) {
			return arg1;
		}

		if (arg2 == 1) {
			return arg0;
		}

		if (arg2 == 2) {
			return 7 - arg1;
		}

		return 7 - arg0;
	}

	@ObfuscatedName("YZFMUVTK.b(IIII)I")
	public static int method581(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("YZFMUVTK.a(IIIIIII)I")
	public static int method582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg5 & 0x1) == 1) {
			int var6 = arg0;
			arg0 = arg4;
			arg4 = var6;
		}

		arg3 &= 0x3;
		if (arg3 == 0) {
			return arg1;
		}

		if (arg3 == 1) {
			return arg2;
		}

		if (arg3 == 2) {
			return 7 + 1 - arg1 - arg0;
		}

		return 7 + 1 - arg2 - arg4;
	}

	@ObfuscatedName("YZFMUVTK.a(IIIIIIB)I")
	public static int method583(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg4 & 0x1) == 1) {
			int var6 = arg3;
			arg3 = arg2;
			arg2 = var6;
		}

		arg5 &= 0x3;
		if (arg5 == 0) {
			return arg1;
		}

		if (arg5 == 1) {
			return 7 + 1 - arg0 - arg3;
		}

		if (arg5 == 2) {
			return 7 + 1 - arg1 - arg2;
		}

		return arg0;
	}
}
