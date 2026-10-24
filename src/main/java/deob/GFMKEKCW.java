package deob;

@ObfuscatedName("GFMKEKCW")
public class GFMKEKCW implements Runnable {

	@ObfuscatedName("GFMKEKCW.a")
	public boolean field564 = true;

	@ObfuscatedName("GFMKEKCW.b")
	public int[] field565 = new int[500];

	@ObfuscatedName("GFMKEKCW.c")
	public Object field566 = new Object();

	@ObfuscatedName("GFMKEKCW.d")
	public int[] field567 = new int[500];

	@ObfuscatedName("GFMKEKCW.g")
	public client field569;

	@ObfuscatedName("GFMKEKCW.f")
	public int field568;

	public void run() {
		while (field564) {
			synchronized (field566) {
				if (field568 < 500) {
					field567[field568] = field569.field513;
					field565[field568] = field569.field514;
					field568++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}

	public GFMKEKCW(client arg0) {
		field569 = arg0;
	}
}
