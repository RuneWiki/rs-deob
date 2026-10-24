package deob;

@ObfuscatedName("ZZGAIEMG")
public final class ZZGAIEMG {

	@ObfuscatedName("ZZGAIEMG.e")
	public int field1514;

	@ObfuscatedName("ZZGAIEMG.f")
	public CZLFLPZK[] field1515;

	public ZZGAIEMG(int arg0) {
		field1514 = arg0;
		field1515 = new CZLFLPZK[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			CZLFLPZK var3 = field1515[var2] = new CZLFLPZK();
			var3.field563 = var3;
			var3.field564 = var3;
		}
	}

	@ObfuscatedName("ZZGAIEMG.a(J)LCZLFLPZK;")
	public CZLFLPZK method601(long arg0) {
		CZLFLPZK var3 = field1515[(int) (arg0 & field1514 - 1)];
		for (CZLFLPZK var4 = var3.field563; var4 != var3; var4 = var4.field563) {
			if (var4.field562 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("ZZGAIEMG.a(IJLCZLFLPZK;)V")
	public void method602(long arg0, CZLFLPZK arg1) {
		if (arg1.field564 != null) {
			arg1.method163();
		}

		CZLFLPZK var4 = field1515[(int) (arg0 & field1514 - 1)];
		arg1.field564 = var4.field564;
		arg1.field563 = var4;
		arg1.field564.field563 = arg1;
		arg1.field563.field564 = arg1;
		arg1.field562 = arg0;
	}
}
