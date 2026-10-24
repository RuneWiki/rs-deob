package deob;

@ObfuscatedName("XNQMQYFY")
public class XNQMQYFY {

	@ObfuscatedName("XNQMQYFY.a(IIZI)I")
	public static int method570(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("XNQMQYFY.a(IIII)I")
	public static int method571(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("XNQMQYFY.a(IIIIIII)I")
	public static int method572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg1 & 0x1) == 1) {
			int var6 = arg2;
			arg2 = arg0;
			arg0 = var6;
		}

		arg3 &= 0x3;
		if (arg3 == 0) {
			return arg5;
		}

		if (arg3 == 1) {
			return arg4;
		}

		if (arg3 == 2) {
			return 7 + 1 - arg5 - arg2;
		}

		return 7 + 1 - arg4 - arg0;
	}

	@ObfuscatedName("XNQMQYFY.b(IIIIIII)I")
	public static int method573(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg5 & 0x1) == 1) {
			int var6 = arg3;
			arg3 = arg2;
			arg2 = var6;
		}

		arg4 &= 0x3;
		if (arg4 == 0) {
			return arg1;
		}

		if (arg4 == 1) {
			return 7 + 1 - arg0 - arg3;
		}

		if (arg4 == 2) {
			return 7 + 1 - arg1 - arg2;
		}

		return arg0;
	}
}
