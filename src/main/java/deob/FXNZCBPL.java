package deob;

@ObfuscatedName("FXNZCBPL")
public class FXNZCBPL {

	@ObfuscatedName("FXNZCBPL.f")
	public int field623 = -1;

	@ObfuscatedName("FXNZCBPL.h")
	public int[] field625 = new int[6];

	@ObfuscatedName("FXNZCBPL.i")
	public int[] field626 = new int[6];

	@ObfuscatedName("FXNZCBPL.j")
	public int field627 = 128;

	@ObfuscatedName("FXNZCBPL.k")
	public int field628 = 128;

	@ObfuscatedName("FXNZCBPL.o")
	public static ZPNSJLZE field632 = new ZPNSJLZE(30);

	@ObfuscatedName("FXNZCBPL.b")
	public static int field619;

	@ObfuscatedName("FXNZCBPL.d")
	public int field621;

	@ObfuscatedName("FXNZCBPL.e")
	public int field622;

	@ObfuscatedName("FXNZCBPL.l")
	public int field629;

	@ObfuscatedName("FXNZCBPL.m")
	public int field630;

	@ObfuscatedName("FXNZCBPL.n")
	public int field631;

	@ObfuscatedName("FXNZCBPL.g")
	public PNPNYEVW field624;

	@ObfuscatedName("FXNZCBPL.c")
	public static FXNZCBPL[] field620;

	@ObfuscatedName("FXNZCBPL.a(ILINOFEYKQ;)V")
	public static void method200(INOFEYKQ arg0) {
		NHEPCMLW var1 = new NHEPCMLW(arg0.method277("spotanim.dat", null));
		field619 = var1.method351();
		if (field620 == null) {
			field620 = new FXNZCBPL[field619];
		}

		for (int var2 = 0; var2 < field619; var2++) {
			if (field620[var2] == null) {
				field620[var2] = new FXNZCBPL();
			}

			field620[var2].field621 = var2;
			field620[var2].method201(var1);
		}
	}

	@ObfuscatedName("FXNZCBPL.a(ZLNHEPCMLW;)V")
	public void method201(NHEPCMLW arg0) {
		while (true) {
			int var2 = arg0.method349();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field622 = arg0.method351();
			} else if (var2 == 2) {
				field623 = arg0.method351();
				if (PNPNYEVW.field1058 != null) {
					field624 = PNPNYEVW.field1058[field623];
				}
			} else if (var2 == 4) {
				field627 = arg0.method351();
			} else if (var2 == 5) {
				field628 = arg0.method351();
			} else if (var2 == 6) {
				field629 = arg0.method351();
			} else if (var2 == 7) {
				field630 = arg0.method349();
			} else if (var2 == 8) {
				field631 = arg0.method349();
			} else if (var2 >= 40 && var2 < 50) {
				field625[var2 - 40] = arg0.method351();
			} else if (var2 >= 50 && var2 < 60) {
				field626[var2 - 50] = arg0.method351();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("FXNZCBPL.a()LCSGBDGDY;")
	public CSGBDGDY method202() {
		CSGBDGDY var1 = (CSGBDGDY) field632.method586(field621);
		if (var1 != null) {
			return var1;
		}

		CSGBDGDY var2 = CSGBDGDY.method160(field622);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field625[0] != 0) {
				var2.method174(field625[var3], field626[var3]);
			}
		}

		field632.method587(var2, field621);
		return var2;
	}
}
