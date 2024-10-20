package deob;

@ObfuscatedName("dv")
public class class109 extends class174 {

    @ObfuscatedName("dv.x")
    public class97[] field1789;

    public class109(class152 arg0, class152 arg1, int arg2, boolean arg3) {
        class177 var5 = new class177();
        int var6 = arg0.method2929(arg2);
        this.field1789 = new class97[var6];
        int[] var7 = arg0.method2982(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2920(arg2, var7[var8]);
            class105 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class105 var12 = (class105) var5.method3280(); var12 != null; var12 = (class105) var5.method3269()) {
                if (var12.field1762 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2922(0, var11);
                } else {
                    var13 = arg1.method2922(var11, 0);
                }
                var10 = new class105(var11, var13);
                var5.method3264(var10);
            }
            this.field1789[var7[var8]] = new class97(var9, var10);
        }
    }

    @ObfuscatedName("dv.x(II)Z")
    public boolean method2169(int arg0) {
        return this.field1789[arg0].field1604;
    }
}
