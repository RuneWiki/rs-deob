package deob;

@ObfuscatedName("GYKYBIID")
public final class GYKYBIID extends JFHWDRLM {

	@ObfuscatedName("GYKYBIID.sb")
	public YANZSPIT field625;

	@ObfuscatedName("GYKYBIID.c(I)LKDWDYCIL;")
	public final KDWDYCIL method199() {
		if (field717 < 0 || field720 != 0) {
			int var3 = -1;
			if (field713 >= 0) {
				var3 = LMDSPIVT.field867[field713].field869[field714];
			}

			return field625.method561(null, var3, -1);
		}

		int var1 = LMDSPIVT.field867[field717].field869[field718];
		int var2 = -1;
		if (field713 >= 0 && field713 != field693) {
			var2 = LMDSPIVT.field867[field713].field869[field714];
		}

		return field625.method561(LMDSPIVT.field867[field717].field873, var1, var2);
	}

	@ObfuscatedName("GYKYBIID.a(I)LKDWDYCIL;")
	public final KDWDYCIL method185() {
		if (field625 == null) {
			return null;
		}

		KDWDYCIL var1 = method199();
		if (var1 == null) {
			return null;
		}

		field695 = var1.field666;

		if (field722 != -1 && field723 != -1) {
			QUXKFXEA var2 = QUXKFXEA.field1148[field722];
			KDWDYCIL var3 = var2.method413();
			if (var3 != null) {
				int var4 = var2.field1152.field869[field723];
				KDWDYCIL var5 = new KDWDYCIL(false, var3, SGSYCWFB.method423(var4), true);
				var5.method259(0, -field726, 0);
				var5.method253();
				var5.method254(var4);
				var5.field797 = null;
				var5.field796 = null;

				if (var2.field1155 != 128 || var2.field1156 != 128) {
					var5.method262(var2.field1155, var2.field1155, var2.field1156);
				}

				var5.method263(var2.field1158 + 64, var2.field1159 + 850, -30, -50, -30, true);
				KDWDYCIL[] var6 = new KDWDYCIL[] { var1, var5 };
				var1 = new KDWDYCIL(var6, 2, true);
			}
		}

		if (field625.field1393 == 1) {
			var1.field798 = true;
		}

		return var1;
	}

	@ObfuscatedName("GYKYBIID.a(Z)Z")
	public final boolean method188() {
		if (field625 == null) {
			return false;
		}

		return true;
	}
}
