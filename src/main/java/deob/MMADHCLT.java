package deob;

@ObfuscatedName("MMADHCLT")
public class MMADHCLT {

	@ObfuscatedName("MMADHCLT.f")
	public int field928;

	@ObfuscatedName("MMADHCLT.i")
	public int field931;

	@ObfuscatedName("MMADHCLT.j")
	public int field932;

	@ObfuscatedName("MMADHCLT.k")
	public int field933;

	@ObfuscatedName("MMADHCLT.l")
	public int field934;

	@ObfuscatedName("MMADHCLT.m")
	public int field935;

	@ObfuscatedName("MMADHCLT.n")
	public int field936;

	@ObfuscatedName("MMADHCLT.o")
	public int field937;

	@ObfuscatedName("MMADHCLT.p")
	public int field938;

	@ObfuscatedName("MMADHCLT.g")
	public int[] field929;

	@ObfuscatedName("MMADHCLT.h")
	public int[] field930;

	@ObfuscatedName("MMADHCLT.a(ILUAWAYCTK;)V")
	public final void method324(UAWAYCTK arg0) {
		field933 = arg0.method455();
		field931 = arg0.method460();
		field932 = arg0.method460();
		method325(arg0);
	}

	@ObfuscatedName("MMADHCLT.a(LUAWAYCTK;I)V")
	public final void method325(UAWAYCTK arg0) {
		field928 = arg0.method455();
		field929 = new int[field928];
		field930 = new int[field928];
		for (int var2 = 0; var2 < field928; var2++) {
			field929[var2] = arg0.method457();
			field930[var2] = arg0.method457();
		}
	}

	@ObfuscatedName("MMADHCLT.a(I)V")
	public final void method326() {
		field934 = 0;
		field935 = 0;
		field936 = 0;
		field937 = 0;
		field938 = 0;
	}

	@ObfuscatedName("MMADHCLT.a(BI)I")
	public final int method327(int arg0) {
		if (field938 >= field934) {
			field937 = field930[field935++] << 15;

			if (field935 >= field928) {
				field935 = field928 - 1;
			}

			field934 = (int) (field929[field935] / 65536.0D * arg0);
			if (field934 > field938) {
				field936 = ((field930[field935] << 15) - field937) / (field934 - field938);
			}
		}

		field937 += field936;
		field938++;
		return field937 - field936 >> 15;
	}
}
