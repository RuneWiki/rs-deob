package deob;

@ObfuscatedName("UNSYPSHF")
public class UNSYPSHF {

	@ObfuscatedName("UNSYPSHF.g")
	public boolean field1296 = false;

	@ObfuscatedName("UNSYPSHF.h")
	public int field1297 = -1;

	@ObfuscatedName("UNSYPSHF.j")
	public boolean field1299 = true;

	@ObfuscatedName("UNSYPSHF.a")
	public static int field1290;

	@ObfuscatedName("UNSYPSHF.d")
	public int field1293;

	@ObfuscatedName("UNSYPSHF.e")
	public int field1294;

	@ObfuscatedName("UNSYPSHF.f")
	public int field1295;

	@ObfuscatedName("UNSYPSHF.i")
	public int field1298;

	@ObfuscatedName("UNSYPSHF.c")
	public String field1292;

	@ObfuscatedName("UNSYPSHF.b")
	public static UNSYPSHF[] field1291;

	@ObfuscatedName("UNSYPSHF.a(ILRVLWVPJQ;)V")
	public static void method498(RVLWVPJQ arg0) {
		UAWAYCTK var1 = new UAWAYCTK(arg0.method424("varbit.dat", null));
		field1290 = var1.method457();
		if (field1291 == null) {
			field1291 = new UNSYPSHF[field1290];
		}

		for (int var2 = 0; var2 < field1290; var2++) {
			if (field1291[var2] == null) {
				field1291[var2] = new UNSYPSHF();
			}

			field1291[var2].method499(var1, var2);

			if (field1291[var2].field1296) {
				RRCEOPDB.field1137[field1291[var2].field1293].field1149 = true;
			}
		}

		if (var1.field1251.length != var1.field1252) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("UNSYPSHF.a(LUAWAYCTK;II)V")
	public void method499(UAWAYCTK arg0, int arg1) {
		while (true) {
			int var3 = arg0.method455();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1293 = arg0.method457();
				field1294 = arg0.method455();
				field1295 = arg0.method455();
			} else if (var3 == 10) {
				field1292 = arg0.method462();
			} else if (var3 == 2) {
				field1296 = true;
			} else if (var3 == 3) {
				field1297 = arg0.method460();
			} else if (var3 == 4) {
				field1298 = arg0.method460();
			} else if (var3 == 5) {
				field1299 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
