import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class427 extends class742 {

    @OriginalMember(owner = "client!no", name = "t", descriptor = "I")
    public int field6148;

    @OriginalMember(owner = "client!no", name = "v", descriptor = "I")
    public int field6142;

    @OriginalMember(owner = "client!no", name = "s", descriptor = "I")
    public int field6147;

    @OriginalMember(owner = "client!no", name = "q", descriptor = "I")
    public int field6144;

    @OriginalMember(owner = "client!no", name = "A", descriptor = "I")
    public int field6143;

    @OriginalMember(owner = "client!no", name = "u", descriptor = "I")
    public int field6151;

    @OriginalMember(owner = "client!no", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field6152 = new String[] { method3305(method3304("\u0011mt%e")), method3305(method3304("\u000466g")), method3305(method3304("\u0004,tJ0")), method3305(method3304("\u0004,t7q\u0004*.50")), method3305(method3304("\u0004,tH0")), method3305(method3304("\u0004,tI0")) };

    @OriginalMember(owner = "client!no", name = "w", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!no", name = "r", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!no", name = "x", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!no", name = "z", descriptor = "Lha;")
    public static class18 field6149;

    @OriginalMember(owner = "client!no", name = "y", descriptor = "Ljava/lang/String;")
    public static String field6150;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(I)V")
    public static void method3302(int arg0) {
        try {
            field6149 = null;
            field6150 = null;
            if (arg0 != 0) {
                field6145 = 94;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6152[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(III[BIII)Z")
    public static final boolean method3303(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        try {
            field6146++;
            int var7 = arg2 % arg6;
            int var8;
            if (arg1 == var7) {
                var8 = 0;
            } else {
                var8 = arg6 - var7;
            }
            int var9 = -((arg5 + arg6 - 1) / arg6);
            int var10 = -((arg2 + arg6 - 1) / arg6);
            for (int var11 = var9; var11 < 0; var11++) {
                for (int var12 = var10; var12 < 0; var12++) {
                    if (arg3[arg4] == 0) {
                        return true;
                    }
                    arg4 += arg6;
                }
                arg4 -= var8;
                if (arg3[arg4 - 1] == 0) {
                    return true;
                }
                arg4 += arg0;
            }
            return false;
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field6152[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field6152[1] : field6152[0]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lrj;Lmq;IIIIIIIIIIIII)V")
    public class427(class252 arg0, class657 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        try {
            this.field6148 = arg11;
            this.field6142 = arg14;
            this.field6147 = arg10;
            this.field6144 = arg12;
            this.field6143 = arg13;
            this.field6151 = arg9;
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field6152[3] + (arg0 == null ? field6152[1] : field6152[0]) + ',' + (arg1 == null ? field6152[1] : field6152[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ')');
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)Luu;")
    public class240 method482(int arg0) {
        try {
            if (arg0 != 0) {
                method3302(11);
            }
            field6141++;
            return class314.field4301;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6152[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!no", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3304(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x18);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!no", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3305(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 106;
                    break;
                case 1:
                    var10005 = 67;
                    break;
                case 2:
                    var10005 = 90;
                    break;
                case 3:
                    var10005 = 11;
                    break;
                default:
                    var10005 = 24;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
