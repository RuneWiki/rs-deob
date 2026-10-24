package deob;

@ObfuscatedName("GQWQHTHS")
public class GQWQHTHS {

	@ObfuscatedName("GQWQHTHS.h")
	public boolean field562 = false;

	@ObfuscatedName("GQWQHTHS.i")
	public int field563 = -1;

	@ObfuscatedName("GQWQHTHS.k")
	public boolean field565 = true;

	@ObfuscatedName("GQWQHTHS.b")
	public static int field556;

	@ObfuscatedName("GQWQHTHS.e")
	public int field559;

	@ObfuscatedName("GQWQHTHS.f")
	public int field560;

	@ObfuscatedName("GQWQHTHS.g")
	public int field561;

	@ObfuscatedName("GQWQHTHS.j")
	public int field564;

	@ObfuscatedName("GQWQHTHS.d")
	public String field558;

	@ObfuscatedName("GQWQHTHS.c")
	public static GQWQHTHS[] field557;

	@ObfuscatedName("GQWQHTHS.a(LWEMOPWVJ;I)V")
	public static void method186(WEMOPWVJ arg0) {
		SVWJKJVI var1 = new SVWJKJVI(arg0.method559("varbit.dat", null));
		field556 = var1.method463();
		if (field557 == null) {
			field557 = new GQWQHTHS[field556];
		}

		for (int var2 = 0; var2 < field556; var2++) {
			if (field557[var2] == null) {
				field557[var2] = new GQWQHTHS();
			}

			field557[var2].method187(var2, var1);

			if (field557[var2].field562) {
				KHDRIUSF.field803[field557[var2].field559].field815 = true;
			}
		}

		if (var1.field1262.length != var1.field1263) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("GQWQHTHS.a(IZLSVWJKJVI;)V")
	public void method187(int arg0, SVWJKJVI arg1) {
		while (true) {
			int var3 = arg1.method461();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field559 = arg1.method463();
				field560 = arg1.method461();
				field561 = arg1.method461();
			} else if (var3 == 10) {
				field558 = arg1.method468();
			} else if (var3 == 2) {
				field562 = true;
			} else if (var3 == 3) {
				field563 = arg1.method466();
			} else if (var3 == 4) {
				field564 = arg1.method466();
			} else if (var3 == 5) {
				field565 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
