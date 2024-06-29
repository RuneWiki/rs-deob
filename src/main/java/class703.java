import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class703 {

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "[I")
    public static int[] field9673 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field9672;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field9675;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "Ljava/awt/Frame;")
    public static Frame field9674;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILjava/lang/String;)I", line = 4)
    public static final int method3926(int arg0, String arg1) {
        field9672++;
        return arg0 == 120 ? arg1.length() + 1 : 98;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 26)
    public static void method3927(byte arg0) {
        if (arg0 < 23) {
            field9674 = null;
        }
        field9673 = null;
        field9674 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIB)V", line = 37)
    public static final void method3928(int arg0, int arg1, byte arg2) {
        field9675++;
        class281 var3 = class54.method395((byte) -53, (long) arg1, 5);
        if (arg2 >= -30) {
            method3927((byte) -13);
        }
        var3.method1821((byte) -24);
        var3.field3910 = arg0;
    }
}
