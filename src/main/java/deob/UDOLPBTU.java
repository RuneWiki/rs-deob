package deob;

@ObfuscatedName("UDOLPBTU")
public class UDOLPBTU {

	@ObfuscatedName("UDOLPBTU.h")
	public boolean field1387 = false;

	@ObfuscatedName("UDOLPBTU.i")
	public int field1388 = -1;

	@ObfuscatedName("UDOLPBTU.k")
	public boolean field1390 = true;

	@ObfuscatedName("UDOLPBTU.b")
	public static int field1381;

	@ObfuscatedName("UDOLPBTU.e")
	public int field1384;

	@ObfuscatedName("UDOLPBTU.f")
	public int field1385;

	@ObfuscatedName("UDOLPBTU.g")
	public int field1386;

	@ObfuscatedName("UDOLPBTU.j")
	public int field1389;

	@ObfuscatedName("UDOLPBTU.d")
	public String field1383;

	@ObfuscatedName("UDOLPBTU.c")
	public static UDOLPBTU[] field1382;

	@ObfuscatedName("UDOLPBTU.a(LLKPVZAQN;I)V")
	public static void method495(LKPVZAQN arg0) {
		WBEWPIXO var1 = new WBEWPIXO(arg0.method323("varbit.dat", null));
		field1381 = var1.method517();
		if (field1382 == null) {
			field1382 = new UDOLPBTU[field1381];
		}

		for (int var2 = 0; var2 < field1381; var2++) {
			if (field1382[var2] == null) {
				field1382[var2] = new UDOLPBTU();
			}

			field1382[var2].method496(var1, var2);

			if (field1382[var2].field1387) {
				XDAGNEWI.field1449[field1382[var2].field1384].field1461 = true;
			}
		}

		if (var1.field1400.length != var1.field1401) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("UDOLPBTU.a(LWBEWPIXO;II)V")
	public void method496(WBEWPIXO arg0, int arg1) {
		while (true) {
			int var3 = arg0.method515();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1384 = arg0.method517();
				field1385 = arg0.method515();
				field1386 = arg0.method515();
			} else if (var3 == 10) {
				field1383 = arg0.method522();
			} else if (var3 == 2) {
				field1387 = true;
			} else if (var3 == 3) {
				field1388 = arg0.method520();
			} else if (var3 == 4) {
				field1389 = arg0.method520();
			} else if (var3 == 5) {
				field1390 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
