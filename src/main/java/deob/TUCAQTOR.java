package deob;

@ObfuscatedName("TUCAQTOR")
public final class TUCAQTOR {

	@ObfuscatedName("TUCAQTOR.e")
	public NTGUDCTQ field1283 = new NTGUDCTQ();

	@ObfuscatedName("TUCAQTOR.i")
	public MMJBXXXO field1287 = new MMJBXXXO();

	@ObfuscatedName("TUCAQTOR.f")
	public int field1284;

	@ObfuscatedName("TUCAQTOR.g")
	public int field1285;

	@ObfuscatedName("TUCAQTOR.h")
	public WEZGVHTE field1286;

	@ObfuscatedName("TUCAQTOR.c")
	public int field1281;

	@ObfuscatedName("TUCAQTOR.d")
	public int field1282;

	public TUCAQTOR(int arg0) {
		field1284 = arg0;
		field1285 = arg0;
		field1286 = new WEZGVHTE(1024);
	}

	@ObfuscatedName("TUCAQTOR.a(J)LNTGUDCTQ;")
	public NTGUDCTQ method566(long arg0) {
		NTGUDCTQ var3 = (NTGUDCTQ) field1286.method586(arg0);
		if (var3 == null) {
			field1281++;
		} else {
			field1287.method404(var3);
			field1282++;
		}

		return var3;
	}

	@ObfuscatedName("TUCAQTOR.a(ZLNTGUDCTQ;J)V")
	public void method567(NTGUDCTQ arg0, long arg1) {
		if (field1285 == 0) {
			NTGUDCTQ var4 = field1287.method405();
			var4.method1();
			var4.method409();

			if (field1283 == var4) {
				NTGUDCTQ var5 = field1287.method405();
				var5.method1();
				var5.method409();
			}
		} else {
			field1285--;
		}

		field1286.method587(arg0, arg1);
		field1287.method404(arg0);
	}

	@ObfuscatedName("TUCAQTOR.a()V")
	public void method568() {
		while (true) {
			NTGUDCTQ var1 = field1287.method405();
			if (var1 == null) {
				field1285 = field1284;
				return;
			}

			var1.method1();
			var1.method409();
		}
	}
}
