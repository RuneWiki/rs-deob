package deob;

@ObfuscatedName("WOJPETNO")
public class WOJPETNO {

	@ObfuscatedName("WOJPETNO.g")
	public boolean field1427 = false;

	@ObfuscatedName("WOJPETNO.h")
	public int field1428 = -1;

	@ObfuscatedName("WOJPETNO.j")
	public boolean field1430 = true;

	@ObfuscatedName("WOJPETNO.a")
	public static int field1421;

	@ObfuscatedName("WOJPETNO.d")
	public int field1424;

	@ObfuscatedName("WOJPETNO.e")
	public int field1425;

	@ObfuscatedName("WOJPETNO.f")
	public int field1426;

	@ObfuscatedName("WOJPETNO.i")
	public int field1429;

	@ObfuscatedName("WOJPETNO.c")
	public String field1423;

	@ObfuscatedName("WOJPETNO.b")
	public static WOJPETNO[] field1422;

	@ObfuscatedName("WOJPETNO.a(LGWOEELWB;B)V")
	public static void method576(GWOEELWB arg0) {
		MLYYHULT var1 = new MLYYHULT(arg0.method249("varbit.dat", null));
		field1421 = var1.method298();
		if (field1422 == null) {
			field1422 = new WOJPETNO[field1421];
		}

		for (int var2 = 0; var2 < field1421; var2++) {
			if (field1422[var2] == null) {
				field1422[var2] = new WOJPETNO();
			}

			field1422[var2].method577(var2, var1);

			if (field1422[var2].field1427) {
				KTJKDKKM.field865[field1422[var2].field1424].field877 = true;
			}
		}

		if (var1.field962.length != var1.field963) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("WOJPETNO.a(IILMLYYHULT;)V")
	public void method577(int arg0, MLYYHULT arg1) {
		while (true) {
			int var3 = arg1.method296();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1424 = arg1.method298();
				field1425 = arg1.method296();
				field1426 = arg1.method296();
			} else if (var3 == 10) {
				field1423 = arg1.method303();
			} else if (var3 == 2) {
				field1427 = true;
			} else if (var3 == 3) {
				field1428 = arg1.method301();
			} else if (var3 == 4) {
				field1429 = arg1.method301();
			} else if (var3 == 5) {
				field1430 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
