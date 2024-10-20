package deob;

@ObfuscatedName("dn")
public class class108 implements Runnable {

    @ObfuscatedName("dn.z")
    public volatile class106[] field1416 = new class106[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class106 var2 = this.field1416[var1];
                if (var2 != null) {
                    var2.method2221();
                }
            }
        } catch (Exception var4) {
            class341.method511((String) null, var4);
        }
    }
}
