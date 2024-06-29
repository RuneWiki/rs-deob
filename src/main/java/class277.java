import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class277 extends Canvas {

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Ljava/awt/Component;")
    private Component field4547;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "[I")
    public static int[] field4548 = new int[2000];

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Lvk;")
    public static class67 field4550 = new class67(5);

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Lva;")
    public static class36 field4551;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "[[I")
    public static int[][] field4544;

    @OriginalMember(owner = "client!qc", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 15)
    public final void update(Graphics arg0) {
        this.field4547.update(arg0);
        field4549++;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 21)
    public class277(Component arg0) {
        this.field4547 = arg0;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V", line = 36)
    public static void method1824(int arg0) {
        field4550 = null;
        field4548 = null;
        field4544 = (int[][]) null;
        field4551 = null;
        if (arg0 != -12450) {
            method1824(11);
        }
    }

    @OriginalMember(owner = "client!qc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 56)
    public final void paint(Graphics arg0) {
        field4552++;
        this.field4547.paint(arg0);
    }
}
