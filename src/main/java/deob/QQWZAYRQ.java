package deob;

@ObfuscatedName("QQWZAYRQ")
public class QQWZAYRQ extends XBYIDFVN {

	@ObfuscatedName("QQWZAYRQ.l")
	public int field1248;

	@ObfuscatedName("QQWZAYRQ.m")
	public int field1249;

	@ObfuscatedName("QQWZAYRQ.n")
	public int field1250;

	@ObfuscatedName("QQWZAYRQ.r")
	public int field1254;

	@ObfuscatedName("QQWZAYRQ.s")
	public int field1255;

	@ObfuscatedName("QQWZAYRQ.t")
	public int field1256;

	@ObfuscatedName("QQWZAYRQ.u")
	public int field1257;

	@ObfuscatedName("QQWZAYRQ.o")
	public JZFUUSFN field1251;

	@ObfuscatedName("QQWZAYRQ.y")
	public int field1261;

	@ObfuscatedName("QQWZAYRQ.q")
	public int field1253;

	@ObfuscatedName("QQWZAYRQ.w")
	public int field1259;

	@ObfuscatedName("QQWZAYRQ.x")
	public int field1260;

	@ObfuscatedName("QQWZAYRQ.v")
	public int[] field1258;

	@ObfuscatedName("QQWZAYRQ.p")
	public static client field1252;

	public QQWZAYRQ(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
		field1248 = arg2;
		field1249 = arg5;
		field1250 = arg4;
		field1254 = arg7;
		field1255 = arg0;
		field1256 = arg3;
		field1257 = arg8;

		if (arg1 != -1) {
			field1251 = JZFUUSFN.field841[arg1];
			field1261 = 0;
			field1253 = client.field443;
			if (arg6 && field1251.field846 != -1) {
				field1261 = (int) (Math.random() * field1251.field842);
				field1253 -= (int) (Math.random() * field1251.method308(field1261));
			}
		}

		CUIVWWJO var10 = CUIVWWJO.method203(field1248);
		field1259 = var10.field581;
		field1260 = var10.field592;
		field1258 = var10.field562;
	}

	@ObfuscatedName("QQWZAYRQ.a(B)LPDVZPZLT;")
	public final PDVZPZLT method3() {
		int var1 = -1;
		if (field1251 != null) {
			int var2 = client.field443 - field1253;
			if (var2 > 100 && field1251.field846 > 0) {
				var2 = 100;
			}

			while (var2 > field1251.method308(field1261)) {
				var2 -= field1251.method308(field1261);
				field1261++;
				if (field1261 >= field1251.field842) {
					field1261 -= field1251.field846;
					if (field1261 < 0 || field1261 >= field1251.field842) {
						break;
					}
				}
			}

			field1251 = null;
			field1253 = client.field443 - var2;

			if (field1251 != null) {
				var1 = field1251.field843[field1261];
			}
		}

		CUIVWWJO var3;
		if (field1258 == null) {
			var3 = CUIVWWJO.method203(field1248);
		} else {
			var3 = method492();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method205(field1249, field1250, field1254, field1255, field1256, field1257, var1);
	}

	@ObfuscatedName("QQWZAYRQ.a(I)LCUIVWWJO;")
	public final CUIVWWJO method492() {
		int var1 = -1;
		if (field1259 != -1) {
			QMAVGSSV var2 = QMAVGSSV.field1234[field1259];
			int var3 = var2.field1236;
			int var4 = var2.field1237;
			int var5 = var2.field1238;
			int var6 = client.field367[var5 - var4];
			var1 = field1252.field467[var3] >> var4 & var6;
		} else if (field1260 != -1) {
			var1 = field1252.field467[field1260];
		}

		if (var1 >= 0 && var1 < field1258.length && field1258[var1] != -1) {
			return CUIVWWJO.method203(field1258[var1]);
		}

		return null;
	}
}
