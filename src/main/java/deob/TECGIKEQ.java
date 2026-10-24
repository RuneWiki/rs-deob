package deob;

@ObfuscatedName("TECGIKEQ")
public class TECGIKEQ {

	@ObfuscatedName("TECGIKEQ.a(IIII)I")
	public static int method502(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("TECGIKEQ.a(IIBI)I")
	public static int method503(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("TECGIKEQ.a(IBIIIII)I")
	public static int method504(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg1 & 0x1) == 1) {
			int var6 = arg4;
			arg4 = arg2;
			arg2 = var6;
		}

		arg5 &= 0x3;
		if (arg5 == 0) {
			return arg0;
		}

		if (arg5 == 1) {
			return arg3;
		}

		if (arg5 == 2) {
			return 7 + 1 - arg0 - arg4;
		}

		return 7 + 1 - arg3 - arg2;
	}

	@ObfuscatedName("TECGIKEQ.a(IIIIIII)I")
	public static int method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg1 & 0x1) == 1) {
			int var6 = arg5;
			arg5 = arg4;
			arg4 = var6;
		}

		arg3 &= 0x3;
		if (arg3 == 0) {
			return arg2;
		}

		if (arg3 == 1) {
			return 7 + 1 - arg0 - arg5;
		}

		if (arg3 == 2) {
			return 7 + 1 - arg2 - arg4;
		}

		return arg0;
	}
}
