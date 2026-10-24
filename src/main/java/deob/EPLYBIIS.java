package deob;

@ObfuscatedName("EPLYBIIS")
public class EPLYBIIS {

	@ObfuscatedName("EPLYBIIS.a(IIBI)I")
	public static int method203(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("EPLYBIIS.a(IIZI)I")
	public static int method204(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("EPLYBIIS.a(IIIIIII)I")
	public static int method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg2 & 0x1) == 1) {
			int var6 = arg5;
			arg5 = arg1;
			arg1 = var6;
		}

		arg4 &= 0x3;
		if (arg4 == 0) {
			return arg0;
		}

		if (arg4 == 1) {
			return arg3;
		}

		if (arg4 == 2) {
			return 7 + 1 - arg0 - arg5;
		}

		return 7 + 1 - arg3 - arg1;
	}

	@ObfuscatedName("EPLYBIIS.b(IIIIIII)I")
	public static int method206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg5 & 0x1) == 1) {
			int var6 = arg4;
			arg4 = arg0;
			arg0 = var6;
		}

		arg3 &= 0x3;
		if (arg3 == 0) {
			return arg2;
		}

		if (arg3 == 1) {
			return 7 + 1 - arg1 - arg4;
		}

		if (arg3 == 2) {
			return 7 + 1 - arg2 - arg0;
		}

		return arg1;
	}
}
