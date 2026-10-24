package deob;

@ObfuscatedName("UDCHKCCJ")
public class UDCHKCCJ {

	@ObfuscatedName("UDCHKCCJ.h")
	public boolean field1400 = false;

	@ObfuscatedName("UDCHKCCJ.i")
	public int field1401 = -1;

	@ObfuscatedName("UDCHKCCJ.k")
	public boolean field1403 = true;

	@ObfuscatedName("UDCHKCCJ.b")
	public static int field1394;

	@ObfuscatedName("UDCHKCCJ.e")
	public int field1397;

	@ObfuscatedName("UDCHKCCJ.f")
	public int field1398;

	@ObfuscatedName("UDCHKCCJ.g")
	public int field1399;

	@ObfuscatedName("UDCHKCCJ.j")
	public int field1402;

	@ObfuscatedName("UDCHKCCJ.d")
	public String field1396;

	@ObfuscatedName("UDCHKCCJ.c")
	public static UDCHKCCJ[] field1395;

	@ObfuscatedName("UDCHKCCJ.a(BLJUPFHAZZ;)V")
	public static void method568(JUPFHAZZ arg0) {
		TKPFKOXP var1 = new TKPFKOXP(arg0.method372("varbit.dat", null));
		field1394 = var1.method531();
		if (field1395 == null) {
			field1395 = new UDCHKCCJ[field1394];
		}

		for (int var2 = 0; var2 < field1394; var2++) {
			if (field1395[var2] == null) {
				field1395[var2] = new UDCHKCCJ();
			}

			field1395[var2].method569(var1, var2);

			if (field1395[var2].field1400) {
				RGMKWKCG.field1207[field1395[var2].field1397].field1219 = true;
			}
		}

		if (var1.field1381.length != var1.field1382) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("UDCHKCCJ.a(LTKPFKOXP;II)V")
	public void method569(TKPFKOXP arg0, int arg1) {
		while (true) {
			int var3 = arg0.method529();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1397 = arg0.method531();
				field1398 = arg0.method529();
				field1399 = arg0.method529();
			} else if (var3 == 10) {
				field1396 = arg0.method536();
			} else if (var3 == 2) {
				field1400 = true;
			} else if (var3 == 3) {
				field1401 = arg0.method534();
			} else if (var3 == 4) {
				field1402 = arg0.method534();
			} else if (var3 == 5) {
				field1403 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
