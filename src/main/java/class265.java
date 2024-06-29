import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class265 extends class384 {

    @OriginalMember(owner = "client!sr", name = "w", descriptor = "I")
    public int field4049;

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "I")
    public int field4048;

    @OriginalMember(owner = "client!sr", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4057 = new String[] { method2217(method2216("`\u000eM\u000fr")), method2217(method2216("}\t\u000f\"")), method2217(method2216("`\u000eMr3}\u0015\u0017pr")), method2217(method2216("hRM`'")), method2217(method2216("`\u000eM\fr")) };

    @OriginalMember(owner = "client!sr", name = "q", descriptor = "Lel;")
    public static class573 field4053 = new class573(109, 4);

    @OriginalMember(owner = "client!sr", name = "u", descriptor = "Lli;")
    public static class451 field4054 = new class451();

    @OriginalMember(owner = "client!sr", name = "r", descriptor = "Lef;")
    public static class513 field4056 = new class513();

    @OriginalMember(owner = "client!sr", name = "s", descriptor = "D")
    public static double field4050;

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!sr", name = "t", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!sr", name = "v", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)Lvaa;")
    public final class494 method1226(int arg0) {
        try {
            field4051++;
            int var2 = 9 / ((57 - arg0) / 61);
            return class235.field3540;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4057[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Llk;Lvea;IIIIIIIIII)V")
    public class265(class613 arg0, class288 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        try {
            this.field4049 = arg11;
            this.field4048 = arg10;
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field4057[2] + (arg0 == null ? field4057[1] : field4057[3]) + ',' + (arg1 == null ? field4057[1] : field4057[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(I)V")
    public static void method2215(int arg0) {
        try {
            field4053 = null;
            field4056 = null;
            if (arg0 <= 32) {
                method2215(49);
            }
            field4054 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4057[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2216(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2217(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 19;
                    break;
                case 1:
                    var10005 = 124;
                    break;
                case 2:
                    var10005 = 99;
                    break;
                case 3:
                    var10005 = 78;
                    break;
                default:
                    var10005 = 90;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
