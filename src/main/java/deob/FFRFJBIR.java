package deob;

@ObfuscatedName("FFRFJBIR")
public final class FFRFJBIR {

	@ObfuscatedName("FFRFJBIR.f")
	public EDVKOEOK field529 = new EDVKOEOK();

	@ObfuscatedName("FFRFJBIR.j")
	public AAITTAMV field533 = new AAITTAMV();

	@ObfuscatedName("FFRFJBIR.g")
	public int field530;

	@ObfuscatedName("FFRFJBIR.h")
	public int field531;

	@ObfuscatedName("FFRFJBIR.i")
	public GUGSPPMO field532;

	@ObfuscatedName("FFRFJBIR.d")
	public int field527;

	@ObfuscatedName("FFRFJBIR.e")
	public int field528;

	public FFRFJBIR(int arg0) {
		field530 = arg0;
		field531 = arg0;
		field532 = new GUGSPPMO(1024);
	}

	@ObfuscatedName("FFRFJBIR.a(J)LEDVKOEOK;")
	public EDVKOEOK method198(long arg0) {
		EDVKOEOK var3 = (EDVKOEOK) field532.method292(arg0);
		if (var3 == null) {
			field527++;
		} else {
			field533.method1(var3);
			field528++;
		}

		return var3;
	}

	@ObfuscatedName("FFRFJBIR.a(JLEDVKOEOK;Z)V")
	public void method199(long arg0, EDVKOEOK arg1) {
		if (field531 == 0) {
			EDVKOEOK var4 = field533.method2();
			var4.method418();
			var4.method188();

			if (field529 == var4) {
				EDVKOEOK var5 = field533.method2();
				var5.method418();
				var5.method188();
			}
		} else {
			field531--;
		}

		field532.method293(arg1, arg0);
		field533.method1(arg1);
	}

	@ObfuscatedName("FFRFJBIR.a()V")
	public void method200() {
		while (true) {
			EDVKOEOK var1 = field533.method2();
			if (var1 == null) {
				field531 = field530;
				return;
			}

			var1.method418();
			var1.method188();
		}
	}
}
