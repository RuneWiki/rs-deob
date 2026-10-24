package deob;

@ObfuscatedName("NVDACYAH")
public final class NVDACYAH {

	@ObfuscatedName("NVDACYAH.d")
	public OHSXMHUZ field1085 = new OHSXMHUZ();

	@ObfuscatedName("NVDACYAH.h")
	public ISCMIAJK field1089 = new ISCMIAJK();

	@ObfuscatedName("NVDACYAH.e")
	public int field1086;

	@ObfuscatedName("NVDACYAH.f")
	public int field1087;

	@ObfuscatedName("NVDACYAH.g")
	public EHIGZZMD field1088;

	@ObfuscatedName("NVDACYAH.b")
	public int field1083;

	@ObfuscatedName("NVDACYAH.c")
	public int field1084;

	public NVDACYAH(int arg0) {
		field1086 = arg0;
		field1087 = arg0;
		field1088 = new EHIGZZMD(1024);
	}

	@ObfuscatedName("NVDACYAH.a(J)LOHSXMHUZ;")
	public OHSXMHUZ method427(long arg0) {
		OHSXMHUZ var3 = (OHSXMHUZ) field1088.method185(arg0);
		if (var3 == null) {
			field1083++;
		} else {
			field1089.method307(var3);
			field1084++;
		}

		return var3;
	}

	@ObfuscatedName("NVDACYAH.a(JBLOHSXMHUZ;)V")
	public void method428(long arg0, OHSXMHUZ arg1) {
		if (field1087 == 0) {
			OHSXMHUZ var4 = field1089.method308();
			var4.method14();
			var4.method432();

			if (field1085 == var4) {
				OHSXMHUZ var5 = field1089.method308();
				var5.method14();
				var5.method432();
			}
		} else {
			field1087--;
		}

		field1088.method186(arg0, arg1);
		field1089.method307(arg1);
	}

	@ObfuscatedName("NVDACYAH.a()V")
	public void method429() {
		while (true) {
			OHSXMHUZ var1 = field1089.method308();
			if (var1 == null) {
				field1087 = field1086;
				return;
			}

			var1.method14();
			var1.method432();
		}
	}
}
