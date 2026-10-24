package deob;

@ObfuscatedName("RHHZDAUG")
public class RHHZDAUG {

	@ObfuscatedName("RHHZDAUG.a(IIII)I")
	public static int method439(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("RHHZDAUG.b(IIII)I")
	public static int method440(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("RHHZDAUG.a(IIIIIZI)I")
	public static int method441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg3 & 0x1) == 1) {
			int var6 = arg5;
			arg5 = arg4;
			arg4 = var6;
		}

		arg0 &= 0x3;
		if (arg0 == 0) {
			return arg2;
		}

		if (arg0 == 1) {
			return arg1;
		}

		if (arg0 == 2) {
			return 7 + 1 - arg2 - arg5;
		}

		return 7 + 1 - arg1 - arg4;
	}

	@ObfuscatedName("RHHZDAUG.a(IIIIIII)I")
	public static int method442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg1 & 0x1) == 1) {
			int var6 = arg4;
			arg4 = arg0;
			arg0 = var6;
		}

		arg2 &= 0x3;
		if (arg2 == 0) {
			return arg5;
		}

		if (arg2 == 1) {
			return 7 + 1 - arg3 - arg4;
		}

		if (arg2 == 2) {
			return 7 + 1 - arg5 - arg0;
		}

		return arg3;
	}
}
