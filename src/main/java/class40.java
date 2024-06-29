import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class40 extends class111 implements MouseWheelListener {

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    private int field610 = 0;

    @OriginalMember(owner = "client!me", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 4)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field610 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 11)
    public final void method263(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != -30331) {
            this.method264(105);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)I", line = 22)
    public final synchronized int method264(int arg0) {
        int var2 = this.field610;
        this.field610 = 0;
        if (arg0 != 9) {
            this.method265((Component) null, 103);
        }
        return var2;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(Ljava/awt/Component;I)V", line = 34)
    public final void method265(Component arg0, int arg1) {
        if (arg1 >= 33) {
            arg0.addMouseWheelListener(this);
        }
    }
}
