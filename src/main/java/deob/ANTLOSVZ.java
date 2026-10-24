package deob;

@ObfuscatedName("ANTLOSVZ")
public class ANTLOSVZ implements Runnable {

	@ObfuscatedName("ANTLOSVZ.b")
	public int[] field112 = new int[500];

	@ObfuscatedName("ANTLOSVZ.d")
	public Object field114 = new Object();

	@ObfuscatedName("ANTLOSVZ.e")
	public int[] field115 = new int[500];

	@ObfuscatedName("ANTLOSVZ.f")
	public boolean field116 = true;

	@ObfuscatedName("ANTLOSVZ.a")
	public client field111;

	@ObfuscatedName("ANTLOSVZ.c")
	public int field113;

	public ANTLOSVZ(client arg0) {
		field111 = arg0;
	}

	public void run() {
		while (field116) {
			synchronized (field114) {
				if (field113 < 500) {
					field115[field113] = field111.field903;
					field112[field113] = field111.field904;
					field113++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
