package deob;

@ObfuscatedName("ISCMIAJK")
public final class ISCMIAJK {

	@ObfuscatedName("ISCMIAJK.c")
	public OHSXMHUZ field945 = new OHSXMHUZ();

	@ObfuscatedName("ISCMIAJK.d")
	public OHSXMHUZ field946;

	public ISCMIAJK() {
		field945.field1097 = field945;
		field945.field1098 = field945;
	}

	@ObfuscatedName("ISCMIAJK.a(LOHSXMHUZ;)V")
	public void method307(OHSXMHUZ arg0) {
		if (arg0.field1098 != null) {
			arg0.method432();
		}

		arg0.field1098 = field945.field1098;
		arg0.field1097 = field945;
		arg0.field1098.field1097 = arg0;
		arg0.field1097.field1098 = arg0;
	}

	@ObfuscatedName("ISCMIAJK.a()LOHSXMHUZ;")
	public OHSXMHUZ method308() {
		OHSXMHUZ var1 = field945.field1097;
		if (field945 == var1) {
			return null;
		} else {
			var1.method432();
			return var1;
		}
	}

	@ObfuscatedName("ISCMIAJK.b()LOHSXMHUZ;")
	public OHSXMHUZ method309() {
		OHSXMHUZ var1 = field945.field1097;
		if (field945 == var1) {
			field946 = null;
			return null;
		} else {
			field946 = var1.field1097;
			return var1;
		}
	}

	@ObfuscatedName("ISCMIAJK.a(I)LOHSXMHUZ;")
	public OHSXMHUZ method310() {
		OHSXMHUZ var1 = field946;
		if (field945 == var1) {
			field946 = null;
			return null;
		} else {
			field946 = var1.field1097;
			return var1;
		}
	}

	@ObfuscatedName("ISCMIAJK.c()I")
	public int method311() {
		int var1 = 0;
		for (OHSXMHUZ var2 = field945.field1097; var2 != field945; var2 = var2.field1097) {
			var1++;
		}

		return var1;
	}
}
