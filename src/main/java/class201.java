import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class201 {

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "J")
    public long field3670 = 0L;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field3665 = 0;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field3679 = 3;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Lvd;")
    public static class222 field3672 = class212.method1357("<col=80ff00>", 10731);

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "Lvd;")
    public static class222 field3683 = class212.method1357(":", 10731);

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "Lig;")
    public static class93 field3680 = new class93(64);

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
    public static int field3688 = -1;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public int field3666;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public int field3667;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public int field3673;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public int field3675;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    public int field3681;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    public int field3684;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
    public int field3686;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "Lbg;")
    public static class19 field3687;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "Le;")
    public class44 field3674;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "Le;")
    public class44 field3682;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "[Lvd;")
    public static class222[] field3676;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "[[B")
    public static byte[][] field3669;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)Z")
    public static final boolean method1283(int arg0, byte arg1) {
        field3685++;
        if (arg0 < 32) {
            return false;
        } else if (arg1 != 4) {
            return true;
        } else if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
    public static void method1284(boolean arg0) {
        field3676 = null;
        field3672 = null;
        field3680 = null;
        field3683 = null;
        field3669 = null;
        if (arg0) {
            field3687 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIZZZ)Lve;")
    public static final class223 method1285(int arg0, int arg1, boolean arg2, boolean arg3, boolean arg4) {
        field3677++;
        if (arg0 != 1000000) {
            return null;
        }
        class188 var5 = null;
        if (class205.field3807 != null) {
            var5 = new class188(arg1, class205.field3807, class73.field1459[arg1], 1000000);
        }
        return new class223(var5, class228.field4297, arg1, arg4, arg3, arg2);
    }
}
