package deob;

@ObfuscatedName("PTMGRPAM")
public class PTMGRPAM {

	@ObfuscatedName("PTMGRPAM.f")
	public int field1116 = -1;

	@ObfuscatedName("PTMGRPAM.h")
	public int[] field1118 = new int[6];

	@ObfuscatedName("PTMGRPAM.i")
	public int[] field1119 = new int[6];

	@ObfuscatedName("PTMGRPAM.j")
	public int[] field1120 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("PTMGRPAM.k")
	public boolean field1121 = false;

	@ObfuscatedName("PTMGRPAM.d")
	public static int field1114;

	@ObfuscatedName("PTMGRPAM.g")
	public int[] field1117;

	@ObfuscatedName("PTMGRPAM.e")
	public static PTMGRPAM[] field1115;

	@ObfuscatedName("PTMGRPAM.a(LVSUYIIVA;I)V")
	public static void method463(VSUYIIVA arg0) {
		CFARFRSG var1 = new CFARFRSG(arg0.method570("idk.dat", null));
		field1114 = var1.method32();
		if (field1115 == null) {
			field1115 = new PTMGRPAM[field1114];
		}

		for (int var2 = 0; var2 < field1114; var2++) {
			if (field1115[var2] == null) {
				field1115[var2] = new PTMGRPAM();
			}

			field1115[var2].method464(var1);
		}
	}

	@ObfuscatedName("PTMGRPAM.a(LCFARFRSG;I)V")
	public void method464(CFARFRSG arg0) {
		while (true) {
			int var2 = arg0.method30();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1116 = arg0.method30();
			} else if (var2 == 2) {
				int var3 = arg0.method30();
				field1117 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1117[var4] = arg0.method32();
				}
			} else if (var2 == 3) {
				field1121 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field1118[var2 - 40] = arg0.method32();
			} else if (var2 >= 50 && var2 < 60) {
				field1119[var2 - 50] = arg0.method32();
			} else if (var2 >= 60 && var2 < 70) {
				field1120[var2 - 60] = arg0.method32();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("PTMGRPAM.a(I)Z")
	public boolean method465() {
		if (field1117 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1117.length; var2++) {
			if (!LFTMDGKK.method342(field1117[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("PTMGRPAM.b(I)LLFTMDGKK;")
	public LFTMDGKK method466() {
		if (field1117 == null) {
			return null;
		}

		LFTMDGKK[] var1 = new LFTMDGKK[field1117.length];
		for (int var2 = 0; var2 < field1117.length; var2++) {
			var1[var2] = LFTMDGKK.method341(field1117[var2]);
		}

		LFTMDGKK var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new LFTMDGKK(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field1118[var4] != 0; var4++) {
			var3.method355(field1118[var4], field1119[var4]);
		}

		return var3;
	}

	@ObfuscatedName("PTMGRPAM.c(I)Z")
	public boolean method467() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field1120[var2] != -1 && !LFTMDGKK.method342(field1120[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("PTMGRPAM.a(B)LLFTMDGKK;")
	public LFTMDGKK method468() {
		LFTMDGKK[] var1 = new LFTMDGKK[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field1120[var3] != -1) {
				var1[var2++] = LFTMDGKK.method341(field1120[var3]);
			}
		}

		LFTMDGKK var4 = new LFTMDGKK(var2, var1);
		for (int var5 = 0; var5 < 6 && field1118[var5] != 0; var5++) {
			var4.method355(field1118[var5], field1119[var5]);
		}

		return var4;
	}
}
