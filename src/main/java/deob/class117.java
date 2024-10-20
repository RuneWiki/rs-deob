package deob;

@ObfuscatedName("dg")
public class class117 implements Runnable {

    @ObfuscatedName("dg.m")
    public volatile class115[] field1466 = new class115[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class115 var2 = this.field1466[var1];
                if (var2 != null) {
                    var2.method2358();
                }
            }
        } catch (Exception var4) {
            class351.method3425((String) null, var4);
        }
    }
}
