package deob;

@ObfuscatedName("ROWJKVEC")
public final class ROWJKVEC extends IWSGBTLV {

	@ObfuscatedName("ROWJKVEC.r")
	public boolean field1207 = false;

	@ObfuscatedName("ROWJKVEC.x")
	public XWNROHZR field1212;

	@ObfuscatedName("ROWJKVEC.s")
	public int field1208;

	@ObfuscatedName("ROWJKVEC.t")
	public int field1209;

	@ObfuscatedName("ROWJKVEC.u")
	public int field1210;

	@ObfuscatedName("ROWJKVEC.v")
	public int field1211;

	@ObfuscatedName("ROWJKVEC.n")
	public int field1204;

	@ObfuscatedName("ROWJKVEC.p")
	public int field1205;

	@ObfuscatedName("ROWJKVEC.q")
	public int field1206;

	@ObfuscatedName("ROWJKVEC.a(II)V")
	public final void method445(int arg0) {
		field1206 += arg0;
		while (field1206 > field1212.field1443.method562(field1205)) {
			field1206 -= field1212.field1443.method562(field1205) + 1;
			field1205++;
			if (field1205 >= field1212.field1443.field1358 && (field1205 < 0 || field1205 >= field1212.field1443.field1358)) {
				field1205 = 0;
				field1207 = true;
			}
		}
	}

	public ROWJKVEC(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field1212 = XWNROHZR.field1439[arg3];
		field1208 = arg4;
		field1209 = arg6;
		field1210 = arg1;
		field1211 = arg2;
		field1204 = arg0 + arg5;
		field1207 = false;
	}

	@ObfuscatedName("ROWJKVEC.a(I)LCADBNSXE;")
	public final CADBNSXE method40() {
		CADBNSXE var1 = field1212.method589();
		if (var1 == null) {
			return null;
		}

		int var2 = field1212.field1443.field1359[field1205];
		CADBNSXE var3 = new CADBNSXE(false, DFGNFGZH.method215(var2), var1, true);
		if (!field1207) {
			var3.method18();
			var3.method19(var2);
			var3.field48 = null;
			var3.field47 = null;
		}

		if (field1212.field1446 != 128 || field1212.field1447 != 128) {
			var3.method27(field1212.field1446, field1212.field1447, field1212.field1446);
		}

		if (field1212.field1448 != 0) {
			if (field1212.field1448 == 90) {
				var3.method22();
			}

			if (field1212.field1448 == 180) {
				var3.method22();
				var3.method22();
			}

			if (field1212.field1448 == 270) {
				var3.method22();
				var3.method22();
				var3.method22();
			}
		}

		var3.method28(field1212.field1449 + 64, field1212.field1450 + 850, -30, -50, -30, true);
		return var3;
	}
}
