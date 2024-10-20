package deob;

@ObfuscatedName("dh")
public class class110 implements Runnable {

    @ObfuscatedName("dh.t")
    public volatile class108[] field1573 = new class108[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class108 var2 = this.field1573[var1];
                if (var2 != null) {
                    var2.method2049();
                }
            }
        } catch (Exception var4) {
            class165.method2453((String) null, var4);
        }
    }
}
