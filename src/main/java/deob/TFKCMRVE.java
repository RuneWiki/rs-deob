package deob;

@ObfuscatedName("TFKCMRVE")
public class TFKCMRVE {

	@ObfuscatedName("TFKCMRVE.f")
	public int field1187 = -1;

	@ObfuscatedName("TFKCMRVE.h")
	public int[] field1189 = new int[6];

	@ObfuscatedName("TFKCMRVE.i")
	public int[] field1190 = new int[6];

	@ObfuscatedName("TFKCMRVE.j")
	public int[] field1191 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("TFKCMRVE.k")
	public boolean field1192 = false;

	@ObfuscatedName("TFKCMRVE.d")
	public static int field1185;

	@ObfuscatedName("TFKCMRVE.g")
	public int[] field1188;

	@ObfuscatedName("TFKCMRVE.e")
	public static TFKCMRVE[] field1186;

	@ObfuscatedName("TFKCMRVE.a(ILBBMKAXRK;)V")
	public static void method453(BBMKAXRK arg0) {
		EILHLJCE var1 = new EILHLJCE(arg0.method30("idk.dat", null));
		field1185 = var1.method226();
		if (field1186 == null) {
			field1186 = new TFKCMRVE[field1185];
		}

		for (int var2 = 0; var2 < field1185; var2++) {
			if (field1186[var2] == null) {
				field1186[var2] = new TFKCMRVE();
			}

			field1186[var2].method454(var1);
		}
	}

	@ObfuscatedName("TFKCMRVE.a(LEILHLJCE;B)V")
	public void method454(EILHLJCE arg0) {
		while (true) {
			int var2 = arg0.method224();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1187 = arg0.method224();
			} else if (var2 == 2) {
				int var3 = arg0.method224();
				field1188 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1188[var4] = arg0.method226();
				}
			} else if (var2 == 3) {
				field1192 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field1189[var2 - 40] = arg0.method226();
			} else if (var2 >= 50 && var2 < 60) {
				field1190[var2 - 50] = arg0.method226();
			} else if (var2 >= 60 && var2 < 70) {
				field1191[var2 - 60] = arg0.method226();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("TFKCMRVE.a(Z)Z")
	public boolean method455() {
		if (field1188 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1188.length; var2++) {
			if (!KBEXSZSN.method340(field1188[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("TFKCMRVE.a(B)LKBEXSZSN;")
	public KBEXSZSN method456() {
		if (field1188 == null) {
			return null;
		}

		KBEXSZSN[] var1 = new KBEXSZSN[field1188.length];
		for (int var2 = 0; var2 < field1188.length; var2++) {
			var1[var2] = KBEXSZSN.method339(field1188[var2]);
		}

		KBEXSZSN var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new KBEXSZSN(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field1189[var4] != 0; var4++) {
			var3.method353(field1189[var4], field1190[var4]);
		}

		return var3;
	}

	@ObfuscatedName("TFKCMRVE.a(I)Z")
	public boolean method457() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field1191[var2] != -1 && !KBEXSZSN.method340(field1191[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("TFKCMRVE.b(I)LKBEXSZSN;")
	public KBEXSZSN method458() {
		KBEXSZSN[] var1 = new KBEXSZSN[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field1191[var3] != -1) {
				var1[var2++] = KBEXSZSN.method339(field1191[var3]);
			}
		}

		KBEXSZSN var4 = new KBEXSZSN(var2, var1);
		for (int var5 = 0; var5 < 6 && field1189[var5] != 0; var5++) {
			var4.method353(field1189[var5], field1190[var5]);
		}

		return var4;
	}
}
