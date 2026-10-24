package deob;

@ObfuscatedName("DTFBSXNF")
public final class DTFBSXNF {

	@ObfuscatedName("DTFBSXNF.d")
	public IYPTVTAD field541 = new IYPTVTAD();

	@ObfuscatedName("DTFBSXNF.e")
	public IYPTVTAD field542;

	public DTFBSXNF() {
		field541.field839 = field541;
		field541.field840 = field541;
	}

	@ObfuscatedName("DTFBSXNF.a(LIYPTVTAD;)V")
	public void method209(IYPTVTAD arg0) {
		if (arg0.field840 != null) {
			arg0.method373();
		}

		arg0.field840 = field541.field840;
		arg0.field839 = field541;
		arg0.field840.field839 = arg0;
		arg0.field839.field840 = arg0;
	}

	@ObfuscatedName("DTFBSXNF.a()LIYPTVTAD;")
	public IYPTVTAD method210() {
		IYPTVTAD var1 = field541.field839;
		if (field541 == var1) {
			return null;
		} else {
			var1.method373();
			return var1;
		}
	}

	@ObfuscatedName("DTFBSXNF.b()LIYPTVTAD;")
	public IYPTVTAD method211() {
		IYPTVTAD var1 = field541.field839;
		if (field541 == var1) {
			field542 = null;
			return null;
		} else {
			field542 = var1.field839;
			return var1;
		}
	}

	@ObfuscatedName("DTFBSXNF.a(B)LIYPTVTAD;")
	public IYPTVTAD method212() {
		IYPTVTAD var1 = field542;
		if (field541 == var1) {
			field542 = null;
			return null;
		} else {
			field542 = var1.field839;
			return var1;
		}
	}

	@ObfuscatedName("DTFBSXNF.c()I")
	public int method213() {
		int var1 = 0;
		for (IYPTVTAD var2 = field541.field839; var2 != field541; var2 = var2.field839) {
			var1++;
		}

		return var1;
	}
}
