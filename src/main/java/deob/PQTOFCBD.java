package deob;

@ObfuscatedName("PQTOFCBD")
public class PQTOFCBD {

	@ObfuscatedName("PQTOFCBD.e")
	public int field1158 = -1;

	@ObfuscatedName("PQTOFCBD.g")
	public int[] field1160 = new int[6];

	@ObfuscatedName("PQTOFCBD.h")
	public int[] field1161 = new int[6];

	@ObfuscatedName("PQTOFCBD.i")
	public int[] field1162 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("PQTOFCBD.j")
	public boolean field1163 = false;

	@ObfuscatedName("PQTOFCBD.c")
	public static int field1156;

	@ObfuscatedName("PQTOFCBD.f")
	public int[] field1159;

	@ObfuscatedName("PQTOFCBD.d")
	public static PQTOFCBD[] field1157;

	@ObfuscatedName("PQTOFCBD.a(LNXFIIFAD;I)V")
	public static void method444(NXFIIFAD arg0) {
		MNKDCXXG var1 = new MNKDCXXG(arg0.method431("idk.dat", null));
		field1156 = var1.method388();
		if (field1157 == null) {
			field1157 = new PQTOFCBD[field1156];
		}

		for (int var2 = 0; var2 < field1156; var2++) {
			if (field1157[var2] == null) {
				field1157[var2] = new PQTOFCBD();
			}

			field1157[var2].method445(var1);
		}
	}

	@ObfuscatedName("PQTOFCBD.a(LMNKDCXXG;I)V")
	public void method445(MNKDCXXG arg0) {
		while (true) {
			int var2 = arg0.method386();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1158 = arg0.method386();
			} else if (var2 == 2) {
				int var3 = arg0.method386();
				field1159 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1159[var4] = arg0.method388();
				}
			} else if (var2 == 3) {
				field1163 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field1160[var2 - 40] = arg0.method388();
			} else if (var2 >= 50 && var2 < 60) {
				field1161[var2 - 50] = arg0.method388();
			} else if (var2 >= 60 && var2 < 70) {
				field1162[var2 - 60] = arg0.method388();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("PQTOFCBD.a(I)Z")
	public boolean method446() {
		if (field1159 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1159.length; var2++) {
			if (!IRLTEWJP.method282(field1159[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("PQTOFCBD.b(I)LIRLTEWJP;")
	public IRLTEWJP method447() {
		if (field1159 == null) {
			return null;
		}

		IRLTEWJP[] var1 = new IRLTEWJP[field1159.length];
		for (int var2 = 0; var2 < field1159.length; var2++) {
			var1[var2] = IRLTEWJP.method281(field1159[var2]);
		}

		IRLTEWJP var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new IRLTEWJP(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field1160[var4] != 0; var4++) {
			var3.method295(field1160[var4], field1161[var4]);
		}

		return var3;
	}

	@ObfuscatedName("PQTOFCBD.c(I)Z")
	public boolean method448() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field1162[var2] != -1 && !IRLTEWJP.method282(field1162[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("PQTOFCBD.d(I)LIRLTEWJP;")
	public IRLTEWJP method449() {
		IRLTEWJP[] var1 = new IRLTEWJP[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field1162[var3] != -1) {
				var1[var2++] = IRLTEWJP.method281(field1162[var3]);
			}
		}

		IRLTEWJP var4 = new IRLTEWJP(var2, var1);
		for (int var5 = 0; var5 < 6 && field1160[var5] != 0; var5++) {
			var4.method295(field1160[var5], field1161[var5]);
		}

		return var4;
	}
}
