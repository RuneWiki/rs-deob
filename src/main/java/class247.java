import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class247 extends Canvas {

    @OriginalMember(owner = "client!o", name = "f", descriptor = "Ljava/awt/Component;")
    private Component field3956;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "[I")
    public static int[] field3952 = new int[2];

    @OriginalMember(owner = "client!o", name = "d", descriptor = "[I")
    public static int[] field3954 = new int[32];

    @OriginalMember(owner = "client!o", name = "a", descriptor = "J")
    public static long field3951 = 0L;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field3958 = 0;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static void method1665(int arg0) {
        field3952 = null;
        field3954 = null;
        int var1 = -28 / ((arg0 + 32) / 33);
    }

    @OriginalMember(owner = "client!o", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field3953++;
        this.field3956.update(arg0);
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class247(Component arg0) {
        this.field3956 = arg0;
    }

    @OriginalMember(owner = "client!o", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field3956.paint(arg0);
        field3959++;
    }
}
