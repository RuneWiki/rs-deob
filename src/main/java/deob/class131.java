package deob;

@ObfuscatedName("ec")
public class class131 extends class207 {

    @ObfuscatedName("ec.w")
    public class118[] field1826;

    @ObfuscatedName("di.w(Liv;Liv;IZI)Lec;")
    public static class131 method2686(class248 arg0, class248 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method4272(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method4258(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method4258(0, var8);
                } else {
                    var9 = arg1.method4258(var8, 0);
                }
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        if (!var4) {
            return null;
        }
        try {
            return new class131(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class131(class248 arg0, class248 arg1, int arg2, boolean arg3) {
        class206 var5 = new class206();
        int var6 = arg0.method4262(arg2);
        this.field1826 = new class118[var6];
        int[] var7 = arg0.method4272(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method4250(arg2, var7[var8]);
            class125 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class125 var12 = (class125) var5.method3797(); var12 != null; var12 = (class125) var5.method3788()) {
                if (var12.field1739 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method4258(0, var11);
                } else {
                    var13 = arg1.method4258(var11, 0);
                }
                var10 = new class125(var11, var13);
                var5.method3810(var10);
            }
            this.field1826[var7[var8]] = new class118(var9, var10);
        }
    }

    @ObfuscatedName("ec.m(II)Z")
    public boolean method2865(int arg0) {
        return this.field1826[arg0].field1576;
    }
}
