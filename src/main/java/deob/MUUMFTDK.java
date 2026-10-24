package deob;

@ObfuscatedName("MUUMFTDK")
public class MUUMFTDK {

	@ObfuscatedName("MUUMFTDK.i")
	public boolean field968 = false;

	@ObfuscatedName("MUUMFTDK.j")
	public boolean field969 = true;

	@ObfuscatedName("MUUMFTDK.l")
	public boolean field971 = false;

	@ObfuscatedName("MUUMFTDK.o")
	public boolean field974 = false;

	@ObfuscatedName("MUUMFTDK.p")
	public int field975 = -1;

	@ObfuscatedName("MUUMFTDK.q")
	public boolean field976 = true;

	@ObfuscatedName("MUUMFTDK.b")
	public static int field961;

	@ObfuscatedName("MUUMFTDK.d")
	public static int field963;

	@ObfuscatedName("MUUMFTDK.g")
	public int field966;

	@ObfuscatedName("MUUMFTDK.h")
	public int field967;

	@ObfuscatedName("MUUMFTDK.k")
	public int field970;

	@ObfuscatedName("MUUMFTDK.m")
	public int field972;

	@ObfuscatedName("MUUMFTDK.n")
	public int field973;

	@ObfuscatedName("MUUMFTDK.f")
	public String field965;

	@ObfuscatedName("MUUMFTDK.e")
	public static int[] field964;

	@ObfuscatedName("MUUMFTDK.c")
	public static MUUMFTDK[] field962;

	@ObfuscatedName("MUUMFTDK.a(BLSXKKBWPU;)V")
	public static void method338(SXKKBWPU arg0) {
		TQYMAXSO var1 = new TQYMAXSO(arg0.method442("varp.dat", null));
		field963 = 0;
		field961 = var1.method470();
		if (field962 == null) {
			field962 = new MUUMFTDK[field961];
		}

		if (field964 == null) {
			field964 = new int[field961];
		}

		for (int var2 = 0; var2 < field961; var2++) {
			if (field962[var2] == null) {
				field962[var2] = new MUUMFTDK();
			}

			field962[var2].method339(var2, var1);
		}

		if (var1.field1262.length != var1.field1263) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("MUUMFTDK.a(IILTQYMAXSO;)V")
	public void method339(int arg0, TQYMAXSO arg1) {
		while (true) {
			int var3 = arg1.method468();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field966 = arg1.method468();
			} else if (var3 == 2) {
				field967 = arg1.method468();
			} else if (var3 == 3) {
				field968 = true;
				field964[field963++] = arg0;
			} else if (var3 == 4) {
				field969 = false;
			} else if (var3 == 5) {
				field970 = arg1.method470();
			} else if (var3 == 6) {
				field971 = true;
			} else if (var3 == 7) {
				field972 = arg1.method473();
			} else if (var3 == 8) {
				field973 = 1;
				field974 = true;
			} else if (var3 == 10) {
				field965 = arg1.method475();
			} else if (var3 == 11) {
				field974 = true;
			} else if (var3 == 12) {
				field975 = arg1.method473();
			} else if (var3 == 13) {
				field973 = 2;
				field974 = true;
			} else if (var3 == 14) {
				field976 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
