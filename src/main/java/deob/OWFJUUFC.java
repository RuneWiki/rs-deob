package deob;

@ObfuscatedName("OWFJUUFC")
public final class OWFJUUFC {

	@ObfuscatedName("OWFJUUFC.e")
	public int field1049;

	@ObfuscatedName("OWFJUUFC.f")
	public LXNKZOGX[] field1050;

	public OWFJUUFC(int arg0) {
		field1049 = arg0;
		field1050 = new LXNKZOGX[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			LXNKZOGX var3 = field1050[var2] = new LXNKZOGX();
			var3.field881 = var3;
			var3.field882 = var3;
		}
	}

	@ObfuscatedName("OWFJUUFC.a(J)LLXNKZOGX;")
	public LXNKZOGX method378(long arg0) {
		LXNKZOGX var3 = field1050[(int) (arg0 & field1049 - 1)];
		for (LXNKZOGX var4 = var3.field881; var4 != var3; var4 = var4.field881) {
			if (var4.field880 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("OWFJUUFC.a(JLLXNKZOGX;I)V")
	public void method379(long arg0, LXNKZOGX arg1) {
		if (arg1.field882 != null) {
			arg1.method331();
		}

		LXNKZOGX var4 = field1050[(int) (arg0 & field1049 - 1)];
		arg1.field882 = var4.field882;
		arg1.field881 = var4;
		arg1.field882.field881 = arg1;
		arg1.field881.field882 = arg1;
		arg1.field880 = arg0;
	}
}
