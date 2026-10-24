package deob;

@ObfuscatedName("EHPXVLSO")
public class EHPXVLSO {

	@ObfuscatedName("EHPXVLSO.g")
	public boolean field628 = false;

	@ObfuscatedName("EHPXVLSO.h")
	public int field629 = -1;

	@ObfuscatedName("EHPXVLSO.j")
	public boolean field631 = true;

	@ObfuscatedName("EHPXVLSO.a")
	public static int field622;

	@ObfuscatedName("EHPXVLSO.d")
	public int field625;

	@ObfuscatedName("EHPXVLSO.e")
	public int field626;

	@ObfuscatedName("EHPXVLSO.f")
	public int field627;

	@ObfuscatedName("EHPXVLSO.i")
	public int field630;

	@ObfuscatedName("EHPXVLSO.c")
	public String field624;

	@ObfuscatedName("EHPXVLSO.b")
	public static EHPXVLSO[] field623;

	@ObfuscatedName("EHPXVLSO.a(LAWEEREDT;I)V")
	public static void method211(AWEEREDT arg0) {
		IUVBENCV var1 = new IUVBENCV(arg0.method14("varbit.dat", null));
		field622 = var1.method247();
		if (field623 == null) {
			field623 = new EHPXVLSO[field622];
		}

		for (int var2 = 0; var2 < field622; var2++) {
			if (field623[var2] == null) {
				field623[var2] = new EHPXVLSO();
			}

			field623[var2].method212(var1, var2);

			if (field623[var2].field628) {
				TRINWBEO.field1355[field623[var2].field625].field1367 = true;
			}
		}

		if (var1.field732.length != var1.field733) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("EHPXVLSO.a(LIUVBENCV;II)V")
	public void method212(IUVBENCV arg0, int arg1) {
		while (true) {
			int var3 = arg0.method245();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field625 = arg0.method247();
				field626 = arg0.method245();
				field627 = arg0.method245();
			} else if (var3 == 10) {
				field624 = arg0.method252();
			} else if (var3 == 2) {
				field628 = true;
			} else if (var3 == 3) {
				field629 = arg0.method250();
			} else if (var3 == 4) {
				field630 = arg0.method250();
			} else if (var3 == 5) {
				field631 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
