package deob;

@ObfuscatedName("VJTDBWRW")
public class VJTDBWRW {

	@ObfuscatedName("VJTDBWRW.i")
	public boolean field1352 = false;

	@ObfuscatedName("VJTDBWRW.j")
	public boolean field1353 = true;

	@ObfuscatedName("VJTDBWRW.l")
	public boolean field1355 = false;

	@ObfuscatedName("VJTDBWRW.o")
	public boolean field1358 = false;

	@ObfuscatedName("VJTDBWRW.p")
	public int field1359 = -1;

	@ObfuscatedName("VJTDBWRW.b")
	public static int field1345;

	@ObfuscatedName("VJTDBWRW.d")
	public static int field1347;

	@ObfuscatedName("VJTDBWRW.g")
	public int field1350;

	@ObfuscatedName("VJTDBWRW.h")
	public int field1351;

	@ObfuscatedName("VJTDBWRW.k")
	public int field1354;

	@ObfuscatedName("VJTDBWRW.m")
	public int field1356;

	@ObfuscatedName("VJTDBWRW.n")
	public int field1357;

	@ObfuscatedName("VJTDBWRW.f")
	public String field1349;

	@ObfuscatedName("VJTDBWRW.e")
	public static int[] field1348;

	@ObfuscatedName("VJTDBWRW.c")
	public static VJTDBWRW[] field1346;

	@ObfuscatedName("VJTDBWRW.a(LDYBMLHQM;Z)V")
	public static void method507(DYBMLHQM arg0) {
		INLHDAGO var1 = new INLHDAGO(arg0.method248("varp.dat", null));
		field1347 = 0;
		field1345 = var1.method310();
		if (field1346 == null) {
			field1346 = new VJTDBWRW[field1345];
		}

		if (field1348 == null) {
			field1348 = new int[field1345];
		}

		for (int var2 = 0; var2 < field1345; var2++) {
			if (field1346[var2] == null) {
				field1346[var2] = new VJTDBWRW();
			}

			field1346[var2].method508(var2, var1);
		}

		if (var1.field968.length != var1.field969) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("VJTDBWRW.a(IILINLHDAGO;)V")
	public void method508(int arg0, INLHDAGO arg1) {
		while (true) {
			int var3 = arg1.method308();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1350 = arg1.method308();
			} else if (var3 == 2) {
				field1351 = arg1.method308();
			} else if (var3 == 3) {
				field1352 = true;
				field1348[field1347++] = arg0;
			} else if (var3 == 4) {
				field1353 = false;
			} else if (var3 == 5) {
				field1354 = arg1.method310();
			} else if (var3 == 6) {
				field1355 = true;
			} else if (var3 == 7) {
				field1356 = arg1.method313();
			} else if (var3 == 8) {
				field1357 = 1;
				field1358 = true;
			} else if (var3 == 10) {
				field1349 = arg1.method315();
			} else if (var3 == 11) {
				field1358 = true;
			} else if (var3 == 12) {
				field1359 = arg1.method313();
			} else if (var3 == 13) {
				field1357 = 2;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
