package deob;

@ObfuscatedName("ZVYASFEK")
public final class ZVYASFEK extends YPQKGFZW {

	@ObfuscatedName("ZVYASFEK.p")
	public boolean field1508 = false;

	@ObfuscatedName("ZVYASFEK.q")
	public JXKRPXFX field1509;

	@ObfuscatedName("ZVYASFEK.l")
	public int field1504;

	@ObfuscatedName("ZVYASFEK.m")
	public int field1505;

	@ObfuscatedName("ZVYASFEK.n")
	public int field1506;

	@ObfuscatedName("ZVYASFEK.o")
	public int field1507;

	@ObfuscatedName("ZVYASFEK.t")
	public int field1512;

	@ObfuscatedName("ZVYASFEK.r")
	public int field1510;

	@ObfuscatedName("ZVYASFEK.s")
	public int field1511;

	public ZVYASFEK(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field1509 = JXKRPXFX.field632[arg5];
		field1504 = arg3;
		field1505 = arg0;
		field1506 = arg6;
		field1507 = arg4;
		field1512 = arg1 + arg2;
		field1508 = false;
	}

	@ObfuscatedName("ZVYASFEK.a(B)LKUGNQTGL;")
	public final KUGNQTGL method40() {
		KUGNQTGL var1 = field1509.method308();
		if (var1 == null) {
			return null;
		}

		int var2 = field1509.field636.field953[field1510];
		KUGNQTGL var3 = new KUGNQTGL(var1, false, true, SCWTQUFK.method455(var2));
		if (!field1508) {
			var3.method337();
			var3.method338(var2);
			var3.field702 = null;
			var3.field701 = null;
		}

		if (field1509.field639 != 128 || field1509.field640 != 128) {
			var3.method346(field1509.field639, field1509.field639, field1509.field640);
		}

		if (field1509.field641 != 0) {
			if (field1509.field641 == 90) {
				var3.method341();
			}

			if (field1509.field641 == 180) {
				var3.method341();
				var3.method341();
			}

			if (field1509.field641 == 270) {
				var3.method341();
				var3.method341();
				var3.method341();
			}
		}

		var3.method347(field1509.field642 + 64, field1509.field643 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("ZVYASFEK.a(IB)V")
	public final void method605(int arg0) {
		field1511 += arg0;
		while (field1511 > field1509.field636.method405(field1510)) {
			field1511 -= field1509.field636.method405(field1510);
			field1510++;
			if (field1510 >= field1509.field636.field952 && (field1510 < 0 || field1510 >= field1509.field636.field952)) {
				field1510 = 0;
				field1508 = true;
			}
		}
	}
}
