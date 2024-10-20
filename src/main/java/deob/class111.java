package deob;

@ObfuscatedName("dm")
public class class111 implements Runnable {

    @ObfuscatedName("dm.m")
    public volatile class109[] field1581 = new class109[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class109 var2 = this.field1581[var1];
                if (var2 != null) {
                    var2.method1933();
                }
            }
        } catch (Exception var4) {
            class154.method355((String) null, var4);
        }
    }
}
