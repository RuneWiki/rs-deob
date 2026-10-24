package deob;

@ObfuscatedName("ZRJULOYY")
public class ZRJULOYY implements Runnable {

	@ObfuscatedName("ZRJULOYY.c")
	public int[] field1503 = new int[500];

	@ObfuscatedName("ZRJULOYY.e")
	public int[] field1505 = new int[500];

	@ObfuscatedName("ZRJULOYY.f")
	public boolean field1506 = true;

	@ObfuscatedName("ZRJULOYY.g")
	public Object field1507 = new Object();

	@ObfuscatedName("ZRJULOYY.d")
	public client field1504;

	@ObfuscatedName("ZRJULOYY.b")
	public int field1502;

	public ZRJULOYY(client arg0) {
		field1504 = arg0;
	}

	public void run() {
		while (field1506) {
			synchronized (field1507) {
				if (field1502 < 500) {
					field1503[field1502] = field1504.field1216;
					field1505[field1502] = field1504.field1217;
					field1502++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
