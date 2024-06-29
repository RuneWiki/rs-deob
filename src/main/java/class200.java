import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class200 {

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field3279 = 0;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "[I")
    public static int[] field3283 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Lbg;")
    public static class218 field3286;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "Lra;")
    public static class336 field3287;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 5)
    public static final String method1463(String arg0, int arg1) {
        if (arg1 == 1097) {
            field3282++;
            int var2 = class248.method1760(arg0, false);
            return var2 == -1 ? "" : class270.method1927("<br>", (byte) -106, " ", class193.field3167.field4911[var2]);
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)Z", line = 26)
    public static final boolean method1464(int arg0, int arg1) {
        field3285++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class50.field686[arg1];
        int var3 = -80 % ((87 - arg0) / 33);
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1006;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)I", line = 58)
    public static int method1465(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IILlg;)V", line = 65)
    public static final void method1466(int arg0, int arg1, class132 arg2) {
        if (class48.field648 < arg2.field1978) {
            class343.method2368(97, arg2);
        } else if (class48.field648 <= arg2.field1975) {
            class158.method1094(arg2, 14854);
        } else {
            class170.method1159(-257, arg2);
        }
        if (arg2.field1980 < 128 || arg2.field1944 < 128 || arg2.field1980 >= 13184 || arg2.field1944 >= 13184) {
            arg2.field1978 = 0;
            arg2.field1975 = 0;
            arg2.field1968 = -1;
            arg2.field2022 = -1;
            arg2.field1980 = arg2.field1969[0] * 128 + (arg2.method910(-1) * 64);
            arg2.field1944 = arg2.field2006[0] * 128 + (arg2.method910(-1) * 64);
            arg2.method904(true);
        }
        field3284++;
        if (class13.field159 == arg2 && (arg2.field1980 < 1536 || arg2.field1944 < 1536 || arg2.field1980 >= 11776 || arg2.field1944 >= 11776)) {
            arg2.field1975 = 0;
            arg2.field2022 = -1;
            arg2.field1968 = -1;
            arg2.field1978 = 0;
            arg2.field1980 = arg2.field1969[0] * 128 + (arg2.method910(-1) * 64);
            arg2.field1944 = arg2.field2006[0] * 128 + arg2.method910(-1) * 64;
            arg2.method904(true);
        }
        class299.method2086(arg2, (byte) -30);
        if (arg0 > -125) {
            method1468(-44, (class39) null, -82, 87);
        }
        class246.method1753(-3279, arg2);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 119)
    public static void method1467(int arg0) {
        if (arg0 != -1007) {
            field3280 = 65;
        }
        field3283 = null;
        field3286 = null;
        field3287 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILkb;II)[Ln;", line = 136)
    public static final class298[] method1468(int arg0, class39 arg1, int arg2, int arg3) {
        field3281++;
        if (arg2 != 20702) {
            field3280 = 77;
        }
        return class288.method2026(arg3, arg0, arg1, -59) ? class214.method1561(arg2 - 809923) : null;
    }
}
