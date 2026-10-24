package deob;

@ObfuscatedName("UHTSXKVU")
public class UHTSXKVU {

	@ObfuscatedName("UHTSXKVU.b")
	public int field1134;

	@ObfuscatedName("UHTSXKVU.e")
	public int field1137;

	@ObfuscatedName("UHTSXKVU.f")
	public int field1138;

	@ObfuscatedName("UHTSXKVU.g")
	public int field1139;

	@ObfuscatedName("UHTSXKVU.h")
	public int field1140;

	@ObfuscatedName("UHTSXKVU.i")
	public int field1141;

	@ObfuscatedName("UHTSXKVU.j")
	public int field1142;

	@ObfuscatedName("UHTSXKVU.k")
	public int field1143;

	@ObfuscatedName("UHTSXKVU.l")
	public int field1144;

	@ObfuscatedName("UHTSXKVU.c")
	public int[] field1135;

	@ObfuscatedName("UHTSXKVU.d")
	public int[] field1136;

	@ObfuscatedName("UHTSXKVU.a(LRSWRPCHR;B)V")
	public final void method445(RSWRPCHR arg0) {
		field1139 = arg0.method388();
		field1137 = arg0.method393();
		field1138 = arg0.method393();
		method446(arg0);
	}

	@ObfuscatedName("UHTSXKVU.a(LRSWRPCHR;I)V")
	public final void method446(RSWRPCHR arg0) {
		field1134 = arg0.method388();
		field1135 = new int[field1134];
		field1136 = new int[field1134];
		for (int var2 = 0; var2 < field1134; var2++) {
			field1135[var2] = arg0.method390();
			field1136[var2] = arg0.method390();
		}
	}

	@ObfuscatedName("UHTSXKVU.a(I)V")
	public final void method447() {
		field1140 = 0;
		field1141 = 0;
		field1142 = 0;
		field1143 = 0;
		field1144 = 0;
	}

	@ObfuscatedName("UHTSXKVU.a(II)I")
	public final int method448(int arg0) {
		if (field1144 >= field1140) {
			field1143 = field1136[field1141++] << 15;

			if (field1141 >= field1134) {
				field1141 = field1134 - 1;
			}

			field1140 = (int) (field1135[field1141] / 65536.0D * arg0);
			if (field1140 > field1144) {
				field1142 = ((field1136[field1141] << 15) - field1143) / (field1140 - field1144);
			}
		}

		field1143 += field1142;
		field1144++;
		return field1143 - field1142 >> 15;
	}
}
