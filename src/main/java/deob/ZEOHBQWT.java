package deob;

@ObfuscatedName("ZEOHBQWT")
public class ZEOHBQWT implements Runnable {

	@ObfuscatedName("ZEOHBQWT.a")
	public int[] field1460 = new int[500];

	@ObfuscatedName("ZEOHBQWT.b")
	public boolean field1461 = true;

	@ObfuscatedName("ZEOHBQWT.c")
	public int[] field1462 = new int[500];

	@ObfuscatedName("ZEOHBQWT.g")
	public Object field1465 = new Object();

	@ObfuscatedName("ZEOHBQWT.e")
	public client field1463;

	@ObfuscatedName("ZEOHBQWT.f")
	public int field1464;

	public ZEOHBQWT(client arg0) {
		field1463 = arg0;
	}

	public void run() {
		while (field1461) {
			synchronized (field1465) {
				if (field1464 < 500) {
					field1460[field1464] = field1463.field17;
					field1462[field1464] = field1463.field18;
					field1464++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
