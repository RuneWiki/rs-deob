package deob;

@ObfuscatedName("TMVRZUVH")
public class TMVRZUVH {

	@ObfuscatedName("TMVRZUVH.c")
	public int field1267;

	@ObfuscatedName("TMVRZUVH.f")
	public int field1270;

	@ObfuscatedName("TMVRZUVH.g")
	public int field1271;

	@ObfuscatedName("TMVRZUVH.h")
	public int field1272;

	@ObfuscatedName("TMVRZUVH.i")
	public int field1273;

	@ObfuscatedName("TMVRZUVH.j")
	public int field1274;

	@ObfuscatedName("TMVRZUVH.k")
	public int field1275;

	@ObfuscatedName("TMVRZUVH.l")
	public int field1276;

	@ObfuscatedName("TMVRZUVH.m")
	public int field1277;

	@ObfuscatedName("TMVRZUVH.d")
	public int[] field1268;

	@ObfuscatedName("TMVRZUVH.e")
	public int[] field1269;

	@ObfuscatedName("TMVRZUVH.a(LGHHPHSRU;I)V")
	public final void method488(GHHPHSRU arg0) {
		field1272 = arg0.method202();
		field1270 = arg0.method207();
		field1271 = arg0.method207();
		method489(arg0);
	}

	@ObfuscatedName("TMVRZUVH.a(LGHHPHSRU;B)V")
	public final void method489(GHHPHSRU arg0) {
		field1267 = arg0.method202();
		field1268 = new int[field1267];
		field1269 = new int[field1267];
		for (int var2 = 0; var2 < field1267; var2++) {
			field1268[var2] = arg0.method204();
			field1269[var2] = arg0.method204();
		}
	}

	@ObfuscatedName("TMVRZUVH.a(Z)V")
	public final void method490() {
		field1273 = 0;
		field1274 = 0;
		field1275 = 0;
		field1276 = 0;
		field1277 = 0;
	}

	@ObfuscatedName("TMVRZUVH.a(ZI)I")
	public final int method491(int arg0) {
		if (field1277 >= field1273) {
			field1276 = field1269[field1274++] << 15;

			if (field1274 >= field1267) {
				field1274 = field1267 - 1;
			}

			field1273 = (int) (field1268[field1274] / 65536.0D * arg0);
			if (field1273 > field1277) {
				field1275 = ((field1269[field1274] << 15) - field1276) / (field1273 - field1277);
			}
		}

		field1276 += field1275;
		field1277++;
		return field1276 - field1275 >> 15;
	}
}
