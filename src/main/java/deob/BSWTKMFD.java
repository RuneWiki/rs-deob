package deob;

@ObfuscatedName("BSWTKMFD")
public class BSWTKMFD {

	@ObfuscatedName("BSWTKMFD.a(IIII)I")
	public static int method41(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("BSWTKMFD.a(ZIII)I")
	public static int method42(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("BSWTKMFD.a(IIIIIII)I")
	public static int method43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg4 & 0x1) == 1) {
			int var6 = arg1;
			arg1 = arg3;
			arg3 = var6;
		}

		arg5 &= 0x3;
		if (arg5 == 0) {
			return arg0;
		}

		if (arg5 == 1) {
			return arg2;
		}

		if (arg5 == 2) {
			return 7 + 1 - arg0 - arg1;
		}

		return 7 + 1 - arg2 - arg3;
	}

	@ObfuscatedName("BSWTKMFD.b(IIIIIII)I")
	public static int method44(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg4 & 0x1) == 1) {
			int var6 = arg5;
			arg5 = arg1;
			arg1 = var6;
		}

		arg2 &= 0x3;
		if (arg2 == 0) {
			return arg3;
		}

		if (arg2 == 1) {
			return 7 + 1 - arg0 - arg5;
		}

		if (arg2 == 2) {
			return 7 + 1 - arg3 - arg1;
		}

		return arg0;
	}
}
