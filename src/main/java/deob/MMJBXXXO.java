package deob;

@ObfuscatedName("MMJBXXXO")
public final class MMJBXXXO {

	@ObfuscatedName("MMJBXXXO.b")
	public NTGUDCTQ field1015 = new NTGUDCTQ();

	@ObfuscatedName("MMJBXXXO.c")
	public NTGUDCTQ field1016;

	public MMJBXXXO() {
		field1015.field1017 = field1015;
		field1015.field1018 = field1015;
	}

	@ObfuscatedName("MMJBXXXO.a(LNTGUDCTQ;)V")
	public void method404(NTGUDCTQ arg0) {
		if (arg0.field1018 != null) {
			arg0.method409();
		}

		arg0.field1018 = field1015.field1018;
		arg0.field1017 = field1015;
		arg0.field1018.field1017 = arg0;
		arg0.field1017.field1018 = arg0;
	}

	@ObfuscatedName("MMJBXXXO.a()LNTGUDCTQ;")
	public NTGUDCTQ method405() {
		NTGUDCTQ var1 = field1015.field1017;
		if (field1015 == var1) {
			return null;
		} else {
			var1.method409();
			return var1;
		}
	}

	@ObfuscatedName("MMJBXXXO.b()LNTGUDCTQ;")
	public NTGUDCTQ method406() {
		NTGUDCTQ var1 = field1015.field1017;
		if (field1015 == var1) {
			field1016 = null;
			return null;
		} else {
			field1016 = var1.field1017;
			return var1;
		}
	}

	@ObfuscatedName("MMJBXXXO.a(I)LNTGUDCTQ;")
	public NTGUDCTQ method407() {
		NTGUDCTQ var1 = field1016;
		if (field1015 == var1) {
			field1016 = null;
			return null;
		} else {
			field1016 = var1.field1017;
			return var1;
		}
	}

	@ObfuscatedName("MMJBXXXO.c()I")
	public int method408() {
		int var1 = 0;
		for (NTGUDCTQ var2 = field1015.field1017; var2 != field1015; var2 = var2.field1017) {
			var1++;
		}

		return var1;
	}
}
