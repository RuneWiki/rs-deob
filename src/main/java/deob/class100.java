package deob;

@ObfuscatedName("cn")
public class class100 implements Runnable {

    @ObfuscatedName("cn.f")
    public volatile class98[] field1388 = new class98[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class98 var2 = this.field1388[var1];
                if (var2 != null) {
                    var2.method2094();
                }
            }
        } catch (Exception var4) {
            class155.method2919((String) null, var4);
        }
    }
}
