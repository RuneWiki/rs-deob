package deob;

@ObfuscatedName("STTRNURD")
public final class STTRNURD {

	@ObfuscatedName("STTRNURD.b")
	public int field1130;

	@ObfuscatedName("STTRNURD.c")
	public ZSZDCWXM[] field1131;

	public STTRNURD(int arg0) {
		field1130 = arg0;
		field1131 = new ZSZDCWXM[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			ZSZDCWXM var3 = field1131[var2] = new ZSZDCWXM();
			var3.field1486 = var3;
			var3.field1487 = var3;
		}
	}

	@ObfuscatedName("STTRNURD.a(J)LZSZDCWXM;")
	public ZSZDCWXM method414(long arg0) {
		ZSZDCWXM var3 = field1131[(int) (arg0 & field1130 - 1)];
		for (ZSZDCWXM var4 = var3.field1486; var4 != var3; var4 = var4.field1486) {
			if (var4.field1485 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("STTRNURD.a(JLZSZDCWXM;I)V")
	public void method415(long arg0, ZSZDCWXM arg1) {
		if (arg1.field1487 != null) {
			arg1.method589();
		}

		ZSZDCWXM var4 = field1131[(int) (arg0 & field1130 - 1)];
		arg1.field1487 = var4.field1487;
		arg1.field1486 = var4;
		arg1.field1487.field1486 = arg1;
		arg1.field1486.field1487 = arg1;
		arg1.field1485 = arg0;
	}
}
