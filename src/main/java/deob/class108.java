package deob;

@ObfuscatedName("dw")
public class class108 extends class172 {

    @ObfuscatedName("dw.c")
    public class96[] field1798;

    @ObfuscatedName("av.c(Lew;Lew;IZI)Ldw;")
    public static class108 method581(class150 arg0, class150 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method2830(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method2827(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method2827(0, var8);
                } else {
                    var9 = arg1.method2827(var8, 0);
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
        int var6 = arg0.method2866(arg2);
        this.field1798 = new class96[var6];
        int[] var7 = arg0.method2830(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2821(arg2, var7[var8]);
            class104 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class104 var12 = (class104) var5.method3145(); var12 != null; var12 = (class104) var5.method3154()) {
                if (var12.field1767 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2827(0, var11);
                } else {
                    var13 = arg1.method2827(var11, 0);
                }
                var10 = new class104(var11, var13);
                var5.method3147(var10);
            }
            this.field1798[var7[var8]] = new class96(var9, var10);
        }
    }

    @ObfuscatedName("dw.j(IB)Z")
    public boolean method2097(int arg0) {
        return this.field1798[arg0].field1597;
    }
}
