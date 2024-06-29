import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class142 {

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "Leh;")
    public static class47 field2781 = class195.method1282((byte) -4, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "Z")
    public static boolean field2790 = false;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "Lic;")
    public static class76 field2792 = new class76(0, 0);

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
    public static int field2801 = 20;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "Leh;")
    public static class47 field2800 = class195.method1282((byte) -4, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public int field2779;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public int field2783;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public int field2784;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public int field2785;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public int field2786;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public int field2787;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public int field2788;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public int field2789;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public int field2791;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public int field2793;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public int field2794;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public int field2796;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    public int field2797;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    public int field2798;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    public int field2799;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
    public int field2802;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "I")
    public int field2803;

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "I")
    public int field2804;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "Lqf;")
    public static class150 field2782;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)I")
    public static int method1018(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public static final void method1019(Component arg0, boolean arg1) {
        field2780++;
        if (!arg1) {
            return;
        }
        Method var2 = class150.field2939;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class147.field2881);
        arg0.addFocusListener(class147.field2881);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public static void method1020(int arg0) {
        if (arg0 > -86) {
            field2781 = null;
        }
        field2792 = null;
        field2800 = null;
        field2782 = null;
        field2781 = null;
    }
}
