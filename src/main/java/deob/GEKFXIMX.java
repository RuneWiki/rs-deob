package deob;

@ObfuscatedName("GEKFXIMX")
public class GEKFXIMX extends YPQKGFZW {

	@ObfuscatedName("GEKFXIMX.v")
	public int field560;

	@ObfuscatedName("GEKFXIMX.w")
	public int field561;

	@ObfuscatedName("GEKFXIMX.x")
	public int field562;

	@ObfuscatedName("GEKFXIMX.m")
	public int field551;

	@ObfuscatedName("GEKFXIMX.n")
	public int field552;

	@ObfuscatedName("GEKFXIMX.o")
	public int field553;

	@ObfuscatedName("GEKFXIMX.p")
	public int field554;

	@ObfuscatedName("GEKFXIMX.u")
	public PQTJDTHH field559;

	@ObfuscatedName("GEKFXIMX.q")
	public int field555;

	@ObfuscatedName("GEKFXIMX.t")
	public int field558;

	@ObfuscatedName("GEKFXIMX.r")
	public int field556;

	@ObfuscatedName("GEKFXIMX.s")
	public int field557;

	@ObfuscatedName("GEKFXIMX.y")
	public int[] field563;

	@ObfuscatedName("GEKFXIMX.l")
	public static client field550;

	@ObfuscatedName("GEKFXIMX.a(I)LPZYCJUKA;")
	public final PZYCJUKA method253() {
		int var1 = -1;
		if (field556 != -1) {
			NSTEZBJV var2 = NSTEZBJV.field868[field556];
			int var3 = var2.field870;
			int var4 = var2.field871;
			int var5 = var2.field872;
			int var6 = client.field430[var5 - var4];
			var1 = field550.field470[var3] >> var4 & var6;
		} else if (field557 != -1) {
			var1 = field550.field470[field557];
		}

		if (var1 >= 0 && var1 < field563.length && field563[var1] != -1) {
			return PZYCJUKA.method409(field563[var1]);
		}

		return null;
	}

	@ObfuscatedName("GEKFXIMX.a(B)LKUGNQTGL;")
	public final KUGNQTGL method40() {
		int var1 = -1;
		if (field559 != null) {
			int var2 = client.field231 - field558;
			if (var2 > 100 && field559.field956 > 0) {
				var2 = 100;
			}

			while (var2 > field559.method405(field555)) {
				var2 -= field559.method405(field555);
				field555++;
				if (field555 >= field559.field952) {
					field555 -= field559.field956;
					if (field555 < 0 || field555 >= field559.field952) {
						break;
					}
				}
			}

			field559 = null;
			field558 = client.field231 - var2;

			if (field559 != null) {
				var1 = field559.field953[field555];
			}
		}

		PZYCJUKA var3;
		if (field563 == null) {
			var3 = PZYCJUKA.method409(field560);
		} else {
			var3 = method253();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method413(field561, field562, field551, field552, field553, field554, var1);
	}

	public GEKFXIMX(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
		field560 = arg0;
		field561 = arg3;
		field562 = arg7;
		field551 = arg2;
		field552 = arg1;
		field553 = arg6;
		field554 = arg5;

		if (arg4 != -1) {
			field559 = PQTJDTHH.field951[arg4];
			field555 = 0;
			field558 = client.field231 - 1;
			if (arg8 && field559.field956 != -1) {
				field555 = (int) (Math.random() * field559.field952);
				field558 -= (int) (Math.random() * field559.method405(field555));
			}
		}

		PZYCJUKA var10 = PZYCJUKA.method409(field560);
		field556 = var10.field971;
		field557 = var10.field986;
		field563 = var10.field1014;
	}
}
