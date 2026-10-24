package deob;

@ObfuscatedName("DPQEBGAZ")
public class DPQEBGAZ {

	@ObfuscatedName("DPQEBGAZ.h")
	public boolean field537 = false;

	@ObfuscatedName("DPQEBGAZ.i")
	public int field538 = -1;

	@ObfuscatedName("DPQEBGAZ.k")
	public boolean field540 = true;

	@ObfuscatedName("DPQEBGAZ.b")
	public static int field531;

	@ObfuscatedName("DPQEBGAZ.e")
	public int field534;

	@ObfuscatedName("DPQEBGAZ.f")
	public int field535;

	@ObfuscatedName("DPQEBGAZ.g")
	public int field536;

	@ObfuscatedName("DPQEBGAZ.j")
	public int field539;

	@ObfuscatedName("DPQEBGAZ.d")
	public String field533;

	@ObfuscatedName("DPQEBGAZ.c")
	public static DPQEBGAZ[] field532;

	@ObfuscatedName("DPQEBGAZ.a(BLESUFCMYV;)V")
	public static void method202(ESUFCMYV arg0) {
		RGCGKKUR var1 = new RGCGKKUR(arg0.method205("varbit.dat", null));
		field531 = var1.method457();
		if (field532 == null) {
			field532 = new DPQEBGAZ[field531];
		}

		for (int var2 = 0; var2 < field531; var2++) {
			if (field532[var2] == null) {
				field532[var2] = new DPQEBGAZ();
			}

			field532[var2].method203(var1, var2);

			if (field532[var2].field537) {
				TLLQKWNZ.field1393[field532[var2].field534].field1405 = true;
			}
		}

		if (var1.field1349.length != var1.field1350) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("DPQEBGAZ.a(LRGCGKKUR;II)V")
	public void method203(RGCGKKUR arg0, int arg1) {
		while (true) {
			int var3 = arg0.method455();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field534 = arg0.method457();
				field535 = arg0.method455();
				field536 = arg0.method455();
			} else if (var3 == 10) {
				field533 = arg0.method462();
			} else if (var3 == 2) {
				field537 = true;
			} else if (var3 == 3) {
				field538 = arg0.method460();
			} else if (var3 == 4) {
				field539 = arg0.method460();
			} else if (var3 == 5) {
				field540 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
