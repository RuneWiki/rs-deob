package deob;

@ObfuscatedName("GBMZYMFW")
public class GBMZYMFW {

	@ObfuscatedName("GBMZYMFW.i")
	public boolean field659 = false;

	@ObfuscatedName("GBMZYMFW.j")
	public boolean field660 = true;

	@ObfuscatedName("GBMZYMFW.l")
	public boolean field662 = false;

	@ObfuscatedName("GBMZYMFW.o")
	public boolean field665 = false;

	@ObfuscatedName("GBMZYMFW.p")
	public int field666 = -1;

	@ObfuscatedName("GBMZYMFW.q")
	public boolean field667 = true;

	@ObfuscatedName("GBMZYMFW.b")
	public static int field652;

	@ObfuscatedName("GBMZYMFW.d")
	public static int field654;

	@ObfuscatedName("GBMZYMFW.g")
	public int field657;

	@ObfuscatedName("GBMZYMFW.h")
	public int field658;

	@ObfuscatedName("GBMZYMFW.k")
	public int field661;

	@ObfuscatedName("GBMZYMFW.m")
	public int field663;

	@ObfuscatedName("GBMZYMFW.n")
	public int field664;

	@ObfuscatedName("GBMZYMFW.f")
	public String field656;

	@ObfuscatedName("GBMZYMFW.e")
	public static int[] field655;

	@ObfuscatedName("GBMZYMFW.c")
	public static GBMZYMFW[] field653;

	@ObfuscatedName("GBMZYMFW.a(ILTKEGJSFV;)V")
	public static void method313(TKEGJSFV arg0) {
		EGCCHUZS var1 = new EGCCHUZS(arg0.method542("varp.dat", null));
		field654 = 0;
		field652 = var1.method263();
		if (field653 == null) {
			field653 = new GBMZYMFW[field652];
		}

		if (field655 == null) {
			field655 = new int[field652];
		}

		for (int var2 = 0; var2 < field652; var2++) {
			if (field653[var2] == null) {
				field653[var2] = new GBMZYMFW();
			}

			field653[var2].method314(var1, var2);
		}

		if (var1.field588.length != var1.field589) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("GBMZYMFW.a(LEGCCHUZS;II)V")
	public void method314(EGCCHUZS arg0, int arg1) {
		while (true) {
			int var3 = arg0.method261();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field657 = arg0.method261();
			} else if (var3 == 2) {
				field658 = arg0.method261();
			} else if (var3 == 3) {
				field659 = true;
				field655[field654++] = arg1;
			} else if (var3 == 4) {
				field660 = false;
			} else if (var3 == 5) {
				field661 = arg0.method263();
			} else if (var3 == 6) {
				field662 = true;
			} else if (var3 == 7) {
				field663 = arg0.method266();
			} else if (var3 == 8) {
				field664 = 1;
				field665 = true;
			} else if (var3 == 10) {
				field656 = arg0.method268();
			} else if (var3 == 11) {
				field665 = true;
			} else if (var3 == 12) {
				field666 = arg0.method266();
			} else if (var3 == 13) {
				field664 = 2;
				field665 = true;
			} else if (var3 == 14) {
				field667 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
