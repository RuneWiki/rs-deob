package deob;

@ObfuscatedName("DSCQIAPU")
public final class DSCQIAPU {

	@ObfuscatedName("DSCQIAPU.d")
	public MCYIFIZT field538 = new MCYIFIZT();

	@ObfuscatedName("DSCQIAPU.h")
	public EDMDOBNM field542 = new EDMDOBNM();

	@ObfuscatedName("DSCQIAPU.e")
	public int field539;

	@ObfuscatedName("DSCQIAPU.f")
	public int field540;

	@ObfuscatedName("DSCQIAPU.g")
	public JJYRPNAX field541;

	@ObfuscatedName("DSCQIAPU.b")
	public int field536;

	@ObfuscatedName("DSCQIAPU.c")
	public int field537;

	public DSCQIAPU(int arg0) {
		field539 = arg0;
		field540 = arg0;
		field541 = new JJYRPNAX(1024);
	}

	@ObfuscatedName("DSCQIAPU.a(J)LMCYIFIZT;")
	public MCYIFIZT method179(long arg0) {
		MCYIFIZT var3 = (MCYIFIZT) field541.method315(arg0);
		if (var3 == null) {
			field536++;
		} else {
			field542.method193(var3);
			field537++;
		}

		return var3;
	}

	@ObfuscatedName("DSCQIAPU.a(ZLMCYIFIZT;J)V")
	public void method180(MCYIFIZT arg0, long arg1) {
		if (field540 == 0) {
			MCYIFIZT var4 = field542.method194();
			var4.method327();
			var4.method380();

			if (field538 == var4) {
				MCYIFIZT var5 = field542.method194();
				var5.method327();
				var5.method380();
			}
		} else {
			field540--;
		}

		field541.method316(arg0, arg1);
		field542.method193(arg0);
	}

	@ObfuscatedName("DSCQIAPU.a()V")
	public void method181() {
		while (true) {
			MCYIFIZT var1 = field542.method194();
			if (var1 == null) {
				field540 = field539;
				return;
			}

			var1.method327();
			var1.method380();
		}
	}
}
