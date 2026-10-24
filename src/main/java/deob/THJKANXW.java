package deob;

@ObfuscatedName("THJKANXW")
public final class THJKANXW {

	@ObfuscatedName("THJKANXW.e")
	public KIFEZIQJ field1250 = new KIFEZIQJ();

	@ObfuscatedName("THJKANXW.i")
	public YAKFHRTY field1254 = new YAKFHRTY();

	@ObfuscatedName("THJKANXW.f")
	public int field1251;

	@ObfuscatedName("THJKANXW.g")
	public int field1252;

	@ObfuscatedName("THJKANXW.h")
	public YDNMMDSW field1253;

	@ObfuscatedName("THJKANXW.c")
	public int field1248;

	@ObfuscatedName("THJKANXW.d")
	public int field1249;

	public THJKANXW(int arg0) {
		field1251 = arg0;
		field1252 = arg0;
		field1253 = new YDNMMDSW(1024);
	}

	@ObfuscatedName("THJKANXW.a(J)LKIFEZIQJ;")
	public KIFEZIQJ method529(long arg0) {
		KIFEZIQJ var3 = (KIFEZIQJ) field1253.method567(arg0);
		if (var3 == null) {
			field1248++;
		} else {
			field1254.method562(var3);
			field1249++;
		}

		return var3;
	}

	@ObfuscatedName("THJKANXW.a(JZLKIFEZIQJ;)V")
	public void method530(long arg0, KIFEZIQJ arg1) {
		if (field1252 == 0) {
			KIFEZIQJ var4 = field1254.method563();
			var4.method464();
			var4.method352();

			if (field1250 == var4) {
				KIFEZIQJ var5 = field1254.method563();
				var5.method464();
				var5.method352();
			}
		} else {
			field1252--;
		}

		field1253.method568(arg0, arg1);
		field1254.method562(arg1);
	}

	@ObfuscatedName("THJKANXW.a()V")
	public void method531() {
		while (true) {
			KIFEZIQJ var1 = field1254.method563();
			if (var1 == null) {
				field1252 = field1251;
				return;
			}

			var1.method464();
			var1.method352();
		}
	}
}
