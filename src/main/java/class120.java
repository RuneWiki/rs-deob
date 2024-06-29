import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class120 {

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field2777 = 0;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Lr;")
    private static class118 field2779 = class153.method1136(103, "Please wait)3)3)3");

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field2778 = 2301979;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Z")
    public static boolean field2786 = false;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Lr;")
    public static class118 field2781 = field2779;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public static int field2788 = 0;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "Lr;")
    public static class118 field2784 = class153.method1136(91, "<col=ff3000>");

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "Lr;")
    public static class118 field2785 = class153.method1136(86, "Weiter");

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "Lgf;")
    public static class48 field2789;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "[Lr;")
    public static class118[] field2782;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "[[S")
    public static short[][] field2780;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lke;II)Lr;")
    public static final class118 method943(class74 arg0, int arg1, int arg2) {
        field2787++;
        if (!class134.method1026(arg2, class46.method384(arg0, arg1), arg1 + 32) && arg0.field1750 == null) {
            return null;
        } else if (arg0.field1778 == null || arg2 >= arg0.field1778.length || arg0.field1778[arg2] == null || arg0.field1778[arg2].method918(false).method935(-98) == 0) {
            return class33.field844 ? class144.method1066(true, new class118[] { class148.field3275, class43.method359(arg2, (byte) -122) }) : null;
        } else {
            return arg0.field1778[arg2];
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static void method944(int arg0) {
        field2782 = null;
        field2785 = null;
        field2779 = null;
        field2781 = null;
        field2784 = null;
        field2789 = null;
        if (arg0 == -1) {
            field2780 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)J")
    public static final synchronized long method945(int arg0) {
        long var1 = System.currentTimeMillis();
        field2783++;
        if (var1 < class151.field3421) {
            class159.field3652 += class151.field3421 - var1;
        }
        class151.field3421 = var1;
        return arg0 == 20794 ? class159.field3652 + var1 : -110L;
    }
}
