package deob;

@ObfuscatedName("OHEMVFER")
public class OHEMVFER {

	@ObfuscatedName("OHEMVFER.h")
	public boolean field1042 = false;

	@ObfuscatedName("OHEMVFER.i")
	public int field1043 = -1;

	@ObfuscatedName("OHEMVFER.k")
	public boolean field1045 = true;

	@ObfuscatedName("OHEMVFER.b")
	public static int field1036;

	@ObfuscatedName("OHEMVFER.e")
	public int field1039;

	@ObfuscatedName("OHEMVFER.f")
	public int field1040;

	@ObfuscatedName("OHEMVFER.g")
	public int field1041;

	@ObfuscatedName("OHEMVFER.j")
	public int field1044;

	@ObfuscatedName("OHEMVFER.d")
	public String field1038;

	@ObfuscatedName("OHEMVFER.c")
	public static OHEMVFER[] field1037;

	@ObfuscatedName("OHEMVFER.a(ILINOFEYKQ;)V")
	public static void method419(INOFEYKQ arg0) {
		NHEPCMLW var1 = new NHEPCMLW(arg0.method277("varbit.dat", null));
		field1036 = var1.method351();
		if (field1037 == null) {
			field1037 = new OHEMVFER[field1036];
		}

		for (int var2 = 0; var2 < field1036; var2++) {
			if (field1037[var2] == null) {
				field1037[var2] = new OHEMVFER();
			}

			field1037[var2].method420(var1, var2);

			if (field1037[var2].field1042) {
				LZWYDZNA.field940[field1037[var2].field1039].field952 = true;
			}
		}

		if (var1.field964.length != var1.field965) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("OHEMVFER.a(ILNHEPCMLW;I)V")
	public void method420(NHEPCMLW arg0, int arg1) {
		while (true) {
			int var3 = arg0.method349();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1039 = arg0.method351();
				field1040 = arg0.method349();
				field1041 = arg0.method349();
			} else if (var3 == 10) {
				field1038 = arg0.method356();
			} else if (var3 == 2) {
				field1042 = true;
			} else if (var3 == 3) {
				field1043 = arg0.method354();
			} else if (var3 == 4) {
				field1044 = arg0.method354();
			} else if (var3 == 5) {
				field1045 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
