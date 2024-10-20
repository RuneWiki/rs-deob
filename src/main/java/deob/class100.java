package deob;

@ObfuscatedName("cu")
public class class100 implements Runnable {

    @ObfuscatedName("cu.g")
    public volatile class98[] field1392 = new class98[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class98 var2 = this.field1392[var1];
                if (var2 != null) {
                    var2.method2209();
                }
            }
        } catch (Exception var4) {
            class155.method1917((String) null, var4);
        }
    }
}
