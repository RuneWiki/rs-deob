package deob;

@ObfuscatedName("BOZWYCIO")
public final class BOZWYCIO {

	@ObfuscatedName("BOZWYCIO.c")
	public AGCGSOQI field64 = new AGCGSOQI();

	@ObfuscatedName("BOZWYCIO.d")
	public AGCGSOQI field65;

	public BOZWYCIO() {
		field64.field1 = field64;
		field64.field2 = field64;
	}

	@ObfuscatedName("BOZWYCIO.a(LAGCGSOQI;)V")
	public void method42(AGCGSOQI arg0) {
		if (arg0.field2 != null) {
			arg0.method1();
		}

		arg0.field2 = field64.field2;
		arg0.field1 = field64;
		arg0.field2.field1 = arg0;
		arg0.field1.field2 = arg0;
	}

	@ObfuscatedName("BOZWYCIO.a()LAGCGSOQI;")
	public AGCGSOQI method43() {
		AGCGSOQI var1 = field64.field1;
		if (field64 == var1) {
			return null;
		} else {
			var1.method1();
			return var1;
		}
	}

	@ObfuscatedName("BOZWYCIO.b()LAGCGSOQI;")
	public AGCGSOQI method44() {
		AGCGSOQI var1 = field64.field1;
		if (field64 == var1) {
			field65 = null;
			return null;
		} else {
			field65 = var1.field1;
			return var1;
		}
	}

	@ObfuscatedName("BOZWYCIO.a(Z)LAGCGSOQI;")
	public AGCGSOQI method45() {
		AGCGSOQI var1 = field65;
		if (field64 == var1) {
			field65 = null;
			return null;
		} else {
			field65 = var1.field1;
			return var1;
		}
	}

	@ObfuscatedName("BOZWYCIO.c()I")
	public int method46() {
		int var1 = 0;
		for (AGCGSOQI var2 = field64.field1; var2 != field64; var2 = var2.field1) {
			var1++;
		}

		return var1;
	}
}
