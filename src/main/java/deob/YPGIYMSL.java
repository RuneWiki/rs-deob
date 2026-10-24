package deob;

@ObfuscatedName("YPGIYMSL")
public class YPGIYMSL {

	@ObfuscatedName("YPGIYMSL.a(IZII)I")
	public static int method575(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("YPGIYMSL.b(IZII)I")
	public static int method576(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("YPGIYMSL.a(IIIIIII)I")
	public static int method577(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

	@ObfuscatedName("YPGIYMSL.a(IZIIIII)I")
	public static int method578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg4 & 0x1) == 1) {
			int var6 = arg5;
			arg5 = arg2;
			arg2 = var6;
		}

		arg0 &= 0x3;
		if (arg0 == 0) {
			return arg1;
		}

		if (arg0 == 1) {
			return 7 + 1 - arg3 - arg5;
		}

		if (arg0 == 2) {
			return 7 + 1 - arg1 - arg2;
		}

		return arg3;
	}
}
