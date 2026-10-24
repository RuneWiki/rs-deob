package deob;

@ObfuscatedName("JDDBCSRY")
public class JDDBCSRY {

	@ObfuscatedName("JDDBCSRY.b")
	public int field815;

	@ObfuscatedName("JDDBCSRY.e")
	public int field818;

	@ObfuscatedName("JDDBCSRY.f")
	public int field819;

	@ObfuscatedName("JDDBCSRY.g")
	public int field820;

	@ObfuscatedName("JDDBCSRY.h")
	public int field821;

	@ObfuscatedName("JDDBCSRY.i")
	public int field822;

	@ObfuscatedName("JDDBCSRY.j")
	public int field823;

	@ObfuscatedName("JDDBCSRY.k")
	public int field824;

	@ObfuscatedName("JDDBCSRY.l")
	public int field825;

	@ObfuscatedName("JDDBCSRY.c")
	public int[] field816;

	@ObfuscatedName("JDDBCSRY.d")
	public int[] field817;

	@ObfuscatedName("JDDBCSRY.a(ZLXGRGMPUQ;)V")
	public final void method257(XGRGMPUQ arg0) {
		field820 = arg0.method465();
		field818 = arg0.method470();
		field819 = arg0.method470();
		method258(arg0);
	}

	@ObfuscatedName("JDDBCSRY.a(LXGRGMPUQ;I)V")
	public final void method258(XGRGMPUQ arg0) {
		field815 = arg0.method465();
		field816 = new int[field815];
		field817 = new int[field815];
		for (int var2 = 0; var2 < field815; var2++) {
			field816[var2] = arg0.method467();
			field817[var2] = arg0.method467();
		}
	}

	@ObfuscatedName("JDDBCSRY.a(I)V")
	public final void method259() {
		field821 = 0;
		field822 = 0;
		field823 = 0;
		field824 = 0;
		field825 = 0;
	}

	@ObfuscatedName("JDDBCSRY.a(BI)I")
	public final int method260(int arg0) {
		if (field825 >= field821) {
			field824 = field817[field822++] << 15;

			if (field822 >= field815) {
				field822 = field815 - 1;
			}

			field821 = (int) (field816[field822] / 65536.0D * arg0);
			if (field821 > field825) {
				field823 = ((field817[field822] << 15) - field824) / (field821 - field825);
			}
		}

		field824 += field823;
		field825++;
		return field824 - field823 >> 15;
	}
}
