package deob;

@ObfuscatedName("AOGMWZWE")
public class AOGMWZWE {

	@ObfuscatedName("AOGMWZWE.a(IIBI)I")
	public static int method1(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("AOGMWZWE.a(IIII)I")
	public static int method2(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("AOGMWZWE.a(IIIBIII)I")
	public static int method3(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg3 & 0x1) == 1) {
			int var6 = arg0;
			arg0 = arg2;
			arg2 = var6;
		}

		arg5 &= 0x3;
		if (arg5 == 0) {
			return arg4;
		}

		if (arg5 == 1) {
			return arg1;
		}

		if (arg5 == 2) {
			return 7 + 1 - arg4 - arg0;
		}

		return 7 + 1 - arg1 - arg2;
	}

	@ObfuscatedName("AOGMWZWE.a(IIZIIII)I")
	public static int method4(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg0 & 0x1) == 1) {
			int var6 = arg2;
			arg2 = arg5;
			arg5 = var6;
		}

		arg3 &= 0x3;
		if (arg3 == 0) {
			return arg1;
		}

		if (arg3 == 1) {
			return 7 + 1 - arg4 - arg2;
		}

		if (arg3 == 2) {
			return 7 + 1 - arg1 - arg5;
		}

		return arg4;
	}
}
