package deob;

@ObfuscatedName("dt")
public class class117 implements Runnable {

    @ObfuscatedName("dt.h")
    public volatile class115[] field1456 = new class115[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class115 var2 = this.field1456[var1];
                if (var2 != null) {
                    var2.method2337();
                }
            }
        } catch (Exception var4) {
            class352.method3694((String) null, var4);
        }
    }
}
