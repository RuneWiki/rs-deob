package deob;

@ObfuscatedName("BVBRKPZH")
public final class BVBRKPZH {

	@ObfuscatedName("BVBRKPZH.g")
	public YPOWJZIQ field110 = new YPOWJZIQ();

	@ObfuscatedName("BVBRKPZH.k")
	public OZVXYFRH field114 = new OZVXYFRH();

	@ObfuscatedName("BVBRKPZH.h")
	public int field111;

	@ObfuscatedName("BVBRKPZH.i")
	public int field112;

	@ObfuscatedName("BVBRKPZH.j")
	public DIFURFJI field113;

	@ObfuscatedName("BVBRKPZH.e")
	public int field108;

	@ObfuscatedName("BVBRKPZH.f")
	public int field109;

	public BVBRKPZH(int arg0) {
		field111 = arg0;
		field112 = arg0;
		field113 = new DIFURFJI(1024);
	}

	@ObfuscatedName("BVBRKPZH.a(J)LYPOWJZIQ;")
	public YPOWJZIQ method25(long arg0) {
		YPOWJZIQ var3 = (YPOWJZIQ) field113.method200(arg0);
		if (var3 == null) {
			field108++;
		} else {
			field114.method344(var3);
			field109++;
		}

		return var3;
	}

	@ObfuscatedName("BVBRKPZH.a(BJLYPOWJZIQ;)V")
	public void method26(long arg0, YPOWJZIQ arg1) {
		if (field112 == 0) {
			YPOWJZIQ var4 = field114.method345();
			var4.method338();
			var4.method499();

			if (field110 == var4) {
				YPOWJZIQ var5 = field114.method345();
				var5.method338();
				var5.method499();
			}
		} else {
			field112--;
		}

		field113.method201(arg0, arg1);
		field114.method344(arg1);
	}

	@ObfuscatedName("BVBRKPZH.a()V")
	public void method27() {
		while (true) {
			YPOWJZIQ var1 = field114.method345();
			if (var1 == null) {
				field112 = field111;
				return;
			}

			var1.method338();
			var1.method499();
		}
	}
}
