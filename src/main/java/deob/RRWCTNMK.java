package deob;

@ObfuscatedName("RRWCTNMK")
public class RRWCTNMK {

	@ObfuscatedName("RRWCTNMK.b")
	public int field1148;

	@ObfuscatedName("RRWCTNMK.e")
	public int field1151;

	@ObfuscatedName("RRWCTNMK.f")
	public int field1152;

	@ObfuscatedName("RRWCTNMK.g")
	public int field1153;

	@ObfuscatedName("RRWCTNMK.h")
	public int field1154;

	@ObfuscatedName("RRWCTNMK.i")
	public int field1155;

	@ObfuscatedName("RRWCTNMK.j")
	public int field1156;

	@ObfuscatedName("RRWCTNMK.k")
	public int field1157;

	@ObfuscatedName("RRWCTNMK.l")
	public int field1158;

	@ObfuscatedName("RRWCTNMK.c")
	public int[] field1149;

	@ObfuscatedName("RRWCTNMK.d")
	public int[] field1150;

	@ObfuscatedName("RRWCTNMK.a(LEILHLJCE;B)V")
	public final void method443(EILHLJCE arg0) {
		field1153 = arg0.method224();
		field1151 = arg0.method229();
		field1152 = arg0.method229();
		method444(arg0);
	}

	@ObfuscatedName("RRWCTNMK.a(LEILHLJCE;I)V")
	public final void method444(EILHLJCE arg0) {
		field1148 = arg0.method224();
		field1149 = new int[field1148];
		field1150 = new int[field1148];
		for (int var2 = 0; var2 < field1148; var2++) {
			field1149[var2] = arg0.method226();
			field1150[var2] = arg0.method226();
		}
	}

	@ObfuscatedName("RRWCTNMK.a(I)V")
	public final void method445() {
		field1154 = 0;
		field1155 = 0;
		field1156 = 0;
		field1157 = 0;
		field1158 = 0;
	}

	@ObfuscatedName("RRWCTNMK.a(II)I")
	public final int method446(int arg0) {
		if (field1158 >= field1154) {
			field1157 = field1150[field1155++] << 15;

			if (field1155 >= field1148) {
				field1155 = field1148 - 1;
			}

			field1154 = (int) (field1149[field1155] / 65536.0D * arg0);
			if (field1154 > field1158) {
				field1156 = ((field1150[field1155] << 15) - field1157) / (field1154 - field1158);
			}
		}

		field1157 += field1156;
		field1158++;
		return field1157 - field1156 >> 15;
	}
}
