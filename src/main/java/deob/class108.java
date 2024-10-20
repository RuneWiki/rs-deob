package deob;

@ObfuscatedName("dg")
public class class108 implements Runnable {

    @ObfuscatedName("dg.q")
    public volatile class106[] field1439 = new class106[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class106 var2 = this.field1439[var1];
                if (var2 != null) {
                    var2.method2225();
                }
            }
        } catch (Exception var4) {
            class342.method4173((String) null, var4);
        }
    }
}
