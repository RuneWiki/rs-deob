package deob;

@ObfuscatedName("ZESTMKXA")
public class ZESTMKXA {

	@ObfuscatedName("ZESTMKXA.h")
	public boolean field1484 = false;

	@ObfuscatedName("ZESTMKXA.i")
	public int field1485 = -1;

	@ObfuscatedName("ZESTMKXA.b")
	public static int field1478;

	@ObfuscatedName("ZESTMKXA.e")
	public int field1481;

	@ObfuscatedName("ZESTMKXA.f")
	public int field1482;

	@ObfuscatedName("ZESTMKXA.g")
	public int field1483;

	@ObfuscatedName("ZESTMKXA.j")
	public int field1486;

	@ObfuscatedName("ZESTMKXA.d")
	public String field1480;

	@ObfuscatedName("ZESTMKXA.c")
	public static ZESTMKXA[] field1479;

	@ObfuscatedName("ZESTMKXA.a(ZLEAXVDNXA;)V")
	public static void method591(EAXVDNXA arg0) {
		CKBTFRZM var1 = new CKBTFRZM(arg0.method255("varbit.dat", null));
		field1478 = var1.method46();
		if (field1479 == null) {
			field1479 = new ZESTMKXA[field1478];
		}

		for (int var2 = 0; var2 < field1478; var2++) {
			if (field1479[var2] == null) {
				field1479[var2] = new ZESTMKXA();
			}

			field1479[var2].method592(var2, var1);

			if (field1479[var2].field1484) {
				DIPZNIAB.field556[field1479[var2].field1481].field568 = true;
			}
		}

		if (var1.field91.length != var1.field92) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("ZESTMKXA.a(IILCKBTFRZM;)V")
	public void method592(int arg0, CKBTFRZM arg1) {
		while (true) {
			int var3 = arg1.method44();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1481 = arg1.method46();
				field1482 = arg1.method44();
				field1483 = arg1.method44();
			} else if (var3 == 10) {
				field1480 = arg1.method51();
			} else if (var3 == 2) {
				field1484 = true;
			} else if (var3 == 3) {
				field1485 = arg1.method49();
			} else if (var3 == 4) {
				field1486 = arg1.method49();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
