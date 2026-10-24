package deob;

@ObfuscatedName("JQLDEMYI")
public final class JQLDEMYI extends NSRXNXHB {

	@ObfuscatedName("JQLDEMYI.w")
	public boolean field768 = false;

	@ObfuscatedName("JQLDEMYI.r")
	public VSBOWDVL field763;

	@ObfuscatedName("JQLDEMYI.s")
	public int field764;

	@ObfuscatedName("JQLDEMYI.t")
	public int field765;

	@ObfuscatedName("JQLDEMYI.u")
	public int field766;

	@ObfuscatedName("JQLDEMYI.v")
	public int field767;

	@ObfuscatedName("JQLDEMYI.m")
	public int field760;

	@ObfuscatedName("JQLDEMYI.o")
	public int field761;

	@ObfuscatedName("JQLDEMYI.p")
	public int field762;

	public JQLDEMYI(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field763 = VSBOWDVL.field1380[arg3];
		field764 = arg4;
		field765 = arg5;
		field766 = arg6;
		field767 = arg0;
		field760 = arg1 + arg2;
		field768 = false;
	}

	@ObfuscatedName("JQLDEMYI.a(II)V")
	public final void method300(int arg0) {
		field762 += arg0;
		while (field762 > field763.field1384.method277(field761)) {
			field762 -= field763.field1384.method277(field761) + 1;
			field761++;
			if (field761 >= field763.field1384.field721 && (field761 < 0 || field761 >= field763.field1384.field721)) {
				field761 = 0;
				field768 = true;
			}
		}
	}

	@ObfuscatedName("JQLDEMYI.a(I)LFUTAQMCE;")
	public final FUTAQMCE method2() {
		FUTAQMCE var1 = field763.method519();
		if (var1 == null) {
			return null;
		}

		int var2 = field763.field1384.field722[field761];
		FUTAQMCE var3 = new FUTAQMCE(var1, false, true, RYVJCVCB.method428(var2));
		if (!field768) {
			var3.method257();
			var3.method258(var2);
			var3.field670 = null;
			var3.field669 = null;
		}

		if (field763.field1387 != 128 || field763.field1388 != 128) {
			var3.method266(field763.field1387, field763.field1388, field763.field1387);
		}

		if (field763.field1389 != 0) {
			if (field763.field1389 == 90) {
				var3.method261();
			}

			if (field763.field1389 == 180) {
				var3.method261();
				var3.method261();
			}

			if (field763.field1389 == 270) {
				var3.method261();
				var3.method261();
				var3.method261();
			}
		}

		var3.method267(field763.field1390 + 64, field763.field1391 + 850, -30, -50, -30, true);
		return var3;
	}
}
