package deob;

@ObfuscatedName("BDUNOHSG")
public class BDUNOHSG {

	@ObfuscatedName("BDUNOHSG.g")
	public int field86 = -1;

	@ObfuscatedName("BDUNOHSG.i")
	public int[] field88 = new int[6];

	@ObfuscatedName("BDUNOHSG.j")
	public int[] field89 = new int[6];

	@ObfuscatedName("BDUNOHSG.k")
	public int[] field90 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("BDUNOHSG.l")
	public boolean field91 = false;

	@ObfuscatedName("BDUNOHSG.e")
	public static int field84;

	@ObfuscatedName("BDUNOHSG.h")
	public int[] field87;

	@ObfuscatedName("BDUNOHSG.f")
	public static BDUNOHSG[] field85;

	@ObfuscatedName("BDUNOHSG.a(LBYZSQZUF;Z)V")
	public static void method22(BYZSQZUF arg0) {
		IMUIZRAF var1 = new IMUIZRAF(arg0.method29("idk.dat", null));
		field84 = var1.method240();
		if (field85 == null) {
			field85 = new BDUNOHSG[field84];
		}

		for (int var2 = 0; var2 < field84; var2++) {
			if (field85[var2] == null) {
				field85[var2] = new BDUNOHSG();
			}

			field85[var2].method23(var1);
		}
	}

	@ObfuscatedName("BDUNOHSG.a(ILIMUIZRAF;)V")
	public void method23(IMUIZRAF arg0) {
		while (true) {
			int var2 = arg0.method238();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field86 = arg0.method238();
			} else if (var2 == 2) {
				int var3 = arg0.method238();
				field87 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field87[var4] = arg0.method240();
				}
			} else if (var2 == 3) {
				field91 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field88[var2 - 40] = arg0.method240();
			} else if (var2 >= 50 && var2 < 60) {
				field89[var2 - 50] = arg0.method240();
			} else if (var2 >= 60 && var2 < 70) {
				field90[var2 - 60] = arg0.method240();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("BDUNOHSG.a(I)Z")
	public boolean method24() {
		if (field87 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field87.length; var2++) {
			if (!YABPKWWG.method549(field87[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("BDUNOHSG.a(Z)LYABPKWWG;")
	public YABPKWWG method25() {
		if (field87 == null) {
			return null;
		}

		YABPKWWG[] var1 = new YABPKWWG[field87.length];
		for (int var2 = 0; var2 < field87.length; var2++) {
			var1[var2] = YABPKWWG.method548(field87[var2]);
		}

		YABPKWWG var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new YABPKWWG(var1, var1.length);
		}

		for (int var4 = 0; var4 < 6 && field88[var4] != 0; var4++) {
			var3.method562(field88[var4], field89[var4]);
		}

		return var3;
	}

	@ObfuscatedName("BDUNOHSG.b(I)Z")
	public boolean method26() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field90[var2] != -1 && !YABPKWWG.method549(field90[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("BDUNOHSG.c(I)LYABPKWWG;")
	public YABPKWWG method27() {
		YABPKWWG[] var1 = new YABPKWWG[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field90[var3] != -1) {
				var1[var2++] = YABPKWWG.method548(field90[var3]);
			}
		}

		YABPKWWG var4 = new YABPKWWG(var1, var2);
		for (int var5 = 0; var5 < 6 && field88[var5] != 0; var5++) {
			var4.method562(field88[var5], field89[var5]);
		}

		return var4;
	}
}
