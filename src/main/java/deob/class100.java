package deob;

@ObfuscatedName("ce")
public class class100 implements Runnable {

    @ObfuscatedName("ce.f")
    public volatile class98[] field1374 = new class98[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class98 var2 = this.field1374[var1];
                if (var2 != null) {
                    var2.method2040();
                }
            }
        } catch (Exception var4) {
            class155.method1834((String) null, var4);
        }
    }
}
