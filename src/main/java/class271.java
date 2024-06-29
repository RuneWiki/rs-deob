import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class271 extends Canvas {

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field3763;

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "Z")
    public static boolean field3764 = false;

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "[Z")
    public static boolean[] field3766 = new boolean[200];

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "I")
    public static int field3768 = -1;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!fu", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field3763.update(arg0);
        field3765++;
    }

    @OriginalMember(owner = "client!fu", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field3762++;
        this.field3763.paint(arg0);
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class271(Component arg0) {
        this.field3763 = arg0;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIII)V")
    public static final void method1739(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 200) {
            field3767++;
            class538.field7879.method1073(326170192, arg2);
            class538.field7879.method1068(94, arg3);
            class538.field7879.method1097(-3, arg1);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)V")
    public static void method1740(byte arg0) {
        field3766 = null;
        if (arg0 != -114) {
            method1739(122, -77, 93, 73);
        }
    }
}
