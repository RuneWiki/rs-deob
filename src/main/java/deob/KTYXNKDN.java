package deob;

@ObfuscatedName("KTYXNKDN")
public class KTYXNKDN {

	@ObfuscatedName("KTYXNKDN.a(IZII)I")
	public static int method269(int arg0, int arg1, int arg2) {
		arg0 &= 0x3;
		if (arg0 == 0) {
			return arg2;
		}

		if (arg0 == 1) {
			return arg1;
		}

		if (arg0 == 2) {
			return 7 - arg2;
		}

		return 7 - arg1;
	}

	@ObfuscatedName("KTYXNKDN.a(IIII)I")
	public static int method270(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("KTYXNKDN.a(IIIZIII)I")
	public static int method271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg4 & 0x1) == 1) {
			int var6 = arg1;
			arg1 = arg5;
			arg5 = var6;
		}

		arg0 &= 0x3;
		if (arg0 == 0) {
			return arg3;
		}

		if (arg0 == 1) {
			return arg2;
		}

		if (arg0 == 2) {
			return 7 + 1 - arg3 - arg1;
		}

		return 7 + 1 - arg2 - arg5;
	}

	@ObfuscatedName("KTYXNKDN.b(IIIZIII)I")
	public static int method272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg3 & 0x1) == 1) {
			int var6 = arg0;
			arg0 = arg2;
			arg2 = var6;
		}

		arg4 &= 0x3;
		if (arg4 == 0) {
			return arg1;
		}

		if (arg4 == 1) {
			return 7 + 1 - arg5 - arg0;
		}

		if (arg4 == 2) {
			return 7 + 1 - arg1 - arg2;
		}

		return arg5;
	}
}
