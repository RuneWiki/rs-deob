package deob;

@ObfuscatedName("dm")
public class class108 implements Runnable {

    @ObfuscatedName("dm.c")
    public volatile class106[] field1405 = new class106[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class106 var2 = this.field1405[var1];
                if (var2 != null) {
                    var2.method2266();
                }
            }
        } catch (Exception var4) {
            class341.method3361((String) null, var4);
        }
    }
}
