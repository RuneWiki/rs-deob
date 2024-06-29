import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class236 {

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field4085 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "Loj;")
    public static class156 field4087;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "[[B")
    public static byte[][] field4086;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1660(Component arg0, int arg1) {
        arg0.addMouseListener(class22.field431);
        field4088++;
        arg0.addMouseMotionListener(class22.field431);
        if (arg1 != -26) {
            method1662(false);
        }
        arg0.addFocusListener(class22.field431);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lfk;I)Leb;")
    public static final class230 method1661(class14 arg0, int arg1) {
        if (arg1 == -32133) {
            field4089++;
            return class232.method1639(arg0, 0, 32767);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V")
    public static void method1662(boolean arg0) {
        if (!arg0) {
            field4085 = -108;
        }
        field4087 = null;
        field4086 = null;
    }
}
