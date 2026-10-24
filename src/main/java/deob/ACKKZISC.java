package deob;

@ObfuscatedName("ACKKZISC")
public final class ACKKZISC {

	@ObfuscatedName("ACKKZISC.e")
	public HZZJZIMV field3 = new HZZJZIMV();

	@ObfuscatedName("ACKKZISC.i")
	public JTFJPMGL field7 = new JTFJPMGL();

	@ObfuscatedName("ACKKZISC.f")
	public int field4;

	@ObfuscatedName("ACKKZISC.g")
	public int field5;

	@ObfuscatedName("ACKKZISC.h")
	public SOYNUDRE field6;

	@ObfuscatedName("ACKKZISC.c")
	public int field1;

	@ObfuscatedName("ACKKZISC.d")
	public int field2;

	public ACKKZISC(int arg0) {
		field4 = arg0;
		field5 = arg0;
		field6 = new SOYNUDRE(1024);
	}

	@ObfuscatedName("ACKKZISC.a(J)LHZZJZIMV;")
	public HZZJZIMV method1(long arg0) {
		HZZJZIMV var3 = (HZZJZIMV) field6.method440(arg0);
		if (var3 == null) {
			field1++;
		} else {
			field7.method270(var3);
			field2++;
		}

		return var3;
	}

	@ObfuscatedName("ACKKZISC.a(IJLHZZJZIMV;)V")
	public void method2(long arg0, HZZJZIMV arg1) {
		if (field5 == 0) {
			HZZJZIMV var4 = field7.method271();
			var4.method20();
			var4.method213();

			if (field3 == var4) {
				HZZJZIMV var5 = field7.method271();
				var5.method20();
				var5.method213();
			}
		} else {
			field5--;
		}

		field6.method441(arg1, arg0);
		field7.method270(arg1);
	}

	@ObfuscatedName("ACKKZISC.a()V")
	public void method3() {
		while (true) {
			HZZJZIMV var1 = field7.method271();
			if (var1 == null) {
				field5 = field4;
				return;
			}

			var1.method20();
			var1.method213();
		}
	}
}
