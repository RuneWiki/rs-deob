package deob;

@ObfuscatedName("ds")
public class class112 implements Runnable {

    @ObfuscatedName("ds.w")
    public volatile class110[] field1668 = new class110[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class110 var2 = this.field1668[var1];
                if (var2 != null) {
                    var2.method1818();
                }
            }
        } catch (Exception var4) {
            class154.method2730((String) null, var4);
        }
    }
}
