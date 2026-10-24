package deob;

@ObfuscatedName("UPKVWWFD")
public class UPKVWWFD {

	@ObfuscatedName("UPKVWWFD.e")
	public int field1336;

	@ObfuscatedName("UPKVWWFD.h")
	public int field1339;

	@ObfuscatedName("UPKVWWFD.i")
	public int field1340;

	@ObfuscatedName("UPKVWWFD.j")
	public int field1341;

	@ObfuscatedName("UPKVWWFD.k")
	public int field1342;

	@ObfuscatedName("UPKVWWFD.l")
	public int field1343;

	@ObfuscatedName("UPKVWWFD.m")
	public int field1344;

	@ObfuscatedName("UPKVWWFD.n")
	public int field1345;

	@ObfuscatedName("UPKVWWFD.o")
	public int field1346;

	@ObfuscatedName("UPKVWWFD.f")
	public int[] field1337;

	@ObfuscatedName("UPKVWWFD.g")
	public int[] field1338;

	@ObfuscatedName("UPKVWWFD.a(LEGCCHUZS;Z)V")
	public final void method549(EGCCHUZS arg0) {
		field1341 = arg0.method261();
		field1339 = arg0.method266();
		field1340 = arg0.method266();
		method550(arg0);
	}

	@ObfuscatedName("UPKVWWFD.a(ILEGCCHUZS;)V")
	public final void method550(EGCCHUZS arg0) {
		field1336 = arg0.method261();
		field1337 = new int[field1336];
		field1338 = new int[field1336];
		for (int var2 = 0; var2 < field1336; var2++) {
			field1337[var2] = arg0.method263();
			field1338[var2] = arg0.method263();
		}
	}

	@ObfuscatedName("UPKVWWFD.a(B)V")
	public final void method551() {
		field1342 = 0;
		field1343 = 0;
		field1344 = 0;
		field1345 = 0;
		field1346 = 0;
	}

	@ObfuscatedName("UPKVWWFD.a(II)I")
	public final int method552(int arg0) {
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
