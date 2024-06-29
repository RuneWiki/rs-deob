import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class203 extends class362 implements MouseWheelListener {

    @OriginalMember(owner = "client!bs", name = "m", descriptor = "I")
    private int field2792 = 0;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 4)
    public final void method1106(Component arg0, int arg1) {
        if (arg1 == 2) {
            arg0.removeMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 14)
    public final void method1107(Component arg0, boolean arg1) {
        if (arg1) {
            arg0.addMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!bs", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 30)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2792 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)I", line = 38)
    public final synchronized int method1108(byte arg0) {
        int var2 = this.field2792;
        this.field2792 = 0;
        if (arg0 > -48) {
            this.field2792 = -114;
        }
        return var2;
    }
}
