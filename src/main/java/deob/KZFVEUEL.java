package deob;

@ObfuscatedName("KZFVEUEL")
public final class KZFVEUEL {

	@ObfuscatedName("KZFVEUEL.c")
	public MUOTSYDS field857 = new MUOTSYDS();

	@ObfuscatedName("KZFVEUEL.d")
	public MUOTSYDS field858;

	public KZFVEUEL() {
		field857.field1011 = field857;
		field857.field1012 = field857;
	}

	@ObfuscatedName("KZFVEUEL.a(LMUOTSYDS;)V")
	public void method310(MUOTSYDS arg0) {
		if (arg0.field1012 != null) {
			arg0.method344();
		}

		arg0.field1012 = field857.field1012;
		arg0.field1011 = field857;
		arg0.field1012.field1011 = arg0;
		arg0.field1011.field1012 = arg0;
	}

	@ObfuscatedName("KZFVEUEL.a()LMUOTSYDS;")
	public MUOTSYDS method311() {
		MUOTSYDS var1 = field857.field1011;
		if (field857 == var1) {
			return null;
		} else {
			var1.method344();
			return var1;
		}
	}

	@ObfuscatedName("KZFVEUEL.b()LMUOTSYDS;")
	public MUOTSYDS method312() {
		MUOTSYDS var1 = field857.field1011;
		if (field857 == var1) {
			field858 = null;
			return null;
		} else {
			field858 = var1.field1011;
			return var1;
		}
	}

	@ObfuscatedName("KZFVEUEL.a(Z)LMUOTSYDS;")
	public MUOTSYDS method313() {
		MUOTSYDS var1 = field858;
		if (field857 == var1) {
			field858 = null;
			return null;
		} else {
			field858 = var1.field1011;
			return var1;
		}
	}

	@ObfuscatedName("KZFVEUEL.c()I")
	public int method314() {
		int var1 = 0;
		for (MUOTSYDS var2 = field857.field1011; var2 != field857; var2 = var2.field1011) {
			var1++;
		}

		return var1;
	}
}
