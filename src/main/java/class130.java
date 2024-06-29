import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class130 {

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "[I")
    public static int[] field1714 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "[I")
    public static int[] field1715 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V")
    public static void method914(byte arg0) {
        field1714 = null;
        int var1 = -30 / ((81 - arg0) / 45);
        field1715 = null;
    }
}
