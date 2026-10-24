package deob;

@ObfuscatedName("ZYLCKQCD")
public final class ZYLCKQCD {

	@ObfuscatedName("ZYLCKQCD.d")
	public RZDMTEAZ field1490 = new RZDMTEAZ();

	@ObfuscatedName("ZYLCKQCD.h")
	public NAZXUZWI field1494 = new NAZXUZWI();

	@ObfuscatedName("ZYLCKQCD.e")
	public int field1491;

	@ObfuscatedName("ZYLCKQCD.f")
	public int field1492;

	@ObfuscatedName("ZYLCKQCD.g")
	public WIZYUELH field1493;

	@ObfuscatedName("ZYLCKQCD.b")
	public int field1488;

	@ObfuscatedName("ZYLCKQCD.c")
	public int field1489;

	public ZYLCKQCD(int arg0) {
		field1491 = arg0;
		field1492 = arg0;
		field1493 = new WIZYUELH(1024);
	}

	@ObfuscatedName("ZYLCKQCD.a(J)LRZDMTEAZ;")
	public RZDMTEAZ method599(long arg0) {
		RZDMTEAZ var3 = (RZDMTEAZ) field1493.method523(arg0);
		if (var3 == null) {
			field1488++;
		} else {
			field1494.method388(var3);
			field1489++;
		}

		return var3;
	}

	@ObfuscatedName("ZYLCKQCD.a(LRZDMTEAZ;IJ)V")
	public void method600(RZDMTEAZ arg0, long arg1) {
		if (field1492 == 0) {
			RZDMTEAZ var4 = field1494.method389();
			var4.method221();
			var4.method495();

			if (field1490 == var4) {
				RZDMTEAZ var5 = field1494.method389();
				var5.method221();
				var5.method495();
			}
		} else {
			field1492--;
		}

		field1493.method524(arg0, arg1);
		field1494.method388(arg0);
	}

	@ObfuscatedName("ZYLCKQCD.a()V")
	public void method601() {
		while (true) {
			RZDMTEAZ var1 = field1494.method389();
			if (var1 == null) {
				field1492 = field1491;
				return;
			}

			var1.method221();
			var1.method495();
		}
	}
}
