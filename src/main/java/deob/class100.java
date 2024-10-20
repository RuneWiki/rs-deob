package deob;

@ObfuscatedName("cc")
public class class100 implements Runnable {

    @ObfuscatedName("cc.y")
    public volatile class98[] field1382 = new class98[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class98 var2 = this.field1382[var1];
                if (var2 != null) {
                    var2.method2041();
                }
            }
        } catch (Exception var4) {
            class155.method917((String) null, var4);
        }
    }
}
