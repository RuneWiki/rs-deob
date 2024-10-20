package deob;

@ObfuscatedName("da")
public class class111 implements Runnable {

    @ObfuscatedName("da.s")
    public volatile class109[] field1576 = new class109[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class109 var2 = this.field1576[var1];
                if (var2 != null) {
                    var2.method2121();
                }
            }
        } catch (Exception var4) {
            class155.method73((String) null, var4);
        }
    }
}
