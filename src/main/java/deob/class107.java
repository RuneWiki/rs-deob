package deob;

@ObfuscatedName("du")
public class class107 extends class208 {

    @ObfuscatedName("du.x")
    public class92[] field1833;

    @ObfuscatedName("cx.x(Lfp;Lfp;IZB)Ldu;")
    public static class107 method1819(class171 arg0, class171 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method3078(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method3084(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method3084(0, var8);
                } else {
                    var9 = arg1.method3084(var8, 0);
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
        int var6 = arg0.method3088(arg2);
        this.field1833 = new class92[var6];
        int[] var7 = arg0.method3078(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3079(arg2, var7[var8]);
            class106 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class106 var12 = (class106) var5.method3600(); var12 != null; var12 = (class106) var5.method3602()) {
                if (var12.field1821 == var11) {
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
                var10 = new class106(var11, var13);
                var5.method3594(var10);
            }
            this.field1833[var7[var8]] = new class92(var9, var10);
        }
    }

    @ObfuscatedName("du.r(IB)Z")
    public boolean method2211(int arg0) {
        return this.field1833[arg0].field1592;
    }
}
