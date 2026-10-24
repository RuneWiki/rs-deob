package deob;

@ObfuscatedName("XTUDEFUJ")
public final class XTUDEFUJ extends ESJLSSWI {

	@ObfuscatedName("XTUDEFUJ.n")
	public boolean field1353 = false;

	@ObfuscatedName("XTUDEFUJ.u")
	public TGYZPJQJ field1360;

	@ObfuscatedName("XTUDEFUJ.q")
	public int field1356;

	@ObfuscatedName("XTUDEFUJ.r")
	public int field1357;

	@ObfuscatedName("XTUDEFUJ.s")
	public int field1358;

	@ObfuscatedName("XTUDEFUJ.t")
	public int field1359;

	@ObfuscatedName("XTUDEFUJ.l")
	public int field1352;

	@ObfuscatedName("XTUDEFUJ.o")
	public int field1354;

	@ObfuscatedName("XTUDEFUJ.p")
	public int field1355;

	public XTUDEFUJ(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field1360 = TGYZPJQJ.field1121[arg0];
		field1356 = arg5;
		field1357 = arg3;
		field1358 = arg1;
		field1359 = arg4;
		field1352 = arg2 + arg6;
		field1353 = false;
	}

	@ObfuscatedName("XTUDEFUJ.a(ZI)V")
	public final void method536(int arg0) {
		field1355 += arg0;
		while (field1355 > field1360.field1125.method301(field1354)) {
			field1355 -= field1360.field1125.method301(field1354) + 1;
			field1354++;
			if (field1354 >= field1360.field1125.field833 && (field1354 < 0 || field1354 >= field1360.field1125.field833)) {
				field1354 = 0;
				field1353 = true;
			}
		}
	}

	@ObfuscatedName("XTUDEFUJ.a(Z)LWRJMHIDY;")
	public final WRJMHIDY method174() {
		WRJMHIDY var1 = field1360.method444();
		if (var1 == null) {
			return null;
		}

		int var2 = field1360.field1125.field834[field1354];
		WRJMHIDY var3 = new WRJMHIDY(var1, true, false, OZAHMTPS.method338(var2));
		if (!field1353) {
			var3.method473();
			var3.method474(var2);
			var3.field1261 = null;
			var3.field1260 = null;
		}

		if (field1360.field1128 != 128 || field1360.field1129 != 128) {
			var3.method482(field1360.field1128, field1360.field1128, field1360.field1129);
		}

		if (field1360.field1130 != 0) {
			if (field1360.field1130 == 90) {
				var3.method477();
			}

			if (field1360.field1130 == 180) {
				var3.method477();
				var3.method477();
			}

			if (field1360.field1130 == 270) {
				var3.method477();
				var3.method477();
				var3.method477();
			}
		}

		var3.method483(field1360.field1131 + 64, field1360.field1132 + 850, -30, -50, -30, true);
		return var3;
	}
}
