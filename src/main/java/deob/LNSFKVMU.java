package deob;

@ObfuscatedName("LNSFKVMU")
public class LNSFKVMU {

	@ObfuscatedName("LNSFKVMU.i")
	public int field760 = -1;

	@ObfuscatedName("LNSFKVMU.k")
	public int[] field762 = new int[6];

	@ObfuscatedName("LNSFKVMU.l")
	public int[] field763 = new int[6];

	@ObfuscatedName("LNSFKVMU.m")
	public int[] field764 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("LNSFKVMU.n")
	public boolean field765 = false;

	@ObfuscatedName("LNSFKVMU.g")
	public static int field758;

	@ObfuscatedName("LNSFKVMU.j")
	public int[] field761;

	@ObfuscatedName("LNSFKVMU.h")
	public static LNSFKVMU[] field759;

	@ObfuscatedName("LNSFKVMU.a(LCXFTMSCH;B)V")
	public static void method274(CXFTMSCH arg0) {
		MQZHAILV var1 = new MQZHAILV(arg0.method176("idk.dat", null));
		field758 = var1.method327();
		if (field759 == null) {
			field759 = new LNSFKVMU[field758];
		}

		for (int var2 = 0; var2 < field758; var2++) {
			if (field759[var2] == null) {
				field759[var2] = new LNSFKVMU();
			}

			field759[var2].method275(var1);
		}
	}

	@ObfuscatedName("LNSFKVMU.a(LMQZHAILV;I)V")
	public void method275(MQZHAILV arg0) {
		while (true) {
			int var2 = arg0.method325();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field760 = arg0.method325();
			} else if (var2 == 2) {
				int var3 = arg0.method325();
				field761 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field761[var4] = arg0.method327();
				}
			} else if (var2 == 3) {
				field765 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field762[var2 - 40] = arg0.method327();
			} else if (var2 >= 50 && var2 < 60) {
				field763[var2 - 50] = arg0.method327();
			} else if (var2 >= 60 && var2 < 70) {
				field764[var2 - 60] = arg0.method327();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("LNSFKVMU.a(B)Z")
	public boolean method276() {
		if (field761 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field761.length; var2++) {
			if (!YYHPBDED.method552(field761[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("LNSFKVMU.a(I)LYYHPBDED;")
	public YYHPBDED method277() {
		if (field761 == null) {
			return null;
		}

		YYHPBDED[] var1 = new YYHPBDED[field761.length];
		for (int var2 = 0; var2 < field761.length; var2++) {
			var1[var2] = YYHPBDED.method551(field761[var2]);
		}

		YYHPBDED var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new YYHPBDED(var1, var1.length);
		}

		for (int var4 = 0; var4 < 6 && field762[var4] != 0; var4++) {
			var3.method565(field762[var4], field763[var4]);
		}

		return var3;
	}

	@ObfuscatedName("LNSFKVMU.b(I)Z")
	public boolean method278() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field764[var2] != -1 && !YYHPBDED.method552(field764[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("LNSFKVMU.c(I)LYYHPBDED;")
	public YYHPBDED method279() {
		YYHPBDED[] var1 = new YYHPBDED[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field764[var3] != -1) {
				var1[var2++] = YYHPBDED.method551(field764[var3]);
			}
		}

		YYHPBDED var4 = new YYHPBDED(var1, var2);
		for (int var5 = 0; var5 < 6 && field762[var5] != 0; var5++) {
			var4.method565(field762[var5], field763[var5]);
		}

		return var4;
	}
}
