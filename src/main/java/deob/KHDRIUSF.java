package deob;

@ObfuscatedName("KHDRIUSF")
public class KHDRIUSF {

	@ObfuscatedName("KHDRIUSF.i")
	public boolean field809 = false;

	@ObfuscatedName("KHDRIUSF.j")
	public boolean field810 = true;

	@ObfuscatedName("KHDRIUSF.l")
	public boolean field812 = false;

	@ObfuscatedName("KHDRIUSF.o")
	public boolean field815 = false;

	@ObfuscatedName("KHDRIUSF.p")
	public int field816 = -1;

	@ObfuscatedName("KHDRIUSF.q")
	public boolean field817 = true;

	@ObfuscatedName("KHDRIUSF.b")
	public static int field802;

	@ObfuscatedName("KHDRIUSF.d")
	public static int field804;

	@ObfuscatedName("KHDRIUSF.g")
	public int field807;

	@ObfuscatedName("KHDRIUSF.h")
	public int field808;

	@ObfuscatedName("KHDRIUSF.k")
	public int field811;

	@ObfuscatedName("KHDRIUSF.m")
	public int field813;

	@ObfuscatedName("KHDRIUSF.n")
	public int field814;

	@ObfuscatedName("KHDRIUSF.f")
	public String field806;

	@ObfuscatedName("KHDRIUSF.e")
	public static int[] field805;

	@ObfuscatedName("KHDRIUSF.c")
	public static KHDRIUSF[] field803;

	@ObfuscatedName("KHDRIUSF.a(LWEMOPWVJ;I)V")
	public static void method314(WEMOPWVJ arg0) {
		SVWJKJVI var1 = new SVWJKJVI(arg0.method559("varp.dat", null));
		field804 = 0;
		field802 = var1.method463();
		if (field803 == null) {
			field803 = new KHDRIUSF[field802];
		}

		if (field805 == null) {
			field805 = new int[field802];
		}

		for (int var2 = 0; var2 < field802; var2++) {
			if (field803[var2] == null) {
				field803[var2] = new KHDRIUSF();
			}

			field803[var2].method315(var2, var1);
		}

		if (var1.field1262.length != var1.field1263) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("KHDRIUSF.a(IZLSVWJKJVI;)V")
	public void method315(int arg0, SVWJKJVI arg1) {
		while (true) {
			int var3 = arg1.method461();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field807 = arg1.method461();
			} else if (var3 == 2) {
				field808 = arg1.method461();
			} else if (var3 == 3) {
				field809 = true;
				field805[field804++] = arg0;
			} else if (var3 == 4) {
				field810 = false;
			} else if (var3 == 5) {
				field811 = arg1.method463();
			} else if (var3 == 6) {
				field812 = true;
			} else if (var3 == 7) {
				field813 = arg1.method466();
			} else if (var3 == 8) {
				field814 = 1;
				field815 = true;
			} else if (var3 == 10) {
				field806 = arg1.method468();
			} else if (var3 == 11) {
				field815 = true;
			} else if (var3 == 12) {
				field816 = arg1.method466();
			} else if (var3 == 13) {
				field814 = 2;
				field815 = true;
			} else if (var3 == 14) {
				field817 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
