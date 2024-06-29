import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class777 extends Canvas {

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "Ljava/awt/Component;")
    private Component field10677;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
    public static int field10675 = 1;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "[I")
    public static int[] field10671 = new int[50];

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "Ljava/lang/Object;")
    public static volatile Object field10678 = null;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field10672;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    public static int field10673;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
    public static int field10674;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
    public static int field10676;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
    public static final void method4275(int arg0) {
        class694.field9678 = "";
        class691.field9661 = "";
        field10674++;
        int var1 = -26 / ((13 - arg0) / 58);
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V")
    public static void method4276(int arg0) {
        field10671 = null;
        field10678 = null;
        if (arg0 < 116) {
            method4276(-100);
        }
    }

    @OriginalMember(owner = "client!kr", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field10677.paint(arg0);
        field10673++;
    }

    @OriginalMember(owner = "client!kr", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field10672++;
        this.field10677.update(arg0);
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class777(Component arg0) {
        this.field10677 = arg0;
    }
}
