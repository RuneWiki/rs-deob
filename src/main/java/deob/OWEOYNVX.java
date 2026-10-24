package deob;

@ObfuscatedName("OWEOYNVX")
public class OWEOYNVX {

	@ObfuscatedName("OWEOYNVX.a(IIII)I")
	public static int method363(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("OWEOYNVX.a(IIZI)I")
	public static int method364(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("OWEOYNVX.a(IIIIIII)I")
	public static int method365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg3 & 0x1) == 1) {
			int var6 = arg5;
			arg5 = arg1;
			arg1 = var6;
		}

		arg4 &= 0x3;
		if (arg4 == 0) {
			return arg0;
		}

		if (arg4 == 1) {
			return arg2;
		}

		if (arg4 == 2) {
			return 7 + 1 - arg0 - arg5;
		}

		return 7 + 1 - arg2 - arg1;
	}

	@ObfuscatedName("OWEOYNVX.a(IIIIIZI)I")
	public static int method366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg4 & 0x1) == 1) {
			int var6 = arg3;
			arg3 = arg0;
			arg0 = var6;
		}

		arg1 &= 0x3;
		if (arg1 == 0) {
			return arg5;
		}

		if (arg1 == 1) {
			return 7 + 1 - arg2 - arg3;
		}

		if (arg1 == 2) {
			return 7 + 1 - arg5 - arg0;
		}

		return arg2;
	}
}
