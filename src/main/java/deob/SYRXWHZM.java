package deob;

@ObfuscatedName("SYRXWHZM")
public final class SYRXWHZM {

	@ObfuscatedName("SYRXWHZM.a")
	public YLJOEYBF field1067 = new YLJOEYBF();

	@ObfuscatedName("SYRXWHZM.b")
	public YLJOEYBF field1068;

	public SYRXWHZM() {
		field1067.field1328 = field1067;
		field1067.field1329 = field1067;
	}

	@ObfuscatedName("SYRXWHZM.a(LYLJOEYBF;)V")
	public void method481(YLJOEYBF arg0) {
		if (arg0.field1329 != null) {
			arg0.method545();
		}

		arg0.field1329 = field1067.field1329;
		arg0.field1328 = field1067;
		arg0.field1329.field1328 = arg0;
		arg0.field1328.field1329 = arg0;
	}

	@ObfuscatedName("SYRXWHZM.a()LYLJOEYBF;")
	public YLJOEYBF method482() {
		YLJOEYBF var1 = field1067.field1328;
		if (field1067 == var1) {
			return null;
		} else {
			var1.method545();
			return var1;
		}
	}

	@ObfuscatedName("SYRXWHZM.b()LYLJOEYBF;")
	public YLJOEYBF method483() {
		YLJOEYBF var1 = field1067.field1328;
		if (field1067 == var1) {
			field1068 = null;
			return null;
		} else {
			field1068 = var1.field1328;
			return var1;
		}
	}

	@ObfuscatedName("SYRXWHZM.a(I)LYLJOEYBF;")
	public YLJOEYBF method484() {
		YLJOEYBF var1 = field1068;
		if (field1067 == var1) {
			field1068 = null;
			return null;
		} else {
			field1068 = var1.field1328;
			return var1;
		}
	}

	@ObfuscatedName("SYRXWHZM.c()I")
	public int method485() {
		int var1 = 0;
		for (YLJOEYBF var2 = field1067.field1328; var2 != field1067; var2 = var2.field1328) {
			var1++;
		}

		return var1;
	}
}
