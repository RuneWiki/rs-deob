package deob;

@ObfuscatedName("SXQCXZWK")
public class SXQCXZWK {

	@ObfuscatedName("SXQCXZWK.g")
	public boolean field1138 = false;

	@ObfuscatedName("SXQCXZWK.h")
	public int field1139 = -1;

	@ObfuscatedName("SXQCXZWK.a")
	public static int field1132;

	@ObfuscatedName("SXQCXZWK.d")
	public int field1135;

	@ObfuscatedName("SXQCXZWK.e")
	public int field1136;

	@ObfuscatedName("SXQCXZWK.f")
	public int field1137;

	@ObfuscatedName("SXQCXZWK.i")
	public int field1140;

	@ObfuscatedName("SXQCXZWK.c")
	public String field1134;

	@ObfuscatedName("SXQCXZWK.b")
	public static SXQCXZWK[] field1133;

	@ObfuscatedName("SXQCXZWK.a(LOTSGNSQM;Z)V")
	public static void method416(OTSGNSQM arg0) {
		YOXDZEVD var1 = new YOXDZEVD(arg0.method376("varbit.dat", null));
		field1132 = var1.method551();
		if (field1133 == null) {
			field1133 = new SXQCXZWK[field1132];
		}

		for (int var2 = 0; var2 < field1132; var2++) {
			if (field1133[var2] == null) {
				field1133[var2] = new SXQCXZWK();
			}

			field1133[var2].method417(var1, var2);

			if (field1133[var2].field1138) {
				BUSRYWAJ.field121[field1133[var2].field1135].field133 = true;
			}
		}

		if (var1.field1392.length != var1.field1393) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("SXQCXZWK.a(BLYOXDZEVD;I)V")
	public void method417(YOXDZEVD arg0, int arg1) {
		while (true) {
			int var3 = arg0.method549();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1135 = arg0.method551();
				field1136 = arg0.method549();
				field1137 = arg0.method549();
			} else if (var3 == 10) {
				field1134 = arg0.method556();
			} else if (var3 == 2) {
				field1138 = true;
			} else if (var3 == 3) {
				field1139 = arg0.method554();
			} else if (var3 == 4) {
				field1140 = arg0.method554();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
