import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public abstract class class71 {

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field929 = -1;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Leq;")
    public static class145 field931;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Llb;")
    public static class216 field930;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "Lqm;")
    public static class297 field932;

    static {
        new class409("From", "Von:", "De", "De");
        field931 = new class145();
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V", line = 5)
    public static void method515(byte arg0) {
        field930 = null;
        field932 = null;
        if (arg0 != -63) {
            field929 = 114;
        }
        field931 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/lang/String;)V", line = 22)
    public static final void method516(int arg0, String arg1) {
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field927++;
        if (arg0 == 26170) {
            System.exit(1);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)Z", line = 35)
    public static final boolean method517(int arg0, int arg1, int arg2, int arg3) {
        if (class151.method1038(arg0, arg1, arg2)) {
            int var4 = arg1 << class167.field2206;
            int var5 = arg2 << class167.field2206;
            return class154.method1054(var4 + 1, class215.field3069[arg0].method1429(arg1, arg2) + arg3, var5 + 1) && class154.method1054(class100.field1271 + var4 - 1, class215.field3069[arg0].method1429(arg1 + 1, arg2) + arg3, var5 + 1) && class154.method1054(class100.field1271 + var4 - 1, class215.field3069[arg0].method1429(arg1 + 1, arg2 + 1) + arg3, class100.field1271 + var5 - 1) && class154.method1054(var4 + 1, class215.field3069[arg0].method1429(arg1, arg2 + 1) + arg3, class100.field1271 + var5 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILwc;BLwe;IILgn;I)V", line = 62)
    public static final void method518(int arg0, class380 arg1, byte arg2, class26 arg3, int arg4, int arg5, class178 arg6, int arg7) {
        field926++;
        class138 var8 = new class138();
        var8.field1900 = arg4 * 128;
        var8.field1897 = arg7 * 128;
        var8.field1894 = arg5;
        if (arg6 != null) {
            var8.field1890 = arg6;
            int var9 = arg6.field2533;
            int var10 = arg6.field2476;
            if (arg0 == 1 || arg0 == 3) {
                var10 = arg6.field2533;
                var9 = arg6.field2476;
            }
            var8.field1882 = arg6.field2515 * 128;
            var8.field1896 = arg6.field2493;
            var8.field1893 = arg6.field2500;
            var8.field1887 = (arg4 + var10) * 128;
            var8.field1892 = (arg7 + var9) * 128;
            var8.field1884 = arg6.field2470;
            var8.field1883 = arg6.field2504;
            var8.field1901 = arg6.field2513;
            if (arg6.field2489 != null) {
                var8.field1889 = true;
                var8.method917(0);
            }
            if (var8.field1896 != null) {
                var8.field1888 = (int) ((double) (var8.field1883 - var8.field1893) * Math.random()) + var8.field1893;
            }
            class208.field2940.method2484(0, var8);
        } else if (arg3 != null) {
            var8.field1881 = arg3;
            class327 var11 = arg3.field369;
            if (var11.field4871 != null) {
                var8.field1889 = true;
                var11 = var11.method2139(true);
            }
            if (var11 != null) {
                var8.field1892 = (arg7 + var11.field4819) * 128;
                var8.field1887 = (arg4 + var11.field4819) * 128;
                var8.field1901 = class171.method1110(arg3, true);
                var8.field1884 = var11.field4840;
                var8.field1882 = var11.field4842 * 128;
            }
            class422.field6101.method2484(0, var8);
        } else if (arg1 != null) {
            var8.field1902 = arg1;
            var8.field1892 = (arg7 + arg1.method446(10)) * 128;
            var8.field1887 = (arg1.method446(10) + arg4) * 128;
            var8.field1901 = class278.method1889(arg1, (byte) 20);
            var8.field1882 = arg1.field5560 * 128;
            var8.field1884 = arg1.field5567;
            class381.field5600.method606(1, var8, (long) arg1.field777);
        }
        if (arg2 != -105) {
            method517(-94, 58, -48, 14);
        }
    }
}
