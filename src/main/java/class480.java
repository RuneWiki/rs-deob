import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class480 {

    @OriginalMember(owner = "client!td", name = "e", descriptor = "Z")
    public boolean field7308;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7314 = new String[] { method3667(method3666("G\rm^+")), method3667(method3666("G\rm#j]\u00007!+")), method3667(method3666("G\rm]+")), method3667(method3666("G\rm\\+")), method3667(method3666("G\rm[+")), method3667(method3666("G\rmZ+")) };

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field7302 = 0;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "Ljava/lang/String;")
    public static String field7309 = null;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "Lvn;")
    public static class330 field7303 = new class330(73, 3);

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field7310;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "Llp;")
    public class414 field7312;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "Llp;")
    public class414 field7313;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Lgda;")
    public static class58 field7311;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "Z")
    public boolean field7306;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)Z", line = 3)
    public final boolean method3661(int arg0) {
        try {
            field7304++;
            if (arg0 != 0) {
                field7303 = null;
            }
            return this.field7306 && !this.field7308;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7314[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIIII)Z", line = 14)
    public static final boolean method3662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            field7305++;
            if (arg0 >= arg6 + arg7 || (arg0 + arg2) <= arg6) {
                return false;
            } else if (arg1 + arg5 > arg4 && arg4 + arg3 > arg5) {
                if (arg8 != 73) {
                    field7303 = null;
                }
                return true;
            } else {
                return false;
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field7314[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)[Lmp;", line = 33)
    public static final class796[] method3663(byte arg0) {
        try {
            if (arg0 < 17) {
                return null;
            } else {
                field7310++;
                return new class796[] { class710.field10281, class763.field11195, class545.field8024, class206.field3218, class495.field7438, class106.field1528, class685.field9909 };
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7314[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 46)
    public static void method3664(int arg0) {
        try {
            field7303 = null;
            field7309 = null;
            int var1 = -81 / ((arg0 + 23) / 50);
            field7311 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7314[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V", line = 60)
    public final void method3665(byte arg0) {
        try {
            field7307++;
            if (arg0 < 19) {
                this.field7306 = true;
            }
            if (this.field7313 != null) {
                this.field7313.method981(1328);
            }
            this.field7306 = false;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7314[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Z)V", line = 83)
    public class480(boolean arg0) {
        try {
            this.field7308 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7314[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!td", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3666(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!td", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3667(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 51;
                    break;
                case 1:
                    var10005 = 105;
                    break;
                case 2:
                    var10005 = 67;
                    break;
                case 3:
                    var10005 = 31;
                    break;
                default:
                    var10005 = 3;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
