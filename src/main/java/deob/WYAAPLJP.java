package deob;

@ObfuscatedName("WYAAPLJP")
public class WYAAPLJP extends ZHYAQRMA {

	@ObfuscatedName("WYAAPLJP.w")
	public int field1378;

	@ObfuscatedName("WYAAPLJP.x")
	public int field1379;

	@ObfuscatedName("WYAAPLJP.y")
	public int field1380;

	@ObfuscatedName("WYAAPLJP.p")
	public int field1371;

	@ObfuscatedName("WYAAPLJP.q")
	public int field1372;

	@ObfuscatedName("WYAAPLJP.r")
	public int field1373;

	@ObfuscatedName("WYAAPLJP.s")
	public int field1374;

	@ObfuscatedName("WYAAPLJP.z")
	public VYCKCNXO field1381;

	@ObfuscatedName("WYAAPLJP.t")
	public int field1375;

	@ObfuscatedName("WYAAPLJP.l")
	public int field1368;

	@ObfuscatedName("WYAAPLJP.u")
	public int field1376;

	@ObfuscatedName("WYAAPLJP.v")
	public int field1377;

	@ObfuscatedName("WYAAPLJP.o")
	public int[] field1370;

	@ObfuscatedName("WYAAPLJP.n")
	public static client field1369;

	@ObfuscatedName("WYAAPLJP.b(Z)LMKWUPJYP;")
	public final MKWUPJYP method536() {
		int var1 = -1;
		if (field1376 != -1) {
			OIEBXCSN var2 = OIEBXCSN.field1019[field1376];
			int var3 = var2.field1021;
			int var4 = var2.field1022;
			int var5 = var2.field1023;
			int var6 = client.field158[var5 - var4];
			var1 = field1369.field477[var3] >> var4 & var6;
		} else if (field1377 != -1) {
			var1 = field1369.field477[field1377];
		}

		if (var1 >= 0 && var1 < field1370.length && field1370[var1] != -1) {
			return MKWUPJYP.method365(field1370[var1]);
		}

		return null;
	}

	public WYAAPLJP(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		field1378 = arg1;
		field1379 = arg6;
		field1380 = arg4;
		field1371 = arg5;
		field1372 = arg3;
		field1373 = arg0;
		field1374 = arg8;

		if (arg7 != -1) {
			field1381 = VYCKCNXO.field1339[arg7];
			field1375 = 0;
			field1368 = client.field372;
			if (arg2 && field1381.field1344 != -1) {
				field1375 = (int) (Math.random() * field1381.field1340);
				field1368 -= (int) (Math.random() * field1381.method525(field1375));
			}
		}

		MKWUPJYP var10 = MKWUPJYP.method365(field1378);
		field1376 = var10.field946;
		field1377 = var10.field976;
		field1370 = var10.field968;
	}

	@ObfuscatedName("WYAAPLJP.a(Z)LOQIGXOFQ;")
	public final OQIGXOFQ method171() {
		int var1 = -1;
		if (field1381 != null) {
			int var2 = client.field372 - field1368;
			if (var2 > 100 && field1381.field1344 > 0) {
				var2 = 100;
			}

			while (var2 > field1381.method525(field1375)) {
				var2 -= field1381.method525(field1375);
				field1375++;
				if (field1375 >= field1381.field1340) {
					field1375 -= field1381.field1344;
					if (field1375 < 0 || field1375 >= field1381.field1340) {
						break;
					}
				}
			}

			field1381 = null;
			field1368 = client.field372 - var2;

			if (field1381 != null) {
				var1 = field1381.field1341[field1375];
			}
		}

		MKWUPJYP var3;
		if (field1370 == null) {
			var3 = MKWUPJYP.method365(field1378);
		} else {
			var3 = method536();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method361(field1379, field1380, field1371, field1372, field1373, field1374, var1);
	}
}
