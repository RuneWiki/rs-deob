package deob;

@ObfuscatedName("TYXORIIC")
public class TYXORIIC {

	@ObfuscatedName("TYXORIIC.e")
	public int field1251 = -1;

	@ObfuscatedName("TYXORIIC.g")
	public int[] field1253 = new int[6];

	@ObfuscatedName("TYXORIIC.h")
	public int[] field1254 = new int[6];

	@ObfuscatedName("TYXORIIC.i")
	public int field1255 = 128;

	@ObfuscatedName("TYXORIIC.j")
	public int field1256 = 128;

	@ObfuscatedName("TYXORIIC.n")
	public static DSCQIAPU field1260 = new DSCQIAPU(30);

	@ObfuscatedName("TYXORIIC.a")
	public static int field1247;

	@ObfuscatedName("TYXORIIC.c")
	public int field1249;

	@ObfuscatedName("TYXORIIC.d")
	public int field1250;

	@ObfuscatedName("TYXORIIC.k")
	public int field1257;

	@ObfuscatedName("TYXORIIC.l")
	public int field1258;

	@ObfuscatedName("TYXORIIC.m")
	public int field1259;

	@ObfuscatedName("TYXORIIC.f")
	public PVVHTYPN field1252;

	@ObfuscatedName("TYXORIIC.b")
	public static TYXORIIC[] field1248;

	@ObfuscatedName("TYXORIIC.a(BLRPFMUSNN;)V")
	public static void method434(RPFMUSNN arg0) {
		WNCFPLWV var1 = new WNCFPLWV(arg0.method414("spotanim.dat", null));
		field1247 = var1.method504();
		if (field1248 == null) {
			field1248 = new TYXORIIC[field1247];
		}

		for (int var2 = 0; var2 < field1247; var2++) {
			if (field1248[var2] == null) {
				field1248[var2] = new TYXORIIC();
			}

			field1248[var2].field1249 = var2;
			field1248[var2].method435(var1);
		}
	}

	@ObfuscatedName("TYXORIIC.a(ILWNCFPLWV;)V")
	public void method435(WNCFPLWV arg0) {
		while (true) {
			int var2 = arg0.method502();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1250 = arg0.method504();
			} else if (var2 == 2) {
				field1251 = arg0.method504();
				if (PVVHTYPN.field1006 != null) {
					field1252 = PVVHTYPN.field1006[field1251];
				}
			} else if (var2 == 4) {
				field1255 = arg0.method504();
			} else if (var2 == 5) {
				field1256 = arg0.method504();
			} else if (var2 == 6) {
				field1257 = arg0.method504();
			} else if (var2 == 7) {
				field1258 = arg0.method502();
			} else if (var2 == 8) {
				field1259 = arg0.method502();
			} else if (var2 >= 40 && var2 < 50) {
				field1253[var2 - 40] = arg0.method504();
			} else if (var2 >= 50 && var2 < 60) {
				field1254[var2 - 50] = arg0.method504();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("TYXORIIC.a()LUNLYQRUD;")
	public UNLYQRUD method436() {
		UNLYQRUD var1 = (UNLYQRUD) field1260.method179(field1249);
		if (var1 != null) {
			return var1;
		}

		UNLYQRUD var2 = UNLYQRUD.method442(field1250);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1253[0] != 0) {
				var2.method456(field1253[var3], field1254[var3]);
			}
		}

		field1260.method180(var2, field1249);
		return var2;
	}
}
