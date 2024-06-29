import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public abstract class class72 {

    @OriginalMember(owner = "client!me", name = "a", descriptor = "[[B")
    public static byte[][] field1135 = new byte[50][];

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field1137 = 0;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Llc;")
    public static class270 field1136;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "Llc;")
    public static class270 field1138;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static void method541(int arg0) {
        if (arg0 != -9774) {
            method541(89);
        }
        field1136 = null;
        field1135 = null;
        field1138 = null;
    }
}
