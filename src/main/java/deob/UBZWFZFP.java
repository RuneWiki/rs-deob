package deob;

@ObfuscatedName("UBZWFZFP")
public class UBZWFZFP {

	@ObfuscatedName("UBZWFZFP.a(IIBI)I")
	public static int method500(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("UBZWFZFP.a(IIII)I")
	public static int method501(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("UBZWFZFP.a(IIIIIII)I")
	public static int method502(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg0 & 0x1) == 1) {
			int var6 = arg1;
			arg1 = arg4;
			arg4 = var6;
		}

		arg2 &= 0x3;
		if (arg2 == 0) {
			return arg5;
		}

		if (arg2 == 1) {
			return arg3;
		}

		if (arg2 == 2) {
			return 7 + 1 - arg5 - arg1;
		}

		return 7 + 1 - arg3 - arg4;
	}

	@ObfuscatedName("UBZWFZFP.b(IIIIIII)I")
	public static int method503(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg1 & 0x1) == 1) {
			int var6 = arg3;
			arg3 = arg4;
			arg4 = var6;
		}

		arg0 &= 0x3;
		if (arg0 == 0) {
			return arg5;
		}

		if (arg0 == 1) {
			return 7 + 1 - arg2 - arg3;
		}

		if (arg0 == 2) {
			return 7 + 1 - arg5 - arg4;
		}

		return arg2;
	}
}
