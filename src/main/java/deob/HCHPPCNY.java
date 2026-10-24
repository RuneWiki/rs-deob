package deob;

@ObfuscatedName("HCHPPCNY")
public class HCHPPCNY {

	@ObfuscatedName("HCHPPCNY.d")
	public int field638;

	@ObfuscatedName("HCHPPCNY.g")
	public int field641;

	@ObfuscatedName("HCHPPCNY.h")
	public int field642;

	@ObfuscatedName("HCHPPCNY.i")
	public int field643;

	@ObfuscatedName("HCHPPCNY.j")
	public int field644;

	@ObfuscatedName("HCHPPCNY.k")
	public int field645;

	@ObfuscatedName("HCHPPCNY.l")
	public int field646;

	@ObfuscatedName("HCHPPCNY.m")
	public int field647;

	@ObfuscatedName("HCHPPCNY.n")
	public int field648;

	@ObfuscatedName("HCHPPCNY.e")
	public int[] field639;

	@ObfuscatedName("HCHPPCNY.f")
	public int[] field640;

	@ObfuscatedName("HCHPPCNY.a(ILBSNPYLEV;)V")
	public final void method316(BSNPYLEV arg0) {
		field643 = arg0.method47();
		field641 = arg0.method52();
		field642 = arg0.method52();
		method317(arg0);
	}

	@ObfuscatedName("HCHPPCNY.a(LBSNPYLEV;I)V")
	public final void method317(BSNPYLEV arg0) {
		field638 = arg0.method47();
		field639 = new int[field638];
		field640 = new int[field638];
		for (int var2 = 0; var2 < field638; var2++) {
			field639[var2] = arg0.method49();
			field640[var2] = arg0.method49();
		}
	}

	@ObfuscatedName("HCHPPCNY.a(I)V")
	public final void method318() {
		field644 = 0;
		field645 = 0;
		field646 = 0;
		field647 = 0;
		field648 = 0;
	}

	@ObfuscatedName("HCHPPCNY.a(IB)I")
	public final int method319(int arg0) {
		if (field648 >= field644) {
			field647 = field640[field645++] << 15;

			if (field645 >= field638) {
				field645 = field638 - 1;
			}

			field644 = (int) (field639[field645] / 65536.0D * arg0);
			if (field644 > field648) {
				field646 = ((field640[field645] << 15) - field647) / (field644 - field648);
			}
		}

		field647 += field646;
		field648++;
		return field647 - field646 >> 15;
	}
}
