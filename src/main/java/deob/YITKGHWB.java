package deob;

@ObfuscatedName("YITKGHWB")
public final class YITKGHWB {

	@ObfuscatedName("YITKGHWB.d")
	public YBEHHNFF field1482 = new YBEHHNFF();

	@ObfuscatedName("YITKGHWB.h")
	public TSCGUBKV field1486 = new TSCGUBKV();

	@ObfuscatedName("YITKGHWB.e")
	public int field1483;

	@ObfuscatedName("YITKGHWB.f")
	public int field1484;

	@ObfuscatedName("YITKGHWB.g")
	public ZZGAIEMG field1485;

	@ObfuscatedName("YITKGHWB.b")
	public int field1480;

	@ObfuscatedName("YITKGHWB.c")
	public int field1481;

	public YITKGHWB(int arg0) {
		field1483 = arg0;
		field1484 = arg0;
		field1485 = new ZZGAIEMG(1024);
	}

	@ObfuscatedName("YITKGHWB.a(J)LYBEHHNFF;")
	public YBEHHNFF method572(long arg0) {
		YBEHHNFF var3 = (YBEHHNFF) field1485.method601(arg0);
		if (var3 == null) {
			field1480++;
		} else {
			field1486.method459(var3);
			field1481++;
		}

		return var3;
	}

	@ObfuscatedName("YITKGHWB.a(ZLYBEHHNFF;J)V")
	public void method573(YBEHHNFF arg0, long arg1) {
		if (field1484 == 0) {
			YBEHHNFF var4 = field1486.method460();
			var4.method163();
			var4.method567();

			if (field1482 == var4) {
				YBEHHNFF var5 = field1486.method460();
				var5.method163();
				var5.method567();
			}
		} else {
			field1484--;
		}

		field1485.method602(arg1, arg0);
		field1486.method459(arg0);
	}

	@ObfuscatedName("YITKGHWB.a()V")
	public void method574() {
		while (true) {
			YBEHHNFF var1 = field1486.method460();
			if (var1 == null) {
				field1484 = field1483;
				return;
			}

			var1.method163();
			var1.method567();
		}
	}
}
