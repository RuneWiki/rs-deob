import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class166 {

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field3432 = 0;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "[J")
    public static long[] field3430 = new long[200];

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Lea;")
    public static class38 field3429 = class9.method46((byte) 125, "_");

    @OriginalMember(owner = "client!se", name = "j", descriptor = "[I")
    public static int[] field3434 = new int[100];

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static volatile int field3426 = 0;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Lea;")
    private static class38 field3428 = class9.method46((byte) 110, "Continue");

    @OriginalMember(owner = "client!se", name = "k", descriptor = "Lea;")
    public static class38 field3435 = class9.method46((byte) 124, "Die Adresse dieses Computers wurde gesperrt)1");

    @OriginalMember(owner = "client!se", name = "o", descriptor = "Lea;")
    public static class38 field3439 = field3428;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "Lmd;")
    public static class111 field3433;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIII)I")
    public static final int method1181(int arg0, int arg1, int arg2, int arg3) {
        field3425++;
        if (arg1 != 100) {
            method1184((byte) -80);
        }
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public static void method1182(int arg0) {
        if (arg0 != -19) {
            field3432 = 0;
        }
        field3430 = null;
        field3429 = null;
        field3434 = null;
        field3439 = null;
        field3428 = null;
        field3433 = null;
        field3435 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static final void method1183(byte arg0) {
        if (arg0 != 74) {
            field3428 = null;
        }
        class31.field610 = false;
        class157.field3274 = false;
        field3436++;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)J")
    public static final synchronized long method1184(byte arg0) {
        long var1 = System.currentTimeMillis();
        field3438++;
        if (class21.field452 > var1) {
            class11.field250 += class21.field452 - var1;
        }
        class21.field452 = var1;
        return arg0 == -80 ? var1 + class11.field250 : -70L;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V")
    public static final void method1185(byte arg0) {
        if (arg0 != 74) {
            method1181(-28, -38, 16, -24);
        }
        for (class9 var1 = (class9) class165.field3411.method1020(0); var1 != null; var1 = (class9) class165.field3411.method1027((byte) 44)) {
            if (var1.field209 > 0) {
                var1.field209--;
            }
            if (var1.field209 != 0) {
                if (var1.field197 > 0) {
                    var1.field197--;
                }
                if (var1.field197 == 0 && var1.field217 >= 1 && var1.field210 >= 1 && var1.field217 <= 102 && var1.field210 <= 102 && (var1.field218 < 0 || class16.method94(var1.field204, (byte) 1, var1.field218))) {
                    class100.method821(var1.field204, var1.field218, 106, var1.field196, var1.field210, var1.field194, var1.field214, var1.field217);
                    var1.field197 = -1;
                    if (var1.field218 == var1.field211 && var1.field211 == -1) {
                        var1.method805(false);
                    } else if (var1.field218 == var1.field211 && var1.field215 == var1.field214 && var1.field208 == var1.field204) {
                        var1.method805(false);
                    }
                }
            } else if (var1.field211 < 0 || class16.method94(var1.field208, (byte) 1, var1.field211)) {
                class100.method821(var1.field208, var1.field211, 126, var1.field196, var1.field210, var1.field194, var1.field215, var1.field217);
                var1.method805(false);
            }
        }
        field3427++;
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(B)V")
    public static final void method1186(byte arg0) {
        class17.field344.method1083(3056);
        class188.field3745.method1083(3056);
        if (arg0 <= -113) {
            class190.field3760.method1083(3056);
            field3437++;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
    public static final void method1187(int arg0) {
        field3431++;
        int var1 = class143.field2981;
        int var2 = class151.field3125;
        int var3 = class127.field2727;
        int var4 = 6116423;
        int var5 = class36.field765;
        if (arg0 != 8458) {
            method1181(29, -33, -111, -82);
        }
        class71.method558(var1, var3, var2, var5, var4);
        class71.method558(var1 + 1, var3 + 1, var2 - 2, 16, 0);
        class71.method575(var1 + 1, var3 + 18, var2 - 2, var5 + -19, 0);
        class33.field686.method646(class165.field3423, var1 + 3, var3 + 14, var4, -1);
        int var6 = class10.field222;
        int var7 = class176.field3568;
        for (int var8 = 0; var8 < class94.field2121; var8++) {
            int var9 = (class94.field2121 - var8 - 1) * 15 + var3 + 31;
            int var10 = 16777215;
            if (var7 > var1 && var7 < var1 + var2 && var6 > var9 - 13 && var9 + 3 > var6) {
                var10 = 16776960;
            }
            class33.field686.method646(class144.method1039(var8, 52), var1 + 3, var9, var10, 0);
        }
        class87.method722((byte) -49, class36.field765, class151.field3125, class143.field2981, class127.field2727);
    }
}
