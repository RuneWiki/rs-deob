package deob;

@ObfuscatedName("IJIEJOTK")
public class IJIEJOTK implements Runnable {

	@ObfuscatedName("IJIEJOTK.b")
	public boolean field719 = true;

	@ObfuscatedName("IJIEJOTK.c")
	public int[] field720 = new int[500];

	@ObfuscatedName("IJIEJOTK.e")
	public int[] field722 = new int[500];

	@ObfuscatedName("IJIEJOTK.f")
	public Object field723 = new Object();

	@ObfuscatedName("IJIEJOTK.d")
	public client field721;

	@ObfuscatedName("IJIEJOTK.a")
	public int field718;

	public void run() {
		while (field719) {
			synchronized (field723) {
				if (field718 < 500) {
					field722[field718] = field721.field964;
					field720[field718] = field721.field965;
					field718++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}

	public IJIEJOTK(client arg0) {
		field721 = arg0;
	}
}
