package deob;

@ObfuscatedName("MHZWCOLS")
public class MHZWCOLS implements Runnable {

	@ObfuscatedName("MHZWCOLS.c")
	public int[] field1153 = new int[500];

	@ObfuscatedName("MHZWCOLS.d")
	public boolean field1154 = true;

	@ObfuscatedName("MHZWCOLS.e")
	public int[] field1155 = new int[500];

	@ObfuscatedName("MHZWCOLS.g")
	public Object field1156 = new Object();

	@ObfuscatedName("MHZWCOLS.a")
	public client field1151;

	@ObfuscatedName("MHZWCOLS.b")
	public int field1152;

	public void run() {
		while (field1154) {
			synchronized (field1156) {
				if (field1152 < 500) {
					field1153[field1152] = field1151.field72;
					field1155[field1152] = field1151.field73;
					field1152++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}

	public MHZWCOLS(client arg0) {
		field1151 = arg0;
	}
}
