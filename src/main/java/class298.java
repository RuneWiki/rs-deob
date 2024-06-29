import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class298 extends Canvas {

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field4087;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Lo;")
    public static class359 field4088;

    @OriginalMember(owner = "client!pb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 3)
    public final void paint(Graphics arg0) {
        field4090++;
        this.field4087.paint(arg0);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 11)
    public static void method1740(int arg0) {
        if (arg0 == -29632) {
            field4088 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 22)
    public class298(Component arg0) {
        this.field4087 = arg0;
    }

    @OriginalMember(owner = "client!pb", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 32)
    public final void update(Graphics arg0) {
        this.field4087.update(arg0);
        field4089++;
    }
}
