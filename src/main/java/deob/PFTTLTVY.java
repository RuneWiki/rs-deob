package deob;

@ObfuscatedName("PFTTLTVY")
public class PFTTLTVY {

	@ObfuscatedName("PFTTLTVY.a(IIII)I")
	public static int method408(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("PFTTLTVY.a(IIZI)I")
	public static int method409(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("PFTTLTVY.a(IIIIIBI)I")
	public static int method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg0 & 0x1) == 1) {
			int var6 = arg1;
			arg1 = arg3;
			arg3 = var6;
		}

		arg5 &= 0x3;
		if (arg5 == 0) {
			return arg4;
		}

		if (arg5 == 1) {
			return arg2;
		}

		if (arg5 == 2) {
			return 7 + 1 - arg4 - arg1;
		}

		return 7 + 1 - arg2 - arg3;
	}

	@ObfuscatedName("PFTTLTVY.a(ZIIIIII)I")
	public static int method411(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg2 & 0x1) == 1) {
			int var6 = arg3;
			arg3 = arg5;
			arg5 = var6;
		}

		arg0 &= 0x3;
		if (arg0 == 0) {
			return arg1;
		}

		if (arg0 == 1) {
			return 7 + 1 - arg4 - arg3;
		}

		if (arg0 == 2) {
			return 7 + 1 - arg1 - arg5;
		}

		return arg4;
	}
}
