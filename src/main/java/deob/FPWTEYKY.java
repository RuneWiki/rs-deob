package deob;

@ObfuscatedName("FPWTEYKY")
public class FPWTEYKY {

	@ObfuscatedName("FPWTEYKY.a(IBII)I")
	public static int method259(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("FPWTEYKY.a(IIII)I")
	public static int method260(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("FPWTEYKY.a(IIIIIZI)I")
	public static int method261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg0 & 0x1) == 1) {
			int var6 = arg2;
			arg2 = arg5;
			arg5 = var6;
		}

		arg1 &= 0x3;
		if (arg1 == 0) {
			return arg3;
		}

		if (arg1 == 1) {
			return arg4;
		}

		if (arg1 == 2) {
			return 7 + 1 - arg3 - arg2;
		}

		return 7 + 1 - arg4 - arg5;
	}

	@ObfuscatedName("FPWTEYKY.a(IIIIBII)I")
	public static int method262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg3 & 0x1) == 1) {
			int var6 = arg5;
			arg5 = arg4;
			arg4 = var6;
		}

		arg2 &= 0x3;
		if (arg2 == 0) {
			return arg1;
		}

		if (arg2 == 1) {
			return 7 + 1 - arg0 - arg5;
		}

		if (arg2 == 2) {
			return 7 + 1 - arg1 - arg4;
		}

		return arg0;
	}
}
