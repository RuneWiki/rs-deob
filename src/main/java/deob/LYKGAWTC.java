package deob;

@ObfuscatedName("LYKGAWTC")
public class LYKGAWTC {

	@ObfuscatedName("LYKGAWTC.b")
	public int field898;

	@ObfuscatedName("LYKGAWTC.e")
	public int field901;

	@ObfuscatedName("LYKGAWTC.f")
	public int field902;

	@ObfuscatedName("LYKGAWTC.g")
	public int field903;

	@ObfuscatedName("LYKGAWTC.h")
	public int field904;

	@ObfuscatedName("LYKGAWTC.i")
	public int field905;

	@ObfuscatedName("LYKGAWTC.j")
	public int field906;

	@ObfuscatedName("LYKGAWTC.k")
	public int field907;

	@ObfuscatedName("LYKGAWTC.l")
	public int field908;

	@ObfuscatedName("LYKGAWTC.c")
	public int[] field899;

	@ObfuscatedName("LYKGAWTC.d")
	public int[] field900;

	@ObfuscatedName("LYKGAWTC.a(BLGLMIQHJI;)V")
	public final void method385(GLMIQHJI arg0) {
		field903 = arg0.method244();
		field901 = arg0.method249();
		field902 = arg0.method249();
		method386(arg0);
	}

	@ObfuscatedName("LYKGAWTC.a(LGLMIQHJI;I)V")
	public final void method386(GLMIQHJI arg0) {
		field898 = arg0.method244();
		field899 = new int[field898];
		field900 = new int[field898];
		for (int var2 = 0; var2 < field898; var2++) {
			field899[var2] = arg0.method246();
			field900[var2] = arg0.method246();
		}
	}

	@ObfuscatedName("LYKGAWTC.a(I)V")
	public final void method387() {
		field904 = 0;
		field905 = 0;
		field906 = 0;
		field907 = 0;
		field908 = 0;
	}

	@ObfuscatedName("LYKGAWTC.a(BI)I")
	public final int method388(int arg0) {
		if (field908 >= field904) {
			field907 = field900[field905++] << 15;

			if (field905 >= field898) {
				field905 = field898 - 1;
			}

			field904 = (int) (field899[field905] / 65536.0D * arg0);
			if (field904 > field908) {
				field906 = ((field900[field905] << 15) - field907) / (field904 - field908);
			}
		}

		field907 += field906;
		field908++;
		return field907 - field906 >> 15;
	}
}
