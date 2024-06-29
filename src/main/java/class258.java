import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class258 {

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "Lwe;")
    public static class24 field3761 = new class24(64);

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "Z")
    public static boolean field3768 = true;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "Z")
    public static boolean field3766 = false;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "Lqj;")
    public static class238 field3764;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "[I")
    public static int[] field3765;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 4)
    public static void method1623(int arg0) {
        if (arg0 != 1) {
            method1623(52);
        }
        field3764 = null;
        field3765 = null;
        field3761 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BIIIIII)Lj;", line = 21)
    public static final class269 method1624(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3762++;
        long var7 = (long) arg6 * 475427L ^ (long) arg2 * 97549L ^ (long) arg5 * 67481L ^ (long) arg1 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg3 * 76724863L;
        class269 var9 = (class269) class395.field5932.method209(126, var7);
        if (var9 != null) {
            return var9;
        }
        if (arg0 != -17) {
            field3761 = null;
        }
        class269 var10 = class24.field417.method2178(arg5, arg2, arg6, arg1, arg4, arg3);
        class395.field5932.method202(true, var10, var7);
        return var10;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIII)V", line = 55)
    public static final void method1625(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 1) {
            field3768 = false;
        }
        int var4 = class407.field6101 * arg1 >> 8;
        field3767++;
        if (var4 != 0 && arg0 != -1) {
            class297.method1883(arg0, 0, var4, -118, false, class39.field632);
            class164.field2139 = true;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)V", line = 74)
    public static final void method1626(int arg0, int arg1) {
        if (arg0 != -1) {
            field3765 = null;
        }
        field3763++;
        class24 var2 = class73.field989;
        synchronized (class73.field989) {
            class73.field989.method212(-83);
            class73.field989 = new class24(arg1);
        }
    }
}
