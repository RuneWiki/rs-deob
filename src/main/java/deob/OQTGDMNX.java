package deob;

@ObfuscatedName("OQTGDMNX")
public class OQTGDMNX {

	@ObfuscatedName("OQTGDMNX.g")
	public int field1017 = -1;

	@ObfuscatedName("OQTGDMNX.i")
	public int[] field1019 = new int[6];

	@ObfuscatedName("OQTGDMNX.j")
	public int[] field1020 = new int[6];

	@ObfuscatedName("OQTGDMNX.k")
	public int[] field1021 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("OQTGDMNX.l")
	public boolean field1022 = false;

	@ObfuscatedName("OQTGDMNX.e")
	public static int field1015;

	@ObfuscatedName("OQTGDMNX.h")
	public int[] field1018;

	@ObfuscatedName("OQTGDMNX.f")
	public static OQTGDMNX[] field1016;

	@ObfuscatedName("OQTGDMNX.a(ILQKFGLETG;)V")
	public static void method383(QKFGLETG arg0) {
		XJCNBMKS var1 = new XJCNBMKS(arg0.method402("idk.dat", null));
		field1015 = var1.method536();
		if (field1016 == null) {
			field1016 = new OQTGDMNX[field1015];
		}

		for (int var2 = 0; var2 < field1015; var2++) {
			if (field1016[var2] == null) {
				field1016[var2] = new OQTGDMNX();
			}

			field1016[var2].method384(var1);
		}
	}

	@ObfuscatedName("OQTGDMNX.a(BLXJCNBMKS;)V")
	public void method384(XJCNBMKS arg0) {
		while (true) {
			int var2 = arg0.method534();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1017 = arg0.method534();
			} else if (var2 == 2) {
				int var3 = arg0.method534();
				field1018 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1018[var4] = arg0.method536();
				}
			} else if (var2 == 3) {
				field1022 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field1019[var2 - 40] = arg0.method536();
			} else if (var2 >= 50 && var2 < 60) {
				field1020[var2 - 50] = arg0.method536();
			} else if (var2 >= 60 && var2 < 70) {
				field1021[var2 - 60] = arg0.method536();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("OQTGDMNX.a(B)Z")
	public boolean method385() {
		if (field1018 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1018.length; var2++) {
			if (!FUTAQMCE.method251(field1018[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("OQTGDMNX.a(I)LFUTAQMCE;")
	public FUTAQMCE method386() {
		if (field1018 == null) {
			return null;
		}

		FUTAQMCE[] var1 = new FUTAQMCE[field1018.length];
		for (int var2 = 0; var2 < field1018.length; var2++) {
			var1[var2] = FUTAQMCE.method250(field1018[var2]);
		}

		FUTAQMCE var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new FUTAQMCE(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field1019[var4] != 0; var4++) {
			var3.method264(field1019[var4], field1020[var4]);
		}

		return var3;
	}

	@ObfuscatedName("OQTGDMNX.a(Z)Z")
	public boolean method387() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field1021[var2] != -1 && !FUTAQMCE.method251(field1021[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("OQTGDMNX.b(B)LFUTAQMCE;")
	public FUTAQMCE method388() {
		FUTAQMCE[] var1 = new FUTAQMCE[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field1021[var3] != -1) {
				var1[var2++] = FUTAQMCE.method250(field1021[var3]);
			}
		}

		FUTAQMCE var4 = new FUTAQMCE(var2, var1);
		for (int var5 = 0; var5 < 6 && field1019[var5] != 0; var5++) {
			var4.method264(field1019[var5], field1020[var5]);
		}

		return var4;
	}
}
