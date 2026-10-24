package deob;

@ObfuscatedName("ZZMUCPQP")
public class ZZMUCPQP implements Runnable {

	@ObfuscatedName("ZZMUCPQP.a")
	public int[] field1482 = new int[500];

	@ObfuscatedName("ZZMUCPQP.d")
	public int[] field1484 = new int[500];

	@ObfuscatedName("ZZMUCPQP.e")
	public Object field1485 = new Object();

	@ObfuscatedName("ZZMUCPQP.f")
	public boolean field1486 = true;

	@ObfuscatedName("ZZMUCPQP.b")
	public client field1483;

	@ObfuscatedName("ZZMUCPQP.g")
	public int field1487;

	public ZZMUCPQP(client arg0) {
		field1483 = arg0;
	}

	public void run() {
		while (field1486) {
			synchronized (field1485) {
				if (field1487 < 500) {
					field1484[field1487] = field1483.field514;
					field1482[field1487] = field1483.field515;
					field1487++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
