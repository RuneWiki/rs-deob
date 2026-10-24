package deob;

@ObfuscatedName("PTKBILNJ")
public class PTKBILNJ {

	@ObfuscatedName("PTKBILNJ.h")
	public int field1065 = -1;

	@ObfuscatedName("PTKBILNJ.j")
	public int[] field1067 = new int[6];

	@ObfuscatedName("PTKBILNJ.k")
	public int[] field1068 = new int[6];

	@ObfuscatedName("PTKBILNJ.l")
	public int[] field1069 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("PTKBILNJ.m")
	public boolean field1070 = false;

	@ObfuscatedName("PTKBILNJ.f")
	public static int field1063;

	@ObfuscatedName("PTKBILNJ.i")
	public int[] field1066;

	@ObfuscatedName("PTKBILNJ.g")
	public static PTKBILNJ[] field1064;

	@ObfuscatedName("PTKBILNJ.a(ILTXPLZUUI;)V")
	public static void method436(TXPLZUUI arg0) {
		PKHWFJLM var1 = new PKHWFJLM(arg0.method506("idk.dat", null));
		field1063 = var1.method332();
		if (field1064 == null) {
			field1064 = new PTKBILNJ[field1063];
		}

		for (int var2 = 0; var2 < field1063; var2++) {
			if (field1064[var2] == null) {
				field1064[var2] = new PTKBILNJ();
			}

			field1064[var2].method437(var1);
		}
	}

	@ObfuscatedName("PTKBILNJ.a(LPKHWFJLM;Z)V")
	public void method437(PKHWFJLM arg0) {
		while (true) {
			int var2 = arg0.method330();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1065 = arg0.method330();
			} else if (var2 == 2) {
				int var3 = arg0.method330();
				field1066 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1066[var4] = arg0.method332();
				}
			} else if (var2 == 3) {
				field1070 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field1067[var2 - 40] = arg0.method332();
			} else if (var2 >= 50 && var2 < 60) {
				field1068[var2 - 50] = arg0.method332();
			} else if (var2 >= 60 && var2 < 70) {
				field1069[var2 - 60] = arg0.method332();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("PTKBILNJ.a(B)Z")
	public boolean method438() {
		if (field1066 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1066.length; var2++) {
			if (!PSGMMDJS.method411(field1066[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("PTKBILNJ.a(I)LPSGMMDJS;")
	public PSGMMDJS method439() {
		if (field1066 == null) {
			return null;
		}

		PSGMMDJS[] var1 = new PSGMMDJS[field1066.length];
		for (int var2 = 0; var2 < field1066.length; var2++) {
			var1[var2] = PSGMMDJS.method410(field1066[var2]);
		}

		PSGMMDJS var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new PSGMMDJS(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field1067[var4] != 0; var4++) {
			var3.method424(field1067[var4], field1068[var4]);
		}

		return var3;
	}

	@ObfuscatedName("PTKBILNJ.b(I)Z")
	public boolean method440() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field1069[var2] != -1 && !PSGMMDJS.method411(field1069[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("PTKBILNJ.b(B)LPSGMMDJS;")
	public PSGMMDJS method441() {
		PSGMMDJS[] var1 = new PSGMMDJS[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field1069[var3] != -1) {
				var1[var2++] = PSGMMDJS.method410(field1069[var3]);
			}
		}

		PSGMMDJS var4 = new PSGMMDJS(var2, var1);
		for (int var5 = 0; var5 < 6 && field1067[var5] != 0; var5++) {
			var4.method424(field1067[var5], field1068[var5]);
		}

		return var4;
	}
}
