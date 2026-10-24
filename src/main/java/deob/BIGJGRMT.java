package deob;

@ObfuscatedName("BIGJGRMT")
public class BIGJGRMT {

	@ObfuscatedName("BIGJGRMT.h")
	public boolean field89 = false;

	@ObfuscatedName("BIGJGRMT.i")
	public boolean field90 = true;

	@ObfuscatedName("BIGJGRMT.k")
	public boolean field92 = false;

	@ObfuscatedName("BIGJGRMT.n")
	public boolean field95 = false;

	@ObfuscatedName("BIGJGRMT.o")
	public int field96 = -1;

	@ObfuscatedName("BIGJGRMT.a")
	public static int field82;

	@ObfuscatedName("BIGJGRMT.c")
	public static int field84;

	@ObfuscatedName("BIGJGRMT.f")
	public int field87;

	@ObfuscatedName("BIGJGRMT.g")
	public int field88;

	@ObfuscatedName("BIGJGRMT.j")
	public int field91;

	@ObfuscatedName("BIGJGRMT.l")
	public int field93;

	@ObfuscatedName("BIGJGRMT.m")
	public int field94;

	@ObfuscatedName("BIGJGRMT.e")
	public String field86;

	@ObfuscatedName("BIGJGRMT.d")
	public static int[] field85;

	@ObfuscatedName("BIGJGRMT.b")
	public static BIGJGRMT[] field83;

	@ObfuscatedName("BIGJGRMT.a(ZLXRWUKRPO;)V")
	public static void method27(XRWUKRPO arg0) {
		GLMIQHJI var1 = new GLMIQHJI(arg0.method581("varp.dat", null));
		field84 = 0;
		field82 = var1.method246();
		if (field83 == null) {
			field83 = new BIGJGRMT[field82];
		}

		if (field85 == null) {
			field85 = new int[field82];
		}

		for (int var2 = 0; var2 < field82; var2++) {
			if (field83[var2] == null) {
				field83[var2] = new BIGJGRMT();
			}

			field83[var2].method28(var2, var1);
		}

		if (var1.field708.length != var1.field709) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("BIGJGRMT.a(ZILGLMIQHJI;)V")
	public void method28(int arg0, GLMIQHJI arg1) {
		while (true) {
			int var3 = arg1.method244();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field87 = arg1.method244();
			} else if (var3 == 2) {
				field88 = arg1.method244();
			} else if (var3 == 3) {
				field89 = true;
				field85[field84++] = arg0;
			} else if (var3 == 4) {
				field90 = false;
			} else if (var3 == 5) {
				field91 = arg1.method246();
			} else if (var3 == 6) {
				field92 = true;
			} else if (var3 == 7) {
				field93 = arg1.method249();
			} else if (var3 == 8) {
				field94 = 1;
				field95 = true;
			} else if (var3 == 10) {
				field86 = arg1.method251();
			} else if (var3 == 11) {
				field95 = true;
			} else if (var3 == 12) {
				field96 = arg1.method249();
			} else if (var3 == 13) {
				field94 = 2;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
