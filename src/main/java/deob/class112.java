package deob;

@ObfuscatedName("dx")
public class class112 implements Runnable {

    @ObfuscatedName("dx.a")
    public volatile class110[] field1654 = new class110[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class110 var2 = this.field1654[var1];
                if (var2 != null) {
                    var2.method1823();
                }
            }
        } catch (Exception var4) {
            class153.method683((String) null, var4);
        }
    }
}
