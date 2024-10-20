package deob;

@ObfuscatedName("du")
public class class108 extends class172 {

    @ObfuscatedName("du.j")
    public class96[] field1805;

    public class108(class150 arg0, class150 arg1, int arg2, boolean arg3) {
        class175 var5 = new class175();
        int var6 = arg0.method2913(arg2);
        this.field1805 = new class96[var6];
        int[] var7 = arg0.method2952(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2903(arg2, var7[var8]);
            class104 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class104 var12 = (class104) var5.method3279(); var12 != null; var12 = (class104) var5.method3249()) {
                if (var12.field1769 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2909(0, var11);
                } else {
                    var13 = arg1.method2909(var11, 0);
                }
                var10 = new class104(var11, var13);
                var5.method3283(var10);
            }
            this.field1805[var7[var8]] = new class96(var9, var10);
        }
    }

    @ObfuscatedName("du.y(II)Z")
    public boolean method2150(int arg0) {
        return this.field1805[arg0].field1623;
    }
}
