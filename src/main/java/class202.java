import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class202 {

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "[B")
    public static byte[] field3635 = new byte[520];

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field3636 = 0;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field3639 = 0;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field3640 = 0;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "[[B")
    public static byte[][] field3638;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    public static void method1394(byte arg0) {
        field3638 = null;
        field3635 = null;
        if (arg0 != 119) {
            field3635 = null;
        }
    }
}
