package deob;

@ObfuscatedName("BJPHZZMM")
public class BJPHZZMM {

	@ObfuscatedName("BJPHZZMM.a")
	public int field46;

	@ObfuscatedName("BJPHZZMM.d")
	public int field49;

	@ObfuscatedName("BJPHZZMM.e")
	public int field50;

	@ObfuscatedName("BJPHZZMM.f")
	public int field51;

	@ObfuscatedName("BJPHZZMM.g")
	public int field52;

	@ObfuscatedName("BJPHZZMM.h")
	public int field53;

	@ObfuscatedName("BJPHZZMM.i")
	public int field54;

	@ObfuscatedName("BJPHZZMM.j")
	public int field55;

	@ObfuscatedName("BJPHZZMM.k")
	public int field56;

	@ObfuscatedName("BJPHZZMM.b")
	public int[] field47;

	@ObfuscatedName("BJPHZZMM.c")
	public int[] field48;

	@ObfuscatedName("BJPHZZMM.a(BLXOUQUKZW;)V")
	public final void method30(XOUQUKZW arg0) {
		field51 = arg0.method521();
		field49 = arg0.method526();
		field50 = arg0.method526();
		method31(arg0);
	}

	@ObfuscatedName("BJPHZZMM.a(ZLXOUQUKZW;)V")
	public final void method31(XOUQUKZW arg0) {
		field46 = arg0.method521();
		field47 = new int[field46];
		field48 = new int[field46];
		for (int var2 = 0; var2 < field46; var2++) {
			field47[var2] = arg0.method523();
			field48[var2] = arg0.method523();
		}
	}

	@ObfuscatedName("BJPHZZMM.a(I)V")
	public final void method32() {
		field52 = 0;
		field53 = 0;
		field54 = 0;
		field55 = 0;
		field56 = 0;
	}

	@ObfuscatedName("BJPHZZMM.a(ZI)I")
	public final int method33(int arg0) {
		if (field56 >= field52) {
			field55 = field48[field53++] << 15;

			if (field53 >= field46) {
				field53 = field46 - 1;
			}

			field52 = (int) (field47[field53] / 65536.0D * arg0);
			if (field52 > field56) {
				field54 = ((field48[field53] << 15) - field55) / (field52 - field56);
			}
		}

		field55 += field54;
		field56++;
		return field55 - field54 >> 15;
	}
}
