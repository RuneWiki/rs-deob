import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class91 extends class61 {

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "[I")
    public static int[] field1637 = new int[128];

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "S")
    public static short field1631 = 32767;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public int field1633;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public int field1636;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "I")
    public int field1642;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
    public int field1643;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
    public int field1645;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "Llc;")
    public class143 field1644;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "Lvh;")
    public class43 field1632;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "Lvh;")
    public class43 field1641;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Z")
    public boolean field1634;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "[Ljava/lang/Object;")
    public Object[] field1639;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
    public static void method518(int arg0) {
        if (arg0 != -17546) {
            method520(-10);
        }
        field1637 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)I")
    public static final int method519(int arg0, int arg1) {
        if (arg0 != -10335) {
            field1635 = 27;
        }
        field1646++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)I")
    public static final int method520(int arg0) {
        if (arg0 != 1) {
            field1637 = null;
        }
        field1640++;
        if (class120.field2141) {
            return 0;
        } else if (class21.method149((byte) -57)) {
            return class285.field5009 ? 2 : 1;
        } else {
            return 1;
        }
    }
}
