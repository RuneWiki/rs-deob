package deob;

@ObfuscatedName("FFLRYPKA")
public final class FFLRYPKA extends MODNYPGG {

	@ObfuscatedName("FFLRYPKA.r")
	public boolean field594 = false;

	@ObfuscatedName("FFLRYPKA.t")
	public FOXTQZWB field595;

	@ObfuscatedName("FFLRYPKA.u")
	public int field596;

	@ObfuscatedName("FFLRYPKA.v")
	public int field597;

	@ObfuscatedName("FFLRYPKA.w")
	public int field598;

	@ObfuscatedName("FFLRYPKA.x")
	public int field599;

	@ObfuscatedName("FFLRYPKA.q")
	public int field593;

	@ObfuscatedName("FFLRYPKA.y")
	public int field600;

	@ObfuscatedName("FFLRYPKA.z")
	public int field601;

	@ObfuscatedName("FFLRYPKA.a(I)LNGYJLUVS;")
	public final NGYJLUVS method206() {
		NGYJLUVS var1 = field595.method210();
		if (var1 == null) {
			return null;
		}

		int var2 = field595.field607.field744[field600];
		NGYJLUVS var3 = new NGYJLUVS(PHDJZMLE.method428(var2), true, var1, false);
		if (!field594) {
			var3.method298();
			var3.method299(var2);
			var3.field891 = null;
			var3.field890 = null;
		}

		if (field595.field610 != 128 || field595.field611 != 128) {
			var3.method307(field595.field610, field595.field610, field595.field611);
		}

		if (field595.field612 != 0) {
			if (field595.field612 == 90) {
				var3.method302();
			}

			if (field595.field612 == 180) {
				var3.method302();
				var3.method302();
			}

			if (field595.field612 == 270) {
				var3.method302();
				var3.method302();
				var3.method302();
			}
		}

		var3.method308(field595.field613 + 64, field595.field614 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("FFLRYPKA.a(IB)V")
	public final void method207(int arg0) {
		field601 += arg0;
		while (field601 > field595.field607.method240(field600)) {
			field601 -= field595.field607.method240(field600) + 1;
			field600++;
			if (field600 >= field595.field607.field743 && (field600 < 0 || field600 >= field595.field607.field743)) {
				field600 = 0;
				field594 = true;
			}
		}
	}

	public FFLRYPKA(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field595 = FOXTQZWB.field603[arg1];
		field596 = arg5;
		field597 = arg6;
		field598 = arg3;
		field599 = arg2;
		field593 = arg0 + arg4;
		field594 = false;
	}
}
