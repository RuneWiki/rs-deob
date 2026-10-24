package deob;

@ObfuscatedName("XSRHTFUZ")
public class XSRHTFUZ implements Runnable {

	@ObfuscatedName("XSRHTFUZ.a")
	public boolean field1387 = true;

	@ObfuscatedName("XSRHTFUZ.c")
	public Object field1389 = new Object();

	@ObfuscatedName("XSRHTFUZ.e")
	public int[] field1390 = new int[500];

	@ObfuscatedName("XSRHTFUZ.f")
	public int[] field1391 = new int[500];

	@ObfuscatedName("XSRHTFUZ.g")
	public client field1392;

	@ObfuscatedName("XSRHTFUZ.b")
	public int field1388;

	public void run() {
		while (field1387) {
			synchronized (field1389) {
				if (field1388 < 500) {
					field1390[field1388] = field1392.field1184;
					field1391[field1388] = field1392.field1185;
					field1388++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}

	public XSRHTFUZ(client arg0) {
		field1392 = arg0;
	}
}
