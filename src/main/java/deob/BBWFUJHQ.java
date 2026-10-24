package deob;

@ObfuscatedName("BBWFUJHQ")
public abstract class BBWFUJHQ extends AOBGXKOU {

	@ObfuscatedName("BBWFUJHQ.n")
	public boolean field29 = false;

	@ObfuscatedName("BBWFUJHQ.o")
	public int field30 = 1;

	@ObfuscatedName("BBWFUJHQ.p")
	public int field31 = -1;

	@ObfuscatedName("BBWFUJHQ.u")
	public int field36 = -1;

	@ObfuscatedName("BBWFUJHQ.w")
	public int[] field38 = new int[4];

	@ObfuscatedName("BBWFUJHQ.x")
	public int[] field39 = new int[4];

	@ObfuscatedName("BBWFUJHQ.y")
	public int[] field40 = new int[4];

	@ObfuscatedName("BBWFUJHQ.F")
	public int field47 = 200;

	@ObfuscatedName("BBWFUJHQ.G")
	public int field48 = 100;

	@ObfuscatedName("BBWFUJHQ.P")
	public int field57 = -1;

	@ObfuscatedName("BBWFUJHQ.S")
	public int field60 = 32;

	@ObfuscatedName("BBWFUJHQ.U")
	public boolean[] field61 = new boolean[10];

	@ObfuscatedName("BBWFUJHQ.V")
	public int field62 = -1;

	@ObfuscatedName("BBWFUJHQ.W")
	public int field63 = -1;

	@ObfuscatedName("BBWFUJHQ.X")
	public int field64 = -1;

	@ObfuscatedName("BBWFUJHQ.Y")
	public int field65 = -1;

	@ObfuscatedName("BBWFUJHQ.eb")
	public int field70 = -1;

	@ObfuscatedName("BBWFUJHQ.jb")
	public int[] field75 = new int[10];

	@ObfuscatedName("BBWFUJHQ.kb")
	public int[] field76 = new int[10];

	@ObfuscatedName("BBWFUJHQ.lb")
	public int field77 = -1;

	@ObfuscatedName("BBWFUJHQ.mb")
	public int field78 = -1;

	@ObfuscatedName("BBWFUJHQ.nb")
	public int field79 = -1;

	@ObfuscatedName("BBWFUJHQ.ob")
	public int field80 = -1000;

	@ObfuscatedName("BBWFUJHQ.q")
	public int field32;

	@ObfuscatedName("BBWFUJHQ.r")
	public int field33;

	@ObfuscatedName("BBWFUJHQ.s")
	public int field34;

	@ObfuscatedName("BBWFUJHQ.t")
	public int field35;

	@ObfuscatedName("BBWFUJHQ.v")
	public int field37;

	@ObfuscatedName("BBWFUJHQ.z")
	public int field41;

	@ObfuscatedName("BBWFUJHQ.A")
	public int field42;

	@ObfuscatedName("BBWFUJHQ.B")
	public int field43;

	@ObfuscatedName("BBWFUJHQ.C")
	public int field44;

	@ObfuscatedName("BBWFUJHQ.D")
	public int field45;

	@ObfuscatedName("BBWFUJHQ.E")
	public int field46;

	@ObfuscatedName("BBWFUJHQ.H")
	public int field49;

	@ObfuscatedName("BBWFUJHQ.I")
	public int field50;

	@ObfuscatedName("BBWFUJHQ.J")
	public int field51;

	@ObfuscatedName("BBWFUJHQ.K")
	public int field52;

	@ObfuscatedName("BBWFUJHQ.L")
	public int field53;

	@ObfuscatedName("BBWFUJHQ.M")
	public int field54;

	@ObfuscatedName("BBWFUJHQ.N")
	public int field55;

	@ObfuscatedName("BBWFUJHQ.O")
	public int field56;

	@ObfuscatedName("BBWFUJHQ.Q")
	public int field58;

	@ObfuscatedName("BBWFUJHQ.R")
	public int field59;

	@ObfuscatedName("BBWFUJHQ.ab")
	public int field67;

	@ObfuscatedName("BBWFUJHQ.cb")
	public int field68;

	@ObfuscatedName("BBWFUJHQ.db")
	public int field69;

	@ObfuscatedName("BBWFUJHQ.fb")
	public int field71;

	@ObfuscatedName("BBWFUJHQ.gb")
	public int field72;

	@ObfuscatedName("BBWFUJHQ.hb")
	public int field73;

	@ObfuscatedName("BBWFUJHQ.ib")
	public int field74;

	@ObfuscatedName("BBWFUJHQ.pb")
	public int field81;

	@ObfuscatedName("BBWFUJHQ.qb")
	public int field82;

	@ObfuscatedName("BBWFUJHQ.rb")
	public int field83;

	@ObfuscatedName("BBWFUJHQ.Z")
	public String field66;

	@ObfuscatedName("BBWFUJHQ.a(I)V")
	public final void method17() {
		field67 = 0;
		field49 = 0;
	}

	@ObfuscatedName("BBWFUJHQ.a(IIII)V")
	public final void method18(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field40[var4] <= arg1) {
				field38[var4] = arg2;
				field39[var4] = arg0;
				field40[var4] = arg1 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("BBWFUJHQ.a(IZII)V")
	public final void method19(int arg0, boolean arg1, int arg2) {
		if (field31 != -1 && ZKWMIVTX.field1461[field31].field1474 == 1) {
			field31 = -1;
		}

		if (!arg1) {
			int var4 = arg0 - field75[0];
			int var5 = arg2 - field76[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field67 < 9) {
					field67++;
				}

				for (int var6 = field67; var6 > 0; var6--) {
					field75[var6] = field75[var6 - 1];
					field76[var6] = field76[var6 - 1];
					field61[var6] = field61[var6 - 1];
				}

				field75[0] = arg0;
				field76[0] = arg2;
				field61[0] = false;
				return;
			}
		}

		field67 = 0;
		field49 = 0;
		field37 = 0;
		field75[0] = arg0;
		field76[0] = arg2;
		field41 = field75[0] * 128 + field30 * 64;
		field42 = field76[0] * 128 + field30 * 64;
	}

	@ObfuscatedName("BBWFUJHQ.a(ZIB)V")
	public final void method20(boolean arg0, int arg1) {
		int var3 = field75[0];
		int var4 = field76[0];
		if (arg1 == 0) {
			var3--;
			var4++;
		}

		if (arg1 == 1) {
			var4++;
		}

		if (arg1 == 2) {
			var3++;
			var4++;
		}

		if (arg1 == 3) {
			var3--;
		}

		if (arg1 == 4) {
			var3++;
		}

		if (arg1 == 5) {
			var3--;
			var4--;
		}

		if (arg1 == 6) {
			var4--;
		}

		if (arg1 == 7) {
			var3++;
			var4--;
		}

		if (field31 != -1 && ZKWMIVTX.field1461[field31].field1474 == 1) {
			field31 = -1;
		}

		if (field67 < 9) {
			field67++;
		}

		for (int var5 = field67; var5 > 0; var5--) {
			field75[var5] = field75[var5 - 1];
			field76[var5] = field76[var5 - 1];
			field61[var5] = field61[var5 - 1];
		}

		field75[0] = var3;
		field76[0] = var4;
		field61[0] = arg0;
	}

	@ObfuscatedName("BBWFUJHQ.b(I)Z")
	public boolean method21() {
		return false;
	}
}
