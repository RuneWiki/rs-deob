package deob;

@ObfuscatedName("VXTLNFMD")
public class VXTLNFMD extends KCWTSCHR {

	@ObfuscatedName("VXTLNFMD.s")
	public int field1328;

	@ObfuscatedName("VXTLNFMD.t")
	public int field1329;

	@ObfuscatedName("VXTLNFMD.u")
	public int field1330;

	@ObfuscatedName("VXTLNFMD.n")
	public int field1323;

	@ObfuscatedName("VXTLNFMD.o")
	public int field1324;

	@ObfuscatedName("VXTLNFMD.p")
	public int field1325;

	@ObfuscatedName("VXTLNFMD.q")
	public int field1326;

	@ObfuscatedName("VXTLNFMD.v")
	public SPUHKLMC field1331;

	@ObfuscatedName("VXTLNFMD.x")
	public int field1332;

	@ObfuscatedName("VXTLNFMD.r")
	public int field1327;

	@ObfuscatedName("VXTLNFMD.l")
	public int field1321;

	@ObfuscatedName("VXTLNFMD.m")
	public int field1322;

	@ObfuscatedName("VXTLNFMD.y")
	public int[] field1333;

	@ObfuscatedName("VXTLNFMD.z")
	public static client field1334;

	@ObfuscatedName("VXTLNFMD.b(B)LYCVHWRKK;")
	public final YCVHWRKK method533() {
		int var1 = -1;
		if (field1321 != -1) {
			USQYPEQB var2 = USQYPEQB.field1259[field1321];
			int var3 = var2.field1261;
			int var4 = var2.field1262;
			int var5 = var2.field1263;
			int var6 = client.field226[var5 - var4];
			var1 = field1334.field493[var3] >> var4 & var6;
		} else if (field1322 != -1) {
			var1 = field1334.field493[field1322];
		}

		if (var1 >= 0 && var1 < field1333.length && field1333[var1] != -1) {
			return YCVHWRKK.method575(field1333[var1]);
		}

		return null;
	}

	@ObfuscatedName("VXTLNFMD.a(B)LXBVYIDUH;")
	public final XBVYIDUH method39() {
		int var1 = -1;
		if (field1331 != null) {
			int var2 = client.field459 - field1327;
			if (var2 > 100 && field1331.field1181 > 0) {
				var2 = 100;
			}

			while (var2 > field1331.method507(field1332)) {
				var2 -= field1331.method507(field1332);
				field1332++;
				if (field1332 >= field1331.field1177) {
					field1332 -= field1331.field1181;
					if (field1332 < 0 || field1332 >= field1331.field1177) {
						break;
					}
				}
			}

			field1331 = null;
			field1327 = client.field459 - var2;

			if (field1331 != null) {
				var1 = field1331.field1178[field1332];
			}
		}

		YCVHWRKK var3;
		if (field1333 == null) {
			var3 = YCVHWRKK.method575(field1328);
		} else {
			var3 = method533();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method580(field1329, field1330, field1323, field1324, field1325, field1326, var1);
	}

	public VXTLNFMD(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		field1328 = arg1;
		field1329 = arg7;
		field1330 = arg4;
		field1323 = arg3;
		field1324 = arg5;
		field1325 = arg6;
		field1326 = arg0;

		if (arg8 != -1) {
			field1331 = SPUHKLMC.field1176[arg8];
			field1332 = 0;
			field1327 = client.field459;
			if (arg2 && field1331.field1181 != -1) {
				field1332 = (int) (Math.random() * field1331.field1177);
				field1327 -= (int) (Math.random() * field1331.method507(field1332));
			}
		}

		YCVHWRKK var10 = YCVHWRKK.method575(field1328);
		field1321 = var10.field1465;
		field1322 = var10.field1467;
		field1333 = var10.field1451;
	}
}
