package deob;

@ObfuscatedName("dp")
public class class110 extends class176 {

    @ObfuscatedName("dp.e")
    public class98[] field1820;

    public class110(class155 arg0, class155 arg1, int arg2, boolean arg3) {
        class179 var5 = new class179();
        int var6 = arg0.method3019(arg2);
        this.field1820 = new class98[var6];
        int[] var7 = arg0.method3029(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3069(arg2, var7[var8]);
            class106 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class106 var12 = (class106) var5.method3331(); var12 != null; var12 = (class106) var5.method3333()) {
                if (var12.field1783 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3026(0, var11);
                } else {
                    var13 = arg1.method3026(var11, 0);
                }
                var10 = new class106(var11, var13);
                var5.method3328(var10);
            }
            this.field1820[var7[var8]] = new class98(var9, var10);
        }
    }

    @ObfuscatedName("dp.e(IB)Z")
    public boolean method2221(int arg0) {
        return this.field1820[arg0].field1626;
    }
}
