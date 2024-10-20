package deob;

@ObfuscatedName("cl")
public class class104 extends class205 {

    @ObfuscatedName("cl.a")
    public class89[] field1771;

    @ObfuscatedName("a.a(Lft;Lft;IZI)Lcl;")
    public static class104 method1(class168 arg0, class168 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method3153(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method3217(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method3217(0, var8);
                } else {
                    var9 = arg1.method3217(var8, 0);
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
            return new class104(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class104(class168 arg0, class168 arg1, int arg2, boolean arg3) {
        class200 var5 = new class200();
        int var6 = arg0.method3157(arg2);
        this.field1771 = new class89[var6];
        int[] var7 = arg0.method3153(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3188(arg2, var7[var8]);
            class103 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class103 var12 = (class103) var5.method3665(); var12 != null; var12 = (class103) var5.method3641()) {
                if (var12.field1764 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3217(0, var11);
                } else {
                    var13 = arg1.method3217(var11, 0);
                }
                var10 = new class103(var11, var13);
                var5.method3639(var10);
            }
            this.field1771[var7[var8]] = new class89(var9, var10);
        }
    }

    @ObfuscatedName("cl.w(II)Z")
    public boolean method2240(int arg0) {
        return this.field1771[arg0].field1551;
    }
}
