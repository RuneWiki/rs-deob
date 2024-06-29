import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class111 {

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "[Lvv;")
    public static class219[] field1639 = new class219[0];

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "Lqv;")
    public static class316 field1638 = new class316(11, 5);

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "[I")
    public static int[] field1641 = new int[25];

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
    public static int field1643 = 0;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "Z")
    public static boolean field1640;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
    public static void method792(int arg0) {
        field1641 = null;
        field1638 = null;
        field1639 = null;
        if (arg0 != 0) {
            method792(77);
        }
    }
}
