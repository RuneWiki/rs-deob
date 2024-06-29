import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class510 extends class314 implements MouseWheelListener {

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    private int field7739 = 0;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)I", line = 4)
    public final synchronized int method1874(byte arg0) {
        if (arg0 != -15) {
            this.method1877(null, -1);
        }
        int var2 = this.field7739;
        this.field7739 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!f", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 17)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field7739 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 25)
    public final void method1875(int arg0, Component arg1) {
        if (arg0 != 3) {
            this.method1875(48, null);
        }
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 35)
    public final void method1877(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != 1) {
            this.method1877(null, -106);
        }
    }
}
