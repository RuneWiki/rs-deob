package deob;

@ObfuscatedName("ew")
public class class131 extends class207 {

    @ObfuscatedName("ew.z")
    public class118[] field1803;

    public class131(class248 arg0, class248 arg1, int arg2, boolean arg3) {
        class206 var5 = new class206();
        int var6 = arg0.method4258(arg2);
        this.field1803 = new class118[var6];
        int[] var7 = arg0.method4290(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method4247(arg2, var7[var8]);
            class125 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class125 var12 = (class125) var5.method3790(); var12 != null; var12 = (class125) var5.method3771()) {
                if (var12.field1705 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method4298(0, var11);
                } else {
                    var13 = arg1.method4298(var11, 0);
                }
                var10 = new class125(var11, var13);
                var5.method3765(var10);
            }
            this.field1803[var7[var8]] = new class118(var9, var10);
        }
    }

    @ObfuscatedName("ew.z(II)Z")
    public boolean method2862(int arg0) {
        return this.field1803[arg0].field1553;
    }
}
