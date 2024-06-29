import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class217 {

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field3725 = 0;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field3727 = 0;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field3728 = 0;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Loa;")
    public static class262 field3726 = new class262();

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "[[B")
    public static byte[][] field3724;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)V")
    public static final void method1500(int arg0, int arg1, int arg2, int arg3) {
        class43 var4 = class270.method1847(arg1, -10277, arg3);
        field3723++;
        var4.method333(80);
        var4.field732 = arg0;
        var4.field740 = arg2;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V")
    public static void method1501(boolean arg0) {
        if (arg0) {
            method1500(-52, 58, -119, -124);
        }
        field3724 = null;
        field3726 = null;
    }
}
