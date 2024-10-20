package deob;

@ObfuscatedName("dx")
public class class113 implements Runnable {

    @ObfuscatedName("dx.j")
    public volatile class111[] field1668 = new class111[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class111 var2 = this.field1668[var1];
                if (var2 != null) {
                    var2.method1870();
                }
            }
        } catch (Exception var4) {
            Statics.method1698((String) null, var4);
        }
    }
}
