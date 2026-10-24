package deob;

@ObfuscatedName("OQTNTOVY")
public class OQTNTOVY {

	@ObfuscatedName("OQTNTOVY.e")
	public int field945 = -1;

	@ObfuscatedName("OQTNTOVY.g")
	public int[] field947 = new int[6];

	@ObfuscatedName("OQTNTOVY.h")
	public int[] field948 = new int[6];

	@ObfuscatedName("OQTNTOVY.i")
	public int[] field949 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("OQTNTOVY.j")
	public boolean field950 = false;

	@ObfuscatedName("OQTNTOVY.c")
	public static int field943;

	@ObfuscatedName("OQTNTOVY.f")
	public int[] field946;

	@ObfuscatedName("OQTNTOVY.d")
	public static OQTNTOVY[] field944;

	@ObfuscatedName("OQTNTOVY.a(ZLVSQMPWOM;)V")
	public static void method363(VSQMPWOM arg0) {
		BFQIDHPO var1 = new BFQIDHPO(arg0.method526("idk.dat", null));
		field943 = var1.method56();
		if (field944 == null) {
			field944 = new OQTNTOVY[field943];
		}

		for (int var2 = 0; var2 < field943; var2++) {
			if (field944[var2] == null) {
				field944[var2] = new OQTNTOVY();
			}

			field944[var2].method364(var1);
		}
	}

	@ObfuscatedName("OQTNTOVY.a(BLBFQIDHPO;)V")
	public void method364(BFQIDHPO arg0) {
		while (true) {
			int var2 = arg0.method54();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field945 = arg0.method54();
			} else if (var2 == 2) {
				int var3 = arg0.method54();
				field946 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field946[var4] = arg0.method56();
				}
			} else if (var2 == 3) {
				field950 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field947[var2 - 40] = arg0.method56();
			} else if (var2 >= 50 && var2 < 60) {
				field948[var2 - 50] = arg0.method56();
			} else if (var2 >= 60 && var2 < 70) {
				field949[var2 - 60] = arg0.method56();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("OQTNTOVY.a(I)Z")
	public boolean method365() {
		if (field946 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field946.length; var2++) {
			if (!XBVYIDUH.method542(field946[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("OQTNTOVY.a(B)LXBVYIDUH;")
	public XBVYIDUH method366() {
		if (field946 == null) {
			return null;
		}

		XBVYIDUH[] var1 = new XBVYIDUH[field946.length];
		for (int var2 = 0; var2 < field946.length; var2++) {
			var1[var2] = XBVYIDUH.method541(field946[var2]);
		}

		XBVYIDUH var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new XBVYIDUH(var1, var1.length);
		}

		for (int var4 = 0; var4 < 6 && field947[var4] != 0; var4++) {
			var3.method555(field947[var4], field948[var4]);
		}

		return var3;
	}

	@ObfuscatedName("OQTNTOVY.b(I)Z")
	public boolean method367() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field949[var2] != -1 && !XBVYIDUH.method542(field949[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("OQTNTOVY.c(I)LXBVYIDUH;")
	public XBVYIDUH method368() {
		XBVYIDUH[] var1 = new XBVYIDUH[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field949[var3] != -1) {
				var1[var2++] = XBVYIDUH.method541(field949[var3]);
			}
		}

		XBVYIDUH var4 = new XBVYIDUH(var1, var2);
		for (int var5 = 0; var5 < 6 && field947[var5] != 0; var5++) {
			var4.method555(field947[var5], field948[var5]);
		}

		return var4;
	}
}
