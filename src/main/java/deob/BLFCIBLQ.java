package deob;

@ObfuscatedName("BLFCIBLQ")
public class BLFCIBLQ {

	@ObfuscatedName("BLFCIBLQ.g")
	public int field68 = -1;

	@ObfuscatedName("BLFCIBLQ.i")
	public int[] field70 = new int[6];

	@ObfuscatedName("BLFCIBLQ.j")
	public int[] field71 = new int[6];

	@ObfuscatedName("BLFCIBLQ.k")
	public int[] field72 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("BLFCIBLQ.l")
	public boolean field73 = false;

	@ObfuscatedName("BLFCIBLQ.e")
	public static int field66;

	@ObfuscatedName("BLFCIBLQ.h")
	public int[] field69;

	@ObfuscatedName("BLFCIBLQ.f")
	public static BLFCIBLQ[] field67;

	@ObfuscatedName("BLFCIBLQ.a(ZLMJLXHQTQ;)V")
	public static void method17(MJLXHQTQ arg0) {
		XGRGMPUQ var1 = new XGRGMPUQ(arg0.method317("idk.dat", null));
		field66 = var1.method467();
		if (field67 == null) {
			field67 = new BLFCIBLQ[field66];
		}

		for (int var2 = 0; var2 < field66; var2++) {
			if (field67[var2] == null) {
				field67[var2] = new BLFCIBLQ();
			}

			field67[var2].method18(var1);
		}
	}

	@ObfuscatedName("BLFCIBLQ.a(ZLXGRGMPUQ;)V")
	public void method18(XGRGMPUQ arg0) {
		while (true) {
			int var2 = arg0.method465();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field68 = arg0.method465();
			} else if (var2 == 2) {
				int var3 = arg0.method465();
				field69 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field69[var4] = arg0.method467();
				}
			} else if (var2 == 3) {
				field73 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field70[var2 - 40] = arg0.method467();
			} else if (var2 >= 50 && var2 < 60) {
				field71[var2 - 50] = arg0.method467();
			} else if (var2 >= 60 && var2 < 70) {
				field72[var2 - 60] = arg0.method467();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("BLFCIBLQ.a(I)Z")
	public boolean method19() {
		if (field69 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field69.length; var2++) {
			if (!VYUQHOMO.method408(field69[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("BLFCIBLQ.a(B)LVYUQHOMO;")
	public VYUQHOMO method20() {
		if (field69 == null) {
			return null;
		}

		VYUQHOMO[] var1 = new VYUQHOMO[field69.length];
		for (int var2 = 0; var2 < field69.length; var2++) {
			var1[var2] = VYUQHOMO.method407(field69[var2]);
		}

		VYUQHOMO var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new VYUQHOMO(var1, var1.length);
		}

		for (int var4 = 0; var4 < 6 && field70[var4] != 0; var4++) {
			var3.method421(field70[var4], field71[var4]);
		}

		return var3;
	}

	@ObfuscatedName("BLFCIBLQ.b(I)Z")
	public boolean method21() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field72[var2] != -1 && !VYUQHOMO.method408(field72[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("BLFCIBLQ.b(B)LVYUQHOMO;")
	public VYUQHOMO method22() {
		VYUQHOMO[] var1 = new VYUQHOMO[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field72[var3] != -1) {
				var1[var2++] = VYUQHOMO.method407(field72[var3]);
			}
		}

		VYUQHOMO var4 = new VYUQHOMO(var1, var2);
		for (int var5 = 0; var5 < 6 && field70[var5] != 0; var5++) {
			var4.method421(field70[var5], field71[var5]);
		}

		return var4;
	}
}
