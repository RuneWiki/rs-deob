package deob;

@ObfuscatedName("INYZAOQU")
public class INYZAOQU {

	@ObfuscatedName("INYZAOQU.h")
	public boolean field739 = false;

	@ObfuscatedName("INYZAOQU.i")
	public boolean field740 = true;

	@ObfuscatedName("INYZAOQU.k")
	public boolean field742 = false;

	@ObfuscatedName("INYZAOQU.n")
	public boolean field745 = false;

	@ObfuscatedName("INYZAOQU.o")
	public int field746 = -1;

	@ObfuscatedName("INYZAOQU.p")
	public boolean field747 = true;

	@ObfuscatedName("INYZAOQU.a")
	public static int field732;

	@ObfuscatedName("INYZAOQU.c")
	public static int field734;

	@ObfuscatedName("INYZAOQU.f")
	public int field737;

	@ObfuscatedName("INYZAOQU.g")
	public int field738;

	@ObfuscatedName("INYZAOQU.j")
	public int field741;

	@ObfuscatedName("INYZAOQU.l")
	public int field743;

	@ObfuscatedName("INYZAOQU.m")
	public int field744;

	@ObfuscatedName("INYZAOQU.e")
	public String field736;

	@ObfuscatedName("INYZAOQU.d")
	public static int[] field735;

	@ObfuscatedName("INYZAOQU.b")
	public static INYZAOQU[] field733;

	@ObfuscatedName("INYZAOQU.a(ILMAARFNGV;)V")
	public static void method293(MAARFNGV arg0) {
		EMWAMCXW var1 = new EMWAMCXW(arg0.method332("varp.dat", null));
		field734 = 0;
		field732 = var1.method219();
		if (field733 == null) {
			field733 = new INYZAOQU[field732];
		}

		if (field735 == null) {
			field735 = new int[field732];
		}

		for (int var2 = 0; var2 < field732; var2++) {
			if (field733[var2] == null) {
				field733[var2] = new INYZAOQU();
			}

			field733[var2].method294(var1, var2);
		}

		if (var1.field616.length != var1.field617) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("INYZAOQU.a(ZLEMWAMCXW;I)V")
	public void method294(EMWAMCXW arg0, int arg1) {
		while (true) {
			int var3 = arg0.method217();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field737 = arg0.method217();
			} else if (var3 == 2) {
				field738 = arg0.method217();
			} else if (var3 == 3) {
				field739 = true;
				field735[field734++] = arg1;
			} else if (var3 == 4) {
				field740 = false;
			} else if (var3 == 5) {
				field741 = arg0.method219();
			} else if (var3 == 6) {
				field742 = true;
			} else if (var3 == 7) {
				field743 = arg0.method222();
			} else if (var3 == 8) {
				field744 = 1;
				field745 = true;
			} else if (var3 == 10) {
				field736 = arg0.method224();
			} else if (var3 == 11) {
				field745 = true;
			} else if (var3 == 12) {
				field746 = arg0.method222();
			} else if (var3 == 13) {
				field744 = 2;
				field745 = true;
			} else if (var3 == 14) {
				field747 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
