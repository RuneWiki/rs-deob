package deob;

@ObfuscatedName("dc")
public class class108 implements Runnable {

    @ObfuscatedName("dc.u")
    public volatile class106[] field1427 = new class106[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class106 var2 = this.field1427[var1];
                if (var2 != null) {
                    var2.method2236();
                }
            }
        } catch (Exception var4) {
            class341.method3640((String) null, var4);
        }
    }
}
