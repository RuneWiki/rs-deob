package deob;

@ObfuscatedName("FIQZIGZB")
public class FIQZIGZB {

	@ObfuscatedName("FIQZIGZB.g")
	public int field743 = -1;

	@ObfuscatedName("FIQZIGZB.i")
	public int[] field745 = new int[6];

	@ObfuscatedName("FIQZIGZB.j")
	public int[] field746 = new int[6];

	@ObfuscatedName("FIQZIGZB.k")
	public int[] field747 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("FIQZIGZB.l")
	public boolean field748 = false;

	@ObfuscatedName("FIQZIGZB.e")
	public static int field741;

	@ObfuscatedName("FIQZIGZB.h")
	public int[] field744;

	@ObfuscatedName("FIQZIGZB.f")
	public static FIQZIGZB[] field742;

	@ObfuscatedName("FIQZIGZB.a(LDYBMLHQM;Z)V")
	public static void method257(DYBMLHQM arg0) {
		INLHDAGO var1 = new INLHDAGO(arg0.method248("idk.dat", null));
		field741 = var1.method310();
		if (field742 == null) {
			field742 = new FIQZIGZB[field741];
		}

		for (int var2 = 0; var2 < field741; var2++) {
			if (field742[var2] == null) {
				field742[var2] = new FIQZIGZB();
			}

			field742[var2].method258(var1);
		}
	}

	@ObfuscatedName("FIQZIGZB.a(ILINLHDAGO;)V")
	public void method258(INLHDAGO arg0) {
		while (true) {
			int var2 = arg0.method308();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field743 = arg0.method308();
			} else if (var2 == 2) {
				int var3 = arg0.method308();
				field744 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field744[var4] = arg0.method310();
				}
			} else if (var2 == 3) {
				field748 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field745[var2 - 40] = arg0.method310();
			} else if (var2 >= 50 && var2 < 60) {
				field746[var2 - 50] = arg0.method310();
			} else if (var2 >= 60 && var2 < 70) {
				field747[var2 - 60] = arg0.method310();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("FIQZIGZB.a(B)Z")
	public boolean method259() {
		if (field744 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field744.length; var2++) {
			if (!DHUPIIUL.method192(field744[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("FIQZIGZB.a(I)LDHUPIIUL;")
	public DHUPIIUL method260() {
		if (field744 == null) {
			return null;
		}

		DHUPIIUL[] var1 = new DHUPIIUL[field744.length];
		for (int var2 = 0; var2 < field744.length; var2++) {
			var1[var2] = DHUPIIUL.method191(field744[var2]);
		}

		DHUPIIUL var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new DHUPIIUL(var1, var1.length);
		}

		for (int var4 = 0; var4 < 6 && field745[var4] != 0; var4++) {
			var3.method205(field745[var4], field746[var4]);
		}

		return var3;
	}

	@ObfuscatedName("FIQZIGZB.a(Z)Z")
	public boolean method261() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field747[var2] != -1 && !DHUPIIUL.method192(field747[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("FIQZIGZB.b(B)LDHUPIIUL;")
	public DHUPIIUL method262() {
		DHUPIIUL[] var1 = new DHUPIIUL[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field747[var3] != -1) {
				var1[var2++] = DHUPIIUL.method191(field747[var3]);
			}
		}

		DHUPIIUL var4 = new DHUPIIUL(var1, var2);
		for (int var5 = 0; var5 < 6 && field745[var5] != 0; var5++) {
			var4.method205(field745[var5], field746[var5]);
		}

		return var4;
	}
}
