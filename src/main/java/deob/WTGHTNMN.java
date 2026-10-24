package deob;

@ObfuscatedName("WTGHTNMN")
public final class WTGHTNMN {

	@ObfuscatedName("WTGHTNMN.d")
	public OJTWJXEY field1290 = new OJTWJXEY();

	@ObfuscatedName("WTGHTNMN.e")
	public OJTWJXEY field1291;

	public WTGHTNMN() {
		field1290.field905 = field1290;
		field1290.field906 = field1290;
	}

	@ObfuscatedName("WTGHTNMN.a(LOJTWJXEY;)V")
	public void method467(OJTWJXEY arg0) {
		if (arg0.field906 != null) {
			arg0.method338();
		}

		arg0.field906 = field1290.field906;
		arg0.field905 = field1290;
		arg0.field906.field905 = arg0;
		arg0.field905.field906 = arg0;
	}

	@ObfuscatedName("WTGHTNMN.a(LOJTWJXEY;I)V")
	public void method468(OJTWJXEY arg0) {
		if (arg0.field906 != null) {
			arg0.method338();
		}

		arg0.field906 = field1290;
		arg0.field905 = field1290.field905;
		arg0.field906.field905 = arg0;
		arg0.field905.field906 = arg0;
	}

	@ObfuscatedName("WTGHTNMN.a()LOJTWJXEY;")
	public OJTWJXEY method469() {
		OJTWJXEY var1 = field1290.field905;
		if (field1290 == var1) {
			return null;
		} else {
			var1.method338();
			return var1;
		}
	}

	@ObfuscatedName("WTGHTNMN.b()LOJTWJXEY;")
	public OJTWJXEY method470() {
		OJTWJXEY var1 = field1290.field905;
		if (field1290 == var1) {
			field1291 = null;
			return null;
		} else {
			field1291 = var1.field905;
			return var1;
		}
	}

	@ObfuscatedName("WTGHTNMN.a(I)LOJTWJXEY;")
	public OJTWJXEY method471() {
		OJTWJXEY var1 = field1290.field906;
		if (field1290 == var1) {
			field1291 = null;
			return null;
		} else {
			field1291 = var1.field906;
			return var1;
		}
	}

	@ObfuscatedName("WTGHTNMN.a(Z)LOJTWJXEY;")
	public OJTWJXEY method472() {
		OJTWJXEY var1 = field1291;
		if (field1290 == var1) {
			field1291 = null;
			return null;
		} else {
			field1291 = var1.field905;
			return var1;
		}
	}

	@ObfuscatedName("WTGHTNMN.b(I)LOJTWJXEY;")
	public OJTWJXEY method473() {
		OJTWJXEY var1 = field1291;
		if (field1290 == var1) {
			field1291 = null;
			return null;
		} else {
			field1291 = var1.field906;
			return var1;
		}
	}

	@ObfuscatedName("WTGHTNMN.c()V")
	public void method474() {
		if (field1290.field905 != field1290) {
			while (true) {
				OJTWJXEY var1 = field1290.field905;
				if (field1290 == var1) {
					return;
				}

				var1.method338();
			}
		}
	}
}
