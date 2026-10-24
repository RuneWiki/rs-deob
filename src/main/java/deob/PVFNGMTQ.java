package deob;

@ObfuscatedName("PVFNGMTQ")
public final class PVFNGMTQ extends CELKGLWS {

	@ObfuscatedName("PVFNGMTQ.vb")
	public PJGEBWSY field1245;

	@ObfuscatedName("PVFNGMTQ.b(I)Z")
	public final boolean method42() {
		if (field1245 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("PVFNGMTQ.a(I)LFCIDIKVY;")
	public final FCIDIKVY method187() {
		if (field1245 == null) {
			return null;
		}

		FCIDIKVY var1 = method397();
		if (var1 == null) {
			return null;
		}

		field190 = var1.field660;

		if (field165 != -1 && field166 != -1) {
			XBHNZKGU var2 = XBHNZKGU.field1435[field165];
			FCIDIKVY var3 = var2.method563();
			if (var3 != null) {
				int var4 = var2.field1439.field1476[field166];
				FCIDIKVY var5 = new FCIDIKVY(false, FGGKJQKK.method235(var4), var3, true);
				var5.method212(0, -field169, 0);
				var5.method206();
				var5.method207(var4);
				var5.field716 = null;
				var5.field715 = null;

				if (var2.field1442 != 128 || var2.field1443 != 128) {
					var5.method215(var2.field1442, var2.field1442, var2.field1443);
				}

				var5.method216(var2.field1445 + 64, var2.field1446 + 850, -30, -50, -30, true);
				FCIDIKVY[] var6 = new FCIDIKVY[] { var1, var5 };
				var1 = new FCIDIKVY(true, var6, 2);
			}
		}

		if (field1245.field1229 == 1) {
			var1.field717 = true;
		}

		return var1;
	}

	@ObfuscatedName("PVFNGMTQ.a(B)LFCIDIKVY;")
	public final FCIDIKVY method397() {
		if (field183 < 0 || field186 != 0) {
			int var3 = -1;
			if (field145 >= 0) {
				var3 = XETSOHUA.field1474[field145].field1476[field146];
			}

			return field1245.method396(null, var3, -1);
		}

		int var1 = XETSOHUA.field1474[field183].field1476[field184];
		int var2 = -1;
		if (field145 >= 0 && field195 != field145) {
			var2 = XETSOHUA.field1474[field145].field1476[field146];
		}

		return field1245.method396(XETSOHUA.field1474[field183].field1480, var1, var2);
	}
}
