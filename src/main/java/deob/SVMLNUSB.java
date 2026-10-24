package deob;

@ObfuscatedName("SVMLNUSB")
public class SVMLNUSB {

	@ObfuscatedName("SVMLNUSB.i")
	public boolean field1217 = false;

	@ObfuscatedName("SVMLNUSB.j")
	public boolean field1218 = true;

	@ObfuscatedName("SVMLNUSB.l")
	public boolean field1220 = false;

	@ObfuscatedName("SVMLNUSB.o")
	public boolean field1223 = false;

	@ObfuscatedName("SVMLNUSB.p")
	public int field1224 = -1;

	@ObfuscatedName("SVMLNUSB.q")
	public boolean field1225 = true;

	@ObfuscatedName("SVMLNUSB.b")
	public static int field1210;

	@ObfuscatedName("SVMLNUSB.d")
	public static int field1212;

	@ObfuscatedName("SVMLNUSB.g")
	public int field1215;

	@ObfuscatedName("SVMLNUSB.h")
	public int field1216;

	@ObfuscatedName("SVMLNUSB.k")
	public int field1219;

	@ObfuscatedName("SVMLNUSB.m")
	public int field1221;

	@ObfuscatedName("SVMLNUSB.n")
	public int field1222;

	@ObfuscatedName("SVMLNUSB.f")
	public String field1214;

	@ObfuscatedName("SVMLNUSB.e")
	public static int[] field1213;

	@ObfuscatedName("SVMLNUSB.c")
	public static SVMLNUSB[] field1211;

	@ObfuscatedName("SVMLNUSB.a(LHBJEXSJX;Z)V")
	public static void method522(HBJEXSJX arg0) {
		EYMNCFMK var1 = new EYMNCFMK(arg0.method348("varp.dat", null));
		field1212 = 0;
		field1210 = var1.method241();
		if (field1211 == null) {
			field1211 = new SVMLNUSB[field1210];
		}

		if (field1213 == null) {
			field1213 = new int[field1210];
		}

		for (int var2 = 0; var2 < field1210; var2++) {
			if (field1211[var2] == null) {
				field1211[var2] = new SVMLNUSB();
			}

			field1211[var2].method523(var2, var1);
		}

		if (var1.field678.length != var1.field679) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("SVMLNUSB.a(ILEYMNCFMK;I)V")
	public void method523(int arg0, EYMNCFMK arg1) {
		while (true) {
			int var3 = arg1.method239();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1215 = arg1.method239();
			} else if (var3 == 2) {
				field1216 = arg1.method239();
			} else if (var3 == 3) {
				field1217 = true;
				field1213[field1212++] = arg0;
			} else if (var3 == 4) {
				field1218 = false;
			} else if (var3 == 5) {
				field1219 = arg1.method241();
			} else if (var3 == 6) {
				field1220 = true;
			} else if (var3 == 7) {
				field1221 = arg1.method244();
			} else if (var3 == 8) {
				field1222 = 1;
				field1223 = true;
			} else if (var3 == 10) {
				field1214 = arg1.method246();
			} else if (var3 == 11) {
				field1223 = true;
			} else if (var3 == 12) {
				field1224 = arg1.method244();
			} else if (var3 == 13) {
				field1222 = 2;
				field1223 = true;
			} else if (var3 == 14) {
				field1225 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
