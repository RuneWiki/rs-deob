package deob;

@ObfuscatedName("co")
public class class104 extends class205 {

    @ObfuscatedName("co.w")
    public class89[] field1781;

    public class104(class168 arg0, class168 arg1, int arg2, boolean arg3) {
        class200 var5 = new class200();
        int var6 = arg0.method3122(arg2);
        this.field1781 = new class89[var6];
        int[] var7 = arg0.method3124(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3127(arg2, var7[var8]);
            class103 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class103 var12 = (class103) var5.method3585(); var12 != null; var12 = (class103) var5.method3590()) {
                if (var12.field1778 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3086(0, var11);
                } else {
                    var13 = arg1.method3086(var11, 0);
                }
                var10 = new class103(var11, var13);
                var5.method3583(var10);
            }
            this.field1781[var7[var8]] = new class89(var9, var10);
        }
    }

    @ObfuscatedName("co.w(II)Z")
    public boolean method2152(int arg0) {
        return this.field1781[arg0].field1554;
    }
}
