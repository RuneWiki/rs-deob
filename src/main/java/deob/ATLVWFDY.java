package deob;

@ObfuscatedName("ATLVWFDY")
public class ATLVWFDY {

	@ObfuscatedName("ATLVWFDY.g")
	public boolean field74 = false;

	@ObfuscatedName("ATLVWFDY.h")
	public int field75 = -1;

	@ObfuscatedName("ATLVWFDY.j")
	public boolean field77 = true;

	@ObfuscatedName("ATLVWFDY.a")
	public static int field68;

	@ObfuscatedName("ATLVWFDY.d")
	public int field71;

	@ObfuscatedName("ATLVWFDY.e")
	public int field72;

	@ObfuscatedName("ATLVWFDY.f")
	public int field73;

	@ObfuscatedName("ATLVWFDY.i")
	public int field76;

	@ObfuscatedName("ATLVWFDY.c")
	public String field70;

	@ObfuscatedName("ATLVWFDY.b")
	public static ATLVWFDY[] field69;

	@ObfuscatedName("ATLVWFDY.a(BLSXKKBWPU;)V")
	public static void method24(SXKKBWPU arg0) {
		TQYMAXSO var1 = new TQYMAXSO(arg0.method442("varbit.dat", null));
		field68 = var1.method470();
		if (field69 == null) {
			field69 = new ATLVWFDY[field68];
		}

		for (int var2 = 0; var2 < field68; var2++) {
			if (field69[var2] == null) {
				field69[var2] = new ATLVWFDY();
			}

			field69[var2].method25(var2, var1);

			if (field69[var2].field74) {
				MUUMFTDK.field962[field69[var2].field71].field974 = true;
			}
		}

		if (var1.field1262.length != var1.field1263) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("ATLVWFDY.a(IILTQYMAXSO;)V")
	public void method25(int arg0, TQYMAXSO arg1) {
		while (true) {
			int var3 = arg1.method468();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field71 = arg1.method470();
				field72 = arg1.method468();
				field73 = arg1.method468();
			} else if (var3 == 10) {
				field70 = arg1.method475();
			} else if (var3 == 2) {
				field74 = true;
			} else if (var3 == 3) {
				field75 = arg1.method473();
			} else if (var3 == 4) {
				field76 = arg1.method473();
			} else if (var3 == 5) {
				field77 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
