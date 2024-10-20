package deob;

@ObfuscatedName("cm")
public class class101 extends class198 {

    @ObfuscatedName("cm.j")
    public class86[] field1718;

    @ObfuscatedName("ez.j(Lfh;Lfh;IZB)Lcm;")
    public static class101 method2883(class161 arg0, class161 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method2988(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method3000(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method3000(0, var8);
                } else {
                    var9 = arg1.method3000(var8, 0);
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
            return new class101(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class101(class161 arg0, class161 arg1, int arg2, boolean arg3) {
        class193 var5 = new class193();
        int var6 = arg0.method3008(arg2);
        this.field1718 = new class86[var6];
        int[] var7 = arg0.method2988(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2995(arg2, var7[var8]);
            class100 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class100 var12 = (class100) var5.method3490(); var12 != null; var12 = (class100) var5.method3492()) {
                if (var12.field1707 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3000(0, var11);
                } else {
                    var13 = arg1.method3000(var11, 0);
                }
                var10 = new class100(var11, var13);
                var5.method3485(var10);
            }
            this.field1718[var7[var8]] = new class86(var9, var10);
        }
    }

    @ObfuscatedName("cm.y(IB)Z")
    public boolean method2159(int arg0) {
        return this.field1718[arg0].field1503;
    }
}
