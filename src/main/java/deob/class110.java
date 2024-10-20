package deob;

@ObfuscatedName("dw")
public class class110 implements Runnable {

    @ObfuscatedName("dw.d")
    public volatile class108[] field1587 = new class108[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class108 var2 = this.field1587[var1];
                if (var2 != null) {
                    var2.method2082();
                }
            }
        } catch (Exception var4) {
            class165.method2426((String) null, var4);
        }
    }
}
