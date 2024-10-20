package deob;

@ObfuscatedName("dz")
public class class109 {

    public class109() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bw.r(Lby;I)V")
    public static void method816(class62 arg0) {
        Statics.field1514 = arg0;
    }

    @ObfuscatedName("bp.d(Lev;Ljava/lang/String;B)I")
    public static int method911(class135 arg0, String arg1) {
        int var2 = arg0.field1729;
        byte[] var3 = class84.method1231(arg1);
        arg0.method1598(var3.length);
        arg0.field1729 += Statics.field1514.method819(var3, 0, var3.length, arg0.field1732, arg0.field1729);
        return arg0.field1729 - var2;
    }

    @ObfuscatedName("ca.l(Lev;I)Ljava/lang/String;")
    public static String method1035(class135 arg0) {
        String var4;
        try {
            int var1 = arg0.method1640();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field1729 += Statics.field1514.method818(arg0.field1732, arg0.field1729, var2, 0, var1);
            String var3 = class84.method2397(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
