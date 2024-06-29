import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class160 extends class66 implements MouseWheelListener {

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "I")
    private int field2320 = 0;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)I", line = 5)
    public final synchronized int method439(int arg0) {
        int var2 = this.field2320;
        if (arg0 != Integer.MAX_VALUE) {
            this.field2320 = 37;
        }
        this.field2320 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 17)
    public final void method437(Component arg0, boolean arg1) {
        if (arg1) {
            this.field2320 = -122;
        }
        arg0.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 27)
    public final void method440(int arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != 7) {
            this.mouseWheelMoved(null);
        }
    }

    @OriginalMember(owner = "client!mr", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 37)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2320 += arg0.getWheelRotation();
    }
}
