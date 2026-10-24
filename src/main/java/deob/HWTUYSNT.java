package deob;

@ObfuscatedName("HWTUYSNT")
public final class HWTUYSNT {

	@ObfuscatedName("HWTUYSNT.c")
	public int field748;

	@ObfuscatedName("HWTUYSNT.d")
	public JJVWTXNE[] field749;

	public HWTUYSNT(int arg0) {
		field748 = arg0;
		field749 = new JJVWTXNE[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			JJVWTXNE var3 = field749[var2] = new JJVWTXNE();
			var3.field865 = var3;
			var3.field866 = var3;
		}
	}

	@ObfuscatedName("HWTUYSNT.a(J)LJJVWTXNE;")
	public JJVWTXNE method303(long arg0) {
		JJVWTXNE var3 = field749[(int) (arg0 & field748 - 1)];
		for (JJVWTXNE var4 = var3.field865; var4 != var3; var4 = var4.field865) {
			if (var4.field864 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("HWTUYSNT.a(IJLJJVWTXNE;)V")
	public void method304(long arg0, JJVWTXNE arg1) {
		if (arg1.field866 != null) {
			arg1.method334();
		}

		JJVWTXNE var4 = field749[(int) (arg0 & field748 - 1)];
		arg1.field866 = var4.field866;
		arg1.field865 = var4;
		arg1.field866.field865 = arg1;
		arg1.field865.field866 = arg1;
		arg1.field864 = arg0;
	}
}
