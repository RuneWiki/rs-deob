package deob;

@ObfuscatedName("ds")
public class class108 extends class173 {

    @ObfuscatedName("ds.v")
    public class96[] field1808;

    public class108(class151 arg0, class151 arg1, int arg2, boolean arg3) {
        class176 var5 = new class176();
        int var6 = arg0.method2971(arg2);
        this.field1808 = new class96[var6];
        int[] var7 = arg0.method2970(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3020(arg2, var7[var8]);
            class104 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class104 var12 = (class104) var5.method3294(); var12 != null; var12 = (class104) var5.method3296()) {
                if (var12.field1780 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3025(0, var11);
                } else {
                    var13 = arg1.method3025(var11, 0);
                }
                var10 = new class104(var11, var13);
                var5.method3316(var10);
            }
            this.field1808[var7[var8]] = new class96(var9, var10);
        }
    }

    @ObfuscatedName("ds.v(IB)Z")
    public boolean method2231(int arg0) {
        return this.field1808[arg0].field1616;
    }
}
