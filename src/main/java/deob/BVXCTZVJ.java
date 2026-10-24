package deob;

@ObfuscatedName("BVXCTZVJ")
public class BVXCTZVJ {

	@ObfuscatedName("BVXCTZVJ.g")
	public boolean field114 = false;

	@ObfuscatedName("BVXCTZVJ.h")
	public int field115 = -1;

	@ObfuscatedName("BVXCTZVJ.j")
	public boolean field117 = true;

	@ObfuscatedName("BVXCTZVJ.a")
	public static int field108;

	@ObfuscatedName("BVXCTZVJ.d")
	public int field111;

	@ObfuscatedName("BVXCTZVJ.e")
	public int field112;

	@ObfuscatedName("BVXCTZVJ.f")
	public int field113;

	@ObfuscatedName("BVXCTZVJ.i")
	public int field116;

	@ObfuscatedName("BVXCTZVJ.c")
	public String field110;

	@ObfuscatedName("BVXCTZVJ.b")
	public static BVXCTZVJ[] field109;

	@ObfuscatedName("BVXCTZVJ.a(LHBJEXSJX;Z)V")
	public static void method44(HBJEXSJX arg0) {
		EYMNCFMK var1 = new EYMNCFMK(arg0.method348("varbit.dat", null));
		field108 = var1.method241();
		if (field109 == null) {
			field109 = new BVXCTZVJ[field108];
		}

		for (int var2 = 0; var2 < field108; var2++) {
			if (field109[var2] == null) {
				field109[var2] = new BVXCTZVJ();
			}

			field109[var2].method45(var2, var1);

			if (field109[var2].field114) {
				SVMLNUSB.field1211[field109[var2].field111].field1223 = true;
			}
		}

		if (var1.field678.length != var1.field679) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("BVXCTZVJ.a(ILEYMNCFMK;I)V")
	public void method45(int arg0, EYMNCFMK arg1) {
		while (true) {
			int var3 = arg1.method239();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field111 = arg1.method241();
				field112 = arg1.method239();
				field113 = arg1.method239();
			} else if (var3 == 10) {
				field110 = arg1.method246();
			} else if (var3 == 2) {
				field114 = true;
			} else if (var3 == 3) {
				field115 = arg1.method244();
			} else if (var3 == 4) {
				field116 = arg1.method244();
			} else if (var3 == 5) {
				field117 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
