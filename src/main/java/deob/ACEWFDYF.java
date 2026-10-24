package deob;

@ObfuscatedName("ACEWFDYF")
public class ACEWFDYF extends NSRXNXHB {

	@ObfuscatedName("ACEWFDYF.r")
	public int field4;

	@ObfuscatedName("ACEWFDYF.s")
	public int field5;

	@ObfuscatedName("ACEWFDYF.t")
	public int field6;

	@ObfuscatedName("ACEWFDYF.v")
	public int field7;

	@ObfuscatedName("ACEWFDYF.w")
	public int field8;

	@ObfuscatedName("ACEWFDYF.x")
	public int field9;

	@ObfuscatedName("ACEWFDYF.y")
	public int field10;

	@ObfuscatedName("ACEWFDYF.D")
	public GMRGYXFL field14;

	@ObfuscatedName("ACEWFDYF.q")
	public int field3;

	@ObfuscatedName("ACEWFDYF.A")
	public int field12;

	@ObfuscatedName("ACEWFDYF.m")
	public int field1;

	@ObfuscatedName("ACEWFDYF.n")
	public int field2;

	@ObfuscatedName("ACEWFDYF.B")
	public int[] field13;

	@ObfuscatedName("ACEWFDYF.z")
	public static client field11;

	@ObfuscatedName("ACEWFDYF.a(B)LSIUJJQHQ;")
	public final SIUJJQHQ method1() {
		int var1 = -1;
		if (field1 != -1) {
			VSLUEINI var2 = VSLUEINI.field1394[field1];
			int var3 = var2.field1396;
			int var4 = var2.field1397;
			int var5 = var2.field1398;
			int var6 = client.field232[var5 - var4];
			var1 = field11.field524[var3] >> var4 & var6;
		} else if (field2 != -1) {
			var1 = field11.field524[field2];
		}

		if (var1 >= 0 && var1 < field13.length && field13[var1] != -1) {
			return SIUJJQHQ.method455(field13[var1]);
		}

		return null;
	}

	public ACEWFDYF(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
		field4 = arg5;
		field5 = arg3;
		field6 = arg2;
		field7 = arg0;
		field8 = arg1;
		field9 = arg6;
		field10 = arg8;

		if (arg4 != -1) {
			field14 = GMRGYXFL.field720[arg4];
			field3 = 0;
			field12 = client.field376;
			if (arg7 && field14.field725 != -1) {
				field3 = (int) (Math.random() * field14.field721);
				field12 -= (int) (Math.random() * field14.method277(field3));
			}
		}

		SIUJJQHQ var10 = SIUJJQHQ.method455(field4);
		field1 = var10.field1290;
		field2 = var10.field1285;
		field13 = var10.field1281;
	}

	@ObfuscatedName("ACEWFDYF.a(I)LFUTAQMCE;")
	public final FUTAQMCE method2() {
		int var1 = -1;
		if (field14 != null) {
			int var2 = client.field376 - field12;
			if (var2 > 100 && field14.field725 > 0) {
				var2 = 100;
			}

			while (var2 > field14.method277(field3)) {
				var2 -= field14.method277(field3);
				field3++;
				if (field3 >= field14.field721) {
					field3 -= field14.field725;
					if (field3 < 0 || field3 >= field14.field721) {
						break;
					}
				}
			}

			field14 = null;
			field12 = client.field376 - var2;

			if (field14 != null) {
				var1 = field14.field722[field3];
			}
		}

		SIUJJQHQ var3;
		if (field13 == null) {
			var3 = SIUJJQHQ.method455(field4);
		} else {
			var3 = method1();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method456(field5, field6, field7, field8, field9, field10, var1);
	}
}
