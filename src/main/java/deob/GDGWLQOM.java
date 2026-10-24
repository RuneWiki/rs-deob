package deob;

@ObfuscatedName("GDGWLQOM")
public class GDGWLQOM {

	@ObfuscatedName("GDGWLQOM.a(IIII)I")
	public static int method333(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("GDGWLQOM.a(IIIZ)I")
	public static int method334(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("GDGWLQOM.a(IIIIII)I")
	public static int method335(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg3 &= 0x3;
		if (arg3 == 0) {
			return arg4;
		}

		if (arg3 == 1) {
			return arg2;
		}

		if (arg3 == 2) {
			return 7 + 1 - arg4 - arg0;
		}

		return 7 + 1 - arg2 - arg1;
	}

	@ObfuscatedName("GDGWLQOM.b(IIIIII)I")
	public static int method336(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg1 &= 0x3;
		if (arg1 == 0) {
			return arg4;
		}

		if (arg1 == 1) {
			return 7 + 1 - arg2 - arg0;
		}

		if (arg1 == 2) {
			return 7 + 1 - arg4 - arg3;
		}

		return arg2;
	}
}
