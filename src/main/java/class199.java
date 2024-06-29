import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class199 {

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "J")
    public static long field2842 = 0L;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
    public static int field2843 = 0;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "Lub;")
    public static class15 field2840 = new class15(8);

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "Z")
    public static boolean field2845 = true;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "Ltj;")
    public static class108 field2839;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "Lkg;")
    public static class148 field2847;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "[I")
    public static int[] field2844;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "[S")
    public static short[] field2848;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V", line = 10)
    public static void method1409(int arg0) {
        field2844 = null;
        if (arg0 != 200) {
            method1411(-21, -50, -126, -107, false, 58, -59);
        }
        field2848 = null;
        field2840 = null;
        field2847 = null;
        field2839 = null;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V", line = 24)
    public static final void method1410(int arg0) {
        class15 var1 = class449.field6404;
        synchronized (class449.field6404) {
            class449.field6404.method98(arg0);
        }
        field2838++;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIIZII)V", line = 36)
    public static final void method1411(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field2841++;
        class136[] var7 = class209.field2990;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class136 var9 = var7[var8];
            if (var9 != null && var9.field2097 == 2) {
                class106.method626(arg3, (var9.field2106 - class342.field4959 << 7) + var9.field2105, arg6 >> 1, arg1, var9.field2098 * 2, -2237, arg5 >> 1, (var9.field2102 - class306.field4459 << 7) + var9.field2095);
                if (class212.field3004[0] > -1 && class34.field434 % 20 < 10) {
                    class70.field928[var9.field2100].method1772(class212.field3004[0] + arg2 - 12, arg0 - (-class212.field3004[1] - -28));
                }
            }
        }
        if (!arg4) {
            method1410(-83);
        }
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)I", line = 66)
    public static final int method1412(int arg0) {
        field2846++;
        if (arg0 != 23342) {
            field2839 = null;
        }
        if ((double) class176.field2471 == 3.0D) {
            return 37;
        } else if ((double) class176.field2471 == 4.0D) {
            return 50;
        } else if ((double) class176.field2471 == 6.0D) {
            return 75;
        } else if ((double) class176.field2471 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }
}
