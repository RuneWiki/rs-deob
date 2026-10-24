package deob;

@ObfuscatedName("KTWDNTZZ")
public class KTWDNTZZ {

	@ObfuscatedName("KTWDNTZZ.a(IIIB)I")
	public static int method353(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("KTWDNTZZ.a(IIII)I")
	public static int method354(int arg0, int arg1, int arg2) {
		arg1 &= 0x3;
		if (arg1 == 0) {
			return arg2;
		}

		if (arg1 == 1) {
			return 7 - arg0;
		}

		if (arg1 == 2) {
			return 7 - arg2;
		}

		return arg0;
	}

	@ObfuscatedName("KTWDNTZZ.a(IIIIIII)I")
	public static int method355(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg5 & 0x1) == 1) {
			int var6 = arg4;
			arg4 = arg1;
			arg1 = var6;
		}

		arg3 &= 0x3;
		if (arg3 == 0) {
			return arg0;
		}

		if (arg3 == 1) {
			return arg2;
		}

		if (arg3 == 2) {
			return 7 + 1 - arg0 - arg4;
		}

		return 7 + 1 - arg2 - arg1;
	}

	@ObfuscatedName("KTWDNTZZ.b(IIIIIII)I")
	public static int method356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg2 & 0x1) == 1) {
			int var6 = arg5;
			arg5 = arg4;
			arg4 = var6;
		}

		arg0 &= 0x3;
		if (arg0 == 0) {
			return arg1;
		}

		if (arg0 == 1) {
			return 7 + 1 - arg3 - arg5;
		}

		if (arg0 == 2) {
			return 7 + 1 - arg1 - arg4;
		}

		return arg3;
	}
}
