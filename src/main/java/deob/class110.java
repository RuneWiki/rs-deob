package deob;

@ObfuscatedName("dq")
public class class110 implements Runnable {

    @ObfuscatedName("dq.g")
    public volatile class108[] field1568 = new class108[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class108 var2 = this.field1568[var1];
                if (var2 != null) {
                    var2.method2173();
                }
            }
        } catch (Exception var4) {
            class165.method4257((String) null, var4);
        }
    }
}
