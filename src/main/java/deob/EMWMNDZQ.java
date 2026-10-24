package deob;

@ObfuscatedName("EMWMNDZQ")
public class EMWMNDZQ {

	@ObfuscatedName("EMWMNDZQ.h")
	public boolean field607 = false;

	@ObfuscatedName("EMWMNDZQ.i")
	public int field608 = -1;

	@ObfuscatedName("EMWMNDZQ.k")
	public boolean field610 = true;

	@ObfuscatedName("EMWMNDZQ.b")
	public static int field601;

	@ObfuscatedName("EMWMNDZQ.e")
	public int field604;

	@ObfuscatedName("EMWMNDZQ.f")
	public int field605;

	@ObfuscatedName("EMWMNDZQ.g")
	public int field606;

	@ObfuscatedName("EMWMNDZQ.j")
	public int field609;

	@ObfuscatedName("EMWMNDZQ.d")
	public String field603;

	@ObfuscatedName("EMWMNDZQ.c")
	public static EMWMNDZQ[] field602;

	@ObfuscatedName("EMWMNDZQ.a(ILTKEGJSFV;)V")
	public static void method299(TKEGJSFV arg0) {
		EGCCHUZS var1 = new EGCCHUZS(arg0.method542("varbit.dat", null));
		field601 = var1.method263();
		if (field602 == null) {
			field602 = new EMWMNDZQ[field601];
		}

		for (int var2 = 0; var2 < field601; var2++) {
			if (field602[var2] == null) {
				field602[var2] = new EMWMNDZQ();
			}

			field602[var2].method300(var1, var2);

			if (field602[var2].field607) {
				GBMZYMFW.field653[field602[var2].field604].field665 = true;
			}
		}

		if (var1.field588.length != var1.field589) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("EMWMNDZQ.a(LEGCCHUZS;II)V")
	public void method300(EGCCHUZS arg0, int arg1) {
		while (true) {
			int var3 = arg0.method261();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field604 = arg0.method263();
				field605 = arg0.method261();
				field606 = arg0.method261();
			} else if (var3 == 10) {
				field603 = arg0.method268();
			} else if (var3 == 2) {
				field607 = true;
			} else if (var3 == 3) {
				field608 = arg0.method266();
			} else if (var3 == 4) {
				field609 = arg0.method266();
			} else if (var3 == 5) {
				field610 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
