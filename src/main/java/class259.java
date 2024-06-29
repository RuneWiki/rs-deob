import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class259 extends class150 {

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "Z")
    public static boolean field3816 = false;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public static int field3813 = 100;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public static int field3812 = 0;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public int field3814;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "Lkm;")
    public static class133 field3811;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "Ljava/lang/String;")
    public String field3815;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "Ljava/lang/String;")
    public String field3817;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)V", line = 20)
    public static void method1783(int arg0) {
        if (arg0 != -9618) {
            method1783(26);
        }
        field3811 = null;
    }

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)Ljm;", line = 31)
    public final class163 method1784(int arg0) {
        if (arg0 == 100) {
            field3818++;
            return class7.field72[this.field2074];
        } else {
            return (class163) null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 47)
    public static final void method1785(int arg0, Component arg1) {
        field3810++;
        arg1.removeKeyListener(class171.field2336);
        arg1.removeFocusListener(class171.field2336);
        class160.field2184 = -1;
        if (arg0 != -26092) {
            field3816 = true;
        }
    }
}
