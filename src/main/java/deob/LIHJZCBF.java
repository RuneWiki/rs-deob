package deob;

@ObfuscatedName("LIHJZCBF")
public final class LIHJZCBF {

	@ObfuscatedName("LIHJZCBF.b")
	public int field879;

	@ObfuscatedName("LIHJZCBF.c")
	public JBHJGXME[] field880;

	public LIHJZCBF(int arg0) {
		field879 = arg0;
		field880 = new JBHJGXME[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			JBHJGXME var3 = field880[var2] = new JBHJGXME();
			var3.field830 = var3;
			var3.field831 = var3;
		}
	}

	@ObfuscatedName("LIHJZCBF.a(J)LJBHJGXME;")
	public JBHJGXME method279(long arg0) {
		JBHJGXME var3 = field880[(int) (arg0 & field879 - 1)];
		for (JBHJGXME var4 = var3.field830; var4 != var3; var4 = var4.field830) {
			if (var4.field829 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("LIHJZCBF.a(LJBHJGXME;JI)V")
	public void method280(JBHJGXME arg0, long arg1) {
		if (arg0.field831 != null) {
			arg0.method254();
		}

		JBHJGXME var4 = field880[(int) (arg1 & field879 - 1)];
		arg0.field831 = var4.field831;
		arg0.field830 = var4;
		arg0.field831.field830 = arg0;
		arg0.field830.field831 = arg0;
		arg0.field829 = arg1;
	}
}
