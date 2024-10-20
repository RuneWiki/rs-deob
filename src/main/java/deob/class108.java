package deob;

@ObfuscatedName("dl")
public class class108 implements Runnable {

    @ObfuscatedName("dl.c")
    public volatile class106[] field1425 = new class106[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class106 var2 = this.field1425[var1];
                if (var2 != null) {
                    var2.method2290();
                }
            }
        } catch (Exception var4) {
            Statics.method3817((String) null, var4);
        }
    }
}
