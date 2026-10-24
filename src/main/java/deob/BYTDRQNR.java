package deob;

@ObfuscatedName("BYTDRQNR")
public class BYTDRQNR {

	@ObfuscatedName("BYTDRQNR.f")
	public int field38 = -1;

	@ObfuscatedName("BYTDRQNR.h")
	public int[] field40 = new int[6];

	@ObfuscatedName("BYTDRQNR.i")
	public int[] field41 = new int[6];

	@ObfuscatedName("BYTDRQNR.j")
	public int[] field42 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("BYTDRQNR.k")
	public boolean field43 = false;

	@ObfuscatedName("BYTDRQNR.d")
	public static int field36;

	@ObfuscatedName("BYTDRQNR.g")
	public int[] field39;

	@ObfuscatedName("BYTDRQNR.e")
	public static BYTDRQNR[] field37;

	@ObfuscatedName("BYTDRQNR.a(ZLXMRRKSSB;)V")
	public static void method21(XMRRKSSB arg0) {
		XQPFGONL var1 = new XQPFGONL(arg0.method465("idk.dat", null));
		field36 = var1.method480();
		if (field37 == null) {
			field37 = new BYTDRQNR[field36];
		}

		for (int var2 = 0; var2 < field36; var2++) {
			if (field37[var2] == null) {
				field37[var2] = new BYTDRQNR();
			}

			field37[var2].method22(var1);
		}
	}

	@ObfuscatedName("BYTDRQNR.a(LXQPFGONL;I)V")
	public void method22(XQPFGONL arg0) {
		while (true) {
			int var2 = arg0.method478();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field38 = arg0.method478();
			} else if (var2 == 2) {
				int var3 = arg0.method478();
				field39 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field39[var4] = arg0.method480();
				}
			} else if (var2 == 3) {
				field43 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field40[var2 - 40] = arg0.method480();
			} else if (var2 >= 50 && var2 < 60) {
				field41[var2 - 50] = arg0.method480();
			} else if (var2 >= 60 && var2 < 70) {
				field42[var2 - 60] = arg0.method480();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("BYTDRQNR.a(Z)Z")
	public boolean method23() {
		if (field39 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field39.length; var2++) {
			if (!ITSMSHJO.method239(field39[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("BYTDRQNR.a(I)LITSMSHJO;")
	public ITSMSHJO method24() {
		if (field39 == null) {
			return null;
		}

		ITSMSHJO[] var1 = new ITSMSHJO[field39.length];
		for (int var2 = 0; var2 < field39.length; var2++) {
			var1[var2] = ITSMSHJO.method238(field39[var2]);
		}

		ITSMSHJO var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new ITSMSHJO(var1, var1.length);
		}

		for (int var4 = 0; var4 < 6 && field40[var4] != 0; var4++) {
			var3.method252(field40[var4], field41[var4]);
		}

		return var3;
	}

	@ObfuscatedName("BYTDRQNR.b(I)Z")
	public boolean method25() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field42[var2] != -1 && !ITSMSHJO.method239(field42[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("BYTDRQNR.a(B)LITSMSHJO;")
	public ITSMSHJO method26() {
		ITSMSHJO[] var1 = new ITSMSHJO[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field42[var3] != -1) {
				var1[var2++] = ITSMSHJO.method238(field42[var3]);
			}
		}

		ITSMSHJO var4 = new ITSMSHJO(var1, var2);
		for (int var5 = 0; var5 < 6 && field40[var5] != 0; var5++) {
			var4.method252(field40[var5], field41[var5]);
		}

		return var4;
	}
}
