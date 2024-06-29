import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class99 extends Canvas {

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field1600;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "J")
    public static long field1601 = -1L;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 5)
    public class99(Component arg0) {
        this.field1600 = arg0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 13)
    public static final void method775(int arg0) {
        field1599++;
        if (class461.field6804 == class108.field1683) {
            return;
        }
        try {
            class426.method2606("tbrefresh", class238.field3446, 21615);
        } catch (Throwable var1) {
        }
        if (arg0 != -20858) {
            field1601 = 119L;
        }
    }

    @OriginalMember(owner = "client!wh", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 37)
    public final void update(Graphics arg0) {
        field1603++;
        this.field1600.update(arg0);
    }

    @OriginalMember(owner = "client!wh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 45)
    public final void paint(Graphics arg0) {
        this.field1600.paint(arg0);
        field1602++;
    }
}
