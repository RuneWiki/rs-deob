package deob;

@ObfuscatedName("MWBCSNDC")
public class MWBCSNDC {

	@ObfuscatedName("MWBCSNDC.a(IIII)I")
	public static int method344(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("MWBCSNDC.b(IIII)I")
	public static int method345(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("MWBCSNDC.a(IIZIIII)I")
	public static int method346(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg4 & 0x1) == 1) {
			int var6 = arg1;
			arg1 = arg3;
			arg3 = var6;
		}

		arg2 &= 0x3;
		if (arg2 == 0) {
			return arg5;
		}

		if (arg2 == 1) {
			return arg0;
		}

		if (arg2 == 2) {
			return 7 + 1 - arg5 - arg1;
		}

		return 7 + 1 - arg0 - arg3;
	}

	@ObfuscatedName("MWBCSNDC.a(IIBIIII)I")
	public static int method347(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg3 & 0x1) == 1) {
			int var6 = arg0;
			arg0 = arg5;
			arg5 = var6;
		}

		arg2 &= 0x3;
		if (arg2 == 0) {
			return arg4;
		}

		if (arg2 == 1) {
			return 7 + 1 - arg1 - arg0;
		}

		if (arg2 == 2) {
			return 7 + 1 - arg4 - arg5;
		}

		return arg1;
	}
}
