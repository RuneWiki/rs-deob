package deob;

@ObfuscatedName("DUEJVLYB")
public class DUEJVLYB {

	@ObfuscatedName("DUEJVLYB.i")
	public boolean field555 = false;

	@ObfuscatedName("DUEJVLYB.j")
	public int field556 = -1;

	@ObfuscatedName("DUEJVLYB.l")
	public boolean field558 = true;

	@ObfuscatedName("DUEJVLYB.c")
	public static int field549;

	@ObfuscatedName("DUEJVLYB.f")
	public int field552;

	@ObfuscatedName("DUEJVLYB.g")
	public int field553;

	@ObfuscatedName("DUEJVLYB.h")
	public int field554;

	@ObfuscatedName("DUEJVLYB.k")
	public int field557;

	@ObfuscatedName("DUEJVLYB.e")
	public String field551;

	@ObfuscatedName("DUEJVLYB.d")
	public static DUEJVLYB[] field550;

	@ObfuscatedName("DUEJVLYB.a(LSMIVAFST;I)V")
	public static void method278(SMIVAFST arg0) {
		BSNPYLEV var1 = new BSNPYLEV(arg0.method512("varbit.dat", null));
		field549 = var1.method49();
		if (field550 == null) {
			field550 = new DUEJVLYB[field549];
		}

		for (int var2 = 0; var2 < field549; var2++) {
			if (field550[var2] == null) {
				field550[var2] = new DUEJVLYB();
			}

			field550[var2].method279(var1, var2);

			if (field550[var2].field555) {
				AJLKWPFL.field2[field550[var2].field552].field14 = true;
			}
		}

		if (var1.field54.length != var1.field55) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("DUEJVLYB.a(BLBSNPYLEV;I)V")
	public void method279(BSNPYLEV arg0, int arg1) {
		while (true) {
			int var3 = arg0.method47();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field552 = arg0.method49();
				field553 = arg0.method47();
				field554 = arg0.method47();
			} else if (var3 == 10) {
				field551 = arg0.method54();
			} else if (var3 == 2) {
				field555 = true;
			} else if (var3 == 3) {
				field556 = arg0.method52();
			} else if (var3 == 4) {
				field557 = arg0.method52();
			} else if (var3 == 5) {
				field558 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
