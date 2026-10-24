package deob;

@ObfuscatedName("HMYWYVEI")
public final class HMYWYVEI {

	@ObfuscatedName("HMYWYVEI.b")
	public NZLAJIAU field989 = new NZLAJIAU();

	@ObfuscatedName("HMYWYVEI.c")
	public NZLAJIAU field990;

	public HMYWYVEI() {
		field989.field1202 = field989;
		field989.field1203 = field989;
	}

	@ObfuscatedName("HMYWYVEI.a(LNZLAJIAU;)V")
	public void method371(NZLAJIAU arg0) {
		if (arg0.field1203 != null) {
			arg0.method512();
		}

		arg0.field1203 = field989.field1203;
		arg0.field1202 = field989;
		arg0.field1203.field1202 = arg0;
		arg0.field1202.field1203 = arg0;
	}

	@ObfuscatedName("HMYWYVEI.a()LNZLAJIAU;")
	public NZLAJIAU method372() {
		NZLAJIAU var1 = field989.field1202;
		if (field989 == var1) {
			return null;
		} else {
			var1.method512();
			return var1;
		}
	}

	@ObfuscatedName("HMYWYVEI.b()LNZLAJIAU;")
	public NZLAJIAU method373() {
		NZLAJIAU var1 = field989.field1202;
		if (field989 == var1) {
			field990 = null;
			return null;
		} else {
			field990 = var1.field1202;
			return var1;
		}
	}

	@ObfuscatedName("HMYWYVEI.a(B)LNZLAJIAU;")
	public NZLAJIAU method374() {
		NZLAJIAU var1 = field990;
		if (field989 == var1) {
			field990 = null;
			return null;
		} else {
			field990 = var1.field1202;
			return var1;
		}
	}

	@ObfuscatedName("HMYWYVEI.c()I")
	public int method375() {
		int var1 = 0;
		for (NZLAJIAU var2 = field989.field1202; var2 != field989; var2 = var2.field1202) {
			var1++;
		}

		return var1;
	}
}
