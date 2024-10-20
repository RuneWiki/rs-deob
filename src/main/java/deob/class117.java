package deob;

@ObfuscatedName("dz")
public class class117 implements Runnable {

    @ObfuscatedName("dz.f")
    public volatile class115[] field1471 = new class115[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class115 var2 = this.field1471[var1];
                if (var2 != null) {
                    var2.method2367();
                }
            }
        } catch (Exception var4) {
            class352.method2205((String) null, var4);
        }
    }
}
