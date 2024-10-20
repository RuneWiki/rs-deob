package deob;

@ObfuscatedName("cj")
public class class100 implements Runnable {

    @ObfuscatedName("cj.v")
    public volatile class98[] field1377 = new class98[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class98 var2 = this.field1377[var1];
                if (var2 != null) {
                    var2.method2041();
                }
            }
        } catch (Exception var4) {
            class155.method2337((String) null, var4);
        }
    }
}
