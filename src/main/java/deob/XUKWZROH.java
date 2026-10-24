package deob;

@ObfuscatedName("XUKWZROH")
public class XUKWZROH {

	@ObfuscatedName("XUKWZROH.a(IIII)I")
	public static int method591(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("XUKWZROH.b(IIII)I")
	public static int method592(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("XUKWZROH.a(IIIIIII)I")
	public static int method593(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg0 & 0x1) == 1) {
			int var6 = arg4;
			arg4 = arg1;
			arg1 = var6;
		}

		arg2 &= 0x3;
		if (arg2 == 0) {
			return arg5;
		}

		if (arg2 == 1) {
			return arg3;
		}

		if (arg2 == 2) {
			return 7 + 1 - arg5 - arg4;
		}

		return 7 + 1 - arg3 - arg1;
	}

	@ObfuscatedName("XUKWZROH.a(IIIIIZI)I")
	public static int method594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg1 & 0x1) == 1) {
			int var6 = arg0;
			arg0 = arg5;
			arg5 = var6;
		}

		arg2 &= 0x3;
		if (arg2 == 0) {
			return arg3;
		}

		if (arg2 == 1) {
			return 7 + 1 - arg4 - arg0;
		}

		if (arg2 == 2) {
			return 7 + 1 - arg3 - arg5;
		}

		return arg4;
	}
}
