import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class217 extends class19 implements MouseWheelListener {

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    private int field3469 = 0;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 5)
    public final void method109(int arg0, Component arg1) {
        if (arg0 != -17223) {
            this.field3469 = -54;
        }
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!hi", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 15)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3469 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)I", line = 26)
    public final synchronized int method106(int arg0) {
        int var2 = this.field3469;
        if (arg0 == 128) {
            this.field3469 = 0;
            return var2;
        } else {
            return -37;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 40)
    public final void method111(Component arg0, boolean arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1) {
            this.method109(31, (Component) null);
        }
    }
}
