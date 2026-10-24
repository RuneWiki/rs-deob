package deob;

@ObfuscatedName("TDXKKGZV")
public class TDXKKGZV {

	@ObfuscatedName("TDXKKGZV.b")
	public int field1213;

	@ObfuscatedName("TDXKKGZV.e")
	public int field1216;

	@ObfuscatedName("TDXKKGZV.f")
	public int field1217;

	@ObfuscatedName("TDXKKGZV.g")
	public int field1218;

	@ObfuscatedName("TDXKKGZV.h")
	public int field1219;

	@ObfuscatedName("TDXKKGZV.i")
	public int field1220;

	@ObfuscatedName("TDXKKGZV.j")
	public int field1221;

	@ObfuscatedName("TDXKKGZV.k")
	public int field1222;

	@ObfuscatedName("TDXKKGZV.l")
	public int field1223;

	@ObfuscatedName("TDXKKGZV.c")
	public int[] field1214;

	@ObfuscatedName("TDXKKGZV.d")
	public int[] field1215;

	@ObfuscatedName("TDXKKGZV.a(ILIMUIZRAF;)V")
	public final void method485(IMUIZRAF arg0) {
		field1218 = arg0.method238();
		field1216 = arg0.method243();
		field1217 = arg0.method243();
		method486(arg0);
	}

	@ObfuscatedName("TDXKKGZV.a(ZLIMUIZRAF;)V")
	public final void method486(IMUIZRAF arg0) {
		field1213 = arg0.method238();
		field1214 = new int[field1213];
		field1215 = new int[field1213];
		for (int var2 = 0; var2 < field1213; var2++) {
			field1214[var2] = arg0.method240();
			field1215[var2] = arg0.method240();
		}
	}

	@ObfuscatedName("TDXKKGZV.a(I)V")
	public final void method487() {
		field1219 = 0;
		field1220 = 0;
		field1221 = 0;
		field1222 = 0;
		field1223 = 0;
	}

	@ObfuscatedName("TDXKKGZV.a(II)I")
	public final int method488(int arg0) {
		if (field1223 >= field1219) {
			field1222 = field1215[field1220++] << 15;

			if (field1220 >= field1213) {
				field1220 = field1213 - 1;
			}

			field1219 = (int) (field1214[field1220] / 65536.0D * arg0);
			if (field1219 > field1223) {
				field1221 = ((field1215[field1220] << 15) - field1222) / (field1219 - field1223);
			}
		}

		field1222 += field1221;
		field1223++;
		return field1222 - field1221 >> 15;
	}
}
