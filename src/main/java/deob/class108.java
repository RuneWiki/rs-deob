package deob;

@ObfuscatedName("dq")
public class class108 extends class172 {

    @ObfuscatedName("dq.g")
    public class96[] field1789;

    public class108(class150 arg0, class150 arg1, int arg2, boolean arg3) {
        class175 var5 = new class175();
        int var6 = arg0.method3033(arg2);
        this.field1789 = new class96[var6];
        int[] var7 = arg0.method3031(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3012(arg2, var7[var8]);
            class104 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class104 var12 = (class104) var5.method3382(); var12 != null; var12 = (class104) var5.method3388()) {
                if (var12.field1761 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3018(0, var11);
                } else {
                    var13 = arg1.method3018(var11, 0);
                }
                var10 = new class104(var11, var13);
                var5.method3379(var10);
            }
            this.field1789[var7[var8]] = new class96(var9, var10);
        }
    }

    @ObfuscatedName("dq.g(II)Z")
    public boolean method2246(int arg0) {
        return this.field1789[arg0].field1622;
    }
}
