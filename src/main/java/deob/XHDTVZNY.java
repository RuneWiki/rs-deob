package deob;

@ObfuscatedName("XHDTVZNY")
public class XHDTVZNY {

	@ObfuscatedName("XHDTVZNY.e")
	public int field1401 = -1;

	@ObfuscatedName("XHDTVZNY.g")
	public int[] field1403 = new int[6];

	@ObfuscatedName("XHDTVZNY.h")
	public int[] field1404 = new int[6];

	@ObfuscatedName("XHDTVZNY.i")
	public int field1405 = 128;

	@ObfuscatedName("XHDTVZNY.j")
	public int field1406 = 128;

	@ObfuscatedName("XHDTVZNY.n")
	public static HGKRJZKS field1410 = new HGKRJZKS(30);

	@ObfuscatedName("XHDTVZNY.a")
	public static int field1397;

	@ObfuscatedName("XHDTVZNY.c")
	public int field1399;

	@ObfuscatedName("XHDTVZNY.d")
	public int field1400;

	@ObfuscatedName("XHDTVZNY.k")
	public int field1407;

	@ObfuscatedName("XHDTVZNY.l")
	public int field1408;

	@ObfuscatedName("XHDTVZNY.m")
	public int field1409;

	@ObfuscatedName("XHDTVZNY.f")
	public WLHKAARP field1402;

	@ObfuscatedName("XHDTVZNY.b")
	public static XHDTVZNY[] field1398;

	@ObfuscatedName("XHDTVZNY.a(ZLXRWUKRPO;)V")
	public static void method577(XRWUKRPO arg0) {
		GLMIQHJI var1 = new GLMIQHJI(arg0.method581("spotanim.dat", null));
		field1397 = var1.method246();
		if (field1398 == null) {
			field1398 = new XHDTVZNY[field1397];
		}

		for (int var2 = 0; var2 < field1397; var2++) {
			if (field1398[var2] == null) {
				field1398[var2] = new XHDTVZNY();
			}

			field1398[var2].field1399 = var2;
			field1398[var2].method578(var1);
		}
	}

	@ObfuscatedName("XHDTVZNY.a(BLGLMIQHJI;)V")
	public void method578(GLMIQHJI arg0) {
		while (true) {
			int var2 = arg0.method244();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1400 = arg0.method246();
			} else if (var2 == 2) {
				field1401 = arg0.method246();
				if (WLHKAARP.field1323 != null) {
					field1402 = WLHKAARP.field1323[field1401];
				}
			} else if (var2 == 4) {
				field1405 = arg0.method246();
			} else if (var2 == 5) {
				field1406 = arg0.method246();
			} else if (var2 == 6) {
				field1407 = arg0.method246();
			} else if (var2 == 7) {
				field1408 = arg0.method244();
			} else if (var2 == 8) {
				field1409 = arg0.method244();
			} else if (var2 >= 40 && var2 < 50) {
				field1403[var2 - 40] = arg0.method246();
			} else if (var2 >= 50 && var2 < 60) {
				field1404[var2 - 50] = arg0.method246();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("XHDTVZNY.a()LVHYCWIPJ;")
	public VHYCWIPJ method579() {
		VHYCWIPJ var1 = (VHYCWIPJ) field1410.method285(field1399);
		if (var1 != null) {
			return var1;
		}

		VHYCWIPJ var2 = VHYCWIPJ.method500(field1400);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1403[0] != 0) {
				var2.method514(field1403[var3], field1404[var3]);
			}
		}

		field1410.method286(field1399, var2);
		return var2;
	}
}
