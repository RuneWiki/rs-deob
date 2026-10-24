package deob;

@ObfuscatedName("EKUSXTUB")
public class EKUSXTUB implements Runnable {

	@ObfuscatedName("EKUSXTUB.b")
	public Object field567 = new Object();

	@ObfuscatedName("EKUSXTUB.c")
	public int[] field568 = new int[500];

	@ObfuscatedName("EKUSXTUB.f")
	public boolean field570 = true;

	@ObfuscatedName("EKUSXTUB.g")
	public int[] field571 = new int[500];

	@ObfuscatedName("EKUSXTUB.d")
	public client field569;

	@ObfuscatedName("EKUSXTUB.a")
	public int field566;

	public void run() {
		while (field570) {
			synchronized (field567) {
				if (field566 < 500) {
					field568[field566] = field569.field942;
					field571[field566] = field569.field943;
					field566++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}

	public EKUSXTUB(client arg0) {
		field569 = arg0;
	}
}
