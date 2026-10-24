package deob;

@ObfuscatedName("JHNSGCOV")
public class JHNSGCOV implements Runnable {

	@ObfuscatedName("JHNSGCOV.b")
	public int[] field841 = new int[500];

	@ObfuscatedName("JHNSGCOV.c")
	public int[] field842 = new int[500];

	@ObfuscatedName("JHNSGCOV.d")
	public boolean field843 = true;

	@ObfuscatedName("JHNSGCOV.f")
	public Object field845 = new Object();

	@ObfuscatedName("JHNSGCOV.e")
	public client field844;

	@ObfuscatedName("JHNSGCOV.g")
	public int field846;

	public JHNSGCOV(client arg0) {
		field844 = arg0;
	}

	public void run() {
		while (field843) {
			synchronized (field845) {
				if (field846 < 500) {
					field841[field846] = field844.field825;
					field842[field846] = field844.field826;
					field846++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
