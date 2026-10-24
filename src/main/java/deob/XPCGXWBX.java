package deob;

@ObfuscatedName("XPCGXWBX")
public class XPCGXWBX {

	@ObfuscatedName("XPCGXWBX.a(IBII)I")
	public static int method553(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("XPCGXWBX.a(IIII)I")
	public static int method554(int arg0, int arg1, int arg2) {
		arg2 &= 0x3;
		if (arg2 == 0) {
			return arg0;
		}

		if (arg2 == 1) {
			return 7 - arg1;
		}

		if (arg2 == 2) {
			return 7 - arg0;
		}

		return arg1;
	}

	@ObfuscatedName("XPCGXWBX.a(IIIIIII)I")
	public static int method555(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg0 & 0x1) == 1) {
			int var6 = arg5;
			arg5 = arg4;
			arg4 = var6;
		}

		arg3 &= 0x3;
		if (arg3 == 0) {
			return arg1;
		}

		if (arg3 == 1) {
			return arg2;
		}

		if (arg3 == 2) {
			return 7 + 1 - arg1 - arg5;
		}

		return 7 + 1 - arg2 - arg4;
	}

	@ObfuscatedName("XPCGXWBX.b(IIIIIII)I")
	public static int method556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg4 & 0x1) == 1) {
			int var6 = arg2;
			arg2 = arg5;
			arg5 = var6;
		}

		arg3 &= 0x3;
		if (arg3 == 0) {
			return arg1;
		}

		if (arg3 == 1) {
			return 7 + 1 - arg0 - arg2;
		}

		if (arg3 == 2) {
			return 7 + 1 - arg1 - arg5;
		}

		return arg0;
	}
}
