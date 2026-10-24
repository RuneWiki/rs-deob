package deob;

@ObfuscatedName("FPSNPMMW")
public class FPSNPMMW {

	@ObfuscatedName("FPSNPMMW.f")
	public int field644 = -1;

	@ObfuscatedName("FPSNPMMW.h")
	public int[] field646 = new int[6];

	@ObfuscatedName("FPSNPMMW.i")
	public int[] field647 = new int[6];

	@ObfuscatedName("FPSNPMMW.j")
	public int field648 = 128;

	@ObfuscatedName("FPSNPMMW.k")
	public int field649 = 128;

	@ObfuscatedName("FPSNPMMW.o")
	public static GOPFMRDJ field653 = new GOPFMRDJ(30);

	@ObfuscatedName("FPSNPMMW.b")
	public static int field640;

	@ObfuscatedName("FPSNPMMW.d")
	public int field642;

	@ObfuscatedName("FPSNPMMW.e")
	public int field643;

	@ObfuscatedName("FPSNPMMW.l")
	public int field650;

	@ObfuscatedName("FPSNPMMW.m")
	public int field651;

	@ObfuscatedName("FPSNPMMW.n")
	public int field652;

	@ObfuscatedName("FPSNPMMW.g")
	public HZCWGKOF field645;

	@ObfuscatedName("FPSNPMMW.c")
	public static FPSNPMMW[] field641;

	@ObfuscatedName("FPSNPMMW.a(ZLXMRRKSSB;)V")
	public static void method204(XMRRKSSB arg0) {
		XQPFGONL var1 = new XQPFGONL(arg0.method465("spotanim.dat", null));
		field640 = var1.method480();
		if (field641 == null) {
			field641 = new FPSNPMMW[field640];
		}

		for (int var2 = 0; var2 < field640; var2++) {
			if (field641[var2] == null) {
				field641[var2] = new FPSNPMMW();
			}

			field641[var2].field642 = var2;
			field641[var2].method205(var1);
		}
	}

	@ObfuscatedName("FPSNPMMW.a(LXQPFGONL;I)V")
	public void method205(XQPFGONL arg0) {
		while (true) {
			int var2 = arg0.method478();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field643 = arg0.method480();
			} else if (var2 == 2) {
				field644 = arg0.method480();
				if (HZCWGKOF.field712 != null) {
					field645 = HZCWGKOF.field712[field644];
				}
			} else if (var2 == 4) {
				field648 = arg0.method480();
			} else if (var2 == 5) {
				field649 = arg0.method480();
			} else if (var2 == 6) {
				field650 = arg0.method480();
			} else if (var2 == 7) {
				field651 = arg0.method478();
			} else if (var2 == 8) {
				field652 = arg0.method478();
			} else if (var2 >= 40 && var2 < 50) {
				field646[var2 - 40] = arg0.method480();
			} else if (var2 >= 50 && var2 < 60) {
				field647[var2 - 50] = arg0.method480();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("FPSNPMMW.a()LITSMSHJO;")
	public ITSMSHJO method206() {
		ITSMSHJO var1 = (ITSMSHJO) field653.method220(field642);
		if (var1 != null) {
			return var1;
		}

		ITSMSHJO var2 = ITSMSHJO.method238(field643);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field646[0] != 0) {
				var2.method252(field646[var3], field647[var3]);
			}
		}

		field653.method221(field642, var2);
		return var2;
	}
}
