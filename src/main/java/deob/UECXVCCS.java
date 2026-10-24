package deob;

@ObfuscatedName("UECXVCCS")
public final class UECXVCCS {

	@ObfuscatedName("UECXVCCS.d")
	public DRKSBDQX field1340 = new DRKSBDQX();

	@ObfuscatedName("UECXVCCS.h")
	public ZLISRGEK field1344 = new ZLISRGEK();

	@ObfuscatedName("UECXVCCS.e")
	public int field1341;

	@ObfuscatedName("UECXVCCS.f")
	public int field1342;

	@ObfuscatedName("UECXVCCS.g")
	public OYARMXQN field1343;

	@ObfuscatedName("UECXVCCS.b")
	public int field1338;

	@ObfuscatedName("UECXVCCS.c")
	public int field1339;

	public UECXVCCS(int arg0) {
		field1341 = arg0;
		field1342 = arg0;
		field1343 = new OYARMXQN(1024);
	}

	@ObfuscatedName("UECXVCCS.a(J)LDRKSBDQX;")
	public DRKSBDQX method538(long arg0) {
		DRKSBDQX var3 = (DRKSBDQX) field1343.method365(arg0);
		if (var3 == null) {
			field1338++;
		} else {
			field1344.method592(var3);
			field1339++;
		}

		return var3;
	}

	@ObfuscatedName("UECXVCCS.a(LDRKSBDQX;IJ)V")
	public void method539(DRKSBDQX arg0, long arg1) {
		if (field1342 == 0) {
			DRKSBDQX var4 = field1344.method593();
			var4.method367();
			var4.method217();

			if (field1340 == var4) {
				DRKSBDQX var5 = field1344.method593();
				var5.method367();
				var5.method217();
			}
		} else {
			field1342--;
		}

		field1343.method366(arg0, arg1);
		field1344.method592(arg0);
	}

	@ObfuscatedName("UECXVCCS.a()V")
	public void method540() {
		while (true) {
			DRKSBDQX var1 = field1344.method593();
			if (var1 == null) {
				field1342 = field1341;
				return;
			}

			var1.method367();
			var1.method217();
		}
	}
}
