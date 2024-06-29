import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class233 {

    @OriginalMember(owner = "client!le", name = "f", descriptor = "Z")
    public static boolean field3765 = false;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "F")
    public static float field3768 = 0.0F;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field3770 = 0;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public int field3761;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Lpb;")
    public class71 field3767;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "Lvl;")
    public static class73 field3762;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "Lua;")
    public static class83 field3766;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "[I")
    public int[] field3764;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1640(int arg0, String arg1, int arg2) {
        field3771++;
        class181 var3 = class95.method652(3, (byte) 34, arg0);
        if (arg2 <= -119) {
            var3.method1285((byte) 64);
            var3.field2850 = arg1;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BLim;)Lpm;")
    public static final class96 method1641(byte arg0, class170 arg1) {
        int var2 = -22 / ((2 - arg0) / 40);
        field3763++;
        return new class96(arg1.method1193(-1), arg1.method1193(-1), arg1.method1193(-1), arg1.method1193(-1), arg1.method1193(-1), arg1.method1193(-1), arg1.method1193(-1), arg1.method1193(-1), arg1.method1212(460736848), arg1.method1218(-48));
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public static void method1642(byte arg0) {
        field3766 = null;
        int var1 = -2 / ((arg0 - 53) / 63);
        field3762 = null;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(B)V")
    public static final void method1643(byte arg0) {
        class183 var1 = (class183) class192.field3051.method1548(arg0 - 32);
        field3769++;
        if (arg0 != 32) {
            field3766 = null;
        }
        while (var1 != null) {
            if (var1.field2882 > 0) {
                var1.field2882--;
            }
            if (var1.field2882 != 0) {
                if (var1.field2886 > 0) {
                    var1.field2886--;
                }
                if (var1.field2886 == 0 && var1.field2870 >= 1 && var1.field2877 >= 1 && var1.field2870 <= 102 && var1.field2877 <= 102 && (var1.field2884 < 0 || class227.method1602(var1.field2884, var1.field2871, 4))) {
                    class47.method268(var1.field2877, var1.field2879, var1.field2870, var1.field2878, var1.field2871, var1.field2884, (byte) -122, var1.field2887);
                    var1.field2886 = -1;
                    if (var1.field2884 == var1.field2873 && var1.field2873 == -1) {
                        var1.method1764(64);
                    } else if (var1.field2884 == var1.field2873 && var1.field2887 == var1.field2885 && var1.field2881 == var1.field2871) {
                        var1.method1764(arg0 ^ 0x60);
                    }
                }
            } else if (var1.field2873 < 0 || class227.method1602(var1.field2873, var1.field2881, arg0 - 28)) {
                class47.method268(var1.field2877, var1.field2879, var1.field2870, var1.field2878, var1.field2881, var1.field2873, (byte) -120, var1.field2885);
                var1.method1764(64);
            }
            var1 = (class183) class192.field3051.method1549(-58);
        }
    }
}
