import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public abstract class class137 {

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Lsg;")
    public static class169 field2550 = class165.method1060("mapmarker", 1536);

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Lsg;")
    private static class169 field2552 = class165.method1060("Try again in 60 secs)3)3)3", 1536);

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Lsg;")
    public static class169 field2551 = null;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field2554 = 255;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "[Lsg;")
    public static class169[] field2553 = new class169[200];

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "Lsg;")
    public static class169 field2556 = field2552;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field2558 = 0;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "[I")
    public static int[] field2545 = new int[32];

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public static int field2557 = 0;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Lqd;")
    public static class148 field2555;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Lhg;")
    public static class71 field2547;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "Z")
    public static boolean field2559;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lke;III)Lgd;")
    public static final class59 method922(class95 arg0, int arg1, int arg2, int arg3) {
        field2548++;
        if (class174.method1166(arg1, arg3, false, arg0)) {
            int var4 = -48 % ((arg2 + 5) / 39);
            return class23.method158(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z[B)V")
    public abstract void method246(boolean arg0, byte[] arg1);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)[B")
    public abstract byte[] method245(int arg0);

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
    public static void method923(int arg0) {
        field2556 = null;
        field2552 = null;
        field2545 = null;
        field2550 = null;
        field2553 = null;
        field2547 = null;
        if (arg0 != 0) {
            method922(null, 96, -32, -24);
        }
        field2555 = null;
        field2551 = null;
    }
}
