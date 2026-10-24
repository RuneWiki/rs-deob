package deob;

@ObfuscatedName("OWCLRNAL")
public class OWCLRNAL {

	@ObfuscatedName("OWCLRNAL.a(BIII)I")
	public static int method459(int arg0, int arg1, int arg2) {
		arg0 &= 0x3;
		if (arg0 == 0) {
			return arg2;
		}

		if (arg0 == 1) {
			return arg1;
		}

		if (arg0 == 2) {
			return 7 - arg2;
		}

		return 7 - arg1;
	}

	@ObfuscatedName("OWCLRNAL.a(IZII)I")
	public static int method460(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("OWCLRNAL.a(IIIIIIZ)I")
	public static int method461(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg1 & 0x1) == 1) {
			int var6 = arg3;
			arg3 = arg2;
			arg2 = var6;
		}

		arg4 &= 0x3;
		if (arg4 == 0) {
			return arg5;
		}

		if (arg4 == 1) {
			return arg0;
		}

		if (arg4 == 2) {
			return 7 + 1 - arg5 - arg3;
		}

		return 7 + 1 - arg0 - arg2;
	}

	@ObfuscatedName("OWCLRNAL.a(IIIIIII)I")
	public static int method462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg4 & 0x1) == 1) {
			int var6 = arg1;
			arg1 = arg0;
			arg0 = var6;
		}

		arg2 &= 0x3;
		if (arg2 == 0) {
			return arg5;
		}

		if (arg2 == 1) {
			return 7 + 1 - arg3 - arg1;
		}

		if (arg2 == 2) {
			return 7 + 1 - arg5 - arg0;
		}

		return arg3;
	}
}
