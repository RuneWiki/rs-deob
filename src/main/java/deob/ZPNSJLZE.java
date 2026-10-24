package deob;

@ObfuscatedName("ZPNSJLZE")
public final class ZPNSJLZE {

	@ObfuscatedName("ZPNSJLZE.e")
	public KWULTEKW field1486 = new KWULTEKW();

	@ObfuscatedName("ZPNSJLZE.i")
	public YGUBUIIU field1490 = new YGUBUIIU();

	@ObfuscatedName("ZPNSJLZE.f")
	public int field1487;

	@ObfuscatedName("ZPNSJLZE.g")
	public int field1488;

	@ObfuscatedName("ZPNSJLZE.h")
	public XWMRKIHQ field1489;

	@ObfuscatedName("ZPNSJLZE.c")
	public int field1484;

	@ObfuscatedName("ZPNSJLZE.d")
	public int field1485;

	public ZPNSJLZE(int arg0) {
		field1487 = arg0;
		field1488 = arg0;
		field1489 = new XWMRKIHQ(1024);
	}

	@ObfuscatedName("ZPNSJLZE.a(J)LKWULTEKW;")
	public KWULTEKW method586(long arg0) {
		KWULTEKW var3 = (KWULTEKW) field1489.method554(arg0);
		if (var3 == null) {
			field1484++;
		} else {
			field1490.method573(var3);
			field1485++;
		}

		return var3;
	}

	@ObfuscatedName("ZPNSJLZE.a(LKWULTEKW;IJ)V")
	public void method587(KWULTEKW arg0, long arg1) {
		if (field1488 == 0) {
			KWULTEKW var4 = field1490.method574();
			var4.method336();
			var4.method330();

			if (field1486 == var4) {
				KWULTEKW var5 = field1490.method574();
				var5.method336();
				var5.method330();
			}
		} else {
			field1488--;
		}

		field1489.method555(arg0, arg1);
		field1490.method573(arg0);
	}

	@ObfuscatedName("ZPNSJLZE.a()V")
	public void method588() {
		while (true) {
			KWULTEKW var1 = field1490.method574();
			if (var1 == null) {
				field1488 = field1487;
				return;
			}

			var1.method336();
			var1.method330();
		}
	}
}
