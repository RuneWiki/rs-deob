package deob;

@ObfuscatedName("YFQBSABU")
public class YFQBSABU {

	@ObfuscatedName("YFQBSABU.a(ZIII)I")
	public static int method537(int arg0, int arg1, int arg2) {
		arg0 &= 0x3;
		if (arg0 == 0) {
			return arg1;
		}

		if (arg0 == 1) {
			return arg2;
		}

		if (arg0 == 2) {
			return 7 - arg1;
		}

		return 7 - arg2;
	}

	@ObfuscatedName("YFQBSABU.a(IIIB)I")
	public static int method538(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("YFQBSABU.a(IIIBIII)I")
	public static int method539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg0 & 0x1) == 1) {
			int var6 = arg1;
			arg1 = arg5;
			arg5 = var6;
		}

		arg3 &= 0x3;
		if (arg3 == 0) {
			return arg4;
		}

		if (arg3 == 1) {
			return arg2;
		}

		if (arg3 == 2) {
			return 7 + 1 - arg4 - arg1;
		}

		return 7 + 1 - arg2 - arg5;
	}

	@ObfuscatedName("YFQBSABU.a(IIIIIII)I")
	public static int method540(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg4 & 0x1) == 1) {
			int var6 = arg5;
			arg5 = arg3;
			arg3 = var6;
		}

		arg0 &= 0x3;
		if (arg0 == 0) {
			return arg2;
		}

		if (arg0 == 1) {
			return 7 + 1 - arg1 - arg5;
		}

		if (arg0 == 2) {
			return 7 + 1 - arg2 - arg3;
		}

		return arg1;
	}
}
