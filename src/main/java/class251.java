import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class251 extends class60 {

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "Ljava/lang/String;")
    public String field3701;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "[I")
    public static int[] field3703 = new int[1000];

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "[I")
    public static int[] field3708 = new int[2048];

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "Lpk;")
    public static class120 field3702;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "[I")
    public static int[] field3705;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 4)
    public static final void method1739(byte arg0, Component arg1) {
        arg1.removeMouseListener(class243.field3645);
        field3707++;
        if (arg0 <= -26) {
            arg1.removeMouseMotionListener(class243.field3645);
            arg1.removeFocusListener(class243.field3645);
            class327.field5114 = 0;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)I", line = 18)
    public static int method1740(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V", line = 28)
    public static final void method1741(byte arg0) {
        class16.field331.method2283((byte) 77);
        if (arg0 > -66) {
            method1741((byte) -25);
        }
        class274.field4290.method2283((byte) 77);
        field3704++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 42)
    public static void method1742(int arg0) {
        field3705 = null;
        field3702 = null;
        if (arg0 == 2048) {
            field3703 = null;
            field3708 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V", line = 68)
    public class251() {
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 73)
    public class251(String arg0, int arg1) {
        this.field3701 = arg0;
    }
}
