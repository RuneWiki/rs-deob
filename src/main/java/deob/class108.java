package deob;

@ObfuscatedName("dl")
public class class108 implements Runnable {

    @ObfuscatedName("dl.a")
    public volatile class106[] field1414 = new class106[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class106 var2 = this.field1414[var1];
                if (var2 != null) {
                    var2.method2347();
                }
            }
        } catch (Exception var4) {
            class341.method4728((String) null, var4);
        }
    }
}
