package deob;

@ObfuscatedName("LXKBDSHJ")
public final class LXKBDSHJ {

	@ObfuscatedName("LXKBDSHJ.e")
	public KGLULAMW field1073 = new KGLULAMW();

	@ObfuscatedName("LXKBDSHJ.i")
	public LXCATFEF field1077 = new LXCATFEF();

	@ObfuscatedName("LXKBDSHJ.f")
	public int field1074;

	@ObfuscatedName("LXKBDSHJ.g")
	public int field1075;

	@ObfuscatedName("LXKBDSHJ.h")
	public WGMBOAQO field1076;

	@ObfuscatedName("LXKBDSHJ.c")
	public int field1071;

	@ObfuscatedName("LXKBDSHJ.d")
	public int field1072;

	public LXKBDSHJ(int arg0) {
		field1074 = arg0;
		field1075 = arg0;
		field1076 = new WGMBOAQO(1024);
	}

	@ObfuscatedName("LXKBDSHJ.a(J)LKGLULAMW;")
	public KGLULAMW method413(long arg0) {
		KGLULAMW var3 = (KGLULAMW) field1076.method586(arg0);
		if (var3 == null) {
			field1071++;
		} else {
			field1077.method408(var3);
			field1072++;
		}

		return var3;
	}

	@ObfuscatedName("LXKBDSHJ.a(ILKGLULAMW;J)V")
	public void method414(KGLULAMW arg0, long arg1) {
		if (field1075 == 0) {
			KGLULAMW var4 = field1077.method409();
			var4.method588();
			var4.method373();

			if (field1073 == var4) {
				KGLULAMW var5 = field1077.method409();
				var5.method588();
				var5.method373();
			}
		} else {
			field1075--;
		}

		field1076.method587(arg1, arg0);
		field1077.method408(arg0);
	}

	@ObfuscatedName("LXKBDSHJ.a()V")
	public void method415() {
		while (true) {
			KGLULAMW var1 = field1077.method409();
			if (var1 == null) {
				field1075 = field1074;
				return;
			}

			var1.method588();
			var1.method373();
		}
	}
}
