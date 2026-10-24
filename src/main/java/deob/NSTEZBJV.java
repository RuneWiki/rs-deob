package deob;

@ObfuscatedName("NSTEZBJV")
public class NSTEZBJV {

	@ObfuscatedName("NSTEZBJV.h")
	public boolean field873 = false;

	@ObfuscatedName("NSTEZBJV.i")
	public int field874 = -1;

	@ObfuscatedName("NSTEZBJV.k")
	public boolean field876 = true;

	@ObfuscatedName("NSTEZBJV.b")
	public static int field867;

	@ObfuscatedName("NSTEZBJV.e")
	public int field870;

	@ObfuscatedName("NSTEZBJV.f")
	public int field871;

	@ObfuscatedName("NSTEZBJV.g")
	public int field872;

	@ObfuscatedName("NSTEZBJV.j")
	public int field875;

	@ObfuscatedName("NSTEZBJV.d")
	public String field869;

	@ObfuscatedName("NSTEZBJV.c")
	public static NSTEZBJV[] field868;

	@ObfuscatedName("NSTEZBJV.a(ZLAKPFVPPG;)V")
	public static void method392(AKPFVPPG arg0) {
		FTMSICIZ var1 = new FTMSICIZ(arg0.method7("varbit.dat", null));
		field867 = var1.method215();
		if (field868 == null) {
			field868 = new NSTEZBJV[field867];
		}

		for (int var2 = 0; var2 < field867; var2++) {
			if (field868[var2] == null) {
				field868[var2] = new NSTEZBJV();
			}

			field868[var2].method393(var2, var1);

			if (field868[var2].field873) {
				IFGHRSOU.field590[field868[var2].field870].field602 = true;
			}
		}

		if (var1.field534.length != var1.field535) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("NSTEZBJV.a(ILFTMSICIZ;I)V")
	public void method393(int arg0, FTMSICIZ arg1) {
		while (true) {
			int var3 = arg1.method213();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field870 = arg1.method215();
				field871 = arg1.method213();
				field872 = arg1.method213();
			} else if (var3 == 10) {
				field869 = arg1.method220();
			} else if (var3 == 2) {
				field873 = true;
			} else if (var3 == 3) {
				field874 = arg1.method218();
			} else if (var3 == 4) {
				field875 = arg1.method218();
			} else if (var3 == 5) {
				field876 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
