package deob;

@ObfuscatedName("df")
public class class108 extends class173 {

    @ObfuscatedName("df.p")
    public class96[] field1825;

    @ObfuscatedName("ac.p(Ler;Ler;IZI)Ldf;")
    public static class108 method644(class151 arg0, class151 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method2972(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method2919(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method2919(0, var8);
                } else {
                    var9 = arg1.method2919(var8, 0);
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

    public class108(class151 arg0, class151 arg1, int arg2, boolean arg3) {
        class176 var5 = new class176();
        int var6 = arg0.method2923(arg2);
        this.field1825 = new class96[var6];
        int[] var7 = arg0.method2972(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2973(arg2, var7[var8]);
            class104 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class104 var12 = (class104) var5.method3285(); var12 != null; var12 = (class104) var5.method3299()) {
                if (var12.field1794 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2919(0, var11);
                } else {
                    var13 = arg1.method2919(var11, 0);
                }
                var10 = new class104(var11, var13);
                var5.method3305(var10);
            }
            this.field1825[var7[var8]] = new class96(var9, var10);
        }
    }

    @ObfuscatedName("df.j(IB)Z")
    public boolean method2158(int arg0) {
        return this.field1825[arg0].field1644;
    }
}
