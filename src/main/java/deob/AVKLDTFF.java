package deob;

@ObfuscatedName("AVKLDTFF")
public final class AVKLDTFF extends QMQRUGDN {

	@ObfuscatedName("AVKLDTFF.sb")
	public HQFMWUSH field36;

	@ObfuscatedName("AVKLDTFF.a(I)LKPUOCBCE;")
	public final KPUOCBCE method11() {
		if (field36 == null) {
			return null;
		}

		KPUOCBCE var1 = method13();
		if (var1 == null) {
			return null;
		}

		field1156 = var1.field1380;

		if (field1167 != -1 && field1168 != -1) {
			FULHVSIU var2 = FULHVSIU.field604[field1167];
			KPUOCBCE var3 = var2.method231();
			if (var3 != null) {
				int var4 = var2.field608.field1000[field1168];
				KPUOCBCE var5 = new KPUOCBCE(ZNUJPBQV.method585(var4), false, var3, true);
				var5.method392(0, 0, -field1171);
				var5.method386();
				var5.method387(var4);
				var5.field889 = null;
				var5.field888 = null;

				if (var2.field611 != 128 || var2.field612 != 128) {
					var5.method395(var2.field611, var2.field612, var2.field611);
				}

				var5.method396(var2.field614 + 64, var2.field615 + 850, -30, -50, -30, true);
				KPUOCBCE[] var6 = new KPUOCBCE[] { var1, var5 };
				var1 = new KPUOCBCE(true, var6, 2);
			}
		}

		if (field36.field791 == 1) {
			var1.field890 = true;
		}

		return var1;
	}

	@ObfuscatedName("AVKLDTFF.b(I)Z")
	public final boolean method12() {
		if (field36 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("AVKLDTFF.c(I)LKPUOCBCE;")
	public final KPUOCBCE method13() {
		if (field1151 < 0 || field1154 != 0) {
			int var3 = -1;
			if (field1163 >= 0) {
				var3 = NMXKUYSC.field998[field1163].field1000[field1164];
			}

			return field36.method305(-1, null, var3);
		}

		int var1 = NMXKUYSC.field998[field1151].field1000[field1152];
		int var2 = -1;
		if (field1163 >= 0 && field1183 != field1163) {
			var2 = NMXKUYSC.field998[field1163].field1000[field1164];
		}

		return field36.method305(var2, NMXKUYSC.field998[field1151].field1004, var1);
	}
}
