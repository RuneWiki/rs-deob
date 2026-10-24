package deob;

@ObfuscatedName("QMJXCCWI")
public class QMJXCCWI {

	@ObfuscatedName("QMJXCCWI.a(IZII)I")
	public static int method426(int arg0, int arg1, int arg2) {
		arg1 &= 0x3;
		if (arg1 == 0) {
			return arg0;
		}

		if (arg1 == 1) {
			return arg2;
		}

		if (arg1 == 2) {
			return 7 - arg0;
		}

		return 7 - arg2;
	}

	@ObfuscatedName("QMJXCCWI.a(IIII)I")
	public static int method427(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("QMJXCCWI.a(IIIIIII)I")
	public static int method428(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg5 & 0x1) == 1) {
			int var6 = arg3;
			arg3 = arg2;
			arg2 = var6;
		}

		arg0 &= 0x3;
		if (arg0 == 0) {
			return arg1;
		}

		if (arg0 == 1) {
			return arg4;
		}

		if (arg0 == 2) {
			return 7 + 1 - arg1 - arg3;
		}

		return 7 + 1 - arg4 - arg2;
	}

	@ObfuscatedName("QMJXCCWI.b(IIIIIII)I")
	public static int method429(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
