package deob;

@ObfuscatedName("RUNMBJUO")
public final class RUNMBJUO {

	@ObfuscatedName("RUNMBJUO.d")
	public ORGNKIAP field1159 = new ORGNKIAP();

	@ObfuscatedName("RUNMBJUO.h")
	public JCEXAOBP field1163 = new JCEXAOBP();

	@ObfuscatedName("RUNMBJUO.e")
	public int field1160;

	@ObfuscatedName("RUNMBJUO.f")
	public int field1161;

	@ObfuscatedName("RUNMBJUO.g")
	public RZUUVVSJ field1162;

	@ObfuscatedName("RUNMBJUO.b")
	public int field1157;

	@ObfuscatedName("RUNMBJUO.c")
	public int field1158;

	public RUNMBJUO(int arg0) {
		field1160 = arg0;
		field1161 = arg0;
		field1162 = new RZUUVVSJ(1024);
	}

	@ObfuscatedName("RUNMBJUO.a(J)LORGNKIAP;")
	public ORGNKIAP method450(long arg0) {
		ORGNKIAP var3 = (ORGNKIAP) field1162.method453(arg0);
		if (var3 == null) {
			field1157++;
		} else {
			field1163.method249(var3);
			field1158++;
		}

		return var3;
	}

	@ObfuscatedName("RUNMBJUO.a(JLORGNKIAP;Z)V")
	public void method451(long arg0, ORGNKIAP arg1) {
		if (field1161 == 0) {
			ORGNKIAP var4 = field1163.method250();
			var4.method397();
			var4.method400();

			if (field1159 == var4) {
				ORGNKIAP var5 = field1163.method250();
				var5.method397();
				var5.method400();
			}
		} else {
			field1161--;
		}

		field1162.method454(arg1, arg0);
		field1163.method249(arg1);
	}

	@ObfuscatedName("RUNMBJUO.a()V")
	public void method452() {
		while (true) {
			ORGNKIAP var1 = field1163.method250();
			if (var1 == null) {
				field1161 = field1160;
				return;
			}

			var1.method397();
			var1.method400();
		}
	}
}
