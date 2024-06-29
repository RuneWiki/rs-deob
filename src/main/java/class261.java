import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class261 extends Canvas {

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field3877;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field3873 = -1;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field3874 = new String[100];

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!qd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 5)
    public final void paint(Graphics arg0) {
        field3876++;
        this.field3877.paint(arg0);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 17)
    public static void method1718(int arg0) {
        field3874 = null;
        int var1 = 87 / ((-arg0 - 72) / 43);
    }

    @OriginalMember(owner = "client!qd", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 39)
    public final void update(Graphics arg0) {
        field3875++;
        this.field3877.update(arg0);
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 48)
    public class261(Component arg0) {
        this.field3877 = arg0;
    }
}
