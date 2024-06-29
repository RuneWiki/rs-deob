import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class239 {

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3920 = "Drop";

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "S")
    public static short field3927 = 32767;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "Lrc;")
    public static class9 field3925 = new class9(64);

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "Z")
    public static boolean field3932 = true;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "Z")
    public static boolean field3933 = false;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3935 = "Cancel";

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public static int field3934 = 0;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "Ljava/lang/String;")
    public static String field3938 = "level: ";

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "[Z")
    public static boolean[] field3937 = new boolean[100];

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public int field3923;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Lvh;")
    public static class108 field3919;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "Lsb;")
    public class123 field3922;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "[I")
    public int[] field3926;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "[I")
    public static int[] field3936;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1575(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3924++;
        class103 var10 = (class103) class49.field849.method379(6347);
        class103 var11 = null;
        if (arg4 != 2047) {
            method1581(-79);
        }
        while (var10 != null) {
            if (var10.field1800 == arg2 && var10.field1803 == arg7 && var10.field1815 == arg5 && var10.field1817 == arg6) {
                var11 = var10;
                break;
            }
            var10 = (class103) class49.field849.method378(37);
        }
        if (var11 == null) {
            var11 = new class103();
            var11.field1815 = arg5;
            var11.field1800 = arg2;
            var11.field1803 = arg7;
            var11.field1817 = arg6;
            class66.method411(-90, var11);
            class49.field849.method374(-1, var11);
        }
        var11.field1813 = arg8;
        var11.field1814 = arg3;
        var11.field1804 = arg1;
        var11.field1806 = arg9;
        var11.field1808 = arg0;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)Luh;")
    public static final class224 method1576(int arg0) {
        field3930++;
        try {
            if (arg0 != -19602) {
                field3933 = false;
            }
            return (class224) Class.forName("rh").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
    public static void method1577(int arg0) {
        field3936 = null;
        field3937 = null;
        field3919 = null;
        field3925 = null;
        field3938 = null;
        field3920 = null;
        field3935 = null;
        if (arg0 != 128) {
            field3933 = false;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI)V")
    public static final void method1578(byte arg0, int arg1) {
        class198.field3198.method63(0, arg1);
        field3931++;
        class30.field442.method63(0, arg1);
        if (arg0 <= 0) {
            field3919 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIII)V")
    public static final void method1579(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class126.field2208 = arg3;
        field3928++;
        class136.field2385 = arg0;
        class225.field3777 = arg5;
        class74.field1226 = arg2;
        class112.field2009 = arg1;
        if (class126.field2208 >= 100) {
            int var6 = class136.field2385 * 128 + 64;
            int var7 = class74.field1226 * 128 + 64;
            int var8 = class10.method68(true, class176.field2886, var7, var6) - class225.field3777;
            int var9 = var6 - class56.field976;
            int var10 = var8 - class250.field4093;
            int var11 = var7 - class237.field3904;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class228.field3844 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class52.field914 = (int) (Math.atan2((double) var9, (double) var11) * -325.949D) & 0x7FF;
            if (class228.field3844 < 128) {
                class228.field3844 = 128;
            }
            if (class228.field3844 > 383) {
                class228.field3844 = 383;
            }
        }
        class241.field3970 = 2;
        if (arg4 != -750) {
            method1575(97, 117, -113, -97, 119, 28, -38, -62, 58, -116);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
    public static final void method1580(byte arg0) {
        int var1 = -66 % ((arg0 - 9) / 57);
        field3929++;
        if (class206.field3428 > 0) {
            class63.method402((byte) -18);
        } else {
            class93.field1638 = class194.field3131;
            class194.field3131 = null;
            class217.method1441(40, -31239);
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V")
    public static final void method1581(int arg0) {
        field3921++;
        if (!class76.field1241) {
            return;
        }
        class46 var1 = class285.method1902(class47.field825, class119.field2108, 5);
        if (var1 != null && var1.field731 != null) {
            class198 var2 = new class198();
            var2.field3205 = var1;
            var2.field3204 = var1.field731;
            class71.method434(-10521, var2);
        }
        if (arg0 != -24930) {
            field3918 = -94;
        }
        class198.field3200 = -1;
        class76.field1241 = false;
        class79.method516(-373, var1);
    }
}
