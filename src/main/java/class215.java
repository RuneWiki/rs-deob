import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class215 {

    @OriginalMember(owner = "client!db", name = "d", descriptor = "[Z")
    public static boolean[] field3103 = new boolean[200];

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Lql;")
    public static class526 field3104 = new class526(14, 1);

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Lql;")
    public static class526 field3105 = new class526(15, 4);

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Lql;")
    public static class526 field3106 = new class526(16, -2);

    @OriginalMember(owner = "client!db", name = "h", descriptor = "Lql;")
    public static class526 field3107 = new class526(17, 0);

    @OriginalMember(owner = "client!db", name = "i", descriptor = "Lql;")
    public static class526 field3108 = new class526(18, -2);

    @OriginalMember(owner = "client!db", name = "j", descriptor = "Lql;")
    public static class526 field3109 = new class526(19, -2);

    @OriginalMember(owner = "client!db", name = "k", descriptor = "Lql;")
    public static class526 field3110 = new class526(20, 6);

    @OriginalMember(owner = "client!db", name = "l", descriptor = "Lql;")
    public static class526 field3111 = new class526(21, 9);

    @OriginalMember(owner = "client!db", name = "m", descriptor = "Lql;")
    public static class526 field3112 = new class526(22, -2);

    @OriginalMember(owner = "client!db", name = "n", descriptor = "Lql;")
    public static class526 field3113 = new class526(23, 4);

    @OriginalMember(owner = "client!db", name = "o", descriptor = "Lql;")
    public static class526 field3114 = new class526(24, -1);

    @OriginalMember(owner = "client!db", name = "p", descriptor = "Lql;")
    public static class526 field3115 = new class526(25, -2);

    @OriginalMember(owner = "client!db", name = "q", descriptor = "[Lql;")
    private static class526[] field3116 = new class526[32];

    @OriginalMember(owner = "client!db", name = "r", descriptor = "Leh;")
    public static class246 field3117;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "Z")
    public static boolean field3120;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "Lo;")
    public static class24 field3119;

    static {
        class526[] var0 = class134.method847(24336);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field3116[var0[var1].field7739] = var0[var1];
        }
        field3117 = new class246(94, 0);
        field3120 = false;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1343(int arg0, int arg1) {
        field3101++;
        class140.field1838 = arg1;
        class174 var2 = class513.field7581;
        synchronized (class513.field7581) {
            int var3 = -75 / ((arg0 + 36) / 62);
            class513.field7581.method1096((byte) -47);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIII)V", line = 22)
    public static final void method1344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        for (class268 var7 = (class268) class239.field3494.method2748(2); var7 != null; var7 = (class268) class239.field3494.method2751(-16195)) {
            if (var7.field3912 <= class390.field5481) {
                var7.method1805((byte) 89);
            } else {
                class531.method3123(arg4 >> 1, (byte) -85, var7.field3906, arg0, (var7.field3915 << 7) + 64, var7.field3911 * 2, arg1 >> 1, arg2, (var7.field3907 << 7) + 64);
                class107.field1431.method1913(var7.field3908, var7.field3916 | 0xFF000000, 0, class153.field2194[1] + arg3, false, class153.field2194[0] + arg5);
            }
        }
        int var8 = -31 % ((-arg6 - 63) / 42);
        field3100++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 50)
    public static void method1345(byte arg0) {
        field3106 = null;
        field3119 = null;
        field3111 = null;
        field3104 = null;
        field3114 = null;
        field3116 = null;
        field3109 = null;
        field3113 = null;
        int var1 = -114 % ((arg0 + 58) / 61);
        field3110 = null;
        field3105 = null;
        field3112 = null;
        field3115 = null;
        field3107 = null;
        field3117 = null;
        field3103 = null;
        field3108 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IILpk;IBI)V", line = 76)
    public static final void method1346(int arg0, int arg1, class136 arg2, int arg3, byte arg4, int arg5) {
        field3102++;
        if (arg2.field1785 == -1 && arg2.field1781 == null) {
            return;
        }
        int var6 = 0;
        int var7 = class4.field81.field1418 * arg2.field1773 >> 8;
        if (arg3 > arg2.field1776) {
            var6 += arg3 - arg2.field1776;
        } else if (arg2.field1792 > arg3) {
            var6 += arg2.field1792 - arg3;
        }
        int var8 = 100 % ((-arg4 - 5) / 34);
        if (arg5 > arg2.field1784) {
            var6 += arg5 - arg2.field1784;
        } else if (arg2.field1791 > arg5) {
            var6 += arg2.field1791 - arg5;
        }
        if (arg2.field1788 == 0 || (var6 - 64) > arg2.field1788 || class4.field81.field1418 == 0 || arg2.field1779 != arg1) {
            if (arg2.field1780 != null) {
                class138.field1810.method2312(arg2.field1780);
                arg2.field1780 = null;
            }
            if (arg2.field1777 != null) {
                class138.field1810.method2312(arg2.field1777);
                arg2.field1777 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var9 = (arg2.field1788 - var6) * var7 / arg2.field1788;
        if (arg2.field1780 != null) {
            arg2.field1780.method1504(var9);
        } else if (arg2.field1785 >= 0) {
            class148 var10 = class148.method924(class477.field6643, arg2.field1785, 0);
            if (var10 != null) {
                class499 var11 = var10.method926().method2896(class338.field4882);
                class238 var12 = class238.method1499(var11, 100, var9);
                var12.method1488(-1);
                class138.field1810.method2309(var12);
                arg2.field1780 = var12;
            }
        }
        if (arg2.field1777 != null) {
            arg2.field1777.method1504(var9);
            if (!arg2.field1777.method2894(0)) {
                arg2.field1777 = null;
                return;
            }
            return;
        }
        if (arg2.field1781 == null || (arg2.field1772 -= arg0) > 0) {
            return;
        }
        int var13 = (int) ((double) arg2.field1781.length * Math.random());
        class148 var14 = class148.method924(class477.field6643, arg2.field1781[var13], 0);
        if (var14 == null) {
            return;
        }
        class499 var15 = var14.method926().method2896(class338.field4882);
        class238 var16 = class238.method1499(var15, 100, var9);
        var16.method1488(0);
        class138.field1810.method2309(var16);
        arg2.field1777 = var16;
        arg2.field1772 = arg2.field1790 + (int) (Math.random() * (double) (arg2.field1789 - arg2.field1790));
    }
}
