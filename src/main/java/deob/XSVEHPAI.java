package deob;

@ObfuscatedName("XSVEHPAI")
public class XSVEHPAI {

	@ObfuscatedName("XSVEHPAI.a(IIBI)I")
	public static int method584(int arg0, int arg1, int arg2) {
		arg1 &= 0x3;
		if (arg1 == 0) {
			return arg2;
		}

		if (arg1 == 1) {
			return arg0;
		}

		if (arg1 == 2) {
			return 7 - arg2;
		}

		return 7 - arg0;
	}

	@ObfuscatedName("XSVEHPAI.a(IIII)I")
	public static int method585(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("XSVEHPAI.a(IIIIIII)I")
	public static int method586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg4 & 0x1) == 1) {
			int var6 = arg1;
			arg1 = arg3;
			arg3 = var6;
		}

		arg2 &= 0x3;
		if (arg2 == 0) {
			return arg0;
		}

		if (arg2 == 1) {
			return arg5;
		}

		if (arg2 == 2) {
			return 7 + 1 - arg0 - arg1;
		}

		return 7 + 1 - arg5 - arg3;
	}

	@ObfuscatedName("XSVEHPAI.a(ZIIIIII)I")
	public static int method587(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
