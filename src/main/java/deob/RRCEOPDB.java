package deob;

@ObfuscatedName("RRCEOPDB")
public class RRCEOPDB {

	@ObfuscatedName("RRCEOPDB.h")
	public boolean field1143 = false;

	@ObfuscatedName("RRCEOPDB.i")
	public boolean field1144 = true;

	@ObfuscatedName("RRCEOPDB.k")
	public boolean field1146 = false;

	@ObfuscatedName("RRCEOPDB.n")
	public boolean field1149 = false;

	@ObfuscatedName("RRCEOPDB.o")
	public int field1150 = -1;

	@ObfuscatedName("RRCEOPDB.p")
	public boolean field1151 = true;

	@ObfuscatedName("RRCEOPDB.a")
	public static int field1136;

	@ObfuscatedName("RRCEOPDB.c")
	public static int field1138;

	@ObfuscatedName("RRCEOPDB.f")
	public int field1141;

	@ObfuscatedName("RRCEOPDB.g")
	public int field1142;

	@ObfuscatedName("RRCEOPDB.j")
	public int field1145;

	@ObfuscatedName("RRCEOPDB.l")
	public int field1147;

	@ObfuscatedName("RRCEOPDB.m")
	public int field1148;

	@ObfuscatedName("RRCEOPDB.e")
	public String field1140;

	@ObfuscatedName("RRCEOPDB.d")
	public static int[] field1139;

	@ObfuscatedName("RRCEOPDB.b")
	public static RRCEOPDB[] field1137;

	@ObfuscatedName("RRCEOPDB.a(ILRVLWVPJQ;)V")
	public static void method421(RVLWVPJQ arg0) {
		UAWAYCTK var1 = new UAWAYCTK(arg0.method424("varp.dat", null));
		field1138 = 0;
		field1136 = var1.method457();
		if (field1137 == null) {
			field1137 = new RRCEOPDB[field1136];
		}

		if (field1139 == null) {
			field1139 = new int[field1136];
		}

		for (int var2 = 0; var2 < field1136; var2++) {
			if (field1137[var2] == null) {
				field1137[var2] = new RRCEOPDB();
			}

			field1137[var2].method422(var1, var2);
		}

		if (var1.field1251.length != var1.field1252) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("RRCEOPDB.a(LUAWAYCTK;II)V")
	public void method422(UAWAYCTK arg0, int arg1) {
		while (true) {
			int var3 = arg0.method455();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1141 = arg0.method455();
			} else if (var3 == 2) {
				field1142 = arg0.method455();
			} else if (var3 == 3) {
				field1143 = true;
				field1139[field1138++] = arg1;
			} else if (var3 == 4) {
				field1144 = false;
			} else if (var3 == 5) {
				field1145 = arg0.method457();
			} else if (var3 == 6) {
				field1146 = true;
			} else if (var3 == 7) {
				field1147 = arg0.method460();
			} else if (var3 == 8) {
				field1148 = 1;
				field1149 = true;
			} else if (var3 == 10) {
				field1140 = arg0.method462();
			} else if (var3 == 11) {
				field1149 = true;
			} else if (var3 == 12) {
				field1150 = arg0.method460();
			} else if (var3 == 13) {
				field1148 = 2;
				field1149 = true;
			} else if (var3 == 14) {
				field1151 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
