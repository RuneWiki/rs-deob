package deob;

@ObfuscatedName("cx")
public class class104 extends class205 {

    @ObfuscatedName("cx.s")
    public class89[] field1779;

    public class104(class168 arg0, class168 arg1, int arg2, boolean arg3) {
        class200 var5 = new class200();
        int var6 = arg0.method3024(arg2);
        this.field1779 = new class89[var6];
        int[] var7 = arg0.method3056(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3014(arg2, var7[var8]);
            class103 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class103 var12 = (class103) var5.method3553(); var12 != null; var12 = (class103) var5.method3558()) {
                if (var12.field1771 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3058(0, var11);
                } else {
                    var13 = arg1.method3058(var11, 0);
                }
                var10 = new class103(var11, var13);
                var5.method3548(var10);
            }
            this.field1779[var7[var8]] = new class89(var9, var10);
        }
    }

    @ObfuscatedName("cx.s(IB)Z")
    public boolean method2137(int arg0) {
        return this.field1779[arg0].field1555;
    }
}
