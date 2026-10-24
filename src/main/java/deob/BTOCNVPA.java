package deob;

@ObfuscatedName("BTOCNVPA")
public abstract class BTOCNVPA extends XEUTUWWF {

	@ObfuscatedName("BTOCNVPA.l")
	public boolean[] field44 = new boolean[10];

	@ObfuscatedName("BTOCNVPA.m")
	public int field45 = -1;

	@ObfuscatedName("BTOCNVPA.p")
	public int field48 = -1000;

	@ObfuscatedName("BTOCNVPA.s")
	public int field51 = -1;

	@ObfuscatedName("BTOCNVPA.t")
	public int field52 = -1;

	@ObfuscatedName("BTOCNVPA.u")
	public int field53 = -1;

	@ObfuscatedName("BTOCNVPA.v")
	public int field54 = -1;

	@ObfuscatedName("BTOCNVPA.w")
	public int field55 = -1;

	@ObfuscatedName("BTOCNVPA.C")
	public boolean field61 = false;

	@ObfuscatedName("BTOCNVPA.D")
	public int field62 = -1;

	@ObfuscatedName("BTOCNVPA.E")
	public int field63 = -1;

	@ObfuscatedName("BTOCNVPA.F")
	public int field64 = 1;

	@ObfuscatedName("BTOCNVPA.G")
	public int field65 = -1;

	@ObfuscatedName("BTOCNVPA.J")
	public int field68 = 100;

	@ObfuscatedName("BTOCNVPA.V")
	public int field78 = 200;

	@ObfuscatedName("BTOCNVPA.W")
	public int field79 = 32;

	@ObfuscatedName("BTOCNVPA.Z")
	public int[] field82 = new int[10];

	@ObfuscatedName("BTOCNVPA.ab")
	public int[] field83 = new int[10];

	@ObfuscatedName("BTOCNVPA.bb")
	public int field84 = -1;

	@ObfuscatedName("BTOCNVPA.hb")
	public int[] field90 = new int[4];

	@ObfuscatedName("BTOCNVPA.ib")
	public int[] field91 = new int[4];

	@ObfuscatedName("BTOCNVPA.jb")
	public int[] field92 = new int[4];

	@ObfuscatedName("BTOCNVPA.lb")
	public int field94 = -1;

	@ObfuscatedName("BTOCNVPA.n")
	public int field46;

	@ObfuscatedName("BTOCNVPA.o")
	public int field47;

	@ObfuscatedName("BTOCNVPA.q")
	public int field49;

	@ObfuscatedName("BTOCNVPA.r")
	public int field50;

	@ObfuscatedName("BTOCNVPA.x")
	public int field56;

	@ObfuscatedName("BTOCNVPA.y")
	public int field57;

	@ObfuscatedName("BTOCNVPA.z")
	public int field58;

	@ObfuscatedName("BTOCNVPA.A")
	public int field59;

	@ObfuscatedName("BTOCNVPA.B")
	public int field60;

	@ObfuscatedName("BTOCNVPA.H")
	public int field66;

	@ObfuscatedName("BTOCNVPA.I")
	public int field67;

	@ObfuscatedName("BTOCNVPA.L")
	public int field69;

	@ObfuscatedName("BTOCNVPA.N")
	public int field70;

	@ObfuscatedName("BTOCNVPA.O")
	public int field71;

	@ObfuscatedName("BTOCNVPA.P")
	public int field72;

	@ObfuscatedName("BTOCNVPA.Q")
	public int field73;

	@ObfuscatedName("BTOCNVPA.R")
	public int field74;

	@ObfuscatedName("BTOCNVPA.S")
	public int field75;

	@ObfuscatedName("BTOCNVPA.T")
	public int field76;

	@ObfuscatedName("BTOCNVPA.U")
	public int field77;

	@ObfuscatedName("BTOCNVPA.X")
	public int field80;

	@ObfuscatedName("BTOCNVPA.Y")
	public int field81;

	@ObfuscatedName("BTOCNVPA.cb")
	public int field85;

	@ObfuscatedName("BTOCNVPA.db")
	public int field86;

	@ObfuscatedName("BTOCNVPA.eb")
	public int field87;

	@ObfuscatedName("BTOCNVPA.fb")
	public int field88;

	@ObfuscatedName("BTOCNVPA.gb")
	public int field89;

	@ObfuscatedName("BTOCNVPA.mb")
	public int field95;

	@ObfuscatedName("BTOCNVPA.nb")
	public int field96;

	@ObfuscatedName("BTOCNVPA.ob")
	public int field97;

	@ObfuscatedName("BTOCNVPA.pb")
	public int field98;

	@ObfuscatedName("BTOCNVPA.kb")
	public String field93;

	@ObfuscatedName("BTOCNVPA.a(ZIZ)V")
	public final void method19(int arg0, boolean arg1) {
		int var3 = field82[0];
		int var4 = field83[0];
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

		if (field84 != -1 && ZGXCNUJM.field1481[field84].field1494 == 1) {
			field84 = -1;
		}

		if (field77 < 9) {
			field77++;
		}

		for (int var5 = field77; var5 > 0; var5--) {
			field82[var5] = field82[var5 - 1];
			field83[var5] = field83[var5 - 1];
			field44[var5] = field44[var5 - 1];
		}

		field82[0] = var3;
		field83[0] = var4;
		field44[0] = arg1;
	}

	@ObfuscatedName("BTOCNVPA.a(Z)Z")
	public boolean method20() {
		return false;
	}

	@ObfuscatedName("BTOCNVPA.b(B)V")
	public final void method21() {
		field77 = 0;
		field89 = 0;
	}

	@ObfuscatedName("BTOCNVPA.a(IIZI)V")
	public final void method22(int arg0, int arg1, boolean arg2) {
		if (field84 != -1 && ZGXCNUJM.field1481[field84].field1494 == 1) {
			field84 = -1;
		}

		if (!arg2) {
			int var4 = arg1 - field82[0];
			int var5 = arg0 - field83[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field77 < 9) {
					field77++;
				}

				for (int var6 = field77; var6 > 0; var6--) {
					field82[var6] = field82[var6 - 1];
					field83[var6] = field83[var6 - 1];
					field44[var6] = field44[var6 - 1];
				}

				field82[0] = arg1;
				field83[0] = arg0;
				field44[0] = false;
				return;
			}
		}

		field77 = 0;
		field89 = 0;
		field95 = 0;
		field82[0] = arg1;
		field83[0] = arg0;
		field96 = field82[0] * 128 + field64 * 64;
		field97 = field83[0] * 128 + field64 * 64;
	}

	@ObfuscatedName("BTOCNVPA.a(IIII)V")
	public final void method23(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field92[var4] <= arg2) {
				field90[var4] = arg1;
				field91[var4] = arg0;
				field92[var4] = arg2 + 70;
				return;
			}
		}
	}
}
