import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class191 {

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field3403 = -1;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Lge;")
    public static class71 field3402 = new class71(16);

    @OriginalMember(owner = "client!re", name = "f", descriptor = "Lah;")
    public static class9 field3407 = null;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "Lkh;")
    private static class117 field3409 = class224.method1450((byte) -76, "Login server offline)3");

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Lkh;")
    public static class117 field3411 = field3409;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public static int field3410 = 2;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "Lge;")
    public static class71 field3408 = new class71(64);

    @OriginalMember(owner = "client!re", name = "k", descriptor = "Lkh;")
    private static class117 field3412 = class224.method1450((byte) -87, " more options");

    @OriginalMember(owner = "client!re", name = "l", descriptor = "Lkh;")
    public static class117 field3413 = field3412;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Ls;")
    public static class197 field3405;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "[Lch;")
    public static class31[] field3406;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static void method1278(int arg0) {
        field3406 = null;
        field3413 = null;
        field3405 = null;
        field3408 = null;
        field3407 = null;
        field3411 = null;
        field3402 = null;
        field3409 = null;
        field3412 = null;
        if (arg0 != 2) {
            method1279(-69, 76);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)Lv;")
    public static final class230 method1279(int arg0, int arg1) {
        field3404++;
        class230 var2 = (class230) class217.field3938.method506(1, (long) arg0);
        if (var2 != null) {
            return var2;
        } else if (arg1 > -116) {
            return null;
        } else {
            byte[] var3 = class157.field2858.method104(-26, 11, arg0);
            class230 var4 = new class230();
            if (var3 != null) {
                var4.method1484((byte) -98, new class145(var3));
            }
            class217.field3938.method497((long) arg0, var4, -97);
            return var4;
        }
    }
}
