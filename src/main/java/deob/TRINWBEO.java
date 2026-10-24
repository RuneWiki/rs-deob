package deob;

@ObfuscatedName("TRINWBEO")
public class TRINWBEO {

	@ObfuscatedName("TRINWBEO.h")
	public boolean field1361 = false;

	@ObfuscatedName("TRINWBEO.i")
	public boolean field1362 = true;

	@ObfuscatedName("TRINWBEO.k")
	public boolean field1364 = false;

	@ObfuscatedName("TRINWBEO.n")
	public boolean field1367 = false;

	@ObfuscatedName("TRINWBEO.o")
	public int field1368 = -1;

	@ObfuscatedName("TRINWBEO.p")
	public boolean field1369 = true;

	@ObfuscatedName("TRINWBEO.a")
	public static int field1354;

	@ObfuscatedName("TRINWBEO.c")
	public static int field1356;

	@ObfuscatedName("TRINWBEO.f")
	public int field1359;

	@ObfuscatedName("TRINWBEO.g")
	public int field1360;

	@ObfuscatedName("TRINWBEO.j")
	public int field1363;

	@ObfuscatedName("TRINWBEO.l")
	public int field1365;

	@ObfuscatedName("TRINWBEO.m")
	public int field1366;

	@ObfuscatedName("TRINWBEO.e")
	public String field1358;

	@ObfuscatedName("TRINWBEO.d")
	public static int[] field1357;

	@ObfuscatedName("TRINWBEO.b")
	public static TRINWBEO[] field1355;

	@ObfuscatedName("TRINWBEO.a(LAWEEREDT;I)V")
	public static void method499(AWEEREDT arg0) {
		IUVBENCV var1 = new IUVBENCV(arg0.method14("varp.dat", null));
		field1356 = 0;
		field1354 = var1.method247();
		if (field1355 == null) {
			field1355 = new TRINWBEO[field1354];
		}

		if (field1357 == null) {
			field1357 = new int[field1354];
		}

		for (int var2 = 0; var2 < field1354; var2++) {
			if (field1355[var2] == null) {
				field1355[var2] = new TRINWBEO();
			}

			field1355[var2].method500(var1, var2);
		}

		if (var1.field732.length != var1.field733) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("TRINWBEO.a(LIUVBENCV;II)V")
	public void method500(IUVBENCV arg0, int arg1) {
		while (true) {
			int var3 = arg0.method245();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1359 = arg0.method245();
			} else if (var3 == 2) {
				field1360 = arg0.method245();
			} else if (var3 == 3) {
				field1361 = true;
				field1357[field1356++] = arg1;
			} else if (var3 == 4) {
				field1362 = false;
			} else if (var3 == 5) {
				field1363 = arg0.method247();
			} else if (var3 == 6) {
				field1364 = true;
			} else if (var3 == 7) {
				field1365 = arg0.method250();
			} else if (var3 == 8) {
				field1366 = 1;
				field1367 = true;
			} else if (var3 == 10) {
				field1358 = arg0.method252();
			} else if (var3 == 11) {
				field1367 = true;
			} else if (var3 == 12) {
				field1368 = arg0.method250();
			} else if (var3 == 13) {
				field1366 = 2;
				field1367 = true;
			} else if (var3 == 14) {
				field1369 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
