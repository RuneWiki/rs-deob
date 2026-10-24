package deob;

@ObfuscatedName("DIPZNIAB")
public class DIPZNIAB {

	@ObfuscatedName("DIPZNIAB.i")
	public boolean field562 = false;

	@ObfuscatedName("DIPZNIAB.j")
	public boolean field563 = true;

	@ObfuscatedName("DIPZNIAB.l")
	public boolean field565 = false;

	@ObfuscatedName("DIPZNIAB.o")
	public boolean field568 = false;

	@ObfuscatedName("DIPZNIAB.p")
	public int field569 = -1;

	@ObfuscatedName("DIPZNIAB.b")
	public static int field555;

	@ObfuscatedName("DIPZNIAB.d")
	public static int field557;

	@ObfuscatedName("DIPZNIAB.g")
	public int field560;

	@ObfuscatedName("DIPZNIAB.h")
	public int field561;

	@ObfuscatedName("DIPZNIAB.k")
	public int field564;

	@ObfuscatedName("DIPZNIAB.m")
	public int field566;

	@ObfuscatedName("DIPZNIAB.n")
	public int field567;

	@ObfuscatedName("DIPZNIAB.f")
	public String field559;

	@ObfuscatedName("DIPZNIAB.e")
	public static int[] field558;

	@ObfuscatedName("DIPZNIAB.c")
	public static DIPZNIAB[] field556;

	@ObfuscatedName("DIPZNIAB.a(ZLEAXVDNXA;)V")
	public static void method235(EAXVDNXA arg0) {
		CKBTFRZM var1 = new CKBTFRZM(arg0.method255("varp.dat", null));
		field557 = 0;
		field555 = var1.method46();
		if (field556 == null) {
			field556 = new DIPZNIAB[field555];
		}

		if (field558 == null) {
			field558 = new int[field555];
		}

		for (int var2 = 0; var2 < field555; var2++) {
			if (field556[var2] == null) {
				field556[var2] = new DIPZNIAB();
			}

			field556[var2].method236(var2, var1);
		}

		if (var1.field91.length != var1.field92) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("DIPZNIAB.a(IILCKBTFRZM;)V")
	public void method236(int arg0, CKBTFRZM arg1) {
		while (true) {
			int var3 = arg1.method44();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field560 = arg1.method44();
			} else if (var3 == 2) {
				field561 = arg1.method44();
			} else if (var3 == 3) {
				field562 = true;
				field558[field557++] = arg0;
			} else if (var3 == 4) {
				field563 = false;
			} else if (var3 == 5) {
				field564 = arg1.method46();
			} else if (var3 == 6) {
				field565 = true;
			} else if (var3 == 7) {
				field566 = arg1.method49();
			} else if (var3 == 8) {
				field567 = 1;
				field568 = true;
			} else if (var3 == 10) {
				field559 = arg1.method51();
			} else if (var3 == 11) {
				field568 = true;
			} else if (var3 == 12) {
				field569 = arg1.method49();
			} else if (var3 == 13) {
				field567 = 2;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
