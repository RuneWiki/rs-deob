package deob;

@ObfuscatedName("UVFIVFPB")
public class UVFIVFPB implements Runnable {

	@ObfuscatedName("UVFIVFPB.a")
	public boolean field1337 = true;

	@ObfuscatedName("UVFIVFPB.c")
	public int[] field1338 = new int[500];

	@ObfuscatedName("UVFIVFPB.e")
	public int[] field1340 = new int[500];

	@ObfuscatedName("UVFIVFPB.g")
	public Object field1342 = new Object();

	@ObfuscatedName("UVFIVFPB.f")
	public client field1341;

	@ObfuscatedName("UVFIVFPB.d")
	public int field1339;

	public void run() {
		while (field1337) {
			synchronized (field1342) {
				if (field1339 < 500) {
					field1340[field1339] = field1341.field843;
					field1338[field1339] = field1341.field844;
					field1339++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}

	public UVFIVFPB(client arg0) {
		field1341 = arg0;
	}
}
