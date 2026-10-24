package deob;

@ObfuscatedName("DMOAMUBS")
public final class DMOAMUBS {

	@ObfuscatedName("DMOAMUBS.f")
	public IZSDUVJF field602 = new IZSDUVJF();

	@ObfuscatedName("DMOAMUBS.j")
	public TOAGRHDF field606 = new TOAGRHDF();

	@ObfuscatedName("DMOAMUBS.g")
	public int field603;

	@ObfuscatedName("DMOAMUBS.h")
	public int field604;

	@ObfuscatedName("DMOAMUBS.i")
	public MCCUMEPE field605;

	@ObfuscatedName("DMOAMUBS.d")
	public int field600;

	@ObfuscatedName("DMOAMUBS.e")
	public int field601;

	public DMOAMUBS(int arg0) {
		field603 = arg0;
		field604 = arg0;
		field605 = new MCCUMEPE(1024);
	}

	@ObfuscatedName("DMOAMUBS.a(J)LIZSDUVJF;")
	public IZSDUVJF method193(long arg0) {
		IZSDUVJF var3 = (IZSDUVJF) field605.method314(arg0);
		if (var3 == null) {
			field600++;
		} else {
			field606.method353(var3);
			field601++;
		}

		return var3;
	}

	@ObfuscatedName("DMOAMUBS.a(JBLIZSDUVJF;)V")
	public void method194(long arg0, IZSDUVJF arg1) {
		if (field604 == 0) {
			IZSDUVJF var4 = field606.method354();
			var4.method334();
			var4.method256();

			if (field602 == var4) {
				IZSDUVJF var5 = field606.method354();
				var5.method334();
				var5.method256();
			}
		} else {
			field604--;
		}

		field605.method315(arg1, arg0);
		field606.method353(arg1);
	}

	@ObfuscatedName("DMOAMUBS.a()V")
	public void method195() {
		while (true) {
			IZSDUVJF var1 = field606.method354();
			if (var1 == null) {
				field604 = field603;
				return;
			}

			var1.method334();
			var1.method256();
		}
	}
}
