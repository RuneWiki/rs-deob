package deob;

@ObfuscatedName("YGUBUIIU")
public final class YGUBUIIU {

	@ObfuscatedName("YGUBUIIU.c")
	public KWULTEKW field1452 = new KWULTEKW();

	@ObfuscatedName("YGUBUIIU.d")
	public KWULTEKW field1453;

	public YGUBUIIU() {
		field1452.field914 = field1452;
		field1452.field915 = field1452;
	}

	@ObfuscatedName("YGUBUIIU.a(LKWULTEKW;)V")
	public void method573(KWULTEKW arg0) {
		if (arg0.field915 != null) {
			arg0.method330();
		}

		arg0.field915 = field1452.field915;
		arg0.field914 = field1452;
		arg0.field915.field914 = arg0;
		arg0.field914.field915 = arg0;
	}

	@ObfuscatedName("YGUBUIIU.a()LKWULTEKW;")
	public KWULTEKW method574() {
		KWULTEKW var1 = field1452.field914;
		if (field1452 == var1) {
			return null;
		} else {
			var1.method330();
			return var1;
		}
	}

	@ObfuscatedName("YGUBUIIU.b()LKWULTEKW;")
	public KWULTEKW method575() {
		KWULTEKW var1 = field1452.field914;
		if (field1452 == var1) {
			field1453 = null;
			return null;
		} else {
			field1453 = var1.field914;
			return var1;
		}
	}

	@ObfuscatedName("YGUBUIIU.a(I)LKWULTEKW;")
	public KWULTEKW method576() {
		KWULTEKW var1 = field1453;
		if (field1452 == var1) {
			field1453 = null;
			return null;
		} else {
			field1453 = var1.field914;
			return var1;
		}
	}

	@ObfuscatedName("YGUBUIIU.c()I")
	public int method577() {
		int var1 = 0;
		for (KWULTEKW var2 = field1452.field914; var2 != field1452; var2 = var2.field914) {
			var1++;
		}

		return var1;
	}
}
