package deob;

@ObfuscatedName("AUPOWMGG")
public class AUPOWMGG {

	@ObfuscatedName("AUPOWMGG.c")
	public int field1;

	@ObfuscatedName("AUPOWMGG.l")
	public int field10;

	@ObfuscatedName("AUPOWMGG.m")
	public int field11;

	@ObfuscatedName("AUPOWMGG.f")
	public int field4;

	@ObfuscatedName("AUPOWMGG.g")
	public int field5;

	@ObfuscatedName("AUPOWMGG.h")
	public int field6;

	@ObfuscatedName("AUPOWMGG.i")
	public int field7;

	@ObfuscatedName("AUPOWMGG.j")
	public int field8;

	@ObfuscatedName("AUPOWMGG.k")
	public int field9;

	@ObfuscatedName("AUPOWMGG.d")
	public int[] field2;

	@ObfuscatedName("AUPOWMGG.e")
	public int[] field3;

	@ObfuscatedName("AUPOWMGG.a(ZLNHEPCMLW;)V")
	public final void method1(NHEPCMLW arg0) {
		field6 = arg0.method349();
		field4 = arg0.method354();
		field5 = arg0.method354();
		method2(arg0);
	}

	@ObfuscatedName("AUPOWMGG.a(LNHEPCMLW;B)V")
	public final void method2(NHEPCMLW arg0) {
		field1 = arg0.method349();
		field2 = new int[field1];
		field3 = new int[field1];
		for (int var2 = 0; var2 < field1; var2++) {
			field2[var2] = arg0.method351();
			field3[var2] = arg0.method351();
		}
	}

	@ObfuscatedName("AUPOWMGG.a(B)V")
	public final void method3() {
		field7 = 0;
		field8 = 0;
		field9 = 0;
		field10 = 0;
		field11 = 0;
	}

	@ObfuscatedName("AUPOWMGG.a(ZI)I")
	public final int method4(int arg0) {
		if (field11 >= field7) {
			field10 = field3[field8++] << 15;

			if (field8 >= field1) {
				field8 = field1 - 1;
			}

			field7 = (int) (field2[field8] / 65536.0D * arg0);
			if (field7 > field11) {
				field9 = ((field3[field8] << 15) - field10) / (field7 - field11);
			}
		}

		field10 += field9;
		field11++;
		return field10 - field9 >> 15;
	}
}
