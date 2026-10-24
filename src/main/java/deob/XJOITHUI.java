package deob;

@ObfuscatedName("XJOITHUI")
public class XJOITHUI {

	@ObfuscatedName("XJOITHUI.c")
	public int field1427;

	@ObfuscatedName("XJOITHUI.f")
	public int field1430;

	@ObfuscatedName("XJOITHUI.g")
	public int field1431;

	@ObfuscatedName("XJOITHUI.h")
	public int field1432;

	@ObfuscatedName("XJOITHUI.i")
	public int field1433;

	@ObfuscatedName("XJOITHUI.j")
	public int field1434;

	@ObfuscatedName("XJOITHUI.k")
	public int field1435;

	@ObfuscatedName("XJOITHUI.l")
	public int field1436;

	@ObfuscatedName("XJOITHUI.m")
	public int field1437;

	@ObfuscatedName("XJOITHUI.d")
	public int[] field1428;

	@ObfuscatedName("XJOITHUI.e")
	public int[] field1429;

	@ObfuscatedName("XJOITHUI.a(ILBJPWOXRJ;)V")
	public final void method538(BJPWOXRJ arg0) {
		field1432 = arg0.method15();
		field1430 = arg0.method20();
		field1431 = arg0.method20();
		method539(arg0);
	}

	@ObfuscatedName("XJOITHUI.a(LBJPWOXRJ;B)V")
	public final void method539(BJPWOXRJ arg0) {
		field1427 = arg0.method15();
		field1428 = new int[field1427];
		field1429 = new int[field1427];
		for (int var2 = 0; var2 < field1427; var2++) {
			field1428[var2] = arg0.method17();
			field1429[var2] = arg0.method17();
		}
	}

	@ObfuscatedName("XJOITHUI.a(I)V")
	public final void method540() {
		field1433 = 0;
		field1434 = 0;
		field1435 = 0;
		field1436 = 0;
		field1437 = 0;
	}

	@ObfuscatedName("XJOITHUI.a(ZI)I")
	public final int method541(int arg0) {
		if (field1437 >= field1433) {
			field1436 = field1429[field1434++] << 15;

			if (field1434 >= field1427) {
				field1434 = field1427 - 1;
			}

			field1433 = (int) (field1428[field1434] / 65536.0D * arg0);
			if (field1433 > field1437) {
				field1435 = ((field1429[field1434] << 15) - field1436) / (field1433 - field1437);
			}
		}

		field1436 += field1435;
		field1437++;
		return field1436 - field1435 >> 15;
	}
}
