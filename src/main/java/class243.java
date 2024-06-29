import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class243 extends class417 {

    @OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
    public static int field3472 = 2;

    @OriginalMember(owner = "client!bq", name = "n", descriptor = "[Z")
    public static boolean[] field3474 = new boolean[100];

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
    public int field3469;

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
    public int field3471;

    @OriginalMember(owner = "client!bq", name = "m", descriptor = "Lkda;")
    public static class328 field3473;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V", line = 3)
    public static void method1542(int arg0) {
        field3474 = null;
        if (arg0 < -14) {
            field3473 = null;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIB)Z", line = 23)
    public static final boolean method1543(int arg0, int arg1, byte arg2) {
        if (arg2 != 101) {
            method1542(94);
        }
        field3470++;
        return (arg1 & 0x800) != 0;
    }
}
