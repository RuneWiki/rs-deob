package deob;

@ObfuscatedName("CNFMYDSL")
public class CNFMYDSL implements Runnable {

	@ObfuscatedName("CNFMYDSL.c")
	public boolean field544 = true;

	@ObfuscatedName("CNFMYDSL.d")
	public Object field545 = new Object();

	@ObfuscatedName("CNFMYDSL.e")
	public int[] field546 = new int[500];

	@ObfuscatedName("CNFMYDSL.f")
	public int[] field547 = new int[500];

	@ObfuscatedName("CNFMYDSL.b")
	public client field543;

	@ObfuscatedName("CNFMYDSL.a")
	public int field542;

	public CNFMYDSL(client arg0) {
		field543 = arg0;
	}

	public void run() {
		while (field544) {
			synchronized (field545) {
				if (field542 < 500) {
					field546[field542] = field543.field789;
					field547[field542] = field543.field790;
					field542++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
