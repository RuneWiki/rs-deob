package deob;

@ObfuscatedName("WUMSOEQS")
public final class WUMSOEQS {

	@ObfuscatedName("WUMSOEQS.d")
	public MUOTSYDS field1474 = new MUOTSYDS();

	@ObfuscatedName("WUMSOEQS.h")
	public KZFVEUEL field1478 = new KZFVEUEL();

	@ObfuscatedName("WUMSOEQS.e")
	public int field1475;

	@ObfuscatedName("WUMSOEQS.f")
	public int field1476;

	@ObfuscatedName("WUMSOEQS.g")
	public GRIRTYPY field1477;

	@ObfuscatedName("WUMSOEQS.b")
	public int field1472;

	@ObfuscatedName("WUMSOEQS.c")
	public int field1473;

	public WUMSOEQS(int arg0) {
		field1475 = arg0;
		field1476 = arg0;
		field1477 = new GRIRTYPY(1024);
	}

	@ObfuscatedName("WUMSOEQS.a(J)LMUOTSYDS;")
	public MUOTSYDS method586(long arg0) {
		MUOTSYDS var3 = (MUOTSYDS) field1477.method222(arg0);
		if (var3 == null) {
			field1472++;
		} else {
			field1478.method310(var3);
			field1473++;
		}

		return var3;
	}

	@ObfuscatedName("WUMSOEQS.a(IJLMUOTSYDS;)V")
	public void method587(long arg0, MUOTSYDS arg1) {
		if (field1476 == 0) {
			MUOTSYDS var4 = field1478.method311();
			var4.method589();
			var4.method344();

			if (field1474 == var4) {
				MUOTSYDS var5 = field1478.method311();
				var5.method589();
				var5.method344();
			}
		} else {
			field1476--;
		}

		field1477.method223(arg1, arg0);
		field1478.method310(arg1);
	}

	@ObfuscatedName("WUMSOEQS.a()V")
	public void method588() {
		while (true) {
			MUOTSYDS var1 = field1478.method311();
			if (var1 == null) {
				field1476 = field1475;
				return;
			}

			var1.method589();
			var1.method344();
		}
	}
}
