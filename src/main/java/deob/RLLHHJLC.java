package deob;

@ObfuscatedName("RLLHHJLC")
public class RLLHHJLC {

	@ObfuscatedName("RLLHHJLC.i")
	public boolean field1053 = false;

	@ObfuscatedName("RLLHHJLC.j")
	public int field1054 = -1;

	@ObfuscatedName("RLLHHJLC.l")
	public boolean field1056 = true;

	@ObfuscatedName("RLLHHJLC.c")
	public static int field1047;

	@ObfuscatedName("RLLHHJLC.f")
	public int field1050;

	@ObfuscatedName("RLLHHJLC.g")
	public int field1051;

	@ObfuscatedName("RLLHHJLC.h")
	public int field1052;

	@ObfuscatedName("RLLHHJLC.k")
	public int field1055;

	@ObfuscatedName("RLLHHJLC.e")
	public String field1049;

	@ObfuscatedName("RLLHHJLC.d")
	public static RLLHHJLC[] field1048;

	@ObfuscatedName("RLLHHJLC.a(ILUUIGNTAD;)V")
	public static void method430(UUIGNTAD arg0) {
		CMGGUSPR var1 = new CMGGUSPR(arg0.method545("varbit.dat", null));
		field1047 = var1.method196();
		if (field1048 == null) {
			field1048 = new RLLHHJLC[field1047];
		}

		for (int var2 = 0; var2 < field1047; var2++) {
			if (field1048[var2] == null) {
				field1048[var2] = new RLLHHJLC();
			}

			field1048[var2].method431(var1, var2);

			if (field1048[var2].field1053) {
				ATZMJNZU.field16[field1048[var2].field1050].field28 = true;
			}
		}

		if (var1.field539.length != var1.field540) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("RLLHHJLC.a(LCMGGUSPR;II)V")
	public void method431(CMGGUSPR arg0, int arg1) {
		while (true) {
			int var3 = arg0.method194();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1050 = arg0.method196();
				field1051 = arg0.method194();
				field1052 = arg0.method194();
			} else if (var3 == 10) {
				field1049 = arg0.method201();
			} else if (var3 == 2) {
				field1053 = true;
			} else if (var3 == 3) {
				field1054 = arg0.method199();
			} else if (var3 == 4) {
				field1055 = arg0.method199();
			} else if (var3 == 5) {
				field1056 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
