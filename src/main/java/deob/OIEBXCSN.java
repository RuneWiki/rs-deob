package deob;

@ObfuscatedName("OIEBXCSN")
public class OIEBXCSN {

	@ObfuscatedName("OIEBXCSN.h")
	public boolean field1024 = false;

	@ObfuscatedName("OIEBXCSN.i")
	public int field1025 = -1;

	@ObfuscatedName("OIEBXCSN.k")
	public boolean field1027 = true;

	@ObfuscatedName("OIEBXCSN.b")
	public static int field1018;

	@ObfuscatedName("OIEBXCSN.e")
	public int field1021;

	@ObfuscatedName("OIEBXCSN.f")
	public int field1022;

	@ObfuscatedName("OIEBXCSN.g")
	public int field1023;

	@ObfuscatedName("OIEBXCSN.j")
	public int field1026;

	@ObfuscatedName("OIEBXCSN.d")
	public String field1020;

	@ObfuscatedName("OIEBXCSN.c")
	public static OIEBXCSN[] field1019;

	@ObfuscatedName("OIEBXCSN.a(LDTIATKJO;I)V")
	public static void method385(DTIATKJO arg0) {
		GHHPHSRU var1 = new GHHPHSRU(arg0.method168("varbit.dat", null));
		field1018 = var1.method204();
		if (field1019 == null) {
			field1019 = new OIEBXCSN[field1018];
		}

		for (int var2 = 0; var2 < field1018; var2++) {
			if (field1019[var2] == null) {
				field1019[var2] = new OIEBXCSN();
			}

			field1019[var2].method386(var2, var1);

			if (field1019[var2].field1024) {
				QORKDXHW.field1177[field1019[var2].field1021].field1189 = true;
			}
		}

		if (var1.field666.length != var1.field667) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("OIEBXCSN.a(IILGHHPHSRU;)V")
	public void method386(int arg0, GHHPHSRU arg1) {
		while (true) {
			int var3 = arg1.method202();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1021 = arg1.method204();
				field1022 = arg1.method202();
				field1023 = arg1.method202();
			} else if (var3 == 10) {
				field1020 = arg1.method209();
			} else if (var3 == 2) {
				field1024 = true;
			} else if (var3 == 3) {
				field1025 = arg1.method207();
			} else if (var3 == 4) {
				field1026 = arg1.method207();
			} else if (var3 == 5) {
				field1027 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
