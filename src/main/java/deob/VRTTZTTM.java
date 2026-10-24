package deob;

@ObfuscatedName("VRTTZTTM")
public class VRTTZTTM {

	@ObfuscatedName("VRTTZTTM.d")
	public int field1416;

	@ObfuscatedName("VRTTZTTM.g")
	public int field1419;

	@ObfuscatedName("VRTTZTTM.h")
	public int field1420;

	@ObfuscatedName("VRTTZTTM.i")
	public int field1421;

	@ObfuscatedName("VRTTZTTM.j")
	public int field1422;

	@ObfuscatedName("VRTTZTTM.k")
	public int field1423;

	@ObfuscatedName("VRTTZTTM.l")
	public int field1424;

	@ObfuscatedName("VRTTZTTM.m")
	public int field1425;

	@ObfuscatedName("VRTTZTTM.n")
	public int field1426;

	@ObfuscatedName("VRTTZTTM.e")
	public int[] field1417;

	@ObfuscatedName("VRTTZTTM.f")
	public int[] field1418;

	@ObfuscatedName("VRTTZTTM.a(LTKPFKOXP;B)V")
	public final void method582(TKPFKOXP arg0) {
		field1421 = arg0.method529();
		field1419 = arg0.method534();
		field1420 = arg0.method534();
		method583(arg0);
	}

	@ObfuscatedName("VRTTZTTM.a(ZLTKPFKOXP;)V")
	public final void method583(TKPFKOXP arg0) {
		field1416 = arg0.method529();
		field1417 = new int[field1416];
		field1418 = new int[field1416];
		for (int var2 = 0; var2 < field1416; var2++) {
			field1417[var2] = arg0.method531();
			field1418[var2] = arg0.method531();
		}
	}

	@ObfuscatedName("VRTTZTTM.a(I)V")
	public final void method584() {
		field1422 = 0;
		field1423 = 0;
		field1424 = 0;
		field1425 = 0;
		field1426 = 0;
	}

	@ObfuscatedName("VRTTZTTM.a(IZ)I")
	public final int method585(int arg0) {
		if (field1426 >= field1422) {
			field1425 = field1418[field1423++] << 15;

			if (field1423 >= field1416) {
				field1423 = field1416 - 1;
			}

			field1422 = (int) (field1417[field1423] / 65536.0D * arg0);
			if (field1422 > field1426) {
				field1424 = ((field1418[field1423] << 15) - field1425) / (field1422 - field1426);
			}
		}

		field1425 += field1424;
		field1426++;
		return field1425 - field1424 >> 15;
	}
}
