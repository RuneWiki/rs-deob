package deob;

@ObfuscatedName("dk")
public class class106 implements Runnable {

    @ObfuscatedName("dk.f")
    public volatile class104[] field1399 = new class104[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class104 var2 = this.field1399[var1];
                if (var2 != null) {
                    var2.method2233();
                }
            }
        } catch (Exception var4) {
            class341.method5815((String) null, var4);
        }
    }
}
