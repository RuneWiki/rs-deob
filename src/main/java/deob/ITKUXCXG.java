package deob;

@ObfuscatedName("ITKUXCXG")
public final class ITKUXCXG extends KCWTSCHR {

	@ObfuscatedName("ITKUXCXG.l")
	public boolean field831 = false;

	@ObfuscatedName("ITKUXCXG.t")
	public CRSWMDQF field837;

	@ObfuscatedName("ITKUXCXG.m")
	public int field832;

	@ObfuscatedName("ITKUXCXG.n")
	public int field833;

	@ObfuscatedName("ITKUXCXG.o")
	public int field834;

	@ObfuscatedName("ITKUXCXG.p")
	public int field835;

	@ObfuscatedName("ITKUXCXG.r")
	public int field836;

	@ObfuscatedName("ITKUXCXG.u")
	public int field838;

	@ObfuscatedName("ITKUXCXG.v")
	public int field839;

	@ObfuscatedName("ITKUXCXG.a(B)LXBVYIDUH;")
	public final XBVYIDUH method39() {
		XBVYIDUH var1 = field837.method299();
		if (var1 == null) {
			return null;
		}

		int var2 = field837.field547.field1178[field838];
		XBVYIDUH var3 = new XBVYIDUH(BKYAWERN.method115(var2), true, false, var1);
		if (!field831) {
			var3.method548();
			var3.method549(var2);
			var3.field1384 = null;
			var3.field1383 = null;
		}

		if (field837.field550 != 128 || field837.field551 != 128) {
			var3.method557(field837.field551, field837.field550, field837.field550);
		}

		if (field837.field552 != 0) {
			if (field837.field552 == 90) {
				var3.method552();
			}

			if (field837.field552 == 180) {
				var3.method552();
				var3.method552();
			}

			if (field837.field552 == 270) {
				var3.method552();
				var3.method552();
				var3.method552();
			}
		}

		var3.method558(field837.field553 + 64, field837.field554 + 850, -30, -50, -30, true);
		return var3;
	}

	public ITKUXCXG(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field837 = CRSWMDQF.field543[arg6];
		field832 = arg1;
		field833 = arg5;
		field834 = arg2;
		field835 = arg4;
		field836 = arg0 + arg3;
		field831 = false;
	}

	@ObfuscatedName("ITKUXCXG.a(II)V")
	public final void method322(int arg0) {
		field839 += arg0;
		while (field839 > field837.field547.method507(field838)) {
			field839 -= field837.field547.method507(field838) + 1;
			field838++;
			if (field838 >= field837.field547.field1177 && (field838 < 0 || field838 >= field837.field547.field1177)) {
				field838 = 0;
				field831 = true;
			}
		}
	}
}
