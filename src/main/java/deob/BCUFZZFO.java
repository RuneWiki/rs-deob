package deob;

@ObfuscatedName("BCUFZZFO")
public class BCUFZZFO {

	@ObfuscatedName("BCUFZZFO.g")
	public boolean field32 = false;

	@ObfuscatedName("BCUFZZFO.h")
	public int field33 = -1;

	@ObfuscatedName("BCUFZZFO.j")
	public boolean field35 = true;

	@ObfuscatedName("BCUFZZFO.a")
	public static int field26;

	@ObfuscatedName("BCUFZZFO.d")
	public int field29;

	@ObfuscatedName("BCUFZZFO.e")
	public int field30;

	@ObfuscatedName("BCUFZZFO.f")
	public int field31;

	@ObfuscatedName("BCUFZZFO.i")
	public int field34;

	@ObfuscatedName("BCUFZZFO.c")
	public String field28;

	@ObfuscatedName("BCUFZZFO.b")
	public static BCUFZZFO[] field27;

	@ObfuscatedName("BCUFZZFO.a(ILTXPLZUUI;)V")
	public static void method6(TXPLZUUI arg0) {
		PKHWFJLM var1 = new PKHWFJLM(arg0.method506("varbit.dat", null));
		field26 = var1.method332();
		if (field27 == null) {
			field27 = new BCUFZZFO[field26];
		}

		for (int var2 = 0; var2 < field26; var2++) {
			if (field27[var2] == null) {
				field27[var2] = new BCUFZZFO();
			}

			field27[var2].method7(var2, var1);

			if (field27[var2].field32) {
				XESCWZPS.field1424[field27[var2].field29].field1436 = true;
			}
		}

		if (var1.field970.length != var1.field971) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("BCUFZZFO.a(ILPKHWFJLM;I)V")
	public void method7(int arg0, PKHWFJLM arg1) {
		while (true) {
			int var3 = arg1.method330();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field29 = arg1.method332();
				field30 = arg1.method330();
				field31 = arg1.method330();
			} else if (var3 == 10) {
				field28 = arg1.method337();
			} else if (var3 == 2) {
				field32 = true;
			} else if (var3 == 3) {
				field33 = arg1.method335();
			} else if (var3 == 4) {
				field34 = arg1.method335();
			} else if (var3 == 5) {
				field35 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
