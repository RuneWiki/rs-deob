import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class1 {

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field1 = 0;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field3 = 104;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "Lkha;")
    public static class687 field2;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "Lac;")
    public static class712 field5;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V")
    public static void method1(byte arg0) {
        field5 = null;
        field2 = null;
        if (arg0 >= -56) {
            field1 = 35;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)I")
    public static final int method2(int arg0, int arg1, int arg2) {
        field6++;
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return arg1 == 126 ? (arg2 & 0xFF80) + var3 : 82;
    }
}
