package deob;

@ObfuscatedName("dx")
public class class111 implements Runnable {

    @ObfuscatedName("dx.i")
    public volatile class109[] field1667 = new class109[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class109 var2 = this.field1667[var1];
                if (var2 != null) {
                    var2.method1881();
                }
            }
        } catch (Exception var4) {
            class154.method2746((String) null, var4);
        }
    }
}
