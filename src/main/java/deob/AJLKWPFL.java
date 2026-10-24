package deob;

@ObfuscatedName("AJLKWPFL")
public class AJLKWPFL {

	@ObfuscatedName("AJLKWPFL.k")
	public boolean field8 = false;

	@ObfuscatedName("AJLKWPFL.l")
	public boolean field9 = true;

	@ObfuscatedName("AJLKWPFL.n")
	public boolean field11 = false;

	@ObfuscatedName("AJLKWPFL.q")
	public boolean field14 = false;

	@ObfuscatedName("AJLKWPFL.r")
	public int field15 = -1;

	@ObfuscatedName("AJLKWPFL.s")
	public boolean field16 = true;

	@ObfuscatedName("AJLKWPFL.d")
	public static int field1;

	@ObfuscatedName("AJLKWPFL.m")
	public int field10;

	@ObfuscatedName("AJLKWPFL.o")
	public int field12;

	@ObfuscatedName("AJLKWPFL.p")
	public int field13;

	@ObfuscatedName("AJLKWPFL.f")
	public static int field3;

	@ObfuscatedName("AJLKWPFL.i")
	public int field6;

	@ObfuscatedName("AJLKWPFL.j")
	public int field7;

	@ObfuscatedName("AJLKWPFL.h")
	public String field5;

	@ObfuscatedName("AJLKWPFL.g")
	public static int[] field4;

	@ObfuscatedName("AJLKWPFL.e")
	public static AJLKWPFL[] field2;

	@ObfuscatedName("AJLKWPFL.a(LSMIVAFST;I)V")
	public static void method1(SMIVAFST arg0) {
		BSNPYLEV var1 = new BSNPYLEV(arg0.method512("varp.dat", null));
		field3 = 0;
		field1 = var1.method49();
		if (field2 == null) {
			field2 = new AJLKWPFL[field1];
		}

		if (field4 == null) {
			field4 = new int[field1];
		}

		for (int var2 = 0; var2 < field1; var2++) {
			if (field2[var2] == null) {
				field2[var2] = new AJLKWPFL();
			}

			field2[var2].method2(var1, var2);
		}

		if (var1.field54.length != var1.field55) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("AJLKWPFL.a(BLBSNPYLEV;I)V")
	public void method2(BSNPYLEV arg0, int arg1) {
		while (true) {
			int var3 = arg0.method47();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field6 = arg0.method47();
			} else if (var3 == 2) {
				field7 = arg0.method47();
			} else if (var3 == 3) {
				field8 = true;
				field4[field3++] = arg1;
			} else if (var3 == 4) {
				field9 = false;
			} else if (var3 == 5) {
				field10 = arg0.method49();
			} else if (var3 == 6) {
				field11 = true;
			} else if (var3 == 7) {
				field12 = arg0.method52();
			} else if (var3 == 8) {
				field13 = 1;
				field14 = true;
			} else if (var3 == 10) {
				field5 = arg0.method54();
			} else if (var3 == 11) {
				field14 = true;
			} else if (var3 == 12) {
				field15 = arg0.method52();
			} else if (var3 == 13) {
				field13 = 2;
				field14 = true;
			} else if (var3 == 14) {
				field16 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
