package deob;

@ObfuscatedName("DSMCVRKW")
public final class DSMCVRKW {

	@ObfuscatedName("DSMCVRKW.d")
	public BIJRHVKA field673 = new BIJRHVKA();

	@ObfuscatedName("DSMCVRKW.h")
	public UMTLOYSA field677 = new UMTLOYSA();

	@ObfuscatedName("DSMCVRKW.e")
	public int field674;

	@ObfuscatedName("DSMCVRKW.f")
	public int field675;

	@ObfuscatedName("DSMCVRKW.g")
	public HWTUYSNT field676;

	@ObfuscatedName("DSMCVRKW.b")
	public int field671;

	@ObfuscatedName("DSMCVRKW.c")
	public int field672;

	public DSMCVRKW(int arg0) {
		field674 = arg0;
		field675 = arg0;
		field676 = new HWTUYSNT(1024);
	}

	@ObfuscatedName("DSMCVRKW.a(J)LBIJRHVKA;")
	public BIJRHVKA method197(long arg0) {
		BIJRHVKA var3 = (BIJRHVKA) field676.method303(arg0);
		if (var3 == null) {
			field671++;
		} else {
			field677.method466(var3);
			field672++;
		}

		return var3;
	}

	@ObfuscatedName("DSMCVRKW.a(BJLBIJRHVKA;)V")
	public void method198(long arg0, BIJRHVKA arg1) {
		if (field675 == 0) {
			BIJRHVKA var4 = field677.method467();
			var4.method334();
			var4.method35();

			if (field673 == var4) {
				BIJRHVKA var5 = field677.method467();
				var5.method334();
				var5.method35();
			}
		} else {
			field675--;
		}

		field676.method304(arg0, arg1);
		field677.method466(arg1);
	}

	@ObfuscatedName("DSMCVRKW.a()V")
	public void method199() {
		while (true) {
			BIJRHVKA var1 = field677.method467();
			if (var1 == null) {
				field675 = field674;
				return;
			}

			var1.method334();
			var1.method35();
		}
	}
}
