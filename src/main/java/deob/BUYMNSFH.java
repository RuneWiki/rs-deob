package deob;

@ObfuscatedName("BUYMNSFH")
public class BUYMNSFH {

	@ObfuscatedName("BUYMNSFH.g")
	public boolean field25 = false;

	@ObfuscatedName("BUYMNSFH.h")
	public int field26 = -1;

	@ObfuscatedName("BUYMNSFH.a")
	public static int field19;

	@ObfuscatedName("BUYMNSFH.d")
	public int field22;

	@ObfuscatedName("BUYMNSFH.e")
	public int field23;

	@ObfuscatedName("BUYMNSFH.f")
	public int field24;

	@ObfuscatedName("BUYMNSFH.i")
	public int field27;

	@ObfuscatedName("BUYMNSFH.c")
	public String field21;

	@ObfuscatedName("BUYMNSFH.b")
	public static BUYMNSFH[] field20;

	@ObfuscatedName("BUYMNSFH.a(LMNPBQFWE;B)V")
	public static void method31(MNPBQFWE arg0) {
		BJPWOXRJ var1 = new BJPWOXRJ(arg0.method429("varbit.dat", null));
		field19 = var1.method17();
		if (field20 == null) {
			field20 = new BUYMNSFH[field19];
		}

		for (int var2 = 0; var2 < field19; var2++) {
			if (field20[var2] == null) {
				field20[var2] = new BUYMNSFH();
			}

			field20[var2].method32(var1, var2);

			if (field20[var2].field25) {
				JMEOMLFD.field890[field20[var2].field22].field902 = true;
			}
		}

		if (var1.field4.length != var1.field5) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("BUYMNSFH.a(LBJPWOXRJ;II)V")
	public void method32(BJPWOXRJ arg0, int arg1) {
		while (true) {
			int var3 = arg0.method15();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field22 = arg0.method17();
				field23 = arg0.method15();
				field24 = arg0.method15();
			} else if (var3 == 10) {
				field21 = arg0.method22();
			} else if (var3 == 2) {
				field25 = true;
			} else if (var3 == 3) {
				field26 = arg0.method20();
			} else if (var3 == 4) {
				field27 = arg0.method20();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
