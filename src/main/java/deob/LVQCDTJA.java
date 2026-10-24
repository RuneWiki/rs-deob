package deob;

@ObfuscatedName("LVQCDTJA")
public class LVQCDTJA {

	@ObfuscatedName("LVQCDTJA.h")
	public boolean field906 = false;

	@ObfuscatedName("LVQCDTJA.i")
	public int field907 = -1;

	@ObfuscatedName("LVQCDTJA.k")
	public boolean field909 = true;

	@ObfuscatedName("LVQCDTJA.b")
	public static int field900;

	@ObfuscatedName("LVQCDTJA.e")
	public int field903;

	@ObfuscatedName("LVQCDTJA.f")
	public int field904;

	@ObfuscatedName("LVQCDTJA.g")
	public int field905;

	@ObfuscatedName("LVQCDTJA.j")
	public int field908;

	@ObfuscatedName("LVQCDTJA.d")
	public String field902;

	@ObfuscatedName("LVQCDTJA.c")
	public static LVQCDTJA[] field901;

	@ObfuscatedName("LVQCDTJA.a(LFNOQZAYQ;I)V")
	public static void method318(FNOQZAYQ arg0) {
		DNRIFKTO var1 = new DNRIFKTO(arg0.method246("varbit.dat", null));
		field900 = var1.method191();
		if (field901 == null) {
			field901 = new LVQCDTJA[field900];
		}

		for (int var2 = 0; var2 < field900; var2++) {
			if (field901[var2] == null) {
				field901[var2] = new LVQCDTJA();
			}

			field901[var2].method319(var1, var2);

			if (field901[var2].field906) {
				SFNSVANZ.field1132[field901[var2].field903].field1144 = true;
			}
		}

		if (var1.field562.length != var1.field563) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("LVQCDTJA.a(LDNRIFKTO;IB)V")
	public void method319(DNRIFKTO arg0, int arg1) {
		while (true) {
			int var3 = arg0.method189();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field903 = arg0.method191();
				field904 = arg0.method189();
				field905 = arg0.method189();
			} else if (var3 == 10) {
				field902 = arg0.method196();
			} else if (var3 == 2) {
				field906 = true;
			} else if (var3 == 3) {
				field907 = arg0.method194();
			} else if (var3 == 4) {
				field908 = arg0.method194();
			} else if (var3 == 5) {
				field909 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
