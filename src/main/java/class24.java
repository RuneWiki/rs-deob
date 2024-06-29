import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class24 extends class206 implements MouseWheelListener {

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
    private int field404 = 0;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 4)
    public final void method199(byte arg0, Component arg1) {
        if (arg0 > 112) {
            arg1.removeMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 14)
    public final void method200(Component arg0, int arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 != 0) {
            this.mouseWheelMoved((MouseWheelEvent) null);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)I", line = 25)
    public final synchronized int method201(boolean arg0) {
        if (!arg0) {
            this.method200((Component) null, 63);
        }
        int var2 = this.field404;
        this.field404 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!ql", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 38)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field404 += arg0.getWheelRotation();
    }
}
