package deob;

@ObfuscatedName("dw")
public class class108 extends class173 {

    @ObfuscatedName("dw.u")
    public class96[] field1800;

    public class108(class151 arg0, class151 arg1, int arg2, boolean arg3) {
        class176 var5 = new class176();
        int var6 = arg0.method2975(arg2);
        this.field1800 = new class96[var6];
        int[] var7 = arg0.method2974(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2965(arg2, var7[var8]);
            class104 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class104 var12 = (class104) var5.method3326(); var12 != null; var12 = (class104) var5.method3330()) {
                if (var12.field1768 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2971(0, var11);
                } else {
                    var13 = arg1.method2971(var11, 0);
                }
                var10 = new class104(var11, var13);
                var5.method3323(var10);
            }
            this.field1800[var7[var8]] = new class96(var9, var10);
        }
    }

    @ObfuscatedName("dw.u(IB)Z")
    public boolean method2213(int arg0) {
        return this.field1800[arg0].field1600;
    }
}
