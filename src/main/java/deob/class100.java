package deob;

@ObfuscatedName("dx")
public class class100 implements Runnable {

	@ObfuscatedName("dx.af")
	public volatile class98[] field1371 = new class98[2];

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; var1++) {
				class98 var2 = this.field1371[var1];
				if (var2 != null) {
					var2.method2979();
				}
			}
		} catch (Exception var4) {
			class617.method9413(null, var4);
		}
	}
}
