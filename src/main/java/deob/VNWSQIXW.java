package deob;

@ObfuscatedName("VNWSQIXW")
public final class VNWSQIXW {

	@ObfuscatedName("VNWSQIXW.e")
	public OGGHOMII field1313 = new OGGHOMII();

	@ObfuscatedName("VNWSQIXW.i")
	public PNEYGONI field1317 = new PNEYGONI();

	@ObfuscatedName("VNWSQIXW.f")
	public int field1314;

	@ObfuscatedName("VNWSQIXW.g")
	public int field1315;

	@ObfuscatedName("VNWSQIXW.h")
	public BELQMOFW field1316;

	@ObfuscatedName("VNWSQIXW.c")
	public int field1311;

	@ObfuscatedName("VNWSQIXW.d")
	public int field1312;

	public VNWSQIXW(int arg0) {
		field1314 = arg0;
		field1315 = arg0;
		field1316 = new BELQMOFW(1024);
	}

	@ObfuscatedName("VNWSQIXW.a(J)LOGGHOMII;")
	public OGGHOMII method507(long arg0) {
		OGGHOMII var3 = (OGGHOMII) field1316.method14(arg0);
		if (var3 == null) {
			field1311++;
		} else {
			field1317.method438(var3);
			field1312++;
		}

		return var3;
	}

	@ObfuscatedName("VNWSQIXW.a(IJLOGGHOMII;)V")
	public void method508(long arg0, OGGHOMII arg1) {
		if (field1315 == 0) {
			OGGHOMII var4 = field1317.method439();
			var4.method19();
			var4.method384();

			if (field1313 == var4) {
				OGGHOMII var5 = field1317.method439();
				var5.method19();
				var5.method384();
			}
		} else {
			field1315--;
		}

		field1316.method15(arg0, arg1);
		field1317.method438(arg1);
	}

	@ObfuscatedName("VNWSQIXW.a()V")
	public void method509() {
		while (true) {
			OGGHOMII var1 = field1317.method439();
			if (var1 == null) {
				field1315 = field1314;
				return;
			}

			var1.method19();
			var1.method384();
		}
	}
}
