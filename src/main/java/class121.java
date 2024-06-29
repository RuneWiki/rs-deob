import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class121 extends class137 {

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "Lrf;")
    public class75 field2018;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "Ltl;")
    public static class59 field2012 = class85.method639("<col=ffff00>", 9588);

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "Ltl;")
    public static class59 field2013 = class85.method639("::serverjs5drop", 9588);

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "[[I")
    public static int[][] field2017 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "I")
    public static int field2019 = 0;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;", line = 8)
    public static final Object method900(int arg0, byte[] arg1, boolean arg2) {
        if (arg0 != 1) {
            method901((byte) 59);
        }
        field2014++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class198.field3266) {
            try {
                class238 var3 = (class238) Class.forName("dg").getDeclaredConstructor().newInstance();
                var3.method672(-22232, arg1);
                return var3;
            } catch (Throwable var5) {
                class198.field3266 = true;
            }
        }
        return arg2 ? class97.method742((byte) -57, arg1) : arg1;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V", line = 47)
    public static void method901(byte arg0) {
        field2013 = null;
        field2017 = (int[][]) null;
        if (arg0 > -125) {
            field2017 = (int[][]) ((int[][]) null);
        }
        field2012 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIILfg;IJIIII)Z", line = 89)
    public static final boolean method902(int arg0, int arg1, int arg2, int arg3, class176 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class12.method82(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIII)V", line = 96)
    public static final void method903(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != -2) {
            field2012 = (class59) null;
        }
        if (arg3 >= class69.field1061 && arg6 <= class153.field2504 && class28.field369 <= arg5 && arg1 <= class62.field957) {
            if (arg0 == 1) {
                class179.method1323(arg5, arg1, arg3, false, arg4, arg6);
            } else {
                class77.method603(118, arg6, arg4, arg0, arg1, arg3, arg5);
            }
        } else if (arg0 == 1) {
            class301.method2100(arg5, arg4, arg3, arg1, (byte) -73, arg6);
        } else {
            class280.method1970(arg2 ^ 0xFFFFFF99, arg1, arg6, arg4, arg5, arg3, arg0);
        }
        field2016++;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lrf;)V", line = 125)
    public class121(class75 arg0) {
        this.field2018 = arg0;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BJ)V", line = 134)
    public static final void method904(byte arg0, long arg1) {
        field2015++;
        if (arg1 == 0L) {
            return;
        }
        if (class156.field2548 >= 100) {
            class288.method2003(class275.field4742, 0, -117, class187.field3136);
        } else if (arg0 > 76) {
            class59 var3 = class151.method1085(1, arg1).method480((byte) 73);
            for (int var4 = 0; var4 < class156.field2548; var4++) {
                if (class305.field5166[var4] == arg1) {
                    class288.method2003(class275.field4742, 0, 11, class233.method1630(new class59[] { var3, class178.field2920 }, -2883));
                    return;
                }
            }
            for (int var5 = 0; var5 < class293.field5001; var5++) {
                if (class16.field213[var5] == arg1) {
                    class288.method2003(class275.field4742, 0, 95, class233.method1630(new class59[] { class100.field1614, var3, class255.field4231 }, -2883));
                    return;
                }
            }
            if (var3.method453(class286.field4920.field1663, (byte) -100)) {
                class288.method2003(class275.field4742, 0, -122, class138.field2287);
            } else {
                class305.field5166[class156.field2548] = arg1;
                class88.field1398++;
                class232.field3814[class156.field2548++] = class151.method1085(1, arg1);
                class154.field2520 = class180.field3007;
                class234.field3888.method1768(true, 214);
                class234.field3888.method1206(arg1, false);
            }
        }
    }
}
