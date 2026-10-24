package deob;

@ObfuscatedName("ISLGIOFS")
public class ISLGIOFS {

	@ObfuscatedName("ISLGIOFS.c")
	public int field748;

	@ObfuscatedName("ISLGIOFS.f")
	public int field751;

	@ObfuscatedName("ISLGIOFS.g")
	public int field752;

	@ObfuscatedName("ISLGIOFS.h")
	public int field753;

	@ObfuscatedName("ISLGIOFS.i")
	public int field754;

	@ObfuscatedName("ISLGIOFS.j")
	public int field755;

	@ObfuscatedName("ISLGIOFS.k")
	public int field756;

	@ObfuscatedName("ISLGIOFS.l")
	public int field757;

	@ObfuscatedName("ISLGIOFS.m")
	public int field758;

	@ObfuscatedName("ISLGIOFS.d")
	public int[] field749;

	@ObfuscatedName("ISLGIOFS.e")
	public int[] field750;

	@ObfuscatedName("ISLGIOFS.a(ILEMWAMCXW;)V")
	public final void method295(EMWAMCXW arg0) {
		field753 = arg0.method217();
		field751 = arg0.method222();
		field752 = arg0.method222();
		method296(arg0);
	}

	@ObfuscatedName("ISLGIOFS.b(ILEMWAMCXW;)V")
	public final void method296(EMWAMCXW arg0) {
		field748 = arg0.method217();
		field749 = new int[field748];
		field750 = new int[field748];
		for (int var2 = 0; var2 < field748; var2++) {
			field749[var2] = arg0.method219();
			field750[var2] = arg0.method219();
		}
	}

	@ObfuscatedName("ISLGIOFS.a(I)V")
	public final void method297() {
		field754 = 0;
		field755 = 0;
		field756 = 0;
		field757 = 0;
		field758 = 0;
	}

	@ObfuscatedName("ISLGIOFS.a(II)I")
	public final int method298(int arg0) {
		if (field758 >= field754) {
			field757 = field750[field755++] << 15;

			if (field755 >= field748) {
				field755 = field748 - 1;
			}

			field754 = (int) (field749[field755] / 65536.0D * arg0);
			if (field754 > field758) {
				field756 = ((field750[field755] << 15) - field757) / (field754 - field758);
			}
		}

		field757 += field756;
		field758++;
		return field757 - field756 >> 15;
	}
}
