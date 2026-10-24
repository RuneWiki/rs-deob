package deob;

@ObfuscatedName("DBHOKPMQ")
public abstract class DBHOKPMQ extends TFGCPINZ {

	@ObfuscatedName("DBHOKPMQ.x")
	public int field524 = -1;

	@ObfuscatedName("DBHOKPMQ.y")
	public int field525 = -1;

	@ObfuscatedName("DBHOKPMQ.z")
	public int field526 = -1;

	@ObfuscatedName("DBHOKPMQ.A")
	public int field527 = -1;

	@ObfuscatedName("DBHOKPMQ.C")
	public int field529 = -1;

	@ObfuscatedName("DBHOKPMQ.I")
	public int field535 = -1;

	@ObfuscatedName("DBHOKPMQ.J")
	public int field536 = -1;

	@ObfuscatedName("DBHOKPMQ.K")
	public int[] field537 = new int[10];

	@ObfuscatedName("DBHOKPMQ.L")
	public int[] field538 = new int[10];

	@ObfuscatedName("DBHOKPMQ.M")
	public int field539 = 32;

	@ObfuscatedName("DBHOKPMQ.O")
	public int field541 = 200;

	@ObfuscatedName("DBHOKPMQ.P")
	public boolean[] field542 = new boolean[10];

	@ObfuscatedName("DBHOKPMQ.Q")
	public int field543 = -1;

	@ObfuscatedName("DBHOKPMQ.Y")
	public int field551 = -1000;

	@ObfuscatedName("DBHOKPMQ.bb")
	public int field554 = -1;

	@ObfuscatedName("DBHOKPMQ.db")
	public int[] field556 = new int[4];

	@ObfuscatedName("DBHOKPMQ.eb")
	public int[] field557 = new int[4];

	@ObfuscatedName("DBHOKPMQ.fb")
	public int[] field558 = new int[4];

	@ObfuscatedName("DBHOKPMQ.gb")
	public int field559 = 100;

	@ObfuscatedName("DBHOKPMQ.ib")
	public int field561 = 1;

	@ObfuscatedName("DBHOKPMQ.jb")
	public int field562 = -1;

	@ObfuscatedName("DBHOKPMQ.ob")
	public int field566 = -1;

	@ObfuscatedName("DBHOKPMQ.qb")
	public boolean field568 = false;

	@ObfuscatedName("DBHOKPMQ.n")
	public int field514;

	@ObfuscatedName("DBHOKPMQ.o")
	public int field515;

	@ObfuscatedName("DBHOKPMQ.p")
	public int field516;

	@ObfuscatedName("DBHOKPMQ.q")
	public int field517;

	@ObfuscatedName("DBHOKPMQ.r")
	public int field518;

	@ObfuscatedName("DBHOKPMQ.s")
	public int field519;

	@ObfuscatedName("DBHOKPMQ.t")
	public int field520;

	@ObfuscatedName("DBHOKPMQ.u")
	public int field521;

	@ObfuscatedName("DBHOKPMQ.v")
	public int field522;

	@ObfuscatedName("DBHOKPMQ.w")
	public int field523;

	@ObfuscatedName("DBHOKPMQ.B")
	public int field528;

	@ObfuscatedName("DBHOKPMQ.D")
	public int field530;

	@ObfuscatedName("DBHOKPMQ.E")
	public int field531;

	@ObfuscatedName("DBHOKPMQ.F")
	public int field532;

	@ObfuscatedName("DBHOKPMQ.G")
	public int field533;

	@ObfuscatedName("DBHOKPMQ.N")
	public int field540;

	@ObfuscatedName("DBHOKPMQ.R")
	public int field544;

	@ObfuscatedName("DBHOKPMQ.S")
	public int field545;

	@ObfuscatedName("DBHOKPMQ.T")
	public int field546;

	@ObfuscatedName("DBHOKPMQ.U")
	public int field547;

	@ObfuscatedName("DBHOKPMQ.V")
	public int field548;

	@ObfuscatedName("DBHOKPMQ.W")
	public int field549;

	@ObfuscatedName("DBHOKPMQ.X")
	public int field550;

	@ObfuscatedName("DBHOKPMQ.Z")
	public int field552;

	@ObfuscatedName("DBHOKPMQ.ab")
	public int field553;

	@ObfuscatedName("DBHOKPMQ.cb")
	public int field555;

	@ObfuscatedName("DBHOKPMQ.hb")
	public int field560;

	@ObfuscatedName("DBHOKPMQ.kb")
	public int field563;

	@ObfuscatedName("DBHOKPMQ.lb")
	public int field564;

	@ObfuscatedName("DBHOKPMQ.mb")
	public int field565;

	@ObfuscatedName("DBHOKPMQ.pb")
	public int field567;

	@ObfuscatedName("DBHOKPMQ.H")
	public String field534;

	@ObfuscatedName("DBHOKPMQ.b(B)V")
	public final void method200() {
		field523 = 0;
		field540 = 0;
	}

	@ObfuscatedName("DBHOKPMQ.a(IIZ)V")
	public final void method201(int arg0, boolean arg1) {
		int var3 = field537[0];
		int var4 = field538[0];
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

		if (field543 != -1 && XTKQUJNF.field1432[field543].field1445 == 1) {
			field543 = -1;
		}

		if (field523 < 9) {
			field523++;
		}

		for (int var5 = field523; var5 > 0; var5--) {
			field537[var5] = field537[var5 - 1];
			field538[var5] = field538[var5 - 1];
			field542[var5] = field542[var5 - 1];
		}

		field537[0] = var3;
		field538[0] = var4;
		field542[0] = arg1;
	}

	@ObfuscatedName("DBHOKPMQ.a(IIIZ)V")
	public final void method202(int arg0, int arg1, boolean arg2) {
		if (field543 != -1 && XTKQUJNF.field1432[field543].field1445 == 1) {
			field543 = -1;
		}

		if (!arg2) {
			int var4 = arg0 - field537[0];
			int var5 = arg1 - field538[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field523 < 9) {
					field523++;
				}

				for (int var6 = field523; var6 > 0; var6--) {
					field537[var6] = field537[var6 - 1];
					field538[var6] = field538[var6 - 1];
					field542[var6] = field542[var6 - 1];
				}

				field537[0] = arg0;
				field538[0] = arg1;
				field542[0] = false;
				return;
			}
		}

		field523 = 0;
		field540 = 0;
		field555 = 0;
		field537[0] = arg0;
		field538[0] = arg1;
		field548 = field537[0] * 128 + field561 * 64;
		field549 = field538[0] * 128 + field561 * 64;
	}

	@ObfuscatedName("DBHOKPMQ.a(I)Z")
	public boolean method203() {
		return false;
	}

	@ObfuscatedName("DBHOKPMQ.a(IZII)V")
	public final void method204(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field558[var4] <= arg0) {
				field556[var4] = arg2;
				field557[var4] = arg1;
				field558[var4] = arg0 + 70;
				return;
			}
		}
	}
}
