import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class115 {

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field2906 = 0;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "Lvc;")
    public static class128 field2898 = new class128(64);

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "Z")
    public static boolean field2912 = false;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "Lpd;")
    public static class94 field2916 = class28.method249(38, "Classic");

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "Lpd;")
    private static class94 field2923 = class28.method249(26, "M");

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "Lpd;")
    private static class94 field2918 = class28.method249(124, "Loaded sprites");

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "Lpd;")
    public static class94 field2908 = class28.method249(88, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "Lpd;")
    public static class94 field2921 = field2923;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "[[B")
    public static byte[][] field2920 = new byte[250][];

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "I")
    public static int field2922 = 0;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "Lpd;")
    public static class94 field2926 = class28.method249(-78, "System)2Update in: ");

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "Lpd;")
    public static class94 field2915 = field2918;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "Lpd;")
    public static class94 field2914 = class28.method249(-60, "Weiter");

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "Lpd;")
    private static class94 field2927 = class28.method249(92, "Accept challenge");

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
    public static int field2925 = -1;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "Lpd;")
    public static class94 field2924 = field2927;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "Lpd;")
    private static class94 field2917 = class28.method249(102, "flash3:");

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "Lpd;")
    public static class94 field2910 = field2917;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "Ls;")
    public static class111 field2902;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "Lc;")
    public static class16 field2913;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "Lmb;")
    public static class73 field2919;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "[I")
    public static int[] field2909;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "[I")
    public static int[] field2911;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)J", line = 6)
    public static final synchronized long method856(boolean arg0) {
        field2903++;
        long var1 = System.currentTimeMillis();
        if (var1 < class90.field2331) {
            class52.field1313 += class90.field2331 - var1;
        }
        if (arg0) {
            class90.field2331 = var1;
            return class52.field1313 + var1;
        } else {
            return -5L;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILuc;)[Ljava/lang/Object;", line = 27)
    public static final Object[] method857(int arg0, class122 arg1) {
        field2907++;
        if (arg0 != 2) {
            field2909 = null;
        }
        int var2 = arg1.method943(arg0 - 1027);
        if (var2 == 0) {
            return null;
        }
        Object[] var3 = new Object[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            int var5 = arg1.method943(arg0 ^ 0xFFFFFBFD);
            if (var5 == 0) {
                var3[var4] = Integer.valueOf(arg1.method952(false));
            } else if (var5 == 1) {
                var3[var4] = arg1.method937(1);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)Lk;", line = 73)
    public static final class63 method858(int arg0, int arg1) {
        field2900++;
        class63 var2 = (class63) class20.field528.method1007((long) arg0, (byte) -125);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class120.field2982.method808((byte) -45, 4, arg0);
        class63 var4 = new class63();
        if (var3 != null) {
            var4.method469(arg0, (byte) 126, new class122(var3));
        }
        var4.method470(-1);
        if (arg1 != 0) {
            field2913 = null;
        }
        class20.field528.method1012(50, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V", line = 99)
    public static void method859(byte arg0) {
        field2927 = null;
        field2926 = null;
        field2913 = null;
        field2910 = null;
        field2915 = null;
        field2920 = null;
        field2911 = null;
        field2902 = null;
        field2917 = null;
        field2919 = null;
        if (arg0 != -108) {
            method858(-94, 124);
        }
        field2924 = null;
        field2921 = null;
        field2908 = null;
        field2909 = null;
        field2923 = null;
        field2916 = null;
        field2918 = null;
        field2914 = null;
        field2898 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)Z", line = 128)
    public static final boolean method860(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 >> 14 & 0x7FFF;
        field2899++;
        int var5 = class64.field1585.method175(class64.field1589, arg2, arg0, arg3);
        if (var5 == -1) {
            return false;
        }
        int var6 = var5 & 0x1F;
        int var7 = var5 >> 6 & 0x3;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class27 var8 = class55.method440(var4, (byte) 76);
            int var9;
            int var10;
            if (var7 == 0 || var7 == 2) {
                var10 = var8.field771;
                var9 = var8.field715;
            } else {
                var9 = var8.field771;
                var10 = var8.field715;
            }
            int var11 = var8.field729;
            if (var7 != 0) {
                var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
            }
            class123.method973(var9, 0, (byte) -98, arg0, var10, arg2, true, class80.field2044.field165[0], 2, var11, class80.field2044.field219[0], 0);
        } else {
            class123.method973(0, var7, (byte) -91, arg0, 0, arg2, true, class80.field2044.field165[0], 2, 0, class80.field2044.field219[0], var6 + 1);
        }
        class47.field1144 = class63.field1526;
        if (arg1 != 2607) {
            method856(false);
        }
        class4.field87 = 2;
        class30.field875 = 0;
        class19.field524 = class28.field788;
        return true;
    }
}
