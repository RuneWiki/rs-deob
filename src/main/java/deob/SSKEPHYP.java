package deob;

@ObfuscatedName("SSKEPHYP")
public class SSKEPHYP {

	@ObfuscatedName("SSKEPHYP.c")
	public int field1162;

	@ObfuscatedName("SSKEPHYP.f")
	public int field1165;

	@ObfuscatedName("SSKEPHYP.g")
	public int field1166;

	@ObfuscatedName("SSKEPHYP.h")
	public int field1167;

	@ObfuscatedName("SSKEPHYP.i")
	public int field1168;

	@ObfuscatedName("SSKEPHYP.j")
	public int field1169;

	@ObfuscatedName("SSKEPHYP.k")
	public int field1170;

	@ObfuscatedName("SSKEPHYP.l")
	public int field1171;

	@ObfuscatedName("SSKEPHYP.m")
	public int field1172;

	@ObfuscatedName("SSKEPHYP.d")
	public int[] field1163;

	@ObfuscatedName("SSKEPHYP.e")
	public int[] field1164;

	@ObfuscatedName("SSKEPHYP.a(LJHKSAGUC;I)V")
	public final void method479(JHKSAGUC arg0) {
		field1167 = arg0.method306();
		field1165 = arg0.method311();
		field1166 = arg0.method311();
		method480(arg0);
	}

	@ObfuscatedName("SSKEPHYP.b(LJHKSAGUC;I)V")
	public final void method480(JHKSAGUC arg0) {
		field1162 = arg0.method306();
		field1163 = new int[field1162];
		field1164 = new int[field1162];
		for (int var2 = 0; var2 < field1162; var2++) {
			field1163[var2] = arg0.method308();
			field1164[var2] = arg0.method308();
		}
	}

	@ObfuscatedName("SSKEPHYP.a(I)V")
	public final void method481() {
		field1168 = 0;
		field1169 = 0;
		field1170 = 0;
		field1171 = 0;
		field1172 = 0;
	}

	@ObfuscatedName("SSKEPHYP.a(IZ)I")
	public final int method482(int arg0) {
		if (field1172 >= field1168) {
			field1171 = field1164[field1169++] << 15;

			if (field1169 >= field1162) {
				field1169 = field1162 - 1;
			}

			field1168 = (int) (field1163[field1169] / 65536.0D * arg0);
			if (field1168 > field1172) {
				field1170 = ((field1164[field1169] << 15) - field1171) / (field1168 - field1172);
			}
		}

		field1171 += field1170;
		field1172++;
		return field1171 - field1170 >> 15;
	}
}
