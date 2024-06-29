import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class78 {

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "[I")
    public static int[] field1108 = new int[1];

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "[[I")
    public static int[][] field1107;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)V")
    public static void method664(int arg0) {
        if (arg0 == 12666) {
            field1107 = null;
            field1108 = null;
        }
    }
}
