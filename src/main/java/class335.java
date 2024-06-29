import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public abstract class class335 {

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field5203 = -1;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lna;BLna;)V", line = 7)
    public static final void method2308(class29 arg0, byte arg1, class29 arg2) {
        field5201++;
        if (arg0.field419 != null) {
            arg0.method189(0);
        }
        arg0.field417 = arg2.field417;
        arg0.field419 = arg2;
        int var3 = 118 / ((-arg1 - 70) / 50);
        arg0.field419.field417 = arg0;
        arg0.field417.field419 = arg0;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIII)V", line = 26)
    public static final void method2309(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5202++;
        int var6 = class235.method1685(arg0, class235.field3735, class233.field3721, 113);
        int var7 = class235.method1685(arg5, class235.field3735, class233.field3721, 102);
        int var8 = class235.method1685(arg2, class231.field3697, class224.field3575, 112);
        int var9 = class235.method1685(arg1, class231.field3697, class224.field3575, arg4 + 122);
        int var10 = var6;
        if (arg4 != -1) {
            method2310((Component) null, 48);
        }
        while (var10 <= var7) {
            class245.method1738(48, class310.field4841[var10], var9, var8, arg3);
            var10++;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(Ljava/awt/Component;I)V", line = 55)
    public static final void method2310(Component arg0, int arg1) {
        arg0.removeKeyListener(class289.field4555);
        arg0.removeFocusListener(class289.field4555);
        class151.field2317 = arg1;
        field5200++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method403(Component arg0, int arg1);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method404(Component arg0, boolean arg1);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)I")
    public abstract int method402(byte arg0);
}
