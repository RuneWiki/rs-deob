import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class360 extends class310 implements MouseWheelListener {

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    private int field5726 = 0;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)I", line = 5)
    public final synchronized int method2257(byte arg0) {
        int var2 = this.field5726;
        if (arg0 != 70) {
            this.method2252(23, (Component) null);
        }
        this.field5726 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 21)
    public final void method2252(int arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 != 16912) {
            this.mouseWheelMoved((MouseWheelEvent) null);
        }
    }

    @OriginalMember(owner = "client!rc", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 31)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field5726 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(ILjava/awt/Component;)V", line = 38)
    public final void method2253(int arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 < 112) {
            this.method2252(-12, (Component) null);
        }
    }
}
