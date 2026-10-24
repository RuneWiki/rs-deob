package deob;

@ObfuscatedName("VQRBOQUI")
public class VQRBOQUI {

	@ObfuscatedName("VQRBOQUI.d")
	public int field1449;

	@ObfuscatedName("VQRBOQUI.g")
	public int field1452;

	@ObfuscatedName("VQRBOQUI.h")
	public int field1453;

	@ObfuscatedName("VQRBOQUI.i")
	public int field1454;

	@ObfuscatedName("VQRBOQUI.j")
	public int field1455;

	@ObfuscatedName("VQRBOQUI.k")
	public int field1456;

	@ObfuscatedName("VQRBOQUI.l")
	public int field1457;

	@ObfuscatedName("VQRBOQUI.m")
	public int field1458;

	@ObfuscatedName("VQRBOQUI.n")
	public int field1459;

	@ObfuscatedName("VQRBOQUI.e")
	public int[] field1450;

	@ObfuscatedName("VQRBOQUI.f")
	public int[] field1451;

	@ObfuscatedName("VQRBOQUI.a(BLCKBTFRZM;)V")
	public final void method578(CKBTFRZM arg0) {
		field1454 = arg0.method44();
		field1452 = arg0.method49();
		field1453 = arg0.method49();
		method579(arg0);
	}

	@ObfuscatedName("VQRBOQUI.a(ILCKBTFRZM;)V")
	public final void method579(CKBTFRZM arg0) {
		field1449 = arg0.method44();
		field1450 = new int[field1449];
		field1451 = new int[field1449];
		for (int var2 = 0; var2 < field1449; var2++) {
			field1450[var2] = arg0.method46();
			field1451[var2] = arg0.method46();
		}
	}

	@ObfuscatedName("VQRBOQUI.a(I)V")
	public final void method580() {
		field1455 = 0;
		field1456 = 0;
		field1457 = 0;
		field1458 = 0;
		field1459 = 0;
	}

	@ObfuscatedName("VQRBOQUI.a(ZI)I")
	public final int method581(int arg0) {
		if (field1459 >= field1455) {
			field1458 = field1451[field1456++] << 15;

			if (field1456 >= field1449) {
				field1456 = field1449 - 1;
			}

			field1455 = (int) (field1450[field1456] / 65536.0D * arg0);
			if (field1455 > field1459) {
				field1457 = ((field1451[field1456] << 15) - field1458) / (field1455 - field1459);
			}
		}

		field1458 += field1457;
		field1459++;
		return field1458 - field1457 >> 15;
	}
}
