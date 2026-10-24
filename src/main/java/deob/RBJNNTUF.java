package deob;

@ObfuscatedName("RBJNNTUF")
public class RBJNNTUF {

	@ObfuscatedName("RBJNNTUF.a(IIII)I")
	public static int method454(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("RBJNNTUF.a(IZII)I")
	public static int method455(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("RBJNNTUF.a(IIIIIBI)I")
	public static int method456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg4 & 0x1) == 1) {
			int var6 = arg1;
			arg1 = arg5;
			arg5 = var6;
		}

		arg2 &= 0x3;
		if (arg2 == 0) {
			return arg0;
		}

		if (arg2 == 1) {
			return arg3;
		}

		if (arg2 == 2) {
			return 7 + 1 - arg0 - arg1;
		}

		return 7 + 1 - arg3 - arg5;
	}

	@ObfuscatedName("RBJNNTUF.a(ZIIIIII)I")
	public static int method457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg4 & 0x1) == 1) {
			int var6 = arg1;
			arg1 = arg2;
			arg2 = var6;
		}

		arg0 &= 0x3;
		if (arg0 == 0) {
			return arg5;
		}

		if (arg0 == 1) {
			return 7 + 1 - arg3 - arg1;
		}

		if (arg0 == 2) {
			return 7 + 1 - arg5 - arg2;
		}

		return arg3;
	}
}
