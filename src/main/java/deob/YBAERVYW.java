package deob;

@ObfuscatedName("YBAERVYW")
public class YBAERVYW implements Runnable {

	@ObfuscatedName("YBAERVYW.b")
	public boolean field1462 = true;

	@ObfuscatedName("YBAERVYW.d")
	public int[] field1463 = new int[500];

	@ObfuscatedName("YBAERVYW.e")
	public Object field1464 = new Object();

	@ObfuscatedName("YBAERVYW.f")
	public int[] field1465 = new int[500];

	@ObfuscatedName("YBAERVYW.a")
	public client field1461;

	@ObfuscatedName("YBAERVYW.g")
	public int field1466;

	public void run() {
		while (field1462) {
			synchronized (field1464) {
				if (field1466 < 500) {
					field1465[field1466] = field1461.field650;
					field1463[field1466] = field1461.field651;
					field1466++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}

	public YBAERVYW(client arg0) {
		field1461 = arg0;
	}
}
