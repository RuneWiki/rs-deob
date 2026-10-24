package deob;

@ObfuscatedName("FIZEXPNW")
public class FIZEXPNW extends ANJAEDVY {

	@ObfuscatedName("FIZEXPNW.r")
	public int field761;

	@ObfuscatedName("FIZEXPNW.s")
	public int field762;

	@ObfuscatedName("FIZEXPNW.t")
	public int field763;

	@ObfuscatedName("FIZEXPNW.v")
	public int field764;

	@ObfuscatedName("FIZEXPNW.w")
	public int field765;

	@ObfuscatedName("FIZEXPNW.x")
	public int field766;

	@ObfuscatedName("FIZEXPNW.y")
	public int field767;

	@ObfuscatedName("FIZEXPNW.z")
	public WOTIAWQC field768;

	@ObfuscatedName("FIZEXPNW.q")
	public int field760;

	@ObfuscatedName("FIZEXPNW.A")
	public int field769;

	@ObfuscatedName("FIZEXPNW.o")
	public int field758;

	@ObfuscatedName("FIZEXPNW.p")
	public int field759;

	@ObfuscatedName("FIZEXPNW.n")
	public int[] field757;

	@ObfuscatedName("FIZEXPNW.m")
	public static client field756;

	public FIZEXPNW(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		field761 = arg3;
		field762 = arg4;
		field763 = arg8;
		field764 = arg1;
		field765 = arg6;
		field766 = arg7;
		field767 = arg5;

		if (arg0 != -1) {
			field768 = WOTIAWQC.field1470[arg0];
			field760 = 0;
			field769 = client.field211;
			if (arg2 && field768.field1475 != -1) {
				field760 = (int) (Math.random() * field768.field1471);
				field769 -= (int) (Math.random() * field768.method581(field760));
			}
		}

		OEPVRTCC var10 = OEPVRTCC.method522(field761);
		field758 = var10.field1207;
		field759 = var10.field1209;
		field757 = var10.field1250;
	}

	@ObfuscatedName("FIZEXPNW.a(Z)LOEPVRTCC;")
	public final OEPVRTCC method308() {
		int var1 = -1;
		if (field758 != -1) {
			RCLYPSZZ var2 = RCLYPSZZ.field1321[field758];
			int var3 = var2.field1323;
			int var4 = var2.field1324;
			int var5 = var2.field1325;
			int var6 = client.field267[var5 - var4];
			var1 = field756.field313[var3] >> var4 & var6;
		} else if (field759 != -1) {
			var1 = field756.field313[field759];
		}

		if (var1 >= 0 && var1 < field757.length && field757[var1] != -1) {
			return OEPVRTCC.method522(field757[var1]);
		}

		return null;
	}

	@ObfuscatedName("FIZEXPNW.a(B)LLSSDQDBV;")
	public final LSSDQDBV method6() {
		int var1 = -1;
		if (field768 != null) {
			int var2 = client.field211 - field769;
			if (var2 > 100 && field768.field1475 > 0) {
				var2 = 100;
			}

			while (var2 > field768.method581(field760)) {
				var2 -= field768.method581(field760);
				field760++;
				if (field760 >= field768.field1471) {
					field760 -= field768.field1475;
					if (field760 < 0 || field760 >= field768.field1471) {
						break;
					}
				}
			}

			field768 = null;
			field769 = client.field211 - var2;

			if (field768 != null) {
				var1 = field768.field1472[field760];
			}
		}

		OEPVRTCC var3;
		if (field757 == null) {
			var3 = OEPVRTCC.method522(field761);
		} else {
			var3 = method308();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method513(field762, field763, field764, field765, field766, field767, var1);
	}
}
