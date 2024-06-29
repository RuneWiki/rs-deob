import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class156 extends class71 implements MouseWheelListener {

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    private int field2708 = 0;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)I")
    public final synchronized int method536(int arg0) {
        int var2 = this.field2708;
        if (arg0 == 205) {
            this.field2708 = 0;
            return var2;
        } else {
            return 43;
        }
    }

    @OriginalMember(owner = "client!ke", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2708 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method540(Component arg0, int arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 != -7270) {
            this.field2708 = 3;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method537(byte arg0, Component arg1) {
        if (arg0 == -79) {
            arg1.removeMouseWheelListener(this);
        }
    }
}
