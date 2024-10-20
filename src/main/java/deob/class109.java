package deob;

@ObfuscatedName("de")
public class class109 extends class175 {

    @ObfuscatedName("de.l")
    public class97[] field1797;

    public class109(class154 arg0, class154 arg1, int arg2, boolean arg3) {
        class178 var5 = new class178();
        int var6 = arg0.method3074(arg2);
        this.field1797 = new class97[var6];
        int[] var7 = arg0.method3038(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3029(arg2, var7[var8]);
            class105 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class105 var12 = (class105) var5.method3343(); var12 != null; var12 = (class105) var5.method3328()) {
                if (var12.field1764 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3084(0, var11);
                } else {
                    var13 = arg1.method3084(var11, 0);
                }
                var10 = new class105(var11, var13);
                var5.method3321(var10);
            }
            this.field1797[var7[var8]] = new class97(var9, var10);
        }
    }

    @ObfuscatedName("de.l(II)Z")
    public boolean method2205(int arg0) {
        return this.field1797[arg0].field1620;
    }
}
