package deob;

@ObfuscatedName("FGIDBWCJ")
public class FGIDBWCJ {

	@ObfuscatedName("FGIDBWCJ.e")
	public int field648 = -1;

	@ObfuscatedName("FGIDBWCJ.g")
	public int[] field650 = new int[6];

	@ObfuscatedName("FGIDBWCJ.h")
	public int[] field651 = new int[6];

	@ObfuscatedName("FGIDBWCJ.i")
	public int[] field652 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("FGIDBWCJ.j")
	public boolean field653 = false;

	@ObfuscatedName("FGIDBWCJ.c")
	public static int field646;

	@ObfuscatedName("FGIDBWCJ.f")
	public int[] field649;

	@ObfuscatedName("FGIDBWCJ.d")
	public static FGIDBWCJ[] field647;

	@ObfuscatedName("FGIDBWCJ.a(LDTIATKJO;I)V")
	public static void method184(DTIATKJO arg0) {
		GHHPHSRU var1 = new GHHPHSRU(arg0.method168("idk.dat", null));
		field646 = var1.method204();
		if (field647 == null) {
			field647 = new FGIDBWCJ[field646];
		}

		for (int var2 = 0; var2 < field646; var2++) {
			if (field647[var2] == null) {
				field647[var2] = new FGIDBWCJ();
			}

			field647[var2].method185(var1);
		}
	}

	@ObfuscatedName("FGIDBWCJ.a(LGHHPHSRU;I)V")
	public void method185(GHHPHSRU arg0) {
		while (true) {
			int var2 = arg0.method202();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field648 = arg0.method202();
			} else if (var2 == 2) {
				int var3 = arg0.method202();
				field649 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field649[var4] = arg0.method204();
				}
			} else if (var2 == 3) {
				field653 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field650[var2 - 40] = arg0.method204();
			} else if (var2 >= 50 && var2 < 60) {
				field651[var2 - 50] = arg0.method204();
			} else if (var2 >= 60 && var2 < 70) {
				field652[var2 - 60] = arg0.method204();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("FGIDBWCJ.a(B)Z")
	public boolean method186() {
		if (field649 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field649.length; var2++) {
			if (!OQIGXOFQ.method392(field649[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("FGIDBWCJ.b(B)LOQIGXOFQ;")
	public OQIGXOFQ method187() {
		if (field649 == null) {
			return null;
		}

		OQIGXOFQ[] var1 = new OQIGXOFQ[field649.length];
		for (int var2 = 0; var2 < field649.length; var2++) {
			var1[var2] = OQIGXOFQ.method391(field649[var2]);
		}

		OQIGXOFQ var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new OQIGXOFQ(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field650[var4] != 0; var4++) {
			var3.method405(field650[var4], field651[var4]);
		}

		return var3;
	}

	@ObfuscatedName("FGIDBWCJ.a(I)Z")
	public boolean method188() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field652[var2] != -1 && !OQIGXOFQ.method392(field652[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("FGIDBWCJ.a(Z)LOQIGXOFQ;")
	public OQIGXOFQ method189() {
		OQIGXOFQ[] var1 = new OQIGXOFQ[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field652[var3] != -1) {
				var1[var2++] = OQIGXOFQ.method391(field652[var3]);
			}
		}

		OQIGXOFQ var4 = new OQIGXOFQ(var2, var1);
		for (int var5 = 0; var5 < 6 && field650[var5] != 0; var5++) {
			var4.method405(field650[var5], field651[var5]);
		}

		return var4;
	}
}
