package deob;

@ObfuscatedName("CYAEJBRE")
public class CYAEJBRE {

	@ObfuscatedName("CYAEJBRE.j")
	public boolean field558 = false;

	@ObfuscatedName("CYAEJBRE.k")
	public int field559 = -1;

	@ObfuscatedName("CYAEJBRE.d")
	public static int field552;

	@ObfuscatedName("CYAEJBRE.g")
	public int field555;

	@ObfuscatedName("CYAEJBRE.h")
	public int field556;

	@ObfuscatedName("CYAEJBRE.i")
	public int field557;

	@ObfuscatedName("CYAEJBRE.l")
	public int field560;

	@ObfuscatedName("CYAEJBRE.f")
	public String field554;

	@ObfuscatedName("CYAEJBRE.e")
	public static CYAEJBRE[] field553;

	@ObfuscatedName("CYAEJBRE.a(LCXFTMSCH;B)V")
	public static void method177(CXFTMSCH arg0) {
		MQZHAILV var1 = new MQZHAILV(arg0.method176("varbit.dat", null));
		field552 = var1.method327();
		if (field553 == null) {
			field553 = new CYAEJBRE[field552];
		}

		for (int var2 = 0; var2 < field552; var2++) {
			if (field553[var2] == null) {
				field553[var2] = new CYAEJBRE();
			}

			field553[var2].method178(var2, var1);

			if (field553[var2].field558) {
				CNLXCYXM.field488[field553[var2].field555].field500 = true;
			}
		}

		if (var1.field796.length != var1.field797) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("CYAEJBRE.a(BILMQZHAILV;)V")
	public void method178(int arg0, MQZHAILV arg1) {
		while (true) {
			int var3 = arg1.method325();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field555 = arg1.method327();
				field556 = arg1.method325();
				field557 = arg1.method325();
			} else if (var3 == 10) {
				field554 = arg1.method332();
			} else if (var3 == 2) {
				field558 = true;
			} else if (var3 == 3) {
				field559 = arg1.method330();
			} else if (var3 == 4) {
				field560 = arg1.method330();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
