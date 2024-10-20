package deob;

@ObfuscatedName("dj")
public class class111 implements Runnable {

    @ObfuscatedName("dj.b")
    public volatile class109[] field1571 = new class109[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class109 var2 = this.field1571[var1];
                if (var2 != null) {
                    var2.method1907();
                }
            }
        } catch (Exception var4) {
            class154.method607((String) null, var4);
        }
    }
}
