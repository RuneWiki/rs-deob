package deob;

@ObfuscatedName("KTJKDKKM")
public class KTJKDKKM {

	@ObfuscatedName("KTJKDKKM.i")
	public boolean field871 = false;

	@ObfuscatedName("KTJKDKKM.j")
	public boolean field872 = true;

	@ObfuscatedName("KTJKDKKM.l")
	public boolean field874 = false;

	@ObfuscatedName("KTJKDKKM.o")
	public boolean field877 = false;

	@ObfuscatedName("KTJKDKKM.p")
	public int field878 = -1;

	@ObfuscatedName("KTJKDKKM.q")
	public boolean field879 = true;

	@ObfuscatedName("KTJKDKKM.b")
	public static int field864;

	@ObfuscatedName("KTJKDKKM.d")
	public static int field866;

	@ObfuscatedName("KTJKDKKM.g")
	public int field869;

	@ObfuscatedName("KTJKDKKM.h")
	public int field870;

	@ObfuscatedName("KTJKDKKM.k")
	public int field873;

	@ObfuscatedName("KTJKDKKM.m")
	public int field875;

	@ObfuscatedName("KTJKDKKM.n")
	public int field876;

	@ObfuscatedName("KTJKDKKM.f")
	public String field868;

	@ObfuscatedName("KTJKDKKM.e")
	public static int[] field867;

	@ObfuscatedName("KTJKDKKM.c")
	public static KTJKDKKM[] field865;

	@ObfuscatedName("KTJKDKKM.a(LGWOEELWB;B)V")
	public static void method267(GWOEELWB arg0) {
		MLYYHULT var1 = new MLYYHULT(arg0.method249("varp.dat", null));
		field866 = 0;
		field864 = var1.method298();
		if (field865 == null) {
			field865 = new KTJKDKKM[field864];
		}

		if (field867 == null) {
			field867 = new int[field864];
		}

		for (int var2 = 0; var2 < field864; var2++) {
			if (field865[var2] == null) {
				field865[var2] = new KTJKDKKM();
			}

			field865[var2].method268(var2, var1);
		}

		if (var1.field962.length != var1.field963) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("KTJKDKKM.a(IILMLYYHULT;)V")
	public void method268(int arg0, MLYYHULT arg1) {
		while (true) {
			int var3 = arg1.method296();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field869 = arg1.method296();
			} else if (var3 == 2) {
				field870 = arg1.method296();
			} else if (var3 == 3) {
				field871 = true;
				field867[field866++] = arg0;
			} else if (var3 == 4) {
				field872 = false;
			} else if (var3 == 5) {
				field873 = arg1.method298();
			} else if (var3 == 6) {
				field874 = true;
			} else if (var3 == 7) {
				field875 = arg1.method301();
			} else if (var3 == 8) {
				field876 = 1;
				field877 = true;
			} else if (var3 == 10) {
				field868 = arg1.method303();
			} else if (var3 == 11) {
				field877 = true;
			} else if (var3 == 12) {
				field878 = arg1.method301();
			} else if (var3 == 13) {
				field876 = 2;
				field877 = true;
			} else if (var3 == 14) {
				field879 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
