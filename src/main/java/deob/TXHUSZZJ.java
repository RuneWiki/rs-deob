package deob;

@ObfuscatedName("TXHUSZZJ")
public class TXHUSZZJ {

	@ObfuscatedName("TXHUSZZJ.a(IIIZ)I")
	public static int method519(int arg0, int arg1, int arg2) {
		arg0 &= 0x3;
		if (arg0 == 0) {
			return arg1;
		}

		if (arg0 == 1) {
			return arg2;
		}

		if (arg0 == 2) {
			return 7 - arg1;
		}

		return 7 - arg2;
	}

	@ObfuscatedName("TXHUSZZJ.a(IIII)I")
	public static int method520(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("TXHUSZZJ.a(IIIIIII)I")
	public static int method521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg0 & 0x1) == 1) {
			int var6 = arg3;
			arg3 = arg2;
			arg2 = var6;
		}

		arg4 &= 0x3;
		if (arg4 == 0) {
			return arg5;
		}

		if (arg4 == 1) {
			return arg1;
		}

		if (arg4 == 2) {
			return 7 + 1 - arg5 - arg3;
		}

		return 7 + 1 - arg1 - arg2;
	}

	@ObfuscatedName("TXHUSZZJ.a(IIZIIII)I")
	public static int method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg4 & 0x1) == 1) {
			int var6 = arg0;
			arg0 = arg2;
			arg2 = var6;
		}

		arg1 &= 0x3;
		if (arg1 == 0) {
			return arg5;
		}

		if (arg1 == 1) {
			return 7 + 1 - arg3 - arg0;
		}

		if (arg1 == 2) {
			return 7 + 1 - arg5 - arg2;
		}

		return arg3;
	}
}
