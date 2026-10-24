package deob;

@ObfuscatedName("QXKQGEKL")
public final class QXKQGEKL {

	@ObfuscatedName("QXKQGEKL.f")
	public PFQOGDTY field1344 = new PFQOGDTY();

	@ObfuscatedName("QXKQGEKL.j")
	public LIHZBJAU field1348 = new LIHZBJAU();

	@ObfuscatedName("QXKQGEKL.g")
	public int field1345;

	@ObfuscatedName("QXKQGEKL.h")
	public int field1346;

	@ObfuscatedName("QXKQGEKL.i")
	public SMFBSJJD field1347;

	@ObfuscatedName("QXKQGEKL.d")
	public int field1342;

	@ObfuscatedName("QXKQGEKL.e")
	public int field1343;

	public QXKQGEKL(int arg0) {
		field1345 = arg0;
		field1346 = arg0;
		field1347 = new SMFBSJJD(1024);
	}

	@ObfuscatedName("QXKQGEKL.a(J)LPFQOGDTY;")
	public PFQOGDTY method440(long arg0) {
		PFQOGDTY var3 = (PFQOGDTY) field1347.method503(arg0);
		if (var3 == null) {
			field1342++;
		} else {
			field1348.method265(var3);
			field1343++;
		}

		return var3;
	}

	@ObfuscatedName("QXKQGEKL.a(JLPFQOGDTY;I)V")
	public void method441(long arg0, PFQOGDTY arg1) {
		if (field1346 == 0) {
			PFQOGDTY var4 = field1348.method266();
			var4.method505();
			var4.method423();

			if (field1344 == var4) {
				PFQOGDTY var5 = field1348.method266();
				var5.method505();
				var5.method423();
			}
		} else {
			field1346--;
		}

		field1347.method504(arg0, arg1);
		field1348.method265(arg1);
	}

	@ObfuscatedName("QXKQGEKL.a()V")
	public void method442() {
		while (true) {
			PFQOGDTY var1 = field1348.method266();
			if (var1 == null) {
				field1346 = field1345;
				return;
			}

			var1.method505();
			var1.method423();
		}
	}
}
