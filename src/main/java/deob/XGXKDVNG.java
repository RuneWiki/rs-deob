package deob;

@ObfuscatedName("XGXKDVNG")
public class XGXKDVNG {

	@ObfuscatedName("XGXKDVNG.a(IIII)I")
	public static int method586(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("XGXKDVNG.b(IIII)I")
	public static int method587(int arg0, int arg1, int arg2) {
		arg1 &= 0x3;
		if (arg1 == 0) {
			return arg0;
		}

		if (arg1 == 1) {
			return 7 - arg2;
		}

		if (arg1 == 2) {
			return 7 - arg0;
		}

		return arg2;
	}

	@ObfuscatedName("XGXKDVNG.a(IIIIIII)I")
	public static int method588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg5 & 0x1) == 1) {
			int var6 = arg0;
			arg0 = arg4;
			arg4 = var6;
		}

		arg2 &= 0x3;
		if (arg2 == 0) {
			return arg3;
		}

		if (arg2 == 1) {
			return arg1;
		}

		if (arg2 == 2) {
			return 7 + 1 - arg3 - arg0;
		}

		return 7 + 1 - arg1 - arg4;
	}

	@ObfuscatedName("XGXKDVNG.a(IIIIIZI)I")
	public static int method589(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg2 & 0x1) == 1) {
			int var6 = arg5;
			arg5 = arg4;
			arg4 = var6;
		}

		arg3 &= 0x3;
		if (arg3 == 0) {
			return arg1;
		}

		if (arg3 == 1) {
			return 7 + 1 - arg0 - arg5;
		}

		if (arg3 == 2) {
			return 7 + 1 - arg1 - arg4;
		}

		return arg0;
	}
}
