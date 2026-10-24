package deob;

@ObfuscatedName("NPQMEWIH")
public class NPQMEWIH {

	@ObfuscatedName("NPQMEWIH.g")
	public boolean field1079 = false;

	@ObfuscatedName("NPQMEWIH.h")
	public int field1080 = -1;

	@ObfuscatedName("NPQMEWIH.j")
	public boolean field1082 = true;

	@ObfuscatedName("NPQMEWIH.a")
	public static int field1073;

	@ObfuscatedName("NPQMEWIH.d")
	public int field1076;

	@ObfuscatedName("NPQMEWIH.e")
	public int field1077;

	@ObfuscatedName("NPQMEWIH.f")
	public int field1078;

	@ObfuscatedName("NPQMEWIH.i")
	public int field1081;

	@ObfuscatedName("NPQMEWIH.c")
	public String field1075;

	@ObfuscatedName("NPQMEWIH.b")
	public static NPQMEWIH[] field1074;

	@ObfuscatedName("NPQMEWIH.a(LNXFIIFAD;I)V")
	public static void method425(NXFIIFAD arg0) {
		MNKDCXXG var1 = new MNKDCXXG(arg0.method431("varbit.dat", null));
		field1073 = var1.method388();
		if (field1074 == null) {
			field1074 = new NPQMEWIH[field1073];
		}

		for (int var2 = 0; var2 < field1073; var2++) {
			if (field1074[var2] == null) {
				field1074[var2] = new NPQMEWIH();
			}

			field1074[var2].method426(var1, var2);

			if (field1074[var2].field1079) {
				GQDAZHGX.field714[field1074[var2].field1076].field726 = true;
			}
		}

		if (var1.field1054.length != var1.field1055) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("NPQMEWIH.a(LMNKDCXXG;ZI)V")
	public void method426(MNKDCXXG arg0, int arg1) {
		while (true) {
			int var3 = arg0.method386();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1076 = arg0.method388();
				field1077 = arg0.method386();
				field1078 = arg0.method386();
			} else if (var3 == 10) {
				field1075 = arg0.method393();
			} else if (var3 == 2) {
				field1079 = true;
			} else if (var3 == 3) {
				field1080 = arg0.method391();
			} else if (var3 == 4) {
				field1081 = arg0.method391();
			} else if (var3 == 5) {
				field1082 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
