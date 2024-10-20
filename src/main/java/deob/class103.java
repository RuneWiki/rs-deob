package deob;

@ObfuscatedName("cz")
public class class103 extends class204 {

    @ObfuscatedName("cz.y")
    public class88[] field1761;

    @ObfuscatedName("dr.y(Lfu;Lfu;IZI)Lcz;")
    public static class103 method2618(class167 arg0, class167 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method3057(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method3020(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method3020(0, var8);
                } else {
                    var9 = arg1.method3020(var8, 0);
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
            return new class103(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class103(class167 arg0, class167 arg1, int arg2, boolean arg3) {
        class199 var5 = new class199();
        int var6 = arg0.method3050(arg2);
        this.field1761 = new class88[var6];
        int[] var7 = arg0.method3057(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3045(arg2, var7[var8]);
            class102 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class102 var12 = (class102) var5.method3493(); var12 != null; var12 = (class102) var5.method3495()) {
                if (var12.field1752 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3020(0, var11);
                } else {
                    var13 = arg1.method3020(var11, 0);
                }
                var10 = new class102(var11, var13);
                var5.method3488(var10);
            }
            this.field1761[var7[var8]] = new class88(var9, var10);
        }
    }

    @ObfuscatedName("cz.d(IB)Z")
    public boolean method2117(int arg0) {
        return this.field1761[arg0].field1539;
    }
}
