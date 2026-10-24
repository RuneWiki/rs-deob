package deob;

@ObfuscatedName("NZNLPNYM")
public class NZNLPNYM implements Runnable {

	@ObfuscatedName("NZNLPNYM.b")
	public int[] field890 = new int[500];

	@ObfuscatedName("NZNLPNYM.c")
	public int[] field891 = new int[500];

	@ObfuscatedName("NZNLPNYM.d")
	public boolean field892 = true;

	@ObfuscatedName("NZNLPNYM.e")
	public Object field893 = new Object();

	@ObfuscatedName("NZNLPNYM.g")
	public client field894;

	@ObfuscatedName("NZNLPNYM.a")
	public int field889;

	public NZNLPNYM(client arg0) {
		field894 = arg0;
	}

	public void run() {
		while (field892) {
			synchronized (field893) {
				if (field889 < 500) {
					field891[field889] = field894.field814;
					field890[field889] = field894.field815;
					field889++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
