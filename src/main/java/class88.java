import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class88 {

    @OriginalMember(owner = "client!me", name = "q", descriptor = "Lv;")
    private static class146 field2092 = class159.method1226((byte) -37, "Use");

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field2085 = 0;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "[Lne;")
    public static class95[] field2088 = new class95[2048];

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field2084 = 0;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "Lv;")
    public static class146 field2091 = field2092;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public int field2079;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public int field2080;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public int field2082;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public int field2086;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public int field2089;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "Lie;")
    public static class61 field2090;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "Ljd;")
    public class66 field2076;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "[Lue;")
    public static class144[] field2077;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static void method699(int arg0) {
        field2090 = null;
        field2088 = null;
        field2092 = null;
        field2091 = null;
        if (arg0 != 10) {
            method703(13, (byte) 42, 81, 47, -59);
        }
        field2077 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method700(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != 10) {
            return;
        }
        field2078++;
        if (arg3 < 1 || arg6 < 1 || arg3 > 102 || arg6 > 102) {
            return;
        }
        if (class91.field2196 && class148.field3428 != arg5) {
            return;
        }
        boolean var8 = true;
        int var9 = 0;
        boolean var10 = false;
        boolean var11 = false;
        if (arg4 == 0) {
            var9 = class66.field1496.method1168(arg5, arg3, arg6);
        }
        if (arg4 == 1) {
            var9 = class66.field1496.method1184(arg5, arg3, arg6);
        }
        if (arg4 == 2) {
            var9 = class66.field1496.method1204(arg5, arg3, arg6);
        }
        if (arg4 == 3) {
            var9 = class66.field1496.method1180(arg5, arg3, arg6);
        }
        if (var9 != 0) {
            int var12 = var9 >> 14 & 0x7FFF;
            int var13 = class66.field1496.method1196(arg5, arg3, arg6, var9);
            int var14 = var13 >> 6 & 0x3;
            int var15 = var13 & 0x1F;
            if (arg4 == 0) {
                class66.field1496.method1213(arg5, arg3, arg6);
                class69 var16 = class124.method928(-1, var12);
                if (var16.field1589 != 0) {
                    class64.field1437[arg5].method723(var16.field1580, arg3, var14, (byte) -122, arg6, var15);
                }
            }
            if (arg4 == 1) {
                class66.field1496.method1211(arg5, arg3, arg6);
            }
            if (arg4 == 2) {
                class66.field1496.method1198(arg5, arg3, arg6);
                class69 var17 = class124.method928(-1, var12);
                if (var17.field1584 + arg3 > 103 || var17.field1584 + arg6 > 103 || arg3 + var17.field1597 > 103 || arg6 + var17.field1597 > 103) {
                    return;
                }
                if (var17.field1589 != 0) {
                    class64.field1437[arg5].method718(arg6, var14, (byte) -98, arg3, var17.field1597, var17.field1580, var17.field1584);
                }
            }
            if (arg4 == 3) {
                class66.field1496.method1182(arg5, arg3, arg6);
                class69 var18 = class124.method928(-1, var12);
                if (var18.field1589 == 1) {
                    class64.field1437[arg5].method727(false, arg3, arg6);
                }
            }
        }
        if (arg1 < 0) {
            return;
        }
        int var19 = arg5;
        if (arg5 < 3 && (class74.field1772[1][arg3][arg6] & 0x2) == 2) {
            var19 = arg5 + 1;
        }
        class89.method705(class64.field1437[arg5], arg7, arg2, arg1, (byte) 111, var19, arg6, arg5, arg3, class66.field1496);
        return;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    private static final void method701(int arg0) {
        if (arg0 != 16776960) {
            method701(-58);
        }
        field2083++;
        if (!class6.field149) {
            return;
        }
        class78.field1888 = null;
        class101.field2455 = null;
        class81.field1971 = null;
        class68.field1541 = null;
        class89.field2116 = null;
        class77.field1871 = null;
        field2077 = null;
        class51.field1156 = null;
        class76.field1810 = null;
        class44.field985 = null;
        class75.field1800 = null;
        class49.field1121 = null;
        class97.field2349 = null;
        class124.field2874 = null;
        class51.field1157 = null;
        field2090 = null;
        class125.field2911 = null;
        class64.field1454 = null;
        class143.field3260 = null;
        class9.field176 = null;
        class145.method1067(2, 0);
        class30.method205(0, true);
        class6.field149 = false;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IZ)V")
    public static final void method702(int arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field2087++;
        if (class47.field1071 == arg0) {
            return;
        }
        if (class47.field1071 == 0) {
            class37.method250((byte) 13);
        }
        if (arg0 == 20 || arg0 == 40) {
            class34.field723 = 0;
            class9.field174 = 0;
            class25.field396 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && class95.field2282 != null) {
            class95.field2282.method1071((byte) 120);
            class95.field2282 = null;
        }
        if (class47.field1071 == 25) {
            class72.field1690 = 1;
            class146.field3352 = 0;
            class159.field3652 = 0;
            class100.field2439 = 0;
            class94.field2239 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class157.method1217(class22.field363, class3.field89, (byte) -73, class1.field3);
        } else {
            method701(16776960);
        }
        class47.field1071 = arg0;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IBIII)V")
    public static final void method703(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2081++;
        if (class141.field3221 == 1) {
            class28.field583[class72.field1688 / 100].method423(class13.field205 - 8, class72.field1687 - 8);
        }
        if (class141.field3221 == 2) {
            class28.field583[class72.field1688 / 100 + 4].method423(class13.field205 - 8, class72.field1687 + -8);
        }
        class127.method941(3062);
        int var5 = -3 % ((arg1 - 41) / 41);
        if (!class151.field3484) {
            return;
        }
        int var6 = arg4 + 512 - 5;
        int var7 = arg3 + 20;
        class115.field2670.method824(class71.method509(new class146[] { class132.field3037, class75.method564(false, class28.field588) }, (byte) 73), var6, var7, 16776960, -1);
        int var11 = var7 + 15;
        Runtime var8 = Runtime.getRuntime();
        int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
        int var10 = 16776960;
        if (var9 > 32768 && class91.field2196) {
            var10 = 16711680;
        }
        if (var9 > 65536 && !class91.field2196) {
            var10 = 16711680;
        }
        class115.field2670.method824(class71.method509(new class146[] { class29.field610, class75.method564(false, var9), class17.field261 }, (byte) -112), var6, var11, var10, -1);
        var7 = var11 + 15;
    }
}
