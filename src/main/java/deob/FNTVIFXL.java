package deob;

@ObfuscatedName("FNTVIFXL")
public final class FNTVIFXL extends TFGCPINZ {

	@ObfuscatedName("FNTVIFXL.r")
	public boolean field662 = false;

	@ObfuscatedName("FNTVIFXL.t")
	public EBBSHPSJ field663;

	@ObfuscatedName("FNTVIFXL.n")
	public int field658;

	@ObfuscatedName("FNTVIFXL.o")
	public int field659;

	@ObfuscatedName("FNTVIFXL.p")
	public int field660;

	@ObfuscatedName("FNTVIFXL.q")
	public int field661;

	@ObfuscatedName("FNTVIFXL.m")
	public int field657;

	@ObfuscatedName("FNTVIFXL.u")
	public int field664;

	@ObfuscatedName("FNTVIFXL.v")
	public int field665;

	@ObfuscatedName("FNTVIFXL.a(II)V")
	public final void method213(int arg0) {
		field665 += arg0;
		while (field665 > field663.field613.method532(field664)) {
			field665 -= field663.field613.method532(field664);
			field664++;
			if (field664 >= field663.field613.field1433 && (field664 < 0 || field664 >= field663.field613.field1433)) {
				field664 = 0;
				field662 = true;
			}
		}
	}

	@ObfuscatedName("FNTVIFXL.a(B)LJJMVUSJJ;")
	public final JJMVUSJJ method214() {
		JJMVUSJJ var1 = field663.method210();
		if (var1 == null) {
			return null;
		}

		int var2 = field663.field613.field1434[field664];
		JJMVUSJJ var3 = new JJMVUSJJ(true, OJYMITMR.method382(var2), false, var1);
		if (!field662) {
			var3.method307();
			var3.method308(var2);
			var3.field834 = null;
			var3.field833 = null;
		}

		if (field663.field616 != 128 || field663.field617 != 128) {
			var3.method316(field663.field617, field663.field616, field663.field616);
		}

		if (field663.field618 != 0) {
			if (field663.field618 == 90) {
				var3.method311();
			}

			if (field663.field618 == 180) {
				var3.method311();
				var3.method311();
			}

			if (field663.field618 == 270) {
				var3.method311();
				var3.method311();
				var3.method311();
			}
		}

		var3.method317(field663.field619 + 64, field663.field620 + 850, -30, -50, -30, true);
		return var3;
	}

	public FNTVIFXL(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field663 = EBBSHPSJ.field609[arg1];
		field658 = arg2;
		field659 = arg5;
		field660 = arg3;
		field661 = arg0;
		field657 = arg4 + arg6;
		field662 = false;
	}
}
