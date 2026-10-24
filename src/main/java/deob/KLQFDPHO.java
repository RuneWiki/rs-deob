package deob;

@ObfuscatedName("KLQFDPHO")
public final class KLQFDPHO extends CUSCNWAC {

	@ObfuscatedName("KLQFDPHO.vb")
	public QYNFXHXW field854;

	@ObfuscatedName("KLQFDPHO.c(I)LOJGAHFXC;")
	public final OJGAHFXC method366() {
		if (field609 < 0 || field612 != 0) {
			int var3 = -1;
			if (field623 >= 0) {
				var3 = DVIZXFSW.field636[field623].field638[field624];
			}

			return field854.method513(null, var3, -1);
		}

		int var1 = DVIZXFSW.field636[field609].field638[field610];
		int var2 = -1;
		if (field623 >= 0 && field623 != field620) {
			var2 = DVIZXFSW.field636[field623].field638[field624];
		}

		return field854.method513(DVIZXFSW.field636[field609].field642, var1, var2);
	}

	@ObfuscatedName("KLQFDPHO.b(I)Z")
	public final boolean method40() {
		if (field854 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("KLQFDPHO.a(I)LOJGAHFXC;")
	public final OJGAHFXC method1() {
		if (field854 == null) {
			return null;
		}

		OJGAHFXC var1 = method366();
		if (var1 == null) {
			return null;
		}

		field628 = var1.field1265;

		if (field578 != -1 && field579 != -1) {
			XYSJIYWF var2 = XYSJIYWF.field1477[field578];
			OJGAHFXC var3 = var2.method582();
			if (var3 != null) {
				int var4 = var2.field1481.field638[field579];
				OJGAHFXC var5 = new OJGAHFXC(MOOJSKCU.method395(var4), false, true, var3);
				var5.method426(-field582, 0, 0);
				var5.method420();
				var5.method421(var4);
				var5.field1049 = null;
				var5.field1048 = null;

				if (var2.field1484 != 128 || var2.field1485 != 128) {
					var5.method429(var2.field1484, var2.field1485, var2.field1484);
				}

				var5.method430(var2.field1487 + 64, var2.field1488 + 850, -30, -50, -30, true);
				OJGAHFXC[] var6 = new OJGAHFXC[] { var1, var5 };
				var1 = new OJGAHFXC(true, var6, 2);
			}
		}

		if (field854.field1157 == 1) {
			var1.field1050 = true;
		}

		return var1;
	}
}
