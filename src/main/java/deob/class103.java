package deob;

@ObfuscatedName("ca")
public class class103 extends class204 {

    @ObfuscatedName("ca.c")
    public class88[] field1745;

    public class103(class167 arg0, class167 arg1, int arg2, boolean arg3) {
        class199 var5 = new class199();
        int var6 = arg0.method3046(arg2);
        this.field1745 = new class88[var6];
        int[] var7 = arg0.method3003(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2994(arg2, var7[var8]);
            class102 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class102 var12 = (class102) var5.method3558(); var12 != null; var12 = (class102) var5.method3554()) {
                if (var12.field1736 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3000(0, var11);
                } else {
                    var13 = arg1.method3000(var11, 0);
                }
                var10 = new class102(var11, var13);
                var5.method3585(var10);
            }
            this.field1745[var7[var8]] = new class88(var9, var10);
        }
    }

    @ObfuscatedName("ca.c(II)Z")
    public boolean method2083(int arg0) {
        return this.field1745[arg0].field1520;
    }
}
