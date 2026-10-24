package deob;

@ObfuscatedName("OZVXYFRH")
public final class OZVXYFRH {

	@ObfuscatedName("OZVXYFRH.b")
	public YPOWJZIQ field975 = new YPOWJZIQ();

	@ObfuscatedName("OZVXYFRH.c")
	public YPOWJZIQ field976;

	public OZVXYFRH() {
		field975.field1366 = field975;
		field975.field1367 = field975;
	}

	@ObfuscatedName("OZVXYFRH.a(LYPOWJZIQ;)V")
	public void method344(YPOWJZIQ arg0) {
		if (arg0.field1367 != null) {
			arg0.method499();
		}

		arg0.field1367 = field975.field1367;
		arg0.field1366 = field975;
		arg0.field1367.field1366 = arg0;
		arg0.field1366.field1367 = arg0;
	}

	@ObfuscatedName("OZVXYFRH.a()LYPOWJZIQ;")
	public YPOWJZIQ method345() {
		YPOWJZIQ var1 = field975.field1366;
		if (field975 == var1) {
			return null;
		} else {
			var1.method499();
			return var1;
		}
	}

	@ObfuscatedName("OZVXYFRH.b()LYPOWJZIQ;")
	public YPOWJZIQ method346() {
		YPOWJZIQ var1 = field975.field1366;
		if (field975 == var1) {
			field976 = null;
			return null;
		} else {
			field976 = var1.field1366;
			return var1;
		}
	}

	@ObfuscatedName("OZVXYFRH.a(Z)LYPOWJZIQ;")
	public YPOWJZIQ method347() {
		YPOWJZIQ var1 = field976;
		if (field975 == var1) {
			field976 = null;
			return null;
		} else {
			field976 = var1.field1366;
			return var1;
		}
	}

	@ObfuscatedName("OZVXYFRH.c()I")
	public int method348() {
		int var1 = 0;
		for (YPOWJZIQ var2 = field975.field1366; var2 != field975; var2 = var2.field1366) {
			var1++;
		}

		return var1;
	}
}
