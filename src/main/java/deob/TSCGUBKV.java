package deob;

@ObfuscatedName("TSCGUBKV")
public final class TSCGUBKV {

	@ObfuscatedName("TSCGUBKV.c")
	public YBEHHNFF field1262 = new YBEHHNFF();

	@ObfuscatedName("TSCGUBKV.d")
	public YBEHHNFF field1263;

	public TSCGUBKV() {
		field1262.field1473 = field1262;
		field1262.field1474 = field1262;
	}

	@ObfuscatedName("TSCGUBKV.a(LYBEHHNFF;)V")
	public void method459(YBEHHNFF arg0) {
		if (arg0.field1474 != null) {
			arg0.method567();
		}

		arg0.field1474 = field1262.field1474;
		arg0.field1473 = field1262;
		arg0.field1474.field1473 = arg0;
		arg0.field1473.field1474 = arg0;
	}

	@ObfuscatedName("TSCGUBKV.a()LYBEHHNFF;")
	public YBEHHNFF method460() {
		YBEHHNFF var1 = field1262.field1473;
		if (field1262 == var1) {
			return null;
		} else {
			var1.method567();
			return var1;
		}
	}

	@ObfuscatedName("TSCGUBKV.b()LYBEHHNFF;")
	public YBEHHNFF method461() {
		YBEHHNFF var1 = field1262.field1473;
		if (field1262 == var1) {
			field1263 = null;
			return null;
		} else {
			field1263 = var1.field1473;
			return var1;
		}
	}

	@ObfuscatedName("TSCGUBKV.a(I)LYBEHHNFF;")
	public YBEHHNFF method462() {
		YBEHHNFF var1 = field1263;
		if (field1262 == var1) {
			field1263 = null;
			return null;
		} else {
			field1263 = var1.field1473;
			return var1;
		}
	}

	@ObfuscatedName("TSCGUBKV.c()I")
	public int method463() {
		int var1 = 0;
		for (YBEHHNFF var2 = field1262.field1473; var2 != field1262; var2 = var2.field1473) {
			var1++;
		}

		return var1;
	}
}
