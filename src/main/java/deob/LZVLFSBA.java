package deob;

@ObfuscatedName("LZVLFSBA")
public class LZVLFSBA implements Runnable {

	@ObfuscatedName("LZVLFSBA.a")
	public int[] field933 = new int[500];

	@ObfuscatedName("LZVLFSBA.b")
	public int[] field934 = new int[500];

	@ObfuscatedName("LZVLFSBA.c")
	public Object field935 = new Object();

	@ObfuscatedName("LZVLFSBA.f")
	public boolean field938 = true;

	@ObfuscatedName("LZVLFSBA.e")
	public client field937;

	@ObfuscatedName("LZVLFSBA.d")
	public int field936;

	public void run() {
		while (field938) {
			synchronized (field935) {
				if (field936 < 500) {
					field934[field936] = field937.field483;
					field933[field936] = field937.field484;
					field936++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}

	public LZVLFSBA(client arg0) {
		field937 = arg0;
	}
}
