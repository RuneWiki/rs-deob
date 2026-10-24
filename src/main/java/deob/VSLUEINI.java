package deob;

@ObfuscatedName("VSLUEINI")
public class VSLUEINI {

	@ObfuscatedName("VSLUEINI.g")
	public boolean field1399 = false;

	@ObfuscatedName("VSLUEINI.h")
	public int field1400 = -1;

	@ObfuscatedName("VSLUEINI.a")
	public static int field1393;

	@ObfuscatedName("VSLUEINI.d")
	public int field1396;

	@ObfuscatedName("VSLUEINI.e")
	public int field1397;

	@ObfuscatedName("VSLUEINI.f")
	public int field1398;

	@ObfuscatedName("VSLUEINI.i")
	public int field1401;

	@ObfuscatedName("VSLUEINI.c")
	public String field1395;

	@ObfuscatedName("VSLUEINI.b")
	public static VSLUEINI[] field1394;

	@ObfuscatedName("VSLUEINI.a(ILQKFGLETG;)V")
	public static void method520(QKFGLETG arg0) {
		XJCNBMKS var1 = new XJCNBMKS(arg0.method402("varbit.dat", null));
		field1393 = var1.method536();
		if (field1394 == null) {
			field1394 = new VSLUEINI[field1393];
		}

		for (int var2 = 0; var2 < field1393; var2++) {
			if (field1394[var2] == null) {
				field1394[var2] = new VSLUEINI();
			}

			field1394[var2].method521(var1, var2);

			if (field1394[var2].field1399) {
				NYAYDXBO.field984[field1394[var2].field1396].field996 = true;
			}
		}

		if (var1.field1402.length != var1.field1403) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("VSLUEINI.a(LXJCNBMKS;II)V")
	public void method521(XJCNBMKS arg0, int arg1) {
		while (true) {
			int var3 = arg0.method534();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1396 = arg0.method536();
				field1397 = arg0.method534();
				field1398 = arg0.method534();
			} else if (var3 == 10) {
				field1395 = arg0.method541();
			} else if (var3 == 2) {
				field1399 = true;
			} else if (var3 == 3) {
				field1400 = arg0.method539();
			} else if (var3 == 4) {
				field1401 = arg0.method539();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
