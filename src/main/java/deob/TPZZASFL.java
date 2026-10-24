package deob;

@ObfuscatedName("TPZZASFL")
public class TPZZASFL {

	@ObfuscatedName("TPZZASFL.b")
	public int field1425;

	@ObfuscatedName("TPZZASFL.e")
	public int field1428;

	@ObfuscatedName("TPZZASFL.f")
	public int field1429;

	@ObfuscatedName("TPZZASFL.g")
	public int field1430;

	@ObfuscatedName("TPZZASFL.h")
	public int field1431;

	@ObfuscatedName("TPZZASFL.i")
	public int field1432;

	@ObfuscatedName("TPZZASFL.j")
	public int field1433;

	@ObfuscatedName("TPZZASFL.k")
	public int field1434;

	@ObfuscatedName("TPZZASFL.l")
	public int field1435;

	@ObfuscatedName("TPZZASFL.c")
	public int[] field1426;

	@ObfuscatedName("TPZZASFL.d")
	public int[] field1427;

	@ObfuscatedName("TPZZASFL.a(ILMVHXDWGI;)V")
	public final void method570(MVHXDWGI arg0) {
		field1430 = arg0.method357();
		field1428 = arg0.method362();
		field1429 = arg0.method362();
		method571(arg0);
	}

	@ObfuscatedName("TPZZASFL.a(LMVHXDWGI;I)V")
	public final void method571(MVHXDWGI arg0) {
		field1425 = arg0.method357();
		field1426 = new int[field1425];
		field1427 = new int[field1425];
		for (int var2 = 0; var2 < field1425; var2++) {
			field1426[var2] = arg0.method359();
			field1427[var2] = arg0.method359();
		}
	}

	@ObfuscatedName("TPZZASFL.a(B)V")
	public final void method572() {
		field1431 = 0;
		field1432 = 0;
		field1433 = 0;
		field1434 = 0;
		field1435 = 0;
	}

	@ObfuscatedName("TPZZASFL.a(IB)I")
	public final int method573(int arg0) {
		if (field1435 >= field1431) {
			field1434 = field1427[field1432++] << 15;

			if (field1432 >= field1425) {
				field1432 = field1425 - 1;
			}

			field1431 = (int) (field1426[field1432] / 65536.0D * arg0);
			if (field1431 > field1435) {
				field1433 = ((field1427[field1432] << 15) - field1434) / (field1431 - field1435);
			}
		}

		field1434 += field1433;
		field1435++;
		return field1434 - field1433 >> 15;
	}
}
