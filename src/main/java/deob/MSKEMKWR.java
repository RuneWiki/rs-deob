package deob;

@ObfuscatedName("MSKEMKWR")
public class MSKEMKWR extends FRPXDCME {

	@ObfuscatedName("MSKEMKWR.u")
	public int field1070;

	@ObfuscatedName("MSKEMKWR.v")
	public int field1071;

	@ObfuscatedName("MSKEMKWR.w")
	public int field1072;

	@ObfuscatedName("MSKEMKWR.q")
	public int field1066;

	@ObfuscatedName("MSKEMKWR.r")
	public int field1067;

	@ObfuscatedName("MSKEMKWR.s")
	public int field1068;

	@ObfuscatedName("MSKEMKWR.t")
	public int field1069;

	@ObfuscatedName("MSKEMKWR.n")
	public KIRTNGZJ field1063;

	@ObfuscatedName("MSKEMKWR.m")
	public int field1062;

	@ObfuscatedName("MSKEMKWR.o")
	public int field1064;

	@ObfuscatedName("MSKEMKWR.y")
	public int field1074;

	@ObfuscatedName("MSKEMKWR.z")
	public int field1075;

	@ObfuscatedName("MSKEMKWR.p")
	public int[] field1065;

	@ObfuscatedName("MSKEMKWR.x")
	public static client field1073;

	@ObfuscatedName("MSKEMKWR.a(I)LGFYXEFQY;")
	public final GFYXEFQY method294() {
		int var1 = -1;
		if (field1063 != null) {
			int var2 = client.field277 - field1064;
			if (var2 > 100 && field1063.field1020 > 0) {
				var2 = 100;
			}

			while (var2 > field1063.method445(field1062)) {
				var2 -= field1063.method445(field1062);
				field1062++;
				if (field1062 >= field1063.field1016) {
					field1062 -= field1063.field1020;
					if (field1062 < 0 || field1062 >= field1063.field1016) {
						break;
					}
				}
			}

			field1063 = null;
			field1064 = client.field277 - var2;

			if (field1063 != null) {
				var1 = field1063.field1017[field1062];
			}
		}

		VCGOMUBN var3;
		if (field1065 == null) {
			var3 = VCGOMUBN.method568(field1070);
		} else {
			var3 = method449();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method569(field1071, field1072, field1066, field1067, field1068, field1069, var1);
	}

	@ObfuscatedName("MSKEMKWR.b(I)LVCGOMUBN;")
	public final VCGOMUBN method449() {
		int var1 = -1;
		if (field1074 != -1) {
			ZESTMKXA var2 = ZESTMKXA.field1479[field1074];
			int var3 = var2.field1481;
			int var4 = var2.field1482;
			int var5 = var2.field1483;
			int var6 = client.field174[var5 - var4];
			var1 = field1073.field336[var3] >> var4 & var6;
		} else if (field1075 != -1) {
			var1 = field1073.field336[field1075];
		}

		if (var1 >= 0 && var1 < field1065.length && field1065[var1] != -1) {
			return VCGOMUBN.method568(field1065[var1]);
		}

		return null;
	}

	public MSKEMKWR(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
		field1070 = arg2;
		field1071 = arg8;
		field1072 = arg3;
		field1066 = arg5;
		field1067 = arg0;
		field1068 = arg4;
		field1069 = arg1;

		if (arg7 != -1) {
			field1063 = KIRTNGZJ.field1015[arg7];
			field1062 = 0;
			field1064 = client.field277;
			if (arg6 && field1063.field1020 != -1) {
				field1062 = (int) (Math.random() * field1063.field1016);
				field1064 -= (int) (Math.random() * field1063.method445(field1062));
			}
		}

		VCGOMUBN var10 = VCGOMUBN.method568(field1070);
		field1074 = var10.field1390;
		field1075 = var10.field1409;
		field1065 = var10.field1412;
	}
}
