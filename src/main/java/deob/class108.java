package deob;

@ObfuscatedName("dx")
public class class108 extends class172 {

    @ObfuscatedName("dx.z")
    public class96[] field1799;

    @ObfuscatedName("au.z(Len;Len;IZI)Ldx;")
    public static class108 method562(class150 arg0, class150 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method2964(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method2957(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method2957(0, var8);
                } else {
                    var9 = arg1.method2957(var8, 0);
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
            return new class108(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class108(class150 arg0, class150 arg1, int arg2, boolean arg3) {
        class175 var5 = new class175();
        int var6 = arg0.method2961(arg2);
        this.field1799 = new class96[var6];
        int[] var7 = arg0.method2964(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2951(arg2, var7[var8]);
            class104 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class104 var12 = (class104) var5.method3317(); var12 != null; var12 = (class104) var5.method3310()) {
                if (var12.field1766 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2957(0, var11);
                } else {
                    var13 = arg1.method2957(var11, 0);
                }
                var10 = new class104(var11, var13);
                var5.method3303(var10);
            }
            this.field1799[var7[var8]] = new class96(var9, var10);
        }
    }

    @ObfuscatedName("dx.h(IB)Z")
    public boolean method2191(int arg0) {
        return this.field1799[arg0].field1622;
    }
}
