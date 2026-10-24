package deob;

@ObfuscatedName("KFSVUSRG")
public class KFSVUSRG {

	@ObfuscatedName("KFSVUSRG.a(IIII)I")
	public static int method312(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("KFSVUSRG.a(IZII)I")
	public static int method313(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("KFSVUSRG.a(IIIIIBI)I")
	public static int method314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg0 & 0x1) == 1) {
			int var6 = arg2;
			arg2 = arg5;
			arg5 = var6;
		}

		arg4 &= 0x3;
		if (arg4 == 0) {
			return arg1;
		}

		if (arg4 == 1) {
			return arg3;
		}

		if (arg4 == 2) {
			return 7 + 1 - arg1 - arg2;
		}

		return 7 + 1 - arg3 - arg5;
	}

	@ObfuscatedName("KFSVUSRG.a(IIIIIII)I")
	public static int method315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg1 & 0x1) == 1) {
			int var6 = arg5;
			arg5 = arg3;
			arg3 = var6;
		}

		arg2 &= 0x3;
		if (arg2 == 0) {
			return arg0;
		}

		if (arg2 == 1) {
			return 7 + 1 - arg4 - arg5;
		}

		if (arg2 == 2) {
			return 7 + 1 - arg0 - arg3;
		}

		return arg4;
	}
}
