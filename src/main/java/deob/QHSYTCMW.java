package deob;

@ObfuscatedName("QHSYTCMW")
public class QHSYTCMW extends MODNYPGG {

	@ObfuscatedName("QHSYTCMW.p")
	public int field1257;

	@ObfuscatedName("QHSYTCMW.q")
	public int field1258;

	@ObfuscatedName("QHSYTCMW.r")
	public int field1259;

	@ObfuscatedName("QHSYTCMW.w")
	public int field1264;

	@ObfuscatedName("QHSYTCMW.x")
	public int field1265;

	@ObfuscatedName("QHSYTCMW.y")
	public int field1266;

	@ObfuscatedName("QHSYTCMW.z")
	public int field1267;

	@ObfuscatedName("QHSYTCMW.s")
	public KAIFCIAJ field1260;

	@ObfuscatedName("QHSYTCMW.v")
	public int field1263;

	@ObfuscatedName("QHSYTCMW.A")
	public int field1268;

	@ObfuscatedName("QHSYTCMW.n")
	public int field1255;

	@ObfuscatedName("QHSYTCMW.o")
	public int field1256;

	@ObfuscatedName("QHSYTCMW.u")
	public int[] field1262;

	@ObfuscatedName("QHSYTCMW.t")
	public static client field1261;

	@ObfuscatedName("QHSYTCMW.a(I)LNGYJLUVS;")
	public final NGYJLUVS method206() {
		int var1 = -1;
		if (field1260 != null) {
			int var2 = client.field205 - field1268;
			if (var2 > 100 && field1260.field747 > 0) {
				var2 = 100;
			}

			while (var2 > field1260.method240(field1263)) {
				var2 -= field1260.method240(field1263);
				field1263++;
				if (field1263 >= field1260.field743) {
					field1263 -= field1260.field747;
					if (field1263 < 0 || field1263 >= field1260.field743) {
						break;
					}
				}
			}

			field1260 = null;
			field1268 = client.field205 - var2;

			if (field1260 != null) {
				var1 = field1260.field744[field1263];
			}
		}

		NNXJFXRX var3;
		if (field1262 == null) {
			var3 = NNXJFXRX.method323(field1257);
		} else {
			var3 = method429();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method328(field1258, field1259, field1264, field1265, field1266, field1267, var1);
	}

	public QHSYTCMW(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
		field1257 = arg8;
		field1258 = arg4;
		field1259 = arg1;
		field1264 = arg5;
		field1265 = arg0;
		field1266 = arg2;
		field1267 = arg3;

		if (arg6 != -1) {
			field1260 = KAIFCIAJ.field742[arg6];
			field1263 = 0;
			field1268 = client.field205;
			if (arg7 && field1260.field747 != -1) {
				field1263 = (int) (Math.random() * field1260.field743);
				field1268 -= (int) (Math.random() * field1260.method240(field1263));
			}
		}

		NNXJFXRX var10 = NNXJFXRX.method323(field1257);
		field1255 = var10.field960;
		field1256 = var10.field995;
		field1262 = var10.field963;
	}

	@ObfuscatedName("QHSYTCMW.a(Z)LNNXJFXRX;")
	public final NNXJFXRX method429() {
		int var1 = -1;
		if (field1255 != -1) {
			DPQEBGAZ var2 = DPQEBGAZ.field532[field1255];
			int var3 = var2.field534;
			int var4 = var2.field535;
			int var5 = var2.field536;
			int var6 = client.field103[var5 - var4];
			var1 = field1261.field154[var3] >> var4 & var6;
		} else if (field1256 != -1) {
			var1 = field1261.field154[field1256];
		}

		if (var1 >= 0 && var1 < field1262.length && field1262[var1] != -1) {
			return NNXJFXRX.method323(field1262[var1]);
		}

		return null;
	}
}
