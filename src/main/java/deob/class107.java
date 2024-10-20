package deob;

@ObfuscatedName("dz")
public class class107 extends class208 {

    @ObfuscatedName("dz.m")
    public class92[] field1842;

    public class107(class171 arg0, class171 arg1, int arg2, boolean arg3) {
        class203 var5 = new class203();
        int var6 = arg0.method3099(arg2);
        this.field1842 = new class92[var6];
        int[] var7 = arg0.method3135(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3086(arg2, var7[var8]);
            class106 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class106 var12 = (class106) var5.method3621(); var12 != null; var12 = (class106) var5.method3630()) {
                if (var12.field1830 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3092(0, var11);
                } else {
                    var13 = arg1.method3092(var11, 0);
                }
                var10 = new class106(var11, var13);
                var5.method3616(var10);
            }
            this.field1842[var7[var8]] = new class92(var9, var10);
        }
    }

    @ObfuscatedName("dz.m(II)Z")
    public boolean method2214(int arg0) {
        return this.field1842[arg0].field1616;
    }
}
