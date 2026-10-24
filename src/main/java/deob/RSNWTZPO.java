package deob;

@ObfuscatedName("RSNWTZPO")
public class RSNWTZPO {

	@ObfuscatedName("RSNWTZPO.b")
	public int field1202;

	@ObfuscatedName("RSNWTZPO.e")
	public int field1205;

	@ObfuscatedName("RSNWTZPO.f")
	public int field1206;

	@ObfuscatedName("RSNWTZPO.g")
	public int field1207;

	@ObfuscatedName("RSNWTZPO.h")
	public int field1208;

	@ObfuscatedName("RSNWTZPO.i")
	public int field1209;

	@ObfuscatedName("RSNWTZPO.j")
	public int field1210;

	@ObfuscatedName("RSNWTZPO.k")
	public int field1211;

	@ObfuscatedName("RSNWTZPO.l")
	public int field1212;

	@ObfuscatedName("RSNWTZPO.c")
	public int[] field1203;

	@ObfuscatedName("RSNWTZPO.d")
	public int[] field1204;

	@ObfuscatedName("RSNWTZPO.a(ILINLHDAGO;)V")
	public final void method465(INLHDAGO arg0) {
		field1207 = arg0.method308();
		field1205 = arg0.method313();
		field1206 = arg0.method313();
		method466(arg0);
	}

	@ObfuscatedName("RSNWTZPO.a(LINLHDAGO;I)V")
	public final void method466(INLHDAGO arg0) {
		field1202 = arg0.method308();
		field1203 = new int[field1202];
		field1204 = new int[field1202];
		for (int var2 = 0; var2 < field1202; var2++) {
			field1203[var2] = arg0.method310();
			field1204[var2] = arg0.method310();
		}
	}

	@ObfuscatedName("RSNWTZPO.a(I)V")
	public final void method467() {
		field1208 = 0;
		field1209 = 0;
		field1210 = 0;
		field1211 = 0;
		field1212 = 0;
	}

	@ObfuscatedName("RSNWTZPO.a(II)I")
	public final int method468(int arg0) {
		if (field1212 >= field1208) {
			field1211 = field1204[field1209++] << 15;

			if (field1209 >= field1202) {
				field1209 = field1202 - 1;
			}

			field1208 = (int) (field1203[field1209] / 65536.0D * arg0);
			if (field1208 > field1212) {
				field1210 = ((field1204[field1209] << 15) - field1211) / (field1208 - field1212);
			}
		}

		field1211 += field1210;
		field1212++;
		return field1211 - field1210 >> 15;
	}
}
