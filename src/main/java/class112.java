import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class112 extends class59 {

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public static int field1564 = 205;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "[I")
    public static int[] field1562 = new int[1];

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    public static int field1568 = 0;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public int field1563;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public int field1565;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    public int field1567;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "I")
    public int field1570;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "Lkk;")
    public class129 field1561;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V", line = 11)
    public static void method851(int arg0) {
        if (arg0 != 20801) {
            field1564 = 72;
        }
        field1562 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)I", line = 33)
    public static final int method852(int arg0, int arg1) {
        if (arg1 == 1) {
            field1566++;
            return arg0 & 0x3FF;
        } else {
            return 47;
        }
    }
}
