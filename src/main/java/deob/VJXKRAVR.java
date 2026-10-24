package deob;

@ObfuscatedName("VJXKRAVR")
public class VJXKRAVR {

	@ObfuscatedName("VJXKRAVR.d")
	public int field1373;

	@ObfuscatedName("VJXKRAVR.g")
	public int field1376;

	@ObfuscatedName("VJXKRAVR.h")
	public int field1377;

	@ObfuscatedName("VJXKRAVR.i")
	public int field1378;

	@ObfuscatedName("VJXKRAVR.j")
	public int field1379;

	@ObfuscatedName("VJXKRAVR.k")
	public int field1380;

	@ObfuscatedName("VJXKRAVR.l")
	public int field1381;

	@ObfuscatedName("VJXKRAVR.m")
	public int field1382;

	@ObfuscatedName("VJXKRAVR.n")
	public int field1383;

	@ObfuscatedName("VJXKRAVR.e")
	public int[] field1374;

	@ObfuscatedName("VJXKRAVR.f")
	public int[] field1375;

	@ObfuscatedName("VJXKRAVR.a(LMLYYHULT;B)V")
	public final void method564(MLYYHULT arg0) {
		field1378 = arg0.method296();
		field1376 = arg0.method301();
		field1377 = arg0.method301();
		method565(arg0);
	}

	@ObfuscatedName("VJXKRAVR.a(LMLYYHULT;I)V")
	public final void method565(MLYYHULT arg0) {
		field1373 = arg0.method296();
		field1374 = new int[field1373];
		field1375 = new int[field1373];
		for (int var2 = 0; var2 < field1373; var2++) {
			field1374[var2] = arg0.method298();
			field1375[var2] = arg0.method298();
		}
	}

	@ObfuscatedName("VJXKRAVR.a(I)V")
	public final void method566() {
		field1379 = 0;
		field1380 = 0;
		field1381 = 0;
		field1382 = 0;
		field1383 = 0;
	}

	@ObfuscatedName("VJXKRAVR.a(BI)I")
	public final int method567(int arg0) {
		if (field1383 >= field1379) {
			field1382 = field1375[field1380++] << 15;

			if (field1380 >= field1373) {
				field1380 = field1373 - 1;
			}

			field1379 = (int) (field1374[field1380] / 65536.0D * arg0);
			if (field1379 > field1383) {
				field1381 = ((field1375[field1380] << 15) - field1382) / (field1379 - field1383);
			}
		}

		field1382 += field1381;
		field1383++;
		return field1382 - field1381 >> 15;
	}
}
