import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class155 extends class93 implements MouseWheelListener {

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    private int field2473 = 0;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)I", line = 5)
    public final synchronized int method669(byte arg0) {
        if (arg0 == -88) {
            int var2 = this.field2473;
            this.field2473 = 0;
            return var2;
        } else {
            return 17;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 18)
    public final void method671(Component arg0, byte arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != -64) {
            this.method669((byte) 105);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 28)
    public final void method667(Component arg0, int arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 != 1) {
            this.field2473 = -59;
        }
    }

    @OriginalMember(owner = "client!ge", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 38)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2473 += arg0.getWheelRotation();
    }
}
