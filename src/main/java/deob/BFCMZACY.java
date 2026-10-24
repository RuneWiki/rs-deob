package deob;

@ObfuscatedName("BFCMZACY")
public final class BFCMZACY extends HCCLTVPO {

	@ObfuscatedName("BFCMZACY.tb")
	public SHKUIFHF field8;

	@ObfuscatedName("BFCMZACY.a(B)LXBVYIDUH;")
	public final XBVYIDUH method39() {
		if (field8 == null) {
			return null;
		}

		XBVYIDUH var1 = method40();
		if (var1 == null) {
			return null;
		}

		field788 = var1.field878;

		if (field760 != -1 && field761 != -1) {
			CRSWMDQF var2 = CRSWMDQF.field543[field760];
			XBVYIDUH var3 = var2.method299();
			if (var3 != null) {
				int var4 = var2.field547.field1178[field761];
				XBVYIDUH var5 = new XBVYIDUH(BKYAWERN.method115(var4), true, false, var3);
				var5.method554(0, 0, -field764);
				var5.method548();
				var5.method549(var4);
				var5.field1384 = null;
				var5.field1383 = null;

				if (var2.field550 != 128 || var2.field551 != 128) {
					var5.method557(var2.field551, var2.field550, var2.field550);
				}

				var5.method558(var2.field553 + 64, var2.field554 + 850, -30, -50, -30, true);
				XBVYIDUH[] var6 = new XBVYIDUH[] { var1, var5 };
				var1 = new XBVYIDUH(true, 2, var6);
			}
		}

		if (field8.field1153 == 1) {
			var1.field1385 = true;
		}

		return var1;
	}

	@ObfuscatedName("BFCMZACY.b(Z)LXBVYIDUH;")
	public final XBVYIDUH method40() {
		if (field741 < 0 || field744 != 0) {
			int var3 = -1;
			if (field752 >= 0) {
				var3 = SPUHKLMC.field1176[field752].field1178[field753];
			}

			return field8.method502(-1, var3, null);
		}

		int var1 = SPUHKLMC.field1176[field741].field1178[field742];
		int var2 = -1;
		if (field752 >= 0 && field752 != field734) {
			var2 = SPUHKLMC.field1176[field752].field1178[field753];
		}

		return field8.method502(var2, var1, SPUHKLMC.field1176[field741].field1182);
	}

	@ObfuscatedName("BFCMZACY.a(I)Z")
	public final boolean method41() {
		if (field8 == null) {
			return false;
		}

		return true;
	}
}
