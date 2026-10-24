package deob;

@ObfuscatedName("GXBMUAVX")
public class GXBMUAVX extends ESLZGWKZ {

	@ObfuscatedName("GXBMUAVX.l")
	public int field825;

	@ObfuscatedName("GXBMUAVX.m")
	public int field826;

	@ObfuscatedName("GXBMUAVX.n")
	public int field827;

	@ObfuscatedName("GXBMUAVX.v")
	public int field834;

	@ObfuscatedName("GXBMUAVX.w")
	public int field835;

	@ObfuscatedName("GXBMUAVX.x")
	public int field836;

	@ObfuscatedName("GXBMUAVX.y")
	public int field837;

	@ObfuscatedName("GXBMUAVX.q")
	public HARRRJHW field830;

	@ObfuscatedName("GXBMUAVX.u")
	public int field833;

	@ObfuscatedName("GXBMUAVX.r")
	public int field831;

	@ObfuscatedName("GXBMUAVX.o")
	public int field828;

	@ObfuscatedName("GXBMUAVX.p")
	public int field829;

	@ObfuscatedName("GXBMUAVX.z")
	public int[] field838;

	@ObfuscatedName("GXBMUAVX.s")
	public static client field832;

	@ObfuscatedName("GXBMUAVX.a(B)LDHUPIIUL;")
	public final DHUPIIUL method159() {
		int var1 = -1;
		if (field830 != null) {
			int var2 = client.field301 - field831;
			if (var2 > 100 && field830.field845 > 0) {
				var2 = 100;
			}

			while (var2 > field830.method275(field833)) {
				var2 -= field830.method275(field833);
				field833++;
				if (field833 >= field830.field841) {
					field833 -= field830.field845;
					if (field833 < 0 || field833 >= field830.field841) {
						break;
					}
				}
			}

			field830 = null;
			field831 = client.field301 - var2;

			if (field830 != null) {
				var1 = field830.field842[field833];
			}
		}

		UVSOAWGE var3;
		if (field838 == null) {
			var3 = UVSOAWGE.method501(field825);
		} else {
			var3 = method273();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method506(field826, field827, field834, field835, field836, field837, var1);
	}

	public GXBMUAVX(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		field825 = arg2;
		field826 = arg7;
		field827 = arg6;
		field834 = arg8;
		field835 = arg1;
		field836 = arg5;
		field837 = arg3;

		if (arg4 != -1) {
			field830 = HARRRJHW.field840[arg4];
			field833 = 0;
			field831 = client.field301;
			if (arg0 && field830.field845 != -1) {
				field833 = (int) (Math.random() * field830.field841);
				field831 -= (int) (Math.random() * field830.method275(field833));
			}
		}

		UVSOAWGE var10 = UVSOAWGE.method501(field825);
		field828 = var10.field1339;
		field829 = var10.field1315;
		field838 = var10.field1343;
	}

	@ObfuscatedName("GXBMUAVX.a(Z)LUVSOAWGE;")
	public final UVSOAWGE method273() {
		int var1 = -1;
		if (field828 != -1) {
			MWRUKLPF var2 = MWRUKLPF.field1119[field828];
			int var3 = var2.field1121;
			int var4 = var2.field1122;
			int var5 = var2.field1123;
			int var6 = client.field276[var5 - var4];
			var1 = field832.field313[var3] >> var4 & var6;
		} else if (field829 != -1) {
			var1 = field832.field313[field829];
		}

		if (var1 >= 0 && var1 < field838.length && field838[var1] != -1) {
			return UVSOAWGE.method501(field838[var1]);
		}

		return null;
	}
}
