package deob;

@ObfuscatedName("LRDFYKJP")
public class LRDFYKJP {

	@ObfuscatedName("LRDFYKJP.a")
	public int field772;

	@ObfuscatedName("LRDFYKJP.d")
	public int field775;

	@ObfuscatedName("LRDFYKJP.e")
	public int field776;

	@ObfuscatedName("LRDFYKJP.f")
	public int field777;

	@ObfuscatedName("LRDFYKJP.g")
	public int field778;

	@ObfuscatedName("LRDFYKJP.h")
	public int field779;

	@ObfuscatedName("LRDFYKJP.i")
	public int field780;

	@ObfuscatedName("LRDFYKJP.j")
	public int field781;

	@ObfuscatedName("LRDFYKJP.k")
	public int field782;

	@ObfuscatedName("LRDFYKJP.b")
	public int[] field773;

	@ObfuscatedName("LRDFYKJP.c")
	public int[] field774;

	@ObfuscatedName("LRDFYKJP.a(LMUKVLYLC;Z)V")
	public final void method261(MUKVLYLC arg0) {
		field777 = arg0.method292();
		field775 = arg0.method297();
		field776 = arg0.method297();
		method262(arg0);
	}

	@ObfuscatedName("LRDFYKJP.b(LMUKVLYLC;Z)V")
	public final void method262(MUKVLYLC arg0) {
		field772 = arg0.method292();
		field773 = new int[field772];
		field774 = new int[field772];
		for (int var2 = 0; var2 < field772; var2++) {
			field773[var2] = arg0.method294();
			field774[var2] = arg0.method294();
		}
	}

	@ObfuscatedName("LRDFYKJP.a(I)V")
	public final void method263() {
		field778 = 0;
		field779 = 0;
		field780 = 0;
		field781 = 0;
		field782 = 0;
	}

	@ObfuscatedName("LRDFYKJP.a(II)I")
	public final int method264(int arg0) {
		if (field782 >= field778) {
			field781 = field774[field779++] << 15;

			if (field779 >= field772) {
				field779 = field772 - 1;
			}

			field778 = (int) (field773[field779] / 65536.0D * arg0);
			if (field778 > field782) {
				field780 = ((field774[field779] << 15) - field781) / (field778 - field782);
			}
		}

		field781 += field780;
		field782++;
		return field781 - field780 >> 15;
	}
}
