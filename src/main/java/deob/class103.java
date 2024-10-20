package deob;

@ObfuscatedName("cv")
public class class103 extends class204 {

    @ObfuscatedName("cv.n")
    public class88[] field1753;

    public class103(class167 arg0, class167 arg1, int arg2, boolean arg3) {
        class199 var5 = new class199();
        int var6 = arg0.method3030(arg2);
        this.field1753 = new class88[var6];
        int[] var7 = arg0.method3085(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3094(arg2, var7[var8]);
            class102 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class102 var12 = (class102) var5.method3549(); var12 != null; var12 = (class102) var5.method3550()) {
                if (var12.field1744 == var11) {
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
                var10 = new class102(var11, var13);
                var5.method3544(var10);
            }
            this.field1753[var7[var8]] = new class88(var9, var10);
        }
    }

    @ObfuscatedName("cv.n(IB)Z")
    public boolean method2156(int arg0) {
        return this.field1753[arg0].field1534;
    }
}
