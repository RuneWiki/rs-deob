package deob;

@ObfuscatedName("XCOYGYOS")
public class XCOYGYOS {

	@ObfuscatedName("XCOYGYOS.b")
	public int field1336;

	@ObfuscatedName("XCOYGYOS.e")
	public int field1339;

	@ObfuscatedName("XCOYGYOS.f")
	public int field1340;

	@ObfuscatedName("XCOYGYOS.g")
	public int field1341;

	@ObfuscatedName("XCOYGYOS.h")
	public int field1342;

	@ObfuscatedName("XCOYGYOS.i")
	public int field1343;

	@ObfuscatedName("XCOYGYOS.j")
	public int field1344;

	@ObfuscatedName("XCOYGYOS.k")
	public int field1345;

	@ObfuscatedName("XCOYGYOS.l")
	public int field1346;

	@ObfuscatedName("XCOYGYOS.c")
	public int[] field1337;

	@ObfuscatedName("XCOYGYOS.d")
	public int[] field1338;

	@ObfuscatedName("XCOYGYOS.a(LZOMNSJJM;B)V")
	public final void method454(ZOMNSJJM arg0) {
		field1341 = arg0.method547();
		field1339 = arg0.method552();
		field1340 = arg0.method552();
		method455(arg0);
	}

	@ObfuscatedName("XCOYGYOS.a(LZOMNSJJM;I)V")
	public final void method455(ZOMNSJJM arg0) {
		field1336 = arg0.method547();
		field1337 = new int[field1336];
		field1338 = new int[field1336];
		for (int var2 = 0; var2 < field1336; var2++) {
			field1337[var2] = arg0.method549();
			field1338[var2] = arg0.method549();
		}
	}

	@ObfuscatedName("XCOYGYOS.a(I)V")
	public final void method456() {
		field1342 = 0;
		field1343 = 0;
		field1344 = 0;
		field1345 = 0;
		field1346 = 0;
	}

	@ObfuscatedName("XCOYGYOS.a(II)I")
	public final int method457(int arg0) {
		if (field1346 >= field1342) {
			field1345 = field1338[field1343++] << 15;

			if (field1343 >= field1336) {
				field1343 = field1336 - 1;
			}

			field1342 = (int) (field1337[field1343] / 65536.0D * arg0);
			if (field1342 > field1346) {
				field1344 = ((field1338[field1343] << 15) - field1345) / (field1342 - field1346);
			}
		}

		field1345 += field1344;
		field1346++;
		return field1345 - field1344 >> 15;
	}
}
