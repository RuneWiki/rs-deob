import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class390 {

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "[I")
    public static int[] field5843 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "Lob;")
    public static class521 field5841 = new class521(20, 7);

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "[I")
    public static int[] field5845 = new int[2];

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "Lbd;")
    public static class45 field5847;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "[I")
    public static int[] field5846;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 10)
    public static void method2431(int arg0) {
        if (arg0 != 1) {
            method2431(-122);
        }
        field5847 = null;
        field5846 = null;
        field5843 = null;
        field5841 = null;
        field5845 = null;
    }
}
