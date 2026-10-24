package deob;

@ObfuscatedName("GRLQOIQT")
public final class GRLQOIQT extends BBIXHJOC {

	@ObfuscatedName("GRLQOIQT.o")
	public boolean field641 = false;

	@ObfuscatedName("GRLQOIQT.n")
	public MKJLFPRH field640;

	@ObfuscatedName("GRLQOIQT.p")
	public int field642;

	@ObfuscatedName("GRLQOIQT.q")
	public int field643;

	@ObfuscatedName("GRLQOIQT.r")
	public int field644;

	@ObfuscatedName("GRLQOIQT.s")
	public int field645;

	@ObfuscatedName("GRLQOIQT.m")
	public int field639;

	@ObfuscatedName("GRLQOIQT.t")
	public int field646;

	@ObfuscatedName("GRLQOIQT.u")
	public int field647;

	public GRLQOIQT(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field640 = MKJLFPRH.field1051[arg0];
		field642 = arg2;
		field643 = arg3;
		field644 = arg1;
		field645 = arg4;
		field639 = arg5 + arg6;
		field641 = false;
	}

	@ObfuscatedName("GRLQOIQT.a(I)LJLNSJQDR;")
	public final JLNSJQDR method2() {
		JLNSJQDR var1 = field640.method423();
		if (var1 == null) {
			return null;
		}

		int var2 = field640.field1055.field1154[field646];
		JLNSJQDR var3 = new JLNSJQDR(UIZESDZR.method524(var2), false, true, var1);
		if (!field641) {
			var3.method335();
			var3.method336(var2);
			var3.field854 = null;
			var3.field853 = null;
		}

		if (field640.field1058 != 128 || field640.field1059 != 128) {
			var3.method344(field640.field1058, field640.field1059, field640.field1058);
		}

		if (field640.field1060 != 0) {
			if (field640.field1060 == 90) {
				var3.method339();
			}

			if (field640.field1060 == 180) {
				var3.method339();
				var3.method339();
			}

			if (field640.field1060 == 270) {
				var3.method339();
				var3.method339();
				var3.method339();
			}
		}

		var3.method345(field640.field1061 + 64, field640.field1062 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("GRLQOIQT.a(BI)V")
	public final void method241(int arg0) {
		field647 += arg0;
		while (field647 > field640.field1055.method457(field646)) {
			field647 -= field640.field1055.method457(field646) + 1;
			field646++;
			if (field646 >= field640.field1055.field1153 && (field646 < 0 || field646 >= field640.field1055.field1153)) {
				field646 = 0;
				field641 = true;
			}
		}
	}
}
