package deob;

@ObfuscatedName("YRZVGTOF")
public class YRZVGTOF extends WWTUXVKR {

	@ObfuscatedName("YRZVGTOF.v")
	public int field1428;

	@ObfuscatedName("YRZVGTOF.w")
	public int field1429;

	@ObfuscatedName("YRZVGTOF.x")
	public int field1430;

	@ObfuscatedName("YRZVGTOF.m")
	public int field1421;

	@ObfuscatedName("YRZVGTOF.n")
	public int field1422;

	@ObfuscatedName("YRZVGTOF.o")
	public int field1423;

	@ObfuscatedName("YRZVGTOF.p")
	public int field1424;

	@ObfuscatedName("YRZVGTOF.t")
	public KIZBPSHZ field1427;

	@ObfuscatedName("YRZVGTOF.q")
	public int field1425;

	@ObfuscatedName("YRZVGTOF.y")
	public int field1431;

	@ObfuscatedName("YRZVGTOF.A")
	public int field1432;

	@ObfuscatedName("YRZVGTOF.B")
	public int field1433;

	@ObfuscatedName("YRZVGTOF.r")
	public int[] field1426;

	@ObfuscatedName("YRZVGTOF.C")
	public static client field1434;

	@ObfuscatedName("YRZVGTOF.a(Z)LPOJFANDE;")
	public final POJFANDE method54() {
		int var1 = -1;
		if (field1427 != null) {
			int var2 = client.field456 - field1431;
			if (var2 > 100 && field1427.field893 > 0) {
				var2 = 100;
			}

			while (var2 > field1427.method364(field1425)) {
				var2 -= field1427.method364(field1425);
				field1425++;
				if (field1425 >= field1427.field889) {
					field1425 -= field1427.field893;
					if (field1425 < 0 || field1425 >= field1427.field889) {
						break;
					}
				}
			}

			field1427 = null;
			field1431 = client.field456 - var2;

			if (field1427 != null) {
				var1 = field1427.field890[field1425];
			}
		}

		CSTFGNEK var3;
		if (field1426 == null) {
			var3 = CSTFGNEK.method219(field1428);
		} else {
			var3 = method575();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method217(field1429, field1430, field1421, field1422, field1423, field1424, var1);
	}

	@ObfuscatedName("YRZVGTOF.b(Z)LCSTFGNEK;")
	public final CSTFGNEK method575() {
		int var1 = -1;
		if (field1432 != -1) {
			GDBQCAOA var2 = GDBQCAOA.field701[field1432];
			int var3 = var2.field703;
			int var4 = var2.field704;
			int var5 = var2.field705;
			int var6 = client.field184[var5 - var4];
			var1 = field1434.field322[var3] >> var4 & var6;
		} else if (field1433 != -1) {
			var1 = field1434.field322[field1433];
		}

		if (var1 >= 0 && var1 < field1426.length && field1426[var1] != -1) {
			return CSTFGNEK.method219(field1426[var1]);
		}

		return null;
	}

	public YRZVGTOF(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
		field1428 = arg5;
		field1429 = arg1;
		field1430 = arg3;
		field1421 = arg4;
		field1422 = arg7;
		field1423 = arg2;
		field1424 = arg8;

		if (arg0 != -1) {
			field1427 = KIZBPSHZ.field888[arg0];
			field1425 = 0;
			field1431 = client.field456;
			if (arg6 && field1427.field893 != -1) {
				field1425 = (int) (Math.random() * field1427.field889);
				field1431 -= (int) (Math.random() * field1427.method364(field1425));
			}
		}

		CSTFGNEK var10 = CSTFGNEK.method219(field1428);
		field1432 = var10.field493;
		field1433 = var10.field528;
		field1426 = var10.field531;
	}
}
