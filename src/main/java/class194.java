import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class194 extends class438 implements MouseWheelListener {

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    private int field2854 = 0;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)I")
    public final synchronized int method1193(int arg0) {
        if (arg0 <= 104) {
            this.field2854 = 118;
        }
        int var2 = this.field2854;
        this.field2854 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!db", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2854 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method1194(Component arg0, int arg1) {
        if (arg1 != -12792) {
            this.field2854 = 51;
        }
        arg0.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Ljava/awt/Component;I)V")
    public final void method1195(Component arg0, int arg1) {
        int var3 = 100 % ((-arg1 - 1) / 34);
        arg0.removeMouseWheelListener(this);
    }
}
