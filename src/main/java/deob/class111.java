package deob;

@ObfuscatedName("db")
public class class111 implements Runnable {

    @ObfuscatedName("db.n")
    public volatile class109[] field1573 = new class109[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class109 var2 = this.field1573[var1];
                if (var2 != null) {
                    var2.method1915();
                }
            }
        } catch (Exception var4) {
            class155.method4721((String) null, var4);
        }
    }
}
