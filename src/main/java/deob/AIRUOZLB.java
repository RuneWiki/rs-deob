package deob;

@ObfuscatedName("AIRUOZLB")
public class AIRUOZLB {

	@ObfuscatedName("AIRUOZLB.g")
	public boolean field9 = false;

	@ObfuscatedName("AIRUOZLB.h")
	public int field10 = -1;

	@ObfuscatedName("AIRUOZLB.i")
	public int field11;

	@ObfuscatedName("AIRUOZLB.a")
	public static int field3;

	@ObfuscatedName("AIRUOZLB.d")
	public int field6;

	@ObfuscatedName("AIRUOZLB.e")
	public int field7;

	@ObfuscatedName("AIRUOZLB.f")
	public int field8;

	@ObfuscatedName("AIRUOZLB.c")
	public String field5;

	@ObfuscatedName("AIRUOZLB.b")
	public static AIRUOZLB[] field4;

	@ObfuscatedName("AIRUOZLB.a(ILHRXSNEYZ;)V")
	public static void method2(HRXSNEYZ arg0) {
		JHKSAGUC var1 = new JHKSAGUC(arg0.method289("varbit.dat", null));
		field3 = var1.method308();
		if (field4 == null) {
			field4 = new AIRUOZLB[field3];
		}

		for (int var2 = 0; var2 < field3; var2++) {
			if (field4[var2] == null) {
				field4[var2] = new AIRUOZLB();
			}

			field4[var2].method3(var2, var1);

			if (field4[var2].field9) {
				EINNWKRR.field568[field4[var2].field6].field580 = true;
			}
		}

		if (var1.field751.length != var1.field752) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("AIRUOZLB.a(IILJHKSAGUC;)V")
	public void method3(int arg0, JHKSAGUC arg1) {
		while (true) {
			int var3 = arg1.method306();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field6 = arg1.method308();
				field7 = arg1.method306();
				field8 = arg1.method306();
			} else if (var3 == 10) {
				field5 = arg1.method313();
			} else if (var3 == 2) {
				field9 = true;
			} else if (var3 == 3) {
				field10 = arg1.method311();
			} else if (var3 == 4) {
				field11 = arg1.method311();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
