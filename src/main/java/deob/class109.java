package deob;

@ObfuscatedName("df")
public class class109 implements Runnable {

    @ObfuscatedName("df.p")
    public volatile class107[] field1549 = new class107[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class107 var2 = this.field1549[var1];
                if (var2 != null) {
                    var2.method2040();
                }
            }
        } catch (Exception var4) {
            class155.method1770((String) null, var4);
        }
    }
}
