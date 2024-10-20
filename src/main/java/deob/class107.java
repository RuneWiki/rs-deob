package deob;

@ObfuscatedName("dr")
public class class107 extends class208 {

    @ObfuscatedName("dr.f")
    public class92[] field1835;

    public class107(class171 arg0, class171 arg1, int arg2, boolean arg3) {
        class203 var5 = new class203();
        int var6 = arg0.method3124(arg2);
        this.field1835 = new class92[var6];
        int[] var7 = arg0.method3114(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3107(arg2, var7[var8]);
            class106 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class106 var12 = (class106) var5.method3646(); var12 != null; var12 = (class106) var5.method3648()) {
                if (var12.field1831 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3095(0, var11);
                } else {
                    var13 = arg1.method3095(var11, 0);
                }
                var10 = new class106(var11, var13);
                var5.method3642(var10);
            }
            this.field1835[var7[var8]] = new class92(var9, var10);
        }
    }

    @ObfuscatedName("dr.e(II)Z")
    public boolean method2191(int arg0) {
        return this.field1835[arg0].field1596;
    }
}
