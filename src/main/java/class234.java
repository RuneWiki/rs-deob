import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class234 extends Canvas {

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "Ljava/awt/Component;")
    private Component field3649;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field3644 = 0;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field3645 = -1;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field3648 = new String[100];

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "Lrj;")
    public static class262 field3647;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V", line = 7)
    public static final void method1751(int arg0, int arg1) {
        field3643++;
        class138 var2 = class149.method1242(arg1, 0, 7);
        var2.method1152(125);
        if (arg0 != -1) {
            method1751(79, 4);
        }
    }

    @OriginalMember(owner = "client!ra", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 22)
    public final void paint(Graphics arg0) {
        field3651++;
        this.field3649.paint(arg0);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 31)
    public static void method1752(int arg0) {
        field3647 = null;
        field3648 = null;
        if (arg0 != 19482) {
            field3644 = 40;
        }
    }

    @OriginalMember(owner = "client!ra", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 52)
    public final void update(Graphics arg0) {
        this.field3649.update(arg0);
        field3646++;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 71)
    public class234(Component arg0) {
        this.field3649 = arg0;
    }
}
