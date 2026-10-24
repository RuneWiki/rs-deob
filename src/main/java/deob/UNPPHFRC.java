package deob;

@ObfuscatedName("UNPPHFRC")
public final class UNPPHFRC {

	@ObfuscatedName("UNPPHFRC.c")
	public YCAZQYJA field1293 = new YCAZQYJA();

	@ObfuscatedName("UNPPHFRC.g")
	public HRSVWDNF field1297 = new HRSVWDNF();

	@ObfuscatedName("UNPPHFRC.d")
	public int field1294;

	@ObfuscatedName("UNPPHFRC.e")
	public int field1295;

	@ObfuscatedName("UNPPHFRC.f")
	public BEGVKNAP field1296;

	@ObfuscatedName("UNPPHFRC.a")
	public int field1291;

	@ObfuscatedName("UNPPHFRC.b")
	public int field1292;

	public UNPPHFRC(int arg0) {
		field1294 = arg0;
		field1295 = arg0;
		field1296 = new BEGVKNAP(1024);
	}

	@ObfuscatedName("UNPPHFRC.a(J)LYCAZQYJA;")
	public YCAZQYJA method531(long arg0) {
		YCAZQYJA var3 = (YCAZQYJA) field1296.method36(arg0);
		if (var3 == null) {
			field1291++;
		} else {
			field1297.method356(var3);
			field1292++;
		}

		return var3;
	}

	@ObfuscatedName("UNPPHFRC.a(ZJLYCAZQYJA;)V")
	public void method532(long arg0, YCAZQYJA arg1) {
		if (field1295 == 0) {
			YCAZQYJA var4 = field1297.method357();
			var4.method205();
			var4.method583();

			if (field1293 == var4) {
				YCAZQYJA var5 = field1297.method357();
				var5.method205();
				var5.method583();
			}
		} else {
			field1295--;
		}

		field1296.method37(arg0, arg1);
		field1297.method356(arg1);
	}

	@ObfuscatedName("UNPPHFRC.a()V")
	public void method533() {
		while (true) {
			YCAZQYJA var1 = field1297.method357();
			if (var1 == null) {
				field1295 = field1294;
				return;
			}

			var1.method205();
			var1.method583();
		}
	}
}
