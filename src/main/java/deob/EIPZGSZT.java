package deob;

@ObfuscatedName("EIPZGSZT")
public class EIPZGSZT implements Runnable {

	@ObfuscatedName("EIPZGSZT.a")
	public int[] field558 = new int[500];

	@ObfuscatedName("EIPZGSZT.b")
	public int[] field559 = new int[500];

	@ObfuscatedName("EIPZGSZT.c")
	public Object field560 = new Object();

	@ObfuscatedName("EIPZGSZT.e")
	public boolean field562 = true;

	@ObfuscatedName("EIPZGSZT.d")
	public client field561;

	@ObfuscatedName("EIPZGSZT.f")
	public int field563;

	public EIPZGSZT(client arg0) {
		field561 = arg0;
	}

	public void run() {
		while (field562) {
			synchronized (field560) {
				if (field563 < 500) {
					field559[field563] = field561.field1397;
					field558[field563] = field561.field1398;
					field563++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
