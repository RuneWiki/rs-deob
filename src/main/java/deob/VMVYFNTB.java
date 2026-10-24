package deob;

@ObfuscatedName("VMVYFNTB")
public class VMVYFNTB {

	@ObfuscatedName("VMVYFNTB.d")
	public int field1368;

	@ObfuscatedName("VMVYFNTB.g")
	public int field1371;

	@ObfuscatedName("VMVYFNTB.h")
	public int field1372;

	@ObfuscatedName("VMVYFNTB.i")
	public int field1373;

	@ObfuscatedName("VMVYFNTB.j")
	public int field1374;

	@ObfuscatedName("VMVYFNTB.k")
	public int field1375;

	@ObfuscatedName("VMVYFNTB.l")
	public int field1376;

	@ObfuscatedName("VMVYFNTB.m")
	public int field1377;

	@ObfuscatedName("VMVYFNTB.n")
	public int field1378;

	@ObfuscatedName("VMVYFNTB.e")
	public int[] field1369;

	@ObfuscatedName("VMVYFNTB.f")
	public int[] field1370;

	@ObfuscatedName("VMVYFNTB.a(BLXJCNBMKS;)V")
	public final void method513(XJCNBMKS arg0) {
		field1373 = arg0.method534();
		field1371 = arg0.method539();
		field1372 = arg0.method539();
		method514(arg0);
	}

	@ObfuscatedName("VMVYFNTB.a(LXJCNBMKS;B)V")
	public final void method514(XJCNBMKS arg0) {
		field1368 = arg0.method534();
		field1369 = new int[field1368];
		field1370 = new int[field1368];
		for (int var2 = 0; var2 < field1368; var2++) {
			field1369[var2] = arg0.method536();
			field1370[var2] = arg0.method536();
		}
	}

	@ObfuscatedName("VMVYFNTB.a(B)V")
	public final void method515() {
		field1374 = 0;
		field1375 = 0;
		field1376 = 0;
		field1377 = 0;
		field1378 = 0;
	}

	@ObfuscatedName("VMVYFNTB.a(II)I")
	public final int method516(int arg0) {
		if (field1378 >= field1374) {
			field1377 = field1370[field1375++] << 15;

			if (field1375 >= field1368) {
				field1375 = field1368 - 1;
			}

			field1374 = (int) (field1369[field1375] / 65536.0D * arg0);
			if (field1374 > field1378) {
				field1376 = ((field1370[field1375] << 15) - field1377) / (field1374 - field1378);
			}
		}

		field1377 += field1376;
		field1378++;
		return field1377 - field1376 >> 15;
	}
}
