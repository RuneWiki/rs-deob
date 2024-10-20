package deob;

@ObfuscatedName("du")
public class class111 implements Runnable {

    @ObfuscatedName("du.a")
    public volatile class109[] field1556 = new class109[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class109 var2 = this.field1556[var1];
                if (var2 != null) {
                    var2.method1844();
                }
            }
        } catch (Exception var4) {
            class155.method1339((String) null, var4);
        }
    }
}
