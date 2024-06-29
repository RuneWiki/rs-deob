import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class45 {

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "[I")
    public static int[] field666 = new int[1];

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "[Lgg;")
    public static class158[] field669 = null;

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "Lof;")
    public static class568 field668 = new class568(13, 19);

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method250(int arg0, int arg1, int arg2) {
        field667++;
        if (arg0 != 540800) {
            field669 = null;
        }
        return (arg2 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)V", line = 30)
    public static void method251(byte arg0) {
        field669 = null;
        if (arg0 != -122) {
            method251((byte) -85);
        }
        field666 = null;
        field668 = null;
    }
}
