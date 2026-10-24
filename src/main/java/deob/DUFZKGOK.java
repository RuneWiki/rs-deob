package deob;

@ObfuscatedName("DUFZKGOK")
public class DUFZKGOK {

	@ObfuscatedName("DUFZKGOK.i")
	public boolean field724 = false;

	@ObfuscatedName("DUFZKGOK.j")
	public int field725 = -1;

	@ObfuscatedName("DUFZKGOK.c")
	public static int field718;

	@ObfuscatedName("DUFZKGOK.f")
	public int field721;

	@ObfuscatedName("DUFZKGOK.g")
	public int field722;

	@ObfuscatedName("DUFZKGOK.h")
	public int field723;

	@ObfuscatedName("DUFZKGOK.k")
	public int field726;

	@ObfuscatedName("DUFZKGOK.e")
	public String field720;

	@ObfuscatedName("DUFZKGOK.d")
	public static DUFZKGOK[] field719;

	@ObfuscatedName("DUFZKGOK.a(LLYZBHNJP;I)V")
	public static void method206(LYZBHNJP arg0) {
		ZOMNSJJM var1 = new ZOMNSJJM(arg0.method290("varbit.dat", null));
		field718 = var1.method549();
		if (field719 == null) {
			field719 = new DUFZKGOK[field718];
		}

		for (int var2 = 0; var2 < field718; var2++) {
			if (field719[var2] == null) {
				field719[var2] = new DUFZKGOK();
			}

			field719[var2].method207(var2, var1);

			if (field719[var2].field724) {
				QOKQYKHB.field1115[field719[var2].field721].field1127 = true;
			}
		}

		if (var1.field1456.length != var1.field1457) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("DUFZKGOK.a(IILZOMNSJJM;)V")
	public void method207(int arg0, ZOMNSJJM arg1) {
		while (true) {
			int var3 = arg1.method547();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field721 = arg1.method549();
				field722 = arg1.method547();
				field723 = arg1.method547();
			} else if (var3 == 10) {
				field720 = arg1.method554();
			} else if (var3 == 2) {
				field724 = true;
			} else if (var3 == 3) {
				field725 = arg1.method552();
			} else if (var3 == 4) {
				field726 = arg1.method552();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
