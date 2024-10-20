package deob;

@ObfuscatedName("dj")
public class class110 extends class176 {

    @ObfuscatedName("dj.i")
    public class98[] field1829;

    @ObfuscatedName("x.i(Leg;Leg;IZS)Ldj;")
    public static class110 method145(class155 arg0, class155 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method3052(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method3044(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method3044(0, var8);
                } else {
                    var9 = arg1.method3044(var8, 0);
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
            return new class110(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class110(class155 arg0, class155 arg1, int arg2, boolean arg3) {
        class179 var5 = new class179();
        int var6 = arg0.method3084(arg2);
        this.field1829 = new class98[var6];
        int[] var7 = arg0.method3052(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3043(arg2, var7[var8]);
            class106 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class106 var12 = (class106) var5.method3339(); var12 != null; var12 = (class106) var5.method3353()) {
                if (var12.field1799 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3044(0, var11);
                } else {
                    var13 = arg1.method3044(var11, 0);
                }
                var10 = new class106(var11, var13);
                var5.method3334(var10);
            }
            this.field1829[var7[var8]] = new class98(var9, var10);
        }
    }

    @ObfuscatedName("dj.b(II)Z")
    public boolean method2231(int arg0) {
        return this.field1829[arg0].field1654;
    }
}
