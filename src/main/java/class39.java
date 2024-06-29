import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class39 extends Canvas {

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "Ljava/awt/Component;")
    private Component field629;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "[I")
    public static int[] field626 = new int[100];

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field630 = -1;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "Leg;")
    public static class37 field631 = class191.method1320(true, 160);

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "[[I")
    public static int[][] field634;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "[[[I")
    public static int[][][] field635;

    @OriginalMember(owner = "client!ri", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field629.update(arg0);
        field627++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
    public static void method269(byte arg0) {
        if (arg0 != 78) {
            field631 = null;
        }
        field634 = null;
        field635 = null;
        field626 = null;
        field631 = null;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class39(Component arg0) {
        this.field629 = arg0;
    }

    @OriginalMember(owner = "client!ri", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field629.paint(arg0);
        field632++;
    }
}
