package deob;

@ObfuscatedName("GYWJXMKQ")
public class GYWJXMKQ {

	@ObfuscatedName("GYWJXMKQ.a(IIII)I")
	public static int method281(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("GYWJXMKQ.b(IIII)I")
	public static int method282(int arg0, int arg1, int arg2) {
		arg0 &= 0x3;
		if (arg0 == 0) {
			return arg2;
		}

		if (arg0 == 1) {
			return 7 - arg1;
		}

		if (arg0 == 2) {
			return 7 - arg2;
		}

		return arg1;
	}

	@ObfuscatedName("GYWJXMKQ.a(IIZIII)I")
	public static int method283(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg0 &= 0x3;
		if (arg0 == 0) {
			return arg4;
		}

		if (arg0 == 1) {
			return arg2;
		}

		if (arg0 == 2) {
			return 7 + 1 - arg4 - arg3;
		}

		return 7 + 1 - arg2 - arg1;
	}

	@ObfuscatedName("GYWJXMKQ.a(IIIIII)I")
	public static int method284(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg4 &= 0x3;
		if (arg4 == 0) {
			return arg3;
		}

		if (arg4 == 1) {
			return 7 + 1 - arg0 - arg2;
		}

		if (arg4 == 2) {
			return 7 + 1 - arg3 - arg1;
		}

		return arg0;
	}
}
