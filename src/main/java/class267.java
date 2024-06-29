import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class267 {

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "[[B")
    public static byte[][] field3913 = new byte[250][];

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field3915 = 0;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "Lro;")
    public static class1 field3916;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "[I")
    public static int[] field3914;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 9)
    public static void method1825(int arg0) {
        field3913 = null;
        field3916 = null;
        field3914 = null;
        if (arg0 != 32621) {
            field3915 = -74;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLbr;II)V", line = 21)
    public static final void method1826(byte arg0, class223 arg1, int arg2, int arg3) {
        class88.field1157 = arg3;
        class246.field3664 = arg1;
        class262.field3869 = arg2;
        if (arg0 == -72) {
            field3912++;
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)Z", line = 38)
    public static final boolean method1827(int arg0) {
        field3917++;
        if (class439.field6279 == 0) {
            if (arg0 < 39) {
                method1825(-99);
            }
            return class213.field3014.method1452(1024);
        } else {
            return true;
        }
    }
}
