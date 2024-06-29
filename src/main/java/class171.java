import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class171 {

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field2595 = 50;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2592 = "glow3:";

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "[Lmc;")
    public static class201[] field2596;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "[[[B")
    public static byte[][][] field2593;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)V")
    public static final void method1058(int arg0, int arg1) {
        field2594++;
        class274.field4121.method1780(arg1, true);
        class66.field1063.method1780(arg1, true);
        if (arg0 != 50) {
            method1059((byte) -117);
        }
        class153.field2236.method1780(arg1, true);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
    public static void method1059(byte arg0) {
        if (arg0 < 19) {
            field2593 = null;
        }
        field2593 = null;
        field2596 = null;
        field2592 = null;
    }
}
