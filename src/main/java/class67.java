import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public abstract class class67 {

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "Loo;")
    public static class543 field736 = new class543("RC", 1);

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "Lraa;")
    public static class528 field738 = new class528("WTI", 5);

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "I")
    public static int field739 = 0;

    @OriginalMember(owner = "client!aw", name = "h", descriptor = "[I")
    public static int[] field741 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "F")
    public static float field737;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!aw", name = "i", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!aw", name = "j", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "[I")
    public static int[] field740;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V", line = 4)
    public static void method459(int arg0) {
        field740 = null;
        field741 = null;
        field738 = null;
        field736 = null;
        if (arg0 != 1583) {
            method459(34);
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I[B)V")
    public abstract void method460(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)[B")
    public abstract byte[] method461(int arg0);

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(III)[B")
    public abstract byte[] method462(int arg0, int arg1, int arg2);
}
