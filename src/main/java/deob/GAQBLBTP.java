package deob;

@ObfuscatedName("GAQBLBTP")
public class GAQBLBTP {

	@ObfuscatedName("GAQBLBTP.i")
	public boolean field705 = false;

	@ObfuscatedName("GAQBLBTP.j")
	public int field706 = -1;

	@ObfuscatedName("GAQBLBTP.c")
	public static int field699;

	@ObfuscatedName("GAQBLBTP.f")
	public int field702;

	@ObfuscatedName("GAQBLBTP.g")
	public int field703;

	@ObfuscatedName("GAQBLBTP.h")
	public int field704;

	@ObfuscatedName("GAQBLBTP.k")
	public int field707;

	@ObfuscatedName("GAQBLBTP.e")
	public String field701;

	@ObfuscatedName("GAQBLBTP.d")
	public static GAQBLBTP[] field700;

	@ObfuscatedName("GAQBLBTP.a(ILSYUGXMZF;)V")
	public static void method279(SYUGXMZF arg0) {
		KHOMSBHW var1 = new KHOMSBHW(arg0.method551("varbit.dat", null));
		field699 = var1.method351();
		if (field700 == null) {
			field700 = new GAQBLBTP[field699];
		}

		for (int var2 = 0; var2 < field699; var2++) {
			if (field700[var2] == null) {
				field700[var2] = new GAQBLBTP();
			}

			field700[var2].method280(var2, var1);

			if (field700[var2].field705) {
				IYJSMCGP.field867[field700[var2].field702].field879 = true;
			}
		}

		if (var1.field933.length != var1.field934) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("GAQBLBTP.a(ILKHOMSBHW;B)V")
	public void method280(int arg0, KHOMSBHW arg1) {
		while (true) {
			int var3 = arg1.method349();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field702 = arg1.method351();
				field703 = arg1.method349();
				field704 = arg1.method349();
			} else if (var3 == 10) {
				field701 = arg1.method356();
			} else if (var3 == 2) {
				field705 = true;
			} else if (var3 == 3) {
				field706 = arg1.method354();
			} else if (var3 == 4) {
				field707 = arg1.method354();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
