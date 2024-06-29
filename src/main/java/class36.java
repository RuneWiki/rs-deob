import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class36 {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Lem;")
    public static class10 field739 = null;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field743 = 0;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "[Lmh;")
    public static class128[] field742;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "[[[B")
    public static byte[][][] field740;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V", line = 28)
    public static void method245(byte arg0) {
        field740 = (byte[][][]) null;
        if (arg0 == -10) {
            field739 = null;
            field742 = null;
        }
    }
}
