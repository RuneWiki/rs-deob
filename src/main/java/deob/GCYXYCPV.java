package deob;

@ObfuscatedName("GCYXYCPV")
public class GCYXYCPV {

	@ObfuscatedName("GCYXYCPV.d")
	public int field692 = -1;

	@ObfuscatedName("GCYXYCPV.f")
	public int[] field694 = new int[6];

	@ObfuscatedName("GCYXYCPV.g")
	public int[] field695 = new int[6];

	@ObfuscatedName("GCYXYCPV.h")
	public int[] field696 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("GCYXYCPV.i")
	public boolean field697 = false;

	@ObfuscatedName("GCYXYCPV.b")
	public static int field690;

	@ObfuscatedName("GCYXYCPV.e")
	public int[] field693;

	@ObfuscatedName("GCYXYCPV.c")
	public static GCYXYCPV[] field691;

	@ObfuscatedName("GCYXYCPV.a(ZLXRWUKRPO;)V")
	public static void method221(XRWUKRPO arg0) {
		GLMIQHJI var1 = new GLMIQHJI(arg0.method581("idk.dat", null));
		field690 = var1.method246();
		if (field691 == null) {
			field691 = new GCYXYCPV[field690];
		}

		for (int var2 = 0; var2 < field690; var2++) {
			if (field691[var2] == null) {
				field691[var2] = new GCYXYCPV();
			}

			field691[var2].method222(var1);
		}
	}

	@ObfuscatedName("GCYXYCPV.a(BLGLMIQHJI;)V")
	public void method222(GLMIQHJI arg0) {
		while (true) {
			int var2 = arg0.method244();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field692 = arg0.method244();
			} else if (var2 == 2) {
				int var3 = arg0.method244();
				field693 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field693[var4] = arg0.method246();
				}
			} else if (var2 == 3) {
				field697 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field694[var2 - 40] = arg0.method246();
			} else if (var2 >= 50 && var2 < 60) {
				field695[var2 - 50] = arg0.method246();
			} else if (var2 >= 60 && var2 < 70) {
				field696[var2 - 60] = arg0.method246();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("GCYXYCPV.a(B)Z")
	public boolean method223() {
		if (field693 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field693.length; var2++) {
			if (!VHYCWIPJ.method501(field693[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("GCYXYCPV.b(B)LVHYCWIPJ;")
	public VHYCWIPJ method224() {
		if (field693 == null) {
			return null;
		}

		VHYCWIPJ[] var1 = new VHYCWIPJ[field693.length];
		for (int var2 = 0; var2 < field693.length; var2++) {
			var1[var2] = VHYCWIPJ.method500(field693[var2]);
		}

		VHYCWIPJ var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new VHYCWIPJ(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field694[var4] != 0; var4++) {
			var3.method514(field694[var4], field695[var4]);
		}

		return var3;
	}

	@ObfuscatedName("GCYXYCPV.a(I)Z")
	public boolean method225() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field696[var2] != -1 && !VHYCWIPJ.method501(field696[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("GCYXYCPV.b(I)LVHYCWIPJ;")
	public VHYCWIPJ method226() {
		VHYCWIPJ[] var1 = new VHYCWIPJ[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field696[var3] != -1) {
				var1[var2++] = VHYCWIPJ.method500(field696[var3]);
			}
		}

		VHYCWIPJ var4 = new VHYCWIPJ(var2, var1);
		for (int var5 = 0; var5 < 6 && field694[var5] != 0; var5++) {
			var4.method514(field694[var5], field695[var5]);
		}

		return var4;
	}
}
