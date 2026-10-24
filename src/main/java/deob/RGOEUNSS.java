package deob;

@ObfuscatedName("RGOEUNSS")
public class RGOEUNSS {

	@ObfuscatedName("RGOEUNSS.a(IBII)I")
	public static int method491(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("RGOEUNSS.a(IIII)I")
	public static int method492(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("RGOEUNSS.a(IIIIIII)I")
	public static int method493(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg0 & 0x1) == 1) {
			int var6 = arg1;
			arg1 = arg4;
			arg4 = var6;
		}

		arg5 &= 0x3;
		if (arg5 == 0) {
			return arg2;
		}

		if (arg5 == 1) {
			return arg3;
		}

		if (arg5 == 2) {
			return 7 + 1 - arg2 - arg1;
		}

		return 7 + 1 - arg3 - arg4;
	}

	@ObfuscatedName("RGOEUNSS.a(ZIIIIII)I")
	public static int method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg4 & 0x1) == 1) {
			int var6 = arg2;
			arg2 = arg0;
			arg0 = var6;
		}

		arg1 &= 0x3;
		if (arg1 == 0) {
			return arg5;
		}

		if (arg1 == 1) {
			return 7 + 1 - arg3 - arg2;
		}

		if (arg1 == 2) {
			return 7 + 1 - arg5 - arg0;
		}

		return arg3;
	}
}
