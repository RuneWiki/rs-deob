package deob;

@ObfuscatedName("RPWOWYDL")
public final class RPWOWYDL {

	@ObfuscatedName("RPWOWYDL.c")
	public NFNHZJTP field1118 = new NFNHZJTP();

	@ObfuscatedName("RPWOWYDL.g")
	public QUHNUHWS field1122 = new QUHNUHWS();

	@ObfuscatedName("RPWOWYDL.d")
	public int field1119;

	@ObfuscatedName("RPWOWYDL.e")
	public int field1120;

	@ObfuscatedName("RPWOWYDL.f")
	public EKGZTZOT field1121;

	@ObfuscatedName("RPWOWYDL.a")
	public int field1116;

	@ObfuscatedName("RPWOWYDL.b")
	public int field1117;

	public RPWOWYDL(int arg0) {
		field1119 = arg0;
		field1120 = arg0;
		field1121 = new EKGZTZOT(1024);
	}

	@ObfuscatedName("RPWOWYDL.a(J)LNFNHZJTP;")
	public NFNHZJTP method401(long arg0) {
		NFNHZJTP var3 = (NFNHZJTP) field1121.method227(arg0);
		if (var3 == null) {
			field1116++;
		} else {
			field1122.method393(var3);
			field1117++;
		}

		return var3;
	}

	@ObfuscatedName("RPWOWYDL.a(BJLNFNHZJTP;)V")
	public void method402(long arg0, NFNHZJTP arg1) {
		if (field1120 == 0) {
			NFNHZJTP var4 = field1122.method394();
			var4.method1();
			var4.method348();

			if (field1118 == var4) {
				NFNHZJTP var5 = field1122.method394();
				var5.method1();
				var5.method348();
			}
		} else {
			field1120--;
		}

		field1121.method228(arg1, arg0);
		field1122.method393(arg1);
	}

	@ObfuscatedName("RPWOWYDL.a()V")
	public void method403() {
		while (true) {
			NFNHZJTP var1 = field1122.method394();
			if (var1 == null) {
				field1120 = field1119;
				return;
			}

			var1.method1();
			var1.method348();
		}
	}
}
