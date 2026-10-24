package deob;

@ObfuscatedName("GDBQCAOA")
public class GDBQCAOA {

	@ObfuscatedName("GDBQCAOA.g")
	public boolean field706 = false;

	@ObfuscatedName("GDBQCAOA.h")
	public int field707 = -1;

	@ObfuscatedName("GDBQCAOA.j")
	public boolean field709 = true;

	@ObfuscatedName("GDBQCAOA.a")
	public static int field700;

	@ObfuscatedName("GDBQCAOA.d")
	public int field703;

	@ObfuscatedName("GDBQCAOA.e")
	public int field704;

	@ObfuscatedName("GDBQCAOA.f")
	public int field705;

	@ObfuscatedName("GDBQCAOA.i")
	public int field708;

	@ObfuscatedName("GDBQCAOA.c")
	public String field702;

	@ObfuscatedName("GDBQCAOA.b")
	public static GDBQCAOA[] field701;

	@ObfuscatedName("GDBQCAOA.a(ILQDHHNYHL;)V")
	public static void method275(QDHHNYHL arg0) {
		PGNBHFUF var1 = new PGNBHFUF(arg0.method488("varbit.dat", null));
		field700 = var1.method422();
		if (field701 == null) {
			field701 = new GDBQCAOA[field700];
		}

		for (int var2 = 0; var2 < field700; var2++) {
			if (field701[var2] == null) {
				field701[var2] = new GDBQCAOA();
			}

			field701[var2].method276(var1, var2);

			if (field701[var2].field706) {
				ZWNTUTST.field1473[field701[var2].field703].field1485 = true;
			}
		}

		if (var1.field1081.length != var1.field1082) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("GDBQCAOA.a(BLPGNBHFUF;I)V")
	public void method276(PGNBHFUF arg0, int arg1) {
		while (true) {
			int var3 = arg0.method420();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field703 = arg0.method422();
				field704 = arg0.method420();
				field705 = arg0.method420();
			} else if (var3 == 10) {
				field702 = arg0.method427();
			} else if (var3 == 2) {
				field706 = true;
			} else if (var3 == 3) {
				field707 = arg0.method425();
			} else if (var3 == 4) {
				field708 = arg0.method425();
			} else if (var3 == 5) {
				field709 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
