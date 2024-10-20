package deob;

@ObfuscatedName("dc")
public class class111 implements Runnable {

    @ObfuscatedName("dc.d")
    public volatile class109[] field1580 = new class109[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class109 var2 = this.field1580[var1];
                if (var2 != null) {
                    var2.method1944();
                }
            }
        } catch (Exception var4) {
            class154.method1684((String) null, var4);
        }
    }
}
