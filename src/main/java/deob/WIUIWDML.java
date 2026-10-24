package deob;

@ObfuscatedName("WIUIWDML")
public final class WIUIWDML {

	@ObfuscatedName("WIUIWDML.e")
	public OBKNBIRU field1352 = new OBKNBIRU();

	@ObfuscatedName("WIUIWDML.i")
	public HIGYXWXY field1356 = new HIGYXWXY();

	@ObfuscatedName("WIUIWDML.f")
	public int field1353;

	@ObfuscatedName("WIUIWDML.g")
	public int field1354;

	@ObfuscatedName("WIUIWDML.h")
	public LIHJZCBF field1355;

	@ObfuscatedName("WIUIWDML.c")
	public int field1350;

	@ObfuscatedName("WIUIWDML.d")
	public int field1351;

	public WIUIWDML(int arg0) {
		field1353 = arg0;
		field1354 = arg0;
		field1355 = new LIHJZCBF(1024);
	}

	@ObfuscatedName("WIUIWDML.a(J)LOBKNBIRU;")
	public OBKNBIRU method519(long arg0) {
		OBKNBIRU var3 = (OBKNBIRU) field1355.method279(arg0);
		if (var3 == null) {
			field1350++;
		} else {
			field1356.method244(var3);
			field1351++;
		}

		return var3;
	}

	@ObfuscatedName("WIUIWDML.a(IJLOBKNBIRU;)V")
	public void method520(long arg0, OBKNBIRU arg1) {
		if (field1354 == 0) {
			OBKNBIRU var4 = field1356.method245();
			var4.method254();
			var4.method312();

			if (field1352 == var4) {
				OBKNBIRU var5 = field1356.method245();
				var5.method254();
				var5.method312();
			}
		} else {
			field1354--;
		}

		field1355.method280(arg1, arg0);
		field1356.method244(arg1);
	}

	@ObfuscatedName("WIUIWDML.a()V")
	public void method521() {
		while (true) {
			OBKNBIRU var1 = field1356.method245();
			if (var1 == null) {
				field1354 = field1353;
				return;
			}

			var1.method254();
			var1.method312();
		}
	}
}
