package deob;

@ObfuscatedName("dp")
public class class117 implements Runnable {

    @ObfuscatedName("dp.n")
    public volatile class115[] field1459 = new class115[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class115 var2 = this.field1459[var1];
                if (var2 != null) {
                    var2.method2431();
                }
            }
        } catch (Exception var4) {
            class352.method4617((String) null, var4);
        }
    }
}
