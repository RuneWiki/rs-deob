package deob;

@ObfuscatedName("dh")
public class class117 implements Runnable {

    @ObfuscatedName("dh.x")
    public volatile class115[] field1457 = new class115[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class115 var2 = this.field1457[var1];
                if (var2 != null) {
                    var2.method2328();
                }
            }
        } catch (Exception var4) {
            class351.method3842((String) null, var4);
        }
    }
}
