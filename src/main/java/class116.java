import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class116 {

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static volatile int field1650 = 0;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field1653 = 0;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Lte;")
    public static class244 field1648 = new class244(260);

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field1654 = 0;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLeh;)V")
    public static final void method755(byte arg0, class137 arg1) {
        class196.field3121 = arg1;
        int var2 = -4 % ((arg0 - 51) / 38);
        field1651++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static void method756(byte arg0) {
        field1648 = null;
        if (arg0 != 41) {
            method755((byte) 107, (class137) null);
        }
    }
}
