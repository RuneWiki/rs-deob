import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class24 {

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
    public int field446;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "I")
    public int field447;

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "I")
    public int field449;

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
    public int field450;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "[I")
    public static int[] field448;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V", line = 4)
    public static void method166(int arg0) {
        if (arg0 >= 112) {
            field448 = null;
        }
    }
}
