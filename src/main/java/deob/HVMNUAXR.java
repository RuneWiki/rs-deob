package deob;

@ObfuscatedName("HVMNUAXR")
public class HVMNUAXR extends BSABUCFC {

	@ObfuscatedName("HVMNUAXR.k")
	public int field761;

	@ObfuscatedName("HVMNUAXR.l")
	public int field762;

	@ObfuscatedName("HVMNUAXR.m")
	public int field763;

	@ObfuscatedName("HVMNUAXR.t")
	public int field769;

	@ObfuscatedName("HVMNUAXR.u")
	public int field770;

	@ObfuscatedName("HVMNUAXR.v")
	public int field771;

	@ObfuscatedName("HVMNUAXR.w")
	public int field772;

	@ObfuscatedName("HVMNUAXR.y")
	public PVVHTYPN field774;

	@ObfuscatedName("HVMNUAXR.s")
	public int field768;

	@ObfuscatedName("HVMNUAXR.r")
	public int field767;

	@ObfuscatedName("HVMNUAXR.p")
	public int field765;

	@ObfuscatedName("HVMNUAXR.q")
	public int field766;

	@ObfuscatedName("HVMNUAXR.x")
	public int[] field773;

	@ObfuscatedName("HVMNUAXR.o")
	public static client field764;

	@ObfuscatedName("HVMNUAXR.a(B)LUNLYQRUD;")
	public final UNLYQRUD method10() {
		int var1 = -1;
		if (field774 != null) {
			int var2 = client.field230 - field767;
			if (var2 > 100 && field774.field1011 > 0) {
				var2 = 100;
			}

			while (var2 > field774.method390(field768)) {
				var2 -= field774.method390(field768);
				field768++;
				if (field768 >= field774.field1007) {
					field768 -= field774.field1011;
					if (field768 < 0 || field768 >= field774.field1007) {
						break;
					}
				}
			}

			field774 = null;
			field767 = client.field230 - var2;

			if (field774 != null) {
				var1 = field774.field1008[field768];
			}
		}

		DZZSWICG var3;
		if (field773 == null) {
			var3 = DZZSWICG.method184(field761);
		} else {
			var3 = method314();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method190(field762, field763, field769, field770, field771, field772, var1);
	}

	@ObfuscatedName("HVMNUAXR.a(Z)LDZZSWICG;")
	public final DZZSWICG method314() {
		int var1 = -1;
		if (field765 != -1) {
			VKMARKYY var2 = VKMARKYY.field1355[field765];
			int var3 = var2.field1357;
			int var4 = var2.field1358;
			int var5 = var2.field1359;
			int var6 = client.field99[var5 - var4];
			var1 = field764.field474[var3] >> var4 & var6;
		} else if (field766 != -1) {
			var1 = field764.field474[field766];
		}

		if (var1 >= 0 && var1 < field773.length && field773[var1] != -1) {
			return DZZSWICG.method184(field773[var1]);
		}

		return null;
	}

	public HVMNUAXR(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		field761 = arg7;
		field762 = arg5;
		field763 = arg6;
		field769 = arg4;
		field770 = arg1;
		field771 = arg0;
		field772 = arg2;

		if (arg8 != -1) {
			field774 = PVVHTYPN.field1006[arg8];
			field768 = 0;
			field767 = client.field230 - 1;
			if (arg3 && field774.field1011 != -1) {
				field768 = (int) (Math.random() * field774.field1007);
				field767 -= (int) (Math.random() * field774.method390(field768));
			}
		}

		DZZSWICG var10 = DZZSWICG.method184(field761);
		field765 = var10.field568;
		field766 = var10.field575;
		field773 = var10.field543;
	}
}
