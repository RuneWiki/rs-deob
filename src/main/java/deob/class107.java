package deob;

@ObfuscatedName("dl")
public class class107 extends class208 {

    @ObfuscatedName("dl.l")
    public class92[] field1844;

    @ObfuscatedName("cn.l(Lfp;Lfp;IZI)Ldl;")
    public static class107 method2142(class171 arg0, class171 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method3194(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method3200(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method3200(0, var8);
                } else {
                    var9 = arg1.method3200(var8, 0);
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
            return new class107(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class107(class171 arg0, class171 arg1, int arg2, boolean arg3) {
        class203 var5 = new class203();
        int var6 = arg0.method3204(arg2);
        this.field1844 = new class92[var6];
        int[] var7 = arg0.method3194(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3210(arg2, var7[var8]);
            class106 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class106 var12 = (class106) var5.method3728(); var12 != null; var12 = (class106) var5.method3718()) {
                if (var12.field1839 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3200(0, var11);
                } else {
                    var13 = arg1.method3200(var11, 0);
                }
                var10 = new class106(var11, var13);
                var5.method3711(var10);
            }
            this.field1844[var7[var8]] = new class92(var9, var10);
        }
    }

    @ObfuscatedName("dl.g(II)Z")
    public boolean method2254(int arg0) {
        return this.field1844[arg0].field1617;
    }
}
