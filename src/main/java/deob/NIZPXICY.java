package deob;

@ObfuscatedName("NIZPXICY")
public class NIZPXICY implements Runnable {

	@ObfuscatedName("NIZPXICY.a")
	public boolean field976 = true;

	@ObfuscatedName("NIZPXICY.b")
	public int[] field977 = new int[500];

	@ObfuscatedName("NIZPXICY.d")
	public Object field979 = new Object();

	@ObfuscatedName("NIZPXICY.f")
	public int[] field981 = new int[500];

	@ObfuscatedName("NIZPXICY.c")
	public client field978;

	@ObfuscatedName("NIZPXICY.e")
	public int field980;

	public void run() {
		while (field976) {
			synchronized (field979) {
				if (field980 < 500) {
					field981[field980] = field978.field696;
					field977[field980] = field978.field697;
					field980++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}

	public NIZPXICY(client arg0) {
		field978 = arg0;
	}
}
