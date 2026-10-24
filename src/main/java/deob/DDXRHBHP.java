package deob;

@ObfuscatedName("DDXRHBHP")
public class DDXRHBHP {

	@ObfuscatedName("DDXRHBHP.h")
	public boolean field501 = false;

	@ObfuscatedName("DDXRHBHP.i")
	public int field502 = -1;

	@ObfuscatedName("DDXRHBHP.k")
	public boolean field504 = true;

	@ObfuscatedName("DDXRHBHP.b")
	public static int field495;

	@ObfuscatedName("DDXRHBHP.e")
	public int field498;

	@ObfuscatedName("DDXRHBHP.f")
	public int field499;

	@ObfuscatedName("DDXRHBHP.g")
	public int field500;

	@ObfuscatedName("DDXRHBHP.j")
	public int field503;

	@ObfuscatedName("DDXRHBHP.d")
	public String field497;

	@ObfuscatedName("DDXRHBHP.c")
	public static DDXRHBHP[] field496;

	@ObfuscatedName("DDXRHBHP.a(LVSUYIIVA;I)V")
	public static void method232(VSUYIIVA arg0) {
		CFARFRSG var1 = new CFARFRSG(arg0.method570("varbit.dat", null));
		field495 = var1.method32();
		if (field496 == null) {
			field496 = new DDXRHBHP[field495];
		}

		for (int var2 = 0; var2 < field495; var2++) {
			if (field496[var2] == null) {
				field496[var2] = new DDXRHBHP();
			}

			field496[var2].method233(var2, var1);

			if (field496[var2].field501) {
				OZAHPBMK.field1094[field496[var2].field498].field1106 = true;
			}
		}

		if (var1.field43.length != var1.field44) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("DDXRHBHP.a(IBLCFARFRSG;)V")
	public void method233(int arg0, CFARFRSG arg1) {
		while (true) {
			int var3 = arg1.method30();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field498 = arg1.method32();
				field499 = arg1.method30();
				field500 = arg1.method30();
			} else if (var3 == 10) {
				field497 = arg1.method37();
			} else if (var3 == 2) {
				field501 = true;
			} else if (var3 == 3) {
				field502 = arg1.method35();
			} else if (var3 == 4) {
				field503 = arg1.method35();
			} else if (var3 == 5) {
				field504 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
