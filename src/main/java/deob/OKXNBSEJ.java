package deob;

@ObfuscatedName("OKXNBSEJ")
public abstract class OKXNBSEJ extends DVAULXJA {

	@ObfuscatedName("OKXNBSEJ.n")
	public int field912 = 200;

	@ObfuscatedName("OKXNBSEJ.o")
	public int[] field913 = new int[10];

	@ObfuscatedName("OKXNBSEJ.p")
	public int[] field914 = new int[10];

	@ObfuscatedName("OKXNBSEJ.q")
	public int field915 = -1;

	@ObfuscatedName("OKXNBSEJ.r")
	public int field916 = -1;

	@ObfuscatedName("OKXNBSEJ.s")
	public int field917 = -1;

	@ObfuscatedName("OKXNBSEJ.t")
	public int field918 = -1;

	@ObfuscatedName("OKXNBSEJ.u")
	public int field919 = -1;

	@ObfuscatedName("OKXNBSEJ.v")
	public int field920 = -1;

	@ObfuscatedName("OKXNBSEJ.w")
	public int field921 = -1;

	@ObfuscatedName("OKXNBSEJ.B")
	public int field926 = -1000;

	@ObfuscatedName("OKXNBSEJ.F")
	public boolean[] field930 = new boolean[10];

	@ObfuscatedName("OKXNBSEJ.G")
	public int field931 = 32;

	@ObfuscatedName("OKXNBSEJ.I")
	public int field932 = 100;

	@ObfuscatedName("OKXNBSEJ.L")
	public int field935 = -1;

	@ObfuscatedName("OKXNBSEJ.R")
	public int field941 = -1;

	@ObfuscatedName("OKXNBSEJ.S")
	public int field942 = -1;

	@ObfuscatedName("OKXNBSEJ.Y")
	public int field948 = 1;

	@ObfuscatedName("OKXNBSEJ.Z")
	public boolean field949 = false;

	@ObfuscatedName("OKXNBSEJ.ab")
	public int[] field950 = new int[4];

	@ObfuscatedName("OKXNBSEJ.bb")
	public int[] field951 = new int[4];

	@ObfuscatedName("OKXNBSEJ.cb")
	public int[] field952 = new int[4];

	@ObfuscatedName("OKXNBSEJ.gb")
	public int field955 = -1;

	@ObfuscatedName("OKXNBSEJ.x")
	public int field922;

	@ObfuscatedName("OKXNBSEJ.y")
	public int field923;

	@ObfuscatedName("OKXNBSEJ.z")
	public int field924;

	@ObfuscatedName("OKXNBSEJ.A")
	public int field925;

	@ObfuscatedName("OKXNBSEJ.C")
	public int field927;

	@ObfuscatedName("OKXNBSEJ.D")
	public int field928;

	@ObfuscatedName("OKXNBSEJ.E")
	public int field929;

	@ObfuscatedName("OKXNBSEJ.J")
	public int field933;

	@ObfuscatedName("OKXNBSEJ.K")
	public int field934;

	@ObfuscatedName("OKXNBSEJ.M")
	public int field936;

	@ObfuscatedName("OKXNBSEJ.N")
	public int field937;

	@ObfuscatedName("OKXNBSEJ.O")
	public int field938;

	@ObfuscatedName("OKXNBSEJ.P")
	public int field939;

	@ObfuscatedName("OKXNBSEJ.Q")
	public int field940;

	@ObfuscatedName("OKXNBSEJ.T")
	public int field943;

	@ObfuscatedName("OKXNBSEJ.U")
	public int field944;

	@ObfuscatedName("OKXNBSEJ.V")
	public int field945;

	@ObfuscatedName("OKXNBSEJ.W")
	public int field946;

	@ObfuscatedName("OKXNBSEJ.X")
	public int field947;

	@ObfuscatedName("OKXNBSEJ.eb")
	public int field954;

	@ObfuscatedName("OKXNBSEJ.hb")
	public int field956;

	@ObfuscatedName("OKXNBSEJ.ib")
	public int field957;

	@ObfuscatedName("OKXNBSEJ.jb")
	public int field958;

	@ObfuscatedName("OKXNBSEJ.kb")
	public int field959;

	@ObfuscatedName("OKXNBSEJ.lb")
	public int field960;

	@ObfuscatedName("OKXNBSEJ.mb")
	public int field961;

	@ObfuscatedName("OKXNBSEJ.nb")
	public int field962;

	@ObfuscatedName("OKXNBSEJ.ob")
	public int field963;

	@ObfuscatedName("OKXNBSEJ.pb")
	public int field964;

	@ObfuscatedName("OKXNBSEJ.qb")
	public int field965;

	@ObfuscatedName("OKXNBSEJ.rb")
	public int field966;

	@ObfuscatedName("OKXNBSEJ.db")
	public String field953;

	@ObfuscatedName("OKXNBSEJ.a(IZII)V")
	public final void method339(int arg0, boolean arg1, int arg2) {
		if (field942 != -1 && VYXELYSX.field1273[field942].field1286 == 1) {
			field942 = -1;
		}

		if (!arg1) {
			int var4 = arg2 - field913[0];
			int var5 = arg0 - field914[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field947 < 9) {
					field947++;
				}

				for (int var6 = field947; var6 > 0; var6--) {
					field913[var6] = field913[var6 - 1];
					field914[var6] = field914[var6 - 1];
					field930[var6] = field930[var6 - 1];
				}

				field913[0] = arg2;
				field914[0] = arg0;
				field930[0] = false;
				return;
			}
		}

		field947 = 0;
		field929 = 0;
		field934 = 0;
		field913[0] = arg2;
		field914[0] = arg0;
		field937 = field913[0] * 128 + field948 * 64;
		field938 = field914[0] * 128 + field948 * 64;
	}

	@ObfuscatedName("OKXNBSEJ.a(IIII)V")
	public final void method340(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field952[var4] <= arg2) {
				field950[var4] = arg0;
				field951[var4] = arg1;
				field952[var4] = arg2 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("OKXNBSEJ.b(I)V")
	public final void method341() {
		field947 = 0;
		field929 = 0;
	}

	@ObfuscatedName("OKXNBSEJ.a(Z)Z")
	public boolean method342() {
		return false;
	}

	@ObfuscatedName("OKXNBSEJ.a(IIZ)V")
	public final void method343(int arg0, boolean arg1) {
		int var3 = field913[0];
		int var4 = field914[0];
		if (arg0 == 0) {
			var3--;
			var4++;
		}

		if (arg0 == 1) {
			var4++;
		}

		if (arg0 == 2) {
			var3++;
			var4++;
		}

		if (arg0 == 3) {
			var3--;
		}

		if (arg0 == 4) {
			var3++;
		}

		if (arg0 == 5) {
			var3--;
			var4--;
		}

		if (arg0 == 6) {
			var4--;
		}

		if (arg0 == 7) {
			var3++;
			var4--;
		}

		if (field942 != -1 && VYXELYSX.field1273[field942].field1286 == 1) {
			field942 = -1;
		}

		if (field947 < 9) {
			field947++;
		}

		for (int var5 = field947; var5 > 0; var5--) {
			field913[var5] = field913[var5 - 1];
			field914[var5] = field914[var5 - 1];
			field930[var5] = field930[var5 - 1];
		}

		field913[0] = var3;
		field914[0] = var4;
		field930[0] = arg1;
	}
}
