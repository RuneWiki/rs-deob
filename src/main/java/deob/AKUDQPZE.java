package deob;

@ObfuscatedName("AKUDQPZE")
public final class AKUDQPZE {

	@ObfuscatedName("AKUDQPZE.e")
	public CYIKEZWP field3 = new CYIKEZWP();

	@ObfuscatedName("AKUDQPZE.i")
	public FEBLELGD field7 = new FEBLELGD();

	@ObfuscatedName("AKUDQPZE.f")
	public int field4;

	@ObfuscatedName("AKUDQPZE.g")
	public int field5;

	@ObfuscatedName("AKUDQPZE.h")
	public HSZHZJQR field6;

	@ObfuscatedName("AKUDQPZE.c")
	public int field1;

	@ObfuscatedName("AKUDQPZE.d")
	public int field2;

	public AKUDQPZE(int arg0) {
		field4 = arg0;
		field5 = arg0;
		field6 = new HSZHZJQR(1024);
	}

	@ObfuscatedName("AKUDQPZE.a(J)LCYIKEZWP;")
	public CYIKEZWP method1(long arg0) {
		CYIKEZWP var3 = (CYIKEZWP) field6.method343(arg0);
		if (var3 == null) {
			field1++;
		} else {
			field7.method302(var3);
			field2++;
		}

		return var3;
	}

	@ObfuscatedName("AKUDQPZE.a(LCYIKEZWP;ZJ)V")
	public void method2(CYIKEZWP arg0, long arg1) {
		if (field5 == 0) {
			CYIKEZWP var4 = field7.method303();
			var4.method379();
			var4.method177();

			if (field3 == var4) {
				CYIKEZWP var5 = field7.method303();
				var5.method379();
				var5.method177();
			}
		} else {
			field5--;
		}

		field6.method344(arg1, arg0);
		field7.method302(arg0);
	}

	@ObfuscatedName("AKUDQPZE.a()V")
	public void method3() {
		while (true) {
			CYIKEZWP var1 = field7.method303();
			if (var1 == null) {
				field5 = field4;
				return;
			}

			var1.method379();
			var1.method177();
		}
	}
}
