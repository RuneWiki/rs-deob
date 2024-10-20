package deob;

@ObfuscatedName("dx")
public class class106 implements Runnable {

    @ObfuscatedName("dx.m")
    public volatile class104[] field1393 = new class104[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class104 var2 = this.field1393[var1];
                if (var2 != null) {
                    var2.method2222();
                }
            }
        } catch (Exception var4) {
            class166.method4746((String) null, var4);
        }
    }
}
