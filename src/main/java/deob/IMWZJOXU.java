package deob;

@ObfuscatedName("IMWZJOXU")
public class IMWZJOXU {

	@ObfuscatedName("IMWZJOXU.f")
	public int field995 = -1;

	@ObfuscatedName("IMWZJOXU.h")
	public int[] field997 = new int[6];

	@ObfuscatedName("IMWZJOXU.i")
	public int[] field998 = new int[6];

	@ObfuscatedName("IMWZJOXU.j")
	public int field999 = 128;

	@ObfuscatedName("IMWZJOXU.k")
	public int field1000 = 128;

	@ObfuscatedName("IMWZJOXU.o")
	public static LSUWSJDO field1004 = new LSUWSJDO(30);

	@ObfuscatedName("IMWZJOXU.l")
	public int field1001;

	@ObfuscatedName("IMWZJOXU.m")
	public int field1002;

	@ObfuscatedName("IMWZJOXU.n")
	public int field1003;

	@ObfuscatedName("IMWZJOXU.b")
	public static int field991;

	@ObfuscatedName("IMWZJOXU.d")
	public int field993;

	@ObfuscatedName("IMWZJOXU.e")
	public int field994;

	@ObfuscatedName("IMWZJOXU.g")
	public WOTIAWQC field996;

	@ObfuscatedName("IMWZJOXU.c")
	public static IMWZJOXU[] field992;

	@ObfuscatedName("IMWZJOXU.a(ILSRZUEVOD;)V")
	public static void method376(SRZUEVOD arg0) {
		LZWRHABP var1 = new LZWRHABP(arg0.method566("spotanim.dat", null));
		field991 = var1.method465();
		if (field992 == null) {
			field992 = new IMWZJOXU[field991];
		}

		for (int var2 = 0; var2 < field991; var2++) {
			if (field992[var2] == null) {
				field992[var2] = new IMWZJOXU();
			}

			field992[var2].field993 = var2;
			field992[var2].method377(var1);
		}
	}

	@ObfuscatedName("IMWZJOXU.a(ZLLZWRHABP;)V")
	public void method377(LZWRHABP arg0) {
		while (true) {
			int var2 = arg0.method463();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field994 = arg0.method465();
			} else if (var2 == 2) {
				field995 = arg0.method465();
				if (WOTIAWQC.field1470 != null) {
					field996 = WOTIAWQC.field1470[field995];
				}
			} else if (var2 == 4) {
				field999 = arg0.method465();
			} else if (var2 == 5) {
				field1000 = arg0.method465();
			} else if (var2 == 6) {
				field1001 = arg0.method465();
			} else if (var2 == 7) {
				field1002 = arg0.method463();
			} else if (var2 == 8) {
				field1003 = arg0.method463();
			} else if (var2 >= 40 && var2 < 50) {
				field997[var2 - 40] = arg0.method465();
			} else if (var2 >= 50 && var2 < 60) {
				field998[var2 - 50] = arg0.method465();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("IMWZJOXU.a()LLSSDQDBV;")
	public LSSDQDBV method378() {
		LSSDQDBV var1 = (LSSDQDBV) field1004.method448(field993);
		if (var1 != null) {
			return var1;
		}

		LSSDQDBV var2 = LSSDQDBV.method423(field994);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field997[0] != 0) {
				var2.method437(field997[var3], field998[var3]);
			}
		}

		field1004.method449(var2, field993);
		return var2;
	}
}
