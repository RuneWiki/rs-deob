package deob;

@ObfuscatedName("YMDQNWFI")
public class YMDQNWFI implements Runnable {

	@ObfuscatedName("YMDQNWFI.a")
	public int[] field1415 = new int[500];

	@ObfuscatedName("YMDQNWFI.b")
	public boolean field1416 = true;

	@ObfuscatedName("YMDQNWFI.e")
	public Object field1419 = new Object();

	@ObfuscatedName("YMDQNWFI.f")
	public int[] field1420 = new int[500];

	@ObfuscatedName("YMDQNWFI.c")
	public client field1417;

	@ObfuscatedName("YMDQNWFI.d")
	public int field1418;

	public void run() {
		while (field1416) {
			synchronized (field1419) {
				if (field1418 < 500) {
					field1420[field1418] = field1417.field1056;
					field1415[field1418] = field1417.field1057;
					field1418++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}

	public YMDQNWFI(client arg0) {
		field1417 = arg0;
	}
}
