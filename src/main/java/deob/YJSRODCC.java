package deob;

@ObfuscatedName("YJSRODCC")
public class YJSRODCC {

	@ObfuscatedName("YJSRODCC.b")
	public int field1404;

	@ObfuscatedName("YJSRODCC.e")
	public int field1407;

	@ObfuscatedName("YJSRODCC.f")
	public int field1408;

	@ObfuscatedName("YJSRODCC.g")
	public int field1409;

	@ObfuscatedName("YJSRODCC.h")
	public int field1410;

	@ObfuscatedName("YJSRODCC.i")
	public int field1411;

	@ObfuscatedName("YJSRODCC.j")
	public int field1412;

	@ObfuscatedName("YJSRODCC.k")
	public int field1413;

	@ObfuscatedName("YJSRODCC.l")
	public int field1414;

	@ObfuscatedName("YJSRODCC.c")
	public int[] field1405;

	@ObfuscatedName("YJSRODCC.d")
	public int[] field1406;

	@ObfuscatedName("YJSRODCC.a(LPGNBHFUF;I)V")
	public final void method571(PGNBHFUF arg0) {
		field1409 = arg0.method420();
		field1407 = arg0.method425();
		field1408 = arg0.method425();
		method572(arg0);
	}

	@ObfuscatedName("YJSRODCC.b(LPGNBHFUF;I)V")
	public final void method572(PGNBHFUF arg0) {
		field1404 = arg0.method420();
		field1405 = new int[field1404];
		field1406 = new int[field1404];
		for (int var2 = 0; var2 < field1404; var2++) {
			field1405[var2] = arg0.method422();
			field1406[var2] = arg0.method422();
		}
	}

	@ObfuscatedName("YJSRODCC.a(B)V")
	public final void method573() {
		field1410 = 0;
		field1411 = 0;
		field1412 = 0;
		field1413 = 0;
		field1414 = 0;
	}

	@ObfuscatedName("YJSRODCC.a(IZ)I")
	public final int method574(int arg0) {
		if (field1414 >= field1410) {
			field1413 = field1406[field1411++] << 15;

			if (field1411 >= field1404) {
				field1411 = field1404 - 1;
			}

			field1410 = (int) (field1405[field1411] / 65536.0D * arg0);
			if (field1410 > field1414) {
				field1412 = ((field1406[field1411] << 15) - field1413) / (field1410 - field1414);
			}
		}

		field1413 += field1412;
		field1414++;
		return field1413 - field1412 >> 15;
	}
}
