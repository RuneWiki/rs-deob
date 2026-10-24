package deob;

@ObfuscatedName("BGEXEDZG")
public final class BGEXEDZG {

	@ObfuscatedName("BGEXEDZG.d")
	public UXRJCYSS field5 = new UXRJCYSS();

	@ObfuscatedName("BGEXEDZG.e")
	public UXRJCYSS field6;

	public BGEXEDZG() {
		field5.field1302 = field5;
		field5.field1303 = field5;
	}

	@ObfuscatedName("BGEXEDZG.a(LUXRJCYSS;)V")
	public void method4(UXRJCYSS arg0) {
		if (arg0.field1303 != null) {
			arg0.method564();
		}

		arg0.field1303 = field5.field1303;
		arg0.field1302 = field5;
		arg0.field1303.field1302 = arg0;
		arg0.field1302.field1303 = arg0;
	}

	@ObfuscatedName("BGEXEDZG.a()LUXRJCYSS;")
	public UXRJCYSS method5() {
		UXRJCYSS var1 = field5.field1302;
		if (field5 == var1) {
			return null;
		} else {
			var1.method564();
			return var1;
		}
	}

	@ObfuscatedName("BGEXEDZG.b()LUXRJCYSS;")
	public UXRJCYSS method6() {
		UXRJCYSS var1 = field5.field1302;
		if (field5 == var1) {
			field6 = null;
			return null;
		} else {
			field6 = var1.field1302;
			return var1;
		}
	}

	@ObfuscatedName("BGEXEDZG.a(I)LUXRJCYSS;")
	public UXRJCYSS method7() {
		UXRJCYSS var1 = field6;
		if (field5 == var1) {
			field6 = null;
			return null;
		} else {
			field6 = var1.field1302;
			return var1;
		}
	}

	@ObfuscatedName("BGEXEDZG.c()I")
	public int method8() {
		int var1 = 0;
		for (UXRJCYSS var2 = field5.field1302; var2 != field5; var2 = var2.field1302) {
			var1++;
		}

		return var1;
	}
}
