import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class398 {

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "Z")
    public static volatile boolean field5953 = false;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)I", line = 5)
    public static final int method2531(int arg0, int arg1) {
        field5950++;
        return arg0 >= -72 ? -98 : arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I[Ljava/awt/Rectangle;I)V", line = 19)
    public static final void method2532(int arg0, Rectangle[] arg1, int arg2) throws class566 {
        field5952++;
        if (class22.field234 == 1) {
            class502.field7152.method539(arg1, arg0, class210.field3078, class304.field4305);
        } else {
            class502.field7152.method539(arg1, arg0, 0, 0);
        }
        if (arg2 != -2367) {
            method2531(-101, 52);
        }
    }
}
