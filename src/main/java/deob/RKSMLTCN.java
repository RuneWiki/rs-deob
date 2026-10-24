package deob;

@ObfuscatedName("RKSMLTCN")
public final class RKSMLTCN {

	@ObfuscatedName("RKSMLTCN.b")
	public LMGYBGQR field1090 = new LMGYBGQR();

	@ObfuscatedName("RKSMLTCN.c")
	public LMGYBGQR field1091;

	public RKSMLTCN() {
		field1090.field888 = field1090;
		field1090.field889 = field1090;
	}

	@ObfuscatedName("RKSMLTCN.a(LLMGYBGQR;)V")
	public void method405(LMGYBGQR arg0) {
		if (arg0.field889 != null) {
			arg0.method357();
		}

		arg0.field889 = field1090.field889;
		arg0.field888 = field1090;
		arg0.field889.field888 = arg0;
		arg0.field888.field889 = arg0;
	}

	@ObfuscatedName("RKSMLTCN.a()LLMGYBGQR;")
	public LMGYBGQR method406() {
		LMGYBGQR var1 = field1090.field888;
		if (field1090 == var1) {
			return null;
		} else {
			var1.method357();
			return var1;
		}
	}

	@ObfuscatedName("RKSMLTCN.b()LLMGYBGQR;")
	public LMGYBGQR method407() {
		LMGYBGQR var1 = field1090.field888;
		if (field1090 == var1) {
			field1091 = null;
			return null;
		} else {
			field1091 = var1.field888;
			return var1;
		}
	}

	@ObfuscatedName("RKSMLTCN.a(B)LLMGYBGQR;")
	public LMGYBGQR method408() {
		LMGYBGQR var1 = field1091;
		if (field1090 == var1) {
			field1091 = null;
			return null;
		} else {
			field1091 = var1.field888;
			return var1;
		}
	}

	@ObfuscatedName("RKSMLTCN.c()I")
	public int method409() {
		int var1 = 0;
		for (LMGYBGQR var2 = field1090.field888; var2 != field1090; var2 = var2.field888) {
			var1++;
		}

		return var1;
	}
}
