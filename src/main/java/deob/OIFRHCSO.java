package deob;

@ObfuscatedName("OIFRHCSO")
public class OIFRHCSO implements Runnable {

	@ObfuscatedName("OIFRHCSO.a")
	public boolean field1099 = true;

	@ObfuscatedName("OIFRHCSO.b")
	public Object field1100 = new Object();

	@ObfuscatedName("OIFRHCSO.c")
	public int[] field1101 = new int[500];

	@ObfuscatedName("OIFRHCSO.f")
	public int[] field1104 = new int[500];

	@ObfuscatedName("OIFRHCSO.d")
	public client field1102;

	@ObfuscatedName("OIFRHCSO.e")
	public int field1103;

	public OIFRHCSO(client arg0) {
		field1102 = arg0;
	}

	public void run() {
		while (field1099) {
			synchronized (field1100) {
				if (field1103 < 500) {
					field1101[field1103] = field1102.field29;
					field1104[field1103] = field1102.field30;
					field1103++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
