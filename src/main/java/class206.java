import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class206 extends class189 implements MouseWheelListener {

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    private int field3213 = 0;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZLjava/awt/Component;)V", line = 4)
    public final void method1293(boolean arg0, Component arg1) {
        if (arg0) {
            this.mouseWheelMoved((MouseWheelEvent) null);
        }
        arg1.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)I", line = 15)
    public final synchronized int method1289(int arg0) {
        int var2 = this.field3213;
        this.field3213 = 0;
        if (arg0 != -1) {
            this.field3213 = -53;
        }
        return var2;
    }

    @OriginalMember(owner = "client!o", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 28)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3213 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 35)
    public final void method1295(Component arg0, int arg1) {
        if (arg1 < -70) {
            arg0.addMouseWheelListener(this);
        }
    }
}
