package deob;

@ObfuscatedName("NRGHMRLX")
public class NRGHMRLX {

	@ObfuscatedName("NRGHMRLX.d")
	public int field1016 = -1;

	@ObfuscatedName("NRGHMRLX.f")
	public int[] field1018 = new int[6];

	@ObfuscatedName("NRGHMRLX.g")
	public int[] field1019 = new int[6];

	@ObfuscatedName("NRGHMRLX.h")
	public int[] field1020 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("NRGHMRLX.i")
	public boolean field1021 = false;

	@ObfuscatedName("NRGHMRLX.b")
	public static int field1014;

	@ObfuscatedName("NRGHMRLX.e")
	public int[] field1017;

	@ObfuscatedName("NRGHMRLX.c")
	public static NRGHMRLX[] field1015;

	@ObfuscatedName("NRGHMRLX.a(ILCVNWKEAW;)V")
	public static void method417(CVNWKEAW arg0) {
		XOUQUKZW var1 = new XOUQUKZW(arg0.method180("idk.dat", null));
		field1014 = var1.method523();
		if (field1015 == null) {
			field1015 = new NRGHMRLX[field1014];
		}

		for (int var2 = 0; var2 < field1014; var2++) {
			if (field1015[var2] == null) {
				field1015[var2] = new NRGHMRLX();
			}

			field1015[var2].method418(var1);
		}
	}

	@ObfuscatedName("NRGHMRLX.a(BLXOUQUKZW;)V")
	public void method418(XOUQUKZW arg0) {
		while (true) {
			int var2 = arg0.method521();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1016 = arg0.method521();
			} else if (var2 == 2) {
				int var3 = arg0.method521();
				field1017 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1017[var4] = arg0.method523();
				}
			} else if (var2 == 3) {
				field1021 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field1018[var2 - 40] = arg0.method523();
			} else if (var2 >= 50 && var2 < 60) {
				field1019[var2 - 50] = arg0.method523();
			} else if (var2 >= 60 && var2 < 70) {
				field1020[var2 - 60] = arg0.method523();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("NRGHMRLX.a(I)Z")
	public boolean method419() {
		if (field1017 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1017.length; var2++) {
			if (!KPUOCBCE.method380(field1017[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("NRGHMRLX.b(I)LKPUOCBCE;")
	public KPUOCBCE method420() {
		if (field1017 == null) {
			return null;
		}

		KPUOCBCE[] var1 = new KPUOCBCE[field1017.length];
		for (int var2 = 0; var2 < field1017.length; var2++) {
			var1[var2] = KPUOCBCE.method379(field1017[var2]);
		}

		KPUOCBCE var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new KPUOCBCE(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field1018[var4] != 0; var4++) {
			var3.method393(field1018[var4], field1019[var4]);
		}

		return var3;
	}

	@ObfuscatedName("NRGHMRLX.a(B)Z")
	public boolean method421() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field1020[var2] != -1 && !KPUOCBCE.method380(field1020[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("NRGHMRLX.c(I)LKPUOCBCE;")
	public KPUOCBCE method422() {
		KPUOCBCE[] var1 = new KPUOCBCE[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field1020[var3] != -1) {
				var1[var2++] = KPUOCBCE.method379(field1020[var3]);
			}
		}

		KPUOCBCE var4 = new KPUOCBCE(var2, var1);
		for (int var5 = 0; var5 < 6 && field1018[var5] != 0; var5++) {
			var4.method393(field1018[var5], field1019[var5]);
		}

		return var4;
	}
}
