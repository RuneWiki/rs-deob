package deob;

@ObfuscatedName("YTBPTACV")
public class YTBPTACV {

	@ObfuscatedName("YTBPTACV.h")
	public int field1463 = -1;

	@ObfuscatedName("YTBPTACV.j")
	public int[] field1465 = new int[6];

	@ObfuscatedName("YTBPTACV.k")
	public int[] field1466 = new int[6];

	@ObfuscatedName("YTBPTACV.l")
	public int field1467 = 128;

	@ObfuscatedName("YTBPTACV.m")
	public int field1468 = 128;

	@ObfuscatedName("YTBPTACV.q")
	public static QQBOAQZB field1472 = new QQBOAQZB(30);

	@ObfuscatedName("YTBPTACV.d")
	public static int field1459;

	@ObfuscatedName("YTBPTACV.f")
	public int field1461;

	@ObfuscatedName("YTBPTACV.g")
	public int field1462;

	@ObfuscatedName("YTBPTACV.n")
	public int field1469;

	@ObfuscatedName("YTBPTACV.o")
	public int field1470;

	@ObfuscatedName("YTBPTACV.p")
	public int field1471;

	@ObfuscatedName("YTBPTACV.i")
	public HARRRJHW field1464;

	@ObfuscatedName("YTBPTACV.e")
	public static YTBPTACV[] field1460;

	@ObfuscatedName("YTBPTACV.a(LDYBMLHQM;Z)V")
	public static void method580(DYBMLHQM arg0) {
		INLHDAGO var1 = new INLHDAGO(arg0.method248("spotanim.dat", null));
		field1459 = var1.method310();
		if (field1460 == null) {
			field1460 = new YTBPTACV[field1459];
		}

		for (int var2 = 0; var2 < field1459; var2++) {
			if (field1460[var2] == null) {
				field1460[var2] = new YTBPTACV();
			}

			field1460[var2].field1461 = var2;
			field1460[var2].method581(var1);
		}
	}

	@ObfuscatedName("YTBPTACV.a(ILINLHDAGO;)V")
	public void method581(INLHDAGO arg0) {
		while (true) {
			int var2 = arg0.method308();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1462 = arg0.method310();
			} else if (var2 == 2) {
				field1463 = arg0.method310();
				if (HARRRJHW.field840 != null) {
					field1464 = HARRRJHW.field840[field1463];
				}
			} else if (var2 == 4) {
				field1467 = arg0.method310();
			} else if (var2 == 5) {
				field1468 = arg0.method310();
			} else if (var2 == 6) {
				field1469 = arg0.method310();
			} else if (var2 == 7) {
				field1470 = arg0.method308();
			} else if (var2 == 8) {
				field1471 = arg0.method308();
			} else if (var2 >= 40 && var2 < 50) {
				field1465[var2 - 40] = arg0.method310();
			} else if (var2 >= 50 && var2 < 60) {
				field1466[var2 - 50] = arg0.method310();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("YTBPTACV.a()LDHUPIIUL;")
	public DHUPIIUL method582() {
		DHUPIIUL var1 = (DHUPIIUL) field1472.method421(field1461);
		if (var1 != null) {
			return var1;
		}

		DHUPIIUL var2 = DHUPIIUL.method191(field1462);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1465[0] != 0) {
				var2.method205(field1465[var3], field1466[var3]);
			}
		}

		field1472.method422(var2, field1461);
		return var2;
	}
}
