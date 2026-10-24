package deob;

@ObfuscatedName("MWRUKLPF")
public class MWRUKLPF {

	@ObfuscatedName("MWRUKLPF.h")
	public boolean field1124 = false;

	@ObfuscatedName("MWRUKLPF.i")
	public int field1125 = -1;

	@ObfuscatedName("MWRUKLPF.b")
	public static int field1118;

	@ObfuscatedName("MWRUKLPF.e")
	public int field1121;

	@ObfuscatedName("MWRUKLPF.f")
	public int field1122;

	@ObfuscatedName("MWRUKLPF.g")
	public int field1123;

	@ObfuscatedName("MWRUKLPF.j")
	public int field1126;

	@ObfuscatedName("MWRUKLPF.d")
	public String field1120;

	@ObfuscatedName("MWRUKLPF.c")
	public static MWRUKLPF[] field1119;

	@ObfuscatedName("MWRUKLPF.a(LDYBMLHQM;Z)V")
	public static void method418(DYBMLHQM arg0) {
		INLHDAGO var1 = new INLHDAGO(arg0.method248("varbit.dat", null));
		field1118 = var1.method310();
		if (field1119 == null) {
			field1119 = new MWRUKLPF[field1118];
		}

		for (int var2 = 0; var2 < field1118; var2++) {
			if (field1119[var2] == null) {
				field1119[var2] = new MWRUKLPF();
			}

			field1119[var2].method419(var2, var1);

			if (field1119[var2].field1124) {
				VJTDBWRW.field1346[field1119[var2].field1121].field1358 = true;
			}
		}

		if (var1.field968.length != var1.field969) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("MWRUKLPF.a(IILINLHDAGO;)V")
	public void method419(int arg0, INLHDAGO arg1) {
		while (true) {
			int var3 = arg1.method308();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1121 = arg1.method310();
				field1122 = arg1.method308();
				field1123 = arg1.method308();
			} else if (var3 == 10) {
				field1120 = arg1.method315();
			} else if (var3 == 2) {
				field1124 = true;
			} else if (var3 == 3) {
				field1125 = arg1.method313();
			} else if (var3 == 4) {
				field1126 = arg1.method313();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
