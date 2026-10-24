package deob;

@ObfuscatedName("JETHVCIV")
public final class JETHVCIV {

	@ObfuscatedName("JETHVCIV.e")
	public HSUOZGYX field801 = new HSUOZGYX();

	@ObfuscatedName("JETHVCIV.i")
	public XBBVJJRK field805 = new XBBVJJRK();

	@ObfuscatedName("JETHVCIV.f")
	public int field802;

	@ObfuscatedName("JETHVCIV.g")
	public int field803;

	@ObfuscatedName("JETHVCIV.h")
	public ZRDWHMTU field804;

	@ObfuscatedName("JETHVCIV.c")
	public int field799;

	@ObfuscatedName("JETHVCIV.d")
	public int field800;

	public JETHVCIV(int arg0) {
		field802 = arg0;
		field803 = arg0;
		field804 = new ZRDWHMTU(1024);
	}

	@ObfuscatedName("JETHVCIV.a(J)LHSUOZGYX;")
	public HSUOZGYX method315(long arg0) {
		HSUOZGYX var3 = (HSUOZGYX) field804.method561(arg0);
		if (var3 == null) {
			field799++;
		} else {
			field805.method533(var3);
			field800++;
		}

		return var3;
	}

	@ObfuscatedName("JETHVCIV.a(ILHSUOZGYX;J)V")
	public void method316(HSUOZGYX arg0, long arg1) {
		if (field803 == 0) {
			HSUOZGYX var4 = field805.method534();
			var4.method430();
			var4.method298();

			if (field801 == var4) {
				HSUOZGYX var5 = field805.method534();
				var5.method430();
				var5.method298();
			}
		} else {
			field803--;
		}

		field804.method562(arg1, arg0);
		field805.method533(arg0);
	}

	@ObfuscatedName("JETHVCIV.a()V")
	public void method317() {
		while (true) {
			HSUOZGYX var1 = field805.method534();
			if (var1 == null) {
				field803 = field802;
				return;
			}

			var1.method430();
			var1.method298();
		}
	}
}
