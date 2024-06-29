import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class551 {

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "I")
    public static int field7520;

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "I")
    public static int field7521;

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "I")
    public static int field7522;

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "I")
    public static int field7523;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II)V", line = 9)
    public static final void method3081(int arg0, int arg1) {
        field7520++;
        if (arg0 != -16528) {
            field7523 = -49;
        }
        if (class46.field559 == null || arg1 > class46.field559.length) {
            class46.field559 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BZ)V", line = 31)
    public static final void method3082(byte arg0, boolean arg1) {
        if (arg1 && class672.field9548 != null) {
            class500.field6869 = class672.field9548.field3812;
        } else {
            class500.field6869 = -1;
        }
        field7521++;
        class533.field7329 = null;
        class630.field8726 = 0;
        class672.field9548 = null;
        class418.field5502 = null;
        class672.method3832();
        class672.field9563.method2512(-11558);
        class24.field287 = null;
        class428.field5766 = null;
        class565.field7710 = null;
        class545.field7458 = null;
        class235.field3119 = null;
        class428.field5770 = null;
        if (arg0 <= 99) {
            field7523 = 17;
        }
        class209.field2790 = null;
        class68.field827 = -1;
        class672.field9557 = null;
        class46.field553 = null;
        class59.field746 = -1;
        class200.field2711 = null;
        if (class672.field9554 != null) {
            class672.field9554.method2152((byte) -71);
            class672.field9554.method2155(64, 128, (byte) 78);
        }
        if (class672.field9552 != null) {
            class672.field9552.method1015((byte) -72, 64, 64);
        }
        if (class672.field9555 != null) {
            class672.field9555.method3917((byte) 83, 64);
        }
        class632.field8745.method2759((byte) 52, 64);
    }
}
