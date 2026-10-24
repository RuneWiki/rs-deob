package deob;

@ObfuscatedName("YSSTKYXW")
public class YSSTKYXW extends GLSQHJVO {

	@ObfuscatedName("YSSTKYXW.q")
	public int field1507;

	@ObfuscatedName("YSSTKYXW.r")
	public int field1508;

	@ObfuscatedName("YSSTKYXW.s")
	public int field1509;

	@ObfuscatedName("YSSTKYXW.m")
	public int field1503;

	@ObfuscatedName("YSSTKYXW.n")
	public int field1504;

	@ObfuscatedName("YSSTKYXW.o")
	public int field1505;

	@ObfuscatedName("YSSTKYXW.p")
	public int field1506;

	@ObfuscatedName("YSSTKYXW.x")
	public QBINVEVU field1513;

	@ObfuscatedName("YSSTKYXW.l")
	public int field1502;

	@ObfuscatedName("YSSTKYXW.z")
	public int field1515;

	@ObfuscatedName("YSSTKYXW.t")
	public int field1510;

	@ObfuscatedName("YSSTKYXW.u")
	public int field1511;

	@ObfuscatedName("YSSTKYXW.y")
	public int[] field1514;

	@ObfuscatedName("YSSTKYXW.w")
	public static client field1512;

	@ObfuscatedName("YSSTKYXW.a(I)LIRLTEWJP;")
	public final IRLTEWJP method168() {
		int var1 = -1;
		if (field1513 != null) {
			int var2 = client.field476 - field1515;
			if (var2 > 100 && field1513.field1170 > 0) {
				var2 = 100;
			}

			while (var2 > field1513.method451(field1502)) {
				var2 -= field1513.method451(field1502);
				field1502++;
				if (field1502 >= field1513.field1166) {
					field1502 -= field1513.field1170;
					if (field1502 < 0 || field1502 >= field1513.field1166) {
						break;
					}
				}
			}

			field1513 = null;
			field1515 = client.field476 - var2;

			if (field1513 != null) {
				var1 = field1513.field1167[field1502];
			}
		}

		MIQWCPVG var3;
		if (field1514 == null) {
			var3 = MIQWCPVG.method363(field1507);
		} else {
			var3 = method604();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method365(field1508, field1509, field1503, field1504, field1505, field1506, var1);
	}

	public YSSTKYXW(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
		field1507 = arg6;
		field1508 = arg0;
		field1509 = arg3;
		field1503 = arg4;
		field1504 = arg1;
		field1505 = arg5;
		field1506 = arg7;

		if (arg2 != -1) {
			field1513 = QBINVEVU.field1165[arg2];
			field1502 = 0;
			field1515 = client.field476;
			if (arg8 && field1513.field1170 != -1) {
				field1502 = (int) (Math.random() * field1513.field1166);
				field1515 -= (int) (Math.random() * field1513.method451(field1502));
			}
		}

		MIQWCPVG var10 = MIQWCPVG.method363(field1507);
		field1510 = var10.field1039;
		field1511 = var10.field1018;
		field1514 = var10.field1008;
	}

	@ObfuscatedName("YSSTKYXW.a(Z)LMIQWCPVG;")
	public final MIQWCPVG method604() {
		int var1 = -1;
		if (field1510 != -1) {
			NPQMEWIH var2 = NPQMEWIH.field1074[field1510];
			int var3 = var2.field1076;
			int var4 = var2.field1077;
			int var5 = var2.field1078;
			int var6 = client.field393[var5 - var4];
			var1 = field1512.field439[var3] >> var4 & var6;
		} else if (field1511 != -1) {
			var1 = field1512.field439[field1511];
		}

		if (var1 >= 0 && var1 < field1514.length && field1514[var1] != -1) {
			return MIQWCPVG.method363(field1514[var1]);
		}

		return null;
	}
}
