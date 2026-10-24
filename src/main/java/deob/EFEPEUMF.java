package deob;

@ObfuscatedName("EFEPEUMF")
public class EFEPEUMF {

	@ObfuscatedName("EFEPEUMF.h")
	public boolean field612 = false;

	@ObfuscatedName("EFEPEUMF.i")
	public int field613 = -1;

	@ObfuscatedName("EFEPEUMF.k")
	public boolean field615 = true;

	@ObfuscatedName("EFEPEUMF.b")
	public static int field606;

	@ObfuscatedName("EFEPEUMF.e")
	public int field609;

	@ObfuscatedName("EFEPEUMF.f")
	public int field610;

	@ObfuscatedName("EFEPEUMF.g")
	public int field611;

	@ObfuscatedName("EFEPEUMF.j")
	public int field614;

	@ObfuscatedName("EFEPEUMF.d")
	public String field608;

	@ObfuscatedName("EFEPEUMF.c")
	public static EFEPEUMF[] field607;

	@ObfuscatedName("EFEPEUMF.a(ILMAARFNGV;)V")
	public static void method203(MAARFNGV arg0) {
		EMWAMCXW var1 = new EMWAMCXW(arg0.method332("varbit.dat", null));
		field606 = var1.method219();
		if (field607 == null) {
			field607 = new EFEPEUMF[field606];
		}

		for (int var2 = 0; var2 < field606; var2++) {
			if (field607[var2] == null) {
				field607[var2] = new EFEPEUMF();
			}

			field607[var2].method204(var1, var2);

			if (field607[var2].field612) {
				INYZAOQU.field733[field607[var2].field609].field745 = true;
			}
		}

		if (var1.field616.length != var1.field617) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("EFEPEUMF.a(ZLEMWAMCXW;I)V")
	public void method204(EMWAMCXW arg0, int arg1) {
		while (true) {
			int var3 = arg0.method217();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field609 = arg0.method219();
				field610 = arg0.method217();
				field611 = arg0.method217();
			} else if (var3 == 10) {
				field608 = arg0.method224();
			} else if (var3 == 2) {
				field612 = true;
			} else if (var3 == 3) {
				field613 = arg0.method222();
			} else if (var3 == 4) {
				field614 = arg0.method222();
			} else if (var3 == 5) {
				field615 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
