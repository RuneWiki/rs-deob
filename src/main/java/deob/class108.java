package deob;

@ObfuscatedName("da")
public class class108 implements Runnable {

    @ObfuscatedName("da.s")
    public volatile class106[] field1417 = new class106[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class106 var2 = this.field1417[var1];
                if (var2 != null) {
                    var2.method2208();
                }
            }
        } catch (Exception var4) {
            class341.method40((String) null, var4);
        }
    }
}
