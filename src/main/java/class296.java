import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class296 extends class46 {

    @OriginalMember(owner = "client!a", name = "p", descriptor = "[B")
    public byte[] field4570;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "Z")
    public static boolean field4571 = false;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field4569 = 0;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([[IZ)V", line = 5)
    public static final void method2011(int[][] arg0, boolean arg1) {
        if (!arg1) {
            method2012(-127, (Component) null);
        }
        field4573++;
        class34.field525 = arg0;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "([B)V", line = 16)
    public class296(byte[] arg0) {
        this.field4570 = arg0;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 25)
    public static final void method2012(int arg0, Component arg1) {
        arg1.addMouseListener(class318.field4968);
        arg1.addMouseMotionListener(class318.field4968);
        arg1.addFocusListener(class318.field4968);
        int var2 = -85 / ((arg0 - 62) / 61);
        field4572++;
    }
}
