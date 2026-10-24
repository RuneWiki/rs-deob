package deob;

@ObfuscatedName("QUXKFXEA")
public class QUXKFXEA {

	@ObfuscatedName("QUXKFXEA.e")
	public int field1151 = -1;

	@ObfuscatedName("QUXKFXEA.g")
	public int[] field1153 = new int[6];

	@ObfuscatedName("QUXKFXEA.h")
	public int[] field1154 = new int[6];

	@ObfuscatedName("QUXKFXEA.i")
	public int field1155 = 128;

	@ObfuscatedName("QUXKFXEA.j")
	public int field1156 = 128;

	@ObfuscatedName("QUXKFXEA.n")
	public static JGECYJMS field1160 = new JGECYJMS(30);

	@ObfuscatedName("QUXKFXEA.a")
	public static int field1147;

	@ObfuscatedName("QUXKFXEA.c")
	public int field1149;

	@ObfuscatedName("QUXKFXEA.d")
	public int field1150;

	@ObfuscatedName("QUXKFXEA.k")
	public int field1157;

	@ObfuscatedName("QUXKFXEA.l")
	public int field1158;

	@ObfuscatedName("QUXKFXEA.m")
	public int field1159;

	@ObfuscatedName("QUXKFXEA.f")
	public LMDSPIVT field1152;

	@ObfuscatedName("QUXKFXEA.b")
	public static QUXKFXEA[] field1148;

	@ObfuscatedName("QUXKFXEA.a(BLSXKKBWPU;)V")
	public static void method411(SXKKBWPU arg0) {
		TQYMAXSO var1 = new TQYMAXSO(arg0.method442("spotanim.dat", null));
		field1147 = var1.method470();
		if (field1148 == null) {
			field1148 = new QUXKFXEA[field1147];
		}

		for (int var2 = 0; var2 < field1147; var2++) {
			if (field1148[var2] == null) {
				field1148[var2] = new QUXKFXEA();
			}

			field1148[var2].field1149 = var2;
			field1148[var2].method412(var1);
		}
	}

	@ObfuscatedName("QUXKFXEA.a(ILTQYMAXSO;)V")
	public void method412(TQYMAXSO arg0) {
		while (true) {
			int var2 = arg0.method468();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1150 = arg0.method470();
			} else if (var2 == 2) {
				field1151 = arg0.method470();
				if (LMDSPIVT.field867 != null) {
					field1152 = LMDSPIVT.field867[field1151];
				}
			} else if (var2 == 4) {
				field1155 = arg0.method470();
			} else if (var2 == 5) {
				field1156 = arg0.method470();
			} else if (var2 == 6) {
				field1157 = arg0.method470();
			} else if (var2 == 7) {
				field1158 = arg0.method468();
			} else if (var2 == 8) {
				field1159 = arg0.method468();
			} else if (var2 >= 40 && var2 < 50) {
				field1153[var2 - 40] = arg0.method470();
			} else if (var2 >= 50 && var2 < 60) {
				field1154[var2 - 50] = arg0.method470();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("QUXKFXEA.a()LKDWDYCIL;")
	public KDWDYCIL method413() {
		KDWDYCIL var1 = (KDWDYCIL) field1160.method230(field1149);
		if (var1 != null) {
			return var1;
		}

		KDWDYCIL var2 = KDWDYCIL.method246(field1150);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1153[0] != 0) {
				var2.method260(field1153[var3], field1154[var3]);
			}
		}

		field1160.method231(field1149, var2);
		return var2;
	}
}
