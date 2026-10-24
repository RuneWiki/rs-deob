package deob;

@ObfuscatedName("GJIMXWNM")
public class GJIMXWNM {

	@ObfuscatedName("GJIMXWNM.g")
	public boolean field837 = false;

	@ObfuscatedName("GJIMXWNM.h")
	public int field838 = -1;

	@ObfuscatedName("GJIMXWNM.j")
	public boolean field840 = true;

	@ObfuscatedName("GJIMXWNM.a")
	public static int field831;

	@ObfuscatedName("GJIMXWNM.d")
	public int field834;

	@ObfuscatedName("GJIMXWNM.e")
	public int field835;

	@ObfuscatedName("GJIMXWNM.f")
	public int field836;

	@ObfuscatedName("GJIMXWNM.i")
	public int field839;

	@ObfuscatedName("GJIMXWNM.c")
	public String field833;

	@ObfuscatedName("GJIMXWNM.b")
	public static GJIMXWNM[] field832;

	@ObfuscatedName("GJIMXWNM.a(LFUZJMGZB;I)V")
	public static void method296(FUZJMGZB arg0) {
		LBBVYYXO var1 = new LBBVYYXO(arg0.method277("varbit.dat", null));
		field831 = var1.method371();
		if (field832 == null) {
			field832 = new GJIMXWNM[field831];
		}

		for (int var2 = 0; var2 < field831; var2++) {
			if (field832[var2] == null) {
				field832[var2] = new GJIMXWNM();
			}

			field832[var2].method297(var1, var2);

			if (field832[var2].field837) {
				LSIUBIYU.field895[field832[var2].field834].field907 = true;
			}
		}

		if (var1.field881.length != var1.field882) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("GJIMXWNM.a(ZLLBBVYYXO;I)V")
	public void method297(LBBVYYXO arg0, int arg1) {
		while (true) {
			int var3 = arg0.method369();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field834 = arg0.method371();
				field835 = arg0.method369();
				field836 = arg0.method369();
			} else if (var3 == 10) {
				field833 = arg0.method376();
			} else if (var3 == 2) {
				field837 = true;
			} else if (var3 == 3) {
				field838 = arg0.method374();
			} else if (var3 == 4) {
				field839 = arg0.method374();
			} else if (var3 == 5) {
				field840 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
