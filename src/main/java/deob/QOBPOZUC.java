package deob;

@ObfuscatedName("QOBPOZUC")
public class QOBPOZUC {

	@ObfuscatedName("QOBPOZUC.b")
	public int field1043;

	@ObfuscatedName("QOBPOZUC.e")
	public int field1046;

	@ObfuscatedName("QOBPOZUC.f")
	public int field1047;

	@ObfuscatedName("QOBPOZUC.g")
	public int field1048;

	@ObfuscatedName("QOBPOZUC.h")
	public int field1049;

	@ObfuscatedName("QOBPOZUC.i")
	public int field1050;

	@ObfuscatedName("QOBPOZUC.j")
	public int field1051;

	@ObfuscatedName("QOBPOZUC.k")
	public int field1052;

	@ObfuscatedName("QOBPOZUC.l")
	public int field1053;

	@ObfuscatedName("QOBPOZUC.c")
	public int[] field1044;

	@ObfuscatedName("QOBPOZUC.d")
	public int[] field1045;

	@ObfuscatedName("QOBPOZUC.a(LXQPFGONL;I)V")
	public final void method390(XQPFGONL arg0) {
		field1048 = arg0.method478();
		field1046 = arg0.method483();
		field1047 = arg0.method483();
		method391(arg0);
	}

	@ObfuscatedName("QOBPOZUC.a(LXQPFGONL;Z)V")
	public final void method391(XQPFGONL arg0) {
		field1043 = arg0.method478();
		field1044 = new int[field1043];
		field1045 = new int[field1043];
		for (int var2 = 0; var2 < field1043; var2++) {
			field1044[var2] = arg0.method480();
			field1045[var2] = arg0.method480();
		}
	}

	@ObfuscatedName("QOBPOZUC.a(I)V")
	public final void method392() {
		field1049 = 0;
		field1050 = 0;
		field1051 = 0;
		field1052 = 0;
		field1053 = 0;
	}

	@ObfuscatedName("QOBPOZUC.a(ZI)I")
	public final int method393(int arg0) {
		if (field1053 >= field1049) {
			field1052 = field1045[field1050++] << 15;

			if (field1050 >= field1043) {
				field1050 = field1043 - 1;
			}

			field1049 = (int) (field1044[field1050] / 65536.0D * arg0);
			if (field1049 > field1053) {
				field1051 = ((field1045[field1050] << 15) - field1052) / (field1049 - field1053);
			}
		}

		field1052 += field1051;
		field1053++;
		return field1052 - field1051 >> 15;
	}
}
