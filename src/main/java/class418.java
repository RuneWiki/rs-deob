import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class418 extends Canvas {

    @OriginalMember(owner = "client!no", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field6052;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "[I")
    public static int[] field6050 = new int[32];

    @OriginalMember(owner = "client!no", name = "g", descriptor = "Ljava/lang/String;")
    public static String field6054 = " has logged in.";

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!no", name = "f", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "[[[I")
    public static int[][][] field6051;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V", line = 3)
    public static void method2663(int arg0) {
        field6050 = null;
        field6051 = null;
        field6054 = null;
        if (arg0 != 16746) {
            method2663(28);
        }
    }

    @OriginalMember(owner = "client!no", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 28)
    public final void paint(Graphics arg0) {
        field6053++;
        this.field6052.paint(arg0);
    }

    @OriginalMember(owner = "client!no", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 37)
    public final void update(Graphics arg0) {
        field6048++;
        this.field6052.update(arg0);
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 47)
    public class418(Component arg0) {
        this.field6052 = arg0;
    }
}
