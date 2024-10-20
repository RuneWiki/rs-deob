package deob;

@ObfuscatedName("cx")
public class class103 extends class204 {

    @ObfuscatedName("cx.o")
    public class88[] field1767;

    public class103(class167 arg0, class167 arg1, int arg2, boolean arg3) {
        class199 var5 = new class199();
        int var6 = arg0.method2973(arg2);
        this.field1767 = new class88[var6];
        int[] var7 = arg0.method2983(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3030(arg2, var7[var8]);
            class102 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class102 var12 = (class102) var5.method3520(); var12 != null; var12 = (class102) var5.method3522()) {
                if (var12.field1763 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2980(0, var11);
                } else {
                    var13 = arg1.method2980(var11, 0);
                }
                var10 = new class102(var11, var13);
                var5.method3515(var10);
            }
            this.field1767[var7[var8]] = new class88(var9, var10);
        }
    }

    @ObfuscatedName("cx.o(II)Z")
    public boolean method2080(int arg0) {
        return this.field1767[arg0].field1532;
    }
}
