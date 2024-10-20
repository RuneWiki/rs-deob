package deob;

@ObfuscatedName("dv")
public class class109 extends class174 {

    @ObfuscatedName("dv.a")
    public class97[] field1819;

    @ObfuscatedName("ci.a(Leb;Leb;IZI)Ldv;")
    public static class109 method1812(class152 arg0, class152 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method2946(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method2976(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method2976(0, var8);
                } else {
                    var9 = arg1.method2976(var8, 0);
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
            return new class109(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class109(class152 arg0, class152 arg1, int arg2, boolean arg3) {
        class177 var5 = new class177();
        int var6 = arg0.method2947(arg2);
        this.field1819 = new class97[var6];
        int[] var7 = arg0.method2946(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2961(arg2, var7[var8]);
            class105 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class105 var12 = (class105) var5.method3252(); var12 != null; var12 = (class105) var5.method3268()) {
                if (var12.field1787 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2976(0, var11);
                } else {
                    var13 = arg1.method2976(var11, 0);
                }
                var10 = new class105(var11, var13);
                var5.method3247(var10);
            }
            this.field1819[var7[var8]] = new class97(var9, var10);
        }
    }

    @ObfuscatedName("dv.x(IS)Z")
    public boolean method2151(int arg0) {
        return this.field1819[arg0].field1638;
    }
}
