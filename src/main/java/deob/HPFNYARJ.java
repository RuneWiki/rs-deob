package deob;

@ObfuscatedName("HPFNYARJ")
public final class HPFNYARJ {

	@ObfuscatedName("HPFNYARJ.f")
	public EEYSIGWL field760 = new EEYSIGWL();

	@ObfuscatedName("HPFNYARJ.j")
	public EOXICPMP field764 = new EOXICPMP();

	@ObfuscatedName("HPFNYARJ.g")
	public int field761;

	@ObfuscatedName("HPFNYARJ.h")
	public int field762;

	@ObfuscatedName("HPFNYARJ.i")
	public ECQQOXBD field763;

	@ObfuscatedName("HPFNYARJ.d")
	public int field758;

	@ObfuscatedName("HPFNYARJ.e")
	public int field759;

	public HPFNYARJ(int arg0) {
		field761 = arg0;
		field762 = arg0;
		field763 = new ECQQOXBD(1024);
	}

	@ObfuscatedName("HPFNYARJ.a(J)LEEYSIGWL;")
	public EEYSIGWL method302(long arg0) {
		EEYSIGWL var3 = (EEYSIGWL) field763.method209(arg0);
		if (var3 == null) {
			field758++;
		} else {
			field764.method219(var3);
			field759++;
		}

		return var3;
	}

	@ObfuscatedName("HPFNYARJ.a(JILEEYSIGWL;)V")
	public void method303(long arg0, EEYSIGWL arg1) {
		if (field762 == 0) {
			EEYSIGWL var4 = field764.method220();
			var4.method471();
			var4.method215();

			if (field760 == var4) {
				EEYSIGWL var5 = field764.method220();
				var5.method471();
				var5.method215();
			}
		} else {
			field762--;
		}

		field763.method210(arg0, arg1);
		field764.method219(arg1);
	}

	@ObfuscatedName("HPFNYARJ.a()V")
	public void method304() {
		while (true) {
			EEYSIGWL var1 = field764.method220();
			if (var1 == null) {
				field762 = field761;
				return;
			}

			var1.method471();
			var1.method215();
		}
	}
}
