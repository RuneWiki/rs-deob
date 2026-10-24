package deob;

@ObfuscatedName("IFGHRSOU")
public class IFGHRSOU {

	@ObfuscatedName("IFGHRSOU.h")
	public boolean field596 = false;

	@ObfuscatedName("IFGHRSOU.i")
	public boolean field597 = true;

	@ObfuscatedName("IFGHRSOU.k")
	public boolean field599 = false;

	@ObfuscatedName("IFGHRSOU.n")
	public boolean field602 = false;

	@ObfuscatedName("IFGHRSOU.o")
	public int field603 = -1;

	@ObfuscatedName("IFGHRSOU.p")
	public boolean field604 = true;

	@ObfuscatedName("IFGHRSOU.a")
	public static int field589;

	@ObfuscatedName("IFGHRSOU.c")
	public static int field591;

	@ObfuscatedName("IFGHRSOU.f")
	public int field594;

	@ObfuscatedName("IFGHRSOU.g")
	public int field595;

	@ObfuscatedName("IFGHRSOU.j")
	public int field598;

	@ObfuscatedName("IFGHRSOU.l")
	public int field600;

	@ObfuscatedName("IFGHRSOU.m")
	public int field601;

	@ObfuscatedName("IFGHRSOU.e")
	public String field593;

	@ObfuscatedName("IFGHRSOU.d")
	public static int[] field592;

	@ObfuscatedName("IFGHRSOU.b")
	public static IFGHRSOU[] field590;

	@ObfuscatedName("IFGHRSOU.a(ZLAKPFVPPG;)V")
	public static void method297(AKPFVPPG arg0) {
		FTMSICIZ var1 = new FTMSICIZ(arg0.method7("varp.dat", null));
		field591 = 0;
		field589 = var1.method215();
		if (field590 == null) {
			field590 = new IFGHRSOU[field589];
		}

		if (field592 == null) {
			field592 = new int[field589];
		}

		for (int var2 = 0; var2 < field589; var2++) {
			if (field590[var2] == null) {
				field590[var2] = new IFGHRSOU();
			}

			field590[var2].method298(var2, var1);
		}

		if (var1.field534.length != var1.field535) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("IFGHRSOU.a(ILFTMSICIZ;I)V")
	public void method298(int arg0, FTMSICIZ arg1) {
		while (true) {
			int var3 = arg1.method213();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field594 = arg1.method213();
			} else if (var3 == 2) {
				field595 = arg1.method213();
			} else if (var3 == 3) {
				field596 = true;
				field592[field591++] = arg0;
			} else if (var3 == 4) {
				field597 = false;
			} else if (var3 == 5) {
				field598 = arg1.method215();
			} else if (var3 == 6) {
				field599 = true;
			} else if (var3 == 7) {
				field600 = arg1.method218();
			} else if (var3 == 8) {
				field601 = 1;
				field602 = true;
			} else if (var3 == 10) {
				field593 = arg1.method220();
			} else if (var3 == 11) {
				field602 = true;
			} else if (var3 == 12) {
				field603 = arg1.method218();
			} else if (var3 == 13) {
				field601 = 2;
				field602 = true;
			} else if (var3 == 14) {
				field604 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
