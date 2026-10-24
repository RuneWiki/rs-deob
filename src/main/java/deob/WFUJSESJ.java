package deob;

@ObfuscatedName("WFUJSESJ")
public class WFUJSESJ extends BXTJETAB {

	@ObfuscatedName("WFUJSESJ.x")
	public int field1382;

	@ObfuscatedName("WFUJSESJ.y")
	public int field1383;

	@ObfuscatedName("WFUJSESJ.z")
	public int field1384;

	@ObfuscatedName("WFUJSESJ.n")
	public int field1373;

	@ObfuscatedName("WFUJSESJ.o")
	public int field1374;

	@ObfuscatedName("WFUJSESJ.p")
	public int field1375;

	@ObfuscatedName("WFUJSESJ.q")
	public int field1376;

	@ObfuscatedName("WFUJSESJ.u")
	public BZONLWPM field1379;

	@ObfuscatedName("WFUJSESJ.m")
	public int field1372;

	@ObfuscatedName("WFUJSESJ.t")
	public int field1378;

	@ObfuscatedName("WFUJSESJ.v")
	public int field1380;

	@ObfuscatedName("WFUJSESJ.w")
	public int field1381;

	@ObfuscatedName("WFUJSESJ.l")
	public int[] field1371;

	@ObfuscatedName("WFUJSESJ.s")
	public static client field1377;

	public WFUJSESJ(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
		field1382 = arg4;
		field1383 = arg5;
		field1384 = arg2;
		field1373 = arg1;
		field1374 = arg3;
		field1375 = arg7;
		field1376 = arg8;

		if (arg0 != -1) {
			field1379 = BZONLWPM.field53[arg0];
			field1372 = 0;
			field1378 = client.field123;
			if (arg6 && field1379.field58 != -1) {
				field1372 = (int) (Math.random() * field1379.field54);
				field1378 -= (int) (Math.random() * field1379.method27(field1372));
			}
		}

		HGKOLOPU var10 = HGKOLOPU.method326(field1382);
		field1380 = var10.field704;
		field1381 = var10.field720;
		field1371 = var10.field691;
	}

	@ObfuscatedName("WFUJSESJ.a(I)LIGXVZOHI;")
	public final IGXVZOHI method25() {
		int var1 = -1;
		if (field1379 != null) {
			int var2 = client.field123 - field1378;
			if (var2 > 100 && field1379.field58 > 0) {
				var2 = 100;
			}

			while (var2 > field1379.method27(field1372)) {
				var2 -= field1379.method27(field1372);
				field1372++;
				if (field1372 >= field1379.field54) {
					field1372 -= field1379.field58;
					if (field1372 < 0 || field1372 >= field1379.field54) {
						break;
					}
				}
			}

			field1379 = null;
			field1378 = client.field123 - var2;

			if (field1379 != null) {
				var1 = field1379.field55[field1372];
			}
		}

		HGKOLOPU var3;
		if (field1371 == null) {
			var3 = HGKOLOPU.method326(field1382);
		} else {
			var3 = method556();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method321(field1383, field1384, field1373, field1374, field1375, field1376, var1);
	}

	@ObfuscatedName("WFUJSESJ.b(I)LHGKOLOPU;")
	public final HGKOLOPU method556() {
		int var1 = -1;
		if (field1380 != -1) {
			EMWMNDZQ var2 = EMWMNDZQ.field602[field1380];
			int var3 = var2.field604;
			int var4 = var2.field605;
			int var5 = var2.field606;
			int var6 = client.field395[var5 - var4];
			var1 = field1377.field95[var3] >> var4 & var6;
		} else if (field1381 != -1) {
			var1 = field1377.field95[field1381];
		}

		if (var1 >= 0 && var1 < field1371.length && field1371[var1] != -1) {
			return HGKOLOPU.method326(field1371[var1]);
		}

		return null;
	}
}
