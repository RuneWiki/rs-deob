package deob;

@ObfuscatedName("CWNXCHDT")
public class CWNXCHDT {

	@ObfuscatedName("CWNXCHDT.e")
	public int field531 = -1;

	@ObfuscatedName("CWNXCHDT.g")
	public int[] field533 = new int[6];

	@ObfuscatedName("CWNXCHDT.h")
	public int[] field534 = new int[6];

	@ObfuscatedName("CWNXCHDT.i")
	public int[] field535 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("CWNXCHDT.j")
	public boolean field536 = false;

	@ObfuscatedName("CWNXCHDT.c")
	public static int field529;

	@ObfuscatedName("CWNXCHDT.f")
	public int[] field532;

	@ObfuscatedName("CWNXCHDT.d")
	public static CWNXCHDT[] field530;

	@ObfuscatedName("CWNXCHDT.a(LFUZJMGZB;I)V")
	public static void method186(FUZJMGZB arg0) {
		LBBVYYXO var1 = new LBBVYYXO(arg0.method277("idk.dat", null));
		field529 = var1.method371();
		if (field530 == null) {
			field530 = new CWNXCHDT[field529];
		}

		for (int var2 = 0; var2 < field529; var2++) {
			if (field530[var2] == null) {
				field530[var2] = new CWNXCHDT();
			}

			field530[var2].method187(var1);
		}
	}

	@ObfuscatedName("CWNXCHDT.a(LLBBVYYXO;B)V")
	public void method187(LBBVYYXO arg0) {
		while (true) {
			int var2 = arg0.method369();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field531 = arg0.method369();
			} else if (var2 == 2) {
				int var3 = arg0.method369();
				field532 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field532[var4] = arg0.method371();
				}
			} else if (var2 == 3) {
				field536 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field533[var2 - 40] = arg0.method371();
			} else if (var2 >= 50 && var2 < 60) {
				field534[var2 - 50] = arg0.method371();
			} else if (var2 >= 60 && var2 < 70) {
				field535[var2 - 60] = arg0.method371();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("CWNXCHDT.a(I)Z")
	public boolean method188() {
		if (field532 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field532.length; var2++) {
			if (!CYPZUKMB.method197(field532[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("CWNXCHDT.b(I)LCYPZUKMB;")
	public CYPZUKMB method189() {
		if (field532 == null) {
			return null;
		}

		CYPZUKMB[] var1 = new CYPZUKMB[field532.length];
		for (int var2 = 0; var2 < field532.length; var2++) {
			var1[var2] = CYPZUKMB.method196(field532[var2]);
		}

		CYPZUKMB var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new CYPZUKMB(var1, var1.length);
		}

		for (int var4 = 0; var4 < 6 && field533[var4] != 0; var4++) {
			var3.method210(field533[var4], field534[var4]);
		}

		return var3;
	}

	@ObfuscatedName("CWNXCHDT.c(I)Z")
	public boolean method190() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field535[var2] != -1 && !CYPZUKMB.method197(field535[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("CWNXCHDT.d(I)LCYPZUKMB;")
	public CYPZUKMB method191() {
		CYPZUKMB[] var1 = new CYPZUKMB[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field535[var3] != -1) {
				var1[var2++] = CYPZUKMB.method196(field535[var3]);
			}
		}

		CYPZUKMB var4 = new CYPZUKMB(var1, var2);
		for (int var5 = 0; var5 < 6 && field533[var5] != 0; var5++) {
			var4.method210(field533[var5], field534[var5]);
		}

		return var4;
	}
}
