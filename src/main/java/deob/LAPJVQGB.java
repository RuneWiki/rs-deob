package deob;

@ObfuscatedName("LAPJVQGB")
public final class LAPJVQGB {

	@ObfuscatedName("LAPJVQGB.c")
	public KTAHMSMP field811 = new KTAHMSMP();

	@ObfuscatedName("LAPJVQGB.d")
	public KTAHMSMP field812;

	public LAPJVQGB() {
		field811.field806 = field811;
		field811.field807 = field811;
	}

	@ObfuscatedName("LAPJVQGB.a(LKTAHMSMP;)V")
	public void method346(KTAHMSMP arg0) {
		if (arg0.field807 != null) {
			arg0.method342();
		}

		arg0.field807 = field811.field807;
		arg0.field806 = field811;
		arg0.field807.field806 = arg0;
		arg0.field806.field807 = arg0;
	}

	@ObfuscatedName("LAPJVQGB.a()LKTAHMSMP;")
	public KTAHMSMP method347() {
		KTAHMSMP var1 = field811.field806;
		if (field811 == var1) {
			return null;
		} else {
			var1.method342();
			return var1;
		}
	}

	@ObfuscatedName("LAPJVQGB.b()LKTAHMSMP;")
	public KTAHMSMP method348() {
		KTAHMSMP var1 = field811.field806;
		if (field811 == var1) {
			field812 = null;
			return null;
		} else {
			field812 = var1.field806;
			return var1;
		}
	}

	@ObfuscatedName("LAPJVQGB.a(Z)LKTAHMSMP;")
	public KTAHMSMP method349() {
		KTAHMSMP var1 = field812;
		if (field811 == var1) {
			field812 = null;
			return null;
		} else {
			field812 = var1.field806;
			return var1;
		}
	}

	@ObfuscatedName("LAPJVQGB.c()I")
	public int method350() {
		int var1 = 0;
		for (KTAHMSMP var2 = field811.field806; var2 != field811; var2 = var2.field806) {
			var1++;
		}

		return var1;
	}
}
