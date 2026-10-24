package deob;

@ObfuscatedName("KZRWVGKU")
public class KZRWVGKU {

	@ObfuscatedName("KZRWVGKU.a(IIII)I")
	public static int method304(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("KZRWVGKU.b(IIII)I")
	public static int method305(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("KZRWVGKU.a(IIIIIII)I")
	public static int method306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg3 & 0x1) == 1) {
			int var6 = arg4;
			arg4 = arg2;
			arg2 = var6;
		}

		arg5 &= 0x3;
		if (arg5 == 0) {
			return arg1;
		}

		if (arg5 == 1) {
			return arg0;
		}

		if (arg5 == 2) {
			return 7 + 1 - arg1 - arg4;
		}

		return 7 + 1 - arg0 - arg2;
	}

	@ObfuscatedName("KZRWVGKU.b(IIIIIII)I")
	public static int method307(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg4 & 0x1) == 1) {
			int var6 = arg3;
			arg3 = arg0;
			arg0 = var6;
		}

		arg2 &= 0x3;
		if (arg2 == 0) {
			return arg1;
		}

		if (arg2 == 1) {
			return 7 + 1 - arg5 - arg3;
		}

		if (arg2 == 2) {
			return 7 + 1 - arg1 - arg0;
		}

		return arg5;
	}
}
