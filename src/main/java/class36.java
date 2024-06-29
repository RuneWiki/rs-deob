import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public abstract class class36 {

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field477 = 0;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "Ldb;")
    public static class102 field478 = new class102(64);

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field480 = 64;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field481 = 0;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Lva;", line = 6)
    public static final class168 method194(int arg0, int arg1) {
        field476++;
        class168 var2 = (class168) class123.field1921.method755((long) arg0, false);
        if (arg1 != -19375) {
            field481 = -52;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class182.field3025.method1287(arg0, 11, -1);
        class168 var4 = new class168();
        if (var3 != null) {
            var4.method1229(arg1 ^ 0x478E, new class44(var3));
        }
        class123.field1921.method750(var4, (long) arg0, -18339);
        return var4;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(II)V", line = 35)
    public static final void method195(int arg0, int arg1) {
        field474++;
        class225.field3604 = (class291) class33.field448.method451((long) arg0, (byte) 100);
        if (arg1 != 10667) {
            method195(90, 57);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIIII)Z", line = 52)
    public static final boolean method196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V", line = 87)
    public static void method197(int arg0) {
        if (arg0 == -18269) {
            field478 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)I")
    public abstract int method163(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public abstract void method164(int arg0);

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)J")
    public abstract long method162(int arg0);
}
