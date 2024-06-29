import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class66 extends class120 implements MouseWheelListener {

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    private int field966 = 0;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)I", line = 6)
    public final synchronized int method542(byte arg0) {
        int var2 = this.field966;
        if (arg0 != 9) {
            this.method544(-88, (Component) null);
        }
        this.field966 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!vh", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 21)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field966 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 28)
    public final void method543(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 <= 122) {
            this.field966 = -85;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 38)
    public final void method544(int arg0, Component arg1) {
        if (arg0 == 10) {
            arg1.addMouseWheelListener(this);
        }
    }
}
