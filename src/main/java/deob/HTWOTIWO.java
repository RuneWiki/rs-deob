package deob;

@ObfuscatedName("HTWOTIWO")
public class HTWOTIWO {

	@ObfuscatedName("HTWOTIWO.h")
	public int field781 = -1;

	@ObfuscatedName("HTWOTIWO.j")
	public int[] field783 = new int[6];

	@ObfuscatedName("HTWOTIWO.k")
	public int[] field784 = new int[6];

	@ObfuscatedName("HTWOTIWO.l")
	public int field785 = 128;

	@ObfuscatedName("HTWOTIWO.m")
	public int field786 = 128;

	@ObfuscatedName("HTWOTIWO.q")
	public static WIUIWDML field790 = new WIUIWDML(30);

	@ObfuscatedName("HTWOTIWO.d")
	public static int field777;

	@ObfuscatedName("HTWOTIWO.f")
	public int field779;

	@ObfuscatedName("HTWOTIWO.g")
	public int field780;

	@ObfuscatedName("HTWOTIWO.n")
	public int field787;

	@ObfuscatedName("HTWOTIWO.o")
	public int field788;

	@ObfuscatedName("HTWOTIWO.p")
	public int field789;

	@ObfuscatedName("HTWOTIWO.i")
	public DWUJPTWU field782;

	@ObfuscatedName("HTWOTIWO.e")
	public static HTWOTIWO[] field778;

	@ObfuscatedName("HTWOTIWO.a(ILTXPLZUUI;)V")
	public static void method249(TXPLZUUI arg0) {
		PKHWFJLM var1 = new PKHWFJLM(arg0.method506("spotanim.dat", null));
		field777 = var1.method332();
		if (field778 == null) {
			field778 = new HTWOTIWO[field777];
		}

		for (int var2 = 0; var2 < field777; var2++) {
			if (field778[var2] == null) {
				field778[var2] = new HTWOTIWO();
			}

			field778[var2].field779 = var2;
			field778[var2].method250(var1);
		}
	}

	@ObfuscatedName("HTWOTIWO.a(LPKHWFJLM;Z)V")
	public void method250(PKHWFJLM arg0) {
		while (true) {
			int var2 = arg0.method330();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field780 = arg0.method332();
			} else if (var2 == 2) {
				field781 = arg0.method332();
				if (DWUJPTWU.field586 != null) {
					field782 = DWUJPTWU.field586[field781];
				}
			} else if (var2 == 4) {
				field785 = arg0.method332();
			} else if (var2 == 5) {
				field786 = arg0.method332();
			} else if (var2 == 6) {
				field787 = arg0.method332();
			} else if (var2 == 7) {
				field788 = arg0.method330();
			} else if (var2 == 8) {
				field789 = arg0.method330();
			} else if (var2 >= 40 && var2 < 50) {
				field783[var2 - 40] = arg0.method332();
			} else if (var2 >= 50 && var2 < 60) {
				field784[var2 - 50] = arg0.method332();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("HTWOTIWO.a()LPSGMMDJS;")
	public PSGMMDJS method251() {
		PSGMMDJS var1 = (PSGMMDJS) field790.method519(field779);
		if (var1 != null) {
			return var1;
		}

		PSGMMDJS var2 = PSGMMDJS.method410(field780);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field783[0] != 0) {
				var2.method424(field783[var3], field784[var3]);
			}
		}

		field790.method520(field779, var2);
		return var2;
	}
}
