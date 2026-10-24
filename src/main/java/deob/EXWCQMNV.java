package deob;

@ObfuscatedName("EXWCQMNV")
public final class EXWCQMNV extends BXTJETAB {

	@ObfuscatedName("EXWCQMNV.t")
	public boolean field617 = false;

	@ObfuscatedName("EXWCQMNV.r")
	public VCTVXSNH field615;

	@ObfuscatedName("EXWCQMNV.n")
	public int field611;

	@ObfuscatedName("EXWCQMNV.o")
	public int field612;

	@ObfuscatedName("EXWCQMNV.p")
	public int field613;

	@ObfuscatedName("EXWCQMNV.q")
	public int field614;

	@ObfuscatedName("EXWCQMNV.s")
	public int field616;

	@ObfuscatedName("EXWCQMNV.u")
	public int field618;

	@ObfuscatedName("EXWCQMNV.v")
	public int field619;

	@ObfuscatedName("EXWCQMNV.a(II)V")
	public final void method301(int arg0) {
		field619 += arg0;
		while (field619 > field615.field1352.method27(field618)) {
			field619 -= field615.field1352.method27(field618) + 1;
			field618++;
			if (field618 >= field615.field1352.field54 && (field618 < 0 || field618 >= field615.field1352.field54)) {
				field618 = 0;
				field617 = true;
			}
		}
	}

	@ObfuscatedName("EXWCQMNV.a(I)LIGXVZOHI;")
	public final IGXVZOHI method25() {
		IGXVZOHI var1 = field615.method555();
		if (var1 == null) {
			return null;
		}

		int var2 = field615.field1352.field55[field618];
		IGXVZOHI var3 = new IGXVZOHI(true, var1, false, ICYGYVTE.method349(var2));
		if (!field617) {
			var3.method361();
			var3.method362(var2);
			var3.field810 = null;
			var3.field809 = null;
		}

		if (field615.field1355 != 128 || field615.field1356 != 128) {
			var3.method370(field615.field1355, field615.field1356, field615.field1355);
		}

		if (field615.field1357 != 0) {
			if (field615.field1357 == 90) {
				var3.method365();
			}

			if (field615.field1357 == 180) {
				var3.method365();
				var3.method365();
			}

			if (field615.field1357 == 270) {
				var3.method365();
				var3.method365();
				var3.method365();
			}
		}

		var3.method371(field615.field1358 + 64, field615.field1359 + 850, -30, -50, -30, true);
		return var3;
	}

	public EXWCQMNV(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field615 = VCTVXSNH.field1348[arg0];
		field611 = arg3;
		field612 = arg5;
		field613 = arg6;
		field614 = arg2;
		field616 = arg1 + arg4;
		field617 = false;
	}
}
