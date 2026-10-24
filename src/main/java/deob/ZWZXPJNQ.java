package deob;

@ObfuscatedName("ZWZXPJNQ")
public final class ZWZXPJNQ {

	@ObfuscatedName("ZWZXPJNQ.d")
	public OYTUMBCI field1514 = new OYTUMBCI();

	@ObfuscatedName("ZWZXPJNQ.e")
	public OYTUMBCI field1515;

	public ZWZXPJNQ() {
		field1514.field1073 = field1514;
		field1514.field1074 = field1514;
	}

	@ObfuscatedName("ZWZXPJNQ.a(LOYTUMBCI;)V")
	public void method597(OYTUMBCI arg0) {
		if (arg0.field1074 != null) {
			arg0.method367();
		}

		arg0.field1074 = field1514.field1074;
		arg0.field1073 = field1514;
		arg0.field1074.field1073 = arg0;
		arg0.field1073.field1074 = arg0;
	}

	@ObfuscatedName("ZWZXPJNQ.a(ILOYTUMBCI;)V")
	public void method598(OYTUMBCI arg0) {
		if (arg0.field1074 != null) {
			arg0.method367();
		}

		arg0.field1074 = field1514;
		arg0.field1073 = field1514.field1073;
		arg0.field1074.field1073 = arg0;
		arg0.field1073.field1074 = arg0;
	}

	@ObfuscatedName("ZWZXPJNQ.a()LOYTUMBCI;")
	public OYTUMBCI method599() {
		OYTUMBCI var1 = field1514.field1073;
		if (field1514 == var1) {
			return null;
		} else {
			var1.method367();
			return var1;
		}
	}

	@ObfuscatedName("ZWZXPJNQ.b()LOYTUMBCI;")
	public OYTUMBCI method600() {
		OYTUMBCI var1 = field1514.field1073;
		if (field1514 == var1) {
			field1515 = null;
			return null;
		} else {
			field1515 = var1.field1073;
			return var1;
		}
	}

	@ObfuscatedName("ZWZXPJNQ.a(I)LOYTUMBCI;")
	public OYTUMBCI method601() {
		OYTUMBCI var1 = field1514.field1074;
		if (field1514 == var1) {
			field1515 = null;
			return null;
		} else {
			field1515 = var1.field1074;
			return var1;
		}
	}

	@ObfuscatedName("ZWZXPJNQ.a(B)LOYTUMBCI;")
	public OYTUMBCI method602() {
		OYTUMBCI var1 = field1515;
		if (field1514 == var1) {
			field1515 = null;
			return null;
		} else {
			field1515 = var1.field1073;
			return var1;
		}
	}

	@ObfuscatedName("ZWZXPJNQ.b(B)LOYTUMBCI;")
	public OYTUMBCI method603() {
		OYTUMBCI var1 = field1515;
		if (field1514 == var1) {
			field1515 = null;
			return null;
		} else {
			field1515 = var1.field1074;
			return var1;
		}
	}

	@ObfuscatedName("ZWZXPJNQ.c()V")
	public void method604() {
		if (field1514.field1073 != field1514) {
			while (true) {
				OYTUMBCI var1 = field1514.field1073;
				if (field1514 == var1) {
					return;
				}

				var1.method367();
			}
		}
	}
}
