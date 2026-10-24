package deob;

@ObfuscatedName("GTUIGVXS")
public class GTUIGVXS {

	@ObfuscatedName("GTUIGVXS.e")
	public int field846;

	@ObfuscatedName("GTUIGVXS.h")
	public int field849;

	@ObfuscatedName("GTUIGVXS.i")
	public int field850;

	@ObfuscatedName("GTUIGVXS.j")
	public int field851;

	@ObfuscatedName("GTUIGVXS.k")
	public int field852;

	@ObfuscatedName("GTUIGVXS.l")
	public int field853;

	@ObfuscatedName("GTUIGVXS.m")
	public int field854;

	@ObfuscatedName("GTUIGVXS.n")
	public int field855;

	@ObfuscatedName("GTUIGVXS.o")
	public int field856;

	@ObfuscatedName("GTUIGVXS.f")
	public int[] field847;

	@ObfuscatedName("GTUIGVXS.g")
	public int[] field848;

	@ObfuscatedName("GTUIGVXS.a(LWBEWPIXO;I)V")
	public final void method269(WBEWPIXO arg0) {
		field851 = arg0.method515();
		field849 = arg0.method520();
		field850 = arg0.method520();
		method270(arg0);
	}

	@ObfuscatedName("GTUIGVXS.b(LWBEWPIXO;I)V")
	public final void method270(WBEWPIXO arg0) {
		field846 = arg0.method515();
		field847 = new int[field846];
		field848 = new int[field846];
		for (int var2 = 0; var2 < field846; var2++) {
			field847[var2] = arg0.method517();
			field848[var2] = arg0.method517();
		}
	}

	@ObfuscatedName("GTUIGVXS.a(B)V")
	public final void method271() {
		field852 = 0;
		field853 = 0;
		field854 = 0;
		field855 = 0;
		field856 = 0;
	}

	@ObfuscatedName("GTUIGVXS.a(II)I")
	public final int method272(int arg0) {
		if (field856 >= field852) {
			field855 = field848[field853++] << 15;

			if (field853 >= field846) {
				field853 = field846 - 1;
			}

			field852 = (int) (field847[field853] / 65536.0D * arg0);
			if (field852 > field856) {
				field854 = ((field848[field853] << 15) - field855) / (field852 - field856);
			}
		}

		field855 += field854;
		field856++;
		return field855 - field854 >> 15;
	}
}
