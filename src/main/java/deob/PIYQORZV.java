package deob;

@ObfuscatedName("PIYQORZV")
public final class PIYQORZV extends ESLZGWKZ {

	@ObfuscatedName("PIYQORZV.s")
	public boolean field1152 = false;

	@ObfuscatedName("PIYQORZV.u")
	public YTBPTACV field1154;

	@ObfuscatedName("PIYQORZV.l")
	public int field1146;

	@ObfuscatedName("PIYQORZV.m")
	public int field1147;

	@ObfuscatedName("PIYQORZV.n")
	public int field1148;

	@ObfuscatedName("PIYQORZV.o")
	public int field1149;

	@ObfuscatedName("PIYQORZV.t")
	public int field1153;

	@ObfuscatedName("PIYQORZV.p")
	public int field1150;

	@ObfuscatedName("PIYQORZV.q")
	public int field1151;

	@ObfuscatedName("PIYQORZV.a(II)V")
	public final void method420(int arg0) {
		field1151 += arg0;
		while (field1151 > field1154.field1464.method275(field1150)) {
			field1151 -= field1154.field1464.method275(field1150) + 1;
			field1150++;
			if (field1150 >= field1154.field1464.field841 && (field1150 < 0 || field1150 >= field1154.field1464.field841)) {
				field1150 = 0;
				field1152 = true;
			}
		}
	}

	@ObfuscatedName("PIYQORZV.a(B)LDHUPIIUL;")
	public final DHUPIIUL method159() {
		DHUPIIUL var1 = field1154.method582();
		if (var1 == null) {
			return null;
		}

		int var2 = field1154.field1464.field842[field1150];
		DHUPIIUL var3 = new DHUPIIUL(var1, false, BWSGQYNU.method16(var2), true);
		if (!field1152) {
			var3.method198();
			var3.method199(var2);
			var3.field576 = null;
			var3.field575 = null;
		}

		if (field1154.field1467 != 128 || field1154.field1468 != 128) {
			var3.method207(field1154.field1467, field1154.field1468, field1154.field1467);
		}

		if (field1154.field1469 != 0) {
			if (field1154.field1469 == 90) {
				var3.method202();
			}

			if (field1154.field1469 == 180) {
				var3.method202();
				var3.method202();
			}

			if (field1154.field1469 == 270) {
				var3.method202();
				var3.method202();
				var3.method202();
			}
		}

		var3.method208(field1154.field1470 + 64, field1154.field1471 + 850, -30, -50, -30, true);
		return var3;
	}

	public PIYQORZV(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field1154 = YTBPTACV.field1460[arg0];
		field1146 = arg3;
		field1147 = arg4;
		field1148 = arg6;
		field1149 = arg1;
		field1153 = arg2 + arg5;
		field1152 = false;
	}
}
