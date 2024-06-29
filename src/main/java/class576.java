import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class576 {

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "S")
    public static short field8142 = 256;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "Lada;")
    public static class171 field8141 = new class171();

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "[J")
    public static long[] field8144 = new long[100];

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
    public static int field8143 = 1;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    public static int field8140;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)V", line = 8)
    public static void method3345(byte arg0) {
        field8144 = null;
        field8141 = null;
        if (arg0 != 126) {
            method3345((byte) -68);
        }
    }
}
