import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class144 {

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Lrd;")
    private static class173 field2687 = class133.method843("You need a members account to login to this world)3", 49);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Lrd;")
    public static class173 field2684 = class133.method843("gr-Un:", -82);

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2685 = 0;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field2691 = 0;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Lrd;")
    public static class173 field2693 = class133.method843("<col=00ff00>", 34);

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Lrd;")
    public static class173 field2686 = field2687;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "[Z")
    public static boolean[] field2689;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static void method906(byte arg0) {
        field2687 = null;
        field2689 = null;
        field2686 = null;
        if (arg0 != 125) {
            field2685 = -72;
        }
        field2684 = null;
        field2693 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)I")
    public static final int method907(int arg0, int arg1) {
        int var7 = arg0 - 1;
        field2694++;
        if (arg1 > -40) {
            return -7;
        }
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILbc;I)[Lsa;")
    public static final class180[] method908(int arg0, int arg1, class14 arg2, int arg3) {
        field2688++;
        if (class18.method155(arg0, arg3, arg2, (byte) 116)) {
            return arg1 == 4413 ? class166.method1077((byte) 114) : null;
        } else {
            return null;
        }
    }
}
