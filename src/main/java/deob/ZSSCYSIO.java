package deob;

@ObfuscatedName("ZSSCYSIO")
public class ZSSCYSIO {

	@ObfuscatedName("ZSSCYSIO.f")
	public int field1479 = -1;

	@ObfuscatedName("ZSSCYSIO.h")
	public int[] field1481 = new int[6];

	@ObfuscatedName("ZSSCYSIO.i")
	public int[] field1482 = new int[6];

	@ObfuscatedName("ZSSCYSIO.j")
	public int field1483 = 128;

	@ObfuscatedName("ZSSCYSIO.k")
	public int field1484 = 128;

	@ObfuscatedName("ZSSCYSIO.o")
	public static ISXEOURU field1488 = new ISXEOURU(30);

	@ObfuscatedName("ZSSCYSIO.b")
	public static int field1475;

	@ObfuscatedName("ZSSCYSIO.d")
	public int field1477;

	@ObfuscatedName("ZSSCYSIO.e")
	public int field1478;

	@ObfuscatedName("ZSSCYSIO.l")
	public int field1485;

	@ObfuscatedName("ZSSCYSIO.m")
	public int field1486;

	@ObfuscatedName("ZSSCYSIO.n")
	public int field1487;

	@ObfuscatedName("ZSSCYSIO.g")
	public ISUBRNPG field1480;

	@ObfuscatedName("ZSSCYSIO.c")
	public static ZSSCYSIO[] field1476;

	@ObfuscatedName("ZSSCYSIO.a(LLYZBHNJP;I)V")
	public static void method588(LYZBHNJP arg0) {
		ZOMNSJJM var1 = new ZOMNSJJM(arg0.method290("spotanim.dat", null));
		field1475 = var1.method549();
		if (field1476 == null) {
			field1476 = new ZSSCYSIO[field1475];
		}

		for (int var2 = 0; var2 < field1475; var2++) {
			if (field1476[var2] == null) {
				field1476[var2] = new ZSSCYSIO();
			}

			field1476[var2].field1477 = var2;
			field1476[var2].method589(var1);
		}
	}

	@ObfuscatedName("ZSSCYSIO.a(LZOMNSJJM;B)V")
	public void method589(ZOMNSJJM arg0) {
		while (true) {
			int var2 = arg0.method547();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1478 = arg0.method549();
			} else if (var2 == 2) {
				field1479 = arg0.method549();
				if (ISUBRNPG.field786 != null) {
					field1480 = ISUBRNPG.field786[field1479];
				}
			} else if (var2 == 4) {
				field1483 = arg0.method549();
			} else if (var2 == 5) {
				field1484 = arg0.method549();
			} else if (var2 == 6) {
				field1485 = arg0.method549();
			} else if (var2 == 7) {
				field1486 = arg0.method547();
			} else if (var2 == 8) {
				field1487 = arg0.method547();
			} else if (var2 >= 40 && var2 < 50) {
				field1481[var2 - 40] = arg0.method549();
			} else if (var2 >= 50 && var2 < 60) {
				field1482[var2 - 50] = arg0.method549();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("ZSSCYSIO.a()LCCYECDYX;")
	public CCYECDYX method590() {
		CCYECDYX var1 = (CCYECDYX) field1488.method228(field1477);
		if (var1 != null) {
			return var1;
		}

		CCYECDYX var2 = CCYECDYX.method11(field1478);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1481[0] != 0) {
				var2.method25(field1481[var3], field1482[var3]);
			}
		}

		field1488.method229(field1477, var2);
		return var2;
	}
}
