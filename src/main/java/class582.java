import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class582 {

    @OriginalMember(owner = "client!go", name = "b", descriptor = "Z")
    public static boolean field8428 = false;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public static int field8427;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "[[I")
    public static int[][] field8429;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V")
    public static final void method3337(int arg0) {
        if (arg0 != 31909) {
            method3338((byte) 23);
        }
        field8427++;
        class144.field2519 = false;
        class293.method1954(arg0 - 31909);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
    public static void method3338(byte arg0) {
        if (arg0 < -17) {
            field8429 = null;
        }
    }
}
