import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class110 extends class104 implements MouseWheelListener {

    @OriginalMember(owner = "client!q", name = "v", descriptor = "I")
    private int field2535 = 0;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method716(int arg0, Component arg1) {
        if (arg0 != 8311) {
            this.method721(null, -49);
        }
        arg1.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)I")
    public final synchronized int method712(byte arg0) {
        int var2 = this.field2535;
        if (arg0 == -29) {
            this.field2535 = 0;
            return var2;
        } else {
            return -49;
        }
    }

    @OriginalMember(owner = "client!q", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2535 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method721(Component arg0, int arg1) {
        if (arg1 != 32) {
            this.field2535 = -47;
        }
        arg0.addMouseWheelListener(this);
    }
}
