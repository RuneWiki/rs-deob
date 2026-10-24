package deob;

@ObfuscatedName("YAKFHRTY")
public final class YAKFHRTY {

	@ObfuscatedName("YAKFHRTY.b")
	public KIFEZIQJ field1356 = new KIFEZIQJ();

	@ObfuscatedName("YAKFHRTY.c")
	public KIFEZIQJ field1357;

	public YAKFHRTY() {
		field1356.field872 = field1356;
		field1356.field873 = field1356;
	}

	@ObfuscatedName("YAKFHRTY.a(LKIFEZIQJ;)V")
	public void method562(KIFEZIQJ arg0) {
		if (arg0.field873 != null) {
			arg0.method352();
		}

		arg0.field873 = field1356.field873;
		arg0.field872 = field1356;
		arg0.field873.field872 = arg0;
		arg0.field872.field873 = arg0;
	}

	@ObfuscatedName("YAKFHRTY.a()LKIFEZIQJ;")
	public KIFEZIQJ method563() {
		KIFEZIQJ var1 = field1356.field872;
		if (field1356 == var1) {
			return null;
		} else {
			var1.method352();
			return var1;
		}
	}

	@ObfuscatedName("YAKFHRTY.b()LKIFEZIQJ;")
	public KIFEZIQJ method564() {
		KIFEZIQJ var1 = field1356.field872;
		if (field1356 == var1) {
			field1357 = null;
			return null;
		} else {
			field1357 = var1.field872;
			return var1;
		}
	}

	@ObfuscatedName("YAKFHRTY.a(I)LKIFEZIQJ;")
	public KIFEZIQJ method565() {
		KIFEZIQJ var1 = field1357;
		if (field1356 == var1) {
			field1357 = null;
			return null;
		} else {
			field1357 = var1.field872;
			return var1;
		}
	}

	@ObfuscatedName("YAKFHRTY.c()I")
	public int method566() {
		int var1 = 0;
		for (KIFEZIQJ var2 = field1356.field872; var2 != field1356; var2 = var2.field872) {
			var1++;
		}

		return var1;
	}
}
