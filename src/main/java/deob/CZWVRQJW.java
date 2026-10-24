package deob;

@ObfuscatedName("CZWVRQJW")
public final class CZWVRQJW {

	@ObfuscatedName("CZWVRQJW.e")
	public IYPTVTAD field460 = new IYPTVTAD();

	@ObfuscatedName("CZWVRQJW.i")
	public DTFBSXNF field464 = new DTFBSXNF();

	@ObfuscatedName("CZWVRQJW.f")
	public int field461;

	@ObfuscatedName("CZWVRQJW.g")
	public int field462;

	@ObfuscatedName("CZWVRQJW.h")
	public RXQASTJV field463;

	@ObfuscatedName("CZWVRQJW.c")
	public int field458;

	@ObfuscatedName("CZWVRQJW.d")
	public int field459;

	public CZWVRQJW(int arg0) {
		field461 = arg0;
		field462 = arg0;
		field463 = new RXQASTJV(1024);
	}

	@ObfuscatedName("CZWVRQJW.a(J)LIYPTVTAD;")
	public IYPTVTAD method152(long arg0) {
		IYPTVTAD var3 = (IYPTVTAD) field463.method508(arg0);
		if (var3 == null) {
			field458++;
		} else {
			field464.method209(var3);
			field459++;
		}

		return var3;
	}

	@ObfuscatedName("CZWVRQJW.a(LIYPTVTAD;ZJ)V")
	public void method153(IYPTVTAD arg0, long arg1) {
		if (field462 == 0) {
			IYPTVTAD var4 = field464.method210();
			var4.method156();
			var4.method373();

			if (field460 == var4) {
				IYPTVTAD var5 = field464.method210();
				var5.method156();
				var5.method373();
			}
		} else {
			field462--;
		}

		field463.method509(arg0, arg1);
		field464.method209(arg0);
	}

	@ObfuscatedName("CZWVRQJW.a()V")
	public void method154() {
		while (true) {
			IYPTVTAD var1 = field464.method210();
			if (var1 == null) {
				field462 = field461;
				return;
			}

			var1.method156();
			var1.method373();
		}
	}
}
