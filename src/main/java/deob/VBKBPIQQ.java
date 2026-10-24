package deob;

@ObfuscatedName("VBKBPIQQ")
public class VBKBPIQQ {

	@ObfuscatedName("VBKBPIQQ.a(IIII)I")
	public static int method534(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("VBKBPIQQ.b(IIII)I")
	public static int method535(int arg0, int arg1, int arg2) {
		arg0 &= 0x3;
		if (arg0 == 0) {
			return arg2;
		}

		if (arg0 == 1) {
			return 7 - arg1;
		}

		if (arg0 == 2) {
			return 7 - arg2;
		}

		return arg1;
	}

	@ObfuscatedName("VBKBPIQQ.a(IIIIIZI)I")
	public static int method536(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg3 & 0x1) == 1) {
			int var6 = arg0;
			arg0 = arg4;
			arg4 = var6;
		}

		arg5 &= 0x3;
		if (arg5 == 0) {
			return arg1;
		}

		if (arg5 == 1) {
			return arg2;
		}

		if (arg5 == 2) {
			return 7 + 1 - arg1 - arg0;
		}

		return 7 + 1 - arg2 - arg4;
	}

	@ObfuscatedName("VBKBPIQQ.a(IIIIIII)I")
	public static int method537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg1 & 0x1) == 1) {
			int var6 = arg3;
			arg3 = arg5;
			arg5 = var6;
		}

		arg4 &= 0x3;
		if (arg4 == 0) {
			return arg0;
		}

		if (arg4 == 1) {
			return 7 + 1 - arg2 - arg3;
		}

		if (arg4 == 2) {
			return 7 + 1 - arg0 - arg5;
		}

		return arg2;
	}
}
