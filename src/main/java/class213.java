import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public abstract class class213 {

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field3818 = 0;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "Lqj;")
    private static class196 field3822 = class80.method502("Created gameworld", -48);

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "Z")
    public static boolean field3820 = false;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "Lqj;")
    public static class196 field3821 = field3822;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
    public static void method1470(byte arg0) {
        if (arg0 >= 24) {
            field3822 = null;
            field3821 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)I")
    public abstract int method16(byte arg0);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method15(Component arg0, int arg1);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public abstract void method14(boolean arg0, Component arg1);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZ)I")
    public static final int method1471(int arg0, boolean arg1) {
        field3819++;
        if (arg0 >= 97 && arg0 <= 122 || !(arg0 < 224 || arg0 > 254 || arg0 == 247)) {
            return arg0 - 32;
        }
        if (arg1) {
            field3821 = null;
        }
        if (arg0 == 255) {
            return 159;
        } else if (arg0 == 156) {
            return 140;
        } else {
            return arg0;
        }
    }
}
