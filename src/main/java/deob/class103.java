package deob;

@ObfuscatedName("cz")
public class class103 extends class204 {

    @ObfuscatedName("cz.f")
    public class88[] field1772;

    public class103(class167 arg0, class167 arg1, int arg2, boolean arg3) {
        class199 var5 = new class199();
        int var6 = arg0.method3047(arg2);
        this.field1772 = new class88[var6];
        int[] var7 = arg0.method3046(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3038(arg2, var7[var8]);
            class102 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class102 var12 = (class102) var5.method3566(); var12 != null; var12 = (class102) var5.method3567()) {
                if (var12.field1759 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3044(0, var11);
                } else {
                    var13 = arg1.method3044(var11, 0);
                }
                var10 = new class102(var11, var13);
                var5.method3559(var10);
            }
            this.field1772[var7[var8]] = new class88(var9, var10);
        }
    }

    @ObfuscatedName("cz.f(IB)Z")
    public boolean method2154(int arg0) {
        return this.field1772[arg0].field1550;
    }
}
