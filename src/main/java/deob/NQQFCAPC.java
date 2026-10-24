package deob;

@ObfuscatedName("NQQFCAPC")
public final class NQQFCAPC {

	@ObfuscatedName("NQQFCAPC.e")
	public OZZFMONJ field1077 = new OZZFMONJ();

	@ObfuscatedName("NQQFCAPC.i")
	public EZRJDJYN field1081 = new EZRJDJYN();

	@ObfuscatedName("NQQFCAPC.f")
	public int field1078;

	@ObfuscatedName("NQQFCAPC.g")
	public int field1079;

	@ObfuscatedName("NQQFCAPC.h")
	public BCCRZRYI field1080;

	@ObfuscatedName("NQQFCAPC.c")
	public int field1075;

	@ObfuscatedName("NQQFCAPC.d")
	public int field1076;

	public NQQFCAPC(int arg0) {
		field1078 = arg0;
		field1079 = arg0;
		field1080 = new BCCRZRYI(1024);
	}

	@ObfuscatedName("NQQFCAPC.a(J)LOZZFMONJ;")
	public OZZFMONJ method334(long arg0) {
		OZZFMONJ var3 = (OZZFMONJ) field1080.method39(arg0);
		if (var3 == null) {
			field1075++;
		} else {
			field1081.method190(var3);
			field1076++;
		}

		return var3;
	}

	@ObfuscatedName("NQQFCAPC.a(IJLOZZFMONJ;)V")
	public void method335(long arg0, OZZFMONJ arg1) {
		if (field1079 == 0) {
			OZZFMONJ var4 = field1081.method191();
			var4.method41();
			var4.method371();

			if (field1077 == var4) {
				OZZFMONJ var5 = field1081.method191();
				var5.method41();
				var5.method371();
			}
		} else {
			field1079--;
		}

		field1080.method40(arg0, arg1);
		field1081.method190(arg1);
	}

	@ObfuscatedName("NQQFCAPC.a()V")
	public void method336() {
		while (true) {
			OZZFMONJ var1 = field1081.method191();
			if (var1 == null) {
				field1079 = field1078;
				return;
			}

			var1.method41();
			var1.method371();
		}
	}
}
