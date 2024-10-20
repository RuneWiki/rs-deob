package deob;

@ObfuscatedName("dj")
public class class110 implements Runnable {

    @ObfuscatedName("dj.w")
    public volatile class108[] field1649 = new class108[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class108 var2 = this.field1649[var1];
                if (var2 != null) {
                    var2.method1914();
                }
            }
        } catch (Exception var4) {
            class153.method611((String) null, var4);
        }
    }
}
