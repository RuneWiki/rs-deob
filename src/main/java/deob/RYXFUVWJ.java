package deob;

@ObfuscatedName("RYXFUVWJ")
public final class RYXFUVWJ {

	@ObfuscatedName("RYXFUVWJ.g")
	public FFAASUKE field1133 = new FFAASUKE();

	@ObfuscatedName("RYXFUVWJ.k")
	public KHIOJPOB field1137 = new KHIOJPOB();

	@ObfuscatedName("RYXFUVWJ.h")
	public int field1134;

	@ObfuscatedName("RYXFUVWJ.i")
	public int field1135;

	@ObfuscatedName("RYXFUVWJ.j")
	public VWNUVMOR field1136;

	@ObfuscatedName("RYXFUVWJ.e")
	public int field1131;

	@ObfuscatedName("RYXFUVWJ.f")
	public int field1132;

	public RYXFUVWJ(int arg0) {
		field1134 = arg0;
		field1135 = arg0;
		field1136 = new VWNUVMOR(1024);
	}

	@ObfuscatedName("RYXFUVWJ.a(J)LFFAASUKE;")
	public FFAASUKE method495(long arg0) {
		FFAASUKE var3 = (FFAASUKE) field1136.method527(arg0);
		if (var3 == null) {
			field1131++;
		} else {
			field1137.method331(var3);
			field1132++;
		}

		return var3;
	}

	@ObfuscatedName("RYXFUVWJ.a(ZLFFAASUKE;J)V")
	public void method496(FFAASUKE arg0, long arg1) {
		if (field1135 == 0) {
			FFAASUKE var4 = field1137.method332();
			var4.method329();
			var4.method300();

			if (field1133 == var4) {
				FFAASUKE var5 = field1137.method332();
				var5.method329();
				var5.method300();
			}
		} else {
			field1135--;
		}

		field1136.method528(arg0, arg1);
		field1137.method331(arg0);
	}

	@ObfuscatedName("RYXFUVWJ.a()V")
	public void method497() {
		while (true) {
			FFAASUKE var1 = field1137.method332();
			if (var1 == null) {
				field1135 = field1134;
				return;
			}

			var1.method329();
			var1.method300();
		}
	}
}
