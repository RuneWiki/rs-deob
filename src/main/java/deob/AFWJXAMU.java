package deob;

@ObfuscatedName("AFWJXAMU")
public class AFWJXAMU {

	@ObfuscatedName("AFWJXAMU.h")
	public boolean field15 = false;

	@ObfuscatedName("AFWJXAMU.i")
	public int field16 = -1;

	@ObfuscatedName("AFWJXAMU.k")
	public boolean field18 = true;

	@ObfuscatedName("AFWJXAMU.e")
	public int field12;

	@ObfuscatedName("AFWJXAMU.f")
	public int field13;

	@ObfuscatedName("AFWJXAMU.g")
	public int field14;

	@ObfuscatedName("AFWJXAMU.j")
	public int field17;

	@ObfuscatedName("AFWJXAMU.b")
	public static int field9;

	@ObfuscatedName("AFWJXAMU.d")
	public String field11;

	@ObfuscatedName("AFWJXAMU.c")
	public static AFWJXAMU[] field10;

	@ObfuscatedName("AFWJXAMU.a(LBYZSQZUF;Z)V")
	public static void method6(BYZSQZUF arg0) {
		IMUIZRAF var1 = new IMUIZRAF(arg0.method29("varbit.dat", null));
		field9 = var1.method240();
		if (field10 == null) {
			field10 = new AFWJXAMU[field9];
		}

		for (int var2 = 0; var2 < field9; var2++) {
			if (field10[var2] == null) {
				field10[var2] = new AFWJXAMU();
			}

			field10[var2].method7(var1, var2);

			if (field10[var2].field15) {
				SXXYSOJW.field1159[field10[var2].field12].field1171 = true;
			}
		}

		if (var1.field713.length != var1.field714) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("AFWJXAMU.a(LIMUIZRAF;II)V")
	public void method7(IMUIZRAF arg0, int arg1) {
		while (true) {
			int var3 = arg0.method238();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field12 = arg0.method240();
				field13 = arg0.method238();
				field14 = arg0.method238();
			} else if (var3 == 10) {
				field11 = arg0.method245();
			} else if (var3 == 2) {
				field15 = true;
			} else if (var3 == 3) {
				field16 = arg0.method243();
			} else if (var3 == 4) {
				field17 = arg0.method243();
			} else if (var3 == 5) {
				field18 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
