import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class540 {

    @OriginalMember(owner = "client!md", name = "c", descriptor = "[I")
    public static int[] field7592 = new int[3];

    @OriginalMember(owner = "client!md", name = "d", descriptor = "S")
    public static short field7593 = 32767;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "Z")
    public static boolean field7594 = false;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Lqe;")
    public static class465 field7596 = new class465(102, -2);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field7590;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field7595;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V", line = 8)
    public static void method3179(byte arg0) {
        field7592 = null;
        if (arg0 != -41) {
            field7594 = false;
        }
        field7596 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lrr;B)I", line = 19)
    public static final int method3180(class361 arg0, byte arg1) {
        field7595++;
        if (class140.field2165 == arg0) {
            return 7681;
        } else if (class571.field8118 == arg0) {
            return 8448;
        } else if (class218.field3121 == arg0) {
            return 34165;
        } else if (class316.field4492 == arg0) {
            return 260;
        } else if (class306.field4313 == arg0) {
            return 34023;
        } else {
            if (arg1 >= -58) {
                field7592 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIB)V", line = 57)
    public static final void method3181(int arg0, int arg1, byte arg2) {
        field7590++;
        class354 var3 = class501.method3012(arg1, 14, 2145997216);
        if (arg2 == 42) {
            var3.method2222(-53);
            var3.field4990 = arg0;
        }
    }
}
