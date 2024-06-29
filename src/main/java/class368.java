import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class368 extends class9 implements MouseWheelListener {

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    private int field5246 = 0;

    @OriginalMember(owner = "client!a", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field5246 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method53(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 >= -54) {
            this.method53((Component) null, 100);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)I")
    public final synchronized int method51(boolean arg0) {
        if (arg0) {
            return -36;
        } else {
            int var2 = this.field5246;
            this.field5246 = 0;
            return var2;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method50(byte arg0, Component arg1) {
        if (arg0 > 119) {
            arg1.addMouseWheelListener(this);
        }
    }
}
