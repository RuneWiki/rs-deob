package deob;

@ObfuscatedName("EGPGCXBS")
public class EGPGCXBS {

	@ObfuscatedName("EGPGCXBS.a(IBII)I")
	public static int method219(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("EGPGCXBS.a(IIII)I")
	public static int method220(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("EGPGCXBS.a(IIIIII)I")
	public static int method221(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg0 &= 0x3;
		if (arg0 == 0) {
			return arg2;
		}

		if (arg0 == 1) {
			return arg4;
		}

		if (arg0 == 2) {
			return 7 + 1 - arg2 - arg1;
		}

		return 7 + 1 - arg4 - arg3;
	}

	@ObfuscatedName("EGPGCXBS.a(IIZIII)I")
	public static int method222(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg2 &= 0x3;
		if (arg2 == 0) {
			return arg4;
		}

		if (arg2 == 1) {
			return 7 + 1 - arg1 - arg3;
		}

		if (arg2 == 2) {
			return 7 + 1 - arg4 - arg0;
		}

		return arg1;
	}
}
