package deob;

@ObfuscatedName("DROEXFTE")
public class DROEXFTE extends IWSGBTLV {

	@ObfuscatedName("DROEXFTE.n")
	public int field620;

	@ObfuscatedName("DROEXFTE.o")
	public int field621;

	@ObfuscatedName("DROEXFTE.p")
	public int field622;

	@ObfuscatedName("DROEXFTE.t")
	public int field626;

	@ObfuscatedName("DROEXFTE.u")
	public int field627;

	@ObfuscatedName("DROEXFTE.v")
	public int field628;

	@ObfuscatedName("DROEXFTE.w")
	public int field629;

	@ObfuscatedName("DROEXFTE.r")
	public UVDKTGZK field624;

	@ObfuscatedName("DROEXFTE.A")
	public int field633;

	@ObfuscatedName("DROEXFTE.s")
	public int field625;

	@ObfuscatedName("DROEXFTE.x")
	public int field630;

	@ObfuscatedName("DROEXFTE.y")
	public int field631;

	@ObfuscatedName("DROEXFTE.z")
	public int[] field632;

	@ObfuscatedName("DROEXFTE.q")
	public static client field623;

	@ObfuscatedName("DROEXFTE.a(I)LCADBNSXE;")
	public final CADBNSXE method40() {
		int var1 = -1;
		if (field624 != null) {
			int var2 = client.field449 - field625;
			if (var2 > 100 && field624.field1362 > 0) {
				var2 = 100;
			}

			while (var2 > field624.method562(field633)) {
				var2 -= field624.method562(field633);
				field633++;
				if (field633 >= field624.field1358) {
					field633 -= field624.field1362;
					if (field633 < 0 || field633 >= field624.field1358) {
						break;
					}
				}
			}

			field624 = null;
			field625 = client.field449 - var2;

			if (field624 != null) {
				var1 = field624.field1359[field633];
			}
		}

		LYSBQDHB var3;
		if (field632 == null) {
			var3 = LYSBQDHB.method282(field620);
		} else {
			var3 = method218();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method283(field621, field622, field626, field627, field628, field629, var1);
	}

	@ObfuscatedName("DROEXFTE.a(B)LLYSBQDHB;")
	public final LYSBQDHB method218() {
		int var1 = -1;
		if (field630 != -1) {
			WOJPETNO var2 = WOJPETNO.field1422[field630];
			int var3 = var2.field1424;
			int var4 = var2.field1425;
			int var5 = var2.field1426;
			int var6 = client.field144[var5 - var4];
			var1 = field623.field262[var3] >> var4 & var6;
		} else if (field631 != -1) {
			var1 = field623.field262[field631];
		}

		if (var1 >= 0 && var1 < field632.length && field632[var1] != -1) {
			return LYSBQDHB.method282(field632[var1]);
		}

		return null;
	}

	public DROEXFTE(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		field620 = arg2;
		field621 = arg3;
		field622 = arg1;
		field626 = arg4;
		field627 = arg5;
		field628 = arg6;
		field629 = arg8;

		if (arg7 != -1) {
			field624 = UVDKTGZK.field1357[arg7];
			field633 = 0;
			field625 = client.field449;
			if (arg0 && field624.field1362 != -1) {
				field633 = (int) (Math.random() * field624.field1358);
				field625 -= (int) (Math.random() * field624.method562(field633));
			}
		}

		LYSBQDHB var10 = LYSBQDHB.method282(field620);
		field630 = var10.field909;
		field631 = var10.field901;
		field632 = var10.field911;
	}
}
