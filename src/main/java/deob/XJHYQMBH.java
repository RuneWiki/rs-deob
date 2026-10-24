package deob;

@ObfuscatedName("XJHYQMBH")
public class XJHYQMBH {

	@ObfuscatedName("XJHYQMBH.b")
	public int field1474;

	@ObfuscatedName("XJHYQMBH.e")
	public int field1477;

	@ObfuscatedName("XJHYQMBH.f")
	public int field1478;

	@ObfuscatedName("XJHYQMBH.g")
	public int field1479;

	@ObfuscatedName("XJHYQMBH.h")
	public int field1480;

	@ObfuscatedName("XJHYQMBH.i")
	public int field1481;

	@ObfuscatedName("XJHYQMBH.j")
	public int field1482;

	@ObfuscatedName("XJHYQMBH.k")
	public int field1483;

	@ObfuscatedName("XJHYQMBH.l")
	public int field1484;

	@ObfuscatedName("XJHYQMBH.c")
	public int[] field1475;

	@ObfuscatedName("XJHYQMBH.d")
	public int[] field1476;

	@ObfuscatedName("XJHYQMBH.a(ILSVWJKJVI;)V")
	public final void method590(SVWJKJVI arg0) {
		field1479 = arg0.method461();
		field1477 = arg0.method466();
		field1478 = arg0.method466();
		method591(arg0);
	}

	@ObfuscatedName("XJHYQMBH.a(LSVWJKJVI;Z)V")
	public final void method591(SVWJKJVI arg0) {
		field1474 = arg0.method461();
		field1475 = new int[field1474];
		field1476 = new int[field1474];
		for (int var2 = 0; var2 < field1474; var2++) {
			field1475[var2] = arg0.method463();
			field1476[var2] = arg0.method463();
		}
	}

	@ObfuscatedName("XJHYQMBH.a(I)V")
	public final void method592() {
		field1480 = 0;
		field1481 = 0;
		field1482 = 0;
		field1483 = 0;
		field1484 = 0;
	}

	@ObfuscatedName("XJHYQMBH.a(BI)I")
	public final int method593(int arg0) {
		if (field1484 >= field1480) {
			field1483 = field1476[field1481++] << 15;

			if (field1481 >= field1474) {
				field1481 = field1474 - 1;
			}

			field1480 = (int) (field1475[field1481] / 65536.0D * arg0);
			if (field1480 > field1484) {
				field1482 = ((field1476[field1481] << 15) - field1483) / (field1480 - field1484);
			}
		}

		field1483 += field1482;
		field1484++;
		return field1483 - field1482 >> 15;
	}
}
