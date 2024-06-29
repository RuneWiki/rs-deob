import java.applet.Applet;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class193 {

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public int field2828;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "[I")
    public static int[] field2821 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "Z")
    public static boolean field2825 = false;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "S")
    public static short field2830 = 320;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "Lfaa;")
    public static class143 field2826;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "Lkga;")
    public static class511 field2823;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "Ljava/applet/Applet;")
    public static Applet field2829;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public static final void method1250(int arg0) {
        class561.field7444.method3273(122);
        field2822++;
        class164.field2564.method1106(30641);
        class139.field2244.method1686(true);
        if (arg0 != 3) {
            field2827 = 115;
        }
        class443.field6072.setBackground(Color.black);
        class584.field7753 = -1;
        class561.field7444 = class155.method1088(class443.field6072, 107);
        class164.field2564 = class427.method2439(arg0 ^ 0xFFFFFFA7, class443.field6072, true);
    }

    @OriginalMember(owner = "client!hi", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2824++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(I)V")
    public class193(int arg0) {
        this.field2828 = arg0;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
    public static void method1251(int arg0) {
        field2821 = null;
        if (arg0 != -1) {
            field2825 = true;
        }
        field2823 = null;
        field2829 = null;
        field2826 = null;
    }
}
