package deob;

@ObfuscatedName("USQYPEQB")
public class USQYPEQB {

	@ObfuscatedName("USQYPEQB.i")
	public boolean field1264 = false;

	@ObfuscatedName("USQYPEQB.j")
	public int field1265 = -1;

	@ObfuscatedName("USQYPEQB.l")
	public boolean field1267 = true;

	@ObfuscatedName("USQYPEQB.c")
	public static int field1258;

	@ObfuscatedName("USQYPEQB.f")
	public int field1261;

	@ObfuscatedName("USQYPEQB.g")
	public int field1262;

	@ObfuscatedName("USQYPEQB.h")
	public int field1263;

	@ObfuscatedName("USQYPEQB.k")
	public int field1266;

	@ObfuscatedName("USQYPEQB.e")
	public String field1260;

	@ObfuscatedName("USQYPEQB.d")
	public static USQYPEQB[] field1259;

	@ObfuscatedName("USQYPEQB.a(ZLVSQMPWOM;)V")
	public static void method519(VSQMPWOM arg0) {
		BFQIDHPO var1 = new BFQIDHPO(arg0.method526("varbit.dat", null));
		field1258 = var1.method56();
		if (field1259 == null) {
			field1259 = new USQYPEQB[field1258];
		}

		for (int var2 = 0; var2 < field1258; var2++) {
			if (field1259[var2] == null) {
				field1259[var2] = new USQYPEQB();
			}

			field1259[var2].method520(var2, var1);

			if (field1259[var2].field1264) {
				ONRKYVGF.field920[field1259[var2].field1261].field932 = true;
			}
		}

		if (var1.field9.length != var1.field10) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("USQYPEQB.a(ILBFQIDHPO;I)V")
	public void method520(int arg0, BFQIDHPO arg1) {
		while (true) {
			int var3 = arg1.method54();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1261 = arg1.method56();
				field1262 = arg1.method54();
				field1263 = arg1.method54();
			} else if (var3 == 10) {
				field1260 = arg1.method61();
			} else if (var3 == 2) {
				field1264 = true;
			} else if (var3 == 3) {
				field1265 = arg1.method59();
			} else if (var3 == 4) {
				field1266 = arg1.method59();
			} else if (var3 == 5) {
				field1267 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
