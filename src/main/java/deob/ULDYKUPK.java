package deob;

@ObfuscatedName("ULDYKUPK")
public final class ULDYKUPK {

	@ObfuscatedName("ULDYKUPK.e")
	public UCIRENXU field1149 = new UCIRENXU();

	@ObfuscatedName("ULDYKUPK.i")
	public BGTUCWCI field1153 = new BGTUCWCI();

	@ObfuscatedName("ULDYKUPK.f")
	public int field1150;

	@ObfuscatedName("ULDYKUPK.g")
	public int field1151;

	@ObfuscatedName("ULDYKUPK.h")
	public MPNPHMKJ field1152;

	@ObfuscatedName("ULDYKUPK.c")
	public int field1147;

	@ObfuscatedName("ULDYKUPK.d")
	public int field1148;

	public ULDYKUPK(int arg0) {
		field1150 = arg0;
		field1151 = arg0;
		field1152 = new MPNPHMKJ(1024);
	}

	@ObfuscatedName("ULDYKUPK.a(J)LUCIRENXU;")
	public UCIRENXU method509(long arg0) {
		UCIRENXU var3 = (UCIRENXU) field1152.method264(arg0);
		if (var3 == null) {
			field1147++;
		} else {
			field1153.method13(var3);
			field1148++;
		}

		return var3;
	}

	@ObfuscatedName("ULDYKUPK.a(JILUCIRENXU;)V")
	public void method510(long arg0, UCIRENXU arg1) {
		if (field1151 == 0) {
			UCIRENXU var4 = field1153.method14();
			var4.method326();
			var4.method456();

			if (field1149 == var4) {
				UCIRENXU var5 = field1153.method14();
				var5.method326();
				var5.method456();
			}
		} else {
			field1151--;
		}

		field1152.method265(arg0, arg1);
		field1153.method13(arg1);
	}

	@ObfuscatedName("ULDYKUPK.a()V")
	public void method511() {
		while (true) {
			UCIRENXU var1 = field1153.method14();
			if (var1 == null) {
				field1151 = field1150;
				return;
			}

			var1.method326();
			var1.method456();
		}
	}
}
