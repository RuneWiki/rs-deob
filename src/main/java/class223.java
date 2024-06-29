import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class223 {

    @OriginalMember(owner = "client!cea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3505 = new String[] { method1965(method1964("bB$#{)")), method1965(method1964("bB$#y)")), method1965(method1964("z\tk#G")), method1965(method1964("oR)a")), method1965(method1964("bB$#x)")), method1965(method1964("bB$#~)")) };

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "J")
    public static volatile long field3500 = 0L;

    @OriginalMember(owner = "client!cea", name = "h", descriptor = "Liha;")
    public static class29 field3499 = new class29(260);

    @OriginalMember(owner = "client!cea", name = "g", descriptor = "I")
    public static int field3504 = 0;

    @OriginalMember(owner = "client!cea", name = "e", descriptor = "I")
    public static int field3502 = -2;

    @OriginalMember(owner = "client!cea", name = "f", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!cea", name = "d", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "Lrm;")
    public static class433 field3498;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(B)V", line = 4)
    public static void method1960(byte arg0) {
        try {
            field3499 = null;
            field3498 = null;
            int var1 = -64 / ((-arg0 - 8) / 43);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3505[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lrga;I)Z", line = 14)
    public static final boolean method1961(class250 arg0, int arg1) {
        try {
            field3497++;
            if (arg1 < 11) {
                field3504 = -52;
            }
            return arg0 == null ? false : class213.method1919(arg0.field3825, -42, arg0.field3838 - arg0.field3836, arg0.field3823, arg0.field3833 - arg0.field3825, arg0.field3836, arg0.field3830 - arg0.field3823);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3505[4] + (arg0 == null ? field3505[3] : field3505[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIIII)Z", line = 33)
    public static final boolean method1962(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field3501++;
            if ((class224.field3519[0][arg4][arg3] & 0x2) != 0) {
                return true;
            } else if ((class224.field3519[arg0][arg4][arg3] & 0x10) == 0) {
                int var5 = 0 / ((arg1 + 41) / 48);
                return arg2 == class386.method3150(arg0, arg3, -70, arg4);
            } else {
                return false;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field3505[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(I)V", line = 55)
    public static final void method1963(int arg0) {
        try {
            field3503++;
            if (arg0 != -1) {
                method1963(83);
            }
            for (class10 var1 = (class10) class702.field10091.method3228(11); var1 != null; var1 = (class10) class702.field10091.method3216(true)) {
                if (var1.field117) {
                    var1.method4173(-1);
                } else {
                    var1.field122 = true;
                    if (var1.field114 >= 0 && var1.field116 >= 0 && class126.field1823 > var1.field114 && class169.field2725 > var1.field116) {
                        class337.method2844(var1, (byte) -80);
                    }
                }
            }
            for (class10 var2 = (class10) class344.field5596.method3228(11); var2 != null; var2 = (class10) class344.field5596.method3216(true)) {
                if (var2.field117) {
                    var2.method4173(arg0);
                } else {
                    var2.field122 = true;
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3505[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1964(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1965(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 1;
                    break;
                case 1:
                    var10005 = 39;
                    break;
                case 2:
                    var10005 = 69;
                    break;
                case 3:
                    var10005 = 13;
                    break;
                default:
                    var10005 = 58;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
