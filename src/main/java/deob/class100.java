package deob;

@ObfuscatedName("cw")
public class class100 implements Runnable {

    @ObfuscatedName("cw.c")
    public volatile class98[] field1391 = new class98[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class98 var2 = this.field1391[var1];
                if (var2 != null) {
                    var2.method2002();
                }
            }
        } catch (Exception var4) {
            class155.method1451((String) null, var4);
        }
    }
}
