package deob;

@ObfuscatedName("EWLSABLL")
public class EWLSABLL {

	@ObfuscatedName("EWLSABLL.a(IIII)I")
	public static int method194(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("EWLSABLL.a(IIZI)I")
	public static int method195(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("EWLSABLL.a(IIIIIII)I")
	public static int method196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg3 & 0x1) == 1) {
			int var6 = arg2;
			arg2 = arg0;
			arg0 = var6;
		}

		arg5 &= 0x3;
		if (arg5 == 0) {
			return arg1;
		}

		if (arg5 == 1) {
			return arg4;
		}

		if (arg5 == 2) {
			return 7 + 1 - arg1 - arg2;
		}

		return 7 + 1 - arg4 - arg0;
	}

	@ObfuscatedName("EWLSABLL.b(IIIIIII)I")
	public static int method197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg0 & 0x1) == 1) {
			int var6 = arg5;
			arg5 = arg1;
			arg1 = var6;
		}

		arg4 &= 0x3;
		if (arg4 == 0) {
			return arg3;
		}

		if (arg4 == 1) {
			return 7 + 1 - arg2 - arg5;
		}

		if (arg4 == 2) {
			return 7 + 1 - arg3 - arg1;
		}

		return arg2;
	}
}
