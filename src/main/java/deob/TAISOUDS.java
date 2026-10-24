package deob;

@ObfuscatedName("TAISOUDS")
public class TAISOUDS {

	@ObfuscatedName("TAISOUDS.a")
	public int field1365;

	@ObfuscatedName("TAISOUDS.d")
	public int field1368;

	@ObfuscatedName("TAISOUDS.e")
	public int field1369;

	@ObfuscatedName("TAISOUDS.f")
	public int field1370;

	@ObfuscatedName("TAISOUDS.g")
	public int field1371;

	@ObfuscatedName("TAISOUDS.h")
	public int field1372;

	@ObfuscatedName("TAISOUDS.i")
	public int field1373;

	@ObfuscatedName("TAISOUDS.j")
	public int field1374;

	@ObfuscatedName("TAISOUDS.k")
	public int field1375;

	@ObfuscatedName("TAISOUDS.b")
	public int[] field1366;

	@ObfuscatedName("TAISOUDS.c")
	public int[] field1367;

	@ObfuscatedName("TAISOUDS.a(ZLLZWRHABP;)V")
	public final void method571(LZWRHABP arg0) {
		field1370 = arg0.method463();
		field1368 = arg0.method468();
		field1369 = arg0.method468();
		method572(arg0);
	}

	@ObfuscatedName("TAISOUDS.a(BLLZWRHABP;)V")
	public final void method572(LZWRHABP arg0) {
		field1365 = arg0.method463();
		field1366 = new int[field1365];
		field1367 = new int[field1365];
		for (int var2 = 0; var2 < field1365; var2++) {
			field1366[var2] = arg0.method465();
			field1367[var2] = arg0.method465();
		}
	}

	@ObfuscatedName("TAISOUDS.a(I)V")
	public final void method573() {
		field1371 = 0;
		field1372 = 0;
		field1373 = 0;
		field1374 = 0;
		field1375 = 0;
	}

	@ObfuscatedName("TAISOUDS.a(ZI)I")
	public final int method574(int arg0) {
		if (field1375 >= field1371) {
			field1374 = field1367[field1372++] << 15;

			if (field1372 >= field1365) {
				field1372 = field1365 - 1;
			}

			field1371 = (int) (field1366[field1372] / 65536.0D * arg0);
			if (field1371 > field1375) {
				field1373 = ((field1367[field1372] << 15) - field1374) / (field1371 - field1375);
			}
		}

		field1374 += field1373;
		field1375++;
		return field1374 - field1373 >> 15;
	}
}
