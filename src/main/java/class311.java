import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class311 extends class209 implements MouseWheelListener {

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
    private int field4698 = 0;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 4)
    public final void method1412(Component arg0, int arg1) {
        if (arg1 == -16731) {
            arg0.addMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)I", line = 15)
    public final synchronized int method1408(int arg0) {
        if (arg0 != -1489113977) {
            this.field4698 = 100;
        }
        int var2 = this.field4698;
        this.field4698 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 27)
    public final void method1410(int arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != 18387) {
            this.method1412((Component) null, -113);
        }
    }

    @OriginalMember(owner = "client!ls", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 37)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field4698 += arg0.getWheelRotation();
    }
}
