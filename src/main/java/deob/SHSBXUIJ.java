package deob;

@ObfuscatedName("SHSBXUIJ")
public class SHSBXUIJ {

	@ObfuscatedName("SHSBXUIJ.b")
	public int field1362;

	@ObfuscatedName("SHSBXUIJ.e")
	public int field1365;

	@ObfuscatedName("SHSBXUIJ.f")
	public int field1366;

	@ObfuscatedName("SHSBXUIJ.g")
	public int field1367;

	@ObfuscatedName("SHSBXUIJ.h")
	public int field1368;

	@ObfuscatedName("SHSBXUIJ.i")
	public int field1369;

	@ObfuscatedName("SHSBXUIJ.j")
	public int field1370;

	@ObfuscatedName("SHSBXUIJ.k")
	public int field1371;

	@ObfuscatedName("SHSBXUIJ.l")
	public int field1372;

	@ObfuscatedName("SHSBXUIJ.c")
	public int[] field1363;

	@ObfuscatedName("SHSBXUIJ.d")
	public int[] field1364;

	@ObfuscatedName("SHSBXUIJ.a(ILRGCGKKUR;)V")
	public final void method493(RGCGKKUR arg0) {
		field1367 = arg0.method455();
		field1365 = arg0.method460();
		field1366 = arg0.method460();
		method494(arg0);
	}

	@ObfuscatedName("SHSBXUIJ.b(ILRGCGKKUR;)V")
	public final void method494(RGCGKKUR arg0) {
		field1362 = arg0.method455();
		field1363 = new int[field1362];
		field1364 = new int[field1362];
		for (int var2 = 0; var2 < field1362; var2++) {
			field1363[var2] = arg0.method457();
			field1364[var2] = arg0.method457();
		}
	}

	@ObfuscatedName("SHSBXUIJ.a(I)V")
	public final void method495() {
		field1368 = 0;
		field1369 = 0;
		field1370 = 0;
		field1371 = 0;
		field1372 = 0;
	}

	@ObfuscatedName("SHSBXUIJ.a(II)I")
	public final int method496(int arg0) {
		if (field1372 >= field1368) {
			field1371 = field1364[field1369++] << 15;

			if (field1369 >= field1362) {
				field1369 = field1362 - 1;
			}

			field1368 = (int) (field1363[field1369] / 65536.0D * arg0);
			if (field1368 > field1372) {
				field1370 = ((field1364[field1369] << 15) - field1371) / (field1368 - field1372);
			}
		}

		field1371 += field1370;
		field1372++;
		return field1371 - field1370 >> 15;
	}
}
