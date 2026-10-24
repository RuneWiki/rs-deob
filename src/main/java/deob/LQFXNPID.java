package deob;

@ObfuscatedName("LQFXNPID")
public final class LQFXNPID extends HTDIJKWW {

	@ObfuscatedName("LQFXNPID.n")
	public boolean field886 = false;

	@ObfuscatedName("LQFXNPID.t")
	public QUXKFXEA field891;

	@ObfuscatedName("LQFXNPID.o")
	public int field887;

	@ObfuscatedName("LQFXNPID.p")
	public int field888;

	@ObfuscatedName("LQFXNPID.q")
	public int field889;

	@ObfuscatedName("LQFXNPID.r")
	public int field890;

	@ObfuscatedName("LQFXNPID.k")
	public int field883;

	@ObfuscatedName("LQFXNPID.l")
	public int field884;

	@ObfuscatedName("LQFXNPID.m")
	public int field885;

	public LQFXNPID(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field891 = QUXKFXEA.field1148[arg5];
		field887 = arg0;
		field888 = arg3;
		field889 = arg6;
		field890 = arg1;
		field883 = arg2 + arg4;
		field886 = false;
	}

	@ObfuscatedName("LQFXNPID.a(IB)V")
	public final void method282(int arg0) {
		field885 += arg0;
		while (field885 > field891.field1152.method280(field884)) {
			field885 -= field891.field1152.method280(field884) + 1;
			field884++;
			if (field884 >= field891.field1152.field868 && (field884 < 0 || field884 >= field891.field1152.field868)) {
				field884 = 0;
				field886 = true;
			}
		}
	}

	@ObfuscatedName("LQFXNPID.a(I)LKDWDYCIL;")
	public final KDWDYCIL method185() {
		KDWDYCIL var1 = field891.method413();
		if (var1 == null) {
			return null;
		}

		int var2 = field891.field1152.field869[field884];
		KDWDYCIL var3 = new KDWDYCIL(false, var1, SGSYCWFB.method423(var2), true);
		if (!field886) {
			var3.method253();
			var3.method254(var2);
			var3.field797 = null;
			var3.field796 = null;
		}

		if (field891.field1155 != 128 || field891.field1156 != 128) {
			var3.method262(field891.field1155, field891.field1155, field891.field1156);
		}

		if (field891.field1157 != 0) {
			if (field891.field1157 == 90) {
				var3.method257();
			}

			if (field891.field1157 == 180) {
				var3.method257();
				var3.method257();
			}

			if (field891.field1157 == 270) {
				var3.method257();
				var3.method257();
				var3.method257();
			}
		}

		var3.method263(field891.field1158 + 64, field891.field1159 + 850, -30, -50, -30, true);
		return var3;
	}
}
