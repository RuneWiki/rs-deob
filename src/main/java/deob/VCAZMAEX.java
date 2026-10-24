package deob;

@ObfuscatedName("VCAZMAEX")
public class VCAZMAEX implements Runnable {

	@ObfuscatedName("VCAZMAEX.b")
	public int[] field1409 = new int[500];

	@ObfuscatedName("VCAZMAEX.d")
	public int[] field1411 = new int[500];

	@ObfuscatedName("VCAZMAEX.e")
	public boolean field1412 = true;

	@ObfuscatedName("VCAZMAEX.h")
	public Object field1414 = new Object();

	@ObfuscatedName("VCAZMAEX.c")
	public client field1410;

	@ObfuscatedName("VCAZMAEX.g")
	public int field1413;

	public void run() {
		while (field1412) {
			synchronized (field1414) {
				if (field1413 < 500) {
					field1411[field1413] = field1410.field82;
					field1409[field1413] = field1410.field83;
					field1413++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}

	public VCAZMAEX(client arg0) {
		field1410 = arg0;
	}
}
