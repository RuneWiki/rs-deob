package deob;

@ObfuscatedName("BJGBRRBX")
public class BJGBRRBX {

	@ObfuscatedName("BJGBRRBX.c")
	public int field22;

	@ObfuscatedName("BJGBRRBX.f")
	public int field25;

	@ObfuscatedName("BJGBRRBX.g")
	public int field26;

	@ObfuscatedName("BJGBRRBX.h")
	public int field27;

	@ObfuscatedName("BJGBRRBX.i")
	public int field28;

	@ObfuscatedName("BJGBRRBX.j")
	public int field29;

	@ObfuscatedName("BJGBRRBX.k")
	public int field30;

	@ObfuscatedName("BJGBRRBX.l")
	public int field31;

	@ObfuscatedName("BJGBRRBX.m")
	public int field32;

	@ObfuscatedName("BJGBRRBX.d")
	public int[] field23;

	@ObfuscatedName("BJGBRRBX.e")
	public int[] field24;

	@ObfuscatedName("BJGBRRBX.a(BLBFQIDHPO;)V")
	public final void method91(BFQIDHPO arg0) {
		field27 = arg0.method54();
		field25 = arg0.method59();
		field26 = arg0.method59();
		method92(arg0);
	}

	@ObfuscatedName("BJGBRRBX.a(LBFQIDHPO;I)V")
	public final void method92(BFQIDHPO arg0) {
		field22 = arg0.method54();
		field23 = new int[field22];
		field24 = new int[field22];
		for (int var2 = 0; var2 < field22; var2++) {
			field23[var2] = arg0.method56();
			field24[var2] = arg0.method56();
		}
	}

	@ObfuscatedName("BJGBRRBX.a(B)V")
	public final void method93() {
		field28 = 0;
		field29 = 0;
		field30 = 0;
		field31 = 0;
		field32 = 0;
	}

	@ObfuscatedName("BJGBRRBX.a(ZI)I")
	public final int method94(int arg0) {
		if (field32 >= field28) {
			field31 = field24[field29++] << 15;

			if (field29 >= field22) {
				field29 = field22 - 1;
			}

			field28 = (int) (field23[field29] / 65536.0D * arg0);
			if (field28 > field32) {
				field30 = ((field24[field29] << 15) - field31) / (field28 - field32);
			}
		}

		field31 += field30;
		field32++;
		return field31 - field30 >> 15;
	}
}
