package deob;

@ObfuscatedName("JZEFIVMF")
public class JZEFIVMF {

	@ObfuscatedName("JZEFIVMF.c")
	public int field645;

	@ObfuscatedName("JZEFIVMF.f")
	public int field648;

	@ObfuscatedName("JZEFIVMF.g")
	public int field649;

	@ObfuscatedName("JZEFIVMF.h")
	public int field650;

	@ObfuscatedName("JZEFIVMF.i")
	public int field651;

	@ObfuscatedName("JZEFIVMF.j")
	public int field652;

	@ObfuscatedName("JZEFIVMF.k")
	public int field653;

	@ObfuscatedName("JZEFIVMF.l")
	public int field654;

	@ObfuscatedName("JZEFIVMF.m")
	public int field655;

	@ObfuscatedName("JZEFIVMF.d")
	public int[] field646;

	@ObfuscatedName("JZEFIVMF.e")
	public int[] field647;

	@ObfuscatedName("JZEFIVMF.a(LFTMSICIZ;I)V")
	public final void method309(FTMSICIZ arg0) {
		field650 = arg0.method213();
		field648 = arg0.method218();
		field649 = arg0.method218();
		method310(arg0);
	}

	@ObfuscatedName("JZEFIVMF.a(ZLFTMSICIZ;)V")
	public final void method310(FTMSICIZ arg0) {
		field645 = arg0.method213();
		field646 = new int[field645];
		field647 = new int[field645];
		for (int var2 = 0; var2 < field645; var2++) {
			field646[var2] = arg0.method215();
			field647[var2] = arg0.method215();
		}
	}

	@ObfuscatedName("JZEFIVMF.a(Z)V")
	public final void method311() {
		field651 = 0;
		field652 = 0;
		field653 = 0;
		field654 = 0;
		field655 = 0;
	}

	@ObfuscatedName("JZEFIVMF.a(II)I")
	public final int method312(int arg0) {
		if (field655 >= field651) {
			field654 = field647[field652++] << 15;

			if (field652 >= field645) {
				field652 = field645 - 1;
			}

			field651 = (int) (field646[field652] / 65536.0D * arg0);
			if (field651 > field655) {
				field653 = ((field647[field652] << 15) - field654) / (field651 - field655);
			}
		}

		field654 += field653;
		field655++;
		return field654 - field653 >> 15;
	}
}
