package deob;

@ObfuscatedName("CUNNWCIM")
public class CUNNWCIM {

	@ObfuscatedName("CUNNWCIM.j")
	public boolean field629 = false;

	@ObfuscatedName("CUNNWCIM.k")
	public boolean field630 = true;

	@ObfuscatedName("CUNNWCIM.m")
	public boolean field632 = false;

	@ObfuscatedName("CUNNWCIM.p")
	public boolean field635 = false;

	@ObfuscatedName("CUNNWCIM.q")
	public int field636 = -1;

	@ObfuscatedName("CUNNWCIM.r")
	public boolean field637 = true;

	@ObfuscatedName("CUNNWCIM.c")
	public static int field622;

	@ObfuscatedName("CUNNWCIM.e")
	public static int field624;

	@ObfuscatedName("CUNNWCIM.h")
	public int field627;

	@ObfuscatedName("CUNNWCIM.i")
	public int field628;

	@ObfuscatedName("CUNNWCIM.l")
	public int field631;

	@ObfuscatedName("CUNNWCIM.n")
	public int field633;

	@ObfuscatedName("CUNNWCIM.o")
	public int field634;

	@ObfuscatedName("CUNNWCIM.g")
	public String field626;

	@ObfuscatedName("CUNNWCIM.f")
	public static int[] field625;

	@ObfuscatedName("CUNNWCIM.d")
	public static CUNNWCIM[] field623;

	@ObfuscatedName("CUNNWCIM.a(ILSRZUEVOD;)V")
	public static void method222(SRZUEVOD arg0) {
		LZWRHABP var1 = new LZWRHABP(arg0.method566("varp.dat", null));
		field624 = 0;
		field622 = var1.method465();
		if (field623 == null) {
			field623 = new CUNNWCIM[field622];
		}

		if (field625 == null) {
			field625 = new int[field622];
		}

		for (int var2 = 0; var2 < field622; var2++) {
			if (field623[var2] == null) {
				field623[var2] = new CUNNWCIM();
			}

			field623[var2].method223(var1, var2);
		}

		if (var1.field1138.length != var1.field1139) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("CUNNWCIM.a(LLZWRHABP;II)V")
	public void method223(LZWRHABP arg0, int arg1) {
		while (true) {
			int var3 = arg0.method463();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field627 = arg0.method463();
			} else if (var3 == 2) {
				field628 = arg0.method463();
			} else if (var3 == 3) {
				field629 = true;
				field625[field624++] = arg1;
			} else if (var3 == 4) {
				field630 = false;
			} else if (var3 == 5) {
				field631 = arg0.method465();
			} else if (var3 == 6) {
				field632 = true;
			} else if (var3 == 7) {
				field633 = arg0.method468();
			} else if (var3 == 8) {
				field634 = 1;
				field635 = true;
			} else if (var3 == 10) {
				field626 = arg0.method470();
			} else if (var3 == 11) {
				field635 = true;
			} else if (var3 == 12) {
				field636 = arg0.method468();
			} else if (var3 == 13) {
				field634 = 2;
				field635 = true;
			} else if (var3 == 14) {
				field637 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
