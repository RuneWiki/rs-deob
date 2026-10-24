package deob;

@ObfuscatedName("ZBHVITZX")
public class ZBHVITZX {

	@ObfuscatedName("ZBHVITZX.c")
	public int field1415;

	@ObfuscatedName("ZBHVITZX.f")
	public int field1418;

	@ObfuscatedName("ZBHVITZX.g")
	public int field1419;

	@ObfuscatedName("ZBHVITZX.h")
	public int field1420;

	@ObfuscatedName("ZBHVITZX.i")
	public int field1421;

	@ObfuscatedName("ZBHVITZX.j")
	public int field1422;

	@ObfuscatedName("ZBHVITZX.k")
	public int field1423;

	@ObfuscatedName("ZBHVITZX.l")
	public int field1424;

	@ObfuscatedName("ZBHVITZX.m")
	public int field1425;

	@ObfuscatedName("ZBHVITZX.d")
	public int[] field1416;

	@ObfuscatedName("ZBHVITZX.e")
	public int[] field1417;

	@ObfuscatedName("ZBHVITZX.a(LLBBVYYXO;B)V")
	public final void method577(LBBVYYXO arg0) {
		field1420 = arg0.method369();
		field1418 = arg0.method374();
		field1419 = arg0.method374();
		method578(arg0);
	}

	@ObfuscatedName("ZBHVITZX.a(LLBBVYYXO;I)V")
	public final void method578(LBBVYYXO arg0) {
		field1415 = arg0.method369();
		field1416 = new int[field1415];
		field1417 = new int[field1415];
		for (int var2 = 0; var2 < field1415; var2++) {
			field1416[var2] = arg0.method371();
			field1417[var2] = arg0.method371();
		}
	}

	@ObfuscatedName("ZBHVITZX.a(B)V")
	public final void method579() {
		field1421 = 0;
		field1422 = 0;
		field1423 = 0;
		field1424 = 0;
		field1425 = 0;
	}

	@ObfuscatedName("ZBHVITZX.a(II)I")
	public final int method580(int arg0) {
		if (field1425 >= field1421) {
			field1424 = field1417[field1422++] << 15;

			if (field1422 >= field1415) {
				field1422 = field1415 - 1;
			}

			field1421 = (int) (field1416[field1422] / 65536.0D * arg0);
			if (field1421 > field1425) {
				field1423 = ((field1417[field1422] << 15) - field1424) / (field1421 - field1425);
			}
		}

		field1424 += field1423;
		field1425++;
		return field1424 - field1423 >> 15;
	}
}
