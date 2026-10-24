package deob;

@ObfuscatedName("PILILDKN")
public final class PILILDKN {

	@ObfuscatedName("PILILDKN.c")
	public WYQNTERC field895 = new WYQNTERC();

	@ObfuscatedName("PILILDKN.d")
	public WYQNTERC field896;

	public PILILDKN() {
		field895.field1363 = field895;
		field895.field1364 = field895;
	}

	@ObfuscatedName("PILILDKN.a(LWYQNTERC;)V")
	public void method379(WYQNTERC arg0) {
		if (arg0.field1364 != null) {
			arg0.method540();
		}

		arg0.field1364 = field895.field1364;
		arg0.field1363 = field895;
		arg0.field1364.field1363 = arg0;
		arg0.field1363.field1364 = arg0;
	}

	@ObfuscatedName("PILILDKN.a(LWYQNTERC;Z)V")
	public void method380(WYQNTERC arg0) {
		if (arg0.field1364 != null) {
			arg0.method540();
		}

		arg0.field1364 = field895;
		arg0.field1363 = field895.field1363;
		arg0.field1364.field1363 = arg0;
		arg0.field1363.field1364 = arg0;
	}

	@ObfuscatedName("PILILDKN.a()LWYQNTERC;")
	public WYQNTERC method381() {
		WYQNTERC var1 = field895.field1363;
		if (field895 == var1) {
			return null;
		} else {
			var1.method540();
			return var1;
		}
	}

	@ObfuscatedName("PILILDKN.b()LWYQNTERC;")
	public WYQNTERC method382() {
		WYQNTERC var1 = field895.field1363;
		if (field895 == var1) {
			field896 = null;
			return null;
		} else {
			field896 = var1.field1363;
			return var1;
		}
	}

	@ObfuscatedName("PILILDKN.a(I)LWYQNTERC;")
	public WYQNTERC method383() {
		WYQNTERC var1 = field895.field1364;
		if (field895 == var1) {
			field896 = null;
			return null;
		} else {
			field896 = var1.field1364;
			return var1;
		}
	}

	@ObfuscatedName("PILILDKN.a(B)LWYQNTERC;")
	public WYQNTERC method384() {
		WYQNTERC var1 = field896;
		if (field895 == var1) {
			field896 = null;
			return null;
		} else {
			field896 = var1.field1363;
			return var1;
		}
	}

	@ObfuscatedName("PILILDKN.b(I)LWYQNTERC;")
	public WYQNTERC method385() {
		WYQNTERC var1 = field896;
		if (field895 == var1) {
			field896 = null;
			return null;
		} else {
			field896 = var1.field1364;
			return var1;
		}
	}

	@ObfuscatedName("PILILDKN.c()V")
	public void method386() {
		if (field895.field1363 != field895) {
			while (true) {
				WYQNTERC var1 = field895.field1363;
				if (field895 == var1) {
					return;
				}

				var1.method540();
			}
		}
	}
}
