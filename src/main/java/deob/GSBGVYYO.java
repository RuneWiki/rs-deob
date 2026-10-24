package deob;

@ObfuscatedName("GSBGVYYO")
public class GSBGVYYO {

	@ObfuscatedName("GSBGVYYO.a(IIII)I")
	public static int method224(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("GSBGVYYO.a(IIZI)I")
	public static int method225(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("GSBGVYYO.a(IIIIIII)I")
	public static int method226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg1 & 0x1) == 1) {
			int var6 = arg2;
			arg2 = arg5;
			arg5 = var6;
		}

		arg4 &= 0x3;
		if (arg4 == 0) {
			return arg3;
		}

		if (arg4 == 1) {
			return arg0;
		}

		if (arg4 == 2) {
			return 7 + 1 - arg3 - arg2;
		}

		return 7 + 1 - arg0 - arg5;
	}

	@ObfuscatedName("GSBGVYYO.b(IIIIIII)I")
	public static int method227(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg5 & 0x1) == 1) {
			int var6 = arg0;
			arg0 = arg1;
			arg1 = var6;
		}

		arg4 &= 0x3;
		if (arg4 == 0) {
			return arg2;
		}

		if (arg4 == 1) {
			return 7 + 1 - arg3 - arg0;
		}

		if (arg4 == 2) {
			return 7 + 1 - arg2 - arg1;
		}

		return arg3;
	}
}
