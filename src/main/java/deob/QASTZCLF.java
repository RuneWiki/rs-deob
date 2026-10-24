package deob;

@ObfuscatedName("QASTZCLF")
public final class QASTZCLF {

	@ObfuscatedName("QASTZCLF.d")
	public IVMCUDWL field1252 = new IVMCUDWL();

	@ObfuscatedName("QASTZCLF.h")
	public QHOLWOGP field1256 = new QHOLWOGP();

	@ObfuscatedName("QASTZCLF.e")
	public int field1253;

	@ObfuscatedName("QASTZCLF.f")
	public int field1254;

	@ObfuscatedName("QASTZCLF.g")
	public CABSPGMS field1255;

	@ObfuscatedName("QASTZCLF.b")
	public int field1250;

	@ObfuscatedName("QASTZCLF.c")
	public int field1251;

	public QASTZCLF(int arg0) {
		field1253 = arg0;
		field1254 = arg0;
		field1255 = new CABSPGMS(1024);
	}

	@ObfuscatedName("QASTZCLF.a(J)LIVMCUDWL;")
	public IVMCUDWL method438(long arg0) {
		IVMCUDWL var3 = (IVMCUDWL) field1255.method45(arg0);
		if (var3 == null) {
			field1250++;
		} else {
			field1256.method441(var3);
			field1251++;
		}

		return var3;
	}

	@ObfuscatedName("QASTZCLF.a(LIVMCUDWL;JI)V")
	public void method439(IVMCUDWL arg0, long arg1) {
		if (field1254 == 0) {
			IVMCUDWL var4 = field1256.method442();
			var4.method602();
			var4.method282();

			if (field1252 == var4) {
				IVMCUDWL var5 = field1256.method442();
				var5.method602();
				var5.method282();
			}
		} else {
			field1254--;
		}

		field1255.method46(arg0, arg1);
		field1256.method441(arg0);
	}

	@ObfuscatedName("QASTZCLF.a()V")
	public void method440() {
		while (true) {
			IVMCUDWL var1 = field1256.method442();
			if (var1 == null) {
				field1254 = field1253;
				return;
			}

			var1.method602();
			var1.method282();
		}
	}
}
