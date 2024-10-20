package deob;

@ObfuscatedName("dt")
public class class113 implements Runnable {

    @ObfuscatedName("dt.e")
    public volatile class111[] field1649 = new class111[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class111 var2 = this.field1649[var1];
                if (var2 != null) {
                    var2.method1892();
                }
            }
        } catch (Exception var4) {
            class154.method1592((String) null, var4);
        }
    }
}
