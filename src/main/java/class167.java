import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class167 extends class359 implements MouseWheelListener {

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    private int field2482 = 0;

    @OriginalMember(owner = "client!th", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 5)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2482 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)I", line = 13)
    public final synchronized int method1280(int arg0) {
        int var2 = this.field2482;
        this.field2482 = arg0;
        return var2;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLjava/awt/Component;)V", line = 22)
    public final void method1281(boolean arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (!arg0) {
            this.method1282((Component) null, -71);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 35)
    public final void method1282(Component arg0, int arg1) {
        if (arg1 == 255) {
            arg0.removeMouseWheelListener(this);
        }
    }
}
