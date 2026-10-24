package deob;

@ObfuscatedName("GAUMGPFH")
public class GAUMGPFH implements Runnable {

	@ObfuscatedName("GAUMGPFH.a")
	public int[] field646 = new int[500];

	@ObfuscatedName("GAUMGPFH.b")
	public Object field647 = new Object();

	@ObfuscatedName("GAUMGPFH.d")
	public int[] field649 = new int[500];

	@ObfuscatedName("GAUMGPFH.e")
	public boolean field650 = true;

	@ObfuscatedName("GAUMGPFH.c")
	public client field648;

	@ObfuscatedName("GAUMGPFH.f")
	public int field651;

	public void run() {
		while (field650) {
			synchronized (field647) {
				if (field651 < 500) {
					field649[field651] = field648.field879;
					field646[field651] = field648.field880;
					field651++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}

	public GAUMGPFH(client arg0) {
		field648 = arg0;
	}
}
