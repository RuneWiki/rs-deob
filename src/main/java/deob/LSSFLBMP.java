package deob;

@ObfuscatedName("LSSFLBMP")
public class LSSFLBMP {

	@ObfuscatedName("LSSFLBMP.d")
	public int field817;

	@ObfuscatedName("LSSFLBMP.g")
	public int field820;

	@ObfuscatedName("LSSFLBMP.h")
	public int field821;

	@ObfuscatedName("LSSFLBMP.i")
	public int field822;

	@ObfuscatedName("LSSFLBMP.j")
	public int field823;

	@ObfuscatedName("LSSFLBMP.k")
	public int field824;

	@ObfuscatedName("LSSFLBMP.l")
	public int field825;

	@ObfuscatedName("LSSFLBMP.m")
	public int field826;

	@ObfuscatedName("LSSFLBMP.n")
	public int field827;

	@ObfuscatedName("LSSFLBMP.e")
	public int[] field818;

	@ObfuscatedName("LSSFLBMP.f")
	public int[] field819;

	@ObfuscatedName("LSSFLBMP.a(ILWNCFPLWV;)V")
	public final void method323(WNCFPLWV arg0) {
		field822 = arg0.method502();
		field820 = arg0.method507();
		field821 = arg0.method507();
		method324(arg0);
	}

	@ObfuscatedName("LSSFLBMP.a(LWNCFPLWV;Z)V")
	public final void method324(WNCFPLWV arg0) {
		field817 = arg0.method502();
		field818 = new int[field817];
		field819 = new int[field817];
		for (int var2 = 0; var2 < field817; var2++) {
			field818[var2] = arg0.method504();
			field819[var2] = arg0.method504();
		}
	}

	@ObfuscatedName("LSSFLBMP.a(Z)V")
	public final void method325() {
		field823 = 0;
		field824 = 0;
		field825 = 0;
		field826 = 0;
		field827 = 0;
	}

	@ObfuscatedName("LSSFLBMP.a(IB)I")
	public final int method326(int arg0) {
		if (field827 >= field823) {
			field826 = field819[field824++] << 15;

			if (field824 >= field817) {
				field824 = field817 - 1;
			}

			field823 = (int) (field818[field824] / 65536.0D * arg0);
			if (field823 > field827) {
				field825 = ((field819[field824] << 15) - field826) / (field823 - field827);
			}
		}

		field826 += field825;
		field827++;
		return field826 - field825 >> 15;
	}
}
